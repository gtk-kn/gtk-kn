// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkCellRendererText
import org.gtkkn.native.gtk.gtk_cell_renderer_text_get_type
import org.gtkkn.native.gtk.gtk_cell_renderer_text_new
import org.gtkkn.native.gtk.gtk_cell_renderer_text_set_fixed_height_from_font
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Renders text in a cell
 *
 * A `GtkCellRendererText` renders a given text in its cell, using the font, color and
 * style information provided by its properties. The text will be ellipsized if it is
 * too long and the `GtkCellRendererText:ellipsize` property allows it.
 *
 * If the `GtkCellRenderer:mode` is %GTK_CELL_RENDERER_MODE_EDITABLE,
 * the `GtkCellRendererText` allows to edit its text using an entry.
 *
 * ## Skipped during bindings generation
 *
 * - method `align-set`: Property has no getter nor setter
 * - method `alignment`: Property has no getter nor setter
 * - method `attributes`: Property has no getter nor setter
 * - method `background`: Property has no getter nor setter
 * - method `background-rgba`: Property has no getter nor setter
 * - method `background-set`: Property has no getter nor setter
 * - method `editable`: Property has no getter nor setter
 * - method `editable-set`: Property has no getter nor setter
 * - method `ellipsize`: Property has no getter nor setter
 * - method `ellipsize-set`: Property has no getter nor setter
 * - method `family`: Property has no getter nor setter
 * - method `family-set`: Property has no getter nor setter
 * - method `font`: Property has no getter nor setter
 * - method `font-desc`: Property has no getter nor setter
 * - method `foreground`: Property has no getter nor setter
 * - method `foreground-rgba`: Property has no getter nor setter
 * - method `foreground-set`: Property has no getter nor setter
 * - method `language`: Property has no getter nor setter
 * - method `language-set`: Property has no getter nor setter
 * - method `markup`: Property has no getter nor setter
 * - method `max-width-chars`: Property has no getter nor setter
 * - method `placeholder-text`: Property has no getter nor setter
 * - method `rise`: Property has no getter nor setter
 * - method `rise-set`: Property has no getter nor setter
 * - method `scale`: Property has no getter nor setter
 * - method `scale-set`: Property has no getter nor setter
 * - method `single-paragraph-mode`: Property has no getter nor setter
 * - method `size`: Property has no getter nor setter
 * - method `size-points`: Property has no getter nor setter
 * - method `size-set`: Property has no getter nor setter
 * - method `stretch`: Property has no getter nor setter
 * - method `stretch-set`: Property has no getter nor setter
 * - method `strikethrough`: Property has no getter nor setter
 * - method `strikethrough-set`: Property has no getter nor setter
 * - method `style`: Property has no getter nor setter
 * - method `style-set`: Property has no getter nor setter
 * - method `text`: Property has no getter nor setter
 * - method `underline`: Property has no getter nor setter
 * - method `underline-set`: Property has no getter nor setter
 * - method `variant`: Property has no getter nor setter
 * - method `variant-set`: Property has no getter nor setter
 * - method `weight`: Property has no getter nor setter
 * - method `weight-set`: Property has no getter nor setter
 * - method `width-chars`: Property has no getter nor setter
 * - method `wrap-mode`: Property has no getter nor setter
 * - method `wrap-width`: Property has no getter nor setter
 */
public open class CellRendererText(public val gtkCellRendererTextPointer: CPointer<GtkCellRendererText>) :
    CellRenderer(gtkCellRendererTextPointer.reinterpret()),
    KGTyped {
    /**
     * Creates a new `GtkCellRendererText`. Adjust how text is drawn using
     * object properties. Object properties can be
     * set globally (with g_object_set()). Also, with `GtkTreeViewColumn`,
     * you can bind a property to a value in a `GtkTreeModel`. For example,
     * you can bind the “text” property on the cell renderer to a string
     * value in the model, thus rendering a different string in each row
     * of the `GtkTreeView`.
     *
     * @return the new cell renderer
     */
    public constructor() : this(gtk_cell_renderer_text_new()!!.reinterpret())

    /**
     * Sets the height of a renderer to explicitly be determined by the “font” and
     * “y_pad” property set on it.  Further changes in these properties do not
     * affect the height, so they must be accompanied by a subsequent call to this
     * function.  Using this function is inflexible, and should really only be used
     * if calculating the size of a cell is too slow (ie, a massive number of cells
     * displayed).  If @number_of_rows is -1, then the fixed height is unset, and
     * the height is determined by the properties again.
     *
     * @param numberOfRows Number of rows of text each cell renderer is allocated, or -1
     */
    public open fun setFixedHeightFromFont(numberOfRows: gint): Unit =
        gtk_cell_renderer_text_set_fixed_height_from_font(gtkCellRendererTextPointer, numberOfRows)

    /**
     * This signal is emitted after @renderer has been edited.
     *
     * It is the responsibility of the application to update the model
     * and store @new_text at the position indicated by @path.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `path` the path identifying the edited cell; `newText` the new text
     */
    public fun onEdited(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (path: String, newText: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkCellRendererTextPointer,
        "edited",
        onEditedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "edited" signal. See [onEdited].
     *
     * @param path the path identifying the edited cell
     * @param newText the new text
     */
    public fun emitEdited(path: String, newText: String) {
        g_signal_emit_by_name(gtkCellRendererTextPointer.reinterpret(), "edited", path.cstr, newText.cstr)
    }

    public companion object : TypeCompanion<CellRendererText> {
        override val type: GeneratedClassKGType<CellRendererText> =
            GeneratedClassKGType(gtk_cell_renderer_text_get_type()) { CellRendererText(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CellRendererText
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cell_renderer_text_get_type()
    }
}

private val onEditedFunc: CPointer<CFunction<(CPointer<ByteVar>, CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            path: CPointer<ByteVar>?,
            newText: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(path: String, newText: String) -> Unit>().get().invoke(
            path?.toKString() ?: error("Expected not null string"),
            newText?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()
