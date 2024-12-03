// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecObject

/**
 * A #GParamSpec derived structure that contains the meta data for object properties.
 */
public open class ParamSpecObject(pointer: CPointer<GParamSpecObject>) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecObjectPointer: CPointer<GParamSpecObject>
        get() = gPointer.reinterpret()
}
