// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtk.GtkBitsetIter
import org.gtkkn.native.gtk.gtk_bitset_iter_get_value
import org.gtkkn.native.gtk.gtk_bitset_iter_is_valid
import kotlin.Boolean
import kotlin.UInt

/**
 * An opaque, stack-allocated struct for iterating
 * over the elements of a `GtkBitset`.
 *
 * Before a `GtkBitsetIter` can be used, it needs to be initialized with
 * [func@Gtk.BitsetIter.init_first], [func@Gtk.BitsetIter.init_last]
 * or [func@Gtk.BitsetIter.init_at].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - field `private_data`: Record field private_data is private
 */
public class BitsetIter(
    pointer: CPointer<GtkBitsetIter>,
) : Record {
    public val gtkBitsetIterPointer: CPointer<GtkBitsetIter> = pointer

    /**
     * Gets the current value that @iter points to.
     *
     * If @iter is not valid and [method@Gtk.BitsetIter.is_valid]
     * returns false, this function returns 0.
     *
     * @return The current value pointer to by @iter
     */
    public fun getValue(): UInt = gtk_bitset_iter_get_value(gtkBitsetIterPointer.reinterpret())

    /**
     * Checks if @iter points to a valid value.
     *
     * @return true if @iter points to a valid value
     */
    public fun isValid(): Boolean = gtk_bitset_iter_is_valid(gtkBitsetIterPointer.reinterpret()).asBoolean()

    public companion object : RecordCompanion<BitsetIter, GtkBitsetIter> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): BitsetIter = BitsetIter(pointer.reinterpret())
    }
}
