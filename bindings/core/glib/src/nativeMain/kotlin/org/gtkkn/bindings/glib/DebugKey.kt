// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GDebugKey
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.guint
import kotlin.String

/**
 * Associates a string with a bit flag.
 * Used in g_parse_debug_string().
 */
public class DebugKey(public val glibDebugKeyPointer: CPointer<GDebugKey>) : ProxyInstance(glibDebugKeyPointer) {
    /**
     * the string
     */
    public var key: String?
        get() = glibDebugKeyPointer.pointed.key?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibDebugKeyPointer.pointed.key?.let { g_free(it) }
            glibDebugKeyPointer.pointed.key = value?.let { g_strdup(it) }
        }

    /**
     * the flag
     */
    public var `value`: guint
        get() = glibDebugKeyPointer.pointed.value

        @UnsafeFieldSetter
        set(`value`) {
            glibDebugKeyPointer.pointed.value = value
        }

    /**
     * Allocate a new DebugKey.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GDebugKey>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new DebugKey using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GDebugKey>().ptr)

    /**
     * Allocate a new DebugKey.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param key the string
     * @param value the flag
     */
    public constructor(key: String?, `value`: guint) : this() {
        this.key = key
        this.value = value
    }

    /**
     * Allocate a new DebugKey using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param key the string
     * @param value the flag
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        key: String?,
        `value`: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.key = key
        this.value = value
    }

    override fun toString(): String = "DebugKey(key=$key, value=$value)"
}
