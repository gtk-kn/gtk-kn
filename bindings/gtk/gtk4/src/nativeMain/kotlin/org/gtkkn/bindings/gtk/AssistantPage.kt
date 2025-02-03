// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAssistantPage
import org.gtkkn.native.gtk.gtk_assistant_page_get_child
import org.gtkkn.native.gtk.gtk_assistant_page_get_type

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * This object will be removed in GTK 5
 * ---
 *
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
    init {
        Gtk
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This object will be removed in GTK 5
     * ---
     *
     * The child widget.
     */
    public open val child: Widget
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Returns the child to which @page belongs.
         *
         * @return the child to which @page belongs
         */
        get() = gtk_assistant_page_get_child(gtkAssistantPagePointer)!!.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

    public companion object : TypeCompanion<AssistantPage> {
        override val type: GeneratedClassKGType<AssistantPage> =
            GeneratedClassKGType(getTypeOrNull()!!) { AssistantPage(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of AssistantPage
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_assistant_page_get_type()

        /**
         * Gets the GType of from the symbol `gtk_assistant_page_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_assistant_page_get_type")
    }
}
