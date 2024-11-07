// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_28
import org.gtkkn.native.webkit.WebKitUserMessageError
import org.gtkkn.native.webkit.webkit_user_message_error_quark
import kotlin.UInt

/**
 * Enum values used to denote errors happening when sending user messages.
 * @since 2.28
 */
@WebKitVersion2_28
public enum class UserMessageError(
    public val nativeValue: WebKitUserMessageError,
) {
    /**
     * The message was not handled by the receiver.
     */
    MESSAGE(WebKitUserMessageError.WEBKIT_USER_MESSAGE_UNHANDLED_MESSAGE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitUserMessageError): UserMessageError =
            when (nativeValue) {
                WebKitUserMessageError.WEBKIT_USER_MESSAGE_UNHANDLED_MESSAGE -> MESSAGE
                else -> error("invalid nativeValue")
            }

        /**
         * Gets the quark for the domain of user message errors.
         *
         * @return user message error domain.
         */
        public fun quark(): UInt = webkit_user_message_error_quark()

        public fun fromErrorOrNull(error: Error): UserMessageError? =
            if (error.domain != quark()) {
                null
            } else {
                UserMessageError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
