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
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkPrintJob
import org.gtkkn.native.gtk.gtk_print_job_get_collate
import org.gtkkn.native.gtk.gtk_print_job_get_n_up
import org.gtkkn.native.gtk.gtk_print_job_get_n_up_layout
import org.gtkkn.native.gtk.gtk_print_job_get_num_copies
import org.gtkkn.native.gtk.gtk_print_job_get_page_set
import org.gtkkn.native.gtk.gtk_print_job_get_pages
import org.gtkkn.native.gtk.gtk_print_job_get_printer
import org.gtkkn.native.gtk.gtk_print_job_get_reverse
import org.gtkkn.native.gtk.gtk_print_job_get_rotate
import org.gtkkn.native.gtk.gtk_print_job_get_scale
import org.gtkkn.native.gtk.gtk_print_job_get_settings
import org.gtkkn.native.gtk.gtk_print_job_get_status
import org.gtkkn.native.gtk.gtk_print_job_get_title
import org.gtkkn.native.gtk.gtk_print_job_get_track_print_status
import org.gtkkn.native.gtk.gtk_print_job_get_type
import org.gtkkn.native.gtk.gtk_print_job_new
import org.gtkkn.native.gtk.gtk_print_job_send
import org.gtkkn.native.gtk.gtk_print_job_set_collate
import org.gtkkn.native.gtk.gtk_print_job_set_n_up
import org.gtkkn.native.gtk.gtk_print_job_set_n_up_layout
import org.gtkkn.native.gtk.gtk_print_job_set_num_copies
import org.gtkkn.native.gtk.gtk_print_job_set_page_set
import org.gtkkn.native.gtk.gtk_print_job_set_pages
import org.gtkkn.native.gtk.gtk_print_job_set_reverse
import org.gtkkn.native.gtk.gtk_print_job_set_rotate
import org.gtkkn.native.gtk.gtk_print_job_set_scale
import org.gtkkn.native.gtk.gtk_print_job_set_source_fd
import org.gtkkn.native.gtk.gtk_print_job_set_source_file
import org.gtkkn.native.gtk.gtk_print_job_set_track_print_status
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Result
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * A `GtkPrintJob` object represents a job that is sent to a printer.
 *
 * You only need to deal directly with print jobs if you use the
 * non-portable [class@Gtk.PrintUnixDialog] API.
 *
 * Use [method@Gtk.PrintJob.get_surface] to obtain the cairo surface
 * onto which the pages must be drawn. Use [method@Gtk.PrintJob.send]
 * to send the finished job to the printer. If you don’t use cairo
 * `GtkPrintJob` also supports printing of manually generated PostScript,
 * via [method@Gtk.PrintJob.set_source_file].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `n_ranges`: n_ranges: Out parameter is not supported
 * - method `get_surface`: Return type cairo.Surface is unsupported
 * - parameter `ranges`: PageRange
 * - method `page-setup`: Property has no getter nor setter
 */
public open class PrintJob(
    pointer: CPointer<GtkPrintJob>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gtkPrintJobPointer: CPointer<GtkPrintJob>
        get() = gPointer.reinterpret()

    /**
     * The printer to send the job to.
     */
    public open val printer: Printer
        /**
         * Gets the `GtkPrinter` of the print job.
         *
         * @return the printer of @job
         */
        get() =
            gtk_print_job_get_printer(gtkPrintJobPointer.reinterpret())!!.run {
                Printer(reinterpret())
            }

    /**
     * Printer settings.
     */
    public open val settings: PrintSettings
        /**
         * Gets the `GtkPrintSettings` of the print job.
         *
         * @return the settings of @job
         */
        get() =
            gtk_print_job_get_settings(gtkPrintJobPointer.reinterpret())!!.run {
                PrintSettings(reinterpret())
            }

    /**
     * The title of the print job.
     */
    public open val title: String
        /**
         * Gets the job title.
         *
         * @return the title of @job
         */
        get() =
            gtk_print_job_get_title(gtkPrintJobPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * true if the print job will continue to emit status-changed
     * signals after the print data has been setn to the printer.
     */
    public open var trackPrintStatus: Boolean
        /**
         * Returns whether jobs will be tracked after printing.
         *
         * For details, see [method@Gtk.PrintJob.set_track_print_status].
         *
         * @return true if print job status will be reported after printing
         */
        get() = gtk_print_job_get_track_print_status(gtkPrintJobPointer.reinterpret()).asBoolean()

        /**
         * If track_status is true, the print job will try to continue report
         * on the status of the print job in the printer queues and printer.
         *
         * This can allow your application to show things like “out of paper”
         * issues, and when the print job actually reaches the printer.
         *
         * This function is often implemented using some form of polling,
         * so it should not be enabled unless needed.
         *
         * @param trackStatus true to track status after printing
         */
        set(
            trackStatus
        ) = gtk_print_job_set_track_print_status(gtkPrintJobPointer.reinterpret(), trackStatus.asGBoolean())

    /**
     * Creates a new `GtkPrintJob`.
     *
     * @param title the job title
     * @param printer a `GtkPrinter`
     * @param settings a `GtkPrintSettings`
     * @param pageSetup a `GtkPageSetup`
     * @return a new `GtkPrintJob`
     */
    public constructor(
        title: String,
        printer: Printer,
        settings: PrintSettings,
        pageSetup: PageSetup,
    ) : this(
        gtk_print_job_new(
            title,
            printer.gtkPrinterPointer.reinterpret(),
            settings.gtkPrintSettingsPointer.reinterpret(),
            pageSetup.gtkPageSetupPointer.reinterpret()
        )!!.reinterpret()
    )

    /**
     * Gets whether this job is printed collated.
     *
     * @return whether the job is printed collated
     */
    public open fun getCollate(): Boolean = gtk_print_job_get_collate(gtkPrintJobPointer.reinterpret()).asBoolean()

    /**
     * Gets the n-up setting for this job.
     *
     * @return the n-up setting
     */
    public open fun getNUp(): UInt = gtk_print_job_get_n_up(gtkPrintJobPointer.reinterpret())

    /**
     * Gets the n-up layout setting for this job.
     *
     * @return the n-up layout
     */
    public open fun getNUpLayout(): NumberUpLayout =
        gtk_print_job_get_n_up_layout(gtkPrintJobPointer.reinterpret()).run {
            NumberUpLayout.fromNativeValue(this)
        }

    /**
     * Gets the number of copies of this job.
     *
     * @return the number of copies
     */
    public open fun getNumCopies(): Int = gtk_print_job_get_num_copies(gtkPrintJobPointer.reinterpret())

    /**
     * Gets the `GtkPageSet` setting for this job.
     *
     * @return the `GtkPageSet` setting
     */
    public open fun getPageSet(): PageSet =
        gtk_print_job_get_page_set(gtkPrintJobPointer.reinterpret()).run {
            PageSet.fromNativeValue(this)
        }

    /**
     * Gets the `GtkPrintPages` setting for this job.
     *
     * @return the `GtkPrintPages` setting
     */
    public open fun getPages(): PrintPages =
        gtk_print_job_get_pages(gtkPrintJobPointer.reinterpret()).run {
            PrintPages.fromNativeValue(this)
        }

    /**
     * Gets the `GtkPrinter` of the print job.
     *
     * @return the printer of @job
     */
    public open fun getPrinter(): Printer =
        gtk_print_job_get_printer(gtkPrintJobPointer.reinterpret())!!.run {
            Printer(reinterpret())
        }

    /**
     * Gets whether this job is printed reversed.
     *
     * @return whether the job is printed reversed.
     */
    public open fun getReverse(): Boolean = gtk_print_job_get_reverse(gtkPrintJobPointer.reinterpret()).asBoolean()

    /**
     * Gets whether the job is printed rotated.
     *
     * @return whether the job is printed rotated
     */
    public open fun getRotate(): Boolean = gtk_print_job_get_rotate(gtkPrintJobPointer.reinterpret()).asBoolean()

    /**
     * Gets the scale for this job.
     *
     * @return the scale
     */
    public open fun getScale(): Double = gtk_print_job_get_scale(gtkPrintJobPointer.reinterpret())

    /**
     * Gets the `GtkPrintSettings` of the print job.
     *
     * @return the settings of @job
     */
    public open fun getSettings(): PrintSettings =
        gtk_print_job_get_settings(gtkPrintJobPointer.reinterpret())!!.run {
            PrintSettings(reinterpret())
        }

    /**
     * Gets the status of the print job.
     *
     * @return the status of @job
     */
    public open fun getStatus(): PrintStatus =
        gtk_print_job_get_status(gtkPrintJobPointer.reinterpret()).run {
            PrintStatus.fromNativeValue(this)
        }

    /**
     * Gets the job title.
     *
     * @return the title of @job
     */
    public open fun getTitle(): String =
        gtk_print_job_get_title(gtkPrintJobPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Returns whether jobs will be tracked after printing.
     *
     * For details, see [method@Gtk.PrintJob.set_track_print_status].
     *
     * @return true if print job status will be reported after printing
     */
    public open fun getTrackPrintStatus(): Boolean =
        gtk_print_job_get_track_print_status(gtkPrintJobPointer.reinterpret()).asBoolean()

    /**
     * Sends the print job off to the printer.
     *
     * @param callback function to call when the job completes or an error occurs
     */
    public open fun send(callback: PrintJobCompleteFunc): Unit =
        gtk_print_job_send(
            gtkPrintJobPointer.reinterpret(),
            PrintJobCompleteFuncFunc.reinterpret(),
            StableRef.create(callback).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Sets whether this job is printed collated.
     *
     * @param collate whether the job is printed collated
     */
    public open fun setCollate(collate: Boolean): Unit =
        gtk_print_job_set_collate(gtkPrintJobPointer.reinterpret(), collate.asGBoolean())

    /**
     * Sets the n-up setting for this job.
     *
     * @param nUp the n-up value
     */
    public open fun setNUp(nUp: UInt): Unit = gtk_print_job_set_n_up(gtkPrintJobPointer.reinterpret(), nUp)

    /**
     * Sets the n-up layout setting for this job.
     *
     * @param layout the n-up layout setting
     */
    public open fun setNUpLayout(layout: NumberUpLayout): Unit =
        gtk_print_job_set_n_up_layout(gtkPrintJobPointer.reinterpret(), layout.nativeValue)

    /**
     * Sets the number of copies for this job.
     *
     * @param numCopies the number of copies
     */
    public open fun setNumCopies(numCopies: Int): Unit =
        gtk_print_job_set_num_copies(gtkPrintJobPointer.reinterpret(), numCopies)

    /**
     * Sets the `GtkPageSet` setting for this job.
     *
     * @param pageSet a `GtkPageSet` setting
     */
    public open fun setPageSet(pageSet: PageSet): Unit =
        gtk_print_job_set_page_set(gtkPrintJobPointer.reinterpret(), pageSet.nativeValue)

    /**
     * Sets the `GtkPrintPages` setting for this job.
     *
     * @param pages the `GtkPrintPages` setting
     */
    public open fun setPages(pages: PrintPages): Unit =
        gtk_print_job_set_pages(gtkPrintJobPointer.reinterpret(), pages.nativeValue)

    /**
     * Sets whether this job is printed reversed.
     *
     * @param reverse whether the job is printed reversed
     */
    public open fun setReverse(reverse: Boolean): Unit =
        gtk_print_job_set_reverse(gtkPrintJobPointer.reinterpret(), reverse.asGBoolean())

    /**
     * Sets whether this job is printed rotated.
     *
     * @param rotate whether to print rotated
     */
    public open fun setRotate(rotate: Boolean): Unit =
        gtk_print_job_set_rotate(gtkPrintJobPointer.reinterpret(), rotate.asGBoolean())

    /**
     * Sets the scale for this job.
     *
     * 1.0 means unscaled.
     *
     * @param scale the scale
     */
    public open fun setScale(scale: Double): Unit = gtk_print_job_set_scale(gtkPrintJobPointer.reinterpret(), scale)

    /**
     * Make the `GtkPrintJob` send an existing document to the
     * printing system.
     *
     * The file can be in any format understood by the platforms
     * printing system (typically PostScript, but on many platforms
     * PDF may work too). See [method@Gtk.Printer.accepts_pdf] and
     * [method@Gtk.Printer.accepts_ps].
     *
     * This is similar to [method@Gtk.PrintJob.set_source_file],
     * but takes expects an open file descriptor for the file,
     * instead of a filename.
     *
     * @param fd a file descriptor
     * @return false if an error occurred
     */
    public open fun setSourceFd(fd: Int): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gtk_print_job_set_source_fd(gtkPrintJobPointer.reinterpret(), fd, gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Make the `GtkPrintJob` send an existing document to the
     * printing system.
     *
     * The file can be in any format understood by the platforms
     * printing system (typically PostScript, but on many platforms
     * PDF may work too). See [method@Gtk.Printer.accepts_pdf] and
     * [method@Gtk.Printer.accepts_ps].
     *
     * @param filename the file to be printed
     * @return false if an error occurred
     */
    public open fun setSourceFile(filename: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gtk_print_job_set_source_file(
                    gtkPrintJobPointer.reinterpret(),
                    filename,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * If track_status is true, the print job will try to continue report
     * on the status of the print job in the printer queues and printer.
     *
     * This can allow your application to show things like “out of paper”
     * issues, and when the print job actually reaches the printer.
     *
     * This function is often implemented using some form of polling,
     * so it should not be enabled unless needed.
     *
     * @param trackStatus true to track status after printing
     */
    public open fun setTrackPrintStatus(trackStatus: Boolean): Unit =
        gtk_print_job_set_track_print_status(gtkPrintJobPointer.reinterpret(), trackStatus.asGBoolean())

    /**
     * Emitted when the status of a job changes.
     *
     * The signal handler can use [method@Gtk.PrintJob.get_status]
     * to obtain the new status.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectStatusChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "status-changed",
            connectStatusChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<PrintJob> {
        override val type: GeneratedClassKGType<PrintJob> =
            GeneratedClassKGType(gtk_print_job_get_type()) { PrintJob(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectStatusChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
