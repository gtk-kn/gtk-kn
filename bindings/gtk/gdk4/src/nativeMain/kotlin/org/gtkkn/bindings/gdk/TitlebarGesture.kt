// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkTitlebarGesture
import org.gtkkn.native.gdk.GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_DOUBLE_CLICK
import org.gtkkn.native.gdk.GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_MIDDLE_CLICK
import org.gtkkn.native.gdk.GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_RIGHT_CLICK

/**
 *
 * @since 4.4
 */
public enum class TitlebarGesture(
    public val nativeValue: GdkTitlebarGesture,
) {
    DOUBLE_CLICK(GDK_TITLEBAR_GESTURE_DOUBLE_CLICK),
    RIGHT_CLICK(GDK_TITLEBAR_GESTURE_RIGHT_CLICK),
    MIDDLE_CLICK(GDK_TITLEBAR_GESTURE_MIDDLE_CLICK),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkTitlebarGesture): TitlebarGesture =
            when (nativeValue) {
                GDK_TITLEBAR_GESTURE_DOUBLE_CLICK -> DOUBLE_CLICK
                GDK_TITLEBAR_GESTURE_RIGHT_CLICK -> RIGHT_CLICK
                GDK_TITLEBAR_GESTURE_MIDDLE_CLICK -> MIDDLE_CLICK
                else -> error("invalid nativeValue")
            }
    }
}
