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
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GTuples
import org.gtkkn.native.glib.g_tuples_destroy
import org.gtkkn.native.glib.g_tuples_index
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import kotlin.String
import kotlin.Unit

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 2.26.
 *
 * Rarely used API
 * ---
 *
 * The #GTuples struct is used to return records (or tuples) from the
 * #GRelation by g_relation_select(). It only contains one public
 * member - the number of records that matched. To access the matched
 * records, you must use g_tuples_index().
 */
public class Tuples(public val glibTuplesPointer: CPointer<GTuples>) : ProxyInstance(glibTuplesPointer) {
    /**
     * the number of records that matched.
     */
    public var len: guint
        get() = glibTuplesPointer.pointed.len

        @UnsafeFieldSetter
        set(`value`) {
            glibTuplesPointer.pointed.len = value
        }

    /**
     * Allocate a new Tuples.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GTuples>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new Tuples using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTuples>().ptr)

    /**
     * Allocate a new Tuples.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param len the number of records that matched.
     */
    public constructor(len: guint) : this() {
        this.len = len
    }

    /**
     * Allocate a new Tuples using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param len the number of records that matched.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(len: guint, scope: AutofreeScope) : this(scope) {
        this.len = len
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.26.
     *
     * Rarely used API
     * ---
     *
     * Frees the records which were returned by g_relation_select(). This
     * should always be called after g_relation_select() when you are
     * finished with the records. The records are not removed from the
     * #GRelation.
     */
    public fun destroy(): Unit = g_tuples_destroy(glibTuplesPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.26.
     *
     * Rarely used API
     * ---
     *
     * Gets a field from the records returned by g_relation_select(). It
     * returns the given field of the record at the given index. The
     * returned value should not be changed.
     *
     * @param index the index of the record.
     * @param field the field to return.
     * @return the field of the record.
     */
    public fun index(index: gint, `field`: gint): gpointer? = g_tuples_index(glibTuplesPointer, index, `field`)

    override fun toString(): String = "Tuples(len=$len)"
}
