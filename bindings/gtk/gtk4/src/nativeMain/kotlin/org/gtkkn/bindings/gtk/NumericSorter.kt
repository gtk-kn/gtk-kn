// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkNumericSorter
import org.gtkkn.native.gtk.gtk_numeric_sorter_get_expression
import org.gtkkn.native.gtk.gtk_numeric_sorter_get_sort_order
import org.gtkkn.native.gtk.gtk_numeric_sorter_get_type
import org.gtkkn.native.gtk.gtk_numeric_sorter_new
import org.gtkkn.native.gtk.gtk_numeric_sorter_set_expression
import org.gtkkn.native.gtk.gtk_numeric_sorter_set_sort_order

/**
 * `GtkNumericSorter` is a `GtkSorter` that compares numbers.
 *
 * To obtain the numbers to compare, this sorter evaluates a
 * [class@Gtk.Expression].
 */
public open class NumericSorter(public val gtkNumericSorterPointer: CPointer<GtkNumericSorter>) :
    Sorter(gtkNumericSorterPointer.reinterpret()),
    KGTyped {
    /**
     * The expression to evaluate on items to get a number to compare with.
     */
    public open var expression: Expression?
        /**
         * Gets the expression that is evaluated to obtain numbers from items.
         *
         * @return a `GtkExpression`
         */
        get() = gtk_numeric_sorter_get_expression(gtkNumericSorterPointer)?.run {
            Expression.ExpressionImpl(this)
        }

        /**
         * Sets the expression that is evaluated to obtain numbers from items.
         *
         * Unless an expression is set on @self, the sorter will always
         * compare items as invalid.
         *
         * The expression must have a return type that can be compared
         * numerically, such as %G_TYPE_INT or %G_TYPE_DOUBLE.
         *
         * @param expression a `GtkExpression`
         */
        set(expression) = gtk_numeric_sorter_set_expression(gtkNumericSorterPointer, expression?.gtkExpressionPointer)

    /**
     * Whether the sorter will sort smaller numbers first.
     */
    public open var sortOrder: SortType
        /**
         * Gets whether this sorter will sort smaller numbers first.
         *
         * @return the order of the numbers
         */
        get() = gtk_numeric_sorter_get_sort_order(gtkNumericSorterPointer).run {
            SortType.fromNativeValue(this)
        }

        /**
         * Sets whether to sort smaller numbers before larger ones.
         *
         * @param sortOrder whether to sort smaller numbers first
         */
        set(sortOrder) = gtk_numeric_sorter_set_sort_order(gtkNumericSorterPointer, sortOrder.nativeValue)

    /**
     * Creates a new numeric sorter using the given @expression.
     *
     * Smaller numbers will be sorted first. You can call
     * [method@Gtk.NumericSorter.set_sort_order] to change this.
     *
     * @param expression The expression to evaluate
     * @return a new `GtkNumericSorter`
     */
    public constructor(
        expression: Expression? = null,
    ) : this(gtk_numeric_sorter_new(expression?.gtkExpressionPointer)!!.reinterpret())

    public companion object : TypeCompanion<NumericSorter> {
        override val type: GeneratedClassKGType<NumericSorter> =
            GeneratedClassKGType(gtk_numeric_sorter_get_type()) { NumericSorter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of NumericSorter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_numeric_sorter_get_type()
    }
}
