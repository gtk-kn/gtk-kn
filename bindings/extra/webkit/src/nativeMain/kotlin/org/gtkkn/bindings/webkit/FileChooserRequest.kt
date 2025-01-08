// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.FileFilter
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitFileChooserRequest
import org.gtkkn.native.webkit.webkit_file_chooser_request_cancel
import org.gtkkn.native.webkit.webkit_file_chooser_request_get_mime_types
import org.gtkkn.native.webkit.webkit_file_chooser_request_get_mime_types_filter
import org.gtkkn.native.webkit.webkit_file_chooser_request_get_select_multiple
import org.gtkkn.native.webkit.webkit_file_chooser_request_get_selected_files
import org.gtkkn.native.webkit.webkit_file_chooser_request_get_type
import org.gtkkn.native.webkit.webkit_file_chooser_request_select_files
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A request to open a file chooser.
 *
 * Whenever the user interacts with an HTML input element with
 * file type, WebKit will need to show a dialog to choose one or
 * more files to be uploaded to the server along with the rest of the
 * form data. For that to happen in a general way, instead of just
 * opening a #GtkFileChooserDialog (which might be not desirable in
 * some cases, which could prefer to use their own file chooser
 * dialog), WebKit will fire the #WebKitWebView::run-file-chooser
 * signal with a #WebKitFileChooserRequest object, which will allow
 * the client application to specify the files to be selected, to
 * inspect the details of the request (e.g. if multiple selection
 * should be allowed) and to cancel the request, in case nothing was
 * selected.
 *
 * In case the client application does not wish to handle this signal,
 * WebKit will provide a default handler which will asynchronously run
 * a regular #GtkFileChooserDialog for the user to interact with.
 *
 * ## Skipped during bindings generation
 *
 * - method `filter`: Property has no getter nor setter
 */
public class FileChooserRequest(pointer: CPointer<WebKitFileChooserRequest>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitFileChooserRequestPointer: CPointer<WebKitFileChooserRequest>
        get() = gPointer.reinterpret()

    /**
     * A null-terminated array of strings containing the list of MIME
     * types the file chooser dialog should handle. See
     * webkit_file_chooser_request_get_mime_types() for more details.
     */
    public val mimeTypes: List<String>
        /**
         * Get the list of MIME types the file chooser dialog should handle.
         *
         * Get the list of MIME types the file chooser dialog should handle,
         * in the format specified in RFC 2046 for "media types". Its contents
         * depend on the value of the 'accept' attribute for HTML input
         * elements. This function should normally be called before presenting
         * the file chooser dialog to the user, to decide whether to allow the
         * user to select multiple files at once or only one.
         *
         * @return a
         * null-terminated array of strings if a list of accepted MIME types
         * is defined or null otherwise, meaning that any MIME type should be
         * accepted. This array and its contents are owned by WebKit and
         * should not be modified or freed.
         */
        get() = webkit_file_chooser_request_get_mime_types(webkitFileChooserRequestPointer)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Whether the file chooser should allow selecting multiple
     * files. See
     * webkit_file_chooser_request_get_select_multiple() for
     * more details.
     */
    public val selectMultiple: Boolean
        /**
         * Whether the file chooser should allow selecting multiple files.
         *
         * Determine whether the file chooser associated to this
         * #WebKitFileChooserRequest should allow selecting multiple files,
         * which depends on the HTML input element having a 'multiple'
         * attribute defined.
         *
         * @return true if the file chooser should allow selecting multiple files or false otherwise.
         */
        get() = webkit_file_chooser_request_get_select_multiple(webkitFileChooserRequestPointer).asBoolean()

    /**
     * A null-terminated array of strings containing the list of
     * selected files associated to the current request. See
     * webkit_file_chooser_request_get_selected_files() for more details.
     */
    public val selectedFiles: List<String>
        /**
         * Get the list of selected files associated to the request.
         *
         * Get the list of selected files currently associated to the
         * request. Initially, the return value of this method contains any
         * files selected in previous file chooser requests for this HTML
         * input element. Once webkit_file_chooser_request_select_files, the
         * value will reflect whatever files are given.
         *
         * This function should normally be called only before presenting the
         * file chooser dialog to the user, to decide whether to perform some
         * extra action, like pre-selecting the files from a previous request.
         *
         * @return a
         * null-terminated array of strings if there are selected files
         * associated with the request or null otherwise. This array and its
         * contents are owned by WebKit and should not be modified or
         * freed.
         */
        get() = webkit_file_chooser_request_get_selected_files(webkitFileChooserRequestPointer)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Ask WebKit to cancel the request.
     *
     * It's important to do this in case
     * no selection has been made in the client, otherwise the request
     * won't be properly completed and the browser will keep the request
     * pending forever, which might cause the browser to hang.
     */
    public fun cancel(): Unit = webkit_file_chooser_request_cancel(webkitFileChooserRequestPointer)

    /**
     * Get the filter currently associated with the request.
     *
     * Get the filter currently associated with the request, ready to be
     * used by #GtkFileChooser. This function should normally be called
     * before presenting the file chooser dialog to the user, to decide
     * whether to apply a filter so the user would not be allowed to
     * select files with other MIME types.
     *
     * See webkit_file_chooser_request_get_mime_types() if you are
     * interested in getting the list of accepted MIME types.
     *
     * @return a #GtkFileFilter if a list of accepted
     * MIME types is defined or null otherwise. The returned object is
     * owned by WebKit should not be modified or freed.
     */
    public fun getMimeTypesFilter(): FileFilter =
        webkit_file_chooser_request_get_mime_types_filter(webkitFileChooserRequestPointer)!!.run {
            FileFilter(this)
        }

    /**
     * Ask WebKit to select local files for upload and complete the
     * request.
     *
     * @param files a
     * null-terminated array of strings, containing paths to local files.
     */
    public fun selectFiles(files: List<String>): Unit = memScoped {
        return webkit_file_chooser_request_select_files(webkitFileChooserRequestPointer, files.toCStringList(this))
    }

    public companion object : TypeCompanion<FileChooserRequest> {
        override val type: GeneratedClassKGType<FileChooserRequest> =
            GeneratedClassKGType(webkit_file_chooser_request_get_type()) { FileChooserRequest(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of FileChooserRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_file_chooser_request_get_type()
    }
}
