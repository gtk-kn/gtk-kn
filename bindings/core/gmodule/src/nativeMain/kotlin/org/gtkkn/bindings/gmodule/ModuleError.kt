// This is a generated file. Do not modify.
package org.gtkkn.bindings.gmodule

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gmodule.annotations.GModuleVersion2_70
import org.gtkkn.native.glib.g_quark_from_string
import org.gtkkn.native.gmodule.GModuleError
import org.gtkkn.native.gmodule.GModuleError.G_MODULE_ERROR_CHECK_FAILED
import org.gtkkn.native.gmodule.GModuleError.G_MODULE_ERROR_FAILED
import kotlin.UInt

/**
 * Errors returned by g_module_open_full().
 * @since 2.70
 */
@GModuleVersion2_70
public enum class ModuleError(
    public val nativeValue: GModuleError,
) {
    /**
     * there was an error loading or opening a module file
     */
    FAILED(G_MODULE_ERROR_FAILED),

    /**
     * a module returned an error from its `g_module_check_init()` function
     */
    CHECK_FAILED(G_MODULE_ERROR_CHECK_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GModuleError): ModuleError =
            when (nativeValue) {
                G_MODULE_ERROR_FAILED -> FAILED
                G_MODULE_ERROR_CHECK_FAILED -> CHECK_FAILED
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = g_quark_from_string("g-module-error-quark")

        public fun fromErrorOrNull(error: Error): ModuleError? =
            if (error.domain != quark()) {
                null
            } else {
                ModuleError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
