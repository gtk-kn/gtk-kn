// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_12
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gdk.GdkDragSurfaceSize
import org.gtkkn.native.gdk.gdk_drag_surface_size_set_size
import org.gtkkn.native.gobject.gint
import kotlin.Unit

/**
 * The `GdkDragSurfaceSize` struct contains information that is useful
 * to compute the size of a drag surface.
 * @since 4.12
 */
@GdkVersion4_12
public class DragSurfaceSize(pointer: CPointer<GdkDragSurfaceSize>) : ProxyInstance(pointer) {
    public val gdkDragSurfaceSizePointer: CPointer<GdkDragSurfaceSize> = pointer

    /**
     * Sets the size the drag surface prefers to be resized to.
     *
     * @param width the width
     * @param height the height
     * @since 4.12
     */
    @GdkVersion4_12
    public fun setSize(width: gint, height: gint): Unit =
        gdk_drag_surface_size_set_size(gdkDragSurfaceSizePointer.reinterpret(), width, height)
}
