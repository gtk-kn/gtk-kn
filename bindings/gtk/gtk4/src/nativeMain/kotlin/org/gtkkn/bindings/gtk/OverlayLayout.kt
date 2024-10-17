// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkOverlayLayout
import org.gtkkn.native.gtk.gtk_overlay_layout_get_type
import org.gtkkn.native.gtk.gtk_overlay_layout_new

/**
 * `GtkOverlayLayout` is the layout manager used by [class@Gtk.Overlay].
 *
 * It places widgets as overlays on top of the main child.
 *
 * This is not a reusable layout manager, since it expects its widget
 * to be a `GtkOverlay`. It is only listed here so that its layout
 * properties get documented.
 */
public open class OverlayLayout(
    pointer: CPointer<GtkOverlayLayout>,
) : LayoutManager(pointer.reinterpret()), KGTyped {
    public val gtkOverlayLayoutPointer: CPointer<GtkOverlayLayout>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkOverlayLayout` instance.
     *
     * @return the newly created instance
     */
    public constructor() : this(gtk_overlay_layout_new()!!.reinterpret())

    public companion object : TypeCompanion<OverlayLayout> {
        override val type: GeneratedClassKGType<OverlayLayout> =
            GeneratedClassKGType(gtk_overlay_layout_get_type()) {
                OverlayLayout(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
