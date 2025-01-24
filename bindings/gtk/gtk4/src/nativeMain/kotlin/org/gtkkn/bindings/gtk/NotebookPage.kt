// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkNotebookPage
import org.gtkkn.native.gtk.gtk_notebook_page_get_child
import org.gtkkn.native.gtk.gtk_notebook_page_get_type

/**
 * `GtkNotebookPage` is an auxiliary object used by `GtkNotebook`.
 *
 * ## Skipped during bindings generation
 *
 * - method `detachable`: Property has no getter nor setter
 * - method `menu`: Property has no getter nor setter
 * - method `menu-label`: Property has no getter nor setter
 * - method `position`: Property has no getter nor setter
 * - method `reorderable`: Property has no getter nor setter
 * - method `tab`: Property has no getter nor setter
 * - method `tab-expand`: Property has no getter nor setter
 * - method `tab-fill`: Property has no getter nor setter
 * - method `tab-label`: Property has no getter nor setter
 */
public open class NotebookPage(public val gtkNotebookPagePointer: CPointer<GtkNotebookPage>) :
    Object(gtkNotebookPagePointer.reinterpret()),
    KGTyped {
    /**
     * The child for this page.
     */
    public open val child: Widget
        /**
         * Returns the notebook child to which @page belongs.
         *
         * @return the child to which @page belongs
         */
        get() = gtk_notebook_page_get_child(gtkNotebookPagePointer)!!.run {
            Widget.WidgetImpl(this)
        }

    public companion object : TypeCompanion<NotebookPage> {
        override val type: GeneratedClassKGType<NotebookPage> =
            GeneratedClassKGType(gtk_notebook_page_get_type()) { NotebookPage(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of NotebookPage
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_notebook_page_get_type()
    }
}
