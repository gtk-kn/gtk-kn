// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupSameSitePolicy
import org.gtkkn.native.soup.soup_same_site_policy_get_type

/**
 * Represents the same-site policies of a cookie.
 */
public enum class SameSitePolicy(public val nativeValue: SoupSameSitePolicy) {
    /**
     * The cookie is exposed with both cross-site and same-site requests
     */
    NONE(SoupSameSitePolicy.SOUP_SAME_SITE_POLICY_NONE),

    /**
     * The cookie is withheld on cross-site requests but exposed on cross-site navigations
     */
    LAX(SoupSameSitePolicy.SOUP_SAME_SITE_POLICY_LAX),

    /**
     * The cookie is only exposed for same-site requests
     */
    STRICT(SoupSameSitePolicy.SOUP_SAME_SITE_POLICY_STRICT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupSameSitePolicy): SameSitePolicy = when (nativeValue) {
            SoupSameSitePolicy.SOUP_SAME_SITE_POLICY_NONE -> NONE
            SoupSameSitePolicy.SOUP_SAME_SITE_POLICY_LAX -> LAX
            SoupSameSitePolicy.SOUP_SAME_SITE_POLICY_STRICT -> STRICT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SameSitePolicy
         *
         * @return the GType
         */
        public fun getType(): GType = soup_same_site_policy_get_type()
    }
}
