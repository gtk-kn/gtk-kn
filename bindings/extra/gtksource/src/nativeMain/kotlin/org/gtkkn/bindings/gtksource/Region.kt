// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.TextBuffer
import org.gtkkn.bindings.gtk.TextIter
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceRegion
import org.gtkkn.native.gtksource.gtk_source_region_add_region
import org.gtkkn.native.gtksource.gtk_source_region_add_subregion
import org.gtkkn.native.gtksource.gtk_source_region_get_bounds
import org.gtkkn.native.gtksource.gtk_source_region_get_buffer
import org.gtkkn.native.gtksource.gtk_source_region_get_start_region_iter
import org.gtkkn.native.gtksource.gtk_source_region_get_type
import org.gtkkn.native.gtksource.gtk_source_region_intersect_region
import org.gtkkn.native.gtksource.gtk_source_region_intersect_subregion
import org.gtkkn.native.gtksource.gtk_source_region_is_empty
import org.gtkkn.native.gtksource.gtk_source_region_new
import org.gtkkn.native.gtksource.gtk_source_region_subtract_region
import org.gtkkn.native.gtksource.gtk_source_region_subtract_subregion
import org.gtkkn.native.gtksource.gtk_source_region_to_string
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Region utility.
 *
 * A `GtkSourceRegion` permits to store a group of subregions of a
 * [class@Gtk.TextBuffer]. `GtkSourceRegion` stores the subregions with pairs of
 * [class@Gtk.TextMark]'s, so the region is still valid after insertions and deletions
 * in the [class@Gtk.TextBuffer].
 *
 * The [class@Gtk.TextMark] for the start of a subregion has a left gravity, while the
 * [class@Gtk.TextMark] for the end of a subregion has a right gravity.
 *
 * The typical use-case of `GtkSourceRegion` is to scan a [class@Gtk.TextBuffer] chunk by
 * chunk, not the whole buffer at once to not block the user interface. The
 * `GtkSourceRegion` represents in that case the remaining region to scan. You
 * can listen to the [signal@Gtk.TextBuffer::insert-text] and
 * [signal@Gtk.TextBuffer::delete-range] signals to update the `GtkSourceRegion`
 * accordingly.
 *
 * To iterate through the subregions, you need to use a [struct@RegionIter],
 * for example:
 * ```c
 * GtkSourceRegion *region;
 * GtkSourceRegionIter region_iter;
 *
 * gtk_source_region_get_start_region_iter (region, &region_iter);
 *
 * while (!gtk_source_region_iter_is_end (&region_iter))
 * {
 *         GtkTextIter subregion_start;
 *         GtkTextIter subregion_end;
 *
 *         if (!gtk_source_region_iter_get_subregion (&region_iter,
 *                                                    &subregion_start,
 *                                                    &subregion_end))
 *         {
 *                 break;
 *         }
 *
 *         // Do something useful with the subregion.
 *
 *         gtk_source_region_iter_next (&region_iter);
 * }
 * ```
 */
public open class Region(public val gtksourceRegionPointer: CPointer<GtkSourceRegion>) :
    Object(gtksourceRegionPointer.reinterpret()),
    KGTyped {
    /**
     * The [class@Gtk.TextBuffer]. The #GtkSourceRegion has a weak reference to the
     * buffer.
     */
    public open val buffer: TextBuffer?
        /**
         *
         *
         * @return the #GtkTextBuffer.
         */
        get() = gtk_source_region_get_buffer(gtksourceRegionPointer)?.run {
            TextBuffer(this)
        }

    /**
     *
     *
     * @param buffer a #GtkTextBuffer.
     * @return a new #GtkSourceRegion object for @buffer.
     */
    public constructor(buffer: TextBuffer) : this(gtk_source_region_new(buffer.gtkTextBufferPointer)!!.reinterpret())

    /**
     * Adds @region_to_add to @region.
     *
     * @region_to_add is not modified.
     *
     * @param regionToAdd the #GtkSourceRegion to add to @region, or null.
     */
    public open fun addRegion(regionToAdd: Region? = null): Unit =
        gtk_source_region_add_region(gtksourceRegionPointer, regionToAdd?.gtksourceRegionPointer)

    /**
     * Adds the subregion delimited by @_start and @_end to @region.
     *
     * @param start the start of the subregion.
     * @param end the end of the subregion.
     */
    public open fun addSubregion(start: TextIter, end: TextIter): Unit =
        gtk_source_region_add_subregion(gtksourceRegionPointer, start.gtkTextIterPointer, end.gtkTextIterPointer)

    /**
     * Gets the @start and @end bounds of the @region.
     *
     * @param start iterator to initialize with the start of @region,
     *   or null.
     * @param end iterator to initialize with the end of @region,
     *   or null.
     * @return true if @start and @end have been set successfully (if non-null),
     *   or false if the @region is empty.
     */
    public open fun getBounds(start: TextIter?, end: TextIter?): Boolean = gtk_source_region_get_bounds(
        gtksourceRegionPointer,
        start?.gtkTextIterPointer,
        end?.gtkTextIterPointer
    ).asBoolean()

    /**
     * Initializes a [struct@RegionIter] to the first subregion of @region.
     *
     * If @region is empty, @iter will be initialized to the end iterator.
     *
     * @param iter iterator to initialize to the first subregion.
     */
    public open fun getStartRegionIter(iter: RegionIter): Unit =
        gtk_source_region_get_start_region_iter(gtksourceRegionPointer, iter.gtksourceRegionIterPointer)

    /**
     * Returns the intersection between @region1 and @region2.
     *
     * @region1 and @region2 are not modified.
     *
     * @param region2 a #GtkSourceRegion, or null.
     * @return the intersection as a #GtkSourceRegion
     *   object.
     */
    public open fun intersectRegion(region2: Region? = null): Region? =
        gtk_source_region_intersect_region(gtksourceRegionPointer, region2?.gtksourceRegionPointer)?.run {
            Region(this)
        }

    /**
     * Returns the intersection between @region and the subregion delimited by
     * @_start and @_end.
     *
     * @region is not modified.
     *
     * @param start the start of the subregion.
     * @param end the end of the subregion.
     * @return the intersection as a new
     *   #GtkSourceRegion.
     */
    public open fun intersectSubregion(start: TextIter, end: TextIter): Region? = gtk_source_region_intersect_subregion(
        gtksourceRegionPointer,
        start.gtkTextIterPointer,
        end.gtkTextIterPointer
    )?.run {
        Region(this)
    }

    /**
     * Returns whether the @region is empty.
     *
     * A null @region is considered empty.
     *
     * @return whether the @region is empty.
     */
    public open fun isEmpty(): Boolean = gtk_source_region_is_empty(gtksourceRegionPointer).asBoolean()

    /**
     * Subtracts @region_to_subtract from @region.
     *
     * @region_to_subtract is not modified.
     *
     * @param regionToSubtract the #GtkSourceRegion to subtract from
     *   @region, or null.
     */
    public open fun subtractRegion(regionToSubtract: Region? = null): Unit =
        gtk_source_region_subtract_region(gtksourceRegionPointer, regionToSubtract?.gtksourceRegionPointer)

    /**
     * Subtracts the subregion delimited by @_start and @_end from @region.
     *
     * @param start the start of the subregion.
     * @param end the end of the subregion.
     */
    public open fun subtractSubregion(start: TextIter, end: TextIter): Unit =
        gtk_source_region_subtract_subregion(gtksourceRegionPointer, start.gtkTextIterPointer, end.gtkTextIterPointer)

    /**
     * Gets a string represention of @region, for debugging purposes.
     *
     * The returned string contains the character offsets of the subregions. It
     * doesn't include a newline character at the end of the string.
     *
     * @return a string represention of @region. Free
     *   with g_free() when no longer needed.
     */
    public open fun toStringRegion(): String? = gtk_source_region_to_string(gtksourceRegionPointer)?.toKString()

    public companion object : TypeCompanion<Region> {
        override val type: GeneratedClassKGType<Region> =
            GeneratedClassKGType(gtk_source_region_get_type()) { Region(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of Region
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_region_get_type()
    }
}
