// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDriveStartFlags
import org.gtkkn.native.gio.G_DRIVE_START_NONE

/**
 * Flags used when starting a drive.
 * @since 2.22
 */
public class DriveStartFlags(
    public val mask: GDriveStartFlags,
) : Bitfield<DriveStartFlags> {
    override infix fun or(other: DriveStartFlags): DriveStartFlags = DriveStartFlags(mask or other.mask)

    @GioVersion2_22
    public companion object {
        /**
         * No flags set.
         */
        public val NONE: DriveStartFlags = DriveStartFlags(G_DRIVE_START_NONE)
    }
}
