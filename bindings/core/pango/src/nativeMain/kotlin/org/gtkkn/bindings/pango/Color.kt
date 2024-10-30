// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoColor
import org.gtkkn.native.pango.pango_color_copy
import org.gtkkn.native.pango.pango_color_free
import org.gtkkn.native.pango.pango_color_parse
import kotlin.Boolean
import kotlin.String
import kotlin.UShort
import kotlin.Unit

/**
 * The `PangoColor` structure is used to
 * represent a color in an uncalibrated RGB color-space.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `alpha`: alpha: Out parameter is not supported
 * - method `to_string`: C function pango_color_to_string is ignored
 */
public class Color(
    pointer: CPointer<PangoColor>,
) : Record {
    public val pangoColorPointer: CPointer<PangoColor> = pointer

    /**
     * value of red component
     */
    public var red: UShort
        get() = pangoColorPointer.pointed.red
        set(`value`) {
            pangoColorPointer.pointed.red = value
        }

    /**
     * value of green component
     */
    public var green: UShort
        get() = pangoColorPointer.pointed.green
        set(`value`) {
            pangoColorPointer.pointed.green = value
        }

    /**
     * value of blue component
     */
    public var blue: UShort
        get() = pangoColorPointer.pointed.blue
        set(`value`) {
            pangoColorPointer.pointed.blue = value
        }

    /**
     * Creates a copy of @src.
     *
     * The copy should be freed with [method@Pango.Color.free].
     * Primarily used by language bindings, not that useful
     * otherwise (since colors can just be copied by assignment
     * in C).
     *
     * @return the newly allocated `PangoColor`,
     *   which should be freed with [method@Pango.Color.free]
     */
    public fun copy(): Color? =
        pango_color_copy(pangoColorPointer.reinterpret())?.run {
            Color(reinterpret())
        }

    /**
     * Frees a color allocated by [method@Pango.Color.copy].
     */
    public fun free(): Unit = pango_color_free(pangoColorPointer.reinterpret())

    /**
     * Fill in the fields of a color from a string specification.
     *
     * The string can either one of a large set of standard names.
     * (Taken from the CSS Color [specification](https://www.w3.org/TR/css-color-4/#named-colors),
     * or it can be a value in the form `#rgb`, `#rrggbb`,
     * `#rrrgggbbb` or `#rrrrggggbbbb`, where `r`, `g` and `b`
     * are hex digits of the red, green, and blue components
     * of the color, respectively. (White in the four forms is
     * `#fff`, `#ffffff`, `#fffffffff` and `#ffffffffffff`.)
     *
     * @param spec a string specifying the new color
     * @return true if parsing of the specifier succeeded,
     *   otherwise false
     */
    public fun parse(spec: String): Boolean = pango_color_parse(pangoColorPointer.reinterpret(), spec).asBoolean()

    public companion object : RecordCompanion<Color, PangoColor> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Color = Color(pointer.reinterpret())
    }
}
