// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkMessageType

/**
 * The type of message being displayed in a [class@MessageDialog].
 */
public enum class MessageType(
    public val nativeValue: GtkMessageType,
) {
    /**
     * Informational message
     */
    INFO(GtkMessageType.GTK_MESSAGE_INFO),

    /**
     * Non-fatal warning message
     */
    WARNING(GtkMessageType.GTK_MESSAGE_WARNING),

    /**
     * Question requiring a choice
     */
    QUESTION(GtkMessageType.GTK_MESSAGE_QUESTION),

    /**
     * Fatal error message
     */
    ERROR(GtkMessageType.GTK_MESSAGE_ERROR),

    /**
     * None of the above
     */
    OTHER(GtkMessageType.GTK_MESSAGE_OTHER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkMessageType): MessageType =
            when (nativeValue) {
                GtkMessageType.GTK_MESSAGE_INFO -> INFO
                GtkMessageType.GTK_MESSAGE_WARNING -> WARNING
                GtkMessageType.GTK_MESSAGE_QUESTION -> QUESTION
                GtkMessageType.GTK_MESSAGE_ERROR -> ERROR
                GtkMessageType.GTK_MESSAGE_OTHER -> OTHER
                else -> error("invalid nativeValue")
            }
    }
}
