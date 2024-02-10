// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkRevealerTransitionType
import org.gtkkn.native.gtk.GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_CROSSFADE
import org.gtkkn.native.gtk.GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_NONE
import org.gtkkn.native.gtk.GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN
import org.gtkkn.native.gtk.GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT
import org.gtkkn.native.gtk.GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT
import org.gtkkn.native.gtk.GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP
import org.gtkkn.native.gtk.GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN
import org.gtkkn.native.gtk.GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT
import org.gtkkn.native.gtk.GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT
import org.gtkkn.native.gtk.GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_UP

/**
 * These enumeration values describe the possible transitions
 * when the child of a `GtkRevealer` widget is shown or hidden.
 */
public enum class RevealerTransitionType(
    public val nativeValue: GtkRevealerTransitionType,
) {
    /**
     * No transition
     */
    NONE(GTK_REVEALER_TRANSITION_TYPE_NONE),

    /**
     * Fade in
     */
    CROSSFADE(GTK_REVEALER_TRANSITION_TYPE_CROSSFADE),

    /**
     * Slide in from the left
     */
    SLIDE_RIGHT(GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT),

    /**
     * Slide in from the right
     */
    SLIDE_LEFT(GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT),

    /**
     * Slide in from the bottom
     */
    SLIDE_UP(GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP),

    /**
     * Slide in from the top
     */
    SLIDE_DOWN(GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN),

    /**
     * Floop in from the left
     */
    SWING_RIGHT(GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT),

    /**
     * Floop in from the right
     */
    SWING_LEFT(GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT),

    /**
     * Floop in from the bottom
     */
    SWING_UP(GTK_REVEALER_TRANSITION_TYPE_SWING_UP),

    /**
     * Floop in from the top
     */
    SWING_DOWN(GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkRevealerTransitionType): RevealerTransitionType =
            when (nativeValue) {
                GTK_REVEALER_TRANSITION_TYPE_NONE -> NONE
                GTK_REVEALER_TRANSITION_TYPE_CROSSFADE -> CROSSFADE
                GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT -> SLIDE_RIGHT
                GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT -> SLIDE_LEFT
                GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP -> SLIDE_UP
                GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN -> SLIDE_DOWN
                GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT -> SWING_RIGHT
                GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT -> SWING_LEFT
                GTK_REVEALER_TRANSITION_TYPE_SWING_UP -> SWING_UP
                GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN -> SWING_DOWN
                else -> error("invalid nativeValue")
            }
    }
}
