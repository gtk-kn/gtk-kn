// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GSpawnError
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by spawning processes.
 */
public enum class SpawnError(public val nativeValue: GSpawnError) {
    /**
     * Fork failed due to lack of memory.
     */
    FORK(GSpawnError.G_SPAWN_ERROR_FORK),

    /**
     * Read or select on pipes failed.
     */
    READ(GSpawnError.G_SPAWN_ERROR_READ),

    /**
     * Changing to working directory failed.
     */
    CHDIR(GSpawnError.G_SPAWN_ERROR_CHDIR),

    /**
     * execv() returned `EACCES`
     */
    ACCES(GSpawnError.G_SPAWN_ERROR_ACCES),

    /**
     * execv() returned `EPERM`
     */
    PERM(GSpawnError.G_SPAWN_ERROR_PERM),

    /**
     * execv() returned `E2BIG`
     */
    TOO_BIG(GSpawnError.G_SPAWN_ERROR_TOO_BIG),

    /**
     * deprecated alias for %G_SPAWN_ERROR_TOO_BIG (deprecated since GLib 2.32)
     */
    `2BIG`(GSpawnError.G_SPAWN_ERROR_2BIG),

    /**
     * execv() returned `ENOEXEC`
     */
    NOEXEC(GSpawnError.G_SPAWN_ERROR_NOEXEC),

    /**
     * execv() returned `ENAMETOOLONG`
     */
    NAMETOOLONG(GSpawnError.G_SPAWN_ERROR_NAMETOOLONG),

    /**
     * execv() returned `ENOENT`
     */
    NOENT(GSpawnError.G_SPAWN_ERROR_NOENT),

    /**
     * execv() returned `ENOMEM`
     */
    NOMEM(GSpawnError.G_SPAWN_ERROR_NOMEM),

    /**
     * execv() returned `ENOTDIR`
     */
    NOTDIR(GSpawnError.G_SPAWN_ERROR_NOTDIR),

    /**
     * execv() returned `ELOOP`
     */
    LOOP(GSpawnError.G_SPAWN_ERROR_LOOP),

    /**
     * execv() returned `ETXTBUSY`
     */
    TXTBUSY(GSpawnError.G_SPAWN_ERROR_TXTBUSY),

    /**
     * execv() returned `EIO`
     */
    IO(GSpawnError.G_SPAWN_ERROR_IO),

    /**
     * execv() returned `ENFILE`
     */
    NFILE(GSpawnError.G_SPAWN_ERROR_NFILE),

    /**
     * execv() returned `EMFILE`
     */
    MFILE(GSpawnError.G_SPAWN_ERROR_MFILE),

    /**
     * execv() returned `EINVAL`
     */
    INVAL(GSpawnError.G_SPAWN_ERROR_INVAL),

    /**
     * execv() returned `EISDIR`
     */
    ISDIR(GSpawnError.G_SPAWN_ERROR_ISDIR),

    /**
     * execv() returned `ELIBBAD`
     */
    LIBBAD(GSpawnError.G_SPAWN_ERROR_LIBBAD),

    /**
     * Some other fatal failure,
     *   `error->message` should explain.
     */
    FAILED(GSpawnError.G_SPAWN_ERROR_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSpawnError): SpawnError = when (nativeValue) {
            GSpawnError.G_SPAWN_ERROR_FORK -> FORK
            GSpawnError.G_SPAWN_ERROR_READ -> READ
            GSpawnError.G_SPAWN_ERROR_CHDIR -> CHDIR
            GSpawnError.G_SPAWN_ERROR_ACCES -> ACCES
            GSpawnError.G_SPAWN_ERROR_PERM -> PERM
            GSpawnError.G_SPAWN_ERROR_TOO_BIG -> TOO_BIG
            GSpawnError.G_SPAWN_ERROR_2BIG -> `2BIG`
            GSpawnError.G_SPAWN_ERROR_NOEXEC -> NOEXEC
            GSpawnError.G_SPAWN_ERROR_NAMETOOLONG -> NAMETOOLONG
            GSpawnError.G_SPAWN_ERROR_NOENT -> NOENT
            GSpawnError.G_SPAWN_ERROR_NOMEM -> NOMEM
            GSpawnError.G_SPAWN_ERROR_NOTDIR -> NOTDIR
            GSpawnError.G_SPAWN_ERROR_LOOP -> LOOP
            GSpawnError.G_SPAWN_ERROR_TXTBUSY -> TXTBUSY
            GSpawnError.G_SPAWN_ERROR_IO -> IO
            GSpawnError.G_SPAWN_ERROR_NFILE -> NFILE
            GSpawnError.G_SPAWN_ERROR_MFILE -> MFILE
            GSpawnError.G_SPAWN_ERROR_INVAL -> INVAL
            GSpawnError.G_SPAWN_ERROR_ISDIR -> ISDIR
            GSpawnError.G_SPAWN_ERROR_LIBBAD -> LIBBAD
            GSpawnError.G_SPAWN_ERROR_FAILED -> FAILED
            else -> error("invalid nativeValue")
        }

        public fun quark(): UInt = g_quark_from_string("g-exec-error-quark")

        public fun fromErrorOrNull(error: Error): SpawnError? = if (error.domain != quark()) {
            null
        } else {
            SpawnError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
