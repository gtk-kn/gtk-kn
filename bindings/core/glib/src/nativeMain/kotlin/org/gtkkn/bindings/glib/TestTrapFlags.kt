// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GTestTrapFlags
import org.gtkkn.native.glib.G_TEST_TRAP_DEFAULT
import org.gtkkn.native.glib.G_TEST_TRAP_INHERIT_STDIN
import org.gtkkn.native.glib.G_TEST_TRAP_SILENCE_STDERR
import org.gtkkn.native.glib.G_TEST_TRAP_SILENCE_STDOUT

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 2.38.
 *
 * #GTestTrapFlags is used only with g_test_trap_fork(),
 * which is deprecated. g_test_trap_subprocess() uses
 * #GTestSubprocessFlags.
 * ---
 *
 * Test traps are guards around forked tests.
 * These flags determine what traps to set.
 */
public class TestTrapFlags(public val mask: GTestTrapFlags) : Bitfield<TestTrapFlags> {
    override infix fun or(other: TestTrapFlags): TestTrapFlags = TestTrapFlags(mask or other.mask)

    public companion object {
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.38.
         *
         * #GTestTrapFlags is used only with g_test_trap_fork(),
         * which is deprecated. g_test_trap_subprocess() uses
         * #GTestSubprocessFlags.
         * ---
         *
         * Default behaviour. Since: 2.74
         */
        public val DEFAULT: TestTrapFlags = TestTrapFlags(G_TEST_TRAP_DEFAULT)

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.38.
         *
         * #GTestTrapFlags is used only with g_test_trap_fork(),
         * which is deprecated. g_test_trap_subprocess() uses
         * #GTestSubprocessFlags.
         * ---
         *
         * Redirect stdout of the test child to
         *     `/dev/null` so it cannot be observed on the console during test
         *     runs. The actual output is still captured though to allow later
         *     tests with g_test_trap_assert_stdout().
         */
        public val SILENCE_STDOUT: TestTrapFlags = TestTrapFlags(G_TEST_TRAP_SILENCE_STDOUT)

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.38.
         *
         * #GTestTrapFlags is used only with g_test_trap_fork(),
         * which is deprecated. g_test_trap_subprocess() uses
         * #GTestSubprocessFlags.
         * ---
         *
         * Redirect stderr of the test child to
         *     `/dev/null` so it cannot be observed on the console during test
         *     runs. The actual output is still captured though to allow later
         *     tests with g_test_trap_assert_stderr().
         */
        public val SILENCE_STDERR: TestTrapFlags = TestTrapFlags(G_TEST_TRAP_SILENCE_STDERR)

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.38.
         *
         * #GTestTrapFlags is used only with g_test_trap_fork(),
         * which is deprecated. g_test_trap_subprocess() uses
         * #GTestSubprocessFlags.
         * ---
         *
         * If this flag is given, stdin of the
         *     child process is shared with stdin of its parent process.
         *     It is redirected to `/dev/null` otherwise.
         */
        public val INHERIT_STDIN: TestTrapFlags = TestTrapFlags(G_TEST_TRAP_INHERIT_STDIN)
    }
}
