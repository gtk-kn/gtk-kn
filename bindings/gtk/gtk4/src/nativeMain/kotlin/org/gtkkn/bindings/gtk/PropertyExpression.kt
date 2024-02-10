// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.ParamSpec
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkPropertyExpression
import org.gtkkn.native.gtk.gtk_property_expression_get_expression
import org.gtkkn.native.gtk.gtk_property_expression_get_pspec
import org.gtkkn.native.gtk.gtk_property_expression_get_type
import org.gtkkn.native.gtk.gtk_property_expression_new
import org.gtkkn.native.gtk.gtk_property_expression_new_for_pspec
import kotlin.String
import kotlin.ULong

/**
 * A `GObject` property value in a `GtkExpression`.
 */
public open class PropertyExpression(
    pointer: CPointer<GtkPropertyExpression>,
) : Expression(pointer.reinterpret()), KGTyped {
    public val gtkPropertyExpressionPointer: CPointer<GtkPropertyExpression>
        get() = gPointer.reinterpret()

    /**
     * Creates an expression that looks up a property.
     *
     * The object to use is found by evaluating the `expression`,
     * or using the `this` argument when `expression` is `NULL`.
     *
     * If the resulting object conforms to `this_type`, its property named
     * `property_name` will be queried. Otherwise, this expression's
     * evaluation will fail.
     *
     * The given `this_type` must have a property with `property_name`.
     *
     * @param thisType The type to expect for the this type
     * @param expression Expression to
     *   evaluate to get the object to query or `NULL` to
     *   query the `this` object
     * @param propertyName name of the property
     * @return a new `GtkExpression`
     */
    public constructor(
        thisType: ULong,
        expression: Expression? = null,
        propertyName: String,
    ) : this(
        gtk_property_expression_new(
            thisType,
            expression?.gPointer?.reinterpret(),
            propertyName
        )!!.reinterpret()
    )

    /**
     * Creates an expression that looks up a property.
     *
     * The object to use is found by evaluating the `expression`,
     * or using the `this` argument when `expression` is `NULL`.
     *
     * If the resulting object conforms to `this_type`, its
     * property specified by `pspec` will be queried.
     * Otherwise, this expression's evaluation will fail.
     *
     * @param expression Expression to
     *   evaluate to get the object to query or `NULL` to
     *   query the `this` object
     * @param pspec the `GParamSpec` for the property to query
     * @return a new `GtkExpression`
     */
    public constructor(expression: Expression? = null, pspec: ParamSpec) :
        this(
            gtk_property_expression_new_for_pspec(
                expression?.gPointer?.reinterpret(),
                pspec.gPointer.reinterpret()
            )!!.reinterpret()
        )

    /**
     * Gets the expression specifying the object of
     * a property expression.
     *
     * @return the object expression
     */
    public open fun getExpression(): Expression? =
        gtk_property_expression_get_expression(gtkPropertyExpressionPointer.reinterpret())?.run {
            Expression(reinterpret())
        }

    /**
     * Gets the `GParamSpec` specifying the property of
     * a property expression.
     *
     * @return the `GParamSpec` for the property
     */
    public open fun getPspec(): ParamSpec =
        gtk_property_expression_get_pspec(gtkPropertyExpressionPointer.reinterpret())!!.run {
            ParamSpec(reinterpret())
        }

    public companion object : TypeCompanion<PropertyExpression> {
        override val type: GeneratedClassKGType<PropertyExpression> =
            GeneratedClassKGType(gtk_property_expression_get_type()) {
                PropertyExpression(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
