// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskRadialGradientNode
import org.gtkkn.native.gsk.gsk_radial_gradient_node_get_center
import org.gtkkn.native.gsk.gsk_radial_gradient_node_get_end
import org.gtkkn.native.gsk.gsk_radial_gradient_node_get_hradius
import org.gtkkn.native.gsk.gsk_radial_gradient_node_get_n_color_stops
import org.gtkkn.native.gsk.gsk_radial_gradient_node_get_start
import org.gtkkn.native.gsk.gsk_radial_gradient_node_get_type
import org.gtkkn.native.gsk.gsk_radial_gradient_node_get_vradius

/**
 * A render node for a radial gradient.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `n_stops`: n_stops: Out parameter is not supported
 * - parameter `color_stops`: Array parameter of type ColorStop is not supported
 */
public open class RadialGradientNode(public val gskRadialGradientNodePointer: CPointer<GskRadialGradientNode>) :
    RenderNode(gskRadialGradientNodePointer.reinterpret()),
    KGTyped {
    /**
     * Retrieves the center pointer for the gradient.
     *
     * @return the center point for the gradient
     */
    public open fun getCenter(): Point =
        gsk_radial_gradient_node_get_center(gskRadialGradientNodePointer.reinterpret())!!.run {
            Point(this)
        }

    /**
     * Retrieves the end value for the gradient.
     *
     * @return the end value for the gradient
     */
    public open fun getEnd(): gfloat = gsk_radial_gradient_node_get_end(gskRadialGradientNodePointer.reinterpret())

    /**
     * Retrieves the horizontal radius for the gradient.
     *
     * @return the horizontal radius for the gradient
     */
    public open fun getHradius(): gfloat =
        gsk_radial_gradient_node_get_hradius(gskRadialGradientNodePointer.reinterpret())

    /**
     * Retrieves the number of color stops in the gradient.
     *
     * @return the number of color stops
     */
    public open fun getNColorStops(): gsize =
        gsk_radial_gradient_node_get_n_color_stops(gskRadialGradientNodePointer.reinterpret())

    /**
     * Retrieves the start value for the gradient.
     *
     * @return the start value for the gradient
     */
    public open fun getStart(): gfloat = gsk_radial_gradient_node_get_start(gskRadialGradientNodePointer.reinterpret())

    /**
     * Retrieves the vertical radius for the gradient.
     *
     * @return the vertical radius for the gradient
     */
    public open fun getVradius(): gfloat =
        gsk_radial_gradient_node_get_vradius(gskRadialGradientNodePointer.reinterpret())

    public companion object : TypeCompanion<RadialGradientNode> {
        override val type: GeneratedClassKGType<RadialGradientNode> =
            GeneratedClassKGType(gsk_radial_gradient_node_get_type()) { RadialGradientNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of RadialGradientNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_radial_gradient_node_get_type()
    }
}
