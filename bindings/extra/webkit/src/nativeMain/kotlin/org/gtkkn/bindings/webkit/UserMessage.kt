// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.UnixFdList
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.InitiallyUnowned
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_28
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitUserMessage
import org.gtkkn.native.webkit.webkit_user_message_get_fd_list
import org.gtkkn.native.webkit.webkit_user_message_get_name
import org.gtkkn.native.webkit.webkit_user_message_get_parameters
import org.gtkkn.native.webkit.webkit_user_message_get_type
import org.gtkkn.native.webkit.webkit_user_message_new
import org.gtkkn.native.webkit.webkit_user_message_new_with_fd_list
import org.gtkkn.native.webkit.webkit_user_message_send_reply
import kotlin.String
import kotlin.Unit

/**
 * Message that can be sent between the UI process and web process extensions.
 *
 * A WebKitUserMessage is a message that can be used for the communication between the UI process
 * and web process extensions. A WebKitUserMessage always has a name, and it can also include parameters and
 * UNIX file descriptors. Messages can be sent from a #WebKitWebContext to all web process extensions,
 * from a web process extension to its corresponding #WebKitWebContext, and from a #WebKitWebView to its
 * corresponding #WebKitWebPage (and vice versa). One to one messages can be replied to directly with
 * webkit_user_message_send_reply().
 * @since 2.28
 */
@WebKitVersion2_28
public class UserMessage(public val webkitUserMessagePointer: CPointer<WebKitUserMessage>) :
    InitiallyUnowned(webkitUserMessagePointer.reinterpret()),
    KGTyped {
    /**
     * The UNIX file descriptors of the user message.
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public val fdList: UnixFdList?
        /**
         * Get the @message list of file descritpor.
         *
         * @return the message list of file descriptors
         * @since 2.28
         */
        get() = webkit_user_message_get_fd_list(webkitUserMessagePointer)?.run {
            UnixFdList(this)
        }

    /**
     * The name of the user message.
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public val name: String
        /**
         * Get the @message name.
         *
         * @return the message name
         * @since 2.28
         */
        get() = webkit_user_message_get_name(webkitUserMessagePointer)?.toKString() ?: error("Expected not null string")

    /**
     * The parameters of the user message as a #GVariant, or null
     * if the message doesn't include parameters. Note that only complete types are
     * allowed.
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public val parameters: Variant?
        /**
         * Get the @message parameters.
         *
         * @return the message parameters
         * @since 2.28
         */
        get() = webkit_user_message_get_parameters(webkitUserMessagePointer)?.run {
            Variant(this)
        }

    /**
     * Create a new #WebKitUserMessage with @name.
     *
     * @param name the message name
     * @param parameters the message parameters as a #GVariant, or null
     * @return the newly created #WebKitUserMessage object.
     * @since 2.28
     */
    public constructor(
        name: String,
        parameters: Variant? = null,
    ) : this(webkit_user_message_new(name, parameters?.glibVariantPointer)!!.reinterpret())

    /**
     * Create a new #WebKitUserMessage including also a list of UNIX file descriptors to be sent.
     *
     * @param name the message name
     * @param parameters the message parameters as a #GVariant
     * @param fdList the message file descriptors
     * @return the newly created #WebKitUserMessage object.
     * @since 2.28
     */
    public constructor(
        name: String,
        parameters: Variant? = null,
        fdList: UnixFdList? = null,
    ) : this(
        webkit_user_message_new_with_fd_list(
            name,
            parameters?.glibVariantPointer,
            fdList?.gioUnixFdListPointer
        )!!.reinterpret()
    )

    /**
     * Send a reply to an user message.
     *
     * If @reply is floating, it's consumed.
     * You can only send a reply to a #WebKitUserMessage that has been
     * received.
     *
     * @param reply a #WebKitUserMessage to send as reply
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun sendReply(reply: UserMessage): Unit =
        webkit_user_message_send_reply(webkitUserMessagePointer, reply.webkitUserMessagePointer)

    public companion object : TypeCompanion<UserMessage> {
        override val type: GeneratedClassKGType<UserMessage> =
            GeneratedClassKGType(webkit_user_message_get_type()) { UserMessage(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of UserMessage
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_user_message_get_type()
    }
}
