// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskShadowNode
import org.gtkkn.native.gsk.gsk_shadow_node_get_child
import org.gtkkn.native.gsk.gsk_shadow_node_get_n_shadows
import org.gtkkn.native.gsk.gsk_shadow_node_get_shadow
import org.gtkkn.native.gsk.gsk_shadow_node_get_type

/**
 * A render node drawing one or more shadows behind its single child node.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `shadows`: Array parameter of type Shadow is not supported
 */
public open class ShadowNode(public val gskShadowNodePointer: CPointer<GskShadowNode>) :
    RenderNode(gskShadowNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Retrieves the child `GskRenderNode` of the shadow @node.
     *
     * @return the child render node
     */
    public open fun getChild(): RenderNode = gsk_shadow_node_get_child(gskShadowNodePointer.reinterpret())!!.run {
        RenderNode.RenderNodeImpl(this)
    }

    /**
     * Retrieves the number of shadows in the @node.
     *
     * @return the number of shadows.
     */
    public open fun getNShadows(): gsize = gsk_shadow_node_get_n_shadows(gskShadowNodePointer.reinterpret())

    /**
     * Retrieves the shadow data at the given index @i.
     *
     * @param i the given index
     * @return the shadow data
     */
    public open fun getShadow(i: gsize): Shadow =
        gsk_shadow_node_get_shadow(gskShadowNodePointer.reinterpret(), i)!!.run {
            Shadow(this)
        }

    public companion object : TypeCompanion<ShadowNode> {
        override val type: GeneratedClassKGType<ShadowNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { ShadowNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of ShadowNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_shadow_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_shadow_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_shadow_node_get_type")
    }
}
