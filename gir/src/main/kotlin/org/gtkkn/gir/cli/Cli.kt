package org.gtkkn.gir.cli

import io.github.oshai.Level
import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import org.gtkkn.gir.config.Config
import java.io.File
import java.util.Locale

private const val DEFAULT_GIR_PATH = "/usr/share/gir-1.0/"
private const val ENV_GTK_KN_LOG_LEVEL = "GTK_KN_LOG_LEVEL"
private const val ENV_GTK_KN_LICENSE = "GTK_KN_LICENSE"

fun parseConfig(args: Array<String>): Config {
    val parser = ArgParser("generator")
    val girPath by parser
        .option(
            ArgType.String,
            shortName = "g",
            description = "Path to the GIR directory",
        )
        .default(DEFAULT_GIR_PATH)

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
            description = "Log level",
        )
        .default(getDefaultLogLevel())

    val license by parser
        .option(
            ArgType.Choice<Config.License>(),
            shortName = "l",
            description = "License of the generated bindings ",
        )
        .default(getDefaultLicense())

    parser.parse(args)

    return Config(
        girBaseDir = File(girPath),
        outputDir = File(outputPath),
        logLevel = logLevel,
        bindingLicense = license,
        skipFormat = skipFormat,
    )
}

private fun getDefaultLogLevel(): Level {
    val default = Level.INFO
    return try {
        System.getenv(ENV_GTK_KN_LOG_LEVEL)?.let { Level.valueOf(it.uppercase(Locale.ROOT)) } ?: default
    } catch (e: IllegalArgumentException) {
        default
    }
}

private fun getDefaultLicense(): Config.License {
    val default = Config.License.LGPL
    return try {
        System.getenv(ENV_GTK_KN_LICENSE)?.let { Config.License.valueOf(it.uppercase(Locale.ROOT)) } ?: default
    } catch (e: IllegalArgumentException) {
        default
    }
}

private fun getDefaultSkipFormat(): Boolean = System.getenv("GTK_KN_SKIP_FORMAT")?.lowercase() == "true"
