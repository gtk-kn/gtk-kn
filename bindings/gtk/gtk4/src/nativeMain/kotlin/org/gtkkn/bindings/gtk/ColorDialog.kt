// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkColorDialog
import org.gtkkn.native.gtk.gtk_color_dialog_choose_rgba
import org.gtkkn.native.gtk.gtk_color_dialog_choose_rgba_finish
import org.gtkkn.native.gtk.gtk_color_dialog_get_modal
import org.gtkkn.native.gtk.gtk_color_dialog_get_title
import org.gtkkn.native.gtk.gtk_color_dialog_get_type
import org.gtkkn.native.gtk.gtk_color_dialog_get_with_alpha
import org.gtkkn.native.gtk.gtk_color_dialog_new
import org.gtkkn.native.gtk.gtk_color_dialog_set_modal
import org.gtkkn.native.gtk.gtk_color_dialog_set_title
import org.gtkkn.native.gtk.gtk_color_dialog_set_with_alpha
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * A `GtkColorDialog` object collects the arguments that
 * are needed to present a color chooser dialog to the
 * user, such as a title for the dialog and whether it
 * should be modal.
 *
 * The dialog is shown with the [method@Gtk.ColorDialog.choose_rgba]
 * function. This API follows the GIO async pattern, and the
 * result can be obtained by calling
 * [method@Gtk.ColorDialog.choose_rgba_finish].
 *
 * See [class@Gtk.ColorDialogButton] for a convenient control
 * that uses `GtkColorDialog` and presents the results.
 * @since 4.10
 */
@GtkVersion4_10
public open class ColorDialog(public val gtkColorDialogPointer: CPointer<GtkColorDialog>) :
    Object(gtkColorDialogPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Whether the color chooser dialog is modal.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var modal: Boolean
        /**
         * Returns whether the color chooser dialog
         * blocks interaction with the parent window
         * while it is presented.
         *
         * @return `TRUE` if the color chooser dialog is modal
         * @since 4.10
         */
        get() = gtk_color_dialog_get_modal(gtkColorDialogPointer).asBoolean()

        /**
         * Sets whether the color chooser dialog
         * blocks interaction with the parent window
         * while it is presented.
         *
         * @param modal the new value
         * @since 4.10
         */
        @GtkVersion4_10
        set(modal) = gtk_color_dialog_set_modal(gtkColorDialogPointer, modal.asGBoolean())

    /**
     * A title that may be shown on the color chooser
     * dialog that is presented by [method@Gtk.ColorDialog.choose_rgba].
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var title: String
        /**
         * Returns the title that will be shown on the
         * color chooser dialog.
         *
         * @return the title
         * @since 4.10
         */
        get() = gtk_color_dialog_get_title(gtkColorDialogPointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets the title that will be shown on the
         * color chooser dialog.
         *
         * @param title the new title
         * @since 4.10
         */
        @GtkVersion4_10
        set(title) = gtk_color_dialog_set_title(gtkColorDialogPointer, title)

    /**
     * Whether colors may have alpha (translucency).
     *
     * When with-alpha is false, the color that is selected
     * will be forced to have alpha == 1.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var withAlpha: Boolean
        /**
         * Returns whether colors may have alpha.
         *
         * @return `TRUE` if colors may have alpha
         * @since 4.10
         */
        get() = gtk_color_dialog_get_with_alpha(gtkColorDialogPointer).asBoolean()

        /**
         * Sets whether colors may have alpha.
         *
         * @param withAlpha the new value
         * @since 4.10
         */
        @GtkVersion4_10
        set(withAlpha) = gtk_color_dialog_set_with_alpha(gtkColorDialogPointer, withAlpha.asGBoolean())

    /**
     * Creates a new `GtkColorDialog` object.
     *
     * @return the new `GtkColorDialog`
     * @since 4.10
     */
    public constructor() : this(gtk_color_dialog_new()!!) {
        InstanceCache.put(this)
    }

    /**
     * This function initiates a color choice operation by
     * presenting a color chooser dialog to the user.
     *
     * The @callback will be called when the dialog is dismissed.
     * It should call [method@Gtk.ColorDialog.choose_rgba_finish]
     * to obtain the result.
     *
     * @param parent the parent `GtkWindow`
     * @param initialColor the color to select initially
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the operation is complete
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun chooseRgba(
        parent: Window? = null,
        initialColor: Rgba? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_color_dialog_choose_rgba(
        gtkColorDialogPointer,
        parent?.gtkWindowPointer,
        initialColor?.gdkRgbaPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes the [method@Gtk.ColorDialog.choose_rgba] call and
     * returns the resulting color.
     *
     * @param result a `GAsyncResult`
     * @return the selected color, or
     *   `NULL` and @error is set
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun chooseRgbaFinish(result: AsyncResult): Result<Rgba?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_color_dialog_choose_rgba_finish(
            gtkColorDialogPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            Rgba(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    public companion object : TypeCompanion<ColorDialog> {
        override val type: GeneratedClassKGType<ColorDialog> =
            GeneratedClassKGType(getTypeOrNull()!!) { ColorDialog(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ColorDialog
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_color_dialog_get_type()

        /**
         * Gets the GType of from the symbol `gtk_color_dialog_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_color_dialog_get_type")
    }
}
