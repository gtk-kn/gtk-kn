// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkExpressionWatch
import org.gtkkn.native.gtk.gtk_expression_watch_evaluate
import org.gtkkn.native.gtk.gtk_expression_watch_get_type
import org.gtkkn.native.gtk.gtk_expression_watch_ref
import org.gtkkn.native.gtk.gtk_expression_watch_unref
import org.gtkkn.native.gtk.gtk_expression_watch_unwatch
import kotlin.Boolean
import kotlin.Unit

/**
 * An opaque structure representing a watched `GtkExpression`.
 *
 * The contents of `GtkExpressionWatch` should only be accessed through the
 * provided API.
 */
public class ExpressionWatch(public val gtkExpressionWatchPointer: CPointer<GtkExpressionWatch>) :
    ProxyInstance(gtkExpressionWatchPointer) {
    /**
     * Evaluates the watched expression and on success stores the result
     * in `value`.
     *
     * This is equivalent to calling [method@Gtk.Expression.evaluate] with the
     * expression and this pointer originally used to create `watch`.
     *
     * @param value an empty `GValue` to be set
     * @return `TRUE` if the expression could be evaluated and `value` was set
     */
    public fun evaluate(`value`: Value): Boolean =
        gtk_expression_watch_evaluate(gtkExpressionWatchPointer, `value`.gobjectValuePointer).asBoolean()

    /**
     * Acquires a reference on the given `GtkExpressionWatch`.
     *
     * @return the `GtkExpressionWatch` with an additional reference
     */
    public fun ref(): ExpressionWatch = gtk_expression_watch_ref(gtkExpressionWatchPointer)!!.run {
        ExpressionWatch(this)
    }

    /**
     * Releases a reference on the given `GtkExpressionWatch`.
     *
     * If the reference was the last, the resources associated to `self` are
     * freed.
     */
    public fun unref(): Unit = gtk_expression_watch_unref(gtkExpressionWatchPointer)

    /**
     * Stops watching an expression.
     *
     * See [method@Gtk.Expression.watch] for how the watch
     * was established.
     */
    public fun unwatch(): Unit = gtk_expression_watch_unwatch(gtkExpressionWatchPointer)

    public companion object {
        /**
         * Get the GType of ExpressionWatch
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_expression_watch_get_type()
    }
}
