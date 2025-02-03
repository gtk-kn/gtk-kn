// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskRepeatNode
import org.gtkkn.native.gsk.gsk_render_node_unref
import org.gtkkn.native.gsk.gsk_repeat_node_get_child
import org.gtkkn.native.gsk.gsk_repeat_node_get_child_bounds
import org.gtkkn.native.gsk.gsk_repeat_node_get_type
import org.gtkkn.native.gsk.gsk_repeat_node_new

/**
 * A render node repeating its single child node.
 */
public open class RepeatNode(public val gskRepeatNodePointer: CPointer<GskRepeatNode>) :
    RenderNode(gskRepeatNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Creates a `GskRenderNode` that will repeat the drawing of @child across
     * the given @bounds.
     *
     * @param bounds The bounds of the area to be painted
     * @param child The child to repeat
     * @param childBounds The area of the child to repeat or null to
     *     use the child's bounds
     * @return A new `GskRenderNode`
     */
    public constructor(
        bounds: Rect,
        child: RenderNode,
        childBounds: Rect? = null,
    ) : this(
        gsk_repeat_node_new(
            bounds.grapheneRectPointer,
            child.gskRenderNodePointer,
            childBounds?.grapheneRectPointer
        )!!.reinterpret()
    ) {
        MemoryCleaner.setFreeFunc(this, owned = true) { gsk_render_node_unref(it.reinterpret()) }
    }

    /**
     * Retrieves the child of @node.
     *
     * @return a `GskRenderNode`
     */
    public open fun getChild(): RenderNode = gsk_repeat_node_get_child(gskRepeatNodePointer.reinterpret())!!.run {
        RenderNode.RenderNodeImpl(this)
    }

    /**
     * Retrieves the bounding rectangle of the child of @node.
     *
     * @return a bounding rectangle
     */
    public open fun getChildBounds(): Rect =
        gsk_repeat_node_get_child_bounds(gskRepeatNodePointer.reinterpret())!!.run {
            Rect(this)
        }

    public companion object : TypeCompanion<RepeatNode> {
        override val type: GeneratedClassKGType<RepeatNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { RepeatNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of RepeatNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_repeat_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_repeat_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_repeat_node_get_type")
    }
}
