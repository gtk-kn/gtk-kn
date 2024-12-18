// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.gio.GIOErrorEnum
import org.gtkkn.native.gio.g_io_error_enum_get_type
import org.gtkkn.native.glib.g_quark_from_string
import org.gtkkn.native.gobject.GType
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
public enum class IoErrorEnum(public val nativeValue: GIOErrorEnum) {
    /**
     * Generic error condition for when an operation fails
     *     and no more specific #GIOErrorEnum value is defined.
     */
    FAILED(GIOErrorEnum.G_IO_ERROR_FAILED),

    /**
     * File not found.
     */
    NOT_FOUND(GIOErrorEnum.G_IO_ERROR_NOT_FOUND),

    /**
     * File already exists.
     */
    EXISTS(GIOErrorEnum.G_IO_ERROR_EXISTS),

    /**
     * File is a directory.
     */
    IS_DIRECTORY(GIOErrorEnum.G_IO_ERROR_IS_DIRECTORY),

    /**
     * File is not a directory.
     */
    NOT_DIRECTORY(GIOErrorEnum.G_IO_ERROR_NOT_DIRECTORY),

    /**
     * File is a directory that isn't empty.
     */
    NOT_EMPTY(GIOErrorEnum.G_IO_ERROR_NOT_EMPTY),

    /**
     * File is not a regular file.
     */
    NOT_REGULAR_FILE(GIOErrorEnum.G_IO_ERROR_NOT_REGULAR_FILE),

    /**
     * File is not a symbolic link.
     */
    NOT_SYMBOLIC_LINK(GIOErrorEnum.G_IO_ERROR_NOT_SYMBOLIC_LINK),

    /**
     * File cannot be mounted.
     */
    NOT_MOUNTABLE_FILE(GIOErrorEnum.G_IO_ERROR_NOT_MOUNTABLE_FILE),

    /**
     * Filename is too many characters.
     */
    FILENAME_TOO_LONG(GIOErrorEnum.G_IO_ERROR_FILENAME_TOO_LONG),

    /**
     * Filename is invalid or contains invalid characters.
     */
    INVALID_FILENAME(GIOErrorEnum.G_IO_ERROR_INVALID_FILENAME),

    /**
     * File contains too many symbolic links.
     */
    TOO_MANY_LINKS(GIOErrorEnum.G_IO_ERROR_TOO_MANY_LINKS),

    /**
     * No space left on drive.
     */
    NO_SPACE(GIOErrorEnum.G_IO_ERROR_NO_SPACE),

    /**
     * Invalid argument.
     */
    INVALID_ARGUMENT(GIOErrorEnum.G_IO_ERROR_INVALID_ARGUMENT),

    /**
     * Permission denied.
     */
    PERMISSION_DENIED(GIOErrorEnum.G_IO_ERROR_PERMISSION_DENIED),

    /**
     * Operation (or one of its parameters) not supported
     */
    NOT_SUPPORTED(GIOErrorEnum.G_IO_ERROR_NOT_SUPPORTED),

    /**
     * File isn't mounted.
     */
    NOT_MOUNTED(GIOErrorEnum.G_IO_ERROR_NOT_MOUNTED),

    /**
     * File is already mounted.
     */
    ALREADY_MOUNTED(GIOErrorEnum.G_IO_ERROR_ALREADY_MOUNTED),

    /**
     * File was closed.
     */
    CLOSED(GIOErrorEnum.G_IO_ERROR_CLOSED),

    /**
     * Operation was cancelled. See #GCancellable.
     */
    CANCELLED(GIOErrorEnum.G_IO_ERROR_CANCELLED),

    /**
     * Operations are still pending.
     */
    PENDING(GIOErrorEnum.G_IO_ERROR_PENDING),

    /**
     * File is read only.
     */
    READ_ONLY(GIOErrorEnum.G_IO_ERROR_READ_ONLY),

    /**
     * Backup couldn't be created.
     */
    CANT_CREATE_BACKUP(GIOErrorEnum.G_IO_ERROR_CANT_CREATE_BACKUP),

    /**
     * File's Entity Tag was incorrect.
     */
    WRONG_ETAG(GIOErrorEnum.G_IO_ERROR_WRONG_ETAG),

    /**
     * Operation timed out.
     */
    TIMED_OUT(GIOErrorEnum.G_IO_ERROR_TIMED_OUT),

    /**
     * Operation would be recursive.
     */
    WOULD_RECURSE(GIOErrorEnum.G_IO_ERROR_WOULD_RECURSE),

    /**
     * File is busy.
     */
    BUSY(GIOErrorEnum.G_IO_ERROR_BUSY),

    /**
     * Operation would block.
     */
    WOULD_BLOCK(GIOErrorEnum.G_IO_ERROR_WOULD_BLOCK),

    /**
     * Host couldn't be found (remote operations).
     */
    HOST_NOT_FOUND(GIOErrorEnum.G_IO_ERROR_HOST_NOT_FOUND),

    /**
     * Operation would merge files.
     */
    WOULD_MERGE(GIOErrorEnum.G_IO_ERROR_WOULD_MERGE),

    /**
     * Operation failed and a helper program has
     *     already interacted with the user. Do not display any error dialog.
     */
    FAILED_HANDLED(GIOErrorEnum.G_IO_ERROR_FAILED_HANDLED),

    /**
     * The current process has too many files
     *     open and can't open any more. Duplicate descriptors do count toward
     *     this limit. Since 2.20
     */
    TOO_MANY_OPEN_FILES(GIOErrorEnum.G_IO_ERROR_TOO_MANY_OPEN_FILES),

    /**
     * The object has not been initialized. Since 2.22
     */
    NOT_INITIALIZED(GIOErrorEnum.G_IO_ERROR_NOT_INITIALIZED),

    /**
     * The requested address is already in use. Since 2.22
     */
    ADDRESS_IN_USE(GIOErrorEnum.G_IO_ERROR_ADDRESS_IN_USE),

    /**
     * Need more input to finish operation. Since 2.24
     */
    PARTIAL_INPUT(GIOErrorEnum.G_IO_ERROR_PARTIAL_INPUT),

    /**
     * The input data was invalid. Since 2.24
     */
    INVALID_DATA(GIOErrorEnum.G_IO_ERROR_INVALID_DATA),

    /**
     * A remote object generated an error that
     *     doesn't correspond to a locally registered #GError error
     *     domain. Use g_dbus_error_get_remote_error() to extract the D-Bus
     *     error name and g_dbus_error_strip_remote_error() to fix up the
     *     message so it matches what was received on the wire. Since 2.26.
     */
    DBUS_ERROR(GIOErrorEnum.G_IO_ERROR_DBUS_ERROR),

    /**
     * Host unreachable. Since 2.26
     */
    HOST_UNREACHABLE(GIOErrorEnum.G_IO_ERROR_HOST_UNREACHABLE),

    /**
     * Network unreachable. Since 2.26
     */
    NETWORK_UNREACHABLE(GIOErrorEnum.G_IO_ERROR_NETWORK_UNREACHABLE),

    /**
     * Connection refused. Since 2.26
     */
    CONNECTION_REFUSED(GIOErrorEnum.G_IO_ERROR_CONNECTION_REFUSED),

    /**
     * Connection to proxy server failed. Since 2.26
     */
    PROXY_FAILED(GIOErrorEnum.G_IO_ERROR_PROXY_FAILED),

    /**
     * Proxy authentication failed. Since 2.26
     */
    PROXY_AUTH_FAILED(GIOErrorEnum.G_IO_ERROR_PROXY_AUTH_FAILED),

    /**
     * Proxy server needs authentication. Since 2.26
     */
    PROXY_NEED_AUTH(GIOErrorEnum.G_IO_ERROR_PROXY_NEED_AUTH),

    /**
     * Proxy connection is not allowed by ruleset.
     *     Since 2.26
     */
    PROXY_NOT_ALLOWED(GIOErrorEnum.G_IO_ERROR_PROXY_NOT_ALLOWED),

    /**
     * Broken pipe. Since 2.36
     */
    BROKEN_PIPE(GIOErrorEnum.G_IO_ERROR_BROKEN_PIPE),

    /**
     * Connection closed by peer. Note that this
     *     is the same code as %G_IO_ERROR_BROKEN_PIPE; before 2.44 some
     *     "connection closed" errors returned %G_IO_ERROR_BROKEN_PIPE, but others
     *     returned %G_IO_ERROR_FAILED. Now they should all return the same
     *     value, which has this more logical name. Since 2.44.
     */
    CONNECTION_CLOSED(GIOErrorEnum.G_IO_ERROR_CONNECTION_CLOSED),

    /**
     * Transport endpoint is not connected. Since 2.44
     */
    NOT_CONNECTED(GIOErrorEnum.G_IO_ERROR_NOT_CONNECTED),

    /**
     * Message too large. Since 2.48.
     */
    MESSAGE_TOO_LARGE(GIOErrorEnum.G_IO_ERROR_MESSAGE_TOO_LARGE),

    /**
     * No such device found. Since 2.74
     */
    NO_SUCH_DEVICE(GIOErrorEnum.G_IO_ERROR_NO_SUCH_DEVICE),

    /**
     * Destination address unset. Since 2.80
     */
    DESTINATION_UNSET(GIOErrorEnum.G_IO_ERROR_DESTINATION_UNSET),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GIOErrorEnum): IoErrorEnum = when (nativeValue) {
            GIOErrorEnum.G_IO_ERROR_FAILED -> FAILED
            GIOErrorEnum.G_IO_ERROR_NOT_FOUND -> NOT_FOUND
            GIOErrorEnum.G_IO_ERROR_EXISTS -> EXISTS
            GIOErrorEnum.G_IO_ERROR_IS_DIRECTORY -> IS_DIRECTORY
            GIOErrorEnum.G_IO_ERROR_NOT_DIRECTORY -> NOT_DIRECTORY
            GIOErrorEnum.G_IO_ERROR_NOT_EMPTY -> NOT_EMPTY
            GIOErrorEnum.G_IO_ERROR_NOT_REGULAR_FILE -> NOT_REGULAR_FILE
            GIOErrorEnum.G_IO_ERROR_NOT_SYMBOLIC_LINK -> NOT_SYMBOLIC_LINK
            GIOErrorEnum.G_IO_ERROR_NOT_MOUNTABLE_FILE -> NOT_MOUNTABLE_FILE
            GIOErrorEnum.G_IO_ERROR_FILENAME_TOO_LONG -> FILENAME_TOO_LONG
            GIOErrorEnum.G_IO_ERROR_INVALID_FILENAME -> INVALID_FILENAME
            GIOErrorEnum.G_IO_ERROR_TOO_MANY_LINKS -> TOO_MANY_LINKS
            GIOErrorEnum.G_IO_ERROR_NO_SPACE -> NO_SPACE
            GIOErrorEnum.G_IO_ERROR_INVALID_ARGUMENT -> INVALID_ARGUMENT
            GIOErrorEnum.G_IO_ERROR_PERMISSION_DENIED -> PERMISSION_DENIED
            GIOErrorEnum.G_IO_ERROR_NOT_SUPPORTED -> NOT_SUPPORTED
            GIOErrorEnum.G_IO_ERROR_NOT_MOUNTED -> NOT_MOUNTED
            GIOErrorEnum.G_IO_ERROR_ALREADY_MOUNTED -> ALREADY_MOUNTED
            GIOErrorEnum.G_IO_ERROR_CLOSED -> CLOSED
            GIOErrorEnum.G_IO_ERROR_CANCELLED -> CANCELLED
            GIOErrorEnum.G_IO_ERROR_PENDING -> PENDING
            GIOErrorEnum.G_IO_ERROR_READ_ONLY -> READ_ONLY
            GIOErrorEnum.G_IO_ERROR_CANT_CREATE_BACKUP -> CANT_CREATE_BACKUP
            GIOErrorEnum.G_IO_ERROR_WRONG_ETAG -> WRONG_ETAG
            GIOErrorEnum.G_IO_ERROR_TIMED_OUT -> TIMED_OUT
            GIOErrorEnum.G_IO_ERROR_WOULD_RECURSE -> WOULD_RECURSE
            GIOErrorEnum.G_IO_ERROR_BUSY -> BUSY
            GIOErrorEnum.G_IO_ERROR_WOULD_BLOCK -> WOULD_BLOCK
            GIOErrorEnum.G_IO_ERROR_HOST_NOT_FOUND -> HOST_NOT_FOUND
            GIOErrorEnum.G_IO_ERROR_WOULD_MERGE -> WOULD_MERGE
            GIOErrorEnum.G_IO_ERROR_FAILED_HANDLED -> FAILED_HANDLED
            GIOErrorEnum.G_IO_ERROR_TOO_MANY_OPEN_FILES -> TOO_MANY_OPEN_FILES
            GIOErrorEnum.G_IO_ERROR_NOT_INITIALIZED -> NOT_INITIALIZED
            GIOErrorEnum.G_IO_ERROR_ADDRESS_IN_USE -> ADDRESS_IN_USE
            GIOErrorEnum.G_IO_ERROR_PARTIAL_INPUT -> PARTIAL_INPUT
            GIOErrorEnum.G_IO_ERROR_INVALID_DATA -> INVALID_DATA
            GIOErrorEnum.G_IO_ERROR_DBUS_ERROR -> DBUS_ERROR
            GIOErrorEnum.G_IO_ERROR_HOST_UNREACHABLE -> HOST_UNREACHABLE
            GIOErrorEnum.G_IO_ERROR_NETWORK_UNREACHABLE -> NETWORK_UNREACHABLE
            GIOErrorEnum.G_IO_ERROR_CONNECTION_REFUSED -> CONNECTION_REFUSED
            GIOErrorEnum.G_IO_ERROR_PROXY_FAILED -> PROXY_FAILED
            GIOErrorEnum.G_IO_ERROR_PROXY_AUTH_FAILED -> PROXY_AUTH_FAILED
            GIOErrorEnum.G_IO_ERROR_PROXY_NEED_AUTH -> PROXY_NEED_AUTH
            GIOErrorEnum.G_IO_ERROR_PROXY_NOT_ALLOWED -> PROXY_NOT_ALLOWED
            GIOErrorEnum.G_IO_ERROR_BROKEN_PIPE -> BROKEN_PIPE
            GIOErrorEnum.G_IO_ERROR_CONNECTION_CLOSED -> CONNECTION_CLOSED
            GIOErrorEnum.G_IO_ERROR_NOT_CONNECTED -> NOT_CONNECTED
            GIOErrorEnum.G_IO_ERROR_MESSAGE_TOO_LARGE -> MESSAGE_TOO_LARGE
            GIOErrorEnum.G_IO_ERROR_NO_SUCH_DEVICE -> NO_SUCH_DEVICE
            GIOErrorEnum.G_IO_ERROR_DESTINATION_UNSET -> DESTINATION_UNSET
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of IOErrorEnum
         *
         * @return the GType
         */
        public fun getType(): GType = g_io_error_enum_get_type()

        public fun quark(): UInt = g_quark_from_string("g-io-error-quark")

        public fun fromErrorOrNull(error: Error): IoErrorEnum? = if (error.domain != quark()) {
            null
        } else {
            IoErrorEnum.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
