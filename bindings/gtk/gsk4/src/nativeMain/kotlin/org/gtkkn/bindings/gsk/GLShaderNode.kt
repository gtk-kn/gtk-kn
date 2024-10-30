// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskGLShaderNode
import org.gtkkn.native.gsk.gsk_gl_shader_node_get_args
import org.gtkkn.native.gsk.gsk_gl_shader_node_get_child
import org.gtkkn.native.gsk.gsk_gl_shader_node_get_n_children
import org.gtkkn.native.gsk.gsk_gl_shader_node_get_shader
import org.gtkkn.native.gsk.gsk_gl_shader_node_get_type
import kotlin.UInt

/**
 * A render node using a GL shader when drawing its children nodes.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `children`: Array parameter of type RenderNode is not supported
 */
public open class GLShaderNode(
    pointer: CPointer<GskGLShaderNode>,
) : RenderNode(pointer.reinterpret()),
    KGTyped {
    public val gskGLShaderNodePointer: CPointer<GskGLShaderNode>
        get() = gPointer.reinterpret()

    /**
     * Gets args for the node.
     *
     * @return A `GBytes` with the uniform arguments
     */
    public open fun getArgs(): Bytes =
        gsk_gl_shader_node_get_args(gskGLShaderNodePointer.reinterpret())!!.run {
            Bytes(reinterpret())
        }

    /**
     * Gets one of the children.
     *
     * @param idx the position of the child to get
     * @return the @idx'th child of @node
     */
    public open fun getChild(idx: UInt): RenderNode =
        gsk_gl_shader_node_get_child(gskGLShaderNodePointer.reinterpret(), idx)!!.run {
            RenderNode(reinterpret())
        }

    /**
     * Returns the number of children
     *
     * @return The number of children
     */
    public open fun getNChildren(): UInt = gsk_gl_shader_node_get_n_children(gskGLShaderNodePointer.reinterpret())

    /**
     * Gets shader code for the node.
     *
     * @return the `GskGLShader` shader
     */
    public open fun getShader(): GLShader =
        gsk_gl_shader_node_get_shader(gskGLShaderNodePointer.reinterpret())!!.run {
            GLShader(reinterpret())
        }

    public companion object : TypeCompanion<GLShaderNode> {
        override val type: GeneratedClassKGType<GLShaderNode> =
            GeneratedClassKGType(gsk_gl_shader_node_get_type()) { GLShaderNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }
    }
}
