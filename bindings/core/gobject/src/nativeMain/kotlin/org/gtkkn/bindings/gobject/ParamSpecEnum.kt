// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecEnum

/**
 * A #GParamSpec derived structure that contains the meta data for enum
 * properties.
 */
public open class ParamSpecEnum(public val gobjectParamSpecEnumPointer: CPointer<GParamSpecEnum>) :
    ParamSpec(gobjectParamSpecEnumPointer.reinterpret())
