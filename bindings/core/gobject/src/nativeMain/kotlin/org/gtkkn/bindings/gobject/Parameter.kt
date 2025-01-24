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
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.gobject.GParameter
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The GParameter struct is an auxiliary structure used
 * to hand parameter name/value pairs to g_object_newv().
 *
 * ## Skipped during bindings generation
 *
 * - field `value`: Field with not-pointer record/union GValue is not supported
 */
public class Parameter(public val gobjectParameterPointer: CPointer<GParameter>, cleaner: Cleaner? = null) :
    ProxyInstance(gobjectParameterPointer) {
    /**
     * the parameter name
     */
    public var name: String?
        get() = gobjectParameterPointer.pointed.name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gobjectParameterPointer.pointed.name?.let { g_free(it) }
            gobjectParameterPointer.pointed.name = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new Parameter.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GParameter>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Parameter and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GParameter>, Cleaner>,
    ) : this(gobjectParameterPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Parameter using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GParameter>().ptr)

    /**
     * Allocate a new Parameter.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param name the parameter name
     */
    public constructor(name: String?) : this() {
        this.name = name
    }

    /**
     * Allocate a new Parameter using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param name the parameter name
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(name: String?, scope: AutofreeScope) : this(scope) {
        this.name = name
    }

    override fun toString(): String = "Parameter(name=$name)"
}
