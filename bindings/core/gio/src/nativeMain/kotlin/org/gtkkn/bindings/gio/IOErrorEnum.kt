// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.gio.GIOErrorEnum
import org.gtkkn.native.gio.GIOErrorEnum.Companion.G_IO_ERROR_CONNECTION_CLOSED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_ADDRESS_IN_USE
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_ALREADY_MOUNTED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_BROKEN_PIPE
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_BUSY
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_CANCELLED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_CANT_CREATE_BACKUP
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_CLOSED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_CONNECTION_REFUSED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_DBUS_ERROR
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_DESTINATION_UNSET
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_EXISTS
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_FAILED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_FAILED_HANDLED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_FILENAME_TOO_LONG
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_HOST_NOT_FOUND
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_HOST_UNREACHABLE
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_INVALID_ARGUMENT
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_INVALID_DATA
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_INVALID_FILENAME
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_IS_DIRECTORY
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_MESSAGE_TOO_LARGE
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_NETWORK_UNREACHABLE
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_NOT_CONNECTED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_NOT_DIRECTORY
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_NOT_EMPTY
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_NOT_FOUND
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_NOT_INITIALIZED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_NOT_MOUNTABLE_FILE
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_NOT_MOUNTED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_NOT_REGULAR_FILE
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_NOT_SUPPORTED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_NOT_SYMBOLIC_LINK
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_NO_SPACE
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_NO_SUCH_DEVICE
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_PARTIAL_INPUT
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_PENDING
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_PERMISSION_DENIED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_PROXY_AUTH_FAILED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_PROXY_FAILED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_PROXY_NEED_AUTH
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_PROXY_NOT_ALLOWED
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_READ_ONLY
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_TIMED_OUT
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_TOO_MANY_LINKS
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_TOO_MANY_OPEN_FILES
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_WOULD_BLOCK
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_WOULD_MERGE
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_WOULD_RECURSE
import org.gtkkn.native.gio.GIOErrorEnum.G_IO_ERROR_WRONG_ETAG
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by GIO functions.
 *
 * Note that this domain may be extended in future GLib releases. In
 * general, new error codes either only apply to new APIs, or else
 * replace %G_IO_ERROR_FAILED in cases that were not explicitly
 * distinguished before. You should therefore avoid writing code like
 * |[<!-- language="C" -->
 * if (g_error_matches (error, G_IO_ERROR, G_IO_ERROR_FAILED))
 *   {
 *     // Assume that this is EPRINTERONFIRE
 *     ...
 *   }
 * ]|
 * but should instead treat all unrecognized error codes the same as
 * %G_IO_ERROR_FAILED.
 *
 * See also #GPollableReturn for a cheaper way of returning
 * %G_IO_ERROR_WOULD_BLOCK to callers without allocating a #GError.
 */
public enum class IOErrorEnum(
    public val nativeValue: GIOErrorEnum,
) {
    /**
     * Generic error condition for when an operation fails
     *     and no more specific #GIOErrorEnum value is defined.
     */
    FAILED(G_IO_ERROR_FAILED),

    /**
     * File not found.
     */
    NOT_FOUND(G_IO_ERROR_NOT_FOUND),

    /**
     * File already exists.
     */
    EXISTS(G_IO_ERROR_EXISTS),

    /**
     * File is a directory.
     */
    IS_DIRECTORY(G_IO_ERROR_IS_DIRECTORY),

    /**
     * File is not a directory.
     */
    NOT_DIRECTORY(G_IO_ERROR_NOT_DIRECTORY),

    /**
     * File is a directory that isn't empty.
     */
    NOT_EMPTY(G_IO_ERROR_NOT_EMPTY),

    /**
     * File is not a regular file.
     */
    NOT_REGULAR_FILE(G_IO_ERROR_NOT_REGULAR_FILE),

    /**
     * File is not a symbolic link.
     */
    NOT_SYMBOLIC_LINK(G_IO_ERROR_NOT_SYMBOLIC_LINK),

    /**
     * File cannot be mounted.
     */
    NOT_MOUNTABLE_FILE(G_IO_ERROR_NOT_MOUNTABLE_FILE),

    /**
     * Filename is too many characters.
     */
    FILENAME_TOO_LONG(G_IO_ERROR_FILENAME_TOO_LONG),

    /**
     * Filename is invalid or contains invalid characters.
     */
    INVALID_FILENAME(G_IO_ERROR_INVALID_FILENAME),

    /**
     * File contains too many symbolic links.
     */
    TOO_MANY_LINKS(G_IO_ERROR_TOO_MANY_LINKS),

    /**
     * No space left on drive.
     */
    NO_SPACE(G_IO_ERROR_NO_SPACE),

    /**
     * Invalid argument.
     */
    INVALID_ARGUMENT(G_IO_ERROR_INVALID_ARGUMENT),

    /**
     * Permission denied.
     */
    PERMISSION_DENIED(G_IO_ERROR_PERMISSION_DENIED),

    /**
     * Operation (or one of its parameters) not supported
     */
    NOT_SUPPORTED(G_IO_ERROR_NOT_SUPPORTED),

    /**
     * File isn't mounted.
     */
    NOT_MOUNTED(G_IO_ERROR_NOT_MOUNTED),

    /**
     * File is already mounted.
     */
    ALREADY_MOUNTED(G_IO_ERROR_ALREADY_MOUNTED),

    /**
     * File was closed.
     */
    CLOSED(G_IO_ERROR_CLOSED),

    /**
     * Operation was cancelled. See #GCancellable.
     */
    CANCELLED(G_IO_ERROR_CANCELLED),

    /**
     * Operations are still pending.
     */
    PENDING(G_IO_ERROR_PENDING),

    /**
     * File is read only.
     */
    READ_ONLY(G_IO_ERROR_READ_ONLY),

    /**
     * Backup couldn't be created.
     */
    CANT_CREATE_BACKUP(G_IO_ERROR_CANT_CREATE_BACKUP),

    /**
     * File's Entity Tag was incorrect.
     */
    WRONG_ETAG(G_IO_ERROR_WRONG_ETAG),

    /**
     * Operation timed out.
     */
    TIMED_OUT(G_IO_ERROR_TIMED_OUT),

    /**
     * Operation would be recursive.
     */
    WOULD_RECURSE(G_IO_ERROR_WOULD_RECURSE),

    /**
     * File is busy.
     */
    BUSY(G_IO_ERROR_BUSY),

    /**
     * Operation would block.
     */
    WOULD_BLOCK(G_IO_ERROR_WOULD_BLOCK),

    /**
     * Host couldn't be found (remote operations).
     */
    HOST_NOT_FOUND(G_IO_ERROR_HOST_NOT_FOUND),

    /**
     * Operation would merge files.
     */
    WOULD_MERGE(G_IO_ERROR_WOULD_MERGE),

    /**
     * Operation failed and a helper program has
     *     already interacted with the user. Do not display any error dialog.
     */
    FAILED_HANDLED(G_IO_ERROR_FAILED_HANDLED),

    /**
     * The current process has too many files
     *     open and can't open any more. Duplicate descriptors do count toward
     *     this limit. Since 2.20
     */
    TOO_MANY_OPEN_FILES(G_IO_ERROR_TOO_MANY_OPEN_FILES),

    /**
     * The object has not been initialized. Since 2.22
     */
    NOT_INITIALIZED(G_IO_ERROR_NOT_INITIALIZED),

    /**
     * The requested address is already in use. Since 2.22
     */
    ADDRESS_IN_USE(G_IO_ERROR_ADDRESS_IN_USE),

    /**
     * Need more input to finish operation. Since 2.24
     */
    PARTIAL_INPUT(G_IO_ERROR_PARTIAL_INPUT),

    /**
     * The input data was invalid. Since 2.24
     */
    INVALID_DATA(G_IO_ERROR_INVALID_DATA),

    /**
     * A remote object generated an error that
     *     doesn't correspond to a locally registered #GError error
     *     domain. Use g_dbus_error_get_remote_error() to extract the D-Bus
     *     error name and g_dbus_error_strip_remote_error() to fix up the
     *     message so it matches what was received on the wire. Since 2.26.
     */
    DBUS_ERROR(G_IO_ERROR_DBUS_ERROR),

    /**
     * Host unreachable. Since 2.26
     */
    HOST_UNREACHABLE(G_IO_ERROR_HOST_UNREACHABLE),

    /**
     * Network unreachable. Since 2.26
     */
    NETWORK_UNREACHABLE(G_IO_ERROR_NETWORK_UNREACHABLE),

    /**
     * Connection refused. Since 2.26
     */
    CONNECTION_REFUSED(G_IO_ERROR_CONNECTION_REFUSED),

    /**
     * Connection to proxy server failed. Since 2.26
     */
    PROXY_FAILED(G_IO_ERROR_PROXY_FAILED),

    /**
     * Proxy authentication failed. Since 2.26
     */
    PROXY_AUTH_FAILED(G_IO_ERROR_PROXY_AUTH_FAILED),

    /**
     * Proxy server needs authentication. Since 2.26
     */
    PROXY_NEED_AUTH(G_IO_ERROR_PROXY_NEED_AUTH),

    /**
     * Proxy connection is not allowed by ruleset.
     *     Since 2.26
     */
    PROXY_NOT_ALLOWED(G_IO_ERROR_PROXY_NOT_ALLOWED),

    /**
     * Broken pipe. Since 2.36
     */
    BROKEN_PIPE(G_IO_ERROR_BROKEN_PIPE),

    /**
     * Connection closed by peer. Note that this
     *     is the same code as %G_IO_ERROR_BROKEN_PIPE; before 2.44 some
     *     "connection closed" errors returned %G_IO_ERROR_BROKEN_PIPE, but others
     *     returned %G_IO_ERROR_FAILED. Now they should all return the same
     *     value, which has this more logical name. Since 2.44.
     */
    CONNECTION_CLOSED(G_IO_ERROR_CONNECTION_CLOSED),

    /**
     * Transport endpoint is not connected. Since 2.44
     */
    NOT_CONNECTED(G_IO_ERROR_NOT_CONNECTED),

    /**
     * Message too large. Since 2.48.
     */
    MESSAGE_TOO_LARGE(G_IO_ERROR_MESSAGE_TOO_LARGE),

    /**
     * No such device found. Since 2.74
     */
    NO_SUCH_DEVICE(G_IO_ERROR_NO_SUCH_DEVICE),

    /**
     * Destination address unset. Since 2.80
     */
    DESTINATION_UNSET(G_IO_ERROR_DESTINATION_UNSET),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GIOErrorEnum): IOErrorEnum =
            when (nativeValue) {
                G_IO_ERROR_FAILED -> FAILED
                G_IO_ERROR_NOT_FOUND -> NOT_FOUND
                G_IO_ERROR_EXISTS -> EXISTS
                G_IO_ERROR_IS_DIRECTORY -> IS_DIRECTORY
                G_IO_ERROR_NOT_DIRECTORY -> NOT_DIRECTORY
                G_IO_ERROR_NOT_EMPTY -> NOT_EMPTY
                G_IO_ERROR_NOT_REGULAR_FILE -> NOT_REGULAR_FILE
                G_IO_ERROR_NOT_SYMBOLIC_LINK -> NOT_SYMBOLIC_LINK
                G_IO_ERROR_NOT_MOUNTABLE_FILE -> NOT_MOUNTABLE_FILE
                G_IO_ERROR_FILENAME_TOO_LONG -> FILENAME_TOO_LONG
                G_IO_ERROR_INVALID_FILENAME -> INVALID_FILENAME
                G_IO_ERROR_TOO_MANY_LINKS -> TOO_MANY_LINKS
                G_IO_ERROR_NO_SPACE -> NO_SPACE
                G_IO_ERROR_INVALID_ARGUMENT -> INVALID_ARGUMENT
                G_IO_ERROR_PERMISSION_DENIED -> PERMISSION_DENIED
                G_IO_ERROR_NOT_SUPPORTED -> NOT_SUPPORTED
                G_IO_ERROR_NOT_MOUNTED -> NOT_MOUNTED
                G_IO_ERROR_ALREADY_MOUNTED -> ALREADY_MOUNTED
                G_IO_ERROR_CLOSED -> CLOSED
                G_IO_ERROR_CANCELLED -> CANCELLED
                G_IO_ERROR_PENDING -> PENDING
                G_IO_ERROR_READ_ONLY -> READ_ONLY
                G_IO_ERROR_CANT_CREATE_BACKUP -> CANT_CREATE_BACKUP
                G_IO_ERROR_WRONG_ETAG -> WRONG_ETAG
                G_IO_ERROR_TIMED_OUT -> TIMED_OUT
                G_IO_ERROR_WOULD_RECURSE -> WOULD_RECURSE
                G_IO_ERROR_BUSY -> BUSY
                G_IO_ERROR_WOULD_BLOCK -> WOULD_BLOCK
                G_IO_ERROR_HOST_NOT_FOUND -> HOST_NOT_FOUND
                G_IO_ERROR_WOULD_MERGE -> WOULD_MERGE
                G_IO_ERROR_FAILED_HANDLED -> FAILED_HANDLED
                G_IO_ERROR_TOO_MANY_OPEN_FILES -> TOO_MANY_OPEN_FILES
                G_IO_ERROR_NOT_INITIALIZED -> NOT_INITIALIZED
                G_IO_ERROR_ADDRESS_IN_USE -> ADDRESS_IN_USE
                G_IO_ERROR_PARTIAL_INPUT -> PARTIAL_INPUT
                G_IO_ERROR_INVALID_DATA -> INVALID_DATA
                G_IO_ERROR_DBUS_ERROR -> DBUS_ERROR
                G_IO_ERROR_HOST_UNREACHABLE -> HOST_UNREACHABLE
                G_IO_ERROR_NETWORK_UNREACHABLE -> NETWORK_UNREACHABLE
                G_IO_ERROR_CONNECTION_REFUSED -> CONNECTION_REFUSED
                G_IO_ERROR_PROXY_FAILED -> PROXY_FAILED
                G_IO_ERROR_PROXY_AUTH_FAILED -> PROXY_AUTH_FAILED
                G_IO_ERROR_PROXY_NEED_AUTH -> PROXY_NEED_AUTH
                G_IO_ERROR_PROXY_NOT_ALLOWED -> PROXY_NOT_ALLOWED
                G_IO_ERROR_BROKEN_PIPE -> BROKEN_PIPE
                G_IO_ERROR_CONNECTION_CLOSED -> CONNECTION_CLOSED
                G_IO_ERROR_NOT_CONNECTED -> NOT_CONNECTED
                G_IO_ERROR_MESSAGE_TOO_LARGE -> MESSAGE_TOO_LARGE
                G_IO_ERROR_NO_SUCH_DEVICE -> NO_SUCH_DEVICE
                G_IO_ERROR_DESTINATION_UNSET -> DESTINATION_UNSET
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = g_quark_from_string("g-io-error-quark")

        public fun fromErrorOrNull(error: Error): IOErrorEnum? =
            if (error.domain != quark()) {
                null
            } else {
                IOErrorEnum.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
