// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Texture
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.bindings.gsk.annotations.GskVersion4_10
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskTextureScaleNode
import org.gtkkn.native.gsk.gsk_render_node_unref
import org.gtkkn.native.gsk.gsk_texture_scale_node_get_filter
import org.gtkkn.native.gsk.gsk_texture_scale_node_get_texture
import org.gtkkn.native.gsk.gsk_texture_scale_node_get_type
import org.gtkkn.native.gsk.gsk_texture_scale_node_new

/**
 * A render node for a `GdkTexture`.
 * @since 4.10
 */
@GskVersion4_10
public open class TextureScaleNode(public val gskTextureScaleNodePointer: CPointer<GskTextureScaleNode>) :
    RenderNode(gskTextureScaleNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Creates a node that scales the texture to the size given by the
     * bounds using the filter and then places it at the bounds' position.
     *
     * Note that further scaling and other transformations which are
     * applied to the node will apply linear filtering to the resulting
     * texture, as usual.
     *
     * This node is intended for tight control over scaling applied
     * to a texture, such as in image editors and requires the
     * application to be aware of the whole render tree as further
     * transforms may be applied that conflict with the desired effect
     * of this node.
     *
     * @param texture the texture to scale
     * @param bounds the size of the texture to scale to
     * @param filter how to scale the texture
     * @return A new `GskRenderNode`
     * @since 4.10
     */
    public constructor(
        texture: Texture,
        bounds: Rect,
        filter: ScalingFilter,
    ) : this(
        gsk_texture_scale_node_new(
            texture.gdkTexturePointer,
            bounds.grapheneRectPointer,
            filter.nativeValue
        )!!.reinterpret()
    ) {
        MemoryCleaner.setFreeFunc(this, owned = true) { gsk_render_node_unref(it.reinterpret()) }
    }

    /**
     * Retrieves the `GskScalingFilter` used when creating this `GskRenderNode`.
     *
     * @return the `GskScalingFilter`
     * @since 4.10
     */
    @GskVersion4_10
    public open fun getFilter(): ScalingFilter =
        gsk_texture_scale_node_get_filter(gskTextureScaleNodePointer.reinterpret()).run {
            ScalingFilter.fromNativeValue(this)
        }

    /**
     * Retrieves the `GdkTexture` used when creating this `GskRenderNode`.
     *
     * @return the `GdkTexture`
     * @since 4.10
     */
    @GskVersion4_10
    public open fun getTexture(): Texture =
        gsk_texture_scale_node_get_texture(gskTextureScaleNodePointer.reinterpret())!!.run {
            InstanceCache.get(this, true) { Texture.TextureImpl(reinterpret()) }!!
        }

    public companion object : TypeCompanion<TextureScaleNode> {
        override val type: GeneratedClassKGType<TextureScaleNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { TextureScaleNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of TextureScaleNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_texture_scale_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_texture_scale_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_texture_scale_node_get_type")
    }
}
