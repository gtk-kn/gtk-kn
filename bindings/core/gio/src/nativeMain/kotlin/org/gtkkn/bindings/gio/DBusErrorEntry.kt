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
import org.gtkkn.native.gio.GDBusErrorEntry
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gint
import kotlin.String

/**
 * Struct used in g_dbus_error_register_error_domain().
 * @since 2.26
 */
@GioVersion2_26
public class DBusErrorEntry(public val gioDBusErrorEntryPointer: CPointer<GDBusErrorEntry>) :
    ProxyInstance(gioDBusErrorEntryPointer) {
    /**
     * An error code.
     */
    public var errorCode: gint
        get() = gioDBusErrorEntryPointer.pointed.error_code

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusErrorEntryPointer.pointed.error_code = value
        }

    /**
     * The D-Bus error name to associate with @error_code.
     */
    public var dbusErrorName: String?
        get() = gioDBusErrorEntryPointer.pointed.dbus_error_name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusErrorEntryPointer.pointed.dbus_error_name?.let { g_free(it) }
            gioDBusErrorEntryPointer.pointed.dbus_error_name = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new DBusErrorEntry.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GDBusErrorEntry>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new DBusErrorEntry using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GDBusErrorEntry>().ptr)

    /**
     * Allocate a new DBusErrorEntry.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param errorCode An error code.
     * @param dbusErrorName The D-Bus error name to associate with @error_code.
     */
    public constructor(errorCode: gint, dbusErrorName: String?) : this() {
        this.errorCode = errorCode
        this.dbusErrorName = dbusErrorName
    }

    /**
     * Allocate a new DBusErrorEntry using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param errorCode An error code.
     * @param dbusErrorName The D-Bus error name to associate with @error_code.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        errorCode: gint,
        dbusErrorName: String?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.errorCode = errorCode
        this.dbusErrorName = dbusErrorName
    }

    override fun toString(): String = "DBusErrorEntry(errorCode=$errorCode, dbusErrorName=$dbusErrorName)"
}
