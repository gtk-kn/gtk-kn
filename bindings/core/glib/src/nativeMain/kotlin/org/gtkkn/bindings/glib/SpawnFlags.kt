// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GSpawnFlags
import org.gtkkn.native.glib.G_SPAWN_CHILD_INHERITS_STDERR
import org.gtkkn.native.glib.G_SPAWN_CHILD_INHERITS_STDIN
import org.gtkkn.native.glib.G_SPAWN_CHILD_INHERITS_STDOUT
import org.gtkkn.native.glib.G_SPAWN_CLOEXEC_PIPES
import org.gtkkn.native.glib.G_SPAWN_DEFAULT
import org.gtkkn.native.glib.G_SPAWN_DO_NOT_REAP_CHILD
import org.gtkkn.native.glib.G_SPAWN_FILE_AND_ARGV_ZERO
import org.gtkkn.native.glib.G_SPAWN_LEAVE_DESCRIPTORS_OPEN
import org.gtkkn.native.glib.G_SPAWN_SEARCH_PATH
import org.gtkkn.native.glib.G_SPAWN_SEARCH_PATH_FROM_ENVP
import org.gtkkn.native.glib.G_SPAWN_STDERR_TO_DEV_NULL
import org.gtkkn.native.glib.G_SPAWN_STDIN_FROM_DEV_NULL
import org.gtkkn.native.glib.G_SPAWN_STDOUT_TO_DEV_NULL

/**
 * Flags passed to g_spawn_sync(), g_spawn_async() and g_spawn_async_with_pipes().
 */
public class SpawnFlags(public val mask: GSpawnFlags) : Bitfield<SpawnFlags> {
    override infix fun or(other: SpawnFlags): SpawnFlags = SpawnFlags(mask or other.mask)

    public companion object {
        /**
         * no flags, default behaviour
         */
        public val DEFAULT: SpawnFlags = SpawnFlags(G_SPAWN_DEFAULT)

        /**
         * the parent's open file descriptors will
         *     be inherited by the child; otherwise all descriptors except stdin,
         *     stdout and stderr will be closed before calling exec() in the child.
         */
        public val LEAVE_DESCRIPTORS_OPEN: SpawnFlags = SpawnFlags(G_SPAWN_LEAVE_DESCRIPTORS_OPEN)

        /**
         * the child will not be automatically reaped;
         *     you must use g_child_watch_add() yourself (or call waitpid() or handle
         *     `SIGCHLD` yourself), or the child will become a zombie.
         */
        public val DO_NOT_REAP_CHILD: SpawnFlags = SpawnFlags(G_SPAWN_DO_NOT_REAP_CHILD)

        /**
         * `argv[0]` need not be an absolute path, it will be
         *     looked for in the user's `PATH`.
         */
        public val SEARCH_PATH: SpawnFlags = SpawnFlags(G_SPAWN_SEARCH_PATH)

        /**
         * the child's standard output will be discarded,
         *     instead of going to the same location as the parent's standard output.
         */
        public val STDOUT_TO_DEV_NULL: SpawnFlags = SpawnFlags(G_SPAWN_STDOUT_TO_DEV_NULL)

        /**
         * the child's standard error will be discarded.
         */
        public val STDERR_TO_DEV_NULL: SpawnFlags = SpawnFlags(G_SPAWN_STDERR_TO_DEV_NULL)

        /**
         * the child will inherit the parent's standard
         *     input (by default, the child's standard input is attached to `/dev/null`).
         */
        public val CHILD_INHERITS_STDIN: SpawnFlags = SpawnFlags(G_SPAWN_CHILD_INHERITS_STDIN)

        /**
         * the first element of `argv` is the file to
         *     execute, while the remaining elements are the actual argument vector
         *     to pass to the file. Normally g_spawn_async_with_pipes() uses `argv[0]`
         *     as the file to execute, and passes all of `argv` to the child.
         */
        public val FILE_AND_ARGV_ZERO: SpawnFlags = SpawnFlags(G_SPAWN_FILE_AND_ARGV_ZERO)

        /**
         * if `argv[0]` is not an absolute path,
         *     it will be looked for in the `PATH` from the passed child environment.
         *     Since: 2.34
         */
        public val SEARCH_PATH_FROM_ENVP: SpawnFlags = SpawnFlags(G_SPAWN_SEARCH_PATH_FROM_ENVP)

        /**
         * create all pipes with the `O_CLOEXEC` flag set.
         *     Since: 2.40
         */
        public val CLOEXEC_PIPES: SpawnFlags = SpawnFlags(G_SPAWN_CLOEXEC_PIPES)

        /**
         * The child will inherit the parent's standard output.
         * @since 2.74
         */
        public val CHILD_INHERITS_STDOUT: SpawnFlags = SpawnFlags(G_SPAWN_CHILD_INHERITS_STDOUT)

        /**
         * The child will inherit the parent's standard error.
         * @since 2.74
         */
        public val CHILD_INHERITS_STDERR: SpawnFlags = SpawnFlags(G_SPAWN_CHILD_INHERITS_STDERR)

        /**
         * The child's standard input is attached to `/dev/null`.
         * @since 2.74
         */
        public val STDIN_FROM_DEV_NULL: SpawnFlags = SpawnFlags(G_SPAWN_STDIN_FROM_DEV_NULL)
    }
}
