// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GTestLogType

public enum class TestLogType(public val nativeValue: GTestLogType) {
    NONE(GTestLogType.G_TEST_LOG_NONE),
    ERROR(GTestLogType.G_TEST_LOG_ERROR),
    START_BINARY(GTestLogType.G_TEST_LOG_START_BINARY),
    LIST_CASE(GTestLogType.G_TEST_LOG_LIST_CASE),
    SKIP_CASE(GTestLogType.G_TEST_LOG_SKIP_CASE),
    START_CASE(GTestLogType.G_TEST_LOG_START_CASE),
    STOP_CASE(GTestLogType.G_TEST_LOG_STOP_CASE),
    MIN_RESULT(GTestLogType.G_TEST_LOG_MIN_RESULT),
    MAX_RESULT(GTestLogType.G_TEST_LOG_MAX_RESULT),
    MESSAGE(GTestLogType.G_TEST_LOG_MESSAGE),
    START_SUITE(GTestLogType.G_TEST_LOG_START_SUITE),
    STOP_SUITE(GTestLogType.G_TEST_LOG_STOP_SUITE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTestLogType): TestLogType = when (nativeValue) {
            GTestLogType.G_TEST_LOG_NONE -> NONE
            GTestLogType.G_TEST_LOG_ERROR -> ERROR
            GTestLogType.G_TEST_LOG_START_BINARY -> START_BINARY
            GTestLogType.G_TEST_LOG_LIST_CASE -> LIST_CASE
            GTestLogType.G_TEST_LOG_SKIP_CASE -> SKIP_CASE
            GTestLogType.G_TEST_LOG_START_CASE -> START_CASE
            GTestLogType.G_TEST_LOG_STOP_CASE -> STOP_CASE
            GTestLogType.G_TEST_LOG_MIN_RESULT -> MIN_RESULT
            GTestLogType.G_TEST_LOG_MAX_RESULT -> MAX_RESULT
            GTestLogType.G_TEST_LOG_MESSAGE -> MESSAGE
            GTestLogType.G_TEST_LOG_START_SUITE -> START_SUITE
            GTestLogType.G_TEST_LOG_STOP_SUITE -> STOP_SUITE
            else -> error("invalid nativeValue")
        }
    }
}
