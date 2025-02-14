// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskGLShaderNode
import org.gtkkn.native.gsk.gsk_gl_shader_node_get_args
import org.gtkkn.native.gsk.gsk_gl_shader_node_get_child
import org.gtkkn.native.gsk.gsk_gl_shader_node_get_n_children
import org.gtkkn.native.gsk.gsk_gl_shader_node_get_shader
import org.gtkkn.native.gsk.gsk_gl_shader_node_get_type

/**
 * A render node using a GL shader when drawing its children nodes.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `children`: Array parameter of type RenderNode is not supported
 */
public open class GlShaderNode(public val gskGlShaderNodePointer: CPointer<GskGLShaderNode>) :
    RenderNode(gskGlShaderNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Gets args for the node.
     *
     * @return A `GBytes` with the uniform arguments
     */
    public open fun getArgs(): Bytes = gsk_gl_shader_node_get_args(gskGlShaderNodePointer.reinterpret())!!.run {
        Bytes(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Gets one of the children.
     *
     * @param idx the position of the child to get
     * @return the @idx'th child of @node
     */
    public open fun getChild(idx: guint): RenderNode =
        gsk_gl_shader_node_get_child(gskGlShaderNodePointer.reinterpret(), idx)!!.run {
            RenderNode.RenderNodeImpl(this)
        }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.16.
     *
     * GTK's new Vulkan-focused rendering
     *   does not support this feature. Use [GtkGLArea](../gtk4/class.GLArea.html)
     *   for OpenGL rendering.
     * ---
     *
     * Returns the number of children
     *
     * @return The number of children
     */
    public open fun getNChildren(): guint = gsk_gl_shader_node_get_n_children(gskGlShaderNodePointer.reinterpret())

    /**
     * Gets shader code for the node.
     *
     * @return the `GskGLShader` shader
     */
    public open fun getShader(): GlShader = gsk_gl_shader_node_get_shader(gskGlShaderNodePointer.reinterpret())!!.run {
        InstanceCache.get(this, true) { GlShader(reinterpret()) }!!
    }

    public companion object : TypeCompanion<GlShaderNode> {
        override val type: GeneratedClassKGType<GlShaderNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { GlShaderNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of GLShaderNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_gl_shader_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_gl_shader_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_gl_shader_node_get_type")
    }
}
