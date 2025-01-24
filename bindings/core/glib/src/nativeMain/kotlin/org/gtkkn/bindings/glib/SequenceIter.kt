// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.glib.annotations.GLibVersion2_14
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GSequenceIter
import org.gtkkn.native.glib.g_sequence_iter_compare
import org.gtkkn.native.glib.g_sequence_iter_get_position
import org.gtkkn.native.glib.g_sequence_iter_get_sequence
import org.gtkkn.native.glib.g_sequence_iter_is_begin
import org.gtkkn.native.glib.g_sequence_iter_is_end
import org.gtkkn.native.glib.g_sequence_iter_move
import org.gtkkn.native.glib.g_sequence_iter_next
import org.gtkkn.native.glib.g_sequence_iter_prev
import org.gtkkn.native.glib.gint
import kotlin.Boolean

/**
 * The #GSequenceIter struct is an opaque data type representing an
 * iterator pointing into a #GSequence.
 */
public class SequenceIter(public val glibSequenceIterPointer: CPointer<GSequenceIter>) :
    ProxyInstance(glibSequenceIterPointer) {
    /**
     * Returns a negative number if @a comes before @b, 0 if they are equal,
     * and a positive number if @a comes after @b.
     *
     * The @a and @b iterators must point into the same sequence.
     *
     * @param b a #GSequenceIter
     * @return a negative number if @a comes before @b, 0 if they are
     *     equal, and a positive number if @a comes after @b
     * @since 2.14
     */
    @GLibVersion2_14
    public fun compare(b: SequenceIter): gint =
        g_sequence_iter_compare(glibSequenceIterPointer, b.glibSequenceIterPointer)

    /**
     * Returns the position of @iter
     *
     * @return the position of @iter
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getPosition(): gint = g_sequence_iter_get_position(glibSequenceIterPointer)

    /**
     * Returns the #GSequence that @iter points into.
     *
     * @return the #GSequence that @iter points into
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getSequence(): Sequence = g_sequence_iter_get_sequence(glibSequenceIterPointer)!!.run {
        Sequence(this)
    }

    /**
     * Returns whether @iter is the begin iterator
     *
     * @return whether @iter is the begin iterator
     * @since 2.14
     */
    @GLibVersion2_14
    public fun isBegin(): Boolean = g_sequence_iter_is_begin(glibSequenceIterPointer).asBoolean()

    /**
     * Returns whether @iter is the end iterator
     *
     * @return Whether @iter is the end iterator
     * @since 2.14
     */
    @GLibVersion2_14
    public fun isEnd(): Boolean = g_sequence_iter_is_end(glibSequenceIterPointer).asBoolean()

    /**
     * Returns the #GSequenceIter which is @delta positions away from @iter.
     * If @iter is closer than -@delta positions to the beginning of the sequence,
     * the begin iterator is returned. If @iter is closer than @delta positions
     * to the end of the sequence, the end iterator is returned.
     *
     * @param delta A positive or negative number indicating how many positions away
     *    from @iter the returned #GSequenceIter will be
     * @return a #GSequenceIter which is @delta positions away from @iter
     * @since 2.14
     */
    @GLibVersion2_14
    public fun move(delta: gint): SequenceIter = g_sequence_iter_move(glibSequenceIterPointer, delta)!!.run {
        SequenceIter(this)
    }

    /**
     * Returns an iterator pointing to the next position after @iter.
     * If @iter is the end iterator, the end iterator is returned.
     *
     * @return a #GSequenceIter pointing to the next position after @iter
     * @since 2.14
     */
    @GLibVersion2_14
    public fun next(): SequenceIter = g_sequence_iter_next(glibSequenceIterPointer)!!.run {
        SequenceIter(this)
    }

    /**
     * Returns an iterator pointing to the previous position before @iter.
     * If @iter is the begin iterator, the begin iterator is returned.
     *
     * @return a #GSequenceIter pointing to the previous position
     *     before @iter
     * @since 2.14
     */
    @GLibVersion2_14
    public fun prev(): SequenceIter = g_sequence_iter_prev(glibSequenceIterPointer)!!.run {
        SequenceIter(this)
    }
}
