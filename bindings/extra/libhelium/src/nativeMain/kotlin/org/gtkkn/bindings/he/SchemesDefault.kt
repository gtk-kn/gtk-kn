// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeSchemesDefault
import org.gtkkn.native.he.he_schemes_default_get_type

/**
 * ## Skipped during bindings generation
 *
 * - parameter `cam16_color`: He.HeCAM16Color
 */
public open class SchemesDefault(
    pointer: CPointer<HeSchemesDefault>,
) : Scheme(pointer.reinterpret()), KGTyped {
    public val heSchemesDefaultPointer: CPointer<HeSchemesDefault>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<SchemesDefault> {
        override val type: GeneratedClassKGType<SchemesDefault> =
            GeneratedClassKGType(he_schemes_default_get_type()) {
                SchemesDefault(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
