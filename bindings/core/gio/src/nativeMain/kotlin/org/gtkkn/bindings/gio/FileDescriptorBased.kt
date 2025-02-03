// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_24
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GFileDescriptorBased
import org.gtkkn.native.gio.g_file_descriptor_based_get_fd
import org.gtkkn.native.gio.g_file_descriptor_based_get_type
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType

/**
 * `GFileDescriptorBased` is an interface for file descriptor based IO.
 *
 * It is implemented by streams (implementations of [class@Gio.InputStream] or
 * [class@Gio.OutputStream]) that are based on file descriptors.
 *
 * Note that `<gio/gfiledescriptorbased.h>` belongs to the UNIX-specific
 * GIO interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config
 * file or the `GioUnix-2.0` GIR namespace when using it.
 * @since 2.24
 */
@GioVersion2_24
public interface FileDescriptorBased :
    Proxy,
    KGTyped {
    public val gioFileDescriptorBasedPointer: CPointer<GFileDescriptorBased>

    /**
     * Gets the underlying file descriptor.
     *
     * @return The file descriptor
     * @since 2.24
     */
    @GioVersion2_24
    public fun getFd(): gint = g_file_descriptor_based_get_fd(gioFileDescriptorBasedPointer)

    /**
     * The FileDescriptorBasedImpl type represents a native instance of the FileDescriptorBased interface.
     *
     * @constructor Creates a new instance of FileDescriptorBased for the provided [CPointer].
     */
    public class FileDescriptorBasedImpl(gioFileDescriptorBasedPointer: CPointer<GFileDescriptorBased>) :
        Object(gioFileDescriptorBasedPointer.reinterpret()),
        FileDescriptorBased {
        init {
            Gio
        }

        override val gioFileDescriptorBasedPointer: CPointer<GFileDescriptorBased> =
            gioFileDescriptorBasedPointer
    }

    public companion object : TypeCompanion<FileDescriptorBased> {
        override val type: GeneratedInterfaceKGType<FileDescriptorBased> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { FileDescriptorBasedImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of FileDescriptorBased
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_descriptor_based_get_type()

        /**
         * Gets the GType of from the symbol `g_file_descriptor_based_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_file_descriptor_based_get_type")
    }
}
