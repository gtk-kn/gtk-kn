// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecBoxed

/**
 * A #GParamSpec derived structure that contains the meta data for boxed properties.
 */
public open class ParamSpecBoxed(public val gobjectParamSpecBoxedPointer: CPointer<GParamSpecBoxed>) :
    ParamSpec(gobjectParamSpecBoxedPointer.reinterpret())
