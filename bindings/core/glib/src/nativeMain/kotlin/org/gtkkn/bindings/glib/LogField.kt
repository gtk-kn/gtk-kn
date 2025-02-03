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
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.annotations.GLibVersion2_50
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GLogField
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gpointer
import kotlin.Long
import kotlin.String

/**
 * Structure representing a single field in a structured log entry. See
 * g_log_structured() for details.
 *
 * Log fields may contain arbitrary values, including binary with embedded nul
 * bytes. If the field contains a string, the string must be UTF-8 encoded and
 * have a trailing nul byte. Otherwise, @length must be set to a non-negative
 * value.
 * @since 2.50
 */
@GLibVersion2_50
public class LogField(public val glibLogFieldPointer: CPointer<GLogField>) : ProxyInstance(glibLogFieldPointer) {
    /**
     * field name (UTF-8 string)
     */
    public var key: String?
        get() = glibLogFieldPointer.pointed.key?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibLogFieldPointer.pointed.key?.let { g_free(it) }
            glibLogFieldPointer.pointed.key = value?.let { g_strdup(it) }
        }

    /**
     * field value (arbitrary bytes)
     */
    public var `value`: gpointer
        get() = glibLogFieldPointer.pointed.value!!

        @UnsafeFieldSetter
        set(`value`) {
            glibLogFieldPointer.pointed.value = value
        }

    /**
     * length of @value, in bytes, or -1 if it is nul-terminated
     */
    public var length: Long
        get() = glibLogFieldPointer.pointed.length

        @UnsafeFieldSetter
        set(`value`) {
            glibLogFieldPointer.pointed.length = value
        }

    /**
     * Allocate a new LogField.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GLogField>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new LogField using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GLogField>().ptr)

    /**
     * Allocate a new LogField.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param key field name (UTF-8 string)
     * @param value field value (arbitrary bytes)
     * @param length length of @value, in bytes, or -1 if it is nul-terminated
     */
    public constructor(
        key: String?,
        `value`: gpointer,
        length: Long,
    ) : this() {
        this.key = key
        this.value = value
        this.length = length
    }

    /**
     * Allocate a new LogField using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param key field name (UTF-8 string)
     * @param value field value (arbitrary bytes)
     * @param length length of @value, in bytes, or -1 if it is nul-terminated
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        key: String?,
        `value`: gpointer,
        length: Long,
        scope: AutofreeScope,
    ) : this(scope) {
        this.key = key
        this.value = value
        this.length = length
    }

    override fun toString(): String = "LogField(key=$key, value=$value, length=$length)"
}
