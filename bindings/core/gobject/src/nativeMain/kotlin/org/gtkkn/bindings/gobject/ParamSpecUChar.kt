// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecUChar

/**
 * A #GParamSpec derived structure that contains the meta data for unsigned character properties.
 */
public open class ParamSpecUChar(pointer: CPointer<GParamSpecUChar>) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecUCharPointer: CPointer<GParamSpecUChar>
        get() = gPointer.reinterpret()
}
