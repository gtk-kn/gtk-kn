// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_unicode_funcs_t

/**
 * Data type containing a set of virtual methods used for
 * accessing various Unicode character properties.
 *
 * HarfBuzz provides a default function for each of the
 * methods in #hb_unicode_funcs_t. Client programs can implement
 * their own replacements for the individual Unicode functions, as
 * needed, and replace the default by calling the setter for a
 * method.
 */
public class UnicodeFuncs(
    pointer: CPointer<hb_unicode_funcs_t>,
) : Record {
    public val harfbuzzunicode_funcs_tPointer: CPointer<hb_unicode_funcs_t> = pointer

    public companion object : RecordCompanion<UnicodeFuncs, hb_unicode_funcs_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): UnicodeFuncs =
            UnicodeFuncs(pointer.reinterpret())
    }
}
