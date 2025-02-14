// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.adw.annotations.AdwVersion1_6
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwBottomSheet
import org.gtkkn.native.adw.AdwSwipeable
import org.gtkkn.native.adw.adw_bottom_sheet_get_align
import org.gtkkn.native.adw.adw_bottom_sheet_get_bottom_bar
import org.gtkkn.native.adw.adw_bottom_sheet_get_bottom_bar_height
import org.gtkkn.native.adw.adw_bottom_sheet_get_can_close
import org.gtkkn.native.adw.adw_bottom_sheet_get_can_open
import org.gtkkn.native.adw.adw_bottom_sheet_get_content
import org.gtkkn.native.adw.adw_bottom_sheet_get_full_width
import org.gtkkn.native.adw.adw_bottom_sheet_get_modal
import org.gtkkn.native.adw.adw_bottom_sheet_get_open
import org.gtkkn.native.adw.adw_bottom_sheet_get_sheet
import org.gtkkn.native.adw.adw_bottom_sheet_get_sheet_height
import org.gtkkn.native.adw.adw_bottom_sheet_get_show_drag_handle
import org.gtkkn.native.adw.adw_bottom_sheet_get_type
import org.gtkkn.native.adw.adw_bottom_sheet_new
import org.gtkkn.native.adw.adw_bottom_sheet_set_align
import org.gtkkn.native.adw.adw_bottom_sheet_set_bottom_bar
import org.gtkkn.native.adw.adw_bottom_sheet_set_can_close
import org.gtkkn.native.adw.adw_bottom_sheet_set_can_open
import org.gtkkn.native.adw.adw_bottom_sheet_set_content
import org.gtkkn.native.adw.adw_bottom_sheet_set_full_width
import org.gtkkn.native.adw.adw_bottom_sheet_set_modal
import org.gtkkn.native.adw.adw_bottom_sheet_set_open
import org.gtkkn.native.adw.adw_bottom_sheet_set_sheet
import org.gtkkn.native.adw.adw_bottom_sheet_set_show_drag_handle
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * A bottom sheet with an optional bottom bar.
 *
 * <picture>
 *   <source srcset="bottom-sheet-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="bottom-sheet.png" alt="bottom-sheet">
 * </picture>
 *
 * `AdwBottomSheet` has three child widgets. [property@BottomSheet:content] is
 * shown persistently. [property@BottomSheet:sheet] is displayed above it when
 * it's open, and [property@BottomSheet:bottom-bar] is displayed when it's not.
 *
 * Bottom sheet and bottom bar are attached to the bottom edge of the widget.
 * They take the full width by default, but can only take a portion of it if
 * [property@BottomSheet:full-width] is set to `FALSE`. In this case,
 * [property@BottomSheet:align] determines where along the bottom edge they are
 * placed.
 *
 * `AdwBottomSheet` can be useful for applications such as music players, that
 * want to have a persistent bottom bar that expands into a bottom sheet when
 * clicked. It's meant for cases where a bottom sheet is tightly integrated into
 * the UI. For more transient bottom sheets, see [class@Dialog].
 *
 * To open or close the bottom sheet, use the [property@BottomSheet:open]
 * property.
 *
 * By default, the bottom sheet has an overlaid drag handle. It can be disabled
 * by setting [property@BottomSheet:show-drag-handle] to `FALSE`. Note that the
 * handle also controls whether the sheet can be dragged using a pointer.
 *
 * Bottom sheets are modal by default, meaning that the content is dimmed and
 * cannot be accessed while the sheet is open. Set [property@BottomSheet:modal]
 * to `FALSE` if this behavior is unwanted.
 *
 * To disable user interactions for opening or closing the bottom sheet (such as
 * swipes or clicking the bottom bar or close button), set
 * [property@BottomSheet:can-open] or [property@BottomSheet:can-close] to
 * `FALSE`.
 *
 * In some cases, particularly when using a full-width bottom bar, it may be
 * necessary to shift [property@BottomSheet:content] upwards. Use the
 * [property@BottomSheet:bottom-bar-height] and
 * [property@BottomSheet:sheet-height] for that.
 *
 * `AdwBottomSheet` is not adaptive, and for larger window sizes applications
 * may want to replace it with another UI, such as a sidebar. This can be done
 * using [class@MultiLayoutView].
 *
 * ## Sizing
 *
 * Unlike [class@Dialog] presented as a bottom sheet, `AdwBottomSheet` just
 * follows the content's natural size, and it's up to the applications to make
 * sure their content provides one. For example, when using
 * [class@Gtk.ScrolledWindow], make sure to set
 * [property@Gtk.ScrolledWindow:propagate-natural-height] to `TRUE`.
 *
 * ## Header Bar Integration
 *
 * When placed inside an `AdwBottomSheet`, [class@HeaderBar] will not show the
 * title when [property@BottomSheet:show-drag-handle] is `TRUE`, regardless of
 * [property@HeaderBar:show-title]. This only applies to the default title,
 * titles set with [property@HeaderBar:title-widget] will still be shown.
 *
 * ## `AdwBottomSheet` as `GtkBuildable`:
 *
 * The `AdwBottomSheet` implementation of the [iface@Gtk.Buildable] interface
 * supports setting the sheet widget by specifying “sheet” as the “type”
 * attribute of a `<child>` element, and the bottom bar by specifying
 * “bottom-bar”. Specifying “content” or omitting the child type results in
 * setting the content child.
 * @since 1.6
 */
@AdwVersion1_6
public class BottomSheet(public val adwBottomSheetPointer: CPointer<AdwBottomSheet>) :
    Widget(adwBottomSheetPointer.reinterpret()),
    Swipeable,
    KGTyped {
    init {
        Adw
    }

    override val adwSwipeablePointer: CPointer<AdwSwipeable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Horizontal alignment of the bottom sheet.
     *
     * 0 means the bottom sheet is flush with the start edge, 1 means it's flush
     * with the end edge. 0.5 means it's centered.
     *
     * Only used when [property@BottomSheet:full-width] is set to `FALSE`.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public var align: gfloat
        /**
         * Gets horizontal alignment of the bottom sheet.
         *
         * @return the horizontal alignment
         * @since 1.6
         */
        get() = adw_bottom_sheet_get_align(adwBottomSheetPointer)

        /**
         * Sets horizontal alignment of the bottom sheet.
         *
         * 0 means the bottom sheet is flush with the start edge, 1 means it's flush
         * with the end edge. 0.5 means it's centered.
         *
         * Only used when [property@BottomSheet:full-width] is set to `FALSE`.
         *
         * @param align the new alignment
         * @since 1.6
         */
        @AdwVersion1_6
        set(align) = adw_bottom_sheet_set_align(adwBottomSheetPointer, align)

    /**
     * The bottom bar widget.
     *
     * Shown when [property@BottomSheet:open] is `FALSE`. When open, morphs into
     * the [property@BottomSheet:sheet].
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public var bottomBar: Widget?
        /**
         * Gets the bottom bar widget for @self.
         *
         * @return the bottom bar widget
         * @since 1.6
         */
        get() = adw_bottom_sheet_get_bottom_bar(adwBottomSheetPointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the bottom bar widget for @self.
         *
         * Shown when [property@BottomSheet:open] is `FALSE`. When open, morphs into
         * the [property@BottomSheet:sheet].
         *
         * @param bottomBar the bottom bar widget
         * @since 1.6
         */
        @AdwVersion1_6
        set(bottomBar) = adw_bottom_sheet_set_bottom_bar(adwBottomSheetPointer, bottomBar?.gtkWidgetPointer)

    /**
     * The current bottom bar height.
     *
     * It can be used to shift the content upwards permanently to accommodate for
     * the bottom bar.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public val bottomBarHeight: gint
        /**
         * Gets the current bottom bar height.
         *
         * It can be used to shift the content upwards permanently to accommodate for
         * the bottom bar.
         *
         * @return the bottom bar height
         * @since 1.6
         */
        get() = adw_bottom_sheet_get_bottom_bar_height(adwBottomSheetPointer)

    /**
     * Whether the bottom sheet can be closed by user.
     *
     * It can be closed via the close button, swiping down, pressing
     * <kbd>Escape</kbd> or clicking the content dimming (when modal).
     *
     * Bottom sheet can still be closed using [property@BottomSheet:open].
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public var canClose: Boolean
        /**
         * Gets whether the bottom sheet can be closed by user.
         *
         * @return whether the sheet can be closed by user
         * @since 1.6
         */
        get() = adw_bottom_sheet_get_can_close(adwBottomSheetPointer).asBoolean()

        /**
         * Sets whether the bottom sheet can be closed by user.
         *
         * It can be closed via the close button, swiping down, pressing
         * <kbd>Escape</kbd> or clicking the content dimming (when modal).
         *
         * Bottom sheet can still be closed using [property@BottomSheet:open].
         *
         * @param canClose whether the sheet can be closed by user
         * @since 1.6
         */
        @AdwVersion1_6
        set(canClose) = adw_bottom_sheet_set_can_close(adwBottomSheetPointer, canClose.asGBoolean())

    /**
     * Whether the bottom sheet can be opened by user.
     *
     * It can be opened via clicking or swiping up from the bottom bar.
     *
     * Does nothing if [property@BottomSheet:bottom-bar] is not set.
     *
     * Bottom sheet can still be opened using [property@BottomSheet:open].
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public var canOpen: Boolean
        /**
         * Gets whether the bottom sheet can be opened by user.
         *
         * @return whether the sheet can be opened by user.
         * @since 1.6
         */
        get() = adw_bottom_sheet_get_can_open(adwBottomSheetPointer).asBoolean()

        /**
         * Sets whether the bottom sheet can be opened by user.
         *
         * It can be opened via clicking or swiping up from the bottom bar.
         *
         * Does nothing if [property@BottomSheet:bottom-bar] is not set.
         *
         * Bottom sheet can still be opened using [property@BottomSheet:open].
         *
         * @param canOpen whether the sheet can be opened by user.
         * @since 1.6
         */
        @AdwVersion1_6
        set(canOpen) = adw_bottom_sheet_set_can_open(adwBottomSheetPointer, canOpen.asGBoolean())

    /**
     * The content widget.
     *
     * It's always shown, and the bottom sheet is overlaid over it.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public var content: Widget?
        /**
         * Gets the content widget for @self.
         *
         * @return the content widget
         * @since 1.6
         */
        get() = adw_bottom_sheet_get_content(adwBottomSheetPointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the content widget for @self.
         *
         * It's always shown, and the bottom sheet is overlaid over it.
         *
         * @param content the content widget
         * @since 1.6
         */
        @AdwVersion1_6
        set(content) = adw_bottom_sheet_set_content(adwBottomSheetPointer, content?.gtkWidgetPointer)

    /**
     * Whether the bottom sheet takes the full width.
     *
     * When full width, [property@BottomSheet:align] is ignored.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public var fullWidth: Boolean
        /**
         * Gets whether the bottom sheet takes the full width.
         *
         * @return whether the sheet takes up the full width
         * @since 1.6
         */
        get() = adw_bottom_sheet_get_full_width(adwBottomSheetPointer).asBoolean()

        /**
         * Sets whether the bottom sheet takes the full width.
         *
         * When full width, [property@BottomSheet:align] is ignored.
         *
         * @param fullWidth whether the sheet takes up the full width
         * @since 1.6
         */
        @AdwVersion1_6
        set(fullWidth) = adw_bottom_sheet_set_full_width(adwBottomSheetPointer, fullWidth.asGBoolean())

    /**
     * Whether the bottom sheet is modal.
     *
     * When modal, [property@BottomSheet:content] will be dimmed when the bottom
     * sheet is open, and clicking it will close the bottom sheet. It also cannot
     * be focused with keyboard.
     *
     * Otherwise, the content is accessible even when the bottom sheet is open.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public var modal: Boolean
        /**
         * Gets whether the bottom sheet is modal.
         *
         * @return whether the sheet is modal
         * @since 1.6
         */
        get() = adw_bottom_sheet_get_modal(adwBottomSheetPointer).asBoolean()

        /**
         * Sets whether the bottom sheet is modal.
         *
         * When modal, [property@BottomSheet:content] will be dimmed when the bottom
         * sheet is open, and clicking it will close the bottom sheet. It also cannot be
         * focused with keyboard.
         *
         * Otherwise, the content is accessible even when the bottom sheet is open.
         *
         * @param modal whether the sheet is modal
         * @since 1.6
         */
        @AdwVersion1_6
        set(modal) = adw_bottom_sheet_set_modal(adwBottomSheetPointer, modal.asGBoolean())

    /**
     * Whether the bottom sheet is open.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public var `open`: Boolean
        /**
         * Gets whether the bottom sheet is open.
         *
         * @return whether the sheet is open
         * @since 1.6
         */
        get() = adw_bottom_sheet_get_open(adwBottomSheetPointer).asBoolean()

        /**
         * Sets whether the bottom sheet is open.
         *
         * @param open whether to open the sheet
         * @since 1.6
         */
        @AdwVersion1_6
        set(`open`) = adw_bottom_sheet_set_open(adwBottomSheetPointer, `open`.asGBoolean())

    /**
     * The bottom sheet widget.
     *
     * Only shown when [property@BottomSheet:open] is `TRUE`.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public var sheet: Widget?
        /**
         * Gets the bottom sheet widget for @self.
         *
         * @return the sheet widget
         * @since 1.6
         */
        get() = adw_bottom_sheet_get_sheet(adwBottomSheetPointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the bottom sheet widget for @self.
         *
         * Only shown when [property@BottomSheet:open] is `TRUE`.
         *
         * @param sheet the sheet widget
         * @since 1.6
         */
        @AdwVersion1_6
        set(sheet) = adw_bottom_sheet_set_sheet(adwBottomSheetPointer, sheet?.gtkWidgetPointer)

    /**
     * The current bottom sheet height.
     *
     * It can be used to shift the content upwards when the bottom sheet is open.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public val sheetHeight: gint
        /**
         * Gets the current bottom sheet height.
         *
         * It can be used to shift the content upwards when the bottom sheet is open.
         *
         * @return the sheet height
         * @since 1.6
         */
        get() = adw_bottom_sheet_get_sheet_height(adwBottomSheetPointer)

    /**
     * Whether to overlay a drag handle in the bottom sheet.
     *
     * The handle will be overlaid over [property@BottomSheet:sheet].
     *
     * When the handle is shown, [class@HeaderBar] will hide its default title,
     * and [class@ToolbarView] will reserve space if there are no top bars.
     *
     * Showing drag handle also allows to swipe the bottom sheet down (and to
     * swipe the bottom bar up) with a pointer, instead of just touchscreen.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public var showDragHandle: Boolean
        /**
         * Gets whether to show a drag handle in the bottom sheet.
         *
         * @return whether to show the drag handle
         * @since 1.6
         */
        get() = adw_bottom_sheet_get_show_drag_handle(adwBottomSheetPointer).asBoolean()

        /**
         * Sets whether to show a drag handle in the bottom sheet.
         *
         * The handle will be overlaid over [property@BottomSheet:sheet].
         *
         * When the handle is shown, [class@HeaderBar] will hide its default title, and
         * [class@ToolbarView] will reserve space if there are no top bars.
         *
         * Showing drag handle also allows to swipe the bottom sheet down (and to swipe
         * the bottom bar up) with a pointer, instead of just touchscreen.
         *
         * @param showDragHandle whether to show the drag handle
         * @since 1.6
         */
        @AdwVersion1_6
        set(showDragHandle) = adw_bottom_sheet_set_show_drag_handle(adwBottomSheetPointer, showDragHandle.asGBoolean())

    /**
     * Creates a new `AdwBottomSheet`.
     *
     * @return the new created `AdwBottomSheet`
     * @since 1.6
     */
    public constructor() : this(adw_bottom_sheet_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Emitted when the close button or shortcut is used while
     * [property@Dialog:can-close] is set to `FALSE`.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.6
     */
    @AdwVersion1_6
    public fun onCloseAttempt(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            adwBottomSheetPointer,
            "close-attempt",
            onCloseAttemptFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "close-attempt" signal. See [onCloseAttempt].
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public fun emitCloseAttempt() {
        g_signal_emit_by_name(adwBottomSheetPointer.reinterpret(), "close-attempt")
    }

    public companion object : TypeCompanion<BottomSheet> {
        override val type: GeneratedClassKGType<BottomSheet> =
            GeneratedClassKGType(getTypeOrNull()!!) { BottomSheet(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of BottomSheet
         *
         * @return the GType
         */
        public fun getType(): GType = adw_bottom_sheet_get_type()

        /**
         * Gets the GType of from the symbol `adw_bottom_sheet_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_bottom_sheet_get_type")
    }
}

private val onCloseAttemptFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
