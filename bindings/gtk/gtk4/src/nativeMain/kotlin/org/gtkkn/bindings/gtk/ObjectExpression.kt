// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkObjectExpression
import org.gtkkn.native.gtk.gtk_expression_unref
import org.gtkkn.native.gtk.gtk_object_expression_get_object
import org.gtkkn.native.gtk.gtk_object_expression_get_type
import org.gtkkn.native.gtk.gtk_object_expression_new

/**
 * A `GObject` value in a `GtkExpression`.
 */
public open class ObjectExpression(public val gtkObjectExpressionPointer: CPointer<GtkObjectExpression>) :
    Expression(gtkObjectExpressionPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Creates an expression evaluating to the given `object` with a weak reference.
     *
     * Once the `object` is disposed, it will fail to evaluate.
     *
     * This expression is meant to break reference cycles.
     *
     * If you want to keep a reference to `object`, use [ctor@Gtk.ConstantExpression.new].
     *
     * @param object object to watch
     * @return a new `GtkExpression`
     */
    public constructor(
        `object`: Object,
    ) : this(gtk_object_expression_new(`object`.gobjectObjectPointer)!!.reinterpret()) {
        MemoryCleaner.setFreeFunc(this, owned = true) { gtk_expression_unref(it.reinterpret()) }
    }

    /**
     * Gets the object that the expression evaluates to.
     *
     * @return the object, or `NULL`
     */
    public open fun getObject(): Object? =
        gtk_object_expression_get_object(gtkObjectExpressionPointer.reinterpret())?.run {
            InstanceCache.get(this, true) { Object(reinterpret()) }!!
        }

    public companion object : TypeCompanion<ObjectExpression> {
        override val type: GeneratedClassKGType<ObjectExpression> =
            GeneratedClassKGType(getTypeOrNull()!!) { ObjectExpression(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ObjectExpression
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_object_expression_get_type()

        /**
         * Gets the GType of from the symbol `gtk_object_expression_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_object_expression_get_type")
    }
}
