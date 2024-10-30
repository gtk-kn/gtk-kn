// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDebugController
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.g_debug_controller_get_debug_enabled
import org.gtkkn.native.gio.g_debug_controller_get_type
import org.gtkkn.native.gio.g_debug_controller_set_debug_enabled
import kotlin.Boolean
import kotlin.Unit

/**
 * `GDebugController` is an interface to expose control of debugging features and
 * debug output.
 *
 * It is implemented on Linux using [class@Gio.DebugControllerDBus], which
 * exposes a D-Bus interface to allow authenticated peers to control debug
 * features in this process.
 *
 * Whether debug output is enabled is exposed as
 * [property@Gio.DebugController:debug-enabled]. This controls
 * [func@GLib.log_set_debug_enabled] by default. Application code may
 * connect to the [signal@GObject.Object::notify] signal for it
 * to control other parts of its debug infrastructure as necessary.
 *
 * If your application or service is using the default GLib log writer function,
 * creating one of the built-in implementations of `GDebugController` should be
 * all that’s needed to dynamically enable or disable debug output.
 * @since 2.72
 */
public interface DebugController :
    Interface,
    Initable,
    KGTyped {
    public val gioDebugControllerPointer: CPointer<GDebugController>

    override val gioInitablePointer: CPointer<GInitable>
        get() = gioDebugControllerPointer.reinterpret()

    /**
     * true if debug output should be exposed (for example by forwarding it to
     * the journal), false otherwise.
     *
     * @since 2.72
     */
    public var debugEnabled: Boolean
        /**
         * Get the value of #GDebugController:debug-enabled.
         *
         * @return true if debug output should be exposed, false otherwise
         * @since 2.72
         */
        get() = g_debug_controller_get_debug_enabled(gioDebugControllerPointer.reinterpret()).asBoolean()

        /**
         * Set the value of #GDebugController:debug-enabled.
         *
         * @param debugEnabled true if debug output should be exposed, false otherwise
         * @since 2.72
         */
        set(
            debugEnabled
        ) = g_debug_controller_set_debug_enabled(gioDebugControllerPointer.reinterpret(), debugEnabled.asGBoolean())

    /**
     * Get the value of #GDebugController:debug-enabled.
     *
     * @return true if debug output should be exposed, false otherwise
     * @since 2.72
     */
    public fun getDebugEnabled(): Boolean =
        g_debug_controller_get_debug_enabled(gioDebugControllerPointer.reinterpret()).asBoolean()

    /**
     * Set the value of #GDebugController:debug-enabled.
     *
     * @param debugEnabled true if debug output should be exposed, false otherwise
     * @since 2.72
     */
    public fun setDebugEnabled(debugEnabled: Boolean): Unit =
        g_debug_controller_set_debug_enabled(gioDebugControllerPointer.reinterpret(), debugEnabled.asGBoolean())

    private data class Wrapper(
        private val pointer: CPointer<GDebugController>,
    ) : DebugController {
        override val gioDebugControllerPointer: CPointer<GDebugController> = pointer
    }

    public companion object : TypeCompanion<DebugController> {
        override val type: GeneratedInterfaceKGType<DebugController> =
            GeneratedInterfaceKGType(g_debug_controller_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GDebugController>): DebugController = Wrapper(pointer)
    }
}
