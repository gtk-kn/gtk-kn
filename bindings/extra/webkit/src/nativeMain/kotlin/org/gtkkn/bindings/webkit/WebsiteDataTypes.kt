// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_16
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.webkit.WEBKIT_WEBSITE_DATA_ALL
import org.gtkkn.native.webkit.WEBKIT_WEBSITE_DATA_COOKIES
import org.gtkkn.native.webkit.WEBKIT_WEBSITE_DATA_DEVICE_ID_HASH_SALT
import org.gtkkn.native.webkit.WEBKIT_WEBSITE_DATA_DISK_CACHE
import org.gtkkn.native.webkit.WEBKIT_WEBSITE_DATA_DOM_CACHE
import org.gtkkn.native.webkit.WEBKIT_WEBSITE_DATA_HSTS_CACHE
import org.gtkkn.native.webkit.WEBKIT_WEBSITE_DATA_INDEXEDDB_DATABASES
import org.gtkkn.native.webkit.WEBKIT_WEBSITE_DATA_ITP
import org.gtkkn.native.webkit.WEBKIT_WEBSITE_DATA_LOCAL_STORAGE
import org.gtkkn.native.webkit.WEBKIT_WEBSITE_DATA_MEMORY_CACHE
import org.gtkkn.native.webkit.WEBKIT_WEBSITE_DATA_OFFLINE_APPLICATION_CACHE
import org.gtkkn.native.webkit.WEBKIT_WEBSITE_DATA_SERVICE_WORKER_REGISTRATIONS
import org.gtkkn.native.webkit.WEBKIT_WEBSITE_DATA_SESSION_STORAGE
import org.gtkkn.native.webkit.WebKitWebsiteDataTypes

/**
 * Enum values with flags representing types of Website data.
 * @since 2.16
 */
public class WebsiteDataTypes(
    public val mask: WebKitWebsiteDataTypes,
) : Bitfield<WebsiteDataTypes> {
    override infix fun or(other: WebsiteDataTypes): WebsiteDataTypes = WebsiteDataTypes(mask or other.mask)

    @WebKitVersion2_16
    public companion object {
        /**
         * Memory cache.
         */
        public val MEMORY_CACHE: WebsiteDataTypes =
            WebsiteDataTypes(WEBKIT_WEBSITE_DATA_MEMORY_CACHE)

        /**
         * HTTP disk cache.
         */
        public val DISK_CACHE: WebsiteDataTypes = WebsiteDataTypes(WEBKIT_WEBSITE_DATA_DISK_CACHE)

        /**
         * Offline web application cache.
         */
        public val OFFLINE_APPLICATION_CACHE: WebsiteDataTypes =
            WebsiteDataTypes(WEBKIT_WEBSITE_DATA_OFFLINE_APPLICATION_CACHE)

        /**
         * Session storage data.
         */
        public val SESSION_STORAGE: WebsiteDataTypes =
            WebsiteDataTypes(WEBKIT_WEBSITE_DATA_SESSION_STORAGE)

        /**
         * Local storage data.
         */
        public val LOCAL_STORAGE: WebsiteDataTypes =
            WebsiteDataTypes(WEBKIT_WEBSITE_DATA_LOCAL_STORAGE)

        /**
         * IndexedDB databases.
         */
        public val INDEXEDDB_DATABASES: WebsiteDataTypes =
            WebsiteDataTypes(WEBKIT_WEBSITE_DATA_INDEXEDDB_DATABASES)

        /**
         * Cookies.
         */
        public val COOKIES: WebsiteDataTypes = WebsiteDataTypes(WEBKIT_WEBSITE_DATA_COOKIES)

        /**
         * Hash salt used to generate the device ids used by webpages.
         */
        public val DEVICE_ID_HASH_SALT: WebsiteDataTypes =
            WebsiteDataTypes(WEBKIT_WEBSITE_DATA_DEVICE_ID_HASH_SALT)

        /**
         * HSTS cache.
         */
        public val HSTS_CACHE: WebsiteDataTypes = WebsiteDataTypes(WEBKIT_WEBSITE_DATA_HSTS_CACHE)

        /**
         * Intelligent Tracking Prevention data.
         */
        public val ITP: WebsiteDataTypes = WebsiteDataTypes(WEBKIT_WEBSITE_DATA_ITP)

        /**
         * Service worker registrations.
         */
        public val SERVICE_WORKER_REGISTRATIONS: WebsiteDataTypes =
            WebsiteDataTypes(WEBKIT_WEBSITE_DATA_SERVICE_WORKER_REGISTRATIONS)

        /**
         * DOM (CacheStorage) cache.
         */
        public val DOM_CACHE: WebsiteDataTypes = WebsiteDataTypes(WEBKIT_WEBSITE_DATA_DOM_CACHE)

        /**
         * All types.
         */
        public val ALL: WebsiteDataTypes = WebsiteDataTypes(WEBKIT_WEBSITE_DATA_ALL)
    }
}
