// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_map_t

/**
 * Data type for holding integer-to-integer hash maps.
 */
public class Map(
    pointer: CPointer<hb_map_t>,
) : Record {
    public val harfbuzzmap_tPointer: CPointer<hb_map_t> = pointer

    public companion object : RecordCompanion<Map, hb_map_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Map = Map(pointer.reinterpret())
    }
}
