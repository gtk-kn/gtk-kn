// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.HashTable
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeQuantizerMap
import org.gtkkn.native.he.he_quantizer_map_get_color_to_count
import org.gtkkn.native.he.he_quantizer_map_get_type
import org.gtkkn.native.he.he_quantizer_map_new

public open class QuantizerMap(
    pointer: CPointer<HeQuantizerMap>,
) : Quantizer(pointer.reinterpret()), KGTyped {
    public val heQuantizerMapPointer: CPointer<HeQuantizerMap>
        get() = gPointer.reinterpret()

    public constructor() : this(he_quantizer_map_new()!!.reinterpret())

    public open fun getColorToCount(): HashTable =
        he_quantizer_map_get_color_to_count(heQuantizerMapPointer.reinterpret())!!.run {
            HashTable(reinterpret())
        }

    public companion object : TypeCompanion<QuantizerMap> {
        override val type: GeneratedClassKGType<QuantizerMap> =
            GeneratedClassKGType(he_quantizer_map_get_type()) { QuantizerMap(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
