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
import org.gtkkn.native.graphene.graphene_vec4_add
import org.gtkkn.native.graphene.graphene_vec4_alloc
import org.gtkkn.native.graphene.graphene_vec4_divide
import org.gtkkn.native.graphene.graphene_vec4_dot
import org.gtkkn.native.graphene.graphene_vec4_equal
import org.gtkkn.native.graphene.graphene_vec4_free
import org.gtkkn.native.graphene.graphene_vec4_get_type
import org.gtkkn.native.graphene.graphene_vec4_get_w
import org.gtkkn.native.graphene.graphene_vec4_get_x
import org.gtkkn.native.graphene.graphene_vec4_get_xy
import org.gtkkn.native.graphene.graphene_vec4_get_xyz
import org.gtkkn.native.graphene.graphene_vec4_get_y
import org.gtkkn.native.graphene.graphene_vec4_get_z
import org.gtkkn.native.graphene.graphene_vec4_init
import org.gtkkn.native.graphene.graphene_vec4_init_from_vec2
import org.gtkkn.native.graphene.graphene_vec4_init_from_vec3
import org.gtkkn.native.graphene.graphene_vec4_init_from_vec4
import org.gtkkn.native.graphene.graphene_vec4_interpolate
import org.gtkkn.native.graphene.graphene_vec4_length
import org.gtkkn.native.graphene.graphene_vec4_max
import org.gtkkn.native.graphene.graphene_vec4_min
import org.gtkkn.native.graphene.graphene_vec4_multiply
import org.gtkkn.native.graphene.graphene_vec4_near
import org.gtkkn.native.graphene.graphene_vec4_negate
import org.gtkkn.native.graphene.graphene_vec4_normalize
import org.gtkkn.native.graphene.graphene_vec4_one
import org.gtkkn.native.graphene.graphene_vec4_scale
import org.gtkkn.native.graphene.graphene_vec4_subtract
import org.gtkkn.native.graphene.graphene_vec4_t
import org.gtkkn.native.graphene.graphene_vec4_w_axis
import org.gtkkn.native.graphene.graphene_vec4_x_axis
import org.gtkkn.native.graphene.graphene_vec4_y_axis
import org.gtkkn.native.graphene.graphene_vec4_z_axis
import org.gtkkn.native.graphene.graphene_vec4_zero
import kotlin.Boolean
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A structure capable of holding a vector with four dimensions: x, y, z, and w.
 *
 * The contents of the #graphene_vec4_t structure are private and should
 * never be accessed directly.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `src`: Array parameter of type gfloat is not supported
 * - parameter `dest`: dest: Out parameter is not supported
 */
public class Vec4(public val grapheneVec4Pointer: CPointer<graphene_vec4_t>, cleaner: Cleaner? = null) :
    ProxyInstance(grapheneVec4Pointer) {
    /**
     * Allocate a new Vec4.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<graphene_vec4_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Vec4 and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<graphene_vec4_t>, Cleaner>,
    ) : this(grapheneVec4Pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Vec4 using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<graphene_vec4_t>().ptr)

    /**
     * Adds each component of the two given vectors.
     *
     * @param b a #graphene_vec4_t
     * @param res return location for the resulting vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun add(b: Vec4, res: Vec4): Unit =
        graphene_vec4_add(grapheneVec4Pointer, b.grapheneVec4Pointer, res.grapheneVec4Pointer)

    /**
     * Divides each component of the first operand @a by the corresponding
     * component of the second operand @b, and places the results into the
     * vector @res.
     *
     * @param b a #graphene_vec4_t
     * @param res return location for the resulting vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun divide(b: Vec4, res: Vec4): Unit =
        graphene_vec4_divide(grapheneVec4Pointer, b.grapheneVec4Pointer, res.grapheneVec4Pointer)

    /**
     * Computes the dot product of the two given vectors.
     *
     * @param b a #graphene_vec4_t
     * @return the value of the dot product
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun dot(b: Vec4): gfloat = graphene_vec4_dot(grapheneVec4Pointer, b.grapheneVec4Pointer)

    /**
     * Checks whether the two given #graphene_vec4_t are equal.
     *
     * @param v2 a #graphene_vec4_t
     * @return `true` if the two vectors are equal, and false otherwise
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun equal(v2: Vec4): Boolean = graphene_vec4_equal(grapheneVec4Pointer, v2.grapheneVec4Pointer)

    /**
     * Frees the resources allocated by @v
     *
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun free(): Unit = graphene_vec4_free(grapheneVec4Pointer)

    /**
     * Retrieves the value of the fourth component of the given #graphene_vec4_t.
     *
     * @return the value of the fourth component
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getW(): gfloat = graphene_vec4_get_w(grapheneVec4Pointer)

    /**
     * Retrieves the value of the first component of the given #graphene_vec4_t.
     *
     * @return the value of the first component
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getX(): gfloat = graphene_vec4_get_x(grapheneVec4Pointer)

    /**
     * Creates a #graphene_vec2_t that contains the first two components
     * of the given #graphene_vec4_t.
     *
     * @param res return location for a #graphene_vec2_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getXy(res: Vec2): Unit = graphene_vec4_get_xy(grapheneVec4Pointer, res.grapheneVec2Pointer)

    /**
     * Creates a #graphene_vec3_t that contains the first three components
     * of the given #graphene_vec4_t.
     *
     * @param res return location for a graphene_vec3_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getXyz(res: Vec3): Unit = graphene_vec4_get_xyz(grapheneVec4Pointer, res.grapheneVec3Pointer)

    /**
     * Retrieves the value of the second component of the given #graphene_vec4_t.
     *
     * @return the value of the second component
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getY(): gfloat = graphene_vec4_get_y(grapheneVec4Pointer)

    /**
     * Retrieves the value of the third component of the given #graphene_vec4_t.
     *
     * @return the value of the third component
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getZ(): gfloat = graphene_vec4_get_z(grapheneVec4Pointer)

    /**
     * Initializes a #graphene_vec4_t using the given values.
     *
     * This function can be called multiple times.
     *
     * @param x the X field of the vector
     * @param y the Y field of the vector
     * @param z the Z field of the vector
     * @param w the W field of the vector
     * @return a pointer to the initialized
     *   vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun `init`(x: gfloat, y: gfloat, z: gfloat, w: gfloat): Vec4 =
        graphene_vec4_init(grapheneVec4Pointer, x, y, z, w)!!.run {
            Vec4(this)
        }

    /**
     * Initializes a #graphene_vec4_t using the components of a
     * #graphene_vec2_t and the values of @z and @w.
     *
     * @param src a #graphene_vec2_t
     * @param z the value for the third component of @v
     * @param w the value for the fourth component of @v
     * @return the initialized vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromVec2(src: Vec2, z: gfloat, w: gfloat): Vec4 =
        graphene_vec4_init_from_vec2(grapheneVec4Pointer, src.grapheneVec2Pointer, z, w)!!.run {
            Vec4(this)
        }

    /**
     * Initializes a #graphene_vec4_t using the components of a
     * #graphene_vec3_t and the value of @w.
     *
     * @param src a #graphene_vec3_t
     * @param w the value for the fourth component of @v
     * @return the initialized vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromVec3(src: Vec3, w: gfloat): Vec4 =
        graphene_vec4_init_from_vec3(grapheneVec4Pointer, src.grapheneVec3Pointer, w)!!.run {
            Vec4(this)
        }

    /**
     * Initializes a #graphene_vec4_t using the components of
     * another #graphene_vec4_t.
     *
     * @param src a #graphene_vec4_t
     * @return the initialized vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromVec4(src: Vec4): Vec4 =
        graphene_vec4_init_from_vec4(grapheneVec4Pointer, src.grapheneVec4Pointer)!!.run {
            Vec4(this)
        }

    /**
     * Linearly interpolates @v1 and @v2 using the given @factor.
     *
     * @param v2 a #graphene_vec4_t
     * @param factor the interpolation factor
     * @param res the interpolated vector
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun interpolate(v2: Vec4, factor: gdouble, res: Vec4): Unit =
        graphene_vec4_interpolate(grapheneVec4Pointer, v2.grapheneVec4Pointer, factor, res.grapheneVec4Pointer)

    /**
     * Computes the length of the given #graphene_vec4_t.
     *
     * @return the length of the vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun length(): gfloat = graphene_vec4_length(grapheneVec4Pointer)

    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the maximum values.
     *
     * @param b a #graphene_vec4_t
     * @param res return location for the result vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun max(b: Vec4, res: Vec4): Unit =
        graphene_vec4_max(grapheneVec4Pointer, b.grapheneVec4Pointer, res.grapheneVec4Pointer)

    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the minimum values.
     *
     * @param b a #graphene_vec4_t
     * @param res return location for the result vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun min(b: Vec4, res: Vec4): Unit =
        graphene_vec4_min(grapheneVec4Pointer, b.grapheneVec4Pointer, res.grapheneVec4Pointer)

    /**
     * Multiplies each component of the two given vectors.
     *
     * @param b a #graphene_vec4_t
     * @param res return location for the resulting vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun multiply(b: Vec4, res: Vec4): Unit =
        graphene_vec4_multiply(grapheneVec4Pointer, b.grapheneVec4Pointer, res.grapheneVec4Pointer)

    /**
     * Compares the two given #graphene_vec4_t vectors and checks
     * whether their values are within the given @epsilon.
     *
     * @param v2 a #graphene_vec4_t
     * @param epsilon the threshold between the two vectors
     * @return `true` if the two vectors are near each other
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun near(v2: Vec4, epsilon: gfloat): Boolean =
        graphene_vec4_near(grapheneVec4Pointer, v2.grapheneVec4Pointer, epsilon)

    /**
     * Negates the given #graphene_vec4_t.
     *
     * @param res return location for the result vector
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun negate(res: Vec4): Unit = graphene_vec4_negate(grapheneVec4Pointer, res.grapheneVec4Pointer)

    /**
     * Normalizes the given #graphene_vec4_t.
     *
     * @param res return location for the normalized
     *   vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun normalize(res: Vec4): Unit = graphene_vec4_normalize(grapheneVec4Pointer, res.grapheneVec4Pointer)

    /**
     * Multiplies all components of the given vector with the given scalar @factor.
     *
     * @param factor the scalar factor
     * @param res return location for the result vector
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun scale(factor: gfloat, res: Vec4): Unit =
        graphene_vec4_scale(grapheneVec4Pointer, factor, res.grapheneVec4Pointer)

    /**
     * Subtracts from each component of the first operand @a the
     * corresponding component of the second operand @b and places
     * each result into the components of @res.
     *
     * @param b a #graphene_vec4_t
     * @param res return location for the resulting vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun subtract(b: Vec4, res: Vec4): Unit =
        graphene_vec4_subtract(grapheneVec4Pointer, b.grapheneVec4Pointer, res.grapheneVec4Pointer)

    public companion object {
        /**
         * Allocates a new #graphene_vec4_t structure.
         *
         * The contents of the returned structure are undefined.
         *
         * Use graphene_vec4_init() to initialize the vector.
         *
         * @return the newly allocated #graphene_vec4_t
         *   structure. Use graphene_vec4_free() to free the resources allocated
         *   by this function.
         * @since 1.0
         */
        public fun alloc(): Vec4 = Vec4(graphene_vec4_alloc()!!)

        /**
         * Retrieves a pointer to a #graphene_vec4_t with all its
         * components set to 1.
         *
         * @return a constant vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun one(): Vec4 = graphene_vec4_one()!!.run {
            Vec4(this)
        }

        /**
         * Retrieves a pointer to a #graphene_vec4_t with its
         * components set to (0, 0, 0, 1).
         *
         * @return a constant vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun wAxis(): Vec4 = graphene_vec4_w_axis()!!.run {
            Vec4(this)
        }

        /**
         * Retrieves a pointer to a #graphene_vec4_t with its
         * components set to (1, 0, 0, 0).
         *
         * @return a constant vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun xAxis(): Vec4 = graphene_vec4_x_axis()!!.run {
            Vec4(this)
        }

        /**
         * Retrieves a pointer to a #graphene_vec4_t with its
         * components set to (0, 1, 0, 0).
         *
         * @return a constant vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun yAxis(): Vec4 = graphene_vec4_y_axis()!!.run {
            Vec4(this)
        }

        /**
         * Retrieves a pointer to a #graphene_vec4_t with its
         * components set to (0, 0, 1, 0).
         *
         * @return a constant vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun zAxis(): Vec4 = graphene_vec4_z_axis()!!.run {
            Vec4(this)
        }

        /**
         * Retrieves a pointer to a #graphene_vec4_t with all its
         * components set to 0.
         *
         * @return a constant vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun zero(): Vec4 = graphene_vec4_zero()!!.run {
            Vec4(this)
        }

        /**
         * Get the GType of Vec4
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_vec4_get_type()
    }
}
