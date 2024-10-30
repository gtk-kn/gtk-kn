// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkShortcutType
import org.gtkkn.native.gtk.GtkShortcutType.GTK_SHORTCUT_ACCELERATOR
import org.gtkkn.native.gtk.GtkShortcutType.GTK_SHORTCUT_GESTURE
import org.gtkkn.native.gtk.GtkShortcutType.GTK_SHORTCUT_GESTURE_PINCH
import org.gtkkn.native.gtk.GtkShortcutType.GTK_SHORTCUT_GESTURE_ROTATE_CLOCKWISE
import org.gtkkn.native.gtk.GtkShortcutType.GTK_SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE
import org.gtkkn.native.gtk.GtkShortcutType.GTK_SHORTCUT_GESTURE_STRETCH
import org.gtkkn.native.gtk.GtkShortcutType.GTK_SHORTCUT_GESTURE_SWIPE_LEFT
import org.gtkkn.native.gtk.GtkShortcutType.GTK_SHORTCUT_GESTURE_SWIPE_RIGHT
import org.gtkkn.native.gtk.GtkShortcutType.GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT
import org.gtkkn.native.gtk.GtkShortcutType.GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT

/**
 * GtkShortcutType specifies the kind of shortcut that is being described.
 *
 * More values may be added to this enumeration over time.
 */
public enum class ShortcutType(
    public val nativeValue: GtkShortcutType,
) {
    /**
     * The shortcut is a keyboard accelerator. The GtkShortcutsShortcut:accelerator
     *   property will be used.
     */
    ACCELERATOR(GTK_SHORTCUT_ACCELERATOR),

    /**
     * The shortcut is a pinch gesture. GTK provides an icon and subtitle.
     */
    GESTURE_PINCH(GTK_SHORTCUT_GESTURE_PINCH),

    /**
     * The shortcut is a stretch gesture. GTK provides an icon and subtitle.
     */
    GESTURE_STRETCH(GTK_SHORTCUT_GESTURE_STRETCH),

    /**
     * The shortcut is a clockwise rotation gesture. GTK provides an icon and subtitle.
     */
    GESTURE_ROTATE_CLOCKWISE(GTK_SHORTCUT_GESTURE_ROTATE_CLOCKWISE),

    /**
     * The shortcut is a counterclockwise rotation gesture. GTK provides an icon and subtitle.
     */
    GESTURE_ROTATE_COUNTERCLOCKWISE(GTK_SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE),

    /**
     * The shortcut is a two-finger swipe gesture. GTK provides an icon and subtitle.
     */
    GESTURE_TWO_FINGER_SWIPE_LEFT(GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT),

    /**
     * The shortcut is a two-finger swipe gesture. GTK provides an icon and subtitle.
     */
    GESTURE_TWO_FINGER_SWIPE_RIGHT(GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT),

    /**
     * The shortcut is a gesture. The GtkShortcutsShortcut:icon property will be
     *   used.
     */
    GESTURE(GTK_SHORTCUT_GESTURE),

    /**
     * The shortcut is a swipe gesture. GTK provides an icon and subtitle.
     */
    GESTURE_SWIPE_LEFT(GTK_SHORTCUT_GESTURE_SWIPE_LEFT),

    /**
     * The shortcut is a swipe gesture. GTK provides an icon and subtitle.
     */
    GESTURE_SWIPE_RIGHT(GTK_SHORTCUT_GESTURE_SWIPE_RIGHT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkShortcutType): ShortcutType =
            when (nativeValue) {
                GTK_SHORTCUT_ACCELERATOR -> ACCELERATOR
                GTK_SHORTCUT_GESTURE_PINCH -> GESTURE_PINCH
                GTK_SHORTCUT_GESTURE_STRETCH -> GESTURE_STRETCH
                GTK_SHORTCUT_GESTURE_ROTATE_CLOCKWISE -> GESTURE_ROTATE_CLOCKWISE
                GTK_SHORTCUT_GESTURE_ROTATE_COUNTERCLOCKWISE -> GESTURE_ROTATE_COUNTERCLOCKWISE
                GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_LEFT -> GESTURE_TWO_FINGER_SWIPE_LEFT
                GTK_SHORTCUT_GESTURE_TWO_FINGER_SWIPE_RIGHT -> GESTURE_TWO_FINGER_SWIPE_RIGHT
                GTK_SHORTCUT_GESTURE -> GESTURE
                GTK_SHORTCUT_GESTURE_SWIPE_LEFT -> GESTURE_SWIPE_LEFT
                GTK_SHORTCUT_GESTURE_SWIPE_RIGHT -> GESTURE_SWIPE_RIGHT
                else -> error("invalid nativeValue")
            }
    }
}