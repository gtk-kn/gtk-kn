// This is a generated file. Do not modify.
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
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkVulkanContext
import org.gtkkn.native.gdk.gdk_vulkan_context_get_type
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gobject.g_signal_connect_data
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
public open class VulkanContext(
    pointer: CPointer<GdkVulkanContext>,
) : DrawContext(pointer.reinterpret()), Initable, KGTyped {
    public val gdkVulkanContextPointer: CPointer<GdkVulkanContext>
        get() = gPointer.reinterpret()

    override val gioInitablePointer: CPointer<GInitable>
        get() = gPointer.reinterpret()

    /**
     * Emitted when the images managed by this context have changed.
     *
     * Usually this means that the swapchain had to be recreated,
     * for example in response to a change of the surface size.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectImagesUpdated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "images-updated",
            connectImagesUpdatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<VulkanContext> {
        override val type: GeneratedClassKGType<VulkanContext> =
            GeneratedClassKGType(gdk_vulkan_context_get_type()) {
                VulkanContext(it.reinterpret())
            }

        init {
            GdkTypeProvider.register()
        }
    }
}

private val connectImagesUpdatedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
