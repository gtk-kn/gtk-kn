// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskBorderNode
import org.gtkkn.native.gsk.gsk_border_node_get_colors
import org.gtkkn.native.gsk.gsk_border_node_get_outline
import org.gtkkn.native.gsk.gsk_border_node_get_type

/**
 * A render node for a border.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_widths`: Array parameter of type gfloat is not supported
 * - parameter `border_width`: Array parameter of type gfloat is not supported
 */
public open class BorderNode(public val gskBorderNodePointer: CPointer<GskBorderNode>) :
    RenderNode(gskBorderNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Retrieves the colors of the border.
     *
     * @return an array of 4 `GdkRGBA` structs
     *     for the top, right, bottom and left color of the border
     */
    public open fun getColors(): Rgba = gsk_border_node_get_colors(gskBorderNodePointer.reinterpret())!!.run {
        Rgba(this)
    }

    /**
     * Retrieves the outline of the border.
     *
     * @return the outline of the border
     */
    public open fun getOutline(): RoundedRect = gsk_border_node_get_outline(gskBorderNodePointer.reinterpret())!!.run {
        RoundedRect(this)
    }

    public companion object : TypeCompanion<BorderNode> {
        override val type: GeneratedClassKGType<BorderNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { BorderNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of BorderNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_border_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_border_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_border_node_get_type")
    }
}
