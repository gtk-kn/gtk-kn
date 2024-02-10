// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecInt

/**
 * A #GParamSpec derived structure that contains the meta data for integer properties.
 */
public open class ParamSpecInt(
    pointer: CPointer<GParamSpecInt>,
) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecIntPointer: CPointer<GParamSpecInt>
        get() = gPointer.reinterpret()
}
