// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.bindings.gsk.Gsk.resolveException
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gsk.GskRenderNode
import org.gtkkn.native.gsk.gsk_render_node_deserialize
import org.gtkkn.native.gsk.gsk_render_node_get_bounds
import org.gtkkn.native.gsk.gsk_render_node_get_node_type
import org.gtkkn.native.gsk.gsk_render_node_get_type
import org.gtkkn.native.gsk.gsk_render_node_ref
import org.gtkkn.native.gsk.gsk_render_node_serialize
import org.gtkkn.native.gsk.gsk_render_node_unref
import org.gtkkn.native.gsk.gsk_render_node_write_to_file
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * `GskRenderNode` is the basic block in a scene graph to be
 * rendered using [class@Gsk.Renderer].
 *
 * Each node has a parent, except the top-level node; each node may have
 * children nodes.
 *
 * Each node has an associated drawing surface, which has the size of
 * the rectangle set when creating it.
 *
 * Render nodes are meant to be transient; once they have been associated
 * to a [class@Gsk.Renderer] it's safe to release any reference you have on
 * them. All [class@Gsk.RenderNode]s are immutable, you can only specify their
 * properties during construction.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `cr`: cairo.Context
 */
public open class RenderNode(
    pointer: CPointer<GskRenderNode>,
) : KGTyped {
    public val gPointer: CPointer<GskRenderNode>

    init {
        gPointer = pointer.reinterpret()
    }

    /**
     * Retrieves the boundaries of the @node.
     *
     * The node will not draw outside of its boundaries.
     *
     * @param bounds return location for the boundaries
     */
    public open fun getBounds(bounds: Rect): Unit =
        gsk_render_node_get_bounds(gPointer.reinterpret(), bounds.grapheneRectPointer.reinterpret())

    /**
     * Returns the type of the @node.
     *
     * @return the type of the `GskRenderNode`
     */
    public open fun getNodeType(): RenderNodeType =
        gsk_render_node_get_node_type(gPointer.reinterpret()).run {
            RenderNodeType.fromNativeValue(this)
        }

    /**
     * Acquires a reference on the given `GskRenderNode`.
     *
     * @return the `GskRenderNode` with an additional reference
     */
    public open fun ref(): RenderNode =
        gsk_render_node_ref(gPointer.reinterpret())!!.run {
            RenderNode(reinterpret())
        }

    /**
     * Serializes the @node for later deserialization via
     * gsk_render_node_deserialize(). No guarantees are made about the format
     * used other than that the same version of GTK will be able to deserialize
     * the result of a call to gsk_render_node_serialize() and
     * gsk_render_node_deserialize() will correctly reject files it cannot open
     * that were created with previous versions of GTK.
     *
     * The intended use of this functions is testing, benchmarking and debugging.
     * The format is not meant as a permanent storage format.
     *
     * @return a `GBytes` representing the node.
     */
    public open fun serialize(): Bytes =
        gsk_render_node_serialize(gPointer.reinterpret())!!.run {
            Bytes(reinterpret())
        }

    /**
     * Releases a reference on the given `GskRenderNode`.
     *
     * If the reference was the last, the resources associated to the @node are
     * freed.
     */
    public open fun unref(): Unit = gsk_render_node_unref(gPointer.reinterpret())

    /**
     * This function is equivalent to calling [method@Gsk.RenderNode.serialize]
     * followed by [func@GLib.file_set_contents].
     *
     * See those two functions for details on the arguments.
     *
     * It is mostly intended for use inside a debugger to quickly dump a render
     * node to a file for later inspection.
     *
     * @param filename the file to save it to.
     * @return true if saving was successful
     */
    public open fun writeToFile(filename: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gsk_render_node_write_to_file(gPointer.reinterpret(), filename, gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    public companion object : TypeCompanion<RenderNode> {
        override val type: GeneratedClassKGType<RenderNode> =
            GeneratedClassKGType(gsk_render_node_get_type()) { RenderNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Loads data previously created via [method@Gsk.RenderNode.serialize].
         *
         * For a discussion of the supported format, see that function.
         *
         * @param bytes the bytes containing the data
         * @param errorFunc Callback on parsing errors
         * @return a new `GskRenderNode`
         */
        public fun deserialize(
            bytes: Bytes,
            errorFunc: ParseErrorFunc,
        ): RenderNode? =
            gsk_render_node_deserialize(
                bytes.glibBytesPointer.reinterpret(),
                ParseErrorFuncFunc.reinterpret(),
                StableRef.create(errorFunc).asCPointer()
            )?.run {
                RenderNode(reinterpret())
            }
    }
}
