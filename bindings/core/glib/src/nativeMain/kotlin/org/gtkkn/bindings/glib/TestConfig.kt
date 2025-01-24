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
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.glib.GTestConfig
import kotlin.Boolean
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

public class TestConfig(public val glibTestConfigPointer: CPointer<GTestConfig>, cleaner: Cleaner? = null) :
    ProxyInstance(glibTestConfigPointer) {
    public var testInitialized: Boolean
        get() = glibTestConfigPointer.pointed.test_initialized.asBoolean()

        @UnsafeFieldSetter
        set(`value`) {
            glibTestConfigPointer.pointed.test_initialized = value.asGBoolean()
        }

    public var testQuick: Boolean
        get() = glibTestConfigPointer.pointed.test_quick.asBoolean()

        @UnsafeFieldSetter
        set(`value`) {
            glibTestConfigPointer.pointed.test_quick = value.asGBoolean()
        }

    public var testPerf: Boolean
        get() = glibTestConfigPointer.pointed.test_perf.asBoolean()

        @UnsafeFieldSetter
        set(`value`) {
            glibTestConfigPointer.pointed.test_perf = value.asGBoolean()
        }

    public var testVerbose: Boolean
        get() = glibTestConfigPointer.pointed.test_verbose.asBoolean()

        @UnsafeFieldSetter
        set(`value`) {
            glibTestConfigPointer.pointed.test_verbose = value.asGBoolean()
        }

    public var testQuiet: Boolean
        get() = glibTestConfigPointer.pointed.test_quiet.asBoolean()

        @UnsafeFieldSetter
        set(`value`) {
            glibTestConfigPointer.pointed.test_quiet = value.asGBoolean()
        }

    public var testUndefined: Boolean
        get() = glibTestConfigPointer.pointed.test_undefined.asBoolean()

        @UnsafeFieldSetter
        set(`value`) {
            glibTestConfigPointer.pointed.test_undefined = value.asGBoolean()
        }

    /**
     * Allocate a new TestConfig.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GTestConfig>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to TestConfig and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GTestConfig>, Cleaner>,
    ) : this(glibTestConfigPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new TestConfig using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTestConfig>().ptr)

    /**
     * Allocate a new TestConfig.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param testInitialized
     * @param testQuick
     * @param testPerf
     * @param testVerbose
     * @param testQuiet
     * @param testUndefined
     */
    public constructor(
        testInitialized: Boolean,
        testQuick: Boolean,
        testPerf: Boolean,
        testVerbose: Boolean,
        testQuiet: Boolean,
        testUndefined: Boolean,
    ) : this() {
        this.testInitialized = testInitialized
        this.testQuick = testQuick
        this.testPerf = testPerf
        this.testVerbose = testVerbose
        this.testQuiet = testQuiet
        this.testUndefined = testUndefined
    }

    /**
     * Allocate a new TestConfig using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param testInitialized
     * @param testQuick
     * @param testPerf
     * @param testVerbose
     * @param testQuiet
     * @param testUndefined
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        testInitialized: Boolean,
        testQuick: Boolean,
        testPerf: Boolean,
        testVerbose: Boolean,
        testQuiet: Boolean,
        testUndefined: Boolean,
        scope: AutofreeScope,
    ) : this(scope) {
        this.testInitialized = testInitialized
        this.testQuick = testQuick
        this.testPerf = testPerf
        this.testVerbose = testVerbose
        this.testQuiet = testQuiet
        this.testUndefined = testUndefined
    }

    override fun toString(): String =
        "TestConfig(testInitialized=$testInitialized, testQuick=$testQuick, testPerf=$testPerf, testVerbose=$testVerbose, testQuiet=$testQuiet, testUndefined=$testUndefined)"
}
