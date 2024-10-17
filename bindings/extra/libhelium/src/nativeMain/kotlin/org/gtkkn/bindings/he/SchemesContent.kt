// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeSchemesContent
import org.gtkkn.native.he.he_schemes_content_get_type

/**
 * ## Skipped during bindings generation
 *
 * - parameter `cam16_color`: He.HeCAM16Color
 */
public open class SchemesContent(
    pointer: CPointer<HeSchemesContent>,
) : Scheme(pointer.reinterpret()), KGTyped {
    public val heSchemesContentPointer: CPointer<HeSchemesContent>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<SchemesContent> {
        override val type: GeneratedClassKGType<SchemesContent> =
            GeneratedClassKGType(he_schemes_content_get_type()) {
                SchemesContent(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
