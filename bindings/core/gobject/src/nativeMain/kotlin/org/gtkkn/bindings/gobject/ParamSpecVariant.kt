// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecVariant

/**
 * A #GParamSpec derived structure that contains the meta data for #GVariant properties.
 *
 * When comparing values with g_param_values_cmp(), scalar values with the same
 * type will be compared with g_variant_compare(). Other non-null variants will
 * be checked for equality with g_variant_equal(), and their sort order is
 * otherwise undefined. null is ordered before non-null variants. Two null
 * values compare equal.
 * @since 2.26
 */
public open class ParamSpecVariant(
    pointer: CPointer<GParamSpecVariant>,
) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecVariantPointer: CPointer<GParamSpecVariant>
        get() = gPointer.reinterpret()
}
