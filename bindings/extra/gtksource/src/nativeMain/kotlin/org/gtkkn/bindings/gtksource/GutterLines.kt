// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.TextBuffer
import org.gtkkn.bindings.gtk.TextIter
import org.gtkkn.bindings.gtk.TextView
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtksource.GtkSourceGutterLines
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_add_class
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_add_qclass
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_get_buffer
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_get_first
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_get_iter_at_line
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_get_last
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_get_type
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_get_view
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_has_any_class
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_has_class
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_has_qclass
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_is_cursor
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_is_prelit
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_is_selected
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_remove_class
import org.gtkkn.native.gtksource.gtk_source_gutter_lines_remove_qclass
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * Collected information about visible lines.
 *
 * The `GtkSourceGutterLines` object is used to collect information about
 * visible lines.
 *
 * Use this from your [signal@GutterRenderer::query-data] to collect the
 * necessary information on visible lines. Doing so reduces the number of
 * passes through the text btree allowing GtkSourceView to reach more
 * frames-per-second while performing kinetic scrolling.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `y`: y: Out parameter is not supported
 */
public open class GutterLines(
    pointer: CPointer<GtkSourceGutterLines>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gtksourceGutterLinesPointer: CPointer<GtkSourceGutterLines>
        get() = gPointer.reinterpret()

    /**
     * Adds the class @name to @line.
     *
     * @name will be converted to a [alias@GLib.Quark] as part of this process. A
     * faster version of this function is available via
     * [method@GutterLines.add_qclass] for situations where the [alias@GLib.Quark] is
     * known ahead of time.
     *
     * @param line a line number starting from zero
     * @param name a class name
     */
    public open fun addClass(
        line: UInt,
        name: String,
    ): Unit = gtk_source_gutter_lines_add_class(gtksourceGutterLinesPointer.reinterpret(), line, name)

    /**
     * Adds the class denoted by @qname to @line.
     *
     * You may check if a line has @qname by calling
     * [method@GutterLines.has_qclass].
     *
     * You can remove @qname by calling
     * [method@GutterLines.remove_qclass].
     *
     * @param line a line number starting from zero
     * @param qname a class name as a #GQuark
     */
    public open fun addQclass(
        line: UInt,
        qname: UInt,
    ): Unit =
        gtk_source_gutter_lines_add_qclass(
            gtksourceGutterLinesPointer.reinterpret(),
            line,
            qname
        )

    /**
     * Gets the [class@Gtk.TextBuffer] that the `GtkSourceGutterLines` represents.
     *
     * @return a #GtkTextBuffer
     */
    public open fun getBuffer(): TextBuffer =
        gtk_source_gutter_lines_get_buffer(gtksourceGutterLinesPointer.reinterpret())!!.run {
            TextBuffer(reinterpret())
        }

    /**
     * Gets the line number (starting from 0) for the first line that is
     * user visible.
     *
     * @return a line number starting from 0
     */
    public open fun getFirst(): UInt = gtk_source_gutter_lines_get_first(gtksourceGutterLinesPointer.reinterpret())

    /**
     * Gets a #GtkTextIter for the current buffer at @line
     *
     * @param iter a location for a #GtkTextIter
     * @param line the line number
     */
    public open fun getIterAtLine(
        iter: TextIter,
        line: UInt,
    ): Unit =
        gtk_source_gutter_lines_get_iter_at_line(
            gtksourceGutterLinesPointer.reinterpret(),
            iter.gtkTextIterPointer,
            line
        )

    /**
     * Gets the line number (starting from 0) for the last line that is
     * user visible.
     *
     * @return a line number starting from 0
     */
    public open fun getLast(): UInt = gtk_source_gutter_lines_get_last(gtksourceGutterLinesPointer.reinterpret())

    /**
     * Gets the [class@Gtk.TextView] that the `GtkSourceGutterLines` represents.
     *
     * @return a #GtkTextView
     */
    public open fun getView(): TextView =
        gtk_source_gutter_lines_get_view(gtksourceGutterLinesPointer.reinterpret())!!.run {
            TextView(reinterpret())
        }

    /**
     * Checks to see if the line has any GQuark classes set. This can be
     * used to help renderer implementations avoid work if nothing has
     * been set on the class.
     *
     * @param line a line contained within @lines
     * @return true if any quark was set for the line
     * @since 5.6
     */
    public open fun hasAnyClass(line: UInt): Boolean =
        gtk_source_gutter_lines_has_any_class(
            gtksourceGutterLinesPointer.reinterpret(),
            line
        ).asBoolean()

    /**
     * Checks to see if [method@GutterLines.add_class] was called with
     * the @name for @line.
     *
     * A faster version of this function is provided via
     * [method@GutterLines.has_qclass] for situations where the quark
     * is known ahead of time.
     *
     * @param line a line number starting from zero
     * @param name a class name that may be converted, to a #GQuark
     * @return true if @line contains @name
     */
    public open fun hasClass(
        line: UInt,
        name: String,
    ): Boolean =
        gtk_source_gutter_lines_has_class(
            gtksourceGutterLinesPointer.reinterpret(),
            line,
            name
        ).asBoolean()

    /**
     * Checks to see if [method@GutterLines.add_qclass] was called with
     * the quark denoted by @qname for @line.
     *
     * @param line a line number starting from zero
     * @param qname a #GQuark containing the class name
     * @return true if @line contains @qname
     */
    public open fun hasQclass(
        line: UInt,
        qname: UInt,
    ): Boolean =
        gtk_source_gutter_lines_has_qclass(
            gtksourceGutterLinesPointer.reinterpret(),
            line,
            qname
        ).asBoolean()

    /**
     * Checks to see if @line contains the insertion cursor.
     *
     * @param line a line number starting from zero
     * @return true if the insertion cursor is on @line
     */
    public open fun isCursor(line: UInt): Boolean =
        gtk_source_gutter_lines_is_cursor(
            gtksourceGutterLinesPointer.reinterpret(),
            line
        ).asBoolean()

    /**
     * Checks to see if @line is marked as prelit. Generally, this means
     * the mouse pointer is over the line within the gutter.
     *
     * @param line a line number starting from zero
     * @return true if the line is prelit
     */
    public open fun isPrelit(line: UInt): Boolean =
        gtk_source_gutter_lines_is_prelit(
            gtksourceGutterLinesPointer.reinterpret(),
            line
        ).asBoolean()

    /**
     * Checks to see if the view had a selection and if that selection overlaps
     * @line in some way.
     *
     * @param line a line number starting from zero
     * @return true if the line contains a selection
     */
    public open fun isSelected(line: UInt): Boolean =
        gtk_source_gutter_lines_is_selected(
            gtksourceGutterLinesPointer.reinterpret(),
            line
        ).asBoolean()

    /**
     * Removes the class matching @name from @line.
     *
     * A faster version of this function is available via
     * [method@GutterLines.remove_qclass] for situations where the
     * #GQuark is known ahead of time.
     *
     * @param line a line number starting from zero
     * @param name a class name
     */
    public open fun removeClass(
        line: UInt,
        name: String,
    ): Unit =
        gtk_source_gutter_lines_remove_class(
            gtksourceGutterLinesPointer.reinterpret(),
            line,
            name
        )

    /**
     * Reverses a call to [method@GutterLines.add_qclass] by removing
     * the [alias@GLib.Quark] matching @qname.
     *
     * @param line a line number starting from zero
     * @param qname a #GQuark to remove from @line
     */
    public open fun removeQclass(
        line: UInt,
        qname: UInt,
    ): Unit =
        gtk_source_gutter_lines_remove_qclass(
            gtksourceGutterLinesPointer.reinterpret(),
            line,
            qname
        )

    public companion object : TypeCompanion<GutterLines> {
        override val type: GeneratedClassKGType<GutterLines> =
            GeneratedClassKGType(gtk_source_gutter_lines_get_type()) {
                GutterLines(it.reinterpret())
            }

        init {
            GtksourceTypeProvider.register()
        }
    }
}
