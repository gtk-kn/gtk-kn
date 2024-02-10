// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkSymbolicColor
import org.gtkkn.native.gtk.GtkSymbolicColor.GTK_SYMBOLIC_COLOR_ERROR
import org.gtkkn.native.gtk.GtkSymbolicColor.GTK_SYMBOLIC_COLOR_FOREGROUND
import org.gtkkn.native.gtk.GtkSymbolicColor.GTK_SYMBOLIC_COLOR_SUCCESS
import org.gtkkn.native.gtk.GtkSymbolicColor.GTK_SYMBOLIC_COLOR_WARNING

/**
 * The indexes of colors passed to symbolic color rendering, such as
 * [vfunc@Gtk.SymbolicPaintable.snapshot_symbolic].
 *
 * More values may be added over time.
 * @since 4.6
 */
public enum class SymbolicColor(
    public val nativeValue: GtkSymbolicColor,
) {
    /**
     * The default foreground color
     */
    FOREGROUND(GTK_SYMBOLIC_COLOR_FOREGROUND),

    /**
     * Indication color for errors
     */
    ERROR(GTK_SYMBOLIC_COLOR_ERROR),

    /**
     * Indication color for warnings
     */
    WARNING(GTK_SYMBOLIC_COLOR_WARNING),

    /**
     * Indication color for success
     */
    SUCCESS(GTK_SYMBOLIC_COLOR_SUCCESS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSymbolicColor): SymbolicColor =
            when (nativeValue) {
                GTK_SYMBOLIC_COLOR_FOREGROUND -> FOREGROUND
                GTK_SYMBOLIC_COLOR_ERROR -> ERROR
                GTK_SYMBOLIC_COLOR_WARNING -> WARNING
                GTK_SYMBOLIC_COLOR_SUCCESS -> SUCCESS
                else -> error("invalid nativeValue")
            }
    }
}
