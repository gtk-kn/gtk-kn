// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkSnapshot
import org.gtkkn.native.gdk.gdk_snapshot_get_type

/**
 * Base type for snapshot operations.
 *
 * The subclass of `GdkSnapshot` used by GTK is [GtkSnapshot](../gtk4/class.Snapshot.html).
 */
public open class Snapshot(
    pointer: CPointer<GdkSnapshot>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gdkSnapshotPointer: CPointer<GdkSnapshot>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<Snapshot> {
        override val type: GeneratedClassKGType<Snapshot> =
            GeneratedClassKGType(gdk_snapshot_get_type()) { Snapshot(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}
