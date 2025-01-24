// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.PrintContext
import org.gtkkn.bindings.gtk.TextTag
import org.gtkkn.bindings.gtk.WrapMode
import org.gtkkn.bindings.gtksource.annotations.GtkSourceVersion5_2
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourcePrintCompositor
import org.gtkkn.native.gtksource.gtk_source_print_compositor_draw_page
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_body_font_name
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_bottom_margin
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_buffer
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_footer_font_name
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_header_font_name
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_highlight_syntax
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_left_margin
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_line_numbers_font_name
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_n_pages
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_pagination_progress
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_print_footer
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_print_header
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_print_line_numbers
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_right_margin
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_tab_width
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_top_margin
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_type
import org.gtkkn.native.gtksource.gtk_source_print_compositor_get_wrap_mode
import org.gtkkn.native.gtksource.gtk_source_print_compositor_ignore_tag
import org.gtkkn.native.gtksource.gtk_source_print_compositor_new
import org.gtkkn.native.gtksource.gtk_source_print_compositor_new_from_view
import org.gtkkn.native.gtksource.gtk_source_print_compositor_paginate
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_body_font_name
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_bottom_margin
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_footer_font_name
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_footer_format
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_header_font_name
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_header_format
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_highlight_syntax
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_left_margin
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_line_numbers_font_name
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_print_footer
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_print_header
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_print_line_numbers
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_right_margin
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_tab_width
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_top_margin
import org.gtkkn.native.gtksource.gtk_source_print_compositor_set_wrap_mode
import kotlin.Boolean
import kotlin.String
import kotlin.Unit as KotlinUnit
import org.gtkkn.bindings.gtk.Unit as GtkUnit

/**
 * Compose a [class@Buffer] for printing.
 *
 * The `GtkSourcePrintCompositor` object is used to compose a [class@Buffer]
 * for printing. You can set various configuration options to customize the
 * printed output. `GtkSourcePrintCompositor` is designed to be used with the
 * high-level printing API of gtk+, i.e. [class@Gtk.PrintOperation].
 *
 * The margins specified in this object are the layout margins: they define the
 * blank space bordering the printed area of the pages. They must not be
 * confused with the "print margins", i.e. the parts of the page that the
 * printer cannot print on, defined in the [class@Gtk.PageSetup] objects. If the
 * specified layout margins are smaller than the "print margins", the latter
 * ones are used as a fallback by the `GtkSourcePrintCompositor` object, so that
 * the printed area is not clipped.
 *
 * ## Skipped during bindings generation
 *
 * - method `footer-font-name`: Property TypeInfo of getter and setter do not match
 * - method `header-font-name`: Property TypeInfo of getter and setter do not match
 * - method `line-numbers-font-name`: Property TypeInfo of getter and setter do not match
 */
public open class PrintCompositor(public val gtksourcePrintCompositorPointer: CPointer<GtkSourcePrintCompositor>) :
    Object(gtksourcePrintCompositorPointer.reinterpret()),
    KGTyped {
    /**
     * Name of the font used for the text body.
     *
     * Accepted values are strings representing a font description Pango can understand.
     * (e.g. `&quot;`Monospace 10`&quot;`). See [func@Pango.FontDescription.from_string]
     * for a description of the format of the string representation.
     *
     * The value of this property cannot be changed anymore after the first
     * call to the [method@PrintCompositor.paginate] function.
     */
    public open var bodyFontName: String
        /**
         * Returns the name of the font used to print the text body.
         *
         * The returned string must be freed with g_free().
         *
         * @return a new string containing the name of the font used to print the
         * text body.
         */
        get() = gtk_source_print_compositor_get_body_font_name(gtksourcePrintCompositorPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the default font for the printed text.
         *
         * @font_name should be a
         * string representation of a font description Pango can understand.
         * (e.g. `&quot;`Monospace 10`&quot;`). See [func@Pango.FontDescription.from_string]
         * for a description of the format of the string representation.
         *
         * This function cannot be called anymore after the first call to the
         * [method@PrintCompositor.paginate] function.
         *
         * @param fontName the name of the default font for the body text.
         */
        set(fontName) = gtk_source_print_compositor_set_body_font_name(gtksourcePrintCompositorPointer, fontName)

    /**
     * The [class@Buffer] object to print.
     */
    public open val buffer: Buffer
        /**
         * Gets the [class@Buffer] associated with the compositor.
         *
         * The returned object reference is owned by the compositor object and
         * should not be unreferenced.
         *
         * @return the #GtkSourceBuffer associated with the compositor.
         */
        get() = gtk_source_print_compositor_get_buffer(gtksourcePrintCompositorPointer)!!.run {
            Buffer(this)
        }

    /**
     * Whether to print the document with highlighted syntax.
     *
     * The value of this property cannot be changed anymore after the first
     * call to the [method@PrintCompositor.paginate] function.
     */
    public open var highlightSyntax: Boolean
        /**
         * Determines whether the printed text will be highlighted according to the
         * buffer rules.
         *
         * Note that highlighting will happen only if the buffer to print has highlighting activated.
         *
         * @return true if the printed output will be highlighted.
         */
        get() = gtk_source_print_compositor_get_highlight_syntax(gtksourcePrintCompositorPointer).asBoolean()

        /**
         * Sets whether the printed text will be highlighted according to the
         * buffer rules.  Both color and font style are applied.
         *
         * This function cannot be called anymore after the first call to the
         * [method@PrintCompositor.paginate] function.
         *
         * @param highlight whether syntax should be highlighted.
         */
        set(
            highlight
        ) = gtk_source_print_compositor_set_highlight_syntax(gtksourcePrintCompositorPointer, highlight.asGBoolean())

    /**
     * The number of pages in the document or <code>-1</code> if the
     * document has not been completely paginated.
     */
    public open val nPages: gint
        /**
         * Returns the number of pages in the document or <code>-1</code> if the
         * document has not been completely paginated.
         *
         * @return the number of pages in the document or <code>-1</code> if the
         * document has not been completely paginated.
         */
        get() = gtk_source_print_compositor_get_n_pages(gtksourcePrintCompositorPointer)

    /**
     * Whether to print a footer in each page.
     *
     * Note that by default the footer format is unspecified, and if it is
     * unspecified the footer will not be printed, regardless of the value of
     * this property.
     *
     * The value of this property cannot be changed anymore after the first
     * call to the [method@PrintCompositor.paginate] function.
     */
    public open var printFooter: Boolean
        /**
         * Determines if a footer is set to be printed for each page.
         *
         * A footer will be printed if this function returns true
         * **and** some format strings have been specified
         * with [method@PrintCompositor.set_footer_format].
         *
         * @return true if the footer is set to be printed.
         */
        get() = gtk_source_print_compositor_get_print_footer(gtksourcePrintCompositorPointer).asBoolean()

        /**
         * Sets whether you want to print a footer in each page.
         *
         * The footer consists of three pieces of text and an optional line
         * separator, configurable with
         * [method@PrintCompositor.set_footer_format].
         *
         * Note that by default the footer format is unspecified, and if it's
         * empty it will not be printed, regardless of this setting.
         *
         * This function cannot be called anymore after the first call to the
         * [method@PrintCompositor.paginate] function.
         *
         * @param print true if you want the footer to be printed.
         */
        set(print) = gtk_source_print_compositor_set_print_footer(gtksourcePrintCompositorPointer, print.asGBoolean())

    /**
     * Whether to print a header in each page.
     *
     * Note that by default the header format is unspecified, and if it is
     * unspecified the header will not be printed, regardless of the value of
     * this property.
     *
     * The value of this property cannot be changed anymore after the first
     * call to the [method@PrintCompositor.paginate] function.
     */
    public open var printHeader: Boolean
        /**
         * Determines if a header is set to be printed for each page.
         *
         * A header will be printed if this function returns true
         * **and** some format strings have been specified
         * with [method@PrintCompositor.set_header_format].
         *
         * @return true if the header is set to be printed.
         */
        get() = gtk_source_print_compositor_get_print_header(gtksourcePrintCompositorPointer).asBoolean()

        /**
         * Sets whether you want to print a header in each page.
         *
         * The header consists of three pieces of text and an optional line
         * separator, configurable with [method@PrintCompositor.set_header_format].
         *
         * Note that by default the header format is unspecified, and if it's
         * empty it will not be printed, regardless of this setting.
         *
         * This function cannot be called anymore after the first call to the
         * [method@PrintCompositor.paginate] function.
         *
         * @param print true if you want the header to be printed.
         */
        set(print) = gtk_source_print_compositor_set_print_header(gtksourcePrintCompositorPointer, print.asGBoolean())

    /**
     * Interval of printed line numbers.
     *
     * If this property is set to 0 no numbers will be printed.
     * If greater than 0, a number will be printed every "print-line-numbers"
     * lines (i.e. 1 will print all line numbers).
     *
     * The value of this property cannot be changed anymore after the first
     * call to the [method@PrintCompositor.paginate] function.
     */
    public open var printLineNumbers: guint
        /**
         * Returns the interval used for line number printing.
         *
         * If the value is 0, no line numbers will be printed. The default value is
         * 1 (i.e. numbers printed in all lines).
         *
         * @return the interval of printed line numbers.
         */
        get() = gtk_source_print_compositor_get_print_line_numbers(gtksourcePrintCompositorPointer)

        /**
         * Sets the interval for printed line numbers.
         *
         * If @interval is 0 no numbers will be printed. If greater than 0, a number will be
         * printed every @interval lines (i.e. 1 will print all line numbers).
         *
         * Maximum accepted value for @interval is 100.
         *
         * This function cannot be called anymore after the first call to the
         * [method@PrintCompositor.paginate] function.
         *
         * @param interval interval for printed line numbers.
         */
        set(interval) = gtk_source_print_compositor_set_print_line_numbers(gtksourcePrintCompositorPointer, interval)

    /**
     * Width of a tab character expressed in spaces.
     *
     * The value of this property cannot be changed anymore after the first
     * call to the [method@PrintCompositor.paginate] function.
     */
    public open var tabWidth: guint
        /**
         * Returns the width of tabulation in characters for printed text.
         *
         * @return width of tab.
         */
        get() = gtk_source_print_compositor_get_tab_width(gtksourcePrintCompositorPointer)

        /**
         * Sets the width of tabulation in characters for printed text.
         *
         * This function cannot be called anymore after the first call to the
         * [method@PrintCompositor.paginate] function.
         *
         * @param width width of tab in characters.
         */
        set(width) = gtk_source_print_compositor_set_tab_width(gtksourcePrintCompositorPointer, width)

    /**
     * Whether to wrap lines never, at word boundaries, or at character boundaries.
     *
     * The value of this property cannot be changed anymore after the first
     * call to the [method@PrintCompositor.paginate] function.
     */
    public open var wrapMode: WrapMode
        /**
         * Gets the line wrapping mode for the printed text.
         *
         * @return the line wrap mode.
         */
        get() = gtk_source_print_compositor_get_wrap_mode(gtksourcePrintCompositorPointer).run {
            WrapMode.fromNativeValue(this)
        }

        /**
         * Sets the line wrapping mode for the printed text.
         *
         * This function cannot be called anymore after the first call to the
         * [method@PrintCompositor.paginate] function.
         *
         * @param wrapMode a #GtkWrapMode.
         */
        set(wrapMode) = gtk_source_print_compositor_set_wrap_mode(gtksourcePrintCompositorPointer, wrapMode.nativeValue)

    /**
     * Creates a new print compositor that can be used to print @buffer.
     *
     * @param buffer the #GtkSourceBuffer to print.
     * @return a new print compositor object.
     */
    public constructor(
        buffer: Buffer,
    ) : this(gtk_source_print_compositor_new(buffer.gtksourceBufferPointer)!!.reinterpret())

    /**
     * Creates a new print compositor that can be used to print the buffer
     * associated with @view.
     *
     * This constructor sets some configuration properties to make the
     * printed output match @view as much as possible.  The properties set are
     * [property@PrintCompositor:tab-width], [property@PrintCompositor:highlight-syntax],
     * [property@PrintCompositor:wrap-mode], [property@PrintCompositor:body-font-name] and
     * [property@PrintCompositor:print-line-numbers].
     *
     * @param view a #GtkSourceView to get configuration from.
     * @return a new print compositor object.
     */
    public constructor(
        view: View,
    ) : this(gtk_source_print_compositor_new_from_view(view.gtksourceViewPointer)!!.reinterpret())

    /**
     * Draw page @page_nr for printing on the the Cairo context encapsuled in @context.
     *
     * This method has been designed to be called in the handler of the [signal@Gtk.PrintOperation::draw_page] signal
     * as shown in the following example:
     *
     * ```c
     * // Signal handler for the GtkPrintOperation::draw_page signal
     *
     * static void
     * draw_page (GtkPrintOperation *operation,
     *            GtkPrintContext   *context,
     *            gint               page_nr,
     *            gpointer           user_data)
     * {
     *     GtkSourcePrintCompositor *compositor;
     *
     *     compositor = GTK_SOURCE_PRINT_COMPOSITOR (user_data);
     *
     *     gtk_source_print_compositor_draw_page (compositor,
     *                                            context,
     *                                            page_nr);
     * }
     * ```
     *
     * @param context the #GtkPrintContext encapsulating the context information that is required when
     *           drawing the page for printing.
     * @param pageNr the number of the page to print.
     */
    public open fun drawPage(context: PrintContext, pageNr: gint): KotlinUnit =
        gtk_source_print_compositor_draw_page(gtksourcePrintCompositorPointer, context.gtkPrintContextPointer, pageNr)

    /**
     * Gets the bottom margin in units of @unit.
     *
     * @param unit the unit for the return value.
     * @return the bottom margin.
     */
    public open fun getBottomMargin(unit: GtkUnit): gdouble =
        gtk_source_print_compositor_get_bottom_margin(gtksourcePrintCompositorPointer, unit.nativeValue)

    /**
     * Returns the name of the font used to print the page footer.
     *
     * The returned string must be freed with g_free().
     *
     * @return a new string containing the name of the font used to print
     * the page footer.
     */
    public open fun getFooterFontName(): String =
        gtk_source_print_compositor_get_footer_font_name(gtksourcePrintCompositorPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns the name of the font used to print the page header.
     *
     * The returned string must be freed with g_free().
     *
     * @return a new string containing the name of the font used to print
     * the page header.
     */
    public open fun getHeaderFontName(): String =
        gtk_source_print_compositor_get_header_font_name(gtksourcePrintCompositorPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the left margin in units of @unit.
     *
     * @param unit the unit for the return value.
     * @return the left margin
     */
    public open fun getLeftMargin(unit: GtkUnit): gdouble =
        gtk_source_print_compositor_get_left_margin(gtksourcePrintCompositorPointer, unit.nativeValue)

    /**
     * Returns the name of the font used to print line numbers on the left margin.
     *
     * The returned string must be freed with g_free().
     *
     * @return a new string containing the name of the font used to print
     * line numbers on the left margin.
     */
    public open fun getLineNumbersFontName(): String =
        gtk_source_print_compositor_get_line_numbers_font_name(gtksourcePrintCompositorPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns the current fraction of the document pagination that has been completed.
     *
     * @return a fraction from 0.0 to 1.0 inclusive.
     */
    public open fun getPaginationProgress(): gdouble =
        gtk_source_print_compositor_get_pagination_progress(gtksourcePrintCompositorPointer)

    /**
     * Gets the right margin in units of @unit.
     *
     * @param unit the unit for the return value.
     * @return the right margin.
     */
    public open fun getRightMargin(unit: GtkUnit): gdouble =
        gtk_source_print_compositor_get_right_margin(gtksourcePrintCompositorPointer, unit.nativeValue)

    /**
     * Gets the top margin in units of @unit.
     *
     * @param unit the unit for the return value.
     * @return the top margin.
     */
    public open fun getTopMargin(unit: GtkUnit): gdouble =
        gtk_source_print_compositor_get_top_margin(gtksourcePrintCompositorPointer, unit.nativeValue)

    /**
     * Specifies a tag whose style should be ignored when compositing the
     * document to the printable page.
     *
     * @param tag a #GtkTextTag
     * @since 5.2
     */
    @GtkSourceVersion5_2
    public open fun ignoreTag(tag: TextTag): KotlinUnit =
        gtk_source_print_compositor_ignore_tag(gtksourcePrintCompositorPointer, tag.gtkTextTagPointer)

    /**
     * Paginate the document associated with the @compositor.
     *
     * In order to support non-blocking pagination, document is paginated in small chunks.
     * Each time [method@PrintCompositor.paginate] is invoked, a chunk of the document
     * is paginated. To paginate the entire document, [method@PrintCompositor.paginate]
     * must be invoked multiple times.
     * It returns true if the document has been completely paginated, otherwise it returns false.
     *
     * This method has been designed to be invoked in the handler of the [signal@Gtk.PrintOperation::paginate] signal,
     * as shown in the following example:
     *
     * ```c
     * // Signal handler for the GtkPrintOperation::paginate signal
     *
     * static gboolean
     * paginate (GtkPrintOperation *operation,
     *           GtkPrintContext   *context,
     *           gpointer           user_data)
     * {
     *     GtkSourcePrintCompositor *compositor;
     *
     *     compositor = GTK_SOURCE_PRINT_COMPOSITOR (user_data);
     *
     *     if (gtk_source_print_compositor_paginate (compositor, context))
     *     {
     *         gint n_pages;
     *
     *         n_pages = gtk_source_print_compositor_get_n_pages (compositor);
     *         gtk_print_operation_set_n_pages (operation, n_pages);
     *
     *         return TRUE;
     *     }
     *
     *     return FALSE;
     * }
     * ```
     *
     * If you don't need to do pagination in chunks, you can simply do it all in the
     * [signal@Gtk.PrintOperation::begin-print] handler, and set the number of pages from there, like
     * in the following example:
     *
     * ```c
     * // Signal handler for the GtkPrintOperation::begin-print signal
     *
     * static void
     * begin_print (GtkPrintOperation *operation,
     *              GtkPrintContext   *context,
     *              gpointer           user_data)
     * {
     *     GtkSourcePrintCompositor *compositor;
     *     gint n_pages;
     *
     *     compositor = GTK_SOURCE_PRINT_COMPOSITOR (user_data);
     *
     *     while (!gtk_source_print_compositor_paginate (compositor, context));
     *
     *     n_pages = gtk_source_print_compositor_get_n_pages (compositor);
     *     gtk_print_operation_set_n_pages (operation, n_pages);
     * }
     * ```
     *
     * @param context the #GtkPrintContext whose parameters (e.g. paper size, print margins, etc.)
     * are used by the the @compositor to paginate the document.
     * @return true if the document has been completely paginated, false otherwise.
     */
    public open fun paginate(context: PrintContext): Boolean = gtk_source_print_compositor_paginate(
        gtksourcePrintCompositorPointer,
        context.gtkPrintContextPointer
    ).asBoolean()

    /**
     * Sets the bottom margin used by @compositor.
     *
     * @param margin the new bottom margin in units of @unit.
     * @param unit the units for @margin.
     */
    public open fun setBottomMargin(margin: gdouble, unit: GtkUnit): KotlinUnit =
        gtk_source_print_compositor_set_bottom_margin(gtksourcePrintCompositorPointer, margin, unit.nativeValue)

    /**
     * Sets the font for printing the page footer.
     *
     * If null is supplied, the default font (i.e. the one being used for the
     * text) will be used instead.
     *
     * @font_name should be a
     * string representation of a font description Pango can understand.
     * (e.g. `&quot;`Monospace 10`&quot;`). See [func@Pango.FontDescription.from_string]
     * for a description of the format of the string representation.
     *
     * This function cannot be called anymore after the first call to the
     * [method@PrintCompositor.paginate] function.
     *
     * @param fontName the name of the font for the footer text, or null.
     */
    public open fun setFooterFontName(fontName: String? = null): KotlinUnit =
        gtk_source_print_compositor_set_footer_font_name(gtksourcePrintCompositorPointer, fontName)

    /**
     * See [method@PrintCompositor.set_header_format] for more information
     * about the parameters.
     *
     * @param separator true if you want a separator line to be printed.
     * @param left a format string to print on the left of the footer.
     * @param center a format string to print on the center of the footer.
     * @param right a format string to print on the right of the footer.
     */
    public open fun setFooterFormat(
        separator: Boolean,
        left: String? = null,
        center: String? = null,
        right: String? = null,
    ): KotlinUnit = gtk_source_print_compositor_set_footer_format(
        gtksourcePrintCompositorPointer,
        separator.asGBoolean(),
        left,
        center,
        right
    )

    /**
     * Sets the font for printing the page header.
     *
     * If null is supplied, the default font (i.e. the one being used for the
     * text) will be used instead.
     *
     * @font_name should be a
     * string representation of a font description Pango can understand.
     * (e.g. `&quot;`Monospace 10`&quot;`). See [func@Pango.FontDescription.from_string]
     * for a description of the format of the string representation.
     *
     * This function cannot be called anymore after the first call to the
     * [method@PrintCompositor.paginate] function.
     *
     * @param fontName the name of the font for header text, or null.
     */
    public open fun setHeaderFontName(fontName: String? = null): KotlinUnit =
        gtk_source_print_compositor_set_header_font_name(gtksourcePrintCompositorPointer, fontName)

    /**
     * Sets strftime like header format strings, to be printed on the
     * left, center and right of the top of each page.
     *
     * The strings may include strftime(3) codes which will be expanded at print time.
     * A subset of strftime() codes are accepted, see [method@GLib.DateTime.format]
     * for more details on the accepted format specifiers.
     * Additionally the following format specifiers are accepted:
     *
     * - #N: the page number
     * - #Q: the page count.
     *
     * @separator specifies if a solid line should be drawn to separate
     * the header from the document text.
     *
     * If null is given for any of the three arguments, that particular
     * string will not be printed.
     *
     * For the header to be printed, in
     * addition to specifying format strings, you need to enable header
     * printing with [method@PrintCompositor.set_print_header].
     *
     * This function cannot be called anymore after the first call to the
     * [method@PrintCompositor.paginate] function.
     *
     * @param separator true if you want a separator line to be printed.
     * @param left a format string to print on the left of the header.
     * @param center a format string to print on the center of the header.
     * @param right a format string to print on the right of the header.
     */
    public open fun setHeaderFormat(
        separator: Boolean,
        left: String? = null,
        center: String? = null,
        right: String? = null,
    ): KotlinUnit = gtk_source_print_compositor_set_header_format(
        gtksourcePrintCompositorPointer,
        separator.asGBoolean(),
        left,
        center,
        right
    )

    /**
     * Sets the left margin used by @compositor.
     *
     * @param margin the new left margin in units of @unit.
     * @param unit the units for @margin.
     */
    public open fun setLeftMargin(margin: gdouble, unit: GtkUnit): KotlinUnit =
        gtk_source_print_compositor_set_left_margin(gtksourcePrintCompositorPointer, margin, unit.nativeValue)

    /**
     * Sets the font for printing line numbers on the left margin.
     *
     * If null is supplied, the default font (i.e. the one being used for the
     * text) will be used instead.
     *
     * @font_name should be a
     * string representation of a font description Pango can understand.
     * (e.g. `&quot;`Monospace 10`&quot;`). See [func@Pango.FontDescription.from_string]
     * for a description of the format of the string representation.
     *
     * This function cannot be called anymore after the first call to the
     * [method@PrintCompositor.paginate] function.
     *
     * @param fontName the name of the font for line numbers, or null.
     */
    public open fun setLineNumbersFontName(fontName: String? = null): KotlinUnit =
        gtk_source_print_compositor_set_line_numbers_font_name(gtksourcePrintCompositorPointer, fontName)

    /**
     * Sets the right margin used by @compositor.
     *
     * @param margin the new right margin in units of @unit.
     * @param unit the units for @margin.
     */
    public open fun setRightMargin(margin: gdouble, unit: GtkUnit): KotlinUnit =
        gtk_source_print_compositor_set_right_margin(gtksourcePrintCompositorPointer, margin, unit.nativeValue)

    /**
     * Sets the top margin used by @compositor.
     *
     * @param margin the new top margin in units of @unit
     * @param unit the units for @margin
     */
    public open fun setTopMargin(margin: gdouble, unit: GtkUnit): KotlinUnit =
        gtk_source_print_compositor_set_top_margin(gtksourcePrintCompositorPointer, margin, unit.nativeValue)

    public companion object : TypeCompanion<PrintCompositor> {
        override val type: GeneratedClassKGType<PrintCompositor> =
            GeneratedClassKGType(gtk_source_print_compositor_get_type()) { PrintCompositor(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of PrintCompositor
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_print_compositor_get_type()
    }
}
