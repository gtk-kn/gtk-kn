// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkResponseType
import org.gtkkn.native.gtk.gtk_response_type_get_type

/**
 * Predefined values for use as response ids in gtk_dialog_add_button().
 *
 * All predefined values are negative; GTK leaves values of 0 or greater for
 * application-defined response ids.
 */
public enum class ResponseType(public val nativeValue: GtkResponseType) {
    /**
     * Returned if an action widget has no response id,
     *   or if the dialog gets programmatically hidden or destroyed
     */
    NONE(GtkResponseType.GTK_RESPONSE_NONE),

    /**
     * Generic response id, not used by GTK dialogs
     */
    REJECT(GtkResponseType.GTK_RESPONSE_REJECT),

    /**
     * Generic response id, not used by GTK dialogs
     */
    ACCEPT(GtkResponseType.GTK_RESPONSE_ACCEPT),

    /**
     * Returned if the dialog is deleted
     */
    DELETE_EVENT(GtkResponseType.GTK_RESPONSE_DELETE_EVENT),

    /**
     * Returned by OK buttons in GTK dialogs
     */
    OK(GtkResponseType.GTK_RESPONSE_OK),

    /**
     * Returned by Cancel buttons in GTK dialogs
     */
    CANCEL(GtkResponseType.GTK_RESPONSE_CANCEL),

    /**
     * Returned by Close buttons in GTK dialogs
     */
    CLOSE(GtkResponseType.GTK_RESPONSE_CLOSE),

    /**
     * Returned by Yes buttons in GTK dialogs
     */
    YES(GtkResponseType.GTK_RESPONSE_YES),

    /**
     * Returned by No buttons in GTK dialogs
     */
    NO(GtkResponseType.GTK_RESPONSE_NO),

    /**
     * Returned by Apply buttons in GTK dialogs
     */
    APPLY(GtkResponseType.GTK_RESPONSE_APPLY),

    /**
     * Returned by Help buttons in GTK dialogs
     */
    HELP(GtkResponseType.GTK_RESPONSE_HELP),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkResponseType): ResponseType = when (nativeValue) {
            GtkResponseType.GTK_RESPONSE_NONE -> NONE
            GtkResponseType.GTK_RESPONSE_REJECT -> REJECT
            GtkResponseType.GTK_RESPONSE_ACCEPT -> ACCEPT
            GtkResponseType.GTK_RESPONSE_DELETE_EVENT -> DELETE_EVENT
            GtkResponseType.GTK_RESPONSE_OK -> OK
            GtkResponseType.GTK_RESPONSE_CANCEL -> CANCEL
            GtkResponseType.GTK_RESPONSE_CLOSE -> CLOSE
            GtkResponseType.GTK_RESPONSE_YES -> YES
            GtkResponseType.GTK_RESPONSE_NO -> NO
            GtkResponseType.GTK_RESPONSE_APPLY -> APPLY
            GtkResponseType.GTK_RESPONSE_HELP -> HELP
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ResponseType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_response_type_get_type()
    }
}
