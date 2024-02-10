// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskConicGradientNode
import org.gtkkn.native.gsk.gsk_conic_gradient_node_get_angle
import org.gtkkn.native.gsk.gsk_conic_gradient_node_get_center
import org.gtkkn.native.gsk.gsk_conic_gradient_node_get_n_color_stops
import org.gtkkn.native.gsk.gsk_conic_gradient_node_get_rotation
import org.gtkkn.native.gsk.gsk_conic_gradient_node_get_type
import kotlin.Float
import kotlin.ULong

/**
 * A render node for a conic gradient.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `n_stops`: n_stops: Out parameter is not supported
 * - parameter `color_stops`: ColorStop
 */
public open class ConicGradientNode(
    pointer: CPointer<GskConicGradientNode>,
) : RenderNode(pointer.reinterpret()), KGTyped {
    public val gskConicGradientNodePointer: CPointer<GskConicGradientNode>
        get() = gPointer.reinterpret()

    /**
     * Retrieves the angle for the gradient in radians, normalized in [0, 2 * PI].
     *
     * The angle is starting at the top and going clockwise, as expressed
     * in the css specification:
     *
     *     angle = 90 - gsk_conic_gradient_node_get_rotation()
     *
     * @return the angle for the gradient
     * @since 4.2
     */
    public open fun getAngle(): Float = gsk_conic_gradient_node_get_angle(gskConicGradientNodePointer.reinterpret())

    /**
     * Retrieves the center pointer for the gradient.
     *
     * @return the center point for the gradient
     */
    public open fun getCenter(): Point =
        gsk_conic_gradient_node_get_center(gskConicGradientNodePointer.reinterpret())!!.run {
            Point(reinterpret())
        }

    /**
     * Retrieves the number of color stops in the gradient.
     *
     * @return the number of color stops
     */
    public open fun getNColorStops(): ULong =
        gsk_conic_gradient_node_get_n_color_stops(gskConicGradientNodePointer.reinterpret())

    /**
     * Retrieves the rotation for the gradient in degrees.
     *
     * @return the rotation for the gradient
     */
    public open fun getRotation(): Float =
        gsk_conic_gradient_node_get_rotation(gskConicGradientNodePointer.reinterpret())

    public companion object : TypeCompanion<ConicGradientNode> {
        override val type: GeneratedClassKGType<ConicGradientNode> =
            GeneratedClassKGType(gsk_conic_gradient_node_get_type()) {
                ConicGradientNode(it.reinterpret())
            }

        init {
            GskTypeProvider.register()
        }
    }
}
