package org.gtkkn.gir

import io.github.oshai.Level
import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import org.gtkkn.gir.blueprints.prettyPrint
import org.gtkkn.gir.generator.BindingsGenerator
import org.gtkkn.gir.log.configureLog4j
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.parser.GirParser
import org.gtkkn.gir.processor.Phase2Processor
import java.io.File
import java.util.Locale
import kotlin.system.exitProcess

private val GIR_PREFIX_WHITELIST = arrayOf(
    "cairo-",
    "Gdk-4",
    "GdkPixbuf-",
    "Gio-",
    "GLib-",
    "GModule-",
    "GObject-",
    "Graphene-",
    "Gsk-",
    "Gtk-4",
    "HarfBuzz-",
    "Pango-",
    "PangoCairo-",
)

fun main(args: Array<String>) {
    val parser = ArgParser("generator")
    val girPath by parser
        .option(
            ArgType.String,
            shortName = "g",
            description = "Path to the GIR directory",
        )
        .default("/usr/share/gir-1.0/")

    val outputPath by parser
        .option(
            ArgType.String,
            shortName = "o",
            description = "Output directory",
        )
        .default(File(System.getProperty("user.dir")).parentFile.resolve("bindings").absolutePath)

    val logLevel by parser
        .option(
            ArgType.Choice<Level>(),
            shortName = "l",
            description = "Log level",
        )
        .default(getDefaultLogLevel())

    parser.parse(args)

    configureLog4j(logLevel)

    val girBaseDir = File(girPath)
    if (!girBaseDir.exists()) {
        logger.error("Error: the specified directory does not exist.")
        exitProcess(2)
    }

    logger.info("==> girBaseDir = $girBaseDir")

    val girParser = GirParser()
    val repositories = girBaseDir.listFiles().orEmpty()
        .filter { file -> file.extension == "gir" && GIR_PREFIX_WHITELIST.any { file.name.startsWith(it) } }
        .map { girParser.parse(it) }

    logger.info("Parsed ${repositories.count()} gir files")

    val phase2 = Phase2Processor()
    val repositoryBlueprints = phase2.process(repositories)

    logger.info("Processed ${repositoryBlueprints.count()} blueprints")

    repositoryBlueprints.forEach { repo ->
        repo.prettyPrint()
    }

    val generator = BindingsGenerator(File(outputPath))
    generator.generate(repositoryBlueprints)
}

private fun getDefaultLogLevel() = try {
    Level.valueOf(System.getenv("GTK_KN_LOG_LEVEL").uppercase(Locale.ROOT))
} catch (e: IllegalArgumentException) {
    Level.INFO
}
