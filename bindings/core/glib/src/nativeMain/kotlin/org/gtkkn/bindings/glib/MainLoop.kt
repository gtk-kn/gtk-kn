// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
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
public class MainLoop(pointer: CPointer<GMainLoop>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GMainLoop> = pointer

    /**
     * Returns the #GMainContext of @loop.
     *
     * @return the #GMainContext of @loop
     */
    public fun getContext(): MainContext = g_main_loop_get_context(gPointer)!!.run {
        MainContext(this)
    }

    /**
     * Checks to see if the main loop is currently being run via g_main_loop_run().
     *
     * @return true if the mainloop is currently being run.
     */
    public fun isRunning(): Boolean = g_main_loop_is_running(gPointer).asBoolean()

    /**
     * Stops a #GMainLoop from running. Any calls to g_main_loop_run()
     * for the loop will return.
     *
     * Note that sources that have already been dispatched when
     * g_main_loop_quit() is called will still be executed.
     */
    public fun quit(): Unit = g_main_loop_quit(gPointer)

    /**
     * Increases the reference count on a #GMainLoop object by one.
     *
     * @return @loop
     */
    public fun ref(): MainLoop = g_main_loop_ref(gPointer)!!.run {
        MainLoop(this)
    }

    /**
     * Runs a main loop until g_main_loop_quit() is called on the loop.
     * If this is called for the thread of the loop's #GMainContext,
     * it will process events from the loop, otherwise it will
     * simply wait.
     */
    public fun run(): Unit = g_main_loop_run(gPointer)

    /**
     * Decreases the reference count on a #GMainLoop object by one. If
     * the result is zero, free the loop and free all associated memory.
     */
    public fun unref(): Unit = g_main_loop_unref(gPointer)

    public companion object {
        /**
         * Creates a new #GMainLoop structure.
         *
         * @param context a #GMainContext  (if null, the global-default
         *   main context will be used).
         * @param isRunning set to true to indicate that the loop is running. This
         * is not very important since calling g_main_loop_run() will set this to
         * true anyway.
         * @return a new #GMainLoop.
         */
        public fun new(context: MainContext? = null, isRunning: Boolean): MainLoop =
            MainLoop(g_main_loop_new(context?.gPointer, isRunning.asGBoolean())!!.reinterpret())

        /**
         * Get the GType of MainLoop
         *
         * @return the GType
         */
        public fun getType(): GType = g_main_loop_get_type()
    }
}
