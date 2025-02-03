// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.ParamSpec
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkParamSpecExpression
import org.gtkkn.native.gtk.gtk_param_expression_get_type

/**
 * A `GParamSpec` for properties holding a `GtkExpression`.
 */
public open class ParamSpecExpression(public val gtkParamSpecExpressionPointer: CPointer<GtkParamSpecExpression>) :
    ParamSpec(gtkParamSpecExpressionPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    public companion object : TypeCompanion<ParamSpecExpression> {
        override val type: GeneratedClassKGType<ParamSpecExpression> =
            GeneratedClassKGType(getTypeOrNull()!!) { ParamSpecExpression(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ParamSpecExpression
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_param_expression_get_type()

        /**
         * Gets the GType of from the symbol `gtk_param_expression_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_param_expression_get_type")
    }
}
