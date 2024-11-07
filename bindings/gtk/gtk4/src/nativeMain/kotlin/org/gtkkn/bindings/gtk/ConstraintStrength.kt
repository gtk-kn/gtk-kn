// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkConstraintStrength

/**
 * The strength of a constraint, expressed as a symbolic constant.
 *
 * The strength of a [class@Constraint] can be expressed with any positive
 * integer; the values of this enumeration can be used for readability.
 */
public enum class ConstraintStrength(
    public val nativeValue: GtkConstraintStrength,
) {
    /**
     * The constraint is required towards solving the layout
     */
    REQUIRED(GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_REQUIRED),

    /**
     * A strong constraint
     */
    STRONG(GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_STRONG),

    /**
     * A medium constraint
     */
    MEDIUM(GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_MEDIUM),

    /**
     * A weak constraint
     */
    WEAK(GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_WEAK),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkConstraintStrength): ConstraintStrength =
            when (nativeValue) {
                GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_REQUIRED -> REQUIRED
                GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_STRONG -> STRONG
                GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_MEDIUM -> MEDIUM
                GtkConstraintStrength.GTK_CONSTRAINT_STRENGTH_WEAK -> WEAK
                else -> error("invalid nativeValue")
            }
    }
}
