// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GInterfaceInfo
import kotlin.String

/**
 * A structure that provides information to the type system which is
 * used specifically for managing interface types.
 *
 * ## Skipped during bindings generation
 *
 * - field `interface_init`: InterfaceInitFunc
 * - field `interface_finalize`: InterfaceFinalizeFunc
 */
public class InterfaceInfo(public val gobjectInterfaceInfoPointer: CPointer<GInterfaceInfo>) :
    ProxyInstance(gobjectInterfaceInfoPointer) {
    /**
     * user-supplied data passed to the interface init/finalize functions
     */
    public var interfaceData: gpointer
        get() = gobjectInterfaceInfoPointer.pointed.interface_data!!

        @UnsafeFieldSetter
        set(`value`) {
            gobjectInterfaceInfoPointer.pointed.interface_data = value
        }

    /**
     * Allocate a new InterfaceInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GInterfaceInfo>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new InterfaceInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GInterfaceInfo>().ptr)

    /**
     * Allocate a new InterfaceInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param interfaceData user-supplied data passed to the interface init/finalize functions
     */
    public constructor(interfaceData: gpointer) : this() {
        this.interfaceData = interfaceData
    }

    /**
     * Allocate a new InterfaceInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param interfaceData user-supplied data passed to the interface init/finalize functions
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(interfaceData: gpointer, scope: AutofreeScope) : this(scope) {
        this.interfaceData = interfaceData
    }

    override fun toString(): String = "InterfaceInfo(interfaceData=$interfaceData)"
}
