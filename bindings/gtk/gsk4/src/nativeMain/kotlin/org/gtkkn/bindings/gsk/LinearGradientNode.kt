// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskLinearGradientNode
import org.gtkkn.native.gsk.gsk_linear_gradient_node_get_end
import org.gtkkn.native.gsk.gsk_linear_gradient_node_get_n_color_stops
import org.gtkkn.native.gsk.gsk_linear_gradient_node_get_start
import org.gtkkn.native.gsk.gsk_linear_gradient_node_get_type

/**
 * A render node for a linear gradient.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `n_stops`: n_stops: Out parameter is not supported
 * - parameter `color_stops`: Array parameter of type ColorStop is not supported
 */
public open class LinearGradientNode(public val gskLinearGradientNodePointer: CPointer<GskLinearGradientNode>) :
    RenderNode(gskLinearGradientNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Retrieves the final point of the linear gradient.
     *
     * @return the final point
     */
    public open fun getEnd(): Point =
        gsk_linear_gradient_node_get_end(gskLinearGradientNodePointer.reinterpret())!!.run {
            Point(this)
        }

    /**
     * Retrieves the number of color stops in the gradient.
     *
     * @return the number of color stops
     */
    public open fun getNColorStops(): gsize =
        gsk_linear_gradient_node_get_n_color_stops(gskLinearGradientNodePointer.reinterpret())

    /**
     * Retrieves the initial point of the linear gradient.
     *
     * @return the initial point
     */
    public open fun getStart(): Point =
        gsk_linear_gradient_node_get_start(gskLinearGradientNodePointer.reinterpret())!!.run {
            Point(this)
        }

    public companion object : TypeCompanion<LinearGradientNode> {
        override val type: GeneratedClassKGType<LinearGradientNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { LinearGradientNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of LinearGradientNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_linear_gradient_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_linear_gradient_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_linear_gradient_node_get_type")
    }
}
