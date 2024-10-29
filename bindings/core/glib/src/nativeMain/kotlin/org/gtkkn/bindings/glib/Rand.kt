// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GRand
import org.gtkkn.native.glib.g_rand_copy
import org.gtkkn.native.glib.g_rand_double
import org.gtkkn.native.glib.g_rand_double_range
import org.gtkkn.native.glib.g_rand_free
import org.gtkkn.native.glib.g_rand_int
import org.gtkkn.native.glib.g_rand_int_range
import org.gtkkn.native.glib.g_rand_new
import org.gtkkn.native.glib.g_rand_new_with_seed
import org.gtkkn.native.glib.g_rand_set_seed
import kotlin.Double
import kotlin.Int
import kotlin.UInt
import kotlin.Unit

/**
 * The GRand struct is an opaque data structure. It should only be
 * accessed through the g_rand_* functions.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `seed`: Unsupported pointer to primitive type
 * - parameter `seed`: Unsupported pointer to primitive type
 */
public class Rand(
    pointer: CPointer<GRand>,
) : Record {
    public val glibRandPointer: CPointer<GRand> = pointer

    /**
     * Copies a #GRand into a new one with the same exact state as before.
     * This way you can take a snapshot of the random number generator for
     * replaying later.
     *
     * @return the new #GRand
     * @since 2.4
     */
    public fun copy(): Rand =
        g_rand_copy(glibRandPointer.reinterpret())!!.run {
            Rand(reinterpret())
        }

    /**
     * Returns the next random #gdouble from @rand_ equally distributed over
     * the range [0..1).
     *
     * @return a random number
     */
    public fun double(): Double = g_rand_double(glibRandPointer.reinterpret())

    /**
     * Returns the next random #gdouble from @rand_ equally distributed over
     * the range [@begin..@end).
     *
     * @param begin lower closed bound of the interval
     * @param end upper open bound of the interval
     * @return a random number
     */
    public fun doubleRange(
        begin: Double,
        end: Double,
    ): Double = g_rand_double_range(glibRandPointer.reinterpret(), begin, end)

    /**
     * Frees the memory allocated for the #GRand.
     */
    public fun free(): Unit = g_rand_free(glibRandPointer.reinterpret())

    /**
     * Returns the next random #guint32 from @rand_ equally distributed over
     * the range [0..2^32-1].
     *
     * @return a random number
     */
    public fun int(): UInt = g_rand_int(glibRandPointer.reinterpret())

    /**
     * Returns the next random #gint32 from @rand_ equally distributed over
     * the range [@begin..@end-1].
     *
     * @param begin lower closed bound of the interval
     * @param end upper open bound of the interval
     * @return a random number
     */
    public fun intRange(
        begin: Int,
        end: Int,
    ): Int =
        g_rand_int_range(
            glibRandPointer.reinterpret(),
            begin,
            end
        )

    /**
     * Sets the seed for the random number generator #GRand to @seed.
     *
     * @param seed a value to reinitialize the random number generator
     */
    public fun setSeed(seed: UInt): Unit = g_rand_set_seed(glibRandPointer.reinterpret(), seed)

    public companion object : RecordCompanion<Rand, GRand> {
        /**
         * Creates a new random number generator initialized with a seed taken
         * either from `/dev/urandom` (if existing) or from the current time
         * (as a fallback).
         *
         * On Windows, the seed is taken from rand_s().
         *
         * @return the new #GRand
         */
        public fun new(): Rand = Rand(g_rand_new()!!.reinterpret())

        /**
         * Creates a new random number generator initialized with @seed.
         *
         * @param seed a value to initialize the random number generator
         * @return the new #GRand
         */
        public fun newWithSeed(seed: UInt): Rand = Rand(g_rand_new_with_seed(seed)!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Rand = Rand(pointer.reinterpret())
    }
}
