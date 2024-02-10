// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkResponseType
import org.gtkkn.native.gtk.GtkResponseType.GTK_RESPONSE_ACCEPT
import org.gtkkn.native.gtk.GtkResponseType.GTK_RESPONSE_APPLY
import org.gtkkn.native.gtk.GtkResponseType.GTK_RESPONSE_CANCEL
import org.gtkkn.native.gtk.GtkResponseType.GTK_RESPONSE_CLOSE
import org.gtkkn.native.gtk.GtkResponseType.GTK_RESPONSE_DELETE_EVENT
import org.gtkkn.native.gtk.GtkResponseType.GTK_RESPONSE_HELP
import org.gtkkn.native.gtk.GtkResponseType.GTK_RESPONSE_NO
import org.gtkkn.native.gtk.GtkResponseType.GTK_RESPONSE_NONE
import org.gtkkn.native.gtk.GtkResponseType.GTK_RESPONSE_OK
import org.gtkkn.native.gtk.GtkResponseType.GTK_RESPONSE_REJECT
import org.gtkkn.native.gtk.GtkResponseType.GTK_RESPONSE_YES

/**
 * Predefined values for use as response ids in gtk_dialog_add_button().
 *
 * All predefined values are negative; GTK leaves values of 0 or greater for
 * application-defined response ids.
 */
public enum class ResponseType(
    public val nativeValue: GtkResponseType,
) {
    /**
     * Returned if an action widget has no response id,
     *   or if the dialog gets programmatically hidden or destroyed
     */
    NONE(GTK_RESPONSE_NONE),

    /**
     * Generic response id, not used by GTK dialogs
     */
    REJECT(GTK_RESPONSE_REJECT),

    /**
     * Generic response id, not used by GTK dialogs
     */
    ACCEPT(GTK_RESPONSE_ACCEPT),

    /**
     * Returned if the dialog is deleted
     */
    DELETE_EVENT(GTK_RESPONSE_DELETE_EVENT),

    /**
     * Returned by OK buttons in GTK dialogs
     */
    OK(GTK_RESPONSE_OK),

    /**
     * Returned by Cancel buttons in GTK dialogs
     */
    CANCEL(GTK_RESPONSE_CANCEL),

    /**
     * Returned by Close buttons in GTK dialogs
     */
    CLOSE(GTK_RESPONSE_CLOSE),

    /**
     * Returned by Yes buttons in GTK dialogs
     */
    YES(GTK_RESPONSE_YES),

    /**
     * Returned by No buttons in GTK dialogs
     */
    NO(GTK_RESPONSE_NO),

    /**
     * Returned by Apply buttons in GTK dialogs
     */
    APPLY(GTK_RESPONSE_APPLY),

    /**
     * Returned by Help buttons in GTK dialogs
     */
    HELP(GTK_RESPONSE_HELP),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkResponseType): ResponseType =
            when (nativeValue) {
                GTK_RESPONSE_NONE -> NONE
                GTK_RESPONSE_REJECT -> REJECT
                GTK_RESPONSE_ACCEPT -> ACCEPT
                GTK_RESPONSE_DELETE_EVENT -> DELETE_EVENT
                GTK_RESPONSE_OK -> OK
                GTK_RESPONSE_CANCEL -> CANCEL
                GTK_RESPONSE_CLOSE -> CLOSE
                GTK_RESPONSE_YES -> YES
                GTK_RESPONSE_NO -> NO
                GTK_RESPONSE_APPLY -> APPLY
                GTK_RESPONSE_HELP -> HELP
                else -> error("invalid nativeValue")
            }
    }
}
