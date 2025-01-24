// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gsk.annotations.GskVersion4_10
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskMaskNode
import org.gtkkn.native.gsk.gsk_mask_node_get_mask
import org.gtkkn.native.gsk.gsk_mask_node_get_mask_mode
import org.gtkkn.native.gsk.gsk_mask_node_get_source
import org.gtkkn.native.gsk.gsk_mask_node_get_type
import org.gtkkn.native.gsk.gsk_mask_node_new

/**
 * A render node masking one child node with another.
 * @since 4.10
 */
@GskVersion4_10
public open class MaskNode(public val gskMaskNodePointer: CPointer<GskMaskNode>) :
    RenderNode(gskMaskNodePointer.reinterpret()),
    KGTyped {
    /**
     * Creates a `GskRenderNode` that will mask a given node by another.
     *
     * The @mask_mode determines how the 'mask values' are derived from
     * the colors of the @mask. Applying the mask consists of multiplying
     * the 'mask value' with the alpha of the source.
     *
     * @param source The source node to be drawn
     * @param mask The node to be used as mask
     * @param maskMode The mask mode to use
     * @return A new `GskRenderNode`
     * @since 4.10
     */
    public constructor(
        source: RenderNode,
        mask: RenderNode,
        maskMode: MaskMode,
    ) : this(
        gsk_mask_node_new(source.gskRenderNodePointer, mask.gskRenderNodePointer, maskMode.nativeValue)!!.reinterpret()
    )

    /**
     * Retrieves the mask `GskRenderNode` child of the @node.
     *
     * @return the mask child node
     * @since 4.10
     */
    @GskVersion4_10
    public open fun getMask(): RenderNode = gsk_mask_node_get_mask(gskMaskNodePointer.reinterpret())!!.run {
        RenderNode.RenderNodeImpl(this)
    }

    /**
     * Retrieves the mask mode used by @node.
     *
     * @return the mask mode
     * @since 4.10
     */
    @GskVersion4_10
    public open fun getMaskMode(): MaskMode = gsk_mask_node_get_mask_mode(gskMaskNodePointer.reinterpret()).run {
        MaskMode.fromNativeValue(this)
    }

    /**
     * Retrieves the source `GskRenderNode` child of the @node.
     *
     * @return the source child node
     * @since 4.10
     */
    @GskVersion4_10
    public open fun getSource(): RenderNode = gsk_mask_node_get_source(gskMaskNodePointer.reinterpret())!!.run {
        RenderNode.RenderNodeImpl(this)
    }

    public companion object : TypeCompanion<MaskNode> {
        override val type: GeneratedClassKGType<MaskNode> =
            GeneratedClassKGType(gsk_mask_node_get_type()) { MaskNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of MaskNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_mask_node_get_type()
    }
}
