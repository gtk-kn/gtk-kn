// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeQuantizerWu
import org.gtkkn.native.he.he_quantizer_wu_get_type
import org.gtkkn.native.he.he_quantizer_wu_new

public open class QuantizerWu(
    pointer: CPointer<HeQuantizerWu>,
) : Quantizer(pointer.reinterpret()), KGTyped {
    public val heQuantizerWuPointer: CPointer<HeQuantizerWu>
        get() = gPointer.reinterpret()

    public constructor() : this(he_quantizer_wu_new()!!.reinterpret())

    public companion object : TypeCompanion<QuantizerWu> {
        override val type: GeneratedClassKGType<QuantizerWu> =
            GeneratedClassKGType(he_quantizer_wu_get_type()) { QuantizerWu(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
