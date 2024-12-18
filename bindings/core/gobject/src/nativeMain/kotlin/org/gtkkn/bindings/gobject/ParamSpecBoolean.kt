// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecBoolean

/**
 * A #GParamSpec derived structure that contains the meta data for boolean properties.
 */
public open class ParamSpecBoolean(
    pointer: CPointer<GParamSpecBoolean>,
) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecBooleanPointer: CPointer<GParamSpecBoolean>
        get() = gPointer.reinterpret()
}
