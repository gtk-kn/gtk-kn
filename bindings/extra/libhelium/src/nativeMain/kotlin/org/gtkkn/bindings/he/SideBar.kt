// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.ScrolledWindow
import org.gtkkn.bindings.gtk.Stack
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeSideBar
import org.gtkkn.native.he.he_side_bar_get_has_margins
import org.gtkkn.native.he.he_side_bar_get_scroller
import org.gtkkn.native.he.he_side_bar_get_show_back
import org.gtkkn.native.he.he_side_bar_get_show_buttons
import org.gtkkn.native.he.he_side_bar_get_stack
import org.gtkkn.native.he.he_side_bar_get_subtitle
import org.gtkkn.native.he.he_side_bar_get_title
import org.gtkkn.native.he.he_side_bar_get_titlewidget
import org.gtkkn.native.he.he_side_bar_get_type
import org.gtkkn.native.he.he_side_bar_new
import org.gtkkn.native.he.he_side_bar_set_has_margins
import org.gtkkn.native.he.he_side_bar_set_scroller
import org.gtkkn.native.he.he_side_bar_set_show_back
import org.gtkkn.native.he.he_side_bar_set_show_buttons
import org.gtkkn.native.he.he_side_bar_set_stack
import org.gtkkn.native.he.he_side_bar_set_subtitle
import org.gtkkn.native.he.he_side_bar_set_title
import org.gtkkn.native.he.he_side_bar_set_titlewidget
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `title`: Property has no getter nor setter
 * - method `titlewidget`: Property has no getter nor setter
 * - method `subtitle`: Property has no getter nor setter
 * - method `show-buttons`: Property has no getter nor setter
 * - method `show-back`: Property has no getter nor setter
 * - method `stack`: Property has no getter nor setter
 * - method `scroller`: Property has no getter nor setter
 * - method `has-margins`: Property has no getter nor setter
 */
public open class SideBar(
    pointer: CPointer<HeSideBar>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heSideBarPointer: CPointer<HeSideBar>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param title
     * @param subtitle
     */
    public constructor(title: String, subtitle: String) : this(
        he_side_bar_new(
            title,
            subtitle
        )!!.reinterpret()
    )

    public open fun getTitle(): String =
        he_side_bar_get_title(heSideBarPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTitle(`value`: String): Unit = he_side_bar_set_title(heSideBarPointer.reinterpret(), `value`)

    public open fun getTitlewidget(): Widget? =
        he_side_bar_get_titlewidget(heSideBarPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setTitlewidget(`value`: Widget?): Unit =
        he_side_bar_set_titlewidget(
            heSideBarPointer.reinterpret(),
            `value`?.gtkWidgetPointer?.reinterpret()
        )

    public open fun getSubtitle(): String =
        he_side_bar_get_subtitle(heSideBarPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setSubtitle(`value`: String): Unit =
        he_side_bar_set_subtitle(heSideBarPointer.reinterpret(), `value`)

    public open fun getShowButtons(): Boolean = he_side_bar_get_show_buttons(heSideBarPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setShowButtons(`value`: Boolean): Unit =
        he_side_bar_set_show_buttons(heSideBarPointer.reinterpret(), `value`.asGBoolean())

    public open fun getShowBack(): Boolean = he_side_bar_get_show_back(heSideBarPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setShowBack(`value`: Boolean): Unit =
        he_side_bar_set_show_back(heSideBarPointer.reinterpret(), `value`.asGBoolean())

    public open fun getStack(): Stack =
        he_side_bar_get_stack(heSideBarPointer.reinterpret())!!.run {
            Stack(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setStack(`value`: Stack): Unit =
        he_side_bar_set_stack(
            heSideBarPointer.reinterpret(),
            `value`.gtkStackPointer.reinterpret()
        )

    public open fun getScroller(): ScrolledWindow =
        he_side_bar_get_scroller(heSideBarPointer.reinterpret())!!.run {
            ScrolledWindow(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setScroller(`value`: ScrolledWindow): Unit =
        he_side_bar_set_scroller(
            heSideBarPointer.reinterpret(),
            `value`.gtkScrolledWindowPointer.reinterpret()
        )

    public open fun getHasMargins(): Boolean = he_side_bar_get_has_margins(heSideBarPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setHasMargins(`value`: Boolean): Unit =
        he_side_bar_set_has_margins(heSideBarPointer.reinterpret(), `value`.asGBoolean())

    public companion object : TypeCompanion<SideBar> {
        override val type: GeneratedClassKGType<SideBar> =
            GeneratedClassKGType(he_side_bar_get_type()) { SideBar(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
