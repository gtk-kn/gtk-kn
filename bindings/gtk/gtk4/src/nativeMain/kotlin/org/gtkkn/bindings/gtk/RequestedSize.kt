// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtk.GtkRequestedSize
import kotlin.Int

/**
 * Represents a request of a screen object in a given orientation. These
 * are primarily used in container implementations when allocating a natural
 * size for children calling. See [func@distribute_natural_allocation].
 *
 * ## Skipped during bindings generation
 *
 * - field `data`: gpointer
 */
public class RequestedSize(
    pointer: CPointer<GtkRequestedSize>,
) : Record {
    public val gtkRequestedSizePointer: CPointer<GtkRequestedSize> = pointer

    /**
     * The minimum size needed for allocation in a given orientation
     */
    public var minimumSize: Int
        get() = gtkRequestedSizePointer.pointed.minimum_size
        set(`value`) {
            gtkRequestedSizePointer.pointed.minimum_size = value
        }

    /**
     * The natural size for allocation in a given orientation
     */
    public var naturalSize: Int
        get() = gtkRequestedSizePointer.pointed.natural_size
        set(`value`) {
            gtkRequestedSizePointer.pointed.natural_size = value
        }

    public companion object : RecordCompanion<RequestedSize, GtkRequestedSize> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): RequestedSize =
            RequestedSize(pointer.reinterpret())
    }
}
