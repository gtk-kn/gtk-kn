// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.pango.annotations.PangoVersion1_50
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gunichar
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoTabArray
import org.gtkkn.native.pango.pango_tab_array_copy
import org.gtkkn.native.pango.pango_tab_array_free
import org.gtkkn.native.pango.pango_tab_array_from_string
import org.gtkkn.native.pango.pango_tab_array_get_decimal_point
import org.gtkkn.native.pango.pango_tab_array_get_positions_in_pixels
import org.gtkkn.native.pango.pango_tab_array_get_size
import org.gtkkn.native.pango.pango_tab_array_get_type
import org.gtkkn.native.pango.pango_tab_array_new
import org.gtkkn.native.pango.pango_tab_array_resize
import org.gtkkn.native.pango.pango_tab_array_set_decimal_point
import org.gtkkn.native.pango.pango_tab_array_set_positions_in_pixels
import org.gtkkn.native.pango.pango_tab_array_set_tab
import org.gtkkn.native.pango.pango_tab_array_sort
import org.gtkkn.native.pango.pango_tab_array_to_string
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A `PangoTabArray` contains an array of tab stops.
 *
 * `PangoTabArray` can be used to set tab stops in a `PangoLayout`.
 * Each tab stop has an alignment, a position, and optionally
 * a character to use as decimal point.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `alignment`: alignment: Out parameter is not supported
 * - parameter `alignments`: alignments: Out parameter is not supported
 * - constructor `new_with_positions`: Varargs parameter is not supported
 */
public class TabArray(public val pangoTabArrayPointer: CPointer<PangoTabArray>) : ProxyInstance(pangoTabArrayPointer) {
    /**
     * Copies a `PangoTabArray`.
     *
     * @return the newly allocated `PangoTabArray`, which should
     *   be freed with [method@Pango.TabArray.free].
     */
    public fun copy(): TabArray = pango_tab_array_copy(pangoTabArrayPointer)!!.run {
        TabArray(this)
    }

    /**
     * Frees a tab array and associated resources.
     */
    public fun free(): Unit = pango_tab_array_free(pangoTabArrayPointer)

    /**
     * Gets the Unicode character to use as decimal point.
     *
     * This is only relevant for tabs with %PANGO_TAB_DECIMAL alignment,
     * which align content at the first occurrence of the decimal point
     * character.
     *
     * The default value of 0 means that Pango will use the
     * decimal point according to the current locale.
     *
     * @param tabIndex the index of a tab stop
     * @since 1.50
     */
    @PangoVersion1_50
    public fun getDecimalPoint(tabIndex: gint): gunichar =
        pango_tab_array_get_decimal_point(pangoTabArrayPointer, tabIndex)

    /**
     * Returns true if the tab positions are in pixels,
     * false if they are in Pango units.
     *
     * @return whether positions are in pixels.
     */
    public fun getPositionsInPixels(): Boolean =
        pango_tab_array_get_positions_in_pixels(pangoTabArrayPointer).asBoolean()

    /**
     * Gets the number of tab stops in @tab_array.
     *
     * @return the number of tab stops in the array.
     */
    public fun getSize(): gint = pango_tab_array_get_size(pangoTabArrayPointer)

    /**
     * Resizes a tab array.
     *
     * You must subsequently initialize any tabs
     * that were added as a result of growing the array.
     *
     * @param newSize new size of the array
     */
    public fun resize(newSize: gint): Unit = pango_tab_array_resize(pangoTabArrayPointer, newSize)

    /**
     * Sets the Unicode character to use as decimal point.
     *
     * This is only relevant for tabs with %PANGO_TAB_DECIMAL alignment,
     * which align content at the first occurrence of the decimal point
     * character.
     *
     * By default, Pango uses the decimal point according
     * to the current locale.
     *
     * @param tabIndex the index of a tab stop
     * @param decimalPoint the decimal point to use
     * @since 1.50
     */
    @PangoVersion1_50
    public fun setDecimalPoint(tabIndex: gint, decimalPoint: gunichar): Unit =
        pango_tab_array_set_decimal_point(pangoTabArrayPointer, tabIndex, decimalPoint)

    /**
     * Sets whether positions in this array are specified in
     * pixels.
     *
     * @param positionsInPixels whether positions are in pixels
     * @since 1.50
     */
    @PangoVersion1_50
    public fun setPositionsInPixels(positionsInPixels: Boolean): Unit =
        pango_tab_array_set_positions_in_pixels(pangoTabArrayPointer, positionsInPixels.asGBoolean())

    /**
     * Sets the alignment and location of a tab stop.
     *
     * @param tabIndex the index of a tab stop
     * @param alignment tab alignment
     * @param location tab location in Pango units
     */
    public fun setTab(tabIndex: gint, alignment: TabAlign, location: gint): Unit =
        pango_tab_array_set_tab(pangoTabArrayPointer, tabIndex, alignment.nativeValue, location)

    /**
     * Utility function to ensure that the tab stops are in increasing order.
     *
     * @since 1.50
     */
    @PangoVersion1_50
    public fun sort(): Unit = pango_tab_array_sort(pangoTabArrayPointer)

    /**
     * Serializes a `PangoTabArray` to a string.
     *
     * No guarantees are made about the format of the string,
     * it may change between Pango versions.
     *
     * The intended use of this function is testing and
     * debugging. The format is not meant as a permanent
     * storage format.
     *
     * @return a newly allocated string
     * @since 1.50
     */
    @Suppress("POTENTIALLY_NON_REPORTED_ANNOTATION")
    @PangoVersion1_50
    override fun toString(): String =
        pango_tab_array_to_string(pangoTabArrayPointer)?.toKString() ?: error("Expected not null string")

    public companion object {
        /**
         * Creates an array of @initial_size tab stops.
         *
         * Tab stops are specified in pixel units if @positions_in_pixels is true,
         * otherwise in Pango units. All stops are initially at position 0.
         *
         * @param initialSize Initial number of tab stops to allocate, can be 0
         * @param positionsInPixels whether positions are in pixel units
         * @return the newly allocated `PangoTabArray`, which should
         *   be freed with [method@Pango.TabArray.free].
         */
        public fun new(initialSize: gint, positionsInPixels: Boolean): TabArray =
            TabArray(pango_tab_array_new(initialSize, positionsInPixels.asGBoolean())!!.reinterpret())

        /**
         * Deserializes a `PangoTabArray` from a string.
         *
         * This is the counterpart to [method@Pango.TabArray.to_string].
         * See that functions for details about the format.
         *
         * @param text a string
         * @return a new `PangoTabArray`
         * @since 1.50
         */
        @PangoVersion1_50
        public fun fromString(text: String): TabArray? = pango_tab_array_from_string(text)?.run {
            TabArray(this)
        }

        /**
         * Get the GType of TabArray
         *
         * @return the GType
         */
        public fun getType(): GType = pango_tab_array_get_type()
    }
}
