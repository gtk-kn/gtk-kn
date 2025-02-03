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
import org.gtkkn.native.gtk.GtkFixedLayout
import org.gtkkn.native.gtk.gtk_fixed_layout_get_type
import org.gtkkn.native.gtk.gtk_fixed_layout_new

/**
 * `GtkFixedLayout` is a layout manager which can place child widgets
 * at fixed positions.
 *
 * Most applications should never use this layout manager; fixed positioning
 * and sizing requires constant recalculations on where children need to be
 * positioned and sized. Other layout managers perform this kind of work
 * internally so that application developers don't need to do it. Specifically,
 * widgets positioned in a fixed layout manager will need to take into account:
 *
 * - Themes, which may change widget sizes.
 *
 * - Fonts other than the one you used to write the app will of course
 *   change the size of widgets containing text; keep in mind that
 *   users may use a larger font because of difficulty reading the
 *   default, or they may be using a different OS that provides different
 *   fonts.
 *
 * - Translation of text into other languages changes its size. Also,
 *   display of non-English text will use a different font in many
 *   cases.
 *
 * In addition, `GtkFixedLayout` does not pay attention to text direction and
 * thus may produce unwanted results if your app is run under right-to-left
 * languages such as Hebrew or Arabic. That is: normally GTK will order
 * containers appropriately depending on the text direction, e.g. to put labels
 * to the right of the thing they label when using an RTL language;
 * `GtkFixedLayout` won't be able to do that for you.
 *
 * Finally, fixed positioning makes it kind of annoying to add/remove UI
 * elements, since you have to reposition all the other  elements. This is a
 * long-term maintenance problem for your application.
 */
public open class FixedLayout(public val gtkFixedLayoutPointer: CPointer<GtkFixedLayout>) :
    LayoutManager(gtkFixedLayoutPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Creates a new `GtkFixedLayout`.
     *
     * @return the newly created `GtkFixedLayout`
     */
    public constructor() : this(gtk_fixed_layout_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<FixedLayout> {
        override val type: GeneratedClassKGType<FixedLayout> =
            GeneratedClassKGType(getTypeOrNull()!!) { FixedLayout(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FixedLayout
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_fixed_layout_get_type()

        /**
         * Gets the GType of from the symbol `gtk_fixed_layout_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_fixed_layout_get_type")
    }
}
