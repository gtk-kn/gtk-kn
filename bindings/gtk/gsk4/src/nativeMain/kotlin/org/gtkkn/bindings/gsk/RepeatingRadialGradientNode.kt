// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskRepeatingRadialGradientNode
import org.gtkkn.native.gsk.gsk_repeating_radial_gradient_node_get_type

/**
 * A render node for a repeating radial gradient.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `color_stops`: ColorStop
 */
public open class RepeatingRadialGradientNode(
    pointer: CPointer<GskRepeatingRadialGradientNode>,
) : RenderNode(pointer.reinterpret()), KGTyped {
    public val gskRepeatingRadialGradientNodePointer: CPointer<GskRepeatingRadialGradientNode>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<RepeatingRadialGradientNode> {
        override val type: GeneratedClassKGType<RepeatingRadialGradientNode> =
            GeneratedClassKGType(gsk_repeating_radial_gradient_node_get_type()) {
                RepeatingRadialGradientNode(it.reinterpret())
            }

        init {
            GskTypeProvider.register()
        }
    }
}
