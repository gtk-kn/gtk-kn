package org.gtkkn.gir

import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import org.gtkkn.gir.blueprints.prettyPrint
import org.gtkkn.gir.generator.BindingsGenerator
import org.gtkkn.gir.parser.GirParser
import org.gtkkn.gir.processor.Phase2Processor
import java.io.File
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

    parser.parse(args)

    val girBaseDir = File(girPath)
    if (!girBaseDir.exists()) {
        println("Error: the specified file does not exist.")
        exitProcess(2)
    }

    println("==> girBaseDir = $girBaseDir")

    val girParser = GirParser()
    val repositories = girBaseDir.listFiles().orEmpty()
        .asSequence()
        .filter { it.extension == "gir" }
        .filter { file -> GIR_PREFIX_WHITELIST.any { file.name.startsWith(it) } }
        .map { girParser.parse(it) }

    println("Parsed ${repositories.count()} gir files")

    val phase2 = Phase2Processor()
    val repositoryBlueprints = phase2.process(repositories.toList())

    println("Processed ${repositoryBlueprints.count()} blueprints")

    repositoryBlueprints.forEach { repo ->
        repo.prettyPrint()
    }

    val generator = BindingsGenerator(File(outputPath))
    generator.generate(repositoryBlueprints)
}
