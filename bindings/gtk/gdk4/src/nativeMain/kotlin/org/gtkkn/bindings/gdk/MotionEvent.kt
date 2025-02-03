// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkMotionEvent
import org.gtkkn.native.gdk.gdk_motion_event_get_type
import org.gtkkn.native.gobject.GType

/**
 * An event related to a pointer or touch device motion.
 */
public open class MotionEvent(public val gdkMotionEventPointer: CPointer<GdkMotionEvent>) :
    Event(gdkMotionEventPointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

    public companion object : TypeCompanion<MotionEvent> {
        override val type: GeneratedClassKGType<MotionEvent> =
            GeneratedClassKGType(getTypeOrNull()!!) { MotionEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of MotionEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_motion_event_get_type()

        /**
         * Gets the GType of from the symbol `gdk_motion_event_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_motion_event_get_type")
    }
}
