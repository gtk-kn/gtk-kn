// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.TextIter
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceHoverContext
import org.gtkkn.native.gtksource.gtk_source_hover_context_get_bounds
import org.gtkkn.native.gtksource.gtk_source_hover_context_get_buffer
import org.gtkkn.native.gtksource.gtk_source_hover_context_get_iter
import org.gtkkn.native.gtksource.gtk_source_hover_context_get_type
import org.gtkkn.native.gtksource.gtk_source_hover_context_get_view
import kotlin.Boolean

/**
 * Context for populating [class@HoverDisplay] contents.
 *
 * `GtkSourceHoverContext` contains information about the request to populate
 * contents for a [class@HoverDisplay].
 *
 * It can be used to retrieve the [class@View], [class@Buffer], and
 * [struct@Gtk.TextIter] for the regions of text which are being displayed.
 *
 * Use [method@HoverContext.get_bounds] to get the word that was
 * requested. [method@HoverContext.get_iter] will get you the location
 * of the pointer when the request was made.
 */
public open class HoverContext(public val gtksourceHoverContextPointer: CPointer<GtkSourceHoverContext>) :
    Object(gtksourceHoverContextPointer.reinterpret()),
    KGTyped {
    /**
     * Gets the current word bounds of the hover.
     *
     * If @begin is non-null, it will be set to the start position of the
     * current word being hovered.
     *
     * If @end is non-null, it will be set to the end position for the
     * current word being hovered.
     *
     * @param begin a #GtkTextIter
     * @param end a #GtkTextIter
     * @return true if the marks are still valid and @begin or @end was set.
     */
    public open fun getBounds(begin: TextIter?, end: TextIter?): Boolean = gtk_source_hover_context_get_bounds(
        gtksourceHoverContextPointer,
        begin?.gtkTextIterPointer,
        end?.gtkTextIterPointer
    ).asBoolean()

    /**
     * A convenience function to get the buffer.
     *
     * @return The #GtkSourceBuffer for the view
     */
    public open fun getBuffer(): Buffer = gtk_source_hover_context_get_buffer(gtksourceHoverContextPointer)!!.run {
        Buffer(this)
    }

    public open fun getIter(iter: TextIter): Boolean =
        gtk_source_hover_context_get_iter(gtksourceHoverContextPointer, iter.gtkTextIterPointer).asBoolean()

    /**
     *
     *
     * @return the #GtkSourceView that owns the context
     */
    public open fun getView(): View = gtk_source_hover_context_get_view(gtksourceHoverContextPointer)!!.run {
        View(this)
    }

    public companion object : TypeCompanion<HoverContext> {
        override val type: GeneratedClassKGType<HoverContext> =
            GeneratedClassKGType(gtk_source_hover_context_get_type()) { HoverContext(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of HoverContext
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_hover_context_get_type()
    }
}
