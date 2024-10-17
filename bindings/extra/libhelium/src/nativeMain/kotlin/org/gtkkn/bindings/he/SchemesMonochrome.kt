// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeSchemesMonochrome
import org.gtkkn.native.he.he_schemes_monochrome_get_type

/**
 * ## Skipped during bindings generation
 *
 * - parameter `cam16_color`: He.HeCAM16Color
 */
public open class SchemesMonochrome(
    pointer: CPointer<HeSchemesMonochrome>,
) : Scheme(pointer.reinterpret()), KGTyped {
    public val heSchemesMonochromePointer: CPointer<HeSchemesMonochrome>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<SchemesMonochrome> {
        override val type: GeneratedClassKGType<SchemesMonochrome> =
            GeneratedClassKGType(he_schemes_monochrome_get_type()) {
                SchemesMonochrome(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
