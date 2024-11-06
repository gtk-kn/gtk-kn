// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_0
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_2
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_4
import org.gtkkn.native.graphene.graphene_box_empty
import org.gtkkn.native.graphene.graphene_box_infinite
import org.gtkkn.native.graphene.graphene_box_minus_one
import org.gtkkn.native.graphene.graphene_box_one
import org.gtkkn.native.graphene.graphene_box_one_minus_one
import org.gtkkn.native.graphene.graphene_box_zero
import org.gtkkn.native.graphene.graphene_point3d_zero
import org.gtkkn.native.graphene.graphene_point_zero
import org.gtkkn.native.graphene.graphene_rect_alloc
import org.gtkkn.native.graphene.graphene_rect_zero
import org.gtkkn.native.graphene.graphene_size_zero
import org.gtkkn.native.graphene.graphene_vec2_one
import org.gtkkn.native.graphene.graphene_vec2_x_axis
import org.gtkkn.native.graphene.graphene_vec2_y_axis
import org.gtkkn.native.graphene.graphene_vec2_zero
import org.gtkkn.native.graphene.graphene_vec3_one
import org.gtkkn.native.graphene.graphene_vec3_x_axis
import org.gtkkn.native.graphene.graphene_vec3_y_axis
import org.gtkkn.native.graphene.graphene_vec3_z_axis
import org.gtkkn.native.graphene.graphene_vec3_zero
import org.gtkkn.native.graphene.graphene_vec4_one
import org.gtkkn.native.graphene.graphene_vec4_w_axis
import org.gtkkn.native.graphene.graphene_vec4_x_axis
import org.gtkkn.native.graphene.graphene_vec4_y_axis
import org.gtkkn.native.graphene.graphene_vec4_z_axis
import org.gtkkn.native.graphene.graphene_vec4_zero
import kotlin.Double
import kotlin.Int

/**
 * ## Skipped during bindings generation
 *
 * - record `Simd4F`: C Type graphene_simd4f_t is ignored
 */
public object Graphene {
    public const val PI: Double = 3.141593

    public const val PI_2: Double = 1.570796

    /**
     * Evaluates to the number of components of a #graphene_vec2_t.
     *
     * This symbol is useful when declaring a C array of floating
     * point values to be used with graphene_vec2_init_from_float() and
     * graphene_vec2_to_float(), e.g.
     *
     * |[
     *   float v[GRAPHENE_VEC2_LEN];
     *
     *   // vec is defined elsewhere
     *   graphene_vec2_to_float (&vec, v);
     *
     *   for (int i = 0; i < GRAPHENE_VEC2_LEN; i++)
     *     fprintf (stdout, "component %d: %g\n", i, v[i]);
     * ]|
     *
     * @since 1.0
     */
    public const val VEC2_LEN: Int = 2

    /**
     * Evaluates to the number of components of a #graphene_vec3_t.
     *
     * This symbol is useful when declaring a C array of floating
     * point values to be used with graphene_vec3_init_from_float() and
     * graphene_vec3_to_float(), e.g.
     *
     * |[
     *   float v[GRAPHENE_VEC3_LEN];
     *
     *   // vec is defined elsewhere
     *   graphene_vec3_to_float (&vec, v);
     *
     *   for (int i = 0; i < GRAPHENE_VEC2_LEN; i++)
     *     fprintf (stdout, "component %d: %g\n", i, v[i]);
     * ]|
     *
     * @since 1.0
     */
    public const val VEC3_LEN: Int = 3

    /**
     * Evaluates to the number of components of a #graphene_vec4_t.
     *
     * This symbol is useful when declaring a C array of floating
     * point values to be used with graphene_vec4_init_from_float() and
     * graphene_vec4_to_float(), e.g.
     *
     * |[
     *   float v[GRAPHENE_VEC4_LEN];
     *
     *   // vec is defined elsewhere
     *   graphene_vec4_to_float (&vec, v);
     *
     *   for (int i = 0; i < GRAPHENE_VEC4_LEN; i++)
     *     fprintf (stdout, "component %d: %g\n", i, v[i]);
     * ]|
     *
     * @since 1.0
     */
    public const val VEC4_LEN: Int = 4

    /**
     * A degenerate #graphene_box_t that can only be expanded.
     *
     * The returned value is owned by Graphene and should not be modified or freed.
     *
     * @return a #graphene_box_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun boxEmpty(): Box =
        graphene_box_empty()!!.run {
            Box(reinterpret())
        }

    /**
     * A degenerate #graphene_box_t that cannot be expanded.
     *
     * The returned value is owned by Graphene and should not be modified or freed.
     *
     * @return a #graphene_box_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun boxInfinite(): Box =
        graphene_box_infinite()!!.run {
            Box(reinterpret())
        }

    /**
     * A #graphene_box_t with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (0, 0, 0).
     *
     * The returned value is owned by Graphene and should not be modified or freed.
     *
     * @return a #graphene_box_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun boxMinusOne(): Box =
        graphene_box_minus_one()!!.run {
            Box(reinterpret())
        }

    /**
     * A #graphene_box_t with the minimum vertex set at (0, 0, 0) and the
     * maximum vertex set at (1, 1, 1).
     *
     * The returned value is owned by Graphene and should not be modified or freed.
     *
     * @return a #graphene_box_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun boxOne(): Box =
        graphene_box_one()!!.run {
            Box(reinterpret())
        }

    /**
     * A #graphene_box_t with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (1, 1, 1).
     *
     * The returned value is owned by Graphene and should not be modified or freed.
     *
     * @return a #graphene_box_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun boxOneMinusOne(): Box =
        graphene_box_one_minus_one()!!.run {
            Box(reinterpret())
        }

    /**
     * A #graphene_box_t with both the minimum and maximum vertices set at (0, 0, 0).
     *
     * The returned value is owned by Graphene and should not be modified or freed.
     *
     * @return a #graphene_box_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun boxZero(): Box =
        graphene_box_zero()!!.run {
            Box(reinterpret())
        }

    /**
     * Retrieves a constant point with all three coordinates set to 0.
     *
     * @return a zero point
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun point3dZero(): Point3D =
        graphene_point3d_zero()!!.run {
            Point3D(reinterpret())
        }

    /**
     * Returns a point fixed at (0, 0).
     *
     * @return a fixed point
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun pointZero(): Point =
        graphene_point_zero()!!.run {
            Point(reinterpret())
        }

    /**
     * Allocates a new #graphene_rect_t.
     *
     * The contents of the returned rectangle are undefined.
     *
     * @return the newly allocated rectangle
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun rectAlloc(): Rect =
        graphene_rect_alloc()!!.run {
            Rect(reinterpret())
        }

    /**
     * Returns a degenerate rectangle with origin fixed at (0, 0) and
     * a size of 0, 0.
     *
     * @return a fixed rectangle
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun rectZero(): Rect =
        graphene_rect_zero()!!.run {
            Rect(reinterpret())
        }

    /**
     * A constant pointer to a zero #graphene_size_t, useful for
     * equality checks and interpolations.
     *
     * @return a constant size
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun sizeZero(): Size =
        graphene_size_zero()!!.run {
            Size(reinterpret())
        }

    /**
     * Retrieves a constant vector with (1, 1) components.
     *
     * @return the one vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun vec2One(): Vec2 =
        graphene_vec2_one()!!.run {
            Vec2(reinterpret())
        }

    /**
     * Retrieves a constant vector with (1, 0) components.
     *
     * @return the X axis vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun vec2XAxis(): Vec2 =
        graphene_vec2_x_axis()!!.run {
            Vec2(reinterpret())
        }

    /**
     * Retrieves a constant vector with (0, 1) components.
     *
     * @return the Y axis vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun vec2YAxis(): Vec2 =
        graphene_vec2_y_axis()!!.run {
            Vec2(reinterpret())
        }

    /**
     * Retrieves a constant vector with (0, 0) components.
     *
     * @return the zero vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun vec2Zero(): Vec2 =
        graphene_vec2_zero()!!.run {
            Vec2(reinterpret())
        }

    /**
     * Provides a constant pointer to a vector with three components,
     * all sets to 1.
     *
     * @return a constant vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun vec3One(): Vec3 =
        graphene_vec3_one()!!.run {
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
    public fun vec3XAxis(): Vec3 =
        graphene_vec3_x_axis()!!.run {
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
    public fun vec3YAxis(): Vec3 =
        graphene_vec3_y_axis()!!.run {
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
    public fun vec3ZAxis(): Vec3 =
        graphene_vec3_z_axis()!!.run {
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
    public fun vec3Zero(): Vec3 =
        graphene_vec3_zero()!!.run {
            Vec3(reinterpret())
        }

    /**
     * Retrieves a pointer to a #graphene_vec4_t with all its
     * components set to 1.
     *
     * @return a constant vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun vec4One(): Vec4 =
        graphene_vec4_one()!!.run {
            Vec4(reinterpret())
        }

    /**
     * Retrieves a pointer to a #graphene_vec4_t with its
     * components set to (0, 0, 0, 1).
     *
     * @return a constant vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun vec4WAxis(): Vec4 =
        graphene_vec4_w_axis()!!.run {
            Vec4(reinterpret())
        }

    /**
     * Retrieves a pointer to a #graphene_vec4_t with its
     * components set to (1, 0, 0, 0).
     *
     * @return a constant vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun vec4XAxis(): Vec4 =
        graphene_vec4_x_axis()!!.run {
            Vec4(reinterpret())
        }

    /**
     * Retrieves a pointer to a #graphene_vec4_t with its
     * components set to (0, 1, 0, 0).
     *
     * @return a constant vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun vec4YAxis(): Vec4 =
        graphene_vec4_y_axis()!!.run {
            Vec4(reinterpret())
        }

    /**
     * Retrieves a pointer to a #graphene_vec4_t with its
     * components set to (0, 0, 1, 0).
     *
     * @return a constant vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun vec4ZAxis(): Vec4 =
        graphene_vec4_z_axis()!!.run {
            Vec4(reinterpret())
        }

    /**
     * Retrieves a pointer to a #graphene_vec4_t with all its
     * components set to 0.
     *
     * @return a constant vector
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun vec4Zero(): Vec4 =
        graphene_vec4_zero()!!.run {
            Vec4(reinterpret())
        }
}
