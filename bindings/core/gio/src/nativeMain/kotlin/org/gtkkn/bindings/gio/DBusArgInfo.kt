// This is a generated file. Do not modify.
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
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GDBusArgInfo
import org.gtkkn.native.gio.g_dbus_arg_info_get_type
import org.gtkkn.native.gio.g_dbus_arg_info_ref
import org.gtkkn.native.gio.g_dbus_arg_info_unref
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Information about an argument for a method or a signal.
 *
 * ## Skipped during bindings generation
 *
 * - field `annotations`: Array parameter of type DBusAnnotationInfo is not supported
 *
 * @since 2.26
 */
@GioVersion2_26
public class DBusArgInfo(public val gioDBusArgInfoPointer: CPointer<GDBusArgInfo>, cleaner: Cleaner? = null) :
    ProxyInstance(gioDBusArgInfoPointer) {
    /**
     * The reference count or -1 if statically allocated.
     */
    public var refCount: gint
        get() = gioDBusArgInfoPointer.pointed.ref_count

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusArgInfoPointer.pointed.ref_count = value
        }

    /**
     * Name of the argument, e.g. @unix_user_id.
     */
    public var name: String?
        get() = gioDBusArgInfoPointer.pointed.name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusArgInfoPointer.pointed.name?.let { g_free(it) }
            gioDBusArgInfoPointer.pointed.name = value?.let { g_strdup(it) }
        }

    /**
     * D-Bus signature of the argument (a single complete type).
     */
    public var signature: String?
        get() = gioDBusArgInfoPointer.pointed.signature?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusArgInfoPointer.pointed.signature?.let { g_free(it) }
            gioDBusArgInfoPointer.pointed.signature = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new DBusArgInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GDBusArgInfo>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to DBusArgInfo and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GDBusArgInfo>, Cleaner>,
    ) : this(gioDBusArgInfoPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new DBusArgInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GDBusArgInfo>().ptr)

    /**
     * Allocate a new DBusArgInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param refCount The reference count or -1 if statically allocated.
     * @param name Name of the argument, e.g. @unix_user_id.
     * @param signature D-Bus signature of the argument (a single complete type).
     */
    public constructor(
        refCount: gint,
        name: String?,
        signature: String?,
    ) : this() {
        this.refCount = refCount
        this.name = name
        this.signature = signature
    }

    /**
     * Allocate a new DBusArgInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param refCount The reference count or -1 if statically allocated.
     * @param name Name of the argument, e.g. @unix_user_id.
     * @param signature D-Bus signature of the argument (a single complete type).
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        refCount: gint,
        name: String?,
        signature: String?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.refCount = refCount
        this.name = name
        this.signature = signature
    }

    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     *
     * @return The same @info.
     * @since 2.26
     */
    @GioVersion2_26
    public fun ref(): DBusArgInfo = g_dbus_arg_info_ref(gioDBusArgInfoPointer)!!.run {
        DBusArgInfo(this)
    }

    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public fun unref(): Unit = g_dbus_arg_info_unref(gioDBusArgInfoPointer)

    override fun toString(): String = "DBusArgInfo(refCount=$refCount, name=$name, signature=$signature)"

    public companion object {
        /**
         * Get the GType of DBusArgInfo
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_arg_info_get_type()
    }
}
