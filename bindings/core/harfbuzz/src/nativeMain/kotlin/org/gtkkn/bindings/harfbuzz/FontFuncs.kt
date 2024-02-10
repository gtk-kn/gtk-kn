// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_font_funcs_t

/**
 * Data type containing a set of virtual methods used for
 * working on #hb_font_t font objects.
 *
 * HarfBuzz provides a lightweight default function for each of
 * the methods in #hb_font_funcs_t. Client programs can implement
 * their own replacements for the individual font functions, as
 * needed, and replace the default by calling the setter for a
 * method.
 */
public class FontFuncs(
    pointer: CPointer<hb_font_funcs_t>,
) : Record {
    public val harfbuzzfont_funcs_tPointer: CPointer<hb_font_funcs_t> = pointer

    public companion object : RecordCompanion<FontFuncs, hb_font_funcs_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): FontFuncs = FontFuncs(pointer.reinterpret())
    }
}
