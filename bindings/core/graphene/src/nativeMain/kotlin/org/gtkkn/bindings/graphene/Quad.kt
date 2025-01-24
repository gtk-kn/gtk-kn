// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_0
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
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

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
public class Quad(public val grapheneQuadPointer: CPointer<graphene_quad_t>, cleaner: Cleaner? = null) :
    ProxyInstance(grapheneQuadPointer) {
    /**
     * Allocate a new Quad.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<graphene_quad_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Quad and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<graphene_quad_t>, Cleaner>,
    ) : this(grapheneQuadPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Quad using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<graphene_quad_t>().ptr)

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
         * Allocates a new #graphene_quad_t instance.
         *
         * The contents of the returned instance are undefined.
         *
         * @return the newly created #graphene_quad_t instance
         * @since 1.0
         */
        public fun alloc(): Quad = Quad(graphene_quad_alloc()!!)

        /**
         * Get the GType of Quad
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_quad_get_type()
    }
}
