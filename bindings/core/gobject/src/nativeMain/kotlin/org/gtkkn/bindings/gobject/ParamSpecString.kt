// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecString

/**
 * A #GParamSpec derived structure that contains the meta data for string
 * properties.
 */
public open class ParamSpecString(
    pointer: CPointer<GParamSpecString>,
) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecStringPointer: CPointer<GParamSpecString>
        get() = gPointer.reinterpret()
}
