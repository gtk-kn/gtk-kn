// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPadActionType
import org.gtkkn.native.gtk.gtk_pad_action_type_get_type

/**
 * The type of a pad action.
 */
public enum class PadActionType(public val nativeValue: GtkPadActionType) {
    /**
     * Action is triggered by a pad button
     */
    BUTTON(GtkPadActionType.GTK_PAD_ACTION_BUTTON),

    /**
     * Action is triggered by a pad ring
     */
    RING(GtkPadActionType.GTK_PAD_ACTION_RING),

    /**
     * Action is triggered by a pad strip
     */
    STRIP(GtkPadActionType.GTK_PAD_ACTION_STRIP),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPadActionType): PadActionType = when (nativeValue) {
            GtkPadActionType.GTK_PAD_ACTION_BUTTON -> BUTTON
            GtkPadActionType.GTK_PAD_ACTION_RING -> RING
            GtkPadActionType.GTK_PAD_ACTION_STRIP -> STRIP
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PadActionType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_pad_action_type_get_type()
    }
}
