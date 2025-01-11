// This is a generated file. Do not modify.
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
import org.gtkkn.bindings.gdk.Event
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_4
import org.gtkkn.bindings.pango.Context
import org.gtkkn.bindings.pango.TabArray
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAccessibleText
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkDeleteType
import org.gtkkn.native.gtk.GtkMovementStep
import org.gtkkn.native.gtk.GtkScrollStep
import org.gtkkn.native.gtk.GtkScrollable
import org.gtkkn.native.gtk.GtkTextExtendSelection
import org.gtkkn.native.gtk.GtkTextIter
import org.gtkkn.native.gtk.GtkTextView
import org.gtkkn.native.gtk.gtk_text_view_add_child_at_anchor
import org.gtkkn.native.gtk.gtk_text_view_add_overlay
import org.gtkkn.native.gtk.gtk_text_view_backward_display_line
import org.gtkkn.native.gtk.gtk_text_view_backward_display_line_start
import org.gtkkn.native.gtk.gtk_text_view_forward_display_line
import org.gtkkn.native.gtk.gtk_text_view_forward_display_line_end
import org.gtkkn.native.gtk.gtk_text_view_get_accepts_tab
import org.gtkkn.native.gtk.gtk_text_view_get_bottom_margin
import org.gtkkn.native.gtk.gtk_text_view_get_buffer
import org.gtkkn.native.gtk.gtk_text_view_get_cursor_locations
import org.gtkkn.native.gtk.gtk_text_view_get_cursor_visible
import org.gtkkn.native.gtk.gtk_text_view_get_editable
import org.gtkkn.native.gtk.gtk_text_view_get_extra_menu
import org.gtkkn.native.gtk.gtk_text_view_get_gutter
import org.gtkkn.native.gtk.gtk_text_view_get_indent
import org.gtkkn.native.gtk.gtk_text_view_get_input_hints
import org.gtkkn.native.gtk.gtk_text_view_get_input_purpose
import org.gtkkn.native.gtk.gtk_text_view_get_iter_at_location
import org.gtkkn.native.gtk.gtk_text_view_get_iter_location
import org.gtkkn.native.gtk.gtk_text_view_get_justification
import org.gtkkn.native.gtk.gtk_text_view_get_left_margin
import org.gtkkn.native.gtk.gtk_text_view_get_ltr_context
import org.gtkkn.native.gtk.gtk_text_view_get_monospace
import org.gtkkn.native.gtk.gtk_text_view_get_overwrite
import org.gtkkn.native.gtk.gtk_text_view_get_pixels_above_lines
import org.gtkkn.native.gtk.gtk_text_view_get_pixels_below_lines
import org.gtkkn.native.gtk.gtk_text_view_get_pixels_inside_wrap
import org.gtkkn.native.gtk.gtk_text_view_get_right_margin
import org.gtkkn.native.gtk.gtk_text_view_get_rtl_context
import org.gtkkn.native.gtk.gtk_text_view_get_tabs
import org.gtkkn.native.gtk.gtk_text_view_get_top_margin
import org.gtkkn.native.gtk.gtk_text_view_get_type
import org.gtkkn.native.gtk.gtk_text_view_get_visible_rect
import org.gtkkn.native.gtk.gtk_text_view_get_wrap_mode
import org.gtkkn.native.gtk.gtk_text_view_im_context_filter_keypress
import org.gtkkn.native.gtk.gtk_text_view_move_mark_onscreen
import org.gtkkn.native.gtk.gtk_text_view_move_overlay
import org.gtkkn.native.gtk.gtk_text_view_move_visually
import org.gtkkn.native.gtk.gtk_text_view_new
import org.gtkkn.native.gtk.gtk_text_view_new_with_buffer
import org.gtkkn.native.gtk.gtk_text_view_place_cursor_onscreen
import org.gtkkn.native.gtk.gtk_text_view_remove
import org.gtkkn.native.gtk.gtk_text_view_reset_cursor_blink
import org.gtkkn.native.gtk.gtk_text_view_reset_im_context
import org.gtkkn.native.gtk.gtk_text_view_scroll_mark_onscreen
import org.gtkkn.native.gtk.gtk_text_view_scroll_to_iter
import org.gtkkn.native.gtk.gtk_text_view_scroll_to_mark
import org.gtkkn.native.gtk.gtk_text_view_set_accepts_tab
import org.gtkkn.native.gtk.gtk_text_view_set_bottom_margin
import org.gtkkn.native.gtk.gtk_text_view_set_buffer
import org.gtkkn.native.gtk.gtk_text_view_set_cursor_visible
import org.gtkkn.native.gtk.gtk_text_view_set_editable
import org.gtkkn.native.gtk.gtk_text_view_set_extra_menu
import org.gtkkn.native.gtk.gtk_text_view_set_gutter
import org.gtkkn.native.gtk.gtk_text_view_set_indent
import org.gtkkn.native.gtk.gtk_text_view_set_input_hints
import org.gtkkn.native.gtk.gtk_text_view_set_input_purpose
import org.gtkkn.native.gtk.gtk_text_view_set_justification
import org.gtkkn.native.gtk.gtk_text_view_set_left_margin
import org.gtkkn.native.gtk.gtk_text_view_set_monospace
import org.gtkkn.native.gtk.gtk_text_view_set_overwrite
import org.gtkkn.native.gtk.gtk_text_view_set_pixels_above_lines
import org.gtkkn.native.gtk.gtk_text_view_set_pixels_below_lines
import org.gtkkn.native.gtk.gtk_text_view_set_pixels_inside_wrap
import org.gtkkn.native.gtk.gtk_text_view_set_right_margin
import org.gtkkn.native.gtk.gtk_text_view_set_tabs
import org.gtkkn.native.gtk.gtk_text_view_set_top_margin
import org.gtkkn.native.gtk.gtk_text_view_set_wrap_mode
import org.gtkkn.native.gtk.gtk_text_view_starts_display_line
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A widget that displays the contents of a [class@Gtk.TextBuffer].
 *
 * ![An example GtkTextview](multiline-text.png)
 *
 * You may wish to begin by reading the [conceptual overview](section-text-widget.html),
 * which gives an overview of all the objects and data types related to the
 * text widget and how they work together.
 *
 * ## CSS nodes
 *
 * ```
 * textview.view
 * ├── border.top
 * ├── border.left
 * ├── text
 * │   ╰── [selection]
 * ├── border.right
 * ├── border.bottom
 * ╰── [window.popup]
 * ```
 *
 * `GtkTextView` has a main css node with name textview and style class .view,
 * and subnodes for each of the border windows, and the main text area,
 * with names border and text, respectively. The border nodes each get
 * one of the style classes .left, .right, .top or .bottom.
 *
 * A node representing the selection will appear below the text node.
 *
 * If a context menu is opened, the window node will appear as a subnode
 * of the main node.
 *
 * ## Accessibility
 *
 * `GtkTextView` uses the %GTK_ACCESSIBLE_ROLE_TEXT_BOX role.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `window_x`: window_x: Out parameter is not supported
 * - parameter `trailing`: trailing: Out parameter is not supported
 * - parameter `line_top`: line_top: Out parameter is not supported
 * - parameter `y`: y: Out parameter is not supported
 * - parameter `buffer_x`: buffer_x: Out parameter is not supported
 * - method `buffer`: Property TypeInfo of getter and setter do not match
 * - method `extra-menu`: Property TypeInfo of getter and setter do not match
 * - method `im-module`: Property has no getter nor setter
 * - method `tabs`: Property TypeInfo of getter and setter do not match
 */
public open class TextView(public val gtkTextViewPointer: CPointer<GtkTextView>) :
    Widget(gtkTextViewPointer.reinterpret()),
    AccessibleText,
    Scrollable,
    KGTyped {
    override val gtkAccessibleTextPointer: CPointer<GtkAccessibleText>
        get() = handle.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether Tab will result in a tab character being entered.
     */
    public open var acceptsTab: Boolean
        /**
         * Returns whether pressing the <kbd>Tab</kbd> key inserts a tab characters.
         *
         * See [method@Gtk.TextView.set_accepts_tab].
         *
         * @return true if pressing the Tab key inserts a tab character,
         *   false if pressing the Tab key moves the keyboard focus.
         */
        get() = gtk_text_view_get_accepts_tab(gtkTextViewPointer).asBoolean()

        /**
         * Sets the behavior of the text widget when the <kbd>Tab</kbd> key is pressed.
         *
         * If @accepts_tab is true, a tab character is inserted. If @accepts_tab
         * is false the keyboard focus is moved to the next widget in the focus
         * chain.
         *
         * Focus can always be moved using <kbd>Ctrl</kbd>+<kbd>Tab</kbd>.
         *
         * @param acceptsTab true if pressing the Tab key should insert a tab
         *    character, false, if pressing the Tab key should move the
         *    keyboard focus.
         */
        set(acceptsTab) = gtk_text_view_set_accepts_tab(gtkTextViewPointer, acceptsTab.asGBoolean())

    /**
     * The bottom margin for text in the text view.
     *
     * Note that this property is confusingly named. In CSS terms,
     * the value set here is padding, and it is applied in addition
     * to the padding from the theme.
     *
     * Don't confuse this property with [property@Gtk.Widget:margin-bottom].
     */
    public open var bottomMargin: gint
        /**
         * Gets the bottom margin for text in the @text_view.
         *
         * @return bottom margin in pixels
         */
        get() = gtk_text_view_get_bottom_margin(gtkTextViewPointer)

        /**
         * Sets the bottom margin for text in @text_view.
         *
         * Note that this function is confusingly named.
         * In CSS terms, the value set here is padding.
         *
         * @param bottomMargin bottom margin in pixels
         */
        set(bottomMargin) = gtk_text_view_set_bottom_margin(gtkTextViewPointer, bottomMargin)

    /**
     * If the insertion cursor is shown.
     */
    public open var cursorVisible: Boolean
        /**
         * Find out whether the cursor should be displayed.
         *
         * @return whether the insertion mark is visible
         */
        get() = gtk_text_view_get_cursor_visible(gtkTextViewPointer).asBoolean()

        /**
         * Toggles whether the insertion point should be displayed.
         *
         * A buffer with no editable text probably shouldn’t have a visible
         * cursor, so you may want to turn the cursor off.
         *
         * Note that this property may be overridden by the
         * [property@Gtk.Settings:gtk-keynav-use-caret] setting.
         *
         * @param setting whether to show the insertion cursor
         */
        set(setting) = gtk_text_view_set_cursor_visible(gtkTextViewPointer, setting.asGBoolean())

    public open var editable: Boolean
        /**
         * Returns the default editability of the `GtkTextView`.
         *
         * Tags in the buffer may override this setting for some ranges of text.
         *
         * @return whether text is editable by default
         */
        get() = gtk_text_view_get_editable(gtkTextViewPointer).asBoolean()

        /**
         * Sets the default editability of the `GtkTextView`.
         *
         * You can override this default setting with tags in the buffer,
         * using the “editable” attribute of tags.
         *
         * @param setting whether it’s editable
         */
        set(setting) = gtk_text_view_set_editable(gtkTextViewPointer, setting.asGBoolean())

    /**
     * Amount to indent the paragraph, in pixels.
     *
     * A negative value of indent will produce a hanging indentation.
     * That is, the first line will have the full width, and subsequent
     * lines will be indented by the absolute value of indent.
     */
    public open var indent: gint
        /**
         * Gets the default indentation of paragraphs in @text_view.
         *
         * Tags in the view’s buffer may override the default.
         * The indentation may be negative.
         *
         * @return number of pixels of indentation
         */
        get() = gtk_text_view_get_indent(gtkTextViewPointer)

        /**
         * Sets the default indentation for paragraphs in @text_view.
         *
         * Tags in the buffer may override the default.
         *
         * @param indent indentation in pixels
         */
        set(indent) = gtk_text_view_set_indent(gtkTextViewPointer, indent)

    /**
     * Additional hints (beyond [property@Gtk.TextView:input-purpose])
     * that allow input methods to fine-tune their behaviour.
     */
    public open var inputHints: InputHints
        /**
         * Gets the `input-hints` of the `GtkTextView`.
         */
        get() = gtk_text_view_get_input_hints(gtkTextViewPointer).run {
            InputHints(this)
        }

        /**
         * Sets the `input-hints` of the `GtkTextView`.
         *
         * The `input-hints` allow input methods to fine-tune
         * their behaviour.
         *
         * @param hints the hints
         */
        set(hints) = gtk_text_view_set_input_hints(gtkTextViewPointer, hints.mask)

    /**
     * The purpose of this text field.
     *
     * This property can be used by on-screen keyboards and other input
     * methods to adjust their behaviour.
     */
    public open var inputPurpose: InputPurpose
        /**
         * Gets the `input-purpose` of the `GtkTextView`.
         */
        get() = gtk_text_view_get_input_purpose(gtkTextViewPointer).run {
            InputPurpose.fromNativeValue(this)
        }

        /**
         * Sets the `input-purpose` of the `GtkTextView`.
         *
         * The `input-purpose` can be used by on-screen keyboards
         * and other input methods to adjust their behaviour.
         *
         * @param purpose the purpose
         */
        set(purpose) = gtk_text_view_set_input_purpose(gtkTextViewPointer, purpose.nativeValue)

    public open var justification: Justification
        /**
         * Gets the default justification of paragraphs in @text_view.
         *
         * Tags in the buffer may override the default.
         *
         * @return default justification
         */
        get() = gtk_text_view_get_justification(gtkTextViewPointer).run {
            Justification.fromNativeValue(this)
        }

        /**
         * Sets the default justification of text in @text_view.
         *
         * Tags in the view’s buffer may override the default.
         *
         * @param justification justification
         */
        set(justification) = gtk_text_view_set_justification(gtkTextViewPointer, justification.nativeValue)

    /**
     * The default left margin for text in the text view.
     *
     * Tags in the buffer may override the default.
     *
     * Note that this property is confusingly named. In CSS terms,
     * the value set here is padding, and it is applied in addition
     * to the padding from the theme.
     */
    public open var leftMargin: gint
        /**
         * Gets the default left margin size of paragraphs in the @text_view.
         *
         * Tags in the buffer may override the default.
         *
         * @return left margin in pixels
         */
        get() = gtk_text_view_get_left_margin(gtkTextViewPointer)

        /**
         * Sets the default left margin for text in @text_view.
         *
         * Tags in the buffer may override the default.
         *
         * Note that this function is confusingly named.
         * In CSS terms, the value set here is padding.
         *
         * @param leftMargin left margin in pixels
         */
        set(leftMargin) = gtk_text_view_set_left_margin(gtkTextViewPointer, leftMargin)

    /**
     * Whether text should be displayed in a monospace font.
     *
     * If true, set the .monospace style class on the
     * text view to indicate that a monospace font is desired.
     */
    public open var monospace: Boolean
        /**
         * Gets whether the `GtkTextView` uses monospace styling.
         *
         * @return true if monospace fonts are desired
         */
        get() = gtk_text_view_get_monospace(gtkTextViewPointer).asBoolean()

        /**
         * Sets whether the `GtkTextView` should display text in
         * monospace styling.
         *
         * @param monospace true to request monospace styling
         */
        set(monospace) = gtk_text_view_set_monospace(gtkTextViewPointer, monospace.asGBoolean())

    /**
     * Whether entered text overwrites existing contents.
     */
    public open var overwrite: Boolean
        /**
         * Returns whether the `GtkTextView` is in overwrite mode or not.
         *
         * @return whether @text_view is in overwrite mode or not.
         */
        get() = gtk_text_view_get_overwrite(gtkTextViewPointer).asBoolean()

        /**
         * Changes the `GtkTextView` overwrite mode.
         *
         * @param overwrite true to turn on overwrite mode, false to turn it off
         */
        set(overwrite) = gtk_text_view_set_overwrite(gtkTextViewPointer, overwrite.asGBoolean())

    public open var pixelsAboveLines: gint
        /**
         * Gets the default number of pixels to put above paragraphs.
         *
         * Adding this function with [method@Gtk.TextView.get_pixels_below_lines]
         * is equal to the line space between each paragraph.
         *
         * @return default number of pixels above paragraphs
         */
        get() = gtk_text_view_get_pixels_above_lines(gtkTextViewPointer)

        /**
         * Sets the default number of blank pixels above paragraphs in @text_view.
         *
         * Tags in the buffer for @text_view may override the defaults.
         *
         * @param pixelsAboveLines pixels above paragraphs
         */
        set(pixelsAboveLines) = gtk_text_view_set_pixels_above_lines(gtkTextViewPointer, pixelsAboveLines)

    public open var pixelsBelowLines: gint
        /**
         * Gets the default number of pixels to put below paragraphs.
         *
         * The line space is the sum of the value returned by this function and
         * the value returned by [method@Gtk.TextView.get_pixels_above_lines].
         *
         * @return default number of blank pixels below paragraphs
         */
        get() = gtk_text_view_get_pixels_below_lines(gtkTextViewPointer)

        /**
         * Sets the default number of pixels of blank space
         * to put below paragraphs in @text_view.
         *
         * May be overridden by tags applied to @text_view’s buffer.
         *
         * @param pixelsBelowLines pixels below paragraphs
         */
        set(pixelsBelowLines) = gtk_text_view_set_pixels_below_lines(gtkTextViewPointer, pixelsBelowLines)

    public open var pixelsInsideWrap: gint
        /**
         * Gets the default number of pixels to put between wrapped lines
         * inside a paragraph.
         *
         * @return default number of pixels of blank space between wrapped lines
         */
        get() = gtk_text_view_get_pixels_inside_wrap(gtkTextViewPointer)

        /**
         * Sets the default number of pixels of blank space to leave between
         * display/wrapped lines within a paragraph.
         *
         * May be overridden by tags in @text_view’s buffer.
         *
         * @param pixelsInsideWrap default number of pixels between wrapped lines
         */
        set(pixelsInsideWrap) = gtk_text_view_set_pixels_inside_wrap(gtkTextViewPointer, pixelsInsideWrap)

    /**
     * The default right margin for text in the text view.
     *
     * Tags in the buffer may override the default.
     *
     * Note that this property is confusingly named. In CSS terms,
     * the value set here is padding, and it is applied in addition
     * to the padding from the theme.
     */
    public open var rightMargin: gint
        /**
         * Gets the default right margin for text in @text_view.
         *
         * Tags in the buffer may override the default.
         *
         * @return right margin in pixels
         */
        get() = gtk_text_view_get_right_margin(gtkTextViewPointer)

        /**
         * Sets the default right margin for text in the text view.
         *
         * Tags in the buffer may override the default.
         *
         * Note that this function is confusingly named.
         * In CSS terms, the value set here is padding.
         *
         * @param rightMargin right margin in pixels
         */
        set(rightMargin) = gtk_text_view_set_right_margin(gtkTextViewPointer, rightMargin)

    /**
     * The top margin for text in the text view.
     *
     * Note that this property is confusingly named. In CSS terms,
     * the value set here is padding, and it is applied in addition
     * to the padding from the theme.
     *
     * Don't confuse this property with [property@Gtk.Widget:margin-top].
     */
    public open var topMargin: gint
        /**
         * Gets the top margin for text in the @text_view.
         *
         * @return top margin in pixels
         */
        get() = gtk_text_view_get_top_margin(gtkTextViewPointer)

        /**
         * Sets the top margin for text in @text_view.
         *
         * Note that this function is confusingly named.
         * In CSS terms, the value set here is padding.
         *
         * @param topMargin top margin in pixels
         */
        set(topMargin) = gtk_text_view_set_top_margin(gtkTextViewPointer, topMargin)

    public open var wrapMode: WrapMode
        /**
         * Gets the line wrapping for the view.
         *
         * @return the line wrap setting
         */
        get() = gtk_text_view_get_wrap_mode(gtkTextViewPointer).run {
            WrapMode.fromNativeValue(this)
        }

        /**
         * Sets the line wrapping for the view.
         *
         * @param wrapMode a `GtkWrapMode`
         */
        set(wrapMode) = gtk_text_view_set_wrap_mode(gtkTextViewPointer, wrapMode.nativeValue)

    /**
     * Creates a new `GtkTextView`.
     *
     * If you don’t call [method@Gtk.TextView.set_buffer] before using the
     * text view, an empty default buffer will be created for you. Get the
     * buffer with [method@Gtk.TextView.get_buffer]. If you want to specify
     * your own buffer, consider [ctor@Gtk.TextView.new_with_buffer].
     *
     * @return a new `GtkTextView`
     */
    public constructor() : this(gtk_text_view_new()!!.reinterpret())

    /**
     * Creates a new `GtkTextView` widget displaying the buffer @buffer.
     *
     * One buffer can be shared among many widgets. @buffer may be null
     * to create a default buffer, in which case this function is equivalent
     * to [ctor@Gtk.TextView.new]. The text view adds its own reference count
     * to the buffer; it does not take over an existing reference.
     *
     * @param buffer a `GtkTextBuffer`
     * @return a new `GtkTextView`.
     */
    public constructor(
        buffer: TextBuffer,
    ) : this(gtk_text_view_new_with_buffer(buffer.gtkTextBufferPointer)!!.reinterpret())

    /**
     * Adds a child widget in the text buffer, at the given @anchor.
     *
     * @param child a `GtkWidget`
     * @param anchor a `GtkTextChildAnchor` in the `GtkTextBuffer` for @text_view
     */
    public open fun addChildAtAnchor(child: Widget, anchor: TextChildAnchor): Unit =
        gtk_text_view_add_child_at_anchor(gtkTextViewPointer, child.gtkWidgetPointer, anchor.gtkTextChildAnchorPointer)

    /**
     * Adds @child at a fixed coordinate in the `GtkTextView`'s text window.
     *
     * The @xpos and @ypos must be in buffer coordinates (see
     * [method@Gtk.TextView.get_iter_location] to convert to
     * buffer coordinates).
     *
     * @child will scroll with the text view.
     *
     * If instead you want a widget that will not move with the
     * `GtkTextView` contents see `GtkOverlay`.
     *
     * @param child a `GtkWidget`
     * @param xpos X position of child in window coordinates
     * @param ypos Y position of child in window coordinates
     */
    public open fun addOverlay(child: Widget, xpos: gint, ypos: gint): Unit =
        gtk_text_view_add_overlay(gtkTextViewPointer, child.gtkWidgetPointer, xpos, ypos)

    /**
     * Moves the given @iter backward by one display (wrapped) line.
     *
     * A display line is different from a paragraph. Paragraphs are
     * separated by newlines or other paragraph separator characters.
     * Display lines are created by line-wrapping a paragraph. If
     * wrapping is turned off, display lines and paragraphs will be the
     * same. Display lines are divided differently for each view, since
     * they depend on the view’s width; paragraphs are the same in all
     * views, since they depend on the contents of the `GtkTextBuffer`.
     *
     * @param iter a `GtkTextIter`
     * @return true if @iter was moved and is not on the end iterator
     */
    public open fun backwardDisplayLine(iter: TextIter): Boolean =
        gtk_text_view_backward_display_line(gtkTextViewPointer, iter.gtkTextIterPointer).asBoolean()

    /**
     * Moves the given @iter backward to the next display line start.
     *
     * A display line is different from a paragraph. Paragraphs are
     * separated by newlines or other paragraph separator characters.
     * Display lines are created by line-wrapping a paragraph. If
     * wrapping is turned off, display lines and paragraphs will be the
     * same. Display lines are divided differently for each view, since
     * they depend on the view’s width; paragraphs are the same in all
     * views, since they depend on the contents of the `GtkTextBuffer`.
     *
     * @param iter a `GtkTextIter`
     * @return true if @iter was moved and is not on the end iterator
     */
    public open fun backwardDisplayLineStart(iter: TextIter): Boolean =
        gtk_text_view_backward_display_line_start(gtkTextViewPointer, iter.gtkTextIterPointer).asBoolean()

    /**
     * Moves the given @iter forward by one display (wrapped) line.
     *
     * A display line is different from a paragraph. Paragraphs are
     * separated by newlines or other paragraph separator characters.
     * Display lines are created by line-wrapping a paragraph. If
     * wrapping is turned off, display lines and paragraphs will be the
     * same. Display lines are divided differently for each view, since
     * they depend on the view’s width; paragraphs are the same in all
     * views, since they depend on the contents of the `GtkTextBuffer`.
     *
     * @param iter a `GtkTextIter`
     * @return true if @iter was moved and is not on the end iterator
     */
    public open fun forwardDisplayLine(iter: TextIter): Boolean =
        gtk_text_view_forward_display_line(gtkTextViewPointer, iter.gtkTextIterPointer).asBoolean()

    /**
     * Moves the given @iter forward to the next display line end.
     *
     * A display line is different from a paragraph. Paragraphs are
     * separated by newlines or other paragraph separator characters.
     * Display lines are created by line-wrapping a paragraph. If
     * wrapping is turned off, display lines and paragraphs will be the
     * same. Display lines are divided differently for each view, since
     * they depend on the view’s width; paragraphs are the same in all
     * views, since they depend on the contents of the `GtkTextBuffer`.
     *
     * @param iter a `GtkTextIter`
     * @return true if @iter was moved and is not on the end iterator
     */
    public open fun forwardDisplayLineEnd(iter: TextIter): Boolean =
        gtk_text_view_forward_display_line_end(gtkTextViewPointer, iter.gtkTextIterPointer).asBoolean()

    /**
     * Returns the `GtkTextBuffer` being displayed by this text view.
     *
     * The reference count on the buffer is not incremented; the caller
     * of this function won’t own a new reference.
     *
     * @return a `GtkTextBuffer`
     */
    public open fun getBuffer(): TextBuffer = gtk_text_view_get_buffer(gtkTextViewPointer)!!.run {
        TextBuffer(this)
    }

    /**
     * Determine the positions of the strong and weak cursors if the
     * insertion point is at @iter.
     *
     * The position of each cursor is stored as a zero-width rectangle.
     * The strong cursor location is the location where characters of
     * the directionality equal to the base direction of the paragraph
     * are inserted. The weak cursor location is the location where
     * characters of the directionality opposite to the base direction
     * of the paragraph are inserted.
     *
     * If @iter is null, the actual cursor position is used.
     *
     * Note that if @iter happens to be the actual cursor position, and
     * there is currently an IM preedit sequence being entered, the
     * returned locations will be adjusted to account for the preedit
     * cursor’s offset within the preedit sequence.
     *
     * The rectangle position is in buffer coordinates; use
     * [method@Gtk.TextView.buffer_to_window_coords] to convert these
     * coordinates to coordinates for one of the windows in the text view.
     *
     * @param iter a `GtkTextIter`
     * @param strong location to store the strong cursor position
     * @param weak location to store the weak cursor position
     */
    public open fun getCursorLocations(iter: TextIter? = null, strong: Rectangle?, weak: Rectangle?): Unit =
        gtk_text_view_get_cursor_locations(
            gtkTextViewPointer,
            iter?.gtkTextIterPointer,
            strong?.gdkRectanglePointer,
            weak?.gdkRectanglePointer
        )

    /**
     * Gets the menu model that gets added to the context menu
     * or null if none has been set.
     *
     * @return the menu model
     */
    public open fun getExtraMenu(): MenuModel = gtk_text_view_get_extra_menu(gtkTextViewPointer)!!.run {
        MenuModel.MenuModelImpl(this)
    }

    /**
     * Gets a `GtkWidget` that has previously been set as gutter.
     *
     * See [method@Gtk.TextView.set_gutter].
     *
     * @win must be one of %GTK_TEXT_WINDOW_LEFT, %GTK_TEXT_WINDOW_RIGHT,
     * %GTK_TEXT_WINDOW_TOP, or %GTK_TEXT_WINDOW_BOTTOM.
     *
     * @param win a `GtkTextWindowType`
     * @return a `GtkWidget`
     */
    public open fun getGutter(win: TextWindowType): Widget? =
        gtk_text_view_get_gutter(gtkTextViewPointer, win.nativeValue)?.run {
            Widget.WidgetImpl(this)
        }

    /**
     * Retrieves the iterator at buffer coordinates @x and @y.
     *
     * Buffer coordinates are coordinates for the entire buffer, not just
     * the currently-displayed portion. If you have coordinates from an
     * event, you have to convert those to buffer coordinates with
     * [method@Gtk.TextView.window_to_buffer_coords].
     *
     * @param iter a `GtkTextIter`
     * @param x x position, in buffer coordinates
     * @param y y position, in buffer coordinates
     * @return true if the position is over text
     */
    public open fun getIterAtLocation(iter: TextIter, x: gint, y: gint): Boolean =
        gtk_text_view_get_iter_at_location(gtkTextViewPointer, iter.gtkTextIterPointer, x, y).asBoolean()

    /**
     * Gets a rectangle which roughly contains the character at @iter.
     *
     * The rectangle position is in buffer coordinates; use
     * [method@Gtk.TextView.buffer_to_window_coords] to convert these
     * coordinates to coordinates for one of the windows in the text view.
     *
     * @param iter a `GtkTextIter`
     * @param location bounds of the character at @iter
     */
    public open fun getIterLocation(iter: TextIter, location: Rectangle): Unit =
        gtk_text_view_get_iter_location(gtkTextViewPointer, iter.gtkTextIterPointer, location.gdkRectanglePointer)

    /**
     * Gets the `PangoContext` that is used for rendering LTR directed
     * text layouts.
     *
     * The context may be replaced when CSS changes occur.
     *
     * @return a `PangoContext`
     * @since 4.4
     */
    @GtkVersion4_4
    public open fun getLtrContext(): Context = gtk_text_view_get_ltr_context(gtkTextViewPointer)!!.run {
        Context(this)
    }

    /**
     * Gets the `PangoContext` that is used for rendering RTL directed
     * text layouts.
     *
     * The context may be replaced when CSS changes occur.
     *
     * @return a `PangoContext`
     * @since 4.4
     */
    @GtkVersion4_4
    public open fun getRtlContext(): Context = gtk_text_view_get_rtl_context(gtkTextViewPointer)!!.run {
        Context(this)
    }

    /**
     * Gets the default tabs for @text_view.
     *
     * Tags in the buffer may override the defaults. The returned array
     * will be null if “standard” (8-space) tabs are used. Free the
     * return value with [method@Pango.TabArray.free].
     *
     * @return copy of default tab array,
     *   or null if standard tabs are used; must be freed with
     *   [method@Pango.TabArray.free].
     */
    public open fun getTabs(): TabArray? = gtk_text_view_get_tabs(gtkTextViewPointer)?.run {
        TabArray(this)
    }

    /**
     * Fills @visible_rect with the currently-visible
     * region of the buffer, in buffer coordinates.
     *
     * Convert to window coordinates with
     * [method@Gtk.TextView.buffer_to_window_coords].
     *
     * @param visibleRect rectangle to fill
     */
    public open fun getVisibleRect(visibleRect: Rectangle): Unit =
        gtk_text_view_get_visible_rect(gtkTextViewPointer, visibleRect.gdkRectanglePointer)

    /**
     * Allow the `GtkTextView` input method to internally handle key press
     * and release events.
     *
     * If this function returns true, then no further processing should be
     * done for this key event. See [method@Gtk.IMContext.filter_keypress].
     *
     * Note that you are expected to call this function from your handler
     * when overriding key event handling. This is needed in the case when
     * you need to insert your own key handling between the input method
     * and the default key event handling of the `GtkTextView`.
     *
     * ```c
     * static gboolean
     * gtk_foo_bar_key_press_event (GtkWidget *widget,
     *                              GdkEvent  *event)
     * {
     *   guint keyval;
     *
     *   gdk_event_get_keyval ((GdkEvent*)event, &keyval);
     *
     *   if (keyval == GDK_KEY_Return || keyval == GDK_KEY_KP_Enter)
     *     {
     *       if (gtk_text_view_im_context_filter_keypress (GTK_TEXT_VIEW (widget), event))
     *         return TRUE;
     *     }
     *
     *   // Do some stuff
     *
     *   return GTK_WIDGET_CLASS (gtk_foo_bar_parent_class)->key_press_event (widget, event);
     * }
     * ```
     *
     * @param event the key event
     * @return true if the input method handled the key event.
     */
    public open fun imContextFilterKeypress(event: Event): Boolean =
        gtk_text_view_im_context_filter_keypress(gtkTextViewPointer, event.gdkEventPointer).asBoolean()

    /**
     * Moves a mark within the buffer so that it's
     * located within the currently-visible text area.
     *
     * @param mark a `GtkTextMark`
     * @return true if the mark moved (wasn’t already onscreen)
     */
    public open fun moveMarkOnscreen(mark: TextMark): Boolean =
        gtk_text_view_move_mark_onscreen(gtkTextViewPointer, mark.gtkTextMarkPointer).asBoolean()

    /**
     * Updates the position of a child.
     *
     * See [method@Gtk.TextView.add_overlay].
     *
     * @param child a widget already added with [method@Gtk.TextView.add_overlay]
     * @param xpos new X position in buffer coordinates
     * @param ypos new Y position in buffer coordinates
     */
    public open fun moveOverlay(child: Widget, xpos: gint, ypos: gint): Unit =
        gtk_text_view_move_overlay(gtkTextViewPointer, child.gtkWidgetPointer, xpos, ypos)

    /**
     * Move the iterator a given number of characters visually, treating
     * it as the strong cursor position.
     *
     * If @count is positive, then the new strong cursor position will
     * be @count positions to the right of the old cursor position.
     * If @count is negative then the new strong cursor position will
     * be @count positions to the left of the old cursor position.
     *
     * In the presence of bi-directional text, the correspondence
     * between logical and visual order will depend on the direction
     * of the current run, and there may be jumps when the cursor
     * is moved off of the end of a run.
     *
     * @param iter a `GtkTextIter`
     * @param count number of characters to move (negative moves left,
     *    positive moves right)
     * @return true if @iter moved and is not on the end iterator
     */
    public open fun moveVisually(iter: TextIter, count: gint): Boolean =
        gtk_text_view_move_visually(gtkTextViewPointer, iter.gtkTextIterPointer, count).asBoolean()

    /**
     * Moves the cursor to the currently visible region of the
     * buffer.
     *
     * @return true if the cursor had to be moved.
     */
    public open fun placeCursorOnscreen(): Boolean = gtk_text_view_place_cursor_onscreen(gtkTextViewPointer).asBoolean()

    /**
     * Removes a child widget from @text_view.
     *
     * @param child the child to remove
     */
    public open fun remove(child: Widget): Unit = gtk_text_view_remove(gtkTextViewPointer, child.gtkWidgetPointer)

    /**
     * Ensures that the cursor is shown.
     *
     * This also resets the time that it will stay blinking (or
     * visible, in case blinking is disabled).
     *
     * This function should be called in response to user input
     * (e.g. from derived classes that override the textview's
     * event handlers).
     */
    public open fun resetCursorBlink(): Unit = gtk_text_view_reset_cursor_blink(gtkTextViewPointer)

    /**
     * Reset the input method context of the text view if needed.
     *
     * This can be necessary in the case where modifying the buffer
     * would confuse on-going input method behavior.
     */
    public open fun resetImContext(): Unit = gtk_text_view_reset_im_context(gtkTextViewPointer)

    /**
     * Scrolls @text_view the minimum distance such that @mark is contained
     * within the visible area of the widget.
     *
     * @param mark a mark in the buffer for @text_view
     */
    public open fun scrollMarkOnscreen(mark: TextMark): Unit =
        gtk_text_view_scroll_mark_onscreen(gtkTextViewPointer, mark.gtkTextMarkPointer)

    /**
     * Scrolls @text_view so that @iter is on the screen in the position
     * indicated by @xalign and @yalign.
     *
     * An alignment of 0.0 indicates left or top, 1.0 indicates right or
     * bottom, 0.5 means center. If @use_align is false, the text scrolls
     * the minimal distance to get the mark onscreen, possibly not scrolling
     * at all. The effective screen for purposes of this function is reduced
     * by a margin of size @within_margin.
     *
     * Note that this function uses the currently-computed height of the
     * lines in the text buffer. Line heights are computed in an idle
     * handler; so this function may not have the desired effect if it’s
     * called before the height computations. To avoid oddness, consider
     * using [method@Gtk.TextView.scroll_to_mark] which saves a point to be
     * scrolled to after line validation.
     *
     * @param iter a `GtkTextIter`
     * @param withinMargin margin as a [0.0,0.5) fraction of screen size
     * @param useAlign whether to use alignment arguments (if false,
     *    just get the mark onscreen)
     * @param xalign horizontal alignment of mark within visible area
     * @param yalign vertical alignment of mark within visible area
     * @return true if scrolling occurred
     */
    public open fun scrollToIter(
        iter: TextIter,
        withinMargin: gdouble,
        useAlign: Boolean,
        xalign: gdouble,
        yalign: gdouble,
    ): Boolean = gtk_text_view_scroll_to_iter(
        gtkTextViewPointer,
        iter.gtkTextIterPointer,
        withinMargin,
        useAlign.asGBoolean(),
        xalign,
        yalign
    ).asBoolean()

    /**
     * Scrolls @text_view so that @mark is on the screen in the position
     * indicated by @xalign and @yalign.
     *
     * An alignment of 0.0 indicates left or top, 1.0 indicates right or
     * bottom, 0.5 means center. If @use_align is false, the text scrolls
     * the minimal distance to get the mark onscreen, possibly not scrolling
     * at all. The effective screen for purposes of this function is reduced
     * by a margin of size @within_margin.
     *
     * @param mark a `GtkTextMark`
     * @param withinMargin margin as a [0.0,0.5) fraction of screen size
     * @param useAlign whether to use alignment arguments (if false, just
     *    get the mark onscreen)
     * @param xalign horizontal alignment of mark within visible area
     * @param yalign vertical alignment of mark within visible area
     */
    public open fun scrollToMark(
        mark: TextMark,
        withinMargin: gdouble,
        useAlign: Boolean,
        xalign: gdouble,
        yalign: gdouble,
    ): Unit = gtk_text_view_scroll_to_mark(
        gtkTextViewPointer,
        mark.gtkTextMarkPointer,
        withinMargin,
        useAlign.asGBoolean(),
        xalign,
        yalign
    )

    /**
     * Sets @buffer as the buffer being displayed by @text_view.
     *
     * The previous buffer displayed by the text view is unreferenced, and
     * a reference is added to @buffer. If you owned a reference to @buffer
     * before passing it to this function, you must remove that reference
     * yourself; `GtkTextView` will not “adopt” it.
     *
     * @param buffer a `GtkTextBuffer`
     */
    public open fun setBuffer(buffer: TextBuffer? = null): Unit =
        gtk_text_view_set_buffer(gtkTextViewPointer, buffer?.gtkTextBufferPointer)

    /**
     * Sets a menu model to add when constructing the context
     * menu for @text_view.
     *
     * You can pass null to remove a previously set extra menu.
     *
     * @param model a `GMenuModel`
     */
    public open fun setExtraMenu(model: MenuModel? = null): Unit =
        gtk_text_view_set_extra_menu(gtkTextViewPointer, model?.gioMenuModelPointer)

    /**
     * Places @widget into the gutter specified by @win.
     *
     * @win must be one of %GTK_TEXT_WINDOW_LEFT, %GTK_TEXT_WINDOW_RIGHT,
     * %GTK_TEXT_WINDOW_TOP, or %GTK_TEXT_WINDOW_BOTTOM.
     *
     * @param win a `GtkTextWindowType`
     * @param widget a `GtkWidget`
     */
    public open fun setGutter(win: TextWindowType, widget: Widget? = null): Unit =
        gtk_text_view_set_gutter(gtkTextViewPointer, win.nativeValue, widget?.gtkWidgetPointer)

    /**
     * Sets the default tab stops for paragraphs in @text_view.
     *
     * Tags in the buffer may override the default.
     *
     * @param tabs tabs as a `PangoTabArray`
     */
    public open fun setTabs(tabs: TabArray): Unit =
        gtk_text_view_set_tabs(gtkTextViewPointer, tabs.pangoTabArrayPointer)

    /**
     * Determines whether @iter is at the start of a display line.
     *
     * See [method@Gtk.TextView.forward_display_line] for an
     * explanation of display lines vs. paragraphs.
     *
     * @param iter a `GtkTextIter`
     * @return true if @iter begins a wrapped line
     */
    public open fun startsDisplayLine(iter: TextIter): Boolean =
        gtk_text_view_starts_display_line(gtkTextViewPointer, iter.gtkTextIterPointer).asBoolean()

    /**
     * Gets emitted when the user asks for it.
     *
     * The ::backspace signal is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * <kbd>Backspace</kbd> and <kbd>Shift</kbd>+<kbd>Backspace</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onBackspace(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkTextViewPointer,
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
        g_signal_emit_by_name(gtkTextViewPointer.reinterpret(), "backspace")
    }

    /**
     * Gets emitted to copy the selection to the clipboard.
     *
     * The ::copy-clipboard signal is a [keybinding signal](class.SignalAction.html).
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
            gtkTextViewPointer,
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
        g_signal_emit_by_name(gtkTextViewPointer.reinterpret(), "copy-clipboard")
    }

    /**
     * Gets emitted to cut the selection to the clipboard.
     *
     * The ::cut-clipboard signal is a [keybinding signal](class.SignalAction.html).
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
            gtkTextViewPointer,
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
        g_signal_emit_by_name(gtkTextViewPointer.reinterpret(), "cut-clipboard")
    }

    /**
     * Gets emitted when the user initiates a text deletion.
     *
     * The ::delete-from-cursor signal is a [keybinding signal](class.SignalAction.html).
     *
     * If the @type is %GTK_DELETE_CHARS, GTK deletes the selection
     * if there is one, otherwise it deletes the requested number
     * of characters.
     *
     * The default bindings for this signal are <kbd>Delete</kbd> for
     * deleting a character, <kbd>Ctrl</kbd>+<kbd>Delete</kbd> for
     * deleting a word and <kbd>Ctrl</kbd>+<kbd>Backspace</kbd> for
     * deleting a word backwards.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `type` the granularity of the deletion, as a `GtkDeleteType`; `count` the number of @type units to delete
     */
    public fun onDeleteFromCursor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (type: DeleteType, count: gint) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkTextViewPointer,
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
        g_signal_emit_by_name(gtkTextViewPointer.reinterpret(), "delete-from-cursor", type.nativeValue, count)
    }

    /**
     * Emitted when the selection needs to be extended at @location.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `granularity` the granularity type; `location` the location where to extend the selection; `start` where the selection should start; `end` where the selection should end. Returns %GDK_EVENT_STOP to stop other handlers from being invoked for the
     *   event. %GDK_EVENT_PROPAGATE to propagate the event further.
     */
    public fun onExtendSelection(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            granularity: TextExtendSelection,
            location: TextIter,
            start: TextIter,
            end: TextIter,
        ) -> Boolean,
    ): ULong = g_signal_connect_data(
        gtkTextViewPointer,
        "extend-selection",
        onExtendSelectionFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Gets emitted when the user initiates the insertion of a
     * fixed string at the cursor.
     *
     * The ::insert-at-cursor signal is a [keybinding signal](class.SignalAction.html).
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
        gtkTextViewPointer,
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
        g_signal_emit_by_name(gtkTextViewPointer.reinterpret(), "insert-at-cursor", string.cstr)
    }

    /**
     * Gets emitted to present the Emoji chooser for the @text_view.
     *
     * The ::insert-emoji signal is a [keybinding signal](class.SignalAction.html).
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
            gtkTextViewPointer,
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
        g_signal_emit_by_name(gtkTextViewPointer.reinterpret(), "insert-emoji")
    }

    /**
     * Gets emitted when the user initiates a cursor movement.
     *
     * The ::move-cursor signal is a [keybinding signal](class.SignalAction.html).
     * If the cursor is not visible in @text_view, this signal causes
     * the viewport to be moved instead.
     *
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     *
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
     * - <kbd>PgUp</kbd> and <kbd>PgDn</kbd> move vertically by pages
     * - <kbd>Ctrl</kbd>+<kbd>PgUp</kbd> and <kbd>Ctrl</kbd>+<kbd>PgDn</kbd>
     *   move horizontally by pages
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `step` the granularity of the move, as a `GtkMovementStep`; `count` the number of @step units to move; `extendSelection` true if the move should extend the selection
     */
    public fun onMoveCursor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            step: MovementStep,
            count: gint,
            extendSelection: Boolean,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkTextViewPointer,
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
     * @param extendSelection true if the move should extend the selection
     */
    public fun emitMoveCursor(step: MovementStep, count: gint, extendSelection: Boolean) {
        g_signal_emit_by_name(
            gtkTextViewPointer.reinterpret(),
            "move-cursor",
            step.nativeValue,
            count,
            extendSelection.asGBoolean()
        )
    }

    /**
     * Gets emitted to move the viewport.
     *
     * The ::move-viewport signal is a [keybinding signal](class.SignalAction.html),
     * which can be bound to key combinations to allow the user to move the viewport,
     * i.e. change what part of the text view is visible in a containing scrolled
     * window.
     *
     * There are no default bindings for this signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `step` the granularity of the movement, as a `GtkScrollStep`; `count` the number of @step units to move
     */
    public fun onMoveViewport(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (step: ScrollStep, count: gint) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkTextViewPointer,
        "move-viewport",
        onMoveViewportFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "move-viewport" signal. See [onMoveViewport].
     *
     * @param step the granularity of the movement, as a `GtkScrollStep`
     * @param count the number of @step units to move
     */
    public fun emitMoveViewport(step: ScrollStep, count: gint) {
        g_signal_emit_by_name(gtkTextViewPointer.reinterpret(), "move-viewport", step.nativeValue, count)
    }

    /**
     * Gets emitted to paste the contents of the clipboard
     * into the text view.
     *
     * The ::paste-clipboard signal is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>+<kbd>v</kbd> and
     * <kbd>Shift</kbd>+<kbd>Insert</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onPasteClipboard(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkTextViewPointer,
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
        g_signal_emit_by_name(gtkTextViewPointer.reinterpret(), "paste-clipboard")
    }

    /**
     * Emitted when preedit text of the active IM changes.
     *
     * If an input method is used, the typed text will not immediately
     * be committed to the buffer. So if you are interested in the text,
     * connect to this signal.
     *
     * This signal is only emitted if the text at the given position
     * is actually editable.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `preedit` the current preedit string
     */
    public fun onPreeditChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (preedit: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkTextViewPointer,
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
        g_signal_emit_by_name(gtkTextViewPointer.reinterpret(), "preedit-changed", preedit.cstr)
    }

    /**
     * Gets emitted to select or unselect the complete contents of the text view.
     *
     * The ::select-all signal is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>+<kbd>a</kbd> and
     * <kbd>Ctrl</kbd>+<kbd>/</kbd> for selecting and
     * <kbd>Shift</kbd>+<kbd>Ctrl</kbd>+<kbd>a</kbd> and
     * <kbd>Ctrl</kbd>+<kbd>\</kbd> for unselecting.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `select` true to select, false to unselect
     */
    public fun onSelectAll(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (select: Boolean) -> Unit): ULong =
        g_signal_connect_data(
            gtkTextViewPointer,
            "select-all",
            onSelectAllFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "select-all" signal. See [onSelectAll].
     *
     * @param select true to select, false to unselect
     */
    public fun emitSelectAll(select: Boolean) {
        g_signal_emit_by_name(gtkTextViewPointer.reinterpret(), "select-all", select.asGBoolean())
    }

    /**
     * Gets emitted when the user initiates settings the "anchor" mark.
     *
     * The ::set-anchor signal is a [keybinding signal](class.SignalAction.html)
     * which gets emitted when the user initiates setting the "anchor"
     * mark. The "anchor" mark gets placed at the same position as the
     * "insert" mark.
     *
     * This signal has no default bindings.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onSetAnchor(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkTextViewPointer,
            "set-anchor",
            onSetAnchorFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "set-anchor" signal. See [onSetAnchor].
     */
    public fun emitSetAnchor() {
        g_signal_emit_by_name(gtkTextViewPointer.reinterpret(), "set-anchor")
    }

    /**
     * Gets emitted to toggle the `cursor-visible` property.
     *
     * The ::toggle-cursor-visible signal is a
     * [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is <kbd>F7</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onToggleCursorVisible(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkTextViewPointer,
            "toggle-cursor-visible",
            onToggleCursorVisibleFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "toggle-cursor-visible" signal. See [onToggleCursorVisible].
     */
    public fun emitToggleCursorVisible() {
        g_signal_emit_by_name(gtkTextViewPointer.reinterpret(), "toggle-cursor-visible")
    }

    /**
     * Gets emitted to toggle the overwrite mode of the text view.
     *
     * The ::toggle-overwrite signal is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is <kbd>Insert</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onToggleOverwrite(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkTextViewPointer,
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
        g_signal_emit_by_name(gtkTextViewPointer.reinterpret(), "toggle-overwrite")
    }

    public companion object : TypeCompanion<TextView> {
        override val type: GeneratedClassKGType<TextView> =
            GeneratedClassKGType(gtk_text_view_get_type()) { TextView(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TextView
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_view_get_type()
    }
}

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

private val onExtendSelectionFunc: CPointer<
    CFunction<
        (
            GtkTextExtendSelection,
            CPointer<GtkTextIter>,
            CPointer<GtkTextIter>,
            CPointer<GtkTextIter>,
        ) -> gboolean
        >
    > = staticCFunction {
        _: COpaquePointer,
        granularity: GtkTextExtendSelection,
        location: CPointer<GtkTextIter>?,
        start: CPointer<GtkTextIter>?,
        end: CPointer<GtkTextIter>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            granularity: TextExtendSelection,
            location: TextIter,
            start: TextIter,
            end: TextIter,
        ) -> Boolean
        >().get().invoke(
        granularity.run {
            TextExtendSelection.fromNativeValue(this)
        },
        location!!.run {
            TextIter(this)
        },
        start!!.run {
            TextIter(this)
        },
        end!!.run {
            TextIter(this)
        }
    ).asGBoolean()
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
        extendSelection: gboolean,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            step: MovementStep,
            count: gint,
            extendSelection: Boolean,
        ) -> Unit
        >().get().invoke(
        step.run {
            MovementStep.fromNativeValue(this)
        },
        count,
        extendSelection.asBoolean()
    )
}
    .reinterpret()

private val onMoveViewportFunc: CPointer<CFunction<(GtkScrollStep, gint) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            step: GtkScrollStep,
            count: gint,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(step: ScrollStep, count: gint) -> Unit>().get().invoke(
            step.run {
                ScrollStep.fromNativeValue(this)
            },
            count
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

private val onSelectAllFunc: CPointer<CFunction<(gboolean) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        select: gboolean,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(select: Boolean) -> Unit>().get().invoke(select.asBoolean())
}
    .reinterpret()

private val onSetAnchorFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onToggleCursorVisibleFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onToggleOverwriteFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
