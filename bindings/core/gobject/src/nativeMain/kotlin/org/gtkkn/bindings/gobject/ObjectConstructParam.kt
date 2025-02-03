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
import org.gtkkn.native.gobject.GObjectConstructParam
import kotlin.String

/**
 * The GObjectConstructParam struct is an auxiliary structure used to hand
 * #GParamSpec/#GValue pairs to the @constructor of a #GObjectClass.
 */
public class ObjectConstructParam(public val gobjectObjectConstructParamPointer: CPointer<GObjectConstructParam>) :
    ProxyInstance(gobjectObjectConstructParamPointer) {
    /**
     * the #GParamSpec of the construct parameter
     */
    public var pspec: ParamSpec?
        get() = gobjectObjectConstructParamPointer.pointed.pspec?.run {
            ParamSpec.ParamSpecImpl(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gobjectObjectConstructParamPointer.pointed.pspec = value?.gobjectParamSpecPointer
        }

    /**
     * the value to set the parameter to
     */
    public var `value`: Value?
        get() = gobjectObjectConstructParamPointer.pointed.value?.run {
            Value(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gobjectObjectConstructParamPointer.pointed.value = value?.gobjectValuePointer
        }

    /**
     * Allocate a new ObjectConstructParam.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GObjectConstructParam>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new ObjectConstructParam using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GObjectConstructParam>().ptr)

    /**
     * Allocate a new ObjectConstructParam.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param pspec the #GParamSpec of the construct parameter
     * @param value the value to set the parameter to
     */
    public constructor(pspec: ParamSpec?, `value`: Value?) : this() {
        this.pspec = pspec
        this.value = value
    }

    /**
     * Allocate a new ObjectConstructParam using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param pspec the #GParamSpec of the construct parameter
     * @param value the value to set the parameter to
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        pspec: ParamSpec?,
        `value`: Value?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.pspec = pspec
        this.value = value
    }

    override fun toString(): String = "ObjectConstructParam(pspec=$pspec, value=$value)"
}
