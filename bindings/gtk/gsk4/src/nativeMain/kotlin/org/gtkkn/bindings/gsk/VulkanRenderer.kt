// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskVulkanRenderer
import org.gtkkn.native.gsk.gsk_vulkan_renderer_get_type
import org.gtkkn.native.gsk.gsk_vulkan_renderer_new

/**
 * A GSK renderer that is using Vulkan.
 *
 * This renderer will fail to realize if Vulkan is not supported.
 */
public open class VulkanRenderer(public val gskVulkanRendererPointer: CPointer<GskVulkanRenderer>) :
    Renderer(gskVulkanRendererPointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    public constructor() : this(gsk_vulkan_renderer_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<VulkanRenderer> {
        override val type: GeneratedClassKGType<VulkanRenderer> =
            GeneratedClassKGType(getTypeOrNull()!!) { VulkanRenderer(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of VulkanRenderer
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_vulkan_renderer_get_type()

        /**
         * Gets the GType of from the symbol `gsk_vulkan_renderer_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_vulkan_renderer_get_type")
    }
}
