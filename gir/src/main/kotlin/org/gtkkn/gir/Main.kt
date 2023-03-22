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
