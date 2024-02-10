// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_set_t

/**
 * Data type for holding a set of integers. #hb_set_t's are
 * used to gather and contain glyph IDs, Unicode code
 * points, and various other collections of discrete
 * values.
 */
public class Set(
    pointer: CPointer<hb_set_t>,
) : Record {
    public val harfbuzzset_tPointer: CPointer<hb_set_t> = pointer

    public companion object : RecordCompanion<Set, hb_set_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Set = Set(pointer.reinterpret())
    }
}
