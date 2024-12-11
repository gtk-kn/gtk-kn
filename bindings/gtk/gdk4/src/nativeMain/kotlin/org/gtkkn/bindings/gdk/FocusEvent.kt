// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkFocusEvent
import org.gtkkn.native.gdk.gdk_focus_event_get_in
import org.gtkkn.native.gdk.gdk_focus_event_get_type
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * An event related to a keyboard focus change.
 */
public open class FocusEvent(pointer: CPointer<GdkFocusEvent>) :
    Event(pointer.reinterpret()),
    KGTyped {
    public val gdkFocusEventPointer: CPointer<GdkFocusEvent>
        get() = gPointer.reinterpret()

    /**
     * Extracts whether this event is about focus entering or
     * leaving the surface.
     *
     * @return true of the focus is entering
     */
    public open fun getIn(): Boolean = gdk_focus_event_get_in(gdkFocusEventPointer.reinterpret()).asBoolean()

    public companion object : TypeCompanion<FocusEvent> {
        override val type: GeneratedClassKGType<FocusEvent> =
            GeneratedClassKGType(gdk_focus_event_get_type()) { FocusEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of FocusEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_focus_event_get_type()
    }
}
