// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GNotification
import org.gtkkn.native.gio.g_notification_add_button
import org.gtkkn.native.gio.g_notification_add_button_with_target_value
import org.gtkkn.native.gio.g_notification_get_type
import org.gtkkn.native.gio.g_notification_new
import org.gtkkn.native.gio.g_notification_set_body
import org.gtkkn.native.gio.g_notification_set_category
import org.gtkkn.native.gio.g_notification_set_default_action
import org.gtkkn.native.gio.g_notification_set_default_action_and_target_value
import org.gtkkn.native.gio.g_notification_set_icon
import org.gtkkn.native.gio.g_notification_set_priority
import org.gtkkn.native.gio.g_notification_set_title
import org.gtkkn.native.gio.g_notification_set_urgent
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * #GNotification is a mechanism for creating a notification to be shown
 * to the user -- typically as a pop-up notification presented by the
 * desktop environment shell.
 *
 * The key difference between #GNotification and other similar APIs is
 * that, if supported by the desktop environment, notifications sent
 * with #GNotification will persist after the application has exited,
 * and even across system reboots.
 *
 * Since the user may click on a notification while the application is
 * not running, applications using #GNotification should be able to be
 * started as a D-Bus service, using #GApplication.
 *
 * In order for #GNotification to work, the application must have installed
 * a `.desktop` file. For example:
 * |[
 *  [Desktop Entry]
 *   Name=Test Application
 *   Comment=Description of what Test Application does
 *   Exec=gnome-test-application
 *   Icon=org.gnome.TestApplication
 *   Terminal=false
 *   Type=Application
 *   Categories=GNOME;GTK;TestApplication Category;
 *   StartupNotify=true
 *   DBusActivatable=true
 *   X-GNOME-UsesNotifications=true
 * ]|
 *
 * The `X-GNOME-UsesNotifications` key indicates to GNOME Control Center
 * that this application uses notifications, so it can be listed in the
 * Control Center’s ‘Notifications’ panel.
 *
 * The `.desktop` file must be named as `org.gnome.TestApplication.desktop`,
 * where `org.gnome.TestApplication` is the ID passed to g_application_new().
 *
 * User interaction with a notification (either the default action, or
 * buttons) must be associated with actions on the application (ie:
 * "app." actions).  It is not possible to route user interaction
 * through the notification itself, because the object will not exist if
 * the application is autostarted as a result of a notification being
 * clicked.
 *
 * A notification can be sent with g_application_send_notification().
 * @since 2.40
 */
public open class Notification(
    pointer: CPointer<GNotification>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gioNotificationPointer: CPointer<GNotification>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #GNotification with @title as its title.
     *
     * After populating @notification with more details, it can be sent to
     * the desktop shell with g_application_send_notification(). Changing
     * any properties after this call will not have any effect until
     * resending @notification.
     *
     * @param title the title of the notification
     * @return a new #GNotification instance
     * @since 2.40
     */
    public constructor(title: String) : this(g_notification_new(title)!!.reinterpret())

    /**
     * Adds a button to @notification that activates the action in
     * @detailed_action when clicked. That action must be an
     * application-wide action (starting with "app."). If @detailed_action
     * contains a target, the action will be activated with that target as
     * its parameter.
     *
     * See g_action_parse_detailed_name() for a description of the format
     * for @detailed_action.
     *
     * @param label label of the button
     * @param detailedAction a detailed action name
     * @since 2.40
     */
    public open fun addButton(
        label: String,
        detailedAction: String,
    ): Unit = g_notification_add_button(gioNotificationPointer.reinterpret(), label, detailedAction)

    /**
     * Adds a button to @notification that activates @action when clicked.
     * @action must be an application-wide action (it must start with "app.").
     *
     * If @target is non-null, @action will be activated with @target as
     * its parameter.
     *
     * @param label label of the button
     * @param action an action name
     * @param target a #GVariant to use as @action's parameter, or null
     * @since 2.40
     */
    public open fun addButtonWithTarget(
        label: String,
        action: String,
        target: Variant? = null,
    ): Unit =
        g_notification_add_button_with_target_value(
            gioNotificationPointer.reinterpret(),
            label,
            action,
            target?.glibVariantPointer
        )

    /**
     * Sets the body of @notification to @body.
     *
     * @param body the new body for @notification, or null
     * @since 2.40
     */
    public open fun setBody(body: String? = null): Unit =
        g_notification_set_body(gioNotificationPointer.reinterpret(), body)

    /**
     * Sets the type of @notification to @category. Categories have a main
     * type like `email`, `im` or `device` and can have a detail separated
     * by a `.`, e.g. `im.received` or `email.arrived`. Setting the category
     * helps the notification server to select proper feedback to the user.
     *
     * Standard categories are [listed in the
     * specification](https://specifications.freedesktop.org/notification-spec/latest/ar01s06.html).
     *
     * @param category the category for @notification, or null for no category
     * @since 2.70
     */
    public open fun setCategory(category: String? = null): Unit =
        g_notification_set_category(gioNotificationPointer.reinterpret(), category)

    /**
     * Sets the default action of @notification to @detailed_action. This
     * action is activated when the notification is clicked on.
     *
     * The action in @detailed_action must be an application-wide action (it
     * must start with "app."). If @detailed_action contains a target, the
     * given action will be activated with that target as its parameter.
     * See g_action_parse_detailed_name() for a description of the format
     * for @detailed_action.
     *
     * When no default action is set, the application that the notification
     * was sent on is activated.
     *
     * @param detailedAction a detailed action name
     * @since 2.40
     */
    public open fun setDefaultAction(detailedAction: String): Unit =
        g_notification_set_default_action(gioNotificationPointer.reinterpret(), detailedAction)

    /**
     * Sets the default action of @notification to @action. This action is
     * activated when the notification is clicked on. It must be an
     * application-wide action (start with "app.").
     *
     * If @target is non-null, @action will be activated with @target as
     * its parameter.
     *
     * When no default action is set, the application that the notification
     * was sent on is activated.
     *
     * @param action an action name
     * @param target a #GVariant to use as @action's parameter, or null
     * @since 2.40
     */
    public open fun setDefaultActionAndTarget(
        action: String,
        target: Variant? = null,
    ): Unit =
        g_notification_set_default_action_and_target_value(
            gioNotificationPointer.reinterpret(),
            action,
            target?.glibVariantPointer
        )

    /**
     * Sets the icon of @notification to @icon.
     *
     * @param icon the icon to be shown in @notification, as a #GIcon
     * @since 2.40
     */
    public open fun setIcon(icon: Icon): Unit =
        g_notification_set_icon(gioNotificationPointer.reinterpret(), icon.gioIconPointer)

    /**
     * Sets the priority of @notification to @priority. See
     * #GNotificationPriority for possible values.
     *
     * @param priority a #GNotificationPriority
     */
    public open fun setPriority(priority: NotificationPriority): Unit =
        g_notification_set_priority(gioNotificationPointer.reinterpret(), priority.nativeValue)

    /**
     * Sets the title of @notification to @title.
     *
     * @param title the new title for @notification
     * @since 2.40
     */
    public open fun setTitle(title: String): Unit =
        g_notification_set_title(gioNotificationPointer.reinterpret(), title)

    /**
     * Deprecated in favor of g_notification_set_priority().
     *
     * @param urgent true if @notification is urgent
     * @since 2.40
     */
    public open fun setUrgent(urgent: Boolean): Unit =
        g_notification_set_urgent(gioNotificationPointer.reinterpret(), urgent.asGBoolean())

    public companion object : TypeCompanion<Notification> {
        override val type: GeneratedClassKGType<Notification> =
            GeneratedClassKGType(g_notification_get_type()) { Notification(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
