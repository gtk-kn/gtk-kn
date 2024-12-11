// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_6
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitUserStyleLevel
import org.gtkkn.native.webkit.webkit_user_style_level_get_type

/**
 * Specifies how to treat an user style sheet.
 * @since 2.6
 */
@WebKitVersion2_6
public enum class UserStyleLevel(public val nativeValue: WebKitUserStyleLevel) {
    /**
     * The style sheet is an user style sheet,
     *   its contents always override other style sheets. This is the default.
     */
    USER(WebKitUserStyleLevel.WEBKIT_USER_STYLE_LEVEL_USER),

    /**
     * The style sheet will be treated as if
     *   it was provided by the loaded documents. That means other user style
     *   sheets may still override it.
     */
    AUTHOR(WebKitUserStyleLevel.WEBKIT_USER_STYLE_LEVEL_AUTHOR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitUserStyleLevel): UserStyleLevel = when (nativeValue) {
            WebKitUserStyleLevel.WEBKIT_USER_STYLE_LEVEL_USER -> USER
            WebKitUserStyleLevel.WEBKIT_USER_STYLE_LEVEL_AUTHOR -> AUTHOR
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of UserStyleLevel
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_user_style_level_get_type()
    }
}
