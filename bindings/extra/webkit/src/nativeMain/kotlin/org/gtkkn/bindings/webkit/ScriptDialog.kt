// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_24
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitScriptDialog
import org.gtkkn.native.webkit.webkit_script_dialog_close
import org.gtkkn.native.webkit.webkit_script_dialog_confirm_set_confirmed
import org.gtkkn.native.webkit.webkit_script_dialog_get_dialog_type
import org.gtkkn.native.webkit.webkit_script_dialog_get_message
import org.gtkkn.native.webkit.webkit_script_dialog_get_type
import org.gtkkn.native.webkit.webkit_script_dialog_prompt_get_default_text
import org.gtkkn.native.webkit.webkit_script_dialog_prompt_set_text
import org.gtkkn.native.webkit.webkit_script_dialog_ref
import org.gtkkn.native.webkit.webkit_script_dialog_unref
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Carries details to be shown in user-facing dialogs.
 */
public class ScriptDialog(pointer: CPointer<WebKitScriptDialog>) : ProxyInstance(pointer) {
    public val webkitScriptDialogPointer: CPointer<WebKitScriptDialog> = pointer

    /**
     * Close @dialog.
     *
     * When handling a #WebKitScriptDialog asynchronously (webkit_script_dialog_ref()
     * was called in #WebKitWebView::script-dialog callback), this function needs to be called to notify
     * that we are done with the script dialog. The dialog will be closed on destruction if this function
     * hasn't been called before.
     *
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun close(): Unit = webkit_script_dialog_close(webkitScriptDialogPointer.reinterpret())

    /**
     * Set whether the user confirmed the dialog.
     *
     * This method is used for %WEBKIT_SCRIPT_DIALOG_CONFIRM and %WEBKIT_SCRIPT_DIALOG_BEFORE_UNLOAD_CONFIRM dialogs when
     * #WebKitWebView::script-dialog signal is emitted to set whether the user
     * confirmed the dialog or not. The default implementation of #WebKitWebView::script-dialog
     * signal sets true when the OK or Stay buttons are clicked and false otherwise.
     * It's an error to use this method with a #WebKitScriptDialog that is not of type
     * %WEBKIT_SCRIPT_DIALOG_CONFIRM or %WEBKIT_SCRIPT_DIALOG_BEFORE_UNLOAD_CONFIRM
     *
     * @param confirmed whether user confirmed the dialog
     */
    public fun confirmSetConfirmed(confirmed: Boolean): Unit =
        webkit_script_dialog_confirm_set_confirmed(webkitScriptDialogPointer.reinterpret(), confirmed.asGBoolean())

    /**
     * Get the dialog type of a #WebKitScriptDialog.
     *
     * @return the #WebKitScriptDialogType of @dialog
     */
    public fun getDialogType(): ScriptDialogType =
        webkit_script_dialog_get_dialog_type(webkitScriptDialogPointer.reinterpret()).run {
            ScriptDialogType.fromNativeValue(this)
        }

    /**
     * Get the message of a #WebKitScriptDialog.
     *
     * @return the message of @dialog.
     */
    public fun getMessage(): String =
        webkit_script_dialog_get_message(webkitScriptDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the default text of a #WebKitScriptDialog of type %WEBKIT_SCRIPT_DIALOG_PROMPT.
     *
     * It's an error to use this method with a #WebKitScriptDialog that is not of type
     * %WEBKIT_SCRIPT_DIALOG_PROMPT.
     *
     * @return the default text of @dialog
     */
    public fun promptGetDefaultText(): String =
        webkit_script_dialog_prompt_get_default_text(webkitScriptDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Set the text entered by the user in the dialog.
     *
     * This method is used for %WEBKIT_SCRIPT_DIALOG_PROMPT dialogs when
     * #WebKitWebView::script-dialog signal is emitted to set the text
     * entered by the user. The default implementation of #WebKitWebView::script-dialog
     * signal sets the text of the entry form when OK button is clicked, otherwise null is set.
     * It's an error to use this method with a #WebKitScriptDialog that is not of type
     * %WEBKIT_SCRIPT_DIALOG_PROMPT.
     *
     * @param text the text to set
     */
    public fun promptSetText(text: String): Unit =
        webkit_script_dialog_prompt_set_text(webkitScriptDialogPointer.reinterpret(), text)

    /**
     * Atomically increments the reference count of @dialog by one.
     *
     * This
     * function is MT-safe and may be called from any thread.
     *
     * @return The passed in #WebKitScriptDialog
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun ref(): ScriptDialog = webkit_script_dialog_ref(webkitScriptDialogPointer.reinterpret())!!.run {
        ScriptDialog(reinterpret())
    }

    /**
     * Atomically decrements the reference count of @dialog by one.
     *
     * If the
     * reference count drops to 0, all memory allocated by the #WebKitScriptdialog is
     * released. This function is MT-safe and may be called from any
     * thread.
     *
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun unref(): Unit = webkit_script_dialog_unref(webkitScriptDialogPointer.reinterpret())

    public companion object {
        /**
         * Get the GType of ScriptDialog
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_script_dialog_get_type()
    }
}
