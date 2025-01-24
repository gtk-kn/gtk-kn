// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.gtk.TextIter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.gtksource.GtkSourceRegionIter
import org.gtkkn.native.gtksource.gtk_source_region_iter_get_subregion
import org.gtkkn.native.gtksource.gtk_source_region_iter_is_end
import org.gtkkn.native.gtksource.gtk_source_region_iter_next
import kotlin.Boolean
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * An opaque datatype.
 *
 * Ignore all its fields and initialize the iter with [method@Region.get_start_region_iter].
 */
public class RegionIter(
    public val gtksourceRegionIterPointer: CPointer<GtkSourceRegionIter>,
    cleaner: Cleaner? = null,
) : ProxyInstance(gtksourceRegionIterPointer) {
    /**
     * Allocate a new RegionIter.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GtkSourceRegionIter>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to RegionIter and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GtkSourceRegionIter>, Cleaner>,
    ) : this(gtksourceRegionIterPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new RegionIter using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GtkSourceRegionIter>().ptr)

    /**
     * Gets the subregion at this iterator.
     *
     * @param start iterator to initialize with the subregion start, or null.
     * @param end iterator to initialize with the subregion end, or null.
     * @return true if @start and @end have been set successfully (if non-null),
     *   or false if @iter is the end iterator or if the region is empty.
     */
    public fun getSubregion(start: TextIter?, end: TextIter?): Boolean = gtk_source_region_iter_get_subregion(
        gtksourceRegionIterPointer,
        start?.gtkTextIterPointer,
        end?.gtkTextIterPointer
    ).asBoolean()

    /**
     *
     *
     * @return whether @iter is the end iterator.
     */
    public fun isEnd(): Boolean = gtk_source_region_iter_is_end(gtksourceRegionIterPointer).asBoolean()

    /**
     * Moves @iter to the next subregion.
     *
     * @return true if @iter moved and is dereferenceable, or false if @iter has
     *   been set to the end iterator.
     */
    public fun next(): Boolean = gtk_source_region_iter_next(gtksourceRegionIterPointer).asBoolean()
}
