/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeAliasSpec
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.WildcardTypeName
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import me.tatarka.inject.annotations.Inject
import org.gtkkn.gir.blueprints.OptInVersionBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import org.gtkkn.gir.config.Config
import org.gtkkn.gir.ext.addCopyrightComment
import org.gtkkn.gir.log.logger
import java.io.File

@Inject
class BindingsGenerator(
    private val config: Config,
) :
    AliasGenerator,
    BitfieldGenerator,
    CallbackGenerator,
    ClassGenerator,
    EnumGenerator,
    InterfaceGenerator,
    OptInAnnotationGenerator,
    RecordGenerator,
    RepositoryObjectGenerator,
    TypeProviderGenerator,
    UnionGenerator {
    @Suppress("LongMethod")
    suspend fun generate(repository: RepositoryBlueprint, moduleOutputDir: File) {
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

        // Process everything concurrently
        coroutineScope {
            val tasks = mutableListOf<Deferred<Unit>>()
            // Process annotations
            tasks.addAll(
                repository.optInVersionBlueprints.map { optInVersion ->
                    async {
                        val ktLintFormatter = KtLintFormatter(config.outputDir)
                        writeType(
                            optInVersion.typeName,
                            buildOptInAnnotation(optInVersion),
                            repositorySrcDir(config.outputDir.resolve("common-annotations")),
                            ktLintFormatter = ktLintFormatter,
                        )
                    }
                },
            )

            // Process classes
            tasks.addAll(
                repository.classBlueprints.map { clazz ->
                    async {
                        val ktLintFormatter = KtLintFormatter(config.outputDir)
                        writeType(
                            clazz.typeName,
                            buildClass(clazz, repository),
                            repositorySrcDir(moduleOutputDir),
                            clazz.signals.map { buildStaticSignalCallback(it) },
                            ktLintFormatter = ktLintFormatter,
                        )
                    }
                },
            )

            // Process interfaces
            tasks.addAll(
                repository.interfaceBlueprints.map { iface ->
                    async {
                        val ktLintFormatter = KtLintFormatter(config.outputDir)
                        writeType(
                            iface.typeName,
                            buildInterface(iface, repository),
                            repositorySrcDir(moduleOutputDir),
                            iface.signals.map { buildStaticSignalCallback(it) },
                            ktLintFormatter = ktLintFormatter,
                        )
                    }
                },
            )

            // Process bitfields
            tasks.addAll(
                repository.bitfieldBlueprints.map { bitfield ->
                    async {
                        val ktLintFormatter = KtLintFormatter(config.outputDir)
                        writeType(
                            bitfield.kotlinTypeName,
                            buildBitfield(bitfield),
                            repositorySrcDir(moduleOutputDir),
                            ktLintFormatter = ktLintFormatter,
                        )
                    }
                },
            )

            // Process enums
            tasks.addAll(
                repository.enumBlueprints.map { enum ->
                    async {
                        val ktLintFormatter = KtLintFormatter(config.outputDir)
                        writeType(
                            enum.kotlinTypeName,
                            buildEnum(enum),
                            repositorySrcDir(moduleOutputDir),
                            ktLintFormatter = ktLintFormatter,
                        )

                        enum.errorExceptionTypeName?.let { typeName ->
                            writeType(
                                typeName,
                                buildErrorDomainExceptionClass(enum),
                                repositorySrcDir(moduleOutputDir),
                                ktLintFormatter = ktLintFormatter,
                            )
                        }
                        Unit
                    }
                },
            )

            // Process records
            tasks.addAll(
                repository.recordBlueprints.map { record ->
                    async {
                        val ktLintFormatter = KtLintFormatter(config.outputDir)
                        writeType(
                            record.kotlinTypeName,
                            buildRecord(record),
                            repositorySrcDir(moduleOutputDir),
                            ktLintFormatter = ktLintFormatter,
                        )
                    }
                },
            )

            // Process unions
            tasks.addAll(
                repository.unionBlueprints.map { union ->
                    async {
                        val ktLintFormatter = KtLintFormatter(config.outputDir)
                        writeType(
                            union.kotlinTypeName,
                            buildUnion(union),
                            repositorySrcDir(moduleOutputDir),
                            ktLintFormatter = ktLintFormatter,
                        )
                    }
                },
            )

            // Await all tasks
            tasks.awaitAll()
        }

        // Write repository object (can be done synchronously if needed)
        val ktLintFormatter = KtLintFormatter(config.outputDir)
        val additionalTypeAliases = buildList {
            addAll(repository.callbackBlueprints.map { buildCallbackTypeAlias(it) })
            addAll(repository.aliasBlueprints.map { buildAliasTypeAlias(it) })
        }
        writeType(
            repository.repositoryObjectName,
            buildRepositoryObject(repository),
            repositorySrcDir(moduleOutputDir),
            additionalTypeAliases = additionalTypeAliases,
            additionalProperties = repository.callbackBlueprints.map { buildStaticCallbackProperty(it) },
            ktLintFormatter = ktLintFormatter,
        )

        if (repository.hasKGTypes()) {
            writeType(
                repository.repositoryTypeProviderTypeName,
                buildTypeProvider(repository),
                repositorySrcDir(moduleOutputDir),
                ktLintFormatter = ktLintFormatter,
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
        ktLintFormatter: KtLintFormatter
    ) {
        logger.debug { "Writing ${className.canonicalName}" }

        FileSpec.builder(className.packageName, className.simpleName)
            .indent("    ")
            .addCopyrightComment()
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
            val lastIndex = repository.enumBlueprints.size - 1
            repository.enumBlueprints.forEachIndexed { index, enum ->
                val simpleName = (enum.nativeValueTypeName as ClassName).simpleName
                val suffix = if (index == lastIndex) "" else " \\"
                writer.println("    $simpleName$suffix")
            }
        }
    }

    private suspend fun writeOptInAnnotationNamesFile(annotationNames: List<String>, outputDir: File) {
        if (annotationNames.isNotEmpty()) {
            val file = File(outputDir, "optInAnnotations.txt")
            optInAnnotationsFileMutex.withLock {
                if (file.exists()) {
                    // Append to the existing file
                    file.appendText(annotationNames.joinToString(separator = "\n", postfix = "\n"))
                } else {
                    // Create a new file and write
                    file.printWriter().use { writer ->
                        annotationNames.forEach { annotationName -> writer.println(annotationName) }
                    }
                }
            }
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
        private val optInAnnotationsFileMutex = Mutex()

        // gtk-kn common function members
        internal val AS_BOOLEAN_FUNC = MemberName("org.gtkkn.extensions.glib.ext", "asBoolean")
        internal val AS_GBOOLEAN_FUNC = MemberName("org.gtkkn.extensions.glib.ext", "asGBoolean")
        internal val GLIB_ERROR_TYPE = ClassName("org.gtkkn.bindings.glib", "Error")
        internal val GLIB_EXCEPTION_TYPE = ClassName("org.gtkkn.extensions.glib", "GLibException")
        internal val GLIB_RECORD_COMPANION_TYPE = ClassName("org.gtkkn.extensions.glib", "RecordCompanion")
        internal val GOBJECT_ASSOCIATE_CUSTOM_OBJECT =
            MemberName("org.gtkkn.extensions.gobject", "associateCustomObject")
        internal val GOBJECT_GEN_CLASS_KG_TYPE = ClassName("org.gtkkn.extensions.gobject", "GeneratedClassKGType")
        internal val GOBJECT_GEN_IFACE_KG_TYPE = ClassName("org.gtkkn.extensions.gobject", "GeneratedInterfaceKGType")
        internal val GOBJECT_KG_TYPE = ClassName("org.gtkkn.extensions.gobject", "KGType")
        internal val GOBJECT_TYPE_COMPANION = ClassName("org.gtkkn.extensions.gobject", "TypeCompanion")
        internal val KG_TYPED_INTERFACE_TYPE = ClassName("org.gtkkn.extensions.gobject", "KGTyped")
        internal val PROXY_TYPE = ClassName("org.gtkkn.extensions.glib.cinterop", "Proxy")
        internal val PROXY_INSTANCE_TYPE = ClassName("org.gtkkn.extensions.glib.cinterop", "ProxyInstance")
        internal val STATIC_STABLEREF_DESTROY = MemberName("org.gtkkn.extensions.glib", "staticStableRefDestroy")
        internal val TO_C_STRING_LIST = MemberName("org.gtkkn.extensions.glib.ext", "toCStringList")
        internal val TO_K_STRING_LIST = MemberName("org.gtkkn.extensions.glib.ext", "toKStringList")
        internal val TO_G_POINTER_C_ARRAY = MemberName("org.gtkkn.extensions.glib.ext", "toGPointerCArray")
        internal val TO_G_POINTER_LIST = MemberName("org.gtkkn.extensions.glib.ext", "toGPointerList")
        internal val TYPE_PROVIDER_INTERFACE_TYPE = ClassName("org.gtkkn.extensions.gobject", "TypeProvider")
        internal val UNSAFE_FIELD_SETTER_TYPE = ClassName("org.gtkkn.extensions.glib.annotations", "UnsafeFieldSetter")

        // gtk-kn marker interfaces
        internal val GLIB_BITFIELD_MARKER_TYPE = ClassName("org.gtkkn.extensions.glib", "Bitfield")

        // cinterop helper function members
        internal val ALLOC_POINTER_TO = MemberName("kotlinx.cinterop", "allocPointerTo")
        internal val AS_STABLE_REF_FUNC = MemberName("kotlinx.cinterop", "asStableRef")
        internal val AUTOFREE_SCOPE = ClassName("kotlinx.cinterop", "AutofreeScope")
        internal val CSTR_FUNC = MemberName("kotlinx.cinterop", "cstr")
        internal val KP_BYTEVAR = ClassName("kotlinx.cinterop", "ByteVar")
        internal val KP_CFUNCTION = ClassName("kotlinx.cinterop", "CFunction")
        internal val KP_CPOINTED = ClassName("kotlinx.cinterop", "CPointed")
        internal val KP_CPOINTER = ClassName("kotlinx.cinterop", "CPointer")
        internal val KP_OPAQUE_POINTER = ClassName("kotlinx.cinterop", "COpaquePointer")
        internal val KP_STRING_ARRAY = ClassName("kotlinx.cinterop", "CArrayPointer").parameterizedBy(
            ClassName("kotlinx.cinterop", "CPointerVarOf").parameterizedBy(cPointerOf(KP_BYTEVAR)),
        )
        internal val KP_GPOINTER_ARRAY = ClassName("kotlinx.cinterop", "CArrayPointer").parameterizedBy(G_POINTER_VAR)
        internal val KP_WILDCARD_CPOINTER = cPointerOf(WildcardTypeName.producerOf(KP_CPOINTED))
        internal val MEMSCOPED = MemberName("kotlinx.cinterop", "memScoped")
        internal val NATIVE_HEAP_OBJECT = ClassName("kotlinx.cinterop", "nativeHeap")
        internal val NATIVE_PLACEMENT_ALLOC = ClassName("kotlinx.cinterop", "alloc")
        internal val POINTED = MemberName("kotlinx.cinterop", "pointed")
        internal val POINTED_FUNC = MemberName("kotlinx.cinterop", "pointed")
        internal val PTR_FUNC = MemberName("kotlinx.cinterop", "ptr")
        internal val REINTERPRET_FUNC = MemberName("kotlinx.cinterop", "reinterpret")
        internal val STABLEREF = ClassName("kotlinx.cinterop", "StableRef")
        internal val STATIC_C_FUNC = MemberName("kotlinx.cinterop", "staticCFunction")
        internal val TO_KSTRING_FUNC = MemberName("kotlinx.cinterop", "toKString")
        internal val VALUE_PROPERTY = MemberName("kotlinx.cinterop", "value")

        // kotlin native helper function members
        internal val CLEANER = ClassName("kotlin.native.ref", "Cleaner")
        internal val CREATE_CLEANER = MemberName("kotlin.native.ref", "createCleaner")

        // kotlin helpers
        internal val ANNOTATION_RETENTION_TYPE = ClassName("kotlin.annotation", "AnnotationRetention")
        internal val KCLASS_TYPE = ClassName("kotlin.reflect", "KClass")
        internal val PAIR_TYPE = ClassName("kotlin", "Pair")
        internal val REQUIRES_OPT_IN_TYPE = ClassName("kotlin", "RequiresOptIn")
        internal val REQUIRES_OPT_IN_LEVEL_TYPE = REQUIRES_OPT_IN_TYPE.nestedClass("Level")
        internal val RESULT_TYPE = ClassName("kotlin", "Result")
        internal val RETENTION_TYPE = ClassName("kotlin.annotation", "Retention")
        internal val THROWS_TYPE = ClassName("kotlin", "Throws")

        // gobject
        internal val G_OBJECT = ClassName("org.gtkkn.bindings.gobject", "Object")
        internal val G_SIGNAL_CONNECT_DATA = MemberName("org.gtkkn.native.gobject", "g_signal_connect_data")
        internal val G_SIGNAL_EMIT_BY_NAME = MemberName("org.gtkkn.native.gobject", "g_signal_emit_by_name")
        internal val G_STRDUP_VALUE_CONTENTS = MemberName("org.gtkkn.bindings.gobject", "GObject.strdupValueContents")
        internal val G_TYPE_INSTANCE = ClassName("org.gtkkn.bindings.gobject", "TypeInstance")

        // glib
        internal val G_ERROR_MEMBER = MemberName("org.gtkkn.native.glib", "GError")
        internal val G_FREE_FUNC = MemberName("org.gtkkn.native.glib", "g_free")
        internal val G_QUARK_FROM_STRING_FUNC = MemberName("org.gtkkn.native.glib", "g_quark_from_string")
        internal val G_STRDUP_FUNC = MemberName("org.gtkkn.native.glib", "g_strdup")

        /**
         * A [TypeName] for kotlinx.cinterop.CPointer pointing to [typeName]
         */
        internal fun cPointerOf(typeName: TypeName): ParameterizedTypeName = KP_CPOINTER.parameterizedBy(typeName)
    }
}

// g types
internal val G_BOOLEAN = ClassName("org.gtkkn.native.glib", "gboolean")
internal val G_CHAR = ClassName("org.gtkkn.native.glib", "gchar")
internal val G_DOUBLE = ClassName("org.gtkkn.native.glib", "gdouble")
internal val G_FLOAT = ClassName("org.gtkkn.native.glib", "gfloat")
internal val G_INT = ClassName("org.gtkkn.native.glib", "gint")
internal val G_INT64 = ClassName("org.gtkkn.native.glib", "gint64")
internal val G_INT8 = ClassName("org.gtkkn.native.glib", "gint8")
internal val G_INTPTR = ClassName("org.gtkkn.native.glib", "gintptr")
internal val G_LONG = ClassName("org.gtkkn.native.glib", "glong")
internal val G_POINTER = ClassName("org.gtkkn.native.glib", "gpointer")
internal val G_POINTER_VAR = ClassName("org.gtkkn.native.glib", "gpointerVar")
internal val G_SIZE = ClassName("org.gtkkn.native.glib", "gsize")
internal val G_TYPE = ClassName("org.gtkkn.native.gobject", "GType")
internal val G_UINT = ClassName("org.gtkkn.native.glib", "guint")
internal val G_UINT16 = ClassName("org.gtkkn.native.glib", "guint16")
internal val G_UINT32 = ClassName("org.gtkkn.native.glib", "guint32")
internal val G_UINT64 = ClassName("org.gtkkn.native.glib", "guint64")
internal val G_UINT8 = ClassName("org.gtkkn.native.glib", "guint8")
internal val G_UINTPTR = ClassName("org.gtkkn.native.glib", "guintptr")
internal val G_ULONG = ClassName("org.gtkkn.native.glib", "gulong")
internal val G_UNICHAR = ClassName("org.gtkkn.native.glib", "gunichar")
internal val G_USHORT = ClassName("org.gtkkn.native.glib", "gushort")
