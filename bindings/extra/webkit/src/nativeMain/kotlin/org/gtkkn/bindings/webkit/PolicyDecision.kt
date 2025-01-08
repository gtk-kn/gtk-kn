// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_30
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitPolicyDecision
import org.gtkkn.native.webkit.webkit_policy_decision_download
import org.gtkkn.native.webkit.webkit_policy_decision_get_type
import org.gtkkn.native.webkit.webkit_policy_decision_ignore
import org.gtkkn.native.webkit.webkit_policy_decision_use
import org.gtkkn.native.webkit.webkit_policy_decision_use_with_policies
import kotlin.Unit

/**
 * A pending policy decision.
 *
 * Often WebKit allows the client to decide the policy for certain
 * operations. For instance, a client may want to open a link in a new
 * tab, block a navigation entirely, query the user or trigger a download
 * instead of a navigation. In these cases WebKit will fire the
 * #WebKitWebView::decide-policy signal with a #WebKitPolicyDecision
 * object. If the signal handler does nothing, WebKit will act as if
 * webkit_policy_decision_use() was called as soon as signal handling
 * completes. To make a policy decision asynchronously, simply increment
 * the reference count of the #WebKitPolicyDecision object.
 */
public open class PolicyDecision(pointer: CPointer<WebKitPolicyDecision>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitPolicyDecisionPointer: CPointer<WebKitPolicyDecision>
        get() = gPointer.reinterpret()

    /**
     * Spawn a download from this decision.
     */
    public open fun download(): Unit = webkit_policy_decision_download(webkitPolicyDecisionPointer)

    /**
     * #WebKitResponsePolicyDecision, this would cancel the request.
     *
     * Ignore the action which triggered this decision. For instance, for a
     * #WebKitResponsePolicyDecision, this would cancel the request.
     */
    public open fun ignore(): Unit = webkit_policy_decision_ignore(webkitPolicyDecisionPointer)

    /**
     * Accept the action which triggered this decision.
     */
    public open fun use(): Unit = webkit_policy_decision_use(webkitPolicyDecisionPointer)

    /**
     * Accept the navigation action and continue with provided @policies.
     *
     * Accept the navigation action which triggered this decision, and
     * continue with @policies affecting all subsequent loads of resources
     * in the origin associated with the accepted navigation action.
     *
     * For example, a navigation decision to a video sharing website may
     * be accepted under the priviso no movies are allowed to autoplay. The
     * autoplay policy in this case would be set in the @policies.
     *
     * @param policies a #WebKitWebsitePolicies
     * @since 2.30
     */
    @WebKitVersion2_30
    public open fun useWithPolicies(policies: WebsitePolicies): Unit =
        webkit_policy_decision_use_with_policies(webkitPolicyDecisionPointer, policies.webkitWebsitePoliciesPointer)

    public companion object : TypeCompanion<PolicyDecision> {
        override val type: GeneratedClassKGType<PolicyDecision> =
            GeneratedClassKGType(webkit_policy_decision_get_type()) { PolicyDecision(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of PolicyDecision
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_policy_decision_get_type()
    }
}
