// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.pango.annotations.PangoVersion1_16
import org.gtkkn.bindings.pango.annotations.PangoVersion1_32_4
import org.gtkkn.bindings.pango.annotations.PangoVersion1_44
import org.gtkkn.bindings.pango.annotations.PangoVersion1_6
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoContext
import org.gtkkn.native.pango.pango_context_changed
import org.gtkkn.native.pango.pango_context_get_base_dir
import org.gtkkn.native.pango.pango_context_get_base_gravity
import org.gtkkn.native.pango.pango_context_get_font_description
import org.gtkkn.native.pango.pango_context_get_font_map
import org.gtkkn.native.pango.pango_context_get_gravity
import org.gtkkn.native.pango.pango_context_get_gravity_hint
import org.gtkkn.native.pango.pango_context_get_language
import org.gtkkn.native.pango.pango_context_get_matrix
import org.gtkkn.native.pango.pango_context_get_metrics
import org.gtkkn.native.pango.pango_context_get_round_glyph_positions
import org.gtkkn.native.pango.pango_context_get_serial
import org.gtkkn.native.pango.pango_context_get_type
import org.gtkkn.native.pango.pango_context_load_font
import org.gtkkn.native.pango.pango_context_load_fontset
import org.gtkkn.native.pango.pango_context_new
import org.gtkkn.native.pango.pango_context_set_base_dir
import org.gtkkn.native.pango.pango_context_set_base_gravity
import org.gtkkn.native.pango.pango_context_set_font_description
import org.gtkkn.native.pango.pango_context_set_font_map
import org.gtkkn.native.pango.pango_context_set_gravity_hint
import org.gtkkn.native.pango.pango_context_set_language
import org.gtkkn.native.pango.pango_context_set_matrix
import org.gtkkn.native.pango.pango_context_set_round_glyph_positions
import kotlin.Boolean
import kotlin.Unit

/**
 * A `PangoContext` stores global information used to control the
 * itemization process.
 *
 * The information stored by `PangoContext` includes the fontmap used
 * to look up fonts, and default values such as the default language,
 * default gravity, or default font.
 *
 * To obtain a `PangoContext`, use [method@Pango.FontMap.create_context].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `families`: families: Out parameter is not supported
 */
public open class Context(pointer: CPointer<PangoContext>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val pangoContextPointer: CPointer<PangoContext>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `PangoContext` initialized to default values.
     *
     * This function is not particularly useful as it should always
     * be followed by a [method@Pango.Context.set_font_map] call, and the
     * function [method@Pango.FontMap.create_context] does these two steps
     * together and hence users are recommended to use that.
     *
     * If you are using Pango as part of a higher-level system,
     * that system may have it's own way of create a `PangoContext`.
     * For instance, the GTK toolkit has, among others,
     * `gtk_widget_get_pango_context()`. Use those instead.
     *
     * @return the newly allocated `PangoContext`, which should
     *   be freed with g_object_unref().
     */
    public constructor() : this(pango_context_new()!!.reinterpret())

    /**
     * Forces a change in the context, which will cause any `PangoLayout`
     * using this context to re-layout.
     *
     * This function is only useful when implementing a new backend
     * for Pango, something applications won't do. Backends should
     * call this function if they have attached extra data to the context
     * and such data is changed.
     *
     * @since 1.32.4
     */
    @PangoVersion1_32_4
    public open fun changed(): Unit = pango_context_changed(pangoContextPointer)

    /**
     * Retrieves the base direction for the context.
     *
     * See [method@Pango.Context.set_base_dir].
     *
     * @return the base direction for the context.
     */
    public open fun getBaseDir(): Direction = pango_context_get_base_dir(pangoContextPointer).run {
        Direction.fromNativeValue(this)
    }

    /**
     * Retrieves the base gravity for the context.
     *
     * See [method@Pango.Context.set_base_gravity].
     *
     * @return the base gravity for the context.
     * @since 1.16
     */
    @PangoVersion1_16
    public open fun getBaseGravity(): Gravity = pango_context_get_base_gravity(pangoContextPointer).run {
        Gravity.fromNativeValue(this)
    }

    /**
     * Retrieve the default font description for the context.
     *
     * @return a pointer to the context's default font
     *   description. This value must not be modified or freed.
     */
    public open fun getFontDescription(): FontDescription? =
        pango_context_get_font_description(pangoContextPointer)?.run {
            FontDescription(this)
        }

    /**
     * Gets the `PangoFontMap` used to look up fonts for this context.
     *
     * @return the font map for the.
     *   `PangoContext` This value is owned by Pango and should not be
     *   unreferenced.
     * @since 1.6
     */
    @PangoVersion1_6
    public open fun getFontMap(): FontMap? = pango_context_get_font_map(pangoContextPointer)?.run {
        FontMap(this)
    }

    /**
     * Retrieves the gravity for the context.
     *
     * This is similar to [method@Pango.Context.get_base_gravity],
     * except for when the base gravity is %PANGO_GRAVITY_AUTO for
     * which [func@Pango.Gravity.get_for_matrix] is used to return the
     * gravity from the current context matrix.
     *
     * @return the resolved gravity for the context.
     * @since 1.16
     */
    @PangoVersion1_16
    public open fun getGravity(): Gravity = pango_context_get_gravity(pangoContextPointer).run {
        Gravity.fromNativeValue(this)
    }

    /**
     * Retrieves the gravity hint for the context.
     *
     * See [method@Pango.Context.set_gravity_hint] for details.
     *
     * @return the gravity hint for the context.
     * @since 1.16
     */
    @PangoVersion1_16
    public open fun getGravityHint(): GravityHint = pango_context_get_gravity_hint(pangoContextPointer).run {
        GravityHint.fromNativeValue(this)
    }

    /**
     * Retrieves the global language tag for the context.
     *
     * @return the global language tag.
     */
    public open fun getLanguage(): Language = pango_context_get_language(pangoContextPointer)!!.run {
        Language(this)
    }

    /**
     * Gets the transformation matrix that will be applied when
     * rendering with this context.
     *
     * See [method@Pango.Context.set_matrix].
     *
     * @return the matrix, or null if no
     *   matrix has been set (which is the same as the identity matrix).
     *   The returned matrix is owned by Pango and must not be modified
     *   or freed.
     * @since 1.6
     */
    @PangoVersion1_6
    public open fun getMatrix(): Matrix? = pango_context_get_matrix(pangoContextPointer)?.run {
        Matrix(this)
    }

    /**
     * Get overall metric information for a particular font description.
     *
     * Since the metrics may be substantially different for different scripts,
     * a language tag can be provided to indicate that the metrics should be
     * retrieved that correspond to the script(s) used by that language.
     *
     * The `PangoFontDescription` is interpreted in the same way as by [func@itemize],
     * and the family name may be a comma separated list of names. If characters
     * from multiple of these families would be used to render the string, then
     * the returned fonts would be a composite of the metrics for the fonts loaded
     * for the individual families.
     *
     * @param desc a `PangoFontDescription` structure. null means that the
     *   font description from the context will be used.
     * @param language language tag used to determine which script to get
     *   the metrics for. null means that the language tag from the context
     *   will be used. If no language tag is set on the context, metrics
     *   for the default language (as determined by [func@Pango.Language.get_default]
     *   will be returned.
     * @return a `PangoFontMetrics` object. The caller must call
     *   [method@Pango.FontMetrics.unref] when finished using the object.
     */
    public open fun getMetrics(desc: FontDescription? = null, language: Language? = null): FontMetrics =
        pango_context_get_metrics(pangoContextPointer, desc?.gPointer, language?.gPointer)!!.run {
            FontMetrics(this)
        }

    /**
     * Returns whether font rendering with this context should
     * round glyph positions and widths.
     *
     * @since 1.44
     */
    @PangoVersion1_44
    public open fun getRoundGlyphPositions(): Boolean =
        pango_context_get_round_glyph_positions(pangoContextPointer).asBoolean()

    /**
     * Returns the current serial number of @context.
     *
     * The serial number is initialized to an small number larger than zero
     * when a new context is created and is increased whenever the context
     * is changed using any of the setter functions, or the `PangoFontMap` it
     * uses to find fonts has changed. The serial may wrap, but will never
     * have the value 0. Since it can wrap, never compare it with "less than",
     * always use "not equals".
     *
     * This can be used to automatically detect changes to a `PangoContext`,
     * and is only useful when implementing objects that need update when their
     * `PangoContext` changes, like `PangoLayout`.
     *
     * @return The current serial number of @context.
     * @since 1.32.4
     */
    @PangoVersion1_32_4
    public open fun getSerial(): guint = pango_context_get_serial(pangoContextPointer)

    /**
     * Loads the font in one of the fontmaps in the context
     * that is the closest match for @desc.
     *
     * @param desc a `PangoFontDescription` describing the font to load
     * @return the newly allocated `PangoFont`
     *   that was loaded, or null if no font matched.
     */
    public open fun loadFont(desc: FontDescription): Font? =
        pango_context_load_font(pangoContextPointer, desc.gPointer)?.run {
            Font(this)
        }

    /**
     * Load a set of fonts in the context that can be used to render
     * a font matching @desc.
     *
     * @param desc a `PangoFontDescription` describing the fonts to load
     * @param language a `PangoLanguage` the fonts will be used for
     * @return the newly allocated
     *   `PangoFontset` loaded, or null if no font matched.
     */
    public open fun loadFontset(desc: FontDescription, language: Language): Fontset? =
        pango_context_load_fontset(pangoContextPointer, desc.gPointer, language.gPointer)?.run {
            Fontset(this)
        }

    /**
     * Sets the base direction for the context.
     *
     * The base direction is used in applying the Unicode bidirectional
     * algorithm; if the @direction is %PANGO_DIRECTION_LTR or
     * %PANGO_DIRECTION_RTL, then the value will be used as the paragraph
     * direction in the Unicode bidirectional algorithm. A value of
     * %PANGO_DIRECTION_WEAK_LTR or %PANGO_DIRECTION_WEAK_RTL is used only
     * for paragraphs that do not contain any strong characters themselves.
     *
     * @param direction the new base direction
     */
    public open fun setBaseDir(direction: Direction): Unit =
        pango_context_set_base_dir(pangoContextPointer, direction.nativeValue)

    /**
     * Sets the base gravity for the context.
     *
     * The base gravity is used in laying vertical text out.
     *
     * @param gravity the new base gravity
     * @since 1.16
     */
    @PangoVersion1_16
    public open fun setBaseGravity(gravity: Gravity): Unit =
        pango_context_set_base_gravity(pangoContextPointer, gravity.nativeValue)

    /**
     * Set the default font description for the context
     *
     * @param desc the new pango font description
     */
    public open fun setFontDescription(desc: FontDescription? = null): Unit =
        pango_context_set_font_description(pangoContextPointer, desc?.gPointer)

    /**
     * Sets the font map to be searched when fonts are looked-up
     * in this context.
     *
     * This is only for internal use by Pango backends, a `PangoContext`
     * obtained via one of the recommended methods should already have a
     * suitable font map.
     *
     * @param fontMap the `PangoFontMap` to set.
     */
    public open fun setFontMap(fontMap: FontMap? = null): Unit =
        pango_context_set_font_map(pangoContextPointer, fontMap?.pangoFontMapPointer)

    /**
     * Sets the gravity hint for the context.
     *
     * The gravity hint is used in laying vertical text out, and
     * is only relevant if gravity of the context as returned by
     * [method@Pango.Context.get_gravity] is set to %PANGO_GRAVITY_EAST
     * or %PANGO_GRAVITY_WEST.
     *
     * @param hint the new gravity hint
     * @since 1.16
     */
    @PangoVersion1_16
    public open fun setGravityHint(hint: GravityHint): Unit =
        pango_context_set_gravity_hint(pangoContextPointer, hint.nativeValue)

    /**
     * Sets the global language tag for the context.
     *
     * The default language for the locale of the running process
     * can be found using [func@Pango.Language.get_default].
     *
     * @param language the new language tag.
     */
    public open fun setLanguage(language: Language? = null): Unit =
        pango_context_set_language(pangoContextPointer, language?.gPointer)

    /**
     * Sets the transformation matrix that will be applied when rendering
     * with this context.
     *
     * Note that reported metrics are in the user space coordinates before
     * the application of the matrix, not device-space coordinates after the
     * application of the matrix. So, they don't scale with the matrix, though
     * they may change slightly for different matrices, depending on how the
     * text is fit to the pixel grid.
     *
     * @param matrix a `PangoMatrix`, or null to unset any existing
     * matrix. (No matrix set is the same as setting the identity matrix.)
     * @since 1.6
     */
    @PangoVersion1_6
    public open fun setMatrix(matrix: Matrix? = null): Unit =
        pango_context_set_matrix(pangoContextPointer, matrix?.gPointer)

    /**
     * Sets whether font rendering with this context should
     * round glyph positions and widths to integral positions,
     * in device units.
     *
     * This is useful when the renderer can't handle subpixel
     * positioning of glyphs.
     *
     * The default value is to round glyph positions, to remain
     * compatible with previous Pango behavior.
     *
     * @param roundPositions whether to round glyph positions
     * @since 1.44
     */
    @PangoVersion1_44
    public open fun setRoundGlyphPositions(roundPositions: Boolean): Unit =
        pango_context_set_round_glyph_positions(pangoContextPointer, roundPositions.asGBoolean())

    public companion object : TypeCompanion<Context> {
        override val type: GeneratedClassKGType<Context> =
            GeneratedClassKGType(pango_context_get_type()) { Context(it.reinterpret()) }

        init {
            PangoTypeProvider.register()
        }

        /**
         * Get the GType of Context
         *
         * @return the GType
         */
        public fun getType(): GType = pango_context_get_type()
    }
}
