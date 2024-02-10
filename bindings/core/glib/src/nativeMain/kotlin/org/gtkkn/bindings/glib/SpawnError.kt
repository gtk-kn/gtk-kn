// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GSpawnError
import org.gtkkn.native.glib.GSpawnError.Companion.G_SPAWN_ERROR_2BIG
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_ACCES
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_CHDIR
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_FAILED
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_FORK
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_INVAL
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_IO
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_ISDIR
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_LIBBAD
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_LOOP
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_MFILE
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_NAMETOOLONG
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_NFILE
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_NOENT
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_NOEXEC
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_NOMEM
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_NOTDIR
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_PERM
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_READ
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_TOO_BIG
import org.gtkkn.native.glib.GSpawnError.G_SPAWN_ERROR_TXTBUSY
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by spawning processes.
 */
public enum class SpawnError(
    public val nativeValue: GSpawnError,
) {
    /**
     * Fork failed due to lack of memory.
     */
    FORK(G_SPAWN_ERROR_FORK),

    /**
     * Read or select on pipes failed.
     */
    READ(G_SPAWN_ERROR_READ),

    /**
     * Changing to working directory failed.
     */
    CHDIR(G_SPAWN_ERROR_CHDIR),

    /**
     * execv() returned `EACCES`
     */
    ACCES(G_SPAWN_ERROR_ACCES),

    /**
     * execv() returned `EPERM`
     */
    PERM(G_SPAWN_ERROR_PERM),

    /**
     * execv() returned `E2BIG`
     */
    TOO_BIG(G_SPAWN_ERROR_TOO_BIG),

    /**
     * deprecated alias for %G_SPAWN_ERROR_TOO_BIG (deprecated since GLib 2.32)
     */
    `2BIG`(G_SPAWN_ERROR_2BIG),

    /**
     * execv() returned `ENOEXEC`
     */
    NOEXEC(G_SPAWN_ERROR_NOEXEC),

    /**
     * execv() returned `ENAMETOOLONG`
     */
    NAMETOOLONG(G_SPAWN_ERROR_NAMETOOLONG),

    /**
     * execv() returned `ENOENT`
     */
    NOENT(G_SPAWN_ERROR_NOENT),

    /**
     * execv() returned `ENOMEM`
     */
    NOMEM(G_SPAWN_ERROR_NOMEM),

    /**
     * execv() returned `ENOTDIR`
     */
    NOTDIR(G_SPAWN_ERROR_NOTDIR),

    /**
     * execv() returned `ELOOP`
     */
    LOOP(G_SPAWN_ERROR_LOOP),

    /**
     * execv() returned `ETXTBUSY`
     */
    TXTBUSY(G_SPAWN_ERROR_TXTBUSY),

    /**
     * execv() returned `EIO`
     */
    IO(G_SPAWN_ERROR_IO),

    /**
     * execv() returned `ENFILE`
     */
    NFILE(G_SPAWN_ERROR_NFILE),

    /**
     * execv() returned `EMFILE`
     */
    MFILE(G_SPAWN_ERROR_MFILE),

    /**
     * execv() returned `EINVAL`
     */
    INVAL(G_SPAWN_ERROR_INVAL),

    /**
     * execv() returned `EISDIR`
     */
    ISDIR(G_SPAWN_ERROR_ISDIR),

    /**
     * execv() returned `ELIBBAD`
     */
    LIBBAD(G_SPAWN_ERROR_LIBBAD),

    /**
     * Some other fatal failure,
     *   `error->message` should explain.
     */
    FAILED(G_SPAWN_ERROR_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSpawnError): SpawnError =
            when (nativeValue) {
                G_SPAWN_ERROR_FORK -> FORK
                G_SPAWN_ERROR_READ -> READ
                G_SPAWN_ERROR_CHDIR -> CHDIR
                G_SPAWN_ERROR_ACCES -> ACCES
                G_SPAWN_ERROR_PERM -> PERM
                G_SPAWN_ERROR_TOO_BIG -> TOO_BIG
                G_SPAWN_ERROR_2BIG -> `2BIG`
                G_SPAWN_ERROR_NOEXEC -> NOEXEC
                G_SPAWN_ERROR_NAMETOOLONG -> NAMETOOLONG
                G_SPAWN_ERROR_NOENT -> NOENT
                G_SPAWN_ERROR_NOMEM -> NOMEM
                G_SPAWN_ERROR_NOTDIR -> NOTDIR
                G_SPAWN_ERROR_LOOP -> LOOP
                G_SPAWN_ERROR_TXTBUSY -> TXTBUSY
                G_SPAWN_ERROR_IO -> IO
                G_SPAWN_ERROR_NFILE -> NFILE
                G_SPAWN_ERROR_MFILE -> MFILE
                G_SPAWN_ERROR_INVAL -> INVAL
                G_SPAWN_ERROR_ISDIR -> ISDIR
                G_SPAWN_ERROR_LIBBAD -> LIBBAD
                G_SPAWN_ERROR_FAILED -> FAILED
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = g_quark_from_string("g-exec-error-quark")

        public fun fromErrorOrNull(error: Error): SpawnError? =
            if (error.domain != quark()) {
                null
            } else {
                SpawnError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
