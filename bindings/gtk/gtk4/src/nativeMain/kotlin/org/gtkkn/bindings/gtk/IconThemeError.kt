// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.gtk.GtkIconThemeError
import org.gtkkn.native.gtk.GtkIconThemeError.GTK_ICON_THEME_FAILED
import org.gtkkn.native.gtk.GtkIconThemeError.GTK_ICON_THEME_NOT_FOUND
import org.gtkkn.native.gtk.gtk_icon_theme_error_quark
import kotlin.UInt

/**
 * Error codes for `GtkIconTheme` operations.
 */
public enum class IconThemeError(
    public val nativeValue: GtkIconThemeError,
) {
    /**
     * The icon specified does not exist in the theme
     */
    NOT_FOUND(GTK_ICON_THEME_NOT_FOUND),

    /**
     * An unspecified error occurred.
     */
    FAILED(GTK_ICON_THEME_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkIconThemeError): IconThemeError =
            when (nativeValue) {
                GTK_ICON_THEME_NOT_FOUND -> NOT_FOUND
                GTK_ICON_THEME_FAILED -> FAILED
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = gtk_icon_theme_error_quark()

        public fun fromErrorOrNull(error: Error): IconThemeError? =
            if (error.domain != quark()) {
                null
            } else {
                IconThemeError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
