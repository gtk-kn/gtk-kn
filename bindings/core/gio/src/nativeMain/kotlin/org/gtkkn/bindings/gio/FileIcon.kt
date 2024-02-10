// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GFileIcon
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.GLoadableIcon
import org.gtkkn.native.gio.g_file_icon_get_file
import org.gtkkn.native.gio.g_file_icon_get_type
import org.gtkkn.native.gio.g_file_icon_new

/**
 * #GFileIcon specifies an icon by pointing to an image file
 * to be used as icon.
 */
public open class FileIcon(
    pointer: CPointer<GFileIcon>,
) : Object(pointer.reinterpret()), Icon, LoadableIcon, KGTyped {
    public val gioFileIconPointer: CPointer<GFileIcon>
        get() = gPointer.reinterpret()

    override val gioIconPointer: CPointer<GIcon>
        get() = gPointer.reinterpret()

    override val gioLoadableIconPointer: CPointer<GLoadableIcon>
        get() = gPointer.reinterpret()

    /**
     * The file containing the icon.
     */
    public open val `file`: File
        /**
         * Gets the #GFile associated with the given @icon.
         *
         * @return a #GFile.
         */
        get() =
            g_file_icon_get_file(gioFileIconPointer.reinterpret())!!.run {
                File.wrap(reinterpret())
            }

    /**
     * Creates a new icon for a file.
     *
     * @param file a #GFile.
     * @return a #GIcon for the given
     *   @file, or null on error.
     */
    public constructor(`file`: File) : this(g_file_icon_new(`file`.gioFilePointer)!!.reinterpret())

    /**
     * Gets the #GFile associated with the given @icon.
     *
     * @return a #GFile.
     */
    public open fun getFile(): File =
        g_file_icon_get_file(gioFileIconPointer.reinterpret())!!.run {
            File.wrap(reinterpret())
        }

    public companion object : TypeCompanion<FileIcon> {
        override val type: GeneratedClassKGType<FileIcon> =
            GeneratedClassKGType(g_file_icon_get_type()) { FileIcon(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
