// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_font_t

public class Font(
    pointer: CPointer<hb_font_t>,
) : Record {
    public val harfbuzzfont_tPointer: CPointer<hb_font_t> = pointer

    public companion object : RecordCompanion<Font, hb_font_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Font = Font(pointer.reinterpret())
    }
}
