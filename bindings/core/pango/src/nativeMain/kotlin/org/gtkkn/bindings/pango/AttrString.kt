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
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.pango.PangoAttrString
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `PangoAttrString` structure is used to represent attributes with
 * a string value.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Field with not-pointer record/union PangoAttribute is not supported
 */
public class AttrString(public val pangoAttrStringPointer: CPointer<PangoAttrString>, cleaner: Cleaner? = null) :
    ProxyInstance(pangoAttrStringPointer) {
    /**
     * the string which is the value of the attribute
     */
    public var `value`: String?
        get() = pangoAttrStringPointer.pointed.value?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            pangoAttrStringPointer.pointed.value?.let { g_free(it) }
            pangoAttrStringPointer.pointed.value = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new AttrString.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoAttrString>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to AttrString and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoAttrString>, Cleaner>,
    ) : this(pangoAttrStringPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new AttrString using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoAttrString>().ptr)

    /**
     * Allocate a new AttrString.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param value the string which is the value of the attribute
     */
    public constructor(`value`: String?) : this() {
        this.value = value
    }

    /**
     * Allocate a new AttrString using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param value the string which is the value of the attribute
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(`value`: String?, scope: AutofreeScope) : this(scope) {
        this.value = value
    }

    override fun toString(): String = "AttrString(value=$value)"
}
