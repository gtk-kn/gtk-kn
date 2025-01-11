// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAssistantPage
import org.gtkkn.native.gtk.gtk_assistant_page_get_child
import org.gtkkn.native.gtk.gtk_assistant_page_get_type

/**
 * `GtkAssistantPage` is an auxiliary object used by `GtkAssistant.
 *
 * ## Skipped during bindings generation
 *
 * - method `complete`: Property has no getter nor setter
 * - method `page-type`: Property has no getter nor setter
 * - method `title`: Property has no getter nor setter
 */
public open class AssistantPage(public val gtkAssistantPagePointer: CPointer<GtkAssistantPage>) :
    Object(gtkAssistantPagePointer.reinterpret()),
    KGTyped {
    /**
     * The child widget.
     */
    public open val child: Widget
        /**
         * Returns the child to which @page belongs.
         *
         * @return the child to which @page belongs
         */
        get() = gtk_assistant_page_get_child(gtkAssistantPagePointer)!!.run {
            Widget.WidgetImpl(this)
        }

    public companion object : TypeCompanion<AssistantPage> {
        override val type: GeneratedClassKGType<AssistantPage> =
            GeneratedClassKGType(gtk_assistant_page_get_type()) { AssistantPage(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of AssistantPage
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_assistant_page_get_type()
    }
}
