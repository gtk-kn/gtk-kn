// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecObject

/**
 * A #GParamSpec derived structure that contains the meta data for object properties.
 */
public open class ParamSpecObject(public val gobjectParamSpecObjectPointer: CPointer<GParamSpecObject>) :
    ParamSpec(gobjectParamSpecObjectPointer.reinterpret())
