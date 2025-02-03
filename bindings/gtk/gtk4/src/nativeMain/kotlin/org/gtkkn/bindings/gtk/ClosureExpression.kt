// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkClosureExpression
import org.gtkkn.native.gtk.gtk_closure_expression_get_type

/**
 * An expression using a custom `GClosure` to compute the value from
 * its parameters.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `params`: Array parameter of type Expression is not supported
 */
public open class ClosureExpression(public val gtkClosureExpressionPointer: CPointer<GtkClosureExpression>) :
    Expression(gtkClosureExpressionPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    public companion object : TypeCompanion<ClosureExpression> {
        override val type: GeneratedClassKGType<ClosureExpression> =
            GeneratedClassKGType(getTypeOrNull()!!) { ClosureExpression(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ClosureExpression
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_closure_expression_get_type()

        /**
         * Gets the GType of from the symbol `gtk_closure_expression_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_closure_expression_get_type")
    }
}
