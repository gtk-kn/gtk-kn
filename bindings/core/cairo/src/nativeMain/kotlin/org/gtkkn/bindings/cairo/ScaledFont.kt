// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.cairo.cairo_gobject_scaled_font_get_type
import org.gtkkn.native.cairo.cairo_scaled_font_t
import org.gtkkn.native.gobject.GType

public class ScaledFont(pointer: CPointer<cairo_scaled_font_t>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<cairo_scaled_font_t> = pointer

    public companion object {
        /**
         * Get the GType of ScaledFont
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_scaled_font_get_type()
    }
}
