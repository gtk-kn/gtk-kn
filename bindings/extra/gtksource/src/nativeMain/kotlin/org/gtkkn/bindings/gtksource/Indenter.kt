// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.ModifierType
import org.gtkkn.bindings.gtk.TextIter
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gtksource.GtkSourceIndenter
import org.gtkkn.native.gtksource.gtk_source_indenter_get_type
import org.gtkkn.native.gtksource.gtk_source_indenter_is_trigger
import kotlin.Boolean

/**
 * Auto-indentation interface.
 *
 * By default, [class@View] can auto-indent as you type when
 * [property@View:auto-indent] is enabled. The indentation simply copies the
 * previous lines indentation.
 *
 * This can be changed by implementing `GtkSourceIndenter` and setting the
 * [property@View:indenter] property.
 *
 * Implementors of this interface should implement both
 * [vfunc@Indenter.is_trigger] and [vfunc@Indenter.indent].
 *
 * [vfunc@Indenter.is_trigger] is called upon key-press to
 * determine of the key press should trigger an indentation.  The default
 * implementation of the interface checks to see if the key was
 * [const@Gdk.KEY_Return] or [const@Gdk.KEY_KP_Enter] without %GDK_SHIFT_MASK set.
 *
 * [vfunc@Indenter.indent] is called after text has been
 * inserted into [class@Buffer] when
 * [vfunc@Indenter.is_trigger] returned true. The [struct@Gtk.TextIter]
 * is placed directly after the inserted character or characters.
 *
 * It may be beneficial to move the insertion mark using
 * [method@Gtk.TextBuffer.select_range] depending on how the indenter changes
 * the indentation.
 *
 * All changes are encapsulated within a single user action so that the
 * user may undo them using standard undo/redo accelerators.
 *
 * ## Skipped during bindings generation
 *
 * - method `indent`: In/Out parameter is not supported
 */
public interface Indenter :
    Interface,
    KGTyped {
    public val gtksourceIndenterPointer: CPointer<GtkSourceIndenter>

    /**
     * This function is used to determine if a key pressed should cause the
     * indenter to automatically indent.
     *
     * The default implementation of this virtual method will check to see
     * if @keyval is [const@Gdk.KEY_Return] or [const@Gdk.KEY_KP_Enter] and @state does
     * not have %GDK_SHIFT_MASK set. This is to allow the user to avoid
     * indentation when Shift+Return is pressed. Other indenters may want
     * to copy this behavior to provide a consistent experience to users.
     *
     * @param view a #GtkSourceView
     * @param location the location where @ch is to be inserted
     * @param state modifier state for the insertion
     * @param keyval the keyval pressed such as [const@Gdk.KEY_Return]
     * @return true if indentation should be automatically triggered;
     *   otherwise false and no indentation will be performed.
     */
    public fun isTrigger(view: View, location: TextIter, state: ModifierType, keyval: guint): Boolean =
        gtk_source_indenter_is_trigger(
            gtksourceIndenterPointer.reinterpret(),
            view.gtksourceViewPointer.reinterpret(),
            location.gtkTextIterPointer.reinterpret(),
            state.mask,
            keyval
        ).asBoolean()

    private data class Wrapper(private val pointer: CPointer<GtkSourceIndenter>) : Indenter {
        override val gtksourceIndenterPointer: CPointer<GtkSourceIndenter> = pointer
    }

    public companion object : TypeCompanion<Indenter> {
        override val type: GeneratedInterfaceKGType<Indenter> =
            GeneratedInterfaceKGType(gtk_source_indenter_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkSourceIndenter>): Indenter = Wrapper(pointer)

        /**
         * Get the GType of Indenter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_indenter_get_type()
    }
}
