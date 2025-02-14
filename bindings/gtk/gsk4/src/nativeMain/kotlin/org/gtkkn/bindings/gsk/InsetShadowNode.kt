// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskInsetShadowNode
import org.gtkkn.native.gsk.gsk_inset_shadow_node_get_blur_radius
import org.gtkkn.native.gsk.gsk_inset_shadow_node_get_color
import org.gtkkn.native.gsk.gsk_inset_shadow_node_get_dx
import org.gtkkn.native.gsk.gsk_inset_shadow_node_get_dy
import org.gtkkn.native.gsk.gsk_inset_shadow_node_get_outline
import org.gtkkn.native.gsk.gsk_inset_shadow_node_get_spread
import org.gtkkn.native.gsk.gsk_inset_shadow_node_get_type
import org.gtkkn.native.gsk.gsk_inset_shadow_node_new
import org.gtkkn.native.gsk.gsk_render_node_unref

/**
 * A render node for an inset shadow.
 */
public open class InsetShadowNode(public val gskInsetShadowNodePointer: CPointer<GskInsetShadowNode>) :
    RenderNode(gskInsetShadowNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Creates a `GskRenderNode` that will render an inset shadow
     * into the box given by @outline.
     *
     * @param outline outline of the region containing the shadow
     * @param color color of the shadow
     * @param dx horizontal offset of shadow
     * @param dy vertical offset of shadow
     * @param spread how far the shadow spreads towards the inside
     * @param blurRadius how much blur to apply to the shadow
     * @return A new `GskRenderNode`
     */
    public constructor(
        outline: RoundedRect,
        color: Rgba,
        dx: gfloat,
        dy: gfloat,
        spread: gfloat,
        blurRadius: gfloat,
    ) : this(
        gsk_inset_shadow_node_new(
            outline.gskRoundedRectPointer,
            color.gdkRgbaPointer,
            dx,
            dy,
            spread,
            blurRadius
        )!!.reinterpret()
    ) {
        MemoryCleaner.setFreeFunc(this, owned = true) { gsk_render_node_unref(it.reinterpret()) }
    }

    /**
     * Retrieves the blur radius to apply to the shadow.
     *
     * @return the blur radius, in pixels
     */
    public open fun getBlurRadius(): gfloat =
        gsk_inset_shadow_node_get_blur_radius(gskInsetShadowNodePointer.reinterpret())

    /**
     * Retrieves the color of the inset shadow.
     *
     * The value returned by this function will not be correct
     * if the render node was created for a non-sRGB color.
     *
     * @return the color of the shadow
     */
    public open fun getColor(): Rgba = gsk_inset_shadow_node_get_color(gskInsetShadowNodePointer.reinterpret())!!.run {
        Rgba(this)
    }

    /**
     * Retrieves the horizontal offset of the inset shadow.
     *
     * @return an offset, in pixels
     */
    public open fun getDx(): gfloat = gsk_inset_shadow_node_get_dx(gskInsetShadowNodePointer.reinterpret())

    /**
     * Retrieves the vertical offset of the inset shadow.
     *
     * @return an offset, in pixels
     */
    public open fun getDy(): gfloat = gsk_inset_shadow_node_get_dy(gskInsetShadowNodePointer.reinterpret())

    /**
     * Retrieves the outline rectangle of the inset shadow.
     *
     * @return a rounded rectangle
     */
    public open fun getOutline(): RoundedRect =
        gsk_inset_shadow_node_get_outline(gskInsetShadowNodePointer.reinterpret())!!.run {
            RoundedRect(this)
        }

    /**
     * Retrieves how much the shadow spreads inwards.
     *
     * @return the size of the shadow, in pixels
     */
    public open fun getSpread(): gfloat = gsk_inset_shadow_node_get_spread(gskInsetShadowNodePointer.reinterpret())

    public companion object : TypeCompanion<InsetShadowNode> {
        override val type: GeneratedClassKGType<InsetShadowNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { InsetShadowNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of InsetShadowNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_inset_shadow_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_inset_shadow_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_inset_shadow_node_get_type")
    }
}
