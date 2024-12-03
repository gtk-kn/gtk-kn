// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecUInt

/**
 * A #GParamSpec derived structure that contains the meta data for unsigned integer properties.
 */
public open class ParamSpecUInt(pointer: CPointer<GParamSpecUInt>) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecUIntPointer: CPointer<GParamSpecUInt>
        get() = gPointer.reinterpret()
}
