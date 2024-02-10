// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_glyph_info_t
import kotlin.UInt

/**
 * The #hb_glyph_info_t is the structure that holds information about the
 * glyphs and their relation to input text.
 *
 * ## Skipped during bindings generation
 *
 * - field `codepoint`: codepoint_t
 * - field `mask`: Record field mask is private
 * - field `var1`: Record field var1 is private
 * - field `var2`: Record field var2 is private
 */
public class GlyphInfo(
    pointer: CPointer<hb_glyph_info_t>,
) : Record {
    public val harfbuzzglyph_info_tPointer: CPointer<hb_glyph_info_t> = pointer

    /**
     * the index of the character in the original text that corresponds
     *           to this #hb_glyph_info_t, or whatever the client passes to
     *           hb_buffer_add(). More than one #hb_glyph_info_t can have the same
     *           @cluster value, if they resulted from the same character (e.g. one
     *           to many glyph substitution), and when more than one character gets
     *           merged in the same glyph (e.g. many to one glyph substitution) the
     *           #hb_glyph_info_t will have the smallest cluster value of them.
     *           By default some characters are merged into the same cluster
     *           (e.g. combining marks have the same cluster as their bases)
     *           even if they are separate glyphs, hb_buffer_set_cluster_level()
     *           allow selecting more fine-grained cluster handling.
     */
    public var cluster: UInt
        get() = harfbuzzglyph_info_tPointer.pointed.cluster
        set(`value`) {
            harfbuzzglyph_info_tPointer.pointed.cluster = value
        }

    public companion object : RecordCompanion<GlyphInfo, hb_glyph_info_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): GlyphInfo = GlyphInfo(pointer.reinterpret())
    }
}
