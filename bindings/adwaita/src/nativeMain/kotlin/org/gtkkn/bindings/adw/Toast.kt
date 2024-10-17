// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwToast
import org.gtkkn.native.adw.adw_toast_dismiss
import org.gtkkn.native.adw.adw_toast_get_action_name
import org.gtkkn.native.adw.adw_toast_get_action_target_value
import org.gtkkn.native.adw.adw_toast_get_button_label
import org.gtkkn.native.adw.adw_toast_get_custom_title
import org.gtkkn.native.adw.adw_toast_get_priority
import org.gtkkn.native.adw.adw_toast_get_timeout
import org.gtkkn.native.adw.adw_toast_get_title
import org.gtkkn.native.adw.adw_toast_get_type
import org.gtkkn.native.adw.adw_toast_get_use_markup
import org.gtkkn.native.adw.adw_toast_new
import org.gtkkn.native.adw.adw_toast_set_action_name
import org.gtkkn.native.adw.adw_toast_set_action_target_value
import org.gtkkn.native.adw.adw_toast_set_button_label
import org.gtkkn.native.adw.adw_toast_set_custom_title
import org.gtkkn.native.adw.adw_toast_set_detailed_action_name
import org.gtkkn.native.adw.adw_toast_set_priority
import org.gtkkn.native.adw.adw_toast_set_timeout
import org.gtkkn.native.adw.adw_toast_set_title
import org.gtkkn.native.adw.adw_toast_set_use_markup
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * A helper object for [class@ToastOverlay].
 *
 * Toasts are meant to be passed into [method@ToastOverlay.add_toast] as
 * follows:
 *
 * ```c
 * adw_toast_overlay_add_toast (overlay, adw_toast_new (_("Simple Toast")));
 * ```
 *
 * <picture>
 *   <source srcset="toast-simple-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="toast-simple.png" alt="toast-simple">
 * </picture>
 *
 * Toasts always have a close button. They emit the [signal@Toast::dismissed]
 * signal when disappearing.
 *
 * [property@Toast:timeout] determines how long the toast stays on screen, while
 * [property@Toast:priority] determines how it behaves if another toast is
 * already being displayed.
 *
 * Toast titles use Pango markup by default, set [property@Toast:use-markup] to
 * `FALSE` if this is unwanted.
 *
 * [property@Toast:custom-title] can be used to replace the title label with a
 * custom widget.
 *
 * ## Actions
 *
 * Toasts can have one button on them, with a label and an attached
 * [iface@Gio.Action].
 *
 * ```c
 * AdwToast *toast = adw_toast_new (_("Toast with Action"));
 *
 * adw_toast_set_button_label (toast, _("_Example"));
 * adw_toast_set_action_name (toast, "win.example");
 *
 * adw_toast_overlay_add_toast (overlay, toast);
 * ```
 *
 * <picture>
 *   <source srcset="toast-action-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="toast-action.png" alt="toast-action">
 * </picture>
 *
 * ## Modifying toasts
 *
 * Toasts can be modified after they have been shown. For this, an `AdwToast`
 * reference must be kept around while the toast is visible.
 *
 * A common use case for this is using toasts as undo prompts that stack with
 * each other, allowing to batch undo the last deleted items:
 *
 * ```c
 *
 * static void
 * toast_undo_cb (GtkWidget  *sender,
 *                const char *action,
 *                GVariant   *param)
 * {
 *   // Undo the deletion
 * }
 *
 * static void
 * dismissed_cb (MyWindow *self)
 * {
 *   self->undo_toast = NULL;
 *
 *   // Permanently delete the items
 * }
 *
 * static void
 * delete_item (MyWindow *self,
 *              MyItem   *item)
 * {
 *   g_autofree char *title = NULL;
 *   int n_items;
 *
 *   // Mark the item as waiting for deletion
 *   n_items = ... // The number of waiting items
 *
 *   if (!self->undo_toast) {
 *     self->undo_toast = adw_toast_new_format (_("‘%s’ deleted"), ...);
 *
 *     adw_toast_set_priority (self->undo_toast, ADW_TOAST_PRIORITY_HIGH);
 *     adw_toast_set_button_label (self->undo_toast, _("_Undo"));
 *     adw_toast_set_action_name (self->undo_toast, "toast.undo");
 *
 *     g_signal_connect_swapped (self->undo_toast, "dismissed",
 *                               G_CALLBACK (dismissed_cb), self);
 *
 *     adw_toast_overlay_add_toast (self->toast_overlay, self->undo_toast);
 *
 *     return;
 *   }
 *
 *   title =
 *     g_strdup_printf (ngettext ("<span font_features='tnum=1'>%d</span> item deleted",
 *                                "<span font_features='tnum=1'>%d</span> items deleted",
 *                                n_items), n_items);
 *
 *   adw_toast_set_title (self->undo_toast, title);
 *
 *   // Bump the toast timeout
 *   adw_toast_overlay_add_toast (self->toast_overlay, g_object_ref (self->undo_toast));
 * }
 *
 * static void
 * my_window_class_init (MyWindowClass *klass)
 * {
 *   GtkWidgetClass *widget_class = GTK_WIDGET_CLASS (klass);
 *
 *   gtk_widget_class_install_action (widget_class, "toast.undo", NULL, toast_undo_cb);
 * }
 * ```
 *
 * <picture>
 *   <source srcset="toast-undo-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="toast-undo.png" alt="toast-undo">
 * </picture>
 *
 * ## Skipped during bindings generation
 *
 * - method `action-target`: Property has no getter nor setter
 * - method `title`: Property TypeInfo of getter and setter do not match
 */
public class Toast(
    pointer: CPointer<AdwToast>,
) : Object(pointer.reinterpret()), KGTyped {
    public val adwToastPointer: CPointer<AdwToast>
        get() = gPointer.reinterpret()

    /**
     * The name of the associated action.
     *
     * It will be activated when clicking the button.
     *
     * See [property@Toast:action-target].
     */
    public var actionName: String?
        /**
         * Gets the name of the associated action.
         *
         * @return the action name
         */
        get() = adw_toast_get_action_name(adwToastPointer.reinterpret())?.toKString()

        /**
         * Sets the name of the associated action.
         *
         * It will be activated when clicking the button.
         *
         * See [property@Toast:action-target].
         *
         * @param actionName the action name
         */
        set(actionName) = adw_toast_set_action_name(adwToastPointer.reinterpret(), actionName)

    /**
     * The label to show on the button.
     *
     * Underlines in the button text can be used to indicate a mnemonic.
     *
     * If set to `NULL`, the button won't be shown.
     *
     * See [property@Toast:action-name].
     */
    public var buttonLabel: String?
        /**
         * Gets the label to show on the button.
         *
         * @return the button label
         */
        get() = adw_toast_get_button_label(adwToastPointer.reinterpret())?.toKString()

        /**
         * Sets the label to show on the button.
         *
         * Underlines in the button text can be used to indicate a mnemonic.
         *
         * If set to `NULL`, the button won't be shown.
         *
         * See [property@Toast:action-name].
         *
         * @param buttonLabel a button label
         */
        set(buttonLabel) = adw_toast_set_button_label(adwToastPointer.reinterpret(), buttonLabel)

    /**
     * The custom title widget.
     *
     * It will be displayed instead of the title if set. In this case,
     * [property@Toast:title] is ignored.
     *
     * Setting a custom title will unset [property@Toast:title].
     *
     * @since 1.2
     */
    public var customTitle: Widget?
        /**
         * Gets the custom title widget of @self.
         *
         * @return the custom title widget
         * @since 1.2
         */
        get() =
            adw_toast_get_custom_title(adwToastPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the custom title widget of @self.
         *
         * It will be displayed instead of the title if set. In this case,
         * [property@Toast:title] is ignored.
         *
         * Setting a custom title will unset [property@Toast:title].
         *
         * @param widget the custom title widget
         * @since 1.2
         */
        set(widget) =
            adw_toast_set_custom_title(
                adwToastPointer.reinterpret(),
                widget?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * The priority of the toast.
     *
     * Priority controls how the toast behaves when another toast is already
     * being displayed.
     *
     * If the priority is `ADW_TOAST_PRIORITY_NORMAL`, the toast will be queued.
     *
     * If the priority is `ADW_TOAST_PRIORITY_HIGH`, the toast will be displayed
     * immediately, pushing the previous toast into the queue instead.
     */
    public var priority: ToastPriority
        /**
         * Gets priority for @self.
         *
         * @return the priority
         */
        get() =
            adw_toast_get_priority(adwToastPointer.reinterpret()).run {
                ToastPriority.fromNativeValue(this)
            }

        /**
         * Sets priority for @self.
         *
         * Priority controls how the toast behaves when another toast is already
         * being displayed.
         *
         * If @priority is `ADW_TOAST_PRIORITY_NORMAL`, the toast will be queued.
         *
         * If @priority is `ADW_TOAST_PRIORITY_HIGH`, the toast will be displayed
         * immediately, pushing the previous toast into the queue instead.
         *
         * @param priority the priority
         */
        set(priority) = adw_toast_set_priority(adwToastPointer.reinterpret(), priority.nativeValue)

    /**
     * The timeout of the toast, in seconds.
     *
     * If timeout is 0, the toast is displayed indefinitely until manually
     * dismissed.
     *
     * Toasts cannot disappear while being hovered, pressed (on touchscreen), or
     * have keyboard focus inside them.
     */
    public var timeout: UInt
        /**
         * Gets timeout for @self.
         *
         * @return the timeout
         */
        get() = adw_toast_get_timeout(adwToastPointer.reinterpret())

        /**
         * Sets timeout for @self.
         *
         * If @timeout is 0, the toast is displayed indefinitely until manually
         * dismissed.
         *
         * Toasts cannot disappear while being hovered, pressed (on touchscreen), or
         * have keyboard focus inside them.
         *
         * @param timeout the timeout
         */
        set(timeout) = adw_toast_set_timeout(adwToastPointer.reinterpret(), timeout)

    /**
     * Whether to use Pango markup for the toast title.
     *
     * See also [func@Pango.parse_markup].
     *
     * @since 1.4
     */
    public var useMarkup: Boolean
        /**
         * Gets whether to use Pango markup for the toast title.
         *
         * @return whether the toast uses markup
         * @since 1.4
         */
        get() = adw_toast_get_use_markup(adwToastPointer.reinterpret()).asBoolean()

        /**
         * Whether to use Pango markup for the toast title.
         *
         * See also [func@Pango.parse_markup].
         *
         * @param useMarkup whether to use markup
         * @since 1.4
         */
        set(useMarkup) =
            adw_toast_set_use_markup(
                adwToastPointer.reinterpret(),
                useMarkup.asGBoolean()
            )

    /**
     * Creates a new `AdwToast`.
     *
     * The toast will use @title as its title.
     *
     * @title can be marked up with the Pango text markup language.
     *
     * @param title the title to be displayed
     * @return the new created `AdwToast`
     */
    public constructor(title: String) : this(adw_toast_new(title)!!.reinterpret())

    /**
     * Dismisses @self.
     *
     * Does nothing if @self has already been dismissed, or hasn't been added to an
     * [class@ToastOverlay].
     */
    public fun dismiss(): Unit = adw_toast_dismiss(adwToastPointer.reinterpret())

    /**
     * Gets the name of the associated action.
     *
     * @return the action name
     */
    public fun getActionName(): String? = adw_toast_get_action_name(adwToastPointer.reinterpret())?.toKString()

    /**
     * Gets the parameter for action invocations.
     *
     * @return the action target
     */
    public fun getActionTargetValue(): Variant? =
        adw_toast_get_action_target_value(adwToastPointer.reinterpret())?.run {
            Variant(reinterpret())
        }

    /**
     * Gets the label to show on the button.
     *
     * @return the button label
     */
    public fun getButtonLabel(): String? = adw_toast_get_button_label(adwToastPointer.reinterpret())?.toKString()

    /**
     * Gets the custom title widget of @self.
     *
     * @return the custom title widget
     * @since 1.2
     */
    public fun getCustomTitle(): Widget? =
        adw_toast_get_custom_title(adwToastPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets priority for @self.
     *
     * @return the priority
     */
    public fun getPriority(): ToastPriority =
        adw_toast_get_priority(adwToastPointer.reinterpret()).run {
            ToastPriority.fromNativeValue(this)
        }

    /**
     * Gets timeout for @self.
     *
     * @return the timeout
     */
    public fun getTimeout(): UInt = adw_toast_get_timeout(adwToastPointer.reinterpret())

    /**
     * Gets the title that will be displayed on the toast.
     *
     * If a custom title has been set with [method@Adw.Toast.set_custom_title]
     * the return value will be null.
     *
     * @return the title
     */
    public fun getTitle(): String? = adw_toast_get_title(adwToastPointer.reinterpret())?.toKString()

    /**
     * Gets whether to use Pango markup for the toast title.
     *
     * @return whether the toast uses markup
     * @since 1.4
     */
    public fun getUseMarkup(): Boolean = adw_toast_get_use_markup(adwToastPointer.reinterpret()).asBoolean()

    /**
     * Sets the name of the associated action.
     *
     * It will be activated when clicking the button.
     *
     * See [property@Toast:action-target].
     *
     * @param actionName the action name
     */
    public fun setActionName(actionName: String? = null): Unit =
        adw_toast_set_action_name(adwToastPointer.reinterpret(), actionName)

    /**
     * Sets the parameter for action invocations.
     *
     * If the @action_target variant has a floating reference this function
     * will sink it.
     *
     * @param actionTarget the action target
     */
    public fun setActionTargetValue(actionTarget: Variant? = null): Unit =
        adw_toast_set_action_target_value(
            adwToastPointer.reinterpret(),
            actionTarget?.glibVariantPointer
        )

    /**
     * Sets the label to show on the button.
     *
     * Underlines in the button text can be used to indicate a mnemonic.
     *
     * If set to `NULL`, the button won't be shown.
     *
     * See [property@Toast:action-name].
     *
     * @param buttonLabel a button label
     */
    public fun setButtonLabel(buttonLabel: String? = null): Unit =
        adw_toast_set_button_label(adwToastPointer.reinterpret(), buttonLabel)

    /**
     * Sets the custom title widget of @self.
     *
     * It will be displayed instead of the title if set. In this case,
     * [property@Toast:title] is ignored.
     *
     * Setting a custom title will unset [property@Toast:title].
     *
     * @param widget the custom title widget
     * @since 1.2
     */
    public fun setCustomTitle(widget: Widget? = null): Unit =
        adw_toast_set_custom_title(
            adwToastPointer.reinterpret(),
            widget?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets the action name and its parameter.
     *
     * @detailed_action_name is a string in the format accepted by
     * [func@Gio.Action.parse_detailed_name].
     *
     * @param detailedActionName the detailed action name
     */
    public fun setDetailedActionName(detailedActionName: String? = null): Unit =
        adw_toast_set_detailed_action_name(adwToastPointer.reinterpret(), detailedActionName)

    /**
     * Sets priority for @self.
     *
     * Priority controls how the toast behaves when another toast is already
     * being displayed.
     *
     * If @priority is `ADW_TOAST_PRIORITY_NORMAL`, the toast will be queued.
     *
     * If @priority is `ADW_TOAST_PRIORITY_HIGH`, the toast will be displayed
     * immediately, pushing the previous toast into the queue instead.
     *
     * @param priority the priority
     */
    public fun setPriority(priority: ToastPriority): Unit =
        adw_toast_set_priority(adwToastPointer.reinterpret(), priority.nativeValue)

    /**
     * Sets timeout for @self.
     *
     * If @timeout is 0, the toast is displayed indefinitely until manually
     * dismissed.
     *
     * Toasts cannot disappear while being hovered, pressed (on touchscreen), or
     * have keyboard focus inside them.
     *
     * @param timeout the timeout
     */
    public fun setTimeout(timeout: UInt): Unit = adw_toast_set_timeout(adwToastPointer.reinterpret(), timeout)

    /**
     * Sets the title that will be displayed on the toast.
     *
     * The title can be marked up with the Pango text markup language.
     *
     * Setting a title will unset [property@Toast:custom-title].
     *
     * If [property@Toast:custom-title] is set, it will be used instead.
     *
     * @param title a title
     */
    public fun setTitle(title: String): Unit =
        adw_toast_set_title(
            adwToastPointer.reinterpret(),
            title
        )

    /**
     * Whether to use Pango markup for the toast title.
     *
     * See also [func@Pango.parse_markup].
     *
     * @param useMarkup whether to use markup
     * @since 1.4
     */
    public fun setUseMarkup(useMarkup: Boolean): Unit =
        adw_toast_set_use_markup(adwToastPointer.reinterpret(), useMarkup.asGBoolean())

    /**
     * Emitted after the button has been clicked.
     *
     * It can be used as an alternative to setting an action.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.2
     */
    public fun connectButtonClicked(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "button-clicked",
            connectButtonClickedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the toast has been dismissed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectDismissed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "dismissed",
            connectDismissedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Toast> {
        override val type: GeneratedClassKGType<Toast> =
            GeneratedClassKGType(adw_toast_get_type()) { Toast(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}

private val connectButtonClickedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectDismissedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
