// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GUnixCredentialsMessage
import org.gtkkn.native.gio.g_unix_credentials_message_get_credentials
import org.gtkkn.native.gio.g_unix_credentials_message_get_type
import org.gtkkn.native.gio.g_unix_credentials_message_is_supported
import org.gtkkn.native.gio.g_unix_credentials_message_new
import org.gtkkn.native.gio.g_unix_credentials_message_new_with_credentials
import kotlin.Boolean

/**
 * This [class@Gio.SocketControlMessage] contains a [class@Gio.Credentials]
 * instance.  It may be sent using [method@Gio.Socket.send_message] and received
 * using [method@Gio.Socket.receive_message] over UNIX sockets (ie: sockets in
 * the `G_SOCKET_FAMILY_UNIX` family).
 *
 * For an easier way to send and receive credentials over
 * stream-oriented UNIX sockets, see
 * [method@Gio.UnixConnection.send_credentials] and
 * [method@Gio.UnixConnection.receive_credentials]. To receive credentials of
 * a foreign process connected to a socket, use
 * [method@Gio.Socket.get_credentials].
 *
 * Since GLib 2.72, `GUnixCredentialMessage` is available on all platforms. It
 * requires underlying system support (such as Windows 10 with `AF_UNIX`) at run
 * time.
 *
 * Before GLib 2.72, `<gio/gunixcredentialsmessage.h>` belonged to the UNIX-specific
 * GIO interfaces, thus you had to use the `gio-unix-2.0.pc` pkg-config file
 * when using it. This is no longer necessary since GLib 2.72.
 * @since 2.26
 */
public open class UnixCredentialsMessage(
    pointer: CPointer<GUnixCredentialsMessage>,
) : SocketControlMessage(pointer.reinterpret()),
    KGTyped {
    public val gioUnixCredentialsMessagePointer: CPointer<GUnixCredentialsMessage>
        get() = gPointer.reinterpret()

    /**
     * The credentials stored in the message.
     *
     * @since 2.26
     */
    public open val credentials: Credentials
        /**
         * Gets the credentials stored in @message.
         *
         * @return A #GCredentials instance. Do not free, it is owned by @message.
         * @since 2.26
         */
        get() =
            g_unix_credentials_message_get_credentials(gioUnixCredentialsMessagePointer.reinterpret())!!.run {
                Credentials(reinterpret())
            }

    /**
     * Creates a new #GUnixCredentialsMessage with credentials matching the current processes.
     *
     * @return a new #GUnixCredentialsMessage
     * @since 2.26
     */
    public constructor() : this(g_unix_credentials_message_new()!!.reinterpret())

    /**
     * Creates a new #GUnixCredentialsMessage holding @credentials.
     *
     * @param credentials A #GCredentials object.
     * @return a new #GUnixCredentialsMessage
     * @since 2.26
     */
    public constructor(
        credentials: Credentials,
    ) : this(
        g_unix_credentials_message_new_with_credentials(credentials.gioCredentialsPointer.reinterpret())!!.reinterpret()
    )

    /**
     * Gets the credentials stored in @message.
     *
     * @return A #GCredentials instance. Do not free, it is owned by @message.
     * @since 2.26
     */
    public open fun getCredentials(): Credentials =
        g_unix_credentials_message_get_credentials(gioUnixCredentialsMessagePointer.reinterpret())!!.run {
            Credentials(reinterpret())
        }

    public companion object : TypeCompanion<UnixCredentialsMessage> {
        override val type: GeneratedClassKGType<UnixCredentialsMessage> =
            GeneratedClassKGType(g_unix_credentials_message_get_type()) { UnixCredentialsMessage(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Checks if passing #GCredentials on a #GSocket is supported on this platform.
         *
         * @return true if supported, false otherwise
         * @since 2.26
         */
        public fun isSupported(): Boolean = g_unix_credentials_message_is_supported().asBoolean()
    }
}
