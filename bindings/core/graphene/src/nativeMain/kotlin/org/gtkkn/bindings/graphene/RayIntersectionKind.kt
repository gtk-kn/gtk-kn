// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_10
import org.gtkkn.native.graphene.graphene_ray_intersection_kind_t

/**
 * The type of intersection.
 * @since 1.10
 */
@GrapheneVersion1_10
public enum class RayIntersectionKind(public val nativeValue: graphene_ray_intersection_kind_t) {
    /**
     * No intersection
     */
    NONE(graphene_ray_intersection_kind_t.GRAPHENE_RAY_INTERSECTION_KIND_NONE),

    /**
     * The ray is entering the intersected
     *   object
     */
    ENTER(graphene_ray_intersection_kind_t.GRAPHENE_RAY_INTERSECTION_KIND_ENTER),

    /**
     * The ray is leaving the intersected
     *   object
     */
    LEAVE(graphene_ray_intersection_kind_t.GRAPHENE_RAY_INTERSECTION_KIND_LEAVE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: graphene_ray_intersection_kind_t): RayIntersectionKind =
            when (nativeValue) {
                graphene_ray_intersection_kind_t.GRAPHENE_RAY_INTERSECTION_KIND_NONE -> NONE
                graphene_ray_intersection_kind_t.GRAPHENE_RAY_INTERSECTION_KIND_ENTER -> ENTER
                graphene_ray_intersection_kind_t.GRAPHENE_RAY_INTERSECTION_KIND_LEAVE -> LEAVE
                else -> error("invalid nativeValue")
            }
    }
}
