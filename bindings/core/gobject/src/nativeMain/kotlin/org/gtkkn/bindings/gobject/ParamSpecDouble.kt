// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecDouble

/**
 * A #GParamSpec derived structure that contains the meta data for double properties.
 */
public open class ParamSpecDouble(pointer: CPointer<GParamSpecDouble>) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecDoublePointer: CPointer<GParamSpecDouble>
        get() = gPointer.reinterpret()
}
