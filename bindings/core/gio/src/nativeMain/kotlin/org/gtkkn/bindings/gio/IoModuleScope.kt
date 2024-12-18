// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GIOModuleScope
import org.gtkkn.native.gio.g_io_module_scope_block
import org.gtkkn.native.gio.g_io_module_scope_free
import kotlin.String
import kotlin.Unit

/**
 * Represents a scope for loading IO modules. A scope can be used for blocking
 * duplicate modules, or blocking a module you don't want to load.
 *
 * The scope can be used with g_io_modules_load_all_in_directory_with_scope()
 * or g_io_modules_scan_all_in_directory_with_scope().
 *
 * ## Skipped during bindings generation
 *
 * - function `new`: Return type IOModuleScope is unsupported
 *
 * @since 2.30
 */
@GioVersion2_30
public class IoModuleScope(pointer: CPointer<GIOModuleScope>) : ProxyInstance(pointer) {
    public val gioIOModuleScopePointer: CPointer<GIOModuleScope> = pointer

    /**
     * Block modules with the given @basename from being loaded when
     * this scope is used with g_io_modules_scan_all_in_directory_with_scope()
     * or g_io_modules_load_all_in_directory_with_scope().
     *
     * @param basename the basename to block
     * @since 2.30
     */
    @GioVersion2_30
    public fun block(basename: String): Unit = g_io_module_scope_block(gioIOModuleScopePointer.reinterpret(), basename)

    /**
     * Free a module scope.
     *
     * @since 2.30
     */
    @GioVersion2_30
    public fun free(): Unit = g_io_module_scope_free(gioIOModuleScopePointer.reinterpret())
}