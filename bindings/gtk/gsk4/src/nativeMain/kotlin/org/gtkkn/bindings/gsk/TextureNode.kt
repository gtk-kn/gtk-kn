// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Texture
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskTextureNode
import org.gtkkn.native.gsk.gsk_render_node_unref
import org.gtkkn.native.gsk.gsk_texture_node_get_texture
import org.gtkkn.native.gsk.gsk_texture_node_get_type
import org.gtkkn.native.gsk.gsk_texture_node_new

/**
 * A render node for a `GdkTexture`.
 */
public open class TextureNode(public val gskTextureNodePointer: CPointer<GskTextureNode>) :
    RenderNode(gskTextureNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Creates a `GskRenderNode` that will render the given
     * @texture into the area given by @bounds.
     *
     * Note that GSK applies linear filtering when textures are
     * scaled and transformed. See [class@Gsk.TextureScaleNode]
     * for a way to influence filtering.
     *
     * @param texture the `GdkTexture`
     * @param bounds the rectangle to render the texture into
     * @return A new `GskRenderNode`
     */
    public constructor(
        texture: Texture,
        bounds: Rect,
    ) : this(gsk_texture_node_new(texture.gdkTexturePointer, bounds.grapheneRectPointer)!!.reinterpret()) {
        MemoryCleaner.setFreeFunc(this, owned = true) { gsk_render_node_unref(it.reinterpret()) }
    }

    /**
     * Retrieves the `GdkTexture` used when creating this `GskRenderNode`.
     *
     * @return the `GdkTexture`
     */
    public open fun getTexture(): Texture = gsk_texture_node_get_texture(gskTextureNodePointer.reinterpret())!!.run {
        InstanceCache.get(this, true) { Texture.TextureImpl(reinterpret()) }!!
    }

    public companion object : TypeCompanion<TextureNode> {
        override val type: GeneratedClassKGType<TextureNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { TextureNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of TextureNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_texture_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_texture_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_texture_node_get_type")
    }
}
