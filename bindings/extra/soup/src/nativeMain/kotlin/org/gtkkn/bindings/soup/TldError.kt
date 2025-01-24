// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupTLDError
import org.gtkkn.native.soup.soup_tld_error_get_type
import org.gtkkn.native.soup.soup_tld_error_quark

/**
 * Error codes for %SOUP_TLD_ERROR.
 */
public enum class TldError(public val nativeValue: SoupTLDError) {
    /**
     * A hostname was syntactically
     *   invalid.
     */
    INVALID_HOSTNAME(SoupTLDError.SOUP_TLD_ERROR_INVALID_HOSTNAME),

    /**
     * The passed-in "hostname" was
     *   actually an IP address (and thus has no base domain or
     *   public suffix).
     */
    IS_IP_ADDRESS(SoupTLDError.SOUP_TLD_ERROR_IS_IP_ADDRESS),

    /**
     * The passed-in hostname
     *   did not have enough components. Eg, calling
     *   [func@tld_get_base_domain] on <literal>"co.uk"</literal>.
     */
    NOT_ENOUGH_DOMAINS(SoupTLDError.SOUP_TLD_ERROR_NOT_ENOUGH_DOMAINS),

    /**
     * The passed-in hostname has
     *   no recognized public suffix.
     */
    NO_BASE_DOMAIN(SoupTLDError.SOUP_TLD_ERROR_NO_BASE_DOMAIN),

    /**
     * The Public Suffix List was not
     *   available.
     */
    NO_PSL_DATA(SoupTLDError.SOUP_TLD_ERROR_NO_PSL_DATA),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupTLDError): TldError = when (nativeValue) {
            SoupTLDError.SOUP_TLD_ERROR_INVALID_HOSTNAME -> INVALID_HOSTNAME
            SoupTLDError.SOUP_TLD_ERROR_IS_IP_ADDRESS -> IS_IP_ADDRESS
            SoupTLDError.SOUP_TLD_ERROR_NOT_ENOUGH_DOMAINS -> NOT_ENOUGH_DOMAINS
            SoupTLDError.SOUP_TLD_ERROR_NO_BASE_DOMAIN -> NO_BASE_DOMAIN
            SoupTLDError.SOUP_TLD_ERROR_NO_PSL_DATA -> NO_PSL_DATA
            else -> error("invalid nativeValue")
        }

        /**
         * Registers error quark for soup_tld_get_base_domain() if needed.
         *
         * @return Error quark for Soup TLD functions.
         */
        public fun quark(): Quark = soup_tld_error_quark()

        /**
         * Get the GType of TLDError
         *
         * @return the GType
         */
        public fun getType(): GType = soup_tld_error_get_type()

        public fun fromErrorOrNull(error: Error): TldError? = if (error.domain != quark()) {
            null
        } else {
            TldError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
