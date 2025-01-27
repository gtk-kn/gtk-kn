// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSocketConnection
import org.gtkkn.native.gio.GThreadedSocketService
import org.gtkkn.native.gio.g_threaded_socket_service_get_type
import org.gtkkn.native.gio.g_threaded_socket_service_new
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GObject
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.ULong

/**
 * A `GThreadedSocketService` is a simple subclass of [class@Gio.SocketService]
 * that handles incoming connections by creating a worker thread and
 * dispatching the connection to it by emitting the
 * [signal@Gio.ThreadedSocketService::run signal] in the new thread.
 *
 * The signal handler may perform blocking I/O and need not return
 * until the connection is closed.
 *
 * The service is implemented using a thread pool, so there is a
 * limited amount of threads available to serve incoming requests.
 * The service automatically stops the [class@Gio.SocketService] from accepting
 * new connections when all threads are busy.
 *
 * As with [class@Gio.SocketService], you may connect to
 * [signal@Gio.ThreadedSocketService::run], or subclass and override the default
 * handler.
 *
 * ## Skipped during bindings generation
 *
 * - method `max-threads`: Property has no getter nor setter
 *
 * @since 2.22
 */
@GioVersion2_22
public open class ThreadedSocketService(public val gioThreadedSocketServicePointer: CPointer<GThreadedSocketService>) :
    SocketService(gioThreadedSocketServicePointer.reinterpret()),
    KGTyped {
    /**
     * Creates a new #GThreadedSocketService with no listeners. Listeners
     * must be added with one of the #GSocketListener "add" methods.
     *
     * @param maxThreads the maximal number of threads to execute concurrently
     *   handling incoming clients, -1 means no limit
     * @return a new #GSocketService.
     * @since 2.22
     */
    public constructor(maxThreads: gint) : this(g_threaded_socket_service_new(maxThreads)!!.reinterpret())

    /**
     * The ::run signal is emitted in a worker thread in response to an
     * incoming connection. This thread is dedicated to handling
     * @connection and may perform blocking IO. The signal handler need
     * not return until the connection is closed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `connection` a new #GSocketConnection object.; `sourceObject` the source_object passed to g_socket_listener_add_address().. Returns true to stop further signal handlers from being called
     */
    public fun onRun(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (connection: SocketConnection, sourceObject: Object?) -> Boolean,
    ): ULong = g_signal_connect_data(
        gioThreadedSocketServicePointer,
        "run",
        onRunFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<ThreadedSocketService> {
        override val type: GeneratedClassKGType<ThreadedSocketService> =
            GeneratedClassKGType(getTypeOrNull("g_threaded_socket_service_get_type")!!) {
                ThreadedSocketService(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of ThreadedSocketService
         *
         * @return the GType
         */
        public fun getType(): GType = g_threaded_socket_service_get_type()
    }
}

private val onRunFunc:
    CPointer<CFunction<(CPointer<GSocketConnection>, CPointer<GObject>?) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            connection: CPointer<GSocketConnection>?,
            sourceObject: CPointer<GObject>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                connection: SocketConnection,
                sourceObject: Object?,
            ) -> Boolean
            >().get().invoke(
            connection!!.run {
                SocketConnection(this)
            },
            sourceObject?.run {
                Object(this)
            }
        ).asGBoolean()
    }
        .reinterpret()
