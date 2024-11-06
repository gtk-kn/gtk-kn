// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdkpixbuf

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdkpixbuf.annotations.GdkPixbufVersion2_2
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gdkpixbuf.GdkPixbufModulePattern
import kotlin.Int

/**
 * The signature prefix for a module.
 *
 * The signature of a module is a set of prefixes. Prefixes are encoded as
 * pairs of ordinary strings, where the second string, called the mask, if
 * not `NULL`, must be of the same length as the first one and may contain
 * ' ', '!', 'x', 'z', and 'n' to indicate bytes that must be matched,
 * not matched, "don't-care"-bytes, zeros and non-zeros, respectively.
 *
 * Each prefix has an associated integer that describes the relevance of
 * the prefix, with 0 meaning a mismatch and 100 a "perfect match".
 *
 * Starting with gdk-pixbuf 2.8, the first byte of the mask may be '*',
 * indicating an unanchored pattern that matches not only at the beginning,
 * but also in the middle. Versions prior to 2.8 will interpret the '*'
 * like an 'x'.
 *
 * The signature of a module is stored as an array of
 * `GdkPixbufModulePatterns`. The array is terminated by a pattern
 * where the `prefix` is `NULL`.
 *
 * ```c
 * GdkPixbufModulePattern *signature[] = {
 *   { "abcdx", " !x z", 100 },
 *   { "bla", NULL,  90 },
 *   { NULL, NULL, 0 }
 * };
 * ```
 *
 * In the example above, the signature matches e.g. "auud\0" with
 * relevance 100, and "blau" with relevance 90.
 *
 * ## Skipped during bindings generation
 *
 * - field `prefix`: Unsupported string type with cType: char*
 * - field `mask`: Unsupported string type with cType: char*
 *
 * @since 2.2
 */
@GdkPixbufVersion2_2
public class PixbufModulePattern(
    pointer: CPointer<GdkPixbufModulePattern>,
) : Record {
    public val gdkpixbufPixbufModulePatternPointer: CPointer<GdkPixbufModulePattern> = pointer

    /**
     * relevance of this pattern
     */
    public var relevance: Int
        get() = gdkpixbufPixbufModulePatternPointer.pointed.relevance
        set(`value`) {
            gdkpixbufPixbufModulePatternPointer.pointed.relevance = value
        }

    public companion object : RecordCompanion<PixbufModulePattern, GdkPixbufModulePattern> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): PixbufModulePattern =
            PixbufModulePattern(pointer.reinterpret())
    }
}
