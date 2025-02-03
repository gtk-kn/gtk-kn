// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_0
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.graphene.graphene_size_alloc
import org.gtkkn.native.graphene.graphene_size_equal
import org.gtkkn.native.graphene.graphene_size_free
import org.gtkkn.native.graphene.graphene_size_get_type
import org.gtkkn.native.graphene.graphene_size_init
import org.gtkkn.native.graphene.graphene_size_init_from_size
import org.gtkkn.native.graphene.graphene_size_interpolate
import org.gtkkn.native.graphene.graphene_size_scale
import org.gtkkn.native.graphene.graphene_size_t
import org.gtkkn.native.graphene.graphene_size_zero
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A size.
 * @since 1.0
 */
@GrapheneVersion1_0
public class Size(public val grapheneSizePointer: CPointer<graphene_size_t>) : ProxyInstance(grapheneSizePointer) {
    /**
     * the width
     */
    public var width: gfloat
        get() = grapheneSizePointer.pointed.width

        @UnsafeFieldSetter
        set(`value`) {
            grapheneSizePointer.pointed.width = value
        }

    /**
     * the height
     */
    public var height: gfloat
        get() = grapheneSizePointer.pointed.height

        @UnsafeFieldSetter
        set(`value`) {
            grapheneSizePointer.pointed.height = value
        }

    /**
     * Allocates a new #graphene_size_t.
     *
     * The contents of the returned value are undefined.
     *
     * @return the newly allocated #graphene_size_t
     * @since 1.0
     */
    public constructor() : this(graphene_size_alloc()!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Checks whether the two give #graphene_size_t are equal.
     *
     * @param b a #graphene_size_t
     * @return `true` if the sizes are equal
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun equal(b: Size): Boolean = graphene_size_equal(grapheneSizePointer, b.grapheneSizePointer)

    /**
     * Frees the resources allocated by graphene_size_alloc().
     *
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun free(): Unit = graphene_size_free(grapheneSizePointer)

    /**
     * Initializes a #graphene_size_t using the given @width and @height.
     *
     * @param width the width
     * @param height the height
     * @return the initialized #graphene_size_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun `init`(width: gfloat, height: gfloat): Size =
        graphene_size_init(grapheneSizePointer, width, height)!!.run {
            Size(this)
        }

    /**
     * Initializes a #graphene_size_t using the width and height of
     * the given @src.
     *
     * @param src a #graphene_size_t
     * @return the initialized #graphene_size_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromSize(src: Size): Size =
        graphene_size_init_from_size(grapheneSizePointer, src.grapheneSizePointer)!!.run {
            Size(this)
        }

    /**
     * Linearly interpolates the two given #graphene_size_t using the given
     * interpolation @factor.
     *
     * @param b a #graphene_size_t
     * @param factor the linear interpolation factor
     * @param res return location for the interpolated size
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun interpolate(b: Size, factor: gdouble, res: Size): Unit =
        graphene_size_interpolate(grapheneSizePointer, b.grapheneSizePointer, factor, res.grapheneSizePointer)

    /**
     * Scales the components of a #graphene_size_t using the given @factor.
     *
     * @param factor the scaling factor
     * @param res return location for the scaled size
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun scale(factor: gfloat, res: Size): Unit =
        graphene_size_scale(grapheneSizePointer, factor, res.grapheneSizePointer)

    override fun toString(): String = "Size(width=$width, height=$height)"

    public companion object {
        /**
         * A constant pointer to a zero #graphene_size_t, useful for
         * equality checks and interpolations.
         *
         * @return a constant size
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun zero(): Size = graphene_size_zero()!!.run {
            Size(this)
        }

        /**
         * Get the GType of Size
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_size_get_type()
    }
}
