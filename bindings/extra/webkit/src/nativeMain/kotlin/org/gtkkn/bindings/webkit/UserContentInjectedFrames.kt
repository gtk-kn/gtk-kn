// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_6
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitUserContentInjectedFrames
import org.gtkkn.native.webkit.webkit_user_content_injected_frames_get_type

/**
 * Specifies in which frames user style sheets are to be inserted in.
 * @since 2.6
 */
@WebKitVersion2_6
public enum class UserContentInjectedFrames(public val nativeValue: WebKitUserContentInjectedFrames) {
    /**
     * Insert the user style
     *   sheet in all the frames loaded by the web view, including
     *   nested frames. This is the default.
     */
    ALL_FRAMES(WebKitUserContentInjectedFrames.WEBKIT_USER_CONTENT_INJECT_ALL_FRAMES),

    /**
     * Insert the user style
     *   sheet *only* in the top-level frame loaded by the web view,
     *   and *not* in the nested frames.
     */
    TOP_FRAME(WebKitUserContentInjectedFrames.WEBKIT_USER_CONTENT_INJECT_TOP_FRAME),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitUserContentInjectedFrames): UserContentInjectedFrames =
            when (nativeValue) {
                WebKitUserContentInjectedFrames.WEBKIT_USER_CONTENT_INJECT_ALL_FRAMES -> ALL_FRAMES
                WebKitUserContentInjectedFrames.WEBKIT_USER_CONTENT_INJECT_TOP_FRAME -> TOP_FRAME
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of UserContentInjectedFrames
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_user_content_injected_frames_get_type()
    }
}
