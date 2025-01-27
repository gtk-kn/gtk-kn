// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
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
public open class FocusEvent(public val gdkFocusEventPointer: CPointer<GdkFocusEvent>) :
    Event(gdkFocusEventPointer.reinterpret()),
    KGTyped {
    /**
     * Extracts whether this event is about focus entering or
     * leaving the surface.
     *
     * @return true of the focus is entering
     */
    public open fun getIn(): Boolean = gdk_focus_event_get_in(gdkFocusEventPointer.reinterpret()).asBoolean()

    public companion object : TypeCompanion<FocusEvent> {
        override val type: GeneratedClassKGType<FocusEvent> =
            GeneratedClassKGType(getTypeOrNull("gdk_focus_event_get_type")!!) { FocusEvent(it.reinterpret()) }

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
