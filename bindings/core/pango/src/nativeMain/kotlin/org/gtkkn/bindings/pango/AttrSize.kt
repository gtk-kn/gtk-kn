// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.pango.annotations.PangoVersion1_8
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAttrSize
import org.gtkkn.native.pango.pango_attr_size_new
import org.gtkkn.native.pango.pango_attr_size_new_absolute
import kotlin.Int
import kotlin.UInt

/**
 * The `PangoAttrSize` structure is used to represent attributes which
 * set font size.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Attribute
 */
public class AttrSize(
    pointer: CPointer<PangoAttrSize>,
) : Record {
    public val pangoAttrSizePointer: CPointer<PangoAttrSize> = pointer

    /**
     * size of font, in units of 1/%PANGO_SCALE of a point (for
     *   %PANGO_ATTR_SIZE) or of a device unit (for %PANGO_ATTR_ABSOLUTE_SIZE)
     */
    public var size: Int
        get() = pangoAttrSizePointer.pointed.size
        set(`value`) {
            pangoAttrSizePointer.pointed.size = value
        }

    /**
     * whether the font size is in device units or points.
     *   This field is only present for compatibility with Pango-1.8.0
     *   (%PANGO_ATTR_ABSOLUTE_SIZE was added in 1.8.1); and always will
     *   be false for %PANGO_ATTR_SIZE and true for %PANGO_ATTR_ABSOLUTE_SIZE.
     */
    public var absolute: UInt
        get() = pangoAttrSizePointer.pointed.absolute
        set(`value`) {
            pangoAttrSizePointer.pointed.absolute = value
        }

    public companion object : RecordCompanion<AttrSize, PangoAttrSize> {
        /**
         * Create a new font-size attribute in fractional points.
         *
         * @param size the font size, in %PANGO_SCALE-ths of a point
         * @return the newly allocated
         *   `PangoAttribute`, which should be freed with
         *   [method@Pango.Attribute.destroy]
         */
        public fun new(size: Int): Attribute =
            pango_attr_size_new(size)!!.run {
                Attribute(reinterpret())
            }

        /**
         * Create a new font-size attribute in device units.
         *
         * @param size the font size, in %PANGO_SCALE-ths of a device unit
         * @return the newly allocated
         *   `PangoAttribute`, which should be freed with
         *   [method@Pango.Attribute.destroy]
         * @since 1.8
         */
        @PangoVersion1_8
        public fun newAbsolute(size: Int): Attribute =
            pango_attr_size_new_absolute(size)!!.run {
                Attribute(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AttrSize = AttrSize(pointer.reinterpret())
    }
}
