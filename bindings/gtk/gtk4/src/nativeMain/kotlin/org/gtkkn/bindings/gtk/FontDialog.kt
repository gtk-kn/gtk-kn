// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.bindings.pango.FontDescription
import org.gtkkn.bindings.pango.FontFace
import org.gtkkn.bindings.pango.FontFamily
import org.gtkkn.bindings.pango.FontMap
import org.gtkkn.bindings.pango.Language
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gtk.GtkFontDialog
import org.gtkkn.native.gtk.gtk_font_dialog_choose_face
import org.gtkkn.native.gtk.gtk_font_dialog_choose_face_finish
import org.gtkkn.native.gtk.gtk_font_dialog_choose_family
import org.gtkkn.native.gtk.gtk_font_dialog_choose_family_finish
import org.gtkkn.native.gtk.gtk_font_dialog_choose_font
import org.gtkkn.native.gtk.gtk_font_dialog_choose_font_and_features
import org.gtkkn.native.gtk.gtk_font_dialog_choose_font_finish
import org.gtkkn.native.gtk.gtk_font_dialog_get_filter
import org.gtkkn.native.gtk.gtk_font_dialog_get_font_map
import org.gtkkn.native.gtk.gtk_font_dialog_get_language
import org.gtkkn.native.gtk.gtk_font_dialog_get_modal
import org.gtkkn.native.gtk.gtk_font_dialog_get_title
import org.gtkkn.native.gtk.gtk_font_dialog_get_type
import org.gtkkn.native.gtk.gtk_font_dialog_new
import org.gtkkn.native.gtk.gtk_font_dialog_set_filter
import org.gtkkn.native.gtk.gtk_font_dialog_set_font_map
import org.gtkkn.native.gtk.gtk_font_dialog_set_language
import org.gtkkn.native.gtk.gtk_font_dialog_set_modal
import org.gtkkn.native.gtk.gtk_font_dialog_set_title
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * A `GtkFontDialog` object collects the arguments that
 * are needed to present a font chooser dialog to the
 * user, such as a title for the dialog and whether it
 * should be modal.
 *
 * The dialog is shown with the [method@Gtk.FontDialog.choose_font]
 * function or its variants. This API follows the GIO async pattern,
 * and the result can be obtained by calling the corresponding
 * finish function, such as [method@Gtk.FontDialog.choose_font_finish].
 *
 * See [class@Gtk.FontDialogButton] for a convenient control
 * that uses `GtkFontDialog` and presents the results.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `font_desc`: font_desc: Out parameter is not supported
 * - method `language`: Property TypeInfo of getter and setter do not match
 *
 * @since 4.10
 */
@GtkVersion4_10
public open class FontDialog(
    pointer: CPointer<GtkFontDialog>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gtkFontDialogPointer: CPointer<GtkFontDialog>
        get() = gPointer.reinterpret()

    /**
     * Sets a filter to restrict what fonts are shown
     * in the font chooser dialog.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var filter: Filter?
        /**
         * Returns the filter that decides which fonts to display
         * in the font chooser dialog.
         *
         * @return the filter
         * @since 4.10
         */
        get() =
            gtk_font_dialog_get_filter(gtkFontDialogPointer.reinterpret())?.run {
                Filter(reinterpret())
            }

        /**
         * Adds a filter that decides which fonts to display
         * in the font chooser dialog.
         *
         * The `GtkFilter` must be able to handle both `PangoFontFamily`
         * and `PangoFontFace` objects.
         *
         * @param filter a `GtkFilter`
         * @since 4.10
         */
        @GtkVersion4_10
        set(
            filter
        ) = gtk_font_dialog_set_filter(gtkFontDialogPointer.reinterpret(), filter?.gtkFilterPointer?.reinterpret())

    /**
     * Sets a custom font map to select fonts from.
     *
     * A custom font map can be used to present application-specific
     * fonts instead of or in addition to the normal system fonts.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var fontMap: FontMap?
        /**
         * Returns the fontmap from which fonts are selected,
         * or `NULL` for the default fontmap.
         *
         * @return the fontmap
         * @since 4.10
         */
        get() =
            gtk_font_dialog_get_font_map(gtkFontDialogPointer.reinterpret())?.run {
                FontMap(reinterpret())
            }

        /**
         * Sets the fontmap from which fonts are selected.
         *
         * If @fontmap is `NULL`, the default fontmap is used.
         *
         * @param fontmap the fontmap
         * @since 4.10
         */
        @GtkVersion4_10
        set(
            fontmap
        ) =
            gtk_font_dialog_set_font_map(
                gtkFontDialogPointer.reinterpret(),
                fontmap?.pangoFontMapPointer?.reinterpret()
            )

    /**
     * Whether the font chooser dialog is modal.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var modal: Boolean
        /**
         * Returns whether the font chooser dialog
         * blocks interaction with the parent window
         * while it is presented.
         *
         * @return `TRUE` if the font chooser dialog is modal
         * @since 4.10
         */
        get() = gtk_font_dialog_get_modal(gtkFontDialogPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the font chooser dialog
         * blocks interaction with the parent window
         * while it is presented.
         *
         * @param modal the new value
         * @since 4.10
         */
        @GtkVersion4_10
        set(modal) = gtk_font_dialog_set_modal(gtkFontDialogPointer.reinterpret(), modal.asGBoolean())

    /**
     * A title that may be shown on the font chooser
     * dialog that is presented by [method@Gtk.FontDialog.choose_font].
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var title: String
        /**
         * Returns the title that will be shown on the
         * font chooser dialog.
         *
         * @return the title
         * @since 4.10
         */
        get() =
            gtk_font_dialog_get_title(gtkFontDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the title that will be shown on the
         * font chooser dialog.
         *
         * @param title the new title
         * @since 4.10
         */
        @GtkVersion4_10
        set(title) = gtk_font_dialog_set_title(gtkFontDialogPointer.reinterpret(), title)

    /**
     * Creates a new `GtkFontDialog` object.
     *
     * @return the new `GtkFontDialog`
     * @since 4.10
     */
    public constructor() : this(gtk_font_dialog_new()!!.reinterpret())

    /**
     * This function initiates a font selection operation by
     * presenting a dialog to the user for selecting a font face
     * (i.e. a font family and style, but not a specific font size).
     *
     * The @callback will be called when the dialog is dismissed.
     * It should call [method@Gtk.FontDialog.choose_face_finish]
     * to obtain the result.
     *
     * @param parent the parent `GtkWindow`
     * @param initialValue the initial value
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the operation is complete
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun chooseFace(
        parent: Window? = null,
        initialValue: FontFace? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        gtk_font_dialog_choose_face(
            gtkFontDialogPointer.reinterpret(),
            parent?.gtkWindowPointer?.reinterpret(),
            initialValue?.pangoFontFacePointer?.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the [method@Gtk.FontDialog.choose_face] call
     * and returns the resulting font face.
     *
     * @param result a `GAsyncResult`
     * @return the selected font face
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun chooseFaceFinish(result: AsyncResult): Result<FontFace?> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gtk_font_dialog_choose_face_finish(
                    gtkFontDialogPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    FontFace(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * This function initiates a font selection operation by
     * presenting a dialog to the user for selecting a font family.
     *
     * The @callback will be called when the dialog is dismissed.
     * It should call [method@Gtk.FontDialog.choose_family_finish]
     * to obtain the result.
     *
     * @param parent the parent `GtkWindow`
     * @param initialValue the initial value
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the operation is complete
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun chooseFamily(
        parent: Window? = null,
        initialValue: FontFamily? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        gtk_font_dialog_choose_family(
            gtkFontDialogPointer.reinterpret(),
            parent?.gtkWindowPointer?.reinterpret(),
            initialValue?.pangoFontFamilyPointer?.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the [method@Gtk.FontDialog.choose_family] call
     * and returns the resulting family.
     *
     * This function never returns an error. If the operation is
     * not finished successfully, the value passed as @initial_value
     * to [method@Gtk.FontDialog.choose_family] is returned.
     *
     * @param result a `GAsyncResult`
     * @return the selected family
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun chooseFamilyFinish(result: AsyncResult): Result<FontFamily?> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gtk_font_dialog_choose_family_finish(
                    gtkFontDialogPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    FontFamily(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * This function initiates a font selection operation by
     * presenting a dialog to the user for selecting a font.
     *
     * The @callback will be called when the dialog is dismissed.
     * It should call [method@Gtk.FontDialog.choose_font_finish]
     * to obtain the result.
     *
     * If you want to let the user select font features as well,
     * use [method@Gtk.FontDialog.choose_font_and_features] instead.
     *
     * @param parent the parent `GtkWindow`
     * @param initialValue the font to select initially
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the operation is complete
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun chooseFont(
        parent: Window? = null,
        initialValue: FontDescription? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        gtk_font_dialog_choose_font(
            gtkFontDialogPointer.reinterpret(),
            parent?.gtkWindowPointer?.reinterpret(),
            initialValue?.pangoFontDescriptionPointer,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * This function initiates a font selection operation by
     * presenting a dialog to the user for selecting a font and
     * font features.
     *
     * Font features affect how the font is rendered, for example
     * enabling glyph variants or ligatures.
     *
     * The @callback will be called when the dialog is dismissed.
     * It should call [method@Gtk.FontDialog.choose_font_and_features_finish]
     * to obtain the result.
     *
     * @param parent the parent `GtkWindow`
     * @param initialValue the font to select initially
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the operation is complete
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun chooseFontAndFeatures(
        parent: Window? = null,
        initialValue: FontDescription? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        gtk_font_dialog_choose_font_and_features(
            gtkFontDialogPointer.reinterpret(),
            parent?.gtkWindowPointer?.reinterpret(),
            initialValue?.pangoFontDescriptionPointer,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the [method@Gtk.FontDialog.choose_font] call
     * and returns the resulting font description.
     *
     * @param result a `GAsyncResult`
     * @return the selected font
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun chooseFontFinish(result: AsyncResult): Result<FontDescription?> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gtk_font_dialog_choose_font_finish(
                    gtkFontDialogPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    FontDescription(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Returns the filter that decides which fonts to display
     * in the font chooser dialog.
     *
     * @return the filter
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getFilter(): Filter? =
        gtk_font_dialog_get_filter(gtkFontDialogPointer.reinterpret())?.run {
            Filter(reinterpret())
        }

    /**
     * Returns the fontmap from which fonts are selected,
     * or `NULL` for the default fontmap.
     *
     * @return the fontmap
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getFontMap(): FontMap? =
        gtk_font_dialog_get_font_map(gtkFontDialogPointer.reinterpret())?.run {
            FontMap(reinterpret())
        }

    /**
     * Returns the language for which font features are applied.
     *
     * @return the language for font features
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getLanguage(): Language? =
        gtk_font_dialog_get_language(gtkFontDialogPointer.reinterpret())?.run {
            Language(reinterpret())
        }

    /**
     * Returns whether the font chooser dialog
     * blocks interaction with the parent window
     * while it is presented.
     *
     * @return `TRUE` if the font chooser dialog is modal
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getModal(): Boolean = gtk_font_dialog_get_modal(gtkFontDialogPointer.reinterpret()).asBoolean()

    /**
     * Returns the title that will be shown on the
     * font chooser dialog.
     *
     * @return the title
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getTitle(): String =
        gtk_font_dialog_get_title(gtkFontDialogPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Adds a filter that decides which fonts to display
     * in the font chooser dialog.
     *
     * The `GtkFilter` must be able to handle both `PangoFontFamily`
     * and `PangoFontFace` objects.
     *
     * @param filter a `GtkFilter`
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun setFilter(filter: Filter? = null): Unit =
        gtk_font_dialog_set_filter(gtkFontDialogPointer.reinterpret(), filter?.gtkFilterPointer?.reinterpret())

    /**
     * Sets the fontmap from which fonts are selected.
     *
     * If @fontmap is `NULL`, the default fontmap is used.
     *
     * @param fontmap the fontmap
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun setFontMap(fontmap: FontMap? = null): Unit =
        gtk_font_dialog_set_font_map(gtkFontDialogPointer.reinterpret(), fontmap?.pangoFontMapPointer?.reinterpret())

    /**
     * Sets the language for which font features are applied.
     *
     * @param language the language for font features
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun setLanguage(language: Language): Unit =
        gtk_font_dialog_set_language(gtkFontDialogPointer.reinterpret(), language.pangoLanguagePointer)

    /**
     * Sets whether the font chooser dialog
     * blocks interaction with the parent window
     * while it is presented.
     *
     * @param modal the new value
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun setModal(modal: Boolean): Unit =
        gtk_font_dialog_set_modal(gtkFontDialogPointer.reinterpret(), modal.asGBoolean())

    /**
     * Sets the title that will be shown on the
     * font chooser dialog.
     *
     * @param title the new title
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun setTitle(title: String): Unit = gtk_font_dialog_set_title(gtkFontDialogPointer.reinterpret(), title)

    public companion object : TypeCompanion<FontDialog> {
        override val type: GeneratedClassKGType<FontDialog> =
            GeneratedClassKGType(gtk_font_dialog_get_type()) { FontDialog(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
