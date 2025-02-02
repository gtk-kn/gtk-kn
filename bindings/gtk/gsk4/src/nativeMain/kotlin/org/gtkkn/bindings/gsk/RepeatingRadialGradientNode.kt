// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskRepeatingRadialGradientNode
import org.gtkkn.native.gsk.gsk_repeating_radial_gradient_node_get_type

/**
 * A render node for a repeating radial gradient.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `color_stops`: Array parameter of type ColorStop is not supported
 */
public open class RepeatingRadialGradientNode(
    public val gskRepeatingRadialGradientNodePointer: CPointer<GskRepeatingRadialGradientNode>,
) : RenderNode(gskRepeatingRadialGradientNodePointer.reinterpret()),
    KGTyped {
    public companion object : TypeCompanion<RepeatingRadialGradientNode> {
        override val type: GeneratedClassKGType<RepeatingRadialGradientNode> =
            GeneratedClassKGType(getTypeOrNull("gsk_repeating_radial_gradient_node_get_type")!!) {
                RepeatingRadialGradientNode(it.reinterpret())
            }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of RepeatingRadialGradientNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_repeating_radial_gradient_node_get_type()
    }
}
