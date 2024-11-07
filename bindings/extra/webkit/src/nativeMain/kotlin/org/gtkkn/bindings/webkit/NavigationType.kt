// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.native.webkit.WebKitNavigationType

/**
 * Enum values used to denote the various navigation types.
 */
public enum class NavigationType(
    public val nativeValue: WebKitNavigationType,
) {
    /**
     * The navigation was triggered by clicking a link.
     */
    LINK_CLICKED(WebKitNavigationType.WEBKIT_NAVIGATION_TYPE_LINK_CLICKED),

    /**
     * The navigation was triggered by submitting a form.
     */
    FORM_SUBMITTED(WebKitNavigationType.WEBKIT_NAVIGATION_TYPE_FORM_SUBMITTED),

    /**
     * The navigation was triggered by navigating forward or backward.
     */
    BACK_FORWARD(WebKitNavigationType.WEBKIT_NAVIGATION_TYPE_BACK_FORWARD),

    /**
     * The navigation was triggered by reloading.
     */
    RELOAD(WebKitNavigationType.WEBKIT_NAVIGATION_TYPE_RELOAD),

    /**
     * The navigation was triggered by resubmitting a form.
     */
    FORM_RESUBMITTED(WebKitNavigationType.WEBKIT_NAVIGATION_TYPE_FORM_RESUBMITTED),

    /**
     * The navigation was triggered by some other action.
     */
    OTHER(WebKitNavigationType.WEBKIT_NAVIGATION_TYPE_OTHER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitNavigationType): NavigationType =
            when (nativeValue) {
                WebKitNavigationType.WEBKIT_NAVIGATION_TYPE_LINK_CLICKED -> LINK_CLICKED
                WebKitNavigationType.WEBKIT_NAVIGATION_TYPE_FORM_SUBMITTED -> FORM_SUBMITTED
                WebKitNavigationType.WEBKIT_NAVIGATION_TYPE_BACK_FORWARD -> BACK_FORWARD
                WebKitNavigationType.WEBKIT_NAVIGATION_TYPE_RELOAD -> RELOAD
                WebKitNavigationType.WEBKIT_NAVIGATION_TYPE_FORM_RESUBMITTED -> FORM_RESUBMITTED
                WebKitNavigationType.WEBKIT_NAVIGATION_TYPE_OTHER -> OTHER
                else -> error("invalid nativeValue")
            }
    }
}
