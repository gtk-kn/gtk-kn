// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gtk.GtkAlertDialog
import org.gtkkn.native.gtk.gtk_alert_dialog_choose
import org.gtkkn.native.gtk.gtk_alert_dialog_choose_finish
import org.gtkkn.native.gtk.gtk_alert_dialog_get_buttons
import org.gtkkn.native.gtk.gtk_alert_dialog_get_cancel_button
import org.gtkkn.native.gtk.gtk_alert_dialog_get_default_button
import org.gtkkn.native.gtk.gtk_alert_dialog_get_detail
import org.gtkkn.native.gtk.gtk_alert_dialog_get_message
import org.gtkkn.native.gtk.gtk_alert_dialog_get_modal
import org.gtkkn.native.gtk.gtk_alert_dialog_get_type
import org.gtkkn.native.gtk.gtk_alert_dialog_set_buttons
import org.gtkkn.native.gtk.gtk_alert_dialog_set_cancel_button
import org.gtkkn.native.gtk.gtk_alert_dialog_set_default_button
import org.gtkkn.native.gtk.gtk_alert_dialog_set_detail
import org.gtkkn.native.gtk.gtk_alert_dialog_set_message
import org.gtkkn.native.gtk.gtk_alert_dialog_set_modal
import org.gtkkn.native.gtk.gtk_alert_dialog_show
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A `GtkAlertDialog` object collects the arguments that
 * are needed to present a message to the user.
 *
 * The message is shown with the [method@Gtk.AlertDialog.choose]
 * function. This API follows the GIO async pattern, and the result can
 * be obtained by calling [method@Gtk.AlertDialog.choose_finish].
 *
 * If you don't need to wait for a button to be clicked, you can use
 * [method@Gtk.AlertDialog.show].
 *
 * ## Skipped during bindings generation
 *
 * - method `buttons`: Property TypeInfo of getter and setter do not match
 *
 * @since 4.10
 */
@GtkVersion4_10
public open class AlertDialog(
    pointer: CPointer<GtkAlertDialog>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gtkAlertDialogPointer: CPointer<GtkAlertDialog>
        get() = gPointer.reinterpret()

    /**
     * This property determines what happens when the Escape key is
     * pressed while the alert is shown.
     *
     * If this property holds the index of a button in [property@Gtk.AlertDialog:buttons],
     * then pressing Escape is treated as if that button was pressed. If it is -1
     * or not a valid index for the `buttons` array, then an error is returned.
     *
     * If `buttons` is `NULL`, then the automatically created 'Close' button
     * is treated as both cancel and default button, so 0 is returned.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var cancelButton: Int
        /**
         * Returns the index of the cancel button.
         *
         * @return the index of the cancel button, or -1
         * @since 4.10
         */
        get() = gtk_alert_dialog_get_cancel_button(gtkAlertDialogPointer.reinterpret())

        /**
         * Sets the index of the cancel button.
         *
         * See [property@Gtk.AlertDialog:cancel-button] for
         * details of how this value is used.
         *
         * @param button the new cancel button
         * @since 4.10
         */
        @GtkVersion4_10
        set(button) = gtk_alert_dialog_set_cancel_button(gtkAlertDialogPointer.reinterpret(), button)

    /**
     * This property determines what happens when the Return key is
     * pressed while the alert is shown.
     *
     * If this property holds the index of a button in [property@Gtk.AlertDialog:buttons],
     * then pressing Return is treated as if that button was pressed. If it is -1
     * or not a valid index for the `buttons` array, then nothing happens.
     *
     * If `buttons` is `NULL`, then the automatically created 'Close' button
     * is treated as both cancel and default button, so 0 is returned.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var defaultButton: Int
        /**
         * Returns the index of the default button.
         *
         * @return the index of the default button, or -1
         * @since 4.10
         */
        get() = gtk_alert_dialog_get_default_button(gtkAlertDialogPointer.reinterpret())

        /**
         * Sets the index of the default button.
         *
         * See [property@Gtk.AlertDialog:default-button] for
         * details of how this value is used.
         *
         * @param button the new default button
         * @since 4.10
         */
        @GtkVersion4_10
        set(button) = gtk_alert_dialog_set_default_button(gtkAlertDialogPointer.reinterpret(), button)

    /**
     * The detail text for the alert.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var detail: String
        /**
         * Returns the detail text that will be shown in the alert.
         *
         * @return the detail text
         * @since 4.10
         */
        get() =
            gtk_alert_dialog_get_detail(gtkAlertDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the detail text that will be shown in the alert.
         *
         * @param detail the new detail text
         * @since 4.10
         */
        @GtkVersion4_10
        set(detail) = gtk_alert_dialog_set_detail(gtkAlertDialogPointer.reinterpret(), detail)

    /**
     * The message for the alert.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var message: String
        /**
         * Returns the message that will be shown in the alert.
         *
         * @return the message
         * @since 4.10
         */
        get() =
            gtk_alert_dialog_get_message(gtkAlertDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the message that will be shown in the alert.
         *
         * @param message the new message
         * @since 4.10
         */
        @GtkVersion4_10
        set(message) = gtk_alert_dialog_set_message(gtkAlertDialogPointer.reinterpret(), message)

    /**
     * Whether the alert is modal.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var modal: Boolean
        /**
         * Returns whether the alert blocks interaction
         * with the parent window while it is presented.
         *
         * @return `TRUE` if the alert is modal
         * @since 4.10
         */
        get() = gtk_alert_dialog_get_modal(gtkAlertDialogPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the alert blocks interaction
         * with the parent window while it is presented.
         *
         * @param modal the new value
         * @since 4.10
         */
        @GtkVersion4_10
        set(modal) = gtk_alert_dialog_set_modal(gtkAlertDialogPointer.reinterpret(), modal.asGBoolean())

    /**
     * This function shows the alert to the user.
     *
     * The @callback will be called when the alert is dismissed.
     * It should call [method@Gtk.AlertDialog.choose_finish]
     * to obtain the result.
     *
     * It is ok to pass `NULL` for the callback if the alert
     * does not have more than one button. A simpler API for
     * this case is [method@Gtk.AlertDialog.show].
     *
     * @param parent the parent `GtkWindow`
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the operation is complete
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun choose(
        parent: Window? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        gtk_alert_dialog_choose(
            gtkAlertDialogPointer.reinterpret(),
            parent?.gtkWindowPointer?.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the [method@Gtk.AlertDialog.choose] call
     * and returns the index of the button that was clicked.
     *
     * @param result a `GAsyncResult`
     * @return the index of the button that was clicked, or -1 if
     *   the dialog was cancelled and [property@Gtk.AlertDialog:cancel-button]
     *   is not set
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun chooseFinish(result: AsyncResult): Result<Int> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gtk_alert_dialog_choose_finish(
                    gtkAlertDialogPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Returns the button labels for the alert.
     *
     * @return the button labels
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getButtons(): List<String>? =
        gtk_alert_dialog_get_buttons(gtkAlertDialogPointer.reinterpret())?.toKStringList()

    /**
     * Returns the index of the cancel button.
     *
     * @return the index of the cancel button, or -1
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getCancelButton(): Int = gtk_alert_dialog_get_cancel_button(gtkAlertDialogPointer.reinterpret())

    /**
     * Returns the index of the default button.
     *
     * @return the index of the default button, or -1
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getDefaultButton(): Int = gtk_alert_dialog_get_default_button(gtkAlertDialogPointer.reinterpret())

    /**
     * Returns the detail text that will be shown in the alert.
     *
     * @return the detail text
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getDetail(): String =
        gtk_alert_dialog_get_detail(gtkAlertDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns the message that will be shown in the alert.
     *
     * @return the message
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getMessage(): String =
        gtk_alert_dialog_get_message(gtkAlertDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns whether the alert blocks interaction
     * with the parent window while it is presented.
     *
     * @return `TRUE` if the alert is modal
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getModal(): Boolean = gtk_alert_dialog_get_modal(gtkAlertDialogPointer.reinterpret()).asBoolean()

    /**
     * Sets the button labels for the alert.
     *
     * @param labels the new button labels
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun setButtons(labels: List<String>): Unit =
        memScoped {
            return gtk_alert_dialog_set_buttons(gtkAlertDialogPointer.reinterpret(), labels.toCStringList(this))
        }

    /**
     * Sets the index of the cancel button.
     *
     * See [property@Gtk.AlertDialog:cancel-button] for
     * details of how this value is used.
     *
     * @param button the new cancel button
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun setCancelButton(button: Int): Unit =
        gtk_alert_dialog_set_cancel_button(gtkAlertDialogPointer.reinterpret(), button)

    /**
     * Sets the index of the default button.
     *
     * See [property@Gtk.AlertDialog:default-button] for
     * details of how this value is used.
     *
     * @param button the new default button
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun setDefaultButton(button: Int): Unit =
        gtk_alert_dialog_set_default_button(gtkAlertDialogPointer.reinterpret(), button)

    /**
     * Sets the detail text that will be shown in the alert.
     *
     * @param detail the new detail text
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun setDetail(detail: String): Unit =
        gtk_alert_dialog_set_detail(gtkAlertDialogPointer.reinterpret(), detail)

    /**
     * Sets the message that will be shown in the alert.
     *
     * @param message the new message
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun setMessage(message: String): Unit =
        gtk_alert_dialog_set_message(gtkAlertDialogPointer.reinterpret(), message)

    /**
     * Sets whether the alert blocks interaction
     * with the parent window while it is presented.
     *
     * @param modal the new value
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun setModal(modal: Boolean): Unit =
        gtk_alert_dialog_set_modal(gtkAlertDialogPointer.reinterpret(), modal.asGBoolean())

    /**
     * Show the alert to the user.
     *
     * This function is a simple version of [method@Gtk.AlertDialog.choose]
     * intended for dialogs with a single button.
     * If you want to cancel the dialog or if the alert has more than one button,
     * you should use that function instead and provide it with a #GCancellable or
     * callback respectively.
     *
     * @param parent the parent `GtkWindow`
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun show(parent: Window? = null): Unit =
        gtk_alert_dialog_show(gtkAlertDialogPointer.reinterpret(), parent?.gtkWindowPointer?.reinterpret())

    public companion object : TypeCompanion<AlertDialog> {
        override val type: GeneratedClassKGType<AlertDialog> =
            GeneratedClassKGType(gtk_alert_dialog_get_type()) { AlertDialog(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
