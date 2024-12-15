// This is a generated file. Do not modify.
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
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.glib.TimeSpan
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.WebKit.resolveException
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_10
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_16
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_30
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitWebsiteDataManager
import org.gtkkn.native.webkit.webkit_website_data_manager_clear
import org.gtkkn.native.webkit.webkit_website_data_manager_clear_finish
import org.gtkkn.native.webkit.webkit_website_data_manager_fetch
import org.gtkkn.native.webkit.webkit_website_data_manager_fetch_finish
import org.gtkkn.native.webkit.webkit_website_data_manager_get_base_cache_directory
import org.gtkkn.native.webkit.webkit_website_data_manager_get_base_data_directory
import org.gtkkn.native.webkit.webkit_website_data_manager_get_favicon_database
import org.gtkkn.native.webkit.webkit_website_data_manager_get_favicons_enabled
import org.gtkkn.native.webkit.webkit_website_data_manager_get_itp_summary
import org.gtkkn.native.webkit.webkit_website_data_manager_get_itp_summary_finish
import org.gtkkn.native.webkit.webkit_website_data_manager_get_type
import org.gtkkn.native.webkit.webkit_website_data_manager_is_ephemeral
import org.gtkkn.native.webkit.webkit_website_data_manager_remove
import org.gtkkn.native.webkit.webkit_website_data_manager_remove_finish
import org.gtkkn.native.webkit.webkit_website_data_manager_set_favicons_enabled
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * Manages data stored locally by web sites.
 *
 * You can use WebKitWebsiteDataManager to configure the local directories
 * where website data will be stored. Use #WebKitWebsiteDataManager:base-data-directory
 * and #WebKitWebsiteDataManager:base-cache-directory set a common base directory for all
 * website data and caches.
 *
 * A WebKitWebsiteDataManager can be ephemeral, in which case all the directory configuration
 * is not needed because website data will never persist. You can create an ephemeral WebKitWebsiteDataManager
 * with webkit_website_data_manager_new_ephemeral().
 *
 * WebKitWebsiteDataManager can also be used to fetch website data, remove data
 * stored by particular websites, or clear data for all websites modified since a given
 * period of time.
 *
 * ## Skipped during bindings generation
 *
 * - method `is-ephemeral`: Property has no getter nor setter
 * - method `origin-storage-ratio`: Property has no getter nor setter
 * - method `total-storage-ratio`: Property has no getter nor setter
 *
 * @since 2.10
 */
@WebKitVersion2_10
public class WebsiteDataManager(pointer: CPointer<WebKitWebsiteDataManager>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitWebsiteDataManagerPointer: CPointer<WebKitWebsiteDataManager>
        get() = gPointer.reinterpret()

    /**
     * The base directory for caches. If null, a default location will be used.
     *
     * @since 2.10
     */
    @WebKitVersion2_10
    public val baseCacheDirectory: String?
        /**
         * Get the #WebKitWebsiteDataManager:base-cache-directory property.
         *
         * @return the base directory for caches, or null if
         *    #WebKitWebsiteDataManager:base-cache-directory was not provided or @manager is ephemeral.
         * @since 2.10
         */
        get() = webkit_website_data_manager_get_base_cache_directory(
            webkitWebsiteDataManagerPointer.reinterpret()
        )?.toKString()

    /**
     * The base directory for website data. If null, a default location will be used.
     *
     * @since 2.10
     */
    @WebKitVersion2_10
    public val baseDataDirectory: String?
        /**
         * Get the #WebKitWebsiteDataManager:base-data-directory property.
         *
         * @return the base directory for website data, or null if
         *    #WebKitWebsiteDataManager:base-data-directory was not provided or @manager is ephemeral.
         * @since 2.10
         */
        get() = webkit_website_data_manager_get_base_data_directory(
            webkitWebsiteDataManagerPointer.reinterpret()
        )?.toKString()

    /**
     * Asynchronously clear the website data of the given @types modified in the past @timespan.
     *
     * If @timespan is 0, all website data will be removed.
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_website_data_manager_clear_finish() to get the result of the operation.
     *
     * Due to implementation limitations, this function does not currently delete
     * any stored cookies if @timespan is nonzero. This behavior may change in the
     * future.
     *
     * @param types #WebKitWebsiteDataTypes
     * @param timespan a #GTimeSpan
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun clear(
        types: WebsiteDataTypes,
        timespan: TimeSpan,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = webkit_website_data_manager_clear(
        webkitWebsiteDataManagerPointer.reinterpret(),
        types.mask,
        timespan,
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finish an asynchronous operation started with webkit_website_data_manager_clear()
     *
     * @param result a #GAsyncResult
     * @return true if website data was successfully cleared, or false otherwise.
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun clearFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_website_data_manager_clear_finish(
            webkitWebsiteDataManagerPointer.reinterpret(),
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
     * Asynchronously get the list of #WebKitWebsiteData for the given @types.
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_website_data_manager_fetch_finish() to get the result of the operation.
     *
     * @param types #WebKitWebsiteDataTypes
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun fetch(types: WebsiteDataTypes, cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        webkit_website_data_manager_fetch(
            webkitWebsiteDataManagerPointer.reinterpret(),
            types.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finish an asynchronous operation started with webkit_website_data_manager_fetch().
     *
     * @param result a #GAsyncResult
     * @return a #GList of #WebKitWebsiteData. You must free the #GList with
     *    g_list_free() and unref the #WebKitWebsiteData<!-- -->s with webkit_website_data_unref() when you're done with them.
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun fetchFinish(result: AsyncResult): Result<List> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_website_data_manager_fetch_finish(
            webkitWebsiteDataManagerPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            List(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Get the #WebKitFaviconDatabase of @manager.
     *
     * @return a #WebKitFaviconDatabase, or null if website icons are disabled
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getFaviconDatabase(): FaviconDatabase? =
        webkit_website_data_manager_get_favicon_database(webkitWebsiteDataManagerPointer.reinterpret())?.run {
            FaviconDatabase(reinterpret())
        }

    /**
     * Get whether website icons are enabled.
     *
     * @return true if website icons are enabled, or false otherwise.
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getFaviconsEnabled(): Boolean =
        webkit_website_data_manager_get_favicons_enabled(webkitWebsiteDataManagerPointer.reinterpret()).asBoolean()

    /**
     * Asynchronously get the list of #WebKitITPThirdParty seen for @manager.
     *
     * Every #WebKitITPThirdParty
     * contains the list of #WebKitITPFirstParty under which it has been seen.
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_website_data_manager_get_itp_summary_finish() to get the result of the operation.
     *
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun getItpSummary(cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        webkit_website_data_manager_get_itp_summary(
            webkitWebsiteDataManagerPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finish an asynchronous operation started with webkit_website_data_manager_get_itp_summary().
     *
     * @param result a #GAsyncResult
     * @return a #GList of #WebKitITPThirdParty.
     *    You must free the #GList with g_list_free() and unref the #WebKitITPThirdParty<!-- -->s with
     *    webkit_itp_third_party_unref() when you're done with them.
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun getItpSummaryFinish(result: AsyncResult): Result<List> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_website_data_manager_get_itp_summary_finish(
            webkitWebsiteDataManagerPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            List(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Get whether a #WebKitWebsiteDataManager is ephemeral.
     *
     * See #WebKitWebsiteDataManager:is-ephemeral for more details.
     *
     * @return true if @manager is ephemeral or false otherwise.
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun isEphemeral(): Boolean =
        webkit_website_data_manager_is_ephemeral(webkitWebsiteDataManagerPointer.reinterpret()).asBoolean()

    /**
     * Asynchronously removes the website data in the given @website_data list.
     *
     * Asynchronously removes the website data of the given @types for websites in the given @website_data list.
     * Use webkit_website_data_manager_clear() if you want to remove the website data for all sites.
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_website_data_manager_remove_finish() to get the result of the operation.
     *
     * @param types #WebKitWebsiteDataTypes
     * @param websiteData a #GList of #WebKitWebsiteData
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun remove(
        types: WebsiteDataTypes,
        websiteData: List,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = webkit_website_data_manager_remove(
        webkitWebsiteDataManagerPointer.reinterpret(),
        types.mask,
        websiteData.glibListPointer.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finish an asynchronous operation started with webkit_website_data_manager_remove().
     *
     * @param result a #GAsyncResult
     * @return true if website data resources were successfully removed, or false otherwise.
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun removeFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_website_data_manager_remove_finish(
            webkitWebsiteDataManagerPointer.reinterpret(),
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
     * Set whether website icons are enabled. Website icons are disabled by default.
     * When website icons are disabled, the #WebKitFaviconDatabase of @manager is closed and
     * its reference removed, so webkit_website_data_manager_get_favicon_database() will
     * return null. If website icons are enabled again, a new #WebKitFaviconDatabase will
     * be created.
     *
     * @param enabled value to set
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun setFaviconsEnabled(enabled: Boolean): Unit = webkit_website_data_manager_set_favicons_enabled(
        webkitWebsiteDataManagerPointer.reinterpret(),
        enabled.asGBoolean()
    )

    public companion object : TypeCompanion<WebsiteDataManager> {
        override val type: GeneratedClassKGType<WebsiteDataManager> =
            GeneratedClassKGType(webkit_website_data_manager_get_type()) { WebsiteDataManager(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of WebsiteDataManager
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_website_data_manager_get_type()
    }
}
