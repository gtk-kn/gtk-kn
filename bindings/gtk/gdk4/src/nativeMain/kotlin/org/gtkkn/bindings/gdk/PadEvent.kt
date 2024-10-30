// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPadEvent
import org.gtkkn.native.gdk.gdk_pad_event_get_button
import org.gtkkn.native.gdk.gdk_pad_event_get_type
import kotlin.UInt

/**
 * An event related to a pad-based device.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `index`: index: Out parameter is not supported
 * - parameter `group`: group: Out parameter is not supported
 */
public open class PadEvent(
    pointer: CPointer<GdkPadEvent>,
) : Event(pointer.reinterpret()),
    KGTyped {
    public val gdkPadEventPointer: CPointer<GdkPadEvent>
        get() = gPointer.reinterpret()

    /**
     * Extracts information about the pressed button from
     * a pad event.
     *
     * @return the button of @event
     */
    public open fun getButton(): UInt = gdk_pad_event_get_button(gdkPadEventPointer.reinterpret())

    public companion object : TypeCompanion<PadEvent> {
        override val type: GeneratedClassKGType<PadEvent> =
            GeneratedClassKGType(gdk_pad_event_get_type()) { PadEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}
