// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecParam

/**
 * A #GParamSpec derived structure that contains the meta data for %G_TYPE_PARAM
 * properties.
 */
public open class ParamSpecParam(public val gobjectParamSpecParamPointer: CPointer<GParamSpecParam>) :
    ParamSpec(gobjectParamSpecParamPointer.reinterpret())
