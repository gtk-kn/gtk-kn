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
import org.gtkkn.bindings.adw.annotations.AdwVersion1_2
import org.gtkkn.bindings.adw.annotations.AdwVersion1_3
import org.gtkkn.bindings.adw.annotations.AdwVersion1_5
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Editable
import org.gtkkn.bindings.gtk.InputHints
import org.gtkkn.bindings.gtk.InputPurpose
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.bindings.pango.AttrList
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwEntryRow
import org.gtkkn.native.adw.adw_entry_row_add_prefix
import org.gtkkn.native.adw.adw_entry_row_add_suffix
import org.gtkkn.native.adw.adw_entry_row_get_activates_default
import org.gtkkn.native.adw.adw_entry_row_get_attributes
import org.gtkkn.native.adw.adw_entry_row_get_enable_emoji_completion
import org.gtkkn.native.adw.adw_entry_row_get_input_hints
import org.gtkkn.native.adw.adw_entry_row_get_input_purpose
import org.gtkkn.native.adw.adw_entry_row_get_show_apply_button
import org.gtkkn.native.adw.adw_entry_row_get_text_length
import org.gtkkn.native.adw.adw_entry_row_get_type
import org.gtkkn.native.adw.adw_entry_row_grab_focus_without_selecting
import org.gtkkn.native.adw.adw_entry_row_new
import org.gtkkn.native.adw.adw_entry_row_remove
import org.gtkkn.native.adw.adw_entry_row_set_activates_default
import org.gtkkn.native.adw.adw_entry_row_set_attributes
import org.gtkkn.native.adw.adw_entry_row_set_enable_emoji_completion
import org.gtkkn.native.adw.adw_entry_row_set_input_hints
import org.gtkkn.native.adw.adw_entry_row_set_input_purpose
import org.gtkkn.native.adw.adw_entry_row_set_show_apply_button
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkEditable
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * A [class@Gtk.ListBoxRow] with an embedded text entry.
 *
 * <picture>
 *   <source srcset="entry-row-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="entry-row.png" alt="entry-row">
 * </picture>
 *
 * `AdwEntryRow` has a title that doubles as placeholder text. It shows an icon
 * indicating that it's editable and can receive additional widgets before or
 * after the editable part.
 *
 * If [property@EntryRow:show-apply-button] is set to `TRUE`, `AdwEntryRow` can
 * show an apply button when editing its contents. This can be useful if
 * changing its contents can result in an expensive operation, such as network
 * activity.
 *
 * `AdwEntryRow` provides only minimal API and should be used with the
 * [iface@Gtk.Editable] API.
 *
 * See also [class@PasswordEntryRow].
 *
 * ## AdwEntryRow as GtkBuildable
 *
 * The `AdwEntryRow` implementation of the [iface@Gtk.Buildable] interface
 * supports adding a child at its end by specifying “suffix” or omitting the
 * “type” attribute of a <child> element.
 *
 * It also supports adding a child as a prefix widget by specifying “prefix” as
 * the “type” attribute of a <child> element.
 *
 * ## CSS nodes
 *
 * `AdwEntryRow` has a single CSS node with name `row` and the `.entry` style
 * class.
 * @since 1.2
 */
@AdwVersion1_2
public open class EntryRow(public val adwEntryRowPointer: CPointer<AdwEntryRow>) :
    PreferencesRow(adwEntryRowPointer.reinterpret()),
    Editable,
    KGTyped {
    override val gtkEditablePointer: CPointer<GtkEditable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether activating the embedded entry can activate the default widget.
     *
     * @since 1.2
     */
    @AdwVersion1_2
    public open var activatesDefault: Boolean
        /**
         * Gets whether activating the embedded entry can activate the default widget.
         *
         * @return whether to activate the default widget
         * @since 1.2
         */
        get() = adw_entry_row_get_activates_default(adwEntryRowPointer).asBoolean()

        /**
         * Sets whether activating the embedded entry can activate the default widget.
         *
         * @param activates whether to activate the default widget
         * @since 1.2
         */
        @AdwVersion1_2
        set(activates) = adw_entry_row_set_activates_default(adwEntryRowPointer, activates.asGBoolean())

    /**
     * A list of Pango attributes to apply to the text of the embedded entry.
     *
     * The [struct@Pango.Attribute]'s `start_index` and `end_index` must refer to
     * the [class@Gtk.EntryBuffer] text, i.e. without the preedit string.
     *
     * @since 1.2
     */
    @AdwVersion1_2
    public open var attributes: AttrList?
        /**
         * Gets Pango attributes applied to the text of the embedded entry.
         *
         * @return the list of attributes
         * @since 1.2
         */
        get() = adw_entry_row_get_attributes(adwEntryRowPointer)?.run {
            AttrList(this)
        }

        /**
         * Sets Pango attributes to apply to the text of the embedded entry.
         *
         * The [struct@Pango.Attribute]'s `start_index` and `end_index` must refer to
         * the [class@Gtk.EntryBuffer] text, i.e. without the preedit string.
         *
         * @param attributes a list of attributes
         * @since 1.2
         */
        @AdwVersion1_2
        set(attributes) = adw_entry_row_set_attributes(adwEntryRowPointer, attributes?.pangoAttrListPointer)

    /**
     * Whether to suggest emoji replacements on the entry row.
     *
     * Emoji replacement is done with :-delimited names, like `:heart:`.
     *
     * @since 1.2
     */
    @AdwVersion1_2
    public open var enableEmojiCompletion: Boolean
        /**
         * Gets whether to suggest emoji replacements on @self.
         *
         * @return whether or not emoji completion is enabled
         * @since 1.2
         */
        get() = adw_entry_row_get_enable_emoji_completion(adwEntryRowPointer).asBoolean()

        /**
         * Sets whether to suggest emoji replacements on @self.
         *
         * Emoji replacement is done with :-delimited names, like `:heart:`.
         *
         * @param enableEmojiCompletion Whether emoji completion should be enabled or not
         * @since 1.2
         */
        @AdwVersion1_2
        set(
            enableEmojiCompletion
        ) = adw_entry_row_set_enable_emoji_completion(adwEntryRowPointer, enableEmojiCompletion.asGBoolean())

    /**
     * Additional input hints for the entry row.
     *
     * Input hints allow input methods to fine-tune their behavior.
     *
     * See also: [property@Adw.EntryRow:input-purpose]
     *
     * @since 1.2
     */
    @AdwVersion1_2
    public open var inputHints: InputHints
        /**
         * Gets the additional input hints of @self.
         *
         * @return The input hints
         * @since 1.2
         */
        get() = adw_entry_row_get_input_hints(adwEntryRowPointer).run {
            InputHints(this)
        }

        /**
         * Set additional input hints for @self.
         *
         * Input hints allow input methods to fine-tune their behavior.
         *
         * See also: [property@AdwEntryRow:input-purpose]
         *
         * @param hints the hints
         * @since 1.2
         */
        @AdwVersion1_2
        set(hints) = adw_entry_row_set_input_hints(adwEntryRowPointer, hints.mask)

    /**
     * The input purpose of the entry row.
     *
     * The input purpose can be used by input methods to adjust their behavior.
     *
     * @since 1.2
     */
    @AdwVersion1_2
    public open var inputPurpose: InputPurpose
        /**
         * Gets the input purpose of @self.
         *
         * @return the input purpose
         * @since 1.2
         */
        get() = adw_entry_row_get_input_purpose(adwEntryRowPointer).run {
            InputPurpose.fromNativeValue(this)
        }

        /**
         * Sets the input purpose of @self.
         *
         * The input purpose can be used by input methods to adjust their behavior.
         *
         * @param purpose the purpose
         * @since 1.2
         */
        @AdwVersion1_2
        set(purpose) = adw_entry_row_set_input_purpose(adwEntryRowPointer, purpose.nativeValue)

    /**
     * Whether to show the apply button.
     *
     * When set to `TRUE`, typing text in the entry will reveal an apply button.
     * Clicking it or pressing the <kbd>Enter</kbd> key will hide the button and
     * emit the [signal@EntryRow::apply] signal.
     *
     * This is useful if changing the entry contents can trigger an expensive
     * operation, e.g. network activity, to avoid triggering it after typing every
     * character.
     *
     * @since 1.2
     */
    @AdwVersion1_2
    public open var showApplyButton: Boolean
        /**
         * Gets whether @self can show the apply button.
         *
         * @return whether to show the apply button
         * @since 1.2
         */
        get() = adw_entry_row_get_show_apply_button(adwEntryRowPointer).asBoolean()

        /**
         * Sets whether @self can show the apply button.
         *
         * When set to `TRUE`, typing text in the entry will reveal an apply button.
         * Clicking it or pressing the <kbd>Enter</kbd> key will hide the button and
         * emit the [signal@EntryRow::apply] signal.
         *
         * This is useful if changing the entry contents can trigger an expensive
         * operation, e.g. network activity, to avoid triggering it after typing every
         * character.
         *
         * @param showApplyButton whether to show the apply button
         * @since 1.2
         */
        @AdwVersion1_2
        set(showApplyButton) = adw_entry_row_set_show_apply_button(adwEntryRowPointer, showApplyButton.asGBoolean())

    /**
     * The length of the text in the entry row.
     *
     * @since 1.5
     */
    @AdwVersion1_5
    public open val textLength: guint
        /**
         * Retrieves the current length of the text in @self.
         *
         * @return The current number of characters in @self, or 0 if there are none.
         * @since 1.5
         */
        get() = adw_entry_row_get_text_length(adwEntryRowPointer)

    /**
     * Creates a new `AdwEntryRow`.
     *
     * @return the newly created `AdwEntryRow`
     * @since 1.2
     */
    public constructor() : this(adw_entry_row_new()!!.reinterpret())

    /**
     * Adds a prefix widget to @self.
     *
     * @param widget a widget
     * @since 1.2
     */
    @AdwVersion1_2
    public open fun addPrefix(widget: Widget): Unit =
        adw_entry_row_add_prefix(adwEntryRowPointer, widget.gtkWidgetPointer)

    /**
     * Adds a suffix widget to @self.
     *
     * @param widget a widget
     * @since 1.2
     */
    @AdwVersion1_2
    public open fun addSuffix(widget: Widget): Unit =
        adw_entry_row_add_suffix(adwEntryRowPointer, widget.gtkWidgetPointer)

    /**
     * Causes @self to have keyboard focus without selecting the text.
     *
     * See [method@Gtk.Text.grab_focus_without_selecting] for more information.
     *
     * @return whether the focus is now inside @self
     * @since 1.3
     */
    @AdwVersion1_3
    public open fun grabFocusWithoutSelecting(): Boolean =
        adw_entry_row_grab_focus_without_selecting(adwEntryRowPointer).asBoolean()

    /**
     * Removes a child from @self.
     *
     * @param widget the child to be removed
     * @since 1.2
     */
    @AdwVersion1_2
    public open fun remove(widget: Widget): Unit = adw_entry_row_remove(adwEntryRowPointer, widget.gtkWidgetPointer)

    /**
     * Emitted when the apply button is pressed.
     *
     * See [property@EntryRow:show-apply-button].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.2
     */
    @AdwVersion1_2
    public fun onApply(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            adwEntryRowPointer,
            "apply",
            onApplyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "apply" signal. See [onApply].
     *
     * @since 1.2
     */
    @AdwVersion1_2
    public fun emitApply() {
        g_signal_emit_by_name(adwEntryRowPointer.reinterpret(), "apply")
    }

    /**
     * Emitted when the embedded entry is activated.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.2
     */
    @AdwVersion1_2
    public fun onEntryActivated(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            adwEntryRowPointer,
            "entry-activated",
            onEntryActivatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "entry-activated" signal. See [onEntryActivated].
     *
     * @since 1.2
     */
    @AdwVersion1_2
    public fun emitEntryActivated() {
        g_signal_emit_by_name(adwEntryRowPointer.reinterpret(), "entry-activated")
    }

    public companion object : TypeCompanion<EntryRow> {
        override val type: GeneratedClassKGType<EntryRow> =
            GeneratedClassKGType(adw_entry_row_get_type()) { EntryRow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of EntryRow
         *
         * @return the GType
         */
        public fun getType(): GType = adw_entry_row_get_type()
    }
}

private val onApplyFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onEntryActivatedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
