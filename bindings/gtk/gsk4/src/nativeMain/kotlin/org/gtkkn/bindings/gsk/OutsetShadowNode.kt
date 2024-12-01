// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.RGBA
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskOutsetShadowNode
import org.gtkkn.native.gsk.gsk_outset_shadow_node_get_blur_radius
import org.gtkkn.native.gsk.gsk_outset_shadow_node_get_color
import org.gtkkn.native.gsk.gsk_outset_shadow_node_get_dx
import org.gtkkn.native.gsk.gsk_outset_shadow_node_get_dy
import org.gtkkn.native.gsk.gsk_outset_shadow_node_get_outline
import org.gtkkn.native.gsk.gsk_outset_shadow_node_get_spread
import org.gtkkn.native.gsk.gsk_outset_shadow_node_get_type
import org.gtkkn.native.gsk.gsk_outset_shadow_node_new
import kotlin.Float

/**
 * A render node for an outset shadow.
 */
public open class OutsetShadowNode(
    pointer: CPointer<GskOutsetShadowNode>,
) : RenderNode(pointer.reinterpret()),
    KGTyped {
    public val gskOutsetShadowNodePointer: CPointer<GskOutsetShadowNode>
        get() = gPointer.reinterpret()

    /**
     * Creates a `GskRenderNode` that will render an outset shadow
     * around the box given by @outline.
     *
     * @param outline outline of the region surrounded by shadow
     * @param color color of the shadow
     * @param dx horizontal offset of shadow
     * @param dy vertical offset of shadow
     * @param spread how far the shadow spreads towards the inside
     * @param blurRadius how much blur to apply to the shadow
     * @return A new `GskRenderNode`
     */
    public constructor(
        outline: RoundedRect,
        color: RGBA,
        dx: Float,
        dy: Float,
        spread: Float,
        blurRadius: Float,
    ) : this(
        gsk_outset_shadow_node_new(
            outline.gskRoundedRectPointer.reinterpret(),
            color.gdkRGBAPointer.reinterpret(),
            dx,
            dy,
            spread,
            blurRadius
        )!!.reinterpret()
    )

    /**
     * Retrieves the blur radius of the shadow.
     *
     * @return the blur radius, in pixels
     */
    public open fun getBlurRadius(): Float =
        gsk_outset_shadow_node_get_blur_radius(gskOutsetShadowNodePointer.reinterpret())

    /**
     * Retrieves the color of the outset shadow.
     *
     * @return a color
     */
    public open fun getColor(): RGBA =
        gsk_outset_shadow_node_get_color(gskOutsetShadowNodePointer.reinterpret())!!.run {
            RGBA(reinterpret())
        }

    /**
     * Retrieves the horizontal offset of the outset shadow.
     *
     * @return an offset, in pixels
     */
    public open fun getDx(): Float = gsk_outset_shadow_node_get_dx(gskOutsetShadowNodePointer.reinterpret())

    /**
     * Retrieves the vertical offset of the outset shadow.
     *
     * @return an offset, in pixels
     */
    public open fun getDy(): Float = gsk_outset_shadow_node_get_dy(gskOutsetShadowNodePointer.reinterpret())

    /**
     * Retrieves the outline rectangle of the outset shadow.
     *
     * @return a rounded rectangle
     */
    public open fun getOutline(): RoundedRect =
        gsk_outset_shadow_node_get_outline(gskOutsetShadowNodePointer.reinterpret())!!.run {
            RoundedRect(reinterpret())
        }

    /**
     * Retrieves how much the shadow spreads outwards.
     *
     * @return the size of the shadow, in pixels
     */
    public open fun getSpread(): Float = gsk_outset_shadow_node_get_spread(gskOutsetShadowNodePointer.reinterpret())

    public companion object : TypeCompanion<OutsetShadowNode> {
        override val type: GeneratedClassKGType<OutsetShadowNode> =
            GeneratedClassKGType(gsk_outset_shadow_node_get_type()) { OutsetShadowNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }
    }
}
