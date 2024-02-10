// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkStringSorter
import org.gtkkn.native.gtk.gtk_string_sorter_get_expression
import org.gtkkn.native.gtk.gtk_string_sorter_get_ignore_case
import org.gtkkn.native.gtk.gtk_string_sorter_get_type
import org.gtkkn.native.gtk.gtk_string_sorter_new
import org.gtkkn.native.gtk.gtk_string_sorter_set_expression
import org.gtkkn.native.gtk.gtk_string_sorter_set_ignore_case
import kotlin.Boolean
import kotlin.Unit

/**
 * `GtkStringSorter` is a `GtkSorter` that compares strings.
 *
 * It does the comparison in a linguistically correct way using the
 * current locale by normalizing Unicode strings and possibly case-folding
 * them before performing the comparison.
 *
 * To obtain the strings to compare, this sorter evaluates a
 * [class@Gtk.Expression].
 */
public open class StringSorter(
    pointer: CPointer<GtkStringSorter>,
) : Sorter(pointer.reinterpret()), KGTyped {
    public val gtkStringSorterPointer: CPointer<GtkStringSorter>
        get() = gPointer.reinterpret()

    /**
     * The expression to evaluate on item to get a string to compare with.
     */
    public open var expression: Expression?
        /**
         * Gets the expression that is evaluated to obtain strings from items.
         *
         * @return a `GtkExpression`
         */
        get() =
            gtk_string_sorter_get_expression(gtkStringSorterPointer.reinterpret())?.run {
                Expression(reinterpret())
            }

        /**
         * Sets the expression that is evaluated to obtain strings from items.
         *
         * The expression must have the type %G_TYPE_STRING.
         *
         * @param expression a `GtkExpression`
         */
        set(expression) =
            gtk_string_sorter_set_expression(
                gtkStringSorterPointer.reinterpret(),
                expression?.gPointer?.reinterpret()
            )

    /**
     * If matching is case sensitive.
     */
    public open var ignoreCase: Boolean
        /**
         * Gets whether the sorter ignores case differences.
         *
         * @return true if @self is ignoring case differences
         */
        get() = gtk_string_sorter_get_ignore_case(gtkStringSorterPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the sorter will ignore case differences.
         *
         * @param ignoreCase true to ignore case differences
         */
        set(ignoreCase) =
            gtk_string_sorter_set_ignore_case(
                gtkStringSorterPointer.reinterpret(),
                ignoreCase.asGBoolean()
            )

    /**
     * Creates a new string sorter that compares items using the given
     * @expression.
     *
     * Unless an expression is set on it, this sorter will always
     * compare items as invalid.
     *
     * @param expression The expression to evaluate
     * @return a new `GtkStringSorter`
     */
    public constructor(expression: Expression? = null) :
        this(gtk_string_sorter_new(expression?.gPointer?.reinterpret())!!.reinterpret())

    /**
     * Gets the expression that is evaluated to obtain strings from items.
     *
     * @return a `GtkExpression`
     */
    public open fun getExpression(): Expression? =
        gtk_string_sorter_get_expression(gtkStringSorterPointer.reinterpret())?.run {
            Expression(reinterpret())
        }

    /**
     * Gets whether the sorter ignores case differences.
     *
     * @return true if @self is ignoring case differences
     */
    public open fun getIgnoreCase(): Boolean =
        gtk_string_sorter_get_ignore_case(gtkStringSorterPointer.reinterpret()).asBoolean()

    /**
     * Sets the expression that is evaluated to obtain strings from items.
     *
     * The expression must have the type %G_TYPE_STRING.
     *
     * @param expression a `GtkExpression`
     */
    public open fun setExpression(expression: Expression? = null): Unit =
        gtk_string_sorter_set_expression(
            gtkStringSorterPointer.reinterpret(),
            expression?.gPointer?.reinterpret()
        )

    /**
     * Sets whether the sorter will ignore case differences.
     *
     * @param ignoreCase true to ignore case differences
     */
    public open fun setIgnoreCase(ignoreCase: Boolean): Unit =
        gtk_string_sorter_set_ignore_case(
            gtkStringSorterPointer.reinterpret(),
            ignoreCase.asGBoolean()
        )

    public companion object : TypeCompanion<StringSorter> {
        override val type: GeneratedClassKGType<StringSorter> =
            GeneratedClassKGType(gtk_string_sorter_get_type()) {
                StringSorter(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
