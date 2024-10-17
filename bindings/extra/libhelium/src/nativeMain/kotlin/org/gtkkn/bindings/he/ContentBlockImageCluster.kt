// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeContentBlockImageCluster
import org.gtkkn.native.he.he_content_block_image_cluster_get_icon
import org.gtkkn.native.he.he_content_block_image_cluster_get_subtitle
import org.gtkkn.native.he.he_content_block_image_cluster_get_title
import org.gtkkn.native.he.he_content_block_image_cluster_get_type
import org.gtkkn.native.he.he_content_block_image_cluster_new
import org.gtkkn.native.he.he_content_block_image_cluster_remove_image
import org.gtkkn.native.he.he_content_block_image_cluster_set_icon
import org.gtkkn.native.he.he_content_block_image_cluster_set_image
import org.gtkkn.native.he.he_content_block_image_cluster_set_subtitle
import org.gtkkn.native.he.he_content_block_image_cluster_set_title
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `title`: Property has no getter nor setter
 * - method `subtitle`: Property has no getter nor setter
 * - method `icon`: Property has no getter nor setter
 */
public open class ContentBlockImageCluster(
    pointer: CPointer<HeContentBlockImageCluster>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heContentBlockImageClusterPointer: CPointer<HeContentBlockImageCluster>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param title
     * @param subtitle
     * @param icon
     */
    public constructor(
        title: String,
        subtitle: String,
        icon: String,
    ) : this(he_content_block_image_cluster_new(title, subtitle, icon)!!.reinterpret())

    public open fun getTitle(): String =
        he_content_block_image_cluster_get_title(heContentBlockImageClusterPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTitle(`value`: String): Unit =
        he_content_block_image_cluster_set_title(
            heContentBlockImageClusterPointer.reinterpret(),
            `value`
        )

    public open fun getSubtitle(): String =
        he_content_block_image_cluster_get_subtitle(heContentBlockImageClusterPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setSubtitle(`value`: String): Unit =
        he_content_block_image_cluster_set_subtitle(
            heContentBlockImageClusterPointer.reinterpret(),
            `value`
        )

    public open fun getIcon(): String =
        he_content_block_image_cluster_get_icon(heContentBlockImageClusterPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setIcon(`value`: String): Unit =
        he_content_block_image_cluster_set_icon(
            heContentBlockImageClusterPointer.reinterpret(),
            `value`
        )

    /**
     *
     *
     * @param image
     * @param position
     */
    public open fun setImage(
        image: ContentBlockImage,
        position: ContentBlockImageClusterImagePosition,
    ): Unit =
        he_content_block_image_cluster_set_image(
            heContentBlockImageClusterPointer.reinterpret(),
            image.heContentBlockImagePointer.reinterpret(),
            position.nativeValue
        )

    /**
     *
     *
     * @param image
     */
    public open fun removeImage(image: ContentBlockImage): Unit =
        he_content_block_image_cluster_remove_image(
            heContentBlockImageClusterPointer.reinterpret(),
            image.heContentBlockImagePointer.reinterpret()
        )

    public companion object : TypeCompanion<ContentBlockImageCluster> {
        override val type: GeneratedClassKGType<ContentBlockImageCluster> =
            GeneratedClassKGType(he_content_block_image_cluster_get_type()) {
                ContentBlockImageCluster(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
