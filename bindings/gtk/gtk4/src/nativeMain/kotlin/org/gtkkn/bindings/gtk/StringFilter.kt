// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkStringFilter
import org.gtkkn.native.gtk.gtk_string_filter_get_expression
import org.gtkkn.native.gtk.gtk_string_filter_get_ignore_case
import org.gtkkn.native.gtk.gtk_string_filter_get_match_mode
import org.gtkkn.native.gtk.gtk_string_filter_get_search
import org.gtkkn.native.gtk.gtk_string_filter_get_type
import org.gtkkn.native.gtk.gtk_string_filter_new
import org.gtkkn.native.gtk.gtk_string_filter_set_expression
import org.gtkkn.native.gtk.gtk_string_filter_set_ignore_case
import org.gtkkn.native.gtk.gtk_string_filter_set_match_mode
import org.gtkkn.native.gtk.gtk_string_filter_set_search
import kotlin.Boolean
import kotlin.String

/**
 * `GtkStringFilter` determines whether to include items by comparing
 * strings to a fixed search term.
 *
 * The strings are obtained from the items by evaluating a `GtkExpression`
 * set with [method@Gtk.StringFilter.set_expression], and they are
 * compared against a search term set with [method@Gtk.StringFilter.set_search].
 *
 * `GtkStringFilter` has several different modes of comparison - it
 * can match the whole string, just a prefix, or any substring. Use
 * [method@Gtk.StringFilter.set_match_mode] choose a mode.
 *
 * It is also possible to make case-insensitive comparisons, with
 * [method@Gtk.StringFilter.set_ignore_case].
 */
public open class StringFilter(public val gtkStringFilterPointer: CPointer<GtkStringFilter>) :
    Filter(gtkStringFilterPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * The expression to evaluate on item to get a string to compare with.
     */
    public open var expression: Expression?
        /**
         * Gets the expression that the string filter uses to
         * obtain strings from items.
         *
         * @return a `GtkExpression`
         */
        get() = gtk_string_filter_get_expression(gtkStringFilterPointer)?.run {
            Expression.ExpressionImpl(this)
        }

        /**
         * Sets the expression that the string filter uses to
         * obtain strings from items.
         *
         * The expression must have a value type of %G_TYPE_STRING.
         *
         * @param expression a `GtkExpression`
         */
        set(expression) = gtk_string_filter_set_expression(gtkStringFilterPointer, expression?.gtkExpressionPointer)

    /**
     * If matching is case sensitive.
     */
    public open var ignoreCase: Boolean
        /**
         * Returns whether the filter ignores case differences.
         *
         * @return true if the filter ignores case
         */
        get() = gtk_string_filter_get_ignore_case(gtkStringFilterPointer).asBoolean()

        /**
         * Sets whether the filter ignores case differences.
         *
         * @param ignoreCase true to ignore case
         */
        set(ignoreCase) = gtk_string_filter_set_ignore_case(gtkStringFilterPointer, ignoreCase.asGBoolean())

    /**
     * If exact matches are necessary or if substrings are allowed.
     */
    public open var matchMode: StringFilterMatchMode
        /**
         * Returns the match mode that the filter is using.
         *
         * @return the match mode of the filter
         */
        get() = gtk_string_filter_get_match_mode(gtkStringFilterPointer).run {
            StringFilterMatchMode.fromNativeValue(this)
        }

        /**
         * Sets the match mode for the filter.
         *
         * @param mode the new match mode
         */
        set(mode) = gtk_string_filter_set_match_mode(gtkStringFilterPointer, mode.nativeValue)

    /**
     * The search term.
     */
    public open var search: String?
        /**
         * Gets the search term.
         *
         * @return The search term
         */
        get() = gtk_string_filter_get_search(gtkStringFilterPointer)?.toKString()

        /**
         * Sets the string to search for.
         *
         * @param search The string to search for
         *   or null to clear the search
         */
        set(search) = gtk_string_filter_set_search(gtkStringFilterPointer, search)

    /**
     * Creates a new string filter.
     *
     * You will want to set up the filter by providing a string to search for
     * and by providing a property to look up on the item.
     *
     * @param expression The expression to evaluate
     * @return a new `GtkStringFilter`
     */
    public constructor(
        expression: Expression? = null,
    ) : this(gtk_string_filter_new(expression?.gtkExpressionPointer)!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<StringFilter> {
        override val type: GeneratedClassKGType<StringFilter> =
            GeneratedClassKGType(getTypeOrNull()!!) { StringFilter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of StringFilter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_string_filter_get_type()

        /**
         * Gets the GType of from the symbol `gtk_string_filter_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_string_filter_get_type")
    }
}
