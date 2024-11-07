// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_30
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
 *
 * @since 2.30
 */
@WebKitVersion2_30
public class WebsitePolicies(
    pointer: CPointer<WebKitWebsitePolicies>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val webkitWebsitePoliciesPointer: CPointer<WebKitWebsitePolicies>
        get() = gPointer.reinterpret()

    /**
     * Create a new #WebKitWebsitePolicies.
     *
     * @return the newly created #WebKitWebsitePolicies
     * @since 2.30
     */
    public constructor() : this(webkit_website_policies_new()!!.reinterpret())

    /**
     * Get the #WebKitWebsitePolicies:autoplay property.
     *
     * @return #WebKitAutoplayPolicy
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun getAutoplayPolicy(): AutoplayPolicy =
        webkit_website_policies_get_autoplay_policy(webkitWebsitePoliciesPointer.reinterpret()).run {
            AutoplayPolicy.fromNativeValue(this)
        }

    public companion object : TypeCompanion<WebsitePolicies> {
        override val type: GeneratedClassKGType<WebsitePolicies> =
            GeneratedClassKGType(webkit_website_policies_get_type()) { WebsitePolicies(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }
    }
}
