// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkCrossingEvent
import org.gtkkn.native.gdk.gdk_crossing_event_get_detail
import org.gtkkn.native.gdk.gdk_crossing_event_get_focus
import org.gtkkn.native.gdk.gdk_crossing_event_get_mode
import org.gtkkn.native.gdk.gdk_crossing_event_get_type
import kotlin.Boolean

/**
 * An event caused by a pointing device moving between surfaces.
 */
public open class CrossingEvent(
    pointer: CPointer<GdkCrossingEvent>,
) : Event(pointer.reinterpret()),
    KGTyped {
    public val gdkCrossingEventPointer: CPointer<GdkCrossingEvent>
        get() = gPointer.reinterpret()

    /**
     * Extracts the notify detail from a crossing event.
     *
     * @return the notify detail of @event
     */
    public open fun getDetail(): NotifyType =
        gdk_crossing_event_get_detail(gdkCrossingEventPointer.reinterpret()).run {
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
    public open fun getMode(): CrossingMode =
        gdk_crossing_event_get_mode(gdkCrossingEventPointer.reinterpret()).run {
            CrossingMode.fromNativeValue(this)
        }

    public companion object : TypeCompanion<CrossingEvent> {
        override val type: GeneratedClassKGType<CrossingEvent> =
            GeneratedClassKGType(gdk_crossing_event_get_type()) { CrossingEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}
