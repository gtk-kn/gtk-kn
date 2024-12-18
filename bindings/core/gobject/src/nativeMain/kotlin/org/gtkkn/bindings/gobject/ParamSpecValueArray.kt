// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecValueArray

/**
 * A #GParamSpec derived structure that contains the meta data for #GValueArray properties.
 */
public open class ParamSpecValueArray(
    pointer: CPointer<GParamSpecValueArray>,
) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecValueArrayPointer: CPointer<GParamSpecValueArray>
        get() = gPointer.reinterpret()
}
