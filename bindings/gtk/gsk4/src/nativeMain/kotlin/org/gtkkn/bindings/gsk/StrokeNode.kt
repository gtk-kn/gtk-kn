// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskStrokeNode
import org.gtkkn.native.gsk.gsk_stroke_node_get_child
import org.gtkkn.native.gsk.gsk_stroke_node_get_path
import org.gtkkn.native.gsk.gsk_stroke_node_get_stroke
import org.gtkkn.native.gsk.gsk_stroke_node_get_type
import org.gtkkn.native.gsk.gsk_stroke_node_new

/**
 * A render node that will fill the area determined by stroking the the given
 * [struct@Gsk.Path] using the [struct@Gsk.Stroke] attributes.
 * @since 4.14
 */
@GskVersion4_14
public open class StrokeNode(public val gskStrokeNodePointer: CPointer<GskStrokeNode>) :
    RenderNode(gskStrokeNodePointer.reinterpret()),
    KGTyped {
    /**
     * Creates a #GskRenderNode that will fill the outline generated by stroking
     * the given @path using the attributes defined in @stroke.
     *
     * The area is filled with @child.
     *
     * @param child The node to stroke the area with
     * @param path The path describing the area to stroke
     * @param stroke The stroke attributes to use
     * @return A new #GskRenderNode
     * @since 4.14
     */
    public constructor(
        child: RenderNode,
        path: Path,
        stroke: Stroke,
    ) : this(
        gsk_stroke_node_new(child.gskRenderNodePointer, path.gskPathPointer, stroke.gskStrokePointer)!!.reinterpret()
    )

    /**
     * Gets the child node that is getting drawn by the given @node.
     *
     * @return The child that is getting drawn
     * @since 4.14
     */
    @GskVersion4_14
    public open fun getChild(): RenderNode = gsk_stroke_node_get_child(gskStrokeNodePointer.reinterpret())!!.run {
        RenderNode.RenderNodeImpl(this)
    }

    /**
     * Retrieves the path that will be stroked with the contents of
     * the @node.
     *
     * @return a #GskPath
     * @since 4.14
     */
    @GskVersion4_14
    public open fun getPath(): Path = gsk_stroke_node_get_path(gskStrokeNodePointer.reinterpret())!!.run {
        Path(this)
    }

    /**
     * Retrieves the stroke attributes used in this @node.
     *
     * @return a #GskStroke
     * @since 4.14
     */
    @GskVersion4_14
    public open fun getStroke(): Stroke = gsk_stroke_node_get_stroke(gskStrokeNodePointer.reinterpret())!!.run {
        Stroke(this)
    }

    public companion object : TypeCompanion<StrokeNode> {
        override val type: GeneratedClassKGType<StrokeNode> =
            GeneratedClassKGType(gsk_stroke_node_get_type()) { StrokeNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of StrokeNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_stroke_node_get_type()
    }
}
