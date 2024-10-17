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
import kotlin.Int
import kotlin.String

/**
 * `AdwEnumListItem` is the type of items in a [class@EnumListModel].
 */
public class EnumListItem(
    pointer: CPointer<AdwEnumListItem>,
) : Object(pointer.reinterpret()), KGTyped {
    public val adwEnumListItemPointer: CPointer<AdwEnumListItem>
        get() = gPointer.reinterpret()

    /**
     * The enum value name.
     */
    public val name: String
        /**
         * Gets the enum value name.
         *
         * @return the enum value name
         */
        get() =
            adw_enum_list_item_get_name(adwEnumListItemPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * The enum value nick.
     */
    public val nick: String
        /**
         * Gets the enum value nick.
         *
         * @return the enum value nick
         */
        get() =
            adw_enum_list_item_get_nick(adwEnumListItemPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * The enum value.
     */
    public val `value`: Int
        /**
         * Gets the enum value.
         *
         * @return the enum value
         */
        get() = adw_enum_list_item_get_value(adwEnumListItemPointer.reinterpret())

    /**
     * Gets the enum value name.
     *
     * @return the enum value name
     */
    public fun getName(): String =
        adw_enum_list_item_get_name(adwEnumListItemPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the enum value nick.
     *
     * @return the enum value nick
     */
    public fun getNick(): String =
        adw_enum_list_item_get_nick(adwEnumListItemPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the enum value.
     *
     * @return the enum value
     */
    public fun getValue(): Int = adw_enum_list_item_get_value(adwEnumListItemPointer.reinterpret())

    public companion object : TypeCompanion<EnumListItem> {
        override val type: GeneratedClassKGType<EnumListItem> =
            GeneratedClassKGType(adw_enum_list_item_get_type()) {
                EnumListItem(it.reinterpret())
            }

        init {
            AdwTypeProvider.register()
        }
    }
}
