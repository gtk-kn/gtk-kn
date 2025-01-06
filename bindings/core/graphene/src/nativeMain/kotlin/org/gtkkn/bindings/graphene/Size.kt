// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_0
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
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
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A size.
 * @since 1.0
 */
@GrapheneVersion1_0
public class Size(pointer: CPointer<graphene_size_t>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<graphene_size_t> = pointer

    /**
     * the width
     */
    public var width: gfloat
        get() = gPointer.pointed.width

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.width = value
        }

    /**
     * the height
     */
    public var height: gfloat
        get() = gPointer.pointed.height

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.height = value
        }

    /**
     * Allocate a new Size.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<graphene_size_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Size and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<graphene_size_t>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Size using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<graphene_size_t>().ptr)

    /**
     * Allocate a new Size.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param width the width
     * @param height the height
     */
    public constructor(width: gfloat, height: gfloat) : this() {
        this.width = width
        this.height = height
    }

    /**
     * Allocate a new Size using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param width the width
     * @param height the height
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        width: gfloat,
        height: gfloat,
        scope: AutofreeScope,
    ) : this(scope) {
        this.width = width
        this.height = height
    }

    /**
     * Checks whether the two give #graphene_size_t are equal.
     *
     * @param b a #graphene_size_t
     * @return `true` if the sizes are equal
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun equal(b: Size): Boolean = graphene_size_equal(gPointer.reinterpret(), b.gPointer.reinterpret())

    /**
     * Frees the resources allocated by graphene_size_alloc().
     *
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun free(): Unit = graphene_size_free(gPointer.reinterpret())

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
        graphene_size_init(gPointer.reinterpret(), width, height)!!.run {
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
    @GrapheneVersion1_0
    public fun initFromSize(src: Size): Size =
        graphene_size_init_from_size(gPointer.reinterpret(), src.gPointer.reinterpret())!!.run {
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
    @GrapheneVersion1_0
    public fun interpolate(b: Size, factor: gdouble, res: Size): Unit =
        graphene_size_interpolate(gPointer.reinterpret(), b.gPointer.reinterpret(), factor, res.gPointer.reinterpret())

    /**
     * Scales the components of a #graphene_size_t using the given @factor.
     *
     * @param factor the scaling factor
     * @param res return location for the scaled size
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun scale(factor: gfloat, res: Size): Unit =
        graphene_size_scale(gPointer.reinterpret(), factor, res.gPointer.reinterpret())

    override fun toString(): String = "Size(width=$width, height=$height)"

    public companion object {
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
        @GrapheneVersion1_0
        public fun zero(): Size = graphene_size_zero()!!.run {
            Size(reinterpret())
        }

        /**
         * Get the GType of Size
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_size_get_type()
    }
}
