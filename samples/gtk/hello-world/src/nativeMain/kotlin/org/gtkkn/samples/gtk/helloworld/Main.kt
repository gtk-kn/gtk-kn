package org.gtkkn.samples.gtk.helloworld

import native.gio.g_application_new
import native.gio.g_application_run

fun main() {
    println("Hello World!")
    val gApp = g_application_new("org.gtkkn.samples.gtk.helloworld", 0)!!
    g_application_run(gApp, 0, null)
}
