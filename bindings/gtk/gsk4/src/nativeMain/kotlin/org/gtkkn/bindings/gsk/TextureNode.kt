// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Texture
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskTextureNode
import org.gtkkn.native.gsk.gsk_texture_node_get_texture
import org.gtkkn.native.gsk.gsk_texture_node_get_type
import org.gtkkn.native.gsk.gsk_texture_node_new

/**
 * A render node for a `GdkTexture`.
 */
public open class TextureNode(
    pointer: CPointer<GskTextureNode>,
) : RenderNode(pointer.reinterpret()), KGTyped {
    public val gskTextureNodePointer: CPointer<GskTextureNode>
        get() = gPointer.reinterpret()

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
    public constructor(texture: Texture, bounds: Rect) :
        this(
            gsk_texture_node_new(
                texture.gdkTexturePointer.reinterpret(),
                bounds.grapheneRectPointer
            )!!.reinterpret()
        )

    /**
     * Retrieves the `GdkTexture` used when creating this `GskRenderNode`.
     *
     * @return the `GdkTexture`
     */
    public open fun getTexture(): Texture =
        gsk_texture_node_get_texture(gskTextureNodePointer.reinterpret())!!.run {
            Texture(reinterpret())
        }

    public companion object : TypeCompanion<TextureNode> {
        override val type: GeneratedClassKGType<TextureNode> =
            GeneratedClassKGType(gsk_texture_node_get_type()) { TextureNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }
    }
}
