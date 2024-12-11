// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_12
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_16
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_8
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.guint64
import org.gtkkn.native.webkit.WebKitNotification
import org.gtkkn.native.webkit.webkit_notification_clicked
import org.gtkkn.native.webkit.webkit_notification_close
import org.gtkkn.native.webkit.webkit_notification_get_body
import org.gtkkn.native.webkit.webkit_notification_get_id
import org.gtkkn.native.webkit.webkit_notification_get_tag
import org.gtkkn.native.webkit.webkit_notification_get_title
import org.gtkkn.native.webkit.webkit_notification_get_type
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Holds information about a notification that should be shown to the user.
 * @since 2.8
 */
@WebKitVersion2_8
public class Notification(pointer: CPointer<WebKitNotification>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitNotificationPointer: CPointer<WebKitNotification>
        get() = gPointer.reinterpret()

    /**
     * The body for the notification.
     *
     * @since 2.8
     */
    @WebKitVersion2_8
    public val body: String
        /**
         * Obtains the body for the notification.
         *
         * @return the body for the notification
         * @since 2.8
         */
        get() = webkit_notification_get_body(webkitNotificationPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * The unique id for the notification.
     *
     * @since 2.8
     */
    @WebKitVersion2_8
    public val id: guint64
        /**
         * Obtains the unique id for the notification.
         *
         * @return the unique id for the notification
         * @since 2.8
         */
        get() = webkit_notification_get_id(webkitNotificationPointer.reinterpret())

    /**
     * The tag identifier for the notification.
     *
     * @since 2.16
     */
    @WebKitVersion2_16
    public val tag: String?
        /**
         * Obtains the tag identifier for the notification.
         *
         * @return the tag for the notification
         * @since 2.16
         */
        get() = webkit_notification_get_tag(webkitNotificationPointer.reinterpret())?.toKString()

    /**
     * The title for the notification.
     *
     * @since 2.8
     */
    @WebKitVersion2_8
    public val title: String
        /**
         * Obtains the title for the notification.
         *
         * @return the title for the notification
         * @since 2.8
         */
        get() = webkit_notification_get_title(webkitNotificationPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Tells WebKit the notification has been clicked.
     *
     * This will emit the
     * #WebKitNotification::clicked signal.
     *
     * @since 2.12
     */
    @WebKitVersion2_12
    public fun clicked(): Unit = webkit_notification_clicked(webkitNotificationPointer.reinterpret())

    /**
     * Closes the notification.
     *
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun close(): Unit = webkit_notification_close(webkitNotificationPointer.reinterpret())

    /**
     * Emitted when a notification has been clicked. See webkit_notification_clicked().
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.12
     */
    @WebKitVersion2_12
    public fun connectClicked(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "clicked",
            connectClickedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a notification has been withdrawn.
     *
     * The default handler will close the notification using libnotify, if built with
     * support for it.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun connectClosed(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "closed",
            connectClosedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Notification> {
        override val type: GeneratedClassKGType<Notification> =
            GeneratedClassKGType(webkit_notification_get_type()) { Notification(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of Notification
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_notification_get_type()
    }
}

private val connectClickedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectClosedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
