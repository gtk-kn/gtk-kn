// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Menu
import org.gtkkn.bindings.gio.SimpleActionGroup
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeTab
import org.gtkkn.native.he.he_tab_get_actions
import org.gtkkn.native.he.he_tab_get_can_close
import org.gtkkn.native.he.he_tab_get_can_pin
import org.gtkkn.native.he.he_tab_get_label
import org.gtkkn.native.he.he_tab_get_menu
import org.gtkkn.native.he.he_tab_get_page
import org.gtkkn.native.he.he_tab_get_pinned
import org.gtkkn.native.he.he_tab_get_type
import org.gtkkn.native.he.he_tab_new
import org.gtkkn.native.he.he_tab_set_can_close
import org.gtkkn.native.he.he_tab_set_can_pin
import org.gtkkn.native.he.he_tab_set_label
import org.gtkkn.native.he.he_tab_set_page
import org.gtkkn.native.he.he_tab_set_pinned
import org.gtkkn.native.he.he_tab_set_tooltip
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `label`: Property has no getter nor setter
 * - method `tooltip`: Property has no getter nor setter
 * - method `pinned`: Property has no getter nor setter
 * - method `can-pin`: Property has no getter nor setter
 * - method `can-close`: Property has no getter nor setter
 * - method `page`: Property has no getter nor setter
 * - method `menu`: Property has no getter nor setter
 * - method `actions`: Property has no getter nor setter
 */
public open class Tab(
    pointer: CPointer<HeTab>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heTabPointer: CPointer<HeTab>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param label
     * @param page
     */
    public constructor(label: String?, page: Widget?) : this(
        he_tab_new(
            label,
            page?.gtkWidgetPointer?.reinterpret()
        )!!.reinterpret()
    )

    public open fun getLabel(): String =
        he_tab_get_label(heTabPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setLabel(`value`: String): Unit =
        he_tab_set_label(
            heTabPointer.reinterpret(),
            `value`
        )

    /**
     *
     *
     * @param value
     */
    public open fun setTooltip(`value`: String): Unit = he_tab_set_tooltip(heTabPointer.reinterpret(), `value`)

    public open fun getPinned(): Boolean = he_tab_get_pinned(heTabPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setPinned(`value`: Boolean): Unit =
        he_tab_set_pinned(heTabPointer.reinterpret(), `value`.asGBoolean())

    public open fun getCanPin(): Boolean = he_tab_get_can_pin(heTabPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setCanPin(`value`: Boolean): Unit =
        he_tab_set_can_pin(heTabPointer.reinterpret(), `value`.asGBoolean())

    public open fun getCanClose(): Boolean = he_tab_get_can_close(heTabPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setCanClose(`value`: Boolean): Unit =
        he_tab_set_can_close(heTabPointer.reinterpret(), `value`.asGBoolean())

    public open fun getPage(): Widget =
        he_tab_get_page(heTabPointer.reinterpret())!!.run {
            Widget(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setPage(`value`: Widget): Unit =
        he_tab_set_page(
            heTabPointer.reinterpret(),
            `value`.gtkWidgetPointer.reinterpret()
        )

    public open fun getMenu(): Menu =
        he_tab_get_menu(heTabPointer.reinterpret())!!.run {
            Menu(reinterpret())
        }

    public open fun getActions(): SimpleActionGroup =
        he_tab_get_actions(heTabPointer.reinterpret())!!.run {
            SimpleActionGroup(reinterpret())
        }

    public companion object : TypeCompanion<Tab> {
        override val type: GeneratedClassKGType<Tab> =
            GeneratedClassKGType(he_tab_get_type()) {
                Tab(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
