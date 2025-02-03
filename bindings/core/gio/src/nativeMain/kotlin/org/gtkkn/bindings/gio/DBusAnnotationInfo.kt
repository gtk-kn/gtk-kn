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
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GDBusAnnotationInfo
import org.gtkkn.native.gio.g_dbus_annotation_info_get_type
import org.gtkkn.native.gio.g_dbus_annotation_info_ref
import org.gtkkn.native.gio.g_dbus_annotation_info_unref
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit

/**
 * Information about an annotation.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `annotations`: Array parameter of type DBusAnnotationInfo is not supported
 * - field `annotations`: Array parameter of type DBusAnnotationInfo is not supported
 *
 * @since 2.26
 */
@GioVersion2_26
public class DBusAnnotationInfo(public val gioDBusAnnotationInfoPointer: CPointer<GDBusAnnotationInfo>) :
    ProxyInstance(gioDBusAnnotationInfoPointer) {
    /**
     * The reference count or -1 if statically allocated.
     */
    public var refCount: gint
        get() = gioDBusAnnotationInfoPointer.pointed.ref_count

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusAnnotationInfoPointer.pointed.ref_count = value
        }

    /**
     * The name of the annotation, e.g. "org.freedesktop.DBus.Deprecated".
     */
    public var key: String?
        get() = gioDBusAnnotationInfoPointer.pointed.key?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusAnnotationInfoPointer.pointed.key?.let { g_free(it) }
            gioDBusAnnotationInfoPointer.pointed.key = value?.let { g_strdup(it) }
        }

    /**
     * The value of the annotation.
     */
    public var `value`: String?
        get() = gioDBusAnnotationInfoPointer.pointed.value?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusAnnotationInfoPointer.pointed.value?.let { g_free(it) }
            gioDBusAnnotationInfoPointer.pointed.value = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new DBusAnnotationInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GDBusAnnotationInfo>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new DBusAnnotationInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GDBusAnnotationInfo>().ptr)

    /**
     * Allocate a new DBusAnnotationInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param refCount The reference count or -1 if statically allocated.
     * @param key The name of the annotation, e.g. "org.freedesktop.DBus.Deprecated".
     * @param value The value of the annotation.
     */
    public constructor(
        refCount: gint,
        key: String?,
        `value`: String?,
    ) : this() {
        this.refCount = refCount
        this.key = key
        this.value = value
    }

    /**
     * Allocate a new DBusAnnotationInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param refCount The reference count or -1 if statically allocated.
     * @param key The name of the annotation, e.g. "org.freedesktop.DBus.Deprecated".
     * @param value The value of the annotation.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        refCount: gint,
        key: String?,
        `value`: String?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.refCount = refCount
        this.key = key
        this.value = value
    }

    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     *
     * @return The same @info.
     * @since 2.26
     */
    @GioVersion2_26
    public fun ref(): DBusAnnotationInfo = g_dbus_annotation_info_ref(gioDBusAnnotationInfoPointer)!!.run {
        DBusAnnotationInfo(this)
    }

    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public fun unref(): Unit = g_dbus_annotation_info_unref(gioDBusAnnotationInfoPointer)

    override fun toString(): String = "DBusAnnotationInfo(refCount=$refCount, key=$key, value=$value)"

    public companion object {
        /**
         * Get the GType of DBusAnnotationInfo
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_annotation_info_get_type()
    }
}
