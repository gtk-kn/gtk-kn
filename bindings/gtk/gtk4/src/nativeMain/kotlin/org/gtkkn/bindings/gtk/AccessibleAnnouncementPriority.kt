// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.native.gtk.GtkAccessibleAnnouncementPriority
import org.gtkkn.native.gtk.GtkAccessibleAnnouncementPriority.GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_HIGH
import org.gtkkn.native.gtk.GtkAccessibleAnnouncementPriority.GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_LOW
import org.gtkkn.native.gtk.GtkAccessibleAnnouncementPriority.GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_MEDIUM

/**
 * The priority of an accessibility announcement.
 * @since 4.14
 */
@GtkVersion4_14
public enum class AccessibleAnnouncementPriority(
    public val nativeValue: GtkAccessibleAnnouncementPriority,
) {
    LOW(GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_LOW),
    MEDIUM(GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_MEDIUM),
    HIGH(GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_HIGH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleAnnouncementPriority): AccessibleAnnouncementPriority =
            when (nativeValue) {
                GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_LOW -> LOW
                GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_MEDIUM -> MEDIUM
                GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_HIGH -> HIGH
                else -> error("invalid nativeValue")
            }
    }
}
