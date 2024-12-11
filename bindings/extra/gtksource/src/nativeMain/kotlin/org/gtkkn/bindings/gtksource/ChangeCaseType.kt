// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceChangeCaseType
import org.gtkkn.native.gtksource.gtk_source_change_case_type_get_type

public enum class ChangeCaseType(public val nativeValue: GtkSourceChangeCaseType) {
    /**
     * change case to lowercase.
     */
    LOWER(GtkSourceChangeCaseType.GTK_SOURCE_CHANGE_CASE_LOWER),

    /**
     * change case to uppercase.
     */
    UPPER(GtkSourceChangeCaseType.GTK_SOURCE_CHANGE_CASE_UPPER),

    /**
     * toggle case of each character.
     */
    TOGGLE(GtkSourceChangeCaseType.GTK_SOURCE_CHANGE_CASE_TOGGLE),

    /**
     * capitalize each word.
     */
    TITLE(GtkSourceChangeCaseType.GTK_SOURCE_CHANGE_CASE_TITLE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceChangeCaseType): ChangeCaseType = when (nativeValue) {
            GtkSourceChangeCaseType.GTK_SOURCE_CHANGE_CASE_LOWER -> LOWER
            GtkSourceChangeCaseType.GTK_SOURCE_CHANGE_CASE_UPPER -> UPPER
            GtkSourceChangeCaseType.GTK_SOURCE_CHANGE_CASE_TOGGLE -> TOGGLE
            GtkSourceChangeCaseType.GTK_SOURCE_CHANGE_CASE_TITLE -> TITLE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ChangeCaseType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_change_case_type_get_type()
    }
}
