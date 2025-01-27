// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
    public companion object : TypeCompanion<CClosureExpression> {
        override val type: GeneratedClassKGType<CClosureExpression> =
            GeneratedClassKGType(getTypeOrNull("gtk_cclosure_expression_get_type")!!) {
                CClosureExpression(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CClosureExpression
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cclosure_expression_get_type()
    }
}
