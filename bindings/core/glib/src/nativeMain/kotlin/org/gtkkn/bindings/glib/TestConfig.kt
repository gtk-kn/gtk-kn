// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GTestConfig
import kotlin.Boolean

public class TestConfig(
    pointer: CPointer<GTestConfig>,
) : Record {
    public val glibTestConfigPointer: CPointer<GTestConfig> = pointer

    public var testInitialized: Boolean
        get() = glibTestConfigPointer.pointed.test_initialized.asBoolean()
        set(`value`) {
            glibTestConfigPointer.pointed.test_initialized = value.asGBoolean()
        }

    public var testQuick: Boolean
        get() = glibTestConfigPointer.pointed.test_quick.asBoolean()
        set(`value`) {
            glibTestConfigPointer.pointed.test_quick = value.asGBoolean()
        }

    public var testPerf: Boolean
        get() = glibTestConfigPointer.pointed.test_perf.asBoolean()
        set(`value`) {
            glibTestConfigPointer.pointed.test_perf = value.asGBoolean()
        }

    public var testVerbose: Boolean
        get() = glibTestConfigPointer.pointed.test_verbose.asBoolean()
        set(`value`) {
            glibTestConfigPointer.pointed.test_verbose = value.asGBoolean()
        }

    public var testQuiet: Boolean
        get() = glibTestConfigPointer.pointed.test_quiet.asBoolean()
        set(`value`) {
            glibTestConfigPointer.pointed.test_quiet = value.asGBoolean()
        }

    public var testUndefined: Boolean
        get() = glibTestConfigPointer.pointed.test_undefined.asBoolean()
        set(`value`) {
            glibTestConfigPointer.pointed.test_undefined = value.asGBoolean()
        }

    public companion object : RecordCompanion<TestConfig, GTestConfig> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TestConfig = TestConfig(pointer.reinterpret())
    }
}
