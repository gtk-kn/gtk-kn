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
import org.gtkkn.native.gobject.GTypeFundamentalInfo
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A structure that provides information to the type system which is
 * used specifically for managing fundamental types.
 */
public class TypeFundamentalInfo(
    public val gobjectTypeFundamentalInfoPointer: CPointer<GTypeFundamentalInfo>,
    cleaner: Cleaner? = null,
) : ProxyInstance(gobjectTypeFundamentalInfoPointer) {
    /**
     * #GTypeFundamentalFlags describing the characteristics of the fundamental type
     */
    public var typeFlags: TypeFundamentalFlags
        get() = gobjectTypeFundamentalInfoPointer.pointed.type_flags.run {
            TypeFundamentalFlags(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gobjectTypeFundamentalInfoPointer.pointed.type_flags = value.mask
        }

    /**
     * Allocate a new TypeFundamentalInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GTypeFundamentalInfo>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to TypeFundamentalInfo and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GTypeFundamentalInfo>, Cleaner>,
    ) : this(gobjectTypeFundamentalInfoPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new TypeFundamentalInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTypeFundamentalInfo>().ptr)

    /**
     * Allocate a new TypeFundamentalInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param typeFlags #GTypeFundamentalFlags describing the characteristics of the fundamental type
     */
    public constructor(typeFlags: TypeFundamentalFlags) : this() {
        this.typeFlags = typeFlags
    }

    /**
     * Allocate a new TypeFundamentalInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param typeFlags #GTypeFundamentalFlags describing the characteristics of the fundamental type
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(typeFlags: TypeFundamentalFlags, scope: AutofreeScope) : this(scope) {
        this.typeFlags = typeFlags
    }

    override fun toString(): String = "TypeFundamentalInfo(typeFlags=$typeFlags)"
}
