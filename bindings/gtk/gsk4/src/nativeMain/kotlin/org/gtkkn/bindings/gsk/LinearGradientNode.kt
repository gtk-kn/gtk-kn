// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskLinearGradientNode
import org.gtkkn.native.gsk.gsk_linear_gradient_node_get_end
import org.gtkkn.native.gsk.gsk_linear_gradient_node_get_n_color_stops
import org.gtkkn.native.gsk.gsk_linear_gradient_node_get_start
import org.gtkkn.native.gsk.gsk_linear_gradient_node_get_type
import kotlin.ULong

/**
 * A render node for a linear gradient.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `n_stops`: n_stops: Out parameter is not supported
 * - parameter `color_stops`: ColorStop
 */
public open class LinearGradientNode(
    pointer: CPointer<GskLinearGradientNode>,
) : RenderNode(pointer.reinterpret()),
    KGTyped {
    public val gskLinearGradientNodePointer: CPointer<GskLinearGradientNode>
        get() = gPointer.reinterpret()

    /**
     * Retrieves the final point of the linear gradient.
     *
     * @return the final point
     */
    public open fun getEnd(): Point =
        gsk_linear_gradient_node_get_end(gskLinearGradientNodePointer.reinterpret())!!.run {
            Point(reinterpret())
        }

    /**
     * Retrieves the number of color stops in the gradient.
     *
     * @return the number of color stops
     */
    public open fun getNColorStops(): ULong =
        gsk_linear_gradient_node_get_n_color_stops(gskLinearGradientNodePointer.reinterpret())

    /**
     * Retrieves the initial point of the linear gradient.
     *
     * @return the initial point
     */
    public open fun getStart(): Point =
        gsk_linear_gradient_node_get_start(gskLinearGradientNodePointer.reinterpret())!!.run {
            Point(reinterpret())
        }

    public companion object : TypeCompanion<LinearGradientNode> {
        override val type: GeneratedClassKGType<LinearGradientNode> =
            GeneratedClassKGType(gsk_linear_gradient_node_get_type()) { LinearGradientNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }
    }
}
