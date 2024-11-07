// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.atk.annotations.AtkVersion1_12
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkImage
import org.gtkkn.native.atk.atk_image_get_image_description
import org.gtkkn.native.atk.atk_image_get_image_locale
import org.gtkkn.native.atk.atk_image_get_type
import org.gtkkn.native.atk.atk_image_set_image_description
import kotlin.Boolean
import kotlin.String

/**
 * The ATK Interface implemented by components
 *  which expose image or pixmap content on-screen.
 *
 * #AtkImage should be implemented by #AtkObject subtypes on behalf of
 * components which display image/pixmap information onscreen, and
 * which provide information (other than just widget borders, etc.)
 * via that image content.  For instance, icons, buttons with icons,
 * toolbar elements, and image viewing panes typically should
 * implement #AtkImage.
 *
 * #AtkImage primarily provides two types of information: coordinate
 * information (useful for screen review mode of screenreaders, and
 * for use by onscreen magnifiers), and descriptive information.  The
 * descriptive information is provided for alternative, text-only
 * presentation of the most significant information present in the
 * image.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `x`: x: Out parameter is not supported
 * - parameter `width`: width: Out parameter is not supported
 */
public interface Image :
    Interface,
    KGTyped {
    public val atkImagePointer: CPointer<AtkImage>

    /**
     * Get a textual description of this image.
     *
     * @return a string representing the image description
     */
    public fun getImageDescription(): String =
        atk_image_get_image_description(atkImagePointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Retrieves the locale identifier associated to the #AtkImage.
     *
     * @return a string corresponding to the POSIX
     *   `LC_MESSAGES` locale used by the image description, or
     *   null if the image does not specify a locale.
     * @since 1.12
     */
    @AtkVersion1_12
    public fun getImageLocale(): String? = atk_image_get_image_locale(atkImagePointer.reinterpret())?.toKString()

    /**
     * Sets the textual description for this image.
     *
     * @param description a string description to set for @image
     * @return boolean TRUE, or FALSE if operation could
     * not be completed.
     */
    public fun setImageDescription(description: String): Boolean =
        atk_image_set_image_description(atkImagePointer.reinterpret(), description).asBoolean()

    private data class Wrapper(
        private val pointer: CPointer<AtkImage>,
    ) : Image {
        override val atkImagePointer: CPointer<AtkImage> = pointer
    }

    public companion object : TypeCompanion<Image> {
        override val type: GeneratedInterfaceKGType<Image> =
            GeneratedInterfaceKGType(atk_image_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AtkImage>): Image = Wrapper(pointer)
    }
}
