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
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GDBusInterfaceInfo
import org.gtkkn.native.gio.g_dbus_interface_info_cache_build
import org.gtkkn.native.gio.g_dbus_interface_info_cache_release
import org.gtkkn.native.gio.g_dbus_interface_info_generate_xml
import org.gtkkn.native.gio.g_dbus_interface_info_get_type
import org.gtkkn.native.gio.g_dbus_interface_info_lookup_method
import org.gtkkn.native.gio.g_dbus_interface_info_lookup_property
import org.gtkkn.native.gio.g_dbus_interface_info_lookup_signal
import org.gtkkn.native.gio.g_dbus_interface_info_ref
import org.gtkkn.native.gio.g_dbus_interface_info_unref
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner
import kotlin.String as KotlinString
import org.gtkkn.bindings.glib.String as GlibString

/**
 * Information about a D-Bus interface.
 *
 * ## Skipped during bindings generation
 *
 * - field `methods`: Array parameter of type DBusMethodInfo is not supported
 * - field `signals`: Array parameter of type DBusSignalInfo is not supported
 * - field `properties`: Array parameter of type DBusPropertyInfo is not supported
 * - field `annotations`: Array parameter of type DBusAnnotationInfo is not supported
 *
 * @since 2.26
 */
@GioVersion2_26
public class DBusInterfaceInfo(pointer: CPointer<GDBusInterfaceInfo>, cleaner: Cleaner? = null) :
    ProxyInstance(pointer) {
    public val gPointer: CPointer<GDBusInterfaceInfo> = pointer

    /**
     * The reference count or -1 if statically allocated.
     */
    public var refCount: gint
        get() = gPointer.pointed.ref_count

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.ref_count = value
        }

    /**
     * The name of the D-Bus interface, e.g. "org.freedesktop.DBus.Properties".
     */
    public var name: KotlinString?
        get() = gPointer.pointed.name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.name?.let { g_free(it) }
            gPointer.pointed.name = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new DBusInterfaceInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GDBusInterfaceInfo>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to DBusInterfaceInfo and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GDBusInterfaceInfo>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new DBusInterfaceInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GDBusInterfaceInfo>().ptr)

    /**
     * Allocate a new DBusInterfaceInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param refCount The reference count or -1 if statically allocated.
     * @param name The name of the D-Bus interface, e.g. "org.freedesktop.DBus.Properties".
     */
    public constructor(refCount: gint, name: KotlinString?) : this() {
        this.refCount = refCount
        this.name = name
    }

    /**
     * Allocate a new DBusInterfaceInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param refCount The reference count or -1 if statically allocated.
     * @param name The name of the D-Bus interface, e.g. "org.freedesktop.DBus.Properties".
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        refCount: gint,
        name: KotlinString?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.refCount = refCount
        this.name = name
    }

    /**
     * Builds a lookup-cache to speed up
     * g_dbus_interface_info_lookup_method(),
     * g_dbus_interface_info_lookup_signal() and
     * g_dbus_interface_info_lookup_property().
     *
     * If this has already been called with @info, the existing cache is
     * used and its use count is increased.
     *
     * Note that @info cannot be modified until
     * g_dbus_interface_info_cache_release() is called.
     *
     * @since 2.30
     */
    @GioVersion2_30
    public fun cacheBuild(): Unit = g_dbus_interface_info_cache_build(gPointer.reinterpret())

    /**
     * Decrements the usage count for the cache for @info built by
     * g_dbus_interface_info_cache_build() (if any) and frees the
     * resources used by the cache if the usage count drops to zero.
     *
     * @since 2.30
     */
    @GioVersion2_30
    public fun cacheRelease(): Unit = g_dbus_interface_info_cache_release(gPointer.reinterpret())

    /**
     * Appends an XML representation of @info (and its children) to @string_builder.
     *
     * This function is typically used for generating introspection XML
     * documents at run-time for handling the
     * `org.freedesktop.DBus.Introspectable.Introspect`
     * method.
     *
     * @param indent Indentation level.
     * @param stringBuilder A #GString to to append XML data to.
     * @since 2.26
     */
    @GioVersion2_26
    public fun generateXml(indent: guint, stringBuilder: GlibString): Unit =
        g_dbus_interface_info_generate_xml(gPointer.reinterpret(), indent, stringBuilder.gPointer.reinterpret())

    /**
     * Looks up information about a method.
     *
     * The cost of this function is O(n) in number of methods unless
     * g_dbus_interface_info_cache_build() has been used on @info.
     *
     * @param name A D-Bus method name (typically in CamelCase)
     * @return A #GDBusMethodInfo or null if not found. Do not free, it is owned by @info.
     * @since 2.26
     */
    @GioVersion2_26
    public fun lookupMethod(name: KotlinString): DBusMethodInfo? =
        g_dbus_interface_info_lookup_method(gPointer.reinterpret(), name)?.run {
            DBusMethodInfo(reinterpret())
        }

    /**
     * Looks up information about a property.
     *
     * The cost of this function is O(n) in number of properties unless
     * g_dbus_interface_info_cache_build() has been used on @info.
     *
     * @param name A D-Bus property name (typically in CamelCase).
     * @return A #GDBusPropertyInfo or null if not found. Do not free, it is owned by @info.
     * @since 2.26
     */
    @GioVersion2_26
    public fun lookupProperty(name: KotlinString): DBusPropertyInfo? =
        g_dbus_interface_info_lookup_property(gPointer.reinterpret(), name)?.run {
            DBusPropertyInfo(reinterpret())
        }

    /**
     * Looks up information about a signal.
     *
     * The cost of this function is O(n) in number of signals unless
     * g_dbus_interface_info_cache_build() has been used on @info.
     *
     * @param name A D-Bus signal name (typically in CamelCase)
     * @return A #GDBusSignalInfo or null if not found. Do not free, it is owned by @info.
     * @since 2.26
     */
    @GioVersion2_26
    public fun lookupSignal(name: KotlinString): DBusSignalInfo? =
        g_dbus_interface_info_lookup_signal(gPointer.reinterpret(), name)?.run {
            DBusSignalInfo(reinterpret())
        }

    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     *
     * @return The same @info.
     * @since 2.26
     */
    @GioVersion2_26
    public fun ref(): DBusInterfaceInfo = g_dbus_interface_info_ref(gPointer.reinterpret())!!.run {
        DBusInterfaceInfo(reinterpret())
    }

    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public fun unref(): Unit = g_dbus_interface_info_unref(gPointer.reinterpret())

    override fun toString(): KotlinString = "DBusInterfaceInfo(refCount=$refCount, name=$name)"

    public companion object {
        /**
         * Get the GType of DBusInterfaceInfo
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_interface_info_get_type()
    }
}
