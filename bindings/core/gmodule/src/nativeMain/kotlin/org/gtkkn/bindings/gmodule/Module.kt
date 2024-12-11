// This is a generated file. Do not modify.
package org.gtkkn.bindings.gmodule

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gmodule.GModule
import org.gtkkn.native.gmodule.g_module_build_path
import org.gtkkn.native.gmodule.g_module_close
import org.gtkkn.native.gmodule.g_module_error
import org.gtkkn.native.gmodule.g_module_error_quark
import org.gtkkn.native.gmodule.g_module_make_resident
import org.gtkkn.native.gmodule.g_module_name
import org.gtkkn.native.gmodule.g_module_supported
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The #GModule struct is an opaque data structure to represent a
 * [dynamically-loaded module][glib-Dynamic-Loading-of-Modules].
 * It should only be accessed via the following functions.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `symbol`: symbol: Out parameter is not supported
 * - function `open`: Return type Module is unsupported
 * - function `open_full`: Return type Module is unsupported
 */
public class Module(pointer: CPointer<GModule>) : ProxyInstance(pointer) {
    public val gmoduleModulePointer: CPointer<GModule> = pointer

    /**
     * Closes a module.
     *
     * @return true on success
     */
    public fun close(): Boolean = g_module_close(gmoduleModulePointer.reinterpret()).asBoolean()

    /**
     * Ensures that a module will never be unloaded.
     * Any future g_module_close() calls on the module will be ignored.
     */
    public fun makeResident(): Unit = g_module_make_resident(gmoduleModulePointer.reinterpret())

    /**
     * Returns the filename that the module was opened with.
     *
     * If @module refers to the application itself, "main" is returned.
     *
     * @return the filename of the module
     */
    public fun name(): String =
        g_module_name(gmoduleModulePointer.reinterpret())?.toKString() ?: error("Expected not null string")

    public companion object {
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
        public fun buildPath(directory: String? = null, moduleName: String): String =
            g_module_build_path(directory, moduleName)?.toKString() ?: error("Expected not null string")

        /**
         * Gets a string describing the last module error.
         *
         * @return a string describing the last module error
         */
        public fun error(): String = g_module_error()?.toKString() ?: error("Expected not null string")

        public fun errorQuark(): Quark = g_module_error_quark()

        /**
         * Checks if modules are supported on the current platform.
         *
         * @return true if modules are supported
         */
        public fun supported(): Boolean = g_module_supported().asBoolean()
    }
}
