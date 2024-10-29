// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.TextIter
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtksource.GtkSourceRegionIter
import org.gtkkn.native.gtksource.gtk_source_region_iter_get_subregion
import org.gtkkn.native.gtksource.gtk_source_region_iter_is_end
import org.gtkkn.native.gtksource.gtk_source_region_iter_next
import kotlin.Boolean

/**
 * An opaque datatype.
 *
 * Ignore all its fields and initialize the iter with [method@Region.get_start_region_iter].
 *
 * ## Skipped during bindings generation
 *
 * - field `dummy1`: Record field dummy1 is private
 * - field `dummy2`: Record field dummy2 is private
 * - field `dummy3`: Record field dummy3 is private
 */
public class RegionIter(
    pointer: CPointer<GtkSourceRegionIter>,
) : Record {
    public val gtksourceRegionIterPointer: CPointer<GtkSourceRegionIter> = pointer

    /**
     * Gets the subregion at this iterator.
     *
     * @param start iterator to initialize with the subregion start, or null.
     * @param end iterator to initialize with the subregion end, or null.
     * @return true if @start and @end have been set successfully (if non-null),
     *   or false if @iter is the end iterator or if the region is empty.
     */
    public fun getSubregion(
        start: TextIter?,
        end: TextIter?,
    ): Boolean =
        gtk_source_region_iter_get_subregion(
            gtksourceRegionIterPointer.reinterpret(),
            start?.gtkTextIterPointer,
            end?.gtkTextIterPointer
        ).asBoolean()

    /**
     *
     *
     * @return whether @iter is the end iterator.
     */
    public fun isEnd(): Boolean = gtk_source_region_iter_is_end(gtksourceRegionIterPointer.reinterpret()).asBoolean()

    /**
     * Moves @iter to the next subregion.
     *
     * @return true if @iter moved and is dereferenceable, or false if @iter has
     *   been set to the end iterator.
     */
    public fun next(): Boolean = gtk_source_region_iter_next(gtksourceRegionIterPointer.reinterpret()).asBoolean()

    public companion object : RecordCompanion<RegionIter, GtkSourceRegionIter> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): RegionIter = RegionIter(pointer.reinterpret())
    }
}
