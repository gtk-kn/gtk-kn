// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkSnapshot
import org.gtkkn.native.gdk.gdk_snapshot_get_type
import org.gtkkn.native.gobject.GType

/**
 * Base type for snapshot operations.
 *
 * The subclass of `GdkSnapshot` used by GTK is [GtkSnapshot](../gtk4/class.Snapshot.html).
 */
public abstract class Snapshot(public val gdkSnapshotPointer: CPointer<GdkSnapshot>) :
    Object(gdkSnapshotPointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

    /**
     * The SnapshotImpl type represents a native instance of the abstract Snapshot class.
     *
     * @constructor Creates a new instance of Snapshot for the provided [CPointer].
     */
    public class SnapshotImpl(pointer: CPointer<GdkSnapshot>) : Snapshot(pointer)

    public companion object : TypeCompanion<Snapshot> {
        override val type: GeneratedClassKGType<Snapshot> =
            GeneratedClassKGType(getTypeOrNull()!!) { SnapshotImpl(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of Snapshot
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_snapshot_get_type()

        /**
         * Gets the GType of from the symbol `gdk_snapshot_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_snapshot_get_type")
    }
}
