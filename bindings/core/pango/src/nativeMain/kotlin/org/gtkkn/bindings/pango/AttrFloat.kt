// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.gdouble
import org.gtkkn.native.pango.PangoAttrFloat
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `PangoAttrFloat` structure is used to represent attributes with
 * a float or double value.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Attribute
 */
public class AttrFloat(pointer: CPointer<PangoAttrFloat>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val pangoAttrFloatPointer: CPointer<PangoAttrFloat> = pointer

    /**
     * the value of the attribute
     */
    public var `value`: gdouble
        get() = pangoAttrFloatPointer.pointed.value

        @UnsafeFieldSetter
        set(`value`) {
            pangoAttrFloatPointer.pointed.value = value
        }

    /**
     * Allocate a new AttrFloat.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoAttrFloat>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to AttrFloat and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoAttrFloat>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new AttrFloat using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoAttrFloat>().ptr)

    /**
     * Allocate a new AttrFloat.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param value the value of the attribute
     */
    public constructor(`value`: gdouble) : this() {
        this.value = value
    }

    /**
     * Allocate a new AttrFloat using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param value the value of the attribute
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(`value`: gdouble, scope: AutofreeScope) : this(scope) {
        this.value = value
    }

    override fun toString(): String = "AttrFloat(value=$value)"
}
