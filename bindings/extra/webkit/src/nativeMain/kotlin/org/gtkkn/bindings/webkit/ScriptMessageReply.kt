// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.jsc.Value
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitScriptMessageReply
import org.gtkkn.native.webkit.webkit_script_message_reply_get_type
import org.gtkkn.native.webkit.webkit_script_message_reply_ref
import org.gtkkn.native.webkit.webkit_script_message_reply_return_error_message
import org.gtkkn.native.webkit.webkit_script_message_reply_return_value
import org.gtkkn.native.webkit.webkit_script_message_reply_unref
import kotlin.String
import kotlin.Unit

/**
 * A reply for a script message received.
 * If no reply has been sent by the user, an automatically generated reply with
 * undefined value with be sent.
 * @since 2.40
 */
@WebKitVersion2_40
public class ScriptMessageReply(public val webkitScriptMessageReplyPointer: CPointer<WebKitScriptMessageReply>) :
    ProxyInstance(webkitScriptMessageReplyPointer) {
    /**
     * Atomically increments the reference count of @script_message_reply by one.
     *
     * @return the @script_message_reply passed in.
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun ref(): ScriptMessageReply = webkit_script_message_reply_ref(webkitScriptMessageReplyPointer)!!.run {
        ScriptMessageReply(this)
    }

    /**
     * Reply to a script message with an error message.
     *
     * @param errorMessage An error message to return as specified by the user's script message
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun returnErrorMessage(errorMessage: String): Unit =
        webkit_script_message_reply_return_error_message(webkitScriptMessageReplyPointer, errorMessage)

    /**
     * Reply to a script message with a value.
     *
     * This function can be called twice for passing the reply value in.
     *
     * @param replyValue Reply value of the provided script message
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun returnValue(replyValue: Value): Unit =
        webkit_script_message_reply_return_value(webkitScriptMessageReplyPointer, replyValue.jscValuePointer)

    /**
     * Atomically decrements the reference count of @script_message_reply by one.
     *
     * If the reference count drops to 0, all the memory allocated by the
     * #WebKitScriptMessageReply is released. This function is MT-safe and may
     * be called from any thread.
     *
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun unref(): Unit = webkit_script_message_reply_unref(webkitScriptMessageReplyPointer)

    public companion object {
        /**
         * Get the GType of ScriptMessageReply
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_script_message_reply_get_type()
    }
}
