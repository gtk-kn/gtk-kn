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
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.GTypeQuery
import kotlin.String

/**
 * A structure holding information for a specific type.
 *
 * See also: g_type_query()
 */
public class TypeQuery(public val gobjectTypeQueryPointer: CPointer<GTypeQuery>) :
    ProxyInstance(gobjectTypeQueryPointer) {
    /**
     * the #GType value of the type
     */
    public var type: GType
        get() = gobjectTypeQueryPointer.pointed.type

        @UnsafeFieldSetter
        set(`value`) {
            gobjectTypeQueryPointer.pointed.type = value
        }

    /**
     * the name of the type
     */
    public var typeName: String?
        get() = gobjectTypeQueryPointer.pointed.type_name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gobjectTypeQueryPointer.pointed.type_name?.let { g_free(it) }
            gobjectTypeQueryPointer.pointed.type_name = value?.let { g_strdup(it) }
        }

    /**
     * the size of the class structure
     */
    public var classSize: guint
        get() = gobjectTypeQueryPointer.pointed.class_size

        @UnsafeFieldSetter
        set(`value`) {
            gobjectTypeQueryPointer.pointed.class_size = value
        }

    /**
     * the size of the instance structure
     */
    public var instanceSize: guint
        get() = gobjectTypeQueryPointer.pointed.instance_size

        @UnsafeFieldSetter
        set(`value`) {
            gobjectTypeQueryPointer.pointed.instance_size = value
        }

    /**
     * Allocate a new TypeQuery.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GTypeQuery>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new TypeQuery using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTypeQuery>().ptr)

    /**
     * Allocate a new TypeQuery.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param type the #GType value of the type
     * @param typeName the name of the type
     * @param classSize the size of the class structure
     * @param instanceSize the size of the instance structure
     */
    public constructor(
        type: GType,
        typeName: String?,
        classSize: guint,
        instanceSize: guint,
    ) : this() {
        this.type = type
        this.typeName = typeName
        this.classSize = classSize
        this.instanceSize = instanceSize
    }

    /**
     * Allocate a new TypeQuery using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param type the #GType value of the type
     * @param typeName the name of the type
     * @param classSize the size of the class structure
     * @param instanceSize the size of the instance structure
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        type: GType,
        typeName: String?,
        classSize: guint,
        instanceSize: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.type = type
        this.typeName = typeName
        this.classSize = classSize
        this.instanceSize = instanceSize
    }

    override fun toString(): String =
        "TypeQuery(type=$type, typeName=$typeName, classSize=$classSize, instanceSize=$instanceSize)"
}
