// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gdk.GdkRGBA
import org.gtkkn.native.gdk.gdk_rgba_copy
import org.gtkkn.native.gdk.gdk_rgba_free
import org.gtkkn.native.gdk.gdk_rgba_hash
import org.gtkkn.native.gdk.gdk_rgba_is_clear
import org.gtkkn.native.gdk.gdk_rgba_is_opaque
import org.gtkkn.native.gdk.gdk_rgba_parse
import kotlin.Boolean
import kotlin.Float
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * A `GdkRGBA` is used to represent a color, in a way that is compatible
 * with cairo’s notion of color.
 *
 * `GdkRGBA` is a convenient way to pass colors around. It’s based on
 * cairo’s way to deal with colors and mirrors its behavior. All values
 * are in the range from 0.0 to 1.0 inclusive. So the color
 * (0.0, 0.0, 0.0, 0.0) represents transparent black and
 * (1.0, 1.0, 1.0, 1.0) is opaque white. Other values will
 * be clamped to this range when drawing.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `p2`: RGBA
 * - method `to_string`: C function gdk_rgba_to_string is ignored
 */
public class RGBA(
    pointer: CPointer<GdkRGBA>,
) : Record {
    public val gdkRGBAPointer: CPointer<GdkRGBA> = pointer

    /**
     * The intensity of the red channel from 0.0 to 1.0 inclusive
     */
    public var red: Float
        get() = gdkRGBAPointer.pointed.red
        set(`value`) {
            gdkRGBAPointer.pointed.red = value
        }

    /**
     * The intensity of the green channel from 0.0 to 1.0 inclusive
     */
    public var green: Float
        get() = gdkRGBAPointer.pointed.green
        set(`value`) {
            gdkRGBAPointer.pointed.green = value
        }

    /**
     * The intensity of the blue channel from 0.0 to 1.0 inclusive
     */
    public var blue: Float
        get() = gdkRGBAPointer.pointed.blue
        set(`value`) {
            gdkRGBAPointer.pointed.blue = value
        }

    /**
     * The opacity of the color from 0.0 for completely translucent to
     *   1.0 for opaque
     */
    public var alpha: Float
        get() = gdkRGBAPointer.pointed.alpha
        set(`value`) {
            gdkRGBAPointer.pointed.alpha = value
        }

    /**
     * Makes a copy of a `GdkRGBA`.
     *
     * The result must be freed through [method@Gdk.RGBA.free].
     *
     * @return A newly allocated `GdkRGBA`, with the same contents as @rgba
     */
    public fun copy(): RGBA =
        gdk_rgba_copy(gdkRGBAPointer.reinterpret())!!.run {
            RGBA(reinterpret())
        }

    /**
     * Frees a `GdkRGBA`.
     */
    public fun free(): Unit = gdk_rgba_free(gdkRGBAPointer.reinterpret())

    /**
     * A hash function suitable for using for a hash
     * table that stores `GdkRGBA`s.
     *
     * @return The hash value for @p
     */
    public fun hash(): UInt = gdk_rgba_hash(gdkRGBAPointer.reinterpret())

    /**
     * Checks if an @rgba value is transparent.
     *
     * That is, drawing with the value would not produce any change.
     *
     * @return true if the @rgba is clear
     */
    public fun isClear(): Boolean = gdk_rgba_is_clear(gdkRGBAPointer.reinterpret()).asBoolean()

    /**
     * Checks if an @rgba value is opaque.
     *
     * That is, drawing with the value will not retain any results
     * from previous contents.
     *
     * @return true if the @rgba is opaque
     */
    public fun isOpaque(): Boolean = gdk_rgba_is_opaque(gdkRGBAPointer.reinterpret()).asBoolean()

    /**
     * Parses a textual representation of a color.
     *
     * The string can be either one of:
     *
     * - A standard name (Taken from the CSS specification).
     * - A hexadecimal value in the form “\#rgb”, “\#rrggbb”,
     *   “\#rrrgggbbb” or ”\#rrrrggggbbbb”
     * - A hexadecimal value in the form “\#rgba”, “\#rrggbbaa”,
     *   or ”\#rrrrggggbbbbaaaa”
     * - A RGB color in the form “rgb(r,g,b)” (In this case the color
     *   will have full opacity)
     * - A RGBA color in the form “rgba(r,g,b,a)”
     * - A HSL color in the form "hsl(hue, saturation, lightness)"
     * - A HSLA color in the form "hsla(hue, saturation, lightness, alpha)"
     *
     * Where “r”, “g”, “b” and “a” are respectively the red, green,
     * blue and alpha color values. In the last two cases, “r”, “g”,
     * and “b” are either integers in the range 0 to 255 or percentage
     * values in the range 0% to 100%, and a is a floating point value
     * in the range 0 to 1.
     *
     * @param spec the string specifying the color
     * @return true if the parsing succeeded
     */
    public fun parse(spec: String): Boolean = gdk_rgba_parse(gdkRGBAPointer.reinterpret(), spec).asBoolean()

    public companion object : RecordCompanion<RGBA, GdkRGBA> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): RGBA = RGBA(pointer.reinterpret())
    }
}
