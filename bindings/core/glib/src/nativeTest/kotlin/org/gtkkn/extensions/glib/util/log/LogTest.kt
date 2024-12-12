/*
 * Copyright (c) 2024 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.gtkkn.extensions.glib.util.log

import org.gtkkn.extensions.glib.util.log.writer.TestLogWriter
import kotlin.concurrent.AtomicReference
import kotlin.test.AfterTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class LogTest {
    @AfterTest
    fun tearDown() {
        Log.uninstallAll()
    }

    @Test
    fun `logging without an installed writer should not crash`() {
        log { "Hello" }
    }

    @Test
    fun `message lambda is not invoked if no writer is installed`() {
        var count = 0

        log { "Log Count: ${++count}" }

        assertEquals(0, count)
    }

    @Test
    fun `log messages are captured by the writer`() {
        val writer = installTestWriter()

        log("TAG") { "Hello, world!" }

        assertEquals("Hello, world!", writer.lastLog?.message)
    }

    @Test
    fun `log captures class name as default tag`() {
        val writer = installTestWriter()

        log { "Test message" }

        assertEquals(LogTest::class.simpleName, writer.lastLog?.tag)
    }

    @Test
    fun `log uses custom tag if provided`() {
        val writer = installTestWriter()

        log(tag = "CustomTag") { "Message with custom tag" }

        assertEquals("CustomTag", writer.lastLog?.tag)
    }

    @Test
    fun `log passes correct priority to writer`() {
        val writer = installTestWriter()

        log(LogLevel.INFO) { "Priority test message" }

        assertEquals(LogLevel.INFO, writer.lastLog?.level)
    }

    @Test
    fun `message lambda is not invoked when logging is not enabled`() {
        installTestWriter(writer = TestLogWriter(minLevel = LogLevel.ERROR))

        var count = 0

        log { "Message: ${++count}" }

        assertEquals(0, count)
    }

    @Test
    fun `standalone function logs with a custom tag`() {
        val writer = installTestWriter()

        standaloneFunctionLog(tag = "StandaloneTag") { "Standalone function message" }

        with(writer.lastLog) {
            assertNotNull(this)
            assertEquals("StandaloneTag", tag)
            assertEquals("Standalone function message", message)
        }
    }

    @Test
    fun `log captures outer context tag from lambda`() {
        val writer = installTestWriter()

        val lambda = {
            log { "Lambda message" }
        }
        lambda()

        assertEquals(LogTest::class.simpleName, writer.lastLog?.tag)
    }

    @Test
    fun `log captures outer context tag from nested lambda`() {
        val writer = installTestWriter()

        val outerLambda = {
            val innerLambda = {
                log { "Nested lambda message" }
            }
            innerLambda()
        }
        outerLambda()

        assertEquals(LogTest::class.simpleName, writer.lastLog?.tag)
    }

    @Test
    fun `log captures tag from companion function`() {
        val writer = installTestWriter()

        companionFunctionLog { "Companion function message" }

        assertEquals(LogTest::class.simpleName, writer.lastLog?.tag)
    }

    @Test
    fun `log passes level to isLoggable check`() {
        val receivedPriority = AtomicReference<LogLevel?>(null)
        installTestWriter(writer = TestLogWriter { receivedPriority.value = it; true })

        log(LogLevel.INFO) { "Priority check message" }

        assertEquals(LogLevel.INFO, receivedPriority.value)
    }

    @Test
    fun `log throwable includes stacktrace`() {
        val writer = installTestWriter()
        val exception = RuntimeException("Test exception")

        log { exception.asLog() }

        val stackTraceSnippet = "RuntimeException: Test exception"
        assertTrue(writer.lastLog?.message?.contains(stackTraceSnippet) == true)
    }

    @Test
    fun `log throwable instance includes stacktrace`() {
        val writer = installTestWriter()
        val exception = RuntimeException("Test exception")
        val message = "MY Message"

        Log.c("TAG", exception) {message}

        val stackTraceSnippet = "RuntimeException: Test exception"
        assertTrue(writer.lastLog?.message?.contains(stackTraceSnippet) == true)
        assertTrue(writer.lastLog?.message?.contains(message) == true)
    }

    private fun installTestWriter(
        debug: Boolean = true,
        release: Boolean = true,
        writer: TestLogWriter = TestLogWriter()
    ): TestLogWriter {
        Log.install(
            debug = debug,
            release = release,
            writer = { writer },
        )
        return writer
    }

    companion object {
        fun companionFunctionLog(message: () -> String) = log(message = message)
    }
}

fun standaloneFunctionLog(
    tag: String,
    message: () -> String
) = log(tag = tag, message = message)
