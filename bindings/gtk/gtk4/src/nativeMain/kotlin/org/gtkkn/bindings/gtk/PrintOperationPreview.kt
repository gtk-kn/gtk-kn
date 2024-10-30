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
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkPageSetup
import org.gtkkn.native.gtk.GtkPrintContext
import org.gtkkn.native.gtk.GtkPrintOperationPreview
import org.gtkkn.native.gtk.gtk_print_operation_preview_end_preview
import org.gtkkn.native.gtk.gtk_print_operation_preview_get_type
import org.gtkkn.native.gtk.gtk_print_operation_preview_is_selected
import org.gtkkn.native.gtk.gtk_print_operation_preview_render_page
import kotlin.Boolean
import kotlin.Int
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
    Interface,
    KGTyped {
    public val gtkPrintOperationPreviewPointer: CPointer<GtkPrintOperationPreview>

    /**
     * Ends a preview.
     *
     * This function must be called to finish a custom print preview.
     */
    public fun endPreview(): Unit =
        gtk_print_operation_preview_end_preview(gtkPrintOperationPreviewPointer.reinterpret())

    /**
     * Returns whether the given page is included in the set of pages that
     * have been selected for printing.
     *
     * @param pageNr a page number
     * @return true if the page has been selected for printing
     */
    public fun isSelected(pageNr: Int): Boolean =
        gtk_print_operation_preview_is_selected(gtkPrintOperationPreviewPointer.reinterpret(), pageNr).asBoolean()

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
    public fun renderPage(pageNr: Int): Unit =
        gtk_print_operation_preview_render_page(gtkPrintOperationPreviewPointer.reinterpret(), pageNr)

    /**
     * Emitted once for each page that gets rendered to the preview.
     *
     * A handler for this signal should update the @context
     * according to @page_setup and set up a suitable cairo
     * context, using [method@Gtk.PrintContext.set_cairo_context].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `context` the current `GtkPrintContext`; `pageSetup` the `GtkPageSetup` for the current page
     */
    public fun connectGotPageSize(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (context: PrintContext, pageSetup: PageSetup) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gtkPrintOperationPreviewPointer.reinterpret(),
            "got-page-size",
            connectGotPageSizeFunc.reinterpret(),
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
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `context` the current `GtkPrintContext`
     */
    public fun connectReady(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (context: PrintContext) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gtkPrintOperationPreviewPointer.reinterpret(),
            "ready",
            connectReadyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<GtkPrintOperationPreview>,
    ) : PrintOperationPreview {
        override val gtkPrintOperationPreviewPointer: CPointer<GtkPrintOperationPreview> = pointer
    }

    public companion object : TypeCompanion<PrintOperationPreview> {
        override val type: GeneratedInterfaceKGType<PrintOperationPreview> =
            GeneratedInterfaceKGType(gtk_print_operation_preview_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkPrintOperationPreview>): PrintOperationPreview = Wrapper(pointer)
    }
}

private val connectGotPageSizeFunc:
    CPointer<CFunction<(CPointer<GtkPrintContext>, CPointer<GtkPageSetup>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            context: CPointer<GtkPrintContext>?,
            pageSetup: CPointer<GtkPageSetup>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(context: PrintContext, pageSetup: PageSetup) -> Unit>().get().invoke(
            context!!.run {
                PrintContext(reinterpret())
            },
            pageSetup!!.run {
                PageSetup(reinterpret())
            }
        )
    }.reinterpret()

private val connectReadyFunc: CPointer<CFunction<(CPointer<GtkPrintContext>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            context: CPointer<GtkPrintContext>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(context: PrintContext) -> Unit>().get().invoke(
            context!!.run {
                PrintContext(reinterpret())
            }
        )
    }.reinterpret()
