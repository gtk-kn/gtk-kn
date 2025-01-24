// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPadEvent
import org.gtkkn.native.gdk.gdk_pad_event_get_button
import org.gtkkn.native.gdk.gdk_pad_event_get_type
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType

/**
 * An event related to a pad-based device.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `index`: index: Out parameter is not supported
 * - parameter `group`: group: Out parameter is not supported
 */
public open class PadEvent(public val gdkPadEventPointer: CPointer<GdkPadEvent>) :
    Event(gdkPadEventPointer.reinterpret()),
    KGTyped {
    /**
     * Extracts information about the pressed button from
     * a pad event.
     *
     * @return the button of @event
     */
    public open fun getButton(): guint = gdk_pad_event_get_button(gdkPadEventPointer.reinterpret())

    public companion object : TypeCompanion<PadEvent> {
        override val type: GeneratedClassKGType<PadEvent> =
            GeneratedClassKGType(gdk_pad_event_get_type()) { PadEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of PadEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_pad_event_get_type()
    }
}
