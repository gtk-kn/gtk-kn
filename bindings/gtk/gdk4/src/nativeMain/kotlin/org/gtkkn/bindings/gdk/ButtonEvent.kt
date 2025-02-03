// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkButtonEvent
import org.gtkkn.native.gdk.gdk_button_event_get_button
import org.gtkkn.native.gdk.gdk_button_event_get_type
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType

/**
 * An event related to a button on a pointer device.
 */
public open class ButtonEvent(public val gdkButtonEventPointer: CPointer<GdkButtonEvent>) :
    Event(gdkButtonEventPointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

    /**
     * Extract the button number from a button event.
     *
     * @return the button of @event
     */
    public open fun getButton(): guint = gdk_button_event_get_button(gdkButtonEventPointer.reinterpret())

    public companion object : TypeCompanion<ButtonEvent> {
        override val type: GeneratedClassKGType<ButtonEvent> =
            GeneratedClassKGType(getTypeOrNull()!!) { ButtonEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of ButtonEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_button_event_get_type()

        /**
         * Gets the GType of from the symbol `gdk_button_event_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_button_event_get_type")
    }
}
