package org.gtkkn.samples.gtk.helloworld

import bindings.gio.ApplicationFlags
import io.github.oshai.KotlinLogging
import io.github.oshai.KotlinLoggingConfiguration
import io.github.oshai.Level
import native.gio.g_application_new
import native.gio.g_application_run

private val logger = KotlinLogging.logger("main")

fun main() {
    KotlinLoggingConfiguration.logLevel = Level.TRACE
    logger.trace { "Hello World!" }

    startApplication(ApplicationFlags.FLAGS_NONE)
}

fun startApplication(flags: ApplicationFlags) {
    val gApp = g_application_new("org.gtkkn.samples.gtk.helloworld", flags.mask)!!
    g_application_run(gApp, 0, null)
}
