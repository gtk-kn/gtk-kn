// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkGrabBrokenEvent
import org.gtkkn.native.gdk.gdk_grab_broken_event_get_grab_surface
import org.gtkkn.native.gdk.gdk_grab_broken_event_get_implicit
import org.gtkkn.native.gdk.gdk_grab_broken_event_get_type
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * An event related to a broken windowing system grab.
 */
public open class GrabBrokenEvent(public val gdkGrabBrokenEventPointer: CPointer<GdkGrabBrokenEvent>) :
    Event(gdkGrabBrokenEventPointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

    /**
     * Extracts the grab surface from a grab broken event.
     *
     * @return the grab surface of @event
     */
    public open fun getGrabSurface(): Surface =
        gdk_grab_broken_event_get_grab_surface(gdkGrabBrokenEventPointer.reinterpret())!!.run {
            InstanceCache.get(this, true) { Surface.SurfaceImpl(reinterpret()) }!!
        }

    /**
     * Checks whether the grab broken event is for an implicit grab.
     *
     * @return true if the an implicit grab was broken
     */
    public open fun getImplicit(): Boolean =
        gdk_grab_broken_event_get_implicit(gdkGrabBrokenEventPointer.reinterpret()).asBoolean()

    public companion object : TypeCompanion<GrabBrokenEvent> {
        override val type: GeneratedClassKGType<GrabBrokenEvent> =
            GeneratedClassKGType(getTypeOrNull()!!) { GrabBrokenEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of GrabBrokenEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_grab_broken_event_get_type()

        /**
         * Gets the GType of from the symbol `gdk_grab_broken_event_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_grab_broken_event_get_type")
    }
}
