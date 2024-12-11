// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.pango.annotations.PangoVersion1_2
import org.gtkkn.bindings.pango.annotations.PangoVersion1_20
import org.gtkkn.bindings.pango.annotations.PangoVersion1_6
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.pango.PangoGlyphItem
import org.gtkkn.native.pango.pango_glyph_item_apply_attrs
import org.gtkkn.native.pango.pango_glyph_item_copy
import org.gtkkn.native.pango.pango_glyph_item_free
import org.gtkkn.native.pango.pango_glyph_item_get_type
import org.gtkkn.native.pango.pango_glyph_item_split
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

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
public class GlyphItem(pointer: CPointer<PangoGlyphItem>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val pangoGlyphItemPointer: CPointer<PangoGlyphItem> = pointer

    /**
     * corresponding `PangoItem`
     */
    public var item: Item?
        get() = pangoGlyphItemPointer.pointed.item?.run {
            Item(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphItemPointer.pointed.item = value?.pangoItemPointer
        }

    /**
     * corresponding `PangoGlyphString`
     */
    public var glyphs: GlyphString?
        get() = pangoGlyphItemPointer.pointed.glyphs?.run {
            GlyphString(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphItemPointer.pointed.glyphs = value?.pangoGlyphStringPointer
        }

    /**
     * shift of the baseline, relative to the baseline
     *   of the containing line. Positive values shift upwards
     */
    public var yOffset: gint
        get() = pangoGlyphItemPointer.pointed.y_offset

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphItemPointer.pointed.y_offset = value
        }

    /**
     * horizontal displacement to apply before the
     *   glyph item. Positive values shift right
     */
    public var startXOffset: gint
        get() = pangoGlyphItemPointer.pointed.start_x_offset

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphItemPointer.pointed.start_x_offset = value
        }

    /**
     * horizontal displacement to apply after th
     *   glyph item. Positive values shift right
     */
    public var endXOffset: gint
        get() = pangoGlyphItemPointer.pointed.end_x_offset

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphItemPointer.pointed.end_x_offset = value
        }

    /**
     * Allocate a new GlyphItem.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoGlyphItem>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to GlyphItem and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoGlyphItem>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new GlyphItem using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoGlyphItem>().ptr)

    /**
     * Allocate a new GlyphItem.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param item corresponding `PangoItem`
     * @param glyphs corresponding `PangoGlyphString`
     * @param yOffset shift of the baseline, relative to the baseline
     *   of the containing line. Positive values shift upwards
     * @param startXOffset horizontal displacement to apply before the
     *   glyph item. Positive values shift right
     * @param endXOffset horizontal displacement to apply after th
     *   glyph item. Positive values shift right
     */
    public constructor(
        item: Item?,
        glyphs: GlyphString?,
        yOffset: gint,
        startXOffset: gint,
        endXOffset: gint,
    ) : this() {
        this.item = item
        this.glyphs = glyphs
        this.yOffset = yOffset
        this.startXOffset = startXOffset
        this.endXOffset = endXOffset
    }

    /**
     * Allocate a new GlyphItem using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param item corresponding `PangoItem`
     * @param glyphs corresponding `PangoGlyphString`
     * @param yOffset shift of the baseline, relative to the baseline
     *   of the containing line. Positive values shift upwards
     * @param startXOffset horizontal displacement to apply before the
     *   glyph item. Positive values shift right
     * @param endXOffset horizontal displacement to apply after th
     *   glyph item. Positive values shift right
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        item: Item?,
        glyphs: GlyphString?,
        yOffset: gint,
        startXOffset: gint,
        endXOffset: gint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.item = item
        this.glyphs = glyphs
        this.yOffset = yOffset
        this.startXOffset = startXOffset
        this.endXOffset = endXOffset
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
    public fun applyAttrs(text: String, list: AttrList): SList = pango_glyph_item_apply_attrs(
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
    public fun copy(): GlyphItem? = pango_glyph_item_copy(pangoGlyphItemPointer.reinterpret())?.run {
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
    public fun split(text: String, splitIndex: gint): GlyphItem? =
        pango_glyph_item_split(pangoGlyphItemPointer.reinterpret(), text, splitIndex)?.run {
            GlyphItem(reinterpret())
        }

    override fun toString(): String =
        "GlyphItem(item=$item, glyphs=$glyphs, yOffset=$yOffset, startXOffset=$startXOffset, endXOffset=$endXOffset)"

    public companion object {
        /**
         * Get the GType of GlyphItem
         *
         * @return the GType
         */
        public fun getType(): GType = pango_glyph_item_get_type()
    }
}
