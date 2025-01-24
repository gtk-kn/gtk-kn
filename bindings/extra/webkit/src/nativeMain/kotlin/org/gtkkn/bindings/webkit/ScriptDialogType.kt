// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitScriptDialogType
import org.gtkkn.native.webkit.webkit_script_dialog_type_get_type

/**
 * Enum values used for determining the type of #WebKitScriptDialog
 */
public enum class ScriptDialogType(public val nativeValue: WebKitScriptDialogType) {
    /**
     * Alert script dialog, used to show a
     * message to the user.
     */
    ALERT(WebKitScriptDialogType.WEBKIT_SCRIPT_DIALOG_ALERT),

    /**
     * Confirm script dialog, used to ask
     * confirmation to the user.
     */
    CONFIRM(WebKitScriptDialogType.WEBKIT_SCRIPT_DIALOG_CONFIRM),

    /**
     * Prompt script dialog, used to ask
     * information to the user.
     */
    PROMPT(WebKitScriptDialogType.WEBKIT_SCRIPT_DIALOG_PROMPT),

    /**
     * Before unload confirm dialog,
     * used to ask confirmation to leave the current page to the user. Since 2.12
     */
    BEFORE_UNLOAD_CONFIRM(WebKitScriptDialogType.WEBKIT_SCRIPT_DIALOG_BEFORE_UNLOAD_CONFIRM),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitScriptDialogType): ScriptDialogType = when (nativeValue) {
            WebKitScriptDialogType.WEBKIT_SCRIPT_DIALOG_ALERT -> ALERT
            WebKitScriptDialogType.WEBKIT_SCRIPT_DIALOG_CONFIRM -> CONFIRM
            WebKitScriptDialogType.WEBKIT_SCRIPT_DIALOG_PROMPT -> PROMPT
            WebKitScriptDialogType.WEBKIT_SCRIPT_DIALOG_BEFORE_UNLOAD_CONFIRM -> BEFORE_UNLOAD_CONFIRM
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ScriptDialogType
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_script_dialog_type_get_type()
    }
}
