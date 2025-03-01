// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
    Proxy,
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
            gioLoadableIconPointer,
            size,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * The LoadableIconImpl type represents a native instance of the LoadableIcon interface.
     *
     * @constructor Creates a new instance of LoadableIcon for the provided [CPointer].
     */
    public class LoadableIconImpl(gioLoadableIconPointer: CPointer<GLoadableIcon>) :
        Object(gioLoadableIconPointer.reinterpret()),
        LoadableIcon {
        init {
            Gio
        }

        override val gioLoadableIconPointer: CPointer<GLoadableIcon> = gioLoadableIconPointer
    }

    public companion object : TypeCompanion<LoadableIcon> {
        override val type: GeneratedInterfaceKGType<LoadableIcon> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { LoadableIconImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of LoadableIcon
         *
         * @return the GType
         */
        public fun getType(): GType = g_loadable_icon_get_type()

        /**
         * Gets the GType of from the symbol `g_loadable_icon_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_loadable_icon_get_type")
    }
}
