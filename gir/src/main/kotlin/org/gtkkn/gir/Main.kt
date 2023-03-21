package org.gtkkn.gir

import io.github.oshai.Level
import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import org.gtkkn.gir.blueprints.prettyPrint
import org.gtkkn.gir.generator.BindingsGenerator
import org.gtkkn.gir.generator.KtLintFormatter
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

private val GROUPED_REPO_MAP = mapOf(
    "core" to arrayOf(
        "cairo",
        "gdkpixbuf",
        "gio",
        "glib",
        "gmodule",
        "gobject",
        "graphene",
        "harfbuzz",
        "pango",
        "pangocairo",
    ),
    "gtk4" to arrayOf(
        "gdk",
        "gsk",
        "gtk",
    ),
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

    val skipFormat by parser
        .option(
            ArgType.Boolean,
            description = "Do not format the generated code with KtLint",
        )
        .default(getDefaultSkipFormat())

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

    val outputDir = File(outputPath)
    val generator = BindingsGenerator(skipFormat,  KtLintFormatter(outputDir))
    repositoryBlueprints.forEach {
        generator.generate(it, getRepositoryOutputPath(it.kotlinModuleName, outputDir))
    }
}

fun getRepositoryOutputPath(repositoryName: String, outputPath: File): File {
    GROUPED_REPO_MAP.entries.forEach { entry ->
        if (repositoryName in entry.value) {
            return outputPath.resolve(entry.key)
        }
    }
    return outputPath
}

private fun getDefaultLogLevel(): Level {
    val default = Level.INFO
    return try {
        System.getenv("GTK_KN_LOG_LEVEL")?.let { Level.valueOf(it.uppercase(Locale.ROOT)) } ?: default
    } catch (e: IllegalArgumentException) {
        default
    }
}

private fun getDefaultSkipFormat(): Boolean = System.getenv("GTK_KN_SKIP_FORMAT")?.lowercase() == "true"
