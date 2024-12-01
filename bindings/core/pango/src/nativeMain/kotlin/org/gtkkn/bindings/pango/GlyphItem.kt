// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.pango.annotations.PangoVersion1_2
import org.gtkkn.bindings.pango.annotations.PangoVersion1_20
import org.gtkkn.bindings.pango.annotations.PangoVersion1_6
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoGlyphItem
import org.gtkkn.native.pango.pango_glyph_item_apply_attrs
import org.gtkkn.native.pango.pango_glyph_item_copy
import org.gtkkn.native.pango.pango_glyph_item_free
import org.gtkkn.native.pango.pango_glyph_item_split
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * A `PangoGlyphItem` is a pair of a `PangoItem` and the glyphs
 * resulting from shaping the items text.
 *
 * As an example of the usage of `PangoGlyphItem`, the results
 * of shaping text with `PangoLayout` is a list of `PangoLayoutLine`,
 * each of which contains a list of `PangoGlyphItem`.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `logical_widths`: Array parameter of type gint is not supported
 * - parameter `log_attrs`: LogAttr
 */
public class GlyphItem(
    pointer: CPointer<PangoGlyphItem>,
) : Record {
    public val pangoGlyphItemPointer: CPointer<PangoGlyphItem> = pointer

    /**
     * corresponding `PangoItem`
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val item: Item?
        get() =
            pangoGlyphItemPointer.pointed.item?.run {
                Item(reinterpret())
            }

    /**
     * corresponding `PangoGlyphString`
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val glyphs: GlyphString?
        get() =
            pangoGlyphItemPointer.pointed.glyphs?.run {
                GlyphString(reinterpret())
            }

    /**
     * shift of the baseline, relative to the baseline
     *   of the containing line. Positive values shift upwards
     */
    public var yOffset: Int
        get() = pangoGlyphItemPointer.pointed.y_offset
        set(`value`) {
            pangoGlyphItemPointer.pointed.y_offset = value
        }

    /**
     * horizontal displacement to apply before the
     *   glyph item. Positive values shift right
     */
    public var startXOffset: Int
        get() = pangoGlyphItemPointer.pointed.start_x_offset
        set(`value`) {
            pangoGlyphItemPointer.pointed.start_x_offset = value
        }

    /**
     * horizontal displacement to apply after th
     *   glyph item. Positive values shift right
     */
    public var endXOffset: Int
        get() = pangoGlyphItemPointer.pointed.end_x_offset
        set(`value`) {
            pangoGlyphItemPointer.pointed.end_x_offset = value
        }

    /**
     * Splits a shaped item (`PangoGlyphItem`) into multiple items based
     * on an attribute list.
     *
     * The idea is that if you have attributes that don't affect shaping,
     * such as color or underline, to avoid affecting shaping, you filter
     * them out ([method@Pango.AttrList.filter]), apply the shaping process
     * and then reapply them to the result using this function.
     *
     * All attributes that start or end inside a cluster are applied
     * to that cluster; for instance, if half of a cluster is underlined
     * and the other-half strikethrough, then the cluster will end
     * up with both underline and strikethrough attributes. In these
     * cases, it may happen that @item->extra_attrs for some of the
     * result items can have multiple attributes of the same type.
     *
     * This function takes ownership of @glyph_item; it will be reused
     * as one of the elements in the list.
     *
     * @param text text that @list applies to
     * @param list a `PangoAttrList`
     * @return a
     *   list of glyph items resulting from splitting @glyph_item. Free
     *   the elements using [method@Pango.GlyphItem.free], the list using
     *   g_slist_free().
     * @since 1.2
     */
    @PangoVersion1_2
    public fun applyAttrs(
        text: String,
        list: AttrList,
    ): SList =
        pango_glyph_item_apply_attrs(
            pangoGlyphItemPointer.reinterpret(),
            text,
            list.pangoAttrListPointer.reinterpret()
        )!!.run {
            SList(reinterpret())
        }

    /**
     * Make a deep copy of an existing `PangoGlyphItem` structure.
     *
     * @return the newly allocated `PangoGlyphItem`
     * @since 1.20
     */
    @PangoVersion1_20
    public fun copy(): GlyphItem? =
        pango_glyph_item_copy(pangoGlyphItemPointer.reinterpret())?.run {
            GlyphItem(reinterpret())
        }

    /**
     * Frees a `PangoGlyphItem` and resources to which it points.
     *
     * @since 1.6
     */
    @PangoVersion1_6
    public fun free(): Unit = pango_glyph_item_free(pangoGlyphItemPointer.reinterpret())

    /**
     * Modifies @orig to cover only the text after @split_index, and
     * returns a new item that covers the text before @split_index that
     * used to be in @orig.
     *
     * You can think of @split_index as the length of the returned item.
     * @split_index may not be 0, and it may not be greater than or equal
     * to the length of @orig (that is, there must be at least one byte
     * assigned to each item, you can't create a zero-length item).
     *
     * This function is similar in function to pango_item_split() (and uses
     * it internally.)
     *
     * @param text text to which positions in @orig apply
     * @param splitIndex byte index of position to split item, relative to the
     *   start of the item
     * @return the newly allocated item
     *   representing text before @split_index, which should be freed
     *   with pango_glyph_item_free().
     * @since 1.2
     */
    @PangoVersion1_2
    public fun split(
        text: String,
        splitIndex: Int,
    ): GlyphItem? =
        pango_glyph_item_split(pangoGlyphItemPointer.reinterpret(), text, splitIndex)?.run {
            GlyphItem(reinterpret())
        }

    public companion object : RecordCompanion<GlyphItem, PangoGlyphItem> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): GlyphItem = GlyphItem(pointer.reinterpret())
    }
}
