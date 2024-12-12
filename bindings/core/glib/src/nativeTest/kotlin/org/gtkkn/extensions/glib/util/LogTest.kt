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

package org.gtkkn.extensions.glib.util

import org.gtkkn.extensions.glib.util.loglogger.LogLogger
import org.gtkkn.extensions.glib.util.loglogger.TestLogLogger
import kotlin.concurrent.AtomicReference
import kotlin.test.AfterTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class LogTest {
    @AfterTest
    fun tearDown() {
        LogLogger.uninstall()
    }

    @Test
    fun `logging without an installed logger should not crash`() {
        log { "Hello" }
    }

    @Test
    fun `message lambda is not invoked if no logger is installed`() {
        var count = 0

        log { "Log Count: ${++count}" }

        assertEquals(0, count)
    }

    @Test
    fun `log messages are captured by the logger`() {
        val logger = platformTestLogger().apply { LogLogger.install(this); latestLog = null }

        log { "Hello, world!" }

        assertEquals("Hello, world!", logger.latestLog?.message)
    }

    @Test
    fun `log captures class name as default tag`() {
        val logger = platformTestLogger().apply { LogLogger.install(this); latestLog = null }

        log { "Test message" }

        assertEquals(LogTest::class.simpleName, logger.latestLog?.logDomain)
    }

    @Test
    fun `log uses custom tag if provided`() {
        val logger = platformTestLogger().apply { LogLogger.install(this); latestLog = null }

        log(logDomain = "CustomTag") { "Message with custom tag" }

        assertEquals("CustomTag", logger.latestLog?.logDomain)
    }

    @Test
    fun `log passes correct priority to logger`() {
        val logger = platformTestLogger().apply { LogLogger.install(this); latestLog = null }

        log(LogPriority.INFO) { "Priority test message" }

        assertEquals(LogPriority.INFO, logger.latestLog?.priority)
    }

    @Test
    fun `message lambda is not invoked when logging is not enabled`() {
        platformTestLogger(isLoggable = { false }).apply {
            LogLogger.install(this); latestLog = null
        }

        var count = 0

        log { "Message: ${++count}" }

        assertEquals(0, count)
    }

    @Test
    fun `standalone function logs with a custom tag`() {
        val logger = platformTestLogger().apply { LogLogger.install(this); latestLog = null }

        standaloneFunctionLog(logDomain = "StandaloneTag") { "Standalone function message" }

        with(logger.latestLog!!) {
            assertEquals("StandaloneTag", logDomain)
            assertEquals("Standalone function message", message)
        }
    }

    @Test
    fun `log captures outer context tag from lambda`() {
        val logger = platformTestLogger().apply { LogLogger.install(this); latestLog = null }

        val lambda = {
            log { "Lambda message" }
        }
        lambda()

        assertEquals(LogTest::class.simpleName, logger.latestLog?.logDomain)
    }

    @Test
    fun `log captures outer context tag from nested lambda`() {
        val logger = platformTestLogger().apply { LogLogger.install(this); latestLog = null }

        val outerLambda = {
            val innerLambda = {
                log { "Nested lambda message" }
            }
            innerLambda()
        }
        outerLambda()

        assertEquals(LogTest::class.simpleName, logger.latestLog?.logDomain)
    }

    @Test
    fun `log captures tag from companion function`() {
        val logger = platformTestLogger().apply { LogLogger.install(this); latestLog = null }

        companionFunctionLog { "Companion function message" }

        assertEquals(LogTest::class.simpleName, logger.latestLog?.logDomain)
    }

    @Test
    fun `log passes priority to isLoggable check`() {
        val receivedPriority = AtomicReference<LogPriority?>(null)
        platformTestLogger(isLoggable = { receivedPriority.value = it; true })
            .apply { LogLogger.install(this); latestLog = null }

        log(LogPriority.INFO) { "Priority check message" }

        assertEquals(LogPriority.INFO, receivedPriority.value)
    }

    @Test
    fun `log throwable includes stacktrace`() {
        val logger = platformTestLogger().apply { LogLogger.install(this); latestLog = null }
        val exception = RuntimeException("Test exception")

        log { exception.asLog() }

        val stackTraceSnippet = "RuntimeException: Test exception"
        assertTrue(logger.latestLog!!.message.contains(stackTraceSnippet))
    }

    companion object {
        fun companionFunctionLog(
            message: () -> String
        ) {
            log(message = message)
        }
    }
}

fun standaloneFunctionLog(
    logDomain: String,
    message: () -> String
) {
    log(logDomain = logDomain, message = message)
}

/**
 * Creates an instance of [TestLogLogger] for testing purposes.
 */
fun platformTestLogger(isLoggable: (LogPriority) -> Boolean = { true }): TestLogLogger =
    TestLogLogger(isLoggableFn = isLoggable)
