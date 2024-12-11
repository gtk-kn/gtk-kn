// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GUnixMountEntry
import org.gtkkn.native.gio.g_unix_mount_entry_get_type
import org.gtkkn.native.gobject.GType

/**
 * Defines a Unix mount entry (e.g. <filename>/media/cdrom</filename>).
 * This corresponds roughly to a mtab entry.
 */
public class UnixMountEntry(pointer: CPointer<GUnixMountEntry>) : ProxyInstance(pointer) {
    public val gioUnixMountEntryPointer: CPointer<GUnixMountEntry> = pointer

    public companion object {
        /**
         * Get the GType of UnixMountEntry
         *
         * @return the GType
         */
        public fun getType(): GType = g_unix_mount_entry_get_type()
    }
}
