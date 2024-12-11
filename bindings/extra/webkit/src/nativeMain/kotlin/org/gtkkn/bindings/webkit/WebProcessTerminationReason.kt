// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_20
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitWebProcessTerminationReason
import org.gtkkn.native.webkit.webkit_web_process_termination_reason_get_type

/**
 * Enum values used to specify the reason why the web process terminated abnormally.
 * @since 2.20
 */
@WebKitVersion2_20
public enum class WebProcessTerminationReason(public val nativeValue: WebKitWebProcessTerminationReason) {
    /**
     * the web process crashed.
     */
    CRASHED(WebKitWebProcessTerminationReason.WEBKIT_WEB_PROCESS_CRASHED),

    /**
     * the web process exceeded the memory limit.
     */
    EXCEEDED_MEMORY_LIMIT(WebKitWebProcessTerminationReason.WEBKIT_WEB_PROCESS_EXCEEDED_MEMORY_LIMIT),

    /**
     * the web process termination was requested by an API call. Since: 2.34
     */
    TERMINATED_BY_API(WebKitWebProcessTerminationReason.WEBKIT_WEB_PROCESS_TERMINATED_BY_API),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitWebProcessTerminationReason): WebProcessTerminationReason =
            when (nativeValue) {
                WebKitWebProcessTerminationReason.WEBKIT_WEB_PROCESS_CRASHED -> CRASHED
                WebKitWebProcessTerminationReason.WEBKIT_WEB_PROCESS_EXCEEDED_MEMORY_LIMIT -> EXCEEDED_MEMORY_LIMIT
                WebKitWebProcessTerminationReason.WEBKIT_WEB_PROCESS_TERMINATED_BY_API -> TERMINATED_BY_API
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of WebProcessTerminationReason
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_web_process_termination_reason_get_type()
    }
}
