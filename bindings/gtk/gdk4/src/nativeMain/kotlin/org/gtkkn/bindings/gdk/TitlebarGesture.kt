// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.bindings.gdk.annotations.GdkVersion4_4
import org.gtkkn.native.gdk.GdkTitlebarGesture
import org.gtkkn.native.gdk.gdk_titlebar_gesture_get_type
import org.gtkkn.native.gobject.GType

/**
 *
 * @since 4.4
 */
@GdkVersion4_4
public enum class TitlebarGesture(public val nativeValue: GdkTitlebarGesture) {
    DOUBLE_CLICK(GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_DOUBLE_CLICK),
    RIGHT_CLICK(GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_RIGHT_CLICK),
    MIDDLE_CLICK(GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_MIDDLE_CLICK),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkTitlebarGesture): TitlebarGesture = when (nativeValue) {
            GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_DOUBLE_CLICK -> DOUBLE_CLICK
            GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_RIGHT_CLICK -> RIGHT_CLICK
            GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_MIDDLE_CLICK -> MIDDLE_CLICK
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TitlebarGesture
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_titlebar_gesture_get_type()
    }
}
