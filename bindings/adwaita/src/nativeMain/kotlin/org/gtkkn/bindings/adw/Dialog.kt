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
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwDialog
import org.gtkkn.native.adw.adw_dialog_add_breakpoint
import org.gtkkn.native.adw.adw_dialog_close
import org.gtkkn.native.adw.adw_dialog_force_close
import org.gtkkn.native.adw.adw_dialog_get_can_close
import org.gtkkn.native.adw.adw_dialog_get_child
import org.gtkkn.native.adw.adw_dialog_get_content_height
import org.gtkkn.native.adw.adw_dialog_get_content_width
import org.gtkkn.native.adw.adw_dialog_get_current_breakpoint
import org.gtkkn.native.adw.adw_dialog_get_default_widget
import org.gtkkn.native.adw.adw_dialog_get_focus
import org.gtkkn.native.adw.adw_dialog_get_follows_content_size
import org.gtkkn.native.adw.adw_dialog_get_presentation_mode
import org.gtkkn.native.adw.adw_dialog_get_title
import org.gtkkn.native.adw.adw_dialog_get_type
import org.gtkkn.native.adw.adw_dialog_new
import org.gtkkn.native.adw.adw_dialog_present
import org.gtkkn.native.adw.adw_dialog_set_can_close
import org.gtkkn.native.adw.adw_dialog_set_child
import org.gtkkn.native.adw.adw_dialog_set_content_height
import org.gtkkn.native.adw.adw_dialog_set_content_width
import org.gtkkn.native.adw.adw_dialog_set_default_widget
import org.gtkkn.native.adw.adw_dialog_set_focus
import org.gtkkn.native.adw.adw_dialog_set_follows_content_size
import org.gtkkn.native.adw.adw_dialog_set_presentation_mode
import org.gtkkn.native.adw.adw_dialog_set_title
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * An adaptive dialog container.
 *
 * <picture>
 *   <source srcset="dialog-floating-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="dialog-floating.png" alt="dialog-floating">
 * </picture>
 * <picture>
 *   <source srcset="dialog-bottom-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="dialog-bottom.png" alt="dialog-bottom">
 * </picture>
 *
 * `AdwDialog` is similar to a window, but is shown within another window. It
 * can be used with [class@Window] and [class@ApplicationWindow], use
 * [method@Dialog.present] to show it.
 *
 * `AdwDialog` is not resizable. Use the [property@Dialog:content-width] and
 * [property@Dialog:content-height] properties to set its size, or set
 * [property@Dialog:follows-content-size] to `TRUE` to make the dialog track the
 * content's size as it changes. `AdwDialog` can never be larger than its parent
 * window.
 *
 * `AdwDialog` can be presented as a centered floating window or a bottom sheet.
 * By default it's automatic depending on the available size.
 * [property@Dialog:presentation-mode] can be used to change that.
 *
 * `AdwDialog` can be closed via [method@Dialog.close].
 *
 * When presented as a bottom sheet, `AdwDialog` can also be closed via swiping
 * it down.
 *
 * The [property@Dialog:can-close] can be used to prevent closing. In that case,
 * [signal@Dialog::close-attempt] gets emitted instead.
 *
 * Use [method@Dialog.force_close] to close the dialog even when `can-close` is set to
 * `FALSE`.
 *
 * ## Header Bar Integration
 *
 * When placed inside an `AdwDialog`, [class@HeaderBar] will display the dialog
 * title intead of window title. It will also adjust the decoration layout to
 * ensure it always has a close button and nothing else. Set
 * [property@HeaderBar:show-start-title-buttons] and
 * [property@HeaderBar:show-end-title-buttons] to `FALSE` to remove it if it's
 * unwanted.
 *
 * ## Breakpoints
 *
 * `AdwDialog` can be used with [class@Breakpoint] the same way as
 * [class@BreakpointBin]. Refer to that widget's documentation for details.
 *
 * Like `AdwBreakpointBin`, if breakpoints are used, `AdwDialog` doesn't have a
 * minimum size, and [property@Gtk.Widget:width-request] and
 * [property@Gtk.Widget:height-request] properties must be set manually.
 *
 * ## Skipped during bindings generation
 *
 * - method `focus-widget`: Property has no getter nor setter
 *
 * @since 1.5
 */
public open class Dialog(
    pointer: CPointer<AdwDialog>,
) : Widget(pointer.reinterpret()),
    KGTyped {
    public val adwDialogPointer: CPointer<AdwDialog>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Whether the dialog can be closed.
     *
     * If set to `FALSE`, the close button, shortcuts and
     * [method@Dialog.close] will result in [signal@Dialog::close-attempt] being
     * emitted instead, and bottom sheet close swipe will be disabled.
     * [method@Dialog.force_close] still works.
     *
     * @since 1.5
     */
    public open var canClose: Boolean
        /**
         * Gets whether @self can be closed.
         *
         * @return whether the dialog can be closed
         * @since 1.5
         */
        get() = adw_dialog_get_can_close(adwDialogPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self can be closed.
         *
         * If set to `FALSE`, the close button, shortcuts and
         * [method@Dialog.close] will result in [signal@Dialog::close-attempt] being
         * emitted instead, and bottom sheet close swipe will be disabled.
         * [method@Dialog.force_close] still works.
         *
         * @param canClose whether to allow closing
         * @since 1.5
         */
        set(canClose) = adw_dialog_set_can_close(adwDialogPointer.reinterpret(), canClose.asGBoolean())

    /**
     * The child widget of the `AdwDialog`.
     *
     * @since 1.5
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         * @since 1.5
         */
        get() =
            adw_dialog_get_child(adwDialogPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         * @since 1.5
         */
        set(child) = adw_dialog_set_child(adwDialogPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * The height of the dialog's contents.
     *
     * Set it to -1 to reset it to the content's natural height.
     *
     * See also: [property@Gtk.Window:default-height]
     *
     * @since 1.5
     */
    public open var contentHeight: Int
        /**
         * Gets the height of the dialog's contents.
         *
         * @return the content height
         * @since 1.5
         */
        get() = adw_dialog_get_content_height(adwDialogPointer.reinterpret())

        /**
         * Sets the height of the dialog's contents.
         *
         * Set it to -1 to reset it to the content's natural height.
         *
         * See also: [property@Gtk.Window:default-height]
         *
         * @param contentHeight the content height
         * @since 1.5
         */
        set(contentHeight) = adw_dialog_set_content_height(adwDialogPointer.reinterpret(), contentHeight)

    /**
     * The width of the dialog's contents.
     *
     * Set it to -1 to reset it to the content's natural width.
     *
     * See also: [property@Gtk.Window:default-width]
     *
     * @since 1.5
     */
    public open var contentWidth: Int
        /**
         * Gets the width of the dialog's contents.
         *
         * @return the content width
         * @since 1.5
         */
        get() = adw_dialog_get_content_width(adwDialogPointer.reinterpret())

        /**
         * Sets the width of the dialog's contents.
         *
         * Set it to -1 to reset it to the content's natural width.
         *
         * See also: [property@Gtk.Window:default-width]
         *
         * @param contentWidth the content width
         * @since 1.5
         */
        set(contentWidth) = adw_dialog_set_content_width(adwDialogPointer.reinterpret(), contentWidth)

    /**
     * The current breakpoint.
     *
     * @since 1.5
     */
    public open val currentBreakpoint: Breakpoint?
        /**
         * Gets the current breakpoint.
         *
         * @return the current breakpoint
         * @since 1.5
         */
        get() =
            adw_dialog_get_current_breakpoint(adwDialogPointer.reinterpret())?.run {
                Breakpoint(reinterpret())
            }

    /**
     * The default widget.
     *
     * It's activated when the user presses Enter.
     *
     * @since 1.5
     */
    public open var defaultWidget: Widget?
        /**
         * Gets the default widget for @self.
         *
         * @return the default widget
         * @since 1.5
         */
        get() =
            adw_dialog_get_default_widget(adwDialogPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the default widget for @self.
         *
         * It's activated when the user presses Enter.
         *
         * @param defaultWidget the default widget
         * @since 1.5
         */
        set(
            defaultWidget
        ) =
            adw_dialog_set_default_widget(
                adwDialogPointer.reinterpret(),
                defaultWidget?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Whether to size content automatically.
     *
     * If set to `TRUE`, always use the content's natural size instead of
     * [property@Dialog:content-width] and [property@Dialog:content-height]. If
     * the content resizes, the dialog will immediately resize as well.
     *
     * See also: [property@Gtk.Window:resizable]
     *
     * @since 1.5
     */
    public open var followsContentSize: Boolean
        /**
         * Gets whether to size content of @self automatically.
         *
         * @return whether to size content automatically
         * @since 1.5
         */
        get() = adw_dialog_get_follows_content_size(adwDialogPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to size content of @self automatically.
         *
         * If set to `TRUE`, always use the content's natural size instead of
         * [property@Dialog:content-width] and [property@Dialog:content-height]. If
         * the content resizes, the dialog will immediately resize as well.
         *
         * See also: [property@Gtk.Window:resizable]
         *
         * @param followsContentSize whether to size content automatically
         * @since 1.5
         */
        set(
            followsContentSize
        ) = adw_dialog_set_follows_content_size(adwDialogPointer.reinterpret(), followsContentSize.asGBoolean())

    /**
     * The dialog's presentation mode.
     *
     * When set to `ADW_DIALOG_AUTO`, the dialog appears as a bottom sheet when
     * the following condition is met: `max-width: 450px or max-height: 360px`,
     * and as a floating window otherwise.
     *
     * Set it to `ADW_DIALOG_FLOATING` or `ADW_DIALOG_BOTTOM_SHEET` to always
     * present it a floating window or a bottom sheet respectively, regardless of
     * available size.
     *
     * Presentation mode does nothing for dialogs presented as a window.
     *
     * @since 1.5
     */
    public open var presentationMode: DialogPresentationMode
        /**
         * Gets presentation mode for @self.
         *
         * @return the presentation mode
         * @since 1.5
         */
        get() =
            adw_dialog_get_presentation_mode(adwDialogPointer.reinterpret()).run {
                DialogPresentationMode.fromNativeValue(this)
            }

        /**
         * Sets presentation mode for @self.
         *
         * When set to `ADW_DIALOG_AUTO`, the dialog appears as a bottom sheet when the
         * following condition is met: `max-width: 450px or max-height: 360px`, and as a
         * floating window otherwise.
         *
         * Set it to `ADW_DIALOG_FLOATING` or `ADW_DIALOG_BOTTOM_SHEET` to always
         * present it a floating window or a bottom sheet respectively, regardless of
         * available size.
         *
         * Presentation mode does nothing for dialogs presented as a window.
         *
         * @param presentationMode the new presentation mode
         * @since 1.5
         */
        set(
            presentationMode
        ) = adw_dialog_set_presentation_mode(adwDialogPointer.reinterpret(), presentationMode.nativeValue)

    /**
     * The title of the dialog.
     *
     * @since 1.5
     */
    public open var title: String
        /**
         * Gets the title of @self.
         *
         * @return the title
         * @since 1.5
         */
        get() = adw_dialog_get_title(adwDialogPointer.reinterpret())?.toKString() ?: error("Expected not null string")

        /**
         * Sets the title of @self.
         *
         * @param title the new title
         * @since 1.5
         */
        set(title) = adw_dialog_set_title(adwDialogPointer.reinterpret(), title)

    /**
     * Creates a new `AdwDialog`.
     *
     * @return the new created `AdwDialog`
     * @since 1.5
     */
    public constructor() : this(adw_dialog_new()!!.reinterpret())

    /**
     * Adds @breakpoint to @self.
     *
     * @param breakpoint the breakpoint to add
     * @since 1.5
     */
    public open fun addBreakpoint(breakpoint: Breakpoint): Unit =
        adw_dialog_add_breakpoint(adwDialogPointer.reinterpret(), breakpoint.adwBreakpointPointer.reinterpret())

    /**
     * Attempts to close @self.
     *
     * If the [property@Dialog:can-close] property is set to `FALSE`, the
     * [signal@Dialog::close-attempt] signal is emitted.
     *
     * See also: [method@Dialog.force_close].
     *
     * @return whether @self was successfully closed
     * @since 1.5
     */
    public open fun close(): Boolean = adw_dialog_close(adwDialogPointer.reinterpret()).asBoolean()

    /**
     * Closes @self.
     *
     * Unlike [method@Dialog.close], it succeeds even if [property@Dialog:can-close]
     * is set to `FALSE`.
     *
     * @since 1.5
     */
    public open fun forceClose(): Unit = adw_dialog_force_close(adwDialogPointer.reinterpret())

    /**
     * Gets whether @self can be closed.
     *
     * @return whether the dialog can be closed
     * @since 1.5
     */
    public open fun getCanClose(): Boolean = adw_dialog_get_can_close(adwDialogPointer.reinterpret()).asBoolean()

    /**
     * Gets the child widget of @self.
     *
     * @return the child widget of @self
     * @since 1.5
     */
    public open fun getChild(): Widget? =
        adw_dialog_get_child(adwDialogPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the height of the dialog's contents.
     *
     * @return the content height
     * @since 1.5
     */
    public open fun getContentHeight(): Int = adw_dialog_get_content_height(adwDialogPointer.reinterpret())

    /**
     * Gets the width of the dialog's contents.
     *
     * @return the content width
     * @since 1.5
     */
    public open fun getContentWidth(): Int = adw_dialog_get_content_width(adwDialogPointer.reinterpret())

    /**
     * Gets the current breakpoint.
     *
     * @return the current breakpoint
     * @since 1.5
     */
    public open fun getCurrentBreakpoint(): Breakpoint? =
        adw_dialog_get_current_breakpoint(adwDialogPointer.reinterpret())?.run {
            Breakpoint(reinterpret())
        }

    /**
     * Gets the default widget for @self.
     *
     * @return the default widget
     * @since 1.5
     */
    public open fun getDefaultWidget(): Widget? =
        adw_dialog_get_default_widget(adwDialogPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the focus widget for @self.
     *
     * @return the focus widget
     * @since 1.5
     */
    public open fun getFocus(): Widget? =
        adw_dialog_get_focus(adwDialogPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets whether to size content of @self automatically.
     *
     * @return whether to size content automatically
     * @since 1.5
     */
    public open fun getFollowsContentSize(): Boolean =
        adw_dialog_get_follows_content_size(adwDialogPointer.reinterpret()).asBoolean()

    /**
     * Gets presentation mode for @self.
     *
     * @return the presentation mode
     * @since 1.5
     */
    public open fun getPresentationMode(): DialogPresentationMode =
        adw_dialog_get_presentation_mode(adwDialogPointer.reinterpret()).run {
            DialogPresentationMode.fromNativeValue(this)
        }

    /**
     * Gets the title of @self.
     *
     * @return the title
     * @since 1.5
     */
    public open fun getTitle(): String =
        adw_dialog_get_title(adwDialogPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Presents @self within @parent's window.
     *
     * If @self is already shown, raises it to the top instead.
     *
     * If the window is an [class@Window] or [class@ApplicationWindow], the dialog
     * will be shown within it. Otherwise, it will be a separate window.
     *
     * @param parent a widget within the toplevel
     * @since 1.5
     */
    public open fun present(parent: Widget? = null): Unit =
        adw_dialog_present(adwDialogPointer.reinterpret(), parent?.gtkWidgetPointer?.reinterpret())

    /**
     * Sets whether @self can be closed.
     *
     * If set to `FALSE`, the close button, shortcuts and
     * [method@Dialog.close] will result in [signal@Dialog::close-attempt] being
     * emitted instead, and bottom sheet close swipe will be disabled.
     * [method@Dialog.force_close] still works.
     *
     * @param canClose whether to allow closing
     * @since 1.5
     */
    public open fun setCanClose(canClose: Boolean): Unit =
        adw_dialog_set_can_close(adwDialogPointer.reinterpret(), canClose.asGBoolean())

    /**
     * Sets the child widget of @self.
     *
     * @param child the child widget
     * @since 1.5
     */
    public open fun setChild(child: Widget? = null): Unit =
        adw_dialog_set_child(adwDialogPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * Sets the height of the dialog's contents.
     *
     * Set it to -1 to reset it to the content's natural height.
     *
     * See also: [property@Gtk.Window:default-height]
     *
     * @param contentHeight the content height
     * @since 1.5
     */
    public open fun setContentHeight(contentHeight: Int): Unit =
        adw_dialog_set_content_height(adwDialogPointer.reinterpret(), contentHeight)

    /**
     * Sets the width of the dialog's contents.
     *
     * Set it to -1 to reset it to the content's natural width.
     *
     * See also: [property@Gtk.Window:default-width]
     *
     * @param contentWidth the content width
     * @since 1.5
     */
    public open fun setContentWidth(contentWidth: Int): Unit =
        adw_dialog_set_content_width(adwDialogPointer.reinterpret(), contentWidth)

    /**
     * Sets the default widget for @self.
     *
     * It's activated when the user presses Enter.
     *
     * @param defaultWidget the default widget
     * @since 1.5
     */
    public open fun setDefaultWidget(defaultWidget: Widget? = null): Unit =
        adw_dialog_set_default_widget(adwDialogPointer.reinterpret(), defaultWidget?.gtkWidgetPointer?.reinterpret())

    /**
     * Sets the focus widget for @self.
     *
     * If @focus is not the current focus widget, and is focusable, sets it as the
     * focus widget for the dialog.
     *
     * If focus is `NULL`, unsets the focus widget for this dialog. To set the focus
     * to a particular widget in the dialog, it is usually more convenient to use
     * [method@Gtk.Widget.grab_focus] instead of this function.
     *
     * @param focus the focus widget
     * @since 1.5
     */
    public open fun setFocus(focus: Widget? = null): Unit =
        adw_dialog_set_focus(adwDialogPointer.reinterpret(), focus?.gtkWidgetPointer?.reinterpret())

    /**
     * Sets whether to size content of @self automatically.
     *
     * If set to `TRUE`, always use the content's natural size instead of
     * [property@Dialog:content-width] and [property@Dialog:content-height]. If
     * the content resizes, the dialog will immediately resize as well.
     *
     * See also: [property@Gtk.Window:resizable]
     *
     * @param followsContentSize whether to size content automatically
     * @since 1.5
     */
    public open fun setFollowsContentSize(followsContentSize: Boolean): Unit =
        adw_dialog_set_follows_content_size(adwDialogPointer.reinterpret(), followsContentSize.asGBoolean())

    /**
     * Sets presentation mode for @self.
     *
     * When set to `ADW_DIALOG_AUTO`, the dialog appears as a bottom sheet when the
     * following condition is met: `max-width: 450px or max-height: 360px`, and as a
     * floating window otherwise.
     *
     * Set it to `ADW_DIALOG_FLOATING` or `ADW_DIALOG_BOTTOM_SHEET` to always
     * present it a floating window or a bottom sheet respectively, regardless of
     * available size.
     *
     * Presentation mode does nothing for dialogs presented as a window.
     *
     * @param presentationMode the new presentation mode
     * @since 1.5
     */
    public open fun setPresentationMode(presentationMode: DialogPresentationMode): Unit =
        adw_dialog_set_presentation_mode(adwDialogPointer.reinterpret(), presentationMode.nativeValue)

    /**
     * Sets the title of @self.
     *
     * @param title the new title
     * @since 1.5
     */
    public open fun setTitle(title: String): Unit = adw_dialog_set_title(adwDialogPointer.reinterpret(), title)

    /**
     * Emitted when the close button or shortcut is used, or
     * [method@Dialog.close] is called while [property@Dialog:can-close] is set to
     * `FALSE`.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.5
     */
    public fun connectCloseAttempt(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "close-attempt",
            connectCloseAttemptFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the dialog is successfully closed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.5
     */
    public fun connectClosed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "closed",
            connectClosedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Dialog> {
        override val type: GeneratedClassKGType<Dialog> =
            GeneratedClassKGType(adw_dialog_get_type()) { Dialog(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}

private val connectCloseAttemptFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectClosedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
