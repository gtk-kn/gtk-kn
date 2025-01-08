// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_6
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.guint64
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.webkit.WebKitDownload
import org.gtkkn.native.webkit.webkit_download_cancel
import org.gtkkn.native.webkit.webkit_download_get_allow_overwrite
import org.gtkkn.native.webkit.webkit_download_get_destination
import org.gtkkn.native.webkit.webkit_download_get_elapsed_time
import org.gtkkn.native.webkit.webkit_download_get_estimated_progress
import org.gtkkn.native.webkit.webkit_download_get_received_data_length
import org.gtkkn.native.webkit.webkit_download_get_request
import org.gtkkn.native.webkit.webkit_download_get_response
import org.gtkkn.native.webkit.webkit_download_get_type
import org.gtkkn.native.webkit.webkit_download_get_web_view
import org.gtkkn.native.webkit.webkit_download_set_allow_overwrite
import org.gtkkn.native.webkit.webkit_download_set_destination
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Object used to communicate with the application when downloading.
 *
 * #WebKitDownload carries information about a download request and
 * response, including a #WebKitURIRequest and a #WebKitURIResponse
 * objects. The application may use this object to control the
 * download process, or to simply figure out what is to be downloaded,
 * and handle the download process itself.
 */
public class Download(pointer: CPointer<WebKitDownload>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitDownloadPointer: CPointer<WebKitDownload>
        get() = gPointer.reinterpret()

    /**
     * Whether or not the download is allowed to overwrite an existing file on
     * disk. If this property is false and the destination already exists,
     * the download will fail.
     *
     * @since 2.6
     */
    @WebKitVersion2_6
    public var allowOverwrite: Boolean
        /**
         * Returns the current value of the #WebKitDownload:allow-overwrite property.
         *
         * Returns the current value of the #WebKitDownload:allow-overwrite property,
         * which determines whether the download will overwrite an existing file on
         * disk, or if it will fail if the destination already exists.
         *
         * @return the current value of the #WebKitDownload:allow-overwrite property
         * @since 2.6
         */
        get() = webkit_download_get_allow_overwrite(webkitDownloadPointer).asBoolean()

        /**
         * Sets the #WebKitDownload:allow-overwrite property.
         *
         * Sets the #WebKitDownload:allow-overwrite property, which determines whether
         * the download may overwrite an existing file on disk, or if it will fail if
         * the destination already exists.
         *
         * @param allowed the new value for the #WebKitDownload:allow-overwrite property
         * @since 2.6
         */
        @WebKitVersion2_6
        set(allowed) = webkit_download_set_allow_overwrite(webkitDownloadPointer, allowed.asGBoolean())

    /**
     * The local path to where the download will be saved.
     */
    public val destination: String?
        /**
         * Obtains the destination to which the downloaded file will be written.
         *
         * You can connect to #WebKitDownload::created-destination to make
         * sure this method returns a valid destination.
         *
         * @return the destination or null
         */
        get() = webkit_download_get_destination(webkitDownloadPointer)?.toKString()

    /**
     * An estimate of the percent completion for the download operation.
     * This value will range from 0.0 to 1.0. The value is an estimate
     * based on the total number of bytes expected to be received for
     * a download.
     * If you need a more accurate progress information you can connect to
     * #WebKitDownload::received-data signal to track the progress.
     */
    public val estimatedProgress: gdouble
        /**
         * Gets the value of the #WebKitDownload:estimated-progress property.
         * Gets the value of the #WebKitDownload:estimated-progress property.
         * You can monitor the estimated progress of the download operation by
         * connecting to the notify::estimated-progress signal of @download.
         *
         * @return an estimate of the of the percent complete for a download
         *     as a range from 0.0 to 1.0.
         */
        get() = webkit_download_get_estimated_progress(webkitDownloadPointer)

    /**
     * The #WebKitURIResponse associated with this download.
     */
    public val response: UriResponse
        /**
         * Retrieves the #WebKitURIResponse object that backs the download process.
         *
         * Retrieves the #WebKitURIResponse object that backs the download
         * process. This method returns null if called before the response
         * is received from the server. You can connect to notify::response
         * signal to be notified when the response is received.
         *
         * @return the #WebKitURIResponse, or null if
         *     the response hasn't been received yet.
         */
        get() = webkit_download_get_response(webkitDownloadPointer)!!.run {
            UriResponse(this)
        }

    /**
     * Cancels the download.
     *
     * When the ongoing download
     * operation is effectively cancelled the signal
     * #WebKitDownload::failed is emitted with
     * %WEBKIT_DOWNLOAD_ERROR_CANCELLED_BY_USER error.
     */
    public fun cancel(): Unit = webkit_download_cancel(webkitDownloadPointer)

    /**
     * Gets the elapsed time in seconds, including any fractional part.
     *
     * If the download finished, had an error or was cancelled this is
     * the time between its start and the event.
     *
     * @return seconds since the download was started
     */
    public fun getElapsedTime(): gdouble = webkit_download_get_elapsed_time(webkitDownloadPointer)

    /**
     * Gets the length of the data already downloaded for @download.
     *
     * Gets the length of the data already downloaded for @download
     * in bytes.
     *
     * @return the amount of bytes already downloaded.
     */
    public fun getReceivedDataLength(): guint64 = webkit_download_get_received_data_length(webkitDownloadPointer)

    /**
     * Retrieves the #WebKitURIRequest object that backs the download
     * process.
     *
     * @return the #WebKitURIRequest of @download
     */
    public fun getRequest(): UriRequest = webkit_download_get_request(webkitDownloadPointer)!!.run {
        UriRequest(this)
    }

    /**
     * Get the #WebKitWebView that initiated the download.
     *
     * @return the #WebKitWebView that initiated @download,
     *    or null if @download was not initiated by a #WebKitWebView.
     */
    public fun getWebView(): WebView = webkit_download_get_web_view(webkitDownloadPointer)!!.run {
        WebView(this)
    }

    /**
     * Sets the destination to which the downloaded file will be written.
     *
     * This method should be called before the download transfer
     * starts or it will not have any effect on the ongoing download
     * operation. To set the destination using the filename suggested
     * by the server connect to #WebKitDownload::decide-destination
     * signal and call webkit_download_set_destination(). If you want to
     * set a fixed destination that doesn't depend on the suggested
     * filename you can connect to notify::response signal and call
     * webkit_download_set_destination().
     *
     * If #WebKitDownload::decide-destination signal is not handled
     * and destination is not set when the download transfer starts,
     * the file will be saved with the filename suggested by the server in
     * %G_USER_DIRECTORY_DOWNLOAD directory.
     *
     * @param destination the destination
     */
    public fun setDestination(destination: String): Unit =
        webkit_download_set_destination(webkitDownloadPointer, destination)

    /**
     * This signal is emitted after #WebKitDownload::decide-destination and before
     * #WebKitDownload::received-data to notify that destination file has been
     * created successfully at @destination.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `destination` the destination
     */
    public fun onCreatedDestination(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (destination: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "created-destination",
        onCreatedDestinationFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "created-destination" signal. See [onCreatedDestination].
     *
     * @param destination the destination
     */
    public fun emitCreatedDestination(destination: String) {
        g_signal_emit_by_name(gPointer.reinterpret(), "created-destination", destination.cstr)
    }

    /**
     * This signal is emitted after response is received to
     * decide a destination for the download using
     * webkit_download_set_destination(). If this signal is not
     * handled, the file will be downloaded to %G_USER_DIRECTORY_DOWNLOAD
     * directory using @suggested_filename.
     *
     * Since 2.40, you may handle this signal asynchronously by
     * returning true without calling webkit_download_set_destination().
     * This indicates intent to eventually call webkit_download_set_destination().
     * In this case, the download will not proceed until the destination is set
     * or cancelled with webkit_download_cancel().
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `suggestedFilename` the filename suggested for the download. Returns true to stop other handlers from being invoked for the event,
     *   or false to propagate the event further.
     */
    public fun onDecideDestination(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (suggestedFilename: String) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer,
        "decide-destination",
        onDecideDestinationFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when an error occurs during the download
     * operation. The given @error, of the domain %WEBKIT_DOWNLOAD_ERROR,
     * contains further details of the failure. If the download is cancelled
     * with webkit_download_cancel(), this signal is emitted with error
     * %WEBKIT_DOWNLOAD_ERROR_CANCELLED_BY_USER. The download operation finishes
     * after an error and #WebKitDownload::finished signal is emitted after this one.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `error` the #GError that was triggered
     */
    public fun onFailed(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (error: Error) -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
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
        g_signal_emit_by_name(gPointer.reinterpret(), "failed", error.gPointer)
    }

    /**
     * This signal is emitted when download finishes successfully or due to an error.
     * In case of errors #WebKitDownload::failed signal is emitted before this one.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onFinished(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
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
        g_signal_emit_by_name(gPointer.reinterpret(), "finished")
    }

    /**
     * This signal is emitted after response is received,
     * every time new data has been written to the destination. It's
     * useful to know the progress of the download operation.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `dataLength` the length of data received in bytes
     */
    public fun onReceivedData(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (dataLength: guint64) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "received-data",
        onReceivedDataFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "received-data" signal. See [onReceivedData].
     *
     * @param dataLength the length of data received in bytes
     */
    public fun emitReceivedData(dataLength: guint64) {
        g_signal_emit_by_name(gPointer.reinterpret(), "received-data", dataLength)
    }

    public companion object : TypeCompanion<Download> {
        override val type: GeneratedClassKGType<Download> =
            GeneratedClassKGType(webkit_download_get_type()) { Download(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of Download
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_download_get_type()
    }
}

private val onCreatedDestinationFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            destination: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(destination: String) -> Unit>().get().invoke(
            destination?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

private val onDecideDestinationFunc: CPointer<CFunction<(CPointer<ByteVar>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            suggestedFilename: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(suggestedFilename: String) -> Boolean>().get().invoke(
            suggestedFilename?.toKString() ?: error("Expected not null string")
        ).asGBoolean()
    }
        .reinterpret()

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

private val onReceivedDataFunc: CPointer<CFunction<(guint64) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        dataLength: guint64,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(dataLength: guint64) -> Unit>().get().invoke(dataLength)
}
    .reinterpret()
