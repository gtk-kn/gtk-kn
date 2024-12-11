// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GInterfaceInfo
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A structure that provides information to the type system which is
 * used specifically for managing interface types.
 *
 * ## Skipped during bindings generation
 *
 * - field `interface_init`: InterfaceInitFunc
 * - field `interface_finalize`: InterfaceFinalizeFunc
 * - field `interface_data`: gpointer
 */
public class InterfaceInfo(pointer: CPointer<GInterfaceInfo>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gobjectInterfaceInfoPointer: CPointer<GInterfaceInfo> = pointer

    /**
     * Allocate a new InterfaceInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GInterfaceInfo>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to InterfaceInfo and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GInterfaceInfo>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new InterfaceInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GInterfaceInfo>().ptr)
}
