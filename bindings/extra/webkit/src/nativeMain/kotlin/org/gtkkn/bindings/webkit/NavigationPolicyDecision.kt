// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_6
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public class NavigationPolicyDecision(pointer: CPointer<WebKitNavigationPolicyDecision>) :
    PolicyDecision(pointer.reinterpret()),
    KGTyped {
    public val webkitNavigationPolicyDecisionPointer: CPointer<WebKitNavigationPolicyDecision>
        get() = gPointer.reinterpret()

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
        get() = webkit_navigation_policy_decision_get_navigation_action(
            webkitNavigationPolicyDecisionPointer.reinterpret()
        )!!.run {
            NavigationAction(reinterpret())
        }

    public companion object : TypeCompanion<NavigationPolicyDecision> {
        override val type: GeneratedClassKGType<NavigationPolicyDecision> =
            GeneratedClassKGType(webkit_navigation_policy_decision_get_type()) {
                NavigationPolicyDecision(it.reinterpret())
            }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of NavigationPolicyDecision
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_navigation_policy_decision_get_type()
    }
}
