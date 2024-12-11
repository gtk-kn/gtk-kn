// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
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
public open class Coverage(pointer: CPointer<PangoCoverage>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val pangoCoveragePointer: CPointer<PangoCoverage>
        get() = gPointer.reinterpret()

    /**
     * Create a new `PangoCoverage`
     *
     * @return the newly allocated `PangoCoverage`, initialized
     *   to %PANGO_COVERAGE_NONE with a reference count of one, which
     *   should be freed with [method@Pango.Coverage.unref].
     */
    public constructor() : this(pango_coverage_new()!!.reinterpret())

    /**
     * Copy an existing `PangoCoverage`.
     *
     * @return the newly allocated `PangoCoverage`,
     *   with a reference count of one, which should be freed with
     *   [method@Pango.Coverage.unref].
     */
    public open fun copy(): Coverage = pango_coverage_copy(pangoCoveragePointer.reinterpret())!!.run {
        Coverage(reinterpret())
    }

    /**
     * Determine whether a particular index is covered by @coverage.
     *
     * @param index the index to check
     * @return the coverage level of @coverage for character @index_.
     */
    public open fun `get`(index: gint): CoverageLevel =
        pango_coverage_get(pangoCoveragePointer.reinterpret(), index).run {
            CoverageLevel.fromNativeValue(this)
        }

    /**
     * Set the coverage for each index in @coverage to be the max (better)
     * value of the current coverage for the index and the coverage for
     * the corresponding index in @other.
     *
     * @param other another `PangoCoverage`
     */
    public open fun max(other: Coverage): Unit =
        pango_coverage_max(pangoCoveragePointer.reinterpret(), other.pangoCoveragePointer.reinterpret())

    /**
     * Increase the reference count on the `PangoCoverage` by one.
     *
     * @return @coverage
     */
    override fun ref(): Coverage = pango_coverage_ref(pangoCoveragePointer.reinterpret())!!.run {
        Coverage(reinterpret())
    }

    /**
     * Modify a particular index within @coverage
     *
     * @param index the index to modify
     * @param level the new level for @index_
     */
    public open fun `set`(index: gint, level: CoverageLevel): Unit =
        pango_coverage_set(pangoCoveragePointer.reinterpret(), index, level.nativeValue)

    /**
     * Decrease the reference count on the `PangoCoverage` by one.
     *
     * If the result is zero, free the coverage and all associated memory.
     */
    override fun unref(): Unit = pango_coverage_unref(pangoCoveragePointer.reinterpret())

    public companion object : TypeCompanion<Coverage> {
        override val type: GeneratedClassKGType<Coverage> =
            GeneratedClassKGType(pango_coverage_get_type()) { Coverage(it.reinterpret()) }

        init {
            PangoTypeProvider.register()
        }

        /**
         * Get the GType of Coverage
         *
         * @return the GType
         */
        public fun getType(): GType = pango_coverage_get_type()
    }
}
