// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeSchemesVibrant
import org.gtkkn.native.he.he_schemes_vibrant_get_type

/**
 * ## Skipped during bindings generation
 *
 * - parameter `cam16_color`: He.HeCAM16Color
 */
public open class SchemesVibrant(
    pointer: CPointer<HeSchemesVibrant>,
) : Scheme(pointer.reinterpret()), KGTyped {
    public val heSchemesVibrantPointer: CPointer<HeSchemesVibrant>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<SchemesVibrant> {
        override val type: GeneratedClassKGType<SchemesVibrant> =
            GeneratedClassKGType(he_schemes_vibrant_get_type()) {
                SchemesVibrant(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
