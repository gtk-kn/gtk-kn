// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gsk.GskColorStop
import kotlin.Float

/**
 * A color stop in a gradient node.
 *
 * ## Skipped during bindings generation
 *
 * - field `color`: Gdk.RGBA
 */
public class ColorStop(
    pointer: CPointer<GskColorStop>,
) : Record {
    public val gskColorStopPointer: CPointer<GskColorStop> = pointer

    /**
     * the offset of the color stop
     */
    public var offset: Float
        get() = gskColorStopPointer.pointed.offset
        set(`value`) {
            gskColorStopPointer.pointed.offset = value
        }

    public companion object : RecordCompanion<ColorStop, GskColorStop> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ColorStop = ColorStop(pointer.reinterpret())
    }
}
