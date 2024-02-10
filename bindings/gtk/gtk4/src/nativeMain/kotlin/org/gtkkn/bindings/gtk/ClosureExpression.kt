// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public open class ClosureExpression(
    pointer: CPointer<GtkClosureExpression>,
) : Expression(pointer.reinterpret()), KGTyped {
    public val gtkClosureExpressionPointer: CPointer<GtkClosureExpression>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<ClosureExpression> {
        override val type: GeneratedClassKGType<ClosureExpression> =
            GeneratedClassKGType(gtk_closure_expression_get_type()) {
                ClosureExpression(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
