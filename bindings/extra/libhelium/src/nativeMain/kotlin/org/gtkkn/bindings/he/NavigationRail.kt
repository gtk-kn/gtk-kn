// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Orientation
import org.gtkkn.bindings.gtk.Stack
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeNavigationRail
import org.gtkkn.native.he.he_navigation_rail_get_orientation
import org.gtkkn.native.he.he_navigation_rail_get_stack
import org.gtkkn.native.he.he_navigation_rail_get_type
import org.gtkkn.native.he.he_navigation_rail_new
import org.gtkkn.native.he.he_navigation_rail_set_orientation
import org.gtkkn.native.he.he_navigation_rail_set_stack
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `stack`: Property has no getter nor setter
 * - method `orientation`: Property has no getter nor setter
 */
public open class NavigationRail(
    pointer: CPointer<HeNavigationRail>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heNavigationRailPointer: CPointer<HeNavigationRail>
        get() = gPointer.reinterpret()

    public constructor() : this(he_navigation_rail_new()!!.reinterpret())

    public open fun getStack(): Stack =
        he_navigation_rail_get_stack(heNavigationRailPointer.reinterpret())!!.run {
            Stack(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setStack(`value`: Stack): Unit =
        he_navigation_rail_set_stack(
            heNavigationRailPointer.reinterpret(),
            `value`.gtkStackPointer.reinterpret()
        )

    public open fun getOrientation(): Orientation =
        he_navigation_rail_get_orientation(heNavigationRailPointer.reinterpret()).run {
            Orientation.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setOrientation(`value`: Orientation): Unit =
        he_navigation_rail_set_orientation(
            heNavigationRailPointer.reinterpret(),
            `value`.nativeValue
        )

    public companion object : TypeCompanion<NavigationRail> {
        override val type: GeneratedClassKGType<NavigationRail> =
            GeneratedClassKGType(he_navigation_rail_get_type()) {
                NavigationRail(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
