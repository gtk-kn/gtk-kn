// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeMiniContentBlock
import org.gtkkn.native.he.he_mini_content_block_get_icon
import org.gtkkn.native.he.he_mini_content_block_get_primary_button
import org.gtkkn.native.he.he_mini_content_block_get_subtitle
import org.gtkkn.native.he.he_mini_content_block_get_title
import org.gtkkn.native.he.he_mini_content_block_get_type
import org.gtkkn.native.he.he_mini_content_block_new
import org.gtkkn.native.he.he_mini_content_block_new_with_details
import org.gtkkn.native.he.he_mini_content_block_set_gicon
import org.gtkkn.native.he.he_mini_content_block_set_icon
import org.gtkkn.native.he.he_mini_content_block_set_paintable
import org.gtkkn.native.he.he_mini_content_block_set_primary_button
import org.gtkkn.native.he.he_mini_content_block_set_subtitle
import org.gtkkn.native.he.he_mini_content_block_set_title
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `title`: Property has no getter nor setter
 * - method `subtitle`: Property has no getter nor setter
 * - method `icon`: Property has no getter nor setter
 * - method `gicon`: Property has no getter nor setter
 * - method `paintable`: Property has no getter nor setter
 * - method `primary-button`: Property has no getter nor setter
 */
public open class MiniContentBlock(
    pointer: CPointer<HeMiniContentBlock>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heMiniContentBlockPointer: CPointer<HeMiniContentBlock>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    public constructor() : this(he_mini_content_block_new()!!.reinterpret())

    /**
     *
     *
     * @param title
     * @param subtitle
     * @param primaryButton
     */
    public constructor(
        title: String?,
        subtitle: String?,
        primaryButton: Button?,
    ) : this(
        he_mini_content_block_new_with_details(
            title,
            subtitle,
            primaryButton?.heButtonPointer?.reinterpret()
        )!!.reinterpret()
    )

    public open fun getTitle(): String =
        he_mini_content_block_get_title(heMiniContentBlockPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTitle(`value`: String): Unit =
        he_mini_content_block_set_title(heMiniContentBlockPointer.reinterpret(), `value`)

    public open fun getSubtitle(): String =
        he_mini_content_block_get_subtitle(heMiniContentBlockPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setSubtitle(`value`: String): Unit =
        he_mini_content_block_set_subtitle(heMiniContentBlockPointer.reinterpret(), `value`)

    public open fun getIcon(): String =
        he_mini_content_block_get_icon(heMiniContentBlockPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setIcon(`value`: String): Unit =
        he_mini_content_block_set_icon(heMiniContentBlockPointer.reinterpret(), `value`)

    /**
     *
     *
     * @param value
     */
    public open fun setGicon(`value`: Icon): Unit =
        he_mini_content_block_set_gicon(
            heMiniContentBlockPointer.reinterpret(),
            `value`.gioIconPointer
        )

    /**
     *
     *
     * @param value
     */
    public open fun setPaintable(`value`: Paintable): Unit =
        he_mini_content_block_set_paintable(
            heMiniContentBlockPointer.reinterpret(),
            `value`.gdkPaintablePointer
        )

    public open fun getPrimaryButton(): Button =
        he_mini_content_block_get_primary_button(heMiniContentBlockPointer.reinterpret())!!.run {
            Button(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setPrimaryButton(`value`: Button): Unit =
        he_mini_content_block_set_primary_button(
            heMiniContentBlockPointer.reinterpret(),
            `value`.heButtonPointer.reinterpret()
        )

    public companion object : TypeCompanion<MiniContentBlock> {
        override val type: GeneratedClassKGType<MiniContentBlock> =
            GeneratedClassKGType(he_mini_content_block_get_type()) {
                MiniContentBlock(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
