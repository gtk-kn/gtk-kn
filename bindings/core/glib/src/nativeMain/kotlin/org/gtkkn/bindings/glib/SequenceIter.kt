// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_14
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GSequenceIter
import org.gtkkn.native.glib.g_sequence_iter_get_position
import org.gtkkn.native.glib.g_sequence_iter_is_begin
import org.gtkkn.native.glib.g_sequence_iter_is_end
import org.gtkkn.native.gobject.gint
import kotlin.Boolean

/**
 * The #GSequenceIter struct is an opaque data type representing an
 * iterator pointing into a #GSequence.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `b`: SequenceIter
 * - method `get_sequence`: Return type Sequence is unsupported
 * - method `move`: Return type SequenceIter is unsupported
 * - method `next`: Return type SequenceIter is unsupported
 * - method `prev`: Return type SequenceIter is unsupported
 */
public class SequenceIter(pointer: CPointer<GSequenceIter>) : ProxyInstance(pointer) {
    public val glibSequenceIterPointer: CPointer<GSequenceIter> = pointer

    /**
     * Returns the position of @iter
     *
     * @return the position of @iter
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getPosition(): gint = g_sequence_iter_get_position(glibSequenceIterPointer.reinterpret())

    /**
     * Returns whether @iter is the begin iterator
     *
     * @return whether @iter is the begin iterator
     * @since 2.14
     */
    @GLibVersion2_14
    public fun isBegin(): Boolean = g_sequence_iter_is_begin(glibSequenceIterPointer.reinterpret()).asBoolean()

    /**
     * Returns whether @iter is the end iterator
     *
     * @return Whether @iter is the end iterator
     * @since 2.14
     */
    @GLibVersion2_14
    public fun isEnd(): Boolean = g_sequence_iter_is_end(glibSequenceIterPointer.reinterpret()).asBoolean()
}
