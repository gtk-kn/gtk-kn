// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_26
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
@GObjectVersion2_26
public open class ParamSpecVariant(public val gobjectParamSpecVariantPointer: CPointer<GParamSpecVariant>) :
    ParamSpec(gobjectParamSpecVariantPointer.reinterpret())
