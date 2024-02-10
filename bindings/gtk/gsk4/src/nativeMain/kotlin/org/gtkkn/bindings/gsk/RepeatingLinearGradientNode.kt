// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskRepeatingLinearGradientNode
import org.gtkkn.native.gsk.gsk_repeating_linear_gradient_node_get_type

/**
 * A render node for a repeating linear gradient.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `color_stops`: ColorStop
 */
public open class RepeatingLinearGradientNode(
    pointer: CPointer<GskRepeatingLinearGradientNode>,
) : RenderNode(pointer.reinterpret()), KGTyped {
    public val gskRepeatingLinearGradientNodePointer: CPointer<GskRepeatingLinearGradientNode>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<RepeatingLinearGradientNode> {
        override val type: GeneratedClassKGType<RepeatingLinearGradientNode> =
            GeneratedClassKGType(gsk_repeating_linear_gradient_node_get_type()) {
                RepeatingLinearGradientNode(it.reinterpret())
            }

        init {
            GskTypeProvider.register()
        }
    }
}
