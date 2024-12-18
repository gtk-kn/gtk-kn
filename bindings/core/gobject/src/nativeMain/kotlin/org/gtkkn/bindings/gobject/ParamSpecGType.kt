// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_10
import org.gtkkn.native.gobject.GParamSpecGType

/**
 * A #GParamSpec derived structure that contains the meta data for #GType properties.
 * @since 2.10
 */
@GObjectVersion2_10
public open class ParamSpecGType(
    pointer: CPointer<GParamSpecGType>,
) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecGTypePointer: CPointer<GParamSpecGType>
        get() = gPointer.reinterpret()
}
