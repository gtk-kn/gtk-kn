// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkConstraintRelation

/**
 * The relation between two terms of a constraint.
 */
public enum class ConstraintRelation(
    public val nativeValue: GtkConstraintRelation,
) {
    /**
     * Less than, or equal
     */
    LE(GtkConstraintRelation.GTK_CONSTRAINT_RELATION_LE),

    /**
     * Equal
     */
    EQ(GtkConstraintRelation.GTK_CONSTRAINT_RELATION_EQ),

    /**
     * Greater than, or equal
     */
    GE(GtkConstraintRelation.GTK_CONSTRAINT_RELATION_GE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkConstraintRelation): ConstraintRelation =
            when (nativeValue) {
                GtkConstraintRelation.GTK_CONSTRAINT_RELATION_LE -> LE
                GtkConstraintRelation.GTK_CONSTRAINT_RELATION_EQ -> EQ
                GtkConstraintRelation.GTK_CONSTRAINT_RELATION_GE -> GE
                else -> error("invalid nativeValue")
            }
    }
}
