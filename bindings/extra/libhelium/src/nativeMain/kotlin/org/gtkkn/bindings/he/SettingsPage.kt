// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeSettingsPage
import org.gtkkn.native.he.he_settings_page_add_list
import org.gtkkn.native.he.he_settings_page_get_title
import org.gtkkn.native.he.he_settings_page_get_type
import org.gtkkn.native.he.he_settings_page_new
import org.gtkkn.native.he.he_settings_page_set_title
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `title`: Property has no getter nor setter
 */
public open class SettingsPage(
    pointer: CPointer<HeSettingsPage>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heSettingsPagePointer: CPointer<HeSettingsPage>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param title
     */
    public constructor(title: String) : this(he_settings_page_new(title)!!.reinterpret())

    public open fun getTitle(): String =
        he_settings_page_get_title(heSettingsPagePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTitle(`value`: String): Unit =
        he_settings_page_set_title(heSettingsPagePointer.reinterpret(), `value`)

    /**
     *
     *
     * @param list
     */
    public open fun addList(list: SettingsList): Unit =
        he_settings_page_add_list(
            heSettingsPagePointer.reinterpret(),
            list.heSettingsListPointer.reinterpret()
        )

    public companion object : TypeCompanion<SettingsPage> {
        override val type: GeneratedClassKGType<SettingsPage> =
            GeneratedClassKGType(he_settings_page_get_type()) { SettingsPage(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
