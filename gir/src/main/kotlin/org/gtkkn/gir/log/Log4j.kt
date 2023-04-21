/*
 * Copyright (c) 2023 gtk-kn
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

package org.gtkkn.gir.log

import io.github.oshai.KLogger
import io.github.oshai.KotlinLogging
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.core.appender.ConsoleAppender
import org.apache.logging.log4j.core.config.Configurator
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory

val logger: KLogger by lazy { KotlinLogging.logger("gir") }

private const val LOG4J_PATTERN = "%highlight{%-5level: [%c] %msg%n%throwable}" +
    "{FATAL=bright_red, ERROR=bright_red, WARN=bright_yellow, INFO=bright_green, DEBUG=bright_white, TRACE=white}"

fun configureLog4j(level: io.github.oshai.Level) {
    val builder = ConfigurationBuilderFactory.newConfigurationBuilder()
    val console = builder
        .newAppender("Stdout", "CONSOLE")
        .addAttribute("target", ConsoleAppender.Target.SYSTEM_OUT)
    console.add(builder.newLayout("PatternLayout").addAttribute("pattern", LOG4J_PATTERN))
    builder.add(console)
    builder.add(builder.newRootLogger(convertToLog4jLevel(level)).add(builder.newAppenderRef("Stdout")))
    Configurator.initialize(builder.build())
}

private fun convertToLog4jLevel(level: io.github.oshai.Level) = when (level) {
    io.github.oshai.Level.TRACE -> Level.TRACE
    io.github.oshai.Level.DEBUG -> Level.DEBUG
    io.github.oshai.Level.INFO -> Level.INFO
    io.github.oshai.Level.WARN -> Level.WARN
    io.github.oshai.Level.ERROR -> Level.ERROR
}
