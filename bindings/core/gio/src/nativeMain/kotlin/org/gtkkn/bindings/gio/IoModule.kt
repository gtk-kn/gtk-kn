// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_24
import org.gtkkn.bindings.gobject.TypeModule
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GIOModule
import org.gtkkn.native.gio.g_io_module_get_type
import org.gtkkn.native.gio.g_io_module_new
import org.gtkkn.native.gio.g_io_module_query
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.GTypePlugin
import kotlin.String
import kotlin.collections.List

/**
 * Provides an interface and default functions for loading and unloading
 * modules. This is used internally to make GIO extensible, but can also
 * be used by others to implement module loading.
 */
public open class IoModule(public val gioIoModulePointer: CPointer<GIOModule>) :
    TypeModule(gioIoModulePointer.reinterpret()),
    KGTyped {
    init {
        Gio
    }

    override val gobjectTypePluginPointer: CPointer<GTypePlugin>
        get() = handle.reinterpret()

    /**
     * Creates a new GIOModule that will load the specific
     * shared library when in use.
     *
     * @param filename filename of the shared library module.
     * @return a #GIOModule from given @filename,
     * or null on error.
     */
    public constructor(filename: String) : this(g_io_module_new(filename)!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<IoModule> {
        override val type: GeneratedClassKGType<IoModule> =
            GeneratedClassKGType(getTypeOrNull()!!) { IoModule(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Optional API for GIO modules to implement.
         *
         * Should return a list of all the extension points that may be
         * implemented in this module.
         *
         * This method will not be called in normal use, however it may be
         * called when probing existing modules and recording which extension
         * points that this model is used for. This means we won't have to
         * load and initialize this module unless its needed.
         *
         * If this function is not implemented by the module the module will
         * always be loaded, initialized and then unloaded on application
         * startup so that it can register its extension points during init.
         *
         * Note that a module need not actually implement all the extension
         * points that g_io_module_query() returns, since the exact list of
         * extension may depend on runtime issues. However all extension
         * points actually implemented must be returned by g_io_module_query()
         * (if defined).
         *
         * When installing a module that implements g_io_module_query() you must
         * run gio-querymodules in order to build the cache files required for
         * lazy loading.
         *
         * Since 2.56, this function should be named `g_io_<modulename>_query`, where
         * `modulename` is the plugin’s filename with the `lib` or `libgio` prefix and
         * everything after the first dot removed, and with `-` replaced with `_`
         * throughout. For example, `libgiognutls-helper.so` becomes `gnutls_helper`.
         * Using the new symbol names avoids name clashes when building modules
         * statically. The old symbol names continue to be supported, but cannot be used
         * for static builds.
         *
         * @return A null-terminated array of strings,
         *     listing the supported extension points of the module. The array
         *     must be suitable for freeing with g_strfreev().
         * @since 2.24
         */
        @GioVersion2_24
        public fun query(): List<String> =
            g_io_module_query()?.toKStringList() ?: error("Expected not null string array")

        /**
         * Get the GType of IOModule
         *
         * @return the GType
         */
        public fun getType(): GType = g_io_module_get_type()

        /**
         * Gets the GType of from the symbol `g_io_module_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_io_module_get_type")
    }
}
