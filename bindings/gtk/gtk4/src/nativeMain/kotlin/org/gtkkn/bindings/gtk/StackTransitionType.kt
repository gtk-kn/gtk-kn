// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkStackTransitionType

/**
 * Possible transitions between pages in a `GtkStack` widget.
 *
 * New values may be added to this enumeration over time.
 */
public enum class StackTransitionType(
    public val nativeValue: GtkStackTransitionType,
) {
    /**
     * No transition
     */
    NONE(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_NONE),

    /**
     * A cross-fade
     */
    CROSSFADE(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_CROSSFADE),

    /**
     * Slide from left to right
     */
    SLIDE_RIGHT(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_RIGHT),

    /**
     * Slide from right to left
     */
    SLIDE_LEFT(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT),

    /**
     * Slide from bottom up
     */
    SLIDE_UP(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_UP),

    /**
     * Slide from top down
     */
    SLIDE_DOWN(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_DOWN),

    /**
     * Slide from left or right according to the children order
     */
    SLIDE_LEFT_RIGHT(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT_RIGHT),

    /**
     * Slide from top down or bottom up according to the order
     */
    SLIDE_UP_DOWN(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_UP_DOWN),

    /**
     * Cover the old page by sliding up
     */
    OVER_UP(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_UP),

    /**
     * Cover the old page by sliding down
     */
    OVER_DOWN(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_DOWN),

    /**
     * Cover the old page by sliding to the left
     */
    OVER_LEFT(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_LEFT),

    /**
     * Cover the old page by sliding to the right
     */
    OVER_RIGHT(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_RIGHT),

    /**
     * Uncover the new page by sliding up
     */
    UNDER_UP(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_UP),

    /**
     * Uncover the new page by sliding down
     */
    UNDER_DOWN(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_DOWN),

    /**
     * Uncover the new page by sliding to the left
     */
    UNDER_LEFT(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_LEFT),

    /**
     * Uncover the new page by sliding to the right
     */
    UNDER_RIGHT(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_RIGHT),

    /**
     * Cover the old page sliding up or uncover the new page sliding down, according to order
     */
    OVER_UP_DOWN(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_UP_DOWN),

    /**
     * Cover the old page sliding down or uncover the new page sliding up, according to order
     */
    OVER_DOWN_UP(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_DOWN_UP),

    /**
     * Cover the old page sliding left or uncover the new page sliding right, according to order
     */
    OVER_LEFT_RIGHT(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_LEFT_RIGHT),

    /**
     * Cover the old page sliding right or uncover the new page sliding left, according to order
     */
    OVER_RIGHT_LEFT(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_RIGHT_LEFT),

    /**
     * Pretend the pages are sides of a cube and rotate that cube to the left
     */
    ROTATE_LEFT(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT),

    /**
     * Pretend the pages are sides of a cube and rotate that cube to the right
     */
    ROTATE_RIGHT(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_ROTATE_RIGHT),

    /**
     * Pretend the pages are sides of a cube and rotate that cube to the left or right according to the children order
     */
    ROTATE_LEFT_RIGHT(GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT_RIGHT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkStackTransitionType): StackTransitionType =
            when (nativeValue) {
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_NONE -> NONE
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_CROSSFADE -> CROSSFADE
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_RIGHT -> SLIDE_RIGHT
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT -> SLIDE_LEFT
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_UP -> SLIDE_UP
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_DOWN -> SLIDE_DOWN
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT_RIGHT -> SLIDE_LEFT_RIGHT
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_UP_DOWN -> SLIDE_UP_DOWN
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_UP -> OVER_UP
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_DOWN -> OVER_DOWN
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_LEFT -> OVER_LEFT
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_RIGHT -> OVER_RIGHT
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_UP -> UNDER_UP
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_DOWN -> UNDER_DOWN
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_LEFT -> UNDER_LEFT
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_RIGHT -> UNDER_RIGHT
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_UP_DOWN -> OVER_UP_DOWN
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_DOWN_UP -> OVER_DOWN_UP
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_LEFT_RIGHT -> OVER_LEFT_RIGHT
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_RIGHT_LEFT -> OVER_RIGHT_LEFT
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT -> ROTATE_LEFT
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_ROTATE_RIGHT -> ROTATE_RIGHT
                GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT_RIGHT -> ROTATE_LEFT_RIGHT
                else -> error("invalid nativeValue")
            }
    }
}
