// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecFlags

/**
 * A #GParamSpec derived structure that contains the meta data for flags
 * properties.
 */
public open class ParamSpecFlags(
    pointer: CPointer<GParamSpecFlags>,
) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecFlagsPointer: CPointer<GParamSpecFlags>
        get() = gPointer.reinterpret()
}
