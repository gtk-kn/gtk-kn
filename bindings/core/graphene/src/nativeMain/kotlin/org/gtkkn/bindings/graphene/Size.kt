// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.graphene.graphene_size_alloc
import org.gtkkn.native.graphene.graphene_size_equal
import org.gtkkn.native.graphene.graphene_size_free
import org.gtkkn.native.graphene.graphene_size_init
import org.gtkkn.native.graphene.graphene_size_init_from_size
import org.gtkkn.native.graphene.graphene_size_interpolate
import org.gtkkn.native.graphene.graphene_size_scale
import org.gtkkn.native.graphene.graphene_size_t
import org.gtkkn.native.graphene.graphene_size_zero
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Unit

/**
 * A size.
 * @since 1.0
 */
public class Size(
    pointer: CPointer<graphene_size_t>,
) : Record {
    public val grapheneSizePointer: CPointer<graphene_size_t> = pointer

    /**
     * the width
     */
    public var width: Float
        get() = grapheneSizePointer.pointed.width
        set(`value`) {
            grapheneSizePointer.pointed.width = value
        }

    /**
     * the height
     */
    public var height: Float
        get() = grapheneSizePointer.pointed.height
        set(`value`) {
            grapheneSizePointer.pointed.height = value
        }

    /**
     * Checks whether the two give #graphene_size_t are equal.
     *
     * @param b a #graphene_size_t
     * @return `true` if the sizes are equal
     * @since 1.0
     */
    public fun equal(b: Size): Boolean = graphene_size_equal(grapheneSizePointer.reinterpret(), b.grapheneSizePointer)

    /**
     * Frees the resources allocated by graphene_size_alloc().
     *
     * @since 1.0
     */
    public fun free(): Unit = graphene_size_free(grapheneSizePointer.reinterpret())

    /**
     * Initializes a #graphene_size_t using the given @width and @height.
     *
     * @param width the width
     * @param height the height
     * @return the initialized #graphene_size_t
     * @since 1.0
     */
    public fun `init`(
        width: Float,
        height: Float,
    ): Size =
        graphene_size_init(grapheneSizePointer.reinterpret(), width, height)!!.run {
            Size(reinterpret())
        }

    /**
     * Initializes a #graphene_size_t using the width and height of
     * the given @src.
     *
     * @param src a #graphene_size_t
     * @return the initialized #graphene_size_t
     * @since 1.0
     */
    public fun initFromSize(src: Size): Size =
        graphene_size_init_from_size(grapheneSizePointer.reinterpret(), src.grapheneSizePointer)!!.run {
            Size(reinterpret())
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
    public fun interpolate(
        b: Size,
        factor: Double,
        res: Size,
    ): Unit =
        graphene_size_interpolate(
            grapheneSizePointer.reinterpret(),
            b.grapheneSizePointer,
            factor,
            res.grapheneSizePointer
        )

    /**
     * Scales the components of a #graphene_size_t using the given @factor.
     *
     * @param factor the scaling factor
     * @param res return location for the scaled size
     * @since 1.0
     */
    public fun scale(
        factor: Float,
        res: Size,
    ): Unit = graphene_size_scale(grapheneSizePointer.reinterpret(), factor, res.grapheneSizePointer)

    public companion object : RecordCompanion<Size, graphene_size_t> {
        /**
         * Allocates a new #graphene_size_t.
         *
         * The contents of the returned value are undefined.
         *
         * @return the newly allocated #graphene_size_t
         * @since 1.0
         */
        public fun alloc(): Size = Size(graphene_size_alloc()!!.reinterpret())

        /**
         * A constant pointer to a zero #graphene_size_t, useful for
         * equality checks and interpolations.
         *
         * @return a constant size
         * @since 1.0
         */
        public fun zero(): Size =
            graphene_size_zero()!!.run {
                Size(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Size = Size(pointer.reinterpret())
    }
}
