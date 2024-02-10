// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GTestResult
import org.gtkkn.native.glib.GTestResult.G_TEST_RUN_FAILURE
import org.gtkkn.native.glib.GTestResult.G_TEST_RUN_INCOMPLETE
import org.gtkkn.native.glib.GTestResult.G_TEST_RUN_SKIPPED
import org.gtkkn.native.glib.GTestResult.G_TEST_RUN_SUCCESS

public enum class TestResult(
    public val nativeValue: GTestResult,
) {
    SUCCESS(G_TEST_RUN_SUCCESS),
    SKIPPED(G_TEST_RUN_SKIPPED),
    FAILURE(G_TEST_RUN_FAILURE),
    INCOMPLETE(G_TEST_RUN_INCOMPLETE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTestResult): TestResult =
            when (nativeValue) {
                G_TEST_RUN_SUCCESS -> SUCCESS
                G_TEST_RUN_SKIPPED -> SKIPPED
                G_TEST_RUN_FAILURE -> FAILURE
                G_TEST_RUN_INCOMPLETE -> INCOMPLETE
                else -> error("invalid nativeValue")
            }
    }
}
