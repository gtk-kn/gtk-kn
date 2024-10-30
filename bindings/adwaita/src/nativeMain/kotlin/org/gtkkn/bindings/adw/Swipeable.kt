// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwSwipeable
import org.gtkkn.native.adw.adw_swipeable_get_cancel_progress
import org.gtkkn.native.adw.adw_swipeable_get_distance
import org.gtkkn.native.adw.adw_swipeable_get_progress
import org.gtkkn.native.adw.adw_swipeable_get_swipe_area
import org.gtkkn.native.adw.adw_swipeable_get_type
import kotlin.Boolean
import kotlin.Double
import kotlin.Unit

/**
 * An interface for swipeable widgets.
 *
 * The `AdwSwipeable` interface is implemented by all swipeable widgets.
 *
 * See [class@SwipeTracker] for details about implementing it.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `n_snap_points`: n_snap_points: Out parameter is not supported
 */
public interface Swipeable :
    Interface,
    KGTyped {
    public val adwSwipeablePointer: CPointer<AdwSwipeable>

    /**
     * Gets the progress @self will snap back to after the gesture is canceled.
     *
     * @return the cancel progress, unitless
     */
    public fun getCancelProgress(): Double = adw_swipeable_get_cancel_progress(adwSwipeablePointer.reinterpret())

    /**
     * Gets the swipe distance of @self.
     *
     * This corresponds to how many pixels 1 unit represents.
     *
     * @return the swipe distance in pixels
     */
    public fun getDistance(): Double = adw_swipeable_get_distance(adwSwipeablePointer.reinterpret())

    /**
     * Gets the current progress of @self.
     *
     * @return the current progress, unitless
     */
    public fun getProgress(): Double = adw_swipeable_get_progress(adwSwipeablePointer.reinterpret())

    /**
     * Gets the area @self can start a swipe from for the given direction and
     * gesture type.
     *
     * This can be used to restrict swipes to only be possible from a certain area,
     * for example, to only allow edge swipes, or to have a draggable element and
     * ignore swipes elsewhere.
     *
     * If not implemented, the default implementation returns the allocation of
     * @self, allowing swipes from anywhere.
     *
     * @param navigationDirection the direction of the swipe
     * @param isDrag whether the swipe is caused by a dragging gesture
     * @param rect a pointer to a rectangle to store the swipe area
     */
    public fun getSwipeArea(
        navigationDirection: NavigationDirection,
        isDrag: Boolean,
        rect: Rectangle,
    ): Unit =
        adw_swipeable_get_swipe_area(
            adwSwipeablePointer.reinterpret(),
            navigationDirection.nativeValue,
            isDrag.asGBoolean(),
            rect.gdkRectanglePointer
        )

    private data class Wrapper(
        private val pointer: CPointer<AdwSwipeable>,
    ) : Swipeable {
        override val adwSwipeablePointer: CPointer<AdwSwipeable> = pointer
    }

    public companion object : TypeCompanion<Swipeable> {
        override val type: GeneratedInterfaceKGType<Swipeable> =
            GeneratedInterfaceKGType(adw_swipeable_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AdwSwipeable>): Swipeable = Wrapper(pointer)
    }
}
