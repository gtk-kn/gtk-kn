// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GIOModuleScope
import org.gtkkn.native.gio.g_io_module_scope_block
import org.gtkkn.native.gio.g_io_module_scope_free
import org.gtkkn.native.gio.g_io_module_scope_new
import kotlin.String
import kotlin.Unit

/**
 * Represents a scope for loading IO modules. A scope can be used for blocking
 * duplicate modules, or blocking a module you don't want to load.
 *
 * The scope can be used with g_io_modules_load_all_in_directory_with_scope()
 * or g_io_modules_scan_all_in_directory_with_scope().
 * @since 2.30
 */
@GioVersion2_30
public class IoModuleScope(public val gioIoModuleScopePointer: CPointer<GIOModuleScope>) :
    ProxyInstance(gioIoModuleScopePointer) {
    /**
     * Block modules with the given @basename from being loaded when
     * this scope is used with g_io_modules_scan_all_in_directory_with_scope()
     * or g_io_modules_load_all_in_directory_with_scope().
     *
     * @param basename the basename to block
     * @since 2.30
     */
    @GioVersion2_30
    public fun block(basename: String): Unit = g_io_module_scope_block(gioIoModuleScopePointer, basename)

    /**
     * Free a module scope.
     *
     * @since 2.30
     */
    @GioVersion2_30
    public fun free(): Unit = g_io_module_scope_free(gioIoModuleScopePointer)

    public companion object {
        /**
         * Create a new scope for loading of IO modules. A scope can be used for
         * blocking duplicate modules, or blocking a module you don't want to load.
         *
         * Specify the %G_IO_MODULE_SCOPE_BLOCK_DUPLICATES flag to block modules
         * which have the same base name as a module that has already been seen
         * in this scope.
         *
         * @param flags flags for the new scope
         * @return the new module scope
         * @since 2.30
         */
        @GioVersion2_30
        public fun new(flags: IoModuleScopeFlags): IoModuleScope = g_io_module_scope_new(flags.nativeValue)!!.run {
            IoModuleScope(this)
        }
    }
}
