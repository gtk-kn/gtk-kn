// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_32
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GWeakRef
import org.gtkkn.native.gobject.g_weak_ref_clear
import org.gtkkn.native.gobject.g_weak_ref_get
import org.gtkkn.native.gobject.g_weak_ref_init
import org.gtkkn.native.gobject.g_weak_ref_set
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A structure containing a weak reference to a #GObject.
 *
 * A `GWeakRef` can either be empty (i.e. point to null), or point to an
 * object for as long as at least one "strong" reference to that object
 * exists. Before the object's #GObjectClass.dispose method is called,
 * every #GWeakRef associated with becomes empty (i.e. points to null).
 *
 * Like #GValue, #GWeakRef can be statically allocated, stack- or
 * heap-allocated, or embedded in larger structures.
 *
 * Unlike g_object_weak_ref() and g_object_add_weak_pointer(), this weak
 * reference is thread-safe: converting a weak pointer to a reference is
 * atomic with respect to invalidation of weak pointers to destroyed
 * objects.
 *
 * If the object's #GObjectClass.dispose method results in additional
 * references to the object being held (‘re-referencing’), any #GWeakRefs taken
 * before it was disposed will continue to point to null.  Any #GWeakRefs taken
 * during disposal and after re-referencing, or after disposal has returned due
 * to the re-referencing, will continue to point to the object until its refcount
 * goes back to zero, at which point they too will be invalidated.
 *
 * It is invalid to take a #GWeakRef on an object during #GObjectClass.dispose
 * without first having or creating a strong reference to the object.
 */
public class WeakRef(pointer: CPointer<GWeakRef>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gobjectWeakRefPointer: CPointer<GWeakRef> = pointer

    /**
     * Allocate a new WeakRef.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GWeakRef>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to WeakRef and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GWeakRef>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new WeakRef using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GWeakRef>().ptr)

    /**
     * Frees resources associated with a non-statically-allocated #GWeakRef.
     * After this call, the #GWeakRef is left in an undefined state.
     *
     * You should only call this on a #GWeakRef that previously had
     * g_weak_ref_init() called on it.
     *
     * @since 2.32
     */
    @GObjectVersion2_32
    public fun clear(): Unit = g_weak_ref_clear(gobjectWeakRefPointer.reinterpret())

    /**
     * If @weak_ref is not empty, atomically acquire a strong
     * reference to the object it points to, and return that reference.
     *
     * This function is needed because of the potential race between taking
     * the pointer value and g_object_ref() on it, if the object was losing
     * its last reference at the same time in a different thread.
     *
     * The caller should release the resulting reference in the usual way,
     * by using g_object_unref().
     *
     * @return the object pointed to
     *     by @weak_ref, or null if it was empty
     * @since 2.32
     */
    @GObjectVersion2_32
    public fun `get`(): Object = g_weak_ref_get(gobjectWeakRefPointer.reinterpret())!!.run {
        Object(reinterpret())
    }

    /**
     * Initialise a non-statically-allocated #GWeakRef.
     *
     * This function also calls g_weak_ref_set() with @object on the
     * freshly-initialised weak reference.
     *
     * This function should always be matched with a call to
     * g_weak_ref_clear().  It is not necessary to use this function for a
     * #GWeakRef in static storage because it will already be
     * properly initialised.  Just use g_weak_ref_set() directly.
     *
     * @param object a #GObject or null
     * @since 2.32
     */
    @GObjectVersion2_32
    public fun `init`(`object`: Object? = null): Unit =
        g_weak_ref_init(gobjectWeakRefPointer.reinterpret(), `object`?.gPointer?.reinterpret())

    /**
     * Change the object to which @weak_ref points, or set it to
     * null.
     *
     * You must own a strong reference on @object while calling this
     * function.
     *
     * @param object a #GObject or null
     * @since 2.32
     */
    @GObjectVersion2_32
    public fun `set`(`object`: Object? = null): Unit =
        g_weak_ref_set(gobjectWeakRefPointer.reinterpret(), `object`?.gPointer?.reinterpret())
}
