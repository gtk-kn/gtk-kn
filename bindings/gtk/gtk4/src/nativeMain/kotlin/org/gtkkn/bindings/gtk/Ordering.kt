// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkOrdering
import org.gtkkn.native.gtk.GtkOrdering.GTK_ORDERING_EQUAL
import org.gtkkn.native.gtk.GtkOrdering.GTK_ORDERING_LARGER
import org.gtkkn.native.gtk.GtkOrdering.GTK_ORDERING_SMALLER

/**
 * Describes the way two values can be compared.
 *
 * These values can be used with a [callback@GLib.CompareFunc]. However,
 * a `GCompareFunc` is allowed to return any integer values.
 * For converting such a value to a `GtkOrdering` value, use
 * [func@Gtk.Ordering.from_cmpfunc].
 */
public enum class Ordering(
    public val nativeValue: GtkOrdering,
) {
    /**
     * the first value is smaller than the second
     */
    SMALLER(GTK_ORDERING_SMALLER),

    /**
     * the two values are equal
     */
    EQUAL(GTK_ORDERING_EQUAL),

    /**
     * the first value is larger than the second
     */
    LARGER(GTK_ORDERING_LARGER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkOrdering): Ordering =
            when (nativeValue) {
                GTK_ORDERING_SMALLER -> SMALLER
                GTK_ORDERING_EQUAL -> EQUAL
                GTK_ORDERING_LARGER -> LARGER
                else -> error("invalid nativeValue")
            }
    }
}
