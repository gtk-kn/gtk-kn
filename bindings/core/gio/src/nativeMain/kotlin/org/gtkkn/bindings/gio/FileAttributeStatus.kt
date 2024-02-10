// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GFileAttributeStatus
import org.gtkkn.native.gio.GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING
import org.gtkkn.native.gio.GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_SET
import org.gtkkn.native.gio.GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_UNSET

/**
 * Used by g_file_set_attributes_from_info() when setting file attributes.
 */
public enum class FileAttributeStatus(
    public val nativeValue: GFileAttributeStatus,
) {
    /**
     * Attribute value is unset (empty).
     */
    UNSET(G_FILE_ATTRIBUTE_STATUS_UNSET),

    /**
     * Attribute value is set.
     */
    SET(G_FILE_ATTRIBUTE_STATUS_SET),

    /**
     * Indicates an error in setting the value.
     */
    ERROR_SETTING(G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GFileAttributeStatus): FileAttributeStatus =
            when (nativeValue) {
                G_FILE_ATTRIBUTE_STATUS_UNSET -> UNSET
                G_FILE_ATTRIBUTE_STATUS_SET -> SET
                G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING -> ERROR_SETTING
                else -> error("invalid nativeValue")
            }
    }
}
