// This is a generated file. Do not modify.
package org.gtkkn.bindings.gmodule

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.bindings.gmodule.GModule.resolveException
import org.gtkkn.bindings.gmodule.annotations.GModuleVersion2_70
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gmodule.GModule
import org.gtkkn.native.gmodule.g_module_build_path
import org.gtkkn.native.gmodule.g_module_close
import org.gtkkn.native.gmodule.g_module_error
import org.gtkkn.native.gmodule.g_module_error_quark
import org.gtkkn.native.gmodule.g_module_make_resident
import org.gtkkn.native.gmodule.g_module_name
import org.gtkkn.native.gmodule.g_module_open
import org.gtkkn.native.gmodule.g_module_open_full
import org.gtkkn.native.gmodule.g_module_supported
import kotlin.Boolean
import kotlin.Result
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
 */
public class Module(public val gmoduleModulePointer: CPointer<GModule>) : ProxyInstance(gmoduleModulePointer) {
    /**
     * Closes a module.
     *
     * @return true on success
     */
    public fun close(): Boolean = g_module_close(gmoduleModulePointer).asBoolean()

    /**
     * Ensures that a module will never be unloaded.
     * Any future g_module_close() calls on the module will be ignored.
     */
    public fun makeResident(): Unit = g_module_make_resident(gmoduleModulePointer)

    /**
     * Returns the filename that the module was opened with.
     *
     * If @module refers to the application itself, "main" is returned.
     *
     * @return the filename of the module
     */
    public fun name(): String = g_module_name(gmoduleModulePointer)?.toKString() ?: error("Expected not null string")

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
         * A thin wrapper function around g_module_open_full()
         *
         * @param fileName the name or path to the file containing the module,
         *     or null to obtain a #GModule representing the main program itself
         * @param flags the flags used for opening the module. This can be the
         *     logical OR of any of the #GModuleFlags.
         * @return a #GModule on success, or null on failure
         */
        public fun `open`(fileName: String? = null, flags: ModuleFlags): Module =
            g_module_open(fileName, flags.mask)!!.run {
                Module(this)
            }

        /**
         * Opens a module. If the module has already been opened, its reference count
         * is incremented. If not, the module is searched using @file_name.
         *
         * Since 2.76, the search order/behavior is as follows:
         *
         * 1. If @file_name exists as a regular file, it is used as-is; else
         * 2. If @file_name doesn't have the correct suffix and/or prefix for the
         *    platform, then possible suffixes and prefixes will be added to the
         *    basename till a file is found and whatever is found will be used; else
         * 3. If @file_name doesn't have the ".la"-suffix, ".la" is appended. Either
         *    way, if a matching .la file exists (and is a libtool archive) the
         *    libtool archive is parsed to find the actual file name, and that is
         *    used.
         *
         * If, at the end of all this, we have a file path that we can access on disk,
         * it is opened as a module. If not, @file_name is attempted to be opened as a
         * module verbatim in the hopes that the system implementation will somehow be
         * able to access it. If that is not possible, null is returned.
         *
         * Note that this behaviour was different prior to 2.76, but there is some
         * overlap in functionality. If backwards compatibility is an issue, kindly
         * consult earlier #GModule documentation for the prior search order/behavior
         * of @file_name.
         *
         * @param fileName the name or path to the file containing the module,
         *     or null to obtain a #GModule representing the main program itself
         * @param flags the flags used for opening the module. This can be the
         *     logical OR of any of the #GModuleFlags
         * @return a #GModule on success, or null on failure
         * @since 2.70
         */
        @GModuleVersion2_70
        public fun openFull(fileName: String? = null, flags: ModuleFlags): Result<Module> = memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_module_open_full(fileName, flags.mask, gError.ptr)?.run {
                Module(this)
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

        /**
         * Checks if modules are supported on the current platform.
         *
         * @return true if modules are supported
         */
        public fun supported(): Boolean = g_module_supported().asBoolean()
    }
}
