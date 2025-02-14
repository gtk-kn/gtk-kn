// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.glib.GMainLoop
import org.gtkkn.native.glib.g_main_loop_get_context
import org.gtkkn.native.glib.g_main_loop_is_running
import org.gtkkn.native.glib.g_main_loop_new
import org.gtkkn.native.glib.g_main_loop_quit
import org.gtkkn.native.glib.g_main_loop_ref
import org.gtkkn.native.glib.g_main_loop_run
import org.gtkkn.native.glib.g_main_loop_unref
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_main_loop_get_type
import kotlin.Boolean
import kotlin.Unit

/**
 * The `GMainLoop` struct is an opaque data type
 * representing the main event loop of a GLib or GTK application.
 */
public class MainLoop(public val glibMainLoopPointer: CPointer<GMainLoop>) : ProxyInstance(glibMainLoopPointer) {
    /**
     * Creates a new [struct@GLib.MainLoop] structure.
     *
     * @param context a #GMainContext  (if null, the global-default
     *   main context will be used).
     * @param isRunning set to true to indicate that the loop is running. This
     * is not very important since calling [method@GLib.MainLoop.run] will set this
     * to true anyway.
     * @return a new #GMainLoop.
     */
    public constructor(
        context: MainContext? = null,
        isRunning: Boolean,
    ) : this(g_main_loop_new(context?.glibMainContextPointer, isRunning.asGBoolean())!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Returns the [struct@GLib.MainContext] of @loop.
     *
     * @return the [struct@GLib.MainContext] of @loop
     */
    public fun getContext(): MainContext = g_main_loop_get_context(glibMainLoopPointer)!!.run {
        MainContext(this)
    }

    /**
     * Checks to see if the main loop is currently being run via
     * [method@GLib.MainLoop.run].
     *
     * @return true if the mainloop is currently being run.
     */
    public fun isRunning(): Boolean = g_main_loop_is_running(glibMainLoopPointer).asBoolean()

    /**
     * Stops a [struct@GLib.MainLoop] from running. Any calls to
     * [method@GLib.MainLoop.run] for the loop will return.
     *
     * Note that sources that have already been dispatched when
     * [method@GLib.MainLoop.quit] is called will still be executed.
     */
    public fun quit(): Unit = g_main_loop_quit(glibMainLoopPointer)

    /**
     * Increases the reference count on a [struct@GLib.MainLoop] object by one.
     *
     * @return @loop
     */
    public fun ref(): MainLoop = g_main_loop_ref(glibMainLoopPointer)!!.run {
        MainLoop(this)
    }

    /**
     * Runs a main loop until [method@GLib.MainLoop.quit] is called on the loop.
     * If this is called for the thread of the loop's #GMainContext,
     * it will process events from the loop, otherwise it will
     * simply wait.
     */
    public fun run(): Unit = g_main_loop_run(glibMainLoopPointer)

    /**
     * Decreases the reference count on a [struct@GLib.MainLoop] object by one. If
     * the result is zero, free the loop and free all associated memory.
     */
    public fun unref(): Unit = g_main_loop_unref(glibMainLoopPointer)

    public companion object {
        /**
         * Get the GType of MainLoop
         *
         * @return the GType
         */
        public fun getType(): GType = g_main_loop_get_type()
    }
}
