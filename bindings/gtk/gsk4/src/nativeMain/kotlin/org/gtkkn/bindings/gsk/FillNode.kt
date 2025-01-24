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
import org.gtkkn.native.gsk.GskFillNode
import org.gtkkn.native.gsk.gsk_fill_node_get_child
import org.gtkkn.native.gsk.gsk_fill_node_get_fill_rule
import org.gtkkn.native.gsk.gsk_fill_node_get_path
import org.gtkkn.native.gsk.gsk_fill_node_get_type
import org.gtkkn.native.gsk.gsk_fill_node_new

/**
 * A render node filling the area given by [struct@Gsk.Path]
 * and [enum@Gsk.FillRule] with the child node.
 * @since 4.14
 */
@GskVersion4_14
public open class FillNode(public val gskFillNodePointer: CPointer<GskFillNode>) :
    RenderNode(gskFillNodePointer.reinterpret()),
    KGTyped {
    /**
     * Creates a `GskRenderNode` that will fill the @child in the area
     * given by @path and @fill_rule.
     *
     * @param child The node to fill the area with
     * @param path The path describing the area to fill
     * @param fillRule The fill rule to use
     * @return A new `GskRenderNode`
     * @since 4.14
     */
    public constructor(
        child: RenderNode,
        path: Path,
        fillRule: FillRule,
    ) : this(gsk_fill_node_new(child.gskRenderNodePointer, path.gskPathPointer, fillRule.nativeValue)!!.reinterpret())

    /**
     * Gets the child node that is getting drawn by the given @node.
     *
     * @return The child that is getting drawn
     * @since 4.14
     */
    @GskVersion4_14
    public open fun getChild(): RenderNode = gsk_fill_node_get_child(gskFillNodePointer.reinterpret())!!.run {
        RenderNode.RenderNodeImpl(this)
    }

    /**
     * Retrieves the fill rule used to determine how the path is filled.
     *
     * @return a `GskFillRule`
     * @since 4.14
     */
    @GskVersion4_14
    public open fun getFillRule(): FillRule = gsk_fill_node_get_fill_rule(gskFillNodePointer.reinterpret()).run {
        FillRule.fromNativeValue(this)
    }

    /**
     * Retrieves the path used to describe the area filled with the contents of
     * the @node.
     *
     * @return a `GskPath`
     * @since 4.14
     */
    @GskVersion4_14
    public open fun getPath(): Path = gsk_fill_node_get_path(gskFillNodePointer.reinterpret())!!.run {
        Path(this)
    }

    public companion object : TypeCompanion<FillNode> {
        override val type: GeneratedClassKGType<FillNode> =
            GeneratedClassKGType(gsk_fill_node_get_type()) { FillNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of FillNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_fill_node_get_type()
    }
}
