// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gsk.GskParseLocation
import org.gtkkn.native.gsk.gsk_serialization_error_quark
import org.gtkkn.native.gsk.gsk_value_dup_render_node
import org.gtkkn.native.gsk.gsk_value_get_render_node
import org.gtkkn.native.gsk.gsk_value_set_render_node
import org.gtkkn.native.gsk.gsk_value_take_render_node
import kotlin.UInt
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - class `NglRenderer`: Missing cType on class
 * - parameter `out_transform`: out_transform: Out parameter is not supported
 * - record `CairoRendererClass`: glib type struct are ignored
 * - record `GLRendererClass`: glib type struct are ignored
 * - record `GLShaderClass`: glib type struct are ignored
 * - record `RendererClass`: glib type struct are ignored
 */
public object Gsk {
    public fun serializationErrorQuark(): UInt = gsk_serialization_error_quark()

    /**
     * Retrieves the `GskRenderNode` stored inside the given `value`, and acquires
     * a reference to it.
     *
     * @param value a [struct@GObject.Value] initialized with type `GSK_TYPE_RENDER_NODE`
     * @return a `GskRenderNode`
     * @since 4.6
     */
    public fun valueDupRenderNode(`value`: Value): RenderNode? =
        gsk_value_dup_render_node(`value`.gobjectValuePointer)?.run {
            RenderNode(reinterpret())
        }

    /**
     * Retrieves the `GskRenderNode` stored inside the given `value`.
     *
     * @param value a `GValue` initialized with type `GSK_TYPE_RENDER_NODE`
     * @return a `GskRenderNode`
     * @since 4.6
     */
    public fun valueGetRenderNode(`value`: Value): RenderNode? =
        gsk_value_get_render_node(`value`.gobjectValuePointer)?.run {
            RenderNode(reinterpret())
        }

    /**
     * Stores the given `GskRenderNode` inside `value`.
     *
     * The [struct@GObject.Value] will acquire a reference to the `node`.
     *
     * @param value a [struct@GObject.Value] initialized with type `GSK_TYPE_RENDER_NODE`
     * @param node a `GskRenderNode`
     * @since 4.6
     */
    public fun valueSetRenderNode(
        `value`: Value,
        node: RenderNode,
    ): Unit = gsk_value_set_render_node(`value`.gobjectValuePointer, node.gPointer.reinterpret())

    /**
     * Stores the given `GskRenderNode` inside `value`.
     *
     * This function transfers the ownership of the `node` to the `GValue`.
     *
     * @param value a [struct@GObject.Value] initialized with type `GSK_TYPE_RENDER_NODE`
     * @param node a `GskRenderNode`
     * @since 4.6
     */
    public fun valueTakeRenderNode(
        `value`: Value,
        node: RenderNode? = null,
    ): Unit = gsk_value_take_render_node(`value`.gobjectValuePointer, node?.gPointer?.reinterpret())

    public fun resolveException(error: Error): GlibException {
        val ex =
            when (error.domain) {
                SerializationError.quark() ->
                    SerializationError.fromErrorOrNull(error)
                        ?.let {
                            SerializationErrorException(error, it)
                        }
                else -> null
            }
        return ex ?: GlibException(error)
    }
}

public val ParseErrorFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GskParseLocation>,
            CPointer<GskParseLocation>,
            CPointer<GError>,
        ) -> Unit
        >
    > =
    staticCFunction {
            start: CPointer<GskParseLocation>?,
            end: CPointer<GskParseLocation>?,
            error: CPointer<GError>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                start: ParseLocation,
                end: ParseLocation,
                error: Error,
            ) -> Unit
            >().get().invoke(
            start!!.run {
                ParseLocation(reinterpret())
            },
            end!!.run {
                ParseLocation(reinterpret())
            },
            error!!.run {
                Error(reinterpret())
            }
        )
    }
        .reinterpret()

/**
 * Type of callback that is called when an error occurs
 * during node deserialization.
 *
 * - param `start` start of the error location
 * - param `end` end of the error location
 * - param `error` the error
 */
public typealias ParseErrorFunc = (
    start: ParseLocation,
    end: ParseLocation,
    error: Error,
) -> Unit
