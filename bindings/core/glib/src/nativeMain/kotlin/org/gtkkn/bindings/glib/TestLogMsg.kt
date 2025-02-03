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
import org.gtkkn.native.glib.GTestLogMsg
import org.gtkkn.native.glib.g_test_log_msg_free
import org.gtkkn.native.glib.guint
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - field `strings`: Unsupported string with cType gchar**
 * - field `nums`: Unsupported pointer to primitive type
 */
public class TestLogMsg(public val glibTestLogMsgPointer: CPointer<GTestLogMsg>) :
    ProxyInstance(glibTestLogMsgPointer) {
    public var logType: TestLogType
        get() = glibTestLogMsgPointer.pointed.log_type.run {
            TestLogType.fromNativeValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibTestLogMsgPointer.pointed.log_type = value.nativeValue
        }

    public var nStrings: guint
        get() = glibTestLogMsgPointer.pointed.n_strings

        @UnsafeFieldSetter
        set(`value`) {
            glibTestLogMsgPointer.pointed.n_strings = value
        }

    public var nNums: guint
        get() = glibTestLogMsgPointer.pointed.n_nums

        @UnsafeFieldSetter
        set(`value`) {
            glibTestLogMsgPointer.pointed.n_nums = value
        }

    /**
     * Allocate a new TestLogMsg.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GTestLogMsg>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new TestLogMsg using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTestLogMsg>().ptr)

    /**
     * Allocate a new TestLogMsg.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param logType
     * @param nStrings
     * @param nNums
     */
    public constructor(
        logType: TestLogType,
        nStrings: guint,
        nNums: guint,
    ) : this() {
        this.logType = logType
        this.nStrings = nStrings
        this.nNums = nNums
    }

    /**
     * Allocate a new TestLogMsg using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param logType
     * @param nStrings
     * @param nNums
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        logType: TestLogType,
        nStrings: guint,
        nNums: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.logType = logType
        this.nStrings = nStrings
        this.nNums = nNums
    }

    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public fun free(): Unit = g_test_log_msg_free(glibTestLogMsgPointer)

    override fun toString(): String = "TestLogMsg(logType=$logType, nStrings=$nStrings, nNums=$nNums)"
}
