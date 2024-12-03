// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GFileError
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Values corresponding to @errno codes returned from file operations
 * on UNIX. Unlike @errno codes, GFileError values are available on
 * all systems, even Windows. The exact meaning of each code depends
 * on what sort of file operation you were performing; the UNIX
 * documentation gives more details. The following error code descriptions
 * come from the GNU C Library manual, and are under the copyright
 * of that manual.
 *
 * It's not very portable to make detailed assumptions about exactly
 * which errors will be returned from a given operation. Some errors
 * don't occur on some systems, etc., sometimes there are subtle
 * differences in when a system will report a given error, etc.
 */
public enum class FileError(public val nativeValue: GFileError) {
    /**
     * Operation not permitted; only the owner of
     *     the file (or other resource) or processes with special privileges
     *     can perform the operation.
     */
    EXIST(GFileError.G_FILE_ERROR_EXIST),

    /**
     * File is a directory; you cannot open a directory
     *     for writing, or create or remove hard links to it.
     */
    ISDIR(GFileError.G_FILE_ERROR_ISDIR),

    /**
     * Permission denied; the file permissions do not
     *     allow the attempted operation.
     */
    ACCES(GFileError.G_FILE_ERROR_ACCES),

    /**
     * Filename too long.
     */
    NAMETOOLONG(GFileError.G_FILE_ERROR_NAMETOOLONG),

    /**
     * No such file or directory. This is a "file
     *     doesn't exist" error for ordinary files that are referenced in
     *     contexts where they are expected to already exist.
     */
    NOENT(GFileError.G_FILE_ERROR_NOENT),

    /**
     * A file that isn't a directory was specified when
     *     a directory is required.
     */
    NOTDIR(GFileError.G_FILE_ERROR_NOTDIR),

    /**
     * No such device or address. The system tried to
     *     use the device represented by a file you specified, and it
     *     couldn't find the device. This can mean that the device file was
     *     installed incorrectly, or that the physical device is missing or
     *     not correctly attached to the computer.
     */
    NXIO(GFileError.G_FILE_ERROR_NXIO),

    /**
     * The underlying file system of the specified file
     *     does not support memory mapping.
     */
    NODEV(GFileError.G_FILE_ERROR_NODEV),

    /**
     * The directory containing the new link can't be
     *     modified because it's on a read-only file system.
     */
    ROFS(GFileError.G_FILE_ERROR_ROFS),

    /**
     * Text file busy.
     */
    TXTBSY(GFileError.G_FILE_ERROR_TXTBSY),

    /**
     * You passed in a pointer to bad memory.
     *     (GLib won't reliably return this, don't pass in pointers to bad
     *     memory.)
     */
    FAULT(GFileError.G_FILE_ERROR_FAULT),

    /**
     * Too many levels of symbolic links were encountered
     *     in looking up a file name. This often indicates a cycle of symbolic
     *     links.
     */
    LOOP(GFileError.G_FILE_ERROR_LOOP),

    /**
     * No space left on device; write operation on a
     *     file failed because the disk is full.
     */
    NOSPC(GFileError.G_FILE_ERROR_NOSPC),

    /**
     * No memory available. The system cannot allocate
     *     more virtual memory because its capacity is full.
     */
    NOMEM(GFileError.G_FILE_ERROR_NOMEM),

    /**
     * The current process has too many files open and
     *     can't open any more. Duplicate descriptors do count toward this
     *     limit.
     */
    MFILE(GFileError.G_FILE_ERROR_MFILE),

    /**
     * There are too many distinct file openings in the
     *     entire system.
     */
    NFILE(GFileError.G_FILE_ERROR_NFILE),

    /**
     * Bad file descriptor; for example, I/O on a
     *     descriptor that has been closed or reading from a descriptor open
     *     only for writing (or vice versa).
     */
    BADF(GFileError.G_FILE_ERROR_BADF),

    /**
     * Invalid argument. This is used to indicate
     *     various kinds of problems with passing the wrong argument to a
     *     library function.
     */
    INVAL(GFileError.G_FILE_ERROR_INVAL),

    /**
     * Broken pipe; there is no process reading from the
     *     other end of a pipe. Every library function that returns this
     *     error code also generates a 'SIGPIPE' signal; this signal
     *     terminates the program if not handled or blocked. Thus, your
     *     program will never actually see this code unless it has handled
     *     or blocked 'SIGPIPE'.
     */
    PIPE(GFileError.G_FILE_ERROR_PIPE),

    /**
     * Resource temporarily unavailable; the call might
     *     work if you try again later.
     */
    AGAIN(GFileError.G_FILE_ERROR_AGAIN),

    /**
     * Interrupted function call; an asynchronous signal
     *     occurred and prevented completion of the call. When this
     *     happens, you should try the call again.
     */
    INTR(GFileError.G_FILE_ERROR_INTR),

    /**
     * Input/output error; usually used for physical read
     *    or write errors. i.e. the disk or other physical device hardware
     *    is returning errors.
     */
    IO(GFileError.G_FILE_ERROR_IO),

    /**
     * Operation not permitted; only the owner of the
     *    file (or other resource) or processes with special privileges can
     *    perform the operation.
     */
    PERM(GFileError.G_FILE_ERROR_PERM),

    /**
     * Function not implemented; this indicates that
     *    the system is missing some functionality.
     */
    NOSYS(GFileError.G_FILE_ERROR_NOSYS),

    /**
     * Does not correspond to a UNIX error code; this
     *    is the standard "failed for unspecified reason" error code present
     *    in all #GError error code enumerations. Returned if no specific
     *    code applies.
     */
    FAILED(GFileError.G_FILE_ERROR_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GFileError): FileError = when (nativeValue) {
            GFileError.G_FILE_ERROR_EXIST -> EXIST
            GFileError.G_FILE_ERROR_ISDIR -> ISDIR
            GFileError.G_FILE_ERROR_ACCES -> ACCES
            GFileError.G_FILE_ERROR_NAMETOOLONG -> NAMETOOLONG
            GFileError.G_FILE_ERROR_NOENT -> NOENT
            GFileError.G_FILE_ERROR_NOTDIR -> NOTDIR
            GFileError.G_FILE_ERROR_NXIO -> NXIO
            GFileError.G_FILE_ERROR_NODEV -> NODEV
            GFileError.G_FILE_ERROR_ROFS -> ROFS
            GFileError.G_FILE_ERROR_TXTBSY -> TXTBSY
            GFileError.G_FILE_ERROR_FAULT -> FAULT
            GFileError.G_FILE_ERROR_LOOP -> LOOP
            GFileError.G_FILE_ERROR_NOSPC -> NOSPC
            GFileError.G_FILE_ERROR_NOMEM -> NOMEM
            GFileError.G_FILE_ERROR_MFILE -> MFILE
            GFileError.G_FILE_ERROR_NFILE -> NFILE
            GFileError.G_FILE_ERROR_BADF -> BADF
            GFileError.G_FILE_ERROR_INVAL -> INVAL
            GFileError.G_FILE_ERROR_PIPE -> PIPE
            GFileError.G_FILE_ERROR_AGAIN -> AGAIN
            GFileError.G_FILE_ERROR_INTR -> INTR
            GFileError.G_FILE_ERROR_IO -> IO
            GFileError.G_FILE_ERROR_PERM -> PERM
            GFileError.G_FILE_ERROR_NOSYS -> NOSYS
            GFileError.G_FILE_ERROR_FAILED -> FAILED
            else -> error("invalid nativeValue")
        }

        public fun quark(): UInt = g_quark_from_string("g-file-error-quark")

        public fun fromErrorOrNull(error: Error): FileError? = if (error.domain != quark()) {
            null
        } else {
            FileError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
