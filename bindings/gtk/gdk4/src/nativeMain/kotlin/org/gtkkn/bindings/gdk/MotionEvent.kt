// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkMotionEvent
import org.gtkkn.native.gdk.gdk_motion_event_get_type

/**
 * An event related to a pointer or touch device motion.
 */
public open class MotionEvent(
    pointer: CPointer<GdkMotionEvent>,
) : Event(pointer.reinterpret()),
    KGTyped {
    public val gdkMotionEventPointer: CPointer<GdkMotionEvent>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<MotionEvent> {
        override val type: GeneratedClassKGType<MotionEvent> =
            GeneratedClassKGType(gdk_motion_event_get_type()) { MotionEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}
