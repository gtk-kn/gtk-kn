// This is a generated file. Do not modify.
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
