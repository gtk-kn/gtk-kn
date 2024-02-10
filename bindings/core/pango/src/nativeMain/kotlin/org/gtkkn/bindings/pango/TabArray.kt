// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoTabArray
import org.gtkkn.native.pango.pango_tab_array_copy
import org.gtkkn.native.pango.pango_tab_array_free
import org.gtkkn.native.pango.pango_tab_array_from_string
import org.gtkkn.native.pango.pango_tab_array_get_decimal_point
import org.gtkkn.native.pango.pango_tab_array_get_positions_in_pixels
import org.gtkkn.native.pango.pango_tab_array_get_size
import org.gtkkn.native.pango.pango_tab_array_new
import org.gtkkn.native.pango.pango_tab_array_resize
import org.gtkkn.native.pango.pango_tab_array_set_decimal_point
import org.gtkkn.native.pango.pango_tab_array_set_positions_in_pixels
import org.gtkkn.native.pango.pango_tab_array_set_tab
import org.gtkkn.native.pango.pango_tab_array_sort
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
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
 * - method `to_string`: C function pango_tab_array_to_string is ignored
 */
public class TabArray(
    pointer: CPointer<PangoTabArray>,
) : Record {
    public val pangoTabArrayPointer: CPointer<PangoTabArray> = pointer

    /**
     * Copies a `PangoTabArray`.
     *
     * @return the newly allocated `PangoTabArray`, which should
     *   be freed with [method@Pango.TabArray.free].
     */
    public fun copy(): TabArray =
        pango_tab_array_copy(pangoTabArrayPointer.reinterpret())!!.run {
            TabArray(reinterpret())
        }

    /**
     * Frees a tab array and associated resources.
     */
    public fun free(): Unit = pango_tab_array_free(pangoTabArrayPointer.reinterpret())

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
    public fun getDecimalPoint(tabIndex: Int): UInt =
        pango_tab_array_get_decimal_point(pangoTabArrayPointer.reinterpret(), tabIndex)

    /**
     * Returns true if the tab positions are in pixels,
     * false if they are in Pango units.
     *
     * @return whether positions are in pixels.
     */
    public fun getPositionsInPixels(): Boolean =
        pango_tab_array_get_positions_in_pixels(pangoTabArrayPointer.reinterpret()).asBoolean()

    /**
     * Gets the number of tab stops in @tab_array.
     *
     * @return the number of tab stops in the array.
     */
    public fun getSize(): Int = pango_tab_array_get_size(pangoTabArrayPointer.reinterpret())

    /**
     * Resizes a tab array.
     *
     * You must subsequently initialize any tabs
     * that were added as a result of growing the array.
     *
     * @param newSize new size of the array
     */
    public fun resize(newSize: Int): Unit = pango_tab_array_resize(pangoTabArrayPointer.reinterpret(), newSize)

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
    public fun setDecimalPoint(
        tabIndex: Int,
        decimalPoint: UInt,
    ): Unit =
        pango_tab_array_set_decimal_point(
            pangoTabArrayPointer.reinterpret(),
            tabIndex,
            decimalPoint
        )

    /**
     * Sets whether positions in this array are specified in
     * pixels.
     *
     * @param positionsInPixels whether positions are in pixels
     * @since 1.50
     */
    public fun setPositionsInPixels(positionsInPixels: Boolean): Unit =
        pango_tab_array_set_positions_in_pixels(
            pangoTabArrayPointer.reinterpret(),
            positionsInPixels.asGBoolean()
        )

    /**
     * Sets the alignment and location of a tab stop.
     *
     * @param tabIndex the index of a tab stop
     * @param alignment tab alignment
     * @param location tab location in Pango units
     */
    public fun setTab(
        tabIndex: Int,
        alignment: TabAlign,
        location: Int,
    ): Unit =
        pango_tab_array_set_tab(
            pangoTabArrayPointer.reinterpret(),
            tabIndex,
            alignment.nativeValue,
            location
        )

    /**
     * Utility function to ensure that the tab stops are in increasing order.
     *
     * @since 1.50
     */
    public fun sort(): Unit = pango_tab_array_sort(pangoTabArrayPointer.reinterpret())

    public companion object : RecordCompanion<TabArray, PangoTabArray> {
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
        public fun new(
            initialSize: Int,
            positionsInPixels: Boolean,
        ): TabArray =
            TabArray(
                pango_tab_array_new(
                    initialSize,
                    positionsInPixels.asGBoolean()
                )!!.reinterpret()
            )

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
        public fun fromString(text: String): TabArray? =
            pango_tab_array_from_string(text)?.run {
                TabArray(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TabArray = TabArray(pointer.reinterpret())
    }
}
