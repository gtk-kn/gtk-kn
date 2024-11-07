// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.native.webkit.WebKitScriptDialogType

/**
 * Enum values used for determining the type of #WebKitScriptDialog
 */
public enum class ScriptDialogType(
    public val nativeValue: WebKitScriptDialogType,
) {
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
        public fun fromNativeValue(nativeValue: WebKitScriptDialogType): ScriptDialogType =
            when (nativeValue) {
                WebKitScriptDialogType.WEBKIT_SCRIPT_DIALOG_ALERT -> ALERT
                WebKitScriptDialogType.WEBKIT_SCRIPT_DIALOG_CONFIRM -> CONFIRM
                WebKitScriptDialogType.WEBKIT_SCRIPT_DIALOG_PROMPT -> PROMPT
                WebKitScriptDialogType.WEBKIT_SCRIPT_DIALOG_BEFORE_UNLOAD_CONFIRM -> BEFORE_UNLOAD_CONFIRM
                else -> error("invalid nativeValue")
            }
    }
}
