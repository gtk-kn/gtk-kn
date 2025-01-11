// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.gdk.GdkRGBA
import org.gtkkn.native.gdk.gdk_rgba_copy
import org.gtkkn.native.gdk.gdk_rgba_equal
import org.gtkkn.native.gdk.gdk_rgba_free
import org.gtkkn.native.gdk.gdk_rgba_get_type
import org.gtkkn.native.gdk.gdk_rgba_hash
import org.gtkkn.native.gdk.gdk_rgba_is_clear
import org.gtkkn.native.gdk.gdk_rgba_is_opaque
import org.gtkkn.native.gdk.gdk_rgba_parse
import org.gtkkn.native.gdk.gdk_rgba_to_string
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

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
 */
public class Rgba(public val gdkRgbaPointer: CPointer<GdkRGBA>, cleaner: Cleaner? = null) :
    ProxyInstance(gdkRgbaPointer) {
    /**
     * The intensity of the red channel from 0.0 to 1.0 inclusive
     */
    public var red: gfloat
        get() = gdkRgbaPointer.pointed.red

        @UnsafeFieldSetter
        set(`value`) {
            gdkRgbaPointer.pointed.red = value
        }

    /**
     * The intensity of the green channel from 0.0 to 1.0 inclusive
     */
    public var green: gfloat
        get() = gdkRgbaPointer.pointed.green

        @UnsafeFieldSetter
        set(`value`) {
            gdkRgbaPointer.pointed.green = value
        }

    /**
     * The intensity of the blue channel from 0.0 to 1.0 inclusive
     */
    public var blue: gfloat
        get() = gdkRgbaPointer.pointed.blue

        @UnsafeFieldSetter
        set(`value`) {
            gdkRgbaPointer.pointed.blue = value
        }

    /**
     * The opacity of the color from 0.0 for completely translucent to
     *   1.0 for opaque
     */
    public var alpha: gfloat
        get() = gdkRgbaPointer.pointed.alpha

        @UnsafeFieldSetter
        set(`value`) {
            gdkRgbaPointer.pointed.alpha = value
        }

    /**
     * Allocate a new Rgba.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GdkRGBA>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Rgba and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GdkRGBA>, Cleaner>,
    ) : this(gdkRgbaPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Rgba using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GdkRGBA>().ptr)

    /**
     * Allocate a new Rgba.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param red The intensity of the red channel from 0.0 to 1.0 inclusive
     * @param green The intensity of the green channel from 0.0 to 1.0 inclusive
     * @param blue The intensity of the blue channel from 0.0 to 1.0 inclusive
     * @param alpha The opacity of the color from 0.0 for completely translucent to
     *   1.0 for opaque
     */
    public constructor(
        red: gfloat,
        green: gfloat,
        blue: gfloat,
        alpha: gfloat,
    ) : this() {
        this.red = red
        this.green = green
        this.blue = blue
        this.alpha = alpha
    }

    /**
     * Allocate a new Rgba using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param red The intensity of the red channel from 0.0 to 1.0 inclusive
     * @param green The intensity of the green channel from 0.0 to 1.0 inclusive
     * @param blue The intensity of the blue channel from 0.0 to 1.0 inclusive
     * @param alpha The opacity of the color from 0.0 for completely translucent to
     *   1.0 for opaque
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        red: gfloat,
        green: gfloat,
        blue: gfloat,
        alpha: gfloat,
        scope: AutofreeScope,
    ) : this(scope) {
        this.red = red
        this.green = green
        this.blue = blue
        this.alpha = alpha
    }

    /**
     * Makes a copy of a `GdkRGBA`.
     *
     * The result must be freed through [method@Gdk.RGBA.free].
     *
     * @return A newly allocated `GdkRGBA`, with the same contents as @rgba
     */
    public fun copy(): Rgba = gdk_rgba_copy(gdkRgbaPointer)!!.run {
        Rgba(this)
    }

    /**
     * Compares two `GdkRGBA` colors.
     *
     * @param p2 another `GdkRGBA`
     * @return true if the two colors compare equal
     */
    public fun equal(p2: Rgba): Boolean = gdk_rgba_equal(gdkRgbaPointer, p2.gdkRgbaPointer).asBoolean()

    /**
     * Frees a `GdkRGBA`.
     */
    public fun free(): Unit = gdk_rgba_free(gdkRgbaPointer)

    /**
     * A hash function suitable for using for a hash
     * table that stores `GdkRGBA`s.
     *
     * @return The hash value for @p
     */
    public fun hash(): guint = gdk_rgba_hash(gdkRgbaPointer)

    /**
     * Checks if an @rgba value is transparent.
     *
     * That is, drawing with the value would not produce any change.
     *
     * @return true if the @rgba is clear
     */
    public fun isClear(): Boolean = gdk_rgba_is_clear(gdkRgbaPointer).asBoolean()

    /**
     * Checks if an @rgba value is opaque.
     *
     * That is, drawing with the value will not retain any results
     * from previous contents.
     *
     * @return true if the @rgba is opaque
     */
    public fun isOpaque(): Boolean = gdk_rgba_is_opaque(gdkRgbaPointer).asBoolean()

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
    public fun parse(spec: String): Boolean = gdk_rgba_parse(gdkRgbaPointer, spec).asBoolean()

    /**
     * Returns a textual specification of @rgba in the form
     * `rgb(r,g,b)` or `rgba(r,g,b,a)`, where “r”, “g”, “b” and
     * “a” represent the red, green, blue and alpha values
     * respectively. “r”, “g”, and “b” are represented as integers
     * in the range 0 to 255, and “a” is represented as a floating
     * point value in the range 0 to 1.
     *
     * These string forms are string forms that are supported by
     * the CSS3 colors module, and can be parsed by [method@Gdk.RGBA.parse].
     *
     * Note that this string representation may lose some precision,
     * since “r”, “g” and “b” are represented as 8-bit integers. If
     * this is a concern, you should use a different representation.
     *
     * @return A newly allocated text string
     */
    override fun toString(): String =
        gdk_rgba_to_string(gdkRgbaPointer)?.toKString() ?: error("Expected not null string")

    public companion object {
        /**
         * Get the GType of RGBA
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_rgba_get_type()
    }
}
