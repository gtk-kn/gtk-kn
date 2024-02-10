// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GWeakRef

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
public class WeakRef(
    pointer: CPointer<GWeakRef>,
) : Record {
    public val gobjectWeakRefPointer: CPointer<GWeakRef> = pointer

    public companion object : RecordCompanion<WeakRef, GWeakRef> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): WeakRef = WeakRef(pointer.reinterpret())
    }
}
