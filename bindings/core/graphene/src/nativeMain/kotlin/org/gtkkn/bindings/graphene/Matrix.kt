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
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_4
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.graphene.graphene_matrix_alloc
import org.gtkkn.native.graphene.graphene_matrix_decompose
import org.gtkkn.native.graphene.graphene_matrix_determinant
import org.gtkkn.native.graphene.graphene_matrix_equal
import org.gtkkn.native.graphene.graphene_matrix_equal_fast
import org.gtkkn.native.graphene.graphene_matrix_free
import org.gtkkn.native.graphene.graphene_matrix_get_row
import org.gtkkn.native.graphene.graphene_matrix_get_type
import org.gtkkn.native.graphene.graphene_matrix_get_value
import org.gtkkn.native.graphene.graphene_matrix_get_x_scale
import org.gtkkn.native.graphene.graphene_matrix_get_x_translation
import org.gtkkn.native.graphene.graphene_matrix_get_y_scale
import org.gtkkn.native.graphene.graphene_matrix_get_y_translation
import org.gtkkn.native.graphene.graphene_matrix_get_z_scale
import org.gtkkn.native.graphene.graphene_matrix_get_z_translation
import org.gtkkn.native.graphene.graphene_matrix_init_from_2d
import org.gtkkn.native.graphene.graphene_matrix_init_from_matrix
import org.gtkkn.native.graphene.graphene_matrix_init_from_vec4
import org.gtkkn.native.graphene.graphene_matrix_init_frustum
import org.gtkkn.native.graphene.graphene_matrix_init_identity
import org.gtkkn.native.graphene.graphene_matrix_init_look_at
import org.gtkkn.native.graphene.graphene_matrix_init_ortho
import org.gtkkn.native.graphene.graphene_matrix_init_perspective
import org.gtkkn.native.graphene.graphene_matrix_init_rotate
import org.gtkkn.native.graphene.graphene_matrix_init_scale
import org.gtkkn.native.graphene.graphene_matrix_init_skew
import org.gtkkn.native.graphene.graphene_matrix_init_translate
import org.gtkkn.native.graphene.graphene_matrix_interpolate
import org.gtkkn.native.graphene.graphene_matrix_inverse
import org.gtkkn.native.graphene.graphene_matrix_is_2d
import org.gtkkn.native.graphene.graphene_matrix_is_backface_visible
import org.gtkkn.native.graphene.graphene_matrix_is_identity
import org.gtkkn.native.graphene.graphene_matrix_is_singular
import org.gtkkn.native.graphene.graphene_matrix_multiply
import org.gtkkn.native.graphene.graphene_matrix_near
import org.gtkkn.native.graphene.graphene_matrix_normalize
import org.gtkkn.native.graphene.graphene_matrix_perspective
import org.gtkkn.native.graphene.graphene_matrix_print
import org.gtkkn.native.graphene.graphene_matrix_project_point
import org.gtkkn.native.graphene.graphene_matrix_project_rect
import org.gtkkn.native.graphene.graphene_matrix_project_rect_bounds
import org.gtkkn.native.graphene.graphene_matrix_rotate
import org.gtkkn.native.graphene.graphene_matrix_rotate_euler
import org.gtkkn.native.graphene.graphene_matrix_rotate_quaternion
import org.gtkkn.native.graphene.graphene_matrix_rotate_x
import org.gtkkn.native.graphene.graphene_matrix_rotate_y
import org.gtkkn.native.graphene.graphene_matrix_rotate_z
import org.gtkkn.native.graphene.graphene_matrix_scale
import org.gtkkn.native.graphene.graphene_matrix_skew_xy
import org.gtkkn.native.graphene.graphene_matrix_skew_xz
import org.gtkkn.native.graphene.graphene_matrix_skew_yz
import org.gtkkn.native.graphene.graphene_matrix_t
import org.gtkkn.native.graphene.graphene_matrix_transform_bounds
import org.gtkkn.native.graphene.graphene_matrix_transform_box
import org.gtkkn.native.graphene.graphene_matrix_transform_point
import org.gtkkn.native.graphene.graphene_matrix_transform_point3d
import org.gtkkn.native.graphene.graphene_matrix_transform_ray
import org.gtkkn.native.graphene.graphene_matrix_transform_rect
import org.gtkkn.native.graphene.graphene_matrix_transform_sphere
import org.gtkkn.native.graphene.graphene_matrix_transform_vec3
import org.gtkkn.native.graphene.graphene_matrix_transform_vec4
import org.gtkkn.native.graphene.graphene_matrix_translate
import org.gtkkn.native.graphene.graphene_matrix_transpose
import org.gtkkn.native.graphene.graphene_matrix_unproject_point3d
import org.gtkkn.native.graphene.graphene_matrix_untransform_bounds
import org.gtkkn.native.graphene.graphene_matrix_untransform_point
import kotlin.Boolean
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A structure capable of holding a 4x4 matrix.
 *
 * The contents of the #graphene_matrix_t structure are private and
 * should never be accessed directly.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `v`: Array parameter of type gfloat is not supported
 * - parameter `xx`: xx: Out parameter is not supported
 * - parameter `v`: v: Out parameter is not supported
 */
public class Matrix(pointer: CPointer<graphene_matrix_t>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<graphene_matrix_t> = pointer

    /**
     * Allocate a new Matrix.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<graphene_matrix_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Matrix and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<graphene_matrix_t>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Matrix using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<graphene_matrix_t>().ptr)

    /**
     * Decomposes a transformation matrix into its component transformations.
     *
     * The algorithm for decomposing a matrix is taken from the
     * [CSS3 Transforms specification](http://dev.w3.org/csswg/css-transforms/);
     * specifically, the decomposition code is based on the equivalent code
     * published in "Graphics Gems II", edited by Jim Arvo, and
     * [available online](http://web.archive.org/web/20150512160205/http://tog.acm.org/resources/GraphicsGems/gemsii/unmatrix.c).
     *
     * @param translate the translation vector
     * @param scale the scale vector
     * @param rotate the rotation quaternion
     * @param shear the shear vector
     * @param perspective the perspective vector
     * @return `true` if the matrix could be decomposed
     */
    public fun decompose(translate: Vec3, scale: Vec3, rotate: Quaternion, shear: Vec3, perspective: Vec4): Boolean =
        graphene_matrix_decompose(
            gPointer,
            translate.gPointer,
            scale.gPointer,
            rotate.gPointer,
            shear.gPointer,
            perspective.gPointer
        )

    /**
     * Computes the determinant of the given matrix.
     *
     * @return the value of the determinant
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun determinant(): gfloat = graphene_matrix_determinant(gPointer)

    /**
     * Checks whether the two given #graphene_matrix_t matrices are equal.
     *
     * @param b a #graphene_matrix_t
     * @return `true` if the two matrices are equal, and `false` otherwise
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun equal(b: Matrix): Boolean = graphene_matrix_equal(gPointer, b.gPointer)

    /**
     * Checks whether the two given #graphene_matrix_t matrices are
     * byte-by-byte equal.
     *
     * While this function is faster than graphene_matrix_equal(), it
     * can also return false negatives, so it should be used in
     * conjuction with either graphene_matrix_equal() or
     * graphene_matrix_near(). For instance:
     *
     * |[<!-- language="C" -->
     *   if (graphene_matrix_equal_fast (a, b))
     *     {
     *       // matrices are definitely the same
     *     }
     *   else
     *     {
     *       if (graphene_matrix_equal (a, b))
     *         // matrices contain the same values within an epsilon of FLT_EPSILON
     *       else if (graphene_matrix_near (a, b, 0.0001))
     *         // matrices contain the same values within an epsilon of 0.0001
     *       else
     *         // matrices are not equal
     *     }
     * ]|
     *
     * @param b a #graphene_matrix_t
     * @return `true` if the matrices are equal. and `false` otherwise
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun equalFast(b: Matrix): Boolean = graphene_matrix_equal_fast(gPointer, b.gPointer)

    /**
     * Frees the resources allocated by graphene_matrix_alloc().
     *
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun free(): Unit = graphene_matrix_free(gPointer)

    /**
     * Retrieves the given row vector at @index_ inside a matrix.
     *
     * @param index the index of the row vector, between 0 and 3
     * @param res return location for the #graphene_vec4_t
     *   that is used to store the row vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getRow(index: guint, res: Vec4): Unit = graphene_matrix_get_row(gPointer, index, res.gPointer)

    /**
     * Retrieves the value at the given @row and @col index.
     *
     * @param row the row index
     * @param col the column index
     * @return the value at the given indices
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getValue(row: guint, col: guint): gfloat = graphene_matrix_get_value(gPointer, row, col)

    /**
     * Retrieves the scaling factor on the X axis in @m.
     *
     * @return the value of the scaling factor
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getXScale(): gfloat = graphene_matrix_get_x_scale(gPointer)

    /**
     * Retrieves the translation component on the X axis from @m.
     *
     * @return the translation component
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun getXTranslation(): gfloat = graphene_matrix_get_x_translation(gPointer)

    /**
     * Retrieves the scaling factor on the Y axis in @m.
     *
     * @return the value of the scaling factor
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getYScale(): gfloat = graphene_matrix_get_y_scale(gPointer)

    /**
     * Retrieves the translation component on the Y axis from @m.
     *
     * @return the translation component
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun getYTranslation(): gfloat = graphene_matrix_get_y_translation(gPointer)

    /**
     * Retrieves the scaling factor on the Z axis in @m.
     *
     * @return the value of the scaling factor
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getZScale(): gfloat = graphene_matrix_get_z_scale(gPointer)

    /**
     * Retrieves the translation component on the Z axis from @m.
     *
     * @return the translation component
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun getZTranslation(): gfloat = graphene_matrix_get_z_translation(gPointer)

    /**
     * Initializes a #graphene_matrix_t from the values of an affine
     * transformation matrix.
     *
     * The arguments map to the following matrix layout:
     *
     * |[<!-- language="plain" -->
     *   ⎛ xx  yx ⎞   ⎛  a   b  0 ⎞
     *   ⎜ xy  yy ⎟ = ⎜  c   d  0 ⎟
     *   ⎝ x0  y0 ⎠   ⎝ tx  ty  1 ⎠
     * ]|
     *
     * This function can be used to convert between an affine matrix type
     * from other libraries and a #graphene_matrix_t.
     *
     * @param xx the xx member
     * @param yx the yx member
     * @param xy the xy member
     * @param yy the yy member
     * @param x0 the x0 member
     * @param y0 the y0 member
     * @return the initialized matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFrom2d(xx: gdouble, yx: gdouble, xy: gdouble, yy: gdouble, x0: gdouble, y0: gdouble): Matrix =
        graphene_matrix_init_from_2d(gPointer, xx, yx, xy, yy, x0, y0)!!.run {
            Matrix(this)
        }

    /**
     * Initializes a #graphene_matrix_t using the values of the
     * given matrix.
     *
     * @param src a #graphene_matrix_t
     * @return the initialized matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromMatrix(src: Matrix): Matrix = graphene_matrix_init_from_matrix(gPointer, src.gPointer)!!.run {
        Matrix(this)
    }

    /**
     * Initializes a #graphene_matrix_t with the given four row
     * vectors.
     *
     * @param v0 the first row vector
     * @param v1 the second row vector
     * @param v2 the third row vector
     * @param v3 the fourth row vector
     * @return the initialized matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromVec4(v0: Vec4, v1: Vec4, v2: Vec4, v3: Vec4): Matrix =
        graphene_matrix_init_from_vec4(gPointer, v0.gPointer, v1.gPointer, v2.gPointer, v3.gPointer)!!.run {
            Matrix(this)
        }

    /**
     * Initializes a #graphene_matrix_t compatible with #graphene_frustum_t.
     *
     * See also: graphene_frustum_init_from_matrix()
     *
     * @param left distance of the left clipping plane
     * @param right distance of the right clipping plane
     * @param bottom distance of the bottom clipping plane
     * @param top distance of the top clipping plane
     * @param zNear distance of the near clipping plane
     * @param zFar distance of the far clipping plane
     * @return the initialized matrix
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun initFrustum(
        left: gfloat,
        right: gfloat,
        bottom: gfloat,
        top: gfloat,
        zNear: gfloat,
        zFar: gfloat,
    ): Matrix = graphene_matrix_init_frustum(gPointer, left, right, bottom, top, zNear, zFar)!!.run {
        Matrix(this)
    }

    /**
     * Initializes a #graphene_matrix_t with the identity matrix.
     *
     * @return the initialized matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initIdentity(): Matrix = graphene_matrix_init_identity(gPointer)!!.run {
        Matrix(this)
    }

    /**
     * Initializes a #graphene_matrix_t so that it positions the "camera"
     * at the given @eye coordinates towards an object at the @center
     * coordinates. The top of the camera is aligned to the direction
     * of the @up vector.
     *
     * Before the transform, the camera is assumed to be placed at the
     * origin, looking towards the negative Z axis, with the top side of
     * the camera facing in the direction of the Y axis and the right
     * side in the direction of the X axis.
     *
     * In theory, one could use @m to transform a model of such a camera
     * into world-space. However, it is more common to use the inverse of
     * @m to transform another object from world coordinates to the view
     * coordinates of the camera. Typically you would then apply the
     * camera projection transform to get from view to screen
     * coordinates.
     *
     * @param eye the vector describing the position to look from
     * @param center the vector describing the position to look at
     * @param up the vector describing the world's upward direction; usually,
     *   this is the graphene_vec3_y_axis() vector
     * @return the initialized matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initLookAt(eye: Vec3, center: Vec3, up: Vec3): Matrix =
        graphene_matrix_init_look_at(gPointer, eye.gPointer, center.gPointer, up.gPointer)!!.run {
            Matrix(this)
        }

    /**
     * Initializes a #graphene_matrix_t with an orthographic projection.
     *
     * @param left the left edge of the clipping plane
     * @param right the right edge of the clipping plane
     * @param top the top edge of the clipping plane
     * @param bottom the bottom edge of the clipping plane
     * @param zNear the distance of the near clipping plane
     * @param zFar the distance of the far clipping plane
     * @return the initialized matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initOrtho(
        left: gfloat,
        right: gfloat,
        top: gfloat,
        bottom: gfloat,
        zNear: gfloat,
        zFar: gfloat,
    ): Matrix = graphene_matrix_init_ortho(gPointer, left, right, top, bottom, zNear, zFar)!!.run {
        Matrix(this)
    }

    /**
     * Initializes a #graphene_matrix_t with a perspective projection.
     *
     * @param fovy the field of view angle, in degrees
     * @param aspect the aspect value
     * @param zNear the near Z plane
     * @param zFar the far Z plane
     * @return the initialized matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initPerspective(fovy: gfloat, aspect: gfloat, zNear: gfloat, zFar: gfloat): Matrix =
        graphene_matrix_init_perspective(gPointer, fovy, aspect, zNear, zFar)!!.run {
            Matrix(this)
        }

    /**
     * Initializes @m to represent a rotation of @angle degrees on
     * the axis represented by the @axis vector.
     *
     * @param angle the rotation angle, in degrees
     * @param axis the axis vector as a #graphene_vec3_t
     * @return the initialized matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initRotate(angle: gfloat, axis: Vec3): Matrix =
        graphene_matrix_init_rotate(gPointer, angle, axis.gPointer)!!.run {
            Matrix(this)
        }

    /**
     * Initializes a #graphene_matrix_t with the given scaling factors.
     *
     * @param x the scale factor on the X axis
     * @param y the scale factor on the Y axis
     * @param z the scale factor on the Z axis
     * @return the initialized matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initScale(x: gfloat, y: gfloat, z: gfloat): Matrix =
        graphene_matrix_init_scale(gPointer, x, y, z)!!.run {
            Matrix(this)
        }

    /**
     * Initializes a #graphene_matrix_t with a skew transformation
     * with the given factors.
     *
     * @param xSkew skew factor, in radians, on the X axis
     * @param ySkew skew factor, in radians, on the Y axis
     * @return the initialized matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initSkew(xSkew: gfloat, ySkew: gfloat): Matrix =
        graphene_matrix_init_skew(gPointer, xSkew, ySkew)!!.run {
            Matrix(this)
        }

    /**
     * Initializes a #graphene_matrix_t with a translation to the
     * given coordinates.
     *
     * @param p the translation coordinates
     * @return the initialized matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initTranslate(p: Point3d): Matrix = graphene_matrix_init_translate(gPointer, p.gPointer)!!.run {
        Matrix(this)
    }

    /**
     * Linearly interpolates the two given #graphene_matrix_t by
     * interpolating the decomposed transformations separately.
     *
     * If either matrix cannot be reduced to their transformations
     * then the interpolation cannot be performed, and this function
     * will return an identity matrix.
     *
     * @param b a #graphene_matrix_t
     * @param factor the linear interpolation factor
     * @param res return location for the
     *   interpolated matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun interpolate(b: Matrix, factor: gdouble, res: Matrix): Unit =
        graphene_matrix_interpolate(gPointer, b.gPointer, factor, res.gPointer)

    /**
     * Inverts the given matrix.
     *
     * @param res return location for the
     *   inverse matrix
     * @return `true` if the matrix is invertible
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun inverse(res: Matrix): Boolean = graphene_matrix_inverse(gPointer, res.gPointer)

    /**
     * Checks whether the given #graphene_matrix_t is compatible with an
     * a 2D affine transformation matrix.
     *
     * @return `true` if the matrix is compatible with an affine
     *   transformation matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun is2d(): Boolean = graphene_matrix_is_2d(gPointer)

    /**
     * Checks whether a #graphene_matrix_t has a visible back face.
     *
     * @return `true` if the back face of the matrix is visible
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun isBackfaceVisible(): Boolean = graphene_matrix_is_backface_visible(gPointer)

    /**
     * Checks whether the given #graphene_matrix_t is the identity matrix.
     *
     * @return `true` if the matrix is the identity matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun isIdentity(): Boolean = graphene_matrix_is_identity(gPointer)

    /**
     * Checks whether a matrix is singular.
     *
     * @return `true` if the matrix is singular
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun isSingular(): Boolean = graphene_matrix_is_singular(gPointer)

    /**
     * Multiplies two #graphene_matrix_t.
     *
     * Matrix multiplication is not commutative in general; the order of the factors matters.
     * The product of this multiplication is (@a × @b)
     *
     * @param b a #graphene_matrix_t
     * @param res return location for the matrix
     *   result
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun multiply(b: Matrix, res: Matrix): Unit = graphene_matrix_multiply(gPointer, b.gPointer, res.gPointer)

    /**
     * Compares the two given #graphene_matrix_t matrices and checks
     * whether their values are within the given @epsilon of each
     * other.
     *
     * @param b a #graphene_matrix_t
     * @param epsilon the threshold between the two matrices
     * @return `true` if the two matrices are near each other, and
     *   `false` otherwise
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun near(b: Matrix, epsilon: gfloat): Boolean = graphene_matrix_near(gPointer, b.gPointer, epsilon)

    /**
     * Normalizes the given #graphene_matrix_t.
     *
     * @param res return location for the normalized matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun normalize(res: Matrix): Unit = graphene_matrix_normalize(gPointer, res.gPointer)

    /**
     * Applies a perspective of @depth to the matrix.
     *
     * @param depth the depth of the perspective
     * @param res return location for the
     *   perspective matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun perspective(depth: gfloat, res: Matrix): Unit =
        graphene_matrix_perspective(gPointer, depth, res.gPointer)

    /**
     * Prints the contents of a matrix to the standard error stream.
     *
     * This function is only useful for debugging; there are no guarantees
     * made on the format of the output.
     *
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun print(): Unit = graphene_matrix_print(gPointer)

    /**
     * Projects a #graphene_point_t using the matrix @m.
     *
     * @param p a #graphene_point_t
     * @param res return location for the projected
     *   point
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun projectPoint(p: Point, res: Point): Unit =
        graphene_matrix_project_point(gPointer, p.gPointer, res.gPointer)

    /**
     * Projects all corners of a #graphene_rect_t using the given matrix.
     *
     * See also: graphene_matrix_project_point()
     *
     * @param r a #graphene_rect_t
     * @param res return location for the projected
     *   rectangle
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun projectRect(r: Rect, res: Quad): Unit = graphene_matrix_project_rect(gPointer, r.gPointer, res.gPointer)

    /**
     * Projects a #graphene_rect_t using the given matrix.
     *
     * The resulting rectangle is the axis aligned bounding rectangle capable
     * of fully containing the projected rectangle.
     *
     * @param r a #graphene_rect_t
     * @param res return location for the projected
     *   rectangle
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun projectRectBounds(r: Rect, res: Rect): Unit =
        graphene_matrix_project_rect_bounds(gPointer, r.gPointer, res.gPointer)

    /**
     * Adds a rotation transformation to @m, using the given @angle
     * and @axis vector.
     *
     * This is the equivalent of calling graphene_matrix_init_rotate() and
     * then multiplying the matrix @m with the rotation matrix.
     *
     * @param angle the rotation angle, in degrees
     * @param axis the rotation axis, as a #graphene_vec3_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun rotate(angle: gfloat, axis: Vec3): Unit = graphene_matrix_rotate(gPointer, angle, axis.gPointer)

    /**
     * Adds a rotation transformation to @m, using the given
     * #graphene_euler_t.
     *
     * @param e a rotation described by a #graphene_euler_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun rotateEuler(e: Euler): Unit = graphene_matrix_rotate_euler(gPointer, e.gPointer)

    /**
     * Adds a rotation transformation to @m, using the given
     * #graphene_quaternion_t.
     *
     * This is the equivalent of calling graphene_quaternion_to_matrix() and
     * then multiplying @m with the rotation matrix.
     *
     * @param q a rotation described by a #graphene_quaternion_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun rotateQuaternion(q: Quaternion): Unit = graphene_matrix_rotate_quaternion(gPointer, q.gPointer)

    /**
     * Adds a rotation transformation around the X axis to @m, using
     * the given @angle.
     *
     * See also: graphene_matrix_rotate()
     *
     * @param angle the rotation angle, in degrees
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun rotateX(angle: gfloat): Unit = graphene_matrix_rotate_x(gPointer, angle)

    /**
     * Adds a rotation transformation around the Y axis to @m, using
     * the given @angle.
     *
     * See also: graphene_matrix_rotate()
     *
     * @param angle the rotation angle, in degrees
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun rotateY(angle: gfloat): Unit = graphene_matrix_rotate_y(gPointer, angle)

    /**
     * Adds a rotation transformation around the Z axis to @m, using
     * the given @angle.
     *
     * See also: graphene_matrix_rotate()
     *
     * @param angle the rotation angle, in degrees
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun rotateZ(angle: gfloat): Unit = graphene_matrix_rotate_z(gPointer, angle)

    /**
     * Adds a scaling transformation to @m, using the three
     * given factors.
     *
     * This is the equivalent of calling graphene_matrix_init_scale() and then
     * multiplying the matrix @m with the scale matrix.
     *
     * @param factorX scaling factor on the X axis
     * @param factorY scaling factor on the Y axis
     * @param factorZ scaling factor on the Z axis
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun scale(factorX: gfloat, factorY: gfloat, factorZ: gfloat): Unit =
        graphene_matrix_scale(gPointer, factorX, factorY, factorZ)

    /**
     * Adds a skew of @factor on the X and Y axis to the given matrix.
     *
     * @param factor skew factor
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun skewXy(factor: gfloat): Unit = graphene_matrix_skew_xy(gPointer, factor)

    /**
     * Adds a skew of @factor on the X and Z axis to the given matrix.
     *
     * @param factor skew factor
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun skewXz(factor: gfloat): Unit = graphene_matrix_skew_xz(gPointer, factor)

    /**
     * Adds a skew of @factor on the Y and Z axis to the given matrix.
     *
     * @param factor skew factor
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun skewYz(factor: gfloat): Unit = graphene_matrix_skew_yz(gPointer, factor)

    /**
     * Transforms each corner of a #graphene_rect_t using the given matrix @m.
     *
     * The result is the axis aligned bounding rectangle containing the coplanar
     * quadrilateral.
     *
     * See also: graphene_matrix_transform_point()
     *
     * @param r a #graphene_rect_t
     * @param res return location for the bounds
     *   of the transformed rectangle
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun transformBounds(r: Rect, res: Rect): Unit =
        graphene_matrix_transform_bounds(gPointer, r.gPointer, res.gPointer)

    /**
     * Transforms the vertices of a #graphene_box_t using the given matrix @m.
     *
     * The result is the axis aligned bounding box containing the transformed
     * vertices.
     *
     * @param b a #graphene_box_t
     * @param res return location for the bounds
     *   of the transformed box
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun transformBox(b: Box, res: Box): Unit = graphene_matrix_transform_box(gPointer, b.gPointer, res.gPointer)

    /**
     * Transforms the given #graphene_point_t using the matrix @m.
     *
     * Unlike graphene_matrix_transform_vec3(), this function will take into
     * account the fourth row vector of the #graphene_matrix_t when computing
     * the dot product of each row vector of the matrix.
     *
     * See also: graphene_simd4x4f_point3_mul()
     *
     * @param p a #graphene_point_t
     * @param res return location for the
     *   transformed #graphene_point_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun transformPoint(p: Point, res: Point): Unit =
        graphene_matrix_transform_point(gPointer, p.gPointer, res.gPointer)

    /**
     * Transforms the given #graphene_point3d_t using the matrix @m.
     *
     * Unlike graphene_matrix_transform_vec3(), this function will take into
     * account the fourth row vector of the #graphene_matrix_t when computing
     * the dot product of each row vector of the matrix.
     *
     * See also: graphene_simd4x4f_point3_mul()
     *
     * @param p a #graphene_point3d_t
     * @param res return location for the result
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun transformPoint3d(p: Point3d, res: Point3d): Unit =
        graphene_matrix_transform_point3d(gPointer, p.gPointer, res.gPointer)

    /**
     * Transform a #graphene_ray_t using the given matrix @m.
     *
     * @param r a #graphene_ray_t
     * @param res return location for the
     *   transformed ray
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun transformRay(r: Ray, res: Ray): Unit = graphene_matrix_transform_ray(gPointer, r.gPointer, res.gPointer)

    /**
     * Transforms each corner of a #graphene_rect_t using the given matrix @m.
     *
     * The result is a coplanar quadrilateral.
     *
     * See also: graphene_matrix_transform_point()
     *
     * @param r a #graphene_rect_t
     * @param res return location for the
     *   transformed quad
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun transformRect(r: Rect, res: Quad): Unit =
        graphene_matrix_transform_rect(gPointer, r.gPointer, res.gPointer)

    /**
     * Transforms a #graphene_sphere_t using the given matrix @m. The
     * result is the bounding sphere containing the transformed sphere.
     *
     * @param s a #graphene_sphere_t
     * @param res return location for the bounds
     *   of the transformed sphere
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun transformSphere(s: Sphere, res: Sphere): Unit =
        graphene_matrix_transform_sphere(gPointer, s.gPointer, res.gPointer)

    /**
     * Transforms the given #graphene_vec3_t using the matrix @m.
     *
     * This function will multiply the X, Y, and Z row vectors of the matrix @m
     * with the corresponding components of the vector @v. The W row vector will
     * be ignored.
     *
     * See also: graphene_simd4x4f_vec3_mul()
     *
     * @param v a #graphene_vec3_t
     * @param res return location for a #graphene_vec3_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun transformVec3(v: Vec3, res: Vec3): Unit =
        graphene_matrix_transform_vec3(gPointer, v.gPointer, res.gPointer)

    /**
     * Transforms the given #graphene_vec4_t using the matrix @m.
     *
     * See also: graphene_simd4x4f_vec4_mul()
     *
     * @param v a #graphene_vec4_t
     * @param res return location for a #graphene_vec4_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun transformVec4(v: Vec4, res: Vec4): Unit =
        graphene_matrix_transform_vec4(gPointer, v.gPointer, res.gPointer)

    /**
     * Adds a translation transformation to @m using the coordinates
     * of the given #graphene_point3d_t.
     *
     * This is the equivalent of calling graphene_matrix_init_translate() and
     * then multiplying @m with the translation matrix.
     *
     * @param pos a #graphene_point3d_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun translate(pos: Point3d): Unit = graphene_matrix_translate(gPointer, pos.gPointer)

    /**
     * Transposes the given matrix.
     *
     * @param res return location for the
     *   transposed matrix
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun transpose(res: Matrix): Unit = graphene_matrix_transpose(gPointer, res.gPointer)

    /**
     * Unprojects the given @point using the @projection matrix and
     * a @modelview matrix.
     *
     * @param modelview a #graphene_matrix_t for the modelview matrix; this is
     *   the inverse of the modelview used when projecting the point
     * @param point a #graphene_point3d_t with the coordinates of the point
     * @param res return location for the unprojected
     *   point
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun unprojectPoint3d(modelview: Matrix, point: Point3d, res: Point3d): Unit =
        graphene_matrix_unproject_point3d(gPointer, modelview.gPointer, point.gPointer, res.gPointer)

    /**
     * Undoes the transformation on the corners of a #graphene_rect_t using the
     * given matrix, within the given axis aligned rectangular @bounds.
     *
     * @param r a #graphene_rect_t
     * @param bounds the bounds of the transformation
     * @param res return location for the
     *   untransformed rectangle
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun untransformBounds(r: Rect, bounds: Rect, res: Rect): Unit =
        graphene_matrix_untransform_bounds(gPointer, r.gPointer, bounds.gPointer, res.gPointer)

    /**
     * Undoes the transformation of a #graphene_point_t using the
     * given matrix, within the given axis aligned rectangular @bounds.
     *
     * @param p a #graphene_point_t
     * @param bounds the bounds of the transformation
     * @param res return location for the
     *   untransformed point
     * @return `true` if the point was successfully untransformed
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun untransformPoint(p: Point, bounds: Rect, res: Point): Boolean =
        graphene_matrix_untransform_point(gPointer, p.gPointer, bounds.gPointer, res.gPointer)

    public companion object {
        /**
         * Allocates a new #graphene_matrix_t.
         *
         * @return the newly allocated matrix
         * @since 1.0
         */
        public fun alloc(): Matrix = Matrix(graphene_matrix_alloc()!!)

        /**
         * Get the GType of Matrix
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_matrix_get_type()
    }
}
