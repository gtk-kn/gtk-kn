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

package org.gtkkn.gir

import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import me.tatarka.inject.annotations.Inject
import org.gtkkn.gir.config.Config
import org.gtkkn.gir.coroutines.DefaultCoroutineDispatcherProvider
import org.gtkkn.gir.generator.BindingsGenerator
import org.gtkkn.gir.gradleplugin.generateRepositoryAnnotationsFile
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirRepository
import org.gtkkn.gir.parser.gir.GirParser
import org.gtkkn.gir.processor.Phase2Processor
import org.gtkkn.gir.util.loadResourceAsFile
import java.io.File
import kotlin.system.exitProcess

@Inject
class Application(
    private val bindingsGeneratorFactory: () -> BindingsGenerator,
    private val config: Config,
    private val dispatcherProvider: DefaultCoroutineDispatcherProvider,
    private val girParserFactory: () -> GirParser,
    private val phase2Processor: Phase2Processor,
) {
    suspend fun run(): Unit = coroutineScope {
        if (!config.girBaseDir.exists()) {
            logger.error { "Error: the specified directory does not exist." }
            exitProcess(2)
        }

        logger.info { "girBaseDir: ${config.girBaseDir}" }

        val repositories = config.girBaseDir.listFiles().orEmpty()
            .filter { file -> config.matchesGirFile(file) }
            .map { file ->
                val baseRepo = girParserFactory().parse(file)
                if (file.name.startsWith("cairo-")) {
                    val customGirFile = loadResourceAsFile("/gir-files/cairo-custom.gir")
                        ?: error("Resource not found: /gir-files/cairo-custom.gir")

                    val customRepo = girParserFactory().parse(customGirFile)
                    mergeGirRepositories(baseRepo, customRepo)
                } else {
                    baseRepo
                }
            }

        logger.info { "Parsed ${repositories.count()} gir files" }

        val repositoryBlueprints = phase2Processor.process(repositories)

        logger.info { "Processed ${repositoryBlueprints.count()} blueprints" }

        val deferreds = repositoryBlueprints.map { blueprint ->
            async(dispatcherProvider.default) {
                bindingsGeneratorFactory().generate(
                    repository = blueprint,
                    moduleOutputDir = getRepositoryOutputPath(blueprint.kotlinModuleName, config),
                )
            }
        }
        deferreds.awaitAll()

        val optInAnnotationsFile = File(config.outputDir, "optInAnnotations.txt")
        if (optInAnnotationsFile.exists()) {
            generateRepositoryAnnotationsFile(optInAnnotationsFile, config.gradlePluginDir)
        }
    }

    private fun getRepositoryOutputPath(repositoryName: String, config: Config): File {
        val library = config.libraries.find { it.name == repositoryName }
            ?: error("Library $repositoryName is not present in configuration")
        val modulePath = library.module.replace(":", "/")
        return config.outputDir.resolve(modulePath)
    }

    private fun mergeGirRepositories(
        baseRepo: GirRepository,
        customRepo: GirRepository
    ): GirRepository {
        // Merge namespaces
        val mergedNamespaces = baseRepo.namespaces.map { baseNs ->
            // Find a matching namespace in `customRepo` by the same name
            val overrideNs = customRepo.namespaces.find { it.name == baseNs.name }
            if (overrideNs != null) {
                mergeGirNamespace(baseNs, overrideNs)
            } else {
                baseNs
            }
        } + customRepo.namespaces.filter { customNs -> baseRepo.namespaces.none { it.name == customNs.name } }

        return baseRepo.copy(
            namespaces = mergedNamespaces,
        )
    }

    private fun mergeGirNamespace(
        baseNs: GirNamespace,
        customNs: GirNamespace
    ): GirNamespace {
        val customClassNames = customNs.classes.map { it.name }.toSet()
        val mergedClasses = baseNs.classes.map { baseClass ->
            // If there's a custom record with the same name, override
            customNs.classes.find { it.name == baseClass.name } ?: baseClass
        } + customNs.classes.filter { customClass ->
            // Add custom classes missing in base
            baseNs.classes.none { it.name == customClass.name }
        }

        val mergedEnumerations = baseNs.enumerations.map { baseEnumeration ->
            // If there's a custom record with the same name, override
            customNs.enumerations.find { it.name == baseEnumeration.name } ?: baseEnumeration
        } + customNs.enumerations.filter { customEnumeration ->
            // Add custom enumerations missing in base
            baseNs.enumerations.none { it.name == customEnumeration.name }
        }

        val mergedFunctions = baseNs.functions.map { baseFunction ->
            // If there's a custom record with the same name, override
            customNs.functions.find { it.callable.getName() == baseFunction.callable.getName() } ?: baseFunction
        } + customNs.functions.filter { customFunction ->
            // Add custom functions missing in base
            baseNs.functions.none { it.callable.getName() == customFunction.callable.getName() }
        }

        val mergedRecords = baseNs.records
            .filter { baseRecord ->
                // Exclude base records whose name matches any custom class name
                baseRecord.name !in customClassNames
            }
            .map { baseRecord ->
                // If there's a custom record with the same name, override
                customNs.records.find { it.name == baseRecord.name } ?: baseRecord
            } + customNs.records.filter { customRecord ->
            // Add custom records missing in base
            baseNs.records.none { it.name == customRecord.name }
        }

        val mergedUnions = baseNs.unions.map { baseUnion ->
            // If there's a custom record with the same name, override
            customNs.unions.find { it.name == baseUnion.name } ?: baseUnion
        } + customNs.unions.filter { customUnion ->
            // Add custom unions missing in base
            baseNs.unions.none { it.name == customUnion.name }
        }

        return baseNs.copy(
            classes = mergedClasses,
            enumerations = mergedEnumerations,
            functions = mergedFunctions,
            records = mergedRecords,
            unions = mergedUnions,
        )
    }
}
