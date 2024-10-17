// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkMemoryFormat
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_A16
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_A16_FLOAT
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_A32_FLOAT
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_A8
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_A8B8G8R8
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_A8B8G8R8_PREMULTIPLIED
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_A8R8G8B8
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_A8R8G8B8_PREMULTIPLIED
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_B8G8R8
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_B8G8R8A8
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_B8G8R8A8_PREMULTIPLIED
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_B8G8R8X8
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_G16
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_G16A16
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_G16A16_PREMULTIPLIED
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_G8
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_G8A8
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_G8A8_PREMULTIPLIED
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_N_FORMATS
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_R16G16B16
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_R16G16B16A16
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_R16G16B16A16_FLOAT
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_R16G16B16A16_FLOAT_PREMULTIPLIED
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_R16G16B16A16_PREMULTIPLIED
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_R16G16B16_FLOAT
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_R32G32B32A32_FLOAT
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_R32G32B32A32_FLOAT_PREMULTIPLIED
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_R32G32B32_FLOAT
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_R8G8B8
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_R8G8B8A8
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_R8G8B8A8_PREMULTIPLIED
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_R8G8B8X8
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_X8B8G8R8
import org.gtkkn.native.gdk.GdkMemoryFormat.GDK_MEMORY_X8R8G8B8

/**
 * `GdkMemoryFormat` describes formats that image data can have in memory.
 *
 * It describes formats by listing the contents of the memory passed to it.
 * So `GDK_MEMORY_A8R8G8B8` will be 1 byte (8 bits) of alpha, followed by a
 * byte each of red, green and blue. It is not endian-dependent, so
 * `CAIRO_FORMAT_ARGB32` is represented by different `GdkMemoryFormats`
 * on architectures with different endiannesses.
 *
 * Its naming is modelled after
 * [VkFormat](https://www.khronos.org/registry/vulkan/specs/1.0/html/vkspec.html#VkFormat)
 * for details).
 */
public enum class MemoryFormat(
    public val nativeValue: GdkMemoryFormat,
) {
    /**
     * 4 bytes; for blue, green, red, alpha.
     *   The color values are premultiplied with the alpha value.
     */
    B8G8R8A8_PREMULTIPLIED(GDK_MEMORY_B8G8R8A8_PREMULTIPLIED),

    /**
     * 4 bytes; for alpha, red, green, blue.
     *   The color values are premultiplied with the alpha value.
     */
    A8R8G8B8_PREMULTIPLIED(GDK_MEMORY_A8R8G8B8_PREMULTIPLIED),

    /**
     * 4 bytes; for red, green, blue, alpha
     *   The color values are premultiplied with the alpha value.
     */
    R8G8B8A8_PREMULTIPLIED(GDK_MEMORY_R8G8B8A8_PREMULTIPLIED),

    /**
     * 4 bytes; for blue, green, red, alpha.
     */
    B8G8R8A8(GDK_MEMORY_B8G8R8A8),

    /**
     * 4 bytes; for alpha, red, green, blue.
     */
    A8R8G8B8(GDK_MEMORY_A8R8G8B8),

    /**
     * 4 bytes; for red, green, blue, alpha.
     */
    R8G8B8A8(GDK_MEMORY_R8G8B8A8),

    /**
     * 4 bytes; for alpha, blue, green, red.
     */
    A8B8G8R8(GDK_MEMORY_A8B8G8R8),

    /**
     * 3 bytes; for red, green, blue. The data is opaque.
     */
    R8G8B8(GDK_MEMORY_R8G8B8),

    /**
     * 3 bytes; for blue, green, red. The data is opaque.
     */
    B8G8R8(GDK_MEMORY_B8G8R8),

    /**
     * 3 guint16 values; for red, green, blue.
     * @since 4.6
     */
    R16G16B16(GDK_MEMORY_R16G16B16),

    /**
     * 4 guint16 values; for red, green, blue, alpha. The color values are
     * premultiplied with the alpha value.
     * @since 4.6
     */
    R16G16B16A16_PREMULTIPLIED(GDK_MEMORY_R16G16B16A16_PREMULTIPLIED),

    /**
     * 4 guint16 values; for red, green, blue, alpha.
     * @since 4.6
     */
    R16G16B16A16(GDK_MEMORY_R16G16B16A16),

    /**
     * 3 half-float values; for red, green, blue. The data is opaque.
     * @since 4.6
     */
    R16G16B16_FLOAT(GDK_MEMORY_R16G16B16_FLOAT),

    /**
     * 4 half-float values; for red, green, blue and alpha. The color values are
     * premultiplied with the alpha value.
     * @since 4.6
     */
    R16G16B16A16_FLOAT_PREMULTIPLIED(GDK_MEMORY_R16G16B16A16_FLOAT_PREMULTIPLIED),

    /**
     * 4 half-float values; for red, green, blue and alpha.
     * @since 4.6
     */
    R16G16B16A16_FLOAT(GDK_MEMORY_R16G16B16A16_FLOAT),

    /**
     * 3 float values; for red, green, blue.
     */
    R32G32B32_FLOAT(GDK_MEMORY_R32G32B32_FLOAT),

    /**
     * 4 float values; for red, green, blue and alpha. The color values are
     * premultiplied with the alpha value.
     * @since 4.6
     */
    R32G32B32A32_FLOAT_PREMULTIPLIED(GDK_MEMORY_R32G32B32A32_FLOAT_PREMULTIPLIED),

    /**
     * 4 float values; for red, green, blue and alpha.
     * @since 4.6
     */
    R32G32B32A32_FLOAT(GDK_MEMORY_R32G32B32A32_FLOAT),

    /**
     * 2 bytes; for grayscale, alpha. The color values are premultiplied with the
     * alpha value.
     * @since 4.12
     */
    G8A8_PREMULTIPLIED(GDK_MEMORY_G8A8_PREMULTIPLIED),

    /**
     * 2 bytes; for grayscale, alpha.
     * @since 4.12
     */
    G8A8(GDK_MEMORY_G8A8),

    /**
     * One byte; for grayscale. The data is opaque.
     * @since 4.12
     */
    G8(GDK_MEMORY_G8),

    /**
     * 2 guint16 values; for grayscale, alpha. The color values are premultiplied
     * with the alpha value.
     * @since 4.12
     */
    G16A16_PREMULTIPLIED(GDK_MEMORY_G16A16_PREMULTIPLIED),

    /**
     * 2 guint16 values; for grayscale, alpha.
     * @since 4.12
     */
    G16A16(GDK_MEMORY_G16A16),

    /**
     * One guint16 value; for grayscale. The data is opaque.
     * @since 4.12
     */
    G16(GDK_MEMORY_G16),

    /**
     * One byte; for alpha.
     * @since 4.12
     */
    A8(GDK_MEMORY_A8),

    /**
     * One guint16 value; for alpha.
     * @since 4.12
     */
    A16(GDK_MEMORY_A16),

    /**
     * One half-float value; for alpha.
     * @since 4.12
     */
    A16_FLOAT(GDK_MEMORY_A16_FLOAT),

    /**
     * One float value; for alpha.
     * @since 4.12
     */
    A32_FLOAT(GDK_MEMORY_A32_FLOAT),

    /**
     * 4 bytes; for alpha, blue, green, red, The color values are premultiplied with
     * the alpha value.
     * @since 4.14
     */
    A8B8G8R8_PREMULTIPLIED(GDK_MEMORY_A8B8G8R8_PREMULTIPLIED),

    /**
     * 4 bytes; for blue, green, red, unused.
     * @since 4.14
     */
    B8G8R8X8(GDK_MEMORY_B8G8R8X8),

    /**
     * 4 bytes; for unused, red, green, blue.
     * @since 4.14
     */
    X8R8G8B8(GDK_MEMORY_X8R8G8B8),

    /**
     * 4 bytes; for red, green, blue, unused.
     * @since 4.14
     */
    R8G8B8X8(GDK_MEMORY_R8G8B8X8),

    /**
     * 4 bytes; for unused, blue, green, red.
     * @since 4.14
     */
    X8B8G8R8(GDK_MEMORY_X8B8G8R8),

    /**
     * The number of formats. This value will change as
     *   more formats get added, so do not rely on its concrete integer.
     */
    N_FORMATS(GDK_MEMORY_N_FORMATS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkMemoryFormat): MemoryFormat =
            when (nativeValue) {
                GDK_MEMORY_B8G8R8A8_PREMULTIPLIED -> B8G8R8A8_PREMULTIPLIED
                GDK_MEMORY_A8R8G8B8_PREMULTIPLIED -> A8R8G8B8_PREMULTIPLIED
                GDK_MEMORY_R8G8B8A8_PREMULTIPLIED -> R8G8B8A8_PREMULTIPLIED
                GDK_MEMORY_B8G8R8A8 -> B8G8R8A8
                GDK_MEMORY_A8R8G8B8 -> A8R8G8B8
                GDK_MEMORY_R8G8B8A8 -> R8G8B8A8
                GDK_MEMORY_A8B8G8R8 -> A8B8G8R8
                GDK_MEMORY_R8G8B8 -> R8G8B8
                GDK_MEMORY_B8G8R8 -> B8G8R8
                GDK_MEMORY_R16G16B16 -> R16G16B16
                GDK_MEMORY_R16G16B16A16_PREMULTIPLIED -> R16G16B16A16_PREMULTIPLIED
                GDK_MEMORY_R16G16B16A16 -> R16G16B16A16
                GDK_MEMORY_R16G16B16_FLOAT -> R16G16B16_FLOAT
                GDK_MEMORY_R16G16B16A16_FLOAT_PREMULTIPLIED -> R16G16B16A16_FLOAT_PREMULTIPLIED
                GDK_MEMORY_R16G16B16A16_FLOAT -> R16G16B16A16_FLOAT
                GDK_MEMORY_R32G32B32_FLOAT -> R32G32B32_FLOAT
                GDK_MEMORY_R32G32B32A32_FLOAT_PREMULTIPLIED -> R32G32B32A32_FLOAT_PREMULTIPLIED
                GDK_MEMORY_R32G32B32A32_FLOAT -> R32G32B32A32_FLOAT
                GDK_MEMORY_G8A8_PREMULTIPLIED -> G8A8_PREMULTIPLIED
                GDK_MEMORY_G8A8 -> G8A8
                GDK_MEMORY_G8 -> G8
                GDK_MEMORY_G16A16_PREMULTIPLIED -> G16A16_PREMULTIPLIED
                GDK_MEMORY_G16A16 -> G16A16
                GDK_MEMORY_G16 -> G16
                GDK_MEMORY_A8 -> A8
                GDK_MEMORY_A16 -> A16
                GDK_MEMORY_A16_FLOAT -> A16_FLOAT
                GDK_MEMORY_A32_FLOAT -> A32_FLOAT
                GDK_MEMORY_A8B8G8R8_PREMULTIPLIED -> A8B8G8R8_PREMULTIPLIED
                GDK_MEMORY_B8G8R8X8 -> B8G8R8X8
                GDK_MEMORY_X8R8G8B8 -> X8R8G8B8
                GDK_MEMORY_R8G8B8X8 -> R8G8B8X8
                GDK_MEMORY_X8B8G8R8 -> X8B8G8R8
                GDK_MEMORY_N_FORMATS -> N_FORMATS
                else -> error("invalid nativeValue")
            }
    }
}
