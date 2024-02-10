// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkButtonEvent
import org.gtkkn.native.gdk.gdk_button_event_get_button
import org.gtkkn.native.gdk.gdk_button_event_get_type
import kotlin.UInt

/**
 * An event related to a button on a pointer device.
 */
public open class ButtonEvent(
    pointer: CPointer<GdkButtonEvent>,
) : Event(pointer.reinterpret()), KGTyped {
    public val gdkButtonEventPointer: CPointer<GdkButtonEvent>
        get() = gPointer.reinterpret()

    /**
     * Extract the button number from a button event.
     *
     * @return the button of @event
     */
    public open fun getButton(): UInt = gdk_button_event_get_button(gdkButtonEventPointer.reinterpret())

    public companion object : TypeCompanion<ButtonEvent> {
        override val type: GeneratedClassKGType<ButtonEvent> =
            GeneratedClassKGType(gdk_button_event_get_type()) { ButtonEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}
