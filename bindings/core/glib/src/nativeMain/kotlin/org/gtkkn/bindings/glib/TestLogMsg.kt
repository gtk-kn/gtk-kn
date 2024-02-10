// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GTestLogMsg
import org.gtkkn.native.glib.g_test_log_msg_free
import kotlin.UInt
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - field `strings`: Unsupported string with cType gchar**
 * - field `nums`: long double
 */
public class TestLogMsg(
    pointer: CPointer<GTestLogMsg>,
) : Record {
    public val glibTestLogMsgPointer: CPointer<GTestLogMsg> = pointer

    public var logType: TestLogType
        get() =
            glibTestLogMsgPointer.pointed.log_type.run {
                TestLogType.fromNativeValue(this)
            }
        set(`value`) {
            glibTestLogMsgPointer.pointed.log_type = value.nativeValue
        }

    public var nStrings: UInt
        get() = glibTestLogMsgPointer.pointed.n_strings
        set(`value`) {
            glibTestLogMsgPointer.pointed.n_strings = value
        }

    public var nNums: UInt
        get() = glibTestLogMsgPointer.pointed.n_nums
        set(`value`) {
            glibTestLogMsgPointer.pointed.n_nums = value
        }

    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public fun free(): Unit = g_test_log_msg_free(glibTestLogMsgPointer.reinterpret())

    public companion object : RecordCompanion<TestLogMsg, GTestLogMsg> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TestLogMsg = TestLogMsg(pointer.reinterpret())
    }
}
