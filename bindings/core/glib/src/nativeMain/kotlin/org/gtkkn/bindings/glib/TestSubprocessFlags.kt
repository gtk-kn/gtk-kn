// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GTestSubprocessFlags
import org.gtkkn.native.glib.G_TEST_SUBPROCESS_DEFAULT
import org.gtkkn.native.glib.G_TEST_SUBPROCESS_INHERIT_STDERR
import org.gtkkn.native.glib.G_TEST_SUBPROCESS_INHERIT_STDIN
import org.gtkkn.native.glib.G_TEST_SUBPROCESS_INHERIT_STDOUT

/**
 * Flags to pass to g_test_trap_subprocess() to control input and output.
 *
 * Note that in contrast with g_test_trap_fork(), the default is to
 * not show stdout and stderr.
 */
public class TestSubprocessFlags(public val mask: GTestSubprocessFlags) : Bitfield<TestSubprocessFlags> {
    override infix fun or(other: TestSubprocessFlags): TestSubprocessFlags = TestSubprocessFlags(mask or other.mask)

    public companion object {
        /**
         * Default behaviour. Since: 2.74
         */
        public val DEFAULT: TestSubprocessFlags = TestSubprocessFlags(G_TEST_SUBPROCESS_DEFAULT)

        /**
         * If this flag is given, the child
         *     process will inherit the parent's stdin. Otherwise, the child's
         *     stdin is redirected to `/dev/null`.
         */
        public val INHERIT_STDIN: TestSubprocessFlags =
            TestSubprocessFlags(G_TEST_SUBPROCESS_INHERIT_STDIN)

        /**
         * If this flag is given, the child
         *     process will inherit the parent's stdout. Otherwise, the child's
         *     stdout will not be visible, but it will be captured to allow
         *     later tests with g_test_trap_assert_stdout().
         */
        public val INHERIT_STDOUT: TestSubprocessFlags =
            TestSubprocessFlags(G_TEST_SUBPROCESS_INHERIT_STDOUT)

        /**
         * If this flag is given, the child
         *     process will inherit the parent's stderr. Otherwise, the child's
         *     stderr will not be visible, but it will be captured to allow
         *     later tests with g_test_trap_assert_stderr().
         */
        public val INHERIT_STDERR: TestSubprocessFlags =
            TestSubprocessFlags(G_TEST_SUBPROCESS_INHERIT_STDERR)
    }
}
