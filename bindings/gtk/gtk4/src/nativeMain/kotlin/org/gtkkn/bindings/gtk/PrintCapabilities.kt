// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_PRINT_CAPABILITY_COLLATE
import org.gtkkn.native.gtk.GTK_PRINT_CAPABILITY_COPIES
import org.gtkkn.native.gtk.GTK_PRINT_CAPABILITY_GENERATE_PDF
import org.gtkkn.native.gtk.GTK_PRINT_CAPABILITY_GENERATE_PS
import org.gtkkn.native.gtk.GTK_PRINT_CAPABILITY_NUMBER_UP
import org.gtkkn.native.gtk.GTK_PRINT_CAPABILITY_NUMBER_UP_LAYOUT
import org.gtkkn.native.gtk.GTK_PRINT_CAPABILITY_PAGE_SET
import org.gtkkn.native.gtk.GTK_PRINT_CAPABILITY_PREVIEW
import org.gtkkn.native.gtk.GTK_PRINT_CAPABILITY_REVERSE
import org.gtkkn.native.gtk.GTK_PRINT_CAPABILITY_SCALE
import org.gtkkn.native.gtk.GtkPrintCapabilities
import org.gtkkn.native.gtk.gtk_print_capabilities_get_type

/**
 * Specifies which features the print dialog should offer.
 *
 * If neither %GTK_PRINT_CAPABILITY_GENERATE_PDF nor
 * %GTK_PRINT_CAPABILITY_GENERATE_PS is specified, GTK assumes that all
 * formats are supported.
 */
public class PrintCapabilities(public val mask: GtkPrintCapabilities) : Bitfield<PrintCapabilities> {
    override infix fun or(other: PrintCapabilities): PrintCapabilities = PrintCapabilities(mask or other.mask)

    public companion object {
        /**
         * Print dialog will offer printing even/odd pages.
         */
        public val PAGE_SET: PrintCapabilities = PrintCapabilities(GTK_PRINT_CAPABILITY_PAGE_SET)

        /**
         * Print dialog will allow to print multiple copies.
         */
        public val COPIES: PrintCapabilities = PrintCapabilities(GTK_PRINT_CAPABILITY_COPIES)

        /**
         * Print dialog will allow to collate multiple copies.
         */
        public val COLLATE: PrintCapabilities = PrintCapabilities(GTK_PRINT_CAPABILITY_COLLATE)

        /**
         * Print dialog will allow to print pages in reverse order.
         */
        public val REVERSE: PrintCapabilities = PrintCapabilities(GTK_PRINT_CAPABILITY_REVERSE)

        /**
         * Print dialog will allow to scale the output.
         */
        public val SCALE: PrintCapabilities = PrintCapabilities(GTK_PRINT_CAPABILITY_SCALE)

        /**
         * The program will send the document to
         *   the printer in PDF format
         */
        public val GENERATE_PDF: PrintCapabilities =
            PrintCapabilities(GTK_PRINT_CAPABILITY_GENERATE_PDF)

        /**
         * The program will send the document to
         *   the printer in Postscript format
         */
        public val GENERATE_PS: PrintCapabilities =
            PrintCapabilities(GTK_PRINT_CAPABILITY_GENERATE_PS)

        /**
         * Print dialog will offer a preview
         */
        public val PREVIEW: PrintCapabilities = PrintCapabilities(GTK_PRINT_CAPABILITY_PREVIEW)

        /**
         * Print dialog will offer printing multiple
         *   pages per sheet
         */
        public val NUMBER_UP: PrintCapabilities = PrintCapabilities(GTK_PRINT_CAPABILITY_NUMBER_UP)

        /**
         * Print dialog will allow to rearrange
         *   pages when printing multiple pages per sheet
         */
        public val NUMBER_UP_LAYOUT: PrintCapabilities =
            PrintCapabilities(GTK_PRINT_CAPABILITY_NUMBER_UP_LAYOUT)

        /**
         * Get the GType of PrintCapabilities
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_print_capabilities_get_type()
    }
}
