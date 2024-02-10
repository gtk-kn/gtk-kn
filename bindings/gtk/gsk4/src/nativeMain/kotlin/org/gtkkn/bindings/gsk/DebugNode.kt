// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskDebugNode
import org.gtkkn.native.gsk.gsk_debug_node_get_child
import org.gtkkn.native.gsk.gsk_debug_node_get_message
import org.gtkkn.native.gsk.gsk_debug_node_get_type
import kotlin.String

/**
 * A render node that emits a debugging message when drawing its
 * child node.
 *
 * ## Skipped during bindings generation
 *
 * - constructor `new`: C function gsk_debug_node_new is ignored
 */
public open class DebugNode(
    pointer: CPointer<GskDebugNode>,
) : RenderNode(pointer.reinterpret()), KGTyped {
    public val gskDebugNodePointer: CPointer<GskDebugNode>
        get() = gPointer.reinterpret()

    /**
     * Gets the child node that is getting drawn by the given @node.
     *
     * @return the child `GskRenderNode`
     */
    public open fun getChild(): RenderNode =
        gsk_debug_node_get_child(gskDebugNodePointer.reinterpret())!!.run {
            RenderNode(reinterpret())
        }

    /**
     * Gets the debug message that was set on this node
     *
     * @return The debug message
     */
    public open fun getMessage(): String =
        gsk_debug_node_get_message(gskDebugNodePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    public companion object : TypeCompanion<DebugNode> {
        override val type: GeneratedClassKGType<DebugNode> =
            GeneratedClassKGType(gsk_debug_node_get_type()) { DebugNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }
    }
}
