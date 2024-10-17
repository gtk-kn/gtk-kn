// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Editable
import org.gtkkn.bindings.gtk.InputHints
import org.gtkkn.bindings.gtk.InputPurpose
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.bindings.pango.AttrList
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
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
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkEditable
import kotlin.Boolean
import kotlin.UInt
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
public open class EntryRow(
    pointer: CPointer<AdwEntryRow>,
) : PreferencesRow(pointer.reinterpret()), Editable, KGTyped {
    public val adwEntryRowPointer: CPointer<AdwEntryRow>
        get() = gPointer.reinterpret()

    override val gtkEditablePointer: CPointer<GtkEditable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Whether activating the embedded entry can activate the default widget.
     *
     * @since 1.2
     */
    public open var activatesDefault: Boolean
        /**
         * Gets whether activating the embedded entry can activate the default widget.
         *
         * @return whether to activate the default widget
         * @since 1.2
         */
        get() = adw_entry_row_get_activates_default(adwEntryRowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether activating the embedded entry can activate the default widget.
         *
         * @param activates whether to activate the default widget
         * @since 1.2
         */
        set(activates) =
            adw_entry_row_set_activates_default(
                adwEntryRowPointer.reinterpret(),
                activates.asGBoolean()
            )

    /**
     * A list of Pango attributes to apply to the text of the embedded entry.
     *
     * The [struct@Pango.Attribute]'s `start_index` and `end_index` must refer to
     * the [class@Gtk.EntryBuffer] text, i.e. without the preedit string.
     *
     * @since 1.2
     */
    public open var attributes: AttrList?
        /**
         * Gets Pango attributes applied to the text of the embedded entry.
         *
         * @return the list of attributes
         * @since 1.2
         */
        get() =
            adw_entry_row_get_attributes(adwEntryRowPointer.reinterpret())?.run {
                AttrList(reinterpret())
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
        set(attributes) =
            adw_entry_row_set_attributes(
                adwEntryRowPointer.reinterpret(),
                attributes?.pangoAttrListPointer
            )

    /**
     * Whether to suggest emoji replacements on the entry row.
     *
     * Emoji replacement is done with :-delimited names, like `:heart:`.
     *
     * @since 1.2
     */
    public open var enableEmojiCompletion: Boolean
        /**
         * Gets whether to suggest emoji replacements on @self.
         *
         * @return whether or not emoji completion is enabled
         * @since 1.2
         */
        get() =
            adw_entry_row_get_enable_emoji_completion(adwEntryRowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to suggest emoji replacements on @self.
         *
         * Emoji replacement is done with :-delimited names, like `:heart:`.
         *
         * @param enableEmojiCompletion Whether emoji completion should be enabled or not
         * @since 1.2
         */
        set(enableEmojiCompletion) =
            adw_entry_row_set_enable_emoji_completion(
                adwEntryRowPointer.reinterpret(),
                enableEmojiCompletion.asGBoolean()
            )

    /**
     * Additional input hints for the entry row.
     *
     * Input hints allow input methods to fine-tune their behavior.
     *
     * See also: [property@Adw.EntryRow:input-purpose]
     *
     * @since 1.2
     */
    public open var inputHints: InputHints
        /**
         * Gets the additional input hints of @self.
         *
         * @return The input hints
         * @since 1.2
         */
        get() =
            adw_entry_row_get_input_hints(adwEntryRowPointer.reinterpret()).run {
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
        set(hints) = adw_entry_row_set_input_hints(adwEntryRowPointer.reinterpret(), hints.mask)

    /**
     * The input purpose of the entry row.
     *
     * The input purpose can be used by input methods to adjust their behavior.
     *
     * @since 1.2
     */
    public open var inputPurpose: InputPurpose
        /**
         * Gets the input purpose of @self.
         *
         * @return the input purpose
         * @since 1.2
         */
        get() =
            adw_entry_row_get_input_purpose(adwEntryRowPointer.reinterpret()).run {
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
        set(purpose) =
            adw_entry_row_set_input_purpose(
                adwEntryRowPointer.reinterpret(),
                purpose.nativeValue
            )

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
    public open var showApplyButton: Boolean
        /**
         * Gets whether @self can show the apply button.
         *
         * @return whether to show the apply button
         * @since 1.2
         */
        get() = adw_entry_row_get_show_apply_button(adwEntryRowPointer.reinterpret()).asBoolean()

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
        set(showApplyButton) =
            adw_entry_row_set_show_apply_button(
                adwEntryRowPointer.reinterpret(),
                showApplyButton.asGBoolean()
            )

    /**
     * The length of the text in the entry row.
     *
     * @since 1.5
     */
    public open val textLength: UInt
        /**
         * Retrieves the current length of the text in @self.
         *
         * @return The current number of characters in @self, or 0 if there are none.
         * @since 1.5
         */
        get() = adw_entry_row_get_text_length(adwEntryRowPointer.reinterpret())

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
    public open fun addPrefix(widget: Widget): Unit =
        adw_entry_row_add_prefix(
            adwEntryRowPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret()
        )

    /**
     * Adds a suffix widget to @self.
     *
     * @param widget a widget
     * @since 1.2
     */
    public open fun addSuffix(widget: Widget): Unit =
        adw_entry_row_add_suffix(
            adwEntryRowPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret()
        )

    /**
     * Gets whether activating the embedded entry can activate the default widget.
     *
     * @return whether to activate the default widget
     * @since 1.2
     */
    public open fun getActivatesDefault(): Boolean =
        adw_entry_row_get_activates_default(adwEntryRowPointer.reinterpret()).asBoolean()

    /**
     * Gets Pango attributes applied to the text of the embedded entry.
     *
     * @return the list of attributes
     * @since 1.2
     */
    public open fun getAttributes(): AttrList? =
        adw_entry_row_get_attributes(adwEntryRowPointer.reinterpret())?.run {
            AttrList(reinterpret())
        }

    /**
     * Gets whether to suggest emoji replacements on @self.
     *
     * @return whether or not emoji completion is enabled
     * @since 1.2
     */
    public open fun getEnableEmojiCompletion(): Boolean =
        adw_entry_row_get_enable_emoji_completion(adwEntryRowPointer.reinterpret()).asBoolean()

    /**
     * Gets the additional input hints of @self.
     *
     * @return The input hints
     * @since 1.2
     */
    public open fun getInputHints(): InputHints =
        adw_entry_row_get_input_hints(adwEntryRowPointer.reinterpret()).run {
            InputHints(this)
        }

    /**
     * Gets the input purpose of @self.
     *
     * @return the input purpose
     * @since 1.2
     */
    public open fun getInputPurpose(): InputPurpose =
        adw_entry_row_get_input_purpose(adwEntryRowPointer.reinterpret()).run {
            InputPurpose.fromNativeValue(this)
        }

    /**
     * Gets whether @self can show the apply button.
     *
     * @return whether to show the apply button
     * @since 1.2
     */
    public open fun getShowApplyButton(): Boolean =
        adw_entry_row_get_show_apply_button(adwEntryRowPointer.reinterpret()).asBoolean()

    /**
     * Retrieves the current length of the text in @self.
     *
     * @return The current number of characters in @self, or 0 if there are none.
     * @since 1.5
     */
    public open fun getTextLength(): UInt = adw_entry_row_get_text_length(adwEntryRowPointer.reinterpret())

    /**
     * Causes @self to have keyboard focus without selecting the text.
     *
     * See [method@Gtk.Text.grab_focus_without_selecting] for more information.
     *
     * @return whether the focus is now inside @self
     * @since 1.3
     */
    public open fun grabFocusWithoutSelecting(): Boolean =
        adw_entry_row_grab_focus_without_selecting(adwEntryRowPointer.reinterpret()).asBoolean()

    /**
     * Removes a child from @self.
     *
     * @param widget the child to be removed
     * @since 1.2
     */
    public open fun remove(widget: Widget): Unit =
        adw_entry_row_remove(
            adwEntryRowPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret()
        )

    /**
     * Sets whether activating the embedded entry can activate the default widget.
     *
     * @param activates whether to activate the default widget
     * @since 1.2
     */
    public open fun setActivatesDefault(activates: Boolean): Unit =
        adw_entry_row_set_activates_default(
            adwEntryRowPointer.reinterpret(),
            activates.asGBoolean()
        )

    /**
     * Sets Pango attributes to apply to the text of the embedded entry.
     *
     * The [struct@Pango.Attribute]'s `start_index` and `end_index` must refer to
     * the [class@Gtk.EntryBuffer] text, i.e. without the preedit string.
     *
     * @param attributes a list of attributes
     * @since 1.2
     */
    public open fun setAttributes(attributes: AttrList? = null): Unit =
        adw_entry_row_set_attributes(
            adwEntryRowPointer.reinterpret(),
            attributes?.pangoAttrListPointer
        )

    /**
     * Sets whether to suggest emoji replacements on @self.
     *
     * Emoji replacement is done with :-delimited names, like `:heart:`.
     *
     * @param enableEmojiCompletion Whether emoji completion should be enabled or not
     * @since 1.2
     */
    public open fun setEnableEmojiCompletion(enableEmojiCompletion: Boolean): Unit =
        adw_entry_row_set_enable_emoji_completion(
            adwEntryRowPointer.reinterpret(),
            enableEmojiCompletion.asGBoolean()
        )

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
    public open fun setInputHints(hints: InputHints): Unit =
        adw_entry_row_set_input_hints(adwEntryRowPointer.reinterpret(), hints.mask)

    /**
     * Sets the input purpose of @self.
     *
     * The input purpose can be used by input methods to adjust their behavior.
     *
     * @param purpose the purpose
     * @since 1.2
     */
    public open fun setInputPurpose(purpose: InputPurpose): Unit =
        adw_entry_row_set_input_purpose(adwEntryRowPointer.reinterpret(), purpose.nativeValue)

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
    public open fun setShowApplyButton(showApplyButton: Boolean): Unit =
        adw_entry_row_set_show_apply_button(
            adwEntryRowPointer.reinterpret(),
            showApplyButton.asGBoolean()
        )

    /**
     * Emitted when the apply button is pressed.
     *
     * See [property@EntryRow:show-apply-button].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.2
     */
    public fun connectApply(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "apply",
            connectApplyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the embedded entry is activated.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.2
     */
    public fun connectEntryActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "entry-activated",
            connectEntryActivatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<EntryRow> {
        override val type: GeneratedClassKGType<EntryRow> =
            GeneratedClassKGType(adw_entry_row_get_type()) { EntryRow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}

private val connectApplyFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectEntryActivatedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
