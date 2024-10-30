// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAttrShape
import org.gtkkn.native.pango.pango_attr_shape_new

/**
 * The `PangoAttrShape` structure is used to represent attributes which
 * impose shape restrictions.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data`: gpointer
 * - field `attr`: Attribute
 * - field `ink_rect`: Rectangle
 * - field `logical_rect`: Rectangle
 * - field `data`: gpointer
 * - field `copy_func`: AttrDataCopyFunc
 * - field `destroy_func`: GLib.DestroyNotify
 */
public class AttrShape(
    pointer: CPointer<PangoAttrShape>,
) : Record {
    public val pangoAttrShapePointer: CPointer<PangoAttrShape> = pointer

    public companion object : RecordCompanion<AttrShape, PangoAttrShape> {
        /**
         * Create a new shape attribute.
         *
         * A shape is used to impose a particular ink and logical
         * rectangle on the result of shaping a particular glyph.
         * This might be used, for instance, for embedding a picture
         * or a widget inside a `PangoLayout`.
         *
         * @param inkRect ink rectangle to assign to each character
         * @param logicalRect logical rectangle to assign to each character
         * @return the newly allocated
         *   `PangoAttribute`, which should be freed with
         *   [method@Pango.Attribute.destroy]
         */
        public fun new(
            inkRect: Rectangle,
            logicalRect: Rectangle,
        ): Attribute =
            pango_attr_shape_new(inkRect.pangoRectanglePointer, logicalRect.pangoRectanglePointer)!!.run {
                Attribute(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AttrShape = AttrShape(pointer.reinterpret())
    }
}
