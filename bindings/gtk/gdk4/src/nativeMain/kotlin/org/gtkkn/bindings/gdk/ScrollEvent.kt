// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_8
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkScrollEvent
import org.gtkkn.native.gdk.gdk_scroll_event_get_direction
import org.gtkkn.native.gdk.gdk_scroll_event_get_type
import org.gtkkn.native.gdk.gdk_scroll_event_get_unit
import org.gtkkn.native.gdk.gdk_scroll_event_is_stop
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * An event related to a scrolling motion.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `delta_x`: delta_x: Out parameter is not supported
 */
public open class ScrollEvent(public val gdkScrollEventPointer: CPointer<GdkScrollEvent>) :
    Event(gdkScrollEventPointer.reinterpret()),
    KGTyped {
    /**
     * Extracts the direction of a scroll event.
     *
     * @return the scroll direction of @event
     */
    public open fun getDirection(): ScrollDirection =
        gdk_scroll_event_get_direction(gdkScrollEventPointer.reinterpret()).run {
            ScrollDirection.fromNativeValue(this)
        }

    /**
     * Extracts the scroll delta unit of a scroll event.
     *
     * The unit will always be %GDK_SCROLL_UNIT_WHEEL if the scroll direction is not
     * %GDK_SCROLL_SMOOTH.
     *
     * @return the scroll unit.
     * @since 4.8
     */
    @GdkVersion4_8
    public open fun getUnit(): ScrollUnit = gdk_scroll_event_get_unit(gdkScrollEventPointer.reinterpret()).run {
        ScrollUnit.fromNativeValue(this)
    }

    /**
     * Check whether a scroll event is a stop scroll event.
     *
     * Scroll sequences with smooth scroll information may provide
     * a stop scroll event once the interaction with the device finishes,
     * e.g. by lifting a finger. This stop scroll event is the signal
     * that a widget may trigger kinetic scrolling based on the current
     * velocity.
     *
     * Stop scroll events always have a delta of 0/0.
     *
     * @return true if the event is a scroll stop event
     */
    public open fun isStop(): Boolean = gdk_scroll_event_is_stop(gdkScrollEventPointer.reinterpret()).asBoolean()

    public companion object : TypeCompanion<ScrollEvent> {
        override val type: GeneratedClassKGType<ScrollEvent> =
            GeneratedClassKGType(gdk_scroll_event_get_type()) { ScrollEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of ScrollEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_scroll_event_get_type()
    }
}
