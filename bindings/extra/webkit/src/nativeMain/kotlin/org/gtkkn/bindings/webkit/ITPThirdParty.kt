// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_30
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitITPThirdParty
import org.gtkkn.native.webkit.webkit_itp_third_party_get_domain
import org.gtkkn.native.webkit.webkit_itp_third_party_get_first_parties
import org.gtkkn.native.webkit.webkit_itp_third_party_get_type
import org.gtkkn.native.webkit.webkit_itp_third_party_ref
import org.gtkkn.native.webkit.webkit_itp_third_party_unref
import kotlin.String
import kotlin.Unit

/**
 * Describes a third party origin.
 * @since 2.30
 */
@WebKitVersion2_30
public class ITPThirdParty(pointer: CPointer<WebKitITPThirdParty>) : ProxyInstance(pointer) {
    public val webkitITPThirdPartyPointer: CPointer<WebKitITPThirdParty> = pointer

    /**
     * Get the domain name of @itp_third_party.
     *
     * @return the domain name
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun getDomain(): String =
        webkit_itp_third_party_get_domain(webkitITPThirdPartyPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the list of #WebKitITPFirstParty under which @itp_third_party has been seen.
     *
     * @return a #GList of #WebKitITPFirstParty
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun getFirstParties(): List =
        webkit_itp_third_party_get_first_parties(webkitITPThirdPartyPointer.reinterpret())!!.run {
            List(reinterpret())
        }

    /**
     * Atomically increments the reference count of @itp_third_party by one.
     *
     * This function is MT-safe and may be called from any thread.
     *
     * @return The passed #WebKitITPThirdParty
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun ref(): ITPThirdParty = webkit_itp_third_party_ref(webkitITPThirdPartyPointer.reinterpret())!!.run {
        ITPThirdParty(reinterpret())
    }

    /**
     * Atomically decrements the reference count of @itp_third_party by one.
     *
     * If the reference count drops to 0, all memory allocated by
     * #WebKitITPThirdParty is released. This function is MT-safe and may be
     * called from any thread.
     *
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun unref(): Unit = webkit_itp_third_party_unref(webkitITPThirdPartyPointer.reinterpret())

    public companion object {
        /**
         * Get the GType of ITPThirdParty
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_itp_third_party_get_type()
    }
}
