// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.pango.PangoAttrShape
import org.gtkkn.native.pango.pango_attr_shape_new
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `PangoAttrShape` structure is used to represent attributes which
 * impose shape restrictions.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `copy_func`: AttrDataCopyFunc
 * - field `attr`: Attribute
 * - field `ink_rect`: Rectangle
 * - field `logical_rect`: Rectangle
 * - field `copy_func`: AttrDataCopyFunc
 * - field `destroy_func`: GLib.DestroyNotify
 */
public class AttrShape(pointer: CPointer<PangoAttrShape>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val pangoAttrShapePointer: CPointer<PangoAttrShape> = pointer

    /**
     * user data set (see [func@Pango.AttrShape.new_with_data])
     */
    public var `data`: gpointer
        get() = pangoAttrShapePointer.pointed.data!!

        @UnsafeFieldSetter
        set(`value`) {
            pangoAttrShapePointer.pointed.data = value
        }

    /**
     * Allocate a new AttrShape.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoAttrShape>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to AttrShape and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoAttrShape>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new AttrShape using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoAttrShape>().ptr)

    /**
     * Allocate a new AttrShape.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param data user data set (see [func@Pango.AttrShape.new_with_data])
     */
    public constructor(`data`: gpointer) : this() {
        this.data = data
    }

    /**
     * Allocate a new AttrShape using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param data user data set (see [func@Pango.AttrShape.new_with_data])
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(`data`: gpointer, scope: AutofreeScope) : this(scope) {
        this.data = data
    }

    override fun toString(): String = "AttrShape(data=$data)"

    public companion object {
        /**
         * Create a new shape attribute.
         *
         * A shape is used to impose a particular ink and logical
         * rectangle on the result of shaping a particular glyph.
         * This might be used, for instance, for embedding a picture
         * or a widget inside a `PangoLayout`.
         *
         * @param inkRect ink rectangle to assign to each character
         * @param logicalRect logical rectangle to assign to each character
         * @return the newly allocated
         *   `PangoAttribute`, which should be freed with
         *   [method@Pango.Attribute.destroy]
         */
        public fun new(inkRect: Rectangle, logicalRect: Rectangle): Attribute = pango_attr_shape_new(
            inkRect.pangoRectanglePointer.reinterpret(),
            logicalRect.pangoRectanglePointer.reinterpret()
        )!!.run {
            Attribute(reinterpret())
        }
    }
}
