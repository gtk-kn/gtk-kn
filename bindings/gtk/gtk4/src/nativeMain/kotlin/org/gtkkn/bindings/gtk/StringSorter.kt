// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
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
public open class StringSorter(public val gtkStringSorterPointer: CPointer<GtkStringSorter>) :
    Sorter(gtkStringSorterPointer.reinterpret()),
    KGTyped {
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
    @GtkVersion4_10
    public open var collation: Collation
        /**
         * Gets which collation method the sorter uses.
         *
         * @return The collation method
         * @since 4.10
         */
        get() = gtk_string_sorter_get_collation(gtkStringSorterPointer).run {
            Collation.fromNativeValue(this)
        }

        /**
         * Sets the collation method to use for sorting.
         *
         * @param collation the collation method
         * @since 4.10
         */
        @GtkVersion4_10
        set(collation) = gtk_string_sorter_set_collation(gtkStringSorterPointer, collation.nativeValue)

    /**
     * The expression to evaluate on item to get a string to compare with.
     */
    public open var expression: Expression?
        /**
         * Gets the expression that is evaluated to obtain strings from items.
         *
         * @return a `GtkExpression`
         */
        get() = gtk_string_sorter_get_expression(gtkStringSorterPointer)?.run {
            Expression.ExpressionImpl(this)
        }

        /**
         * Sets the expression that is evaluated to obtain strings from items.
         *
         * The expression must have the type %G_TYPE_STRING.
         *
         * @param expression a `GtkExpression`
         */
        set(expression) = gtk_string_sorter_set_expression(gtkStringSorterPointer, expression?.gtkExpressionPointer)

    /**
     * If sorting is case sensitive.
     */
    public open var ignoreCase: Boolean
        /**
         * Gets whether the sorter ignores case differences.
         *
         * @return true if @self is ignoring case differences
         */
        get() = gtk_string_sorter_get_ignore_case(gtkStringSorterPointer).asBoolean()

        /**
         * Sets whether the sorter will ignore case differences.
         *
         * @param ignoreCase true to ignore case differences
         */
        set(ignoreCase) = gtk_string_sorter_set_ignore_case(gtkStringSorterPointer, ignoreCase.asGBoolean())

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
    ) : this(gtk_string_sorter_new(expression?.gtkExpressionPointer)!!.reinterpret())

    public companion object : TypeCompanion<StringSorter> {
        override val type: GeneratedClassKGType<StringSorter> =
            GeneratedClassKGType(getTypeOrNull("gtk_string_sorter_get_type")!!) { StringSorter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of StringSorter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_string_sorter_get_type()
    }
}
