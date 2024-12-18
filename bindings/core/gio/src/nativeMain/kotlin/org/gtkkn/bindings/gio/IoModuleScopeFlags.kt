// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.native.gio.GIOModuleScopeFlags
import org.gtkkn.native.gio.g_io_module_scope_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags for use with g_io_module_scope_new().
 * @since 2.30
 */
@GioVersion2_30
public enum class IoModuleScopeFlags(public val nativeValue: GIOModuleScopeFlags) {
    /**
     * No module scan flags
     */
    NONE(GIOModuleScopeFlags.G_IO_MODULE_SCOPE_NONE),

    /**
     * When using this scope to load or
     *     scan modules, automatically block a modules which has the same base
     *     basename as previously loaded module.
     */
    BLOCK_DUPLICATES(GIOModuleScopeFlags.G_IO_MODULE_SCOPE_BLOCK_DUPLICATES),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GIOModuleScopeFlags): IoModuleScopeFlags = when (nativeValue) {
            GIOModuleScopeFlags.G_IO_MODULE_SCOPE_NONE -> NONE
            GIOModuleScopeFlags.G_IO_MODULE_SCOPE_BLOCK_DUPLICATES -> BLOCK_DUPLICATES
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of IOModuleScopeFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_io_module_scope_flags_get_type()
    }
}
