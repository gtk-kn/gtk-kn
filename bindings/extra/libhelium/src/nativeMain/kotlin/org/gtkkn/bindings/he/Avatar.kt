// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeAvatar
import org.gtkkn.native.he.he_avatar_get_image
import org.gtkkn.native.he.he_avatar_get_size
import org.gtkkn.native.he.he_avatar_get_text
import org.gtkkn.native.he.he_avatar_get_type
import org.gtkkn.native.he.he_avatar_new
import org.gtkkn.native.he.he_avatar_set_image
import org.gtkkn.native.he.he_avatar_set_size
import org.gtkkn.native.he.he_avatar_set_text
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `size`: Property has no getter nor setter
 * - method `text`: Property has no getter nor setter
 * - method `image`: Property has no getter nor setter
 */
public open class Avatar(
    pointer: CPointer<HeAvatar>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heAvatarPointer: CPointer<HeAvatar>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param size
     * @param image
     * @param text
     */
    public constructor(
        size: Int,
        image: String?,
        text: String?,
    ) : this(he_avatar_new(size, image, text)!!.reinterpret())

    public open fun getSize_(): Int = he_avatar_get_size(heAvatarPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setSize(`value`: Int): Unit =
        he_avatar_set_size(
            heAvatarPointer.reinterpret(),
            `value`
        )

    public open fun getText(): String? = he_avatar_get_text(heAvatarPointer.reinterpret())?.toKString()

    /**
     *
     *
     * @param value
     */
    public open fun setText(`value`: String?): Unit = he_avatar_set_text(heAvatarPointer.reinterpret(), `value`)

    public open fun getImage(): String? = he_avatar_get_image(heAvatarPointer.reinterpret())?.toKString()

    /**
     *
     *
     * @param value
     */
    public open fun setImage(`value`: String?): Unit = he_avatar_set_image(heAvatarPointer.reinterpret(), `value`)

    public companion object : TypeCompanion<Avatar> {
        override val type: GeneratedClassKGType<Avatar> =
            GeneratedClassKGType(he_avatar_get_type()) { Avatar(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
