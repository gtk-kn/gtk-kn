// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_6
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitUserScriptInjectionTime
import org.gtkkn.native.webkit.webkit_user_script_injection_time_get_type

/**
 * Specifies at which place of documents an user script will be inserted.
 * @since 2.6
 */
@WebKitVersion2_6
public enum class UserScriptInjectionTime(public val nativeValue: WebKitUserScriptInjectionTime) {
    /**
     * Insert the code of the user
     *   script at the beginning of loaded documents. This is the default.
     */
    START(WebKitUserScriptInjectionTime.WEBKIT_USER_SCRIPT_INJECT_AT_DOCUMENT_START),

    /**
     * Insert the code of the user
     *   script at the end of the loaded documents.
     */
    END(WebKitUserScriptInjectionTime.WEBKIT_USER_SCRIPT_INJECT_AT_DOCUMENT_END),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitUserScriptInjectionTime): UserScriptInjectionTime =
            when (nativeValue) {
                WebKitUserScriptInjectionTime.WEBKIT_USER_SCRIPT_INJECT_AT_DOCUMENT_START -> START
                WebKitUserScriptInjectionTime.WEBKIT_USER_SCRIPT_INJECT_AT_DOCUMENT_END -> END
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of UserScriptInjectionTime
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_user_script_injection_time_get_type()
    }
}
