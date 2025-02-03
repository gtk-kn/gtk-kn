// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GDBusSubtreeVTable

/**
 * Virtual table for handling subtrees registered with g_dbus_connection_register_subtree().
 *
 * ## Skipped during bindings generation
 *
 * - field `enumerate`: DBusSubtreeEnumerateFunc
 * - field `introspect`: DBusSubtreeIntrospectFunc
 * - field `dispatch`: DBusSubtreeDispatchFunc
 *
 * @since 2.26
 */
@GioVersion2_26
public class DBusSubtreeVTable(public val gioDBusSubtreeVTablePointer: CPointer<GDBusSubtreeVTable>) :
    ProxyInstance(gioDBusSubtreeVTablePointer) {
    /**
     * Allocate a new DBusSubtreeVTable.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GDBusSubtreeVTable>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new DBusSubtreeVTable using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GDBusSubtreeVTable>().ptr)
}
