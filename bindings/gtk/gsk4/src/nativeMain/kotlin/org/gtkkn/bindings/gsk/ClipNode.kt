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
import org.gtkkn.native.gsk.GskClipNode
import org.gtkkn.native.gsk.gsk_clip_node_get_child
import org.gtkkn.native.gsk.gsk_clip_node_get_clip
import org.gtkkn.native.gsk.gsk_clip_node_get_type
import org.gtkkn.native.gsk.gsk_clip_node_new
import org.gtkkn.native.gsk.gsk_render_node_unref

/**
 * A render node applying a rectangular clip to its single child node.
 */
public open class ClipNode(public val gskClipNodePointer: CPointer<GskClipNode>) :
    RenderNode(gskClipNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Creates a `GskRenderNode` that will clip the @child to the area
     * given by @clip.
     *
     * @param child The node to draw
     * @param clip The clip to apply
     * @return A new `GskRenderNode`
     */
    public constructor(
        child: RenderNode,
        clip: Rect,
    ) : this(gsk_clip_node_new(child.gskRenderNodePointer, clip.grapheneRectPointer)!!.reinterpret()) {
        MemoryCleaner.setFreeFunc(this, owned = true) { gsk_render_node_unref(it.reinterpret()) }
    }

    /**
     * Gets the child node that is getting clipped by the given @node.
     *
     * @return The child that is getting clipped
     */
    public open fun getChild(): RenderNode = gsk_clip_node_get_child(gskClipNodePointer.reinterpret())!!.run {
        RenderNode.RenderNodeImpl(this)
    }

    /**
     * Retrieves the clip rectangle for @node.
     *
     * @return a clip rectangle
     */
    public open fun getClip(): Rect = gsk_clip_node_get_clip(gskClipNodePointer.reinterpret())!!.run {
        Rect(this)
    }

    public companion object : TypeCompanion<ClipNode> {
        override val type: GeneratedClassKGType<ClipNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { ClipNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of ClipNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_clip_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_clip_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_clip_node_get_type")
    }
}
