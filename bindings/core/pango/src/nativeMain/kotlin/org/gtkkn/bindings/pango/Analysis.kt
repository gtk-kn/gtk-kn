// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.SList
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAnalysis
import kotlin.UByte

/**
 * The `PangoAnalysis` structure stores information about
 * the properties of a segment of text.
 *
 * ## Skipped during bindings generation
 *
 * - field `shape_engine`: gpointer
 * - field `lang_engine`: gpointer
 */
public class Analysis(
    pointer: CPointer<PangoAnalysis>,
) : Record {
    public val pangoAnalysisPointer: CPointer<PangoAnalysis> = pointer

    /**
     * the font for this segment.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val font: Font?
        get() =
            pangoAnalysisPointer.pointed.font?.run {
                Font(reinterpret())
            }

    /**
     * the bidirectional level for this segment.
     */
    public var level: UByte
        get() = pangoAnalysisPointer.pointed.level
        set(`value`) {
            pangoAnalysisPointer.pointed.level = value
        }

    /**
     * the glyph orientation for this segment (A `PangoGravity`).
     */
    public var gravity: UByte
        get() = pangoAnalysisPointer.pointed.gravity
        set(`value`) {
            pangoAnalysisPointer.pointed.gravity = value
        }

    /**
     * boolean flags for this segment (Since: 1.16).
     */
    public var flags: UByte
        get() = pangoAnalysisPointer.pointed.flags
        set(`value`) {
            pangoAnalysisPointer.pointed.flags = value
        }

    /**
     * the detected script for this segment (A `PangoScript`) (Since: 1.18).
     */
    public var script: UByte
        get() = pangoAnalysisPointer.pointed.script
        set(`value`) {
            pangoAnalysisPointer.pointed.script = value
        }

    /**
     * the detected language for this segment.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val language: Language?
        get() =
            pangoAnalysisPointer.pointed.language?.run {
                Language(reinterpret())
            }

    /**
     * extra attributes for this segment.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val extraAttrs: SList?
        get() =
            pangoAnalysisPointer.pointed.extra_attrs?.run {
                SList(reinterpret())
            }

    public companion object : RecordCompanion<Analysis, PangoAnalysis> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Analysis = Analysis(pointer.reinterpret())
    }
}
