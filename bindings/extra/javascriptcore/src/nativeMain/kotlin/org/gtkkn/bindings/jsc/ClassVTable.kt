// This is a generated file. Do not modify.
package org.gtkkn.bindings.jsc

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.jsc.JSCClassVTable
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Virtual table for a JSCClass. This can be optionally used when registering a #JSCClass in a #JSCContext
 * to provide a custom implementation for the class. All virtual functions are optional and can be set to
 * null to fallback to the default implementation.
 *
 * ## Skipped during bindings generation
 *
 * - field `get_property`: ClassGetPropertyFunction
 * - field `set_property`: ClassSetPropertyFunction
 * - field `has_property`: ClassHasPropertyFunction
 * - field `delete_property`: ClassDeletePropertyFunction
 * - field `enumerate_properties`: ClassEnumeratePropertiesFunction
 * - field `_jsc_reserved0`: Fields with callbacks are not supported
 * - field `_jsc_reserved1`: Fields with callbacks are not supported
 * - field `_jsc_reserved2`: Fields with callbacks are not supported
 * - field `_jsc_reserved3`: Fields with callbacks are not supported
 * - field `_jsc_reserved4`: Fields with callbacks are not supported
 * - field `_jsc_reserved5`: Fields with callbacks are not supported
 * - field `_jsc_reserved6`: Fields with callbacks are not supported
 * - field `_jsc_reserved7`: Fields with callbacks are not supported
 */
public class ClassVTable(public val jscClassVTablePointer: CPointer<JSCClassVTable>, cleaner: Cleaner? = null) :
    ProxyInstance(jscClassVTablePointer) {
    /**
     * Allocate a new ClassVTable.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<JSCClassVTable>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to ClassVTable and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<JSCClassVTable>, Cleaner>,
    ) : this(jscClassVTablePointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new ClassVTable using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<JSCClassVTable>().ptr)
}
