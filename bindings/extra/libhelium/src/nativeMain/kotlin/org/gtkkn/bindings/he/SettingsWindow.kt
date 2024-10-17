// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Buildable
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeSettingsWindow
import org.gtkkn.native.he.he_settings_window_add_list
import org.gtkkn.native.he.he_settings_window_add_page
import org.gtkkn.native.he.he_settings_window_get_type
import org.gtkkn.native.he.he_settings_window_new
import kotlin.Unit

public open class SettingsWindow(
    pointer: CPointer<HeSettingsWindow>,
) : Window(pointer.reinterpret()), Buildable, KGTyped {
    public val heSettingsWindowPointer: CPointer<HeSettingsWindow>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param parent
     */
    public constructor(parent: org.gtkkn.bindings.gtk.Window?) :
        this(he_settings_window_new(parent?.gtkWindowPointer?.reinterpret())!!.reinterpret())

    /**
     *
     *
     * @param page
     */
    public open fun addPage(page: SettingsPage): Unit =
        he_settings_window_add_page(
            heSettingsWindowPointer.reinterpret(),
            page.heSettingsPagePointer.reinterpret()
        )

    /**
     *
     *
     * @param list
     */
    public open fun addList(list: SettingsList): Unit =
        he_settings_window_add_list(
            heSettingsWindowPointer.reinterpret(),
            list.heSettingsListPointer.reinterpret()
        )

    public companion object : TypeCompanion<SettingsWindow> {
        override val type: GeneratedClassKGType<SettingsWindow> =
            GeneratedClassKGType(he_settings_window_get_type()) {
                SettingsWindow(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
