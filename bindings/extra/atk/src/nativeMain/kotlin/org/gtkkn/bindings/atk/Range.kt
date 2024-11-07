// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.atk.annotations.AtkVersion2_12
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.atk.AtkRange
import org.gtkkn.native.atk.atk_range_copy
import org.gtkkn.native.atk.atk_range_free
import org.gtkkn.native.atk.atk_range_get_description
import org.gtkkn.native.atk.atk_range_get_lower_limit
import org.gtkkn.native.atk.atk_range_get_upper_limit
import org.gtkkn.native.atk.atk_range_new
import kotlin.Double
import kotlin.String
import kotlin.Unit

/**
 * A given range or subrange, to be used with #AtkValue
 *
 * #AtkRange are used on #AtkValue, in order to represent the full
 * range of a given component (for example an slider or a range
 * control), or to define each individual subrange this full range is
 * splitted if available. See #AtkValue documentation for further
 * details.
 */
public class Range(
    pointer: CPointer<AtkRange>,
) : Record {
    public val atkRangePointer: CPointer<AtkRange> = pointer

    /**
     * Returns a new #AtkRange that is a exact copy of @src
     *
     * @return a new #AtkRange copy of @src
     * @since 2.12
     */
    @AtkVersion2_12
    public fun copy(): Range =
        atk_range_copy(atkRangePointer.reinterpret())!!.run {
            Range(reinterpret())
        }

    /**
     * Free @range
     *
     * @since 2.12
     */
    @AtkVersion2_12
    public fun free(): Unit = atk_range_free(atkRangePointer.reinterpret())

    /**
     * Returns the human readable description of @range
     *
     * @return the human-readable description of @range
     * @since 2.12
     */
    @AtkVersion2_12
    public fun getDescription(): String =
        atk_range_get_description(atkRangePointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Returns the lower limit of @range
     *
     * @return the lower limit of @range
     * @since 2.12
     */
    @AtkVersion2_12
    public fun getLowerLimit(): Double = atk_range_get_lower_limit(atkRangePointer.reinterpret())

    /**
     * Returns the upper limit of @range
     *
     * @return the upper limit of @range
     * @since 2.12
     */
    @AtkVersion2_12
    public fun getUpperLimit(): Double = atk_range_get_upper_limit(atkRangePointer.reinterpret())

    public companion object : RecordCompanion<Range, AtkRange> {
        /**
         * Creates a new #AtkRange.
         *
         * @param lowerLimit inferior limit for this range
         * @param upperLimit superior limit for this range
         * @param description human readable description of this range.
         * @return a new #AtkRange
         * @since 2.12
         */
        public fun new(
            lowerLimit: Double,
            upperLimit: Double,
            description: String,
        ): Range = Range(atk_range_new(lowerLimit, upperLimit, description)!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Range = Range(pointer.reinterpret())
    }
}
