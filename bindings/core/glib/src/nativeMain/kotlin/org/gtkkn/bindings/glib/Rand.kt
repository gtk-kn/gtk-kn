// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_4
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
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
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_rand_get_type
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
public class Rand(pointer: CPointer<GRand>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GRand> = pointer

    /**
     * Copies a #GRand into a new one with the same exact state as before.
     * This way you can take a snapshot of the random number generator for
     * replaying later.
     *
     * @return the new #GRand
     * @since 2.4
     */
    @GLibVersion2_4
    public fun copy(): Rand = g_rand_copy(gPointer)!!.run {
        Rand(this)
    }

    /**
     * Returns the next random #gdouble from @rand_ equally distributed over
     * the range [0..1).
     *
     * @return a random number
     */
    public fun double(): gdouble = g_rand_double(gPointer)

    /**
     * Returns the next random #gdouble from @rand_ equally distributed over
     * the range [@begin..@end).
     *
     * @param begin lower closed bound of the interval
     * @param end upper open bound of the interval
     * @return a random number
     */
    public fun doubleRange(begin: gdouble, end: gdouble): gdouble = g_rand_double_range(gPointer, begin, end)

    /**
     * Frees the memory allocated for the #GRand.
     */
    public fun free(): Unit = g_rand_free(gPointer)

    /**
     * Returns the next random #guint32 from @rand_ equally distributed over
     * the range [0..2^32-1].
     *
     * @return a random number
     */
    public fun int(): guint = g_rand_int(gPointer)

    /**
     * Returns the next random #gint32 from @rand_ equally distributed over
     * the range [@begin..@end-1].
     *
     * @param begin lower closed bound of the interval
     * @param end upper open bound of the interval
     * @return a random number
     */
    public fun intRange(begin: gint, end: gint): gint = g_rand_int_range(gPointer, begin, end)

    /**
     * Sets the seed for the random number generator #GRand to @seed.
     *
     * @param seed a value to reinitialize the random number generator
     */
    public fun setSeed(seed: guint): Unit = g_rand_set_seed(gPointer, seed)

    public companion object {
        /**
         * Creates a new random number generator initialized with a seed taken
         * either from `/dev/urandom` (if existing) or from the current time
         * (as a fallback).
         *
         * On Windows, the seed is taken from rand_s().
         *
         * @return the new #GRand
         */
        public fun new(): Rand = Rand(g_rand_new()!!)

        /**
         * Creates a new random number generator initialized with @seed.
         *
         * @param seed a value to initialize the random number generator
         * @return the new #GRand
         */
        public fun newWithSeed(seed: guint): Rand = Rand(g_rand_new_with_seed(seed)!!.reinterpret())

        /**
         * Get the GType of Rand
         *
         * @return the GType
         */
        public fun getType(): GType = g_rand_get_type()
    }
}
