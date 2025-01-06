// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.bindings.cairo.annotations.CairoVersion1_10
import org.gtkkn.native.cairo.cairo_pdf_version_t

/**
 *
 * @since 1.10
 */
@CairoVersion1_10
public enum class PdfVersion(public val nativeValue: cairo_pdf_version_t) {
    VERSION_1_4(cairo_pdf_version_t.CAIRO_PDF_VERSION_1_4),
    VERSION_1_5(cairo_pdf_version_t.CAIRO_PDF_VERSION_1_5),
    VERSION_1_6(cairo_pdf_version_t.CAIRO_PDF_VERSION_1_6),
    VERSION_1_7(cairo_pdf_version_t.CAIRO_PDF_VERSION_1_7),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_pdf_version_t): PdfVersion = when (nativeValue) {
            cairo_pdf_version_t.CAIRO_PDF_VERSION_1_4 -> VERSION_1_4
            cairo_pdf_version_t.CAIRO_PDF_VERSION_1_5 -> VERSION_1_5
            cairo_pdf_version_t.CAIRO_PDF_VERSION_1_6 -> VERSION_1_6
            cairo_pdf_version_t.CAIRO_PDF_VERSION_1_7 -> VERSION_1_7
            else -> error("invalid nativeValue")
        }
    }
}
