// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GString
import kotlin.ULong

/**
 * The GString struct contains the public fields of a GString.
 *
 * ## Skipped during bindings generation
 *
 * - method `append`: C function g_string_append is ignored
 * - method `append_c`: C function g_string_append_c is ignored
 * - method `append_len`: C function g_string_append_len is ignored
 * - method `append_unichar`: C function g_string_append_unichar is ignored
 * - method `append_uri_escaped`: C function g_string_append_uri_escaped is ignored
 * - method `ascii_down`: C function g_string_ascii_down is ignored
 * - method `ascii_up`: C function g_string_ascii_up is ignored
 * - method `assign`: C function g_string_assign is ignored
 * - method `down`: C function g_string_down is ignored
 * - method `equal`: C function g_string_equal is ignored
 * - method `erase`: C function g_string_erase is ignored
 * - method `free`: C function g_string_free is ignored
 * - method `free_to_bytes`: C function g_string_free_to_bytes is ignored
 * - method `hash`: C function g_string_hash is ignored
 * - method `insert`: C function g_string_insert is ignored
 * - method `insert_c`: C function g_string_insert_c is ignored
 * - method `insert_len`: C function g_string_insert_len is ignored
 * - method `insert_unichar`: C function g_string_insert_unichar is ignored
 * - method `overwrite`: C function g_string_overwrite is ignored
 * - method `overwrite_len`: C function g_string_overwrite_len is ignored
 * - method `prepend`: C function g_string_prepend is ignored
 * - method `prepend_c`: C function g_string_prepend_c is ignored
 * - method `prepend_len`: C function g_string_prepend_len is ignored
 * - method `prepend_unichar`: C function g_string_prepend_unichar is ignored
 * - method `replace`: C function g_string_replace is ignored
 * - method `set_size`: C function g_string_set_size is ignored
 * - method `truncate`: C function g_string_truncate is ignored
 * - method `up`: C function g_string_up is ignored
 * - constructor `new`: C function g_string_new is ignored
 * - constructor `new_len`: C function g_string_new_len is ignored
 * - constructor `sized_new`: C function g_string_sized_new is ignored
 */
public class String(
    pointer: CPointer<GString>,
) : Record {
    public val glibStringPointer: CPointer<GString> = pointer

    /**
     * points to the character data. It may move as text is added.
     *   The @str field is null-terminated and so
     *   can be used as an ordinary C string.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val str: kotlin.String?
        get() = glibStringPointer.pointed.str?.toKString()

    /**
     * contains the length of the string, not including the
     *   terminating nul byte.
     */
    public var len: ULong
        get() = glibStringPointer.pointed.len
        set(`value`) {
            glibStringPointer.pointed.len = value
        }

    /**
     * the number of bytes that can be stored in the
     *   string before it needs to be reallocated. May be larger than @len.
     */
    public var allocatedLen: ULong
        get() = glibStringPointer.pointed.allocated_len
        set(`value`) {
            glibStringPointer.pointed.allocated_len = value
        }

    public companion object : RecordCompanion<String, GString> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): String = String(pointer.reinterpret())
    }
}
