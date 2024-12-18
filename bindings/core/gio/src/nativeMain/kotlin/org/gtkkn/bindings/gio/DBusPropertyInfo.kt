// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GDBusPropertyInfo
import org.gtkkn.native.gio.g_dbus_property_info_get_type
import org.gtkkn.native.gio.g_dbus_property_info_ref
import org.gtkkn.native.gio.g_dbus_property_info_unref
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Information about a D-Bus property on a D-Bus interface.
 *
 * ## Skipped during bindings generation
 *
 * - field `annotations`: Array parameter of type DBusAnnotationInfo is not supported
 *
 * @since 2.26
 */
@GioVersion2_26
public class DBusPropertyInfo(pointer: CPointer<GDBusPropertyInfo>, cleaner: Cleaner? = null) :
    ProxyInstance(pointer) {
    public val gioDBusPropertyInfoPointer: CPointer<GDBusPropertyInfo> = pointer

    /**
     * The reference count or -1 if statically allocated.
     */
    public var refCount: gint
        get() = gioDBusPropertyInfoPointer.pointed.ref_count

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusPropertyInfoPointer.pointed.ref_count = value
        }

    /**
     * The name of the D-Bus property, e.g. "SupportedFilesystems".
     */
    public var name: String?
        get() = gioDBusPropertyInfoPointer.pointed.name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusPropertyInfoPointer.pointed.name?.let { g_free(it) }
            gioDBusPropertyInfoPointer.pointed.name = value?.let { g_strdup(it) }
        }

    /**
     * The D-Bus signature of the property (a single complete type).
     */
    public var signature: String?
        get() = gioDBusPropertyInfoPointer.pointed.signature?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusPropertyInfoPointer.pointed.signature?.let { g_free(it) }
            gioDBusPropertyInfoPointer.pointed.signature = value?.let { g_strdup(it) }
        }

    /**
     * Access control flags for the property.
     */
    public var flags: DBusPropertyInfoFlags
        get() = gioDBusPropertyInfoPointer.pointed.flags.run {
            DBusPropertyInfoFlags(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gioDBusPropertyInfoPointer.pointed.flags = value.mask
        }

    /**
     * Allocate a new DBusPropertyInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GDBusPropertyInfo>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to DBusPropertyInfo and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GDBusPropertyInfo>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new DBusPropertyInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GDBusPropertyInfo>().ptr)

    /**
     * Allocate a new DBusPropertyInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param refCount The reference count or -1 if statically allocated.
     * @param name The name of the D-Bus property, e.g. "SupportedFilesystems".
     * @param signature The D-Bus signature of the property (a single complete type).
     * @param flags Access control flags for the property.
     */
    public constructor(
        refCount: gint,
        name: String?,
        signature: String?,
        flags: DBusPropertyInfoFlags,
    ) : this() {
        this.refCount = refCount
        this.name = name
        this.signature = signature
        this.flags = flags
    }

    /**
     * Allocate a new DBusPropertyInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param refCount The reference count or -1 if statically allocated.
     * @param name The name of the D-Bus property, e.g. "SupportedFilesystems".
     * @param signature The D-Bus signature of the property (a single complete type).
     * @param flags Access control flags for the property.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        refCount: gint,
        name: String?,
        signature: String?,
        flags: DBusPropertyInfoFlags,
        scope: AutofreeScope,
    ) : this(scope) {
        this.refCount = refCount
        this.name = name
        this.signature = signature
        this.flags = flags
    }

    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     *
     * @return The same @info.
     * @since 2.26
     */
    @GioVersion2_26
    public fun ref(): DBusPropertyInfo = g_dbus_property_info_ref(gioDBusPropertyInfoPointer.reinterpret())!!.run {
        DBusPropertyInfo(reinterpret())
    }

    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public fun unref(): Unit = g_dbus_property_info_unref(gioDBusPropertyInfoPointer.reinterpret())

    override fun toString(): String =
        "DBusPropertyInfo(refCount=$refCount, name=$name, signature=$signature, flags=$flags)"

    public companion object {
        /**
         * Get the GType of DBusPropertyInfo
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_property_info_get_type()
    }
}
