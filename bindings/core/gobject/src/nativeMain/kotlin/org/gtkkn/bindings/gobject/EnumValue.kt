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
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GEnumValue
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A structure which contains a single enum value, its name, and its
 * nickname.
 */
public class EnumValue(public val gobjectEnumValuePointer: CPointer<GEnumValue>, cleaner: Cleaner? = null) :
    ProxyInstance(gobjectEnumValuePointer) {
    /**
     * the enum value
     */
    public var `value`: gint
        get() = gobjectEnumValuePointer.pointed.value

        @UnsafeFieldSetter
        set(`value`) {
            gobjectEnumValuePointer.pointed.value = value
        }

    /**
     * the name of the value
     */
    public var valueName: String?
        get() = gobjectEnumValuePointer.pointed.value_name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gobjectEnumValuePointer.pointed.value_name?.let { g_free(it) }
            gobjectEnumValuePointer.pointed.value_name = value?.let { g_strdup(it) }
        }

    /**
     * the nickname of the value
     */
    public var valueNick: String?
        get() = gobjectEnumValuePointer.pointed.value_nick?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gobjectEnumValuePointer.pointed.value_nick?.let { g_free(it) }
            gobjectEnumValuePointer.pointed.value_nick = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new EnumValue.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GEnumValue>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to EnumValue and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GEnumValue>, Cleaner>,
    ) : this(gobjectEnumValuePointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new EnumValue using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GEnumValue>().ptr)

    /**
     * Allocate a new EnumValue.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param value the enum value
     * @param valueName the name of the value
     * @param valueNick the nickname of the value
     */
    public constructor(
        `value`: gint,
        valueName: String?,
        valueNick: String?,
    ) : this() {
        this.value = value
        this.valueName = valueName
        this.valueNick = valueNick
    }

    /**
     * Allocate a new EnumValue using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param value the enum value
     * @param valueName the name of the value
     * @param valueNick the nickname of the value
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        `value`: gint,
        valueName: String?,
        valueNick: String?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.value = value
        this.valueName = valueName
        this.valueNick = valueNick
    }

    override fun toString(): String = "EnumValue(value=$value, valueName=$valueName, valueNick=$valueNick)"
}
