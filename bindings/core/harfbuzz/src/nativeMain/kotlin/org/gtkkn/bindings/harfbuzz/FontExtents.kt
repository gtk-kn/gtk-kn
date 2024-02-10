// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_font_extents_t

/**
 * Font-wide extent values, measured in font units.
 *
 * Note that typically @ascender is positive and @descender
 * negative, in coordinate systems that grow up.
 *
 * ## Skipped during bindings generation
 *
 * - field `ascender`: position_t
 * - field `descender`: position_t
 * - field `line_gap`: position_t
 * - field `reserved9`: Record field reserved9 is private
 * - field `reserved8`: Record field reserved8 is private
 * - field `reserved7`: Record field reserved7 is private
 * - field `reserved6`: Record field reserved6 is private
 * - field `reserved5`: Record field reserved5 is private
 * - field `reserved4`: Record field reserved4 is private
 * - field `reserved3`: Record field reserved3 is private
 * - field `reserved2`: Record field reserved2 is private
 * - field `reserved1`: Record field reserved1 is private
 */
public class FontExtents(
    pointer: CPointer<hb_font_extents_t>,
) : Record {
    public val harfbuzzfont_extents_tPointer: CPointer<hb_font_extents_t> = pointer

    public companion object : RecordCompanion<FontExtents, hb_font_extents_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): FontExtents =
            FontExtents(pointer.reinterpret())
    }
}
