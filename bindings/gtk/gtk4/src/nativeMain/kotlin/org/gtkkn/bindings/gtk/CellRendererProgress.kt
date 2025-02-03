// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkCellRendererProgress
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.gtk_cell_renderer_progress_get_type
import org.gtkkn.native.gtk.gtk_cell_renderer_progress_new

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * List views use widgets to display their contents.
 *   You should use [class@Gtk.ProgressBar] instead
 * ---
 *
 * Renders numbers as progress bars
 *
 * `GtkCellRendererProgress` renders a numeric value as a progress par in a cell.
 * Additionally, it can display a text on top of the progress bar.
 *
 * ## Skipped during bindings generation
 *
 * - method `inverted`: Property has no getter nor setter
 * - method `pulse`: Property has no getter nor setter
 * - method `text`: Property has no getter nor setter
 * - method `text-xalign`: Property has no getter nor setter
 * - method `text-yalign`: Property has no getter nor setter
 * - method `value`: Property has no getter nor setter
 */
public open class CellRendererProgress(public val gtkCellRendererProgressPointer: CPointer<GtkCellRendererProgress>) :
    CellRenderer(gtkCellRendererProgressPointer.reinterpret()),
    Orientable,
    KGTyped {
    init {
        Gtk
    }

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Creates a new `GtkCellRendererProgress`.
     *
     * @return the new cell renderer
     */
    public constructor() : this(gtk_cell_renderer_progress_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<CellRendererProgress> {
        override val type: GeneratedClassKGType<CellRendererProgress> =
            GeneratedClassKGType(getTypeOrNull()!!) { CellRendererProgress(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CellRendererProgress
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cell_renderer_progress_get_type()

        /**
         * Gets the GType of from the symbol `gtk_cell_renderer_progress_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_cell_renderer_progress_get_type")
    }
}
