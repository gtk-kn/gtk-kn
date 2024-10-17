// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeSchemesMuted
import org.gtkkn.native.he.he_schemes_muted_get_type

/**
 * ## Skipped during bindings generation
 *
 * - parameter `cam16_color`: He.HeCAM16Color
 */
public open class SchemesMuted(
    pointer: CPointer<HeSchemesMuted>,
) : Scheme(pointer.reinterpret()), KGTyped {
    public val heSchemesMutedPointer: CPointer<HeSchemesMuted>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<SchemesMuted> {
        override val type: GeneratedClassKGType<SchemesMuted> =
            GeneratedClassKGType(he_schemes_muted_get_type()) { SchemesMuted(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
