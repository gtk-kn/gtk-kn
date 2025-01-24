// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.native.gobject.GType

/**
 * `GFileIcon` specifies an icon by pointing to an image file
 * to be used as icon.
 *
 * It implements [iface@Gio.LoadableIcon].
 */
public open class FileIcon(public val gioFileIconPointer: CPointer<GFileIcon>) :
    Object(gioFileIconPointer.reinterpret()),
    Icon,
    LoadableIcon,
    KGTyped {
    override val gioIconPointer: CPointer<GIcon>
        get() = handle.reinterpret()

    override val gioLoadableIconPointer: CPointer<GLoadableIcon>
        get() = handle.reinterpret()

    /**
     * The file containing the icon.
     */
    public open val `file`: File
        /**
         * Gets the #GFile associated with the given @icon.
         *
         * @return a #GFile.
         */
        get() = g_file_icon_get_file(gioFileIconPointer)!!.run {
            File.FileImpl(reinterpret())
        }

    /**
     * Creates a new icon for a file.
     *
     * @param file a #GFile.
     * @return a #GIcon for the given
     *   @file, or null on error.
     */
    public constructor(`file`: File) : this(g_file_icon_new(`file`.gioFilePointer)!!.reinterpret())

    public companion object : TypeCompanion<FileIcon> {
        override val type: GeneratedClassKGType<FileIcon> =
            GeneratedClassKGType(g_file_icon_get_type()) { FileIcon(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of FileIcon
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_icon_get_type()
    }
}
