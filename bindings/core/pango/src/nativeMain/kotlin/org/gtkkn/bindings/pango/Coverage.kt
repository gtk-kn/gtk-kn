// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoCoverage
import org.gtkkn.native.pango.pango_coverage_copy
import org.gtkkn.native.pango.pango_coverage_get
import org.gtkkn.native.pango.pango_coverage_get_type
import org.gtkkn.native.pango.pango_coverage_max
import org.gtkkn.native.pango.pango_coverage_new
import org.gtkkn.native.pango.pango_coverage_ref
import org.gtkkn.native.pango.pango_coverage_set
import org.gtkkn.native.pango.pango_coverage_unref
import kotlin.Unit

/**
 * A `PangoCoverage` structure is a map from Unicode characters
 * to [enum@Pango.CoverageLevel] values.
 *
 * It is often necessary in Pango to determine if a particular
 * font can represent a particular character, and also how well
 * it can represent that character. The `PangoCoverage` is a data
 * structure that is used to represent that information. It is an
 * opaque structure with no public fields.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `bytes`: bytes: Out parameter is not supported
 * - parameter `bytes`: Array parameter of type guint8 is not supported
 */
public open class Coverage(public val pangoCoveragePointer: CPointer<PangoCoverage>) :
    Object(pangoCoveragePointer.reinterpret()),
    KGTyped {
    init {
        Pango
    }

    /**
     * Create a new `PangoCoverage`
     *
     * @return the newly allocated `PangoCoverage`, initialized
     *   to %PANGO_COVERAGE_NONE with a reference count of one, which
     *   should be freed with [method@Pango.Coverage.unref].
     */
    public constructor() : this(pango_coverage_new()!!) {
        InstanceCache.put(this)
    }

    /**
     * Copy an existing `PangoCoverage`.
     *
     * @return the newly allocated `PangoCoverage`,
     *   with a reference count of one, which should be freed with
     *   [method@Pango.Coverage.unref].
     */
    public open fun copy(): Coverage = pango_coverage_copy(pangoCoveragePointer)!!.run {
        InstanceCache.get(this, true) { Coverage(reinterpret()) }!!
    }

    /**
     * Determine whether a particular index is covered by @coverage.
     *
     * @param index the index to check
     * @return the coverage level of @coverage for character @index_.
     */
    public open fun `get`(index: gint): CoverageLevel = pango_coverage_get(pangoCoveragePointer, index).run {
        CoverageLevel.fromNativeValue(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * This function does nothing
     * ---
     *
     * Set the coverage for each index in @coverage to be the max (better)
     * value of the current coverage for the index and the coverage for
     * the corresponding index in @other.
     *
     * @param other another `PangoCoverage`
     */
    public open fun max(other: Coverage): Unit = pango_coverage_max(pangoCoveragePointer, other.pangoCoveragePointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.52.
     *
     * Use g_object_ref instead
     * ---
     *
     * Increase the reference count on the `PangoCoverage` by one.
     *
     * @return @coverage
     */
    override fun ref(): Coverage = pango_coverage_ref(pangoCoveragePointer)!!.run {
        InstanceCache.get(this, true) { Coverage(reinterpret()) }!!
    }

    /**
     * Modify a particular index within @coverage
     *
     * @param index the index to modify
     * @param level the new level for @index_
     */
    public open fun `set`(index: gint, level: CoverageLevel): Unit =
        pango_coverage_set(pangoCoveragePointer, index, level.nativeValue)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.52.
     *
     * Use g_object_unref instead
     * ---
     *
     * Decrease the reference count on the `PangoCoverage` by one.
     *
     * If the result is zero, free the coverage and all associated memory.
     */
    override fun unref(): Unit = pango_coverage_unref(pangoCoveragePointer)

    public companion object : TypeCompanion<Coverage> {
        override val type: GeneratedClassKGType<Coverage> =
            GeneratedClassKGType(getTypeOrNull()!!) { Coverage(it.reinterpret()) }

        init {
            PangoTypeProvider.register()
        }

        /**
         * Get the GType of Coverage
         *
         * @return the GType
         */
        public fun getType(): GType = pango_coverage_get_type()

        /**
         * Gets the GType of from the symbol `pango_coverage_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("pango_coverage_get_type")
    }
}
