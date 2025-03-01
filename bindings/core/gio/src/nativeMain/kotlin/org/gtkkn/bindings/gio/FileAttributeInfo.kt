// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

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
import org.gtkkn.native.gio.GFileAttributeInfo
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import kotlin.String

/**
 * Information about a specific attribute.
 */
public class FileAttributeInfo(public val gioFileAttributeInfoPointer: CPointer<GFileAttributeInfo>) :
    ProxyInstance(gioFileAttributeInfoPointer) {
    /**
     * the name of the attribute.
     */
    public var name: String?
        get() = gioFileAttributeInfoPointer.pointed.name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gioFileAttributeInfoPointer.pointed.name?.let { g_free(it) }
            gioFileAttributeInfoPointer.pointed.name = value?.let { g_strdup(it) }
        }

    /**
     * the #GFileAttributeType type of the attribute.
     */
    public var type: FileAttributeType
        get() = gioFileAttributeInfoPointer.pointed.type.run {
            FileAttributeType.fromNativeValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gioFileAttributeInfoPointer.pointed.type = value.nativeValue
        }

    /**
     * a set of #GFileAttributeInfoFlags.
     */
    public var flags: FileAttributeInfoFlags
        get() = gioFileAttributeInfoPointer.pointed.flags.run {
            FileAttributeInfoFlags(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gioFileAttributeInfoPointer.pointed.flags = value.mask
        }

    /**
     * Allocate a new FileAttributeInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GFileAttributeInfo>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new FileAttributeInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GFileAttributeInfo>().ptr)

    /**
     * Allocate a new FileAttributeInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param name the name of the attribute.
     * @param type the #GFileAttributeType type of the attribute.
     * @param flags a set of #GFileAttributeInfoFlags.
     */
    public constructor(
        name: String?,
        type: FileAttributeType,
        flags: FileAttributeInfoFlags,
    ) : this() {
        this.name = name
        this.type = type
        this.flags = flags
    }

    /**
     * Allocate a new FileAttributeInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param name the name of the attribute.
     * @param type the #GFileAttributeType type of the attribute.
     * @param flags a set of #GFileAttributeInfoFlags.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        name: String?,
        type: FileAttributeType,
        flags: FileAttributeInfoFlags,
        scope: AutofreeScope,
    ) : this(scope) {
        this.name = name
        this.type = type
        this.flags = flags
    }

    override fun toString(): String = "FileAttributeInfo(name=$name, type=$type, flags=$flags)"
}
