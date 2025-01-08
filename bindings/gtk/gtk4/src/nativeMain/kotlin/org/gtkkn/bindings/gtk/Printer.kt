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
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkPrinter
import org.gtkkn.native.gtk.gtk_printer_accepts_pdf
import org.gtkkn.native.gtk.gtk_printer_accepts_ps
import org.gtkkn.native.gtk.gtk_printer_compare
import org.gtkkn.native.gtk.gtk_printer_get_backend
import org.gtkkn.native.gtk.gtk_printer_get_capabilities
import org.gtkkn.native.gtk.gtk_printer_get_default_page_size
import org.gtkkn.native.gtk.gtk_printer_get_description
import org.gtkkn.native.gtk.gtk_printer_get_icon_name
import org.gtkkn.native.gtk.gtk_printer_get_job_count
import org.gtkkn.native.gtk.gtk_printer_get_location
import org.gtkkn.native.gtk.gtk_printer_get_name
import org.gtkkn.native.gtk.gtk_printer_get_state_message
import org.gtkkn.native.gtk.gtk_printer_get_type
import org.gtkkn.native.gtk.gtk_printer_has_details
import org.gtkkn.native.gtk.gtk_printer_is_accepting_jobs
import org.gtkkn.native.gtk.gtk_printer_is_active
import org.gtkkn.native.gtk.gtk_printer_is_default
import org.gtkkn.native.gtk.gtk_printer_is_paused
import org.gtkkn.native.gtk.gtk_printer_is_virtual
import org.gtkkn.native.gtk.gtk_printer_list_papers
import org.gtkkn.native.gtk.gtk_printer_new
import org.gtkkn.native.gtk.gtk_printer_request_details
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A `GtkPrinter` object represents a printer.
 *
 * You only need to deal directly with printers if you use the
 * non-portable [class@Gtk.PrintUnixDialog] API.
 *
 * A `GtkPrinter` allows to get status information about the printer,
 * such as its description, its location, the number of queued jobs,
 * etc. Most importantly, a `GtkPrinter` object can be used to create
 * a [class@Gtk.PrintJob] object, which lets you print to the printer.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `top`: top: Out parameter is not supported
 * - parameter `top`: top: Out parameter is not supported
 * - method `accepting-jobs`: Property has no getter nor setter
 * - method `accepts-pdf`: Property has no getter nor setter
 * - method `accepts-ps`: Property has no getter nor setter
 * - method `backend`: Property has no getter nor setter
 * - method `is-virtual`: Property has no getter nor setter
 * - method `paused`: Property has no getter nor setter
 */
public open class Printer(pointer: CPointer<GtkPrinter>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtkPrinterPointer: CPointer<GtkPrinter>
        get() = gPointer.reinterpret()

    /**
     * Icon name to use for the printer.
     */
    public open val iconName: String
        /**
         * Gets the name of the icon to use for the printer.
         *
         * @return the icon name for @printer
         */
        get() = gtk_printer_get_icon_name(gtkPrinterPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Number of jobs queued in the printer.
     */
    public open val jobCount: gint
        /**
         * Gets the number of jobs currently queued on the printer.
         *
         * @return the number of jobs on @printer
         */
        get() = gtk_printer_get_job_count(gtkPrinterPointer)

    /**
     * Information about the location of the printer.
     */
    public open val location: String
        /**
         * Returns a description of the location of the printer.
         *
         * @return the location of @printer
         */
        get() = gtk_printer_get_location(gtkPrinterPointer)?.toKString() ?: error("Expected not null string")

    /**
     * The name of the printer.
     */
    public open val name: String
        /**
         * Returns the name of the printer.
         *
         * @return the name of @printer
         */
        get() = gtk_printer_get_name(gtkPrinterPointer)?.toKString() ?: error("Expected not null string")

    /**
     * String giving the current status of the printer.
     */
    public open val stateMessage: String
        /**
         * Returns the state message describing the current state
         * of the printer.
         *
         * @return the state message of @printer
         */
        get() = gtk_printer_get_state_message(gtkPrinterPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Creates a new `GtkPrinter`.
     *
     * @param name the name of the printer
     * @param backend a `GtkPrintBackend`
     * @param virtual whether the printer is virtual
     * @return a new `GtkPrinter`
     */
    public constructor(
        name: String,
        backend: PrintBackend,
        virtual: Boolean,
    ) : this(gtk_printer_new(name, backend.gPointer, virtual.asGBoolean())!!.reinterpret())

    /**
     * Returns whether the printer accepts input in
     * PDF format.
     *
     * @return true if @printer accepts PDF
     */
    public open fun acceptsPdf(): Boolean = gtk_printer_accepts_pdf(gtkPrinterPointer).asBoolean()

    /**
     * Returns whether the printer accepts input in
     * PostScript format.
     *
     * @return true if @printer accepts PostScript
     */
    public open fun acceptsPs(): Boolean = gtk_printer_accepts_ps(gtkPrinterPointer).asBoolean()

    /**
     * Compares two printers.
     *
     * @param b another `GtkPrinter`
     * @return 0 if the printer match, a negative value if @a < @b,
     *   or a positive value if @a > @b
     */
    public open fun compare(b: Printer): gint = gtk_printer_compare(gtkPrinterPointer, b.gtkPrinterPointer)

    /**
     * Returns the backend of the printer.
     *
     * @return the backend of @printer
     */
    public open fun getBackend(): PrintBackend = gtk_printer_get_backend(gtkPrinterPointer)!!.run {
        PrintBackend(this)
    }

    /**
     * Returns the printer’s capabilities.
     *
     * This is useful when you’re using `GtkPrintUnixDialog`’s
     * manual-capabilities setting and need to know which settings
     * the printer can handle and which you must handle yourself.
     *
     * This will return 0 unless the printer’s details are
     * available, see [method@Gtk.Printer.has_details] and
     * [method@Gtk.Printer.request_details].
     *
     * @return the printer’s capabilities
     */
    public open fun getCapabilities(): PrintCapabilities = gtk_printer_get_capabilities(gtkPrinterPointer).run {
        PrintCapabilities(this)
    }

    /**
     * Returns default page size of @printer.
     *
     * @return a newly allocated `GtkPageSetup` with default page size
     *   of the printer.
     */
    public open fun getDefaultPageSize(): PageSetup = gtk_printer_get_default_page_size(gtkPrinterPointer)!!.run {
        PageSetup(this)
    }

    /**
     * Gets the description of the printer.
     *
     * @return the description of @printer
     */
    public open fun getDescription(): String =
        gtk_printer_get_description(gtkPrinterPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Returns whether the printer details are available.
     *
     * @return true if @printer details are available
     */
    public open fun hasDetails(): Boolean = gtk_printer_has_details(gtkPrinterPointer).asBoolean()

    /**
     * Returns whether the printer is accepting jobs
     *
     * @return true if @printer is accepting jobs
     */
    public open fun isAcceptingJobs(): Boolean = gtk_printer_is_accepting_jobs(gtkPrinterPointer).asBoolean()

    /**
     * Returns whether the printer is currently active (i.e.
     * accepts new jobs).
     *
     * @return true if @printer is active
     */
    public open fun isActive(): Boolean = gtk_printer_is_active(gtkPrinterPointer).asBoolean()

    /**
     * Returns whether the printer is the default printer.
     *
     * @return true if @printer is the default
     */
    public open fun isDefault(): Boolean = gtk_printer_is_default(gtkPrinterPointer).asBoolean()

    /**
     * Returns whether the printer is currently paused.
     *
     * A paused printer still accepts jobs, but it is not
     * printing them.
     *
     * @return true if @printer is paused
     */
    public open fun isPaused(): Boolean = gtk_printer_is_paused(gtkPrinterPointer).asBoolean()

    /**
     * Returns whether the printer is virtual (i.e. does not
     * represent actual printer hardware, but something like
     * a CUPS class).
     *
     * @return true if @printer is virtual
     */
    public open fun isVirtual(): Boolean = gtk_printer_is_virtual(gtkPrinterPointer).asBoolean()

    /**
     * Lists all the paper sizes @printer supports.
     *
     * This will return and empty list unless the printer’s details
     * are available, see [method@Gtk.Printer.has_details] and
     * [method@Gtk.Printer.request_details].
     *
     * @return a newly
     *   allocated list of newly allocated `GtkPageSetup`s.
     */
    public open fun listPapers(): List = gtk_printer_list_papers(gtkPrinterPointer)!!.run {
        List(this)
    }

    /**
     * Requests the printer details.
     *
     * When the details are available, the
     * [signal@Gtk.Printer::details-acquired] signal
     * will be emitted on @printer.
     */
    public open fun requestDetails(): Unit = gtk_printer_request_details(gtkPrinterPointer)

    /**
     * Emitted in response to a request for detailed information
     * about a printer from the print backend.
     *
     * The @success parameter indicates if the information was
     * actually obtained.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `success` true if the details were successfully acquired
     */
    public fun onDetailsAcquired(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (success: Boolean) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "details-acquired",
        onDetailsAcquiredFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "details-acquired" signal. See [onDetailsAcquired].
     *
     * @param success true if the details were successfully acquired
     */
    public fun emitDetailsAcquired(success: Boolean) {
        g_signal_emit_by_name(gPointer.reinterpret(), "details-acquired", success.asGBoolean())
    }

    public companion object : TypeCompanion<Printer> {
        override val type: GeneratedClassKGType<Printer> =
            GeneratedClassKGType(gtk_printer_get_type()) { Printer(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Printer
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_printer_get_type()
    }
}

private val onDetailsAcquiredFunc: CPointer<CFunction<(gboolean) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        success: gboolean,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(success: Boolean) -> Unit>().get().invoke(success.asBoolean())
}
    .reinterpret()
