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
    fun generate(repository: RepositoryBlueprint, outputDir: File) {
        val repositoryOutputDir = repositoryBuildDir(repository, outputDir)
        if (!repositoryOutputDir.exists()) {
            logger.info("Creating output dir ${repositoryOutputDir.path}")
            if (!repositoryOutputDir.mkdirs()) {
                logger.error("Cannot create output path ${repositoryOutputDir.path}")
                return
            }
        }

        logger.info("Writing repository ${repository.name}")

        // write skip file
        writeRepositorySkipFile(repository, outputDir)

        // write strict enum file
        writeStrictEnumFile(repository, outputDir)

        // write classes
        repository.classBlueprints.forEach { clazz ->
            writeType(
                clazz.typeName,
                buildClass(clazz),
                repositorySrcDir(repository, outputDir),
                clazz.signals.map { buildStaticSignalCallback(it) },
            )
        }

        // write interfaces
        repository.interfaceBlueprints.forEach { iface ->
            writeType(
                iface.typeName,
                buildInterface(iface),
                repositorySrcDir(repository, outputDir),
                iface.signals.map { buildStaticSignalCallback(it) },
            )
        }

        // write bitfields
        repository.bitfieldBlueprints.forEach { bitfield ->
            writeType(
                bitfield.kotlinTypeName,
                buildBitfield(bitfield),
                repositorySrcDir(repository, outputDir),
            )
        }

        // write enums
        repository.enumBlueprints.forEach { enum ->
            writeType(
                enum.kotlinTypeName,
                buildEnum(enum),
                repositorySrcDir(repository, outputDir),
            )
        }

        // write records
        repository.recordBlueprints.forEach { record ->
            writeType(
                record.kotlinTypeName,
                buildRecord(record),
                repositorySrcDir(repository, outputDir),
            )
        }

        // write repository object
        writeType(
            repository.repositoryObjectName,
            buildRepositoryObject(repository),
            repositorySrcDir(repository, outputDir),
            additionalTypeAliases = repository.callbackBlueprints.map { buildCallbackTypeAlias(it) },
            additionalProperties = repository.callbackBlueprints.map { buildStaticCallbackProperty(it) },
        )
    }

    /**
     * bindings build dir
     */
    private fun repositoryBuildDir(repository: RepositoryBlueprint, outputDir: File): File =
        File(outputDir, "${repository.kotlinModuleName}/build")

    /**
     * bindings src output dir
     */
    private fun repositorySrcDir(repository: RepositoryBlueprint, outputDir: File): File =
        File(outputDir, "${repository.kotlinModuleName}/src/nativeMain/kotlin")

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
        val skipFile = File(repositoryBuildDir(repository, outputDir), "${repository.name}-skips.txt")
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
        val enumsFile = File(repositoryBuildDir(repository, outputDir), "${repository.name}-enums.txt")
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
        internal val AS_BOOLEAN_FUNC = MemberName("org.gtkkn.common", "asBoolean")
        internal val AS_GBOOLEAN_FUNC = MemberName("org.gtkkn.common", "asGBoolean")
        internal val STATIC_STABLEREF_DESTROY = MemberName("org.gtkkn.common", "staticStableRefDestroy")
        internal val TO_C_STRING_LIST = MemberName("org.gtkkn.common", "toCStringList")
        internal val TO_K_STRING_LIST = MemberName("org.gtkkn.common", "toKStringList")

        // cinterop helper function members
        internal val REINTERPRET_FUNC = MemberName("kotlinx.cinterop", "reinterpret")
        internal val TO_KSTRING_FUNC = MemberName("kotlinx.cinterop", "toKString")
        internal val STATIC_C_FUNC = MemberName("kotlinx.cinterop", "staticCFunction")
        internal val AS_STABLE_REF_FUNC = MemberName("kotlinx.cinterop", "asStableRef")
        internal val STABLEREF = ClassName("kotlinx.cinterop", "StableRef")
        internal val MEMSCOPED = MemberName("kotlinx.cinterop", "memScoped")
        internal val POINTED = MemberName("kotlinx.cinterop", "pointed")
        internal val PTR = MemberName("kotlinx.cinterop", "ptr")

        // gobject members
        internal val G_SIGNAL_CONNECT_DATA = MemberName("native.gobject", "g_signal_connect_data")
    }
}
