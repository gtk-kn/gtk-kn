// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_face_t

/**
 * Data type for holding font faces.
 */
public class Face(
    pointer: CPointer<hb_face_t>,
) : Record {
    public val harfbuzzface_tPointer: CPointer<hb_face_t> = pointer

    public companion object : RecordCompanion<Face, hb_face_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Face = Face(pointer.reinterpret())
    }
}
