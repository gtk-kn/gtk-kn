// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.GLoadableIcon
import org.gtkkn.native.gio.g_loadable_icon_get_type
import org.gtkkn.native.gio.g_loadable_icon_load_async
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * `GLoadableIcon` extends the [iface@Gio.Icon] interface and adds the ability
 * to load icons from streams.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `type`: type: Out parameter is not supported
 * - parameter `type`: type: Out parameter is not supported
 */
public interface LoadableIcon :
    Interface,
    Icon,
    KGTyped {
    public val gioLoadableIconPointer: CPointer<GLoadableIcon>

    override val gioIconPointer: CPointer<GIcon>
        get() = gioLoadableIconPointer.reinterpret()

    /**
     * Loads an icon asynchronously. To finish this function, see
     * g_loadable_icon_load_finish(). For the synchronous, blocking
     * version of this function, see g_loadable_icon_load().
     *
     * @param size an integer.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public fun loadAsync(size: gint, cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        g_loadable_icon_load_async(
            gioLoadableIconPointer.reinterpret(),
            size,
            cancellable?.gioCancellablePointer?.reinterpret(),
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    private data class Wrapper(private val pointer: CPointer<GLoadableIcon>) : LoadableIcon {
        override val gioLoadableIconPointer: CPointer<GLoadableIcon> = pointer
    }

    public companion object : TypeCompanion<LoadableIcon> {
        override val type: GeneratedInterfaceKGType<LoadableIcon> =
            GeneratedInterfaceKGType(g_loadable_icon_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GLoadableIcon>): LoadableIcon = Wrapper(pointer)

        /**
         * Get the GType of LoadableIcon
         *
         * @return the GType
         */
        public fun getType(): GType = g_loadable_icon_get_type()
    }
}
