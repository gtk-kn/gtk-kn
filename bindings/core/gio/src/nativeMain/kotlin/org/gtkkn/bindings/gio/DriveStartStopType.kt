// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GDriveStartStopType
import org.gtkkn.native.gio.GDriveStartStopType.G_DRIVE_START_STOP_TYPE_MULTIDISK
import org.gtkkn.native.gio.GDriveStartStopType.G_DRIVE_START_STOP_TYPE_NETWORK
import org.gtkkn.native.gio.GDriveStartStopType.G_DRIVE_START_STOP_TYPE_PASSWORD
import org.gtkkn.native.gio.GDriveStartStopType.G_DRIVE_START_STOP_TYPE_SHUTDOWN
import org.gtkkn.native.gio.GDriveStartStopType.G_DRIVE_START_STOP_TYPE_UNKNOWN

/**
 * Enumeration describing how a drive can be started/stopped.
 * @since 2.22
 */
public enum class DriveStartStopType(
    public val nativeValue: GDriveStartStopType,
) {
    /**
     * Unknown or drive doesn't support
     *    start/stop.
     */
    UNKNOWN(G_DRIVE_START_STOP_TYPE_UNKNOWN),

    /**
     * The stop method will physically
     *    shut down the drive and e.g. power down the port the drive is
     *    attached to.
     */
    SHUTDOWN(G_DRIVE_START_STOP_TYPE_SHUTDOWN),

    /**
     * The start/stop methods are used
     *    for connecting/disconnect to the drive over the network.
     */
    NETWORK(G_DRIVE_START_STOP_TYPE_NETWORK),

    /**
     * The start/stop methods will
     *    assemble/disassemble a virtual drive from several physical
     *    drives.
     */
    MULTIDISK(G_DRIVE_START_STOP_TYPE_MULTIDISK),

    /**
     * The start/stop methods will
     *    unlock/lock the disk (for example using the ATA <quote>SECURITY
     *    UNLOCK DEVICE</quote> command)
     */
    PASSWORD(G_DRIVE_START_STOP_TYPE_PASSWORD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDriveStartStopType): DriveStartStopType =
            when (nativeValue) {
                G_DRIVE_START_STOP_TYPE_UNKNOWN -> UNKNOWN
                G_DRIVE_START_STOP_TYPE_SHUTDOWN -> SHUTDOWN
                G_DRIVE_START_STOP_TYPE_NETWORK -> NETWORK
                G_DRIVE_START_STOP_TYPE_MULTIDISK -> MULTIDISK
                G_DRIVE_START_STOP_TYPE_PASSWORD -> PASSWORD
                else -> error("invalid nativeValue")
            }
    }
}
