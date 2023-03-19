package org.gtkkn.samples.gtk.helloworld

import bindings.gio.ApplicationFlags
import bindings.gtk.Application
import bindings.gtk.ApplicationWindow
import bindings.gtk.Box
import bindings.gtk.Button
import bindings.gtk.Orientation
import io.github.oshai.KotlinLogging
import io.github.oshai.KotlinLoggingConfiguration
import io.github.oshai.Level
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import native.gio.g_application_run
import native.glib.gpointer
import native.gobject.GCallback
import native.gobject.GClosureNotify
import native.gobject.g_signal_connect_data

private val logger = KotlinLogging.logger("main")

fun main() {
    KotlinLoggingConfiguration.logLevel = Level.TRACE
    logger.trace { "Hello World!" }

    val app = Application("org.gtkkn.samples.gtk.helloworld", ApplicationFlags.FLAGS_NONE)
    app.onActivate {
        logger.info { "Application onActivate" }

        val window = ApplicationWindow(app)
        window.setTitle("Window Title")

        val box = Box(Orientation.HORIZONTAL, 0)
        repeat(5) { i ->
            val button = Button()
            button.setLabel("Button $i")
            box.append(button)
        }
        window.setChild(box)

        window.show()
    }
    app.run()
}

fun Application.run() {
    g_application_run(gioApplicationPointer, 0, null)
}

fun Application.onActivate(func: () -> Unit) {
    g_signal_connect_data(
        gPointer.reinterpret(),
        "activate",
        onActivateCallbackFunc,
        StableRef.create(func).asCPointer(),
        staticStableRefDestroy,
        0,
    )
}

private val onActivateCallbackFunc: GCallback =
    staticCFunction { _: gpointer?, data: gpointer? ->
        data?.asStableRef<() -> bindings.gtk.Unit>()?.get()?.invoke()
        Unit
    }.reinterpret()

internal val staticStableRefDestroy: GClosureNotify =
    staticCFunction { data: gpointer?, _: gpointer? ->
        data?.asStableRef<Any>()?.dispose()
        Unit
    }.reinterpret()
