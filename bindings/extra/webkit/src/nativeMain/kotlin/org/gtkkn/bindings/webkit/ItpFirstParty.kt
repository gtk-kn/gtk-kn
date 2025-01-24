// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_30
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitITPFirstParty
import org.gtkkn.native.webkit.webkit_itp_first_party_get_domain
import org.gtkkn.native.webkit.webkit_itp_first_party_get_last_update_time
import org.gtkkn.native.webkit.webkit_itp_first_party_get_type
import org.gtkkn.native.webkit.webkit_itp_first_party_get_website_data_access_allowed
import org.gtkkn.native.webkit.webkit_itp_first_party_ref
import org.gtkkn.native.webkit.webkit_itp_first_party_unref
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Describes a first party origin.
 * @since 2.30
 */
@WebKitVersion2_30
public class ItpFirstParty(public val webkitItpFirstPartyPointer: CPointer<WebKitITPFirstParty>) :
    ProxyInstance(webkitItpFirstPartyPointer) {
    /**
     * Get the domain name of @itp_first_party.
     *
     * @return the domain name
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun getDomain(): String =
        webkit_itp_first_party_get_domain(webkitItpFirstPartyPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Get the last time a #WebKitITPThirdParty has been seen under @itp_first_party.
     *
     * Each @WebKitITPFirstParty is created by webkit_itp_third_party_get_first_parties() and
     * therefore corresponds to exactly one #WebKitITPThirdParty.
     *
     * @return the last update time as a #GDateTime
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun getLastUpdateTime(): DateTime =
        webkit_itp_first_party_get_last_update_time(webkitItpFirstPartyPointer)!!.run {
            DateTime(this)
        }

    /**
     * Get whether @itp_first_party has granted website data access to its #WebKitITPThirdParty.
     *
     * Each @WebKitITPFirstParty is created by webkit_itp_third_party_get_first_parties() and
     * therefore corresponds to exactly one #WebKitITPThirdParty.
     *
     * @return true if website data access has been granted, or false otherwise
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun getWebsiteDataAccessAllowed(): Boolean =
        webkit_itp_first_party_get_website_data_access_allowed(webkitItpFirstPartyPointer).asBoolean()

    /**
     * Atomically increments the reference count of @itp_first_party by one.
     *
     * This function is MT-safe and may be called from any thread.
     *
     * @return The passed #WebKitITPFirstParty
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun ref(): ItpFirstParty = webkit_itp_first_party_ref(webkitItpFirstPartyPointer)!!.run {
        ItpFirstParty(this)
    }

    /**
     * Atomically decrements the reference count of @itp_first_party by one.
     *
     * If the reference count drops to 0, all memory allocated by
     * #WebKitITPFirstParty is released. This function is MT-safe and may be
     * called from any thread.
     *
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun unref(): Unit = webkit_itp_first_party_unref(webkitItpFirstPartyPointer)

    public companion object {
        /**
         * Get the GType of ITPFirstParty
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_itp_first_party_get_type()
    }
}
