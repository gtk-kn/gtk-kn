// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDisplay
import org.gtkkn.native.gdk.GdkDisplayManager
import org.gtkkn.native.gdk.gdk_display_manager_get
import org.gtkkn.native.gdk.gdk_display_manager_get_default_display
import org.gtkkn.native.gdk.gdk_display_manager_get_type
import org.gtkkn.native.gdk.gdk_display_manager_list_displays
import org.gtkkn.native.gdk.gdk_display_manager_open_display
import org.gtkkn.native.gdk.gdk_display_manager_set_default_display
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A singleton object that offers notification when displays appear or
 * disappear.
 *
 * You can use [func@Gdk.DisplayManager.get] to obtain the `GdkDisplayManager`
 * singleton, but that should be rarely necessary. Typically, initializing
 * GTK opens a display that you can work with without ever accessing the
 * `GdkDisplayManager`.
 *
 * The GDK library can be built with support for multiple backends.
 * The `GdkDisplayManager` object determines which backend is used
 * at runtime.
 *
 * In the rare case that you need to influence which of the backends
 * is being used, you can use [func@Gdk.set_allowed_backends]. Note
 * that you need to call this function before initializing GTK.
 *
 * ## Backend-specific code
 *
 * When writing backend-specific code that is supposed to work with
 * multiple GDK backends, you have to consider both compile time and
 * runtime. At compile time, use the `GDK_WINDOWING_X11`, `GDK_WINDOWING_WIN32`
 * macros, etc. to find out which backends are present in the GDK library
 * you are building your application against. At runtime, use type-check
 * macros like GDK_IS_X11_DISPLAY() to find out which backend is in use:
 *
 * ```c
 * #ifdef GDK_WINDOWING_X11
 *   if (GDK_IS_X11_DISPLAY (display))
 *     {
 *       // make X11-specific calls here
 *     }
 *   else
 * #endif
 * #ifdef GDK_WINDOWING_MACOS
 *   if (GDK_IS_MACOS_DISPLAY (display))
 *     {
 *       // make Quartz-specific calls here
 *     }
 *   else
 * #endif
 *   g_error ("Unsupported GDK backend");
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `default-display`: Property TypeInfo of getter and setter do not match
 */
public open class DisplayManager(pointer: CPointer<GdkDisplayManager>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gdkDisplayManagerPointer: CPointer<GdkDisplayManager>
        get() = gPointer.reinterpret()

    /**
     * Gets the default `GdkDisplay`.
     *
     * @return a `GdkDisplay`
     */
    public open fun getDefaultDisplay(): Display? =
        gdk_display_manager_get_default_display(gdkDisplayManagerPointer.reinterpret())?.run {
            Display(reinterpret())
        }

    /**
     * List all currently open displays.
     *
     * @return a newly
     *   allocated `GSList` of `GdkDisplay` objects
     */
    public open fun listDisplays(): SList =
        gdk_display_manager_list_displays(gdkDisplayManagerPointer.reinterpret())!!.run {
            SList(reinterpret())
        }

    /**
     * Opens a display.
     *
     * @param name the name of the display to open
     * @return a `GdkDisplay`, or null
     *   if the display could not be opened
     */
    public open fun openDisplay(name: String? = null): Display? =
        gdk_display_manager_open_display(gdkDisplayManagerPointer.reinterpret(), name)?.run {
            Display(reinterpret())
        }

    /**
     * Sets @display as the default display.
     *
     * @param display a `GdkDisplay`
     */
    public open fun setDefaultDisplay(display: Display): Unit = gdk_display_manager_set_default_display(
        gdkDisplayManagerPointer.reinterpret(),
        display.gdkDisplayPointer.reinterpret()
    )

    /**
     * Emitted when a display is opened.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `display` the opened display
     */
    public fun connectDisplayOpened(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (display: Display) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "display-opened",
        connectDisplayOpenedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<DisplayManager> {
        override val type: GeneratedClassKGType<DisplayManager> =
            GeneratedClassKGType(gdk_display_manager_get_type()) { DisplayManager(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Gets the singleton `GdkDisplayManager` object.
         *
         * When called for the first time, this function consults the
         * `GDK_BACKEND` environment variable to find out which of the
         * supported GDK backends to use (in case GDK has been compiled
         * with multiple backends).
         *
         * Applications can use [func@set_allowed_backends] to limit what
         * backends will be used.
         *
         * @return The global `GdkDisplayManager` singleton
         */
        public fun `get`(): DisplayManager = gdk_display_manager_get()!!.run {
            DisplayManager(reinterpret())
        }

        /**
         * Get the GType of DisplayManager
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_display_manager_get_type()
    }
}

private val connectDisplayOpenedFunc: CPointer<CFunction<(CPointer<GdkDisplay>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            display: CPointer<GdkDisplay>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(display: Display) -> Unit>().get().invoke(
            display!!.run {
                Display(reinterpret())
            }
        )
    }
        .reinterpret()
