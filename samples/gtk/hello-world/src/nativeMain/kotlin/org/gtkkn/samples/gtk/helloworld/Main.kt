package org.gtkkn.samples.gtk.helloworld

import bindings.gtk.Application
import bindings.gtk.ApplicationWindow
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import native.gio.g_application_run
import native.glib.gpointer
import native.gobject.GCallback
import native.gobject.GClosureNotify
import native.gobject.g_signal_connect_data
import native.gtk.gtk_application_new
import native.gtk.gtk_application_window_new

fun main() {
    println("Hello World!")

    val appPointer = gtk_application_new("org.gtkkn.test", 0)!!
    val application = Application(appPointer.reinterpret())

    application.onActivate {
        println("App activated")

        val appWindowPointer = gtk_application_window_new(application.gtkApplicationPointer.reinterpret())!!
        val appWindow = ApplicationWindow(appWindowPointer.reinterpret())
        appWindow.show()
    }
    application.run()
//    g_application_run(application.gioApplicationPointer, 0, null)
}

// temp hacking

fun Application.run(): Unit {
    g_application_run(this.gioApplicationPointer, 0, null)
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

// TODO would this make sense in GApplication instead?
private val onActivateCallbackFunc: GCallback =
    staticCFunction { _: gpointer?, data: gpointer? ->
        data?.asStableRef<() -> bindings.gtk.Unit>()?.get()?.invoke()
        Unit
    }.reinterpret()

internal val staticStableRefDestroy: GClosureNotify =
    staticCFunction { data: gpointer?,
        _: gpointer? ->
        data?.asStableRef<Any>()?.dispose()
        Unit
    }.reinterpret()
