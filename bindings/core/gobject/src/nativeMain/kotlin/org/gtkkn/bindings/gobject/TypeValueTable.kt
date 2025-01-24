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
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.GTypeValueTable
import org.gtkkn.native.gobject.g_type_value_table_peek
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The #GTypeValueTable provides the functions required by the #GValue
 * implementation, to serve as a container for values of a type.
 *
 * ## Skipped during bindings generation
 *
 * - field `value_init`: TypeValueInitFunc
 * - field `value_free`: TypeValueFreeFunc
 * - field `value_copy`: TypeValueCopyFunc
 * - field `value_peek_pointer`: TypeValuePeekPointerFunc
 * - field `collect_value`: TypeValueCollectFunc
 * - field `lcopy_value`: TypeValueLCopyFunc
 */
public class TypeValueTable(
    public val gobjectTypeValueTablePointer: CPointer<GTypeValueTable>,
    cleaner: Cleaner? = null,
) : ProxyInstance(gobjectTypeValueTablePointer) {
    /**
     * A string format describing how to collect the contents of
     *   this value bit-by-bit. Each character in the format represents
     *   an argument to be collected, and the characters themselves indicate
     *   the type of the argument. Currently supported arguments are:
     *    - `'i'`: Integers, passed as `collect_values[].v_int`
     *    - `'l'`: Longs, passed as `collect_values[].v_long`
     *    - `'d'`: Doubles, passed as `collect_values[].v_double`
     *    - `'p'`: Pointers, passed as `collect_values[].v_pointer`
     *   It should be noted that for variable argument list construction,
     *   ANSI C promotes every type smaller than an integer to an int, and
     *   floats to doubles. So for collection of short int or char, `'i'`
     *   needs to be used, and for collection of floats `'d'`.
     */
    public var collectFormat: String?
        get() = gobjectTypeValueTablePointer.pointed.collect_format?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gobjectTypeValueTablePointer.pointed.collect_format?.let { g_free(it) }
            gobjectTypeValueTablePointer.pointed.collect_format = value?.let { g_strdup(it) }
        }

    /**
     * Format description of the arguments to collect for @lcopy_value,
     *   analogous to @collect_format. Usually, @lcopy_format string consists
     *   only of `'p'`s to provide lcopy_value() with pointers to storage locations.
     */
    public var lcopyFormat: String?
        get() = gobjectTypeValueTablePointer.pointed.lcopy_format?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gobjectTypeValueTablePointer.pointed.lcopy_format?.let { g_free(it) }
            gobjectTypeValueTablePointer.pointed.lcopy_format = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new TypeValueTable.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GTypeValueTable>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to TypeValueTable and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GTypeValueTable>, Cleaner>,
    ) : this(gobjectTypeValueTablePointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new TypeValueTable using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTypeValueTable>().ptr)

    /**
     * Allocate a new TypeValueTable.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param collectFormat A string format describing how to collect the contents of
     *   this value bit-by-bit. Each character in the format represents
     *   an argument to be collected, and the characters themselves indicate
     *   the type of the argument. Currently supported arguments are:
     *    - `'i'`: Integers, passed as `collect_values[].v_int`
     *    - `'l'`: Longs, passed as `collect_values[].v_long`
     *    - `'d'`: Doubles, passed as `collect_values[].v_double`
     *    - `'p'`: Pointers, passed as `collect_values[].v_pointer`
     *   It should be noted that for variable argument list construction,
     *   ANSI C promotes every type smaller than an integer to an int, and
     *   floats to doubles. So for collection of short int or char, `'i'`
     *   needs to be used, and for collection of floats `'d'`.
     * @param lcopyFormat Format description of the arguments to collect for @lcopy_value,
     *   analogous to @collect_format. Usually, @lcopy_format string consists
     *   only of `'p'`s to provide lcopy_value() with pointers to storage locations.
     */
    public constructor(collectFormat: String?, lcopyFormat: String?) : this() {
        this.collectFormat = collectFormat
        this.lcopyFormat = lcopyFormat
    }

    /**
     * Allocate a new TypeValueTable using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param collectFormat A string format describing how to collect the contents of
     *   this value bit-by-bit. Each character in the format represents
     *   an argument to be collected, and the characters themselves indicate
     *   the type of the argument. Currently supported arguments are:
     *    - `'i'`: Integers, passed as `collect_values[].v_int`
     *    - `'l'`: Longs, passed as `collect_values[].v_long`
     *    - `'d'`: Doubles, passed as `collect_values[].v_double`
     *    - `'p'`: Pointers, passed as `collect_values[].v_pointer`
     *   It should be noted that for variable argument list construction,
     *   ANSI C promotes every type smaller than an integer to an int, and
     *   floats to doubles. So for collection of short int or char, `'i'`
     *   needs to be used, and for collection of floats `'d'`.
     * @param lcopyFormat Format description of the arguments to collect for @lcopy_value,
     *   analogous to @collect_format. Usually, @lcopy_format string consists
     *   only of `'p'`s to provide lcopy_value() with pointers to storage locations.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        collectFormat: String?,
        lcopyFormat: String?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.collectFormat = collectFormat
        this.lcopyFormat = lcopyFormat
    }

    override fun toString(): String = "TypeValueTable(collectFormat=$collectFormat, lcopyFormat=$lcopyFormat)"

    public companion object {
        /**
         * Returns the location of the #GTypeValueTable associated with @type.
         *
         * Note that this function should only be used from source code
         * that implements or has internal knowledge of the implementation of
         * @type.
         *
         * @param type a #GType
         * @return location of the #GTypeValueTable associated with @type or
         *     null if there is no #GTypeValueTable associated with @type
         */
        public fun peek(type: GType): TypeValueTable = g_type_value_table_peek(type)!!.run {
            TypeValueTable(this)
        }
    }
}
