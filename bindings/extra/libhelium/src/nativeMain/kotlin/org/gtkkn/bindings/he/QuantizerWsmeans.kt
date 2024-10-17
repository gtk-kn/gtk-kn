// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeQuantizerWsmeans
import org.gtkkn.native.he.he_quantizer_wsmeans_get_type

/**
 * ## Skipped during bindings generation
 *
 * - parameter `input_pixels`: Array parameter of type gint is not supported
 */
public open class QuantizerWsmeans(
    pointer: CPointer<HeQuantizerWsmeans>,
) : Object(pointer.reinterpret()), KGTyped {
    public val heQuantizerWsmeansPointer: CPointer<HeQuantizerWsmeans>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<QuantizerWsmeans> {
        override val type: GeneratedClassKGType<QuantizerWsmeans> =
            GeneratedClassKGType(he_quantizer_wsmeans_get_type()) {
                QuantizerWsmeans(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
