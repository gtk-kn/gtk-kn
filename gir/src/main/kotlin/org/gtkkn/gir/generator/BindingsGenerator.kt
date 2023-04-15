/*
 * Copyright (c) 2023 gtk-kt
 *
 * This file is part of gtk-kt.
 * gtk-kt is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kt is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kt. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeAliasSpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import org.gtkkn.gir.config.Config
import org.gtkkn.gir.log.logger
import java.io.File

class BindingsGenerator(
    private val config: Config,
    private val ktLintFormatter: KtLintFormatter
) : ClassGenerator, InterfaceGenerator, EnumGenerator, BitfieldGenerator, RepositoryObjectGenerator, RecordGenerator {

    @Suppress("LongMethod")
    fun generate(repository: RepositoryBlueprint, moduleOutputDir: File) {
        val repositoryOutputDir = repositoryBuildDir(moduleOutputDir)
        if (!repositoryOutputDir.exists()) {
            logger.info("Creating output dir ${repositoryOutputDir.path}")
            if (!repositoryOutputDir.mkdirs()) {
                logger.error("Cannot create output path ${repositoryOutputDir.path}")
                return
            }
        }

        logger.info("Writing repository ${repository.name}")

        // write skip file
        writeRepositorySkipFile(repository, moduleOutputDir)

        // write strict enum file
        writeStrictEnumFile(repository, moduleOutputDir)

        // write classes
        repository.classBlueprints.forEach { clazz ->
            writeType(
                clazz.typeName,
                buildClass(clazz),
                repositorySrcDir(moduleOutputDir),
                clazz.signals.map { buildStaticSignalCallback(it) },
            )
        }

        // write interfaces
        repository.interfaceBlueprints.forEach { iface ->
            writeType(
                iface.typeName,
                buildInterface(iface),
                repositorySrcDir(moduleOutputDir),
                iface.signals.map { buildStaticSignalCallback(it) },
            )
        }

        // write bitfields
        repository.bitfieldBlueprints.forEach { bitfield ->
            writeType(
                bitfield.kotlinTypeName,
                buildBitfield(bitfield),
                repositorySrcDir(moduleOutputDir),
            )
        }

        // write enums
        repository.enumBlueprints.forEach { enum ->
            writeType(
                enum.kotlinTypeName,
                buildEnum(enum),
                repositorySrcDir(moduleOutputDir),
            )

            enum.errorExceptionTypeName?.let {
                writeType(
                    it,
                    buildErrorDomainExceptionClass(enum),
                    repositorySrcDir(moduleOutputDir),
                )
            }
        }

        // write records
        repository.recordBlueprints.forEach { record ->
            writeType(
                record.kotlinTypeName,
                buildRecord(record),
                repositorySrcDir(moduleOutputDir),
            )
        }

        // write repository object
        writeType(
            repository.repositoryObjectName,
            buildRepositoryObject(repository),
            repositorySrcDir(moduleOutputDir),
            additionalTypeAliases = repository.callbackBlueprints.map { buildCallbackTypeAlias(it) },
            additionalProperties = repository.callbackBlueprints.map { buildStaticCallbackProperty(it) },
        )
    }

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
    ) {
        logger.debug("Writing ${className.canonicalName}")

        FileSpec
            .builder(className.packageName, className.simpleName)
            .indent("    ")
            .addFileComment("This is a generated file. Do not modify.")
            .addType(typeSpec)
            .apply { additionalProperties.forEach { addProperty(it) } }
            .apply { additionalTypeAliases.forEach { addTypeAlias(it) } }
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
            repository.enumBlueprints.forEach { enum ->
                writer.println("    ${(enum.nativeValueTypeName as ClassName).simpleName} \\")
            }
        }
    }

    companion object {
        // gtk-kn common function members
        internal val AS_BOOLEAN_FUNC = MemberName("org.gtkkn.extensions.common", "asBoolean")
        internal val AS_GBOOLEAN_FUNC = MemberName("org.gtkkn.extensions.common", "asGBoolean")
        internal val STATIC_STABLEREF_DESTROY = MemberName("org.gtkkn.extensions.glib", "staticStableRefDestroy")
        internal val TO_C_STRING_LIST = MemberName("org.gtkkn.extensions.common", "toCStringList")
        internal val TO_K_STRING_LIST = MemberName("org.gtkkn.extensions.common", "toKStringList")
        internal val GLIB_EXCEPTION_TYPE = ClassName("org.gtkkn.extensions.glib", "GlibException")
        internal val GLIB_ERROR_TYPE = ClassName("org.gtkkn.bindings.glib", "Error")

        // cinterop helper function members
        internal val REINTERPRET_FUNC = MemberName("kotlinx.cinterop", "reinterpret")
        internal val TO_KSTRING_FUNC = MemberName("kotlinx.cinterop", "toKString")
        internal val STATIC_C_FUNC = MemberName("kotlinx.cinterop", "staticCFunction")
        internal val AS_STABLE_REF_FUNC = MemberName("kotlinx.cinterop", "asStableRef")
        internal val POINTED_FUNC = MemberName("kotlinx.cinterop", "pointed")
        internal val PTR_FUNC = MemberName("kotlinx.cinterop", "ptr")
        internal val STABLEREF = ClassName("kotlinx.cinterop", "StableRef")
        internal val MEMSCOPED = MemberName("kotlinx.cinterop", "memScoped")
        internal val POINTED = MemberName("kotlinx.cinterop", "pointed")
        internal val PTR = MemberName("kotlinx.cinterop", "ptr")
        internal val ALLOC_POINTER_TO = MemberName("kotlinx.cinterop", "allocPointerTo")

        // kotlin helpers
        internal val RESULT_TYPE = ClassName("kotlin", "Result")
        internal val THROWS_TYPE = ClassName("kotlin", "Throws")

        // gobject members
        internal val G_SIGNAL_CONNECT_DATA = MemberName("org.gtkkn.native.gobject", "g_signal_connect_data")

        // glib members
        internal val G_ERROR_MEMBER = MemberName("org.gtkkn.native.glib", "GError")
        internal val G_QUARK_FROM_STRING_FUNC = MemberName("org.gtkkn.native.glib", "g_quark_from_string")
    }
}
