// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkTouchEvent
import org.gtkkn.native.gdk.gdk_touch_event_get_emulating_pointer
import org.gtkkn.native.gdk.gdk_touch_event_get_type
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * An event related to a touch-based device.
 */
public open class TouchEvent(public val gdkTouchEventPointer: CPointer<GdkTouchEvent>) :
    Event(gdkTouchEventPointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

    /**
     * Extracts whether a touch event is emulating a pointer event.
     *
     * @return true if @event is emulating
     */
    public open fun getEmulatingPointer(): Boolean =
        gdk_touch_event_get_emulating_pointer(gdkTouchEventPointer.reinterpret()).asBoolean()

    public companion object : TypeCompanion<TouchEvent> {
        override val type: GeneratedClassKGType<TouchEvent> =
            GeneratedClassKGType(getTypeOrNull()!!) { TouchEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of TouchEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_touch_event_get_type()

        /**
         * Gets the GType of from the symbol `gdk_touch_event_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_touch_event_get_type")
    }
}
