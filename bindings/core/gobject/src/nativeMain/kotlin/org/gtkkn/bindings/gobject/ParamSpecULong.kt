// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecULong

/**
 * A #GParamSpec derived structure that contains the meta data for unsigned long integer properties.
 */
public open class ParamSpecULong(
    pointer: CPointer<GParamSpecULong>,
) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecULongPointer: CPointer<GParamSpecULong>
        get() = gPointer.reinterpret()
}
