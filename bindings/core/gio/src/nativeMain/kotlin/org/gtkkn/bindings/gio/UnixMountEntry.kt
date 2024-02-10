// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gio.GUnixMountEntry

/**
 * Defines a Unix mount entry (e.g. <filename>/media/cdrom</filename>).
 * This corresponds roughly to a mtab entry.
 */
public class UnixMountEntry(
    pointer: CPointer<GUnixMountEntry>,
) : Record {
    public val gioUnixMountEntryPointer: CPointer<GUnixMountEntry> = pointer

    public companion object : RecordCompanion<UnixMountEntry, GUnixMountEntry> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): UnixMountEntry =
            UnixMountEntry(pointer.reinterpret())
    }
}
