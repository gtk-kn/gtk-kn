// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.guint16
import org.gtkkn.native.gobject.GParamSpecTypeInfo
import org.gtkkn.native.gobject.GType
import kotlin.String

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
public class ParamSpecTypeInfo(public val gobjectParamSpecTypeInfoPointer: CPointer<GParamSpecTypeInfo>) :
    ProxyInstance(gobjectParamSpecTypeInfoPointer) {
    /**
     * Size of the instance (object) structure.
     */
    public var instanceSize: guint16
        get() = gobjectParamSpecTypeInfoPointer.pointed.instance_size

        @UnsafeFieldSetter
        set(`value`) {
            gobjectParamSpecTypeInfoPointer.pointed.instance_size = value
        }

    /**
     * Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are allocated with the [slice allocator][glib-Memory-Slices] now.
     */
    public var nPreallocs: guint16
        get() = gobjectParamSpecTypeInfoPointer.pointed.n_preallocs

        @UnsafeFieldSetter
        set(`value`) {
            gobjectParamSpecTypeInfoPointer.pointed.n_preallocs = value
        }

    /**
     * The #GType of values conforming to this #GParamSpec
     */
    public var valueType: GType
        get() = gobjectParamSpecTypeInfoPointer.pointed.value_type

        @UnsafeFieldSetter
        set(`value`) {
            gobjectParamSpecTypeInfoPointer.pointed.value_type = value
        }

    /**
     * Allocate a new ParamSpecTypeInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GParamSpecTypeInfo>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new ParamSpecTypeInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GParamSpecTypeInfo>().ptr)

    /**
     * Allocate a new ParamSpecTypeInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param instanceSize Size of the instance (object) structure.
     * @param nPreallocs Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are allocated with the [slice allocator][glib-Memory-Slices] now.
     * @param valueType The #GType of values conforming to this #GParamSpec
     */
    public constructor(
        instanceSize: guint16,
        nPreallocs: guint16,
        valueType: GType,
    ) : this() {
        this.instanceSize = instanceSize
        this.nPreallocs = nPreallocs
        this.valueType = valueType
    }

    /**
     * Allocate a new ParamSpecTypeInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param instanceSize Size of the instance (object) structure.
     * @param nPreallocs Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are allocated with the [slice allocator][glib-Memory-Slices] now.
     * @param valueType The #GType of values conforming to this #GParamSpec
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        instanceSize: guint16,
        nPreallocs: guint16,
        valueType: GType,
        scope: AutofreeScope,
    ) : this(scope) {
        this.instanceSize = instanceSize
        this.nPreallocs = nPreallocs
        this.valueType = valueType
    }

    override fun toString(): String =
        "ParamSpecTypeInfo(instanceSize=$instanceSize, nPreallocs=$nPreallocs, valueType=$valueType)"
}
