// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.graphene.graphene_vec2_add
import org.gtkkn.native.graphene.graphene_vec2_alloc
import org.gtkkn.native.graphene.graphene_vec2_divide
import org.gtkkn.native.graphene.graphene_vec2_dot
import org.gtkkn.native.graphene.graphene_vec2_equal
import org.gtkkn.native.graphene.graphene_vec2_free
import org.gtkkn.native.graphene.graphene_vec2_get_x
import org.gtkkn.native.graphene.graphene_vec2_get_y
import org.gtkkn.native.graphene.graphene_vec2_init
import org.gtkkn.native.graphene.graphene_vec2_init_from_vec2
import org.gtkkn.native.graphene.graphene_vec2_interpolate
import org.gtkkn.native.graphene.graphene_vec2_length
import org.gtkkn.native.graphene.graphene_vec2_max
import org.gtkkn.native.graphene.graphene_vec2_min
import org.gtkkn.native.graphene.graphene_vec2_multiply
import org.gtkkn.native.graphene.graphene_vec2_near
import org.gtkkn.native.graphene.graphene_vec2_negate
import org.gtkkn.native.graphene.graphene_vec2_normalize
import org.gtkkn.native.graphene.graphene_vec2_one
import org.gtkkn.native.graphene.graphene_vec2_scale
import org.gtkkn.native.graphene.graphene_vec2_subtract
import org.gtkkn.native.graphene.graphene_vec2_t
import org.gtkkn.native.graphene.graphene_vec2_x_axis
import org.gtkkn.native.graphene.graphene_vec2_y_axis
import org.gtkkn.native.graphene.graphene_vec2_zero
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Unit

/**
 * A structure capable of holding a vector with two dimensions, x and y.
 *
 * The contents of the #graphene_vec2_t structure are private and should
 * never be accessed directly.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `src`: Array parameter of type gfloat is not supported
 * - parameter `dest`: dest: Out parameter is not supported
 * - field `value`: Record field value is private
 */
public class Vec2(
    pointer: CPointer<graphene_vec2_t>,
) : Record {
    public val grapheneVec2Pointer: CPointer<graphene_vec2_t> = pointer

    /**
     * Adds each component of the two passed vectors and places
     * each result into the components of @res.
     *
     * @param b a #graphene_vec2_t
     * @param res return location for the result
     * @since 1.0
     */
    public fun add(
        b: Vec2,
        res: Vec2,
    ): Unit = graphene_vec2_add(grapheneVec2Pointer.reinterpret(), b.grapheneVec2Pointer, res.grapheneVec2Pointer)

    /**
     * Divides each component of the first operand @a by the corresponding
     * component of the second operand @b, and places the results into the
     * vector @res.
     *
     * @param b a #graphene_vec2_t
     * @param res return location for the result
     * @since 1.0
     */
    public fun divide(
        b: Vec2,
        res: Vec2,
    ): Unit = graphene_vec2_divide(grapheneVec2Pointer.reinterpret(), b.grapheneVec2Pointer, res.grapheneVec2Pointer)

    /**
     * Computes the dot product of the two given vectors.
     *
     * @param b a #graphene_vec2_t
     * @return the dot product of the vectors
     * @since 1.0
     */
    public fun dot(b: Vec2): Float = graphene_vec2_dot(grapheneVec2Pointer.reinterpret(), b.grapheneVec2Pointer)

    /**
     * Checks whether the two given #graphene_vec2_t are equal.
     *
     * @param v2 a #graphene_vec2_t
     * @return `true` if the two vectors are equal, and false otherwise
     * @since 1.2
     */
    public fun equal(v2: Vec2): Boolean = graphene_vec2_equal(grapheneVec2Pointer.reinterpret(), v2.grapheneVec2Pointer)

    /**
     * Frees the resources allocated by @v
     *
     * @since 1.0
     */
    public fun free(): Unit = graphene_vec2_free(grapheneVec2Pointer.reinterpret())

    /**
     * Retrieves the X component of the #graphene_vec2_t.
     *
     * @return the value of the X component
     * @since 1.0
     */
    public fun getX(): Float = graphene_vec2_get_x(grapheneVec2Pointer.reinterpret())

    /**
     * Retrieves the Y component of the #graphene_vec2_t.
     *
     * @return the value of the Y component
     * @since 1.0
     */
    public fun getY(): Float = graphene_vec2_get_y(grapheneVec2Pointer.reinterpret())

    /**
     * Initializes a #graphene_vec2_t using the given values.
     *
     * This function can be called multiple times.
     *
     * @param x the X field of the vector
     * @param y the Y field of the vector
     * @return the initialized vector
     * @since 1.0
     */
    public fun `init`(
        x: Float,
        y: Float,
    ): Vec2 =
        graphene_vec2_init(grapheneVec2Pointer.reinterpret(), x, y)!!.run {
            Vec2(reinterpret())
        }

    /**
     * Copies the contents of @src into @v.
     *
     * @param src a #graphene_vec2_t
     * @return the initialized vector
     * @since 1.0
     */
    public fun initFromVec2(src: Vec2): Vec2 =
        graphene_vec2_init_from_vec2(grapheneVec2Pointer.reinterpret(), src.grapheneVec2Pointer)!!.run {
            Vec2(reinterpret())
        }

    /**
     * Linearly interpolates @v1 and @v2 using the given @factor.
     *
     * @param v2 a #graphene_vec2_t
     * @param factor the interpolation factor
     * @param res the interpolated vector
     * @since 1.10
     */
    public fun interpolate(
        v2: Vec2,
        factor: Double,
        res: Vec2,
    ): Unit =
        graphene_vec2_interpolate(
            grapheneVec2Pointer.reinterpret(),
            v2.grapheneVec2Pointer,
            factor,
            res.grapheneVec2Pointer
        )

    /**
     * Computes the length of the given vector.
     *
     * @return the length of the vector
     * @since 1.0
     */
    public fun length(): Float = graphene_vec2_length(grapheneVec2Pointer.reinterpret())

    /**
     * Compares the two given vectors and places the maximum
     * values of each component into @res.
     *
     * @param b a #graphene_vec2_t
     * @param res the resulting vector
     * @since 1.0
     */
    public fun max(
        b: Vec2,
        res: Vec2,
    ): Unit = graphene_vec2_max(grapheneVec2Pointer.reinterpret(), b.grapheneVec2Pointer, res.grapheneVec2Pointer)

    /**
     * Compares the two given vectors and places the minimum
     * values of each component into @res.
     *
     * @param b a #graphene_vec2_t
     * @param res the resulting vector
     * @since 1.0
     */
    public fun min(
        b: Vec2,
        res: Vec2,
    ): Unit = graphene_vec2_min(grapheneVec2Pointer.reinterpret(), b.grapheneVec2Pointer, res.grapheneVec2Pointer)

    /**
     * Multiplies each component of the two passed vectors and places
     * each result into the components of @res.
     *
     * @param b a #graphene_vec2_t
     * @param res return location for the result
     * @since 1.0
     */
    public fun multiply(
        b: Vec2,
        res: Vec2,
    ): Unit = graphene_vec2_multiply(grapheneVec2Pointer.reinterpret(), b.grapheneVec2Pointer, res.grapheneVec2Pointer)

    /**
     * Compares the two given #graphene_vec2_t vectors and checks
     * whether their values are within the given @epsilon.
     *
     * @param v2 a #graphene_vec2_t
     * @param epsilon the threshold between the two vectors
     * @return `true` if the two vectors are near each other
     * @since 1.2
     */
    public fun near(
        v2: Vec2,
        epsilon: Float,
    ): Boolean = graphene_vec2_near(grapheneVec2Pointer.reinterpret(), v2.grapheneVec2Pointer, epsilon)

    /**
     * Negates the given #graphene_vec2_t.
     *
     * @param res return location for the result vector
     * @since 1.2
     */
    public fun negate(res: Vec2): Unit =
        graphene_vec2_negate(grapheneVec2Pointer.reinterpret(), res.grapheneVec2Pointer)

    /**
     * Computes the normalized vector for the given vector @v.
     *
     * @param res return location for the
     *   normalized vector
     * @since 1.0
     */
    public fun normalize(res: Vec2): Unit =
        graphene_vec2_normalize(grapheneVec2Pointer.reinterpret(), res.grapheneVec2Pointer)

    /**
     * Multiplies all components of the given vector with the given scalar @factor.
     *
     * @param factor the scalar factor
     * @param res return location for the result vector
     * @since 1.2
     */
    public fun scale(
        factor: Float,
        res: Vec2,
    ): Unit = graphene_vec2_scale(grapheneVec2Pointer.reinterpret(), factor, res.grapheneVec2Pointer)

    /**
     * Subtracts from each component of the first operand @a the
     * corresponding component of the second operand @b and places
     * each result into the components of @res.
     *
     * @param b a #graphene_vec2_t
     * @param res return location for the result
     * @since 1.0
     */
    public fun subtract(
        b: Vec2,
        res: Vec2,
    ): Unit = graphene_vec2_subtract(grapheneVec2Pointer.reinterpret(), b.grapheneVec2Pointer, res.grapheneVec2Pointer)

    public companion object : RecordCompanion<Vec2, graphene_vec2_t> {
        /**
         * Allocates a new #graphene_vec2_t structure.
         *
         * The contents of the returned structure are undefined.
         *
         * Use graphene_vec2_init() to initialize the vector.
         *
         * @return the newly allocated #graphene_vec2_t
         *   structure. Use graphene_vec2_free() to free the resources allocated
         *   by this function.
         * @since 1.0
         */
        public fun alloc(): Vec2 = Vec2(graphene_vec2_alloc()!!.reinterpret())

        /**
         * Retrieves a constant vector with (1, 1) components.
         *
         * @return the one vector
         * @since 1.0
         */
        public fun one(): Vec2 =
            graphene_vec2_one()!!.run {
                Vec2(reinterpret())
            }

        /**
         * Retrieves a constant vector with (1, 0) components.
         *
         * @return the X axis vector
         * @since 1.0
         */
        public fun xAxis(): Vec2 =
            graphene_vec2_x_axis()!!.run {
                Vec2(reinterpret())
            }

        /**
         * Retrieves a constant vector with (0, 1) components.
         *
         * @return the Y axis vector
         * @since 1.0
         */
        public fun yAxis(): Vec2 =
            graphene_vec2_y_axis()!!.run {
                Vec2(reinterpret())
            }

        /**
         * Retrieves a constant vector with (0, 0) components.
         *
         * @return the zero vector
         * @since 1.0
         */
        public fun zero(): Vec2 =
            graphene_vec2_zero()!!.run {
                Vec2(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Vec2 = Vec2(pointer.reinterpret())
    }
}
