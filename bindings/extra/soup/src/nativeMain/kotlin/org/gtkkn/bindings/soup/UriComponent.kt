// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupURIComponent
import org.gtkkn.native.soup.soup_uri_component_get_type

/**
 * Enum values passed to [func@uri_copy] to indicate the components of
 * the URI that should be updated with the given values.
 */
public enum class UriComponent(public val nativeValue: SoupURIComponent) {
    /**
     * no component
     */
    NONE(SoupURIComponent.SOUP_URI_NONE),

    /**
     * the URI scheme component
     */
    SCHEME(SoupURIComponent.SOUP_URI_SCHEME),

    /**
     * the URI user component
     */
    USER(SoupURIComponent.SOUP_URI_USER),

    /**
     * the URI password component
     */
    PASSWORD(SoupURIComponent.SOUP_URI_PASSWORD),

    /**
     * the URI authentication parameters component
     */
    AUTH_PARAMS(SoupURIComponent.SOUP_URI_AUTH_PARAMS),

    /**
     * the URI host component
     */
    HOST(SoupURIComponent.SOUP_URI_HOST),

    /**
     * the URI port component
     */
    PORT(SoupURIComponent.SOUP_URI_PORT),

    /**
     * the URI path component
     */
    PATH(SoupURIComponent.SOUP_URI_PATH),

    /**
     * the URI query component
     */
    QUERY(SoupURIComponent.SOUP_URI_QUERY),

    /**
     * the URI fragment component
     */
    FRAGMENT(SoupURIComponent.SOUP_URI_FRAGMENT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupURIComponent): UriComponent = when (nativeValue) {
            SoupURIComponent.SOUP_URI_NONE -> NONE
            SoupURIComponent.SOUP_URI_SCHEME -> SCHEME
            SoupURIComponent.SOUP_URI_USER -> USER
            SoupURIComponent.SOUP_URI_PASSWORD -> PASSWORD
            SoupURIComponent.SOUP_URI_AUTH_PARAMS -> AUTH_PARAMS
            SoupURIComponent.SOUP_URI_HOST -> HOST
            SoupURIComponent.SOUP_URI_PORT -> PORT
            SoupURIComponent.SOUP_URI_PATH -> PATH
            SoupURIComponent.SOUP_URI_QUERY -> QUERY
            SoupURIComponent.SOUP_URI_FRAGMENT -> FRAGMENT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of URIComponent
         *
         * @return the GType
         */
        public fun getType(): GType = soup_uri_component_get_type()
    }
}
