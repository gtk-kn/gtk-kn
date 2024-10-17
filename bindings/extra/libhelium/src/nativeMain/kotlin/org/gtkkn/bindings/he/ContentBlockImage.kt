// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeContentBlockImage
import org.gtkkn.native.he.he_content_block_image_get_file
import org.gtkkn.native.he.he_content_block_image_get_requested_height
import org.gtkkn.native.he.he_content_block_image_get_requested_width
import org.gtkkn.native.he.he_content_block_image_get_type
import org.gtkkn.native.he.he_content_block_image_new
import org.gtkkn.native.he.he_content_block_image_set_file
import org.gtkkn.native.he.he_content_block_image_set_requested_height
import org.gtkkn.native.he.he_content_block_image_set_requested_width
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `file`: Property has no getter nor setter
 * - method `requested-height`: Property has no getter nor setter
 * - method `requested-width`: Property has no getter nor setter
 */
public open class ContentBlockImage(
    pointer: CPointer<HeContentBlockImage>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heContentBlockImagePointer: CPointer<HeContentBlockImage>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param file
     */
    public constructor(`file`: String) : this(he_content_block_image_new(`file`)!!.reinterpret())

    public open fun getFile(): String =
        he_content_block_image_get_file(heContentBlockImagePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setFile(`value`: String): Unit =
        he_content_block_image_set_file(heContentBlockImagePointer.reinterpret(), `value`)

    public open fun getRequestedHeight(): Int =
        he_content_block_image_get_requested_height(heContentBlockImagePointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setRequestedHeight(`value`: Int): Unit =
        he_content_block_image_set_requested_height(
            heContentBlockImagePointer.reinterpret(),
            `value`
        )

    public open fun getRequestedWidth(): Int =
        he_content_block_image_get_requested_width(heContentBlockImagePointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setRequestedWidth(`value`: Int): Unit =
        he_content_block_image_set_requested_width(
            heContentBlockImagePointer.reinterpret(),
            `value`
        )

    public companion object : TypeCompanion<ContentBlockImage> {
        override val type: GeneratedClassKGType<ContentBlockImage> =
            GeneratedClassKGType(he_content_block_image_get_type()) {
                ContentBlockImage(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
