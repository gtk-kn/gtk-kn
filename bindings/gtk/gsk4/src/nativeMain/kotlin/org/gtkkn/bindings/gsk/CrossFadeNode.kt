// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskCrossFadeNode
import org.gtkkn.native.gsk.gsk_cross_fade_node_get_end_child
import org.gtkkn.native.gsk.gsk_cross_fade_node_get_progress
import org.gtkkn.native.gsk.gsk_cross_fade_node_get_start_child
import org.gtkkn.native.gsk.gsk_cross_fade_node_get_type
import org.gtkkn.native.gsk.gsk_cross_fade_node_new
import org.gtkkn.native.gsk.gsk_render_node_unref

/**
 * A render node cross fading between two child nodes.
 */
public open class CrossFadeNode(public val gskCrossFadeNodePointer: CPointer<GskCrossFadeNode>) :
    RenderNode(gskCrossFadeNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Creates a `GskRenderNode` that will do a cross-fade between @start and @end.
     *
     * @param start The start node to be drawn
     * @param end The node to be cross_fadeed onto the @start node
     * @param progress How far the fade has progressed from start to end. The value will
     *     be clamped to the range [0 ... 1]
     * @return A new `GskRenderNode`
     */
    public constructor(
        start: RenderNode,
        end: RenderNode,
        progress: gfloat,
    ) : this(gsk_cross_fade_node_new(start.gskRenderNodePointer, end.gskRenderNodePointer, progress)!!.reinterpret()) {
        MemoryCleaner.setFreeFunc(this, owned = true) { gsk_render_node_unref(it.reinterpret()) }
    }

    /**
     * Retrieves the child `GskRenderNode` at the end of the cross-fade.
     *
     * @return a `GskRenderNode`
     */
    public open fun getEndChild(): RenderNode =
        gsk_cross_fade_node_get_end_child(gskCrossFadeNodePointer.reinterpret())!!.run {
            RenderNode.RenderNodeImpl(this)
        }

    /**
     * Retrieves the progress value of the cross fade.
     *
     * @return the progress value, between 0 and 1
     */
    public open fun getProgress(): gfloat = gsk_cross_fade_node_get_progress(gskCrossFadeNodePointer.reinterpret())

    /**
     * Retrieves the child `GskRenderNode` at the beginning of the cross-fade.
     *
     * @return a `GskRenderNode`
     */
    public open fun getStartChild(): RenderNode =
        gsk_cross_fade_node_get_start_child(gskCrossFadeNodePointer.reinterpret())!!.run {
            RenderNode.RenderNodeImpl(this)
        }

    public companion object : TypeCompanion<CrossFadeNode> {
        override val type: GeneratedClassKGType<CrossFadeNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { CrossFadeNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of CrossFadeNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_cross_fade_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_cross_fade_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_cross_fade_node_get_type")
    }
}
