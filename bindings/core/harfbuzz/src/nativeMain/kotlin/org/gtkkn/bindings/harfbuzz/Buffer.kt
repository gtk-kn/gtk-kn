// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_buffer_t

/**
 * The main structure holding the input text and its properties before shaping,
 * and output glyphs and their information after shaping.
 */
public class Buffer(
    pointer: CPointer<hb_buffer_t>,
) : Record {
    public val harfbuzzbuffer_tPointer: CPointer<hb_buffer_t> = pointer

    public companion object : RecordCompanion<Buffer, hb_buffer_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Buffer = Buffer(pointer.reinterpret())
    }
}
