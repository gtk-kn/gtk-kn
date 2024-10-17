// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import org.gtkkn.native.he.HeContentBlockImageClusterImagePosition
import org.gtkkn.native.he.HeContentBlockImageClusterImagePosition.HE_CONTENT_BLOCK_IMAGE_CLUSTER_IMAGE_POSITION_BOTTOM_LEFT
import org.gtkkn.native.he.HeContentBlockImageClusterImagePosition.HE_CONTENT_BLOCK_IMAGE_CLUSTER_IMAGE_POSITION_BOTTOM_RIGHT
import org.gtkkn.native.he.HeContentBlockImageClusterImagePosition.HE_CONTENT_BLOCK_IMAGE_CLUSTER_IMAGE_POSITION_TOP_LEFT
import org.gtkkn.native.he.HeContentBlockImageClusterImagePosition.HE_CONTENT_BLOCK_IMAGE_CLUSTER_IMAGE_POSITION_TOP_RIGHT

public enum class ContentBlockImageClusterImagePosition(
    public val nativeValue: HeContentBlockImageClusterImagePosition,
) {
    TOP_LEFT(HE_CONTENT_BLOCK_IMAGE_CLUSTER_IMAGE_POSITION_TOP_LEFT),
    BOTTOM_LEFT(HE_CONTENT_BLOCK_IMAGE_CLUSTER_IMAGE_POSITION_BOTTOM_LEFT),
    TOP_RIGHT(HE_CONTENT_BLOCK_IMAGE_CLUSTER_IMAGE_POSITION_TOP_RIGHT),
    BOTTOM_RIGHT(HE_CONTENT_BLOCK_IMAGE_CLUSTER_IMAGE_POSITION_BOTTOM_RIGHT),
    ;

    public companion object {
        public fun fromNativeValue(
            nativeValue: HeContentBlockImageClusterImagePosition,
        ): ContentBlockImageClusterImagePosition =
            when (nativeValue) {
                HE_CONTENT_BLOCK_IMAGE_CLUSTER_IMAGE_POSITION_TOP_LEFT -> TOP_LEFT
                HE_CONTENT_BLOCK_IMAGE_CLUSTER_IMAGE_POSITION_BOTTOM_LEFT -> BOTTOM_LEFT
                HE_CONTENT_BLOCK_IMAGE_CLUSTER_IMAGE_POSITION_TOP_RIGHT -> TOP_RIGHT
                HE_CONTENT_BLOCK_IMAGE_CLUSTER_IMAGE_POSITION_BOTTOM_RIGHT -> BOTTOM_RIGHT
                else -> error("invalid nativeValue")
            }
    }
}
