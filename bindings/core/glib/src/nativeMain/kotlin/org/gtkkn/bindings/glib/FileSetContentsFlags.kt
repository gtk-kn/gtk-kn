// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.bindings.glib.annotations.GLibVersion2_66
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GFileSetContentsFlags
import org.gtkkn.native.glib.G_FILE_SET_CONTENTS_CONSISTENT
import org.gtkkn.native.glib.G_FILE_SET_CONTENTS_DURABLE
import org.gtkkn.native.glib.G_FILE_SET_CONTENTS_NONE
import org.gtkkn.native.glib.G_FILE_SET_CONTENTS_ONLY_EXISTING

/**
 * Flags to pass to g_file_set_contents_full() to affect its safety and
 * performance.
 * @since 2.66
 */
public class FileSetContentsFlags(public val mask: GFileSetContentsFlags) : Bitfield<FileSetContentsFlags> {
    override infix fun or(other: FileSetContentsFlags): FileSetContentsFlags = FileSetContentsFlags(mask or other.mask)

    @GLibVersion2_66
    public companion object {
        /**
         * No guarantees about file consistency or durability.
         *   The most dangerous setting, which is slightly faster than other settings.
         */
        public val NONE: FileSetContentsFlags = FileSetContentsFlags(G_FILE_SET_CONTENTS_NONE)

        /**
         * Guarantee file consistency: after a crash,
         *   either the old version of the file or the new version of the file will be
         *   available, but not a mixture. On Unix systems this equates to an `fsync()`
         *   on the file and use of an atomic `rename()` of the new version of the file
         *   over the old.
         */
        public val CONSISTENT: FileSetContentsFlags =
            FileSetContentsFlags(G_FILE_SET_CONTENTS_CONSISTENT)

        /**
         * Guarantee file durability: after a crash, the
         *   new version of the file will be available. On Unix systems this equates to
         *   an `fsync()` on the file (if %G_FILE_SET_CONTENTS_CONSISTENT is unset), or
         *   the effects of %G_FILE_SET_CONTENTS_CONSISTENT plus an `fsync()` on the
         *   directory containing the file after calling `rename()`.
         */
        public val DURABLE: FileSetContentsFlags = FileSetContentsFlags(G_FILE_SET_CONTENTS_DURABLE)

        /**
         * Only apply consistency and durability
         *   guarantees if the file already exists. This may speed up file operations
         *   if the file doesn’t currently exist, but may result in a corrupted version
         *   of the new file if the system crashes while writing it.
         */
        public val ONLY_EXISTING: FileSetContentsFlags =
            FileSetContentsFlags(G_FILE_SET_CONTENTS_ONLY_EXISTING)
    }
}
