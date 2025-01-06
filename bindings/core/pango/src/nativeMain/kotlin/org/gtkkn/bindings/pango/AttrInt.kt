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
import org.gtkkn.native.glib.gint
import org.gtkkn.native.pango.PangoAttrInt
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `PangoAttrInt` structure is used to represent attributes with
 * an integer or enumeration value.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Not-pointer record Attribute is ignored
 */
public class AttrInt(pointer: CPointer<PangoAttrInt>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<PangoAttrInt> = pointer

    /**
     * the value of the attribute
     */
    public var `value`: gint
        get() = gPointer.pointed.value

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.value = value
        }

    /**
     * Allocate a new AttrInt.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoAttrInt>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to AttrInt and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<PangoAttrInt>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new AttrInt using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoAttrInt>().ptr)

    /**
     * Allocate a new AttrInt.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param value the value of the attribute
     */
    public constructor(`value`: gint) : this() {
        this.value = value
    }

    /**
     * Allocate a new AttrInt using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param value the value of the attribute
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(`value`: gint, scope: AutofreeScope) : this(scope) {
        this.value = value
    }

    override fun toString(): String = "AttrInt(value=$value)"
}
