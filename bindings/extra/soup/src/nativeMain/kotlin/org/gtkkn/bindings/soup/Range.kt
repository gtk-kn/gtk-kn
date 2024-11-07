// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.soup.SoupRange
import kotlin.Long

/**
 * Represents a byte range as used in the Range header.
 *
 * If @end is non-negative, then @start and @end represent the bounds
 * of of the range, counting from 0. (Eg, the first 500 bytes would be
 * represented as @start = 0 and @end = 499.)
 *
 * If @end is -1 and @start is non-negative, then this represents a
 * range starting at @start and ending with the last byte of the
 * requested resource body. (Eg, all but the first 500 bytes would be
 * @start = 500, and @end = -1.)
 *
 * If @end is -1 and @start is negative, then it represents a "suffix
 * range", referring to the last -@start bytes of the resource body.
 * (Eg, the last 500 bytes would be @start = -500 and @end = -1.)
 */
public class Range(
    pointer: CPointer<SoupRange>,
) : Record {
    public val soupRangePointer: CPointer<SoupRange> = pointer

    /**
     * the start of the range
     */
    public var start: Long
        get() = soupRangePointer.pointed.start
        set(`value`) {
            soupRangePointer.pointed.start = value
        }

    /**
     * the end of the range
     */
    public var end: Long
        get() = soupRangePointer.pointed.end
        set(`value`) {
            soupRangePointer.pointed.end = value
        }

    public companion object : RecordCompanion<Range, SoupRange> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Range = Range(pointer.reinterpret())
    }
}
