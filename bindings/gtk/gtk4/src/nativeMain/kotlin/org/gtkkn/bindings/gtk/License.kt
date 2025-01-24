// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkLicense
import org.gtkkn.native.gtk.gtk_license_get_type

/**
 * The type of license for an application.
 *
 * This enumeration can be expanded at later date.
 */
public enum class License(public val nativeValue: GtkLicense) {
    /**
     * No license specified
     */
    UNKNOWN(GtkLicense.GTK_LICENSE_UNKNOWN),

    /**
     * A license text is going to be specified by the
     *   developer
     */
    CUSTOM(GtkLicense.GTK_LICENSE_CUSTOM),

    /**
     * The GNU General Public License, version 2.0 or later
     */
    GPL_2_0(GtkLicense.GTK_LICENSE_GPL_2_0),

    /**
     * The GNU General Public License, version 3.0 or later
     */
    GPL_3_0(GtkLicense.GTK_LICENSE_GPL_3_0),

    /**
     * The GNU Lesser General Public License, version 2.1 or later
     */
    LGPL_2_1(GtkLicense.GTK_LICENSE_LGPL_2_1),

    /**
     * The GNU Lesser General Public License, version 3.0 or later
     */
    LGPL_3_0(GtkLicense.GTK_LICENSE_LGPL_3_0),

    /**
     * The BSD standard license
     */
    BSD(GtkLicense.GTK_LICENSE_BSD),

    /**
     * The MIT/X11 standard license
     */
    MIT_X11(GtkLicense.GTK_LICENSE_MIT_X11),

    /**
     * The Artistic License, version 2.0
     */
    ARTISTIC(GtkLicense.GTK_LICENSE_ARTISTIC),

    /**
     * The GNU General Public License, version 2.0 only
     */
    GPL_2_0_ONLY(GtkLicense.GTK_LICENSE_GPL_2_0_ONLY),

    /**
     * The GNU General Public License, version 3.0 only
     */
    GPL_3_0_ONLY(GtkLicense.GTK_LICENSE_GPL_3_0_ONLY),

    /**
     * The GNU Lesser General Public License, version 2.1 only
     */
    LGPL_2_1_ONLY(GtkLicense.GTK_LICENSE_LGPL_2_1_ONLY),

    /**
     * The GNU Lesser General Public License, version 3.0 only
     */
    LGPL_3_0_ONLY(GtkLicense.GTK_LICENSE_LGPL_3_0_ONLY),

    /**
     * The GNU Affero General Public License, version 3.0 or later
     */
    AGPL_3_0(GtkLicense.GTK_LICENSE_AGPL_3_0),

    /**
     * The GNU Affero General Public License, version 3.0 only
     */
    AGPL_3_0_ONLY(GtkLicense.GTK_LICENSE_AGPL_3_0_ONLY),

    /**
     * The 3-clause BSD licence
     */
    BSD_3(GtkLicense.GTK_LICENSE_BSD_3),

    /**
     * The Apache License, version 2.0
     */
    APACHE_2_0(GtkLicense.GTK_LICENSE_APACHE_2_0),

    /**
     * The Mozilla Public License, version 2.0
     */
    MPL_2_0(GtkLicense.GTK_LICENSE_MPL_2_0),

    /**
     * Zero-Clause BSD license
     */
    `0BSD`(GtkLicense.GTK_LICENSE_0BSD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkLicense): License = when (nativeValue) {
            GtkLicense.GTK_LICENSE_UNKNOWN -> UNKNOWN
            GtkLicense.GTK_LICENSE_CUSTOM -> CUSTOM
            GtkLicense.GTK_LICENSE_GPL_2_0 -> GPL_2_0
            GtkLicense.GTK_LICENSE_GPL_3_0 -> GPL_3_0
            GtkLicense.GTK_LICENSE_LGPL_2_1 -> LGPL_2_1
            GtkLicense.GTK_LICENSE_LGPL_3_0 -> LGPL_3_0
            GtkLicense.GTK_LICENSE_BSD -> BSD
            GtkLicense.GTK_LICENSE_MIT_X11 -> MIT_X11
            GtkLicense.GTK_LICENSE_ARTISTIC -> ARTISTIC
            GtkLicense.GTK_LICENSE_GPL_2_0_ONLY -> GPL_2_0_ONLY
            GtkLicense.GTK_LICENSE_GPL_3_0_ONLY -> GPL_3_0_ONLY
            GtkLicense.GTK_LICENSE_LGPL_2_1_ONLY -> LGPL_2_1_ONLY
            GtkLicense.GTK_LICENSE_LGPL_3_0_ONLY -> LGPL_3_0_ONLY
            GtkLicense.GTK_LICENSE_AGPL_3_0 -> AGPL_3_0
            GtkLicense.GTK_LICENSE_AGPL_3_0_ONLY -> AGPL_3_0_ONLY
            GtkLicense.GTK_LICENSE_BSD_3 -> BSD_3
            GtkLicense.GTK_LICENSE_APACHE_2_0 -> APACHE_2_0
            GtkLicense.GTK_LICENSE_MPL_2_0 -> MPL_2_0
            GtkLicense.GTK_LICENSE_0BSD -> `0BSD`
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of License
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_license_get_type()
    }
}
