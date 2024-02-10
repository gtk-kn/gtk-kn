// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GTypeInfo
import kotlin.UShort

/**
 * This structure is used to provide the type system with the information
 * required to initialize and destruct (finalize) a type's class and
 * its instances.
 *
 * The initialized structure is passed to the g_type_register_static() function
 * (or is copied into the provided #GTypeInfo structure in the
 * g_type_plugin_complete_type_info()). The type system will perform a deep
 * copy of this structure, so its memory does not need to be persistent
 * across invocation of g_type_register_static().
 *
 * ## Skipped during bindings generation
 *
 * - field `base_init`: BaseInitFunc
 * - field `base_finalize`: BaseFinalizeFunc
 * - field `class_init`: ClassInitFunc
 * - field `class_finalize`: ClassFinalizeFunc
 * - field `class_data`: gpointer
 * - field `instance_init`: InstanceInitFunc
 */
public class TypeInfo(
    pointer: CPointer<GTypeInfo>,
) : Record {
    public val gobjectTypeInfoPointer: CPointer<GTypeInfo> = pointer

    /**
     * Size of the class structure (required for interface, classed and instantiatable types)
     */
    public var classSize: UShort
        get() = gobjectTypeInfoPointer.pointed.class_size
        set(`value`) {
            gobjectTypeInfoPointer.pointed.class_size = value
        }

    /**
     * Size of the instance (object) structure (required for instantiatable types only)
     */
    public var instanceSize: UShort
        get() = gobjectTypeInfoPointer.pointed.instance_size
        set(`value`) {
            gobjectTypeInfoPointer.pointed.instance_size = value
        }

    /**
     * Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve
     * memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are
     * allocated with the [slice allocator][glib-Memory-Slices] now.
     */
    public var nPreallocs: UShort
        get() = gobjectTypeInfoPointer.pointed.n_preallocs
        set(`value`) {
            gobjectTypeInfoPointer.pointed.n_preallocs = value
        }

    /**
     * A #GTypeValueTable function table for generic handling of GValues
     *  of this type (usually only useful for fundamental types)
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val valueTable: TypeValueTable?
        get() =
            gobjectTypeInfoPointer.pointed.value_table?.run {
                TypeValueTable(reinterpret())
            }

    public companion object : RecordCompanion<TypeInfo, GTypeInfo> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TypeInfo = TypeInfo(pointer.reinterpret())
    }
}
