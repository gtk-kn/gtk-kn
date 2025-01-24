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
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkListBase
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkScrollable
import org.gtkkn.native.gtk.gtk_list_base_get_type

/**
 * `GtkListBase` is the abstract base class for GTK's list widgets.
 *
 * ## Skipped during bindings generation
 *
 * - method `orientation`: Property has no getter nor setter
 */
public abstract class ListBase(public val gtkListBasePointer: CPointer<GtkListBase>) :
    Widget(gtkListBasePointer.reinterpret()),
    Orientable,
    Scrollable,
    KGTyped {
    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The ListBaseImpl type represents a native instance of the abstract ListBase class.
     *
     * @constructor Creates a new instance of ListBase for the provided [CPointer].
     */
    public class ListBaseImpl(pointer: CPointer<GtkListBase>) : ListBase(pointer)

    public companion object : TypeCompanion<ListBase> {
        override val type: GeneratedClassKGType<ListBase> =
            GeneratedClassKGType(gtk_list_base_get_type()) { ListBaseImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ListBase
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_list_base_get_type()
    }
}
