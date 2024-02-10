// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.ParamSpec
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkParamSpecExpression
import org.gtkkn.native.gtk.gtk_param_expression_get_type

/**
 * A `GParamSpec` for properties holding a `GtkExpression`.
 */
public open class ParamSpecExpression(
    pointer: CPointer<GtkParamSpecExpression>,
) : ParamSpec(pointer.reinterpret()), KGTyped {
    public val gtkParamSpecExpressionPointer: CPointer<GtkParamSpecExpression>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<ParamSpecExpression> {
        override val type: GeneratedClassKGType<ParamSpecExpression> =
            GeneratedClassKGType(gtk_param_expression_get_type()) {
                ParamSpecExpression(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
