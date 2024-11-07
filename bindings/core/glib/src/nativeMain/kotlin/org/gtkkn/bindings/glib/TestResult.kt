// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GTestResult

public enum class TestResult(
    public val nativeValue: GTestResult,
) {
    SUCCESS(GTestResult.G_TEST_RUN_SUCCESS),
    SKIPPED(GTestResult.G_TEST_RUN_SKIPPED),
    FAILURE(GTestResult.G_TEST_RUN_FAILURE),
    INCOMPLETE(GTestResult.G_TEST_RUN_INCOMPLETE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTestResult): TestResult =
            when (nativeValue) {
                GTestResult.G_TEST_RUN_SUCCESS -> SUCCESS
                GTestResult.G_TEST_RUN_SKIPPED -> SKIPPED
                GTestResult.G_TEST_RUN_FAILURE -> FAILURE
                GTestResult.G_TEST_RUN_INCOMPLETE -> INCOMPLETE
                else -> error("invalid nativeValue")
            }
    }
}
