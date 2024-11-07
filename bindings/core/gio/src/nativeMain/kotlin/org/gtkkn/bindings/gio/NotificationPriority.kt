// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_42
import org.gtkkn.native.gio.GNotificationPriority

/**
 * Priority levels for #GNotifications.
 * @since 2.42
 */
@GioVersion2_42
public enum class NotificationPriority(
    public val nativeValue: GNotificationPriority,
) {
    /**
     * the default priority, to be used for the
     *   majority of notifications (for example email messages, software updates,
     *   completed download/sync operations)
     */
    NORMAL(GNotificationPriority.G_NOTIFICATION_PRIORITY_NORMAL),

    /**
     * for notifications that do not require
     *   immediate attention - typically used for contextual background
     *   information, such as contact birthdays or local weather
     */
    LOW(GNotificationPriority.G_NOTIFICATION_PRIORITY_LOW),

    /**
     * for events that require more attention,
     *   usually because responses are time-sensitive (for example chat and SMS
     *   messages or alarms)
     */
    HIGH(GNotificationPriority.G_NOTIFICATION_PRIORITY_HIGH),

    /**
     * for urgent notifications, or notifications
     *   that require a response in a short space of time (for example phone calls
     *   or emergency warnings)
     */
    URGENT(GNotificationPriority.G_NOTIFICATION_PRIORITY_URGENT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GNotificationPriority): NotificationPriority =
            when (nativeValue) {
                GNotificationPriority.G_NOTIFICATION_PRIORITY_NORMAL -> NORMAL
                GNotificationPriority.G_NOTIFICATION_PRIORITY_LOW -> LOW
                GNotificationPriority.G_NOTIFICATION_PRIORITY_HIGH -> HIGH
                GNotificationPriority.G_NOTIFICATION_PRIORITY_URGENT -> URGENT
                else -> error("invalid nativeValue")
            }
    }
}
