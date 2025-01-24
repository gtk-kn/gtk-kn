// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_10
import org.gtkkn.native.gobject.GParamSpecGType

/**
 * A #GParamSpec derived structure that contains the meta data for #GType properties.
 * @since 2.10
 */
@GObjectVersion2_10
public open class ParamSpecGType(public val gobjectParamSpecGTypePointer: CPointer<GParamSpecGType>) :
    ParamSpec(gobjectParamSpecGTypePointer.reinterpret())
