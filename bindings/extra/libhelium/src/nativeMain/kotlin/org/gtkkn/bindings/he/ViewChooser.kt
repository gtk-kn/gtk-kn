// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Stack
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeViewChooser
import org.gtkkn.native.he.he_view_chooser_get_stack
import org.gtkkn.native.he.he_view_chooser_get_type
import org.gtkkn.native.he.he_view_chooser_new
import org.gtkkn.native.he.he_view_chooser_set_stack
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `stack`: Property has no getter nor setter
 */
public open class ViewChooser(
    pointer: CPointer<HeViewChooser>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heViewChooserPointer: CPointer<HeViewChooser>
        get() = gPointer.reinterpret()

    public constructor() : this(he_view_chooser_new()!!.reinterpret())

    public open fun getStack(): Stack =
        he_view_chooser_get_stack(heViewChooserPointer.reinterpret())!!.run {
            Stack(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setStack(`value`: Stack): Unit =
        he_view_chooser_set_stack(
            heViewChooserPointer.reinterpret(),
            `value`.gtkStackPointer.reinterpret()
        )

    public companion object : TypeCompanion<ViewChooser> {
        override val type: GeneratedClassKGType<ViewChooser> =
            GeneratedClassKGType(he_view_chooser_get_type()) { ViewChooser(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
