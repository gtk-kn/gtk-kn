// This is a generated file. Do not modify.
package org.gtkkn.bindings.gmodule

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.native.gmodule.g_module_build_path
import org.gtkkn.native.gmodule.g_module_error
import org.gtkkn.native.gmodule.g_module_error_quark
import org.gtkkn.native.gmodule.g_module_supported
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - callback `ModuleCheckInit`: Callback with String return value is not supported
 * - record `Module`: Disguised records are ignored
 */
public object Gmodule {
    /**
     * A portable way to build the filename of a module. The platform-specific
     * prefix and suffix are added to the filename, if needed, and the result
     * is added to the directory, using the correct separator character.
     *
     * The directory should specify the directory where the module can be found.
     * It can be null or an empty string to indicate that the module is in a
     * standard platform-specific directory, though this is not recommended
     * since the wrong module may be found.
     *
     * For example, calling g_module_build_path() on a Linux system with a
     * @directory of `/lib` and a @module_name of "mylibrary" will return
     * `/lib/libmylibrary.so`. On a Windows system, using `\Windows` as the
     * directory it will return `\Windows\mylibrary.dll`.
     *
     * @param directory the directory where the module is. This can be
     *     null or the empty string to indicate that the standard platform-specific
     *     directories will be used, though that is not recommended
     * @param moduleName the name of the module
     * @return the complete path of the module, including the standard library
     *     prefix and suffix. This should be freed when no longer needed
     */
    public fun moduleBuildPath(
        directory: String? = null,
        moduleName: String,
    ): String =
        g_module_build_path(directory, moduleName)?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets a string describing the last module error.
     *
     * @return a string describing the last module error
     */
    public fun moduleError(): String =
        g_module_error()?.toKString()
            ?: error("Expected not null string")

    public fun moduleErrorQuark(): UInt = g_module_error_quark()

    /**
     * Checks if modules are supported on the current platform.
     *
     * @return true if modules are supported
     */
    public fun moduleSupported(): Boolean = g_module_supported().asBoolean()

    public fun resolveException(error: Error): GlibException {
        val ex =
            when (error.domain) {
                ModuleError.quark() ->
                    ModuleError.fromErrorOrNull(error)
                        ?.let {
                            ModuleErrorException(error, it)
                        }
                else -> null
            }
        return ex ?: GlibException(error)
    }
}

public val ModuleUnloadFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

/**
 * Specifies the type of the module function called when it is unloaded.
 * If a module contains a function named g_module_unload() it is called
 * automatically when the module is unloaded.
 * It is passed the #GModule structure.
 */
public typealias ModuleUnload = () -> Unit
