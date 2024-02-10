// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_segment_properties_t

/**
 * The structure that holds various text properties of an #hb_buffer_t. Can be
 * set and retrieved using hb_buffer_set_segment_properties() and
 * hb_buffer_get_segment_properties(), respectively.
 *
 * ## Skipped during bindings generation
 *
 * - field `language`: language_t
 * - field `reserved1`: Record field reserved1 is private
 * - field `reserved2`: Record field reserved2 is private
 */
public class SegmentProperties(
    pointer: CPointer<hb_segment_properties_t>,
) : Record {
    public val harfbuzzsegment_properties_tPointer: CPointer<hb_segment_properties_t> = pointer

    /**
     * the #hb_direction_t of the buffer, see hb_buffer_set_direction().
     */
    public var direction: Direction
        get() =
            harfbuzzsegment_properties_tPointer.pointed.direction.run {
                Direction.fromNativeValue(this)
            }
        set(`value`) {
            harfbuzzsegment_properties_tPointer.pointed.direction = value.nativeValue
        }

    /**
     * the #hb_script_t of the buffer, see hb_buffer_set_script().
     */
    public var script: Script
        get() =
            harfbuzzsegment_properties_tPointer.pointed.script.run {
                Script.fromNativeValue(this)
            }
        set(`value`) {
            harfbuzzsegment_properties_tPointer.pointed.script = value.nativeValue
        }

    public companion object : RecordCompanion<SegmentProperties, hb_segment_properties_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): SegmentProperties =
            SegmentProperties(pointer.reinterpret())
    }
}
