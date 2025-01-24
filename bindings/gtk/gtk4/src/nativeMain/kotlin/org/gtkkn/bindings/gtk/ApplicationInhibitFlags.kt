// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_APPLICATION_INHIBIT_IDLE
import org.gtkkn.native.gtk.GTK_APPLICATION_INHIBIT_LOGOUT
import org.gtkkn.native.gtk.GTK_APPLICATION_INHIBIT_SUSPEND
import org.gtkkn.native.gtk.GTK_APPLICATION_INHIBIT_SWITCH
import org.gtkkn.native.gtk.GtkApplicationInhibitFlags
import org.gtkkn.native.gtk.gtk_application_inhibit_flags_get_type

/**
 * Types of user actions that may be blocked by `GtkApplication`.
 *
 * See [method@Gtk.Application.inhibit].
 */
public class ApplicationInhibitFlags(public val mask: GtkApplicationInhibitFlags) : Bitfield<ApplicationInhibitFlags> {
    override infix fun or(other: ApplicationInhibitFlags): ApplicationInhibitFlags = ApplicationInhibitFlags(
        mask or other.mask
    )

    public companion object {
        /**
         * Inhibit ending the user session
         *   by logging out or by shutting down the computer
         */
        public val LOGOUT: ApplicationInhibitFlags =
            ApplicationInhibitFlags(GTK_APPLICATION_INHIBIT_LOGOUT)

        /**
         * Inhibit user switching
         */
        public val SWITCH: ApplicationInhibitFlags =
            ApplicationInhibitFlags(GTK_APPLICATION_INHIBIT_SWITCH)

        /**
         * Inhibit suspending the
         *   session or computer
         */
        public val SUSPEND: ApplicationInhibitFlags =
            ApplicationInhibitFlags(GTK_APPLICATION_INHIBIT_SUSPEND)

        /**
         * Inhibit the session being
         *   marked as idle (and possibly locked)
         */
        public val IDLE: ApplicationInhibitFlags =
            ApplicationInhibitFlags(GTK_APPLICATION_INHIBIT_IDLE)

        /**
         * Get the GType of ApplicationInhibitFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_application_inhibit_flags_get_type()
    }
}
