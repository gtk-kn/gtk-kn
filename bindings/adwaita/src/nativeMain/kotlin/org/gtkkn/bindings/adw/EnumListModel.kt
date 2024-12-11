// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwEnumListModel
import org.gtkkn.native.adw.adw_enum_list_model_find_position
import org.gtkkn.native.adw.adw_enum_list_model_get_enum_type
import org.gtkkn.native.adw.adw_enum_list_model_get_type
import org.gtkkn.native.adw.adw_enum_list_model_new
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.guint

/**
 * A [iface@Gio.ListModel] representing values of a given enum.
 *
 * `AdwEnumListModel` contains objects of type [class@EnumListItem].
 */
public class EnumListModel(pointer: CPointer<AdwEnumListModel>) :
    Object(pointer.reinterpret()),
    ListModel,
    KGTyped {
    public val adwEnumListModelPointer: CPointer<AdwEnumListModel>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    /**
     * The type of the enum represented by the model.
     */
    public val enumType: GType
        /**
         * Gets the type of the enum represented by @self.
         *
         * @return the enum type
         */
        get() = adw_enum_list_model_get_enum_type(adwEnumListModelPointer.reinterpret())

    /**
     * Creates a new `AdwEnumListModel` for @enum_type.
     *
     * @param enumType the type of the enum to construct the model from
     * @return the newly created `AdwEnumListModel`
     */
    public constructor(enumType: GType) : this(adw_enum_list_model_new(enumType)!!.reinterpret())

    /**
     * Finds the position of a given enum value in @self.
     *
     * If the value is not found, `GTK_INVALID_LIST_POSITION` is returned.
     *
     * @param value an enum value
     */
    public fun findPosition(`value`: gint): guint =
        adw_enum_list_model_find_position(adwEnumListModelPointer.reinterpret(), `value`)

    public companion object : TypeCompanion<EnumListModel> {
        override val type: GeneratedClassKGType<EnumListModel> =
            GeneratedClassKGType(adw_enum_list_model_get_type()) { EnumListModel(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of EnumListModel
         *
         * @return the GType
         */
        public fun getType(): GType = adw_enum_list_model_get_type()
    }
}
