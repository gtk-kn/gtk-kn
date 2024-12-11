// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.pango.annotations.PangoVersion1_44
import org.gtkkn.bindings.pango.annotations.PangoVersion1_6
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.pango.PangoFontMetrics
import org.gtkkn.native.pango.pango_font_metrics_get_approximate_char_width
import org.gtkkn.native.pango.pango_font_metrics_get_approximate_digit_width
import org.gtkkn.native.pango.pango_font_metrics_get_ascent
import org.gtkkn.native.pango.pango_font_metrics_get_descent
import org.gtkkn.native.pango.pango_font_metrics_get_height
import org.gtkkn.native.pango.pango_font_metrics_get_strikethrough_position
import org.gtkkn.native.pango.pango_font_metrics_get_strikethrough_thickness
import org.gtkkn.native.pango.pango_font_metrics_get_type
import org.gtkkn.native.pango.pango_font_metrics_get_underline_position
import org.gtkkn.native.pango.pango_font_metrics_get_underline_thickness
import org.gtkkn.native.pango.pango_font_metrics_ref
import org.gtkkn.native.pango.pango_font_metrics_unref
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A `PangoFontMetrics` structure holds the overall metric information
 * for a font.
 *
 * The information in a `PangoFontMetrics` structure may be restricted
 * to a script. The fields of this structure are private to implementations
 * of a font backend. See the documentation of the corresponding getters
 * for documentation of their meaning.
 *
 * For an overview of the most important metrics, see:
 *
 * <picture>
 *   <source srcset="fontmetrics-dark.png" media="(prefers-color-scheme: dark)">
 *   <img alt="Font metrics" src="fontmetrics-light.png">
 * </picture>
 *
 * ## Skipped during bindings generation
 *
 * - field `ref_count`: Record field ref_count is private
 * - field `ascent`: Record field ascent is private
 * - field `descent`: Record field descent is private
 * - field `height`: Record field height is private
 * - field `approximate_char_width`: Record field approximate_char_width is private
 * - field `approximate_digit_width`: Record field approximate_digit_width is private
 * - field `underline_position`: Record field underline_position is private
 * - field `underline_thickness`: Record field underline_thickness is private
 * - field `strikethrough_position`: Record field strikethrough_position is private
 * - field `strikethrough_thickness`: Record field strikethrough_thickness is private
 */
public class FontMetrics(pointer: CPointer<PangoFontMetrics>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val pangoFontMetricsPointer: CPointer<PangoFontMetrics> = pointer

    /**
     * Allocate a new FontMetrics.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoFontMetrics>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to FontMetrics and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoFontMetrics>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new FontMetrics using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoFontMetrics>().ptr)

    /**
     * Gets the approximate character width for a font metrics structure.
     *
     * This is merely a representative value useful, for example, for
     * determining the initial size for a window. Actual characters in
     * text will be wider and narrower than this.
     *
     * @return the character width, in Pango units.
     */
    public fun getApproximateCharWidth(): gint =
        pango_font_metrics_get_approximate_char_width(pangoFontMetricsPointer.reinterpret())

    /**
     * Gets the approximate digit width for a font metrics structure.
     *
     * This is merely a representative value useful, for example, for
     * determining the initial size for a window. Actual digits in
     * text can be wider or narrower than this, though this value
     * is generally somewhat more accurate than the result of
     * pango_font_metrics_get_approximate_char_width() for digits.
     *
     * @return the digit width, in Pango units.
     */
    public fun getApproximateDigitWidth(): gint =
        pango_font_metrics_get_approximate_digit_width(pangoFontMetricsPointer.reinterpret())

    /**
     * Gets the ascent from a font metrics structure.
     *
     * The ascent is the distance from the baseline to the logical top
     * of a line of text. (The logical top may be above or below the top
     * of the actual drawn ink. It is necessary to lay out the text to
     * figure where the ink will be.)
     *
     * @return the ascent, in Pango units.
     */
    public fun getAscent(): gint = pango_font_metrics_get_ascent(pangoFontMetricsPointer.reinterpret())

    /**
     * Gets the descent from a font metrics structure.
     *
     * The descent is the distance from the baseline to the logical bottom
     * of a line of text. (The logical bottom may be above or below the
     * bottom of the actual drawn ink. It is necessary to lay out the text
     * to figure where the ink will be.)
     *
     * @return the descent, in Pango units.
     */
    public fun getDescent(): gint = pango_font_metrics_get_descent(pangoFontMetricsPointer.reinterpret())

    /**
     * Gets the line height from a font metrics structure.
     *
     * The line height is the recommended distance between successive
     * baselines in wrapped text using this font.
     *
     * If the line height is not available, 0 is returned.
     *
     * @return the height, in Pango units
     * @since 1.44
     */
    @PangoVersion1_44
    public fun getHeight(): gint = pango_font_metrics_get_height(pangoFontMetricsPointer.reinterpret())

    /**
     * Gets the suggested position to draw the strikethrough.
     *
     * The value returned is the distance *above* the
     * baseline of the top of the strikethrough.
     *
     * @return the suggested strikethrough position, in Pango units.
     * @since 1.6
     */
    @PangoVersion1_6
    public fun getStrikethroughPosition(): gint =
        pango_font_metrics_get_strikethrough_position(pangoFontMetricsPointer.reinterpret())

    /**
     * Gets the suggested thickness to draw for the strikethrough.
     *
     * @return the suggested strikethrough thickness, in Pango units.
     * @since 1.6
     */
    @PangoVersion1_6
    public fun getStrikethroughThickness(): gint =
        pango_font_metrics_get_strikethrough_thickness(pangoFontMetricsPointer.reinterpret())

    /**
     * Gets the suggested position to draw the underline.
     *
     * The value returned is the distance *above* the baseline of the top
     * of the underline. Since most fonts have underline positions beneath
     * the baseline, this value is typically negative.
     *
     * @return the suggested underline position, in Pango units.
     * @since 1.6
     */
    @PangoVersion1_6
    public fun getUnderlinePosition(): gint =
        pango_font_metrics_get_underline_position(pangoFontMetricsPointer.reinterpret())

    /**
     * Gets the suggested thickness to draw for the underline.
     *
     * @return the suggested underline thickness, in Pango units.
     * @since 1.6
     */
    @PangoVersion1_6
    public fun getUnderlineThickness(): gint =
        pango_font_metrics_get_underline_thickness(pangoFontMetricsPointer.reinterpret())

    /**
     * Increase the reference count of a font metrics structure by one.
     *
     * @return @metrics
     */
    public fun ref(): FontMetrics? = pango_font_metrics_ref(pangoFontMetricsPointer.reinterpret())?.run {
        FontMetrics(reinterpret())
    }

    /**
     * Decrease the reference count of a font metrics structure by one.
     *
     * If the result is zero, frees the structure and any associated memory.
     */
    public fun unref(): Unit = pango_font_metrics_unref(pangoFontMetricsPointer.reinterpret())

    public companion object {
        /**
         * Get the GType of FontMetrics
         *
         * @return the GType
         */
        public fun getType(): GType = pango_font_metrics_get_type()
    }
}
