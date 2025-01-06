// This is a generated file. Do not modify.
package org.gtkkn.bindings.gmodule

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gmodule.GModule
import kotlin.String
import kotlin.Unit

public object GModule {
    public const val MODULE_IMPL_AR: gint = 7

    public const val MODULE_IMPL_DL: gint = 1

    public const val MODULE_IMPL_NONE: gint = 0

    public const val MODULE_IMPL_WIN32: gint = 3

    public fun resolveException(error: Error): GLibException {
        val ex = when (error.domain) {
            ModuleError.quark() -> ModuleError.fromErrorOrNull(error)
                ?.let {
                    ModuleErrorException(error, it)
                }
            else -> null
        }
        return ex ?: GLibException(error)
    }
}

public val ModuleCheckInitFunc: CPointer<CFunction<(CPointer<GModule>) -> CPointer<ByteVar>>> =
    staticCFunction {
            module: CPointer<GModule>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(module: Module) -> String>().get().invoke(
            module!!.run {
                Module(reinterpret())
            }
        ).let { g_strdup(it) }
    }
        .reinterpret()

public val ModuleUnloadFunc: CPointer<CFunction<(CPointer<GModule>) -> Unit>> = staticCFunction {
        module: CPointer<GModule>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(module: Module) -> Unit>().get().invoke(
        module!!.run {
            Module(reinterpret())
        }
    )
}
    .reinterpret()

/**
 * Specifies the type of the module initialization function.
 * If a module contains a function named g_module_check_init() it is called
 * automatically when the module is loaded. It is passed the #GModule structure
 * and should return null on success or a string describing the initialization
 * error.
 *
 * - param `module` the #GModule corresponding to the module which has just been loaded
 * - return null on success, or a string describing the initialization error
 */
public typealias ModuleCheckInit = (module: Module) -> String

/**
 * Specifies the type of the module function called when it is unloaded.
 * If a module contains a function named g_module_unload() it is called
 * automatically when the module is unloaded.
 * It is passed the #GModule structure.
 *
 * - param `module` the #GModule about to be unloaded
 */
public typealias ModuleUnload = (module: Module) -> Unit
