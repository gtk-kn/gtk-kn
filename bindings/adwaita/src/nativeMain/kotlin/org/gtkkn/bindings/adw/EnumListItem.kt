// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwEnumListItem
import org.gtkkn.native.adw.adw_enum_list_item_get_name
import org.gtkkn.native.adw.adw_enum_list_item_get_nick
import org.gtkkn.native.adw.adw_enum_list_item_get_type
import org.gtkkn.native.adw.adw_enum_list_item_get_value
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.String

/**
 * `AdwEnumListItem` is the type of items in a [class@EnumListModel].
 */
public class EnumListItem(public val adwEnumListItemPointer: CPointer<AdwEnumListItem>) :
    Object(adwEnumListItemPointer.reinterpret()),
    KGTyped {
    /**
     * The enum value name.
     */
    public val name: String
        /**
         * Gets the enum value name.
         *
         * @return the enum value name
         */
        get() = adw_enum_list_item_get_name(adwEnumListItemPointer)?.toKString() ?: error("Expected not null string")

    /**
     * The enum value nick.
     */
    public val nick: String
        /**
         * Gets the enum value nick.
         *
         * @return the enum value nick
         */
        get() = adw_enum_list_item_get_nick(adwEnumListItemPointer)?.toKString() ?: error("Expected not null string")

    /**
     * The enum value.
     */
    public val `value`: gint
        /**
         * Gets the enum value.
         *
         * @return the enum value
         */
        get() = adw_enum_list_item_get_value(adwEnumListItemPointer)

    public companion object : TypeCompanion<EnumListItem> {
        override val type: GeneratedClassKGType<EnumListItem> =
            GeneratedClassKGType(adw_enum_list_item_get_type()) { EnumListItem(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of EnumListItem
         *
         * @return the GType
         */
        public fun getType(): GType = adw_enum_list_item_get_type()
    }
}
