// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gsk.GskShadow
import kotlin.Float

/**
 * The shadow parameters in a shadow node.
 *
 * ## Skipped during bindings generation
 *
 * - field `color`: Gdk.RGBA
 */
public class Shadow(
    pointer: CPointer<GskShadow>,
) : Record {
    public val gskShadowPointer: CPointer<GskShadow> = pointer

    /**
     * the horizontal offset of the shadow
     */
    public var dx: Float
        get() = gskShadowPointer.pointed.dx
        set(`value`) {
            gskShadowPointer.pointed.dx = value
        }

    /**
     * the vertical offset of the shadow
     */
    public var dy: Float
        get() = gskShadowPointer.pointed.dy
        set(`value`) {
            gskShadowPointer.pointed.dy = value
        }

    /**
     * the radius of the shadow
     */
    public var radius: Float
        get() = gskShadowPointer.pointed.radius
        set(`value`) {
            gskShadowPointer.pointed.radius = value
        }

    public companion object : RecordCompanion<Shadow, GskShadow> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Shadow = Shadow(pointer.reinterpret())
    }
}
