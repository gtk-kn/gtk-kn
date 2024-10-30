// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkCustomLayout
import org.gtkkn.native.gtk.gtk_custom_layout_get_type

/**
 * `GtkCustomLayout` uses closures for size negotiation.
 *
 * A `GtkCustomLayout `uses closures matching to the old `GtkWidget`
 * virtual functions for size negotiation, as a convenience API to
 * ease the porting towards the corresponding `GtkLayoutManager
 * virtual functions.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `request_mode`: CustomRequestModeFunc
 */
public open class CustomLayout(
    pointer: CPointer<GtkCustomLayout>,
) : LayoutManager(pointer.reinterpret()),
    KGTyped {
    public val gtkCustomLayoutPointer: CPointer<GtkCustomLayout>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<CustomLayout> {
        override val type: GeneratedClassKGType<CustomLayout> =
            GeneratedClassKGType(gtk_custom_layout_get_type()) { CustomLayout(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
