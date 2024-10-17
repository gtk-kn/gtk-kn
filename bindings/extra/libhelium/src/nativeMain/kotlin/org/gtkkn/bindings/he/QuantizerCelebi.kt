// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeQuantizerCelebi
import org.gtkkn.native.he.he_quantizer_celebi_get_type
import org.gtkkn.native.he.he_quantizer_celebi_new

/**
 * ## Skipped during bindings generation
 *
 * - parameter `pixels`: Array parameter of type gint is not supported
 */
public open class QuantizerCelebi(
    pointer: CPointer<HeQuantizerCelebi>,
) : KGTyped {
    public val gPointer: CPointer<HeQuantizerCelebi>

    init {
        gPointer = pointer.reinterpret()
    }

    public constructor() : this(he_quantizer_celebi_new()!!.reinterpret())

    public companion object : TypeCompanion<QuantizerCelebi> {
        override val type: GeneratedClassKGType<QuantizerCelebi> =
            GeneratedClassKGType(he_quantizer_celebi_get_type()) {
                QuantizerCelebi(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
