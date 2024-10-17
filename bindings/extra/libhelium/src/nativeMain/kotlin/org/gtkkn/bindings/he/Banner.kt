// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeBanner
import org.gtkkn.native.he.he_banner_add_action_button
import org.gtkkn.native.he.he_banner_get_description
import org.gtkkn.native.he.he_banner_get_style
import org.gtkkn.native.he.he_banner_get_title
import org.gtkkn.native.he.he_banner_get_type
import org.gtkkn.native.he.he_banner_new
import org.gtkkn.native.he.he_banner_remove_action
import org.gtkkn.native.he.he_banner_set_banner_style
import org.gtkkn.native.he.he_banner_set_description
import org.gtkkn.native.he.he_banner_set_style
import org.gtkkn.native.he.he_banner_set_title
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `title`: Property has no getter nor setter
 * - method `description`: Property has no getter nor setter
 * - method `style`: Property has no getter nor setter
 */
public open class Banner(
    pointer: CPointer<HeBanner>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heBannerPointer: CPointer<HeBanner>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param title
     * @param description
     */
    public constructor(title: String, description: String) : this(
        he_banner_new(
            title,
            description
        )!!.reinterpret()
    )

    public open fun getTitle(): String =
        he_banner_get_title(heBannerPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTitle(`value`: String): Unit = he_banner_set_title(heBannerPointer.reinterpret(), `value`)

    public open fun getDescription(): String =
        he_banner_get_description(heBannerPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setDescription(`value`: String): Unit =
        he_banner_set_description(heBannerPointer.reinterpret(), `value`)

    public open fun getStyle(): BannerStyle =
        he_banner_get_style(heBannerPointer.reinterpret()).run {
            BannerStyle.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setStyle(`value`: BannerStyle): Unit =
        he_banner_set_style(heBannerPointer.reinterpret(), `value`.nativeValue)

    /**
     *
     *
     * @param widget
     */
    public open fun addActionButton(widget: Widget): Unit =
        he_banner_add_action_button(
            heBannerPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret()
        )

    /**
     *
     *
     * @param widget
     */
    public open fun removeAction(widget: Widget): Unit =
        he_banner_remove_action(
            heBannerPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret()
        )

    /**
     *
     *
     * @param style
     */
    public open fun setBannerStyle(style: BannerStyle): Unit =
        he_banner_set_banner_style(heBannerPointer.reinterpret(), style.nativeValue)

    public companion object : TypeCompanion<Banner> {
        override val type: GeneratedClassKGType<Banner> =
            GeneratedClassKGType(he_banner_get_type()) { Banner(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
