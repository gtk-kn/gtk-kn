// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.atk.annotations.AtkVersion1_12
import org.gtkkn.bindings.atk.annotations.AtkVersion2_12
import org.gtkkn.bindings.atk.annotations.AtkVersion2_52
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkDocument
import org.gtkkn.native.atk.atk_document_get_attribute_value
import org.gtkkn.native.atk.atk_document_get_current_page_number
import org.gtkkn.native.atk.atk_document_get_document_type
import org.gtkkn.native.atk.atk_document_get_locale
import org.gtkkn.native.atk.atk_document_get_page_count
import org.gtkkn.native.atk.atk_document_get_type
import org.gtkkn.native.atk.atk_document_set_attribute_value
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The ATK interface which represents the toplevel
 *  container for document content.
 *
 * The AtkDocument interface should be supported by any object whose
 * content is a representation or view of a document.  The AtkDocument
 * interface should appear on the toplevel container for the document
 * content; however AtkDocument instances may be nested (i.e. an
 * AtkDocument may be a descendant of another AtkDocument) in those
 * cases where one document contains "embedded content" which can
 * reasonably be considered a document in its own right.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_attributes`: Return type AttributeSet is unsupported
 * - method `get_document`: Return type gpointer is unsupported
 * - method `get_text_selections`: Array parameter of type TextSelection is not supported
 * - parameter `selections`: Array parameter of type TextSelection is not supported
 */
public interface Document :
    Interface,
    KGTyped {
    public val atkDocumentPointer: CPointer<AtkDocument>

    /**
     * Retrieves the value of the given @attribute_name inside @document.
     *
     * @param attributeName a character string representing the name of the attribute
     *   whose value is being queried.
     * @return a string value associated with the named
     *    attribute for this document, or null if a value for
     *    @attribute_name has not been specified for this document.
     * @since 1.12
     */
    @AtkVersion1_12
    public fun getAttributeValue(attributeName: String): String? =
        atk_document_get_attribute_value(atkDocumentPointer.reinterpret(), attributeName)?.toKString()

    /**
     * Retrieves the current page number inside @document.
     *
     * @return the current page number inside @document, or -1 if
     *   not implemented, not know by the implementor, or irrelevant.
     * @since 2.12
     */
    @AtkVersion2_12
    public fun getCurrentPageNumber(): Int = atk_document_get_current_page_number(atkDocumentPointer.reinterpret())

    /**
     * Gets a string indicating the document type.
     *
     * @return a string indicating the document type
     */
    public fun getDocumentType(): String =
        atk_document_get_document_type(atkDocumentPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets a UTF-8 string indicating the POSIX-style LC_MESSAGES locale
     *          of the content of this document instance.  Individual
     *          text substrings or images within this document may have
     *          a different locale, see atk_text_get_attributes and
     *          atk_image_get_image_locale.
     *
     * @return a UTF-8 string indicating the POSIX-style LC_MESSAGES
     *          locale of the document content as a whole, or NULL if
     *          the document content does not specify a locale.
     */
    public fun getLocale(): String =
        atk_document_get_locale(atkDocumentPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Retrieves the total number of pages inside @document.
     *
     * @return total page count of @document, or -1 if not implemented,
     *   not know by the implementor or irrelevant.
     * @since 2.12
     */
    @AtkVersion2_12
    public fun getPageCount(): Int = atk_document_get_page_count(atkDocumentPointer.reinterpret())

    /**
     * Sets the value for the given @attribute_name inside @document.
     *
     * @param attributeName a character string representing the name of the attribute
     *   whose value is being set.
     * @param attributeValue a string value to be associated with @attribute_name.
     * @return true if @attribute_value is successfully associated
     *   with @attribute_name for this @document, and false if if the
     *   document does not allow the attribute to be modified
     * @since 1.12
     */
    @AtkVersion1_12
    public fun setAttributeValue(
        attributeName: String,
        attributeValue: String,
    ): Boolean =
        atk_document_set_attribute_value(atkDocumentPointer.reinterpret(), attributeName, attributeValue).asBoolean()

    /**
     * The "document-attribute-changed" signal should be emitted when there is a
     * change to one of the document attributes returned by
     * atk_document_get_attributes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` the name of the attribute being modified, or null if not
     *          available.; `arg2` the attribute's new value, or %null if not available.
     * @since 2.52
     */
    @AtkVersion2_52
    public fun connectDocumentAttributeChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: String, arg2: String) -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkDocumentPointer.reinterpret(),
            "document-attribute-changed",
            connectDocumentAttributeChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The 'load-complete' signal is emitted when a pending load of
     * a static document has completed.  This signal is to be
     * expected by ATK clients if and when AtkDocument implementors
     * expose ATK_STATE_BUSY.  If the state of an AtkObject which
     * implements AtkDocument does not include ATK_STATE_BUSY, it
     * should be safe for clients to assume that the AtkDocument's
     * static contents are fully loaded into the container.
     * (Dynamic document contents should be exposed via other
     * signals.)
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectLoadComplete(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkDocumentPointer.reinterpret(),
            "load-complete",
            connectLoadCompleteFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The 'load-stopped' signal is emitted when a pending load of
     * document contents is cancelled, paused, or otherwise
     * interrupted by the user or application logic.  It should not
     * however be emitted while waiting for a resource (for instance
     * while blocking on a file or network read) unless a
     * user-significant timeout has occurred.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectLoadStopped(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkDocumentPointer.reinterpret(),
            "load-stopped",
            connectLoadStoppedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The 'page-changed' signal is emitted when the current page of
     * a document changes, e.g. pressing page up/down in a document
     * viewer.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `pageNumber` the new page number. If this value is unknown
     * or not applicable, -1 should be provided.
     * @since 2.12
     */
    @AtkVersion2_12
    public fun connectPageChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (pageNumber: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkDocumentPointer.reinterpret(),
            "page-changed",
            connectPageChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The 'reload' signal is emitted when the contents of a
     * document is refreshed from its source.  Once 'reload' has
     * been emitted, a matching 'load-complete' or 'load-stopped'
     * signal should follow, which clients may await before
     * interrogating ATK for the latest document content.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectReload(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkDocumentPointer.reinterpret(),
            "reload",
            connectReloadFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<AtkDocument>,
    ) : Document {
        override val atkDocumentPointer: CPointer<AtkDocument> = pointer
    }

    public companion object : TypeCompanion<Document> {
        override val type: GeneratedInterfaceKGType<Document> =
            GeneratedInterfaceKGType(atk_document_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AtkDocument>): Document = Wrapper(pointer)
    }
}

private val connectDocumentAttributeChangedFunc:
    CPointer<CFunction<(CPointer<ByteVar>, CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: CPointer<ByteVar>?,
            arg2: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: String, arg2: String) -> Unit>().get().invoke(
            arg1?.toKString() ?: error("Expected not null string"),
            arg2?.toKString() ?: error("Expected not null string")
        )
    }.reinterpret()

private val connectLoadCompleteFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectLoadStoppedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectPageChangedFunc: CPointer<CFunction<(Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            pageNumber: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(pageNumber: Int) -> Unit>().get().invoke(pageNumber)
    }.reinterpret()

private val connectReloadFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
