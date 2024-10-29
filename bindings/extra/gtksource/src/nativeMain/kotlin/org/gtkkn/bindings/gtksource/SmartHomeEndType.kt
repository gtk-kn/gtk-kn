// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gtksource.GtkSourceSmartHomeEndType
import org.gtkkn.native.gtksource.GtkSourceSmartHomeEndType.GTK_SOURCE_SMART_HOME_END_AFTER
import org.gtkkn.native.gtksource.GtkSourceSmartHomeEndType.GTK_SOURCE_SMART_HOME_END_ALWAYS
import org.gtkkn.native.gtksource.GtkSourceSmartHomeEndType.GTK_SOURCE_SMART_HOME_END_BEFORE
import org.gtkkn.native.gtksource.GtkSourceSmartHomeEndType.GTK_SOURCE_SMART_HOME_END_DISABLED

public enum class SmartHomeEndType(
    public val nativeValue: GtkSourceSmartHomeEndType,
) {
    /**
     * smart-home-end disabled.
     */
    DISABLED(GTK_SOURCE_SMART_HOME_END_DISABLED),

    /**
     * move to the first/last
     * non-whitespace character on the first press of the HOME/END keys and
     * to the beginning/end of the line on the second press.
     */
    BEFORE(GTK_SOURCE_SMART_HOME_END_BEFORE),

    /**
     * move to the beginning/end of the
     * line on the first press of the HOME/END keys and to the first/last
     * non-whitespace character on the second press.
     */
    AFTER(GTK_SOURCE_SMART_HOME_END_AFTER),

    /**
     * always move to the first/last
     * non-whitespace character when the HOME/END keys are pressed.
     */
    ALWAYS(GTK_SOURCE_SMART_HOME_END_ALWAYS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceSmartHomeEndType): SmartHomeEndType =
            when (nativeValue) {
                GTK_SOURCE_SMART_HOME_END_DISABLED -> DISABLED
                GTK_SOURCE_SMART_HOME_END_BEFORE -> BEFORE
                GTK_SOURCE_SMART_HOME_END_AFTER -> AFTER
                GTK_SOURCE_SMART_HOME_END_ALWAYS -> ALWAYS
                else -> error("invalid nativeValue")
            }
    }
}
