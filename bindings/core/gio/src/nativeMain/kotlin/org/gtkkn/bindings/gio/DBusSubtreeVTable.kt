// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GDBusSubtreeVTable
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Virtual table for handling subtrees registered with g_dbus_connection_register_subtree().
 *
 * ## Skipped during bindings generation
 *
 * - field `enumerate`: DBusSubtreeEnumerateFunc
 * - field `introspect`: DBusSubtreeIntrospectFunc
 * - field `dispatch`: DBusSubtreeDispatchFunc
 * - field `padding`: Record field padding is private
 *
 * @since 2.26
 */
@GioVersion2_26
public class DBusSubtreeVTable(pointer: CPointer<GDBusSubtreeVTable>, cleaner: Cleaner? = null) :
    ProxyInstance(pointer) {
    public val gioDBusSubtreeVTablePointer: CPointer<GDBusSubtreeVTable> = pointer

    /**
     * Allocate a new DBusSubtreeVTable.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GDBusSubtreeVTable>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to DBusSubtreeVTable and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GDBusSubtreeVTable>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new DBusSubtreeVTable using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GDBusSubtreeVTable>().ptr)
}
