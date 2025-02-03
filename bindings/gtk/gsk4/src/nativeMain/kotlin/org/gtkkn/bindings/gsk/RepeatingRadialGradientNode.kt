// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
    init {
        Gsk
    }

    public companion object : TypeCompanion<RepeatingRadialGradientNode> {
        override val type: GeneratedClassKGType<RepeatingRadialGradientNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { RepeatingRadialGradientNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of RepeatingRadialGradientNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_repeating_radial_gradient_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_repeating_radial_gradient_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_repeating_radial_gradient_node_get_type")
    }
}
