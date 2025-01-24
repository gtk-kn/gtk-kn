// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.native.gio.GDriveStartStopType
import org.gtkkn.native.gio.g_drive_start_stop_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * Enumeration describing how a drive can be started/stopped.
 * @since 2.22
 */
@GioVersion2_22
public enum class DriveStartStopType(public val nativeValue: GDriveStartStopType) {
    /**
     * Unknown or drive doesn't support
     *    start/stop.
     */
    UNKNOWN(GDriveStartStopType.G_DRIVE_START_STOP_TYPE_UNKNOWN),

    /**
     * The stop method will physically
     *    shut down the drive and e.g. power down the port the drive is
     *    attached to.
     */
    SHUTDOWN(GDriveStartStopType.G_DRIVE_START_STOP_TYPE_SHUTDOWN),

    /**
     * The start/stop methods are used
     *    for connecting/disconnect to the drive over the network.
     */
    NETWORK(GDriveStartStopType.G_DRIVE_START_STOP_TYPE_NETWORK),

    /**
     * The start/stop methods will
     *    assemble/disassemble a virtual drive from several physical
     *    drives.
     */
    MULTIDISK(GDriveStartStopType.G_DRIVE_START_STOP_TYPE_MULTIDISK),

    /**
     * The start/stop methods will
     *    unlock/lock the disk (for example using the ATA <quote>SECURITY
     *    UNLOCK DEVICE</quote> command)
     */
    PASSWORD(GDriveStartStopType.G_DRIVE_START_STOP_TYPE_PASSWORD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDriveStartStopType): DriveStartStopType = when (nativeValue) {
            GDriveStartStopType.G_DRIVE_START_STOP_TYPE_UNKNOWN -> UNKNOWN
            GDriveStartStopType.G_DRIVE_START_STOP_TYPE_SHUTDOWN -> SHUTDOWN
            GDriveStartStopType.G_DRIVE_START_STOP_TYPE_NETWORK -> NETWORK
            GDriveStartStopType.G_DRIVE_START_STOP_TYPE_MULTIDISK -> MULTIDISK
            GDriveStartStopType.G_DRIVE_START_STOP_TYPE_PASSWORD -> PASSWORD
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of DriveStartStopType
         *
         * @return the GType
         */
        public fun getType(): GType = g_drive_start_stop_type_get_type()
    }
}
