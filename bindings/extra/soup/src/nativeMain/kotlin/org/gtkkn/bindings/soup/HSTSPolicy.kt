// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.soup.SoupHSTSPolicy
import org.gtkkn.native.soup.soup_hsts_policy_copy
import org.gtkkn.native.soup.soup_hsts_policy_equal
import org.gtkkn.native.soup.soup_hsts_policy_free
import org.gtkkn.native.soup.soup_hsts_policy_get_domain
import org.gtkkn.native.soup.soup_hsts_policy_get_expires
import org.gtkkn.native.soup.soup_hsts_policy_get_max_age
import org.gtkkn.native.soup.soup_hsts_policy_includes_subdomains
import org.gtkkn.native.soup.soup_hsts_policy_is_expired
import org.gtkkn.native.soup.soup_hsts_policy_is_session_policy
import org.gtkkn.native.soup.soup_hsts_policy_new
import org.gtkkn.native.soup.soup_hsts_policy_new_from_response
import org.gtkkn.native.soup.soup_hsts_policy_new_full
import org.gtkkn.native.soup.soup_hsts_policy_new_session_policy
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * #SoupHSTSPolicy implements HTTP policies, as described by
 * [RFC 6797](http://tools.ietf.org/html/rfc6797).
 *
 * @domain represents the host that this policy applies to. The domain
 * must be IDNA-canonicalized. [ctor@HSTSPolicy.new] and related methods
 * will do this for you.
 *
 * @max_age contains the 'max-age' value from the Strict Transport
 * Security header and indicates the time to live of this policy,
 * in seconds.
 *
 * @expires will be non-null if the policy has been set by the host and
 * hence has an expiry time. If @expires is null, it indicates that the
 * policy is a permanent session policy set by the user agent.
 *
 * If @include_subdomains is true, the Strict Transport Security policy
 * must also be enforced on subdomains of @domain.
 */
public class HSTSPolicy(
    pointer: CPointer<SoupHSTSPolicy>,
) : Record {
    public val soupHSTSPolicyPointer: CPointer<SoupHSTSPolicy> = pointer

    /**
     * Copies @policy.
     *
     * @return a copy of @policy
     */
    public fun copy(): HSTSPolicy =
        soup_hsts_policy_copy(soupHSTSPolicyPointer.reinterpret())!!.run {
            HSTSPolicy(reinterpret())
        }

    /**
     * Tests if @policy1 and @policy2 are equal.
     *
     * @param policy2 a #SoupHSTSPolicy
     * @return whether the policies are equal.
     */
    public fun equal(policy2: HSTSPolicy): Boolean =
        soup_hsts_policy_equal(soupHSTSPolicyPointer.reinterpret(), policy2.soupHSTSPolicyPointer).asBoolean()

    /**
     * Frees @policy.
     */
    public fun free(): Unit = soup_hsts_policy_free(soupHSTSPolicyPointer.reinterpret())

    /**
     * Gets @policy's domain.
     *
     * @return @policy's domain.
     */
    public fun getDomain(): String =
        soup_hsts_policy_get_domain(soupHSTSPolicyPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns the expiration date for @policy.
     *
     * @return A #GDateTime or null if unset
     */
    public fun getExpires(): DateTime =
        soup_hsts_policy_get_expires(soupHSTSPolicyPointer.reinterpret())!!.run {
            DateTime(reinterpret())
        }

    /**
     * Returns the max age for @policy.
     *
     * @return Max age in seconds
     */
    public fun getMaxAge(): ULong = soup_hsts_policy_get_max_age(soupHSTSPolicyPointer.reinterpret())

    /**
     * Gets whether @policy include its subdomains.
     *
     * @return true if @policy includes subdomains, false otherwise.
     */
    public fun includesSubdomains(): Boolean =
        soup_hsts_policy_includes_subdomains(soupHSTSPolicyPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @policy is expired.
     *
     * Permanent policies never expire.
     *
     * @return true if @policy is expired, false otherwise.
     */
    public fun isExpired(): Boolean = soup_hsts_policy_is_expired(soupHSTSPolicyPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @policy is a non-permanent, non-expirable session policy.
     *
     * See [ctor@HSTSPolicy.new_session_policy] for details.
     *
     * @return true if @policy is permanent, false otherwise
     */
    public fun isSessionPolicy(): Boolean =
        soup_hsts_policy_is_session_policy(soupHSTSPolicyPointer.reinterpret()).asBoolean()

    public companion object : RecordCompanion<HSTSPolicy, SoupHSTSPolicy> {
        /**
         * Creates a new #SoupHSTSPolicy with the given attributes.
         *
         * @domain is a domain on which the strict transport security policy
         * represented by this object must be enforced.
         *
         * @max_age is used to set the "expires" attribute on the policy; pass
         * %SOUP_HSTS_POLICY_MAX_AGE_PAST for an already-expired policy, or a
         * lifetime in seconds.
         *
         * If @include_subdomains is true, the strict transport security policy
         * must also be enforced on all subdomains of @domain.
         *
         * @param domain policy domain or hostname
         * @param maxAge max age of the policy
         * @param includeSubdomains true if the policy applies on subdomains
         * @return a new #SoupHSTSPolicy.
         */
        public fun new(
            domain: String,
            maxAge: ULong,
            includeSubdomains: Boolean,
        ): HSTSPolicy = HSTSPolicy(soup_hsts_policy_new(domain, maxAge, includeSubdomains.asGBoolean())!!.reinterpret())

        /**
         * Parses @msg's first "Strict-Transport-Security" response header and
         * returns a #SoupHSTSPolicy.
         *
         * @param msg a #SoupMessage
         * @return a new #SoupHSTSPolicy, or null if no valid
         *   "Strict-Transport-Security" response header was found.
         */
        public fun newFromResponse(msg: Message): HSTSPolicy? =
            HSTSPolicy(soup_hsts_policy_new_from_response(msg.soupMessagePointer.reinterpret())!!.reinterpret())

        /**
         * Full version of [ctor@HSTSPolicy.new], to use with an existing
         * expiration date.
         *
         * See [ctor@HSTSPolicy.new] for details.
         *
         * @param domain policy domain or hostname
         * @param maxAge max age of the policy
         * @param expires the date of expiration of the policy or null for a permanent policy
         * @param includeSubdomains true if the policy applies on subdomains
         * @return a new #SoupHSTSPolicy.
         */
        public fun newFull(
            domain: String,
            maxAge: ULong,
            expires: DateTime,
            includeSubdomains: Boolean,
        ): HSTSPolicy =
            HSTSPolicy(
                soup_hsts_policy_new_full(
                    domain,
                    maxAge,
                    expires.glibDateTimePointer,
                    includeSubdomains.asGBoolean()
                )!!.reinterpret()
            )

        /**
         * Creates a new session #SoupHSTSPolicy with the given attributes.
         *
         * A session policy is a policy that is valid during the lifetime of
         * the [class@HSTSEnforcer] it is added to. Contrary to regular policies,
         * it has no expiration date and is not stored in persistent
         * enforcers. These policies are useful for user-agent to load their
         * own or user-defined rules.
         *
         * @domain is a domain on which the strict transport security policy
         * represented by this object must be enforced.
         *
         * If @include_subdomains is true, the strict transport security policy
         * must also be enforced on all subdomains of @domain.
         *
         * @param domain policy domain or hostname
         * @param includeSubdomains true if the policy applies on sub domains
         * @return a new #SoupHSTSPolicy.
         */
        public fun newSessionPolicy(
            domain: String,
            includeSubdomains: Boolean,
        ): HSTSPolicy =
            HSTSPolicy(soup_hsts_policy_new_session_policy(domain, includeSubdomains.asGBoolean())!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): HSTSPolicy = HSTSPolicy(pointer.reinterpret())
    }
}
