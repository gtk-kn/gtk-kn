// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GFileAttributeInfoList
import org.gtkkn.native.gio.g_file_attribute_info_list_add
import org.gtkkn.native.gio.g_file_attribute_info_list_dup
import org.gtkkn.native.gio.g_file_attribute_info_list_get_type
import org.gtkkn.native.gio.g_file_attribute_info_list_lookup
import org.gtkkn.native.gio.g_file_attribute_info_list_new
import org.gtkkn.native.gio.g_file_attribute_info_list_ref
import org.gtkkn.native.gio.g_file_attribute_info_list_unref
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import kotlin.String
import kotlin.Unit

/**
 * Acts as a lightweight registry for possible valid file attributes.
 * The registry stores Key-Value pair formats as #GFileAttributeInfos.
 */
public class FileAttributeInfoList(pointer: CPointer<GFileAttributeInfoList>) : ProxyInstance(pointer) {
    public val gioFileAttributeInfoListPointer: CPointer<GFileAttributeInfoList> = pointer

    /**
     * an array of #GFileAttributeInfos.
     */
    public var infos: FileAttributeInfo?
        get() = gioFileAttributeInfoListPointer.pointed.infos?.run {
            FileAttributeInfo(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            gioFileAttributeInfoListPointer.pointed.infos = value?.gioFileAttributeInfoPointer
        }

    /**
     * the number of values in the array.
     */
    public var nInfos: gint
        get() = gioFileAttributeInfoListPointer.pointed.n_infos

        @UnsafeFieldSetter
        set(`value`) {
            gioFileAttributeInfoListPointer.pointed.n_infos = value
        }

    /**
     * Adds a new attribute with @name to the @list, setting
     * its @type and @flags.
     *
     * @param name the name of the attribute to add.
     * @param type the #GFileAttributeType for the attribute.
     * @param flags #GFileAttributeInfoFlags for the attribute.
     */
    public fun add(name: String, type: FileAttributeType, flags: FileAttributeInfoFlags): Unit =
        g_file_attribute_info_list_add(
            gioFileAttributeInfoListPointer.reinterpret(),
            name,
            type.nativeValue,
            flags.mask
        )

    /**
     * Makes a duplicate of a file attribute info list.
     *
     * @return a copy of the given @list.
     */
    public fun dup(): FileAttributeInfoList =
        g_file_attribute_info_list_dup(gioFileAttributeInfoListPointer.reinterpret())!!.run {
            FileAttributeInfoList(reinterpret())
        }

    /**
     * Gets the file attribute with the name @name from @list.
     *
     * @param name the name of the attribute to look up.
     * @return a #GFileAttributeInfo for the @name, or null if an
     * attribute isn't found.
     */
    public fun lookup(name: String): FileAttributeInfo =
        g_file_attribute_info_list_lookup(gioFileAttributeInfoListPointer.reinterpret(), name)!!.run {
            FileAttributeInfo(reinterpret())
        }

    /**
     * References a file attribute info list.
     *
     * @return #GFileAttributeInfoList or null on error.
     */
    public fun ref(): FileAttributeInfoList =
        g_file_attribute_info_list_ref(gioFileAttributeInfoListPointer.reinterpret())!!.run {
            FileAttributeInfoList(reinterpret())
        }

    /**
     * Removes a reference from the given @list. If the reference count
     * falls to zero, the @list is deleted.
     */
    public fun unref(): Unit = g_file_attribute_info_list_unref(gioFileAttributeInfoListPointer.reinterpret())

    override fun toString(): String = "FileAttributeInfoList(infos=$infos, nInfos=$nInfos)"

    public companion object {
        /**
         * Creates a new file attribute info list.
         *
         * @return a #GFileAttributeInfoList.
         */
        public fun new(): FileAttributeInfoList =
            FileAttributeInfoList(g_file_attribute_info_list_new()!!.reinterpret())

        /**
         * Get the GType of FileAttributeInfoList
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_attribute_info_list_get_type()
    }
}
