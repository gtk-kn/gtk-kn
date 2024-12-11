// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkButtonsType
import org.gtkkn.native.gtk.gtk_buttons_type_get_type

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
public enum class ButtonsType(public val nativeValue: GtkButtonsType) {
    /**
     * no buttons at all
     */
    NONE(GtkButtonsType.GTK_BUTTONS_NONE),

    /**
     * an OK button
     */
    OK(GtkButtonsType.GTK_BUTTONS_OK),

    /**
     * a Close button
     */
    CLOSE(GtkButtonsType.GTK_BUTTONS_CLOSE),

    /**
     * a Cancel button
     */
    CANCEL(GtkButtonsType.GTK_BUTTONS_CANCEL),

    /**
     * Yes and No buttons
     */
    YES_NO(GtkButtonsType.GTK_BUTTONS_YES_NO),

    /**
     * OK and Cancel buttons
     */
    OK_CANCEL(GtkButtonsType.GTK_BUTTONS_OK_CANCEL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkButtonsType): ButtonsType = when (nativeValue) {
            GtkButtonsType.GTK_BUTTONS_NONE -> NONE
            GtkButtonsType.GTK_BUTTONS_OK -> OK
            GtkButtonsType.GTK_BUTTONS_CLOSE -> CLOSE
            GtkButtonsType.GTK_BUTTONS_CANCEL -> CANCEL
            GtkButtonsType.GTK_BUTTONS_YES_NO -> YES_NO
            GtkButtonsType.GTK_BUTTONS_OK_CANCEL -> OK_CANCEL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ButtonsType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_buttons_type_get_type()
    }
}
