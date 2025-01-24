// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

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
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_4
import org.gtkkn.bindings.pango.AttrList
import org.gtkkn.bindings.pango.TabArray
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.glib.guint16
import org.gtkkn.native.glib.gunichar
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAccessibleText
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkDeleteType
import org.gtkkn.native.gtk.GtkEditable
import org.gtkkn.native.gtk.GtkMovementStep
import org.gtkkn.native.gtk.GtkText
import org.gtkkn.native.gtk.gtk_text_compute_cursor_extents
import org.gtkkn.native.gtk.gtk_text_get_activates_default
import org.gtkkn.native.gtk.gtk_text_get_attributes
import org.gtkkn.native.gtk.gtk_text_get_buffer
import org.gtkkn.native.gtk.gtk_text_get_enable_emoji_completion
import org.gtkkn.native.gtk.gtk_text_get_extra_menu
import org.gtkkn.native.gtk.gtk_text_get_input_hints
import org.gtkkn.native.gtk.gtk_text_get_input_purpose
import org.gtkkn.native.gtk.gtk_text_get_invisible_char
import org.gtkkn.native.gtk.gtk_text_get_max_length
import org.gtkkn.native.gtk.gtk_text_get_overwrite_mode
import org.gtkkn.native.gtk.gtk_text_get_placeholder_text
import org.gtkkn.native.gtk.gtk_text_get_propagate_text_width
import org.gtkkn.native.gtk.gtk_text_get_tabs
import org.gtkkn.native.gtk.gtk_text_get_text_length
import org.gtkkn.native.gtk.gtk_text_get_truncate_multiline
import org.gtkkn.native.gtk.gtk_text_get_type
import org.gtkkn.native.gtk.gtk_text_get_visibility
import org.gtkkn.native.gtk.gtk_text_grab_focus_without_selecting
import org.gtkkn.native.gtk.gtk_text_new
import org.gtkkn.native.gtk.gtk_text_new_with_buffer
import org.gtkkn.native.gtk.gtk_text_set_activates_default
import org.gtkkn.native.gtk.gtk_text_set_attributes
import org.gtkkn.native.gtk.gtk_text_set_buffer
import org.gtkkn.native.gtk.gtk_text_set_enable_emoji_completion
import org.gtkkn.native.gtk.gtk_text_set_extra_menu
import org.gtkkn.native.gtk.gtk_text_set_input_hints
import org.gtkkn.native.gtk.gtk_text_set_input_purpose
import org.gtkkn.native.gtk.gtk_text_set_invisible_char
import org.gtkkn.native.gtk.gtk_text_set_max_length
import org.gtkkn.native.gtk.gtk_text_set_overwrite_mode
import org.gtkkn.native.gtk.gtk_text_set_placeholder_text
import org.gtkkn.native.gtk.gtk_text_set_propagate_text_width
import org.gtkkn.native.gtk.gtk_text_set_tabs
import org.gtkkn.native.gtk.gtk_text_set_truncate_multiline
import org.gtkkn.native.gtk.gtk_text_set_visibility
import org.gtkkn.native.gtk.gtk_text_unset_invisible_char
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The `GtkText` widget is a single-line text entry widget.
 *
 * `GtkText` is the common implementation of single-line text editing
 * that is shared between [class@Gtk.Entry], [class@Gtk.PasswordEntry],
 * [class@Gtk.SpinButton], and other widgets. In all of these, `GtkText` is
 * used as the delegate for the [iface@Gtk.Editable] implementation.
 *
 * A fairly large set of key bindings are supported by default. If the
 * entered text is longer than the allocation of the widget, the widget
 * will scroll so that the cursor position is visible.
 *
 * When using an entry for passwords and other sensitive information,
 * it can be put into “password mode” using [method@Gtk.Text.set_visibility].
 * In this mode, entered text is displayed using a “invisible” character.
 * By default, GTK picks the best invisible character that is available
 * in the current font, but it can be changed with
 * [method@Gtk.Text.set_invisible_char].
 *
 * If you are looking to add icons or progress display in an entry, look
 * at [class@Gtk.Entry]. There other alternatives for more specialized use
 * cases, such as [class@Gtk.SearchEntry].
 *
 * If you need multi-line editable text, look at [class@Gtk.TextView].
 *
 * # CSS nodes
 *
 * ```
 * text[.read-only]
 * ├── placeholder
 * ├── undershoot.left
 * ├── undershoot.right
 * ├── [selection]
 * ├── [block-cursor]
 * ╰── [window.popup]
 * ```
 *
 * `GtkText` has a main node with the name `text`. Depending on the properties
 * of the widget, the `.read-only` style class may appear.
 *
 * When the entry has a selection, it adds a subnode with the name `selection`.
 *
 * When the entry is in overwrite mode, it adds a subnode with the name
 * `block-cursor` that determines how the block cursor is drawn.
 *
 * The CSS node for a context menu is added as a subnode with the name `popup`.
 *
 * The `undershoot` nodes are used to draw the underflow indication when content
 * is scrolled out of view. These nodes get the `.left` or `.right` style class
 * added depending on where the indication is drawn.
 *
 * When touch is used and touch selection handles are shown, they are using
 * CSS nodes with name `cursor-handle`. They get the `.top` or `.bottom` style
 * class depending on where they are shown in relation to the selection. If
 * there is just a single handle for the text cursor, it gets the style class
 * `.insertion-cursor`.
 *
 * # Accessibility
 *
 * `GtkText` uses the %GTK_ACCESSIBLE_ROLE_NONE role, which causes it to be
 * skipped for accessibility. This is because `GtkText` is expected to be used
 * as a delegate for a `GtkEditable` implementation that will be represented
 * to accessibility.
 *
 * ## Skipped during bindings generation
 *
 * - method `im-module`: Property has no getter nor setter
 * - method `invisible-char-set`: Property has no getter nor setter
 * - method `scroll-offset`: Property has no getter nor setter
 */
public open class Text(public val gtkTextPointer: CPointer<GtkText>) :
    Widget(gtkTextPointer.reinterpret()),
    AccessibleText,
    Editable,
    KGTyped {
    override val gtkAccessibleTextPointer: CPointer<GtkAccessibleText>
        get() = handle.reinterpret()

    override val gtkEditablePointer: CPointer<GtkEditable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether to activate the default widget when Enter is pressed.
     */
    public open var activatesDefault: Boolean
        /**
         * Returns whether pressing Enter will activate
         * the default widget for the window containing @self.
         *
         * See [method@Gtk.Text.set_activates_default].
         *
         * @return true if the `GtkText` will activate the default widget
         */
        get() = gtk_text_get_activates_default(gtkTextPointer).asBoolean()

        /**
         * If @activates is true, pressing Enter will activate
         * the default widget for the window containing @self.
         *
         * This usually means that the dialog containing the `GtkText`
         * will be closed, since the default widget is usually one of
         * the dialog buttons.
         *
         * @param activates true to activate window’s default widget on Enter keypress
         */
        set(activates) = gtk_text_set_activates_default(gtkTextPointer, activates.asGBoolean())

    /**
     * A list of Pango attributes to apply to the text of the `GtkText`.
     *
     * This is mainly useful to change the size or weight of the text.
     *
     * The `PangoAttribute`'s @start_index and @end_index must refer to the
     * `GtkEntryBuffer` text, i.e. without the preedit string.
     */
    public open var attributes: AttrList?
        /**
         * Gets the attribute list that was set on the `GtkText`.
         *
         * See [method@Gtk.Text.set_attributes].
         *
         * @return the attribute list
         */
        get() = gtk_text_get_attributes(gtkTextPointer)?.run {
            AttrList(this)
        }

        /**
         * Sets attributes that are applied to the text.
         *
         * @param attrs a `PangoAttrList`
         */
        set(attrs) = gtk_text_set_attributes(gtkTextPointer, attrs?.pangoAttrListPointer)

    /**
     * The `GtkEntryBuffer` object which stores the text.
     */
    public open var buffer: EntryBuffer
        /**
         * Get the `GtkEntryBuffer` object which holds the text for
         * this widget.
         *
         * @return A `GtkEntryBuffer` object.
         */
        get() = gtk_text_get_buffer(gtkTextPointer)!!.run {
            EntryBuffer(this)
        }

        /**
         * Set the `GtkEntryBuffer` object which holds the text for
         * this widget.
         *
         * @param buffer a `GtkEntryBuffer`
         */
        set(buffer) = gtk_text_set_buffer(gtkTextPointer, buffer.gtkEntryBufferPointer)

    /**
     * Whether to suggest Emoji replacements.
     */
    public open var enableEmojiCompletion: Boolean
        /**
         * Returns whether Emoji completion is enabled for this
         * `GtkText` widget.
         *
         * @return true if Emoji completion is enabled
         */
        get() = gtk_text_get_enable_emoji_completion(gtkTextPointer).asBoolean()

        /**
         * Sets whether Emoji completion is enabled.
         *
         * If it is, typing ':', followed by a recognized keyword,
         * will pop up a window with suggested Emojis matching the
         * keyword.
         *
         * @param enableEmojiCompletion true to enable Emoji completion
         */
        set(
            enableEmojiCompletion
        ) = gtk_text_set_enable_emoji_completion(gtkTextPointer, enableEmojiCompletion.asGBoolean())

    /**
     * A menu model whose contents will be appended to
     * the context menu.
     */
    public open var extraMenu: MenuModel?
        /**
         * Gets the menu model for extra items in the context menu.
         *
         * See [method@Gtk.Text.set_extra_menu].
         *
         * @return the menu model
         */
        get() = gtk_text_get_extra_menu(gtkTextPointer)?.run {
            MenuModel.MenuModelImpl(this)
        }

        /**
         * Sets a menu model to add when constructing
         * the context menu for @self.
         *
         * @param model a `GMenuModel`
         */
        set(model) = gtk_text_set_extra_menu(gtkTextPointer, model?.gioMenuModelPointer)

    /**
     * Additional hints that allow input methods to fine-tune
     * their behaviour.
     */
    public open var inputHints: InputHints
        /**
         * Gets the input hints of the `GtkText`.
         */
        get() = gtk_text_get_input_hints(gtkTextPointer).run {
            InputHints(this)
        }

        /**
         * Sets input hints that allow input methods
         * to fine-tune their behaviour.
         *
         * @param hints the hints
         */
        set(hints) = gtk_text_set_input_hints(gtkTextPointer, hints.mask)

    /**
     * The purpose of this text field.
     *
     * This property can be used by on-screen keyboards and other input
     * methods to adjust their behaviour.
     *
     * Note that setting the purpose to %GTK_INPUT_PURPOSE_PASSWORD or
     * %GTK_INPUT_PURPOSE_PIN is independent from setting
     * [property@Gtk.Text:visibility].
     */
    public open var inputPurpose: InputPurpose
        /**
         * Gets the input purpose of the `GtkText`.
         */
        get() = gtk_text_get_input_purpose(gtkTextPointer).run {
            InputPurpose.fromNativeValue(this)
        }

        /**
         * Sets the input purpose of the `GtkText`.
         *
         * This can be used by on-screen keyboards and other
         * input methods to adjust their behaviour.
         *
         * @param purpose the purpose
         */
        set(purpose) = gtk_text_set_input_purpose(gtkTextPointer, purpose.nativeValue)

    /**
     * The character to used when masking contents (in “password mode”).
     */
    public open var invisibleChar: gunichar
        /**
         * Retrieves the character displayed when visibility is set to false.
         *
         * Note that GTK does not compute this value unless it needs it,
         * so the value returned by this function is not very useful unless
         * it has been explicitly set with [method@Gtk.Text.set_invisible_char].
         *
         * @return the current invisible char, or 0, if @text does not
         *   show invisible text at all.
         */
        get() = gtk_text_get_invisible_char(gtkTextPointer)

        /**
         * Sets the character to use when in “password mode”.
         *
         * By default, GTK picks the best invisible char available in the
         * current font. If you set the invisible char to 0, then the user
         * will get no feedback at all; there will be no text on the screen
         * as they type.
         *
         * @param ch a Unicode character
         */
        set(ch) = gtk_text_set_invisible_char(gtkTextPointer, ch)

    /**
     * Maximum number of characters that are allowed.
     *
     * Zero indicates no limit.
     */
    public open var maxLength: gint
        /**
         * Retrieves the maximum allowed length of the text in @self.
         *
         * See [method@Gtk.Text.set_max_length].
         *
         * This is equivalent to getting @self's `GtkEntryBuffer` and
         * calling [method@Gtk.EntryBuffer.get_max_length] on it.
         *
         * @return the maximum allowed number of characters
         *   in `GtkText`, or 0 if there is no maximum.
         */
        get() = gtk_text_get_max_length(gtkTextPointer)

        /**
         * Sets the maximum allowed length of the contents of the widget.
         *
         * If the current contents are longer than the given length, then
         * they will be truncated to fit.
         *
         * This is equivalent to getting @self's `GtkEntryBuffer` and
         * calling [method@Gtk.EntryBuffer.set_max_length] on it.
         *
         * @param length the maximum length of the `GtkText`, or 0 for no maximum.
         *   (other than the maximum length of entries.) The value passed
         *   in will be clamped to the range 0-65536.
         */
        set(length) = gtk_text_set_max_length(gtkTextPointer, length)

    /**
     * If text is overwritten when typing in the `GtkText`.
     */
    public open var overwriteMode: Boolean
        /**
         * Gets whether text is overwritten when typing in the `GtkText`.
         *
         * See [method@Gtk.Text.set_overwrite_mode].
         *
         * @return whether the text is overwritten when typing
         */
        get() = gtk_text_get_overwrite_mode(gtkTextPointer).asBoolean()

        /**
         * Sets whether the text is overwritten when typing
         * in the `GtkText`.
         *
         * @param overwrite new value
         */
        set(overwrite) = gtk_text_set_overwrite_mode(gtkTextPointer, overwrite.asGBoolean())

    /**
     * The text that will be displayed in the `GtkText` when it is empty
     * and unfocused.
     */
    public open var placeholderText: String?
        /**
         * Retrieves the text that will be displayed when
         * @self is empty and unfocused
         *
         * If no placeholder text has been set, null will be returned.
         *
         * @return the placeholder text
         */
        get() = gtk_text_get_placeholder_text(gtkTextPointer)?.toKString()

        /**
         * Sets text to be displayed in @self when it is empty.
         *
         * This can be used to give a visual hint of the expected
         * contents of the `GtkText`.
         *
         * @param text a string to be displayed when @self
         *   is empty and unfocused
         */
        set(text) = gtk_text_set_placeholder_text(gtkTextPointer, text)

    /**
     * Whether the widget should grow and shrink with the content.
     */
    public open var propagateTextWidth: Boolean
        /**
         * Returns whether the `GtkText` will grow and shrink
         * with the content.
         *
         * @return true if @self will propagate the text width
         */
        get() = gtk_text_get_propagate_text_width(gtkTextPointer).asBoolean()

        /**
         * Sets whether the `GtkText` should grow and shrink with the content.
         *
         * @param propagateTextWidth true to propagate the text width
         */
        set(propagateTextWidth) = gtk_text_set_propagate_text_width(gtkTextPointer, propagateTextWidth.asGBoolean())

    /**
     * A list of tabstops to apply to the text of the `GtkText`.
     */
    public open var tabs: TabArray?
        /**
         * Gets the tabstops that were set on the `GtkText`.
         *
         * See [method@Gtk.Text.set_tabs].
         *
         * @return the tabstops
         */
        get() = gtk_text_get_tabs(gtkTextPointer)?.run {
            TabArray(this)
        }

        /**
         * Sets tabstops that are applied to the text.
         *
         * @param tabs a `PangoTabArray`
         */
        set(tabs) = gtk_text_set_tabs(gtkTextPointer, tabs?.pangoTabArrayPointer)

    /**
     * When true, pasted multi-line text is truncated to the first line.
     */
    public open var truncateMultiline: Boolean
        /**
         * Returns whether the `GtkText` will truncate multi-line text
         * that is pasted into the widget
         *
         * @return true if @self will truncate multi-line text
         */
        get() = gtk_text_get_truncate_multiline(gtkTextPointer).asBoolean()

        /**
         * Sets whether the `GtkText` should truncate multi-line text
         * that is pasted into the widget.
         *
         * @param truncateMultiline true to truncate multi-line text
         */
        set(truncateMultiline) = gtk_text_set_truncate_multiline(gtkTextPointer, truncateMultiline.asGBoolean())

    /**
     * If false, the text is masked with the “invisible char”.
     */
    public open var visibility: Boolean
        /**
         * Retrieves whether the text in @self is visible.
         *
         * @return true if the text is currently visible
         */
        get() = gtk_text_get_visibility(gtkTextPointer).asBoolean()

        /**
         * Sets whether the contents of the `GtkText` are visible or not.
         *
         * When visibility is set to false, characters are displayed
         * as the invisible char, and will also appear that way when
         * the text in the widget is copied to the clipboard.
         *
         * By default, GTK picks the best invisible character available
         * in the current font, but it can be changed with
         * [method@Gtk.Text.set_invisible_char].
         *
         * Note that you probably want to set [property@Gtk.Text:input-purpose]
         * to %GTK_INPUT_PURPOSE_PASSWORD or %GTK_INPUT_PURPOSE_PIN to
         * inform input methods about the purpose of this self,
         * in addition to setting visibility to false.
         *
         * @param visible true if the contents of the `GtkText` are displayed
         *   as plaintext
         */
        set(visible) = gtk_text_set_visibility(gtkTextPointer, visible.asGBoolean())

    /**
     * Creates a new `GtkText`.
     *
     * @return a new `GtkText`.
     */
    public constructor() : this(gtk_text_new()!!.reinterpret())

    /**
     * Creates a new `GtkText` with the specified text buffer.
     *
     * @param buffer The buffer to use for the new `GtkText`.
     * @return a new `GtkText`
     */
    public constructor(
        buffer: EntryBuffer,
    ) : this(gtk_text_new_with_buffer(buffer.gtkEntryBufferPointer)!!.reinterpret())

    /**
     * Determine the positions of the strong and weak cursors if the
     * insertion point in the layout is at @position.
     *
     * The position of each cursor is stored as a zero-width rectangle.
     * The strong cursor location is the location where characters of
     * the directionality equal to the base direction are inserted.
     * The weak cursor location is the location where characters of
     * the directionality opposite to the base direction are inserted.
     *
     * The rectangle positions are in widget coordinates.
     *
     * @param position the character position
     * @param strong location to store the strong cursor position
     * @param weak location to store the weak cursor position
     * @since 4.4
     */
    @GtkVersion4_4
    public open fun computeCursorExtents(position: gsize, strong: Rect?, weak: Rect?): Unit =
        gtk_text_compute_cursor_extents(
            gtkTextPointer,
            position,
            strong?.grapheneRectPointer,
            weak?.grapheneRectPointer
        )

    /**
     * Retrieves the current length of the text in @self.
     *
     * This is equivalent to getting @self's `GtkEntryBuffer`
     * and calling [method@Gtk.EntryBuffer.get_length] on it.
     *
     * @return the current number of characters
     *   in `GtkText`, or 0 if there are none.
     */
    public open fun getTextLength(): guint16 = gtk_text_get_text_length(gtkTextPointer)

    /**
     * Causes @self to have keyboard focus.
     *
     * It behaves like [method@Gtk.Widget.grab_focus],
     * except that it doesn't select the contents of @self.
     * You only want to call this on some special entries
     * which the user usually doesn't want to replace all text in,
     * such as search-as-you-type entries.
     *
     * @return true if focus is now inside @self
     */
    public open fun grabFocusWithoutSelecting(): Boolean =
        gtk_text_grab_focus_without_selecting(gtkTextPointer).asBoolean()

    /**
     * Unsets the invisible char.
     *
     * After calling this, the default invisible
     * char is used again.
     */
    public open fun unsetInvisibleChar(): Unit = gtk_text_unset_invisible_char(gtkTextPointer)

    /**
     * Emitted when the user hits the <kbd>Enter</kbd> key.
     *
     * The default bindings for this signal are all forms
     * of the <kbd>Enter</kbd> key.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkTextPointer,
            "activate",
            onActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate" signal. See [onActivate].
     */
    public fun emitActivate() {
        g_signal_emit_by_name(gtkTextPointer.reinterpret(), "activate")
    }

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * <kbd>Backspace</kbd> and <kbd>Shift</kbd>+<kbd>Backspace</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onBackspace(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkTextPointer,
            "backspace",
            onBackspaceFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "backspace" signal. See [onBackspace].
     */
    public fun emitBackspace() {
        g_signal_emit_by_name(gtkTextPointer.reinterpret(), "backspace")
    }

    /**
     * Emitted to copy the selection to the clipboard.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>+<kbd>c</kbd> and
     * <kbd>Ctrl</kbd>+<kbd>Insert</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onCopyClipboard(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkTextPointer,
            "copy-clipboard",
            onCopyClipboardFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "copy-clipboard" signal. See [onCopyClipboard].
     */
    public fun emitCopyClipboard() {
        g_signal_emit_by_name(gtkTextPointer.reinterpret(), "copy-clipboard")
    }

    /**
     * Emitted to cut the selection to the clipboard.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>+<kbd>x</kbd> and
     * <kbd>Shift</kbd>+<kbd>Delete</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onCutClipboard(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkTextPointer,
            "cut-clipboard",
            onCutClipboardFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "cut-clipboard" signal. See [onCutClipboard].
     */
    public fun emitCutClipboard() {
        g_signal_emit_by_name(gtkTextPointer.reinterpret(), "cut-clipboard")
    }

    /**
     * Emitted when the user initiates a text deletion.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * If the @type is %GTK_DELETE_CHARS, GTK deletes the selection
     * if there is one, otherwise it deletes the requested number
     * of characters.
     *
     * The default bindings for this signal are <kbd>Delete</kbd>
     * for deleting a character and <kbd>Ctrl</kbd>+<kbd>Delete</kbd>
     * for deleting a word.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `type` the granularity of the deletion, as a `GtkDeleteType`; `count` the number of @type units to delete
     */
    public fun onDeleteFromCursor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (type: DeleteType, count: gint) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkTextPointer,
        "delete-from-cursor",
        onDeleteFromCursorFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "delete-from-cursor" signal. See [onDeleteFromCursor].
     *
     * @param type the granularity of the deletion, as a `GtkDeleteType`
     * @param count the number of @type units to delete
     */
    public fun emitDeleteFromCursor(type: DeleteType, count: gint) {
        g_signal_emit_by_name(gtkTextPointer.reinterpret(), "delete-from-cursor", type.nativeValue, count)
    }

    /**
     * Emitted when the user initiates the insertion of a
     * fixed string at the cursor.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This signal has no default bindings.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `string` the string to insert
     */
    public fun onInsertAtCursor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (string: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkTextPointer,
        "insert-at-cursor",
        onInsertAtCursorFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "insert-at-cursor" signal. See [onInsertAtCursor].
     *
     * @param string the string to insert
     */
    public fun emitInsertAtCursor(string: String) {
        g_signal_emit_by_name(gtkTextPointer.reinterpret(), "insert-at-cursor", string.cstr)
    }

    /**
     * Emitted to present the Emoji chooser for the widget.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>+<kbd>.</kbd> and
     * <kbd>Ctrl</kbd>+<kbd>;</kbd>
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onInsertEmoji(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkTextPointer,
            "insert-emoji",
            onInsertEmojiFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "insert-emoji" signal. See [onInsertEmoji].
     */
    public fun emitInsertEmoji() {
        g_signal_emit_by_name(gtkTextPointer.reinterpret(), "insert-emoji")
    }

    /**
     * Emitted when the user initiates a cursor movement.
     *
     * If the cursor is not visible in @self, this signal causes
     * the viewport to be moved instead.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     *
     * The default bindings for this signal come in two variants,
     * the variant with the <kbd>Shift</kbd> modifier extends the
     * selection, the variant without it does not.
     * There are too many key combinations to list them all here.
     *
     * - <kbd>←</kbd>, <kbd>→</kbd>, <kbd>↑</kbd>, <kbd>↓</kbd>
     *   move by individual characters/lines
     * - <kbd>Ctrl</kbd>+<kbd>←</kbd>, etc. move by words/paragraphs
     * - <kbd>Home</kbd> and <kbd>End</kbd> move to the ends of the buffer
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `step` the granularity of the move, as a `GtkMovementStep`; `count` the number of @step units to move; `extend` true if the move should extend the selection
     */
    public fun onMoveCursor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            step: MovementStep,
            count: gint,
            extend: Boolean,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkTextPointer,
        "move-cursor",
        onMoveCursorFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "move-cursor" signal. See [onMoveCursor].
     *
     * @param step the granularity of the move, as a `GtkMovementStep`
     * @param count the number of @step units to move
     * @param extend true if the move should extend the selection
     */
    public fun emitMoveCursor(step: MovementStep, count: gint, extend: Boolean) {
        g_signal_emit_by_name(gtkTextPointer.reinterpret(), "move-cursor", step.nativeValue, count, extend.asGBoolean())
    }

    /**
     * Emitted to paste the contents of the clipboard.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>+<kbd>v</kbd> and <kbd>Shift</kbd>+<kbd>Insert</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onPasteClipboard(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkTextPointer,
            "paste-clipboard",
            onPasteClipboardFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "paste-clipboard" signal. See [onPasteClipboard].
     */
    public fun emitPasteClipboard() {
        g_signal_emit_by_name(gtkTextPointer.reinterpret(), "paste-clipboard")
    }

    /**
     * Emitted when the preedit text changes.
     *
     * If an input method is used, the typed text will not immediately
     * be committed to the buffer. So if you are interested in the text,
     * connect to this signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `preedit` the current preedit string
     */
    public fun onPreeditChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (preedit: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkTextPointer,
        "preedit-changed",
        onPreeditChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "preedit-changed" signal. See [onPreeditChanged].
     *
     * @param preedit the current preedit string
     */
    public fun emitPreeditChanged(preedit: String) {
        g_signal_emit_by_name(gtkTextPointer.reinterpret(), "preedit-changed", preedit.cstr)
    }

    /**
     * Emitted to toggle the overwrite mode of the `GtkText`.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal is <kbd>Insert</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onToggleOverwrite(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkTextPointer,
            "toggle-overwrite",
            onToggleOverwriteFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "toggle-overwrite" signal. See [onToggleOverwrite].
     */
    public fun emitToggleOverwrite() {
        g_signal_emit_by_name(gtkTextPointer.reinterpret(), "toggle-overwrite")
    }

    public companion object : TypeCompanion<Text> {
        override val type: GeneratedClassKGType<Text> =
            GeneratedClassKGType(gtk_text_get_type()) { Text(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Text
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_get_type()
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onBackspaceFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onCopyClipboardFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onCutClipboardFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onDeleteFromCursorFunc: CPointer<CFunction<(GtkDeleteType, gint) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            type: GtkDeleteType,
            count: gint,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(type: DeleteType, count: gint) -> Unit>().get().invoke(
            type.run {
                DeleteType.fromNativeValue(this)
            },
            count
        )
    }
        .reinterpret()

private val onInsertAtCursorFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            string: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(string: String) -> Unit>().get().invoke(
            string?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

private val onInsertEmojiFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onMoveCursorFunc: CPointer<
    CFunction<
        (
            GtkMovementStep,
            gint,
            gboolean,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        step: GtkMovementStep,
        count: gint,
        extend: gboolean,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            step: MovementStep,
            count: gint,
            extend: Boolean,
        ) -> Unit
        >().get().invoke(
        step.run {
            MovementStep.fromNativeValue(this)
        },
        count,
        extend.asBoolean()
    )
}
    .reinterpret()

private val onPasteClipboardFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onPreeditChangedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            preedit: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(preedit: String) -> Unit>().get().invoke(
            preedit?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

private val onToggleOverwriteFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
