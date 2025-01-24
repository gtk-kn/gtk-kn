// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkRevealerTransitionType
import org.gtkkn.native.gtk.gtk_revealer_transition_type_get_type

/**
 * These enumeration values describe the possible transitions
 * when the child of a `GtkRevealer` widget is shown or hidden.
 */
public enum class RevealerTransitionType(public val nativeValue: GtkRevealerTransitionType) {
    /**
     * No transition
     */
    NONE(GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_NONE),

    /**
     * Fade in
     */
    CROSSFADE(GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_CROSSFADE),

    /**
     * Slide in from the left
     */
    SLIDE_RIGHT(GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT),

    /**
     * Slide in from the right
     */
    SLIDE_LEFT(GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT),

    /**
     * Slide in from the bottom
     */
    SLIDE_UP(GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP),

    /**
     * Slide in from the top
     */
    SLIDE_DOWN(GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN),

    /**
     * Floop in from the left
     */
    SWING_RIGHT(GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT),

    /**
     * Floop in from the right
     */
    SWING_LEFT(GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT),

    /**
     * Floop in from the bottom
     */
    SWING_UP(GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_UP),

    /**
     * Floop in from the top
     */
    SWING_DOWN(GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkRevealerTransitionType): RevealerTransitionType =
            when (nativeValue) {
                GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_NONE -> NONE
                GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_CROSSFADE -> CROSSFADE
                GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT -> SLIDE_RIGHT
                GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT -> SLIDE_LEFT
                GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP -> SLIDE_UP
                GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN -> SLIDE_DOWN
                GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT -> SWING_RIGHT
                GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT -> SWING_LEFT
                GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_UP -> SWING_UP
                GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN -> SWING_DOWN
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of RevealerTransitionType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_revealer_transition_type_get_type()
    }
}
