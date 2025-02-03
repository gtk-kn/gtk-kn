// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecString

/**
 * A #GParamSpec derived structure that contains the meta data for string
 * properties.
 */
public open class ParamSpecString(public val gobjectParamSpecStringPointer: CPointer<GParamSpecString>) :
    ParamSpec(gobjectParamSpecStringPointer.reinterpret()) {
    init {
        GObject
    }
}
