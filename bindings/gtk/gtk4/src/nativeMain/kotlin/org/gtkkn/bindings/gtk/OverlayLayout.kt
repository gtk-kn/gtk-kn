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
import org.gtkkn.native.gtk.GtkOverlayLayout
import org.gtkkn.native.gtk.gtk_overlay_layout_get_type
import org.gtkkn.native.gtk.gtk_overlay_layout_new

/**
 * `GtkOverlayLayout` is the layout manager used by [class@Gtk.Overlay].
 *
 * It places widgets as overlays on top of the main child.
 *
 * This is not a reusable layout manager, since it expects its widget
 * to be a `GtkOverlay`. It is only listed here so that its layout
 * properties get documented.
 */
public open class OverlayLayout(public val gtkOverlayLayoutPointer: CPointer<GtkOverlayLayout>) :
    LayoutManager(gtkOverlayLayoutPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Creates a new `GtkOverlayLayout` instance.
     *
     * @return the newly created instance
     */
    public constructor() : this(gtk_overlay_layout_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<OverlayLayout> {
        override val type: GeneratedClassKGType<OverlayLayout> =
            GeneratedClassKGType(getTypeOrNull()!!) { OverlayLayout(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of OverlayLayout
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_overlay_layout_get_type()

        /**
         * Gets the GType of from the symbol `gtk_overlay_layout_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_overlay_layout_get_type")
    }
}
