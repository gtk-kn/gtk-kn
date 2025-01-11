// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkConstraint
import org.gtkkn.native.gtk.gtk_constraint_get_constant
import org.gtkkn.native.gtk.gtk_constraint_get_multiplier
import org.gtkkn.native.gtk.gtk_constraint_get_relation
import org.gtkkn.native.gtk.gtk_constraint_get_source
import org.gtkkn.native.gtk.gtk_constraint_get_source_attribute
import org.gtkkn.native.gtk.gtk_constraint_get_strength
import org.gtkkn.native.gtk.gtk_constraint_get_target
import org.gtkkn.native.gtk.gtk_constraint_get_target_attribute
import org.gtkkn.native.gtk.gtk_constraint_get_type
import org.gtkkn.native.gtk.gtk_constraint_is_attached
import org.gtkkn.native.gtk.gtk_constraint_is_constant
import org.gtkkn.native.gtk.gtk_constraint_is_required
import org.gtkkn.native.gtk.gtk_constraint_new
import org.gtkkn.native.gtk.gtk_constraint_new_constant
import kotlin.Boolean

/**
 * `GtkConstraint` describes a constraint between attributes of two widgets,
 *  expressed as a linear equation.
 *
 * The typical equation for a constraint is:
 *
 * ```
 *   target.target_attr = source.source_attr × multiplier + constant
 * ```
 *
 * Each `GtkConstraint` is part of a system that will be solved by a
 * [class@Gtk.ConstraintLayout] in order to allocate and position each
 * child widget or guide.
 *
 * The source and target, as well as their attributes, of a `GtkConstraint`
 * instance are immutable after creation.
 */
public open class Constraint(public val gtkConstraintPointer: CPointer<GtkConstraint>) :
    Object(gtkConstraintPointer.reinterpret()),
    KGTyped {
    /**
     * The constant value to be added to the [property@Gtk.Constraint:source-attribute].
     */
    public open val constant: gdouble
        /**
         * Retrieves the constant factor added to the source attributes' value.
         *
         * @return a constant factor
         */
        get() = gtk_constraint_get_constant(gtkConstraintPointer)

    /**
     * The multiplication factor to be applied to
     * the [property@Gtk.Constraint:source-attribute].
     */
    public open val multiplier: gdouble
        /**
         * Retrieves the multiplication factor applied to the source
         * attribute's value.
         *
         * @return a multiplication factor
         */
        get() = gtk_constraint_get_multiplier(gtkConstraintPointer)

    /**
     * The order relation between the terms of the constraint.
     */
    public open val relation: ConstraintRelation
        /**
         * The order relation between the terms of the constraint.
         *
         * @return a relation type
         */
        get() = gtk_constraint_get_relation(gtkConstraintPointer).run {
            ConstraintRelation.fromNativeValue(this)
        }

    /**
     * The source of the constraint.
     *
     * The constraint will set the [property@Gtk.Constraint:target-attribute]
     * property of the target using the [property@Gtk.Constraint:source-attribute]
     * property of the source.
     */
    public open val source: ConstraintTarget?
        /**
         * Retrieves the [iface@Gtk.ConstraintTarget] used as the source for the
         * constraint.
         *
         * If the source is set to `NULL` at creation, the constraint will use
         * the widget using the [class@Gtk.ConstraintLayout] as the source.
         *
         * @return the source of the constraint
         */
        get() = gtk_constraint_get_source(gtkConstraintPointer)?.run {
            ConstraintTarget.ConstraintTargetImpl(reinterpret())
        }

    /**
     * The attribute of the [property@Gtk.Constraint:source] read by the
     * constraint.
     */
    public open val sourceAttribute: ConstraintAttribute
        /**
         * Retrieves the attribute of the source to be read by the constraint.
         *
         * @return the source's attribute
         */
        get() = gtk_constraint_get_source_attribute(gtkConstraintPointer).run {
            ConstraintAttribute.fromNativeValue(this)
        }

    /**
     * The strength of the constraint.
     *
     * The strength can be expressed either using one of the symbolic values
     * of the [enum@Gtk.ConstraintStrength] enumeration, or any positive integer
     * value.
     */
    public open val strength: gint
        /**
         * Retrieves the strength of the constraint.
         *
         * @return the strength value
         */
        get() = gtk_constraint_get_strength(gtkConstraintPointer)

    /**
     * The target of the constraint.
     *
     * The constraint will set the [property@Gtk.Constraint:target-attribute]
     * property of the target using the [property@Gtk.Constraint:source-attribute]
     * property of the source widget.
     */
    public open val target: ConstraintTarget?
        /**
         * Retrieves the [iface@Gtk.ConstraintTarget] used as the target for
         * the constraint.
         *
         * If the targe is set to `NULL` at creation, the constraint will use
         * the widget using the [class@Gtk.ConstraintLayout] as the target.
         *
         * @return a `GtkConstraintTarget`
         */
        get() = gtk_constraint_get_target(gtkConstraintPointer)?.run {
            ConstraintTarget.ConstraintTargetImpl(reinterpret())
        }

    /**
     * The attribute of the [property@Gtk.Constraint:target] set by the constraint.
     */
    public open val targetAttribute: ConstraintAttribute
        /**
         * Retrieves the attribute of the target to be set by the constraint.
         *
         * @return the target's attribute
         */
        get() = gtk_constraint_get_target_attribute(gtkConstraintPointer).run {
            ConstraintAttribute.fromNativeValue(this)
        }

    /**
     * Creates a new constraint representing a relation between a layout
     * attribute on a source and a layout attribute on a target.
     *
     * @param target the target of the constraint
     * @param targetAttribute the attribute of `target` to be set
     * @param relation the relation equivalence between `target_attribute` and `source_attribute`
     * @param source the source of the constraint
     * @param sourceAttribute the attribute of `source` to be read
     * @param multiplier a multiplication factor to be applied to `source_attribute`
     * @param constant a constant factor to be added to `source_attribute`
     * @param strength the strength of the constraint
     * @return the newly created constraint
     */
    public constructor(
        target: ConstraintTarget? = null,
        targetAttribute: ConstraintAttribute,
        relation: ConstraintRelation,
        source: ConstraintTarget? = null,
        sourceAttribute: ConstraintAttribute,
        multiplier: gdouble,
        constant: gdouble,
        strength: gint,
    ) : this(
        gtk_constraint_new(
            target?.gtkConstraintTargetPointer,
            targetAttribute.nativeValue,
            relation.nativeValue,
            source?.gtkConstraintTargetPointer,
            sourceAttribute.nativeValue,
            multiplier,
            constant,
            strength
        )!!.reinterpret()
    )

    /**
     * Creates a new constraint representing a relation between a layout
     * attribute on a target and a constant value.
     *
     * @param target a the target of the constraint
     * @param targetAttribute the attribute of `target` to be set
     * @param relation the relation equivalence between `target_attribute` and `constant`
     * @param constant a constant factor to be set on `target_attribute`
     * @param strength the strength of the constraint
     * @return the newly created constraint
     */
    public constructor(
        target: ConstraintTarget? = null,
        targetAttribute: ConstraintAttribute,
        relation: ConstraintRelation,
        constant: gdouble,
        strength: gint,
    ) : this(
        gtk_constraint_new_constant(
            target?.gtkConstraintTargetPointer,
            targetAttribute.nativeValue,
            relation.nativeValue,
            constant,
            strength
        )!!.reinterpret()
    )

    /**
     * Checks whether the constraint is attached to a [class@Gtk.ConstraintLayout],
     * and it is contributing to the layout.
     *
     * @return `TRUE` if the constraint is attached
     */
    public open fun isAttached(): Boolean = gtk_constraint_is_attached(gtkConstraintPointer).asBoolean()

    /**
     * Checks whether the constraint describes a relation between an attribute
     * on the [property@Gtk.Constraint:target] and a constant value.
     *
     * @return `TRUE` if the constraint is a constant relation
     */
    public open fun isConstant(): Boolean = gtk_constraint_is_constant(gtkConstraintPointer).asBoolean()

    /**
     * Checks whether the constraint is a required relation for solving the
     * constraint layout.
     *
     * @return true if the constraint is required
     */
    public open fun isRequired(): Boolean = gtk_constraint_is_required(gtkConstraintPointer).asBoolean()

    public companion object : TypeCompanion<Constraint> {
        override val type: GeneratedClassKGType<Constraint> =
            GeneratedClassKGType(gtk_constraint_get_type()) { Constraint(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Constraint
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_constraint_get_type()
    }
}
