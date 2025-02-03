// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GUnixCredentialsMessage
import org.gtkkn.native.gio.g_unix_credentials_message_get_credentials
import org.gtkkn.native.gio.g_unix_credentials_message_get_type
import org.gtkkn.native.gio.g_unix_credentials_message_is_supported
import org.gtkkn.native.gio.g_unix_credentials_message_new
import org.gtkkn.native.gio.g_unix_credentials_message_new_with_credentials
import org.gtkkn.native.gobject.GType
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
@GioVersion2_26
public open class UnixCredentialsMessage(
    public val gioUnixCredentialsMessagePointer: CPointer<GUnixCredentialsMessage>,
) : SocketControlMessage(gioUnixCredentialsMessagePointer.reinterpret()),
    KGTyped {
    init {
        Gio
    }

    /**
     * The credentials stored in the message.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open val credentials: Credentials
        /**
         * Gets the credentials stored in @message.
         *
         * @return A #GCredentials instance. Do not free, it is owned by @message.
         * @since 2.26
         */
        get() = g_unix_credentials_message_get_credentials(gioUnixCredentialsMessagePointer)!!.run {
            InstanceCache.get(this, true) { Credentials(reinterpret()) }!!
        }

    /**
     * Creates a new #GUnixCredentialsMessage with credentials matching the current processes.
     *
     * @return a new #GUnixCredentialsMessage
     * @since 2.26
     */
    public constructor() : this(g_unix_credentials_message_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Creates a new #GUnixCredentialsMessage holding @credentials.
     *
     * @param credentials A #GCredentials object.
     * @return a new #GUnixCredentialsMessage
     * @since 2.26
     */
    public constructor(
        credentials: Credentials,
    ) : this(g_unix_credentials_message_new_with_credentials(credentials.gioCredentialsPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<UnixCredentialsMessage> {
        override val type: GeneratedClassKGType<UnixCredentialsMessage> =
            GeneratedClassKGType(getTypeOrNull()!!) { UnixCredentialsMessage(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Checks if passing #GCredentials on a #GSocket is supported on this platform.
         *
         * @return true if supported, false otherwise
         * @since 2.26
         */
        @GioVersion2_26
        public fun isSupported(): Boolean = g_unix_credentials_message_is_supported().asBoolean()

        /**
         * Get the GType of UnixCredentialsMessage
         *
         * @return the GType
         */
        public fun getType(): GType = g_unix_credentials_message_get_type()

        /**
         * Gets the GType of from the symbol `g_unix_credentials_message_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_unix_credentials_message_get_type")
    }
}
