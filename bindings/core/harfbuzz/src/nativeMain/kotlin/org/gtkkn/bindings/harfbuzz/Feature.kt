// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_feature_t
import kotlin.UInt

/**
 * The #hb_feature_t is the structure that holds information about requested
 * feature application. The feature will be applied with the given value to all
 * glyphs which are in clusters between @start (inclusive) and @end (exclusive).
 * Setting start to @HB_FEATURE_GLOBAL_START and end to @HB_FEATURE_GLOBAL_END
 * specifies that the feature always applies to the entire buffer.
 *
 * ## Skipped during bindings generation
 *
 * - method `_string`: C function hb_feature_to_string is ignored
 * - field `tag`: tag_t
 */
public class Feature(
    pointer: CPointer<hb_feature_t>,
) : Record {
    public val harfbuzzfeature_tPointer: CPointer<hb_feature_t> = pointer

    /**
     * The value of the feature. 0 disables the feature, non-zero (usually
     * 1) enables the feature.  For features implemented as lookup type 3 (like
     * 'salt') the @value is a one based index into the alternates.
     */
    public var `value`: UInt
        get() = harfbuzzfeature_tPointer.pointed.value
        set(`value`) {
            harfbuzzfeature_tPointer.pointed.value = value
        }

    /**
     * the cluster to start applying this feature setting (inclusive).
     */
    public var start: UInt
        get() = harfbuzzfeature_tPointer.pointed.start
        set(`value`) {
            harfbuzzfeature_tPointer.pointed.start = value
        }

    /**
     * the cluster to end applying this feature setting (exclusive).
     */
    public var end: UInt
        get() = harfbuzzfeature_tPointer.pointed.end
        set(`value`) {
            harfbuzzfeature_tPointer.pointed.end = value
        }

    public companion object : RecordCompanion<Feature, hb_feature_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Feature = Feature(pointer.reinterpret())
    }
}
