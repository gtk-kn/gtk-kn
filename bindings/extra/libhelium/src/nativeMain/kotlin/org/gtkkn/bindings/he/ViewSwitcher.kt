// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Stack
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeViewSwitcher
import org.gtkkn.native.he.he_view_switcher_get_stack
import org.gtkkn.native.he.he_view_switcher_get_type
import org.gtkkn.native.he.he_view_switcher_new
import org.gtkkn.native.he.he_view_switcher_set_stack
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `stack`: Property has no getter nor setter
 */
public open class ViewSwitcher(
    pointer: CPointer<HeViewSwitcher>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heViewSwitcherPointer: CPointer<HeViewSwitcher>
        get() = gPointer.reinterpret()

    public constructor() : this(he_view_switcher_new()!!.reinterpret())

    public open fun getStack(): Stack =
        he_view_switcher_get_stack(heViewSwitcherPointer.reinterpret())!!.run {
            Stack(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setStack(`value`: Stack): Unit =
        he_view_switcher_set_stack(
            heViewSwitcherPointer.reinterpret(),
            `value`.gtkStackPointer.reinterpret()
        )

    public companion object : TypeCompanion<ViewSwitcher> {
        override val type: GeneratedClassKGType<ViewSwitcher> =
            GeneratedClassKGType(he_view_switcher_get_type()) { ViewSwitcher(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
