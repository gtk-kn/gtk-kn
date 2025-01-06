// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint

/**
 * ## Skipped during bindings generation
 *
 * - record `Simd4F`: C Type graphene_simd4f_t is ignored
 */
public object Graphene {
    public const val PI: gdouble = 3.141593

    public const val PI_2: gdouble = 1.570796

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
    public const val VEC2_LEN: gint = 2

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
    public const val VEC3_LEN: gint = 3

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
    public const val VEC4_LEN: gint = 4
}
