// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.HashTable
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeQuantizerResult
import org.gtkkn.native.he.he_quantizer_result_get_type
import org.gtkkn.native.he.he_quantizer_result_new

public open class QuantizerResult(
    pointer: CPointer<HeQuantizerResult>,
) : Object(pointer.reinterpret()), KGTyped {
    public val heQuantizerResultPointer: CPointer<HeQuantizerResult>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param colorToCount
     */
    public constructor(colorToCount: HashTable) :
        this(he_quantizer_result_new(colorToCount.glibHashTablePointer)!!.reinterpret())

    public companion object : TypeCompanion<QuantizerResult> {
        override val type: GeneratedClassKGType<QuantizerResult> =
            GeneratedClassKGType(he_quantizer_result_get_type()) {
                QuantizerResult(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
