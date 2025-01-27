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
import org.gtkkn.native.gdk.GdkDeleteEvent
import org.gtkkn.native.gdk.gdk_delete_event_get_type
import org.gtkkn.native.gobject.GType

/**
 * An event related to closing a top-level surface.
 */
public open class DeleteEvent(public val gdkDeleteEventPointer: CPointer<GdkDeleteEvent>) :
    Event(gdkDeleteEventPointer.reinterpret()),
    KGTyped {
    public companion object : TypeCompanion<DeleteEvent> {
        override val type: GeneratedClassKGType<DeleteEvent> =
            GeneratedClassKGType(getTypeOrNull("gdk_delete_event_get_type")!!) { DeleteEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of DeleteEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_delete_event_get_type()
    }
}
