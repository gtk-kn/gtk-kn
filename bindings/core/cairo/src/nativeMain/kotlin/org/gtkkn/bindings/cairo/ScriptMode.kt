// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.bindings.cairo.annotations.CairoVersion1_12
import org.gtkkn.native.cairo.cairo_script_mode_t

/**
 *
 * @since 1.12
 */
@CairoVersion1_12
public enum class ScriptMode(public val nativeValue: cairo_script_mode_t) {
    ASCII(cairo_script_mode_t.CAIRO_SCRIPT_MODE_ASCII),
    BINARY(cairo_script_mode_t.CAIRO_SCRIPT_MODE_BINARY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_script_mode_t): ScriptMode = when (nativeValue) {
            cairo_script_mode_t.CAIRO_SCRIPT_MODE_ASCII -> ASCII
            cairo_script_mode_t.CAIRO_SCRIPT_MODE_BINARY -> BINARY
            else -> error("invalid nativeValue")
        }
    }
}
