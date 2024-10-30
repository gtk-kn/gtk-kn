// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GObject
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkPageSetup
import org.gtkkn.native.gtk.GtkPrintContext
import org.gtkkn.native.gtk.GtkPrintOperation
import org.gtkkn.native.gtk.GtkPrintOperationPreview
import org.gtkkn.native.gtk.GtkPrintOperationResult
import org.gtkkn.native.gtk.GtkPrintSettings
import org.gtkkn.native.gtk.GtkWidget
import org.gtkkn.native.gtk.GtkWindow
import org.gtkkn.native.gtk.gtk_print_operation_cancel
import org.gtkkn.native.gtk.gtk_print_operation_draw_page_finish
import org.gtkkn.native.gtk.gtk_print_operation_get_default_page_setup
import org.gtkkn.native.gtk.gtk_print_operation_get_embed_page_setup
import org.gtkkn.native.gtk.gtk_print_operation_get_error
import org.gtkkn.native.gtk.gtk_print_operation_get_has_selection
import org.gtkkn.native.gtk.gtk_print_operation_get_n_pages_to_print
import org.gtkkn.native.gtk.gtk_print_operation_get_print_settings
import org.gtkkn.native.gtk.gtk_print_operation_get_status
import org.gtkkn.native.gtk.gtk_print_operation_get_status_string
import org.gtkkn.native.gtk.gtk_print_operation_get_support_selection
import org.gtkkn.native.gtk.gtk_print_operation_get_type
import org.gtkkn.native.gtk.gtk_print_operation_is_finished
import org.gtkkn.native.gtk.gtk_print_operation_new
import org.gtkkn.native.gtk.gtk_print_operation_run
import org.gtkkn.native.gtk.gtk_print_operation_set_allow_async
import org.gtkkn.native.gtk.gtk_print_operation_set_current_page
import org.gtkkn.native.gtk.gtk_print_operation_set_custom_tab_label
import org.gtkkn.native.gtk.gtk_print_operation_set_default_page_setup
import org.gtkkn.native.gtk.gtk_print_operation_set_defer_drawing
import org.gtkkn.native.gtk.gtk_print_operation_set_embed_page_setup
import org.gtkkn.native.gtk.gtk_print_operation_set_export_filename
import org.gtkkn.native.gtk.gtk_print_operation_set_has_selection
import org.gtkkn.native.gtk.gtk_print_operation_set_job_name
import org.gtkkn.native.gtk.gtk_print_operation_set_n_pages
import org.gtkkn.native.gtk.gtk_print_operation_set_print_settings
import org.gtkkn.native.gtk.gtk_print_operation_set_show_progress
import org.gtkkn.native.gtk.gtk_print_operation_set_support_selection
import org.gtkkn.native.gtk.gtk_print_operation_set_track_print_status
import org.gtkkn.native.gtk.gtk_print_operation_set_unit
import org.gtkkn.native.gtk.gtk_print_operation_set_use_full_page
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.String
import kotlin.ULong

/**
 * `GtkPrintOperation` is the high-level, portable printing API.
 *
 * It looks a bit different than other GTK dialogs such as the
 * `GtkFileChooser`, since some platforms don’t expose enough
 * infrastructure to implement a good print dialog. On such
 * platforms, `GtkPrintOperation` uses the native print dialog.
 * On platforms which do not provide a native print dialog, GTK
 * uses its own, see [class@Gtk.PrintUnixDialog].
 *
 * The typical way to use the high-level printing API is to create
 * a `GtkPrintOperation` object with [ctor@Gtk.PrintOperation.new]
 * when the user selects to print. Then you set some properties on it,
 * e.g. the page size, any [class@Gtk.PrintSettings] from previous print
 * operations, the number of pages, the current page, etc.
 *
 * Then you start the print operation by calling [method@Gtk.PrintOperation.run].
 * It will then show a dialog, let the user select a printer and options.
 * When the user finished the dialog, various signals will be emitted on
 * the `GtkPrintOperation`, the main one being
 * [signal@Gtk.PrintOperation::draw-page], which you are supposed to handle
 * and render the page on the provided [class@Gtk.PrintContext] using Cairo.
 *
 * # The high-level printing API
 *
 * ```c
 * static GtkPrintSettings *settings = NULL;
 *
 * static void
 * do_print (void)
 * {
 *   GtkPrintOperation *print;
 *   GtkPrintOperationResult res;
 *
 *   print = gtk_print_operation_new ();
 *
 *   if (settings != NULL)
 *     gtk_print_operation_set_print_settings (print, settings);
 *
 *   g_signal_connect (print, "begin_print", G_CALLBACK (begin_print), NULL);
 *   g_signal_connect (print, "draw_page", G_CALLBACK (draw_page), NULL);
 *
 *   res = gtk_print_operation_run (print, GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG,
 *                                  GTK_WINDOW (main_window), NULL);
 *
 *   if (res == GTK_PRINT_OPERATION_RESULT_APPLY)
 *     {
 *       if (settings != NULL)
 *         g_object_unref (settings);
 *       settings = g_object_ref (gtk_print_operation_get_print_settings (print));
 *     }
 *
 *   g_object_unref (print);
 * }
 * ```
 *
 * By default `GtkPrintOperation` uses an external application to do
 * print preview. To implement a custom print preview, an application
 * must connect to the preview signal. The functions
 * [method@Gtk.PrintOperationPreview.render_page],
 * [method@Gtk.PrintOperationPreview.end_preview] and
 * [method@Gtk.PrintOperationPreview.is_selected]
 * are useful when implementing a print preview.
 *
 * ## Skipped during bindings generation
 *
 * - method `allow-async`: Property has no getter
 * - method `current-page`: Property has no getter
 * - method `custom-tab-label`: Property has no getter
 * - method `default-page-setup`: Property TypeInfo of getter and setter do not match
 * - method `export-filename`: Property has no getter
 * - method `job-name`: Property has no getter
 * - method `n-pages`: Property has no getter
 * - method `show-progress`: Property has no getter
 * - method `track-print-status`: Property has no getter
 * - method `unit`: Property has no getter
 * - method `use-full-page`: Property has no getter
 */
public open class PrintOperation(
    pointer: CPointer<GtkPrintOperation>,
) : Object(pointer.reinterpret()),
    PrintOperationPreview,
    KGTyped {
    public val gtkPrintOperationPointer: CPointer<GtkPrintOperation>
        get() = gPointer.reinterpret()

    override val gtkPrintOperationPreviewPointer: CPointer<GtkPrintOperationPreview>
        get() = gPointer.reinterpret()

    /**
     * If true, page size combo box and orientation combo box
     * are embedded into page setup page.
     */
    public open var embedPageSetup: Boolean
        /**
         * Gets whether page setup selection combos are embedded
         *
         * @return whether page setup selection combos are embedded
         */
        get() = gtk_print_operation_get_embed_page_setup(gtkPrintOperationPointer.reinterpret()).asBoolean()

        /**
         * Embed page size combo box and orientation combo box into page setup page.
         *
         * Selected page setup is stored as default page setup in `GtkPrintOperation`.
         *
         * @param embed true to embed page setup selection in the `GtkPrintUnixDialog`
         */
        set(
            embed
        ) = gtk_print_operation_set_embed_page_setup(gtkPrintOperationPointer.reinterpret(), embed.asGBoolean())

    /**
     * Determines whether there is a selection in your application.
     *
     * This can allow your application to print the selection.
     * This is typically used to make a "Selection" button sensitive.
     */
    public open var hasSelection: Boolean
        /**
         * Gets whether there is a selection.
         *
         * @return whether there is a selection
         */
        get() = gtk_print_operation_get_has_selection(gtkPrintOperationPointer.reinterpret()).asBoolean()

        /**
         * Sets whether there is a selection to print.
         *
         * Application has to set number of pages to which the selection
         * will draw by [method@Gtk.PrintOperation.set_n_pages] in a handler
         * for the [signal@Gtk.PrintOperation::begin-print] signal.
         *
         * @param hasSelection true indicates that a selection exists
         */
        set(
            hasSelection
        ) = gtk_print_operation_set_has_selection(gtkPrintOperationPointer.reinterpret(), hasSelection.asGBoolean())

    /**
     * The number of pages that will be printed.
     *
     * Note that this value is set during print preparation phase
     * (%GTK_PRINT_STATUS_PREPARING), so this value should never be
     * get before the data generation phase (%GTK_PRINT_STATUS_GENERATING_DATA).
     * You can connect to the [signal@Gtk.PrintOperation::status-changed] signal
     * and call [method@Gtk.PrintOperation.get_n_pages_to_print] when
     * print status is %GTK_PRINT_STATUS_GENERATING_DATA.
     *
     * This is typically used to track the progress of print operation.
     */
    public open val nPagesToPrint: Int
        /**
         * Returns the number of pages that will be printed.
         *
         * Note that this value is set during print preparation phase
         * (%GTK_PRINT_STATUS_PREPARING), so this function should never be
         * called before the data generation phase (%GTK_PRINT_STATUS_GENERATING_DATA).
         * You can connect to the [signal@Gtk.PrintOperation::status-changed]
         * signal and call gtk_print_operation_get_n_pages_to_print() when
         * print status is %GTK_PRINT_STATUS_GENERATING_DATA.
         *
         * This is typically used to track the progress of print operation.
         *
         * @return the number of pages that will be printed
         */
        get() = gtk_print_operation_get_n_pages_to_print(gtkPrintOperationPointer.reinterpret())

    /**
     * The `GtkPrintSettings` used for initializing the dialog.
     *
     * Setting this property is typically used to re-establish
     * print settings from a previous print operation, see
     * [method@Gtk.PrintOperation.run].
     */
    public open var printSettings: PrintSettings?
        /**
         * Returns the current print settings.
         *
         * Note that the return value is null until either
         * [method@Gtk.PrintOperation.set_print_settings] or
         * [method@Gtk.PrintOperation.run] have been called.
         *
         * @return the current print settings of @op.
         */
        get() =
            gtk_print_operation_get_print_settings(gtkPrintOperationPointer.reinterpret())?.run {
                PrintSettings(reinterpret())
            }

        /**
         * Sets the print settings for @op.
         *
         * This is typically used to re-establish print settings
         * from a previous print operation, see [method@Gtk.PrintOperation.run].
         *
         * @param printSettings `GtkPrintSettings`
         */
        set(
            printSettings
        ) =
            gtk_print_operation_set_print_settings(
                gtkPrintOperationPointer.reinterpret(),
                printSettings?.gtkPrintSettingsPointer?.reinterpret()
            )

    /**
     * The status of the print operation.
     */
    public open val status: PrintStatus
        /**
         * Returns the status of the print operation.
         *
         * Also see [method@Gtk.PrintOperation.get_status_string].
         *
         * @return the status of the print operation
         */
        get() =
            gtk_print_operation_get_status(gtkPrintOperationPointer.reinterpret()).run {
                PrintStatus.fromNativeValue(this)
            }

    /**
     * A string representation of the status of the print operation.
     *
     * The string is translated and suitable for displaying the print
     * status e.g. in a `GtkStatusbar`.
     *
     * See the [property@Gtk.PrintOperation:status] property for a status
     * value that is suitable for programmatic use.
     */
    public open val statusString: String
        /**
         * Returns a string representation of the status of the
         * print operation.
         *
         * The string is translated and suitable for displaying
         * the print status e.g. in a `GtkStatusbar`.
         *
         * Use [method@Gtk.PrintOperation.get_status] to obtain
         * a status value that is suitable for programmatic use.
         *
         * @return a string representation of the status
         *    of the print operation
         */
        get() =
            gtk_print_operation_get_status_string(gtkPrintOperationPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * If true, the print operation will support print of selection.
     *
     * This allows the print dialog to show a "Selection" button.
     */
    public open var supportSelection: Boolean
        /**
         * Gets whether the application supports print of selection
         *
         * @return whether the application supports print of selection
         */
        get() = gtk_print_operation_get_support_selection(gtkPrintOperationPointer.reinterpret()).asBoolean()

        /**
         * Sets whether selection is supported by `GtkPrintOperation`.
         *
         * @param supportSelection true to support selection
         */
        set(
            supportSelection
        ) =
            gtk_print_operation_set_support_selection(
                gtkPrintOperationPointer.reinterpret(),
                supportSelection.asGBoolean()
            )

    /**
     * Creates a new `GtkPrintOperation`.
     *
     * @return a new `GtkPrintOperation`
     */
    public constructor() : this(gtk_print_operation_new()!!.reinterpret())

    /**
     * Cancels a running print operation.
     *
     * This function may be called from a [signal@Gtk.PrintOperation::begin-print],
     * [signal@Gtk.PrintOperation::paginate] or [signal@Gtk.PrintOperation::draw-page]
     * signal handler to stop the currently running print operation.
     */
    public open fun cancel(): kotlin.Unit = gtk_print_operation_cancel(gtkPrintOperationPointer.reinterpret())

    /**
     * Signal that drawing of particular page is complete.
     *
     * It is called after completion of page drawing (e.g. drawing
     * in another thread). If [method@Gtk.PrintOperation.set_defer_drawing]
     * was called before, then this function has to be called by application.
     * Otherwise it is called by GTK itself.
     */
    public open fun drawPageFinish(): kotlin.Unit =
        gtk_print_operation_draw_page_finish(gtkPrintOperationPointer.reinterpret())

    /**
     * Returns the default page setup.
     *
     * @return the default page setup
     */
    public open fun getDefaultPageSetup(): PageSetup =
        gtk_print_operation_get_default_page_setup(gtkPrintOperationPointer.reinterpret())!!.run {
            PageSetup(reinterpret())
        }

    /**
     * Gets whether page setup selection combos are embedded
     *
     * @return whether page setup selection combos are embedded
     */
    public open fun getEmbedPageSetup(): Boolean =
        gtk_print_operation_get_embed_page_setup(gtkPrintOperationPointer.reinterpret()).asBoolean()

    /**
     * Call this when the result of a print operation is
     * %GTK_PRINT_OPERATION_RESULT_ERROR.
     *
     * It can be called either after [method@Gtk.PrintOperation.run]
     * returns, or in the [signal@Gtk.PrintOperation::done] signal
     * handler.
     *
     * The returned `GError` will contain more details on what went wrong.
     */
    public open fun getError(): Result<kotlin.Unit> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gtk_print_operation_get_error(gtkPrintOperationPointer.reinterpret(), gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Gets whether there is a selection.
     *
     * @return whether there is a selection
     */
    public open fun getHasSelection(): Boolean =
        gtk_print_operation_get_has_selection(gtkPrintOperationPointer.reinterpret()).asBoolean()

    /**
     * Returns the number of pages that will be printed.
     *
     * Note that this value is set during print preparation phase
     * (%GTK_PRINT_STATUS_PREPARING), so this function should never be
     * called before the data generation phase (%GTK_PRINT_STATUS_GENERATING_DATA).
     * You can connect to the [signal@Gtk.PrintOperation::status-changed]
     * signal and call gtk_print_operation_get_n_pages_to_print() when
     * print status is %GTK_PRINT_STATUS_GENERATING_DATA.
     *
     * This is typically used to track the progress of print operation.
     *
     * @return the number of pages that will be printed
     */
    public open fun getNPagesToPrint(): Int =
        gtk_print_operation_get_n_pages_to_print(gtkPrintOperationPointer.reinterpret())

    /**
     * Returns the current print settings.
     *
     * Note that the return value is null until either
     * [method@Gtk.PrintOperation.set_print_settings] or
     * [method@Gtk.PrintOperation.run] have been called.
     *
     * @return the current print settings of @op.
     */
    public open fun getPrintSettings(): PrintSettings? =
        gtk_print_operation_get_print_settings(gtkPrintOperationPointer.reinterpret())?.run {
            PrintSettings(reinterpret())
        }

    /**
     * Returns the status of the print operation.
     *
     * Also see [method@Gtk.PrintOperation.get_status_string].
     *
     * @return the status of the print operation
     */
    public open fun getStatus(): PrintStatus =
        gtk_print_operation_get_status(gtkPrintOperationPointer.reinterpret()).run {
            PrintStatus.fromNativeValue(this)
        }

    /**
     * Returns a string representation of the status of the
     * print operation.
     *
     * The string is translated and suitable for displaying
     * the print status e.g. in a `GtkStatusbar`.
     *
     * Use [method@Gtk.PrintOperation.get_status] to obtain
     * a status value that is suitable for programmatic use.
     *
     * @return a string representation of the status
     *    of the print operation
     */
    public open fun getStatusString(): String =
        gtk_print_operation_get_status_string(gtkPrintOperationPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets whether the application supports print of selection
     *
     * @return whether the application supports print of selection
     */
    public open fun getSupportSelection(): Boolean =
        gtk_print_operation_get_support_selection(gtkPrintOperationPointer.reinterpret()).asBoolean()

    /**
     * A convenience function to find out if the print operation
     * is finished.
     *
     * a print operation is finished if its status is either
     * %GTK_PRINT_STATUS_FINISHED or %GTK_PRINT_STATUS_FINISHED_ABORTED.
     *
     * Note: when you enable print status tracking the print operation
     * can be in a non-finished state even after done has been called, as
     * the operation status then tracks the print job status on the printer.
     *
     * @return true, if the print operation is finished.
     */
    public open fun isFinished(): Boolean =
        gtk_print_operation_is_finished(gtkPrintOperationPointer.reinterpret()).asBoolean()

    /**
     * Runs the print operation.
     *
     * Normally that this function does not return until the rendering
     * of all pages is complete. You can connect to the
     * [signal@Gtk.PrintOperation::status-changed] signal on @op to obtain
     * some information about the progress of the print operation.
     *
     * Furthermore, it may use a recursive mainloop to show the print dialog.
     *
     * If you set the [Gtk.PrintOperation:allow-async] property, the operation
     * will run asynchronously if this is supported on the platform. The
     * [signal@Gtk.PrintOperation::done] signal will be emitted with the result
     * of the operation when the it is done (i.e. when the dialog is canceled,
     * or when the print succeeds or fails).
     *
     * ```c
     * if (settings != NULL)
     *   gtk_print_operation_set_print_settings (print, settings);
     *
     * if (page_setup != NULL)
     *   gtk_print_operation_set_default_page_setup (print, page_setup);
     *
     * g_signal_connect (print, "begin-print",
     *                   G_CALLBACK (begin_print), &data);
     * g_signal_connect (print, "draw-page",
     *                   G_CALLBACK (draw_page), &data);
     *
     * res = gtk_print_operation_run (print,
     *                                GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG,
     *                                parent,
     *                                &error);
     *
     * if (res == GTK_PRINT_OPERATION_RESULT_ERROR)
     *  {
     *    error_dialog = gtk_message_dialog_new (GTK_WINDOW (parent),
     *   			                     GTK_DIALOG_DESTROY_WITH_PARENT,
     * 					     GTK_MESSAGE_ERROR,
     * 					     GTK_BUTTONS_CLOSE,
     * 					     "Error printing file:\n%s",
     * 					     error->message);
     *    g_signal_connect (error_dialog, "response",
     *                      G_CALLBACK (gtk_window_destroy), NULL);
     *    gtk_window_present (GTK_WINDOW (error_dialog));
     *    g_error_free (error);
     *  }
     * else if (res == GTK_PRINT_OPERATION_RESULT_APPLY)
     *  {
     *    if (settings != NULL)
     * g_object_unref (settings);
     *    settings = g_object_ref (gtk_print_operation_get_print_settings (print));
     *  }
     * ```
     *
     * Note that gtk_print_operation_run() can only be called once on a
     * given `GtkPrintOperation`.
     *
     * @param action the action to start
     * @param parent Transient parent of the dialog
     * @return the result of the print operation. A return value of
     *   %GTK_PRINT_OPERATION_RESULT_APPLY indicates that the printing was
     *   completed successfully. In this case, it is a good idea to obtain
     *   the used print settings with
     *   [method@Gtk.PrintOperation.get_print_settings]
     *   and store them for reuse with the next print operation. A value of
     *   %GTK_PRINT_OPERATION_RESULT_IN_PROGRESS means the operation is running
     *   asynchronously, and will emit the [signal@Gtk.PrintOperation::done]
     *   signal when done.
     */
    public open fun run(
        action: PrintOperationAction,
        parent: Window? = null,
    ): Result<PrintOperationResult> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gtk_print_operation_run(
                    gtkPrintOperationPointer.reinterpret(),
                    action.nativeValue,
                    parent?.gtkWindowPointer?.reinterpret(),
                    gError.ptr
                ).run {
                    PrintOperationResult.fromNativeValue(this)
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Sets whether gtk_print_operation_run() may return
     * before the print operation is completed.
     *
     * Note that some platforms may not allow asynchronous
     * operation.
     *
     * @param allowAsync true to allow asynchronous operation
     */
    public open fun setAllowAsync(allowAsync: Boolean): kotlin.Unit =
        gtk_print_operation_set_allow_async(gtkPrintOperationPointer.reinterpret(), allowAsync.asGBoolean())

    /**
     * Sets the current page.
     *
     * If this is called before [method@Gtk.PrintOperation.run],
     * the user will be able to select to print only the current page.
     *
     * Note that this only makes sense for pre-paginated documents.
     *
     * @param currentPage the current page, 0-based
     */
    public open fun setCurrentPage(currentPage: Int): kotlin.Unit =
        gtk_print_operation_set_current_page(gtkPrintOperationPointer.reinterpret(), currentPage)

    /**
     * Sets the label for the tab holding custom widgets.
     *
     * @param label the label to use, or null to use the default label
     */
    public open fun setCustomTabLabel(label: String? = null): kotlin.Unit =
        gtk_print_operation_set_custom_tab_label(gtkPrintOperationPointer.reinterpret(), label)

    /**
     * Makes @default_page_setup the default page setup for @op.
     *
     * This page setup will be used by [method@Gtk.PrintOperation.run],
     * but it can be overridden on a per-page basis by connecting
     * to the [signal@Gtk.PrintOperation::request-page-setup] signal.
     *
     * @param defaultPageSetup a `GtkPageSetup`
     */
    public open fun setDefaultPageSetup(defaultPageSetup: PageSetup? = null): kotlin.Unit =
        gtk_print_operation_set_default_page_setup(
            gtkPrintOperationPointer.reinterpret(),
            defaultPageSetup?.gtkPageSetupPointer?.reinterpret()
        )

    /**
     * Sets up the `GtkPrintOperation` to wait for calling of
     * [method@Gtk.PrintOperation.draw_page_finish from application.
     *
     * This can be used for drawing page in another thread.
     *
     * This function must be called in the callback of the
     * [signal@Gtk.PrintOperation::draw-page] signal.
     */
    public open fun setDeferDrawing(): kotlin.Unit =
        gtk_print_operation_set_defer_drawing(gtkPrintOperationPointer.reinterpret())

    /**
     * Embed page size combo box and orientation combo box into page setup page.
     *
     * Selected page setup is stored as default page setup in `GtkPrintOperation`.
     *
     * @param embed true to embed page setup selection in the `GtkPrintUnixDialog`
     */
    public open fun setEmbedPageSetup(embed: Boolean): kotlin.Unit =
        gtk_print_operation_set_embed_page_setup(gtkPrintOperationPointer.reinterpret(), embed.asGBoolean())

    /**
     * Sets up the `GtkPrintOperation` to generate a file instead
     * of showing the print dialog.
     *
     * The intended use of this function is for implementing
     * “Export to PDF” actions. Currently, PDF is the only supported
     * format.
     *
     * “Print to PDF” support is independent of this and is done
     * by letting the user pick the “Print to PDF” item from the list
     * of printers in the print dialog.
     *
     * @param filename the filename for the exported file
     */
    public open fun setExportFilename(filename: String): kotlin.Unit =
        gtk_print_operation_set_export_filename(gtkPrintOperationPointer.reinterpret(), filename)

    /**
     * Sets whether there is a selection to print.
     *
     * Application has to set number of pages to which the selection
     * will draw by [method@Gtk.PrintOperation.set_n_pages] in a handler
     * for the [signal@Gtk.PrintOperation::begin-print] signal.
     *
     * @param hasSelection true indicates that a selection exists
     */
    public open fun setHasSelection(hasSelection: Boolean): kotlin.Unit =
        gtk_print_operation_set_has_selection(gtkPrintOperationPointer.reinterpret(), hasSelection.asGBoolean())

    /**
     * Sets the name of the print job.
     *
     * The name is used to identify the job (e.g. in monitoring
     * applications like eggcups).
     *
     * If you don’t set a job name, GTK picks a default one by
     * numbering successive print jobs.
     *
     * @param jobName a string that identifies the print job
     */
    public open fun setJobName(jobName: String): kotlin.Unit =
        gtk_print_operation_set_job_name(gtkPrintOperationPointer.reinterpret(), jobName)

    /**
     * Sets the number of pages in the document.
     *
     * This must be set to a positive number before the rendering
     * starts. It may be set in a [signal@Gtk.PrintOperation::begin-print]
     * signal handler.
     *
     * Note that the page numbers passed to the
     * [signal@Gtk.PrintOperation::request-page-setup]
     * and [signal@Gtk.PrintOperation::draw-page] signals are 0-based, i.e.
     * if the user chooses to print all pages, the last ::draw-page signal
     * will be for page @n_pages - 1.
     *
     * @param nPages the number of pages
     */
    public open fun setNPages(nPages: Int): kotlin.Unit =
        gtk_print_operation_set_n_pages(gtkPrintOperationPointer.reinterpret(), nPages)

    /**
     * Sets the print settings for @op.
     *
     * This is typically used to re-establish print settings
     * from a previous print operation, see [method@Gtk.PrintOperation.run].
     *
     * @param printSettings `GtkPrintSettings`
     */
    public open fun setPrintSettings(printSettings: PrintSettings? = null): kotlin.Unit =
        gtk_print_operation_set_print_settings(
            gtkPrintOperationPointer.reinterpret(),
            printSettings?.gtkPrintSettingsPointer?.reinterpret()
        )

    /**
     * If @show_progress is true, the print operation will show
     * a progress dialog during the print operation.
     *
     * @param showProgress true to show a progress dialog
     */
    public open fun setShowProgress(showProgress: Boolean): kotlin.Unit =
        gtk_print_operation_set_show_progress(gtkPrintOperationPointer.reinterpret(), showProgress.asGBoolean())

    /**
     * Sets whether selection is supported by `GtkPrintOperation`.
     *
     * @param supportSelection true to support selection
     */
    public open fun setSupportSelection(supportSelection: Boolean): kotlin.Unit =
        gtk_print_operation_set_support_selection(gtkPrintOperationPointer.reinterpret(), supportSelection.asGBoolean())

    /**
     * If track_status is true, the print operation will try to continue
     * report on the status of the print job in the printer queues and printer.
     *
     * This can allow your application to show things like “out of paper”
     * issues, and when the print job actually reaches the printer.
     *
     * This function is often implemented using some form of polling,
     * so it should not be enabled unless needed.
     *
     * @param trackStatus true to track status after printing
     */
    public open fun setTrackPrintStatus(trackStatus: Boolean): kotlin.Unit =
        gtk_print_operation_set_track_print_status(gtkPrintOperationPointer.reinterpret(), trackStatus.asGBoolean())

    /**
     * Sets up the transformation for the cairo context obtained from
     * `GtkPrintContext` in such a way that distances are measured in
     * units of @unit.
     *
     * @param unit the unit to use
     */
    public open fun setUnit(unit: Unit): kotlin.Unit =
        gtk_print_operation_set_unit(gtkPrintOperationPointer.reinterpret(), unit.nativeValue)

    /**
     * If @full_page is true, the transformation for the cairo context
     * obtained from `GtkPrintContext` puts the origin at the top left
     * corner of the page.
     *
     * This may not be the top left corner of the sheet, depending on page
     * orientation and the number of pages per sheet). Otherwise, the origin
     * is at the top left corner of the imageable area (i.e. inside the margins).
     *
     * @param fullPage true to set up the `GtkPrintContext` for the full page
     */
    public open fun setUseFullPage(fullPage: Boolean): kotlin.Unit =
        gtk_print_operation_set_use_full_page(gtkPrintOperationPointer.reinterpret(), fullPage.asGBoolean())

    /**
     * Emitted after the user has finished changing print settings
     * in the dialog, before the actual rendering starts.
     *
     * A typical use for ::begin-print is to use the parameters from the
     * [class@Gtk.PrintContext] and paginate the document accordingly,
     * and then set the number of pages with
     * [method@Gtk.PrintOperation.set_n_pages].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `context` the `GtkPrintContext` for the current operation
     */
    public fun connectBeginPrint(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (context: PrintContext) -> kotlin.Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "begin-print",
            connectBeginPrintFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when displaying the print dialog.
     *
     * If you return a widget in a handler for this signal it will be
     * added to a custom tab in the print dialog. You typically return a
     * container widget with multiple widgets in it.
     *
     * The print dialog owns the returned widget, and its lifetime is not
     * controlled by the application. However, the widget is guaranteed
     * to stay around until the [signal@Gtk.PrintOperation::custom-widget-apply]
     * signal is emitted on the operation. Then you can read out any
     * information you need from the widgets.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns A custom widget that gets embedded in
     *   the print dialog
     */
    public fun connectCreateCustomWidget(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Object?,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "create-custom-widget",
            connectCreateCustomWidgetFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted right before ::begin-print if you added
     * a custom widget in the ::create-custom-widget handler.
     *
     * When you get this signal you should read the information from the
     * custom widgets, as the widgets are not guaranteed to be around at a
     * later time.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `widget` the custom widget added in ::create-custom-widget
     */
    public fun connectCustomWidgetApply(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (widget: Widget) -> kotlin.Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "custom-widget-apply",
            connectCustomWidgetApplyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the print operation run has finished doing
     * everything required for printing.
     *
     * @result gives you information about what happened during the run.
     * If @result is %GTK_PRINT_OPERATION_RESULT_ERROR then you can call
     * [method@Gtk.PrintOperation.get_error] for more information.
     *
     * If you enabled print status tracking then
     * [method@Gtk.PrintOperation.is_finished] may still return false
     * after the ::done signal was emitted.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `result` the result of the print operation
     */
    public fun connectDone(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (result: PrintOperationResult) -> kotlin.Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "done",
            connectDoneFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted for every page that is printed.
     *
     * The signal handler must render the @page_nr's page onto the cairo
     * context obtained from @context using
     * [method@Gtk.PrintContext.get_cairo_context].
     *
     * ```c
     * static void
     * draw_page (GtkPrintOperation *operation,
     *            GtkPrintContext   *context,
     *            int                page_nr,
     *            gpointer           user_data)
     * {
     *   cairo_t *cr;
     *   PangoLayout *layout;
     *   double width, text_height;
     *   int layout_height;
     *   PangoFontDescription *desc;
     *
     *   cr = gtk_print_context_get_cairo_context (context);
     *   width = gtk_print_context_get_width (context);
     *
     *   cairo_rectangle (cr, 0, 0, width, HEADER_HEIGHT);
     *
     *   cairo_set_source_rgb (cr, 0.8, 0.8, 0.8);
     *   cairo_fill (cr);
     *
     *   layout = gtk_print_context_create_pango_layout (context);
     *
     *   desc = pango_font_description_from_string ("sans 14");
     *   pango_layout_set_font_description (layout, desc);
     *   pango_font_description_free (desc);
     *
     *   pango_layout_set_text (layout, "some text", -1);
     *   pango_layout_set_width (layout, width * PANGO_SCALE);
     *   pango_layout_set_alignment (layout, PANGO_ALIGN_CENTER);
     *
     *   pango_layout_get_size (layout, NULL, &layout_height);
     *   text_height = (double)layout_height / PANGO_SCALE;
     *
     *   cairo_move_to (cr, width / 2,  (HEADER_HEIGHT - text_height) / 2);
     *   pango_cairo_show_layout (cr, layout);
     *
     *   g_object_unref (layout);
     * }
     * ```
     *
     * Use [method@Gtk.PrintOperation.set_use_full_page] and
     * [method@Gtk.PrintOperation.set_unit] before starting the print
     * operation to set up the transformation of the cairo context
     * according to your needs.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `context` the `GtkPrintContext` for the current operation; `pageNr` the number of the currently printed page (0-based)
     */
    public fun connectDrawPage(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (context: PrintContext, pageNr: Int) -> kotlin.Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "draw-page",
            connectDrawPageFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted after all pages have been rendered.
     *
     * A handler for this signal can clean up any resources that have
     * been allocated in the [signal@Gtk.PrintOperation::begin-print] handler.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `context` the `GtkPrintContext` for the current operation
     */
    public fun connectEndPrint(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (context: PrintContext) -> kotlin.Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "end-print",
            connectEndPrintFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted after the ::begin-print signal, but before the actual rendering
     * starts.
     *
     * It keeps getting emitted until a connected signal handler returns true.
     *
     * The ::paginate signal is intended to be used for paginating a document
     * in small chunks, to avoid blocking the user interface for a long
     * time. The signal handler should update the number of pages using
     * [method@Gtk.PrintOperation.set_n_pages], and return true if the document
     * has been completely paginated.
     *
     * If you don't need to do pagination in chunks, you can simply do
     * it all in the ::begin-print handler, and set the number of pages
     * from there.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `context` the `GtkPrintContext` for the current operation. Returns true if pagination is complete
     */
    public fun connectPaginate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (context: PrintContext) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "paginate",
            connectPaginateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Gets emitted when a preview is requested from the native dialog.
     *
     * The default handler for this signal uses an external viewer
     * application to preview.
     *
     * To implement a custom print preview, an application must return
     * true from its handler for this signal. In order to use the
     * provided @context for the preview implementation, it must be
     * given a suitable cairo context with
     * [method@Gtk.PrintContext.set_cairo_context].
     *
     * The custom preview implementation can use
     * [method@Gtk.PrintOperationPreview.is_selected] and
     * [method@Gtk.PrintOperationPreview.render_page] to find pages which
     * are selected for print and render them. The preview must be
     * finished by calling [method@Gtk.PrintOperationPreview.end_preview]
     * (typically in response to the user clicking a close button).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `preview` the `GtkPrintOperationPreview` for the current operation; `context` the `GtkPrintContext` that will be used; `parent` the `GtkWindow` to use as window parent. Returns true if the listener wants to take over control of the preview
     */
    public fun connectPreview(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            preview: PrintOperationPreview,
            context: PrintContext,
            parent: Window?,
        ) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "preview",
            connectPreviewFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted once for every page that is printed.
     *
     * This gives the application a chance to modify the page setup.
     * Any changes done to @setup will be in force only for printing
     * this page.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `context` the `GtkPrintContext` for the current operation; `pageNr` the number of the currently printed page (0-based); `setup` the `GtkPageSetup`
     */
    public fun connectRequestPageSetup(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            context: PrintContext,
            pageNr: Int,
            setup: PageSetup,
        ) -> kotlin.Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "request-page-setup",
            connectRequestPageSetupFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted at between the various phases of the print operation.
     *
     * See [enum@Gtk.PrintStatus] for the phases that are being discriminated.
     * Use [method@Gtk.PrintOperation.get_status] to find out the current
     * status.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectStatusChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> kotlin.Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "status-changed",
            connectStatusChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted after change of selected printer.
     *
     * The actual page setup and print settings are passed to the custom
     * widget, which can actualize itself according to this change.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `widget` the custom widget added in ::create-custom-widget; `setup` actual page setup; `settings` actual print settings
     */
    public fun connectUpdateCustomWidget(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            widget: Widget,
            setup: PageSetup,
            settings: PrintSettings,
        ) -> kotlin.Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "update-custom-widget",
            connectUpdateCustomWidgetFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<PrintOperation> {
        override val type: GeneratedClassKGType<PrintOperation> =
            GeneratedClassKGType(gtk_print_operation_get_type()) { PrintOperation(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectBeginPrintFunc: CPointer<CFunction<(CPointer<GtkPrintContext>) -> kotlin.Unit>> =
    staticCFunction {
            _: COpaquePointer,
            context: CPointer<GtkPrintContext>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(context: PrintContext) -> kotlin.Unit>().get().invoke(
            context!!.run {
                PrintContext(reinterpret())
            }
        )
    }.reinterpret()

private val connectCreateCustomWidgetFunc: CPointer<CFunction<() -> CPointer<GObject>?>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<() -> Object?>()
            .get()
            .invoke()
            ?.gPointer
    }.reinterpret()

private val connectCustomWidgetApplyFunc: CPointer<CFunction<(CPointer<GtkWidget>) -> kotlin.Unit>> =
    staticCFunction {
            _: COpaquePointer,
            widget: CPointer<GtkWidget>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(widget: Widget) -> kotlin.Unit>().get().invoke(
            widget!!.run {
                Widget(reinterpret())
            }
        )
    }.reinterpret()

private val connectDoneFunc: CPointer<CFunction<(GtkPrintOperationResult) -> kotlin.Unit>> =
    staticCFunction {
            _: COpaquePointer,
            result: GtkPrintOperationResult,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(result: PrintOperationResult) -> kotlin.Unit>().get().invoke(
            result.run {
                PrintOperationResult.fromNativeValue(this)
            }
        )
    }.reinterpret()

private val connectDrawPageFunc:
    CPointer<CFunction<(CPointer<GtkPrintContext>, Int) -> kotlin.Unit>> =
    staticCFunction {
            _: COpaquePointer,
            context: CPointer<GtkPrintContext>?,
            pageNr: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(context: PrintContext, pageNr: Int) -> kotlin.Unit>().get().invoke(
            context!!.run {
                PrintContext(reinterpret())
            },
            pageNr
        )
    }.reinterpret()

private val connectEndPrintFunc: CPointer<CFunction<(CPointer<GtkPrintContext>) -> kotlin.Unit>> =
    staticCFunction {
            _: COpaquePointer,
            context: CPointer<GtkPrintContext>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(context: PrintContext) -> kotlin.Unit>().get().invoke(
            context!!.run {
                PrintContext(reinterpret())
            }
        )
    }.reinterpret()

private val connectPaginateFunc: CPointer<CFunction<(CPointer<GtkPrintContext>) -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            context: CPointer<GtkPrintContext>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<(context: PrintContext) -> Boolean>()
            .get()
            .invoke(
                context!!.run {
                    PrintContext(reinterpret())
                }
            ).asGBoolean()
    }.reinterpret()

private val connectPreviewFunc: CPointer<
    CFunction<
        (
            CPointer<GtkPrintOperationPreview>,
            CPointer<GtkPrintContext>,
            CPointer<GtkWindow>?,
        ) -> Int
    >
> =
    staticCFunction {
            _: COpaquePointer,
            preview: CPointer<GtkPrintOperationPreview>?,
            context: CPointer<GtkPrintContext>?,
            parent: CPointer<GtkWindow>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    preview: PrintOperationPreview,
                    context: PrintContext,
                    parent: Window?,
                ) -> Boolean
            >()
            .get()
            .invoke(
                preview!!.run {
                    PrintOperationPreview.wrap(reinterpret())
                },
                context!!.run {
                    PrintContext(reinterpret())
                },
                parent?.run {
                    Window(reinterpret())
                }
            ).asGBoolean()
    }.reinterpret()

private val connectRequestPageSetupFunc: CPointer<
    CFunction<
        (
            CPointer<GtkPrintContext>,
            Int,
            CPointer<GtkPageSetup>,
        ) -> kotlin.Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            context: CPointer<GtkPrintContext>?,
            pageNr: Int,
            setup: CPointer<GtkPageSetup>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    context: PrintContext,
                    pageNr: Int,
                    setup: PageSetup,
                ) -> kotlin.Unit
            >()
            .get()
            .invoke(
                context!!.run {
                    PrintContext(reinterpret())
                },
                pageNr,
                setup!!.run {
                    PageSetup(reinterpret())
                }
            )
    }.reinterpret()

private val connectStatusChangedFunc: CPointer<CFunction<() -> kotlin.Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> kotlin.Unit>().get().invoke()
    }.reinterpret()

private val connectUpdateCustomWidgetFunc: CPointer<
    CFunction<
        (
            CPointer<GtkWidget>,
            CPointer<GtkPageSetup>,
            CPointer<GtkPrintSettings>,
        ) -> kotlin.Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            widget: CPointer<GtkWidget>?,
            setup: CPointer<GtkPageSetup>?,
            settings: CPointer<GtkPrintSettings>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    widget: Widget,
                    setup: PageSetup,
                    settings: PrintSettings,
                ) -> kotlin.Unit
            >()
            .get()
            .invoke(
                widget!!.run {
                    Widget(reinterpret())
                },
                setup!!.run {
                    PageSetup(reinterpret())
                },
                settings!!.run {
                    PrintSettings(reinterpret())
                }
            )
    }.reinterpret()
