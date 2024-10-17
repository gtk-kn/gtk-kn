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
import org.gtkkn.native.he.HeSettingsList
import org.gtkkn.native.he.he_settings_list_add
import org.gtkkn.native.he.he_settings_list_get_description
import org.gtkkn.native.he.he_settings_list_get_title
import org.gtkkn.native.he.he_settings_list_get_type
import org.gtkkn.native.he.he_settings_list_new
import org.gtkkn.native.he.he_settings_list_remove
import org.gtkkn.native.he.he_settings_list_set_description
import org.gtkkn.native.he.he_settings_list_set_title
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `title`: Property has no getter nor setter
 * - method `description`: Property has no getter nor setter
 */
public open class SettingsList(
    pointer: CPointer<HeSettingsList>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heSettingsListPointer: CPointer<HeSettingsList>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    public constructor() : this(he_settings_list_new()!!.reinterpret())

    public open fun getTitle(): String? = he_settings_list_get_title(heSettingsListPointer.reinterpret())?.toKString()

    /**
     *
     *
     * @param value
     */
    public open fun setTitle(`value`: String?): Unit =
        he_settings_list_set_title(heSettingsListPointer.reinterpret(), `value`)

    public open fun getDescription(): String? =
        he_settings_list_get_description(heSettingsListPointer.reinterpret())?.toKString()

    /**
     *
     *
     * @param value
     */
    public open fun setDescription(`value`: String?): Unit =
        he_settings_list_set_description(heSettingsListPointer.reinterpret(), `value`)

    /**
     *
     *
     * @param child
     */
    public open fun add(child: Widget): Unit =
        he_settings_list_add(
            heSettingsListPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     *
     *
     * @param child
     */
    public open fun remove(child: Widget): Unit =
        he_settings_list_remove(
            heSettingsListPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    public companion object : TypeCompanion<SettingsList> {
        override val type: GeneratedClassKGType<SettingsList> =
            GeneratedClassKGType(he_settings_list_get_type()) { SettingsList(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
