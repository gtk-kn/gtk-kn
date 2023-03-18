package org.gtkkn.samples.gtk.helloworld

import io.github.oshai.KotlinLogging
import io.github.oshai.KotlinLoggingConfiguration
import io.github.oshai.Level
import native.gio.g_application_new
import native.gio.g_application_run

private val logger = KotlinLogging.logger("main")
fun main() {
    KotlinLoggingConfiguration.logLevel = Level.TRACE
    logger.trace { "Hello World!" }
    val gApp = g_application_new("org.gtkkn.samples.gtk.helloworld", 0)!!
    g_application_run(gApp, 0, null)
}
