// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkInputSource
import org.gtkkn.native.gdk.GdkInputSource.GDK_SOURCE_KEYBOARD
import org.gtkkn.native.gdk.GdkInputSource.GDK_SOURCE_MOUSE
import org.gtkkn.native.gdk.GdkInputSource.GDK_SOURCE_PEN
import org.gtkkn.native.gdk.GdkInputSource.GDK_SOURCE_TABLET_PAD
import org.gtkkn.native.gdk.GdkInputSource.GDK_SOURCE_TOUCHPAD
import org.gtkkn.native.gdk.GdkInputSource.GDK_SOURCE_TOUCHSCREEN
import org.gtkkn.native.gdk.GdkInputSource.GDK_SOURCE_TRACKPOINT

/**
 * An enumeration describing the type of an input device in general terms.
 */
public enum class InputSource(
    public val nativeValue: GdkInputSource,
) {
    /**
     * the device is a mouse. (This will be reported for the core
     *   pointer, even if it is something else, such as a trackball.)
     */
    MOUSE(GDK_SOURCE_MOUSE),

    /**
     * the device is a stylus of a graphics tablet or similar device.
     */
    PEN(GDK_SOURCE_PEN),

    /**
     * the device is a keyboard.
     */
    KEYBOARD(GDK_SOURCE_KEYBOARD),

    /**
     * the device is a direct-input touch device, such
     *   as a touchscreen or tablet
     */
    TOUCHSCREEN(GDK_SOURCE_TOUCHSCREEN),

    /**
     * the device is an indirect touch device, such
     *   as a touchpad
     */
    TOUCHPAD(GDK_SOURCE_TOUCHPAD),

    /**
     * the device is a trackpoint
     */
    TRACKPOINT(GDK_SOURCE_TRACKPOINT),

    /**
     * the device is a "pad", a collection of buttons,
     *   rings and strips found in drawing tablets
     */
    TABLET_PAD(GDK_SOURCE_TABLET_PAD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkInputSource): InputSource =
            when (nativeValue) {
                GDK_SOURCE_MOUSE -> MOUSE
                GDK_SOURCE_PEN -> PEN
                GDK_SOURCE_KEYBOARD -> KEYBOARD
                GDK_SOURCE_TOUCHSCREEN -> TOUCHSCREEN
                GDK_SOURCE_TOUCHPAD -> TOUCHPAD
                GDK_SOURCE_TRACKPOINT -> TRACKPOINT
                GDK_SOURCE_TABLET_PAD -> TABLET_PAD
                else -> error("invalid nativeValue")
            }
    }
}
