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
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint16
import org.gtkkn.native.gobject.GTypeInfo
import kotlin.String

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
 * - field `instance_init`: InstanceInitFunc
 */
public class TypeInfo(public val gobjectTypeInfoPointer: CPointer<GTypeInfo>) : ProxyInstance(gobjectTypeInfoPointer) {
    /**
     * Size of the class structure (required for interface, classed and instantiatable types)
     */
    public var classSize: guint16
        get() = gobjectTypeInfoPointer.pointed.class_size

        @UnsafeFieldSetter
        set(`value`) {
            gobjectTypeInfoPointer.pointed.class_size = value
        }

    /**
     * User-supplied data passed to the class init/finalize functions
     */
    public var classData: gpointer
        get() = gobjectTypeInfoPointer.pointed.class_data!!

        @UnsafeFieldSetter
        set(`value`) {
            gobjectTypeInfoPointer.pointed.class_data = value
        }

    /**
     * Size of the instance (object) structure (required for instantiatable types only)
     */
    public var instanceSize: guint16
        get() = gobjectTypeInfoPointer.pointed.instance_size

        @UnsafeFieldSetter
        set(`value`) {
            gobjectTypeInfoPointer.pointed.instance_size = value
        }

    /**
     * Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10 this field is ignored.
     */
    public var nPreallocs: guint16
        get() = gobjectTypeInfoPointer.pointed.n_preallocs

        @UnsafeFieldSetter
        set(`value`) {
            gobjectTypeInfoPointer.pointed.n_preallocs = value
        }

    /**
     * A #GTypeValueTable function table for generic handling of GValues
     *  of this type (usually only useful for fundamental types)
     */
    public var valueTable: TypeValueTable?
        get() = gobjectTypeInfoPointer.pointed.value_table?.run {
            TypeValueTable(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gobjectTypeInfoPointer.pointed.value_table = value?.gobjectTypeValueTablePointer
        }

    /**
     * Allocate a new TypeInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GTypeInfo>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new TypeInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTypeInfo>().ptr)

    /**
     * Allocate a new TypeInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param classSize Size of the class structure (required for interface, classed and instantiatable types)
     * @param classData User-supplied data passed to the class init/finalize functions
     * @param instanceSize Size of the instance (object) structure (required for instantiatable types only)
     * @param nPreallocs Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10 this field is ignored.
     * @param valueTable A #GTypeValueTable function table for generic handling of GValues
     *  of this type (usually only useful for fundamental types)
     */
    public constructor(
        classSize: guint16,
        classData: gpointer,
        instanceSize: guint16,
        nPreallocs: guint16,
        valueTable: TypeValueTable?,
    ) : this() {
        this.classSize = classSize
        this.classData = classData
        this.instanceSize = instanceSize
        this.nPreallocs = nPreallocs
        this.valueTable = valueTable
    }

    /**
     * Allocate a new TypeInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param classSize Size of the class structure (required for interface, classed and instantiatable types)
     * @param classData User-supplied data passed to the class init/finalize functions
     * @param instanceSize Size of the instance (object) structure (required for instantiatable types only)
     * @param nPreallocs Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10 this field is ignored.
     * @param valueTable A #GTypeValueTable function table for generic handling of GValues
     *  of this type (usually only useful for fundamental types)
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        classSize: guint16,
        classData: gpointer,
        instanceSize: guint16,
        nPreallocs: guint16,
        valueTable: TypeValueTable?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.classSize = classSize
        this.classData = classData
        this.instanceSize = instanceSize
        this.nPreallocs = nPreallocs
        this.valueTable = valueTable
    }

    override fun toString(): String =
        "TypeInfo(classSize=$classSize, classData=$classData, instanceSize=$instanceSize, nPreallocs=$nPreallocs, valueTable=$valueTable)"
}
