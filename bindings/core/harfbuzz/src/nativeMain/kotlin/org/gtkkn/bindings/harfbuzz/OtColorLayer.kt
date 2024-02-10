// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_ot_color_layer_t
import kotlin.UInt

/**
 * Pairs of glyph and color index.
 *
 * ## Skipped during bindings generation
 *
 * - field `glyph`: codepoint_t
 *
 * @since 2.1.0
 */
public class OtColorLayer(
    pointer: CPointer<hb_ot_color_layer_t>,
) : Record {
    public val harfbuzzot_color_layer_tPointer: CPointer<hb_ot_color_layer_t> = pointer

    public var colorIndex: UInt
        get() = harfbuzzot_color_layer_tPointer.pointed.color_index
        set(`value`) {
            harfbuzzot_color_layer_tPointer.pointed.color_index = value
        }

    public companion object : RecordCompanion<OtColorLayer, hb_ot_color_layer_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): OtColorLayer =
            OtColorLayer(pointer.reinterpret())
    }
}
