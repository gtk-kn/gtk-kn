// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkOverflow
import org.gtkkn.native.gtk.gtk_overflow_get_type

/**
 * Defines how content overflowing a given area should be handled.
 *
 * This is used in [method@Gtk.Widget.set_overflow]. The
 * [property@Gtk.Widget:overflow] property is modeled after the
 * CSS overflow property, but implements it only partially.
 */
public enum class Overflow(public val nativeValue: GtkOverflow) {
    /**
     * No change is applied. Content is drawn at the specified
     *   position.
     */
    VISIBLE(GtkOverflow.GTK_OVERFLOW_VISIBLE),

    /**
     * Content is clipped to the bounds of the area. Content
     *   outside the area is not drawn and cannot be interacted with.
     */
    HIDDEN(GtkOverflow.GTK_OVERFLOW_HIDDEN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkOverflow): Overflow = when (nativeValue) {
            GtkOverflow.GTK_OVERFLOW_VISIBLE -> VISIBLE
            GtkOverflow.GTK_OVERFLOW_HIDDEN -> HIDDEN
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Overflow
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_overflow_get_type()
    }
}
