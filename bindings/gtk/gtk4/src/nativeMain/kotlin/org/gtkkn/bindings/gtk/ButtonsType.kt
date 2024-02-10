// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkButtonsType
import org.gtkkn.native.gtk.GtkButtonsType.GTK_BUTTONS_CANCEL
import org.gtkkn.native.gtk.GtkButtonsType.GTK_BUTTONS_CLOSE
import org.gtkkn.native.gtk.GtkButtonsType.GTK_BUTTONS_NONE
import org.gtkkn.native.gtk.GtkButtonsType.GTK_BUTTONS_OK
import org.gtkkn.native.gtk.GtkButtonsType.GTK_BUTTONS_OK_CANCEL
import org.gtkkn.native.gtk.GtkButtonsType.GTK_BUTTONS_YES_NO

/**
 * Prebuilt sets of buttons for `GtkDialog`.
 *
 * If none of these choices are appropriate, simply use
 * %GTK_BUTTONS_NONE and call [method@Gtk.Dialog.add_buttons].
 *
 * > Please note that %GTK_BUTTONS_OK, %GTK_BUTTONS_YES_NO
 * > and %GTK_BUTTONS_OK_CANCEL are discouraged by the
 * > [GNOME Human Interface Guidelines](http://library.gnome.org/devel/hig-book/stable/).
 */
public enum class ButtonsType(
    public val nativeValue: GtkButtonsType,
) {
    /**
     * no buttons at all
     */
    NONE(GTK_BUTTONS_NONE),

    /**
     * an OK button
     */
    OK(GTK_BUTTONS_OK),

    /**
     * a Close button
     */
    CLOSE(GTK_BUTTONS_CLOSE),

    /**
     * a Cancel button
     */
    CANCEL(GTK_BUTTONS_CANCEL),

    /**
     * Yes and No buttons
     */
    YES_NO(GTK_BUTTONS_YES_NO),

    /**
     * OK and Cancel buttons
     */
    OK_CANCEL(GTK_BUTTONS_OK_CANCEL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkButtonsType): ButtonsType =
            when (nativeValue) {
                GTK_BUTTONS_NONE -> NONE
                GTK_BUTTONS_OK -> OK
                GTK_BUTTONS_CLOSE -> CLOSE
                GTK_BUTTONS_CANCEL -> CANCEL
                GTK_BUTTONS_YES_NO -> YES_NO
                GTK_BUTTONS_OK_CANCEL -> OK_CANCEL
                else -> error("invalid nativeValue")
            }
    }
}
