// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.SList
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAttrList
import org.gtkkn.native.pango.pango_attr_list_change
import org.gtkkn.native.pango.pango_attr_list_copy
import org.gtkkn.native.pango.pango_attr_list_equal
import org.gtkkn.native.pango.pango_attr_list_filter
import org.gtkkn.native.pango.pango_attr_list_from_string
import org.gtkkn.native.pango.pango_attr_list_get_attributes
import org.gtkkn.native.pango.pango_attr_list_get_iterator
import org.gtkkn.native.pango.pango_attr_list_insert
import org.gtkkn.native.pango.pango_attr_list_insert_before
import org.gtkkn.native.pango.pango_attr_list_new
import org.gtkkn.native.pango.pango_attr_list_ref
import org.gtkkn.native.pango.pango_attr_list_splice
import org.gtkkn.native.pango.pango_attr_list_unref
import org.gtkkn.native.pango.pango_attr_list_update
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * A `PangoAttrList` represents a list of attributes that apply to a section
 * of text.
 *
 * The attributes in a `PangoAttrList` are, in general, allowed to overlap in
 * an arbitrary fashion. However, if the attributes are manipulated only through
 * [method@Pango.AttrList.change], the overlap between properties will meet
 * stricter criteria.
 *
 * Since the `PangoAttrList` structure is stored as a linear list, it is not
 * suitable for storing attributes for large amounts of text. In general, you
 * should not use a single `PangoAttrList` for more than one paragraph of text.
 *
 * ## Skipped during bindings generation
 *
 * - method `to_string`: C function pango_attr_list_to_string is ignored
 */
public class AttrList(
    pointer: CPointer<PangoAttrList>,
) : Record {
    public val pangoAttrListPointer: CPointer<PangoAttrList> = pointer

    /**
     * Insert the given attribute into the `PangoAttrList`.
     *
     * It will replace any attributes of the same type
     * on that segment and be merged with any adjoining
     * attributes that are identical.
     *
     * This function is slower than [method@Pango.AttrList.insert]
     * for creating an attribute list in order (potentially
     * much slower for large lists). However,
     * [method@Pango.AttrList.insert] is not suitable for
     * continually changing a set of attributes since it
     * never removes or combines existing attributes.
     *
     * @param attr the attribute to insert
     */
    public fun change(attr: Attribute): Unit =
        pango_attr_list_change(pangoAttrListPointer.reinterpret(), attr.pangoAttributePointer)

    /**
     * Copy @list and return an identical new list.
     *
     * @return the newly allocated
     *   `PangoAttrList`, with a reference count of one,
     *   which should be freed with [method@Pango.AttrList.unref].
     *   Returns null if @list was null.
     */
    public fun copy(): AttrList? =
        pango_attr_list_copy(pangoAttrListPointer.reinterpret())?.run {
            AttrList(reinterpret())
        }

    /**
     * Checks whether @list and @other_list contain the same
     * attributes and whether those attributes apply to the
     * same ranges.
     *
     * Beware that this will return wrong values if any list
     * contains duplicates.
     *
     * @param otherList the other `PangoAttrList`
     * @return true if the lists are equal, false if
     *   they aren't
     * @since 1.46
     */
    public fun equal(otherList: AttrList): Boolean =
        pango_attr_list_equal(
            pangoAttrListPointer.reinterpret(),
            otherList.pangoAttrListPointer
        ).asBoolean()

    /**
     * Given a `PangoAttrList` and callback function, removes
     * any elements of @list for which @func returns true and
     * inserts them into a new list.
     *
     * @param func callback function;
     *   returns true if an attribute should be filtered out
     * @return the new
     *   `PangoAttrList` or null if no attributes of the
     *   given types were found
     * @since 1.2
     */
    public fun filter(func: AttrFilterFunc): AttrList? =
        pango_attr_list_filter(
            pangoAttrListPointer.reinterpret(),
            AttrFilterFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )?.run {
            AttrList(reinterpret())
        }

    /**
     * Gets a list of all attributes in @list.
     *
     * @return
     *   a list of all attributes in @list. To free this value,
     *   call [method@Pango.Attribute.destroy] on each value and
     *   g_slist_free() on the list.
     * @since 1.44
     */
    public fun getAttributes(): SList =
        pango_attr_list_get_attributes(pangoAttrListPointer.reinterpret())!!.run {
            SList(reinterpret())
        }

    /**
     * Create a iterator initialized to the beginning of the list.
     *
     * @list must not be modified until this iterator is freed.
     *
     * @return the newly allocated
     *   `PangoAttrIterator`, which should be freed with
     *   [method@Pango.AttrIterator.destroy]
     */
    public fun getIterator(): AttrIterator =
        pango_attr_list_get_iterator(pangoAttrListPointer.reinterpret())!!.run {
            AttrIterator(reinterpret())
        }

    /**
     * Insert the given attribute into the `PangoAttrList`.
     *
     * It will be inserted after all other attributes with a
     * matching @start_index.
     *
     * @param attr the attribute to insert
     */
    public fun insert(attr: Attribute): Unit =
        pango_attr_list_insert(pangoAttrListPointer.reinterpret(), attr.pangoAttributePointer)

    /**
     * Insert the given attribute into the `PangoAttrList`.
     *
     * It will be inserted before all other attributes with a
     * matching @start_index.
     *
     * @param attr the attribute to insert
     */
    public fun insertBefore(attr: Attribute): Unit =
        pango_attr_list_insert_before(
            pangoAttrListPointer.reinterpret(),
            attr.pangoAttributePointer
        )

    /**
     * Increase the reference count of the given attribute
     * list by one.
     *
     * @return The attribute list passed in
     * @since 1.10
     */
    public fun ref(): AttrList =
        pango_attr_list_ref(pangoAttrListPointer.reinterpret())!!.run {
            AttrList(reinterpret())
        }

    /**
     * This function opens up a hole in @list, fills it
     * in with attributes from the left, and then merges
     * @other on top of the hole.
     *
     * This operation is equivalent to stretching every attribute
     * that applies at position @pos in @list by an amount @len,
     * and then calling [method@Pango.AttrList.change] with a copy
     * of each attribute in @other in sequence (offset in position
     * by @pos, and limited in length to @len).
     *
     * This operation proves useful for, for instance, inserting
     * a pre-edit string in the middle of an edit buffer.
     *
     * For backwards compatibility, the function behaves differently
     * when @len is 0. In this case, the attributes from @other are
     * not imited to @len, and are just overlayed on top of @list.
     *
     * This mode is useful for merging two lists of attributes together.
     *
     * @param other another `PangoAttrList`
     * @param pos the position in @list at which to insert @other
     * @param len the length of the spliced segment. (Note that this
     *   must be specified since the attributes in @other may only
     *   be present at some subsection of this range)
     */
    public fun splice(
        other: AttrList,
        pos: Int,
        len: Int,
    ): Unit =
        pango_attr_list_splice(
            pangoAttrListPointer.reinterpret(),
            other.pangoAttrListPointer,
            pos,
            len
        )

    /**
     * Decrease the reference count of the given attribute
     * list by one.
     *
     * If the result is zero, free the attribute list
     * and the attributes it contains.
     */
    public fun unref(): Unit = pango_attr_list_unref(pangoAttrListPointer.reinterpret())

    /**
     * Update indices of attributes in @list for a change in the
     * text they refer to.
     *
     * The change that this function applies is removing @remove
     * bytes at position @pos and inserting @add bytes instead.
     *
     * Attributes that fall entirely in the (@pos, @pos + @remove)
     * range are removed.
     *
     * Attributes that start or end inside the (@pos, @pos + @remove)
     * range are shortened to reflect the removal.
     *
     * Attributes start and end positions are updated if they are
     * behind @pos + @remove.
     *
     * @param pos the position of the change
     * @param remove the number of removed bytes
     * @param add the number of added bytes
     * @since 1.44
     */
    public fun update(
        pos: Int,
        remove: Int,
        add: Int,
    ): Unit = pango_attr_list_update(pangoAttrListPointer.reinterpret(), pos, remove, add)

    public companion object : RecordCompanion<AttrList, PangoAttrList> {
        /**
         * Create a new empty attribute list with a reference
         * count of one.
         *
         * @return the newly allocated
         *   `PangoAttrList`, which should be freed with
         *   [method@Pango.AttrList.unref]
         */
        public fun new(): AttrList = AttrList(pango_attr_list_new()!!.reinterpret())

        /**
         * Deserializes a `PangoAttrList` from a string.
         *
         * This is the counterpart to [method@Pango.AttrList.to_string].
         * See that functions for details about the format.
         *
         * @param text a string
         * @return a new `PangoAttrList`
         * @since 1.50
         */
        public fun fromString(text: String): AttrList? =
            pango_attr_list_from_string(text)?.run {
                AttrList(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AttrList = AttrList(pointer.reinterpret())
    }
}
