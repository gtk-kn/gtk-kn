// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecLong

/**
 * A #GParamSpec derived structure that contains the meta data for long integer properties.
 */
public open class ParamSpecLong(pointer: CPointer<GParamSpecLong>) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecLongPointer: CPointer<GParamSpecLong>
        get() = gPointer.reinterpret()
}
