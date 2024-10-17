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
import org.gtkkn.native.he.HeAppBar
import org.gtkkn.native.he.he_app_bar_append
import org.gtkkn.native.he.he_app_bar_get_decoration_layout
import org.gtkkn.native.he.he_app_bar_get_scroller
import org.gtkkn.native.he.he_app_bar_get_show_back
import org.gtkkn.native.he.he_app_bar_get_show_buttons
import org.gtkkn.native.he.he_app_bar_get_stack
import org.gtkkn.native.he.he_app_bar_get_type
import org.gtkkn.native.he.he_app_bar_get_viewsubtitle_label
import org.gtkkn.native.he.he_app_bar_get_viewtitle_label
import org.gtkkn.native.he.he_app_bar_get_viewtitle_widget
import org.gtkkn.native.he.he_app_bar_new
import org.gtkkn.native.he.he_app_bar_remove
import org.gtkkn.native.he.he_app_bar_set_decoration_layout
import org.gtkkn.native.he.he_app_bar_set_scroller
import org.gtkkn.native.he.he_app_bar_set_show_back
import org.gtkkn.native.he.he_app_bar_set_show_buttons
import org.gtkkn.native.he.he_app_bar_set_stack
import org.gtkkn.native.he.he_app_bar_set_viewsubtitle_label
import org.gtkkn.native.he.he_app_bar_set_viewtitle_label
import org.gtkkn.native.he.he_app_bar_set_viewtitle_widget
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `stack`: Property has no getter nor setter
 * - method `scroller`: Property has no getter nor setter
 * - method `viewtitle-label`: Property has no getter nor setter
 * - method `viewtitle-widget`: Property has no getter nor setter
 * - method `viewsubtitle-label`: Property has no getter nor setter
 * - method `show-buttons`: Property has no getter nor setter
 * - method `decoration-layout`: Property has no getter nor setter
 * - method `show-back`: Property has no getter nor setter
 */
public open class AppBar(
    pointer: CPointer<HeAppBar>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heAppBarPointer: CPointer<HeAppBar>
        get() = gPointer.reinterpret()

    public constructor() : this(he_app_bar_new()!!.reinterpret())

    public open fun getStack(): Stack =
        he_app_bar_get_stack(heAppBarPointer.reinterpret())!!.run {
            Stack(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setStack(`value`: Stack): Unit =
        he_app_bar_set_stack(
            heAppBarPointer.reinterpret(),
            `value`.gtkStackPointer.reinterpret()
        )

    public open fun getScroller(): ScrolledWindow =
        he_app_bar_get_scroller(heAppBarPointer.reinterpret())!!.run {
            ScrolledWindow(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setScroller(`value`: ScrolledWindow): Unit =
        he_app_bar_set_scroller(
            heAppBarPointer.reinterpret(),
            `value`.gtkScrolledWindowPointer.reinterpret()
        )

    public open fun getViewtitleLabel(): String =
        he_app_bar_get_viewtitle_label(heAppBarPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setViewtitleLabel(`value`: String): Unit =
        he_app_bar_set_viewtitle_label(heAppBarPointer.reinterpret(), `value`)

    public open fun getViewtitleWidget(): Widget? =
        he_app_bar_get_viewtitle_widget(heAppBarPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setViewtitleWidget(`value`: Widget?): Unit =
        he_app_bar_set_viewtitle_widget(
            heAppBarPointer.reinterpret(),
            `value`?.gtkWidgetPointer?.reinterpret()
        )

    public open fun getViewsubtitleLabel(): String =
        he_app_bar_get_viewsubtitle_label(heAppBarPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setViewsubtitleLabel(`value`: String): Unit =
        he_app_bar_set_viewsubtitle_label(heAppBarPointer.reinterpret(), `value`)

    public open fun getShowButtons(): Boolean = he_app_bar_get_show_buttons(heAppBarPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setShowButtons(`value`: Boolean): Unit =
        he_app_bar_set_show_buttons(heAppBarPointer.reinterpret(), `value`.asGBoolean())

    public open fun getDecorationLayout(): String =
        he_app_bar_get_decoration_layout(heAppBarPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setDecorationLayout(`value`: String): Unit =
        he_app_bar_set_decoration_layout(heAppBarPointer.reinterpret(), `value`)

    public open fun getShowBack(): Boolean = he_app_bar_get_show_back(heAppBarPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setShowBack(`value`: Boolean): Unit =
        he_app_bar_set_show_back(heAppBarPointer.reinterpret(), `value`.asGBoolean())

    /**
     *
     *
     * @param child
     */
    public open fun append(child: Widget): Unit =
        he_app_bar_append(
            heAppBarPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     *
     *
     * @param child
     */
    public open fun remove(child: Widget): Unit =
        he_app_bar_remove(
            heAppBarPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    public companion object : TypeCompanion<AppBar> {
        override val type: GeneratedClassKGType<AppBar> =
            GeneratedClassKGType(he_app_bar_get_type()) { AppBar(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
