// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_12
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDragSurface
import org.gtkkn.native.gdk.GdkDragSurfaceSize
import org.gtkkn.native.gdk.gdk_drag_surface_get_type
import org.gtkkn.native.gdk.gdk_drag_surface_present
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * A `GdkDragSurface` is an interface for surfaces used during DND.
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

    /**
     * Emitted when the size for the surface needs to be computed, when it is
     * present.
     *
     * This signal will normally be emitted during the native surface layout
     * cycle when the surface size needs to be recomputed.
     *
     * It is the responsibility of the drag surface user to handle this signal
     * and compute the desired size of the surface, storing the computed size
     * in the [struct@Gdk.DragSurfaceSize] object that is passed to the signal
     * handler, using [method@Gdk.DragSurfaceSize.set_size].
     *
     * Failing to set a size so will result in an arbitrary size being used as
     * a result.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `size` the size of the drag surface
     * @since 4.12
     */
    @GdkVersion4_12
    public fun connectComputeSize(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (size: DragSurfaceSize) -> Unit,
    ): ULong = g_signal_connect_data(
        gdkDragSurfacePointer.reinterpret(),
        "compute-size",
        connectComputeSizeFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

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

private val connectComputeSizeFunc: CPointer<CFunction<(CPointer<GdkDragSurfaceSize>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            size: CPointer<GdkDragSurfaceSize>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(size: DragSurfaceSize) -> Unit>().get().invoke(
            size!!.run {
                DragSurfaceSize(reinterpret())
            }
        )
    }
        .reinterpret()
