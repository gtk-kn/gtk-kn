// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.cairo.cairo_path_data_t
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

public class PathData(pointer: CPointer<cairo_path_data_t>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<cairo_path_data_t> = pointer

    public var x: gdouble
        get() = gPointer.pointed.point.x

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.point.x = value
        }

    public var y: gdouble
        get() = gPointer.pointed.point.y

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.point.y = value
        }

    public var type: PathDataType
        get() = gPointer.pointed.header.type.run {
            PathDataType.fromNativeValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.header.type = value.nativeValue
        }

    public var length: gint
        get() = gPointer.pointed.header.length

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.header.length = value
        }

    /**
     * Allocate a new PathData.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<cairo_path_data_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to PathData and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<cairo_path_data_t>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new PathData using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<cairo_path_data_t>().ptr)

    /**
     * Allocate a new PathData.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param x
     * @param y
     * @param type
     * @param length
     */
    public constructor(
        x: gdouble,
        y: gdouble,
        type: PathDataType,
        length: gint,
    ) : this() {
        this.x = x
        this.y = y
        this.type = type
        this.length = length
    }

    /**
     * Allocate a new PathData using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param x
     * @param y
     * @param type
     * @param length
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        x: gdouble,
        y: gdouble,
        type: PathDataType,
        length: gint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.x = x
        this.y = y
        this.type = type
        this.length = length
    }

    override fun toString(): String = "PathData(x=$x, y=$y, type=$type, length=$length)"
}
