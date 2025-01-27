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
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.gio.OutputStream
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPrintDialog
import org.gtkkn.native.gtk.gtk_print_dialog_get_accept_label
import org.gtkkn.native.gtk.gtk_print_dialog_get_modal
import org.gtkkn.native.gtk.gtk_print_dialog_get_page_setup
import org.gtkkn.native.gtk.gtk_print_dialog_get_print_settings
import org.gtkkn.native.gtk.gtk_print_dialog_get_title
import org.gtkkn.native.gtk.gtk_print_dialog_get_type
import org.gtkkn.native.gtk.gtk_print_dialog_new
import org.gtkkn.native.gtk.gtk_print_dialog_print
import org.gtkkn.native.gtk.gtk_print_dialog_print_file
import org.gtkkn.native.gtk.gtk_print_dialog_print_file_finish
import org.gtkkn.native.gtk.gtk_print_dialog_print_finish
import org.gtkkn.native.gtk.gtk_print_dialog_set_accept_label
import org.gtkkn.native.gtk.gtk_print_dialog_set_modal
import org.gtkkn.native.gtk.gtk_print_dialog_set_page_setup
import org.gtkkn.native.gtk.gtk_print_dialog_set_print_settings
import org.gtkkn.native.gtk.gtk_print_dialog_set_title
import org.gtkkn.native.gtk.gtk_print_dialog_setup
import org.gtkkn.native.gtk.gtk_print_dialog_setup_finish
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * A `GtkPrintDialog` object collects the arguments that
 * are needed to present a print dialog to the user, such
 * as a title for the dialog and whether it should be modal.
 *
 * The dialog is shown with the [method@Gtk.PrintDialog.setup] function.
 * The actual printing can be done with [method@Gtk.PrintDialog.print] or
 * [method@Gtk.PrintDialog.print_file]. These APIs follows the GIO async pattern,
 * and the results can be obtained by calling the corresponding finish methods.
 * @since 4.14
 */
@GtkVersion4_14
public open class PrintDialog(public val gtkPrintDialogPointer: CPointer<GtkPrintDialog>) :
    Object(gtkPrintDialogPointer.reinterpret()),
    KGTyped {
    /**
     * A label that may be shown on the accept button of a print dialog
     * that is presented by [method@Gtk.PrintDialog.setup].
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public open var acceptLabel: String
        /**
         * Returns the label that will be shown on the
         * accept button of the print dialog.
         *
         * @return the accept label
         * @since 4.14
         */
        get() = gtk_print_dialog_get_accept_label(gtkPrintDialogPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the label that will be shown on the
         * accept button of the print dialog shown for
         * [method@Gtk.PrintDialog.setup].
         *
         * @param acceptLabel the new accept label
         * @since 4.14
         */
        @GtkVersion4_14
        set(acceptLabel) = gtk_print_dialog_set_accept_label(gtkPrintDialogPointer, acceptLabel)

    /**
     * Whether the print dialog is modal.
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public open var modal: Boolean
        /**
         * Returns whether the print dialog blocks
         * interaction with the parent window while
         * it is presented.
         *
         * @return whether the print dialog is modal
         * @since 4.14
         */
        get() = gtk_print_dialog_get_modal(gtkPrintDialogPointer).asBoolean()

        /**
         * Sets whether the print dialog blocks
         * interaction with the parent window while
         * it is presented.
         *
         * @param modal the new value
         * @since 4.14
         */
        @GtkVersion4_14
        set(modal) = gtk_print_dialog_set_modal(gtkPrintDialogPointer, modal.asGBoolean())

    /**
     * The page setup to use.
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public open var pageSetup: PageSetup
        /**
         * Returns the page setup.
         *
         * @return the page setup
         * @since 4.14
         */
        get() = gtk_print_dialog_get_page_setup(gtkPrintDialogPointer)!!.run {
            PageSetup(this)
        }

        /**
         * Set the page setup for the print dialog.
         *
         * @param pageSetup the new page setup
         * @since 4.14
         */
        @GtkVersion4_14
        set(pageSetup) = gtk_print_dialog_set_page_setup(gtkPrintDialogPointer, pageSetup.gtkPageSetupPointer)

    /**
     * The print settings to use.
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public open var printSettings: PrintSettings
        /**
         * Returns the print settings for the print dialog.
         *
         * @return the settings
         * @since 4.14
         */
        get() = gtk_print_dialog_get_print_settings(gtkPrintDialogPointer)!!.run {
            PrintSettings(this)
        }

        /**
         * Sets the print settings for the print dialog.
         *
         * @param printSettings the new print settings
         * @since 4.14
         */
        @GtkVersion4_14
        set(
            printSettings
        ) = gtk_print_dialog_set_print_settings(gtkPrintDialogPointer, printSettings.gtkPrintSettingsPointer)

    /**
     * A title that may be shown on the print dialog that is
     * presented by [method@Gtk.PrintDialog.setup].
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public open var title: String
        /**
         * Returns the title that will be shown on the
         * print dialog.
         *
         * @return the title
         * @since 4.14
         */
        get() = gtk_print_dialog_get_title(gtkPrintDialogPointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets the title that will be shown on the print dialog.
         *
         * @param title the new title
         * @since 4.14
         */
        @GtkVersion4_14
        set(title) = gtk_print_dialog_set_title(gtkPrintDialogPointer, title)

    /**
     * Creates a new `GtkPrintDialog` object.
     *
     * @return the new `GtkPrintDialog`
     * @since 4.14
     */
    public constructor() : this(gtk_print_dialog_new()!!.reinterpret())

    /**
     * This function prints content from a stream.
     *
     * If you pass `NULL` as @setup, then this method will present a print dialog.
     * Otherwise, it will attempt to print directly, without user interaction.
     *
     * The @callback will be called when the printing is done. It should call
     * [method@Gtk.PrintDialog.print_finish] to obtain the results.
     *
     * @param parent the parent `GtkWindow`
     * @param setup the `GtkPrintSetup` to use
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the operation is complete
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun print(
        parent: Window? = null,
        setup: PrintSetup? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_print_dialog_print(
        gtkPrintDialogPointer,
        parent?.gtkWindowPointer,
        setup?.gtkPrintSetupPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * This function prints a file.
     *
     * If you pass `NULL` as @setup, then this method will present a print dialog.
     * Otherwise, it will attempt to print directly, without user interaction.
     *
     * The @callback will be called when the printing is done. It should call
     * [method@Gtk.PrintDialog.print_file_finish] to obtain the results.
     *
     * @param parent the parent `GtkWindow`
     * @param setup the `GtkPrintSetup` to use
     * @param file the `GFile` to print
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the operation is complete
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun printFile(
        parent: Window? = null,
        setup: PrintSetup? = null,
        `file`: File,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_print_dialog_print_file(
        gtkPrintDialogPointer,
        parent?.gtkWindowPointer,
        setup?.gtkPrintSetupPointer,
        `file`.gioFilePointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes the [method@Gtk.PrintDialog.print_file] call and
     * returns the results.
     *
     * @param result a `GAsyncResult`
     * @return Whether the call was successful
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun printFileFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_print_dialog_print_file_finish(
            gtkPrintDialogPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Finishes the [method@Gtk.PrintDialog.print] call and
     * returns the results.
     *
     * If the call was successful, the content to be printed should be
     * written to the returned output stream. Otherwise, `NULL` is returned.
     *
     * The overall results of the print operation will be returned in the
     * [method@Gio.OutputStream.close] call, so if you are interested in the
     * results, you need to explicitly close the output stream (it will be
     * closed automatically if you just unref it). Be aware that the close
     * call may not be instant as it operation will for the printer to finish
     * printing.
     *
     * @param result a `GAsyncResult`
     * @return a [class@Gio.OutputStream]
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun printFinish(result: AsyncResult): Result<OutputStream?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_print_dialog_print_finish(
            gtkPrintDialogPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            OutputStream.OutputStreamImpl(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * This function presents a print dialog to let the user select a printer,
     * and set up print settings and page setup.
     *
     * The @callback will be called when the dialog is dismissed.
     * It should call [method@Gtk.PrintDialog.setup_finish]
     * to obtain the results in the form of a [struct@Gtk.PrintSetup],
     * that can then be passed to [method@Gtk.PrintDialog.print]
     * or [method@Gtk.PrintDialog.print_file].
     *
     * One possible use for this method is to have the user select a printer,
     * then show a page setup UI in the application (e.g. to arrange images
     * on a page), then call [method@Gtk.PrintDialog.print] on @self
     * to do the printing without further user interaction.
     *
     * @param parent the parent `GtkWindow`
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the operation is complete
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun setup(
        parent: Window? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_print_dialog_setup(
        gtkPrintDialogPointer,
        parent?.gtkWindowPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes the [method@Gtk.PrintDialog.setup] call.
     *
     * If the call was successful, it returns a [struct@Gtk.PrintSetup]
     * which contains the print settings and page setup information that
     * will be used to print.
     *
     * @param result a `GAsyncResult`
     * @return The `GtkPrintSetup` object that resulted from the call,
     *   or `NULL` if the call was not successful
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun setupFinish(result: AsyncResult): Result<PrintSetup?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_print_dialog_setup_finish(
            gtkPrintDialogPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            PrintSetup(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    public companion object : TypeCompanion<PrintDialog> {
        override val type: GeneratedClassKGType<PrintDialog> =
            GeneratedClassKGType(getTypeOrNull("gtk_print_dialog_get_type")!!) { PrintDialog(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of PrintDialog
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_print_dialog_get_type()
    }
}
