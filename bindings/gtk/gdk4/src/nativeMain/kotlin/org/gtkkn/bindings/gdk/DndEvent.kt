// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
    init {
        Gdk
    }

    /**
     * Gets the `GdkDrop` object from a DND event.
     *
     * @return the drop
     */
    public open fun getDrop(): Drop? = gdk_dnd_event_get_drop(gdkDndEventPointer.reinterpret())?.run {
        InstanceCache.get(this, true) { Drop.DropImpl(reinterpret()) }!!
    }

    public companion object : TypeCompanion<DndEvent> {
        override val type: GeneratedClassKGType<DndEvent> =
            GeneratedClassKGType(getTypeOrNull()!!) { DndEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of DNDEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_dnd_event_get_type()

        /**
         * Gets the GType of from the symbol `gdk_dnd_event_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_dnd_event_get_type")
    }
}
