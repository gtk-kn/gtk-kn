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

/**
 * The `PangoAnalysis` structure stores information about
 * the properties of a segment of text.
 *
 * ## Skipped during bindings generation
 *
 * - field `shape_engine`: gpointer
 * - field `lang_engine`: gpointer
 * - field `level`: guint8
 * - field `gravity`: guint8
 * - field `flags`: guint8
 * - field `script`: guint8
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
