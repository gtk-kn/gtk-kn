// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeContentBlock
import org.gtkkn.native.he.he_content_block_get_icon
import org.gtkkn.native.he.he_content_block_get_primary_button
import org.gtkkn.native.he.he_content_block_get_secondary_button
import org.gtkkn.native.he.he_content_block_get_subtitle
import org.gtkkn.native.he.he_content_block_get_title
import org.gtkkn.native.he.he_content_block_get_type
import org.gtkkn.native.he.he_content_block_new
import org.gtkkn.native.he.he_content_block_set_gicon
import org.gtkkn.native.he.he_content_block_set_icon
import org.gtkkn.native.he.he_content_block_set_primary_button
import org.gtkkn.native.he.he_content_block_set_secondary_button
import org.gtkkn.native.he.he_content_block_set_subtitle
import org.gtkkn.native.he.he_content_block_set_title
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `title`: Property has no getter nor setter
 * - method `subtitle`: Property has no getter nor setter
 * - method `icon`: Property has no getter nor setter
 * - method `gicon`: Property has no getter nor setter
 * - method `secondary-button`: Property has no getter nor setter
 * - method `primary-button`: Property has no getter nor setter
 */
public open class ContentBlock(
    pointer: CPointer<HeContentBlock>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heContentBlockPointer: CPointer<HeContentBlock>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param title
     * @param subtitle
     * @param icon
     * @param primaryButton
     * @param secondaryButton
     */
    public constructor(
        title: String,
        subtitle: String,
        icon: String,
        primaryButton: Button,
        secondaryButton: Button,
    ) : this(
        he_content_block_new(
            title,
            subtitle,
            icon,
            primaryButton.heButtonPointer.reinterpret(),
            secondaryButton.heButtonPointer.reinterpret()
        )!!.reinterpret()
    )

    public open fun getTitle(): String =
        he_content_block_get_title(heContentBlockPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTitle(`value`: String): Unit =
        he_content_block_set_title(heContentBlockPointer.reinterpret(), `value`)

    public open fun getSubtitle(): String =
        he_content_block_get_subtitle(heContentBlockPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setSubtitle(`value`: String): Unit =
        he_content_block_set_subtitle(heContentBlockPointer.reinterpret(), `value`)

    public open fun getIcon(): String =
        he_content_block_get_icon(heContentBlockPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setIcon(`value`: String): Unit =
        he_content_block_set_icon(heContentBlockPointer.reinterpret(), `value`)

    /**
     *
     *
     * @param value
     */
    public open fun setGicon(`value`: Icon): Unit =
        he_content_block_set_gicon(heContentBlockPointer.reinterpret(), `value`.gioIconPointer)

    public open fun getSecondaryButton(): Button =
        he_content_block_get_secondary_button(heContentBlockPointer.reinterpret())!!.run {
            Button(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setSecondaryButton(`value`: Button): Unit =
        he_content_block_set_secondary_button(
            heContentBlockPointer.reinterpret(),
            `value`.heButtonPointer.reinterpret()
        )

    public open fun getPrimaryButton(): Button =
        he_content_block_get_primary_button(heContentBlockPointer.reinterpret())!!.run {
            Button(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setPrimaryButton(`value`: Button): Unit =
        he_content_block_set_primary_button(
            heContentBlockPointer.reinterpret(),
            `value`.heButtonPointer.reinterpret()
        )

    public companion object : TypeCompanion<ContentBlock> {
        override val type: GeneratedClassKGType<ContentBlock> =
            GeneratedClassKGType(he_content_block_get_type()) { ContentBlock(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
