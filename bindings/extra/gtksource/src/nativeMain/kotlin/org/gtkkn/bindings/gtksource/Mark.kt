// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.TextMark
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtksource.GtkSourceMark
import org.gtkkn.native.gtksource.gtk_source_mark_get_category
import org.gtkkn.native.gtksource.gtk_source_mark_get_type
import org.gtkkn.native.gtksource.gtk_source_mark_new
import org.gtkkn.native.gtksource.gtk_source_mark_next
import org.gtkkn.native.gtksource.gtk_source_mark_prev
import kotlin.String

/**
 * Mark object for [class@Buffer].
 *
 * A `GtkSourceMark` marks a position in the text where you want to display
 * additional info. It is based on [class@Gtk.TextMark] and thus is still valid after
 * the text has changed though its position may change.
 *
 * `GtkSourceMark`s are organized in categories which you have to set
 * when you create the mark. Each category can have a priority, a pixbuf and
 * other associated attributes. See [method@View.set_mark_attributes].
 * The pixbuf will be displayed in the margin at the line where the mark
 * residents if the [property@View:show-line-marks] property is set to true. If
 * there are multiple marks in the same line, the pixbufs will be drawn on top
 * of each other. The mark with the highest priority will be drawn on top.
 */
public open class Mark(
    pointer: CPointer<GtkSourceMark>,
) : TextMark(pointer.reinterpret()), KGTyped {
    public val gtksourceMarkPointer: CPointer<GtkSourceMark>
        get() = gPointer.reinterpret()

    /**
     * The category of the `GtkSourceMark`, classifies the mark and controls
     * which pixbuf is used and with which priority it is drawn.
     */
    public open val category: String
        /**
         * Returns the mark category.
         *
         * @return the category of the #GtkSourceMark.
         */
        get() =
            gtk_source_mark_get_category(gtksourceMarkPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * Creates a text mark.
     *
     * Add it to a buffer using [method@Gtk.TextBuffer.add_mark].
     * If name is NULL, the mark is anonymous; otherwise, the mark can be retrieved
     * by name using [method@Gtk.TextBuffer.get_mark].
     * Normally marks are created using the utility function
     * [method@Buffer.create_source_mark].
     *
     * @param name Name of the #GtkSourceMark or null
     * @param category is used to classify marks according to common characteristics
     *   (e.g. all the marks representing a bookmark could belong to the "bookmark"
     *   category, or all the marks representing a compilation error could belong
     *   to "error" category).
     * @return a new #GtkSourceMark that can be added using [method@Gtk.TextBuffer.add_mark].
     */
    public constructor(name: String? = null, category: String) : this(
        gtk_source_mark_new(
            name,
            category
        )!!.reinterpret()
    )

    /**
     * Returns the mark category.
     *
     * @return the category of the #GtkSourceMark.
     */
    public open fun getCategory(): String =
        gtk_source_mark_get_category(gtksourceMarkPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns the next `GtkSourceMark` in the buffer or null if the mark
     * was not added to a buffer.
     *
     *  If there is no next mark, null will be returned.
     *
     * If @category is null, looks for marks of any category.
     *
     * @param category a string specifying the mark category, or null.
     * @return the next #GtkSourceMark, or null.
     */
    public open fun next(category: String? = null): Mark? =
        gtk_source_mark_next(gtksourceMarkPointer.reinterpret(), category)?.run {
            Mark(reinterpret())
        }

    /**
     * Returns the previous `GtkSourceMark` in the buffer or null if the mark
     * was not added to a buffer.
     *
     * If there is no previous mark, null is returned.
     *
     * If @category is null, looks for marks of any category
     *
     * @param category a string specifying the mark category, or null.
     * @return the previous #GtkSourceMark, or null.
     */
    public open fun prev(category: String? = null): Mark? =
        gtk_source_mark_prev(gtksourceMarkPointer.reinterpret(), category)?.run {
            Mark(reinterpret())
        }

    public companion object : TypeCompanion<Mark> {
        override val type: GeneratedClassKGType<Mark> =
            GeneratedClassKGType(gtk_source_mark_get_type()) { Mark(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }
    }
}
