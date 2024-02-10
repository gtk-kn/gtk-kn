// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GInterfaceInfo

/**
 * A structure that provides information to the type system which is
 * used specifically for managing interface types.
 *
 * ## Skipped during bindings generation
 *
 * - field `interface_init`: InterfaceInitFunc
 * - field `interface_finalize`: InterfaceFinalizeFunc
 * - field `interface_data`: gpointer
 */
public class InterfaceInfo(
    pointer: CPointer<GInterfaceInfo>,
) : Record {
    public val gobjectInterfaceInfoPointer: CPointer<GInterfaceInfo> = pointer

    public companion object : RecordCompanion<InterfaceInfo, GInterfaceInfo> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): InterfaceInfo =
            InterfaceInfo(pointer.reinterpret())
    }
}
