// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecFlags

/**
 * A #GParamSpec derived structure that contains the meta data for flags
 * properties.
 */
public open class ParamSpecFlags(public val gobjectParamSpecFlagsPointer: CPointer<GParamSpecFlags>) :
    ParamSpec(gobjectParamSpecFlagsPointer.reinterpret()) {
    init {
        GObject
    }
}
