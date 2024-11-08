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

package org.gtkkn.gir.cli

import io.github.oshai.kotlinlogging.Level
import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.serialization.json.Json
import org.gtkkn.gir.config.Config
import org.gtkkn.gir.config.GtkKnJsonConfig
import org.gtkkn.gir.log.logger
import java.io.File
import java.util.Locale

private const val ENV_GTK_KN_LICENSE = "GTK_KN_LICENSE"
private const val ENV_GTK_KN_LOG_LEVEL = "GTK_KN_LOG_LEVEL"
private const val ENV_GTK_KN_SKIP_FORMAT = "GTK_KN_SKIP_FORMAT"

fun parseConfig(args: Array<String>): Config {
    val parser = ArgParser("generator")
    val girPath by parser
        .option(
            ArgType.String,
            shortName = "g",
            description = "Path to the GIR directory",
        )

    val outputPath by parser
        .option(
            ArgType.String,
            shortName = "o",
            description = "Output directory",
        )

    val skipFormat by parser
        .option(
            ArgType.Boolean,
            description = "Do not format the generated code with KtLint",
        )

    val logLevel by parser
        .option(
            ArgType.Choice<Level>(),
            description = "Log level",
        )

    val license by parser
        .option(
            ArgType.Choice<Config.License>(),
            shortName = "l",
            description = "License of the generated bindings ",
        )

    val configFile by parser
        .option(
            ArgType.String,
            shortName = "c",
            description = "Path to gtkkn.json file",
        )

    parser.parse(args)

    // use config file as default
    val configFilePath = configFile ?: resolveDefaultConfigFilePath()
    var config = loadConfigFromFile(File(configFilePath))

    // apply env variable overrides
    getLicenseFromEnv()?.let { config = config.copy(bindingLicense = it) }
    getSkipFormatFromEnv()?.let { config = config.copy(skipFormat = it) }
    getLogLevelFromEnv()?.let { config = config.copy(logLevel = it) }

    // apply cli argument overrides
    girPath?.let { config = config.copy(girBaseDir = File(it)) }
    outputPath?.let { config = config.copy(outputDir = File(it)) }
    skipFormat?.let { config = config.copy(skipFormat = it) }
    logLevel?.let { config = config.copy(logLevel = it) }
    license?.let { config = config.copy(bindingLicense = it) }

    return config
}

private fun getLogLevelFromEnv(): Level? = try {
    System.getenv(ENV_GTK_KN_LOG_LEVEL)?.let { Level.valueOf(it.uppercase(Locale.ROOT)) }
} catch (e: IllegalArgumentException) {
    null
}

private fun getLicenseFromEnv(): Config.License? = try {
    System.getenv(ENV_GTK_KN_LICENSE)?.let { Config.License.valueOf(it.uppercase(Locale.ROOT)) }
} catch (e: IllegalArgumentException) {
    null
}

private fun getSkipFormatFromEnv(): Boolean? = System.getenv(ENV_GTK_KN_SKIP_FORMAT)?.let { envValue ->
    when {
        envValue.lowercase() == "true" -> true
        envValue.lowercase() == "false" -> false
        else -> null
    }
}

private fun resolveDefaultConfigFilePath(): String {
    val userDir = File(System.getProperty("user.dir"))
    var searchDir = userDir

    while (searchDir.parentFile != null) {
        val configFile = searchDir.resolve("gtkkn.json")
        if (configFile.exists()) {
            return configFile.absolutePath
        }
        searchDir = searchDir.parentFile
    }

    logger.error { "No gtkkn.json file found in ${userDir.absolutePath} or its parents" }
    error("No gtkkn.json file found in ${userDir.absolutePath} or its parents")
}

private fun loadConfigFromFile(file: File): Config {
    val jsonConfig = Json.decodeFromString<GtkKnJsonConfig>(file.readText())

    return Config(
        girBaseDir = file.parentFile.resolve(jsonConfig.girBaseDir),
        outputDir = file.parentFile.resolve(jsonConfig.outputDir),
        logLevel = Level.valueOf(jsonConfig.logLevel),
        skipFormat = jsonConfig.skipFormat,
        bindingLicense = Config.License.valueOf(jsonConfig.bindingLicense),
        libraries = jsonConfig.libraries,
    )
}
