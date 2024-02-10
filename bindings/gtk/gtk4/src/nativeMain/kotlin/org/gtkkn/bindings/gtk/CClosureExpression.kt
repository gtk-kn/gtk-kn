// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkCClosureExpression
import org.gtkkn.native.gtk.gtk_cclosure_expression_get_type

/**
 * A variant of `GtkClosureExpression` using a C closure.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `marshal`: GObject.ClosureMarshal
 */
public open class CClosureExpression(
    pointer: CPointer<GtkCClosureExpression>,
) : Expression(pointer.reinterpret()), KGTyped {
    public val gtkCClosureExpressionPointer: CPointer<GtkCClosureExpression>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<CClosureExpression> {
        override val type: GeneratedClassKGType<CClosureExpression> =
            GeneratedClassKGType(gtk_cclosure_expression_get_type()) {
                CClosureExpression(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
