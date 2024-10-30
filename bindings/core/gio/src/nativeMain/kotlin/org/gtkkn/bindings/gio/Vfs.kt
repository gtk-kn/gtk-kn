// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GVfs
import org.gtkkn.native.gio.g_vfs_get_default
import org.gtkkn.native.gio.g_vfs_get_file_for_path
import org.gtkkn.native.gio.g_vfs_get_file_for_uri
import org.gtkkn.native.gio.g_vfs_get_local
import org.gtkkn.native.gio.g_vfs_get_supported_uri_schemes
import org.gtkkn.native.gio.g_vfs_get_type
import org.gtkkn.native.gio.g_vfs_is_active
import org.gtkkn.native.gio.g_vfs_parse_name
import org.gtkkn.native.gio.g_vfs_unregister_uri_scheme
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Entry point for using GIO functionality.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `parse_name_func`: VfsFileLookupFunc
 */
public open class Vfs(
    pointer: CPointer<GVfs>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gioVfsPointer: CPointer<GVfs>
        get() = gPointer.reinterpret()

    /**
     * Gets a #GFile for @path.
     *
     * @param path a string containing a VFS path.
     * @return a #GFile.
     *     Free the returned object with g_object_unref().
     */
    public open fun getFileForPath(path: String): File =
        g_vfs_get_file_for_path(gioVfsPointer.reinterpret(), path)!!.run {
            File.wrap(reinterpret())
        }

    /**
     * Gets a #GFile for @uri.
     *
     * This operation never fails, but the returned object
     * might not support any I/O operation if the URI
     * is malformed or if the URI scheme is not supported.
     *
     * @param uri a string containing a URI
     * @return a #GFile.
     *     Free the returned object with g_object_unref().
     */
    public open fun getFileForUri(uri: String): File =
        g_vfs_get_file_for_uri(gioVfsPointer.reinterpret(), uri)!!.run {
            File.wrap(reinterpret())
        }

    /**
     * Gets a list of URI schemes supported by @vfs.
     *
     * @return a null-terminated array of strings.
     *     The returned array belongs to GIO and must
     *     not be freed or modified.
     */
    public open fun getSupportedUriSchemes(): List<String> =
        g_vfs_get_supported_uri_schemes(gioVfsPointer.reinterpret())?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Checks if the VFS is active.
     *
     * @return true if construction of the @vfs was successful
     *     and it is now active.
     */
    public open fun isActive(): Boolean = g_vfs_is_active(gioVfsPointer.reinterpret()).asBoolean()

    /**
     * This operation never fails, but the returned object might
     * not support any I/O operations if the @parse_name cannot
     * be parsed by the #GVfs module.
     *
     * @param parseName a string to be parsed by the VFS module.
     * @return a #GFile for the given @parse_name.
     *     Free the returned object with g_object_unref().
     */
    public open fun parseName(parseName: String): File =
        g_vfs_parse_name(gioVfsPointer.reinterpret(), parseName)!!.run {
            File.wrap(reinterpret())
        }

    /**
     * Unregisters the URI handler for @scheme previously registered with
     * g_vfs_register_uri_scheme().
     *
     * @param scheme an URI scheme, e.g. "http"
     * @return true if @scheme was successfully unregistered, or false if a
     *     handler for @scheme does not exist.
     * @since 2.50
     */
    public open fun unregisterUriScheme(scheme: String): Boolean =
        g_vfs_unregister_uri_scheme(gioVfsPointer.reinterpret(), scheme).asBoolean()

    public companion object : TypeCompanion<Vfs> {
        override val type: GeneratedClassKGType<Vfs> =
            GeneratedClassKGType(g_vfs_get_type()) { Vfs(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Gets the default #GVfs for the system.
         *
         * @return a #GVfs, which will be the local
         *     file system #GVfs if no other implementation is available.
         */
        public fun getDefault(): Vfs =
            g_vfs_get_default()!!.run {
                Vfs(reinterpret())
            }

        /**
         * Gets the local #GVfs for the system.
         *
         * @return a #GVfs.
         */
        public fun getLocal(): Vfs =
            g_vfs_get_local()!!.run {
                Vfs(reinterpret())
            }
    }
}
