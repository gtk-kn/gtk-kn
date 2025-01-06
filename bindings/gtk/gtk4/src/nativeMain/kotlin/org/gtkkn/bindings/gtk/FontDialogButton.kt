// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.bindings.pango.FontDescription
import org.gtkkn.bindings.pango.Language
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkFontDialogButton
import org.gtkkn.native.gtk.gtk_font_dialog_button_get_dialog
import org.gtkkn.native.gtk.gtk_font_dialog_button_get_font_desc
import org.gtkkn.native.gtk.gtk_font_dialog_button_get_font_features
import org.gtkkn.native.gtk.gtk_font_dialog_button_get_language
import org.gtkkn.native.gtk.gtk_font_dialog_button_get_level
import org.gtkkn.native.gtk.gtk_font_dialog_button_get_type
import org.gtkkn.native.gtk.gtk_font_dialog_button_get_use_font
import org.gtkkn.native.gtk.gtk_font_dialog_button_get_use_size
import org.gtkkn.native.gtk.gtk_font_dialog_button_new
import org.gtkkn.native.gtk.gtk_font_dialog_button_set_dialog
import org.gtkkn.native.gtk.gtk_font_dialog_button_set_font_desc
import org.gtkkn.native.gtk.gtk_font_dialog_button_set_font_features
import org.gtkkn.native.gtk.gtk_font_dialog_button_set_language
import org.gtkkn.native.gtk.gtk_font_dialog_button_set_level
import org.gtkkn.native.gtk.gtk_font_dialog_button_set_use_font
import org.gtkkn.native.gtk.gtk_font_dialog_button_set_use_size
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The `GtkFontDialogButton` is wrapped around a [class@Gtk.FontDialog]
 * and allows to open a font chooser dialog to change the font.
 *
 * ![An example GtkFontDialogButton](font-button.png)
 *
 * It is suitable widget for selecting a font in a preference dialog.
 *
 * # CSS nodes
 *
 * ```
 * fontbutton
 * ╰── button.font
 *     ╰── [content]
 * ```
 *
 * `GtkFontDialogButton` has a single CSS node with name fontbutton which
 * contains a button node with the .font style class.
 *
 * ## Skipped during bindings generation
 *
 * - method `dialog`: Property TypeInfo of getter and setter do not match
 * - method `font-desc`: Property TypeInfo of getter and setter do not match
 *
 * @since 4.10
 */
@GtkVersion4_10
public open class FontDialogButton(pointer: CPointer<GtkFontDialogButton>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkFontDialogButtonPointer: CPointer<GtkFontDialogButton>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The selected font features.
     *
     * This property will be updated to reflect the users choice
     * in the font chooser dialog.
     *
     * Listen to `notify::font-features` to get informed about changes
     * to the buttons font features.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var fontFeatures: String?
        /**
         * Returns the font features of the button.
         *
         * This function is what should be used to obtain the font features
         * that were chosen by the user. To get informed about changes, listen
         * to "notify::font-features".
         *
         * Note that the button will only let users choose font features
         * if [property@Gtk.FontDialogButton:level] is set to
         * `GTK_FONT_LEVEL_FEATURES`.
         *
         * @return the font features
         * @since 4.10
         */
        get() = gtk_font_dialog_button_get_font_features(gtkFontDialogButtonPointer.reinterpret())?.toKString()

        /**
         * Sets the font features of the button.
         *
         * @param fontFeatures the font features
         * @since 4.10
         */
        @GtkVersion4_10
        set(
            fontFeatures
        ) = gtk_font_dialog_button_set_font_features(gtkFontDialogButtonPointer.reinterpret(), fontFeatures)

    /**
     * The selected language for font features.
     *
     * This property will be updated to reflect the users choice
     * in the font chooser dialog.
     *
     * Listen to `notify::language` to get informed about changes
     * to the buttons language.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var language: Language?
        /**
         * Returns the language that is used for font features.
         *
         * @return the language
         * @since 4.10
         */
        get() = gtk_font_dialog_button_get_language(gtkFontDialogButtonPointer.reinterpret())?.run {
            Language(reinterpret())
        }

        /**
         * Sets the language to use for font features.
         *
         * @param language the new language
         * @since 4.10
         */
        @GtkVersion4_10
        set(
            language
        ) = gtk_font_dialog_button_set_language(
            gtkFontDialogButtonPointer.reinterpret(),
            language?.gPointer?.reinterpret()
        )

    /**
     * The level of detail for the font chooser dialog.
     */
    public open var level: FontLevel
        /**
         * Returns the level of detail at which this dialog
         * lets the user select fonts.
         *
         * @return the level of detail
         * @since 4.10
         */
        get() = gtk_font_dialog_button_get_level(gtkFontDialogButtonPointer.reinterpret()).run {
            FontLevel.fromNativeValue(this)
        }

        /**
         * Sets the level of detail at which this dialog
         * lets the user select fonts.
         *
         * @param level the level of detail
         * @since 4.10
         */
        @GtkVersion4_10
        set(level) = gtk_font_dialog_button_set_level(gtkFontDialogButtonPointer.reinterpret(), level.nativeValue)

    /**
     * Whether the buttons label will be drawn in the selected font.
     */
    public open var useFont: Boolean
        /**
         * Returns whether the selected font is used in the label.
         *
         * @return whether the selected font is used in the label
         * @since 4.10
         */
        get() = gtk_font_dialog_button_get_use_font(gtkFontDialogButtonPointer.reinterpret()).asBoolean()

        /**
         * If @use_font is `TRUE`, the font name will be written
         * using the selected font.
         *
         * @param useFont If `TRUE`, font name will be written using
         *   the chosen font
         * @since 4.10
         */
        @GtkVersion4_10
        set(
            useFont
        ) = gtk_font_dialog_button_set_use_font(gtkFontDialogButtonPointer.reinterpret(), useFont.asGBoolean())

    /**
     * Whether the buttons label will use the selected font size.
     */
    public open var useSize: Boolean
        /**
         * Returns whether the selected font size is used in the label.
         *
         * @return whether the selected font size is used in the label
         * @since 4.10
         */
        get() = gtk_font_dialog_button_get_use_size(gtkFontDialogButtonPointer.reinterpret()).asBoolean()

        /**
         * If @use_size is `TRUE`, the font name will be written
         * using the selected font size.
         *
         * @param useSize If `TRUE`, font name will be written using
         *   the chosen font size
         * @since 4.10
         */
        @GtkVersion4_10
        set(
            useSize
        ) = gtk_font_dialog_button_set_use_size(gtkFontDialogButtonPointer.reinterpret(), useSize.asGBoolean())

    /**
     * Creates a new `GtkFontDialogButton` with the
     * given `GtkFontDialog`.
     *
     * You can pass `NULL` to this function and set a `GtkFontDialog`
     * later. The button will be insensitive until that happens.
     *
     * @param dialog the `GtkFontDialog` to use
     * @return the new `GtkFontDialogButton`
     * @since 4.10
     */
    public constructor(
        dialog: FontDialog? = null,
    ) : this(gtk_font_dialog_button_new(dialog?.gtkFontDialogPointer?.reinterpret())!!.reinterpret())

    /**
     * Returns the `GtkFontDialog` of @self.
     *
     * @return the `GtkFontDialog`
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getDialog(): FontDialog? =
        gtk_font_dialog_button_get_dialog(gtkFontDialogButtonPointer.reinterpret())?.run {
            FontDialog(reinterpret())
        }

    /**
     * Returns the font of the button.
     *
     * This function is what should be used to obtain
     * the font that was chosen by the user. To get
     * informed about changes, listen to "notify::font-desc".
     *
     * @return the font
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getFontDesc(): FontDescription? =
        gtk_font_dialog_button_get_font_desc(gtkFontDialogButtonPointer.reinterpret())?.run {
            FontDescription(reinterpret())
        }

    /**
     * Sets a `GtkFontDialog` object to use for
     * creating the font chooser dialog that is
     * presented when the user clicks the button.
     *
     * @param dialog the new `GtkFontDialog`
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun setDialog(dialog: FontDialog): Unit = gtk_font_dialog_button_set_dialog(
        gtkFontDialogButtonPointer.reinterpret(),
        dialog.gtkFontDialogPointer.reinterpret()
    )

    /**
     * Sets the font of the button.
     *
     * @param fontDesc the new font
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun setFontDesc(fontDesc: FontDescription): Unit =
        gtk_font_dialog_button_set_font_desc(gtkFontDialogButtonPointer.reinterpret(), fontDesc.gPointer.reinterpret())

    /**
     * Emitted when the font dialog button is activated.
     *
     * The `::activate` signal on `GtkFontDialogButton` is an action signal
     * and emitting it causes the button to pop up its dialog.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 4.14
     */
    @GtkVersion4_14
    public fun connectActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate",
            connectActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<FontDialogButton> {
        override val type: GeneratedClassKGType<FontDialogButton> =
            GeneratedClassKGType(gtk_font_dialog_button_get_type()) { FontDialogButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FontDialogButton
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_font_dialog_button_get_type()
    }
}

private val connectActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
