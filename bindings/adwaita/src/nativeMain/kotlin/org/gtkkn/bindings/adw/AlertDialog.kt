// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_5
import org.gtkkn.bindings.adw.annotations.AdwVersion1_6
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwAlertDialog
import org.gtkkn.native.adw.adw_alert_dialog_add_response
import org.gtkkn.native.adw.adw_alert_dialog_choose
import org.gtkkn.native.adw.adw_alert_dialog_choose_finish
import org.gtkkn.native.adw.adw_alert_dialog_get_body
import org.gtkkn.native.adw.adw_alert_dialog_get_body_use_markup
import org.gtkkn.native.adw.adw_alert_dialog_get_close_response
import org.gtkkn.native.adw.adw_alert_dialog_get_default_response
import org.gtkkn.native.adw.adw_alert_dialog_get_extra_child
import org.gtkkn.native.adw.adw_alert_dialog_get_heading
import org.gtkkn.native.adw.adw_alert_dialog_get_heading_use_markup
import org.gtkkn.native.adw.adw_alert_dialog_get_prefer_wide_layout
import org.gtkkn.native.adw.adw_alert_dialog_get_response_appearance
import org.gtkkn.native.adw.adw_alert_dialog_get_response_enabled
import org.gtkkn.native.adw.adw_alert_dialog_get_response_label
import org.gtkkn.native.adw.adw_alert_dialog_get_type
import org.gtkkn.native.adw.adw_alert_dialog_has_response
import org.gtkkn.native.adw.adw_alert_dialog_new
import org.gtkkn.native.adw.adw_alert_dialog_remove_response
import org.gtkkn.native.adw.adw_alert_dialog_set_body
import org.gtkkn.native.adw.adw_alert_dialog_set_body_use_markup
import org.gtkkn.native.adw.adw_alert_dialog_set_close_response
import org.gtkkn.native.adw.adw_alert_dialog_set_default_response
import org.gtkkn.native.adw.adw_alert_dialog_set_extra_child
import org.gtkkn.native.adw.adw_alert_dialog_set_heading
import org.gtkkn.native.adw.adw_alert_dialog_set_heading_use_markup
import org.gtkkn.native.adw.adw_alert_dialog_set_prefer_wide_layout
import org.gtkkn.native.adw.adw_alert_dialog_set_response_appearance
import org.gtkkn.native.adw.adw_alert_dialog_set_response_enabled
import org.gtkkn.native.adw.adw_alert_dialog_set_response_label
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A dialog presenting a message or a question.
 *
 * <picture>
 *   <source srcset="alert-dialog-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="alert-dialog.png" alt="alert-dialog">
 * </picture>
 *
 * Alert dialogs have a heading, a body, an optional child widget, and one or
 * multiple responses, each presented as a button.
 *
 * Each response has a unique string ID, and a button label. Additionally, each
 * response can be enabled or disabled, and can have a suggested or destructive
 * appearance.
 *
 * When one of the responses is activated, or the dialog is closed, the
 * [signal@AlertDialog::response] signal will be emitted. This signal is
 * detailed, and the detail, as well as the `response` parameter will be set to
 * the ID of the activated response, or to the value of the
 * [property@AlertDialog:close-response] property if the dialog had been closed
 * without activating any of the responses.
 *
 * Response buttons can be presented horizontally or vertically depending on
 * available space.
 *
 * When a response is activated, `AdwAlertDialog` is closed automatically.
 *
 * An example of using an alert dialog:
 *
 * ```c
 * AdwDialog *dialog;
 *
 * dialog = adw_alert_dialog_new (_("Replace File?"), NULL);
 *
 * adw_alert_dialog_format_body (ADW_ALERT_DIALOG (dialog),
 *                               _("A file named “%s” already exists. Do you want to replace it?"),
 *                               filename);
 *
 * adw_alert_dialog_add_responses (ADW_ALERT_DIALOG (dialog),
 *                                 "cancel",  _("_Cancel"),
 *                                 "replace", _("_Replace"),
 *                                 NULL);
 *
 * adw_alert_dialog_set_response_appearance (ADW_ALERT_DIALOG (dialog),
 *                                           "replace",
 *                                           ADW_RESPONSE_DESTRUCTIVE);
 *
 * adw_alert_dialog_set_default_response (ADW_ALERT_DIALOG (dialog), "cancel");
 * adw_alert_dialog_set_close_response (ADW_ALERT_DIALOG (dialog), "cancel");
 *
 * g_signal_connect (dialog, "response", G_CALLBACK (response_cb), self);
 *
 * adw_dialog_present (dialog, parent);
 * ```
 *
 * ## Async API
 *
 * `AdwAlertDialog` can also be used via the [method@AlertDialog.choose] method.
 * This API follows the GIO async pattern, for example:
 *
 * ```c
 * static void
 * dialog_cb (AdwAlertDialog *dialog,
 *            GAsyncResult   *result,
 *            MyWindow       *self)
 * {
 *   const char *response = adw_alert_dialog_choose_finish (dialog, result);
 *
 *   // ...
 * }
 *
 * static void
 * show_dialog (MyWindow *self)
 * {
 *   AdwDialog *dialog;
 *
 *   dialog = adw_alert_dialog_new (_("Replace File?"), NULL);
 *
 *   adw_alert_dialog_format_body (ADW_ALERT_DIALOG (dialog),
 *                                 _("A file named “%s” already exists. Do you want to replace it?"),
 *                                 filename);
 *
 *   adw_alert_dialog_add_responses (ADW_ALERT_DIALOG (dialog),
 *                                   "cancel",  _("_Cancel"),
 *                                   "replace", _("_Replace"),
 *                                   NULL);
 *
 *   adw_alert_dialog_set_response_appearance (ADW_ALERT_DIALOG (dialog),
 *                                             "replace",
 *                                             ADW_RESPONSE_DESTRUCTIVE);
 *
 *   adw_alert_dialog_set_default_response (ADW_ALERT_DIALOG (dialog), "cancel");
 *   adw_alert_dialog_set_close_response (ADW_ALERT_DIALOG (dialog), "cancel");
 *
 *   adw_alert_dialog_choose (ADW_ALERT_DIALOG (dialog), GTK_WIDGET (self),
 *                            NULL, (GAsyncReadyCallback) dialog_cb, self);
 * }
 * ```
 *
 * ## AdwAlertDialog as GtkBuildable
 *
 * `AdwAlertDialog` supports adding responses in UI definitions by via the
 * `<responses>` element that may contain multiple `<response>` elements, each
 * representing a response.
 *
 * Each of the `<response>` elements must have the `id` attribute specifying the
 * response ID. The contents of the element are used as the response label.
 *
 * Response labels can be translated with the usual `translatable`, `context`
 * and `comments` attributes.
 *
 * The `<response>` elements can also have `enabled` and/or `appearance`
 * attributes. See [method@AlertDialog.set_response_enabled] and
 * [method@AlertDialog.set_response_appearance] for details.
 *
 * Example of an `AdwAlertDialog` UI definition:
 *
 * ```xml
 * <object class="AdwAlertDialog" id="dialog">
 *   <property name="heading" translatable="yes">Save Changes?</property>
 *   <property name="body" translatable="yes">Open documents contain unsaved changes. Changes which are not saved will be permanently lost.</property>
 *   <property name="default-response">save</property>
 *   <property name="close-response">cancel</property>
 *   <signal name="response" handler="response_cb"/>
 *   <responses>
 *     <response id="cancel" translatable="yes">_Cancel</response>
 *     <response id="discard" translatable="yes" appearance="destructive">_Discard</response>
 *     <response id="save" translatable="yes" appearance="suggested" enabled="false">_Save</response>
 *   </responses>
 * </object>
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `add_responses`: Varargs parameter is not supported
 * - method `format_body`: Varargs parameter is not supported
 * - method `format_body_markup`: Varargs parameter is not supported
 * - method `format_heading`: Varargs parameter is not supported
 * - method `format_heading_markup`: Varargs parameter is not supported
 *
 * @since 1.5
 */
@AdwVersion1_5
public open class AlertDialog(public val adwAlertDialogPointer: CPointer<AdwAlertDialog>) :
    Dialog(adwAlertDialogPointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The body text of the dialog.
     *
     * @since 1.5
     */
    @AdwVersion1_5
    public open var body: String
        /**
         * Gets the body text of @self.
         *
         * @return the body of @self.
         * @since 1.5
         */
        get() = adw_alert_dialog_get_body(adwAlertDialogPointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets the body text of @self.
         *
         * @param body the body of @self
         * @since 1.5
         */
        @AdwVersion1_5
        set(body) = adw_alert_dialog_set_body(adwAlertDialogPointer, body)

    /**
     * Whether the body text includes Pango markup.
     *
     * See [func@Pango.parse_markup].
     *
     * @since 1.5
     */
    @AdwVersion1_5
    public open var bodyUseMarkup: Boolean
        /**
         * Gets whether the body text of @self includes Pango markup.
         *
         * @return whether @self uses markup for body text
         * @since 1.5
         */
        get() = adw_alert_dialog_get_body_use_markup(adwAlertDialogPointer).asBoolean()

        /**
         * Sets whether the body text of @self includes Pango markup.
         *
         * See [func@Pango.parse_markup].
         *
         * @param useMarkup whether to use markup for body text
         * @since 1.5
         */
        @AdwVersion1_5
        set(useMarkup) = adw_alert_dialog_set_body_use_markup(adwAlertDialogPointer, useMarkup.asGBoolean())

    /**
     * The ID of the close response.
     *
     * It will be passed to [signal@AlertDialog::response] if the dialog is
     * closed by pressing <kbd>Escape</kbd> or with a system action.
     *
     * It doesn't have to correspond to any of the responses in the dialog.
     *
     * The default close response is `close`.
     *
     * @since 1.5
     */
    @AdwVersion1_5
    public open var closeResponse: String
        /**
         * Gets the ID of the close response of @self.
         *
         * @return the close response ID
         * @since 1.5
         */
        get() = adw_alert_dialog_get_close_response(adwAlertDialogPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the ID of the close response of @self.
         *
         * It will be passed to [signal@AlertDialog::response] if the dialog is closed
         * by pressing <kbd>Escape</kbd> or with a system action.
         *
         * It doesn't have to correspond to any of the responses in the dialog.
         *
         * The default close response is `close`.
         *
         * @param response the close response ID
         * @since 1.5
         */
        @AdwVersion1_5
        set(response) = adw_alert_dialog_set_close_response(adwAlertDialogPointer, response)

    /**
     * The response ID of the default response.
     *
     * If set, pressing <kbd>Enter</kbd> will activate the corresponding button.
     *
     * If set to `NULL` or a non-existent response ID, pressing <kbd>Enter</kbd>
     * will do nothing.
     *
     * @since 1.5
     */
    @AdwVersion1_5
    public open var defaultResponse: String?
        /**
         * Gets the ID of the default response of @self.
         *
         * @return the default response ID
         * @since 1.5
         */
        get() = adw_alert_dialog_get_default_response(adwAlertDialogPointer)?.toKString()

        /**
         * Sets the ID of the default response of @self.
         *
         * If set, pressing <kbd>Enter</kbd> will activate the corresponding button.
         *
         * If set to `NULL` or to a non-existent response ID, pressing <kbd>Enter</kbd>
         * will do nothing.
         *
         * @param response the default response ID
         * @since 1.5
         */
        @AdwVersion1_5
        set(response) = adw_alert_dialog_set_default_response(adwAlertDialogPointer, response)

    /**
     * The child widget.
     *
     * Displayed below the heading and body.
     *
     * @since 1.5
     */
    @AdwVersion1_5
    public open var extraChild: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self.
         * @since 1.5
         */
        get() = adw_alert_dialog_get_extra_child(adwAlertDialogPointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the child widget of @self.
         *
         * The child widget is displayed below the heading and body.
         *
         * @param child the child widget
         * @since 1.5
         */
        @AdwVersion1_5
        set(child) = adw_alert_dialog_set_extra_child(adwAlertDialogPointer, child?.gtkWidgetPointer)

    /**
     * The heading of the dialog.
     *
     * @since 1.5
     */
    @AdwVersion1_5
    public open var heading: String?
        /**
         * Gets the heading of @self.
         *
         * @return the heading of @self.
         * @since 1.5
         */
        get() = adw_alert_dialog_get_heading(adwAlertDialogPointer)?.toKString()

        /**
         * Sets the heading of @self.
         *
         * @param heading the heading of @self
         * @since 1.5
         */
        @AdwVersion1_5
        set(heading) = adw_alert_dialog_set_heading(adwAlertDialogPointer, heading)

    /**
     * Whether the heading includes Pango markup.
     *
     * See [func@Pango.parse_markup].
     *
     * @since 1.5
     */
    @AdwVersion1_5
    public open var headingUseMarkup: Boolean
        /**
         * Gets whether the heading of @self includes Pango markup.
         *
         * @return whether @self uses markup for heading
         * @since 1.5
         */
        get() = adw_alert_dialog_get_heading_use_markup(adwAlertDialogPointer).asBoolean()

        /**
         * Sets whether the heading of @self includes Pango markup.
         *
         * See [func@Pango.parse_markup].
         *
         * @param useMarkup whether to use markup for heading
         * @since 1.5
         */
        @AdwVersion1_5
        set(useMarkup) = adw_alert_dialog_set_heading_use_markup(adwAlertDialogPointer, useMarkup.asGBoolean())

    /**
     * Whether to prefer wide layout.
     *
     * Prefer horizontal button layout when possible, and wider dialog width
     * otherwise.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public open var preferWideLayout: Boolean
        /**
         * Gets whether @self prefers wide layout.
         *
         * @return whether to prefer wide layout
         * @since 1.5
         */
        get() = adw_alert_dialog_get_prefer_wide_layout(adwAlertDialogPointer).asBoolean()

        /**
         * Sets whether @self prefers wide layout.
         *
         * Prefer horizontal button layout when possible, and wider dialog width
         * otherwise.
         *
         * @param preferWideLayout whether to prefer wide layout
         * @since 1.6
         */
        @AdwVersion1_6
        set(
            preferWideLayout
        ) = adw_alert_dialog_set_prefer_wide_layout(adwAlertDialogPointer, preferWideLayout.asGBoolean())

    /**
     * Creates a new `AdwAlertDialog`.
     *
     * @heading and @body can be set to `NULL`. This can be useful if they need to
     * be formatted or use markup. In that case, set them to `NULL` and call
     * [method@AlertDialog.format_body] or similar methods afterwards:
     *
     * ```c
     * AdwDialog *dialog;
     *
     * dialog = adw_alert_dialog_new (_("Replace File?"), NULL);
     * adw_alert_dialog_format_body (ADW_ALERT_DIALOG (dialog),
     *                               _("A file named “%s” already exists.  Do you want to replace it?"),
     *                               filename);
     * ```
     *
     * @param heading the heading
     * @param body the body text
     * @return the newly created `AdwAlertDialog`
     * @since 1.5
     */
    public constructor(
        heading: String? = null,
        body: String? = null,
    ) : this(adw_alert_dialog_new(heading, body)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Adds a response with @id and @label to @self.
     *
     * Responses are represented as buttons in the dialog.
     *
     * Response ID must be unique. It will be used in [signal@AlertDialog::response]
     * to tell which response had been activated, as well as to inspect and modify
     * the response later.
     *
     * An embedded underline in @label indicates a mnemonic.
     *
     * [method@AlertDialog.set_response_label] can be used to change the response
     * label after it had been added.
     *
     * [method@AlertDialog.set_response_enabled] and
     * [method@AlertDialog.set_response_appearance] can be used to customize the
     * responses further.
     *
     * @param id the response ID
     * @param label the response label
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun addResponse(id: String, label: String): Unit =
        adw_alert_dialog_add_response(adwAlertDialogPointer, id, label)

    /**
     * This function shows @self to the user.
     *
     * If the window is an [class@Window] or [class@ApplicationWindow], the dialog
     * will be shown within it. Otherwise, it will be a separate window.
     *
     * @param parent the parent widget
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the operation is complete
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun choose(
        parent: Widget? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = adw_alert_dialog_choose(
        adwAlertDialogPointer,
        parent?.gtkWidgetPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes the [method@AlertDialog.choose] call and returns the response ID.
     *
     * @param result a `GAsyncResult`
     * @return the ID of the response that was selected, or
     *   [property@AlertDialog:close-response] if the call was cancelled.
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun chooseFinish(result: AsyncResult): String =
        adw_alert_dialog_choose_finish(adwAlertDialogPointer, result.gioAsyncResultPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the appearance of @response.
     *
     * See [method@AlertDialog.set_response_appearance].
     *
     * @param response a response ID
     * @return the appearance of @response
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun getResponseAppearance(response: String): ResponseAppearance =
        adw_alert_dialog_get_response_appearance(adwAlertDialogPointer, response).run {
            ResponseAppearance.fromNativeValue(this)
        }

    /**
     * Gets whether @response is enabled.
     *
     * See [method@AlertDialog.set_response_enabled].
     *
     * @param response a response ID
     * @return whether @response is enabled
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun getResponseEnabled(response: String): Boolean =
        adw_alert_dialog_get_response_enabled(adwAlertDialogPointer, response).asBoolean()

    /**
     * Gets the label of @response.
     *
     * See [method@AlertDialog.set_response_label].
     *
     * @param response a response ID
     * @return the label of @response
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun getResponseLabel(response: String): String =
        adw_alert_dialog_get_response_label(adwAlertDialogPointer, response)?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets whether @self has a response with the ID @response.
     *
     * @param response response ID
     * @return whether @self has a response with the ID @response.
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun hasResponse(response: String): Boolean =
        adw_alert_dialog_has_response(adwAlertDialogPointer, response).asBoolean()

    /**
     * Removes a response from @self.
     *
     * @param id the response ID
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun removeResponse(id: String): Unit = adw_alert_dialog_remove_response(adwAlertDialogPointer, id)

    /**
     * Sets the appearance for @response.
     *
     * <picture>
     *   <source srcset="alert-dialog-appearance-dark.png" media="(prefers-color-scheme: dark)">
     *   <img src="alert-dialog-appearance.png" alt="alert-dialog-appearance">
     * </picture>
     *
     * Use `ADW_RESPONSE_SUGGESTED` to mark important responses such as the
     * affirmative action, like the Save button in the example.
     *
     * Use `ADW_RESPONSE_DESTRUCTIVE` to draw attention to the potentially damaging
     * consequences of using @response. This appearance acts as a warning to the
     * user. The Discard button in the example is using this appearance.
     *
     * The default appearance is `ADW_RESPONSE_DEFAULT`.
     *
     * Negative responses like Cancel or Close should use the default appearance.
     *
     * @param response a response ID
     * @param appearance appearance for @response
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun setResponseAppearance(response: String, appearance: ResponseAppearance): Unit =
        adw_alert_dialog_set_response_appearance(adwAlertDialogPointer, response, appearance.nativeValue)

    /**
     * Sets whether @response is enabled.
     *
     * If @response is not enabled, the corresponding button will have
     * [property@Gtk.Widget:sensitive] set to `FALSE` and it can't be activated as
     * a default response.
     *
     * @response can still be used as [property@AlertDialog:close-response] while
     * it's not enabled.
     *
     * Responses are enabled by default.
     *
     * @param response a response ID
     * @param enabled whether to enable @response
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun setResponseEnabled(response: String, enabled: Boolean): Unit =
        adw_alert_dialog_set_response_enabled(adwAlertDialogPointer, response, enabled.asGBoolean())

    /**
     * Sets the label of @response to @label.
     *
     * Labels are displayed on the dialog buttons. An embedded underline in @label
     * indicates a mnemonic.
     *
     * @param response a response ID
     * @param label the label of @response
     * @since 1.5
     */
    @AdwVersion1_5
    public open fun setResponseLabel(response: String, label: String): Unit =
        adw_alert_dialog_set_response_label(adwAlertDialogPointer, response, label)

    /**
     * This signal is emitted when the dialog is closed.
     *
     * @response will be set to the response ID of the button that had been
     * activated.
     *
     * if the dialog was closed by pressing <kbd>Escape</kbd> or with a system
     * action, @response will be set to the value of
     * [property@AlertDialog:close-response].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param detail the signal detail
     * @param handler the Callback to connect. Params: `response` the response ID
     * @since 1.5
     */
    @AdwVersion1_5
    public fun onResponse(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        detail: String? = null,
        handler: (response: String) -> Unit,
    ): ULong = g_signal_connect_data(
        adwAlertDialogPointer,
        "response" + (
            detail?.let {
                "::$it"
            } ?: ""
            ),
        onResponseFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "response" signal. See [onResponse].
     *
     * @param detail the signal detail
     * @param response the response ID
     * @since 1.5
     */
    @AdwVersion1_5
    public fun emitResponse(detail: String? = null, response: String) {
        g_signal_emit_by_name(
            adwAlertDialogPointer.reinterpret(),
            "response" + (
                detail?.let {
                    "::$it"
                } ?: ""
                ),
            response.cstr
        )
    }

    public companion object : TypeCompanion<AlertDialog> {
        override val type: GeneratedClassKGType<AlertDialog> =
            GeneratedClassKGType(getTypeOrNull()!!) { AlertDialog(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of AlertDialog
         *
         * @return the GType
         */
        public fun getType(): GType = adw_alert_dialog_get_type()

        /**
         * Gets the GType of from the symbol `adw_alert_dialog_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_alert_dialog_get_type")
    }
}

private val onResponseFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        response: CPointer<ByteVar>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(response: String) -> Unit>().get().invoke(
        response?.toKString() ?: error("Expected not null string")
    )
}
    .reinterpret()
