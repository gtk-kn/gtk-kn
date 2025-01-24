// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitPolicyError
import org.gtkkn.native.webkit.webkit_policy_error_get_type
import org.gtkkn.native.webkit.webkit_policy_error_quark

/**
 * Enum values used to denote the various policy errors.
 */
public enum class PolicyError(public val nativeValue: WebKitPolicyError) {
    /**
     * Generic load failure due to policy error
     */
    FAILED(WebKitPolicyError.WEBKIT_POLICY_ERROR_FAILED),

    /**
     * Load failure due to unsupported mime type
     */
    CANNOT_SHOW_MIME_TYPE(WebKitPolicyError.WEBKIT_POLICY_ERROR_CANNOT_SHOW_MIME_TYPE),

    /**
     * Load failure due to URI that can not be shown
     */
    CANNOT_SHOW_URI(WebKitPolicyError.WEBKIT_POLICY_ERROR_CANNOT_SHOW_URI),

    /**
     * Load failure due to frame load interruption by policy change
     */
    FRAME_LOAD_INTERRUPTED_BY_POLICY_CHANGE(
        WebKitPolicyError.WEBKIT_POLICY_ERROR_FRAME_LOAD_INTERRUPTED_BY_POLICY_CHANGE
    ),

    /**
     * Load failure due to port restriction
     */
    CANNOT_USE_RESTRICTED_PORT(WebKitPolicyError.WEBKIT_POLICY_ERROR_CANNOT_USE_RESTRICTED_PORT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitPolicyError): PolicyError = when (nativeValue) {
            WebKitPolicyError.WEBKIT_POLICY_ERROR_FAILED -> FAILED
            WebKitPolicyError.WEBKIT_POLICY_ERROR_CANNOT_SHOW_MIME_TYPE -> CANNOT_SHOW_MIME_TYPE
            WebKitPolicyError.WEBKIT_POLICY_ERROR_CANNOT_SHOW_URI -> CANNOT_SHOW_URI
            WebKitPolicyError.WEBKIT_POLICY_ERROR_FRAME_LOAD_INTERRUPTED_BY_POLICY_CHANGE -> FRAME_LOAD_INTERRUPTED_BY_POLICY_CHANGE
            WebKitPolicyError.WEBKIT_POLICY_ERROR_CANNOT_USE_RESTRICTED_PORT -> CANNOT_USE_RESTRICTED_PORT
            else -> error("invalid nativeValue")
        }

        /**
         * Gets the quark for the domain of policy errors.
         *
         * @return policy error domain.
         */
        public fun quark(): Quark = webkit_policy_error_quark()

        /**
         * Get the GType of PolicyError
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_policy_error_get_type()

        public fun fromErrorOrNull(error: Error): PolicyError? = if (error.domain != quark()) {
            null
        } else {
            PolicyError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
