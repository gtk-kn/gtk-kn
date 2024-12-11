// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSizeGroupMode
import org.gtkkn.native.gtk.gtk_size_group_mode_get_type

/**
 * The mode of the size group determines the directions in which the size
 * group affects the requested sizes of its component widgets.
 */
public enum class SizeGroupMode(public val nativeValue: GtkSizeGroupMode) {
    /**
     * group has no effect
     */
    NONE(GtkSizeGroupMode.GTK_SIZE_GROUP_NONE),

    /**
     * group affects horizontal requisition
     */
    HORIZONTAL(GtkSizeGroupMode.GTK_SIZE_GROUP_HORIZONTAL),

    /**
     * group affects vertical requisition
     */
    VERTICAL(GtkSizeGroupMode.GTK_SIZE_GROUP_VERTICAL),

    /**
     * group affects both horizontal and vertical requisition
     */
    BOTH(GtkSizeGroupMode.GTK_SIZE_GROUP_BOTH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSizeGroupMode): SizeGroupMode = when (nativeValue) {
            GtkSizeGroupMode.GTK_SIZE_GROUP_NONE -> NONE
            GtkSizeGroupMode.GTK_SIZE_GROUP_HORIZONTAL -> HORIZONTAL
            GtkSizeGroupMode.GTK_SIZE_GROUP_VERTICAL -> VERTICAL
            GtkSizeGroupMode.GTK_SIZE_GROUP_BOTH -> BOTH
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SizeGroupMode
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_size_group_mode_get_type()
    }
}
