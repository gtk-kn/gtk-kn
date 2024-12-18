// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_8
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.webkit.WebKitColorChooserRequest
import org.gtkkn.native.webkit.webkit_color_chooser_request_cancel
import org.gtkkn.native.webkit.webkit_color_chooser_request_finish
import org.gtkkn.native.webkit.webkit_color_chooser_request_get_element_rectangle
import org.gtkkn.native.webkit.webkit_color_chooser_request_get_rgba
import org.gtkkn.native.webkit.webkit_color_chooser_request_get_type
import org.gtkkn.native.webkit.webkit_color_chooser_request_set_rgba
import kotlin.ULong
import kotlin.Unit

/**
 * A request to open a color chooser.
 *
 * Whenever the user interacts with an <input type='color' />
 * HTML element, WebKit will need to show a dialog to choose a color. For that
 * to happen in a general way, instead of just opening a #GtkColorChooser
 * (which might be not desirable in some cases, which could prefer to use their
 * own color chooser dialog), WebKit will fire the
 * #WebKitWebView::run-color-chooser signal with a #WebKitColorChooserRequest
 * object, which will allow the client application to specify the color to be
 * selected, to inspect the details of the request (e.g. to get initial color)
 * and to cancel the request, in case nothing was selected.
 *
 * In case the client application does not wish to handle this signal,
 * WebKit will provide a default handler which will asynchronously run
 * a regular #GtkColorChooserDialog for the user to interact with.
 *
 * ## Skipped during bindings generation
 *
 * - method `rgba`: Property has no getter
 */
public class ColorChooserRequest(pointer: CPointer<WebKitColorChooserRequest>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitColorChooserRequestPointer: CPointer<WebKitColorChooserRequest>
        get() = gPointer.reinterpret()

    /**
     * Cancels @request and the input element changes to use the initial color.
     *
     * Cancels @request and the input element changes to use the initial color
     * it has before the request started.
     * The signal #WebKitColorChooserRequest::finished
     * is emitted to notify that the request has finished.
     *
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun cancel(): Unit = webkit_color_chooser_request_cancel(webkitColorChooserRequestPointer.reinterpret())

    /**
     * Finishes @request and the input element keeps the current value of
     * #WebKitColorChooserRequest:rgba.
     *
     * Finishes @request and the input element keeps the current value of
     * #WebKitColorChooserRequest:rgba.
     * The signal #WebKitColorChooserRequest::finished
     * is emitted to notify that the request has finished.
     *
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun finish(): Unit = webkit_color_chooser_request_finish(webkitColorChooserRequestPointer.reinterpret())

    /**
     * Gets the bounding box of the color input element.
     *
     * @param rect a #GdkRectangle to fill in with the element area
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun getElementRectangle(rect: Rectangle): Unit = webkit_color_chooser_request_get_element_rectangle(
        webkitColorChooserRequestPointer.reinterpret(),
        rect.gdkRectanglePointer.reinterpret()
    )

    /**
     * Gets the current #GdkRGBA color of @request
     *
     * @param rgba a #GdkRGBA to fill in with the current color.
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun getRgba(rgba: Rgba): Unit = webkit_color_chooser_request_get_rgba(
        webkitColorChooserRequestPointer.reinterpret(),
        rgba.gdkRGBAPointer.reinterpret()
    )

    /**
     * Sets the current #GdkRGBA color of @request
     *
     * @param rgba a pointer #GdkRGBA
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun setRgba(rgba: Rgba): Unit = webkit_color_chooser_request_set_rgba(
        webkitColorChooserRequestPointer.reinterpret(),
        rgba.gdkRGBAPointer.reinterpret()
    )

    /**
     * Emitted when the @request finishes. This signal can be emitted because the
     * user completed the @request calling webkit_color_chooser_request_finish(),
     * or cancelled it with webkit_color_chooser_request_cancel() or because the
     * color input element is removed from the DOM.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun connectFinished(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "finished",
            connectFinishedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<ColorChooserRequest> {
        override val type: GeneratedClassKGType<ColorChooserRequest> =
            GeneratedClassKGType(webkit_color_chooser_request_get_type()) { ColorChooserRequest(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of ColorChooserRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_color_chooser_request_get_type()
    }
}

private val connectFinishedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
