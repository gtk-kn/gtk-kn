// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBinLayout
import org.gtkkn.native.gtk.gtk_bin_layout_get_type
import org.gtkkn.native.gtk.gtk_bin_layout_new

/**
 * `GtkBinLayout` is a `GtkLayoutManager` subclass useful for create "bins" of
 * widgets.
 *
 * `GtkBinLayout` will stack each child of a widget on top of each other,
 * using the [property@Gtk.Widget:hexpand], [property@Gtk.Widget:vexpand],
 * [property@Gtk.Widget:halign], and [property@Gtk.Widget:valign] properties
 * of each child to determine where they should be positioned.
 */
public open class BinLayout(public val gtkBinLayoutPointer: CPointer<GtkBinLayout>) :
    LayoutManager(gtkBinLayoutPointer.reinterpret()),
    KGTyped {
    /**
     * Creates a new `GtkBinLayout` instance.
     *
     * @return the newly created `GtkBinLayout`
     */
    public constructor() : this(gtk_bin_layout_new()!!.reinterpret())

    public companion object : TypeCompanion<BinLayout> {
        override val type: GeneratedClassKGType<BinLayout> =
            GeneratedClassKGType(gtk_bin_layout_get_type()) { BinLayout(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of BinLayout
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_bin_layout_get_type()
    }
}
