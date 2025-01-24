// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.pango.FontDescription
import org.gtkkn.bindings.pango.FontFace
import org.gtkkn.bindings.pango.FontFamily
import org.gtkkn.bindings.pango.FontMap
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkFontChooser
import org.gtkkn.native.gtk.gtk_font_chooser_get_font
import org.gtkkn.native.gtk.gtk_font_chooser_get_font_desc
import org.gtkkn.native.gtk.gtk_font_chooser_get_font_face
import org.gtkkn.native.gtk.gtk_font_chooser_get_font_family
import org.gtkkn.native.gtk.gtk_font_chooser_get_font_features
import org.gtkkn.native.gtk.gtk_font_chooser_get_font_map
import org.gtkkn.native.gtk.gtk_font_chooser_get_font_size
import org.gtkkn.native.gtk.gtk_font_chooser_get_language
import org.gtkkn.native.gtk.gtk_font_chooser_get_level
import org.gtkkn.native.gtk.gtk_font_chooser_get_preview_text
import org.gtkkn.native.gtk.gtk_font_chooser_get_show_preview_entry
import org.gtkkn.native.gtk.gtk_font_chooser_get_type
import org.gtkkn.native.gtk.gtk_font_chooser_set_filter_func
import org.gtkkn.native.gtk.gtk_font_chooser_set_font
import org.gtkkn.native.gtk.gtk_font_chooser_set_font_desc
import org.gtkkn.native.gtk.gtk_font_chooser_set_font_map
import org.gtkkn.native.gtk.gtk_font_chooser_set_language
import org.gtkkn.native.gtk.gtk_font_chooser_set_level
import org.gtkkn.native.gtk.gtk_font_chooser_set_preview_text
import org.gtkkn.native.gtk.gtk_font_chooser_set_show_preview_entry
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkFontChooser` is an interface that can be implemented by widgets
 * for choosing fonts.
 *
 * In GTK, the main objects that implement this interface are
 * [class@Gtk.FontChooserWidget], [class@Gtk.FontChooserDialog] and
 * [class@Gtk.FontButton].
 *
 * ## Skipped during bindings generation
 *
 * - method `font`: Property TypeInfo of getter and setter do not match
 * - method `font-desc`: Property TypeInfo of getter and setter do not match
 */
public interface FontChooser :
    Proxy,
    KGTyped {
    public val gtkFontChooserPointer: CPointer<GtkFontChooser>

    /**
     * The selected font features.
     *
     * The format of the string is compatible with
     * CSS and with Pango attributes.
     */
    public val fontFeatures: String
        /**
         * Gets the currently-selected font features.
         *
         * The format of the returned string is compatible with the
         * [CSS font-feature-settings property](https://www.w3.org/TR/css-fonts-4/#font-rend-desc).
         * It can be passed to [func@Pango.AttrFontFeatures.new].
         *
         * @return the currently selected font features
         */
        get() = gtk_font_chooser_get_font_features(gtkFontChooserPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * The language for which the font features were selected.
     */
    public var language: String
        /**
         * Gets the language that is used for font features.
         *
         * @return the currently selected language
         */
        get() = gtk_font_chooser_get_language(gtkFontChooserPointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets the language to use for font features.
         *
         * @param language a language
         */
        set(language) = gtk_font_chooser_set_language(gtkFontChooserPointer, language)

    /**
     * The level of granularity to offer for selecting fonts.
     */
    public var level: FontChooserLevel
        /**
         * Returns the current level of granularity for selecting fonts.
         *
         * @return the current granularity level
         */
        get() = gtk_font_chooser_get_level(gtkFontChooserPointer).run {
            FontChooserLevel(this)
        }

        /**
         * Sets the desired level of granularity for selecting fonts.
         *
         * @param level the desired level of granularity
         */
        set(level) = gtk_font_chooser_set_level(gtkFontChooserPointer, level.mask)

    /**
     * The string with which to preview the font.
     */
    public var previewText: String
        /**
         * Gets the text displayed in the preview area.
         *
         * @return the text displayed in the preview area
         */
        get() = gtk_font_chooser_get_preview_text(gtkFontChooserPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the text displayed in the preview area.
         *
         * The @text is used to show how the selected font looks.
         *
         * @param text the text to display in the preview area
         */
        set(text) = gtk_font_chooser_set_preview_text(gtkFontChooserPointer, text)

    /**
     * Whether to show an entry to change the preview text.
     */
    public var showPreviewEntry: Boolean
        /**
         * Returns whether the preview entry is shown or not.
         *
         * @return true if the preview entry is shown or false if it is hidden.
         */
        get() = gtk_font_chooser_get_show_preview_entry(gtkFontChooserPointer).asBoolean()

        /**
         * Shows or hides the editable preview entry.
         *
         * @param showPreviewEntry whether to show the editable preview entry or not
         */
        set(
            showPreviewEntry
        ) = gtk_font_chooser_set_show_preview_entry(gtkFontChooserPointer, showPreviewEntry.asGBoolean())

    /**
     * Gets the currently-selected font name.
     *
     * Note that this can be a different string than what you set with
     * [method@Gtk.FontChooser.set_font], as the font chooser widget may
     * normalize font names and thus return a string with a different
     * structure. For example, “Helvetica Italic Bold 12” could be
     * normalized to “Helvetica Bold Italic 12”.
     *
     * Use [method@Pango.FontDescription.equal] if you want to compare two
     * font descriptions.
     *
     * @return A string with the name
     *   of the current font
     */
    public fun getFont(): String? = gtk_font_chooser_get_font(gtkFontChooserPointer)?.toKString()

    /**
     * Gets the currently-selected font.
     *
     * Note that this can be a different string than what you set with
     * [method@Gtk.FontChooser.set_font], as the font chooser widget may
     * normalize font names and thus return a string with a different
     * structure. For example, “Helvetica Italic Bold 12” could be
     * normalized to “Helvetica Bold Italic 12”.
     *
     * Use [method@Pango.FontDescription.equal] if you want to compare two
     * font descriptions.
     *
     * @return A `PangoFontDescription` for the
     *   current font
     */
    public fun getFontDesc(): FontDescription? = gtk_font_chooser_get_font_desc(gtkFontChooserPointer)?.run {
        FontDescription(this)
    }

    /**
     * Gets the `PangoFontFace` representing the selected font group
     * details (i.e. family, slant, weight, width, etc).
     *
     * If the selected font is not installed, returns null.
     *
     * @return A `PangoFontFace` representing the
     *   selected font group details
     */
    public fun getFontFace(): FontFace? = gtk_font_chooser_get_font_face(gtkFontChooserPointer)?.run {
        FontFace.FontFaceImpl(this)
    }

    /**
     * Gets the `PangoFontFamily` representing the selected font family.
     *
     * Font families are a collection of font faces.
     *
     * If the selected font is not installed, returns null.
     *
     * @return A `PangoFontFamily` representing the
     *   selected font family
     */
    public fun getFontFamily(): FontFamily? = gtk_font_chooser_get_font_family(gtkFontChooserPointer)?.run {
        FontFamily.FontFamilyImpl(this)
    }

    /**
     * Gets the currently-selected font features.
     *
     * The format of the returned string is compatible with the
     * [CSS font-feature-settings property](https://www.w3.org/TR/css-fonts-4/#font-rend-desc).
     * It can be passed to [func@Pango.AttrFontFeatures.new].
     *
     * @return the currently selected font features
     */
    public fun getFontFeatures(): String =
        gtk_font_chooser_get_font_features(gtkFontChooserPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the custom font map of this font chooser widget,
     * or null if it does not have one.
     *
     * @return a `PangoFontMap`
     */
    public fun getFontChooserFontMap(): FontMap? = gtk_font_chooser_get_font_map(gtkFontChooserPointer)?.run {
        FontMap.FontMapImpl(this)
    }

    /**
     * The selected font size.
     *
     * @return A n integer representing the selected font size,
     *   or -1 if no font size is selected.
     */
    public fun getFontSize(): gint = gtk_font_chooser_get_font_size(gtkFontChooserPointer)

    /**
     * Gets the language that is used for font features.
     *
     * @return the currently selected language
     */
    public fun getLanguage(): String =
        gtk_font_chooser_get_language(gtkFontChooserPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Returns the current level of granularity for selecting fonts.
     *
     * @return the current granularity level
     */
    public fun getLevel(): FontChooserLevel = gtk_font_chooser_get_level(gtkFontChooserPointer).run {
        FontChooserLevel(this)
    }

    /**
     * Gets the text displayed in the preview area.
     *
     * @return the text displayed in the preview area
     */
    public fun getPreviewText(): String =
        gtk_font_chooser_get_preview_text(gtkFontChooserPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Returns whether the preview entry is shown or not.
     *
     * @return true if the preview entry is shown or false if it is hidden.
     */
    public fun getShowPreviewEntry(): Boolean =
        gtk_font_chooser_get_show_preview_entry(gtkFontChooserPointer).asBoolean()

    /**
     * Adds a filter function that decides which fonts to display
     * in the font chooser.
     *
     * @param filter a `GtkFontFilterFunc`
     */
    public fun setFilterFunc(filter: FontFilterFunc?): Unit = gtk_font_chooser_set_filter_func(
        gtkFontChooserPointer,
        filter?.let {
            FontFilterFuncFunc.reinterpret()
        },
        filter?.let { StableRef.create(filter).asCPointer() },
        filter?.let { staticStableRefDestroy.reinterpret() }
    )

    /**
     * Sets the currently-selected font.
     *
     * @param fontname a font name like “Helvetica 12” or “Times Bold 18”
     */
    public fun setFont(fontname: String): Unit = gtk_font_chooser_set_font(gtkFontChooserPointer, fontname)

    /**
     * Sets the currently-selected font from @font_desc.
     *
     * @param fontDesc a `PangoFontDescription`
     */
    public fun setFontDesc(fontDesc: FontDescription): Unit =
        gtk_font_chooser_set_font_desc(gtkFontChooserPointer, fontDesc.pangoFontDescriptionPointer)

    /**
     * Sets a custom font map to use for this font chooser widget.
     *
     * A custom font map can be used to present application-specific
     * fonts instead of or in addition to the normal system fonts.
     *
     * ```c
     * FcConfig *config;
     * PangoFontMap *fontmap;
     *
     * config = FcInitLoadConfigAndFonts ();
     * FcConfigAppFontAddFile (config, my_app_font_file);
     *
     * fontmap = pango_cairo_font_map_new_for_font_type (CAIRO_FONT_TYPE_FT);
     * pango_fc_font_map_set_config (PANGO_FC_FONT_MAP (fontmap), config);
     *
     * gtk_font_chooser_set_font_map (font_chooser, fontmap);
     * ```
     *
     * Note that other GTK widgets will only be able to use the
     * application-specific font if it is present in the font map they use:
     *
     * ```c
     * context = gtk_widget_get_pango_context (label);
     * pango_context_set_font_map (context, fontmap);
     * ```
     *
     * @param fontmap a `PangoFontMap`
     */
    public fun setFontChooserFontMap(fontmap: FontMap? = null): Unit =
        gtk_font_chooser_set_font_map(gtkFontChooserPointer, fontmap?.pangoFontMapPointer)

    /**
     * Sets the language to use for font features.
     *
     * @param language a language
     */
    public fun setLanguage(language: String): Unit = gtk_font_chooser_set_language(gtkFontChooserPointer, language)

    /**
     * Sets the desired level of granularity for selecting fonts.
     *
     * @param level the desired level of granularity
     */
    public fun setLevel(level: FontChooserLevel): Unit = gtk_font_chooser_set_level(gtkFontChooserPointer, level.mask)

    /**
     * Sets the text displayed in the preview area.
     *
     * The @text is used to show how the selected font looks.
     *
     * @param text the text to display in the preview area
     */
    public fun setPreviewText(text: String): Unit = gtk_font_chooser_set_preview_text(gtkFontChooserPointer, text)

    /**
     * Shows or hides the editable preview entry.
     *
     * @param showPreviewEntry whether to show the editable preview entry or not
     */
    public fun setShowPreviewEntry(showPreviewEntry: Boolean): Unit =
        gtk_font_chooser_set_show_preview_entry(gtkFontChooserPointer, showPreviewEntry.asGBoolean())

    /**
     * Emitted when a font is activated.
     *
     * This usually happens when the user double clicks an item,
     * or an item is selected and the user presses one of the keys
     * Space, Shift+Space, Return or Enter.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `fontname` the font name
     */
    public fun onFontActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (fontname: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkFontChooserPointer,
        "font-activated",
        onFontActivatedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The FontChooserImpl type represents a native instance of the FontChooser interface.
     *
     * @constructor Creates a new instance of FontChooser for the provided [CPointer].
     */
    public data class FontChooserImpl(override val gtkFontChooserPointer: CPointer<GtkFontChooser>) :
        Object(gtkFontChooserPointer.reinterpret()),
        FontChooser

    public companion object : TypeCompanion<FontChooser> {
        override val type: GeneratedInterfaceKGType<FontChooser> =
            GeneratedInterfaceKGType(gtk_font_chooser_get_type()) { FontChooserImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FontChooser
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_font_chooser_get_type()
    }
}

private val onFontActivatedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            fontname: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(fontname: String) -> Unit>().get().invoke(
            fontname?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()
