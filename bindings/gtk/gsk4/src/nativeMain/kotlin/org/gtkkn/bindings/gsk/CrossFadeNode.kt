// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskCrossFadeNode
import org.gtkkn.native.gsk.gsk_cross_fade_node_get_end_child
import org.gtkkn.native.gsk.gsk_cross_fade_node_get_progress
import org.gtkkn.native.gsk.gsk_cross_fade_node_get_start_child
import org.gtkkn.native.gsk.gsk_cross_fade_node_get_type
import org.gtkkn.native.gsk.gsk_cross_fade_node_new

/**
 * A render node cross fading between two child nodes.
 */
public open class CrossFadeNode(pointer: CPointer<GskCrossFadeNode>) :
    RenderNode(pointer.reinterpret()),
    KGTyped {
    public val gskCrossFadeNodePointer: CPointer<GskCrossFadeNode>
        get() = gPointer.reinterpret()

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
    ) : this(gsk_cross_fade_node_new(start.gPointer, end.gPointer, progress)!!.reinterpret())

    /**
     * Retrieves the child `GskRenderNode` at the end of the cross-fade.
     *
     * @return a `GskRenderNode`
     */
    public open fun getEndChild(): RenderNode =
        gsk_cross_fade_node_get_end_child(gskCrossFadeNodePointer.reinterpret())!!.run {
            RenderNode(this)
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
            RenderNode(this)
        }

    public companion object : TypeCompanion<CrossFadeNode> {
        override val type: GeneratedClassKGType<CrossFadeNode> =
            GeneratedClassKGType(gsk_cross_fade_node_get_type()) { CrossFadeNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of CrossFadeNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_cross_fade_node_get_type()
    }
}
