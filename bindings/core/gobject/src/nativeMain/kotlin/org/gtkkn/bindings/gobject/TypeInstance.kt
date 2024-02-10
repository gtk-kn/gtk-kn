// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GTypeInstance

/**
 * An opaque structure used as the base of all type instances.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_private`: Return type gpointer is unsupported
 * - field `g_class`: Record field g_class is private
 */
public class TypeInstance(
    pointer: CPointer<GTypeInstance>,
) : Record {
    public val gobjectTypeInstancePointer: CPointer<GTypeInstance> = pointer

    public companion object : RecordCompanion<TypeInstance, GTypeInstance> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TypeInstance =
            TypeInstance(pointer.reinterpret())
    }
}
