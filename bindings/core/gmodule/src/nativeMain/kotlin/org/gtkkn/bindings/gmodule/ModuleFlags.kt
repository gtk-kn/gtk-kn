// This is a generated file. Do not modify.
package org.gtkkn.bindings.gmodule

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gmodule.GModuleFlags
import org.gtkkn.native.gmodule.G_MODULE_BIND_LAZY
import org.gtkkn.native.gmodule.G_MODULE_BIND_LOCAL
import org.gtkkn.native.gmodule.G_MODULE_BIND_MASK

/**
 * Flags passed to g_module_open().
 * Note that these flags are not supported on all platforms.
 */
public class ModuleFlags(public val mask: GModuleFlags) : Bitfield<ModuleFlags> {
    override infix fun or(other: ModuleFlags): ModuleFlags = ModuleFlags(mask or other.mask)

    public companion object {
        /**
         * specifies that symbols are only resolved when
         *     needed. The default action is to bind all symbols when the module
         *     is loaded.
         */
        public val LAZY: ModuleFlags = ModuleFlags(G_MODULE_BIND_LAZY)

        /**
         * specifies that symbols in the module should
         *     not be added to the global name space. The default action on most
         *     platforms is to place symbols in the module in the global name space,
         *     which may cause conflicts with existing symbols.
         */
        public val LOCAL: ModuleFlags = ModuleFlags(G_MODULE_BIND_LOCAL)

        /**
         * mask for all flags.
         */
        public val MASK: ModuleFlags = ModuleFlags(G_MODULE_BIND_MASK)
    }
}
