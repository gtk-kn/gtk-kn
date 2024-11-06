// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_8
import org.gtkkn.native.gtk.GtkContentFit
import org.gtkkn.native.gtk.GtkContentFit.GTK_CONTENT_FIT_CONTAIN
import org.gtkkn.native.gtk.GtkContentFit.GTK_CONTENT_FIT_COVER
import org.gtkkn.native.gtk.GtkContentFit.GTK_CONTENT_FIT_FILL
import org.gtkkn.native.gtk.GtkContentFit.GTK_CONTENT_FIT_SCALE_DOWN

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
    FILL(GTK_CONTENT_FIT_FILL),

    /**
     * Scale the content to fit the allocation,
     *   while taking its aspect ratio in consideration. The resulting
     *   content will appear as letterboxed if its aspect ratio is different
     *   from the allocation aspect ratio.
     */
    CONTAIN(GTK_CONTENT_FIT_CONTAIN),

    /**
     * Cover the entire allocation, while taking
     *   the content aspect ratio in consideration. The resulting content
     *   will appear as clipped if its aspect ratio is different from the
     *   allocation aspect ratio.
     */
    COVER(GTK_CONTENT_FIT_COVER),

    /**
     * The content is scaled down to fit the
     *   allocation, if needed, otherwise its original size is used.
     */
    SCALE_DOWN(GTK_CONTENT_FIT_SCALE_DOWN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkContentFit): ContentFit =
            when (nativeValue) {
                GTK_CONTENT_FIT_FILL -> FILL
                GTK_CONTENT_FIT_CONTAIN -> CONTAIN
                GTK_CONTENT_FIT_COVER -> COVER
                GTK_CONTENT_FIT_SCALE_DOWN -> SCALE_DOWN
                else -> error("invalid nativeValue")
            }
    }
}
