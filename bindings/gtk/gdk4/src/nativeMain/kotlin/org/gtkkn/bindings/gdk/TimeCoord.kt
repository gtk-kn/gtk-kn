// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gdk.GdkTimeCoord
import kotlin.UInt

/**
 * A `GdkTimeCoord` stores a single event in a motion history.
 *
 * ## Skipped during bindings generation
 *
 * - field `axes`: Fields with arrays are not supported
 */
public class TimeCoord(
    pointer: CPointer<GdkTimeCoord>,
) : Record {
    public val gdkTimeCoordPointer: CPointer<GdkTimeCoord> = pointer

    /**
     * The timestamp for this event
     */
    public var time: UInt
        get() = gdkTimeCoordPointer.pointed.time
        set(`value`) {
            gdkTimeCoordPointer.pointed.time = value
        }

    /**
     * Flags indicating what axes are present
     */
    public var flags: AxisFlags
        get() =
            gdkTimeCoordPointer.pointed.flags.run {
                AxisFlags(this)
            }
        set(`value`) {
            gdkTimeCoordPointer.pointed.flags = value.mask
        }

    public companion object : RecordCompanion<TimeCoord, GdkTimeCoord> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TimeCoord = TimeCoord(pointer.reinterpret())
    }
}
