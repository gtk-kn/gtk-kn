// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.Initable
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkVulkanContext
import org.gtkkn.native.gdk.gdk_vulkan_context_get_type
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.ULong
import kotlin.Unit

/**
 * `GdkVulkanContext` is an object representing the platform-specific
 * Vulkan draw context.
 *
 * `GdkVulkanContext`s are created for a surface using
 * [method@Gdk.Surface.create_vulkan_context], and the context will match
 * the characteristics of the surface.
 *
 * Support for `GdkVulkanContext` is platform-specific and context creation
 * can fail, returning null context.
 */
public abstract class VulkanContext(public val gdkVulkanContextPointer: CPointer<GdkVulkanContext>) :
    DrawContext(gdkVulkanContextPointer.reinterpret()),
    Initable,
    KGTyped {
    init {
        Gdk
    }

    override val gioInitablePointer: CPointer<GInitable>
        get() = handle.reinterpret()

    /**
     * Emitted when the images managed by this context have changed.
     *
     * Usually this means that the swapchain had to be recreated,
     * for example in response to a change of the surface size.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onImagesUpdated(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gdkVulkanContextPointer,
            "images-updated",
            onImagesUpdatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "images-updated" signal. See [onImagesUpdated].
     */
    public fun emitImagesUpdated() {
        g_signal_emit_by_name(gdkVulkanContextPointer.reinterpret(), "images-updated")
    }

    /**
     * The VulkanContextImpl type represents a native instance of the abstract VulkanContext class.
     *
     * @constructor Creates a new instance of VulkanContext for the provided [CPointer].
     */
    public class VulkanContextImpl(pointer: CPointer<GdkVulkanContext>) : VulkanContext(pointer)

    public companion object : TypeCompanion<VulkanContext> {
        override val type: GeneratedClassKGType<VulkanContext> =
            GeneratedClassKGType(getTypeOrNull()!!) { VulkanContextImpl(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of VulkanContext
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_vulkan_context_get_type()

        /**
         * Gets the GType of from the symbol `gdk_vulkan_context_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_vulkan_context_get_type")
    }
}

private val onImagesUpdatedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
