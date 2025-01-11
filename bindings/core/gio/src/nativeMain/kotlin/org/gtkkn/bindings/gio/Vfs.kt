// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_50
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
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
import org.gtkkn.native.gio.g_vfs_register_uri_scheme
import org.gtkkn.native.gio.g_vfs_unregister_uri_scheme
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Entry point for using GIO functionality.
 */
public open class Vfs(public val gioVfsPointer: CPointer<GVfs>) :
    Object(gioVfsPointer.reinterpret()),
    KGTyped {
    /**
     * Gets a #GFile for @path.
     *
     * @param path a string containing a VFS path.
     * @return a #GFile.
     *     Free the returned object with g_object_unref().
     */
    public open fun getFileForPath(path: String): File = g_vfs_get_file_for_path(gioVfsPointer, path)!!.run {
        File.FileImpl(reinterpret())
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
    public open fun getFileForUri(uri: String): File = g_vfs_get_file_for_uri(gioVfsPointer, uri)!!.run {
        File.FileImpl(reinterpret())
    }

    /**
     * Gets a list of URI schemes supported by @vfs.
     *
     * @return a null-terminated array of strings.
     *     The returned array belongs to GIO and must
     *     not be freed or modified.
     */
    public open fun getSupportedUriSchemes(): List<String> =
        g_vfs_get_supported_uri_schemes(gioVfsPointer)?.toKStringList() ?: error("Expected not null string array")

    /**
     * Checks if the VFS is active.
     *
     * @return true if construction of the @vfs was successful
     *     and it is now active.
     */
    public open fun isActive(): Boolean = g_vfs_is_active(gioVfsPointer).asBoolean()

    /**
     * This operation never fails, but the returned object might
     * not support any I/O operations if the @parse_name cannot
     * be parsed by the #GVfs module.
     *
     * @param parseName a string to be parsed by the VFS module.
     * @return a #GFile for the given @parse_name.
     *     Free the returned object with g_object_unref().
     */
    public open fun parseName(parseName: String): File = g_vfs_parse_name(gioVfsPointer, parseName)!!.run {
        File.FileImpl(reinterpret())
    }

    /**
     * Registers @uri_func and @parse_name_func as the #GFile URI and parse name
     * lookup functions for URIs with a scheme matching @scheme.
     * Note that @scheme is registered only within the running application, as
     * opposed to desktop-wide as it happens with GVfs backends.
     *
     * When a #GFile is requested with an URI containing @scheme (e.g. through
     * g_file_new_for_uri()), @uri_func will be called to allow a custom
     * constructor. The implementation of @uri_func should not be blocking, and
     * must not call g_vfs_register_uri_scheme() or g_vfs_unregister_uri_scheme().
     *
     * When g_file_parse_name() is called with a parse name obtained from such file,
     * @parse_name_func will be called to allow the #GFile to be created again. In
     * that case, it's responsibility of @parse_name_func to make sure the parse
     * name matches what the custom #GFile implementation returned when
     * g_file_get_parse_name() was previously called. The implementation of
     * @parse_name_func should not be blocking, and must not call
     * g_vfs_register_uri_scheme() or g_vfs_unregister_uri_scheme().
     *
     * It's an error to call this function twice with the same scheme. To unregister
     * a custom URI scheme, use g_vfs_unregister_uri_scheme().
     *
     * @param scheme an URI scheme, e.g. "http"
     * @param uriFunc a #GVfsFileLookupFunc
     * @param parseNameFunc a #GVfsFileLookupFunc
     * @return true if @scheme was successfully registered, or false if a handler
     *     for @scheme already exists.
     * @since 2.50
     */
    @GioVersion2_50
    public open fun registerUriScheme(
        scheme: String,
        uriFunc: VfsFileLookupFunc?,
        parseNameFunc: VfsFileLookupFunc?,
    ): Boolean = g_vfs_register_uri_scheme(
        gioVfsPointer,
        scheme,
        uriFunc?.let {
            VfsFileLookupFuncFunc.reinterpret()
        },
        uriFunc?.let {
            StableRef.create(uriFunc).asCPointer()
        },
        uriFunc?.let {
            staticStableRefDestroy.reinterpret()
        },
        parseNameFunc?.let {
            VfsFileLookupFuncFunc.reinterpret()
        },
        parseNameFunc?.let {
            StableRef.create(parseNameFunc).asCPointer()
        },
        parseNameFunc?.let { staticStableRefDestroy.reinterpret() }
    ).asBoolean()

    /**
     * Unregisters the URI handler for @scheme previously registered with
     * g_vfs_register_uri_scheme().
     *
     * @param scheme an URI scheme, e.g. "http"
     * @return true if @scheme was successfully unregistered, or false if a
     *     handler for @scheme does not exist.
     * @since 2.50
     */
    @GioVersion2_50
    public open fun unregisterUriScheme(scheme: String): Boolean =
        g_vfs_unregister_uri_scheme(gioVfsPointer, scheme).asBoolean()

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
        public fun getDefault(): Vfs = g_vfs_get_default()!!.run {
            Vfs(this)
        }

        /**
         * Gets the local #GVfs for the system.
         *
         * @return a #GVfs.
         */
        public fun getLocal(): Vfs = g_vfs_get_local()!!.run {
            Vfs(this)
        }

        /**
         * Get the GType of Vfs
         *
         * @return the GType
         */
        public fun getType(): GType = g_vfs_get_type()
    }
}
