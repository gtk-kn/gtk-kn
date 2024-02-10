// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GTestLogBuffer
import org.gtkkn.native.glib.g_test_log_buffer_free
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `bytes`: guint8
 * - field `data`: Record field data is private
 * - field `msgs`: Record field msgs is private
 */
public class TestLogBuffer(
    pointer: CPointer<GTestLogBuffer>,
) : Record {
    public val glibTestLogBufferPointer: CPointer<GTestLogBuffer> = pointer

    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public fun free(): Unit = g_test_log_buffer_free(glibTestLogBufferPointer.reinterpret())

    public companion object : RecordCompanion<TestLogBuffer, GTestLogBuffer> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TestLogBuffer =
            TestLogBuffer(pointer.reinterpret())
    }
}
