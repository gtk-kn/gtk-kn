// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GFileAttributeStatus
import org.gtkkn.native.gio.g_file_attribute_status_get_type
import org.gtkkn.native.gobject.GType

/**
 * Used by g_file_set_attributes_from_info() when setting file attributes.
 */
public enum class FileAttributeStatus(public val nativeValue: GFileAttributeStatus) {
    /**
     * Attribute value is unset (empty).
     */
    UNSET(GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_UNSET),

    /**
     * Attribute value is set.
     */
    SET(GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_SET),

    /**
     * Indicates an error in setting the value.
     */
    ERROR_SETTING(GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GFileAttributeStatus): FileAttributeStatus = when (nativeValue) {
            GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_UNSET -> UNSET
            GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_SET -> SET
            GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING -> ERROR_SETTING
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FileAttributeStatus
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_attribute_status_get_type()
    }
}
