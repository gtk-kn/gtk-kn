// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GFileAttributeType
import org.gtkkn.native.gio.GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_BOOLEAN
import org.gtkkn.native.gio.GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_BYTE_STRING
import org.gtkkn.native.gio.GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INT32
import org.gtkkn.native.gio.GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INT64
import org.gtkkn.native.gio.GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_INVALID
import org.gtkkn.native.gio.GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_OBJECT
import org.gtkkn.native.gio.GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_STRING
import org.gtkkn.native.gio.GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_STRINGV
import org.gtkkn.native.gio.GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_UINT32
import org.gtkkn.native.gio.GFileAttributeType.G_FILE_ATTRIBUTE_TYPE_UINT64

/**
 * The data types for file attributes.
 */
public enum class FileAttributeType(
    public val nativeValue: GFileAttributeType,
) {
    /**
     * indicates an invalid or uninitialized type.
     */
    INVALID(G_FILE_ATTRIBUTE_TYPE_INVALID),

    /**
     * a null terminated UTF8 string.
     */
    STRING(G_FILE_ATTRIBUTE_TYPE_STRING),

    /**
     * a zero terminated string of non-zero bytes.
     */
    BYTE_STRING(G_FILE_ATTRIBUTE_TYPE_BYTE_STRING),

    /**
     * a boolean value.
     */
    BOOLEAN(G_FILE_ATTRIBUTE_TYPE_BOOLEAN),

    /**
     * an unsigned 4-byte/32-bit integer.
     */
    UINT32(G_FILE_ATTRIBUTE_TYPE_UINT32),

    /**
     * a signed 4-byte/32-bit integer.
     */
    INT32(G_FILE_ATTRIBUTE_TYPE_INT32),

    /**
     * an unsigned 8-byte/64-bit integer.
     */
    UINT64(G_FILE_ATTRIBUTE_TYPE_UINT64),

    /**
     * a signed 8-byte/64-bit integer.
     */
    INT64(G_FILE_ATTRIBUTE_TYPE_INT64),

    /**
     * a #GObject.
     */
    OBJECT(G_FILE_ATTRIBUTE_TYPE_OBJECT),

    /**
     * a null terminated char **. Since 2.22
     */
    STRINGV(G_FILE_ATTRIBUTE_TYPE_STRINGV),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GFileAttributeType): FileAttributeType =
            when (nativeValue) {
                G_FILE_ATTRIBUTE_TYPE_INVALID -> INVALID
                G_FILE_ATTRIBUTE_TYPE_STRING -> STRING
                G_FILE_ATTRIBUTE_TYPE_BYTE_STRING -> BYTE_STRING
                G_FILE_ATTRIBUTE_TYPE_BOOLEAN -> BOOLEAN
                G_FILE_ATTRIBUTE_TYPE_UINT32 -> UINT32
                G_FILE_ATTRIBUTE_TYPE_INT32 -> INT32
                G_FILE_ATTRIBUTE_TYPE_UINT64 -> UINT64
                G_FILE_ATTRIBUTE_TYPE_INT64 -> INT64
                G_FILE_ATTRIBUTE_TYPE_OBJECT -> OBJECT
                G_FILE_ATTRIBUTE_TYPE_STRINGV -> STRINGV
                else -> error("invalid nativeValue")
            }
    }
}
