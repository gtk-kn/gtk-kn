// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gtk.GtkBuildableParser
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A sub-parser for `GtkBuildable` implementations.
 *
 * ## Skipped during bindings generation
 *
 * - field `start_element`: Fields with callbacks are not supported
 * - field `end_element`: Fields with callbacks are not supported
 * - field `text`: Fields with callbacks are not supported
 * - field `error`: Fields with callbacks are not supported
 */
public class BuildableParser(pointer: CPointer<GtkBuildableParser>, cleaner: Cleaner? = null) :
    ProxyInstance(pointer) {
    public val gPointer: CPointer<GtkBuildableParser> = pointer

    /**
     * Allocate a new BuildableParser.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GtkBuildableParser>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to BuildableParser and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GtkBuildableParser>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new BuildableParser using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GtkBuildableParser>().ptr)
}
