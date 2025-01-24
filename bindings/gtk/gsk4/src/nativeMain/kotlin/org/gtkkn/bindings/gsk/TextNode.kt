// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.bindings.gsk.annotations.GskVersion4_2
import org.gtkkn.bindings.pango.Font
import org.gtkkn.bindings.pango.GlyphString
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskTextNode
import org.gtkkn.native.gsk.gsk_text_node_get_color
import org.gtkkn.native.gsk.gsk_text_node_get_font
import org.gtkkn.native.gsk.gsk_text_node_get_num_glyphs
import org.gtkkn.native.gsk.gsk_text_node_get_offset
import org.gtkkn.native.gsk.gsk_text_node_get_type
import org.gtkkn.native.gsk.gsk_text_node_has_color_glyphs
import org.gtkkn.native.gsk.gsk_text_node_new
import kotlin.Boolean

/**
 * A render node drawing a set of glyphs.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `n_glyphs`: n_glyphs: Out parameter is not supported
 */
public open class TextNode(public val gskTextNodePointer: CPointer<GskTextNode>) :
    RenderNode(gskTextNodePointer.reinterpret()),
    KGTyped {
    /**
     * Creates a render node that renders the given glyphs.
     *
     * Note that @color may not be used if the font contains
     * color glyphs.
     *
     * @param font the `PangoFont` containing the glyphs
     * @param glyphs the `PangoGlyphString` to render
     * @param color the foreground color to render with
     * @param offset offset of the baseline
     * @return a new `GskRenderNode`
     */
    public constructor(
        font: Font,
        glyphs: GlyphString,
        color: Rgba,
        offset: Point,
    ) : this(
        gsk_text_node_new(
            font.pangoFontPointer,
            glyphs.pangoGlyphStringPointer,
            color.gdkRgbaPointer,
            offset.graphenePointPointer
        )!!.reinterpret()
    )

    /**
     * Retrieves the color used by the text @node.
     *
     * @return the text color
     */
    public open fun getColor(): Rgba = gsk_text_node_get_color(gskTextNodePointer.reinterpret())!!.run {
        Rgba(this)
    }

    /**
     * Returns the font used by the text @node.
     *
     * @return the font
     */
    public open fun getFont(): Font = gsk_text_node_get_font(gskTextNodePointer.reinterpret())!!.run {
        Font.FontImpl(this)
    }

    /**
     * Retrieves the number of glyphs in the text node.
     *
     * @return the number of glyphs
     */
    public open fun getNumGlyphs(): guint = gsk_text_node_get_num_glyphs(gskTextNodePointer.reinterpret())

    /**
     * Retrieves the offset applied to the text.
     *
     * @return a point with the horizontal and vertical offsets
     */
    public open fun getOffset(): Point = gsk_text_node_get_offset(gskTextNodePointer.reinterpret())!!.run {
        Point(this)
    }

    /**
     * Checks whether the text @node has color glyphs.
     *
     * @return true if the text node has color glyphs
     * @since 4.2
     */
    @GskVersion4_2
    public open fun hasColorGlyphs(): Boolean =
        gsk_text_node_has_color_glyphs(gskTextNodePointer.reinterpret()).asBoolean()

    public companion object : TypeCompanion<TextNode> {
        override val type: GeneratedClassKGType<TextNode> =
            GeneratedClassKGType(gsk_text_node_get_type()) { TextNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of TextNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_text_node_get_type()
    }
}
