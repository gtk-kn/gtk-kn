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
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.graphene.graphene_quaternion_add
import org.gtkkn.native.graphene.graphene_quaternion_alloc
import org.gtkkn.native.graphene.graphene_quaternion_dot
import org.gtkkn.native.graphene.graphene_quaternion_equal
import org.gtkkn.native.graphene.graphene_quaternion_free
import org.gtkkn.native.graphene.graphene_quaternion_get_type
import org.gtkkn.native.graphene.graphene_quaternion_init
import org.gtkkn.native.graphene.graphene_quaternion_init_from_angle_vec3
import org.gtkkn.native.graphene.graphene_quaternion_init_from_angles
import org.gtkkn.native.graphene.graphene_quaternion_init_from_euler
import org.gtkkn.native.graphene.graphene_quaternion_init_from_matrix
import org.gtkkn.native.graphene.graphene_quaternion_init_from_quaternion
import org.gtkkn.native.graphene.graphene_quaternion_init_from_radians
import org.gtkkn.native.graphene.graphene_quaternion_init_from_vec4
import org.gtkkn.native.graphene.graphene_quaternion_init_identity
import org.gtkkn.native.graphene.graphene_quaternion_invert
import org.gtkkn.native.graphene.graphene_quaternion_multiply
import org.gtkkn.native.graphene.graphene_quaternion_normalize
import org.gtkkn.native.graphene.graphene_quaternion_scale
import org.gtkkn.native.graphene.graphene_quaternion_slerp
import org.gtkkn.native.graphene.graphene_quaternion_t
import org.gtkkn.native.graphene.graphene_quaternion_to_matrix
import org.gtkkn.native.graphene.graphene_quaternion_to_vec4
import kotlin.Boolean
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A quaternion.
 *
 * The contents of the #graphene_quaternion_t structure are private
 * and should never be accessed directly.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `angle`: angle: Out parameter is not supported
 * - parameter `deg_x`: deg_x: Out parameter is not supported
 * - parameter `rad_x`: rad_x: Out parameter is not supported
 *
 * @since 1.0
 */
@GrapheneVersion1_0
public class Quaternion(
    public val grapheneQuaternionPointer: CPointer<graphene_quaternion_t>,
    cleaner: Cleaner? = null,
) : ProxyInstance(grapheneQuaternionPointer) {
    /**
     * Allocate a new Quaternion.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<graphene_quaternion_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Quaternion and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<graphene_quaternion_t>, Cleaner>,
    ) : this(grapheneQuaternionPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Quaternion using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<graphene_quaternion_t>().ptr)

    /**
     * Adds two #graphene_quaternion_t @a and @b.
     *
     * @param b a #graphene_quaternion_t
     * @param res the result of the operation
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun add(b: Quaternion, res: Quaternion): Unit =
        graphene_quaternion_add(grapheneQuaternionPointer, b.grapheneQuaternionPointer, res.grapheneQuaternionPointer)

    /**
     * Computes the dot product of two #graphene_quaternion_t.
     *
     * @param b a #graphene_quaternion_t
     * @return the value of the dot products
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun dot(b: Quaternion): gfloat =
        graphene_quaternion_dot(grapheneQuaternionPointer, b.grapheneQuaternionPointer)

    /**
     * Checks whether the given quaternions are equal.
     *
     * @param b a #graphene_quaternion_t
     * @return `true` if the quaternions are equal
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun equal(b: Quaternion): Boolean =
        graphene_quaternion_equal(grapheneQuaternionPointer, b.grapheneQuaternionPointer)

    /**
     * Releases the resources allocated by graphene_quaternion_alloc().
     *
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun free(): Unit = graphene_quaternion_free(grapheneQuaternionPointer)

    /**
     * Initializes a #graphene_quaternion_t using the given four values.
     *
     * @param x the first component of the quaternion
     * @param y the second component of the quaternion
     * @param z the third component of the quaternion
     * @param w the fourth component of the quaternion
     * @return the initialized quaternion
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun `init`(x: gfloat, y: gfloat, z: gfloat, w: gfloat): Quaternion =
        graphene_quaternion_init(grapheneQuaternionPointer, x, y, z, w)!!.run {
            Quaternion(this)
        }

    /**
     * Initializes a #graphene_quaternion_t using an @angle on a
     * specific @axis.
     *
     * @param angle the rotation on a given axis, in degrees
     * @param axis the axis of rotation, expressed as a vector
     * @return the initialized quaternion
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromAngleVec3(angle: gfloat, axis: Vec3): Quaternion =
        graphene_quaternion_init_from_angle_vec3(grapheneQuaternionPointer, angle, axis.grapheneVec3Pointer)!!.run {
            Quaternion(this)
        }

    /**
     * Initializes a #graphene_quaternion_t using the values of
     * the [Euler angles](http://en.wikipedia.org/wiki/Euler_angles)
     * on each axis.
     *
     * See also: graphene_quaternion_init_from_euler()
     *
     * @param degX rotation angle on the X axis (yaw), in degrees
     * @param degY rotation angle on the Y axis (pitch), in degrees
     * @param degZ rotation angle on the Z axis (roll), in degrees
     * @return the initialized quaternion
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromAngles(degX: gfloat, degY: gfloat, degZ: gfloat): Quaternion =
        graphene_quaternion_init_from_angles(grapheneQuaternionPointer, degX, degY, degZ)!!.run {
            Quaternion(this)
        }

    /**
     * Initializes a #graphene_quaternion_t using the given #graphene_euler_t.
     *
     * @param e a #graphene_euler_t
     * @return the initialized #graphene_quaternion_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun initFromEuler(e: Euler): Quaternion =
        graphene_quaternion_init_from_euler(grapheneQuaternionPointer, e.grapheneEulerPointer)!!.run {
            Quaternion(this)
        }

    /**
     * Initializes a #graphene_quaternion_t using the rotation components
     * of a transformation matrix.
     *
     * @param m a #graphene_matrix_t
     * @return the initialized quaternion
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromMatrix(m: Matrix): Quaternion =
        graphene_quaternion_init_from_matrix(grapheneQuaternionPointer, m.grapheneMatrixPointer)!!.run {
            Quaternion(this)
        }

    /**
     * Initializes a #graphene_quaternion_t with the values from @src.
     *
     * @param src a #graphene_quaternion_t
     * @return the initialized quaternion
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromQuaternion(src: Quaternion): Quaternion =
        graphene_quaternion_init_from_quaternion(grapheneQuaternionPointer, src.grapheneQuaternionPointer)!!.run {
            Quaternion(this)
        }

    /**
     * Initializes a #graphene_quaternion_t using the values of
     * the [Euler angles](http://en.wikipedia.org/wiki/Euler_angles)
     * on each axis.
     *
     * See also: graphene_quaternion_init_from_euler()
     *
     * @param radX rotation angle on the X axis (yaw), in radians
     * @param radY rotation angle on the Y axis (pitch), in radians
     * @param radZ rotation angle on the Z axis (roll), in radians
     * @return the initialized quaternion
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromRadians(radX: gfloat, radY: gfloat, radZ: gfloat): Quaternion =
        graphene_quaternion_init_from_radians(grapheneQuaternionPointer, radX, radY, radZ)!!.run {
            Quaternion(this)
        }

    /**
     * Initializes a #graphene_quaternion_t with the values from @src.
     *
     * @param src a #graphene_vec4_t
     * @return the initialized quaternion
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromVec4(src: Vec4): Quaternion =
        graphene_quaternion_init_from_vec4(grapheneQuaternionPointer, src.grapheneVec4Pointer)!!.run {
            Quaternion(this)
        }

    /**
     * Initializes a #graphene_quaternion_t using the identity
     * transformation.
     *
     * @return the initialized quaternion
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initIdentity(): Quaternion = graphene_quaternion_init_identity(grapheneQuaternionPointer)!!.run {
        Quaternion(this)
    }

    /**
     * Inverts a #graphene_quaternion_t, and returns the conjugate
     * quaternion of @q.
     *
     * @param res return location for the inverted
     *   quaternion
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun invert(res: Quaternion): Unit =
        graphene_quaternion_invert(grapheneQuaternionPointer, res.grapheneQuaternionPointer)

    /**
     * Multiplies two #graphene_quaternion_t @a and @b.
     *
     * @param b a #graphene_quaternion_t
     * @param res the result of the operation
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun multiply(b: Quaternion, res: Quaternion): Unit = graphene_quaternion_multiply(
        grapheneQuaternionPointer,
        b.grapheneQuaternionPointer,
        res.grapheneQuaternionPointer
    )

    /**
     * Normalizes a #graphene_quaternion_t.
     *
     * @param res return location for the normalized
     *   quaternion
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun normalize(res: Quaternion): Unit =
        graphene_quaternion_normalize(grapheneQuaternionPointer, res.grapheneQuaternionPointer)

    /**
     * Scales all the elements of a #graphene_quaternion_t @q using
     * the given scalar factor.
     *
     * @param factor a scaling factor
     * @param res the result of the operation
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun scale(factor: gfloat, res: Quaternion): Unit =
        graphene_quaternion_scale(grapheneQuaternionPointer, factor, res.grapheneQuaternionPointer)

    /**
     * Interpolates between the two given quaternions using a spherical
     * linear interpolation, or [SLERP](http://en.wikipedia.org/wiki/Slerp),
     * using the given interpolation @factor.
     *
     * @param b a #graphene_quaternion_t
     * @param factor the linear interpolation factor
     * @param res return location for the interpolated
     *   quaternion
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun slerp(b: Quaternion, factor: gfloat, res: Quaternion): Unit = graphene_quaternion_slerp(
        grapheneQuaternionPointer,
        b.grapheneQuaternionPointer,
        factor,
        res.grapheneQuaternionPointer
    )

    /**
     * Converts a quaternion into a transformation matrix expressing
     * the rotation defined by the #graphene_quaternion_t.
     *
     * @param m a #graphene_matrix_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun toMatrix(m: Matrix): Unit =
        graphene_quaternion_to_matrix(grapheneQuaternionPointer, m.grapheneMatrixPointer)

    /**
     * Copies the components of a #graphene_quaternion_t into a
     * #graphene_vec4_t.
     *
     * @param res return location for a
     *   #graphene_vec4_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun toVec4(res: Vec4): Unit = graphene_quaternion_to_vec4(grapheneQuaternionPointer, res.grapheneVec4Pointer)

    public companion object {
        /**
         * Allocates a new #graphene_quaternion_t.
         *
         * The contents of the returned value are undefined.
         *
         * @return the newly allocated #graphene_quaternion_t
         * @since 1.0
         */
        public fun alloc(): Quaternion = Quaternion(graphene_quaternion_alloc()!!)

        /**
         * Get the GType of Quaternion
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_quaternion_get_type()
    }
}
