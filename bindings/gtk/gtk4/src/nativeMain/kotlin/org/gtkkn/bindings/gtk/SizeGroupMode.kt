// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkSizeGroupMode
import org.gtkkn.native.gtk.GtkSizeGroupMode.GTK_SIZE_GROUP_BOTH
import org.gtkkn.native.gtk.GtkSizeGroupMode.GTK_SIZE_GROUP_HORIZONTAL
import org.gtkkn.native.gtk.GtkSizeGroupMode.GTK_SIZE_GROUP_NONE
import org.gtkkn.native.gtk.GtkSizeGroupMode.GTK_SIZE_GROUP_VERTICAL

/**
 * The mode of the size group determines the directions in which the size
 * group affects the requested sizes of its component widgets.
 */
public enum class SizeGroupMode(
    public val nativeValue: GtkSizeGroupMode,
) {
    /**
     * group has no effect
     */
    NONE(GTK_SIZE_GROUP_NONE),

    /**
     * group affects horizontal requisition
     */
    HORIZONTAL(GTK_SIZE_GROUP_HORIZONTAL),

    /**
     * group affects vertical requisition
     */
    VERTICAL(GTK_SIZE_GROUP_VERTICAL),

    /**
     * group affects both horizontal and vertical requisition
     */
    BOTH(GTK_SIZE_GROUP_BOTH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSizeGroupMode): SizeGroupMode =
            when (nativeValue) {
                GTK_SIZE_GROUP_NONE -> NONE
                GTK_SIZE_GROUP_HORIZONTAL -> HORIZONTAL
                GTK_SIZE_GROUP_VERTICAL -> VERTICAL
                GTK_SIZE_GROUP_BOTH -> BOTH
                else -> error("invalid nativeValue")
            }
    }
}
