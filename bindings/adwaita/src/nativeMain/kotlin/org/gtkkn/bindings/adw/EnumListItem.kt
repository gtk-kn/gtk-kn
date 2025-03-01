// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
    init {
        Adw
    }

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
            GeneratedClassKGType(getTypeOrNull()!!) { EnumListItem(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of EnumListItem
         *
         * @return the GType
         */
        public fun getType(): GType = adw_enum_list_item_get_type()

        /**
         * Gets the GType of from the symbol `adw_enum_list_item_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_enum_list_item_get_type")
    }
}
