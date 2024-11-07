// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.native.webkit.WebKitCookiePersistentStorage

/**
 * Enum values used to denote the cookie persistent storage types.
 */
public enum class CookiePersistentStorage(
    public val nativeValue: WebKitCookiePersistentStorage,
) {
    /**
     * Cookies are stored in a text
     *  file in the Mozilla "cookies.txt" format.
     */
    TEXT(WebKitCookiePersistentStorage.WEBKIT_COOKIE_PERSISTENT_STORAGE_TEXT),

    /**
     * Cookies are stored in a SQLite
     *  file in the current Mozilla format.
     */
    SQLITE(WebKitCookiePersistentStorage.WEBKIT_COOKIE_PERSISTENT_STORAGE_SQLITE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitCookiePersistentStorage): CookiePersistentStorage =
            when (nativeValue) {
                WebKitCookiePersistentStorage.WEBKIT_COOKIE_PERSISTENT_STORAGE_TEXT -> TEXT
                WebKitCookiePersistentStorage.WEBKIT_COOKIE_PERSISTENT_STORAGE_SQLITE -> SQLITE
                else -> error("invalid nativeValue")
            }
    }
}
