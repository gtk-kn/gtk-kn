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
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GFlagsClass
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The class of a flags type holds information about its
 * possible values.
 *
 * ## Skipped during bindings generation
 *
 * - field `g_type_class`: Field with not-pointer record/union GTypeClass is not supported
 */
public class FlagsClass(public val gobjectFlagsClassPointer: CPointer<GFlagsClass>, cleaner: Cleaner? = null) :
    ProxyInstance(gobjectFlagsClassPointer) {
    /**
     * a mask covering all possible values.
     */
    public var mask: guint
        get() = gobjectFlagsClassPointer.pointed.mask

        @UnsafeFieldSetter
        set(`value`) {
            gobjectFlagsClassPointer.pointed.mask = value
        }

    /**
     * the number of possible values.
     */
    public var nValues: guint
        get() = gobjectFlagsClassPointer.pointed.n_values

        @UnsafeFieldSetter
        set(`value`) {
            gobjectFlagsClassPointer.pointed.n_values = value
        }

    /**
     * an array of #GFlagsValue structs describing the
     *  individual values.
     */
    public var values: FlagsValue?
        get() = gobjectFlagsClassPointer.pointed.values?.run {
            FlagsValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gobjectFlagsClassPointer.pointed.values = value?.gobjectFlagsValuePointer
        }

    /**
     * Allocate a new FlagsClass.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GFlagsClass>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to FlagsClass and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GFlagsClass>, Cleaner>,
    ) : this(gobjectFlagsClassPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new FlagsClass using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GFlagsClass>().ptr)

    /**
     * Allocate a new FlagsClass.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param mask a mask covering all possible values.
     * @param nValues the number of possible values.
     * @param values an array of #GFlagsValue structs describing the
     *  individual values.
     */
    public constructor(
        mask: guint,
        nValues: guint,
        values: FlagsValue?,
    ) : this() {
        this.mask = mask
        this.nValues = nValues
        this.values = values
    }

    /**
     * Allocate a new FlagsClass using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param mask a mask covering all possible values.
     * @param nValues the number of possible values.
     * @param values an array of #GFlagsValue structs describing the
     *  individual values.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        mask: guint,
        nValues: guint,
        values: FlagsValue?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.mask = mask
        this.nValues = nValues
        this.values = values
    }

    override fun toString(): String = "FlagsClass(mask=$mask, nValues=$nValues, values=$values)"
}
