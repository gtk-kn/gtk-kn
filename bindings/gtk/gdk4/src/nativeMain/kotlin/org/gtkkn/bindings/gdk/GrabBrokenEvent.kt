// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkGrabBrokenEvent
import org.gtkkn.native.gdk.gdk_grab_broken_event_get_grab_surface
import org.gtkkn.native.gdk.gdk_grab_broken_event_get_implicit
import org.gtkkn.native.gdk.gdk_grab_broken_event_get_type
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * An event related to a broken windowing system grab.
 */
public open class GrabBrokenEvent(pointer: CPointer<GdkGrabBrokenEvent>) :
    Event(pointer.reinterpret()),
    KGTyped {
    public val gdkGrabBrokenEventPointer: CPointer<GdkGrabBrokenEvent>
        get() = gPointer.reinterpret()

    /**
     * Extracts the grab surface from a grab broken event.
     *
     * @return the grab surface of @event
     */
    public open fun getGrabSurface(): Surface =
        gdk_grab_broken_event_get_grab_surface(gdkGrabBrokenEventPointer.reinterpret())!!.run {
            Surface(reinterpret())
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
            GeneratedClassKGType(gdk_grab_broken_event_get_type()) { GrabBrokenEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of GrabBrokenEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_grab_broken_event_get_type()
    }
}
