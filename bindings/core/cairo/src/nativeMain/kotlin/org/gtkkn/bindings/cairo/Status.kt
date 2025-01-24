// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.CAIRO_STATUS_CLIP_NOT_REPRESENTABLE
import org.gtkkn.native.cairo.CAIRO_STATUS_DEVICE_ERROR
import org.gtkkn.native.cairo.CAIRO_STATUS_DEVICE_FINISHED
import org.gtkkn.native.cairo.CAIRO_STATUS_DEVICE_TYPE_MISMATCH
import org.gtkkn.native.cairo.CAIRO_STATUS_DWRITE_ERROR
import org.gtkkn.native.cairo.CAIRO_STATUS_FILE_NOT_FOUND
import org.gtkkn.native.cairo.CAIRO_STATUS_FONT_TYPE_MISMATCH
import org.gtkkn.native.cairo.CAIRO_STATUS_FREETYPE_ERROR
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_CLUSTERS
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_CONTENT
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_DASH
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_DSC_COMMENT
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_FORMAT
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_INDEX
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_MATRIX
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_MESH_CONSTRUCTION
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_PATH_DATA
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_POP_GROUP
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_RESTORE
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_SIZE
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_SLANT
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_STATUS
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_STRIDE
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_STRING
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_VISUAL
import org.gtkkn.native.cairo.CAIRO_STATUS_INVALID_WEIGHT
import org.gtkkn.native.cairo.CAIRO_STATUS_JBIG2_GLOBAL_MISSING
import org.gtkkn.native.cairo.CAIRO_STATUS_LAST_STATUS
import org.gtkkn.native.cairo.CAIRO_STATUS_NEGATIVE_COUNT
import org.gtkkn.native.cairo.CAIRO_STATUS_NO_CURRENT_POINT
import org.gtkkn.native.cairo.CAIRO_STATUS_NO_MEMORY
import org.gtkkn.native.cairo.CAIRO_STATUS_NULL_POINTER
import org.gtkkn.native.cairo.CAIRO_STATUS_PATTERN_TYPE_MISMATCH
import org.gtkkn.native.cairo.CAIRO_STATUS_PNG_ERROR
import org.gtkkn.native.cairo.CAIRO_STATUS_READ_ERROR
import org.gtkkn.native.cairo.CAIRO_STATUS_SUCCESS
import org.gtkkn.native.cairo.CAIRO_STATUS_SURFACE_FINISHED
import org.gtkkn.native.cairo.CAIRO_STATUS_SURFACE_TYPE_MISMATCH
import org.gtkkn.native.cairo.CAIRO_STATUS_SVG_FONT_ERROR
import org.gtkkn.native.cairo.CAIRO_STATUS_TAG_ERROR
import org.gtkkn.native.cairo.CAIRO_STATUS_TEMP_FILE_ERROR
import org.gtkkn.native.cairo.CAIRO_STATUS_USER_FONT_ERROR
import org.gtkkn.native.cairo.CAIRO_STATUS_USER_FONT_IMMUTABLE
import org.gtkkn.native.cairo.CAIRO_STATUS_USER_FONT_NOT_IMPLEMENTED
import org.gtkkn.native.cairo.CAIRO_STATUS_WIN32_GDI_ERROR
import org.gtkkn.native.cairo.CAIRO_STATUS_WRITE_ERROR
import org.gtkkn.native.cairo.cairo_gobject_status_get_type
import org.gtkkn.native.cairo.cairo_status_t
import org.gtkkn.native.gobject.GType

public enum class Status(public val nativeValue: cairo_status_t) {
    SUCCESS(CAIRO_STATUS_SUCCESS),
    NO_MEMORY(CAIRO_STATUS_NO_MEMORY),
    INVALID_RESTORE(CAIRO_STATUS_INVALID_RESTORE),
    INVALID_POP_GROUP(CAIRO_STATUS_INVALID_POP_GROUP),
    NO_CURRENT_POINT(CAIRO_STATUS_NO_CURRENT_POINT),
    INVALID_MATRIX(CAIRO_STATUS_INVALID_MATRIX),
    INVALID_STATUS(CAIRO_STATUS_INVALID_STATUS),
    NULL_POINTER(CAIRO_STATUS_NULL_POINTER),
    INVALID_STRING(CAIRO_STATUS_INVALID_STRING),
    INVALID_PATH_DATA(CAIRO_STATUS_INVALID_PATH_DATA),
    READ_ERROR(CAIRO_STATUS_READ_ERROR),
    WRITE_ERROR(CAIRO_STATUS_WRITE_ERROR),
    SURFACE_FINISHED(CAIRO_STATUS_SURFACE_FINISHED),
    SURFACE_TYPE_MISMATCH(CAIRO_STATUS_SURFACE_TYPE_MISMATCH),
    PATTERN_TYPE_MISMATCH(CAIRO_STATUS_PATTERN_TYPE_MISMATCH),
    INVALID_CONTENT(CAIRO_STATUS_INVALID_CONTENT),
    INVALID_FORMAT(CAIRO_STATUS_INVALID_FORMAT),
    INVALID_VISUAL(CAIRO_STATUS_INVALID_VISUAL),
    FILE_NOT_FOUND(CAIRO_STATUS_FILE_NOT_FOUND),
    INVALID_DASH(CAIRO_STATUS_INVALID_DASH),

    /**
     *
     * @since 1.2
     */
    INVALID_DSC_COMMENT(CAIRO_STATUS_INVALID_DSC_COMMENT),

    /**
     *
     * @since 1.4
     */
    INVALID_INDEX(CAIRO_STATUS_INVALID_INDEX),

    /**
     *
     * @since 1.4
     */
    CLIP_NOT_REPRESENTABLE(CAIRO_STATUS_CLIP_NOT_REPRESENTABLE),

    /**
     *
     * @since 1.6
     */
    TEMP_FILE_ERROR(CAIRO_STATUS_TEMP_FILE_ERROR),

    /**
     *
     * @since 1.6
     */
    INVALID_STRIDE(CAIRO_STATUS_INVALID_STRIDE),

    /**
     *
     * @since 1.8
     */
    FONT_TYPE_MISMATCH(CAIRO_STATUS_FONT_TYPE_MISMATCH),

    /**
     *
     * @since 1.8
     */
    USER_FONT_IMMUTABLE(CAIRO_STATUS_USER_FONT_IMMUTABLE),

    /**
     *
     * @since 1.8
     */
    USER_FONT_ERROR(CAIRO_STATUS_USER_FONT_ERROR),

    /**
     *
     * @since 1.8
     */
    NEGATIVE_COUNT(CAIRO_STATUS_NEGATIVE_COUNT),

    /**
     *
     * @since 1.8
     */
    INVALID_CLUSTERS(CAIRO_STATUS_INVALID_CLUSTERS),

    /**
     *
     * @since 1.8
     */
    INVALID_SLANT(CAIRO_STATUS_INVALID_SLANT),

    /**
     *
     * @since 1.8
     */
    INVALID_WEIGHT(CAIRO_STATUS_INVALID_WEIGHT),

    /**
     *
     * @since 1.10
     */
    INVALID_SIZE(CAIRO_STATUS_INVALID_SIZE),

    /**
     *
     * @since 1.10
     */
    USER_FONT_NOT_IMPLEMENTED(CAIRO_STATUS_USER_FONT_NOT_IMPLEMENTED),

    /**
     *
     * @since 1.10
     */
    DEVICE_TYPE_MISMATCH(CAIRO_STATUS_DEVICE_TYPE_MISMATCH),

    /**
     *
     * @since 1.10
     */
    DEVICE_ERROR(CAIRO_STATUS_DEVICE_ERROR),

    /**
     *
     * @since 1.12
     */
    INVALID_MESH_CONSTRUCTION(CAIRO_STATUS_INVALID_MESH_CONSTRUCTION),

    /**
     *
     * @since 1.12
     */
    DEVICE_FINISHED(CAIRO_STATUS_DEVICE_FINISHED),

    /**
     *
     * @since 1.14
     */
    JBIG2_GLOBAL_MISSING(CAIRO_STATUS_JBIG2_GLOBAL_MISSING),

    /**
     *
     * @since 1.16
     */
    PNG_ERROR(CAIRO_STATUS_PNG_ERROR),

    /**
     *
     * @since 1.16
     */
    FREETYPE_ERROR(CAIRO_STATUS_FREETYPE_ERROR),

    /**
     *
     * @since 1.16
     */
    WIN32_GDI_ERROR(CAIRO_STATUS_WIN32_GDI_ERROR),

    /**
     *
     * @since 1.16
     */
    TAG_ERROR(CAIRO_STATUS_TAG_ERROR),

    /**
     *
     * @since 1.18
     */
    DWRITE_ERROR(CAIRO_STATUS_DWRITE_ERROR),

    /**
     *
     * @since 1.18
     */
    SVG_FONT_ERROR(CAIRO_STATUS_SVG_FONT_ERROR),

    /**
     *
     * @since 1.10
     */
    LAST_STATUS(CAIRO_STATUS_LAST_STATUS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_status_t): Status = when (nativeValue) {
            CAIRO_STATUS_SUCCESS -> SUCCESS
            CAIRO_STATUS_NO_MEMORY -> NO_MEMORY
            CAIRO_STATUS_INVALID_RESTORE -> INVALID_RESTORE
            CAIRO_STATUS_INVALID_POP_GROUP -> INVALID_POP_GROUP
            CAIRO_STATUS_NO_CURRENT_POINT -> NO_CURRENT_POINT
            CAIRO_STATUS_INVALID_MATRIX -> INVALID_MATRIX
            CAIRO_STATUS_INVALID_STATUS -> INVALID_STATUS
            CAIRO_STATUS_NULL_POINTER -> NULL_POINTER
            CAIRO_STATUS_INVALID_STRING -> INVALID_STRING
            CAIRO_STATUS_INVALID_PATH_DATA -> INVALID_PATH_DATA
            CAIRO_STATUS_READ_ERROR -> READ_ERROR
            CAIRO_STATUS_WRITE_ERROR -> WRITE_ERROR
            CAIRO_STATUS_SURFACE_FINISHED -> SURFACE_FINISHED
            CAIRO_STATUS_SURFACE_TYPE_MISMATCH -> SURFACE_TYPE_MISMATCH
            CAIRO_STATUS_PATTERN_TYPE_MISMATCH -> PATTERN_TYPE_MISMATCH
            CAIRO_STATUS_INVALID_CONTENT -> INVALID_CONTENT
            CAIRO_STATUS_INVALID_FORMAT -> INVALID_FORMAT
            CAIRO_STATUS_INVALID_VISUAL -> INVALID_VISUAL
            CAIRO_STATUS_FILE_NOT_FOUND -> FILE_NOT_FOUND
            CAIRO_STATUS_INVALID_DASH -> INVALID_DASH
            CAIRO_STATUS_INVALID_DSC_COMMENT -> INVALID_DSC_COMMENT
            CAIRO_STATUS_INVALID_INDEX -> INVALID_INDEX
            CAIRO_STATUS_CLIP_NOT_REPRESENTABLE -> CLIP_NOT_REPRESENTABLE
            CAIRO_STATUS_TEMP_FILE_ERROR -> TEMP_FILE_ERROR
            CAIRO_STATUS_INVALID_STRIDE -> INVALID_STRIDE
            CAIRO_STATUS_FONT_TYPE_MISMATCH -> FONT_TYPE_MISMATCH
            CAIRO_STATUS_USER_FONT_IMMUTABLE -> USER_FONT_IMMUTABLE
            CAIRO_STATUS_USER_FONT_ERROR -> USER_FONT_ERROR
            CAIRO_STATUS_NEGATIVE_COUNT -> NEGATIVE_COUNT
            CAIRO_STATUS_INVALID_CLUSTERS -> INVALID_CLUSTERS
            CAIRO_STATUS_INVALID_SLANT -> INVALID_SLANT
            CAIRO_STATUS_INVALID_WEIGHT -> INVALID_WEIGHT
            CAIRO_STATUS_INVALID_SIZE -> INVALID_SIZE
            CAIRO_STATUS_USER_FONT_NOT_IMPLEMENTED -> USER_FONT_NOT_IMPLEMENTED
            CAIRO_STATUS_DEVICE_TYPE_MISMATCH -> DEVICE_TYPE_MISMATCH
            CAIRO_STATUS_DEVICE_ERROR -> DEVICE_ERROR
            CAIRO_STATUS_INVALID_MESH_CONSTRUCTION -> INVALID_MESH_CONSTRUCTION
            CAIRO_STATUS_DEVICE_FINISHED -> DEVICE_FINISHED
            CAIRO_STATUS_JBIG2_GLOBAL_MISSING -> JBIG2_GLOBAL_MISSING
            CAIRO_STATUS_PNG_ERROR -> PNG_ERROR
            CAIRO_STATUS_FREETYPE_ERROR -> FREETYPE_ERROR
            CAIRO_STATUS_WIN32_GDI_ERROR -> WIN32_GDI_ERROR
            CAIRO_STATUS_TAG_ERROR -> TAG_ERROR
            CAIRO_STATUS_DWRITE_ERROR -> DWRITE_ERROR
            CAIRO_STATUS_SVG_FONT_ERROR -> SVG_FONT_ERROR
            CAIRO_STATUS_LAST_STATUS -> LAST_STATUS
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Status
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_status_get_type()
    }
}
