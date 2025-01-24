// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBoolFilter
import org.gtkkn.native.gtk.gtk_bool_filter_get_expression
import org.gtkkn.native.gtk.gtk_bool_filter_get_invert
import org.gtkkn.native.gtk.gtk_bool_filter_get_type
import org.gtkkn.native.gtk.gtk_bool_filter_new
import org.gtkkn.native.gtk.gtk_bool_filter_set_expression
import org.gtkkn.native.gtk.gtk_bool_filter_set_invert
import kotlin.Boolean

/**
 * `GtkBoolFilter` evaluates a boolean `GtkExpression`
 * to determine whether to include items.
 */
public open class BoolFilter(public val gtkBoolFilterPointer: CPointer<GtkBoolFilter>) :
    Filter(gtkBoolFilterPointer.reinterpret()),
    KGTyped {
    /**
     * The boolean expression to evaluate on item.
     */
    public open var expression: Expression?
        /**
         * Gets the expression that the filter uses to evaluate if
         * an item should be filtered.
         *
         * @return a `GtkExpression`
         */
        get() = gtk_bool_filter_get_expression(gtkBoolFilterPointer)?.run {
            Expression.ExpressionImpl(this)
        }

        /**
         * Sets the expression that the filter uses to check if items
         * should be filtered.
         *
         * The expression must have a value type of %G_TYPE_BOOLEAN.
         *
         * @param expression a `GtkExpression`
         */
        set(expression) = gtk_bool_filter_set_expression(gtkBoolFilterPointer, expression?.gtkExpressionPointer)

    /**
     * If the expression result should be inverted.
     */
    public open var invert: Boolean
        /**
         * Returns whether the filter inverts the expression.
         *
         * @return true if the filter inverts
         */
        get() = gtk_bool_filter_get_invert(gtkBoolFilterPointer).asBoolean()

        /**
         * Sets whether the filter should invert the expression.
         *
         * @param invert true to invert
         */
        set(invert) = gtk_bool_filter_set_invert(gtkBoolFilterPointer, invert.asGBoolean())

    /**
     * Creates a new bool filter.
     *
     * @param expression The expression to evaluate
     * @return a new `GtkBoolFilter`
     */
    public constructor(
        expression: Expression? = null,
    ) : this(gtk_bool_filter_new(expression?.gtkExpressionPointer)!!.reinterpret())

    public companion object : TypeCompanion<BoolFilter> {
        override val type: GeneratedClassKGType<BoolFilter> =
            GeneratedClassKGType(gtk_bool_filter_get_type()) { BoolFilter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of BoolFilter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_bool_filter_get_type()
    }
}
