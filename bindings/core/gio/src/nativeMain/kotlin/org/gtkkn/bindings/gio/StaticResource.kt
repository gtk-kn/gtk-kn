// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GStaticResource
import org.gtkkn.native.gio.g_static_resource_fini
import org.gtkkn.native.gio.g_static_resource_get_resource
import org.gtkkn.native.gio.g_static_resource_init
import kotlin.Unit

/**
 * #GStaticResource is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class StaticResource(public val gioStaticResourcePointer: CPointer<GStaticResource>) :
    ProxyInstance(gioStaticResourcePointer) {
    /**
     * Allocate a new StaticResource.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GStaticResource>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new StaticResource using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GStaticResource>().ptr)

    /**
     * Finalized a GResource initialized by g_static_resource_init().
     *
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public fun fini(): Unit = g_static_resource_fini(gioStaticResourcePointer)

    /**
     * Gets the GResource that was registered by a call to g_static_resource_init().
     *
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     *
     * @return a #GResource
     * @since 2.32
     */
    @GioVersion2_32
    public fun getResource(): Resource = g_static_resource_get_resource(gioStaticResourcePointer)!!.run {
        Resource(this)
    }

    /**
     * Initializes a GResource from static data using a
     * GStaticResource.
     *
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public fun `init`(): Unit = g_static_resource_init(gioStaticResourcePointer)
}
