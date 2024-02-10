// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GParamSpecTypeInfo
import kotlin.ULong
import kotlin.UShort

/**
 * This structure is used to provide the type system with the information
 * required to initialize and destruct (finalize) a parameter's class and
 * instances thereof.
 *
 * The initialized structure is passed to the g_param_type_register_static()
 * The type system will perform a deep copy of this structure, so its memory
 * does not need to be persistent across invocation of
 * g_param_type_register_static().
 *
 * ## Skipped during bindings generation
 *
 * - field `instance_init`: Fields with callbacks are not supported
 * - field `finalize`: Fields with callbacks are not supported
 * - field `value_set_default`: Fields with callbacks are not supported
 * - field `value_validate`: Fields with callbacks are not supported
 * - field `values_cmp`: Fields with callbacks are not supported
 */
public class ParamSpecTypeInfo(
    pointer: CPointer<GParamSpecTypeInfo>,
) : Record {
    public val gobjectParamSpecTypeInfoPointer: CPointer<GParamSpecTypeInfo> = pointer

    /**
     * Size of the instance (object) structure.
     */
    public var instanceSize: UShort
        get() = gobjectParamSpecTypeInfoPointer.pointed.instance_size
        set(`value`) {
            gobjectParamSpecTypeInfoPointer.pointed.instance_size = value
        }

    /**
     * Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve
     * memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are
     * allocated with the [slice allocator][glib-Memory-Slices] now.
     */
    public var nPreallocs: UShort
        get() = gobjectParamSpecTypeInfoPointer.pointed.n_preallocs
        set(`value`) {
            gobjectParamSpecTypeInfoPointer.pointed.n_preallocs = value
        }

    /**
     * The #GType of values conforming to this #GParamSpec
     */
    public var valueType: ULong
        get() = gobjectParamSpecTypeInfoPointer.pointed.value_type
        set(`value`) {
            gobjectParamSpecTypeInfoPointer.pointed.value_type = value
        }

    public companion object : RecordCompanion<ParamSpecTypeInfo, GParamSpecTypeInfo> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ParamSpecTypeInfo =
            ParamSpecTypeInfo(pointer.reinterpret())
    }
}
