// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GTuples
import org.gtkkn.native.glib.g_tuples_destroy
import org.gtkkn.native.gobject.guint
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The #GTuples struct is used to return records (or tuples) from the
 * #GRelation by g_relation_select(). It only contains one public
 * member - the number of records that matched. To access the matched
 * records, you must use g_tuples_index().
 *
 * ## Skipped during bindings generation
 *
 * - method `index`: Return type gpointer is unsupported
 */
public class Tuples(pointer: CPointer<GTuples>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibTuplesPointer: CPointer<GTuples> = pointer

    /**
     * the number of records that matched.
     */
    public var len: guint
        get() = glibTuplesPointer.pointed.len

        @UnsafeFieldSetter
        set(`value`) {
            glibTuplesPointer.pointed.len = value
        }

    /**
     * Allocate a new Tuples.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GTuples>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Tuples and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GTuples>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Tuples using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTuples>().ptr)

    /**
     * Allocate a new Tuples.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param len the number of records that matched.
     */
    public constructor(len: guint) : this() {
        this.len = len
    }

    /**
     * Allocate a new Tuples using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param len the number of records that matched.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(len: guint, scope: AutofreeScope) : this(scope) {
        this.len = len
    }

    /**
     * Frees the records which were returned by g_relation_select(). This
     * should always be called after g_relation_select() when you are
     * finished with the records. The records are not removed from the
     * #GRelation.
     */
    public fun destroy(): Unit = g_tuples_destroy(glibTuplesPointer.reinterpret())

    override fun toString(): String = "Tuples(len=$len)"
}
