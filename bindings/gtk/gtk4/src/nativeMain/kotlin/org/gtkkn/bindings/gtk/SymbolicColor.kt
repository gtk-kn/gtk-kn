// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_6
import org.gtkkn.native.gtk.GtkSymbolicColor

/**
 * The indexes of colors passed to symbolic color rendering, such as
 * [vfunc@Gtk.SymbolicPaintable.snapshot_symbolic].
 *
 * More values may be added over time.
 * @since 4.6
 */
@GtkVersion4_6
public enum class SymbolicColor(
    public val nativeValue: GtkSymbolicColor,
) {
    /**
     * The default foreground color
     */
    FOREGROUND(GtkSymbolicColor.GTK_SYMBOLIC_COLOR_FOREGROUND),

    /**
     * Indication color for errors
     */
    ERROR(GtkSymbolicColor.GTK_SYMBOLIC_COLOR_ERROR),

    /**
     * Indication color for warnings
     */
    WARNING(GtkSymbolicColor.GTK_SYMBOLIC_COLOR_WARNING),

    /**
     * Indication color for success
     */
    SUCCESS(GtkSymbolicColor.GTK_SYMBOLIC_COLOR_SUCCESS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSymbolicColor): SymbolicColor =
            when (nativeValue) {
                GtkSymbolicColor.GTK_SYMBOLIC_COLOR_FOREGROUND -> FOREGROUND
                GtkSymbolicColor.GTK_SYMBOLIC_COLOR_ERROR -> ERROR
                GtkSymbolicColor.GTK_SYMBOLIC_COLOR_WARNING -> WARNING
                GtkSymbolicColor.GTK_SYMBOLIC_COLOR_SUCCESS -> SUCCESS
                else -> error("invalid nativeValue")
            }
    }
}
