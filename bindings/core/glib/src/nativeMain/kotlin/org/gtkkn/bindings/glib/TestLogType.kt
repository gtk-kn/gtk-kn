// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GTestLogType
import org.gtkkn.native.glib.GTestLogType.G_TEST_LOG_ERROR
import org.gtkkn.native.glib.GTestLogType.G_TEST_LOG_LIST_CASE
import org.gtkkn.native.glib.GTestLogType.G_TEST_LOG_MAX_RESULT
import org.gtkkn.native.glib.GTestLogType.G_TEST_LOG_MESSAGE
import org.gtkkn.native.glib.GTestLogType.G_TEST_LOG_MIN_RESULT
import org.gtkkn.native.glib.GTestLogType.G_TEST_LOG_NONE
import org.gtkkn.native.glib.GTestLogType.G_TEST_LOG_SKIP_CASE
import org.gtkkn.native.glib.GTestLogType.G_TEST_LOG_START_BINARY
import org.gtkkn.native.glib.GTestLogType.G_TEST_LOG_START_CASE
import org.gtkkn.native.glib.GTestLogType.G_TEST_LOG_START_SUITE
import org.gtkkn.native.glib.GTestLogType.G_TEST_LOG_STOP_CASE
import org.gtkkn.native.glib.GTestLogType.G_TEST_LOG_STOP_SUITE

public enum class TestLogType(
    public val nativeValue: GTestLogType,
) {
    NONE(G_TEST_LOG_NONE),
    ERROR(G_TEST_LOG_ERROR),
    START_BINARY(G_TEST_LOG_START_BINARY),
    LIST_CASE(G_TEST_LOG_LIST_CASE),
    SKIP_CASE(G_TEST_LOG_SKIP_CASE),
    START_CASE(G_TEST_LOG_START_CASE),
    STOP_CASE(G_TEST_LOG_STOP_CASE),
    MIN_RESULT(G_TEST_LOG_MIN_RESULT),
    MAX_RESULT(G_TEST_LOG_MAX_RESULT),
    MESSAGE(G_TEST_LOG_MESSAGE),
    START_SUITE(G_TEST_LOG_START_SUITE),
    STOP_SUITE(G_TEST_LOG_STOP_SUITE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTestLogType): TestLogType =
            when (nativeValue) {
                G_TEST_LOG_NONE -> NONE
                G_TEST_LOG_ERROR -> ERROR
                G_TEST_LOG_START_BINARY -> START_BINARY
                G_TEST_LOG_LIST_CASE -> LIST_CASE
                G_TEST_LOG_SKIP_CASE -> SKIP_CASE
                G_TEST_LOG_START_CASE -> START_CASE
                G_TEST_LOG_STOP_CASE -> STOP_CASE
                G_TEST_LOG_MIN_RESULT -> MIN_RESULT
                G_TEST_LOG_MAX_RESULT -> MAX_RESULT
                G_TEST_LOG_MESSAGE -> MESSAGE
                G_TEST_LOG_START_SUITE -> START_SUITE
                G_TEST_LOG_STOP_SUITE -> STOP_SUITE
                else -> error("invalid nativeValue")
            }
    }
}
