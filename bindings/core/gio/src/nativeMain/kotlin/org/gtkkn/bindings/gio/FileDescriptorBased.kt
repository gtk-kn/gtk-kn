// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GFileDescriptorBased
import org.gtkkn.native.gio.g_file_descriptor_based_get_fd
import org.gtkkn.native.gio.g_file_descriptor_based_get_type
import kotlin.Int

/**
 * #GFileDescriptorBased is implemented by streams (implementations of
 * #GInputStream or #GOutputStream) that are based on file descriptors.
 *
 * Note that `<gio/gfiledescriptorbased.h>` belongs to the UNIX-specific
 * GIO interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config
 * file when using it.
 * @since 2.24
 */
public interface FileDescriptorBased : Interface, KGTyped {
    public val gioFileDescriptorBasedPointer: CPointer<GFileDescriptorBased>

    /**
     * Gets the underlying file descriptor.
     *
     * @return The file descriptor
     * @since 2.24
     */
    public fun getFd(): Int = g_file_descriptor_based_get_fd(gioFileDescriptorBasedPointer.reinterpret())

    private data class Wrapper(
        private val pointer: CPointer<GFileDescriptorBased>,
    ) : FileDescriptorBased {
        override val gioFileDescriptorBasedPointer: CPointer<GFileDescriptorBased> = pointer
    }

    public companion object : TypeCompanion<FileDescriptorBased> {
        override val type: GeneratedInterfaceKGType<FileDescriptorBased> =
            GeneratedInterfaceKGType(g_file_descriptor_based_get_type()) {
                Wrapper(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GFileDescriptorBased>): FileDescriptorBased = Wrapper(pointer)
    }
}
