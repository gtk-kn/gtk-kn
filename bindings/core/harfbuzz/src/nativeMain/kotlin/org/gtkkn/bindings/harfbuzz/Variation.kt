// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_variation_t
import kotlin.Float

/**
 * Data type for holding variation data. Registered OpenType
 * variation-axis tags are listed at
 * https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg
 *
 * ## Skipped during bindings generation
 *
 * - method `_string`: C function hb_variation_to_string is ignored
 * - field `tag`: tag_t
 *
 * @since 1.4.2
 */
public class Variation(
    pointer: CPointer<hb_variation_t>,
) : Record {
    public val harfbuzzvariation_tPointer: CPointer<hb_variation_t> = pointer

    /**
     * The value of the variation axis
     */
    public var `value`: Float
        get() = harfbuzzvariation_tPointer.pointed.value
        set(`value`) {
            harfbuzzvariation_tPointer.pointed.value = value
        }

    public companion object : RecordCompanion<Variation, hb_variation_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Variation = Variation(pointer.reinterpret())
    }
}
