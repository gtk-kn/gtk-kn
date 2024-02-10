// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkConstraintRelation
import org.gtkkn.native.gtk.GtkConstraintRelation.GTK_CONSTRAINT_RELATION_EQ
import org.gtkkn.native.gtk.GtkConstraintRelation.GTK_CONSTRAINT_RELATION_GE
import org.gtkkn.native.gtk.GtkConstraintRelation.GTK_CONSTRAINT_RELATION_LE

/**
 * The relation between two terms of a constraint.
 */
public enum class ConstraintRelation(
    public val nativeValue: GtkConstraintRelation,
) {
    /**
     * Less than, or equal
     */
    LE(GTK_CONSTRAINT_RELATION_LE),

    /**
     * Equal
     */
    EQ(GTK_CONSTRAINT_RELATION_EQ),

    /**
     * Greater than, or equal
     */
    GE(GTK_CONSTRAINT_RELATION_GE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkConstraintRelation): ConstraintRelation =
            when (nativeValue) {
                GTK_CONSTRAINT_RELATION_LE -> LE
                GTK_CONSTRAINT_RELATION_EQ -> EQ
                GTK_CONSTRAINT_RELATION_GE -> GE
                else -> error("invalid nativeValue")
            }
    }
}
