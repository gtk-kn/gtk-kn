// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAccessibleRange
import org.gtkkn.native.gtk.gtk_accessible_range_get_type

/**
 * This interface describes ranged controls, e.g. controls which have a single
 * value within an allowed range and that can optionally be changed by the user.
 *
 * This interface is expected to be implemented by controls using the following
 * roles:
 *
 * - `GTK_ACCESSIBLE_ROLE_METER`
 * - `GTK_ACCESSIBLE_ROLE_PROGRESS_BAR`
 * - `GTK_ACCESSIBLE_ROLE_SCROLLBAR`
 * - `GTK_ACCESSIBLE_ROLE_SLIDER`
 * - `GTK_ACCESSIBLE_ROLE_SPIN_BUTTON`
 *
 * If that is not the case, a warning will be issued at run time.
 *
 * In addition to this interface, its implementers are expected to provide the
 * correct values for the following properties:
 *
 * - `GTK_ACCESSIBLE_PROPERTY_VALUE_MAX`
 * - `GTK_ACCESSIBLE_PROPERTY_VALUE_MIN`
 * - `GTK_ACCESSIBLE_PROPERTY_VALUE_NOW`
 * - `GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT`
 * @since 4.10
 */
@GtkVersion4_10
public interface AccessibleRange :
    Proxy,
    Accessible,
    KGTyped {
    public val gtkAccessibleRangePointer: CPointer<GtkAccessibleRange>

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gtkAccessibleRangePointer.reinterpret()

    /**
     * The AccessibleRangeImpl type represents a native instance of the AccessibleRange interface.
     *
     * @constructor Creates a new instance of AccessibleRange for the provided [CPointer].
     */
    public class AccessibleRangeImpl(gtkAccessibleRangePointer: CPointer<GtkAccessibleRange>) :
        Object(gtkAccessibleRangePointer.reinterpret()),
        AccessibleRange {
        init {
            Gtk
        }

        override val gtkAccessibleRangePointer: CPointer<GtkAccessibleRange> =
            gtkAccessibleRangePointer
    }

    public companion object : TypeCompanion<AccessibleRange> {
        override val type: GeneratedInterfaceKGType<AccessibleRange> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { AccessibleRangeImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of AccessibleRange
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_accessible_range_get_type()

        /**
         * Gets the GType of from the symbol `gtk_accessible_range_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_accessible_range_get_type")
    }
}
