// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GInitiallyUnowned
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_initially_unowned_get_type

/**
 * A type for objects that have an initially floating reference.
 *
 * All the fields in the `GInitiallyUnowned` structure are private to the
 * implementation and should never be accessed directly.
 */
public open class InitiallyUnowned(pointer: CPointer<GInitiallyUnowned>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gobjectInitiallyUnownedPointer: CPointer<GInitiallyUnowned>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<InitiallyUnowned> {
        override val type: GeneratedClassKGType<InitiallyUnowned> =
            GeneratedClassKGType(g_initially_unowned_get_type()) { InitiallyUnowned(it.reinterpret()) }

        init {
            GobjectTypeProvider.register()
        }

        /**
         * Get the GType of InitiallyUnowned
         *
         * @return the GType
         */
        public fun getType(): GType = g_initially_unowned_get_type()
    }
}
