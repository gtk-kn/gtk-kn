// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeQuantizer
import org.gtkkn.native.he.he_quantizer_get_type

/**
 * ## Skipped during bindings generation
 *
 * - parameter `pixels`: Array parameter of type gint is not supported
 */
public open class Quantizer(
    pointer: CPointer<HeQuantizer>,
) : Object(pointer.reinterpret()), KGTyped {
    public val heQuantizerPointer: CPointer<HeQuantizer>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<Quantizer> {
        override val type: GeneratedClassKGType<Quantizer> =
            GeneratedClassKGType(he_quantizer_get_type()) { Quantizer(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
