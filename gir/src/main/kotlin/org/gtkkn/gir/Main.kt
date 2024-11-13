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
import kotlinx.coroutines.runBlocking
import org.gtkkn.gir.cli.parseConfig
import org.gtkkn.gir.config.Config
import org.gtkkn.gir.coroutines.DefaultCoroutineDispatcherProvider
import org.gtkkn.gir.generator.BindingsGenerator
import org.gtkkn.gir.gradleplugin.generateRepositoryAnnotationsFile
import org.gtkkn.gir.log.configureLog4j
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.parser.GirParser
import org.gtkkn.gir.processor.Phase2Processor
import java.io.File
import kotlin.system.exitProcess

fun main(args: Array<String>): Unit = runBlocking {
    val config = parseConfig(args)

    configureLog4j(config.logLevel)

    if (!config.girBaseDir.exists()) {
        logger.error { "Error: the specified directory does not exist." }
        exitProcess(2)
    }

    logger.info { "girBaseDir: ${config.girBaseDir}" }

    val girParser = GirParser()
    val repositories = config.girBaseDir.listFiles().orEmpty()
        .filter { file -> config.matchesGirFile(file) }
        .map { girParser.parse(it) }

    logger.info { "Parsed ${repositories.count()} gir files" }

    val phase2 = Phase2Processor()
    val repositoryBlueprints = phase2.process(repositories, config)

    logger.info { "Processed ${repositoryBlueprints.count()} blueprints" }

    val generator = BindingsGenerator(config)

    val dispatcherProvider = DefaultCoroutineDispatcherProvider()
    // Launch coroutines for each repository blueprint
    val deferreds = repositoryBlueprints.map { blueprint ->
        async(dispatcherProvider.default) {
            generator.generate(blueprint, getRepositoryOutputPath(blueprint.kotlinModuleName, config))
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
