// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecInt64

/**
 * A #GParamSpec derived structure that contains the meta data for 64bit integer properties.
 */
public open class ParamSpecInt64(public val gobjectParamSpecInt64Pointer: CPointer<GParamSpecInt64>) :
    ParamSpec(gobjectParamSpecInt64Pointer.reinterpret()) {
    init {
        GObject
    }
}
