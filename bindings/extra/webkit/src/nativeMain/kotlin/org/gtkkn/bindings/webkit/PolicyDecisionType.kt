// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitPolicyDecisionType
import org.gtkkn.native.webkit.webkit_policy_decision_type_get_type

/**
 * Enum values used for determining the type of a policy decision during
 * #WebKitWebView::decide-policy.
 */
public enum class PolicyDecisionType(public val nativeValue: WebKitPolicyDecisionType) {
    /**
     * This type of policy decision
     *   is requested when WebKit is about to navigate to a new page in either the
     *   main frame or a subframe. Acceptable policy decisions are either
     *   webkit_policy_decision_use() or webkit_policy_decision_ignore(). This
     *   type of policy decision is always a #WebKitNavigationPolicyDecision.
     */
    NAVIGATION_ACTION(WebKitPolicyDecisionType.WEBKIT_POLICY_DECISION_TYPE_NAVIGATION_ACTION),

    /**
     * This type of policy decision
     *   is requested when WebKit is about to create a new window. Acceptable policy
     *   decisions are either webkit_policy_decision_use() or
     *   webkit_policy_decision_ignore(). This type of policy decision is always
     *   a #WebKitNavigationPolicyDecision. These decisions are useful for implementing
     *   special actions for new windows, such as forcing the new window to open
     *   in a tab when a keyboard modifier is active or handling a special
     *   target attribute on <a> elements.
     */
    NEW_WINDOW_ACTION(WebKitPolicyDecisionType.WEBKIT_POLICY_DECISION_TYPE_NEW_WINDOW_ACTION),

    /**
     * This type of decision is used when WebKit has
     *   received a response for a network resource and is about to start the load.
     *   Note that these resources include all subresources of a page such as images
     *   and stylesheets as well as main documents. Appropriate policy responses to
     *   this decision are webkit_policy_decision_use(), webkit_policy_decision_ignore(),
     *   or webkit_policy_decision_download(). This type of policy decision is always
     *   a #WebKitResponsePolicyDecision. This decision is useful for forcing
     *   some types of resources to be downloaded rather than rendered in the WebView
     *   or to block the transfer of resources entirely.
     */
    RESPONSE(WebKitPolicyDecisionType.WEBKIT_POLICY_DECISION_TYPE_RESPONSE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitPolicyDecisionType): PolicyDecisionType = when (nativeValue) {
            WebKitPolicyDecisionType.WEBKIT_POLICY_DECISION_TYPE_NAVIGATION_ACTION -> NAVIGATION_ACTION
            WebKitPolicyDecisionType.WEBKIT_POLICY_DECISION_TYPE_NEW_WINDOW_ACTION -> NEW_WINDOW_ACTION
            WebKitPolicyDecisionType.WEBKIT_POLICY_DECISION_TYPE_RESPONSE -> RESPONSE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PolicyDecisionType
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_policy_decision_type_get_type()
    }
}
