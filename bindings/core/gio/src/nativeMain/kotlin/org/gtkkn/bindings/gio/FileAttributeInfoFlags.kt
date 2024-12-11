// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GFileAttributeInfoFlags
import org.gtkkn.native.gio.G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED
import org.gtkkn.native.gio.G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE
import org.gtkkn.native.gio.G_FILE_ATTRIBUTE_INFO_NONE
import org.gtkkn.native.gio.g_file_attribute_info_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags specifying the behaviour of an attribute.
 */
public class FileAttributeInfoFlags(public val mask: GFileAttributeInfoFlags) : Bitfield<FileAttributeInfoFlags> {
    override infix fun or(other: FileAttributeInfoFlags): FileAttributeInfoFlags = FileAttributeInfoFlags(
        mask or other.mask
    )

    public companion object {
        /**
         * no flags set.
         */
        public val NONE: FileAttributeInfoFlags = FileAttributeInfoFlags(G_FILE_ATTRIBUTE_INFO_NONE)

        /**
         * copy the attribute values when the file is copied.
         */
        public val COPY_WITH_FILE: FileAttributeInfoFlags =
            FileAttributeInfoFlags(G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE)

        /**
         * copy the attribute values when the file is moved.
         */
        public val COPY_WHEN_MOVED: FileAttributeInfoFlags =
            FileAttributeInfoFlags(G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED)

        /**
         * Get the GType of FileAttributeInfoFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_attribute_info_flags_get_type()
    }
}
