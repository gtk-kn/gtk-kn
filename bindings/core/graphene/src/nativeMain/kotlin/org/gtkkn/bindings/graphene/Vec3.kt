// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_0
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_10
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_2
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.graphene.graphene_vec3_add
import org.gtkkn.native.graphene.graphene_vec3_alloc
import org.gtkkn.native.graphene.graphene_vec3_cross
import org.gtkkn.native.graphene.graphene_vec3_divide
import org.gtkkn.native.graphene.graphene_vec3_dot
import org.gtkkn.native.graphene.graphene_vec3_equal
import org.gtkkn.native.graphene.graphene_vec3_free
import org.gtkkn.native.graphene.graphene_vec3_get_type
import org.gtkkn.native.graphene.graphene_vec3_get_x
import org.gtkkn.native.graphene.graphene_vec3_get_xy
import org.gtkkn.native.graphene.graphene_vec3_get_xy0
import org.gtkkn.native.graphene.graphene_vec3_get_xyz0
import org.gtkkn.native.graphene.graphene_vec3_get_xyz1
import org.gtkkn.native.graphene.graphene_vec3_get_xyzw
import org.gtkkn.native.graphene.graphene_vec3_get_y
import org.gtkkn.native.graphene.graphene_vec3_get_z
import org.gtkkn.native.graphene.graphene_vec3_init
import org.gtkkn.native.graphene.graphene_vec3_init_from_vec3
import org.gtkkn.native.graphene.graphene_vec3_interpolate
import org.gtkkn.native.graphene.graphene_vec3_length
import org.gtkkn.native.graphene.graphene_vec3_max
import org.gtkkn.native.graphene.graphene_vec3_min
import org.gtkkn.native.graphene.graphene_vec3_multiply
import org.gtkkn.native.graphene.graphene_vec3_near
import org.gtkkn.native.graphene.graphene_vec3_negate
import org.gtkkn.native.graphene.graphene_vec3_normalize
import org.gtkkn.native.graphene.graphene_vec3_one
import org.gtkkn.native.graphene.graphene_vec3_scale
import org.gtkkn.native.graphene.graphene_vec3_subtract
import org.gtkkn.native.graphene.graphene_vec3_t
import org.gtkkn.native.graphene.graphene_vec3_x_axis
import org.gtkkn.native.graphene.graphene_vec3_y_axis
import org.gtkkn.native.graphene.graphene_vec3_z_axis
import org.gtkkn.native.graphene.graphene_vec3_zero
import kotlin.Boolean
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A structure capable of holding a vector with three dimensions: x, y, and z.
 *
 * The contents of the #graphene_vec3_t structure are private and should
 * never be accessed directly.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `src`: Array parameter of type gfloat is not supported
 * - parameter `dest`: dest: Out parameter is not supported
 */
public class Vec3(pointer: CPointer<graphene_vec3_t>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<graphene_vec3_t> = pointer

    /**
     * Allocate a new Vec3.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<graphene_vec3_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Vec3 and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<graphene_vec3_t>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Vec3 using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<graphene_vec3_t>().ptr)

    /**
     * Adds each component of the two given vectors.
     *
     * @param b a #graphene_vec3_t
     * @param res return location for the resulting vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun add(b: Vec3, res: Vec3): Unit =
        graphene_vec3_add(gPointer.reinterpret(), b.gPointer.reinterpret(), res.gPointer.reinterpret())

    /**
     * Computes the cross product of the two given vectors.
     *
     * @param b a #graphene_vec3_t
     * @param res return location for the resulting vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun cross(b: Vec3, res: Vec3): Unit =
        graphene_vec3_cross(gPointer.reinterpret(), b.gPointer.reinterpret(), res.gPointer.reinterpret())

    /**
     * Divides each component of the first operand @a by the corresponding
     * component of the second operand @b, and places the results into the
     * vector @res.
     *
     * @param b a #graphene_vec3_t
     * @param res return location for the resulting vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun divide(b: Vec3, res: Vec3): Unit =
        graphene_vec3_divide(gPointer.reinterpret(), b.gPointer.reinterpret(), res.gPointer.reinterpret())

    /**
     * Computes the dot product of the two given vectors.
     *
     * @param b a #graphene_vec3_t
     * @return the value of the dot product
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun dot(b: Vec3): gfloat = graphene_vec3_dot(gPointer.reinterpret(), b.gPointer.reinterpret())

    /**
     * Checks whether the two given #graphene_vec3_t are equal.
     *
     * @param v2 a #graphene_vec3_t
     * @return `true` if the two vectors are equal, and false otherwise
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun equal(v2: Vec3): Boolean = graphene_vec3_equal(gPointer.reinterpret(), v2.gPointer.reinterpret())

    /**
     * Frees the resources allocated by @v
     *
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun free(): Unit = graphene_vec3_free(gPointer.reinterpret())

    /**
     * Retrieves the first component of the given vector @v.
     *
     * @return the value of the first component of the vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getX(): gfloat = graphene_vec3_get_x(gPointer.reinterpret())

    /**
     * Creates a #graphene_vec2_t that contains the first and second
     * components of the given #graphene_vec3_t.
     *
     * @param res return location for a #graphene_vec2_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getXy(res: Vec2): Unit = graphene_vec3_get_xy(gPointer.reinterpret(), res.gPointer.reinterpret())

    /**
     * Creates a #graphene_vec3_t that contains the first two components of
     * the given #graphene_vec3_t, and the third component set to 0.
     *
     * @param res return location for a #graphene_vec3_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getXy0(res: Vec3): Unit = graphene_vec3_get_xy0(gPointer.reinterpret(), res.gPointer.reinterpret())

    /**
     * Converts a #graphene_vec3_t in a #graphene_vec4_t using 0.0
     * as the value for the fourth component of the resulting vector.
     *
     * @param res return location for the vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getXyz0(res: Vec4): Unit = graphene_vec3_get_xyz0(gPointer.reinterpret(), res.gPointer.reinterpret())

    /**
     * Converts a #graphene_vec3_t in a #graphene_vec4_t using 1.0
     * as the value for the fourth component of the resulting vector.
     *
     * @param res return location for the vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getXyz1(res: Vec4): Unit = graphene_vec3_get_xyz1(gPointer.reinterpret(), res.gPointer.reinterpret())

    /**
     * Converts a #graphene_vec3_t in a #graphene_vec4_t using @w as
     * the value of the fourth component of the resulting vector.
     *
     * @param w the value of the W component
     * @param res return location for the vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getXyzw(w: gfloat, res: Vec4): Unit =
        graphene_vec3_get_xyzw(gPointer.reinterpret(), w, res.gPointer.reinterpret())

    /**
     * Retrieves the second component of the given vector @v.
     *
     * @return the value of the second component of the vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getY(): gfloat = graphene_vec3_get_y(gPointer.reinterpret())

    /**
     * Retrieves the third component of the given vector @v.
     *
     * @return the value of the third component of the vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getZ(): gfloat = graphene_vec3_get_z(gPointer.reinterpret())

    /**
     * Initializes a #graphene_vec3_t using the given values.
     *
     * This function can be called multiple times.
     *
     * @param x the X field of the vector
     * @param y the Y field of the vector
     * @param z the Z field of the vector
     * @return a pointer to the initialized
     *   vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun `init`(x: gfloat, y: gfloat, z: gfloat): Vec3 =
        graphene_vec3_init(gPointer.reinterpret(), x, y, z)!!.run {
            Vec3(reinterpret())
        }

    /**
     * Initializes a #graphene_vec3_t with the values of another
     * #graphene_vec3_t.
     *
     * @param src a #graphene_vec3_t
     * @return the initialized vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromVec3(src: Vec3): Vec3 =
        graphene_vec3_init_from_vec3(gPointer.reinterpret(), src.gPointer.reinterpret())!!.run {
            Vec3(reinterpret())
        }

    /**
     * Linearly interpolates @v1 and @v2 using the given @factor.
     *
     * @param v2 a #graphene_vec3_t
     * @param factor the interpolation factor
     * @param res the interpolated vector
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun interpolate(v2: Vec3, factor: gdouble, res: Vec3): Unit =
        graphene_vec3_interpolate(gPointer.reinterpret(), v2.gPointer.reinterpret(), factor, res.gPointer.reinterpret())

    /**
     * Retrieves the length of the given vector @v.
     *
     * @return the value of the length of the vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun length(): gfloat = graphene_vec3_length(gPointer.reinterpret())

    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the maximum values.
     *
     * @param b a #graphene_vec3_t
     * @param res return location for the result vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun max(b: Vec3, res: Vec3): Unit =
        graphene_vec3_max(gPointer.reinterpret(), b.gPointer.reinterpret(), res.gPointer.reinterpret())

    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the minimum values.
     *
     * @param b a #graphene_vec3_t
     * @param res return location for the result vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun min(b: Vec3, res: Vec3): Unit =
        graphene_vec3_min(gPointer.reinterpret(), b.gPointer.reinterpret(), res.gPointer.reinterpret())

    /**
     * Multiplies each component of the two given vectors.
     *
     * @param b a #graphene_vec3_t
     * @param res return location for the resulting vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun multiply(b: Vec3, res: Vec3): Unit =
        graphene_vec3_multiply(gPointer.reinterpret(), b.gPointer.reinterpret(), res.gPointer.reinterpret())

    /**
     * Compares the two given #graphene_vec3_t vectors and checks
     * whether their values are within the given @epsilon.
     *
     * @param v2 a #graphene_vec3_t
     * @param epsilon the threshold between the two vectors
     * @return `true` if the two vectors are near each other
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun near(v2: Vec3, epsilon: gfloat): Boolean =
        graphene_vec3_near(gPointer.reinterpret(), v2.gPointer.reinterpret(), epsilon)

    /**
     * Negates the given #graphene_vec3_t.
     *
     * @param res return location for the result vector
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun negate(res: Vec3): Unit = graphene_vec3_negate(gPointer.reinterpret(), res.gPointer.reinterpret())

    /**
     * Normalizes the given #graphene_vec3_t.
     *
     * @param res return location for the normalized vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun normalize(res: Vec3): Unit = graphene_vec3_normalize(gPointer.reinterpret(), res.gPointer.reinterpret())

    /**
     * Multiplies all components of the given vector with the given scalar @factor.
     *
     * @param factor the scalar factor
     * @param res return location for the result vector
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun scale(factor: gfloat, res: Vec3): Unit =
        graphene_vec3_scale(gPointer.reinterpret(), factor, res.gPointer.reinterpret())

    /**
     * Subtracts from each component of the first operand @a the
     * corresponding component of the second operand @b and places
     * each result into the components of @res.
     *
     * @param b a #graphene_vec3_t
     * @param res return location for the resulting vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun subtract(b: Vec3, res: Vec3): Unit =
        graphene_vec3_subtract(gPointer.reinterpret(), b.gPointer.reinterpret(), res.gPointer.reinterpret())

    public companion object {
        /**
         * Allocates a new #graphene_vec3_t structure.
         *
         * The contents of the returned structure are undefined.
         *
         * Use graphene_vec3_init() to initialize the vector.
         *
         * @return the newly allocated #graphene_vec3_t
         *   structure. Use graphene_vec3_free() to free the resources allocated
         *   by this function.
         * @since 1.0
         */
        public fun alloc(): Vec3 = Vec3(graphene_vec3_alloc()!!.reinterpret())

        /**
         * Provides a constant pointer to a vector with three components,
         * all sets to 1.
         *
         * @return a constant vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun one(): Vec3 = graphene_vec3_one()!!.run {
            Vec3(reinterpret())
        }

        /**
         * Provides a constant pointer to a vector with three components
         * with values set to (1, 0, 0).
         *
         * @return a constant vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun xAxis(): Vec3 = graphene_vec3_x_axis()!!.run {
            Vec3(reinterpret())
        }

        /**
         * Provides a constant pointer to a vector with three components
         * with values set to (0, 1, 0).
         *
         * @return a constant vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun yAxis(): Vec3 = graphene_vec3_y_axis()!!.run {
            Vec3(reinterpret())
        }

        /**
         * Provides a constant pointer to a vector with three components
         * with values set to (0, 0, 1).
         *
         * @return a constant vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun zAxis(): Vec3 = graphene_vec3_z_axis()!!.run {
            Vec3(reinterpret())
        }

        /**
         * Provides a constant pointer to a vector with three components,
         * all sets to 0.
         *
         * @return a constant vector
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun zero(): Vec3 = graphene_vec3_zero()!!.run {
            Vec3(reinterpret())
        }

        /**
         * Get the GType of Vec3
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_vec3_get_type()
    }
}
