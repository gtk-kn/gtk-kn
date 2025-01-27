// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.gio.annotations.GioVersion2_60
import org.gtkkn.bindings.gio.annotations.GioVersion2_78
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GResolver
import org.gtkkn.native.gio.g_resolver_free_addresses
import org.gtkkn.native.gio.g_resolver_free_targets
import org.gtkkn.native.gio.g_resolver_get_default
import org.gtkkn.native.gio.g_resolver_get_timeout
import org.gtkkn.native.gio.g_resolver_get_type
import org.gtkkn.native.gio.g_resolver_lookup_by_address
import org.gtkkn.native.gio.g_resolver_lookup_by_address_async
import org.gtkkn.native.gio.g_resolver_lookup_by_address_finish
import org.gtkkn.native.gio.g_resolver_lookup_by_name
import org.gtkkn.native.gio.g_resolver_lookup_by_name_async
import org.gtkkn.native.gio.g_resolver_lookup_by_name_finish
import org.gtkkn.native.gio.g_resolver_lookup_by_name_with_flags
import org.gtkkn.native.gio.g_resolver_lookup_by_name_with_flags_async
import org.gtkkn.native.gio.g_resolver_lookup_by_name_with_flags_finish
import org.gtkkn.native.gio.g_resolver_lookup_records
import org.gtkkn.native.gio.g_resolver_lookup_records_async
import org.gtkkn.native.gio.g_resolver_lookup_records_finish
import org.gtkkn.native.gio.g_resolver_lookup_service
import org.gtkkn.native.gio.g_resolver_lookup_service_async
import org.gtkkn.native.gio.g_resolver_lookup_service_finish
import org.gtkkn.native.gio.g_resolver_set_default
import org.gtkkn.native.gio.g_resolver_set_timeout
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The object that handles DNS resolution. Use [func@Gio.Resolver.get_default]
 * to get the default resolver.
 *
 * `GResolver` provides cancellable synchronous and asynchronous DNS
 * resolution, for hostnames ([method@Gio.Resolver.lookup_by_address],
 * [method@Gio.Resolver.lookup_by_name] and their async variants) and SRV
 * (service) records ([method@Gio.Resolver.lookup_service]).
 *
 * [class@Gio.NetworkAddress] and [class@Gio.NetworkService] provide wrappers
 * around `GResolver` functionality that also implement
 * [iface@Gio.SocketConnectable], making it easy to connect to a remote
 * host/service.
 *
 * The default resolver (see [func@Gio.Resolver.get_default]) has a timeout of
 * 30s set on it since GLib 2.78. Earlier versions of GLib did not support
 * resolver timeouts.
 *
 * This is an abstract type; subclasses of it implement different resolvers for
 * different platforms and situations.
 */
public abstract class Resolver(public val gioResolverPointer: CPointer<GResolver>) :
    Object(gioResolverPointer.reinterpret()),
    KGTyped {
    /**
     * The timeout applied to all resolver lookups, in milliseconds.
     *
     * This may be changed through the lifetime of the #GResolver. The new value
     * will apply to any lookups started after the change, but not to any
     * already-ongoing lookups.
     *
     * If this is `0`, no timeout is applied to lookups.
     *
     * No timeout was applied to lookups before this property was added in
     * GLib 2.78.
     *
     * @since 2.78
     */
    @GioVersion2_78
    public open var timeout: guint
        /**
         * Get the timeout applied to all resolver lookups. See #GResolver:timeout.
         *
         * @return the resolver timeout, in milliseconds, or `0` for no timeout
         * @since 2.78
         */
        get() = g_resolver_get_timeout(gioResolverPointer)

        /**
         * Set the timeout applied to all resolver lookups. See #GResolver:timeout.
         *
         * @param timeoutMs timeout in milliseconds, or `0` for no timeouts
         * @since 2.78
         */
        @GioVersion2_78
        set(timeoutMs) = g_resolver_set_timeout(gioResolverPointer, timeoutMs)

    /**
     * Synchronously reverse-resolves @address to determine its
     * associated hostname.
     *
     * If the DNS resolution fails, @error (if non-null) will be set to
     * a value from #GResolverError.
     *
     * If @cancellable is non-null, it can be used to cancel the
     * operation, in which case @error (if non-null) will be set to
     * %G_IO_ERROR_CANCELLED.
     *
     * @param address the address to reverse-resolve
     * @param cancellable a #GCancellable, or null
     * @return a hostname (either ASCII-only, or in ASCII-encoded
     *     form), or null on error.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun lookupByAddress(address: InetAddress, cancellable: Cancellable? = null): Result<String> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_resolver_lookup_by_address(
                gioResolverPointer,
                address.gioInetAddressPointer,
                cancellable?.gioCancellablePointer,
                gError.ptr
            )?.toKString()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Begins asynchronously reverse-resolving @address to determine its
     * associated hostname, and eventually calls @callback, which must
     * call g_resolver_lookup_by_address_finish() to get the final result.
     *
     * @param address the address to reverse-resolve
     * @param cancellable a #GCancellable, or null
     * @param callback callback to call after resolution completes
     * @since 2.22
     */
    @GioVersion2_22
    public open fun lookupByAddressAsync(
        address: InetAddress,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_resolver_lookup_by_address_async(
        gioResolverPointer,
        address.gioInetAddressPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Retrieves the result of a previous call to
     * g_resolver_lookup_by_address_async().
     *
     * If the DNS resolution failed, @error (if non-null) will be set to
     * a value from #GResolverError. If the operation was cancelled,
     * @error will be set to %G_IO_ERROR_CANCELLED.
     *
     * @param result the result passed to your #GAsyncReadyCallback
     * @return a hostname (either ASCII-only, or in ASCII-encoded
     * form), or null on error.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun lookupByAddressFinish(result: AsyncResult): Result<String> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_resolver_lookup_by_address_finish(
            gioResolverPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.toKString()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Synchronously resolves @hostname to determine its associated IP
     * address(es). @hostname may be an ASCII-only or UTF-8 hostname, or
     * the textual form of an IP address (in which case this just becomes
     * a wrapper around g_inet_address_new_from_string()).
     *
     * On success, g_resolver_lookup_by_name() will return a non-empty #GList of
     * #GInetAddress, sorted in order of preference and guaranteed to not
     * contain duplicates. That is, if using the result to connect to
     * @hostname, you should attempt to connect to the first address
     * first, then the second if the first fails, etc. If you are using
     * the result to listen on a socket, it is appropriate to add each
     * result using e.g. g_socket_listener_add_address().
     *
     * If the DNS resolution fails, @error (if non-null) will be set to a
     * value from #GResolverError and null will be returned.
     *
     * If @cancellable is non-null, it can be used to cancel the
     * operation, in which case @error (if non-null) will be set to
     * %G_IO_ERROR_CANCELLED.
     *
     * If you are planning to connect to a socket on the resolved IP
     * address, it may be easier to create a #GNetworkAddress and use its
     * #GSocketConnectable interface.
     *
     * @param hostname the hostname to look up
     * @param cancellable a #GCancellable, or null
     * @return a non-empty #GList
     * of #GInetAddress, or null on error. You
     * must unref each of the addresses and free the list when you are
     * done with it. (You can use g_resolver_free_addresses() to do this.)
     * @since 2.22
     */
    @GioVersion2_22
    public open fun lookupByName(hostname: String, cancellable: Cancellable? = null): Result<List> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_resolver_lookup_by_name(
            gioResolverPointer,
            hostname,
            cancellable?.gioCancellablePointer,
            gError.ptr
        )?.run {
            List(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Begins asynchronously resolving @hostname to determine its
     * associated IP address(es), and eventually calls @callback, which
     * must call g_resolver_lookup_by_name_finish() to get the result.
     * See g_resolver_lookup_by_name() for more details.
     *
     * @param hostname the hostname to look up the address of
     * @param cancellable a #GCancellable, or null
     * @param callback callback to call after resolution completes
     * @since 2.22
     */
    @GioVersion2_22
    public open fun lookupByNameAsync(
        hostname: String,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_resolver_lookup_by_name_async(
        gioResolverPointer,
        hostname,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Retrieves the result of a call to
     * g_resolver_lookup_by_name_async().
     *
     * If the DNS resolution failed, @error (if non-null) will be set to
     * a value from #GResolverError. If the operation was cancelled,
     * @error will be set to %G_IO_ERROR_CANCELLED.
     *
     * @param result the result passed to your #GAsyncReadyCallback
     * @return a #GList
     * of #GInetAddress, or null on error. See g_resolver_lookup_by_name()
     * for more details.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun lookupByNameFinish(result: AsyncResult): Result<List> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_resolver_lookup_by_name_finish(
            gioResolverPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            List(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * This differs from g_resolver_lookup_by_name() in that you can modify
     * the lookup behavior with @flags. For example this can be used to limit
     * results with %G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY.
     *
     * @param hostname the hostname to look up
     * @param flags extra #GResolverNameLookupFlags for the lookup
     * @param cancellable a #GCancellable, or null
     * @return a non-empty #GList
     * of #GInetAddress, or null on error. You
     * must unref each of the addresses and free the list when you are
     * done with it. (You can use g_resolver_free_addresses() to do this.)
     * @since 2.60
     */
    @GioVersion2_60
    public open fun lookupByNameWithFlags(
        hostname: String,
        flags: ResolverNameLookupFlags,
        cancellable: Cancellable? = null,
    ): Result<List> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_resolver_lookup_by_name_with_flags(
            gioResolverPointer,
            hostname,
            flags.mask,
            cancellable?.gioCancellablePointer,
            gError.ptr
        )?.run {
            List(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Begins asynchronously resolving @hostname to determine its
     * associated IP address(es), and eventually calls @callback, which
     * must call g_resolver_lookup_by_name_with_flags_finish() to get the result.
     * See g_resolver_lookup_by_name() for more details.
     *
     * @param hostname the hostname to look up the address of
     * @param flags extra #GResolverNameLookupFlags for the lookup
     * @param cancellable a #GCancellable, or null
     * @param callback callback to call after resolution completes
     * @since 2.60
     */
    @GioVersion2_60
    public open fun lookupByNameWithFlagsAsync(
        hostname: String,
        flags: ResolverNameLookupFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_resolver_lookup_by_name_with_flags_async(
        gioResolverPointer,
        hostname,
        flags.mask,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Retrieves the result of a call to
     * g_resolver_lookup_by_name_with_flags_async().
     *
     * If the DNS resolution failed, @error (if non-null) will be set to
     * a value from #GResolverError. If the operation was cancelled,
     * @error will be set to %G_IO_ERROR_CANCELLED.
     *
     * @param result the result passed to your #GAsyncReadyCallback
     * @return a #GList
     * of #GInetAddress, or null on error. See g_resolver_lookup_by_name()
     * for more details.
     * @since 2.60
     */
    @GioVersion2_60
    public open fun lookupByNameWithFlagsFinish(result: AsyncResult): Result<List> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_resolver_lookup_by_name_with_flags_finish(
            gioResolverPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            List(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Synchronously performs a DNS record lookup for the given @rrname and returns
     * a list of records as #GVariant tuples. See #GResolverRecordType for
     * information on what the records contain for each @record_type.
     *
     * If the DNS resolution fails, @error (if non-null) will be set to
     * a value from #GResolverError and null will be returned.
     *
     * If @cancellable is non-null, it can be used to cancel the
     * operation, in which case @error (if non-null) will be set to
     * %G_IO_ERROR_CANCELLED.
     *
     * @param rrname the DNS name to look up the record for
     * @param recordType the type of DNS record to look up
     * @param cancellable a #GCancellable, or null
     * @return a non-empty #GList of
     * #GVariant, or null on error. You must free each of the records and the list
     * when you are done with it. (You can use g_list_free_full() with
     * g_variant_unref() to do this.)
     * @since 2.34
     */
    @GioVersion2_34
    public open fun lookupRecords(
        rrname: String,
        recordType: ResolverRecordType,
        cancellable: Cancellable? = null,
    ): Result<List> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_resolver_lookup_records(
            gioResolverPointer,
            rrname,
            recordType.nativeValue,
            cancellable?.gioCancellablePointer,
            gError.ptr
        )?.run {
            List(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Begins asynchronously performing a DNS lookup for the given
     * @rrname, and eventually calls @callback, which must call
     * g_resolver_lookup_records_finish() to get the final result. See
     * g_resolver_lookup_records() for more details.
     *
     * @param rrname the DNS name to look up the record for
     * @param recordType the type of DNS record to look up
     * @param cancellable a #GCancellable, or null
     * @param callback callback to call after resolution completes
     * @since 2.34
     */
    @GioVersion2_34
    public open fun lookupRecordsAsync(
        rrname: String,
        recordType: ResolverRecordType,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_resolver_lookup_records_async(
        gioResolverPointer,
        rrname,
        recordType.nativeValue,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Retrieves the result of a previous call to
     * g_resolver_lookup_records_async(). Returns a non-empty list of records as
     * #GVariant tuples. See #GResolverRecordType for information on what the
     * records contain.
     *
     * If the DNS resolution failed, @error (if non-null) will be set to
     * a value from #GResolverError. If the operation was cancelled,
     * @error will be set to %G_IO_ERROR_CANCELLED.
     *
     * @param result the result passed to your #GAsyncReadyCallback
     * @return a non-empty #GList of
     * #GVariant, or null on error. You must free each of the records and the list
     * when you are done with it. (You can use g_list_free_full() with
     * g_variant_unref() to do this.)
     * @since 2.34
     */
    @GioVersion2_34
    public open fun lookupRecordsFinish(result: AsyncResult): Result<List> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_resolver_lookup_records_finish(
            gioResolverPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            List(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Synchronously performs a DNS SRV lookup for the given @service and
     * @protocol in the given @domain and returns an array of #GSrvTarget.
     * @domain may be an ASCII-only or UTF-8 hostname. Note also that the
     * @service and @protocol arguments do not include the leading underscore
     * that appears in the actual DNS entry.
     *
     * On success, g_resolver_lookup_service() will return a non-empty #GList of
     * #GSrvTarget, sorted in order of preference. (That is, you should
     * attempt to connect to the first target first, then the second if
     * the first fails, etc.)
     *
     * If the DNS resolution fails, @error (if non-null) will be set to
     * a value from #GResolverError and null will be returned.
     *
     * If @cancellable is non-null, it can be used to cancel the
     * operation, in which case @error (if non-null) will be set to
     * %G_IO_ERROR_CANCELLED.
     *
     * If you are planning to connect to the service, it is usually easier
     * to create a #GNetworkService and use its #GSocketConnectable
     * interface.
     *
     * @param service the service type to look up (eg, "ldap")
     * @param protocol the networking protocol to use for @service (eg, "tcp")
     * @param domain the DNS domain to look up the service in
     * @param cancellable a #GCancellable, or null
     * @return a non-empty #GList of
     * #GSrvTarget, or null on error. You must free each of the targets and the
     * list when you are done with it. (You can use g_resolver_free_targets() to do
     * this.)
     * @since 2.22
     */
    @GioVersion2_22
    public open fun lookupService(
        service: String,
        protocol: String,
        domain: String,
        cancellable: Cancellable? = null,
    ): Result<List> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_resolver_lookup_service(
            gioResolverPointer,
            service,
            protocol,
            domain,
            cancellable?.gioCancellablePointer,
            gError.ptr
        )?.run {
            List(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Begins asynchronously performing a DNS SRV lookup for the given
     * @service and @protocol in the given @domain, and eventually calls
     * @callback, which must call g_resolver_lookup_service_finish() to
     * get the final result. See g_resolver_lookup_service() for more
     * details.
     *
     * @param service the service type to look up (eg, "ldap")
     * @param protocol the networking protocol to use for @service (eg, "tcp")
     * @param domain the DNS domain to look up the service in
     * @param cancellable a #GCancellable, or null
     * @param callback callback to call after resolution completes
     * @since 2.22
     */
    @GioVersion2_22
    public open fun lookupServiceAsync(
        service: String,
        protocol: String,
        domain: String,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_resolver_lookup_service_async(
        gioResolverPointer,
        service,
        protocol,
        domain,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Retrieves the result of a previous call to
     * g_resolver_lookup_service_async().
     *
     * If the DNS resolution failed, @error (if non-null) will be set to
     * a value from #GResolverError. If the operation was cancelled,
     * @error will be set to %G_IO_ERROR_CANCELLED.
     *
     * @param result the result passed to your #GAsyncReadyCallback
     * @return a non-empty #GList of
     * #GSrvTarget, or null on error. See g_resolver_lookup_service() for more
     * details.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun lookupServiceFinish(result: AsyncResult): Result<List> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_resolver_lookup_service_finish(
            gioResolverPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            List(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Sets @resolver to be the application's default resolver (reffing
     * @resolver, and unreffing the previous default resolver, if any).
     * Future calls to g_resolver_get_default() will return this resolver.
     *
     * This can be used if an application wants to perform any sort of DNS
     * caching or "pinning"; it can implement its own #GResolver that
     * calls the original default resolver for DNS operations, and
     * implements its own cache policies on top of that, and then set
     * itself as the default resolver for all later code to use.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open fun setDefault(): Unit = g_resolver_set_default(gioResolverPointer)

    /**
     * Emitted when the resolver notices that the system resolver
     * configuration has changed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onReload(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioResolverPointer,
            "reload",
            onReloadFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "reload" signal. See [onReload].
     */
    public fun emitReload() {
        g_signal_emit_by_name(gioResolverPointer.reinterpret(), "reload")
    }

    /**
     * The ResolverImpl type represents a native instance of the abstract Resolver class.
     *
     * @constructor Creates a new instance of Resolver for the provided [CPointer].
     */
    public class ResolverImpl(pointer: CPointer<GResolver>) : Resolver(pointer)

    public companion object : TypeCompanion<Resolver> {
        override val type: GeneratedClassKGType<Resolver> =
            GeneratedClassKGType(getTypeOrNull("g_resolver_get_type")!!) { ResolverImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Frees @addresses (which should be the return value from
         * g_resolver_lookup_by_name() or g_resolver_lookup_by_name_finish()).
         * (This is a convenience method; you can also simply free the results
         * by hand.)
         *
         * @param addresses a #GList of #GInetAddress
         * @since 2.22
         */
        @GioVersion2_22
        public fun freeAddresses(addresses: List): Unit = g_resolver_free_addresses(addresses.glibListPointer)

        /**
         * Frees @targets (which should be the return value from
         * g_resolver_lookup_service() or g_resolver_lookup_service_finish()).
         * (This is a convenience method; you can also simply free the
         * results by hand.)
         *
         * @param targets a #GList of #GSrvTarget
         * @since 2.22
         */
        @GioVersion2_22
        public fun freeTargets(targets: List): Unit = g_resolver_free_targets(targets.glibListPointer)

        /**
         * Gets the default #GResolver. You should unref it when you are done
         * with it. #GResolver may use its reference count as a hint about how
         * many threads it should allocate for concurrent DNS resolutions.
         *
         * @return the default #GResolver.
         * @since 2.22
         */
        @GioVersion2_22
        public fun getDefault(): Resolver = g_resolver_get_default()!!.run {
            ResolverImpl(this)
        }

        /**
         * Get the GType of Resolver
         *
         * @return the GType
         */
        public fun getType(): GType = g_resolver_get_type()
    }
}

private val onReloadFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
