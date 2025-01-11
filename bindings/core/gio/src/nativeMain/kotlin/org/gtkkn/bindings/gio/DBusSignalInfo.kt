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
import org.gtkkn.native.gio.GDBusSignalInfo
import org.gtkkn.native.gio.g_dbus_signal_info_get_type
import org.gtkkn.native.gio.g_dbus_signal_info_ref
import org.gtkkn.native.gio.g_dbus_signal_info_unref
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
 * Information about a signal on a D-Bus interface.
 *
 * ## Skipped during bindings generation
 *
 * - field `args`: Array parameter of type DBusArgInfo is not supported
 * - field `annotations`: Array parameter of type DBusAnnotationInfo is not supported
 *
 * @since 2.26
 */
@GioVersion2_26
public class DBusSignalInfo(public val gioDBusSignalInfoPointer: CPointer<GDBusSignalInfo>, cleaner: Cleaner? = null) :
    ProxyInstance(gioDBusSignalInfoPointer) {
    /**
     * The reference count or -1 if statically allocated.
     */
    public var refCount: gint
        get() = gioDBusSignalInfoPointer.pointed.ref_count

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusSignalInfoPointer.pointed.ref_count = value
        }

    /**
     * The name of the D-Bus signal, e.g. "NameOwnerChanged".
     */
    public var name: String?
        get() = gioDBusSignalInfoPointer.pointed.name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusSignalInfoPointer.pointed.name?.let { g_free(it) }
            gioDBusSignalInfoPointer.pointed.name = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new DBusSignalInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GDBusSignalInfo>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to DBusSignalInfo and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GDBusSignalInfo>, Cleaner>,
    ) : this(gioDBusSignalInfoPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new DBusSignalInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GDBusSignalInfo>().ptr)

    /**
     * Allocate a new DBusSignalInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param refCount The reference count or -1 if statically allocated.
     * @param name The name of the D-Bus signal, e.g. "NameOwnerChanged".
     */
    public constructor(refCount: gint, name: String?) : this() {
        this.refCount = refCount
        this.name = name
    }

    /**
     * Allocate a new DBusSignalInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param refCount The reference count or -1 if statically allocated.
     * @param name The name of the D-Bus signal, e.g. "NameOwnerChanged".
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        refCount: gint,
        name: String?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.refCount = refCount
        this.name = name
    }

    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     *
     * @return The same @info.
     * @since 2.26
     */
    @GioVersion2_26
    public fun ref(): DBusSignalInfo = g_dbus_signal_info_ref(gioDBusSignalInfoPointer)!!.run {
        DBusSignalInfo(this)
    }

    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public fun unref(): Unit = g_dbus_signal_info_unref(gioDBusSignalInfoPointer)

    override fun toString(): String = "DBusSignalInfo(refCount=$refCount, name=$name)"

    public companion object {
        /**
         * Get the GType of DBusSignalInfo
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_signal_info_get_type()
    }
}
