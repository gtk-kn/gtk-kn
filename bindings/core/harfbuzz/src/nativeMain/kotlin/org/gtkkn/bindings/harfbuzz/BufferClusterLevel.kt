// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.native.harfbuzz.hb_buffer_cluster_level_t
import org.gtkkn.native.harfbuzz.hb_buffer_cluster_level_t.Companion.HB_BUFFER_CLUSTER_LEVEL_DEFAULT
import org.gtkkn.native.harfbuzz.hb_buffer_cluster_level_t.HB_BUFFER_CLUSTER_LEVEL_CHARACTERS
import org.gtkkn.native.harfbuzz.hb_buffer_cluster_level_t.HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS
import org.gtkkn.native.harfbuzz.hb_buffer_cluster_level_t.HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES

/**
 * Data type for holding HarfBuzz's clustering behavior options. The cluster level
 * dictates one aspect of how HarfBuzz will treat non-base characters
 * during shaping.
 *
 * In @HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES, non-base
 * characters are merged into the cluster of the base character that precedes them.
 *
 * In @HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS, non-base characters are initially
 * assigned their own cluster values, which are not merged into preceding base
 * clusters. This allows HarfBuzz to perform additional operations like reorder
 * sequences of adjacent marks.
 *
 * @HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES is the default, because it maintains
 * backward compatibility with older versions of HarfBuzz. New client programs that
 * do not need to maintain such backward compatibility are recommended to use
 * @HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS instead of the default.
 * @since 0.9.42
 */
public enum class BufferClusterLevel(
    public val nativeValue: hb_buffer_cluster_level_t,
) {
    /**
     * Return cluster values grouped by graphemes into
     *   monotone order.
     */
    MONOTONE_GRAPHEMES(HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES),

    /**
     * Return cluster values grouped into monotone order.
     */
    MONOTONE_CHARACTERS(HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS),

    /**
     * Don't group cluster values.
     */
    CHARACTERS(HB_BUFFER_CLUSTER_LEVEL_CHARACTERS),

    /**
     * Default cluster level,
     *   equal to @HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES.
     */
    DEFAULT(HB_BUFFER_CLUSTER_LEVEL_DEFAULT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: hb_buffer_cluster_level_t): BufferClusterLevel =
            when (nativeValue) {
                HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES -> MONOTONE_GRAPHEMES
                HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS -> MONOTONE_CHARACTERS
                HB_BUFFER_CLUSTER_LEVEL_CHARACTERS -> CHARACTERS
                HB_BUFFER_CLUSTER_LEVEL_DEFAULT -> DEFAULT
                else -> error("invalid nativeValue")
            }
    }
}
