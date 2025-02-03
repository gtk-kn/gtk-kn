// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskSubsurfaceNode
import org.gtkkn.native.gsk.gsk_render_node_unref
import org.gtkkn.native.gsk.gsk_subsurface_node_get_child
import org.gtkkn.native.gsk.gsk_subsurface_node_get_subsurface
import org.gtkkn.native.gsk.gsk_subsurface_node_get_type
import org.gtkkn.native.gsk.gsk_subsurface_node_new

/**
 * A render node that potentially diverts a part of the scene graph to a subsurface.
 * @since 4.14
 */
@GskVersion4_14
public open class SubsurfaceNode(public val gskSubsurfaceNodePointer: CPointer<GskSubsurfaceNode>) :
    RenderNode(gskSubsurfaceNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Creates a `GskRenderNode` that will possibly divert the child
     * node to a subsurface.
     *
     * Note: Since subsurfaces are currently private, these nodes cannot
     * currently be created outside of GTK. See
     * [GtkGraphicsOffload](../gtk4/class.GraphicsOffload.html).
     *
     * @param child The child to divert to a subsurface
     * @param subsurface the subsurface to use
     * @return A new `GskRenderNode`
     * @since 4.14
     */
    public constructor(
        child: RenderNode,
        subsurface: gpointer? = null,
    ) : this(gsk_subsurface_node_new(child.gskRenderNodePointer, subsurface)!!.reinterpret()) {
        MemoryCleaner.setFreeFunc(this, owned = true) { gsk_render_node_unref(it.reinterpret()) }
    }

    /**
     * Gets the child node that is getting drawn by the given @node.
     *
     * @return the child `GskRenderNode`
     * @since 4.14
     */
    @GskVersion4_14
    public open fun getChild(): RenderNode =
        gsk_subsurface_node_get_child(gskSubsurfaceNodePointer.reinterpret())!!.run {
            RenderNode.RenderNodeImpl(this)
        }

    public companion object : TypeCompanion<SubsurfaceNode> {
        override val type: GeneratedClassKGType<SubsurfaceNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { SubsurfaceNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Gets the subsurface that was set on this node
         *
         * @param node a debug `GskRenderNode`
         * @return the subsurface
         * @since 4.14
         */
        @GskVersion4_14
        public fun getSubsurface(node: DebugNode): gpointer? =
            gsk_subsurface_node_get_subsurface(node.gskDebugNodePointer.reinterpret())

        /**
         * Get the GType of SubsurfaceNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_subsurface_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_subsurface_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_subsurface_node_get_type")
    }
}
