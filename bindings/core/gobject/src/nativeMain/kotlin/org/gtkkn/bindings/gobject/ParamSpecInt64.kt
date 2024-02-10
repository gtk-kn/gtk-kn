// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecInt64

/**
 * A #GParamSpec derived structure that contains the meta data for 64bit integer properties.
 */
public open class ParamSpecInt64(
    pointer: CPointer<GParamSpecInt64>,
) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecInt64Pointer: CPointer<GParamSpecInt64>
        get() = gPointer.reinterpret()
}
