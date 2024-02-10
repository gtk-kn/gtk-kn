// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkBoolFilter
import org.gtkkn.native.gtk.gtk_bool_filter_get_expression
import org.gtkkn.native.gtk.gtk_bool_filter_get_invert
import org.gtkkn.native.gtk.gtk_bool_filter_get_type
import org.gtkkn.native.gtk.gtk_bool_filter_new
import org.gtkkn.native.gtk.gtk_bool_filter_set_expression
import org.gtkkn.native.gtk.gtk_bool_filter_set_invert
import kotlin.Boolean
import kotlin.Unit

/**
 * `GtkBoolFilter` evaluates a boolean `GtkExpression`
 * to determine whether to include items.
 */
public open class BoolFilter(
    pointer: CPointer<GtkBoolFilter>,
) : Filter(pointer.reinterpret()), KGTyped {
    public val gtkBoolFilterPointer: CPointer<GtkBoolFilter>
        get() = gPointer.reinterpret()

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
        get() =
            gtk_bool_filter_get_expression(gtkBoolFilterPointer.reinterpret())?.run {
                Expression(reinterpret())
            }

        /**
         * Sets the expression that the filter uses to check if items
         * should be filtered.
         *
         * The expression must have a value type of %G_TYPE_BOOLEAN.
         *
         * @param expression a `GtkExpression`
         */
        set(expression) =
            gtk_bool_filter_set_expression(
                gtkBoolFilterPointer.reinterpret(),
                expression?.gPointer?.reinterpret()
            )

    /**
     * If the expression result should be inverted.
     */
    public open var invert: Boolean
        /**
         * Returns whether the filter inverts the expression.
         *
         * @return true if the filter inverts
         */
        get() = gtk_bool_filter_get_invert(gtkBoolFilterPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the filter should invert the expression.
         *
         * @param invert true to invert
         */
        set(invert) =
            gtk_bool_filter_set_invert(
                gtkBoolFilterPointer.reinterpret(),
                invert.asGBoolean()
            )

    /**
     * Creates a new bool filter.
     *
     * @param expression The expression to evaluate
     * @return a new `GtkBoolFilter`
     */
    public constructor(expression: Expression? = null) :
        this(gtk_bool_filter_new(expression?.gPointer?.reinterpret())!!.reinterpret())

    /**
     * Gets the expression that the filter uses to evaluate if
     * an item should be filtered.
     *
     * @return a `GtkExpression`
     */
    public open fun getExpression(): Expression? =
        gtk_bool_filter_get_expression(gtkBoolFilterPointer.reinterpret())?.run {
            Expression(reinterpret())
        }

    /**
     * Returns whether the filter inverts the expression.
     *
     * @return true if the filter inverts
     */
    public open fun getInvert(): Boolean = gtk_bool_filter_get_invert(gtkBoolFilterPointer.reinterpret()).asBoolean()

    /**
     * Sets the expression that the filter uses to check if items
     * should be filtered.
     *
     * The expression must have a value type of %G_TYPE_BOOLEAN.
     *
     * @param expression a `GtkExpression`
     */
    public open fun setExpression(expression: Expression? = null): Unit =
        gtk_bool_filter_set_expression(
            gtkBoolFilterPointer.reinterpret(),
            expression?.gPointer?.reinterpret()
        )

    /**
     * Sets whether the filter should invert the expression.
     *
     * @param invert true to invert
     */
    public open fun setInvert(invert: Boolean): Unit =
        gtk_bool_filter_set_invert(gtkBoolFilterPointer.reinterpret(), invert.asGBoolean())

    public companion object : TypeCompanion<BoolFilter> {
        override val type: GeneratedClassKGType<BoolFilter> =
            GeneratedClassKGType(gtk_bool_filter_get_type()) { BoolFilter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
