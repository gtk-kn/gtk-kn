// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoFontDescription
import org.gtkkn.native.pango.pango_font_description_better_match
import org.gtkkn.native.pango.pango_font_description_copy
import org.gtkkn.native.pango.pango_font_description_copy_static
import org.gtkkn.native.pango.pango_font_description_equal
import org.gtkkn.native.pango.pango_font_description_free
import org.gtkkn.native.pango.pango_font_description_from_string
import org.gtkkn.native.pango.pango_font_description_get_family
import org.gtkkn.native.pango.pango_font_description_get_gravity
import org.gtkkn.native.pango.pango_font_description_get_set_fields
import org.gtkkn.native.pango.pango_font_description_get_size
import org.gtkkn.native.pango.pango_font_description_get_size_is_absolute
import org.gtkkn.native.pango.pango_font_description_get_stretch
import org.gtkkn.native.pango.pango_font_description_get_style
import org.gtkkn.native.pango.pango_font_description_get_variant
import org.gtkkn.native.pango.pango_font_description_get_variations
import org.gtkkn.native.pango.pango_font_description_get_weight
import org.gtkkn.native.pango.pango_font_description_hash
import org.gtkkn.native.pango.pango_font_description_merge
import org.gtkkn.native.pango.pango_font_description_merge_static
import org.gtkkn.native.pango.pango_font_description_new
import org.gtkkn.native.pango.pango_font_description_set_absolute_size
import org.gtkkn.native.pango.pango_font_description_set_family
import org.gtkkn.native.pango.pango_font_description_set_family_static
import org.gtkkn.native.pango.pango_font_description_set_gravity
import org.gtkkn.native.pango.pango_font_description_set_size
import org.gtkkn.native.pango.pango_font_description_set_stretch
import org.gtkkn.native.pango.pango_font_description_set_style
import org.gtkkn.native.pango.pango_font_description_set_variant
import org.gtkkn.native.pango.pango_font_description_set_variations
import org.gtkkn.native.pango.pango_font_description_set_variations_static
import org.gtkkn.native.pango.pango_font_description_set_weight
import org.gtkkn.native.pango.pango_font_description_to_filename
import org.gtkkn.native.pango.pango_font_description_unset_fields
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * A `PangoFontDescription` describes a font in an implementation-independent
 * manner.
 *
 * `PangoFontDescription` structures are used both to list what fonts are
 * available on the system and also for specifying the characteristics of
 * a font to load.
 *
 * ## Skipped during bindings generation
 *
 * - method `to_string`: C function pango_font_description_to_string is ignored
 */
public class FontDescription(
    pointer: CPointer<PangoFontDescription>,
) : Record {
    public val pangoFontDescriptionPointer: CPointer<PangoFontDescription> = pointer

    /**
     * Determines if the style attributes of @new_match are a closer match
     * for @desc than those of @old_match are, or if @old_match is null,
     * determines if @new_match is a match at all.
     *
     * Approximate matching is done for weight and style; other style attributes
     * must match exactly. Style attributes are all attributes other than family
     * and size-related attributes. Approximate matching for style considers
     * %PANGO_STYLE_OBLIQUE and %PANGO_STYLE_ITALIC as matches, but not as good
     * a match as when the styles are equal.
     *
     * Note that @old_match must match @desc.
     *
     * @param oldMatch a `PangoFontDescription`, or null
     * @param newMatch a `PangoFontDescription`
     * @return true if @new_match is a better match
     */
    public fun betterMatch(
        oldMatch: FontDescription? = null,
        newMatch: FontDescription,
    ): Boolean =
        pango_font_description_better_match(
            pangoFontDescriptionPointer.reinterpret(),
            oldMatch?.pangoFontDescriptionPointer,
            newMatch.pangoFontDescriptionPointer
        ).asBoolean()

    /**
     * Make a copy of a `PangoFontDescription`.
     *
     * @return the newly allocated `PangoFontDescription`,
     *   which should be freed with [method@Pango.FontDescription.free],
     *   or null if @desc was null.
     */
    public fun copy(): FontDescription? =
        pango_font_description_copy(pangoFontDescriptionPointer.reinterpret())?.run {
            FontDescription(reinterpret())
        }

    /**
     * Make a copy of a `PangoFontDescription`, but don't duplicate
     * allocated fields.
     *
     * This is like [method@Pango.FontDescription.copy], but only a shallow
     * copy is made of the family name and other allocated fields. The result
     * can only be used until @desc is modified or freed. This is meant
     * to be used when the copy is only needed temporarily.
     *
     * @return the newly allocated `PangoFontDescription`,
     *   which should be freed with [method@Pango.FontDescription.free],
     *   or null if @desc was null.
     */
    public fun copyStatic(): FontDescription? =
        pango_font_description_copy_static(pangoFontDescriptionPointer.reinterpret())?.run {
            FontDescription(reinterpret())
        }

    /**
     * Compares two font descriptions for equality.
     *
     * Two font descriptions are considered equal if the fonts they describe
     * are provably identical. This means that their masks do not have to match,
     * as long as other fields are all the same. (Two font descriptions may
     * result in identical fonts being loaded, but still compare false.)
     *
     * @param desc2 another `PangoFontDescription`
     * @return true if the two font descriptions are identical,
     *   false otherwise.
     */
    public fun equal(desc2: FontDescription): Boolean =
        pango_font_description_equal(
            pangoFontDescriptionPointer.reinterpret(),
            desc2.pangoFontDescriptionPointer
        ).asBoolean()

    /**
     * Frees a font description.
     */
    public fun free(): Unit = pango_font_description_free(pangoFontDescriptionPointer.reinterpret())

    /**
     * Gets the family name field of a font description.
     *
     * See [method@Pango.FontDescription.set_family].
     *
     * @return the family name field for the
     *   font description, or null if not previously set. This has the same
     *   life-time as the font description itself and should not be freed.
     */
    public fun getFamily(): String? =
        pango_font_description_get_family(pangoFontDescriptionPointer.reinterpret())?.toKString()

    /**
     * Gets the gravity field of a font description.
     *
     * See [method@Pango.FontDescription.set_gravity].
     *
     * @return the gravity field for the font description.
     *   Use [method@Pango.FontDescription.get_set_fields] to find out
     *   if the field was explicitly set or not.
     * @since 1.16
     */
    public fun getGravity(): Gravity =
        pango_font_description_get_gravity(pangoFontDescriptionPointer.reinterpret()).run {
            Gravity.fromNativeValue(this)
        }

    /**
     * Determines which fields in a font description have been set.
     *
     * @return a bitmask with bits set corresponding to the
     *   fields in @desc that have been set.
     */
    public fun getSetFields(): FontMask =
        pango_font_description_get_set_fields(pangoFontDescriptionPointer.reinterpret()).run {
            FontMask(this)
        }

    /**
     * Gets the size field of a font description.
     *
     * See [method@Pango.FontDescription.set_size].
     *
     * @return the size field for the font description in points
     *   or device units. You must call
     *   [method@Pango.FontDescription.get_size_is_absolute] to find out
     *   which is the case. Returns 0 if the size field has not previously
     *   been set or it has been set to 0 explicitly.
     *   Use [method@Pango.FontDescription.get_set_fields] to find out
     *   if the field was explicitly set or not.
     */
    public fun getSize(): Int = pango_font_description_get_size(pangoFontDescriptionPointer.reinterpret())

    /**
     * Determines whether the size of the font is in points (not absolute)
     * or device units (absolute).
     *
     * See [method@Pango.FontDescription.set_size]
     * and [method@Pango.FontDescription.set_absolute_size].
     *
     * @return whether the size for the font description is in
     *   points or device units. Use [method@Pango.FontDescription.get_set_fields]
     *   to find out if the size field of the font description was explicitly
     *   set or not.
     * @since 1.8
     */
    public fun getSizeIsAbsolute(): Boolean =
        pango_font_description_get_size_is_absolute(pangoFontDescriptionPointer.reinterpret()).asBoolean()

    /**
     * Gets the stretch field of a font description.
     *
     * See [method@Pango.FontDescription.set_stretch].
     *
     * @return the stretch field for the font description.
     *   Use [method@Pango.FontDescription.get_set_fields] to find
     *   out if the field was explicitly set or not.
     */
    public fun getStretch(): Stretch =
        pango_font_description_get_stretch(pangoFontDescriptionPointer.reinterpret()).run {
            Stretch.fromNativeValue(this)
        }

    /**
     * Gets the style field of a `PangoFontDescription`.
     *
     * See [method@Pango.FontDescription.set_style].
     *
     * @return the style field for the font description.
     *   Use [method@Pango.FontDescription.get_set_fields] to
     *   find out if the field was explicitly set or not.
     */
    public fun getStyle(): Style =
        pango_font_description_get_style(pangoFontDescriptionPointer.reinterpret()).run {
            Style.fromNativeValue(this)
        }

    /**
     * Gets the variant field of a `PangoFontDescription`.
     *
     * See [method@Pango.FontDescription.set_variant].
     *
     * @return the variant field for the font description.
     *   Use [method@Pango.FontDescription.get_set_fields] to find
     *   out if the field was explicitly set or not.
     */
    public fun getVariant(): Variant =
        pango_font_description_get_variant(pangoFontDescriptionPointer.reinterpret()).run {
            Variant.fromNativeValue(this)
        }

    /**
     * Gets the variations field of a font description.
     *
     * See [method@Pango.FontDescription.set_variations].
     *
     * @return the variations field for the font
     *   description, or null if not previously set. This has the same
     *   life-time as the font description itself and should not be freed.
     * @since 1.42
     */
    public fun getVariations(): String? =
        pango_font_description_get_variations(pangoFontDescriptionPointer.reinterpret())?.toKString()

    /**
     * Gets the weight field of a font description.
     *
     * See [method@Pango.FontDescription.set_weight].
     *
     * @return the weight field for the font description.
     *   Use [method@Pango.FontDescription.get_set_fields] to find
     *   out if the field was explicitly set or not.
     */
    public fun getWeight(): Weight =
        pango_font_description_get_weight(pangoFontDescriptionPointer.reinterpret()).run {
            Weight.fromNativeValue(this)
        }

    /**
     * Computes a hash of a `PangoFontDescription` structure.
     *
     * This is suitable to be used, for example, as an argument
     * to g_hash_table_new(). The hash value is independent of @desc->mask.
     *
     * @return the hash value.
     */
    public fun hash(): UInt = pango_font_description_hash(pangoFontDescriptionPointer.reinterpret())

    /**
     * Merges the fields that are set in @desc_to_merge into the fields in
     * @desc.
     *
     * If @replace_existing is false, only fields in @desc that
     * are not already set are affected. If true, then fields that are
     * already set will be replaced as well.
     *
     * If @desc_to_merge is null, this function performs nothing.
     *
     * @param descToMerge the `PangoFontDescription` to merge from,
     *   or null
     * @param replaceExisting if true, replace fields in @desc with the
     *   corresponding values from @desc_to_merge, even if they
     *   are already exist.
     */
    public fun merge(
        descToMerge: FontDescription? = null,
        replaceExisting: Boolean,
    ): Unit =
        pango_font_description_merge(
            pangoFontDescriptionPointer.reinterpret(),
            descToMerge?.pangoFontDescriptionPointer,
            replaceExisting.asGBoolean()
        )

    /**
     * Merges the fields that are set in @desc_to_merge into the fields in
     * @desc, without copying allocated fields.
     *
     * This is like [method@Pango.FontDescription.merge], but only a shallow copy
     * is made of the family name and other allocated fields. @desc can only
     * be used until @desc_to_merge is modified or freed. This is meant to
     * be used when the merged font description is only needed temporarily.
     *
     * @param descToMerge the `PangoFontDescription` to merge from
     * @param replaceExisting if true, replace fields in @desc with the
     *   corresponding values from @desc_to_merge, even if they
     *   are already exist.
     */
    public fun mergeStatic(
        descToMerge: FontDescription,
        replaceExisting: Boolean,
    ): Unit =
        pango_font_description_merge_static(
            pangoFontDescriptionPointer.reinterpret(),
            descToMerge.pangoFontDescriptionPointer,
            replaceExisting.asGBoolean()
        )

    /**
     * Sets the size field of a font description, in device units.
     *
     * This is mutually exclusive with [method@Pango.FontDescription.set_size]
     * which sets the font size in points.
     *
     * @param size the new size, in Pango units. There are %PANGO_SCALE Pango units
     *   in one device unit. For an output backend where a device unit is a pixel,
     *   a @size value of 10 * PANGO_SCALE gives a 10 pixel font.
     * @since 1.8
     */
    public fun setAbsoluteSize(size: Double): Unit =
        pango_font_description_set_absolute_size(pangoFontDescriptionPointer.reinterpret(), size)

    /**
     * Sets the family name field of a font description.
     *
     * The family
     * name represents a family of related font styles, and will
     * resolve to a particular `PangoFontFamily`. In some uses of
     * `PangoFontDescription`, it is also possible to use a comma
     * separated list of family names for this field.
     *
     * @param family a string representing the family name.
     */
    public fun setFamily(family: String): Unit =
        pango_font_description_set_family(pangoFontDescriptionPointer.reinterpret(), family)

    /**
     * Sets the family name field of a font description, without copying the string.
     *
     * This is like [method@Pango.FontDescription.set_family], except that no
     * copy of @family is made. The caller must make sure that the
     * string passed in stays around until @desc has been freed or the
     * name is set again. This function can be used if @family is a static
     * string such as a C string literal, or if @desc is only needed temporarily.
     *
     * @param family a string representing the family name
     */
    public fun setFamilyStatic(family: String): Unit =
        pango_font_description_set_family_static(pangoFontDescriptionPointer.reinterpret(), family)

    /**
     * Sets the gravity field of a font description.
     *
     * The gravity field
     * specifies how the glyphs should be rotated. If @gravity is
     * %PANGO_GRAVITY_AUTO, this actually unsets the gravity mask on
     * the font description.
     *
     * This function is seldom useful to the user. Gravity should normally
     * be set on a `PangoContext`.
     *
     * @param gravity the gravity for the font description.
     * @since 1.16
     */
    public fun setGravity(gravity: Gravity): Unit =
        pango_font_description_set_gravity(pangoFontDescriptionPointer.reinterpret(), gravity.nativeValue)

    /**
     * Sets the size field of a font description in fractional points.
     *
     * This is mutually exclusive with
     * [method@Pango.FontDescription.set_absolute_size].
     *
     * @param size the size of the font in points, scaled by %PANGO_SCALE.
     *   (That is, a @size value of 10 * PANGO_SCALE is a 10 point font.
     *   The conversion factor between points and device units depends on
     *   system configuration and the output device. For screen display, a
     *   logical DPI of 96 is common, in which case a 10 point font corresponds
     *   to a 10 * (96 / 72) = 13.3 pixel font.
     *   Use [method@Pango.FontDescription.set_absolute_size] if you need
     *   a particular size in device units.
     */
    public fun setSize(size: Int): Unit =
        pango_font_description_set_size(pangoFontDescriptionPointer.reinterpret(), size)

    /**
     * Sets the stretch field of a font description.
     *
     * The [enum@Pango.Stretch] field specifies how narrow or
     * wide the font should be.
     *
     * @param stretch the stretch for the font description
     */
    public fun setStretch(stretch: Stretch): Unit =
        pango_font_description_set_stretch(pangoFontDescriptionPointer.reinterpret(), stretch.nativeValue)

    /**
     * Sets the style field of a `PangoFontDescription`.
     *
     * The [enum@Pango.Style] enumeration describes whether the font is
     * slanted and the manner in which it is slanted; it can be either
     * %PANGO_STYLE_NORMAL, %PANGO_STYLE_ITALIC, or %PANGO_STYLE_OBLIQUE.
     *
     * Most fonts will either have a italic style or an oblique style,
     * but not both, and font matching in Pango will match italic
     * specifications with oblique fonts and vice-versa if an exact
     * match is not found.
     *
     * @param style the style for the font description
     */
    public fun setStyle(style: Style): Unit =
        pango_font_description_set_style(pangoFontDescriptionPointer.reinterpret(), style.nativeValue)

    /**
     * Sets the variant field of a font description.
     *
     * The [enum@Pango.Variant] can either be %PANGO_VARIANT_NORMAL
     * or %PANGO_VARIANT_SMALL_CAPS.
     *
     * @param variant the variant type for the font description.
     */
    public fun setVariant(variant: Variant): Unit =
        pango_font_description_set_variant(pangoFontDescriptionPointer.reinterpret(), variant.nativeValue)

    /**
     * Sets the variations field of a font description.
     *
     * OpenType font variations allow to select a font instance by
     * specifying values for a number of axes, such as width or weight.
     *
     * The format of the variations string is
     *
     *     AXIS1=VALUE,AXIS2=VALUE...
     *
     * with each AXIS a 4 character tag that identifies a font axis,
     * and each VALUE a floating point number. Unknown axes are ignored,
     * and values are clamped to their allowed range.
     *
     * Pango does not currently have a way to find supported axes of
     * a font. Both harfbuzz and freetype have API for this. See
     * for example [hb_ot_var_get_axis_infos](https://harfbuzz.github.io/harfbuzz-hb-ot-var.html#hb-ot-var-get-axis-infos).
     *
     * @param variations a string representing the variations
     * @since 1.42
     */
    public fun setVariations(variations: String? = null): Unit =
        pango_font_description_set_variations(pangoFontDescriptionPointer.reinterpret(), variations)

    /**
     * Sets the variations field of a font description.
     *
     * This is like [method@Pango.FontDescription.set_variations], except
     * that no copy of @variations is made. The caller must make sure that
     * the string passed in stays around until @desc has been freed
     * or the name is set again. This function can be used if
     * @variations is a static string such as a C string literal,
     * or if @desc is only needed temporarily.
     *
     * @param variations a string representing the variations
     * @since 1.42
     */
    public fun setVariationsStatic(variations: String): Unit =
        pango_font_description_set_variations_static(pangoFontDescriptionPointer.reinterpret(), variations)

    /**
     * Sets the weight field of a font description.
     *
     * The weight field
     * specifies how bold or light the font should be. In addition
     * to the values of the [enum@Pango.Weight] enumeration, other
     * intermediate numeric values are possible.
     *
     * @param weight the weight for the font description.
     */
    public fun setWeight(weight: Weight): Unit =
        pango_font_description_set_weight(pangoFontDescriptionPointer.reinterpret(), weight.nativeValue)

    /**
     * Creates a filename representation of a font description.
     *
     * The filename is identical to the result from calling
     * [method@Pango.FontDescription.to_string], but with underscores
     * instead of characters that are untypical in filenames, and in
     * lower case only.
     *
     * @return a new string that must be freed with g_free().
     */
    public fun toFilename(): String? =
        pango_font_description_to_filename(pangoFontDescriptionPointer.reinterpret())?.toKString()

    /**
     * Unsets some of the fields in a `PangoFontDescription`.
     *
     * The unset fields will get back to their default values.
     *
     * @param toUnset bitmask of fields in the @desc to unset.
     */
    public fun unsetFields(toUnset: FontMask): Unit =
        pango_font_description_unset_fields(pangoFontDescriptionPointer.reinterpret(), toUnset.mask)

    public companion object : RecordCompanion<FontDescription, PangoFontDescription> {
        /**
         * Creates a new font description structure with all fields unset.
         *
         * @return the newly allocated `PangoFontDescription`,
         *   which should be freed using [method@Pango.FontDescription.free].
         */
        public fun new(): FontDescription = FontDescription(pango_font_description_new()!!.reinterpret())

        /**
         * Creates a new font description from a string representation.
         *
         * The string must have the form
         *
         *     "\[FAMILY-LIST] \[STYLE-OPTIONS] \[SIZE] \[VARIATIONS]",
         *
         * where FAMILY-LIST is a comma-separated list of families optionally
         * terminated by a comma, STYLE_OPTIONS is a whitespace-separated list
         * of words where each word describes one of style, variant, weight,
         * stretch, or gravity, and SIZE is a decimal number (size in points)
         * or optionally followed by the unit modifier "px" for absolute size.
         * VARIATIONS is a comma-separated list of font variation
         * specifications of the form "\@axis=value" (the = sign is optional).
         *
         * The following words are understood as styles:
         * "Normal", "Roman", "Oblique", "Italic".
         *
         * The following words are understood as variants:
         * "Small-Caps", "All-Small-Caps", "Petite-Caps", "All-Petite-Caps",
         * "Unicase", "Title-Caps".
         *
         * The following words are understood as weights:
         * "Thin", "Ultra-Light", "Extra-Light", "Light", "Semi-Light",
         * "Demi-Light", "Book", "Regular", "Medium", "Semi-Bold", "Demi-Bold",
         * "Bold", "Ultra-Bold", "Extra-Bold", "Heavy", "Black", "Ultra-Black",
         * "Extra-Black".
         *
         * The following words are understood as stretch values:
         * "Ultra-Condensed", "Extra-Condensed", "Condensed", "Semi-Condensed",
         * "Semi-Expanded", "Expanded", "Extra-Expanded", "Ultra-Expanded".
         *
         * The following words are understood as gravity values:
         * "Not-Rotated", "South", "Upside-Down", "North", "Rotated-Left",
         * "East", "Rotated-Right", "West".
         *
         * Any one of the options may be absent. If FAMILY-LIST is absent, then
         * the family_name field of the resulting font description will be
         * initialized to null. If STYLE-OPTIONS is missing, then all style
         * options will be set to the default values. If SIZE is missing, the
         * size in the resulting font description will be set to 0.
         *
         * A typical example:
         *
         *     "Cantarell Italic Light 15 \@wght=200"
         *
         * @param str string representation of a font description.
         * @return a new `PangoFontDescription`.
         */
        public fun fromString(str: String): FontDescription =
            pango_font_description_from_string(str)!!.run {
                FontDescription(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): FontDescription =
            FontDescription(pointer.reinterpret())
    }
}
