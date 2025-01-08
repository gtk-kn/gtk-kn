// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import org.gtkkn.bindings.pango.annotations.PangoVersion1_44
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoItem
import org.gtkkn.native.pango.pango_item_apply_attrs
import org.gtkkn.native.pango.pango_item_copy
import org.gtkkn.native.pango.pango_item_free
import org.gtkkn.native.pango.pango_item_get_type
import org.gtkkn.native.pango.pango_item_new
import org.gtkkn.native.pango.pango_item_split
import kotlin.String
import kotlin.Unit

/**
 * The `PangoItem` structure stores information about a segment of text.
 *
 * You typically obtain `PangoItems` by itemizing a piece of text
 * with [func@itemize].
 *
 * ## Skipped during bindings generation
 *
 * - field `analysis`: Field with not-pointer record/union PangoAnalysis is not supported
 */
public class Item(pointer: CPointer<PangoItem>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<PangoItem> = pointer

    /**
     * byte offset of the start of this item in text.
     */
    public var offset: gint
        get() = gPointer.pointed.offset

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.offset = value
        }

    /**
     * length of this item in bytes.
     */
    public var length: gint
        get() = gPointer.pointed.length

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.length = value
        }

    /**
     * number of Unicode characters in the item.
     */
    public var numChars: gint
        get() = gPointer.pointed.num_chars

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.num_chars = value
        }

    /**
     * Add attributes to a `PangoItem`.
     *
     * The idea is that you have attributes that don't affect itemization,
     * such as font features, so you filter them out using
     * [method@Pango.AttrList.filter], itemize your text, then reapply the
     * attributes to the resulting items using this function.
     *
     * The @iter should be positioned before the range of the item,
     * and will be advanced past it. This function is meant to be called
     * in a loop over the items resulting from itemization, while passing
     * the iter to each call.
     *
     * @param iter a `PangoAttrIterator`
     * @since 1.44
     */
    @PangoVersion1_44
    public fun applyAttrs(iter: AttrIterator): Unit = pango_item_apply_attrs(gPointer, iter.gPointer)

    /**
     * Copy an existing `PangoItem` structure.
     *
     * @return the newly allocated `PangoItem`
     */
    public fun copy(): Item? = pango_item_copy(gPointer)?.run {
        Item(this)
    }

    /**
     * Free a `PangoItem` and all associated memory.
     */
    public fun free(): Unit = pango_item_free(gPointer)

    /**
     * Modifies @orig to cover only the text after @split_index, and
     * returns a new item that covers the text before @split_index that
     * used to be in @orig.
     *
     * You can think of @split_index as the length of the returned item.
     * @split_index may not be 0, and it may not be greater than or equal
     * to the length of @orig (that is, there must be at least one byte
     * assigned to each item, you can't create a zero-length item).
     * @split_offset is the length of the first item in chars, and must be
     * provided because the text used to generate the item isn't available,
     * so `pango_item_split()` can't count the char length of the split items
     * itself.
     *
     * @param splitIndex byte index of position to split item, relative to the
     *   start of the item
     * @param splitOffset number of chars between start of @orig and @split_index
     * @return new item representing text before @split_index, which
     *   should be freed with [method@Pango.Item.free].
     */
    public fun split(splitIndex: gint, splitOffset: gint): Item =
        pango_item_split(gPointer, splitIndex, splitOffset)!!.run {
            Item(this)
        }

    override fun toString(): String = "Item(offset=$offset, length=$length, numChars=$numChars)"

    public companion object {
        /**
         * Creates a new `PangoItem` structure initialized to default values.
         *
         * @return the newly allocated `PangoItem`, which should
         *   be freed with [method@Pango.Item.free].
         */
        public fun new(): Item = Item(pango_item_new()!!)

        /**
         * Get the GType of Item
         *
         * @return the GType
         */
        public fun getType(): GType = pango_item_get_type()
    }
}
