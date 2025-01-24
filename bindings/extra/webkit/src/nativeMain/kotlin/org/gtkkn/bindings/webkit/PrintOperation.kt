// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.PageSetup
import org.gtkkn.bindings.gtk.PrintSettings
import org.gtkkn.bindings.gtk.Window
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.webkit.WebKitPrintOperation
import org.gtkkn.native.webkit.webkit_print_operation_get_page_setup
import org.gtkkn.native.webkit.webkit_print_operation_get_print_settings
import org.gtkkn.native.webkit.webkit_print_operation_get_type
import org.gtkkn.native.webkit.webkit_print_operation_new
import org.gtkkn.native.webkit.webkit_print_operation_print
import org.gtkkn.native.webkit.webkit_print_operation_run_dialog
import org.gtkkn.native.webkit.webkit_print_operation_set_page_setup
import org.gtkkn.native.webkit.webkit_print_operation_set_print_settings
import kotlin.ULong
import kotlin.Unit

/**
 * Controls a print operation.
 *
 * A #WebKitPrintOperation controls a print operation in WebKit. With
 * a similar API to #GtkPrintOperation, it lets you set the print
 * settings with webkit_print_operation_set_print_settings() or
 * display the print dialog with webkit_print_operation_run_dialog().
 *
 * ## Skipped during bindings generation
 *
 * - method `web-view`: Property has no getter nor setter
 */
public class PrintOperation(public val webkitPrintOperationPointer: CPointer<WebKitPrintOperation>) :
    Object(webkitPrintOperationPointer.reinterpret()),
    KGTyped {
    /**
     * The initial #GtkPageSetup for the print operation.
     */
    public var pageSetup: PageSetup
        /**
         * Return the current page setup of @print_operation.
         *
         * It returns null until
         * either webkit_print_operation_set_page_setup() or webkit_print_operation_run_dialog()
         * have been called.
         *
         * @return the current #GtkPageSetup of @print_operation.
         */
        get() = webkit_print_operation_get_page_setup(webkitPrintOperationPointer)!!.run {
            PageSetup(this)
        }

        /**
         * Set the current page setup of @print_operation.
         *
         * Current page setup is used for the
         * initial values of the print dialog when webkit_print_operation_run_dialog() is called.
         *
         * @param pageSetup a #GtkPageSetup to set
         */
        set(
            pageSetup
        ) = webkit_print_operation_set_page_setup(webkitPrintOperationPointer, pageSetup.gtkPageSetupPointer)

    /**
     * The initial #GtkPrintSettings for the print operation.
     */
    public var printSettings: PrintSettings
        /**
         * Return the current print settings of @print_operation.
         *
         * It returns null until
         * either webkit_print_operation_set_print_settings() or webkit_print_operation_run_dialog()
         * have been called.
         *
         * @return the current #GtkPrintSettings of @print_operation.
         */
        get() = webkit_print_operation_get_print_settings(webkitPrintOperationPointer)!!.run {
            PrintSettings(this)
        }

        /**
         * Set the current print settings of @print_operation.
         *
         * Set the current print settings of @print_operation. Current print settings are used for
         * the initial values of the print dialog when webkit_print_operation_run_dialog() is called.
         *
         * @param printSettings a #GtkPrintSettings to set
         */
        set(
            printSettings
        ) = webkit_print_operation_set_print_settings(
            webkitPrintOperationPointer,
            printSettings.gtkPrintSettingsPointer
        )

    /**
     * Create a new #WebKitPrintOperation to print @web_view contents.
     *
     * @param webView a #WebKitWebView
     * @return a new #WebKitPrintOperation.
     */
    public constructor(
        webView: WebView,
    ) : this(webkit_print_operation_new(webView.webkitWebViewPointer)!!.reinterpret())

    /**
     * Start a print operation using current print settings and page setup.
     *
     * Start a print operation using current print settings and page setup
     * without showing the print dialog. If either print settings or page setup
     * are not set with webkit_print_operation_set_print_settings() and
     * webkit_print_operation_set_page_setup(), the default options will be used
     * and the print job will be sent to the default printer.
     * The #WebKitPrintOperation::finished signal is emitted when the printing
     * operation finishes. If an error occurs while printing the signal
     * #WebKitPrintOperation::failed is emitted before #WebKitPrintOperation::finished.
     *
     * If the app is running in a sandbox, this function only works if printing to
     * a file that is in a location accessible to the sandbox, usually acquired
     * through the File Chooser portal. This function will not work for physical
     * printers when running in a sandbox.
     */
    public fun print(): Unit = webkit_print_operation_print(webkitPrintOperationPointer)

    /**
     * Run the print dialog and start printing.
     *
     * Run the print dialog and start printing using the options selected by
     * the user. This method returns when the print dialog is closed.
     * If the print dialog is cancelled %WEBKIT_PRINT_OPERATION_RESPONSE_CANCEL
     * is returned. If the user clicks on the print button, %WEBKIT_PRINT_OPERATION_RESPONSE_PRINT
     * is returned and the print operation starts. In this case, the #WebKitPrintOperation::finished
     * signal is emitted when the operation finishes. If an error occurs while printing, the signal
     * #WebKitPrintOperation::failed is emitted before #WebKitPrintOperation::finished.
     * If the print dialog is not cancelled current print settings and page setup of @print_operation
     * are updated with options selected by the user when Print button is pressed in print dialog.
     * You can get the updated print settings and page setup by calling
     * webkit_print_operation_get_print_settings() and webkit_print_operation_get_page_setup()
     * after this method.
     *
     * @param parent transient parent of the print dialog
     * @return the #WebKitPrintOperationResponse of the print dialog
     */
    public fun runDialog(parent: Window? = null): PrintOperationResponse =
        webkit_print_operation_run_dialog(webkitPrintOperationPointer, parent?.gtkWindowPointer).run {
            PrintOperationResponse.fromNativeValue(this)
        }

    /**
     * Emitted when an error occurs while printing. The given @error, of the domain
     * %WEBKIT_PRINT_ERROR, contains further details of the failure.
     * The #WebKitPrintOperation::finished signal is emitted after this one.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `error` the #GError that was triggered
     */
    public fun onFailed(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (error: Error) -> Unit): ULong =
        g_signal_connect_data(
            webkitPrintOperationPointer,
            "failed",
            onFailedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "failed" signal. See [onFailed].
     *
     * @param error the #GError that was triggered
     */
    public fun emitFailed(error: Error) {
        g_signal_emit_by_name(webkitPrintOperationPointer.reinterpret(), "failed", error.glibErrorPointer)
    }

    /**
     * Emitted when the print operation has finished doing everything
     * required for printing.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onFinished(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            webkitPrintOperationPointer,
            "finished",
            onFinishedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "finished" signal. See [onFinished].
     */
    public fun emitFinished() {
        g_signal_emit_by_name(webkitPrintOperationPointer.reinterpret(), "finished")
    }

    public companion object : TypeCompanion<PrintOperation> {
        override val type: GeneratedClassKGType<PrintOperation> =
            GeneratedClassKGType(webkit_print_operation_get_type()) { PrintOperation(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of PrintOperation
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_print_operation_get_type()
    }
}

private val onFailedFunc: CPointer<CFunction<(CPointer<GError>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        error: CPointer<GError>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(error: Error) -> Unit>().get().invoke(
        error!!.run {
            Error(this)
        }
    )
}
    .reinterpret()

private val onFinishedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
