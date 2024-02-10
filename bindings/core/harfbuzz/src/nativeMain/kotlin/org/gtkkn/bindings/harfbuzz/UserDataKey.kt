// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_user_data_key_t

/**
 * Data structure for holding user-data keys.
 *
 * ## Skipped during bindings generation
 *
 * - field `unused`: Record field unused is private
 */
public class UserDataKey(
    pointer: CPointer<hb_user_data_key_t>,
) : Record {
    public val harfbuzzuser_data_key_tPointer: CPointer<hb_user_data_key_t> = pointer

    public companion object : RecordCompanion<UserDataKey, hb_user_data_key_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): UserDataKey =
            UserDataKey(pointer.reinterpret())
    }
}
