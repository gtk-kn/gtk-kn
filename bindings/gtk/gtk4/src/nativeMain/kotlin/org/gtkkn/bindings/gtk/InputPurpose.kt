// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkInputPurpose
import org.gtkkn.native.gtk.GtkInputPurpose.GTK_INPUT_PURPOSE_ALPHA
import org.gtkkn.native.gtk.GtkInputPurpose.GTK_INPUT_PURPOSE_DIGITS
import org.gtkkn.native.gtk.GtkInputPurpose.GTK_INPUT_PURPOSE_EMAIL
import org.gtkkn.native.gtk.GtkInputPurpose.GTK_INPUT_PURPOSE_FREE_FORM
import org.gtkkn.native.gtk.GtkInputPurpose.GTK_INPUT_PURPOSE_NAME
import org.gtkkn.native.gtk.GtkInputPurpose.GTK_INPUT_PURPOSE_NUMBER
import org.gtkkn.native.gtk.GtkInputPurpose.GTK_INPUT_PURPOSE_PASSWORD
import org.gtkkn.native.gtk.GtkInputPurpose.GTK_INPUT_PURPOSE_PHONE
import org.gtkkn.native.gtk.GtkInputPurpose.GTK_INPUT_PURPOSE_PIN
import org.gtkkn.native.gtk.GtkInputPurpose.GTK_INPUT_PURPOSE_TERMINAL
import org.gtkkn.native.gtk.GtkInputPurpose.GTK_INPUT_PURPOSE_URL

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
public enum class InputPurpose(
    public val nativeValue: GtkInputPurpose,
) {
    /**
     * Allow any character
     */
    FREE_FORM(GTK_INPUT_PURPOSE_FREE_FORM),

    /**
     * Allow only alphabetic characters
     */
    ALPHA(GTK_INPUT_PURPOSE_ALPHA),

    /**
     * Allow only digits
     */
    DIGITS(GTK_INPUT_PURPOSE_DIGITS),

    /**
     * Edited field expects numbers
     */
    NUMBER(GTK_INPUT_PURPOSE_NUMBER),

    /**
     * Edited field expects phone number
     */
    PHONE(GTK_INPUT_PURPOSE_PHONE),

    /**
     * Edited field expects URL
     */
    URL(GTK_INPUT_PURPOSE_URL),

    /**
     * Edited field expects email address
     */
    EMAIL(GTK_INPUT_PURPOSE_EMAIL),

    /**
     * Edited field expects the name of a person
     */
    NAME(GTK_INPUT_PURPOSE_NAME),

    /**
     * Like %GTK_INPUT_PURPOSE_FREE_FORM, but characters are hidden
     */
    PASSWORD(GTK_INPUT_PURPOSE_PASSWORD),

    /**
     * Like %GTK_INPUT_PURPOSE_DIGITS, but characters are hidden
     */
    PIN(GTK_INPUT_PURPOSE_PIN),

    /**
     * Allow any character, in addition to control codes
     */
    TERMINAL(GTK_INPUT_PURPOSE_TERMINAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkInputPurpose): InputPurpose =
            when (nativeValue) {
                GTK_INPUT_PURPOSE_FREE_FORM -> FREE_FORM
                GTK_INPUT_PURPOSE_ALPHA -> ALPHA
                GTK_INPUT_PURPOSE_DIGITS -> DIGITS
                GTK_INPUT_PURPOSE_NUMBER -> NUMBER
                GTK_INPUT_PURPOSE_PHONE -> PHONE
                GTK_INPUT_PURPOSE_URL -> URL
                GTK_INPUT_PURPOSE_EMAIL -> EMAIL
                GTK_INPUT_PURPOSE_NAME -> NAME
                GTK_INPUT_PURPOSE_PASSWORD -> PASSWORD
                GTK_INPUT_PURPOSE_PIN -> PIN
                GTK_INPUT_PURPOSE_TERMINAL -> TERMINAL
                else -> error("invalid nativeValue")
            }
    }
}
