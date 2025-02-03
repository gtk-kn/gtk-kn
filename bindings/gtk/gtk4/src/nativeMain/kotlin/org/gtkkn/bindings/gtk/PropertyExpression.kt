// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.ParamSpec
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPropertyExpression
import org.gtkkn.native.gtk.gtk_expression_unref
import org.gtkkn.native.gtk.gtk_property_expression_get_expression
import org.gtkkn.native.gtk.gtk_property_expression_get_pspec
import org.gtkkn.native.gtk.gtk_property_expression_get_type
import org.gtkkn.native.gtk.gtk_property_expression_new
import org.gtkkn.native.gtk.gtk_property_expression_new_for_pspec
import kotlin.String

/**
 * A `GObject` property value in a `GtkExpression`.
 */
public open class PropertyExpression(public val gtkPropertyExpressionPointer: CPointer<GtkPropertyExpression>) :
    Expression(gtkPropertyExpressionPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Creates an expression that looks up a property.
     *
     * The object to use is found by evaluating the `expression`,
     * or using the `this` argument when `expression` is `NULL`.
     *
     * If the resulting object conforms to `this_type`, its property named
     * `property_name` will be queried. Otherwise, this expression's
     * evaluation will fail.
     *
     * The given `this_type` must have a property with `property_name`.
     *
     * @param thisType The type to expect for the this type
     * @param expression Expression to
     *   evaluate to get the object to query or `NULL` to
     *   query the `this` object
     * @param propertyName name of the property
     * @return a new `GtkExpression`
     */
    public constructor(
        thisType: GType,
        expression: Expression? = null,
        propertyName: String,
    ) : this(gtk_property_expression_new(thisType, expression?.gtkExpressionPointer, propertyName)!!.reinterpret()) {
        MemoryCleaner.setFreeFunc(this, owned = true) { gtk_expression_unref(it.reinterpret()) }
    }

    /**
     * Creates an expression that looks up a property.
     *
     * The object to use is found by evaluating the `expression`,
     * or using the `this` argument when `expression` is `NULL`.
     *
     * If the resulting object conforms to `this_type`, its
     * property specified by `pspec` will be queried.
     * Otherwise, this expression's evaluation will fail.
     *
     * @param expression Expression to
     *   evaluate to get the object to query or `NULL` to
     *   query the `this` object
     * @param pspec the `GParamSpec` for the property to query
     * @return a new `GtkExpression`
     */
    public constructor(
        expression: Expression? = null,
        pspec: ParamSpec,
    ) : this(
        gtk_property_expression_new_for_pspec(
            expression?.gtkExpressionPointer,
            pspec.gobjectParamSpecPointer
        )!!.reinterpret()
    ) {
        MemoryCleaner.setFreeFunc(this, owned = true) { gtk_expression_unref(it.reinterpret()) }
    }

    /**
     * Gets the expression specifying the object of
     * a property expression.
     *
     * @return the object expression
     */
    public open fun getExpression(): Expression? =
        gtk_property_expression_get_expression(gtkPropertyExpressionPointer.reinterpret())?.run {
            Expression.ExpressionImpl(this)
        }

    /**
     * Gets the `GParamSpec` specifying the property of
     * a property expression.
     *
     * @return the `GParamSpec` for the property
     */
    public open fun getPspec(): ParamSpec =
        gtk_property_expression_get_pspec(gtkPropertyExpressionPointer.reinterpret())!!.run {
            ParamSpec.ParamSpecImpl(this)
        }

    public companion object : TypeCompanion<PropertyExpression> {
        override val type: GeneratedClassKGType<PropertyExpression> =
            GeneratedClassKGType(getTypeOrNull()!!) { PropertyExpression(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of PropertyExpression
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_property_expression_get_type()

        /**
         * Gets the GType of from the symbol `gtk_property_expression_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_property_expression_get_type")
    }
}
