// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkProximityEvent
import org.gtkkn.native.gdk.gdk_proximity_event_get_type
import org.gtkkn.native.gobject.GType

/**
 * An event related to the proximity of a tool to a device.
 */
public open class ProximityEvent(pointer: CPointer<GdkProximityEvent>) :
    Event(pointer.reinterpret()),
    KGTyped {
    public val gdkProximityEventPointer: CPointer<GdkProximityEvent>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<ProximityEvent> {
        override val type: GeneratedClassKGType<ProximityEvent> =
            GeneratedClassKGType(gdk_proximity_event_get_type()) { ProximityEvent(it.reinterpret()) }

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
