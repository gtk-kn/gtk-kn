// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkTouchEvent
import org.gtkkn.native.gdk.gdk_touch_event_get_emulating_pointer
import org.gtkkn.native.gdk.gdk_touch_event_get_type
import kotlin.Boolean

/**
 * An event related to a touch-based device.
 */
public open class TouchEvent(
    pointer: CPointer<GdkTouchEvent>,
) : Event(pointer.reinterpret()), KGTyped {
    public val gdkTouchEventPointer: CPointer<GdkTouchEvent>
        get() = gPointer.reinterpret()

    /**
     * Extracts whether a touch event is emulating a pointer event.
     *
     * @return true if @event is emulating
     */
    public open fun getEmulatingPointer(): Boolean =
        gdk_touch_event_get_emulating_pointer(gdkTouchEventPointer.reinterpret()).asBoolean()

    public companion object : TypeCompanion<TouchEvent> {
        override val type: GeneratedClassKGType<TouchEvent> =
            GeneratedClassKGType(gdk_touch_event_get_type()) { TouchEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}
