// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecUnichar

/**
 * A #GParamSpec derived structure that contains the meta data for unichar (unsigned integer) properties.
 */
public open class ParamSpecUnichar(
    pointer: CPointer<GParamSpecUnichar>,
) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecUnicharPointer: CPointer<GParamSpecUnichar>
        get() = gPointer.reinterpret()
}
