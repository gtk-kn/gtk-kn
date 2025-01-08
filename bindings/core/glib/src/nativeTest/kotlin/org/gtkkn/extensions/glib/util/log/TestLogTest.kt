/*
 * Copyright (c) 2025 gtk-kn
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

import org.gtkkn.extensions.glib.util.asLog
import kotlin.concurrent.AtomicReference
import kotlin.test.AfterTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TestLogTest {
    @AfterTest
    fun tearDown() {
        // Clear all installed writers after each test
        Log.uninstallAll()
    }

    @Test
    fun `logging without any writers should not crash`() {
        // No writers added
        log { "Hello" }
    }

    @Test
    fun `message lambda is not invoked if no writer is installed`() {
        var count = 0
        // No writer installed
        log { "Log Count: ${++count}" }
        assertEquals(0, count)
    }

    @Test
    fun `log messages are captured by a single writer`() {
        val logger = platformTestLogger().apply { latestLog = null }
        Log.install(logger)

        log { "Hello, world!" }

        assertEquals("Hello, world!", logger.latestLog?.message)
    }

    @Test
    fun `log captures class name as default tag`() {
        val logger = platformTestLogger().apply { latestLog = null }
        Log.install(logger)

        log { "Test message" }

        assertEquals(TestLogTest::class.simpleName, logger.latestLog?.domain)
    }

    @Test
    fun `log uses custom tag if provided`() {
        val logger = platformTestLogger().apply { latestLog = null }
        Log.install(logger)

        log(domain = "CustomTag") { "Message with custom tag" }

        assertEquals("CustomTag", logger.latestLog?.domain)
    }

    @Test
    fun `log passes correct priority to logger`() {
        val logger = platformTestLogger().apply { latestLog = null }
        Log.install(logger)

        log(LogLevel.INFO) { "Priority test message" }

        assertEquals(LogLevel.INFO, logger.latestLog?.priority)
    }

    @Test
    fun `message lambda is not invoked when none of the writers are loggable`() {
        val logger = platformTestLogger(isLoggable = { false }).apply { latestLog = null }
        Log.install(logger)

        var count = 0
        log { "Message: ${++count}" }
        assertEquals(0, count)
    }

    @Test
    fun `standalone function logs with a custom tag`() {
        val logger = platformTestLogger().apply { latestLog = null }
        Log.install(logger)

        standaloneFunctionLog(domain = "StandaloneTag") { "Standalone function message" }

        with(logger.latestLog!!) {
            assertEquals("StandaloneTag", domain)
            assertEquals("Standalone function message", message)
        }
    }

    @Test
    fun `log captures outer context tag from lambda`() {
        val logger = platformTestLogger().apply { latestLog = null }
        Log.install(logger)

        val lambda = {
            log { "Lambda message" }
        }
        lambda()

        assertEquals(TestLogTest::class.simpleName, logger.latestLog?.domain)
    }

    @Test
    fun `log captures outer context tag from nested lambda`() {
        val logger = platformTestLogger().apply { latestLog = null }
        Log.install(logger)

        val outerLambda = {
            val innerLambda = {
                log { "Nested lambda message" }
            }
            innerLambda()
        }
        outerLambda()

        assertEquals(TestLogTest::class.simpleName, logger.latestLog?.domain)
    }

    @Test
    fun `log captures tag from companion function`() {
        val logger = platformTestLogger().apply { latestLog = null }
        Log.install(logger)

        companionFunctionLog { "Companion function message" }

        assertEquals(TestLogTest::class.simpleName, logger.latestLog?.domain)
    }

    @Test
    fun `log passes priority to isLoggable check`() {
        val receivedPriority = AtomicReference<LogLevel?>(null)
        val logger =
            platformTestLogger(isLoggable = { p -> receivedPriority.value = p; true }).apply { latestLog = null }
        Log.install(logger)

        log(LogLevel.INFO) { "Priority check message" }

        assertEquals(LogLevel.INFO, receivedPriority.value)
    }

    @Test
    fun `log throwable includes stacktrace`() {
        val logger = platformTestLogger().apply { latestLog = null }
        Log.install(logger)
        val exception = RuntimeException("Test exception")

        log { exception.asLog() }

        val stackTraceSnippet = "RuntimeException: Test exception"
        assertTrue(logger.latestLog!!.message.contains(stackTraceSnippet))
    }

    @Test
    fun `multiple writers receive the log message`() {
        val logger1 = platformTestLogger().apply { latestLog = null }
        val logger2 = platformTestLogger().apply { latestLog = null }
        Log.install(logger1)
        Log.install(logger2)

        log { "Message to multiple writers" }

        assertEquals("Message to multiple writers", logger1.latestLog?.message)
        assertEquals("Message to multiple writers", logger2.latestLog?.message)
    }

    @Test
    fun `log uses default domain if set and none provided`() {
        val logger = platformTestLogger().apply { latestLog = null }
        Log.install(logger)

        // Set a default domain
        Log.defaultDomain = "MyDefaultDomain"

        // Log without specifying a domain
        log { "Message with default domain" }

        // Verify the default domain was used
        assertEquals("MyDefaultDomain", logger.latestLog?.domain)
    }

    @Test
    fun `log uses explicit domain even if default domain is set`() {
        val logger = platformTestLogger().apply { latestLog = null }
        Log.install(logger)

        // Set a default domain
        Log.defaultDomain = "MyDefaultDomain"

        // Now log with an explicit domain
        log(domain = "ExplicitDomain") { "Message with explicit domain" }

        // Verify the explicit domain takes priority over the default
        assertEquals("ExplicitDomain", logger.latestLog?.domain)
    }

    @Test
    fun `log reverts to derived domain if default domain is cleared`() {
        val logger = platformTestLogger().apply { latestLog = null }
        Log.install(logger)

        // Set a default domain, then clear it
        Log.defaultDomain = "MyDefaultDomain"
        Log.defaultDomain = null

        // Log without specifying a domain
        log { "Message with derived domain" }

        // Verify we fallback to deriving the domain from the caller
        assertEquals(TestLogTest::class.simpleName, logger.latestLog?.domain)
    }

    /**
     * A companion function to verify that logs from inside it have the outer class name as the domain.
     */
    companion object {
        fun companionFunctionLog(
            message: () -> String
        ) {
            log(message = message)
        }
    }
}

fun standaloneFunctionLog(
    domain: String,
    message: () -> String
) {
    log(domain = domain, message = message)
}

/**
 * Creates an instance of [TestLogWriter] for testing purposes.
 */
fun platformTestLogger(isLoggable: (LogLevel) -> Boolean = { true }): TestLogWriter =
    TestLogWriter(isLoggableFn = isLoggable)
