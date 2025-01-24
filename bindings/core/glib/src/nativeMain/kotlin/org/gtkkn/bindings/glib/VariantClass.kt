// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.bindings.glib.annotations.GLibVersion2_24
import org.gtkkn.native.glib.GVariantClass

/**
 * The range of possible top-level types of #GVariant instances.
 * @since 2.24
 */
@GLibVersion2_24
public enum class VariantClass(public val nativeValue: GVariantClass) {
    /**
     * The #GVariant is a boolean.
     */
    BOOLEAN(GVariantClass.G_VARIANT_CLASS_BOOLEAN),

    /**
     * The #GVariant is a byte.
     */
    BYTE(GVariantClass.G_VARIANT_CLASS_BYTE),

    /**
     * The #GVariant is a signed 16 bit integer.
     */
    INT16(GVariantClass.G_VARIANT_CLASS_INT16),

    /**
     * The #GVariant is an unsigned 16 bit integer.
     */
    UINT16(GVariantClass.G_VARIANT_CLASS_UINT16),

    /**
     * The #GVariant is a signed 32 bit integer.
     */
    INT32(GVariantClass.G_VARIANT_CLASS_INT32),

    /**
     * The #GVariant is an unsigned 32 bit integer.
     */
    UINT32(GVariantClass.G_VARIANT_CLASS_UINT32),

    /**
     * The #GVariant is a signed 64 bit integer.
     */
    INT64(GVariantClass.G_VARIANT_CLASS_INT64),

    /**
     * The #GVariant is an unsigned 64 bit integer.
     */
    UINT64(GVariantClass.G_VARIANT_CLASS_UINT64),

    /**
     * The #GVariant is a file handle index.
     */
    HANDLE(GVariantClass.G_VARIANT_CLASS_HANDLE),

    /**
     * The #GVariant is a double precision floating
     *                          point value.
     */
    DOUBLE(GVariantClass.G_VARIANT_CLASS_DOUBLE),

    /**
     * The #GVariant is a normal string.
     */
    STRING(GVariantClass.G_VARIANT_CLASS_STRING),

    /**
     * The #GVariant is a D-Bus object path
     *                               string.
     */
    OBJECT_PATH(GVariantClass.G_VARIANT_CLASS_OBJECT_PATH),

    /**
     * The #GVariant is a D-Bus signature string.
     */
    SIGNATURE(GVariantClass.G_VARIANT_CLASS_SIGNATURE),

    /**
     * The #GVariant is a variant.
     */
    VARIANT(GVariantClass.G_VARIANT_CLASS_VARIANT),

    /**
     * The #GVariant is a maybe-typed value.
     */
    MAYBE(GVariantClass.G_VARIANT_CLASS_MAYBE),

    /**
     * The #GVariant is an array.
     */
    ARRAY(GVariantClass.G_VARIANT_CLASS_ARRAY),

    /**
     * The #GVariant is a tuple.
     */
    TUPLE(GVariantClass.G_VARIANT_CLASS_TUPLE),

    /**
     * The #GVariant is a dictionary entry.
     */
    DICT_ENTRY(GVariantClass.G_VARIANT_CLASS_DICT_ENTRY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GVariantClass): VariantClass = when (nativeValue) {
            GVariantClass.G_VARIANT_CLASS_BOOLEAN -> BOOLEAN
            GVariantClass.G_VARIANT_CLASS_BYTE -> BYTE
            GVariantClass.G_VARIANT_CLASS_INT16 -> INT16
            GVariantClass.G_VARIANT_CLASS_UINT16 -> UINT16
            GVariantClass.G_VARIANT_CLASS_INT32 -> INT32
            GVariantClass.G_VARIANT_CLASS_UINT32 -> UINT32
            GVariantClass.G_VARIANT_CLASS_INT64 -> INT64
            GVariantClass.G_VARIANT_CLASS_UINT64 -> UINT64
            GVariantClass.G_VARIANT_CLASS_HANDLE -> HANDLE
            GVariantClass.G_VARIANT_CLASS_DOUBLE -> DOUBLE
            GVariantClass.G_VARIANT_CLASS_STRING -> STRING
            GVariantClass.G_VARIANT_CLASS_OBJECT_PATH -> OBJECT_PATH
            GVariantClass.G_VARIANT_CLASS_SIGNATURE -> SIGNATURE
            GVariantClass.G_VARIANT_CLASS_VARIANT -> VARIANT
            GVariantClass.G_VARIANT_CLASS_MAYBE -> MAYBE
            GVariantClass.G_VARIANT_CLASS_ARRAY -> ARRAY
            GVariantClass.G_VARIANT_CLASS_TUPLE -> TUPLE
            GVariantClass.G_VARIANT_CLASS_DICT_ENTRY -> DICT_ENTRY
            else -> error("invalid nativeValue")
        }
    }
}
