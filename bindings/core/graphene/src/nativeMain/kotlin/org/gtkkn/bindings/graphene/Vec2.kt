// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_0
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_10
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_2
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.graphene.graphene_vec2_add
import org.gtkkn.native.graphene.graphene_vec2_alloc
import org.gtkkn.native.graphene.graphene_vec2_divide
import org.gtkkn.native.graphene.graphene_vec2_dot
import org.gtkkn.native.graphene.graphene_vec2_equal
import org.gtkkn.native.graphene.graphene_vec2_free
import org.gtkkn.native.graphene.graphene_vec2_get_type
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
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

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
 */
public class Vec2(public val grapheneVec2Pointer: CPointer<graphene_vec2_t>, cleaner: Cleaner? = null) :
    ProxyInstance(grapheneVec2Pointer) {
    /**
     * Allocate a new Vec2.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<graphene_vec2_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Vec2 and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<graphene_vec2_t>, Cleaner>,
    ) : this(grapheneVec2Pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Vec2 using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<graphene_vec2_t>().ptr)

    /**
     * Adds each component of the two passed vectors and places
     * each result into the components of @res.
     *
     * @param b a #graphene_vec2_t
     * @param res return location for the result
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun add(b: Vec2, res: Vec2): Unit =
        graphene_vec2_add(grapheneVec2Pointer, b.grapheneVec2Pointer, res.grapheneVec2Pointer)

    /**
     * Divides each component of the first operand @a by the corresponding
     * component of the second operand @b, and places the results into the
     * vector @res.
     *
     * @param b a #graphene_vec2_t
     * @param res return location for the result
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun divide(b: Vec2, res: Vec2): Unit =
        graphene_vec2_divide(grapheneVec2Pointer, b.grapheneVec2Pointer, res.grapheneVec2Pointer)

    /**
     * Computes the dot product of the two given vectors.
     *
     * @param b a #graphene_vec2_t
     * @return the dot product of the vectors
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun dot(b: Vec2): gfloat = graphene_vec2_dot(grapheneVec2Pointer, b.grapheneVec2Pointer)

    /**
     * Checks whether the two given #graphene_vec2_t are equal.
     *
     * @param v2 a #graphene_vec2_t
     * @return `true` if the two vectors are equal, and false otherwise
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun equal(v2: Vec2): Boolean = graphene_vec2_equal(grapheneVec2Pointer, v2.grapheneVec2Pointer)

    /**
     * Frees the resources allocated by @v
     *
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun free(): Unit = graphene_vec2_free(grapheneVec2Pointer)

    /**
     * Retrieves the X component of the #graphene_vec2_t.
     *
     * @return the value of the X component
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getX(): gfloat = graphene_vec2_get_x(grapheneVec2Pointer)

    /**
     * Retrieves the Y component of the #graphene_vec2_t.
     *
     * @return the value of the Y component
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getY(): gfloat = graphene_vec2_get_y(grapheneVec2Pointer)

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
    @GrapheneVersion1_0
    public fun `init`(x: gfloat, y: gfloat): Vec2 = graphene_vec2_init(grapheneVec2Pointer, x, y)!!.run {
        Vec2(this)
    }

    /**
     * Copies the contents of @src into @v.
     *
     * @param src a #graphene_vec2_t
     * @return the initialized vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromVec2(src: Vec2): Vec2 =
        graphene_vec2_init_from_vec2(grapheneVec2Pointer, src.grapheneVec2Pointer)!!.run {
            Vec2(this)
        }

    /**
     * Linearly interpolates @v1 and @v2 using the given @factor.
     *
     * @param v2 a #graphene_vec2_t
     * @param factor the interpolation factor
     * @param res the interpolated vector
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun interpolate(v2: Vec2, factor: gdouble, res: Vec2): Unit =
        graphene_vec2_interpolate(grapheneVec2Pointer, v2.grapheneVec2Pointer, factor, res.grapheneVec2Pointer)

    /**
     * Computes the length of the given vector.
     *
     * @return the length of the vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun length(): gfloat = graphene_vec2_length(grapheneVec2Pointer)

    /**
     * Compares the two given vectors and places the maximum
     * values of each component into @res.
     *
     * @param b a #graphene_vec2_t
     * @param res the resulting vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun max(b: Vec2, res: Vec2): Unit =
        graphene_vec2_max(grapheneVec2Pointer, b.grapheneVec2Pointer, res.grapheneVec2Pointer)

    /**
     * Compares the two given vectors and places the minimum
     * values of each component into @res.
     *
     * @param b a #graphene_vec2_t
     * @param res the resulting vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun min(b: Vec2, res: Vec2): Unit =
        graphene_vec2_min(grapheneVec2Pointer, b.grapheneVec2Pointer, res.grapheneVec2Pointer)

    /**
     * Multiplies each component of the two passed vectors and places
     * each result into the components of @res.
     *
     * @param b a #graphene_vec2_t
     * @param res return location for the result
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun multiply(b: Vec2, res: Vec2): Unit =
        graphene_vec2_multiply(grapheneVec2Pointer, b.grapheneVec2Pointer, res.grapheneVec2Pointer)

    /**
     * Compares the two given #graphene_vec2_t vectors and checks
     * whether their values are within the given @epsilon.
     *
     * @param v2 a #graphene_vec2_t
     * @param epsilon the threshold between the two vectors
     * @return `true` if the two vectors are near each other
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun near(v2: Vec2, epsilon: gfloat): Boolean =
        graphene_vec2_near(grapheneVec2Pointer, v2.grapheneVec2Pointer, epsilon)

    /**
     * Negates the given #graphene_vec2_t.
     *
     * @param res return location for the result vector
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun negate(res: Vec2): Unit = graphene_vec2_negate(grapheneVec2Pointer, res.grapheneVec2Pointer)

    /**
     * Computes the normalized vector for the given vector @v.
     *
     * @param res return location for the
     *   normalized vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun normalize(res: Vec2): Unit = graphene_vec2_normalize(grapheneVec2Pointer, res.grapheneVec2Pointer)

    /**
     * Multiplies all components of the given vector with the given scalar @factor.
     *
     * @param factor the scalar factor
     * @param res return location for the result vector
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun scale(factor: gfloat, res: Vec2): Unit =
        graphene_vec2_scale(grapheneVec2Pointer, factor, res.grapheneVec2Pointer)

    /**
     * Subtracts from each component of the first operand @a the
     * corresponding component of the second operand @b and places
     * each result into the components of @res.
     *
     * @param b a #graphene_vec2_t
     * @param res return location for the result
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun subtract(b: Vec2, res: Vec2): Unit =
        graphene_vec2_subtract(grapheneVec2Pointer, b.grapheneVec2Pointer, res.grapheneVec2Pointer)

    public companion object {
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
        public fun alloc(): Vec2 = Vec2(graphene_vec2_alloc()!!)

        /**
         * Retrieves a constant vector with (1, 1) components.
         *
         * @return the one vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun one(): Vec2 = graphene_vec2_one()!!.run {
            Vec2(this)
        }

        /**
         * Retrieves a constant vector with (1, 0) components.
         *
         * @return the X axis vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun xAxis(): Vec2 = graphene_vec2_x_axis()!!.run {
            Vec2(this)
        }

        /**
         * Retrieves a constant vector with (0, 1) components.
         *
         * @return the Y axis vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun yAxis(): Vec2 = graphene_vec2_y_axis()!!.run {
            Vec2(this)
        }

        /**
         * Retrieves a constant vector with (0, 0) components.
         *
         * @return the zero vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun zero(): Vec2 = graphene_vec2_zero()!!.run {
            Vec2(this)
        }

        /**
         * Get the GType of Vec2
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_vec2_get_type()
    }
}
