// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwSwipeable
import org.gtkkn.native.adw.adw_swipeable_get_cancel_progress
import org.gtkkn.native.adw.adw_swipeable_get_distance
import org.gtkkn.native.adw.adw_swipeable_get_progress
import org.gtkkn.native.adw.adw_swipeable_get_swipe_area
import org.gtkkn.native.adw.adw_swipeable_get_type
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
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
    Proxy,
    KGTyped {
    public val adwSwipeablePointer: CPointer<AdwSwipeable>

    /**
     * Gets the progress @self will snap back to after the gesture is canceled.
     *
     * @return the cancel progress, unitless
     */
    public fun getCancelProgress(): gdouble = adw_swipeable_get_cancel_progress(adwSwipeablePointer)

    /**
     * Gets the swipe distance of @self.
     *
     * This corresponds to how many pixels 1 unit represents.
     *
     * @return the swipe distance in pixels
     */
    public fun getDistance(): gdouble = adw_swipeable_get_distance(adwSwipeablePointer)

    /**
     * Gets the current progress of @self.
     *
     * @return the current progress, unitless
     */
    public fun getProgress(): gdouble = adw_swipeable_get_progress(adwSwipeablePointer)

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
    public fun getSwipeArea(navigationDirection: NavigationDirection, isDrag: Boolean, rect: Rectangle): Unit =
        adw_swipeable_get_swipe_area(
            adwSwipeablePointer,
            navigationDirection.nativeValue,
            isDrag.asGBoolean(),
            rect.gdkRectanglePointer
        )

    /**
     * The SwipeableImpl type represents a native instance of the Swipeable interface.
     *
     * @constructor Creates a new instance of Swipeable for the provided [CPointer].
     */
    public class SwipeableImpl(adwSwipeablePointer: CPointer<AdwSwipeable>) :
        Widget(adwSwipeablePointer.reinterpret()),
        Swipeable {
        init {
            Adw
        }

        override val adwSwipeablePointer: CPointer<AdwSwipeable> = adwSwipeablePointer
    }

    public companion object : TypeCompanion<Swipeable> {
        override val type: GeneratedInterfaceKGType<Swipeable> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { SwipeableImpl(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of Swipeable
         *
         * @return the GType
         */
        public fun getType(): GType = adw_swipeable_get_type()

        /**
         * Gets the GType of from the symbol `adw_swipeable_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_swipeable_get_type")
    }
}
