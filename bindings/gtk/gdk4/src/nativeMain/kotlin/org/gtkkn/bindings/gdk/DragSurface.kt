// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDragSurface
import org.gtkkn.native.gdk.gdk_drag_surface_get_type
import org.gtkkn.native.gdk.gdk_drag_surface_present
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import kotlin.Boolean

/**
 * A `GdkDragSurface` is an interface for surfaces used during DND.
 *
 * ## Skipped during bindings generation
 *
 * - signal `compute-size`: Unsupported parameter `size` : DragSurfaceSize
 */
public interface DragSurface :
    Interface,
    KGTyped {
    public val gdkDragSurfacePointer: CPointer<GdkDragSurface>

    /**
     * Present @drag_surface.
     *
     * @param width the unconstrained drag_surface width to layout
     * @param height the unconstrained drag_surface height to layout
     * @return false if it failed to be presented, otherwise true.
     */
    public fun present(width: gint, height: gint): Boolean =
        gdk_drag_surface_present(gdkDragSurfacePointer.reinterpret(), width, height).asBoolean()

    private data class Wrapper(private val pointer: CPointer<GdkDragSurface>) : DragSurface {
        override val gdkDragSurfacePointer: CPointer<GdkDragSurface> = pointer
    }

    public companion object : TypeCompanion<DragSurface> {
        override val type: GeneratedInterfaceKGType<DragSurface> =
            GeneratedInterfaceKGType(gdk_drag_surface_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GdkDragSurface>): DragSurface = Wrapper(pointer)

        /**
         * Get the GType of DragSurface
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_drag_surface_get_type()
    }
}
