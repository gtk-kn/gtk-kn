// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskColorNode
import org.gtkkn.native.gsk.gsk_color_node_get_color
import org.gtkkn.native.gsk.gsk_color_node_get_type
import org.gtkkn.native.gsk.gsk_color_node_new
import org.gtkkn.native.gsk.gsk_render_node_unref

/**
 * A render node for a solid color.
 */
public open class ColorNode(public val gskColorNodePointer: CPointer<GskColorNode>) :
    RenderNode(gskColorNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Creates a `GskRenderNode` that will render the color specified by @rgba into
     * the area given by @bounds.
     *
     * @param rgba a `GdkRGBA` specifying a color
     * @param bounds the rectangle to render the color into
     * @return A new `GskRenderNode`
     */
    public constructor(
        rgba: Rgba,
        bounds: Rect,
    ) : this(gsk_color_node_new(rgba.gdkRgbaPointer, bounds.grapheneRectPointer)!!.reinterpret()) {
        MemoryCleaner.setFreeFunc(this, owned = true) { gsk_render_node_unref(it.reinterpret()) }
    }

    /**
     * Retrieves the color of the given @node.
     *
     * @return the color of the node
     */
    public open fun getColor(): Rgba = gsk_color_node_get_color(gskColorNodePointer.reinterpret())!!.run {
        Rgba(this)
    }

    public companion object : TypeCompanion<ColorNode> {
        override val type: GeneratedClassKGType<ColorNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { ColorNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of ColorNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_color_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_color_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_color_node_get_type")
    }
}
