// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GTypePluginClass
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The #GTypePlugin interface is used by the type system in order to handle
 * the lifecycle of dynamically loaded types.
 *
 * ## Skipped during bindings generation
 *
 * - field `use_plugin`: TypePluginUse
 * - field `unuse_plugin`: TypePluginUnuse
 * - field `complete_type_info`: TypePluginCompleteTypeInfo
 * - field `complete_interface_info`: TypePluginCompleteInterfaceInfo
 */
public class TypePluginClass(pointer: CPointer<GTypePluginClass>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GTypePluginClass> = pointer

    /**
     * Allocate a new TypePluginClass.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GTypePluginClass>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to TypePluginClass and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GTypePluginClass>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new TypePluginClass using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTypePluginClass>().ptr)
}
