// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.WebKit.resolveException
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_24
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitUserContentFilterStore
import org.gtkkn.native.webkit.webkit_user_content_filter_store_fetch_identifiers
import org.gtkkn.native.webkit.webkit_user_content_filter_store_fetch_identifiers_finish
import org.gtkkn.native.webkit.webkit_user_content_filter_store_get_path
import org.gtkkn.native.webkit.webkit_user_content_filter_store_get_type
import org.gtkkn.native.webkit.webkit_user_content_filter_store_load
import org.gtkkn.native.webkit.webkit_user_content_filter_store_load_finish
import org.gtkkn.native.webkit.webkit_user_content_filter_store_new
import org.gtkkn.native.webkit.webkit_user_content_filter_store_remove
import org.gtkkn.native.webkit.webkit_user_content_filter_store_remove_finish
import org.gtkkn.native.webkit.webkit_user_content_filter_store_save
import org.gtkkn.native.webkit.webkit_user_content_filter_store_save_finish
import org.gtkkn.native.webkit.webkit_user_content_filter_store_save_from_file
import org.gtkkn.native.webkit.webkit_user_content_filter_store_save_from_file_finish
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Handles storage of user content filters on disk.
 *
 * The WebKitUserContentFilterStore provides the means to import and save
 * [JSON rule sets](https://webkit.org/blog/3476/content-blockers-first-look/),
 * which can be loaded later in an efficient manner. Once filters are stored,
 * the #WebKitUserContentFilter objects which represent them can be added to
 * a #WebKitUserContentManager with webkit_user_content_manager_add_filter().
 *
 * JSON rule sets are imported using webkit_user_content_filter_store_save() and stored
 * on disk in an implementation defined format. The contents of a filter store must be
 * managed using the #WebKitUserContentFilterStore: a list of all the stored filters
 * can be obtained with webkit_user_content_filter_store_fetch_identifiers(),
 * webkit_user_content_filter_store_load() can be used to retrieve a previously saved
 * filter, and removed from the store with webkit_user_content_filter_store_remove().
 * @since 2.24
 */
@WebKitVersion2_24
public class UserContentFilterStore(
    public val webkitUserContentFilterStorePointer: CPointer<WebKitUserContentFilterStore>,
) : Object(webkitUserContentFilterStorePointer.reinterpret()),
    KGTyped {
    init {
        WebKit
    }

    /**
     * The directory used for filter storage. This path is used as the base
     * directory where user content filters are stored on disk.
     *
     * @since 2.24
     */
    @WebKitVersion2_24
    public val path: String
        /**
         * Gets the storage path for user content filters.
         *
         * @return path, as a string.
         * @since 2.24
         */
        get() = webkit_user_content_filter_store_get_path(webkitUserContentFilterStorePointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Create a new #WebKitUserContentFilterStore to manipulate filters stored at @storage_path.
     *
     * The path must point to a local filesystem, and will be created if needed.
     *
     * @param storagePath path where data for filters will be stored on disk
     * @return a newly created #WebKitUserContentFilterStore
     * @since 2.24
     */
    public constructor(storagePath: String) : this(webkit_user_content_filter_store_new(storagePath)!!) {
        InstanceCache.put(this)
    }

    /**
     * Asynchronously retrieve a list of the identifiers for all the stored filters.
     *
     * When the operation is finished, @callback will be invoked, which then can use
     * webkit_user_content_filter_store_fetch_identifiers_finish() to obtain the list of
     * filter identifiers.
     *
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the removal is completed
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun fetchIdentifiers(cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        webkit_user_content_filter_store_fetch_identifiers(
            webkitUserContentFilterStorePointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finishes an asynchronous fetch of the list of stored filters.
     *
     * Finishes an asynchronous fetch of the list of identifiers for the stored filters previously
     * started with webkit_user_content_filter_store_fetch_identifiers().
     *
     * @param result a #GAsyncResult
     * @return a null-terminated list of filter identifiers.
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun fetchIdentifiersFinish(result: AsyncResult): List<String> =
        webkit_user_content_filter_store_fetch_identifiers_finish(
            webkitUserContentFilterStorePointer,
            result.gioAsyncResultPointer
        )?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Asynchronously load a content filter given its @identifier.
     *
     * The filter must have been
     * previously stored using webkit_user_content_filter_store_save().
     *
     * When the operation is finished, @callback will be invoked, which then can use
     * webkit_user_content_filter_store_load_finish() to obtain the resulting filter.
     *
     * @param identifier a filter identifier
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the load is completed
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun load(identifier: String, cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        webkit_user_content_filter_store_load(
            webkitUserContentFilterStorePointer,
            identifier,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finishes an asynchronous filter load previously started with
     * webkit_user_content_filter_store_load().
     *
     * @param result a #GAsyncResult
     * @return a #WebKitUserContentFilter, or null if the load failed
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun loadFinish(result: AsyncResult): Result<UserContentFilter> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_user_content_filter_store_load_finish(
            webkitUserContentFilterStorePointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            UserContentFilter(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously remove a content filter given its @identifier.
     *
     * When the operation is finished, @callback will be invoked, which then can use
     * webkit_user_content_filter_store_remove_finish() to check whether the removal was
     * successful.
     *
     * @param identifier a filter identifier
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the removal is completed
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun remove(identifier: String, cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        webkit_user_content_filter_store_remove(
            webkitUserContentFilterStorePointer,
            identifier,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finishes an asynchronous filter removal previously started with
     * webkit_user_content_filter_store_remove().
     *
     * @param result a #GAsyncResult
     * @return whether the removal was successful
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun removeFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_user_content_filter_store_remove_finish(
            webkitUserContentFilterStorePointer,
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously save a content filter from a set source rule.
     *
     * Asynchronously save a content filter from a source rule set in the
     * [WebKit content extesions JSON format](https://webkit.org/blog/3476/content-blockers-first-look/).
     *
     * The @identifier can be used afterwards to refer to the filter when using
     * webkit_user_content_filter_store_remove() and webkit_user_content_filter_store_load().
     * When the @identifier has been used in the past, the new filter source will replace
     * the one saved beforehand for the same identifier.
     *
     * When the operation is finished, @callback will be invoked, which then can use
     * webkit_user_content_filter_store_save_finish() to obtain the resulting filter.
     *
     * @param identifier a string used to identify the saved filter
     * @param source #GBytes containing the rule set in JSON format
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when saving is completed
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun save(
        identifier: String,
        source: Bytes,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = webkit_user_content_filter_store_save(
        webkitUserContentFilterStorePointer,
        identifier,
        source.glibBytesPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes an asynchronous filter save previously started with
     * webkit_user_content_filter_store_save().
     *
     * @param result a #GAsyncResult
     * @return a #WebKitUserContentFilter, or null if saving failed
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun saveFinish(result: AsyncResult): Result<UserContentFilter> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_user_content_filter_store_save_finish(
            webkitUserContentFilterStorePointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            UserContentFilter(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously save a content filter from the contents of a file.
     *
     * Asynchronously save a content filter from the contents of a file, which must be
     * native to the platform, as checked by g_file_is_native(). See
     * webkit_user_content_filter_store_save() for more details.
     *
     * When the operation is finished, @callback will be invoked, which then can use
     * webkit_user_content_filter_store_save_finish() to obtain the resulting filter.
     *
     * @param identifier a string used to identify the saved filter
     * @param file a #GFile containing the rule set in JSON format
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when saving is completed
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun saveFromFile(
        identifier: String,
        `file`: File,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = webkit_user_content_filter_store_save_from_file(
        webkitUserContentFilterStorePointer,
        identifier,
        `file`.gioFilePointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes and asynchronous filter save previously started with
     * webkit_user_content_filter_store_save_from_file().
     *
     * @param result a #GAsyncResult
     * @return a #WebKitUserContentFilter, or null if saving failed.
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun saveFromFileFinish(result: AsyncResult): Result<UserContentFilter> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_user_content_filter_store_save_from_file_finish(
            webkitUserContentFilterStorePointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            UserContentFilter(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    public companion object : TypeCompanion<UserContentFilterStore> {
        override val type: GeneratedClassKGType<UserContentFilterStore> =
            GeneratedClassKGType(getTypeOrNull()!!) { UserContentFilterStore(it.reinterpret()) }

        init {
            WebKitTypeProvider.register()
        }

        /**
         * Get the GType of UserContentFilterStore
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_user_content_filter_store_get_type()

        /**
         * Gets the GType of from the symbol `webkit_user_content_filter_store_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("webkit_user_content_filter_store_get_type")
    }
}
