// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkMessageType
import org.gtkkn.native.gtk.GtkMessageType.GTK_MESSAGE_ERROR
import org.gtkkn.native.gtk.GtkMessageType.GTK_MESSAGE_INFO
import org.gtkkn.native.gtk.GtkMessageType.GTK_MESSAGE_OTHER
import org.gtkkn.native.gtk.GtkMessageType.GTK_MESSAGE_QUESTION
import org.gtkkn.native.gtk.GtkMessageType.GTK_MESSAGE_WARNING

/**
 * The type of message being displayed in a [class@MessageDialog].
 */
public enum class MessageType(
    public val nativeValue: GtkMessageType,
) {
    /**
     * Informational message
     */
    INFO(GTK_MESSAGE_INFO),

    /**
     * Non-fatal warning message
     */
    WARNING(GTK_MESSAGE_WARNING),

    /**
     * Question requiring a choice
     */
    QUESTION(GTK_MESSAGE_QUESTION),

    /**
     * Fatal error message
     */
    ERROR(GTK_MESSAGE_ERROR),

    /**
     * None of the above
     */
    OTHER(GTK_MESSAGE_OTHER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkMessageType): MessageType =
            when (nativeValue) {
                GTK_MESSAGE_INFO -> INFO
                GTK_MESSAGE_WARNING -> WARNING
                GTK_MESSAGE_QUESTION -> QUESTION
                GTK_MESSAGE_ERROR -> ERROR
                GTK_MESSAGE_OTHER -> OTHER
                else -> error("invalid nativeValue")
            }
    }
}
