// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GPollFD
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_pollfd_get_type
import org.gtkkn.native.gobject.gint
import kotlinx.cinterop.alloc as nativePlacementAlloc

/**
 * Represents a file descriptor, which events to poll for, and which events
 * occurred.
 *
 * ## Skipped during bindings generation
 *
 * - field `events`: gushort
 * - field `revents`: gushort
 */
public class PollFD(
    pointer: CPointer<GPollFD>,
) : Record {
    public val glibPollFDPointer: CPointer<GPollFD> = pointer

    /**
     * the file descriptor to poll (or a HANDLE on Win32)
     */
    public var fd: gint
        get() = glibPollFDPointer.pointed.fd
        set(`value`) {
            glibPollFDPointer.pointed.fd = value
        }

    public companion object : RecordCompanion<PollFD, GPollFD> {
        /**
         * Get the GType of PollFD
         *
         * @return the GType
         */
        public fun getType(): GType = g_pollfd_get_type()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): PollFD = PollFD(pointer.reinterpret())
    }
}
