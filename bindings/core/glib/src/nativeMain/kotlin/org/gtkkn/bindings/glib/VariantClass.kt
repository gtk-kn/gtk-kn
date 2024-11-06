// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.bindings.glib.annotations.GLibVersion2_24
import org.gtkkn.native.glib.GVariantClass
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_ARRAY
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_BOOLEAN
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_BYTE
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_DICT_ENTRY
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_DOUBLE
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_HANDLE
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_INT16
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_INT32
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_INT64
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_MAYBE
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_OBJECT_PATH
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_SIGNATURE
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_STRING
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_TUPLE
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_UINT16
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_UINT32
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_UINT64
import org.gtkkn.native.glib.GVariantClass.G_VARIANT_CLASS_VARIANT

/**
 * The range of possible top-level types of #GVariant instances.
 * @since 2.24
 */
@GLibVersion2_24
public enum class VariantClass(
    public val nativeValue: GVariantClass,
) {
    /**
     * The #GVariant is a boolean.
     */
    BOOLEAN(G_VARIANT_CLASS_BOOLEAN),

    /**
     * The #GVariant is a byte.
     */
    BYTE(G_VARIANT_CLASS_BYTE),

    /**
     * The #GVariant is a signed 16 bit integer.
     */
    INT16(G_VARIANT_CLASS_INT16),

    /**
     * The #GVariant is an unsigned 16 bit integer.
     */
    UINT16(G_VARIANT_CLASS_UINT16),

    /**
     * The #GVariant is a signed 32 bit integer.
     */
    INT32(G_VARIANT_CLASS_INT32),

    /**
     * The #GVariant is an unsigned 32 bit integer.
     */
    UINT32(G_VARIANT_CLASS_UINT32),

    /**
     * The #GVariant is a signed 64 bit integer.
     */
    INT64(G_VARIANT_CLASS_INT64),

    /**
     * The #GVariant is an unsigned 64 bit integer.
     */
    UINT64(G_VARIANT_CLASS_UINT64),

    /**
     * The #GVariant is a file handle index.
     */
    HANDLE(G_VARIANT_CLASS_HANDLE),

    /**
     * The #GVariant is a double precision floating
     *                          point value.
     */
    DOUBLE(G_VARIANT_CLASS_DOUBLE),

    /**
     * The #GVariant is a normal string.
     */
    STRING(G_VARIANT_CLASS_STRING),

    /**
     * The #GVariant is a D-Bus object path
     *                               string.
     */
    OBJECT_PATH(G_VARIANT_CLASS_OBJECT_PATH),

    /**
     * The #GVariant is a D-Bus signature string.
     */
    SIGNATURE(G_VARIANT_CLASS_SIGNATURE),

    /**
     * The #GVariant is a variant.
     */
    VARIANT(G_VARIANT_CLASS_VARIANT),

    /**
     * The #GVariant is a maybe-typed value.
     */
    MAYBE(G_VARIANT_CLASS_MAYBE),

    /**
     * The #GVariant is an array.
     */
    ARRAY(G_VARIANT_CLASS_ARRAY),

    /**
     * The #GVariant is a tuple.
     */
    TUPLE(G_VARIANT_CLASS_TUPLE),

    /**
     * The #GVariant is a dictionary entry.
     */
    DICT_ENTRY(G_VARIANT_CLASS_DICT_ENTRY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GVariantClass): VariantClass =
            when (nativeValue) {
                G_VARIANT_CLASS_BOOLEAN -> BOOLEAN
                G_VARIANT_CLASS_BYTE -> BYTE
                G_VARIANT_CLASS_INT16 -> INT16
                G_VARIANT_CLASS_UINT16 -> UINT16
                G_VARIANT_CLASS_INT32 -> INT32
                G_VARIANT_CLASS_UINT32 -> UINT32
                G_VARIANT_CLASS_INT64 -> INT64
                G_VARIANT_CLASS_UINT64 -> UINT64
                G_VARIANT_CLASS_HANDLE -> HANDLE
                G_VARIANT_CLASS_DOUBLE -> DOUBLE
                G_VARIANT_CLASS_STRING -> STRING
                G_VARIANT_CLASS_OBJECT_PATH -> OBJECT_PATH
                G_VARIANT_CLASS_SIGNATURE -> SIGNATURE
                G_VARIANT_CLASS_VARIANT -> VARIANT
                G_VARIANT_CLASS_MAYBE -> MAYBE
                G_VARIANT_CLASS_ARRAY -> ARRAY
                G_VARIANT_CLASS_TUPLE -> TUPLE
                G_VARIANT_CLASS_DICT_ENTRY -> DICT_ENTRY
                else -> error("invalid nativeValue")
            }
    }
}
