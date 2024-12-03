// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecUInt64

/**
 * A #GParamSpec derived structure that contains the meta data for unsigned 64bit integer properties.
 */
public open class ParamSpecUInt64(pointer: CPointer<GParamSpecUInt64>) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecUInt64Pointer: CPointer<GParamSpecUInt64>
        get() = gPointer.reinterpret()
}
