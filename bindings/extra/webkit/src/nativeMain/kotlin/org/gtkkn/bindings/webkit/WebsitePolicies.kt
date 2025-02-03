// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_30
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitWebsitePolicies
import org.gtkkn.native.webkit.webkit_website_policies_get_autoplay_policy
import org.gtkkn.native.webkit.webkit_website_policies_get_type
import org.gtkkn.native.webkit.webkit_website_policies_new

/**
 * View specific website policies.
 *
 * WebKitWebsitePolicies allows you to configure per-page policies,
 * currently only autoplay policies are supported.
 *
 * ## Skipped during bindings generation
 *
 * - method `autoplay`: Property has no getter nor setter
 * - constructor `new_with_policies`: Varargs parameter is not supported
 *
 * @since 2.30
 */
@WebKitVersion2_30
public class WebsitePolicies(public val webkitWebsitePoliciesPointer: CPointer<WebKitWebsitePolicies>) :
    Object(webkitWebsitePoliciesPointer.reinterpret()),
    KGTyped {
    init {
        WebKit
    }

    /**
     * Create a new #WebKitWebsitePolicies.
     *
     * @return the newly created #WebKitWebsitePolicies
     * @since 2.30
     */
    public constructor() : this(webkit_website_policies_new()!!) {
        InstanceCache.put(this)
    }

    /**
     * Get the #WebKitWebsitePolicies:autoplay property.
     *
     * @return #WebKitAutoplayPolicy
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun getAutoplayPolicy(): AutoplayPolicy =
        webkit_website_policies_get_autoplay_policy(webkitWebsitePoliciesPointer).run {
            AutoplayPolicy.fromNativeValue(this)
        }

    public companion object : TypeCompanion<WebsitePolicies> {
        override val type: GeneratedClassKGType<WebsitePolicies> =
            GeneratedClassKGType(getTypeOrNull()!!) { WebsitePolicies(it.reinterpret()) }

        init {
            WebKitTypeProvider.register()
        }

        /**
         * Get the GType of WebsitePolicies
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_website_policies_get_type()

        /**
         * Gets the GType of from the symbol `webkit_website_policies_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("webkit_website_policies_get_type")
    }
}
