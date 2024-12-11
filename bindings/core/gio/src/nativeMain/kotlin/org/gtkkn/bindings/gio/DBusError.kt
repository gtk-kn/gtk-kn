// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.native.gio.GDBusError
import org.gtkkn.native.gio.g_dbus_error_encode_gerror
import org.gtkkn.native.gio.g_dbus_error_get_remote_error
import org.gtkkn.native.gio.g_dbus_error_get_type
import org.gtkkn.native.gio.g_dbus_error_is_remote_error
import org.gtkkn.native.gio.g_dbus_error_new_for_dbus_error
import org.gtkkn.native.gio.g_dbus_error_quark
import org.gtkkn.native.gio.g_dbus_error_register_error
import org.gtkkn.native.gio.g_dbus_error_strip_remote_error
import org.gtkkn.native.gio.g_dbus_error_unregister_error
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import kotlin.Boolean
import kotlin.String

/**
 * Error codes for the %G_DBUS_ERROR error domain.
 * @since 2.26
 */
@GioVersion2_26
public enum class DBusError(public val nativeValue: GDBusError) {
    /**
     * A generic error; "something went wrong" - see the error message for
     * more.
     */
    FAILED(GDBusError.G_DBUS_ERROR_FAILED),

    /**
     * There was not enough memory to complete an operation.
     */
    NO_MEMORY(GDBusError.G_DBUS_ERROR_NO_MEMORY),

    /**
     * The bus doesn't know how to launch a service to supply the bus name
     * you wanted.
     */
    SERVICE_UNKNOWN(GDBusError.G_DBUS_ERROR_SERVICE_UNKNOWN),

    /**
     * The bus name you referenced doesn't exist (i.e. no application owns
     * it).
     */
    NAME_HAS_NO_OWNER(GDBusError.G_DBUS_ERROR_NAME_HAS_NO_OWNER),

    /**
     * No reply to a message expecting one, usually means a timeout occurred.
     */
    NO_REPLY(GDBusError.G_DBUS_ERROR_NO_REPLY),

    /**
     * Something went wrong reading or writing to a socket, for example.
     */
    IO_ERROR(GDBusError.G_DBUS_ERROR_IO_ERROR),

    /**
     * A D-Bus bus address was malformed.
     */
    BAD_ADDRESS(GDBusError.G_DBUS_ERROR_BAD_ADDRESS),

    /**
     * Requested operation isn't supported (like ENOSYS on UNIX).
     */
    NOT_SUPPORTED(GDBusError.G_DBUS_ERROR_NOT_SUPPORTED),

    /**
     * Some limited resource is exhausted.
     */
    LIMITS_EXCEEDED(GDBusError.G_DBUS_ERROR_LIMITS_EXCEEDED),

    /**
     * Security restrictions don't allow doing what you're trying to do.
     */
    ACCESS_DENIED(GDBusError.G_DBUS_ERROR_ACCESS_DENIED),

    /**
     * Authentication didn't work.
     */
    AUTH_FAILED(GDBusError.G_DBUS_ERROR_AUTH_FAILED),

    /**
     * Unable to connect to server (probably caused by ECONNREFUSED on a
     * socket).
     */
    NO_SERVER(GDBusError.G_DBUS_ERROR_NO_SERVER),

    /**
     * Certain timeout errors, possibly ETIMEDOUT on a socket.  Note that
     * %G_DBUS_ERROR_NO_REPLY is used for message reply timeouts. Warning:
     * this is confusingly-named given that %G_DBUS_ERROR_TIMED_OUT also
     * exists. We can't fix it for compatibility reasons so just be
     * careful.
     */
    TIMEOUT(GDBusError.G_DBUS_ERROR_TIMEOUT),

    /**
     * No network access (probably ENETUNREACH on a socket).
     */
    NO_NETWORK(GDBusError.G_DBUS_ERROR_NO_NETWORK),

    /**
     * Can't bind a socket since its address is in use (i.e. EADDRINUSE).
     */
    ADDRESS_IN_USE(GDBusError.G_DBUS_ERROR_ADDRESS_IN_USE),

    /**
     * The connection is disconnected and you're trying to use it.
     */
    DISCONNECTED(GDBusError.G_DBUS_ERROR_DISCONNECTED),

    /**
     * Invalid arguments passed to a method call.
     */
    INVALID_ARGS(GDBusError.G_DBUS_ERROR_INVALID_ARGS),

    /**
     * Missing file.
     */
    FILE_NOT_FOUND(GDBusError.G_DBUS_ERROR_FILE_NOT_FOUND),

    /**
     * Existing file and the operation you're using does not silently overwrite.
     */
    FILE_EXISTS(GDBusError.G_DBUS_ERROR_FILE_EXISTS),

    /**
     * Method name you invoked isn't known by the object you invoked it on.
     */
    UNKNOWN_METHOD(GDBusError.G_DBUS_ERROR_UNKNOWN_METHOD),

    /**
     * Certain timeout errors, e.g. while starting a service. Warning: this is
     * confusingly-named given that %G_DBUS_ERROR_TIMEOUT also exists. We
     * can't fix it for compatibility reasons so just be careful.
     */
    TIMED_OUT(GDBusError.G_DBUS_ERROR_TIMED_OUT),

    /**
     * Tried to remove or modify a match rule that didn't exist.
     */
    MATCH_RULE_NOT_FOUND(GDBusError.G_DBUS_ERROR_MATCH_RULE_NOT_FOUND),

    /**
     * The match rule isn't syntactically valid.
     */
    MATCH_RULE_INVALID(GDBusError.G_DBUS_ERROR_MATCH_RULE_INVALID),

    /**
     * While starting a new process, the exec() call failed.
     */
    SPAWN_EXEC_FAILED(GDBusError.G_DBUS_ERROR_SPAWN_EXEC_FAILED),

    /**
     * While starting a new process, the fork() call failed.
     */
    SPAWN_FORK_FAILED(GDBusError.G_DBUS_ERROR_SPAWN_FORK_FAILED),

    /**
     * While starting a new process, the child exited with a status code.
     */
    SPAWN_CHILD_EXITED(GDBusError.G_DBUS_ERROR_SPAWN_CHILD_EXITED),

    /**
     * While starting a new process, the child exited on a signal.
     */
    SPAWN_CHILD_SIGNALED(GDBusError.G_DBUS_ERROR_SPAWN_CHILD_SIGNALED),

    /**
     * While starting a new process, something went wrong.
     */
    SPAWN_FAILED(GDBusError.G_DBUS_ERROR_SPAWN_FAILED),

    /**
     * We failed to setup the environment correctly.
     */
    SPAWN_SETUP_FAILED(GDBusError.G_DBUS_ERROR_SPAWN_SETUP_FAILED),

    /**
     * We failed to setup the config parser correctly.
     */
    SPAWN_CONFIG_INVALID(GDBusError.G_DBUS_ERROR_SPAWN_CONFIG_INVALID),

    /**
     * Bus name was not valid.
     */
    SPAWN_SERVICE_INVALID(GDBusError.G_DBUS_ERROR_SPAWN_SERVICE_INVALID),

    /**
     * Service file not found in system-services directory.
     */
    SPAWN_SERVICE_NOT_FOUND(GDBusError.G_DBUS_ERROR_SPAWN_SERVICE_NOT_FOUND),

    /**
     * Permissions are incorrect on the setuid helper.
     */
    SPAWN_PERMISSIONS_INVALID(GDBusError.G_DBUS_ERROR_SPAWN_PERMISSIONS_INVALID),

    /**
     * Service file invalid (Name, User or Exec missing).
     */
    SPAWN_FILE_INVALID(GDBusError.G_DBUS_ERROR_SPAWN_FILE_INVALID),

    /**
     * Tried to get a UNIX process ID and it wasn't available.
     */
    SPAWN_NO_MEMORY(GDBusError.G_DBUS_ERROR_SPAWN_NO_MEMORY),

    /**
     * Tried to get a UNIX process ID and it wasn't available.
     */
    UNIX_PROCESS_ID_UNKNOWN(GDBusError.G_DBUS_ERROR_UNIX_PROCESS_ID_UNKNOWN),

    /**
     * A type signature is not valid.
     */
    INVALID_SIGNATURE(GDBusError.G_DBUS_ERROR_INVALID_SIGNATURE),

    /**
     * A file contains invalid syntax or is otherwise broken.
     */
    INVALID_FILE_CONTENT(GDBusError.G_DBUS_ERROR_INVALID_FILE_CONTENT),

    /**
     * Asked for SELinux security context and it wasn't available.
     */
    SELINUX_SECURITY_CONTEXT_UNKNOWN(GDBusError.G_DBUS_ERROR_SELINUX_SECURITY_CONTEXT_UNKNOWN),

    /**
     * Asked for ADT audit data and it wasn't available.
     */
    ADT_AUDIT_DATA_UNKNOWN(GDBusError.G_DBUS_ERROR_ADT_AUDIT_DATA_UNKNOWN),

    /**
     * There's already an object with the requested object path.
     */
    OBJECT_PATH_IN_USE(GDBusError.G_DBUS_ERROR_OBJECT_PATH_IN_USE),

    /**
     * Object you invoked a method on isn't known. Since 2.42
     */
    UNKNOWN_OBJECT(GDBusError.G_DBUS_ERROR_UNKNOWN_OBJECT),

    /**
     * Interface you invoked a method on isn't known by the object. Since 2.42
     */
    UNKNOWN_INTERFACE(GDBusError.G_DBUS_ERROR_UNKNOWN_INTERFACE),

    /**
     * Property you tried to access isn't known by the object. Since 2.42
     */
    UNKNOWN_PROPERTY(GDBusError.G_DBUS_ERROR_UNKNOWN_PROPERTY),

    /**
     * Property you tried to set is read-only. Since 2.42
     */
    PROPERTY_READ_ONLY(GDBusError.G_DBUS_ERROR_PROPERTY_READ_ONLY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDBusError): DBusError = when (nativeValue) {
            GDBusError.G_DBUS_ERROR_FAILED -> FAILED
            GDBusError.G_DBUS_ERROR_NO_MEMORY -> NO_MEMORY
            GDBusError.G_DBUS_ERROR_SERVICE_UNKNOWN -> SERVICE_UNKNOWN
            GDBusError.G_DBUS_ERROR_NAME_HAS_NO_OWNER -> NAME_HAS_NO_OWNER
            GDBusError.G_DBUS_ERROR_NO_REPLY -> NO_REPLY
            GDBusError.G_DBUS_ERROR_IO_ERROR -> IO_ERROR
            GDBusError.G_DBUS_ERROR_BAD_ADDRESS -> BAD_ADDRESS
            GDBusError.G_DBUS_ERROR_NOT_SUPPORTED -> NOT_SUPPORTED
            GDBusError.G_DBUS_ERROR_LIMITS_EXCEEDED -> LIMITS_EXCEEDED
            GDBusError.G_DBUS_ERROR_ACCESS_DENIED -> ACCESS_DENIED
            GDBusError.G_DBUS_ERROR_AUTH_FAILED -> AUTH_FAILED
            GDBusError.G_DBUS_ERROR_NO_SERVER -> NO_SERVER
            GDBusError.G_DBUS_ERROR_TIMEOUT -> TIMEOUT
            GDBusError.G_DBUS_ERROR_NO_NETWORK -> NO_NETWORK
            GDBusError.G_DBUS_ERROR_ADDRESS_IN_USE -> ADDRESS_IN_USE
            GDBusError.G_DBUS_ERROR_DISCONNECTED -> DISCONNECTED
            GDBusError.G_DBUS_ERROR_INVALID_ARGS -> INVALID_ARGS
            GDBusError.G_DBUS_ERROR_FILE_NOT_FOUND -> FILE_NOT_FOUND
            GDBusError.G_DBUS_ERROR_FILE_EXISTS -> FILE_EXISTS
            GDBusError.G_DBUS_ERROR_UNKNOWN_METHOD -> UNKNOWN_METHOD
            GDBusError.G_DBUS_ERROR_TIMED_OUT -> TIMED_OUT
            GDBusError.G_DBUS_ERROR_MATCH_RULE_NOT_FOUND -> MATCH_RULE_NOT_FOUND
            GDBusError.G_DBUS_ERROR_MATCH_RULE_INVALID -> MATCH_RULE_INVALID
            GDBusError.G_DBUS_ERROR_SPAWN_EXEC_FAILED -> SPAWN_EXEC_FAILED
            GDBusError.G_DBUS_ERROR_SPAWN_FORK_FAILED -> SPAWN_FORK_FAILED
            GDBusError.G_DBUS_ERROR_SPAWN_CHILD_EXITED -> SPAWN_CHILD_EXITED
            GDBusError.G_DBUS_ERROR_SPAWN_CHILD_SIGNALED -> SPAWN_CHILD_SIGNALED
            GDBusError.G_DBUS_ERROR_SPAWN_FAILED -> SPAWN_FAILED
            GDBusError.G_DBUS_ERROR_SPAWN_SETUP_FAILED -> SPAWN_SETUP_FAILED
            GDBusError.G_DBUS_ERROR_SPAWN_CONFIG_INVALID -> SPAWN_CONFIG_INVALID
            GDBusError.G_DBUS_ERROR_SPAWN_SERVICE_INVALID -> SPAWN_SERVICE_INVALID
            GDBusError.G_DBUS_ERROR_SPAWN_SERVICE_NOT_FOUND -> SPAWN_SERVICE_NOT_FOUND
            GDBusError.G_DBUS_ERROR_SPAWN_PERMISSIONS_INVALID -> SPAWN_PERMISSIONS_INVALID
            GDBusError.G_DBUS_ERROR_SPAWN_FILE_INVALID -> SPAWN_FILE_INVALID
            GDBusError.G_DBUS_ERROR_SPAWN_NO_MEMORY -> SPAWN_NO_MEMORY
            GDBusError.G_DBUS_ERROR_UNIX_PROCESS_ID_UNKNOWN -> UNIX_PROCESS_ID_UNKNOWN
            GDBusError.G_DBUS_ERROR_INVALID_SIGNATURE -> INVALID_SIGNATURE
            GDBusError.G_DBUS_ERROR_INVALID_FILE_CONTENT -> INVALID_FILE_CONTENT
            GDBusError.G_DBUS_ERROR_SELINUX_SECURITY_CONTEXT_UNKNOWN -> SELINUX_SECURITY_CONTEXT_UNKNOWN
            GDBusError.G_DBUS_ERROR_ADT_AUDIT_DATA_UNKNOWN -> ADT_AUDIT_DATA_UNKNOWN
            GDBusError.G_DBUS_ERROR_OBJECT_PATH_IN_USE -> OBJECT_PATH_IN_USE
            GDBusError.G_DBUS_ERROR_UNKNOWN_OBJECT -> UNKNOWN_OBJECT
            GDBusError.G_DBUS_ERROR_UNKNOWN_INTERFACE -> UNKNOWN_INTERFACE
            GDBusError.G_DBUS_ERROR_UNKNOWN_PROPERTY -> UNKNOWN_PROPERTY
            GDBusError.G_DBUS_ERROR_PROPERTY_READ_ONLY -> PROPERTY_READ_ONLY
            else -> error("invalid nativeValue")
        }

        /**
         * Creates a D-Bus error name to use for @error. If @error matches
         * a registered error (cf. g_dbus_error_register_error()), the corresponding
         * D-Bus error name will be returned.
         *
         * Otherwise the a name of the form
         * `org.gtk.GDBus.UnmappedGError.Quark._ESCAPED_QUARK_NAME.Code_ERROR_CODE`
         * will be used. This allows other GDBus applications to map the error
         * on the wire back to a #GError using g_dbus_error_new_for_dbus_error().
         *
         * This function is typically only used in object mappings to put a
         * #GError on the wire. Regular applications should not use it.
         *
         * @param error A #GError.
         * @return A D-Bus error name (never null).
         *     Free with g_free().
         * @since 2.26
         */
        @GioVersion2_26
        public fun encodeGerror(error: Error): String =
            g_dbus_error_encode_gerror(error.glibErrorPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Gets the D-Bus error name used for @error, if any.
         *
         * This function is guaranteed to return a D-Bus error name for all
         * #GErrors returned from functions handling remote method calls
         * (e.g. g_dbus_connection_call_finish()) unless
         * g_dbus_error_strip_remote_error() has been used on @error.
         *
         * @param error a #GError
         * @return an allocated string or null if the
         *     D-Bus error name could not be found. Free with g_free().
         * @since 2.26
         */
        @GioVersion2_26
        public fun getRemoteError(error: Error): String? =
            g_dbus_error_get_remote_error(error.glibErrorPointer.reinterpret())?.toKString()

        /**
         * Checks if @error represents an error received via D-Bus from a remote peer. If so,
         * use g_dbus_error_get_remote_error() to get the name of the error.
         *
         * @param error A #GError.
         * @return true if @error represents an error from a remote peer,
         * false otherwise.
         * @since 2.26
         */
        @GioVersion2_26
        public fun isRemoteError(error: Error): Boolean =
            g_dbus_error_is_remote_error(error.glibErrorPointer.reinterpret()).asBoolean()

        /**
         * Creates a #GError based on the contents of @dbus_error_name and
         * @dbus_error_message.
         *
         * Errors registered with g_dbus_error_register_error() will be looked
         * up using @dbus_error_name and if a match is found, the error domain
         * and code is used. Applications can use g_dbus_error_get_remote_error()
         * to recover @dbus_error_name.
         *
         * If a match against a registered error is not found and the D-Bus
         * error name is in a form as returned by g_dbus_error_encode_gerror()
         * the error domain and code encoded in the name is used to
         * create the #GError. Also, @dbus_error_name is added to the error message
         * such that it can be recovered with g_dbus_error_get_remote_error().
         *
         * Otherwise, a #GError with the error code %G_IO_ERROR_DBUS_ERROR
         * in the %G_IO_ERROR error domain is returned. Also, @dbus_error_name is
         * added to the error message such that it can be recovered with
         * g_dbus_error_get_remote_error().
         *
         * In all three cases, @dbus_error_name can always be recovered from the
         * returned #GError using the g_dbus_error_get_remote_error() function
         * (unless g_dbus_error_strip_remote_error() hasn't been used on the returned error).
         *
         * This function is typically only used in object mappings to prepare
         * #GError instances for applications. Regular applications should not use
         * it.
         *
         * @param dbusErrorName D-Bus error name.
         * @param dbusErrorMessage D-Bus error message.
         * @return An allocated #GError. Free with g_error_free().
         * @since 2.26
         */
        @GioVersion2_26
        public fun newForDbusError(dbusErrorName: String, dbusErrorMessage: String): Error =
            g_dbus_error_new_for_dbus_error(dbusErrorName, dbusErrorMessage)!!.run {
                Error(reinterpret())
            }

        public fun quark(): Quark = g_dbus_error_quark()

        /**
         * Creates an association to map between @dbus_error_name and
         * #GErrors specified by @error_domain and @error_code.
         *
         * This is typically done in the routine that returns the #GQuark for
         * an error domain.
         *
         * @param errorDomain A #GQuark for an error domain.
         * @param errorCode An error code.
         * @param dbusErrorName A D-Bus error name.
         * @return true if the association was created, false if it already
         * exists.
         * @since 2.26
         */
        @GioVersion2_26
        public fun registerError(errorDomain: Quark, errorCode: gint, dbusErrorName: String): Boolean =
            g_dbus_error_register_error(errorDomain, errorCode, dbusErrorName).asBoolean()

        /**
         * Looks for extra information in the error message used to recover
         * the D-Bus error name and strips it if found. If stripped, the
         * message field in @error will correspond exactly to what was
         * received on the wire.
         *
         * This is typically used when presenting errors to the end user.
         *
         * @param error A #GError.
         * @return true if information was stripped, false otherwise.
         * @since 2.26
         */
        @GioVersion2_26
        public fun stripRemoteError(error: Error): Boolean =
            g_dbus_error_strip_remote_error(error.glibErrorPointer.reinterpret()).asBoolean()

        /**
         * Destroys an association previously set up with g_dbus_error_register_error().
         *
         * @param errorDomain A #GQuark for an error domain.
         * @param errorCode An error code.
         * @param dbusErrorName A D-Bus error name.
         * @return true if the association was destroyed, false if it wasn't found.
         * @since 2.26
         */
        @GioVersion2_26
        public fun unregisterError(errorDomain: Quark, errorCode: gint, dbusErrorName: String): Boolean =
            g_dbus_error_unregister_error(errorDomain, errorCode, dbusErrorName).asBoolean()

        /**
         * Get the GType of DBusError
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_error_get_type()

        public fun fromErrorOrNull(error: Error): DBusError? = if (error.domain != quark()) {
            null
        } else {
            DBusError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
