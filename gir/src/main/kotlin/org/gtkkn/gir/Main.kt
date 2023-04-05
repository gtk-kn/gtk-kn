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

package org.gtkkn.gir

import org.gtkkn.gir.cli.parseConfig
import org.gtkkn.gir.config.Config
import org.gtkkn.gir.generator.BindingsGenerator
import org.gtkkn.gir.generator.KtLintFormatter
import org.gtkkn.gir.log.configureLog4j
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.parser.GirParser
import org.gtkkn.gir.processor.Phase2Processor
import java.io.File
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val config = parseConfig(args)

    configureLog4j(config.logLevel)

    if (!config.girBaseDir.exists()) {
        logger.error("Error: the specified directory does not exist.")
        exitProcess(2)
    }

    logger.info("girBaseDir: ${config.girBaseDir}")

    val girParser = GirParser()
    val repositories = config.girBaseDir.listFiles().orEmpty()
        .filter { file -> file.extension == "gir" && config.girPrefixWhitelist.any { file.name.startsWith(it) } }
        .map { girParser.parse(it) }

    logger.info("Parsed ${repositories.count()} gir files")

    val phase2 = Phase2Processor()
    val repositoryBlueprints = phase2.process(repositories, config)

    logger.info("Processed ${repositoryBlueprints.count()} blueprints")

    val generator = BindingsGenerator(config, KtLintFormatter(config.outputDir))
    repositoryBlueprints.forEach {
        generator.generate(it, getRepositoryOutputPath(it.kotlinModuleName, config))
    }
}

private fun getRepositoryOutputPath(repositoryName: String, config: Config): File {
    config.groupedRepoMap.entries.forEach { entry ->
        if (repositoryName in entry.value) {
            return config.outputDir.resolve(entry.key)
        }
    }
    return config.outputDir
}
