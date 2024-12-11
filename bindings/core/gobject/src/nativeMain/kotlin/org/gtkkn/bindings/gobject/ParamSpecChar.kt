// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecChar

/**
 * A #GParamSpec derived structure that contains the meta data for character properties.
 */
public open class ParamSpecChar(pointer: CPointer<GParamSpecChar>) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecCharPointer: CPointer<GParamSpecChar>
        get() = gPointer.reinterpret()
}
