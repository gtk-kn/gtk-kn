// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_4
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.webkit.WebKitResponsePolicyDecision
import org.gtkkn.native.webkit.webkit_response_policy_decision_get_request
import org.gtkkn.native.webkit.webkit_response_policy_decision_get_response
import org.gtkkn.native.webkit.webkit_response_policy_decision_get_type
import org.gtkkn.native.webkit.webkit_response_policy_decision_is_main_frame_main_resource
import org.gtkkn.native.webkit.webkit_response_policy_decision_is_mime_type_supported
import kotlin.Boolean

/**
 * A policy decision for resource responses.
 *
 * WebKitResponsePolicyDecision represents a policy decision for a
 * resource response, whether from the network or the local system.
 * A very common use case for these types of decision is deciding
 * whether or not to download a particular resource or to load it
 * normally.
 */
public class ResponsePolicyDecision(
    pointer: CPointer<WebKitResponsePolicyDecision>,
) : PolicyDecision(pointer.reinterpret()),
    KGTyped {
    public val webkitResponsePolicyDecisionPointer: CPointer<WebKitResponsePolicyDecision>
        get() = gPointer.reinterpret()

    /**
     * This property contains the #WebKitURIRequest associated with this
     * policy decision.
     */
    public val request: URIRequest
        /**
         * Return the #WebKitURIRequest associated with the response decision.
         *
         * Modifications to the returned object are <emphasis>not</emphasis> taken
         * into account when the request is sent over the network, and is intended
         * only to aid in evaluating whether a response decision should be taken or
         * not. To modify requests before they are sent over the network the
         * #WebKitPage::send-request signal can be used instead.
         *
         * @return The URI request that is associated with this policy decision.
         */
        get() =
            webkit_response_policy_decision_get_request(webkitResponsePolicyDecisionPointer.reinterpret())!!.run {
                URIRequest(reinterpret())
            }

    /**
     * This property contains the #WebKitURIResponse associated with this
     * policy decision.
     */
    public val response: URIResponse
        /**
         * Gets the value of the #WebKitResponsePolicyDecision:response property.
         *
         * @return The URI response that is associated with this policy decision.
         */
        get() =
            webkit_response_policy_decision_get_response(webkitResponsePolicyDecisionPointer.reinterpret())!!.run {
                URIResponse(reinterpret())
            }

    /**
     * Return the #WebKitURIRequest associated with the response decision.
     *
     * Modifications to the returned object are <emphasis>not</emphasis> taken
     * into account when the request is sent over the network, and is intended
     * only to aid in evaluating whether a response decision should be taken or
     * not. To modify requests before they are sent over the network the
     * #WebKitPage::send-request signal can be used instead.
     *
     * @return The URI request that is associated with this policy decision.
     */
    public fun getRequest(): URIRequest =
        webkit_response_policy_decision_get_request(webkitResponsePolicyDecisionPointer.reinterpret())!!.run {
            URIRequest(reinterpret())
        }

    /**
     * Gets the value of the #WebKitResponsePolicyDecision:response property.
     *
     * @return The URI response that is associated with this policy decision.
     */
    public fun getResponse(): URIResponse =
        webkit_response_policy_decision_get_response(webkitResponsePolicyDecisionPointer.reinterpret())!!.run {
            URIResponse(reinterpret())
        }

    /**
     * Gets whether the request is the main frame main resource
     *
     * @return true if the request is the main frame main resouce or false otherwise
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun isMainFrameMainResource(): Boolean =
        webkit_response_policy_decision_is_main_frame_main_resource(
            webkitResponsePolicyDecisionPointer.reinterpret()
        ).asBoolean()

    /**
     * Gets whether the MIME type of the response can be displayed in the #WebKitWebView.
     *
     * Gets whether the MIME type of the response can be displayed in the #WebKitWebView
     * that triggered this policy decision request. See also webkit_web_view_can_show_mime_type().
     *
     * @return true if the MIME type of the response is supported or false otherwise
     * @since 2.4
     */
    @WebKitVersion2_4
    public fun isMimeTypeSupported(): Boolean =
        webkit_response_policy_decision_is_mime_type_supported(
            webkitResponsePolicyDecisionPointer.reinterpret()
        ).asBoolean()

    public companion object : TypeCompanion<ResponsePolicyDecision> {
        override val type: GeneratedClassKGType<ResponsePolicyDecision> =
            GeneratedClassKGType(
                webkit_response_policy_decision_get_type()
            ) { ResponsePolicyDecision(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }
    }
}
