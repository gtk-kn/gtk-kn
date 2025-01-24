// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkInputPurpose
import org.gtkkn.native.gtk.gtk_input_purpose_get_type

/**
 * Describes primary purpose of the input widget.
 *
 * This information is useful for on-screen keyboards and similar input
 * methods to decide which keys should be presented to the user.
 *
 * Note that the purpose is not meant to impose a totally strict rule
 * about allowed characters, and does not replace input validation.
 * It is fine for an on-screen keyboard to let the user override the
 * character set restriction that is expressed by the purpose. The
 * application is expected to validate the entry contents, even if
 * it specified a purpose.
 *
 * The difference between %GTK_INPUT_PURPOSE_DIGITS and
 * %GTK_INPUT_PURPOSE_NUMBER is that the former accepts only digits
 * while the latter also some punctuation (like commas or points, plus,
 * minus) and “e” or “E” as in 3.14E+000.
 *
 * This enumeration may be extended in the future; input methods should
 * interpret unknown values as “free form”.
 */
public enum class InputPurpose(public val nativeValue: GtkInputPurpose) {
    /**
     * Allow any character
     */
    FREE_FORM(GtkInputPurpose.GTK_INPUT_PURPOSE_FREE_FORM),

    /**
     * Allow only alphabetic characters
     */
    ALPHA(GtkInputPurpose.GTK_INPUT_PURPOSE_ALPHA),

    /**
     * Allow only digits
     */
    DIGITS(GtkInputPurpose.GTK_INPUT_PURPOSE_DIGITS),

    /**
     * Edited field expects numbers
     */
    NUMBER(GtkInputPurpose.GTK_INPUT_PURPOSE_NUMBER),

    /**
     * Edited field expects phone number
     */
    PHONE(GtkInputPurpose.GTK_INPUT_PURPOSE_PHONE),

    /**
     * Edited field expects URL
     */
    URL(GtkInputPurpose.GTK_INPUT_PURPOSE_URL),

    /**
     * Edited field expects email address
     */
    EMAIL(GtkInputPurpose.GTK_INPUT_PURPOSE_EMAIL),

    /**
     * Edited field expects the name of a person
     */
    NAME(GtkInputPurpose.GTK_INPUT_PURPOSE_NAME),

    /**
     * Like %GTK_INPUT_PURPOSE_FREE_FORM, but characters are hidden
     */
    PASSWORD(GtkInputPurpose.GTK_INPUT_PURPOSE_PASSWORD),

    /**
     * Like %GTK_INPUT_PURPOSE_DIGITS, but characters are hidden
     */
    PIN(GtkInputPurpose.GTK_INPUT_PURPOSE_PIN),

    /**
     * Allow any character, in addition to control codes
     */
    TERMINAL(GtkInputPurpose.GTK_INPUT_PURPOSE_TERMINAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkInputPurpose): InputPurpose = when (nativeValue) {
            GtkInputPurpose.GTK_INPUT_PURPOSE_FREE_FORM -> FREE_FORM
            GtkInputPurpose.GTK_INPUT_PURPOSE_ALPHA -> ALPHA
            GtkInputPurpose.GTK_INPUT_PURPOSE_DIGITS -> DIGITS
            GtkInputPurpose.GTK_INPUT_PURPOSE_NUMBER -> NUMBER
            GtkInputPurpose.GTK_INPUT_PURPOSE_PHONE -> PHONE
            GtkInputPurpose.GTK_INPUT_PURPOSE_URL -> URL
            GtkInputPurpose.GTK_INPUT_PURPOSE_EMAIL -> EMAIL
            GtkInputPurpose.GTK_INPUT_PURPOSE_NAME -> NAME
            GtkInputPurpose.GTK_INPUT_PURPOSE_PASSWORD -> PASSWORD
            GtkInputPurpose.GTK_INPUT_PURPOSE_PIN -> PIN
            GtkInputPurpose.GTK_INPUT_PURPOSE_TERMINAL -> TERMINAL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of InputPurpose
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_input_purpose_get_type()
    }
}
