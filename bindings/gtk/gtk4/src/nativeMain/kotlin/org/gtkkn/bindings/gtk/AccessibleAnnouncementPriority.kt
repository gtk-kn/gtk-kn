// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessibleAnnouncementPriority
import org.gtkkn.native.gtk.gtk_accessible_announcement_priority_get_type

/**
 * The priority of an accessibility announcement.
 * @since 4.14
 */
@GtkVersion4_14
public enum class AccessibleAnnouncementPriority(public val nativeValue: GtkAccessibleAnnouncementPriority) {
    LOW(GtkAccessibleAnnouncementPriority.GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_LOW),
    MEDIUM(GtkAccessibleAnnouncementPriority.GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_MEDIUM),
    HIGH(GtkAccessibleAnnouncementPriority.GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_HIGH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleAnnouncementPriority): AccessibleAnnouncementPriority =
            when (nativeValue) {
                GtkAccessibleAnnouncementPriority.GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_LOW -> LOW
                GtkAccessibleAnnouncementPriority.GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_MEDIUM -> MEDIUM
                GtkAccessibleAnnouncementPriority.GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_HIGH -> HIGH
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of AccessibleAnnouncementPriority
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_accessible_announcement_priority_get_type()
    }
}
