// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_ot_name_entry_t

/**
 * Structure representing a name ID in a particular language.
 *
 * ## Skipped during bindings generation
 *
 * - field `name_id`: ot_name_id_t
 * - field `var`: Record field var is private
 * - field `language`: language_t
 *
 * @since 2.1.0
 */
public class OtNameEntry(
    pointer: CPointer<hb_ot_name_entry_t>,
) : Record {
    public val harfbuzzot_name_entry_tPointer: CPointer<hb_ot_name_entry_t> = pointer

    public companion object : RecordCompanion<OtNameEntry, hb_ot_name_entry_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): OtNameEntry =
            OtNameEntry(pointer.reinterpret())
    }
}
