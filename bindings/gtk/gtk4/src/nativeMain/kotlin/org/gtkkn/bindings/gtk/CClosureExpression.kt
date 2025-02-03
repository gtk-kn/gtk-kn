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
import org.gtkkn.native.gtk.GtkCClosureExpression
import org.gtkkn.native.gtk.gtk_cclosure_expression_get_type

/**
 * A variant of `GtkClosureExpression` using a C closure.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `marshal`: GObject.ClosureMarshal
 */
public open class CClosureExpression(public val gtkCClosureExpressionPointer: CPointer<GtkCClosureExpression>) :
    Expression(gtkCClosureExpressionPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    public companion object : TypeCompanion<CClosureExpression> {
        override val type: GeneratedClassKGType<CClosureExpression> =
            GeneratedClassKGType(getTypeOrNull()!!) { CClosureExpression(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CClosureExpression
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cclosure_expression_get_type()

        /**
         * Gets the GType of from the symbol `gtk_cclosure_expression_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_cclosure_expression_get_type")
    }
}
