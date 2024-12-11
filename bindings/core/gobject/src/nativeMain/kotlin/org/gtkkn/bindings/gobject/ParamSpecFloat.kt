// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecFloat

/**
 * A #GParamSpec derived structure that contains the meta data for float properties.
 */
public open class ParamSpecFloat(pointer: CPointer<GParamSpecFloat>) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecFloatPointer: CPointer<GParamSpecFloat>
        get() = gPointer.reinterpret()
}
