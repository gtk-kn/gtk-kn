// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_6
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitNavigationPolicyDecision
import org.gtkkn.native.webkit.webkit_navigation_policy_decision_get_navigation_action
import org.gtkkn.native.webkit.webkit_navigation_policy_decision_get_type

/**
 * A policy decision for navigation actions.
 *
 * WebKitNavigationPolicyDecision represents a policy decision for events associated with
 * navigations. If the value of #WebKitNavigationPolicyDecision:mouse-button is not 0, then
 * the navigation was triggered by a mouse event.
 */
public class NavigationPolicyDecision(
    public val webkitNavigationPolicyDecisionPointer: CPointer<WebKitNavigationPolicyDecision>,
) : PolicyDecision(webkitNavigationPolicyDecisionPointer.reinterpret()),
    KGTyped {
    init {
        WebKit
    }

    /**
     * The #WebKitNavigationAction that triggered this policy decision.
     *
     * @since 2.6
     */
    @WebKitVersion2_6
    public val navigationAction: NavigationAction
        /**
         * Gets the value of the #WebKitNavigationPolicyDecision:navigation-action property.
         *
         * @return The #WebKitNavigationAction triggering this policy decision.
         * @since 2.6
         */
        get() = webkit_navigation_policy_decision_get_navigation_action(webkitNavigationPolicyDecisionPointer)!!.run {
            NavigationAction(this)
        }

    public companion object : TypeCompanion<NavigationPolicyDecision> {
        override val type: GeneratedClassKGType<NavigationPolicyDecision> =
            GeneratedClassKGType(getTypeOrNull()!!) { NavigationPolicyDecision(it.reinterpret()) }

        init {
            WebKitTypeProvider.register()
        }

        /**
         * Get the GType of NavigationPolicyDecision
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_navigation_policy_decision_get_type()

        /**
         * Gets the GType of from the symbol `webkit_navigation_policy_decision_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("webkit_navigation_policy_decision_get_type")
    }
}
