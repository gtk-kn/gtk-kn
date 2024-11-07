// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_20
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_6
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.webkit.WebKitNavigationAction
import org.gtkkn.native.webkit.webkit_navigation_action_copy
import org.gtkkn.native.webkit.webkit_navigation_action_free
import org.gtkkn.native.webkit.webkit_navigation_action_get_frame_name
import org.gtkkn.native.webkit.webkit_navigation_action_get_modifiers
import org.gtkkn.native.webkit.webkit_navigation_action_get_mouse_button
import org.gtkkn.native.webkit.webkit_navigation_action_get_navigation_type
import org.gtkkn.native.webkit.webkit_navigation_action_get_request
import org.gtkkn.native.webkit.webkit_navigation_action_is_redirect
import org.gtkkn.native.webkit.webkit_navigation_action_is_user_gesture
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * Provides details about interaction resulting in a resource load.
 */
public class NavigationAction(
    pointer: CPointer<WebKitNavigationAction>,
) : Record {
    public val webkitNavigationActionPointer: CPointer<WebKitNavigationAction> = pointer

    /**
     * Make a copy of @navigation.
     *
     * @return A copy of passed in #WebKitNavigationAction
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun copy(): NavigationAction =
        webkit_navigation_action_copy(webkitNavigationActionPointer.reinterpret())!!.run {
            NavigationAction(reinterpret())
        }

    /**
     * Free the #WebKitNavigationAction
     *
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun free(): Unit = webkit_navigation_action_free(webkitNavigationActionPointer.reinterpret())

    /**
     * Gets the @navigation target frame name. For example if navigation was triggered by clicking a
     * link with a target attribute equal to "_blank", this will return the value of that attribute.
     * In all other cases this function will return null.
     *
     * @return The name of the new frame this navigation action targets or null
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getFrameName(): String? =
        webkit_navigation_action_get_frame_name(webkitNavigationActionPointer.reinterpret())?.toKString()

    /**
     * Return the modifier keys.
     *
     * Return a bitmask of #GdkModifierType values describing the modifier keys that were in effect
     * when the navigation was requested
     *
     * @return the modifier keys
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun getModifiers(): UInt =
        webkit_navigation_action_get_modifiers(webkitNavigationActionPointer.reinterpret())

    /**
     * Return the number of the mouse button that triggered the navigation.
     *
     * Return the number of the mouse button that triggered the navigation, or 0 if
     * the navigation was not started by a mouse event.
     *
     * @return the mouse button number or 0
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun getMouseButton(): UInt =
        webkit_navigation_action_get_mouse_button(webkitNavigationActionPointer.reinterpret())

    /**
     * Return the type of action that triggered the navigation.
     *
     * @return a #WebKitNavigationType
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun getNavigationType(): NavigationType =
        webkit_navigation_action_get_navigation_type(webkitNavigationActionPointer.reinterpret()).run {
            NavigationType.fromNativeValue(this)
        }

    /**
     * Return the #WebKitURIRequest associated with the navigation action.
     *
     * Modifications to the returned object are <emphasis>not</emphasis> taken
     * into account when the request is sent over the network, and is intended
     * only to aid in evaluating whether a navigation action should be taken or
     * not. To modify requests before they are sent over the network the
     * #WebKitPage::send-request signal can be used instead.
     *
     * @return a #WebKitURIRequest
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun getRequest(): URIRequest =
        webkit_navigation_action_get_request(webkitNavigationActionPointer.reinterpret())!!.run {
            URIRequest(reinterpret())
        }

    /**
     * Returns whether the @navigation was redirected.
     *
     * @return true if the original navigation was redirected, false otherwise.
     * @since 2.20
     */
    @WebKitVersion2_20
    public fun isRedirect(): Boolean =
        webkit_navigation_action_is_redirect(webkitNavigationActionPointer.reinterpret()).asBoolean()

    /**
     * Return whether the navigation was triggered by a user gesture like a mouse click.
     *
     * @return whether navigation action is a user gesture
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun isUserGesture(): Boolean =
        webkit_navigation_action_is_user_gesture(webkitNavigationActionPointer.reinterpret()).asBoolean()

    public companion object : RecordCompanion<NavigationAction, WebKitNavigationAction> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): NavigationAction =
            NavigationAction(pointer.reinterpret())
    }
}
