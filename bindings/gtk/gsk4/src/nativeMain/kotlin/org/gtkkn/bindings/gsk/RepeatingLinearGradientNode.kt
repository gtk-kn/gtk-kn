// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskRepeatingLinearGradientNode
import org.gtkkn.native.gsk.gsk_repeating_linear_gradient_node_get_type

/**
 * A render node for a repeating linear gradient.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `color_stops`: Array parameter of type ColorStop is not supported
 */
public open class RepeatingLinearGradientNode(
    public val gskRepeatingLinearGradientNodePointer: CPointer<GskRepeatingLinearGradientNode>,
) : RenderNode(gskRepeatingLinearGradientNodePointer.reinterpret()),
    KGTyped {
    public companion object : TypeCompanion<RepeatingLinearGradientNode> {
        override val type: GeneratedClassKGType<RepeatingLinearGradientNode> =
            GeneratedClassKGType(gsk_repeating_linear_gradient_node_get_type()) {
                RepeatingLinearGradientNode(it.reinterpret())
            }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of RepeatingLinearGradientNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_repeating_linear_gradient_node_get_type()
    }
}
