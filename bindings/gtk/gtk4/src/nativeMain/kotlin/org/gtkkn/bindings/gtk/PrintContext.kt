// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.pango.FontMap
import org.gtkkn.bindings.pango.Layout
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPrintContext
import org.gtkkn.native.gtk.gtk_print_context_create_pango_context
import org.gtkkn.native.gtk.gtk_print_context_create_pango_layout
import org.gtkkn.native.gtk.gtk_print_context_get_cairo_context
import org.gtkkn.native.gtk.gtk_print_context_get_dpi_x
import org.gtkkn.native.gtk.gtk_print_context_get_dpi_y
import org.gtkkn.native.gtk.gtk_print_context_get_height
import org.gtkkn.native.gtk.gtk_print_context_get_page_setup
import org.gtkkn.native.gtk.gtk_print_context_get_pango_fontmap
import org.gtkkn.native.gtk.gtk_print_context_get_type
import org.gtkkn.native.gtk.gtk_print_context_get_width
import org.gtkkn.native.gtk.gtk_print_context_set_cairo_context
import kotlin.Unit
import org.gtkkn.bindings.cairo.Context as CairoContext
import org.gtkkn.bindings.pango.Context as PangoContext

/**
 * A `GtkPrintContext` encapsulates context information that is required when
 * drawing pages for printing.
 *
 * This includes the cairo context and important parameters like page size
 * and resolution. It also lets you easily create [class@Pango.Layout] and
 * [class@Pango.Context] objects that match the font metrics of the cairo surface.
 *
 * `GtkPrintContext` objects get passed to the
 * [signal@Gtk.PrintOperation::begin-print],
 * [signal@Gtk.PrintOperation::end-print],
 * [signal@Gtk.PrintOperation::request-page-setup] and
 * [signal@Gtk.PrintOperation::draw-page] signals on the
 * [class@Gtk.PrintOperation] object.
 *
 * ## Using GtkPrintContext in a ::draw-page callback
 *
 * ```c
 * static void
 * draw_page (GtkPrintOperation *operation,
 *            GtkPrintContext   *context,
 *            int                page_nr)
 * {
 *   cairo_t *cr;
 *   PangoLayout *layout;
 *   PangoFontDescription *desc;
 *
 *   cr = gtk_print_context_get_cairo_context (context);
 *
 *   // Draw a red rectangle, as wide as the paper (inside the margins)
 *   cairo_set_source_rgb (cr, 1.0, 0, 0);
 *   cairo_rectangle (cr, 0, 0, gtk_print_context_get_width (context), 50);
 *
 *   cairo_fill (cr);
 *
 *   // Draw some lines
 *   cairo_move_to (cr, 20, 10);
 *   cairo_line_to (cr, 40, 20);
 *   cairo_arc (cr, 60, 60, 20, 0, M_PI);
 *   cairo_line_to (cr, 80, 20);
 *
 *   cairo_set_source_rgb (cr, 0, 0, 0);
 *   cairo_set_line_width (cr, 5);
 *   cairo_set_line_cap (cr, CAIRO_LINE_CAP_ROUND);
 *   cairo_set_line_join (cr, CAIRO_LINE_JOIN_ROUND);
 *
 *   cairo_stroke (cr);
 *
 *   // Draw some text
 *   layout = gtk_print_context_create_pango_layout (context);
 *   pango_layout_set_text (layout, "Hello World! Printing is easy", -1);
 *   desc = pango_font_description_from_string ("sans 28");
 *   pango_layout_set_font_description (layout, desc);
 *   pango_font_description_free (desc);
 *
 *   cairo_move_to (cr, 30, 20);
 *   pango_cairo_layout_path (cr, layout);
 *
 *   // Font Outline
 *   cairo_set_source_rgb (cr, 0.93, 1.0, 0.47);
 *   cairo_set_line_width (cr, 0.5);
 *   cairo_stroke_preserve (cr);
 *
 *   // Font Fill
 *   cairo_set_source_rgb (cr, 0, 0.0, 1.0);
 *   cairo_fill (cr);
 *
 *   g_object_unref (layout);
 * }
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - parameter `top`: top: Out parameter is not supported
 */
public open class PrintContext(public val gtkPrintContextPointer: CPointer<GtkPrintContext>) :
    Object(gtkPrintContextPointer.reinterpret()),
    KGTyped {
    /**
     * Creates a new `PangoContext` that can be used with the
     * `GtkPrintContext`.
     *
     * @return a new Pango context for @context
     */
    public open fun createPangoContext(): PangoContext =
        gtk_print_context_create_pango_context(gtkPrintContextPointer)!!.run {
            PangoContext(this)
        }

    /**
     * Creates a new `PangoLayout` that is suitable for use
     * with the `GtkPrintContext`.
     *
     * @return a new Pango layout for @context
     */
    public open fun createPangoLayout(): Layout = gtk_print_context_create_pango_layout(gtkPrintContextPointer)!!.run {
        Layout(this)
    }

    /**
     * Obtains the cairo context that is associated with the
     * `GtkPrintContext`.
     *
     * @return the cairo context of @context
     */
    public open fun getCairoContext(): CairoContext =
        gtk_print_context_get_cairo_context(gtkPrintContextPointer)!!.run {
            CairoContext(this)
        }

    /**
     * Obtains the horizontal resolution of the `GtkPrintContext`,
     * in dots per inch.
     *
     * @return the horizontal resolution of @context
     */
    public open fun getDpiX(): gdouble = gtk_print_context_get_dpi_x(gtkPrintContextPointer)

    /**
     * Obtains the vertical resolution of the `GtkPrintContext`,
     * in dots per inch.
     *
     * @return the vertical resolution of @context
     */
    public open fun getDpiY(): gdouble = gtk_print_context_get_dpi_y(gtkPrintContextPointer)

    /**
     * Obtains the height of the `GtkPrintContext`, in pixels.
     *
     * @return the height of @context
     */
    public open fun getHeight(): gdouble = gtk_print_context_get_height(gtkPrintContextPointer)

    /**
     * Obtains the `GtkPageSetup` that determines the page
     * dimensions of the `GtkPrintContext`.
     *
     * @return the page setup of @context
     */
    public open fun getPageSetup(): PageSetup = gtk_print_context_get_page_setup(gtkPrintContextPointer)!!.run {
        PageSetup(this)
    }

    /**
     * Returns a `PangoFontMap` that is suitable for use
     * with the `GtkPrintContext`.
     *
     * @return the font map of @context
     */
    public open fun getPangoFontmap(): FontMap = gtk_print_context_get_pango_fontmap(gtkPrintContextPointer)!!.run {
        FontMap.FontMapImpl(this)
    }

    /**
     * Obtains the width of the `GtkPrintContext`, in pixels.
     *
     * @return the width of @context
     */
    public open fun getWidth(): gdouble = gtk_print_context_get_width(gtkPrintContextPointer)

    /**
     * Sets a new cairo context on a print context.
     *
     * This function is intended to be used when implementing
     * an internal print preview, it is not needed for printing,
     * since GTK itself creates a suitable cairo context in that
     * case.
     *
     * @param cr the cairo context
     * @param dpiX the horizontal resolution to use with @cr
     * @param dpiY the vertical resolution to use with @cr
     */
    public open fun setCairoContext(cr: CairoContext, dpiX: gdouble, dpiY: gdouble): Unit =
        gtk_print_context_set_cairo_context(gtkPrintContextPointer, cr.cairoContextPointer, dpiX, dpiY)

    public companion object : TypeCompanion<PrintContext> {
        override val type: GeneratedClassKGType<PrintContext> =
            GeneratedClassKGType(getTypeOrNull("gtk_print_context_get_type")!!) { PrintContext(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of PrintContext
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_print_context_get_type()
    }
}
