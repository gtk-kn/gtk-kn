/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeAliasSpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.OptInVersionBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import org.gtkkn.gir.config.Config
import org.gtkkn.gir.log.logger
import java.io.File

class BindingsGenerator(
    private val config: Config,
    private val ktLintFormatter: KtLintFormatter
) : ClassGenerator,
    InterfaceGenerator,
    EnumGenerator,
    BitfieldGenerator,
    RepositoryObjectGenerator,
    RecordGenerator,
    TypeProviderGenerator,
    OptInAnnotationGenerator { // Added interface
    @Suppress("LongMethod")
    fun generate(repository: RepositoryBlueprint, moduleOutputDir: File) {
        val repositoryOutputDir = repositoryBuildDir(moduleOutputDir)
        if (!repositoryOutputDir.exists()) {
            logger.info { "Creating output dir ${repositoryOutputDir.path}" }
            if (!repositoryOutputDir.mkdirs()) {
                logger.error { "Cannot create output path ${repositoryOutputDir.path}" }
                return
            }
        }

        logger.info { "Writing repository ${repository.name}" }

        // Write skip file
        writeRepositorySkipFile(repository, moduleOutputDir)

        // Write strict enum file
        writeStrictEnumFile(repository, moduleOutputDir)

        // Collect and write annotation names
        val annotationNames = repository.optInVersionBlueprints.map { it.typeName.canonicalName }.sorted()
        writeOptInAnnotationNamesFile(annotationNames, config.outputDir)

        // Write @RequiresOptIn annotations
        writeOptInAnnotations(repository.optInVersionBlueprints, repositorySrcDir(moduleOutputDir))

        // Write classes
        repository.classBlueprints.forEach { clazz ->
            writeType(
                clazz.typeName,
                buildClass(clazz, repository),
                repositorySrcDir(moduleOutputDir),
                clazz.signals.map { buildStaticSignalCallback(it) },
            )
        }

        // Write interfaces
        repository.interfaceBlueprints.forEach { iface ->
            writeType(
                iface.typeName,
                buildInterface(iface, repository),
                repositorySrcDir(moduleOutputDir),
                iface.signals.map { buildStaticSignalCallback(it) },
            )
        }

        // Write bitfields
        repository.bitfieldBlueprints.forEach { bitfield ->
            writeType(
                bitfield.kotlinTypeName,
                buildBitfield(bitfield),
                repositorySrcDir(moduleOutputDir),
            )
        }

        // Write enums
        repository.enumBlueprints.forEach { enum ->
            writeType(
                enum.kotlinTypeName,
                buildEnum(enum),
                repositorySrcDir(moduleOutputDir),
            )

            enum.errorExceptionTypeName?.let { typeName ->
                writeType(
                    typeName,
                    buildErrorDomainExceptionClass(enum),
                    repositorySrcDir(moduleOutputDir),
                )
            }
        }

        // Write records
        repository.recordBlueprints.forEach { record ->
            writeType(
                record.kotlinTypeName,
                buildRecord(record),
                repositorySrcDir(moduleOutputDir),
                isRecord = true,
            )
        }

        // Write repository object
        writeType(
            repository.repositoryObjectName,
            buildRepositoryObject(repository),
            repositorySrcDir(moduleOutputDir),
            additionalTypeAliases = repository.callbackBlueprints.map { buildCallbackTypeAlias(it) },
            additionalProperties = repository.callbackBlueprints.map { buildStaticCallbackProperty(it) },
        )

        if (repository.hasKGTypes()) {
            writeType(
                repository.repositoryTypeProviderTypeName,
                buildTypeProvider(repository),
                repositorySrcDir(moduleOutputDir),
            )
        }
    }

    private fun RepositoryBlueprint.hasKGTypes(): Boolean =
        classBlueprints.any { it.glibGetTypeFunc != null } ||
            interfaceBlueprints.any { it.glibGetTypeFunc != null }

    /**
     * bindings build dir
     */
    private fun repositoryBuildDir(outputDir: File): File = outputDir.resolve("build")

    /**
     * bindings src output dir
     */
    private fun repositorySrcDir(outputDir: File): File = outputDir.resolve("src/nativeMain/kotlin")

    private fun writeType(
        className: ClassName,
        typeSpec: TypeSpec,
        outputDirectory: File,
        additionalProperties: List<PropertySpec> = emptyList(),
        additionalTypeAliases: List<TypeAliasSpec> = emptyList(),
        isRecord: Boolean = false
    ) {
        logger.debug { "Writing ${className.canonicalName}" }

        FileSpec.builder(className.packageName, className.simpleName)
            .indent("    ")
            .addFileComment("This is a generated file. Do not modify.")
            .addType(typeSpec)
            .apply { additionalProperties.forEach { addProperty(it) } }
            .apply { additionalTypeAliases.forEach { addTypeAlias(it) } }
            .apply {
                if (isRecord) {
                    addAliasedImport(NATIVE_PLACEMENT_ALLOC, "nativePlacementAlloc")
                }
            }
            .build()
            .apply {
                if (config.skipFormat) {
                    writeTo(outputDirectory)
                } else {
                    val stringBuilder = StringBuilder()
                    writeTo(stringBuilder)

                    ktLintFormatter.formatAndWriteKotlinFile(
                        outputDirectory,
                        className.packageName,
                        className.simpleName,
                        stringBuilder.toString(),
                    )
                }
            }
    }

    private fun writeRepositorySkipFile(repository: RepositoryBlueprint, outputDir: File) {
        val skipFile = File(repositoryBuildDir(outputDir), "${repository.name}-skips.txt")
        skipFile.createNewFile()
        val skippedObjects = repository.skippedObjects.filter { it.documented }

        val skipWriter = skipFile.printWriter()
        val longestObjectName = skippedObjects.maxOfOrNull { it.objectName.length } ?: 0
        val longestTypeName = skippedObjects.maxOfOrNull { it.objectType.length } ?: 0
        skippedObjects.forEach {
            skipWriter.println(it.textMessage(longestObjectName, longestTypeName))
        }
        skipWriter.close()
    }

    private fun writeStrictEnumFile(repository: RepositoryBlueprint, outputDir: File) {
        val enumsFile = File(repositoryBuildDir(outputDir), "${repository.name}-enums.txt")
        enumsFile.createNewFile()

        enumsFile.printWriter().use { writer ->
            writer.println("strictEnums = \\")
            val lastIndex = repository.enumBlueprints.size - 1
            repository.enumBlueprints.forEachIndexed { index, enum ->
                val simpleName = (enum.nativeValueTypeName as ClassName).simpleName
                val suffix = if (index == lastIndex) "" else " \\"
                writer.println("    $simpleName$suffix")
            }
        }
    }

    private fun writeOptInAnnotationNamesFile(annotationNames: List<String>, outputDir: File) {
        if (annotationNames.isNotEmpty()) {
            val file = File(outputDir, "optInAnnotations.txt")
            if (file.exists()) {
                // Append to the existing file only if annotationNames is not empty
                file.appendText(annotationNames.joinToString(separator = "\n", postfix = "\n"))
            } else {
                // Create a new file and write only if annotationNames is not empty
                file.printWriter().use { writer ->
                    annotationNames.forEach { annotationName -> writer.println(annotationName) }
                }
            }
        }
    }

    private fun writeOptInAnnotations(
        optInVersions: Set<OptInVersionBlueprint>,
        outputDirectory: File
    ) {
        optInVersions.forEach { optInVersion ->
            val annotationSpec = buildOptInAnnotation(optInVersion)
            writeType(
                optInVersion.typeName,
                annotationSpec,
                outputDirectory,
            )
        }
    }

    // Implementing the method from OptInAnnotationGenerator
    override fun buildOptInAnnotation(optInVersion: OptInVersionBlueprint): TypeSpec =
        TypeSpec.annotationBuilder(optInVersion.typeName).apply {
            addAnnotation(
                AnnotationSpec.builder(RETENTION_TYPE).addMember("%T.BINARY", ANNOTATION_RETENTION_TYPE).build(),
            )
            addAnnotation(
                AnnotationSpec.builder(REQUIRES_OPT_IN_TYPE)
                    .addMember("level = %T.%L", REQUIRES_OPT_IN_LEVEL_TYPE, "WARNING")
                    .addMember("message = %S", optInVersion.message)
                    .build(),
            )
            addKdoc("Indicates that the API is available since version ${optInVersion.version}.")
        }.build()

    companion object {
        // gtk-kn common function members
        internal val AS_BOOLEAN_FUNC = MemberName("org.gtkkn.extensions.common", "asBoolean")
        internal val AS_GBOOLEAN_FUNC = MemberName("org.gtkkn.extensions.common", "asGBoolean")
        internal val STATIC_STABLEREF_DESTROY = MemberName("org.gtkkn.extensions.glib", "staticStableRefDestroy")
        internal val TO_C_STRING_LIST = MemberName("org.gtkkn.extensions.common", "toCStringList")
        internal val TO_K_STRING_LIST = MemberName("org.gtkkn.extensions.common", "toKStringList")
        internal val GLIB_EXCEPTION_TYPE = ClassName("org.gtkkn.extensions.glib", "GlibException")
        internal val GLIB_ERROR_TYPE = ClassName("org.gtkkn.bindings.glib", "Error")
        internal val GLIB_RECORD_COMPANION_TYPE = ClassName("org.gtkkn.extensions.glib", "RecordCompanion")
        internal val GOBJECT_KG_TYPE = ClassName("org.gtkkn.extensions.gobject", "KGType")
        internal val GOBJECT_GEN_CLASS_KG_TYPE = ClassName("org.gtkkn.extensions.gobject", "GeneratedClassKGType")
        internal val GOBJECT_GEN_IFACE_KG_TYPE =
            ClassName("org.gtkkn.extensions.gobject", "GeneratedInterfaceKGType")
        internal val GOBJECT_ASSOCIATE_CUSTOM_OBJECT =
            MemberName("org.gtkkn.extensions.gobject", "associateCustomObject")
        internal val GOBJECT_TYPE_COMPANION = ClassName("org.gtkkn.extensions.gobject", "TypeCompanion")
        internal val TYPE_PROVIDER_INTERFACE_TYPE = ClassName("org.gtkkn.extensions.gobject", "TypeProvider")
        internal val KG_TYPED_INTERFACE_TYPE = ClassName("org.gtkkn.extensions.gobject", "KGTyped")

        // gtk-kn marker interfaces
        internal val GLIB_RECORD_MARKER_TYPE = ClassName("org.gtkkn.extensions.glib", "Record")
        internal val GLIB_INTERFACE_MARKER_TYPE = ClassName("org.gtkkn.extensions.glib", "Interface")
        internal val GLIB_BITFIELD_MARKER_TYPE = ClassName("org.gtkkn.extensions.glib", "Bitfield")

        // cinterop helper function members
        internal val REINTERPRET_FUNC = MemberName("kotlinx.cinterop", "reinterpret")
        internal val TO_KSTRING_FUNC = MemberName("kotlinx.cinterop", "toKString")
        internal val STATIC_C_FUNC = MemberName("kotlinx.cinterop", "staticCFunction")
        internal val AS_STABLE_REF_FUNC = MemberName("kotlinx.cinterop", "asStableRef")
        internal val POINTED_FUNC = MemberName("kotlinx.cinterop", "pointed")
        internal val PTR_FUNC = MemberName("kotlinx.cinterop", "ptr")
        internal val NATIVE_HEAP_OBJECT = ClassName("kotlinx.cinterop", "nativeHeap")
        internal val NATIVE_PLACEMENT_ALLOC = ClassName("kotlinx.cinterop", "alloc")
        internal val STABLEREF = ClassName("kotlinx.cinterop", "StableRef")
        internal val MEMSCOPED = MemberName("kotlinx.cinterop", "memScoped")
        internal val POINTED = MemberName("kotlinx.cinterop", "pointed")
        internal val ALLOC_POINTER_TO = MemberName("kotlinx.cinterop", "allocPointerTo")

        // kotlin helpers
        internal val RESULT_TYPE = ClassName("kotlin", "Result")
        internal val THROWS_TYPE = ClassName("kotlin", "Throws")
        internal val KCLASS_TYPE = ClassName("kotlin.reflect", "KClass")
        internal val REQUIRES_OPT_IN_TYPE = ClassName("kotlin", "RequiresOptIn")
        internal val REQUIRES_OPT_IN_LEVEL_TYPE = REQUIRES_OPT_IN_TYPE.nestedClass("Level")
        internal val RETENTION_TYPE = ClassName("kotlin.annotation", "Retention")
        internal val ANNOTATION_RETENTION_TYPE = ClassName("kotlin.annotation", "AnnotationRetention")

        // gobject members
        internal val G_SIGNAL_CONNECT_DATA = MemberName("org.gtkkn.native.gobject", "g_signal_connect_data")

        // glib members
        internal val G_ERROR_MEMBER = MemberName("org.gtkkn.native.glib", "GError")
        internal val G_QUARK_FROM_STRING_FUNC = MemberName("org.gtkkn.native.glib", "g_quark_from_string")
    }
}
