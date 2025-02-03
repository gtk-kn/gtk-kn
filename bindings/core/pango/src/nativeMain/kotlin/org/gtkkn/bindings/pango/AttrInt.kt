// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gint
import org.gtkkn.native.pango.PangoAttrInt
import kotlin.String

/**
 * The `PangoAttrInt` structure is used to represent attributes with
 * an integer or enumeration value.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Field with not-pointer record/union PangoAttribute is not supported
 */
public class AttrInt(public val pangoAttrIntPointer: CPointer<PangoAttrInt>) : ProxyInstance(pangoAttrIntPointer) {
    /**
     * the value of the attribute
     */
    public var `value`: gint
        get() = pangoAttrIntPointer.pointed.value

        @UnsafeFieldSetter
        set(`value`) {
            pangoAttrIntPointer.pointed.value = value
        }

    /**
     * Allocate a new AttrInt.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<PangoAttrInt>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new AttrInt using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoAttrInt>().ptr)

    /**
     * Allocate a new AttrInt.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param value the value of the attribute
     */
    public constructor(`value`: gint) : this() {
        this.value = value
    }

    /**
     * Allocate a new AttrInt using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param value the value of the attribute
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(`value`: gint, scope: AutofreeScope) : this(scope) {
        this.value = value
    }

    override fun toString(): String = "AttrInt(value=$value)"
}
