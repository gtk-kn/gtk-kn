// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_28
import org.gtkkn.native.webkit.WebKitAutomationBrowsingContextPresentation

/**
 * Enum values used for determining the automation browsing context presentation.
 * @since 2.28
 */
@WebKitVersion2_28
public enum class AutomationBrowsingContextPresentation(
    public val nativeValue: WebKitAutomationBrowsingContextPresentation,
) {
    /**
     * a window
     */
    WINDOW(WebKitAutomationBrowsingContextPresentation.WEBKIT_AUTOMATION_BROWSING_CONTEXT_PRESENTATION_WINDOW),

    /**
     * a tab
     */
    TAB(WebKitAutomationBrowsingContextPresentation.WEBKIT_AUTOMATION_BROWSING_CONTEXT_PRESENTATION_TAB),
    ;

    public companion object {
        public fun fromNativeValue(
            nativeValue: WebKitAutomationBrowsingContextPresentation,
        ): AutomationBrowsingContextPresentation =
            when (nativeValue) {
                WebKitAutomationBrowsingContextPresentation.WEBKIT_AUTOMATION_BROWSING_CONTEXT_PRESENTATION_WINDOW -> WINDOW
                WebKitAutomationBrowsingContextPresentation.WEBKIT_AUTOMATION_BROWSING_CONTEXT_PRESENTATION_TAB -> TAB
                else -> error("invalid nativeValue")
            }
    }
}
