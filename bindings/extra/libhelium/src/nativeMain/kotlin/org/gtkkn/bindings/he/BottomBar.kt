// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeBottomBar
import org.gtkkn.native.he.he_bottom_bar_append_button
import org.gtkkn.native.he.he_bottom_bar_get_collapse_actions
import org.gtkkn.native.he.he_bottom_bar_get_description
import org.gtkkn.native.he.he_bottom_bar_get_menu_model
import org.gtkkn.native.he.he_bottom_bar_get_title
import org.gtkkn.native.he.he_bottom_bar_get_type
import org.gtkkn.native.he.he_bottom_bar_insert_button_after
import org.gtkkn.native.he.he_bottom_bar_new
import org.gtkkn.native.he.he_bottom_bar_new_with_details
import org.gtkkn.native.he.he_bottom_bar_prepend_button
import org.gtkkn.native.he.he_bottom_bar_remove_button
import org.gtkkn.native.he.he_bottom_bar_reorder_button_after
import org.gtkkn.native.he.he_bottom_bar_set_collapse_actions
import org.gtkkn.native.he.he_bottom_bar_set_description
import org.gtkkn.native.he.he_bottom_bar_set_menu_model
import org.gtkkn.native.he.he_bottom_bar_set_title
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `title`: Property has no getter nor setter
 * - method `description`: Property has no getter nor setter
 * - method `menu-model`: Property has no getter nor setter
 * - method `collapse-actions`: Property has no getter nor setter
 */
public open class BottomBar(
    pointer: CPointer<HeBottomBar>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heBottomBarPointer: CPointer<HeBottomBar>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    public constructor() : this(he_bottom_bar_new()!!.reinterpret())

    /**
     *
     *
     * @param title
     * @param description
     */
    public constructor(title: String, description: String) :
        this(he_bottom_bar_new_with_details(title, description)!!.reinterpret())

    public open fun getTitle(): String =
        he_bottom_bar_get_title(heBottomBarPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTitle(`value`: String): Unit = he_bottom_bar_set_title(heBottomBarPointer.reinterpret(), `value`)

    public open fun getDescription(): String =
        he_bottom_bar_get_description(heBottomBarPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setDescription(`value`: String): Unit =
        he_bottom_bar_set_description(heBottomBarPointer.reinterpret(), `value`)

    public open fun getMenuModel(): MenuModel =
        he_bottom_bar_get_menu_model(heBottomBarPointer.reinterpret())!!.run {
            MenuModel(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setMenuModel(`value`: MenuModel): Unit =
        he_bottom_bar_set_menu_model(
            heBottomBarPointer.reinterpret(),
            `value`.gioMenuModelPointer.reinterpret()
        )

    public open fun getCollapseActions(): Boolean =
        he_bottom_bar_get_collapse_actions(heBottomBarPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setCollapseActions(`value`: Boolean): Unit =
        he_bottom_bar_set_collapse_actions(
            heBottomBarPointer.reinterpret(),
            `value`.asGBoolean()
        )

    /**
     *
     *
     * @param icon
     * @param position
     */
    public open fun appendButton(
        icon: IconicButton,
        position: BottomBarPosition,
    ): Unit =
        he_bottom_bar_append_button(
            heBottomBarPointer.reinterpret(),
            icon.heIconicButtonPointer.reinterpret(),
            position.nativeValue
        )

    /**
     *
     *
     * @param icon
     * @param position
     */
    public open fun prependButton(
        icon: IconicButton,
        position: BottomBarPosition,
    ): Unit =
        he_bottom_bar_prepend_button(
            heBottomBarPointer.reinterpret(),
            icon.heIconicButtonPointer.reinterpret(),
            position.nativeValue
        )

    /**
     *
     *
     * @param icon
     * @param position
     */
    public open fun removeButton(
        icon: IconicButton,
        position: BottomBarPosition,
    ): Unit =
        he_bottom_bar_remove_button(
            heBottomBarPointer.reinterpret(),
            icon.heIconicButtonPointer.reinterpret(),
            position.nativeValue
        )

    /**
     *
     *
     * @param icon
     * @param after
     * @param position
     */
    public open fun insertButtonAfter(
        icon: IconicButton,
        after: IconicButton,
        position: BottomBarPosition,
    ): Unit =
        he_bottom_bar_insert_button_after(
            heBottomBarPointer.reinterpret(),
            icon.heIconicButtonPointer.reinterpret(),
            after.heIconicButtonPointer.reinterpret(),
            position.nativeValue
        )

    /**
     *
     *
     * @param icon
     * @param sibling
     * @param position
     */
    public open fun reorderButtonAfter(
        icon: IconicButton,
        sibling: IconicButton,
        position: BottomBarPosition,
    ): Unit =
        he_bottom_bar_reorder_button_after(
            heBottomBarPointer.reinterpret(),
            icon.heIconicButtonPointer.reinterpret(),
            sibling.heIconicButtonPointer.reinterpret(),
            position.nativeValue
        )

    public companion object : TypeCompanion<BottomBar> {
        override val type: GeneratedClassKGType<BottomBar> =
            GeneratedClassKGType(he_bottom_bar_get_type()) { BottomBar(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
