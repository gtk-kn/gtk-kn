// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkConstantExpression
import org.gtkkn.native.gtk.gtk_constant_expression_get_type
import org.gtkkn.native.gtk.gtk_constant_expression_get_value
import org.gtkkn.native.gtk.gtk_constant_expression_new_for_value

/**
 * A constant value in a `GtkExpression`.
 *
 * ## Skipped during bindings generation
 *
 * - constructor `new`: Varargs parameter is not supported
 */
public open class ConstantExpression(pointer: CPointer<GtkConstantExpression>) :
    Expression(pointer.reinterpret()),
    KGTyped {
    public val gtkConstantExpressionPointer: CPointer<GtkConstantExpression>
        get() = gPointer.reinterpret()

    /**
     * Creates an expression that always evaluates to the given `value`.
     *
     * @param value a `GValue`
     * @return a new `GtkExpression`
     */
    public constructor(
        `value`: Value,
    ) : this(gtk_constant_expression_new_for_value(`value`.gobjectValuePointer.reinterpret())!!.reinterpret())

    /**
     * Gets the value that a constant expression evaluates to.
     *
     * @return the value
     */
    public open fun getValue(): Value =
        gtk_constant_expression_get_value(gtkConstantExpressionPointer.reinterpret())!!.run {
            Value(reinterpret())
        }

    public companion object : TypeCompanion<ConstantExpression> {
        override val type: GeneratedClassKGType<ConstantExpression> =
            GeneratedClassKGType(gtk_constant_expression_get_type()) { ConstantExpression(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ConstantExpression
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_constant_expression_get_type()
    }
}
