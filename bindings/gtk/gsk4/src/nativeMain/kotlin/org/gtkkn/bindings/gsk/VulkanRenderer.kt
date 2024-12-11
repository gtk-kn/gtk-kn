// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskVulkanRenderer
import org.gtkkn.native.gsk.gsk_vulkan_renderer_get_type
import org.gtkkn.native.gsk.gsk_vulkan_renderer_new

/**
 * A GSK renderer that is using Vulkan.
 *
 * This renderer will fail to realize if Vulkan is not supported.
 */
public open class VulkanRenderer(pointer: CPointer<GskVulkanRenderer>) :
    Renderer(pointer.reinterpret()),
    KGTyped {
    public val gskVulkanRendererPointer: CPointer<GskVulkanRenderer>
        get() = gPointer.reinterpret()

    public constructor() : this(gsk_vulkan_renderer_new()!!.reinterpret())

    public companion object : TypeCompanion<VulkanRenderer> {
        override val type: GeneratedClassKGType<VulkanRenderer> =
            GeneratedClassKGType(gsk_vulkan_renderer_get_type()) { VulkanRenderer(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of VulkanRenderer
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_vulkan_renderer_get_type()
    }
}
