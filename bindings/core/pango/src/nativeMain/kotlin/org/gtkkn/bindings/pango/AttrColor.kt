// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.pango.PangoAttrColor
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `PangoAttrColor` structure is used to represent attributes that
 * are colors.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Field with not-pointer record/union PangoAttribute is not supported
 * - field `color`: Field with not-pointer record/union PangoColor is not supported
 */
public class AttrColor(public val pangoAttrColorPointer: CPointer<PangoAttrColor>, cleaner: Cleaner? = null) :
    ProxyInstance(pangoAttrColorPointer) {
    /**
     * Allocate a new AttrColor.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoAttrColor>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to AttrColor and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoAttrColor>, Cleaner>,
    ) : this(pangoAttrColorPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new AttrColor using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoAttrColor>().ptr)
}
