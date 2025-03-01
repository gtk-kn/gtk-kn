// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_0
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.graphene.graphene_quad_alloc
import org.gtkkn.native.graphene.graphene_quad_bounds
import org.gtkkn.native.graphene.graphene_quad_contains
import org.gtkkn.native.graphene.graphene_quad_free
import org.gtkkn.native.graphene.graphene_quad_get_point
import org.gtkkn.native.graphene.graphene_quad_get_type
import org.gtkkn.native.graphene.graphene_quad_init
import org.gtkkn.native.graphene.graphene_quad_init_from_rect
import org.gtkkn.native.graphene.graphene_quad_t
import kotlin.Boolean
import kotlin.Unit

/**
 * A 4 vertex quadrilateral, as represented by four #graphene_point_t.
 *
 * The contents of a #graphene_quad_t are private and should never be
 * accessed directly.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `points`: Array parameter of type Point is not supported
 *
 * @since 1.0
 */
@GrapheneVersion1_0
public class Quad(public val grapheneQuadPointer: CPointer<graphene_quad_t>) : ProxyInstance(grapheneQuadPointer) {
    /**
     * Allocates a new #graphene_quad_t instance.
     *
     * The contents of the returned instance are undefined.
     *
     * @return the newly created #graphene_quad_t instance
     * @since 1.0
     */
    public constructor() : this(graphene_quad_alloc()!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Computes the bounding rectangle of @q and places it into @r.
     *
     * @param r return location for a #graphene_rect_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun bounds(r: Rect): Unit = graphene_quad_bounds(grapheneQuadPointer, r.grapheneRectPointer)

    /**
     * Checks if the given #graphene_quad_t contains the given #graphene_point_t.
     *
     * @param p a #graphene_point_t
     * @return `true` if the point is inside the #graphene_quad_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun contains(p: Point): Boolean = graphene_quad_contains(grapheneQuadPointer, p.graphenePointPointer)

    /**
     * Frees the resources allocated by graphene_quad_alloc()
     *
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun free(): Unit = graphene_quad_free(grapheneQuadPointer)

    /**
     * Retrieves the point of a #graphene_quad_t at the given index.
     *
     * @param index the index of the point to retrieve
     * @return a #graphene_point_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun getPoint(index: guint): Point = graphene_quad_get_point(grapheneQuadPointer, index)!!.run {
        Point(this)
    }

    /**
     * Initializes a #graphene_quad_t with the given points.
     *
     * @param p1 the first point of the quadrilateral
     * @param p2 the second point of the quadrilateral
     * @param p3 the third point of the quadrilateral
     * @param p4 the fourth point of the quadrilateral
     * @return the initialized #graphene_quad_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun `init`(p1: Point, p2: Point, p3: Point, p4: Point): Quad = graphene_quad_init(
        grapheneQuadPointer,
        p1.graphenePointPointer,
        p2.graphenePointPointer,
        p3.graphenePointPointer,
        p4.graphenePointPointer
    )!!.run {
        Quad(this)
    }

    /**
     * Initializes a #graphene_quad_t using the four corners of the
     * given #graphene_rect_t.
     *
     * @param r a #graphene_rect_t
     * @return the initialized #graphene_quad_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromRect(r: Rect): Quad =
        graphene_quad_init_from_rect(grapheneQuadPointer, r.grapheneRectPointer)!!.run {
            Quad(this)
        }

    public companion object {
        /**
         * Get the GType of Quad
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_quad_get_type()
    }
}
