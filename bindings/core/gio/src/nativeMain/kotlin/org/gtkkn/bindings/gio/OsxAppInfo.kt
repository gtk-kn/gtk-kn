// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GAppInfo
import org.gtkkn.native.gio.GOsxAppInfo
import org.gtkkn.native.gio.g_osx_app_info_get_all_for_scheme
import org.gtkkn.native.gio.g_osx_app_info_get_filename
import org.gtkkn.native.gio.g_osx_app_info_get_type
import org.gtkkn.native.gobject.GType
import kotlin.String

public open class OsxAppInfo(public val gioOsxAppInfoPointer: CPointer<GOsxAppInfo>) :
    Object(gioOsxAppInfoPointer.reinterpret()),
    AppInfo,
    KGTyped {
    init {
        Gio
    }

    override val gioAppInfoPointer: CPointer<GAppInfo>
        get() = handle.reinterpret()

    public open fun getFilename(): String =
        g_osx_app_info_get_filename(gioOsxAppInfoPointer)?.toKString() ?: error("Expected not null string")

    public companion object : TypeCompanion<OsxAppInfo> {
        override val type: GeneratedClassKGType<OsxAppInfo> =
            GeneratedClassKGType(getTypeOrNull()!!) { OsxAppInfo(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun getAllForScheme(scheme: String): List = g_osx_app_info_get_all_for_scheme(scheme)!!.run {
            List(this)
        }

        /**
         * Get the GType of OsxAppInfo
         *
         * @return the GType
         */
        public fun getType(): GType = g_osx_app_info_get_type()

        /**
         * Gets the GType of from the symbol `g_osx_app_info_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_osx_app_info_get_type")
    }
}
