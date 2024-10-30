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
import org.gtkkn.native.gtk.gtk_string_sorter_get_collation
import org.gtkkn.native.gtk.gtk_string_sorter_get_expression
import org.gtkkn.native.gtk.gtk_string_sorter_get_ignore_case
import org.gtkkn.native.gtk.gtk_string_sorter_get_type
import org.gtkkn.native.gtk.gtk_string_sorter_new
import org.gtkkn.native.gtk.gtk_string_sorter_set_collation
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
) : Sorter(pointer.reinterpret()),
    KGTyped {
    public val gtkStringSorterPointer: CPointer<GtkStringSorter>
        get() = gPointer.reinterpret()

    /**
     * The collation method to use for sorting.
     *
     * The `GTK_COLLATION_NONE` value is useful when the expression already
     * returns collation keys, or strings that need to be compared byte-by-byte.
     *
     * The default value, `GTK_COLLATION_UNICODE`, compares strings according
     * to the [Unicode collation algorithm](https://www.unicode.org/reports/tr10/).
     *
     * @since 4.10
     */
    public open var collation: Collation
        /**
         * Gets which collation method the sorter uses.
         *
         * @return The collation method
         * @since 4.10
         */
        get() =
            gtk_string_sorter_get_collation(gtkStringSorterPointer.reinterpret()).run {
                Collation.fromNativeValue(this)
            }

        /**
         * Sets the collation method to use for sorting.
         *
         * @param collation the collation method
         * @since 4.10
         */
        set(collation) = gtk_string_sorter_set_collation(gtkStringSorterPointer.reinterpret(), collation.nativeValue)

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
        set(
            expression
        ) = gtk_string_sorter_set_expression(gtkStringSorterPointer.reinterpret(), expression?.gPointer?.reinterpret())

    /**
     * If sorting is case sensitive.
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
        set(
            ignoreCase
        ) = gtk_string_sorter_set_ignore_case(gtkStringSorterPointer.reinterpret(), ignoreCase.asGBoolean())

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
    public constructor(
        expression: Expression? = null,
    ) : this(gtk_string_sorter_new(expression?.gPointer?.reinterpret())!!.reinterpret())

    /**
     * Gets which collation method the sorter uses.
     *
     * @return The collation method
     * @since 4.10
     */
    public open fun getCollation(): Collation =
        gtk_string_sorter_get_collation(gtkStringSorterPointer.reinterpret()).run {
            Collation.fromNativeValue(this)
        }

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
     * Sets the collation method to use for sorting.
     *
     * @param collation the collation method
     * @since 4.10
     */
    public open fun setCollation(collation: Collation): Unit =
        gtk_string_sorter_set_collation(gtkStringSorterPointer.reinterpret(), collation.nativeValue)

    /**
     * Sets the expression that is evaluated to obtain strings from items.
     *
     * The expression must have the type %G_TYPE_STRING.
     *
     * @param expression a `GtkExpression`
     */
    public open fun setExpression(expression: Expression? = null): Unit =
        gtk_string_sorter_set_expression(gtkStringSorterPointer.reinterpret(), expression?.gPointer?.reinterpret())

    /**
     * Sets whether the sorter will ignore case differences.
     *
     * @param ignoreCase true to ignore case differences
     */
    public open fun setIgnoreCase(ignoreCase: Boolean): Unit =
        gtk_string_sorter_set_ignore_case(gtkStringSorterPointer.reinterpret(), ignoreCase.asGBoolean())

    public companion object : TypeCompanion<StringSorter> {
        override val type: GeneratedClassKGType<StringSorter> =
            GeneratedClassKGType(gtk_string_sorter_get_type()) { StringSorter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
