// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDNDEvent
import org.gtkkn.native.gdk.gdk_dnd_event_get_drop
import org.gtkkn.native.gdk.gdk_dnd_event_get_type
import org.gtkkn.native.gobject.GType

/**
 * An event related to drag and drop operations.
 */
public open class DndEvent(public val gdkDndEventPointer: CPointer<GdkDNDEvent>) :
    Event(gdkDndEventPointer.reinterpret()),
    KGTyped {
    /**
     * Gets the `GdkDrop` object from a DND event.
     *
     * @return the drop
     */
    public open fun getDrop(): Drop? = gdk_dnd_event_get_drop(gdkDndEventPointer.reinterpret())?.run {
        Drop.DropImpl(this)
    }

    public companion object : TypeCompanion<DndEvent> {
        override val type: GeneratedClassKGType<DndEvent> =
            GeneratedClassKGType(getTypeOrNull("gdk_dnd_event_get_type")!!) { DndEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of DNDEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_dnd_event_get_type()
    }
}
