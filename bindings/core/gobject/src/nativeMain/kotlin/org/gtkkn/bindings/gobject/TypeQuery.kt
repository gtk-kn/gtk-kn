// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GTypeQuery
import kotlin.String
import kotlin.UInt
import kotlin.ULong

/**
 * A structure holding information for a specific type.
 *
 * See also: g_type_query()
 */
public class TypeQuery(
    pointer: CPointer<GTypeQuery>,
) : Record {
    public val gobjectTypeQueryPointer: CPointer<GTypeQuery> = pointer

    /**
     * the #GType value of the type
     */
    public var type: ULong
        get() = gobjectTypeQueryPointer.pointed.type
        set(`value`) {
            gobjectTypeQueryPointer.pointed.type = value
        }

    /**
     * the name of the type
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val typeName: String?
        get() = gobjectTypeQueryPointer.pointed.type_name?.toKString()

    /**
     * the size of the class structure
     */
    public var classSize: UInt
        get() = gobjectTypeQueryPointer.pointed.class_size
        set(`value`) {
            gobjectTypeQueryPointer.pointed.class_size = value
        }

    /**
     * the size of the instance structure
     */
    public var instanceSize: UInt
        get() = gobjectTypeQueryPointer.pointed.instance_size
        set(`value`) {
            gobjectTypeQueryPointer.pointed.instance_size = value
        }

    public companion object : RecordCompanion<TypeQuery, GTypeQuery> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TypeQuery = TypeQuery(pointer.reinterpret())
    }
}
