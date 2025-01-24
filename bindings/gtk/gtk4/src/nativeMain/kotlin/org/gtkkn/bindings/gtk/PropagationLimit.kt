// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPropagationLimit
import org.gtkkn.native.gtk.gtk_propagation_limit_get_type

/**
 * Describes limits of a [class@EventController] for handling events
 * targeting other widgets.
 */
public enum class PropagationLimit(public val nativeValue: GtkPropagationLimit) {
    /**
     * Events are handled regardless of what their
     *   target is.
     */
    NONE(GtkPropagationLimit.GTK_LIMIT_NONE),

    /**
     * Events are only handled if their target
     *   is in the same [iface@Native] as the event controllers widget. Note
     *   that some event types have two targets (origin and destination).
     */
    SAME_NATIVE(GtkPropagationLimit.GTK_LIMIT_SAME_NATIVE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPropagationLimit): PropagationLimit = when (nativeValue) {
            GtkPropagationLimit.GTK_LIMIT_NONE -> NONE
            GtkPropagationLimit.GTK_LIMIT_SAME_NATIVE -> SAME_NATIVE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PropagationLimit
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_propagation_limit_get_type()
    }
}
