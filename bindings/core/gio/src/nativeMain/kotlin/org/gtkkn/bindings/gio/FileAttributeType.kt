// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GFileAttributeType
import org.gtkkn.native.gio.g_file_attribute_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * The data types for file attributes.
 */
public enum class FileAttributeType(public val nativeValue: GFileAttributeType) {
    /**
     * indicates an invalid or uninitialized type.
     */
    INVALID(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INVALID),

    /**
     * a null terminated UTF8 string.
     */
    STRING(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_STRING),

    /**
     * a zero terminated string of non-zero bytes.
     */
    BYTE_STRING(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_BYTE_STRING),

    /**
     * a boolean value.
     */
    BOOLEAN(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_BOOLEAN),

    /**
     * an unsigned 4-byte/32-bit integer.
     */
    UINT32(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_UINT32),

    /**
     * a signed 4-byte/32-bit integer.
     */
    INT32(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INT32),

    /**
     * an unsigned 8-byte/64-bit integer.
     */
    UINT64(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_UINT64),

    /**
     * a signed 8-byte/64-bit integer.
     */
    INT64(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INT64),

    /**
     * a #GObject.
     */
    OBJECT(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_OBJECT),

    /**
     * a null terminated char **. Since 2.22
     */
    STRINGV(GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_STRINGV),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GFileAttributeType): FileAttributeType = when (nativeValue) {
            GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INVALID -> INVALID
            GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_STRING -> STRING
            GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_BYTE_STRING -> BYTE_STRING
            GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_BOOLEAN -> BOOLEAN
            GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_UINT32 -> UINT32
            GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INT32 -> INT32
            GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_UINT64 -> UINT64
            GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INT64 -> INT64
            GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_OBJECT -> OBJECT
            GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_STRINGV -> STRINGV
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FileAttributeType
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_attribute_type_get_type()
    }
}
