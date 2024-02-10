// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_blob_t

/**
 * Data type for blobs. A blob wraps a chunk of binary
 * data and facilitates its lifecycle management between
 * a client program and HarfBuzz.
 */
public class Blob(
    pointer: CPointer<hb_blob_t>,
) : Record {
    public val harfbuzzblob_tPointer: CPointer<hb_blob_t> = pointer

    public companion object : RecordCompanion<Blob, hb_blob_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Blob = Blob(pointer.reinterpret())
    }
}
