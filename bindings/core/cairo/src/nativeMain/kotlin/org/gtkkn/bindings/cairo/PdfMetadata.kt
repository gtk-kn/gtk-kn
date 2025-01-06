// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.bindings.cairo.annotations.CairoVersion1_16
import org.gtkkn.native.cairo.cairo_pdf_metadata_t

/**
 *
 * @since 1.16
 */
@CairoVersion1_16
public enum class PdfMetadata(public val nativeValue: cairo_pdf_metadata_t) {
    TITLE(cairo_pdf_metadata_t.CAIRO_PDF_METADATA_TITLE),
    AUTHOR(cairo_pdf_metadata_t.CAIRO_PDF_METADATA_AUTHOR),
    SUBJECT(cairo_pdf_metadata_t.CAIRO_PDF_METADATA_SUBJECT),
    KEYWORDS(cairo_pdf_metadata_t.CAIRO_PDF_METADATA_KEYWORDS),
    CREATOR(cairo_pdf_metadata_t.CAIRO_PDF_METADATA_CREATOR),
    CREATE_DATE(cairo_pdf_metadata_t.CAIRO_PDF_METADATA_CREATE_DATE),
    MOD_DATE(cairo_pdf_metadata_t.CAIRO_PDF_METADATA_MOD_DATE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_pdf_metadata_t): PdfMetadata = when (nativeValue) {
            cairo_pdf_metadata_t.CAIRO_PDF_METADATA_TITLE -> TITLE
            cairo_pdf_metadata_t.CAIRO_PDF_METADATA_AUTHOR -> AUTHOR
            cairo_pdf_metadata_t.CAIRO_PDF_METADATA_SUBJECT -> SUBJECT
            cairo_pdf_metadata_t.CAIRO_PDF_METADATA_KEYWORDS -> KEYWORDS
            cairo_pdf_metadata_t.CAIRO_PDF_METADATA_CREATOR -> CREATOR
            cairo_pdf_metadata_t.CAIRO_PDF_METADATA_CREATE_DATE -> CREATE_DATE
            cairo_pdf_metadata_t.CAIRO_PDF_METADATA_MOD_DATE -> MOD_DATE
            else -> error("invalid nativeValue")
        }
    }
}
