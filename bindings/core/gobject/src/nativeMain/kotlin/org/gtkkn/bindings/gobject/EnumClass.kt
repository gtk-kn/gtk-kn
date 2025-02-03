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
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GEnumClass
import kotlin.String

/**
 * The class of an enumeration type holds information about its
 * possible values.
 *
 * ## Skipped during bindings generation
 *
 * - field `g_type_class`: Field with not-pointer record/union GTypeClass is not supported
 */
public class EnumClass(public val gobjectEnumClassPointer: CPointer<GEnumClass>) :
    ProxyInstance(gobjectEnumClassPointer) {
    /**
     * the smallest possible value.
     */
    public var minimum: gint
        get() = gobjectEnumClassPointer.pointed.minimum

        @UnsafeFieldSetter
        set(`value`) {
            gobjectEnumClassPointer.pointed.minimum = value
        }

    /**
     * the largest possible value.
     */
    public var maximum: gint
        get() = gobjectEnumClassPointer.pointed.maximum

        @UnsafeFieldSetter
        set(`value`) {
            gobjectEnumClassPointer.pointed.maximum = value
        }

    /**
     * the number of possible values.
     */
    public var nValues: guint
        get() = gobjectEnumClassPointer.pointed.n_values

        @UnsafeFieldSetter
        set(`value`) {
            gobjectEnumClassPointer.pointed.n_values = value
        }

    /**
     * an array of #GEnumValue structs describing the
     *  individual values.
     */
    public var values: EnumValue?
        get() = gobjectEnumClassPointer.pointed.values?.run {
            EnumValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gobjectEnumClassPointer.pointed.values = value?.gobjectEnumValuePointer
        }

    /**
     * Allocate a new EnumClass.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GEnumClass>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new EnumClass using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GEnumClass>().ptr)

    /**
     * Allocate a new EnumClass.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param minimum the smallest possible value.
     * @param maximum the largest possible value.
     * @param nValues the number of possible values.
     * @param values an array of #GEnumValue structs describing the
     *  individual values.
     */
    public constructor(
        minimum: gint,
        maximum: gint,
        nValues: guint,
        values: EnumValue?,
    ) : this() {
        this.minimum = minimum
        this.maximum = maximum
        this.nValues = nValues
        this.values = values
    }

    /**
     * Allocate a new EnumClass using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param minimum the smallest possible value.
     * @param maximum the largest possible value.
     * @param nValues the number of possible values.
     * @param values an array of #GEnumValue structs describing the
     *  individual values.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        minimum: gint,
        maximum: gint,
        nValues: guint,
        values: EnumValue?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.minimum = minimum
        this.maximum = maximum
        this.nValues = nValues
        this.values = values
    }

    override fun toString(): String = "EnumClass(minimum=$minimum, maximum=$maximum, nValues=$nValues, values=$values)"
}
