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
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwToast
import org.gtkkn.native.adw.adw_toast_dismiss
import org.gtkkn.native.adw.adw_toast_get_action_name
import org.gtkkn.native.adw.adw_toast_get_action_target_value
import org.gtkkn.native.adw.adw_toast_get_button_label
import org.gtkkn.native.adw.adw_toast_get_priority
import org.gtkkn.native.adw.adw_toast_get_timeout
import org.gtkkn.native.adw.adw_toast_get_title
import org.gtkkn.native.adw.adw_toast_get_type
import org.gtkkn.native.adw.adw_toast_new
import org.gtkkn.native.adw.adw_toast_set_action_name
import org.gtkkn.native.adw.adw_toast_set_action_target_value
import org.gtkkn.native.adw.adw_toast_set_button_label
import org.gtkkn.native.adw.adw_toast_set_detailed_action_name
import org.gtkkn.native.adw.adw_toast_set_priority
import org.gtkkn.native.adw.adw_toast_set_timeout
import org.gtkkn.native.adw.adw_toast_set_title
import org.gtkkn.native.gobject.g_signal_connect_data
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
 *     title = g_strdup_printf (_("‘%s’ deleted"), ...);
 *
 *     self->undo_toast = adw_toast_new (title);
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
 *
 * @since 1.0
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
     *
     * @since 1.0
     */
    public var actionName: String?
        /**
         * Gets the name of the associated action.
         *
         * @return the action name
         * @since 1.0
         */
        get() = adw_toast_get_action_name(adwToastPointer.reinterpret())?.toKString()

        /**
         * Sets the name of the associated action.
         *
         * @param actionName the action name
         * @since 1.0
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
     *
     * @since 1.0
     */
    public var buttonLabel: String?
        /**
         * Gets the label to show on the button.
         *
         * @return the button label
         * @since 1.0
         */
        get() = adw_toast_get_button_label(adwToastPointer.reinterpret())?.toKString()

        /**
         * Sets the label to show on the button.
         *
         * It set to `NULL`, the button won't be shown.
         *
         * @param buttonLabel a button label
         * @since 1.0
         */
        set(buttonLabel) = adw_toast_set_button_label(adwToastPointer.reinterpret(), buttonLabel)

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
     *
     * @since 1.0
     */
    public var priority: ToastPriority
        /**
         * Gets priority for @self.
         *
         * @return the priority
         * @since 1.0
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
         * If @priority is `ADW_TOAST_PRIORITY_HIGH`, the toast will be displayed immediately,
         * pushing the previous toast into the queue instead.
         *
         * @param priority the priority
         * @since 1.0
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
     *
     * @since 1.0
     */
    public var timeout: UInt
        /**
         * Gets timeout for @self.
         *
         * @return the timeout
         * @since 1.0
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
         * @since 1.0
         */
        set(timeout) = adw_toast_set_timeout(adwToastPointer.reinterpret(), timeout)

    /**
     * The title of the toast.
     *
     * The title can be marked up with the Pango text markup language.
     *
     * @since 1.0
     */
    public var title: String
        /**
         * Gets the title that will be displayed on the toast.
         *
         * @return the title
         * @since 1.0
         */
        get() =
            adw_toast_get_title(adwToastPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the title that will be displayed on the toast.
         *
         * @param title a title
         * @since 1.0
         */
        set(title) = adw_toast_set_title(adwToastPointer.reinterpret(), title)

    /**
     * Creates a new `AdwToast`.
     *
     * The toast will use @title as its title.
     *
     * @title can be marked up with the Pango text markup language.
     *
     * @param title the title to be displayed
     * @return the new created `AdwToast`
     * @since 1.0
     */
    public constructor(title: String) : this(adw_toast_new(title)!!.reinterpret())

    /**
     * Dismisses @self.
     *
     * @since 1.0
     */
    public fun dismiss(): Unit = adw_toast_dismiss(adwToastPointer.reinterpret())

    /**
     * Gets the name of the associated action.
     *
     * @return the action name
     * @since 1.0
     */
    public fun getActionName(): String? = adw_toast_get_action_name(adwToastPointer.reinterpret())?.toKString()

    /**
     * Gets the parameter for action invocations.
     *
     * @return the action target
     * @since 1.0
     */
    public fun getActionTargetValue(): Variant? =
        adw_toast_get_action_target_value(adwToastPointer.reinterpret())?.run {
            Variant(reinterpret())
        }

    /**
     * Gets the label to show on the button.
     *
     * @return the button label
     * @since 1.0
     */
    public fun getButtonLabel(): String? = adw_toast_get_button_label(adwToastPointer.reinterpret())?.toKString()

    /**
     * Gets priority for @self.
     *
     * @return the priority
     * @since 1.0
     */
    public fun getPriority(): ToastPriority =
        adw_toast_get_priority(adwToastPointer.reinterpret()).run {
            ToastPriority.fromNativeValue(this)
        }

    /**
     * Gets timeout for @self.
     *
     * @return the timeout
     * @since 1.0
     */
    public fun getTimeout(): UInt = adw_toast_get_timeout(adwToastPointer.reinterpret())

    /**
     * Gets the title that will be displayed on the toast.
     *
     * @return the title
     * @since 1.0
     */
    public fun getTitle(): String =
        adw_toast_get_title(adwToastPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Sets the name of the associated action.
     *
     * @param actionName the action name
     * @since 1.0
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
     * @since 1.0
     */
    public fun setActionTargetValue(actionTarget: Variant? = null): Unit =
        adw_toast_set_action_target_value(
            adwToastPointer.reinterpret(),
            actionTarget?.glibVariantPointer
        )

    /**
     * Sets the label to show on the button.
     *
     * It set to `NULL`, the button won't be shown.
     *
     * @param buttonLabel a button label
     * @since 1.0
     */
    public fun setButtonLabel(buttonLabel: String? = null): Unit =
        adw_toast_set_button_label(adwToastPointer.reinterpret(), buttonLabel)

    /**
     * Sets the action name and its parameter.
     *
     * @detailed_action_name is a string in the format accepted by
     * [func@Gio.Action.parse_detailed_name].
     *
     * @param detailedActionName the detailed action name
     * @since 1.0
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
     * If @priority is `ADW_TOAST_PRIORITY_HIGH`, the toast will be displayed immediately,
     * pushing the previous toast into the queue instead.
     *
     * @param priority the priority
     * @since 1.0
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
     * @since 1.0
     */
    public fun setTimeout(timeout: UInt): Unit = adw_toast_set_timeout(adwToastPointer.reinterpret(), timeout)

    /**
     * Sets the title that will be displayed on the toast.
     *
     * @param title a title
     * @since 1.0
     */
    public fun setTitle(title: String): Unit =
        adw_toast_set_title(
            adwToastPointer.reinterpret(),
            title
        )

    /**
     * Emitted when the toast has been dismissed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.0
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

private val connectDismissedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
