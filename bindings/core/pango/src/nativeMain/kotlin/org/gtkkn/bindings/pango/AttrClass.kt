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
import org.gtkkn.native.pango.PangoAttrClass
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `PangoAttrClass` structure stores the type and operations for
 * a particular type of attribute.
 *
 * The functions in this structure should not be called directly. Instead,
 * one should use the wrapper functions provided for `PangoAttribute`.
 *
 * ## Skipped during bindings generation
 *
 * - field `copy`: Fields with callbacks are not supported
 * - field `destroy`: Fields with callbacks are not supported
 * - field `equal`: Fields with callbacks are not supported
 */
public class AttrClass(public val pangoAttrClassPointer: CPointer<PangoAttrClass>, cleaner: Cleaner? = null) :
    ProxyInstance(pangoAttrClassPointer) {
    /**
     * the type ID for this attribute
     */
    public var type: AttrType
        get() = pangoAttrClassPointer.pointed.type.run {
            AttrType.fromNativeValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            pangoAttrClassPointer.pointed.type = value.nativeValue
        }

    /**
     * Allocate a new AttrClass.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoAttrClass>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to AttrClass and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoAttrClass>, Cleaner>,
    ) : this(pangoAttrClassPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new AttrClass using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoAttrClass>().ptr)

    /**
     * Allocate a new AttrClass.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param type the type ID for this attribute
     */
    public constructor(type: AttrType) : this() {
        this.type = type
    }

    /**
     * Allocate a new AttrClass using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param type the type ID for this attribute
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(type: AttrType, scope: AutofreeScope) : this(scope) {
        this.type = type
    }

    override fun toString(): String = "AttrClass(type=$type)"
}
