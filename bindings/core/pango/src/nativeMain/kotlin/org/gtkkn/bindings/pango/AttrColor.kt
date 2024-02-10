// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAttrColor

/**
 * The `PangoAttrColor` structure is used to represent attributes that
 * are colors.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Attribute
 * - field `color`: Color
 */
public class AttrColor(
    pointer: CPointer<PangoAttrColor>,
) : Record {
    public val pangoAttrColorPointer: CPointer<PangoAttrColor> = pointer

    public companion object : RecordCompanion<AttrColor, PangoAttrColor> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AttrColor = AttrColor(pointer.reinterpret())
    }
}
