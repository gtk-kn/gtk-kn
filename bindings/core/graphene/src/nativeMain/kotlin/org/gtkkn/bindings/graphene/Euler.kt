// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_10
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_2
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gfloat
import org.gtkkn.native.graphene.graphene_euler_alloc
import org.gtkkn.native.graphene.graphene_euler_equal
import org.gtkkn.native.graphene.graphene_euler_free
import org.gtkkn.native.graphene.graphene_euler_get_alpha
import org.gtkkn.native.graphene.graphene_euler_get_beta
import org.gtkkn.native.graphene.graphene_euler_get_gamma
import org.gtkkn.native.graphene.graphene_euler_get_order
import org.gtkkn.native.graphene.graphene_euler_get_type
import org.gtkkn.native.graphene.graphene_euler_get_x
import org.gtkkn.native.graphene.graphene_euler_get_y
import org.gtkkn.native.graphene.graphene_euler_get_z
import org.gtkkn.native.graphene.graphene_euler_init
import org.gtkkn.native.graphene.graphene_euler_init_from_euler
import org.gtkkn.native.graphene.graphene_euler_init_from_matrix
import org.gtkkn.native.graphene.graphene_euler_init_from_quaternion
import org.gtkkn.native.graphene.graphene_euler_init_from_radians
import org.gtkkn.native.graphene.graphene_euler_init_from_vec3
import org.gtkkn.native.graphene.graphene_euler_init_with_order
import org.gtkkn.native.graphene.graphene_euler_reorder
import org.gtkkn.native.graphene.graphene_euler_t
import org.gtkkn.native.graphene.graphene_euler_to_matrix
import org.gtkkn.native.graphene.graphene_euler_to_quaternion
import org.gtkkn.native.graphene.graphene_euler_to_vec3
import kotlin.Boolean
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Describe a rotation using Euler angles.
 *
 * The contents of the #graphene_euler_t structure are private
 * and should never be accessed directly.
 * @since 1.2
 */
@GrapheneVersion1_2
public class Euler(pointer: CPointer<graphene_euler_t>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val grapheneEulerPointer: CPointer<graphene_euler_t> = pointer

    /**
     * Allocate a new Euler.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<graphene_euler_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Euler and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<graphene_euler_t>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Euler using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<graphene_euler_t>().ptr)

    /**
     * Checks if two #graphene_euler_t are equal.
     *
     * @param b a #graphene_euler_t
     * @return `true` if the two #graphene_euler_t are equal
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun equal(b: Euler): Boolean =
        graphene_euler_equal(grapheneEulerPointer.reinterpret(), b.grapheneEulerPointer.reinterpret())

    /**
     * Frees the resources allocated by graphene_euler_alloc().
     *
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun free(): Unit = graphene_euler_free(grapheneEulerPointer.reinterpret())

    /**
     * Retrieves the first component of the Euler angle vector,
     * depending on the order of rotation.
     *
     * See also: graphene_euler_get_x()
     *
     * @return the first component of the Euler angle vector, in radians
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun getAlpha(): gfloat = graphene_euler_get_alpha(grapheneEulerPointer.reinterpret())

    /**
     * Retrieves the second component of the Euler angle vector,
     * depending on the order of rotation.
     *
     * See also: graphene_euler_get_y()
     *
     * @return the second component of the Euler angle vector, in radians
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun getBeta(): gfloat = graphene_euler_get_beta(grapheneEulerPointer.reinterpret())

    /**
     * Retrieves the third component of the Euler angle vector,
     * depending on the order of rotation.
     *
     * See also: graphene_euler_get_z()
     *
     * @return the third component of the Euler angle vector, in radians
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun getGamma(): gfloat = graphene_euler_get_gamma(grapheneEulerPointer.reinterpret())

    /**
     * Retrieves the order used to apply the rotations described in the
     * #graphene_euler_t structure, when converting to and from other
     * structures, like #graphene_quaternion_t and #graphene_matrix_t.
     *
     * This function does not return the %GRAPHENE_EULER_ORDER_DEFAULT
     * enumeration value; it will return the effective order of rotation
     * instead.
     *
     * @return the order used to apply the rotations
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getOrder(): EulerOrder = graphene_euler_get_order(grapheneEulerPointer.reinterpret()).run {
        EulerOrder.fromNativeValue(this)
    }

    /**
     * Retrieves the rotation angle on the X axis, in degrees.
     *
     * @return the rotation angle
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getX(): gfloat = graphene_euler_get_x(grapheneEulerPointer.reinterpret())

    /**
     * Retrieves the rotation angle on the Y axis, in degrees.
     *
     * @return the rotation angle
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getY(): gfloat = graphene_euler_get_y(grapheneEulerPointer.reinterpret())

    /**
     * Retrieves the rotation angle on the Z axis, in degrees.
     *
     * @return the rotation angle
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getZ(): gfloat = graphene_euler_get_z(grapheneEulerPointer.reinterpret())

    /**
     * Initializes a #graphene_euler_t using the given angles.
     *
     * The order of the rotations is %GRAPHENE_EULER_ORDER_DEFAULT.
     *
     * @param x rotation angle on the X axis, in degrees
     * @param y rotation angle on the Y axis, in degrees
     * @param z rotation angle on the Z axis, in degrees
     * @return the initialized #graphene_euler_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun `init`(x: gfloat, y: gfloat, z: gfloat): Euler =
        graphene_euler_init(grapheneEulerPointer.reinterpret(), x, y, z)!!.run {
            Euler(reinterpret())
        }

    /**
     * Initializes a #graphene_euler_t using the angles and order of
     * another #graphene_euler_t.
     *
     * If the #graphene_euler_t @src is null, this function is equivalent
     * to calling graphene_euler_init() with all angles set to 0.
     *
     * @param src a #graphene_euler_t
     * @return the initialized #graphene_euler_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun initFromEuler(src: Euler? = null): Euler = graphene_euler_init_from_euler(
        grapheneEulerPointer.reinterpret(),
        src?.grapheneEulerPointer?.reinterpret()
    )!!.run {
        Euler(reinterpret())
    }

    /**
     * Initializes a #graphene_euler_t using the given rotation matrix.
     *
     * If the #graphene_matrix_t @m is null, the #graphene_euler_t will
     * be initialized with all angles set to 0.
     *
     * @param m a rotation matrix
     * @param order the order used to apply the rotations
     * @return the initialized #graphene_euler_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun initFromMatrix(m: Matrix? = null, order: EulerOrder): Euler = graphene_euler_init_from_matrix(
        grapheneEulerPointer.reinterpret(),
        m?.grapheneMatrixPointer?.reinterpret(),
        order.nativeValue
    )!!.run {
        Euler(reinterpret())
    }

    /**
     * Initializes a #graphene_euler_t using the given normalized quaternion.
     *
     * If the #graphene_quaternion_t @q is null, the #graphene_euler_t will
     * be initialized with all angles set to 0.
     *
     * @param q a normalized #graphene_quaternion_t
     * @param order the order used to apply the rotations
     * @return the initialized #graphene_euler_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun initFromQuaternion(q: Quaternion? = null, order: EulerOrder): Euler =
        graphene_euler_init_from_quaternion(
            grapheneEulerPointer.reinterpret(),
            q?.grapheneQuaternionPointer?.reinterpret(),
            order.nativeValue
        )!!.run {
            Euler(reinterpret())
        }

    /**
     * Initializes a #graphene_euler_t using the given angles
     * and order of rotation.
     *
     * @param x rotation angle on the X axis, in radians
     * @param y rotation angle on the Y axis, in radians
     * @param z rotation angle on the Z axis, in radians
     * @param order order of rotations
     * @return the initialized #graphene_euler_t
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun initFromRadians(x: gfloat, y: gfloat, z: gfloat, order: EulerOrder): Euler =
        graphene_euler_init_from_radians(grapheneEulerPointer.reinterpret(), x, y, z, order.nativeValue)!!.run {
            Euler(reinterpret())
        }

    /**
     * Initializes a #graphene_euler_t using the angles contained in a
     * #graphene_vec3_t.
     *
     * If the #graphene_vec3_t @v is null, the #graphene_euler_t will be
     * initialized with all angles set to 0.
     *
     * @param v a #graphene_vec3_t containing the rotation
     *   angles in degrees
     * @param order the order used to apply the rotations
     * @return the initialized #graphene_euler_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun initFromVec3(v: Vec3? = null, order: EulerOrder): Euler = graphene_euler_init_from_vec3(
        grapheneEulerPointer.reinterpret(),
        v?.grapheneVec3Pointer?.reinterpret(),
        order.nativeValue
    )!!.run {
        Euler(reinterpret())
    }

    /**
     * Initializes a #graphene_euler_t with the given angles and @order.
     *
     * @param x rotation angle on the X axis, in degrees
     * @param y rotation angle on the Y axis, in degrees
     * @param z rotation angle on the Z axis, in degrees
     * @param order the order used to apply the rotations
     * @return the initialized #graphene_euler_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun initWithOrder(x: gfloat, y: gfloat, z: gfloat, order: EulerOrder): Euler =
        graphene_euler_init_with_order(grapheneEulerPointer.reinterpret(), x, y, z, order.nativeValue)!!.run {
            Euler(reinterpret())
        }

    /**
     * Reorders a #graphene_euler_t using @order.
     *
     * This function is equivalent to creating a #graphene_quaternion_t from the
     * given #graphene_euler_t, and then converting the quaternion into another
     * #graphene_euler_t.
     *
     * @param order the new order
     * @param res return location for the reordered
     *   #graphene_euler_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun reorder(order: EulerOrder, res: Euler): Unit = graphene_euler_reorder(
        grapheneEulerPointer.reinterpret(),
        order.nativeValue,
        res.grapheneEulerPointer.reinterpret()
    )

    /**
     * Converts a #graphene_euler_t into a transformation matrix expressing
     * the extrinsic composition of rotations described by the Euler angles.
     *
     * The rotations are applied over the reference frame axes in the order
     * associated with the #graphene_euler_t; for instance, if the order
     * used to initialize @e is %GRAPHENE_EULER_ORDER_XYZ:
     *
     *  * the first rotation moves the body around the X axis with
     *    an angle φ
     *  * the second rotation moves the body around the Y axis with
     *    an angle of ϑ
     *  * the third rotation moves the body around the Z axis with
     *    an angle of ψ
     *
     * The rotation sign convention is right-handed, to preserve compatibility
     * between Euler-based, quaternion-based, and angle-axis-based rotations.
     *
     * @param res return location for a #graphene_matrix_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun toMatrix(res: Matrix): Unit =
        graphene_euler_to_matrix(grapheneEulerPointer.reinterpret(), res.grapheneMatrixPointer.reinterpret())

    /**
     * Converts a #graphene_euler_t into a #graphene_quaternion_t.
     *
     * @param res return location for a #graphene_quaternion_t
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun toQuaternion(res: Quaternion): Unit =
        graphene_euler_to_quaternion(grapheneEulerPointer.reinterpret(), res.grapheneQuaternionPointer.reinterpret())

    /**
     * Retrieves the angles of a #graphene_euler_t and initializes a
     * #graphene_vec3_t with them.
     *
     * @param res return location for a #graphene_vec3_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun toVec3(res: Vec3): Unit =
        graphene_euler_to_vec3(grapheneEulerPointer.reinterpret(), res.grapheneVec3Pointer.reinterpret())

    public companion object {
        /**
         * Allocates a new #graphene_euler_t.
         *
         * The contents of the returned structure are undefined.
         *
         * @return the newly allocated #graphene_euler_t
         * @since 1.2
         */
        public fun alloc(): Euler = Euler(graphene_euler_alloc()!!.reinterpret())

        /**
         * Get the GType of Euler
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_euler_get_type()
    }
}
