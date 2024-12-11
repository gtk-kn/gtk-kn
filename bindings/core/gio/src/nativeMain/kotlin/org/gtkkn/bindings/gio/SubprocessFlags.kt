// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_40
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GSubprocessFlags
import org.gtkkn.native.gio.G_SUBPROCESS_FLAGS_INHERIT_FDS
import org.gtkkn.native.gio.G_SUBPROCESS_FLAGS_NONE
import org.gtkkn.native.gio.G_SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP
import org.gtkkn.native.gio.G_SUBPROCESS_FLAGS_STDERR_MERGE
import org.gtkkn.native.gio.G_SUBPROCESS_FLAGS_STDERR_PIPE
import org.gtkkn.native.gio.G_SUBPROCESS_FLAGS_STDERR_SILENCE
import org.gtkkn.native.gio.G_SUBPROCESS_FLAGS_STDIN_INHERIT
import org.gtkkn.native.gio.G_SUBPROCESS_FLAGS_STDIN_PIPE
import org.gtkkn.native.gio.G_SUBPROCESS_FLAGS_STDOUT_PIPE
import org.gtkkn.native.gio.G_SUBPROCESS_FLAGS_STDOUT_SILENCE
import org.gtkkn.native.gio.g_subprocess_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags to define the behaviour of a #GSubprocess.
 *
 * Note that the default for stdin is to redirect from `/dev/null`.  For
 * stdout and stderr the default are for them to inherit the
 * corresponding descriptor from the calling process.
 *
 * Note that it is a programmer error to mix 'incompatible' flags.  For
 * example, you may not request both %G_SUBPROCESS_FLAGS_STDOUT_PIPE and
 * %G_SUBPROCESS_FLAGS_STDOUT_SILENCE.
 * @since 2.40
 */
public class SubprocessFlags(public val mask: GSubprocessFlags) : Bitfield<SubprocessFlags> {
    override infix fun or(other: SubprocessFlags): SubprocessFlags = SubprocessFlags(mask or other.mask)

    @GioVersion2_40
    public companion object {
        /**
         * No flags.
         */
        public val NONE: SubprocessFlags = SubprocessFlags(G_SUBPROCESS_FLAGS_NONE)

        /**
         * create a pipe for the stdin of the
         *   spawned process that can be accessed with
         *   g_subprocess_get_stdin_pipe().
         */
        public val STDIN_PIPE: SubprocessFlags = SubprocessFlags(G_SUBPROCESS_FLAGS_STDIN_PIPE)

        /**
         * stdin is inherited from the
         *   calling process.
         */
        public val STDIN_INHERIT: SubprocessFlags =
            SubprocessFlags(G_SUBPROCESS_FLAGS_STDIN_INHERIT)

        /**
         * create a pipe for the stdout of the
         *   spawned process that can be accessed with
         *   g_subprocess_get_stdout_pipe().
         */
        public val STDOUT_PIPE: SubprocessFlags = SubprocessFlags(G_SUBPROCESS_FLAGS_STDOUT_PIPE)

        /**
         * silence the stdout of the spawned
         *   process (ie: redirect to `/dev/null`).
         */
        public val STDOUT_SILENCE: SubprocessFlags =
            SubprocessFlags(G_SUBPROCESS_FLAGS_STDOUT_SILENCE)

        /**
         * create a pipe for the stderr of the
         *   spawned process that can be accessed with
         *   g_subprocess_get_stderr_pipe().
         */
        public val STDERR_PIPE: SubprocessFlags = SubprocessFlags(G_SUBPROCESS_FLAGS_STDERR_PIPE)

        /**
         * silence the stderr of the spawned
         *   process (ie: redirect to `/dev/null`).
         */
        public val STDERR_SILENCE: SubprocessFlags =
            SubprocessFlags(G_SUBPROCESS_FLAGS_STDERR_SILENCE)

        /**
         * merge the stderr of the spawned
         *   process with whatever the stdout happens to be.  This is a good way
         *   of directing both streams to a common log file, for example.
         */
        public val STDERR_MERGE: SubprocessFlags = SubprocessFlags(G_SUBPROCESS_FLAGS_STDERR_MERGE)

        /**
         * spawned processes will inherit the
         *   file descriptors of their parent, unless those descriptors have
         *   been explicitly marked as close-on-exec.  This flag has no effect
         *   over the "standard" file descriptors (stdin, stdout, stderr).
         */
        public val INHERIT_FDS: SubprocessFlags = SubprocessFlags(G_SUBPROCESS_FLAGS_INHERIT_FDS)

        /**
         * if path searching is
         *   needed when spawning the subprocess, use the `PATH` in the launcher
         *   environment. (Since: 2.72)
         */
        public val SEARCH_PATH_FROM_ENVP: SubprocessFlags =
            SubprocessFlags(G_SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP)

        /**
         * Get the GType of SubprocessFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_subprocess_flags_get_type()
    }
}
