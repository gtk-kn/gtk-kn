// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkProximityEvent
import org.gtkkn.native.gdk.gdk_proximity_event_get_type
import org.gtkkn.native.gobject.GType

/**
 * An event related to the proximity of a tool to a device.
 */
public open class ProximityEvent(public val gdkProximityEventPointer: CPointer<GdkProximityEvent>) :
    Event(gdkProximityEventPointer.reinterpret()),
    KGTyped {
    public companion object : TypeCompanion<ProximityEvent> {
        override val type: GeneratedClassKGType<ProximityEvent> =
            GeneratedClassKGType(getTypeOrNull("gdk_proximity_event_get_type")!!) {
                ProximityEvent(it.reinterpret())
            }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of ProximityEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_proximity_event_get_type()
    }
}
