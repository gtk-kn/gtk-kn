// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_8
import org.gtkkn.native.gtk.GtkContentFit

/**
 * Controls how a content should be made to fit inside an allocation.
 * @since 4.8
 */
@GtkVersion4_8
public enum class ContentFit(
    public val nativeValue: GtkContentFit,
) {
    /**
     * Make the content fill the entire allocation,
     *   without taking its aspect ratio in consideration. The resulting
     *   content will appear as stretched if its aspect ratio is different
     *   from the allocation aspect ratio.
     */
    FILL(GtkContentFit.GTK_CONTENT_FIT_FILL),

    /**
     * Scale the content to fit the allocation,
     *   while taking its aspect ratio in consideration. The resulting
     *   content will appear as letterboxed if its aspect ratio is different
     *   from the allocation aspect ratio.
     */
    CONTAIN(GtkContentFit.GTK_CONTENT_FIT_CONTAIN),

    /**
     * Cover the entire allocation, while taking
     *   the content aspect ratio in consideration. The resulting content
     *   will appear as clipped if its aspect ratio is different from the
     *   allocation aspect ratio.
     */
    COVER(GtkContentFit.GTK_CONTENT_FIT_COVER),

    /**
     * The content is scaled down to fit the
     *   allocation, if needed, otherwise its original size is used.
     */
    SCALE_DOWN(GtkContentFit.GTK_CONTENT_FIT_SCALE_DOWN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkContentFit): ContentFit =
            when (nativeValue) {
                GtkContentFit.GTK_CONTENT_FIT_FILL -> FILL
                GtkContentFit.GTK_CONTENT_FIT_CONTAIN -> CONTAIN
                GtkContentFit.GTK_CONTENT_FIT_COVER -> COVER
                GtkContentFit.GTK_CONTENT_FIT_SCALE_DOWN -> SCALE_DOWN
                else -> error("invalid nativeValue")
            }
    }
}
