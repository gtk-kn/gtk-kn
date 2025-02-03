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
    init {
        Gsk
    }

    public companion object : TypeCompanion<RepeatingLinearGradientNode> {
        override val type: GeneratedClassKGType<RepeatingLinearGradientNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { RepeatingLinearGradientNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of RepeatingLinearGradientNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_repeating_linear_gradient_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_repeating_linear_gradient_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_repeating_linear_gradient_node_get_type")
    }
}
