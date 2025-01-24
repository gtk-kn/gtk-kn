// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.pango.annotations.PangoVersion1_10
import org.gtkkn.bindings.pango.annotations.PangoVersion1_2
import org.gtkkn.bindings.pango.annotations.PangoVersion1_44
import org.gtkkn.bindings.pango.annotations.PangoVersion1_46
import org.gtkkn.bindings.pango.annotations.PangoVersion1_50
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoAttrList
import org.gtkkn.native.pango.pango_attr_list_change
import org.gtkkn.native.pango.pango_attr_list_copy
import org.gtkkn.native.pango.pango_attr_list_equal
import org.gtkkn.native.pango.pango_attr_list_filter
import org.gtkkn.native.pango.pango_attr_list_from_string
import org.gtkkn.native.pango.pango_attr_list_get_attributes
import org.gtkkn.native.pango.pango_attr_list_get_iterator
import org.gtkkn.native.pango.pango_attr_list_get_type
import org.gtkkn.native.pango.pango_attr_list_insert
import org.gtkkn.native.pango.pango_attr_list_insert_before
import org.gtkkn.native.pango.pango_attr_list_new
import org.gtkkn.native.pango.pango_attr_list_ref
import org.gtkkn.native.pango.pango_attr_list_splice
import org.gtkkn.native.pango.pango_attr_list_to_string
import org.gtkkn.native.pango.pango_attr_list_unref
import org.gtkkn.native.pango.pango_attr_list_update
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
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
 */
public class AttrList(public val pangoAttrListPointer: CPointer<PangoAttrList>) : ProxyInstance(pangoAttrListPointer) {
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
    public fun change(attr: Attribute): Unit = pango_attr_list_change(pangoAttrListPointer, attr.pangoAttributePointer)

    /**
     * Copy @list and return an identical new list.
     *
     * @return the newly allocated
     *   `PangoAttrList`, with a reference count of one,
     *   which should be freed with [method@Pango.AttrList.unref].
     *   Returns null if @list was null.
     */
    public fun copy(): AttrList? = pango_attr_list_copy(pangoAttrListPointer)?.run {
        AttrList(this)
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
    @PangoVersion1_46
    public fun equal(otherList: AttrList): Boolean =
        pango_attr_list_equal(pangoAttrListPointer, otherList.pangoAttrListPointer).asBoolean()

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
    @PangoVersion1_2
    public fun filter(func: AttrFilterFunc): AttrList? = pango_attr_list_filter(
        pangoAttrListPointer,
        AttrFilterFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )?.run {
        AttrList(this)
    }

    /**
     * Gets a list of all attributes in @list.
     *
     * @return a list of all attributes in @list. To free this value,
     *   call [method@Pango.Attribute.destroy] on each value and
     *   g_slist_free() on the list.
     * @since 1.44
     */
    @PangoVersion1_44
    public fun getAttributes(): SList = pango_attr_list_get_attributes(pangoAttrListPointer)!!.run {
        SList(this)
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
    public fun getIterator(): AttrIterator = pango_attr_list_get_iterator(pangoAttrListPointer)!!.run {
        AttrIterator(this)
    }

    /**
     * Insert the given attribute into the `PangoAttrList`.
     *
     * It will be inserted after all other attributes with a
     * matching @start_index.
     *
     * @param attr the attribute to insert
     */
    public fun insert(attr: Attribute): Unit = pango_attr_list_insert(pangoAttrListPointer, attr.pangoAttributePointer)

    /**
     * Insert the given attribute into the `PangoAttrList`.
     *
     * It will be inserted before all other attributes with a
     * matching @start_index.
     *
     * @param attr the attribute to insert
     */
    public fun insertBefore(attr: Attribute): Unit =
        pango_attr_list_insert_before(pangoAttrListPointer, attr.pangoAttributePointer)

    /**
     * Increase the reference count of the given attribute
     * list by one.
     *
     * @return The attribute list passed in
     * @since 1.10
     */
    @PangoVersion1_10
    public fun ref(): AttrList = pango_attr_list_ref(pangoAttrListPointer)!!.run {
        AttrList(this)
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
    public fun splice(other: AttrList, pos: gint, len: gint): Unit =
        pango_attr_list_splice(pangoAttrListPointer, other.pangoAttrListPointer, pos, len)

    /**
     * Serializes a `PangoAttrList` to a string.
     *
     * In the resulting string, serialized attributes are separated by newlines or commas.
     * Individual attributes are serialized to a string of the form
     *
     *   START END TYPE VALUE
     *
     * Where START and END are the indices (with -1 being accepted in place
     * of MAXUINT), TYPE is the nickname of the attribute value type, e.g.
     * _weight_ or _stretch_, and the value is serialized according to its type:
     *
     * - enum values as nick or numeric value
     * - boolean values as _true_ or _false_
     * - integers and floats as numbers
     * - strings as string, optionally quoted
     * - font features as quoted string
     * - PangoLanguage as string
     * - PangoFontDescription as serialized by [method@Pango.FontDescription.to_string], quoted
     * - PangoColor as serialized by [method@Pango.Color.to_string]
     *
     * Examples:
     *
     * ```
     * 0 10 foreground red, 5 15 weight bold, 0 200 font-desc "Sans 10"
     * ```
     *
     * ```
     * 0 -1 weight 700
     * 0 100 family Times
     * ```
     *
     * To parse the returned value, use [func@Pango.AttrList.from_string].
     *
     * Note that shape attributes can not be serialized.
     *
     * @return a newly allocated string
     * @since 1.50
     */
    @Suppress("POTENTIALLY_NON_REPORTED_ANNOTATION")
    @PangoVersion1_50
    override fun toString(): String =
        pango_attr_list_to_string(pangoAttrListPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Decrease the reference count of the given attribute
     * list by one.
     *
     * If the result is zero, free the attribute list
     * and the attributes it contains.
     */
    public fun unref(): Unit = pango_attr_list_unref(pangoAttrListPointer)

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
    @PangoVersion1_44
    public fun update(pos: gint, remove: gint, add: gint): Unit =
        pango_attr_list_update(pangoAttrListPointer, pos, remove, add)

    public companion object {
        /**
         * Create a new empty attribute list with a reference
         * count of one.
         *
         * @return the newly allocated
         *   `PangoAttrList`, which should be freed with
         *   [method@Pango.AttrList.unref]
         */
        public fun new(): AttrList = AttrList(pango_attr_list_new()!!)

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
        @PangoVersion1_50
        public fun fromString(text: String): AttrList? = pango_attr_list_from_string(text)?.run {
            AttrList(this)
        }

        /**
         * Get the GType of AttrList
         *
         * @return the GType
         */
        public fun getType(): GType = pango_attr_list_get_type()
    }
}
