// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkPageSetup
import org.gtkkn.native.gtk.GtkPrintContext
import org.gtkkn.native.gtk.GtkPrintOperationPreview
import org.gtkkn.native.gtk.gtk_print_operation_preview_end_preview
import org.gtkkn.native.gtk.gtk_print_operation_preview_get_type
import org.gtkkn.native.gtk.gtk_print_operation_preview_is_selected
import org.gtkkn.native.gtk.gtk_print_operation_preview_render_page
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkPrintOperationPreview` is the interface that is used to
 * implement print preview.
 *
 * A `GtkPrintOperationPreview` object is passed to the
 * [signal@Gtk.PrintOperation::preview] signal by
 * [class@Gtk.PrintOperation].
 */
public interface PrintOperationPreview :
    Proxy,
    KGTyped {
    public val gtkPrintOperationPreviewPointer: CPointer<GtkPrintOperationPreview>

    /**
     * Ends a preview.
     *
     * This function must be called to finish a custom print preview.
     */
    public fun endPreview(): Unit = gtk_print_operation_preview_end_preview(gtkPrintOperationPreviewPointer)

    /**
     * Returns whether the given page is included in the set of pages that
     * have been selected for printing.
     *
     * @param pageNr a page number
     * @return true if the page has been selected for printing
     */
    public fun isSelected(pageNr: gint): Boolean =
        gtk_print_operation_preview_is_selected(gtkPrintOperationPreviewPointer, pageNr).asBoolean()

    /**
     * Renders a page to the preview.
     *
     * This is using the print context that was passed to the
     * [signal@Gtk.PrintOperation::preview] handler together
     * with @preview.
     *
     * A custom print preview should use this function to render
     * the currently selected page.
     *
     * Note that this function requires a suitable cairo context to
     * be associated with the print context.
     *
     * @param pageNr the page to render
     */
    public fun renderPage(pageNr: gint): Unit =
        gtk_print_operation_preview_render_page(gtkPrintOperationPreviewPointer, pageNr)

    /**
     * Emitted once for each page that gets rendered to the preview.
     *
     * A handler for this signal should update the @context
     * according to @page_setup and set up a suitable cairo
     * context, using [method@Gtk.PrintContext.set_cairo_context].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `context` the current `GtkPrintContext`; `pageSetup` the `GtkPageSetup` for the current page
     */
    public fun onGotPageSize(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (context: PrintContext, pageSetup: PageSetup) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkPrintOperationPreviewPointer,
        "got-page-size",
        onGotPageSizeFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The ::ready signal gets emitted once per preview operation,
     * before the first page is rendered.
     *
     * A handler for this signal can be used for setup tasks.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `context` the current `GtkPrintContext`
     */
    public fun onReady(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (context: PrintContext) -> Unit): ULong =
        g_signal_connect_data(
            gtkPrintOperationPreviewPointer,
            "ready",
            onReadyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The PrintOperationPreviewImpl type represents a native instance of the PrintOperationPreview interface.
     *
     * @constructor Creates a new instance of PrintOperationPreview for the provided [CPointer].
     */
    public data class PrintOperationPreviewImpl(
        override val gtkPrintOperationPreviewPointer: CPointer<GtkPrintOperationPreview>,
    ) : Object(gtkPrintOperationPreviewPointer.reinterpret()),
        PrintOperationPreview

    public companion object : TypeCompanion<PrintOperationPreview> {
        override val type: GeneratedInterfaceKGType<PrintOperationPreview> =
            GeneratedInterfaceKGType(gtk_print_operation_preview_get_type()) {
                PrintOperationPreviewImpl(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of PrintOperationPreview
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_print_operation_preview_get_type()
    }
}

private val onGotPageSizeFunc:
    CPointer<CFunction<(CPointer<GtkPrintContext>, CPointer<GtkPageSetup>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            context: CPointer<GtkPrintContext>?,
            pageSetup: CPointer<GtkPageSetup>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(context: PrintContext, pageSetup: PageSetup) -> Unit>().get().invoke(
            context!!.run {
                PrintContext(this)
            },
            pageSetup!!.run {
                PageSetup(this)
            }
        )
    }
        .reinterpret()

private val onReadyFunc: CPointer<CFunction<(CPointer<GtkPrintContext>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            context: CPointer<GtkPrintContext>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(context: PrintContext) -> Unit>().get().invoke(
            context!!.run {
                PrintContext(this)
            }
        )
    }
        .reinterpret()
