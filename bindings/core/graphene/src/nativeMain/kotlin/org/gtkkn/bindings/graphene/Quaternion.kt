// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.graphene.graphene_quaternion_add
import org.gtkkn.native.graphene.graphene_quaternion_alloc
import org.gtkkn.native.graphene.graphene_quaternion_dot
import org.gtkkn.native.graphene.graphene_quaternion_equal
import org.gtkkn.native.graphene.graphene_quaternion_free
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
import kotlin.Float
import kotlin.Unit

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
 * - field `x`: Record field x is private
 * - field `y`: Record field y is private
 * - field `z`: Record field z is private
 * - field `w`: Record field w is private
 *
 * @since 1.0
 */
public class Quaternion(
    pointer: CPointer<graphene_quaternion_t>,
) : Record {
    public val grapheneQuaternionPointer: CPointer<graphene_quaternion_t> = pointer

    /**
     * Adds two #graphene_quaternion_t @a and @b.
     *
     * @param b a #graphene_quaternion_t
     * @param res the result of the operation
     * @since 1.10
     */
    public fun add(
        b: Quaternion,
        res: Quaternion,
    ): Unit =
        graphene_quaternion_add(
            grapheneQuaternionPointer.reinterpret(),
            b.grapheneQuaternionPointer,
            res.grapheneQuaternionPointer
        )

    /**
     * Computes the dot product of two #graphene_quaternion_t.
     *
     * @param b a #graphene_quaternion_t
     * @return the value of the dot products
     * @since 1.0
     */
    public fun dot(b: Quaternion): Float =
        graphene_quaternion_dot(grapheneQuaternionPointer.reinterpret(), b.grapheneQuaternionPointer)

    /**
     * Checks whether the given quaternions are equal.
     *
     * @param b a #graphene_quaternion_t
     * @return `true` if the quaternions are equal
     * @since 1.0
     */
    public fun equal(b: Quaternion): Boolean =
        graphene_quaternion_equal(grapheneQuaternionPointer.reinterpret(), b.grapheneQuaternionPointer)

    /**
     * Releases the resources allocated by graphene_quaternion_alloc().
     *
     * @since 1.0
     */
    public fun free(): Unit = graphene_quaternion_free(grapheneQuaternionPointer.reinterpret())

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
    public fun `init`(
        x: Float,
        y: Float,
        z: Float,
        w: Float,
    ): Quaternion =
        graphene_quaternion_init(grapheneQuaternionPointer.reinterpret(), x, y, z, w)!!.run {
            Quaternion(reinterpret())
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
    public fun initFromAngleVec3(
        angle: Float,
        axis: Vec3,
    ): Quaternion =
        graphene_quaternion_init_from_angle_vec3(
            grapheneQuaternionPointer.reinterpret(),
            angle,
            axis.grapheneVec3Pointer
        )!!.run {
            Quaternion(reinterpret())
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
    public fun initFromAngles(
        degX: Float,
        degY: Float,
        degZ: Float,
    ): Quaternion =
        graphene_quaternion_init_from_angles(grapheneQuaternionPointer.reinterpret(), degX, degY, degZ)!!.run {
            Quaternion(reinterpret())
        }

    /**
     * Initializes a #graphene_quaternion_t using the given #graphene_euler_t.
     *
     * @param e a #graphene_euler_t
     * @return the initialized #graphene_quaternion_t
     * @since 1.2
     */
    public fun initFromEuler(e: Euler): Quaternion =
        graphene_quaternion_init_from_euler(grapheneQuaternionPointer.reinterpret(), e.grapheneEulerPointer)!!.run {
            Quaternion(reinterpret())
        }

    /**
     * Initializes a #graphene_quaternion_t using the rotation components
     * of a transformation matrix.
     *
     * @param m a #graphene_matrix_t
     * @return the initialized quaternion
     * @since 1.0
     */
    public fun initFromMatrix(m: Matrix): Quaternion =
        graphene_quaternion_init_from_matrix(grapheneQuaternionPointer.reinterpret(), m.grapheneMatrixPointer)!!.run {
            Quaternion(reinterpret())
        }

    /**
     * Initializes a #graphene_quaternion_t with the values from @src.
     *
     * @param src a #graphene_quaternion_t
     * @return the initialized quaternion
     * @since 1.0
     */
    public fun initFromQuaternion(src: Quaternion): Quaternion =
        graphene_quaternion_init_from_quaternion(
            grapheneQuaternionPointer.reinterpret(),
            src.grapheneQuaternionPointer
        )!!.run {
            Quaternion(reinterpret())
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
    public fun initFromRadians(
        radX: Float,
        radY: Float,
        radZ: Float,
    ): Quaternion =
        graphene_quaternion_init_from_radians(grapheneQuaternionPointer.reinterpret(), radX, radY, radZ)!!.run {
            Quaternion(reinterpret())
        }

    /**
     * Initializes a #graphene_quaternion_t with the values from @src.
     *
     * @param src a #graphene_vec4_t
     * @return the initialized quaternion
     * @since 1.0
     */
    public fun initFromVec4(src: Vec4): Quaternion =
        graphene_quaternion_init_from_vec4(grapheneQuaternionPointer.reinterpret(), src.grapheneVec4Pointer)!!.run {
            Quaternion(reinterpret())
        }

    /**
     * Initializes a #graphene_quaternion_t using the identity
     * transformation.
     *
     * @return the initialized quaternion
     * @since 1.0
     */
    public fun initIdentity(): Quaternion =
        graphene_quaternion_init_identity(grapheneQuaternionPointer.reinterpret())!!.run {
            Quaternion(reinterpret())
        }

    /**
     * Inverts a #graphene_quaternion_t, and returns the conjugate
     * quaternion of @q.
     *
     * @param res return location for the inverted
     *   quaternion
     * @since 1.0
     */
    public fun invert(res: Quaternion): Unit =
        graphene_quaternion_invert(grapheneQuaternionPointer.reinterpret(), res.grapheneQuaternionPointer)

    /**
     * Multiplies two #graphene_quaternion_t @a and @b.
     *
     * @param b a #graphene_quaternion_t
     * @param res the result of the operation
     * @since 1.10
     */
    public fun multiply(
        b: Quaternion,
        res: Quaternion,
    ): Unit =
        graphene_quaternion_multiply(
            grapheneQuaternionPointer.reinterpret(),
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
    public fun normalize(res: Quaternion): Unit =
        graphene_quaternion_normalize(grapheneQuaternionPointer.reinterpret(), res.grapheneQuaternionPointer)

    /**
     * Scales all the elements of a #graphene_quaternion_t @q using
     * the given scalar factor.
     *
     * @param factor a scaling factor
     * @param res the result of the operation
     * @since 1.10
     */
    public fun scale(
        factor: Float,
        res: Quaternion,
    ): Unit = graphene_quaternion_scale(grapheneQuaternionPointer.reinterpret(), factor, res.grapheneQuaternionPointer)

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
    public fun slerp(
        b: Quaternion,
        factor: Float,
        res: Quaternion,
    ): Unit =
        graphene_quaternion_slerp(
            grapheneQuaternionPointer.reinterpret(),
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
    public fun toMatrix(m: Matrix): Unit =
        graphene_quaternion_to_matrix(grapheneQuaternionPointer.reinterpret(), m.grapheneMatrixPointer)

    /**
     * Copies the components of a #graphene_quaternion_t into a
     * #graphene_vec4_t.
     *
     * @param res return location for a
     *   #graphene_vec4_t
     * @since 1.0
     */
    public fun toVec4(res: Vec4): Unit =
        graphene_quaternion_to_vec4(grapheneQuaternionPointer.reinterpret(), res.grapheneVec4Pointer)

    public companion object : RecordCompanion<Quaternion, graphene_quaternion_t> {
        /**
         * Allocates a new #graphene_quaternion_t.
         *
         * The contents of the returned value are undefined.
         *
         * @return the newly allocated #graphene_quaternion_t
         * @since 1.0
         */
        public fun alloc(): Quaternion = Quaternion(graphene_quaternion_alloc()!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Quaternion = Quaternion(pointer.reinterpret())
    }
}
