// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkCrossingEvent
import org.gtkkn.native.gdk.gdk_crossing_event_get_detail
import org.gtkkn.native.gdk.gdk_crossing_event_get_focus
import org.gtkkn.native.gdk.gdk_crossing_event_get_mode
import org.gtkkn.native.gdk.gdk_crossing_event_get_type
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * An event caused by a pointing device moving between surfaces.
 */
public open class CrossingEvent(public val gdkCrossingEventPointer: CPointer<GdkCrossingEvent>) :
    Event(gdkCrossingEventPointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

    /**
     * Extracts the notify detail from a crossing event.
     *
     * @return the notify detail of @event
     */
    public open fun getDetail(): NotifyType = gdk_crossing_event_get_detail(gdkCrossingEventPointer.reinterpret()).run {
        NotifyType.fromNativeValue(this)
    }

    /**
     * Checks if the @event surface is the focus surface.
     *
     * @return true if the surface is the focus surface
     */
    public open fun getFocus(): Boolean =
        gdk_crossing_event_get_focus(gdkCrossingEventPointer.reinterpret()).asBoolean()

    /**
     * Extracts the crossing mode from a crossing event.
     *
     * @return the mode of @event
     */
    public open fun getMode(): CrossingMode = gdk_crossing_event_get_mode(gdkCrossingEventPointer.reinterpret()).run {
        CrossingMode.fromNativeValue(this)
    }

    public companion object : TypeCompanion<CrossingEvent> {
        override val type: GeneratedClassKGType<CrossingEvent> =
            GeneratedClassKGType(getTypeOrNull()!!) { CrossingEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of CrossingEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_crossing_event_get_type()

        /**
         * Gets the GType of from the symbol `gdk_crossing_event_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_crossing_event_get_type")
    }
}
