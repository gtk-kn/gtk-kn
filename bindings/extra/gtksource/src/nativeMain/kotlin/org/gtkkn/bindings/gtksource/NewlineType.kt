// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gtksource.GtkSourceNewlineType
import org.gtkkn.native.gtksource.GtkSourceNewlineType.GTK_SOURCE_NEWLINE_TYPE_CR
import org.gtkkn.native.gtksource.GtkSourceNewlineType.GTK_SOURCE_NEWLINE_TYPE_CR_LF
import org.gtkkn.native.gtksource.GtkSourceNewlineType.GTK_SOURCE_NEWLINE_TYPE_LF

public enum class NewlineType(
    public val nativeValue: GtkSourceNewlineType,
) {
    /**
     * line feed, used on UNIX.
     */
    LF(GTK_SOURCE_NEWLINE_TYPE_LF),

    /**
     * carriage return, used on Mac.
     */
    CR(GTK_SOURCE_NEWLINE_TYPE_CR),

    /**
     * carriage return followed by a line feed, used
     *   on Windows.
     */
    CR_LF(GTK_SOURCE_NEWLINE_TYPE_CR_LF),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceNewlineType): NewlineType =
            when (nativeValue) {
                GTK_SOURCE_NEWLINE_TYPE_LF -> LF
                GTK_SOURCE_NEWLINE_TYPE_CR -> CR
                GTK_SOURCE_NEWLINE_TYPE_CR_LF -> CR_LF
                else -> error("invalid nativeValue")
            }
    }
}
