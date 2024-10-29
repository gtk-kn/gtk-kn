// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gtksource.GtkSourceChangeCaseType
import org.gtkkn.native.gtksource.GtkSourceChangeCaseType.GTK_SOURCE_CHANGE_CASE_LOWER
import org.gtkkn.native.gtksource.GtkSourceChangeCaseType.GTK_SOURCE_CHANGE_CASE_TITLE
import org.gtkkn.native.gtksource.GtkSourceChangeCaseType.GTK_SOURCE_CHANGE_CASE_TOGGLE
import org.gtkkn.native.gtksource.GtkSourceChangeCaseType.GTK_SOURCE_CHANGE_CASE_UPPER

public enum class ChangeCaseType(
    public val nativeValue: GtkSourceChangeCaseType,
) {
    /**
     * change case to lowercase.
     */
    LOWER(GTK_SOURCE_CHANGE_CASE_LOWER),

    /**
     * change case to uppercase.
     */
    UPPER(GTK_SOURCE_CHANGE_CASE_UPPER),

    /**
     * toggle case of each character.
     */
    TOGGLE(GTK_SOURCE_CHANGE_CASE_TOGGLE),

    /**
     * capitalize each word.
     */
    TITLE(GTK_SOURCE_CHANGE_CASE_TITLE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceChangeCaseType): ChangeCaseType =
            when (nativeValue) {
                GTK_SOURCE_CHANGE_CASE_LOWER -> LOWER
                GTK_SOURCE_CHANGE_CASE_UPPER -> UPPER
                GTK_SOURCE_CHANGE_CASE_TOGGLE -> TOGGLE
                GTK_SOURCE_CHANGE_CASE_TITLE -> TITLE
                else -> error("invalid nativeValue")
            }
    }
}
