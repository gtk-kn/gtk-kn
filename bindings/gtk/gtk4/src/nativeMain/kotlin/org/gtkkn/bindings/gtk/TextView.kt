// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Event
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.pango.TabArray
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
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
import org.gtkkn.native.gtk.gtk_text_view_get_monospace
import org.gtkkn.native.gtk.gtk_text_view_get_overwrite
import org.gtkkn.native.gtk.gtk_text_view_get_pixels_above_lines
import org.gtkkn.native.gtk.gtk_text_view_get_pixels_below_lines
import org.gtkkn.native.gtk.gtk_text_view_get_pixels_inside_wrap
import org.gtkkn.native.gtk.gtk_text_view_get_right_margin
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
import kotlin.Double
import kotlin.Int
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
 * - method `get_ltr_context`: C function gtk_text_view_get_ltr_context is ignored
 * - method `get_rtl_context`: C function gtk_text_view_get_rtl_context is ignored
 * - parameter `buffer_x`: buffer_x: Out parameter is not supported
 * - method `buffer`: Property TypeInfo of getter and setter do not match
 * - method `extra-menu`: Property TypeInfo of getter and setter do not match
 * - method `im-module`: Property has no getter nor setter
 * - method `tabs`: Property TypeInfo of getter and setter do not match
 */
public open class TextView(
    pointer: CPointer<GtkTextView>,
) : Widget(pointer.reinterpret()), Scrollable, KGTyped {
    public val gtkTextViewPointer: CPointer<GtkTextView>
        get() = gPointer.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

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
        get() = gtk_text_view_get_accepts_tab(gtkTextViewPointer.reinterpret()).asBoolean()

        /**
         * Sets the behavior of the text widget when the <kbd>Tab</kbd> key is pressed.
         *
         * If @accepts_tab is true, a tab character is inserted. If @accepts_tab
         * is false the keyboard focus is moved to the next widget in the focus
         * chain.
         *
         * @param acceptsTab true if pressing the Tab key should insert a tab
         *    character, false, if pressing the Tab key should move the
         *    keyboard focus.
         */
        set(acceptsTab) =
            gtk_text_view_set_accepts_tab(
                gtkTextViewPointer.reinterpret(),
                acceptsTab.asGBoolean()
            )

    /**
     * The bottom margin for text in the text view.
     *
     * Note that this property is confusingly named. In CSS terms,
     * the value set here is padding, and it is applied in addition
     * to the padding from the theme.
     *
     * Don't confuse this property with [property@Gtk.Widget:margin-bottom].
     */
    public open var bottomMargin: Int
        /**
         * Gets the bottom margin for text in the @text_view.
         *
         * @return bottom margin in pixels
         */
        get() = gtk_text_view_get_bottom_margin(gtkTextViewPointer.reinterpret())

        /**
         * Sets the bottom margin for text in @text_view.
         *
         * Note that this function is confusingly named.
         * In CSS terms, the value set here is padding.
         *
         * @param bottomMargin bottom margin in pixels
         */
        set(bottomMargin) =
            gtk_text_view_set_bottom_margin(
                gtkTextViewPointer.reinterpret(),
                bottomMargin
            )

    /**
     * If the insertion cursor is shown.
     */
    public open var cursorVisible: Boolean
        /**
         * Find out whether the cursor should be displayed.
         *
         * @return whether the insertion mark is visible
         */
        get() = gtk_text_view_get_cursor_visible(gtkTextViewPointer.reinterpret()).asBoolean()

        /**
         * Toggles whether the insertion point should be displayed.
         *
         * A buffer with no editable text probably shouldn’t have a visible
         * cursor, so you may want to turn the cursor off.
         *
         * Note that this property may be overridden by the
         * [property@GtkSettings:gtk-keynav-use-caret] setting.
         *
         * @param setting whether to show the insertion cursor
         */
        set(setting) =
            gtk_text_view_set_cursor_visible(
                gtkTextViewPointer.reinterpret(),
                setting.asGBoolean()
            )

    public open var editable: Boolean
        /**
         * Returns the default editability of the `GtkTextView`.
         *
         * Tags in the buffer may override this setting for some ranges of text.
         *
         * @return whether text is editable by default
         */
        get() = gtk_text_view_get_editable(gtkTextViewPointer.reinterpret()).asBoolean()

        /**
         * Sets the default editability of the `GtkTextView`.
         *
         * You can override this default setting with tags in the buffer,
         * using the “editable” attribute of tags.
         *
         * @param setting whether it’s editable
         */
        set(setting) =
            gtk_text_view_set_editable(
                gtkTextViewPointer.reinterpret(),
                setting.asGBoolean()
            )

    /**
     * Amount to indent the paragraph, in pixels.
     */
    public open var indent: Int
        /**
         * Gets the default indentation of paragraphs in @text_view.
         *
         * Tags in the view’s buffer may override the default.
         * The indentation may be negative.
         *
         * @return number of pixels of indentation
         */
        get() = gtk_text_view_get_indent(gtkTextViewPointer.reinterpret())

        /**
         * Sets the default indentation for paragraphs in @text_view.
         *
         * Tags in the buffer may override the default.
         *
         * @param indent indentation in pixels
         */
        set(indent) = gtk_text_view_set_indent(gtkTextViewPointer.reinterpret(), indent)

    /**
     * Additional hints (beyond [property@Gtk.TextView:input-purpose])
     * that allow input methods to fine-tune their behaviour.
     */
    public open var inputHints: InputHints
        /**
         * Gets the `input-hints` of the `GtkTextView`.
         */
        get() =
            gtk_text_view_get_input_hints(gtkTextViewPointer.reinterpret()).run {
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
        set(hints) = gtk_text_view_set_input_hints(gtkTextViewPointer.reinterpret(), hints.mask)

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
        get() =
            gtk_text_view_get_input_purpose(gtkTextViewPointer.reinterpret()).run {
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
        set(purpose) =
            gtk_text_view_set_input_purpose(
                gtkTextViewPointer.reinterpret(),
                purpose.nativeValue
            )

    public open var justification: Justification
        /**
         * Gets the default justification of paragraphs in @text_view.
         *
         * Tags in the buffer may override the default.
         *
         * @return default justification
         */
        get() =
            gtk_text_view_get_justification(gtkTextViewPointer.reinterpret()).run {
                Justification.fromNativeValue(this)
            }

        /**
         * Sets the default justification of text in @text_view.
         *
         * Tags in the view’s buffer may override the default.
         *
         * @param justification justification
         */
        set(justification) =
            gtk_text_view_set_justification(
                gtkTextViewPointer.reinterpret(),
                justification.nativeValue
            )

    /**
     * The default left margin for text in the text view.
     *
     * Tags in the buffer may override the default.
     *
     * Note that this property is confusingly named. In CSS terms,
     * the value set here is padding, and it is applied in addition
     * to the padding from the theme.
     */
    public open var leftMargin: Int
        /**
         * Gets the default left margin size of paragraphs in the @text_view.
         *
         * Tags in the buffer may override the default.
         *
         * @return left margin in pixels
         */
        get() = gtk_text_view_get_left_margin(gtkTextViewPointer.reinterpret())

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
        set(leftMargin) =
            gtk_text_view_set_left_margin(
                gtkTextViewPointer.reinterpret(),
                leftMargin
            )

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
        get() = gtk_text_view_get_monospace(gtkTextViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the `GtkTextView` should display text in
         * monospace styling.
         *
         * @param monospace true to request monospace styling
         */
        set(monospace) =
            gtk_text_view_set_monospace(
                gtkTextViewPointer.reinterpret(),
                monospace.asGBoolean()
            )

    /**
     * Whether entered text overwrites existing contents.
     */
    public open var overwrite: Boolean
        /**
         * Returns whether the `GtkTextView` is in overwrite mode or not.
         *
         * @return whether @text_view is in overwrite mode or not.
         */
        get() = gtk_text_view_get_overwrite(gtkTextViewPointer.reinterpret()).asBoolean()

        /**
         * Changes the `GtkTextView` overwrite mode.
         *
         * @param overwrite true to turn on overwrite mode, false to turn it off
         */
        set(overwrite) =
            gtk_text_view_set_overwrite(
                gtkTextViewPointer.reinterpret(),
                overwrite.asGBoolean()
            )

    public open var pixelsAboveLines: Int
        /**
         * Gets the default number of pixels to put above paragraphs.
         *
         * Adding this function with [method@Gtk.TextView.get_pixels_below_lines]
         * is equal to the line space between each paragraph.
         *
         * @return default number of pixels above paragraphs
         */
        get() = gtk_text_view_get_pixels_above_lines(gtkTextViewPointer.reinterpret())

        /**
         * Sets the default number of blank pixels above paragraphs in @text_view.
         *
         * Tags in the buffer for @text_view may override the defaults.
         *
         * @param pixelsAboveLines pixels above paragraphs
         */
        set(pixelsAboveLines) =
            gtk_text_view_set_pixels_above_lines(
                gtkTextViewPointer.reinterpret(),
                pixelsAboveLines
            )

    public open var pixelsBelowLines: Int
        /**
         * Gets the default number of pixels to put below paragraphs.
         *
         * The line space is the sum of the value returned by this function and
         * the value returned by [method@Gtk.TextView.get_pixels_above_lines].
         *
         * @return default number of blank pixels below paragraphs
         */
        get() = gtk_text_view_get_pixels_below_lines(gtkTextViewPointer.reinterpret())

        /**
         * Sets the default number of pixels of blank space
         * to put below paragraphs in @text_view.
         *
         * May be overridden by tags applied to @text_view’s buffer.
         *
         * @param pixelsBelowLines pixels below paragraphs
         */
        set(pixelsBelowLines) =
            gtk_text_view_set_pixels_below_lines(
                gtkTextViewPointer.reinterpret(),
                pixelsBelowLines
            )

    public open var pixelsInsideWrap: Int
        /**
         * Gets the default number of pixels to put between wrapped lines
         * inside a paragraph.
         *
         * @return default number of pixels of blank space between wrapped lines
         */
        get() = gtk_text_view_get_pixels_inside_wrap(gtkTextViewPointer.reinterpret())

        /**
         * Sets the default number of pixels of blank space to leave between
         * display/wrapped lines within a paragraph.
         *
         * May be overridden by tags in @text_view’s buffer.
         *
         * @param pixelsInsideWrap default number of pixels between wrapped lines
         */
        set(pixelsInsideWrap) =
            gtk_text_view_set_pixels_inside_wrap(
                gtkTextViewPointer.reinterpret(),
                pixelsInsideWrap
            )

    /**
     * The default right margin for text in the text view.
     *
     * Tags in the buffer may override the default.
     *
     * Note that this property is confusingly named. In CSS terms,
     * the value set here is padding, and it is applied in addition
     * to the padding from the theme.
     */
    public open var rightMargin: Int
        /**
         * Gets the default right margin for text in @text_view.
         *
         * Tags in the buffer may override the default.
         *
         * @return right margin in pixels
         */
        get() = gtk_text_view_get_right_margin(gtkTextViewPointer.reinterpret())

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
        set(rightMargin) =
            gtk_text_view_set_right_margin(
                gtkTextViewPointer.reinterpret(),
                rightMargin
            )

    /**
     * The top margin for text in the text view.
     *
     * Note that this property is confusingly named. In CSS terms,
     * the value set here is padding, and it is applied in addition
     * to the padding from the theme.
     *
     * Don't confuse this property with [property@Gtk.Widget:margin-top].
     */
    public open var topMargin: Int
        /**
         * Gets the top margin for text in the @text_view.
         *
         * @return top margin in pixels
         */
        get() = gtk_text_view_get_top_margin(gtkTextViewPointer.reinterpret())

        /**
         * Sets the top margin for text in @text_view.
         *
         * Note that this function is confusingly named.
         * In CSS terms, the value set here is padding.
         *
         * @param topMargin top margin in pixels
         */
        set(topMargin) = gtk_text_view_set_top_margin(gtkTextViewPointer.reinterpret(), topMargin)

    public open var wrapMode: WrapMode
        /**
         * Gets the line wrapping for the view.
         *
         * @return the line wrap setting
         */
        get() =
            gtk_text_view_get_wrap_mode(gtkTextViewPointer.reinterpret()).run {
                WrapMode.fromNativeValue(this)
            }

        /**
         * Sets the line wrapping for the view.
         *
         * @param wrapMode a `GtkWrapMode`
         */
        set(wrapMode) =
            gtk_text_view_set_wrap_mode(
                gtkTextViewPointer.reinterpret(),
                wrapMode.nativeValue
            )

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
    public constructor(buffer: TextBuffer) :
        this(gtk_text_view_new_with_buffer(buffer.gtkTextBufferPointer.reinterpret())!!.reinterpret())

    /**
     * Adds a child widget in the text buffer, at the given @anchor.
     *
     * @param child a `GtkWidget`
     * @param anchor a `GtkTextChildAnchor` in the `GtkTextBuffer` for @text_view
     */
    public open fun addChildAtAnchor(
        child: Widget,
        anchor: TextChildAnchor,
    ): Unit =
        gtk_text_view_add_child_at_anchor(
            gtkTextViewPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret(),
            anchor.gtkTextChildAnchorPointer.reinterpret()
        )

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
    public open fun addOverlay(
        child: Widget,
        xpos: Int,
        ypos: Int,
    ): Unit =
        gtk_text_view_add_overlay(
            gtkTextViewPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret(),
            xpos,
            ypos
        )

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
        gtk_text_view_backward_display_line(
            gtkTextViewPointer.reinterpret(),
            iter.gtkTextIterPointer
        ).asBoolean()

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
        gtk_text_view_backward_display_line_start(
            gtkTextViewPointer.reinterpret(),
            iter.gtkTextIterPointer
        ).asBoolean()

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
        gtk_text_view_forward_display_line(
            gtkTextViewPointer.reinterpret(),
            iter.gtkTextIterPointer
        ).asBoolean()

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
        gtk_text_view_forward_display_line_end(
            gtkTextViewPointer.reinterpret(),
            iter.gtkTextIterPointer
        ).asBoolean()

    /**
     * Returns whether pressing the <kbd>Tab</kbd> key inserts a tab characters.
     *
     * See [method@Gtk.TextView.set_accepts_tab].
     *
     * @return true if pressing the Tab key inserts a tab character,
     *   false if pressing the Tab key moves the keyboard focus.
     */
    public open fun getAcceptsTab(): Boolean =
        gtk_text_view_get_accepts_tab(gtkTextViewPointer.reinterpret()).asBoolean()

    /**
     * Gets the bottom margin for text in the @text_view.
     *
     * @return bottom margin in pixels
     */
    public open fun getBottomMargin(): Int = gtk_text_view_get_bottom_margin(gtkTextViewPointer.reinterpret())

    /**
     * Returns the `GtkTextBuffer` being displayed by this text view.
     *
     * The reference count on the buffer is not incremented; the caller
     * of this function won’t own a new reference.
     *
     * @return a `GtkTextBuffer`
     */
    public open fun getBuffer(): TextBuffer =
        gtk_text_view_get_buffer(gtkTextViewPointer.reinterpret())!!.run {
            TextBuffer(reinterpret())
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
    public open fun getCursorLocations(
        iter: TextIter? = null,
        strong: Rectangle?,
        weak: Rectangle?,
    ): Unit =
        gtk_text_view_get_cursor_locations(
            gtkTextViewPointer.reinterpret(),
            iter?.gtkTextIterPointer,
            strong?.gdkRectanglePointer,
            weak?.gdkRectanglePointer
        )

    /**
     * Find out whether the cursor should be displayed.
     *
     * @return whether the insertion mark is visible
     */
    public open fun getCursorVisible(): Boolean =
        gtk_text_view_get_cursor_visible(gtkTextViewPointer.reinterpret()).asBoolean()

    /**
     * Returns the default editability of the `GtkTextView`.
     *
     * Tags in the buffer may override this setting for some ranges of text.
     *
     * @return whether text is editable by default
     */
    public open fun getEditable(): Boolean = gtk_text_view_get_editable(gtkTextViewPointer.reinterpret()).asBoolean()

    /**
     * Gets the menu model that gets added to the context menu
     * or null if none has been set.
     *
     * @return the menu model
     */
    public open fun getExtraMenu(): MenuModel =
        gtk_text_view_get_extra_menu(gtkTextViewPointer.reinterpret())!!.run {
            MenuModel(reinterpret())
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
        gtk_text_view_get_gutter(gtkTextViewPointer.reinterpret(), win.nativeValue)?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the default indentation of paragraphs in @text_view.
     *
     * Tags in the view’s buffer may override the default.
     * The indentation may be negative.
     *
     * @return number of pixels of indentation
     */
    public open fun getIndent(): Int = gtk_text_view_get_indent(gtkTextViewPointer.reinterpret())

    /**
     * Gets the `input-hints` of the `GtkTextView`.
     */
    public open fun getInputHints(): InputHints =
        gtk_text_view_get_input_hints(gtkTextViewPointer.reinterpret()).run {
            InputHints(this)
        }

    /**
     * Gets the `input-purpose` of the `GtkTextView`.
     */
    public open fun getInputPurpose(): InputPurpose =
        gtk_text_view_get_input_purpose(gtkTextViewPointer.reinterpret()).run {
            InputPurpose.fromNativeValue(this)
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
    public open fun getIterAtLocation(
        iter: TextIter,
        x: Int,
        y: Int,
    ): Boolean =
        gtk_text_view_get_iter_at_location(
            gtkTextViewPointer.reinterpret(),
            iter.gtkTextIterPointer,
            x,
            y
        ).asBoolean()

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
    public open fun getIterLocation(
        iter: TextIter,
        location: Rectangle,
    ): Unit =
        gtk_text_view_get_iter_location(
            gtkTextViewPointer.reinterpret(),
            iter.gtkTextIterPointer,
            location.gdkRectanglePointer
        )

    /**
     * Gets the default justification of paragraphs in @text_view.
     *
     * Tags in the buffer may override the default.
     *
     * @return default justification
     */
    public open fun getJustification(): Justification =
        gtk_text_view_get_justification(gtkTextViewPointer.reinterpret()).run {
            Justification.fromNativeValue(this)
        }

    /**
     * Gets the default left margin size of paragraphs in the @text_view.
     *
     * Tags in the buffer may override the default.
     *
     * @return left margin in pixels
     */
    public open fun getLeftMargin(): Int = gtk_text_view_get_left_margin(gtkTextViewPointer.reinterpret())

    /**
     * Gets whether the `GtkTextView` uses monospace styling.
     *
     * @return true if monospace fonts are desired
     */
    public open fun getMonospace(): Boolean = gtk_text_view_get_monospace(gtkTextViewPointer.reinterpret()).asBoolean()

    /**
     * Returns whether the `GtkTextView` is in overwrite mode or not.
     *
     * @return whether @text_view is in overwrite mode or not.
     */
    public open fun getOverwrite(): Boolean = gtk_text_view_get_overwrite(gtkTextViewPointer.reinterpret()).asBoolean()

    /**
     * Gets the default number of pixels to put above paragraphs.
     *
     * Adding this function with [method@Gtk.TextView.get_pixels_below_lines]
     * is equal to the line space between each paragraph.
     *
     * @return default number of pixels above paragraphs
     */
    public open fun getPixelsAboveLines(): Int = gtk_text_view_get_pixels_above_lines(gtkTextViewPointer.reinterpret())

    /**
     * Gets the default number of pixels to put below paragraphs.
     *
     * The line space is the sum of the value returned by this function and
     * the value returned by [method@Gtk.TextView.get_pixels_above_lines].
     *
     * @return default number of blank pixels below paragraphs
     */
    public open fun getPixelsBelowLines(): Int = gtk_text_view_get_pixels_below_lines(gtkTextViewPointer.reinterpret())

    /**
     * Gets the default number of pixels to put between wrapped lines
     * inside a paragraph.
     *
     * @return default number of pixels of blank space between wrapped lines
     */
    public open fun getPixelsInsideWrap(): Int = gtk_text_view_get_pixels_inside_wrap(gtkTextViewPointer.reinterpret())

    /**
     * Gets the default right margin for text in @text_view.
     *
     * Tags in the buffer may override the default.
     *
     * @return right margin in pixels
     */
    public open fun getRightMargin(): Int = gtk_text_view_get_right_margin(gtkTextViewPointer.reinterpret())

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
    public open fun getTabs(): TabArray? =
        gtk_text_view_get_tabs(gtkTextViewPointer.reinterpret())?.run {
            TabArray(reinterpret())
        }

    /**
     * Gets the top margin for text in the @text_view.
     *
     * @return top margin in pixels
     */
    public open fun getTopMargin(): Int = gtk_text_view_get_top_margin(gtkTextViewPointer.reinterpret())

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
        gtk_text_view_get_visible_rect(
            gtkTextViewPointer.reinterpret(),
            visibleRect.gdkRectanglePointer
        )

    /**
     * Gets the line wrapping for the view.
     *
     * @return the line wrap setting
     */
    public open fun getWrapMode(): WrapMode =
        gtk_text_view_get_wrap_mode(gtkTextViewPointer.reinterpret()).run {
            WrapMode.fromNativeValue(this)
        }

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
        gtk_text_view_im_context_filter_keypress(
            gtkTextViewPointer.reinterpret(),
            event.gPointer.reinterpret()
        ).asBoolean()

    /**
     * Moves a mark within the buffer so that it's
     * located within the currently-visible text area.
     *
     * @param mark a `GtkTextMark`
     * @return true if the mark moved (wasn’t already onscreen)
     */
    public open fun moveMarkOnscreen(mark: TextMark): Boolean =
        gtk_text_view_move_mark_onscreen(
            gtkTextViewPointer.reinterpret(),
            mark.gtkTextMarkPointer.reinterpret()
        ).asBoolean()

    /**
     * Updates the position of a child.
     *
     * See [method@Gtk.TextView.add_overlay].
     *
     * @param child a widget already added with [method@Gtk.TextView.add_overlay]
     * @param xpos new X position in buffer coordinates
     * @param ypos new Y position in buffer coordinates
     */
    public open fun moveOverlay(
        child: Widget,
        xpos: Int,
        ypos: Int,
    ): Unit =
        gtk_text_view_move_overlay(
            gtkTextViewPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret(),
            xpos,
            ypos
        )

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
    public open fun moveVisually(
        iter: TextIter,
        count: Int,
    ): Boolean =
        gtk_text_view_move_visually(
            gtkTextViewPointer.reinterpret(),
            iter.gtkTextIterPointer,
            count
        ).asBoolean()

    /**
     * Moves the cursor to the currently visible region of the
     * buffer.
     *
     * @return true if the cursor had to be moved.
     */
    public open fun placeCursorOnscreen(): Boolean =
        gtk_text_view_place_cursor_onscreen(gtkTextViewPointer.reinterpret()).asBoolean()

    /**
     * Removes a child widget from @text_view.
     *
     * @param child the child to remove
     */
    public open fun remove(child: Widget): Unit =
        gtk_text_view_remove(
            gtkTextViewPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

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
    public open fun resetCursorBlink(): Unit = gtk_text_view_reset_cursor_blink(gtkTextViewPointer.reinterpret())

    /**
     * Reset the input method context of the text view if needed.
     *
     * This can be necessary in the case where modifying the buffer
     * would confuse on-going input method behavior.
     */
    public open fun resetImContext(): Unit = gtk_text_view_reset_im_context(gtkTextViewPointer.reinterpret())

    /**
     * Scrolls @text_view the minimum distance such that @mark is contained
     * within the visible area of the widget.
     *
     * @param mark a mark in the buffer for @text_view
     */
    public open fun scrollMarkOnscreen(mark: TextMark): Unit =
        gtk_text_view_scroll_mark_onscreen(
            gtkTextViewPointer.reinterpret(),
            mark.gtkTextMarkPointer.reinterpret()
        )

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
        withinMargin: Double,
        useAlign: Boolean,
        xalign: Double,
        yalign: Double,
    ): Boolean =
        gtk_text_view_scroll_to_iter(
            gtkTextViewPointer.reinterpret(),
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
        withinMargin: Double,
        useAlign: Boolean,
        xalign: Double,
        yalign: Double,
    ): Unit =
        gtk_text_view_scroll_to_mark(
            gtkTextViewPointer.reinterpret(),
            mark.gtkTextMarkPointer.reinterpret(),
            withinMargin,
            useAlign.asGBoolean(),
            xalign,
            yalign
        )

    /**
     * Sets the behavior of the text widget when the <kbd>Tab</kbd> key is pressed.
     *
     * If @accepts_tab is true, a tab character is inserted. If @accepts_tab
     * is false the keyboard focus is moved to the next widget in the focus
     * chain.
     *
     * @param acceptsTab true if pressing the Tab key should insert a tab
     *    character, false, if pressing the Tab key should move the
     *    keyboard focus.
     */
    public open fun setAcceptsTab(acceptsTab: Boolean): Unit =
        gtk_text_view_set_accepts_tab(gtkTextViewPointer.reinterpret(), acceptsTab.asGBoolean())

    /**
     * Sets the bottom margin for text in @text_view.
     *
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     *
     * @param bottomMargin bottom margin in pixels
     */
    public open fun setBottomMargin(bottomMargin: Int): Unit =
        gtk_text_view_set_bottom_margin(gtkTextViewPointer.reinterpret(), bottomMargin)

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
        gtk_text_view_set_buffer(
            gtkTextViewPointer.reinterpret(),
            buffer?.gtkTextBufferPointer?.reinterpret()
        )

    /**
     * Toggles whether the insertion point should be displayed.
     *
     * A buffer with no editable text probably shouldn’t have a visible
     * cursor, so you may want to turn the cursor off.
     *
     * Note that this property may be overridden by the
     * [property@GtkSettings:gtk-keynav-use-caret] setting.
     *
     * @param setting whether to show the insertion cursor
     */
    public open fun setCursorVisible(setting: Boolean): Unit =
        gtk_text_view_set_cursor_visible(gtkTextViewPointer.reinterpret(), setting.asGBoolean())

    /**
     * Sets the default editability of the `GtkTextView`.
     *
     * You can override this default setting with tags in the buffer,
     * using the “editable” attribute of tags.
     *
     * @param setting whether it’s editable
     */
    public open fun setEditable(setting: Boolean): Unit =
        gtk_text_view_set_editable(gtkTextViewPointer.reinterpret(), setting.asGBoolean())

    /**
     * Sets a menu model to add when constructing the context
     * menu for @text_view.
     *
     * You can pass null to remove a previously set extra menu.
     *
     * @param model a `GMenuModel`
     */
    public open fun setExtraMenu(model: MenuModel? = null): Unit =
        gtk_text_view_set_extra_menu(
            gtkTextViewPointer.reinterpret(),
            model?.gioMenuModelPointer?.reinterpret()
        )

    /**
     * Places @widget into the gutter specified by @win.
     *
     * @win must be one of %GTK_TEXT_WINDOW_LEFT, %GTK_TEXT_WINDOW_RIGHT,
     * %GTK_TEXT_WINDOW_TOP, or %GTK_TEXT_WINDOW_BOTTOM.
     *
     * @param win a `GtkTextWindowType`
     * @param widget a `GtkWidget`
     */
    public open fun setGutter(
        win: TextWindowType,
        widget: Widget? = null,
    ): Unit =
        gtk_text_view_set_gutter(
            gtkTextViewPointer.reinterpret(),
            win.nativeValue,
            widget?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets the default indentation for paragraphs in @text_view.
     *
     * Tags in the buffer may override the default.
     *
     * @param indent indentation in pixels
     */
    public open fun setIndent(indent: Int): Unit = gtk_text_view_set_indent(gtkTextViewPointer.reinterpret(), indent)

    /**
     * Sets the `input-hints` of the `GtkTextView`.
     *
     * The `input-hints` allow input methods to fine-tune
     * their behaviour.
     *
     * @param hints the hints
     */
    public open fun setInputHints(hints: InputHints): Unit =
        gtk_text_view_set_input_hints(gtkTextViewPointer.reinterpret(), hints.mask)

    /**
     * Sets the `input-purpose` of the `GtkTextView`.
     *
     * The `input-purpose` can be used by on-screen keyboards
     * and other input methods to adjust their behaviour.
     *
     * @param purpose the purpose
     */
    public open fun setInputPurpose(purpose: InputPurpose): Unit =
        gtk_text_view_set_input_purpose(gtkTextViewPointer.reinterpret(), purpose.nativeValue)

    /**
     * Sets the default justification of text in @text_view.
     *
     * Tags in the view’s buffer may override the default.
     *
     * @param justification justification
     */
    public open fun setJustification(justification: Justification): Unit =
        gtk_text_view_set_justification(
            gtkTextViewPointer.reinterpret(),
            justification.nativeValue
        )

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
    public open fun setLeftMargin(leftMargin: Int): Unit =
        gtk_text_view_set_left_margin(gtkTextViewPointer.reinterpret(), leftMargin)

    /**
     * Sets whether the `GtkTextView` should display text in
     * monospace styling.
     *
     * @param monospace true to request monospace styling
     */
    public open fun setMonospace(monospace: Boolean): Unit =
        gtk_text_view_set_monospace(gtkTextViewPointer.reinterpret(), monospace.asGBoolean())

    /**
     * Changes the `GtkTextView` overwrite mode.
     *
     * @param overwrite true to turn on overwrite mode, false to turn it off
     */
    public open fun setOverwrite(overwrite: Boolean): Unit =
        gtk_text_view_set_overwrite(gtkTextViewPointer.reinterpret(), overwrite.asGBoolean())

    /**
     * Sets the default number of blank pixels above paragraphs in @text_view.
     *
     * Tags in the buffer for @text_view may override the defaults.
     *
     * @param pixelsAboveLines pixels above paragraphs
     */
    public open fun setPixelsAboveLines(pixelsAboveLines: Int): Unit =
        gtk_text_view_set_pixels_above_lines(gtkTextViewPointer.reinterpret(), pixelsAboveLines)

    /**
     * Sets the default number of pixels of blank space
     * to put below paragraphs in @text_view.
     *
     * May be overridden by tags applied to @text_view’s buffer.
     *
     * @param pixelsBelowLines pixels below paragraphs
     */
    public open fun setPixelsBelowLines(pixelsBelowLines: Int): Unit =
        gtk_text_view_set_pixels_below_lines(gtkTextViewPointer.reinterpret(), pixelsBelowLines)

    /**
     * Sets the default number of pixels of blank space to leave between
     * display/wrapped lines within a paragraph.
     *
     * May be overridden by tags in @text_view’s buffer.
     *
     * @param pixelsInsideWrap default number of pixels between wrapped lines
     */
    public open fun setPixelsInsideWrap(pixelsInsideWrap: Int): Unit =
        gtk_text_view_set_pixels_inside_wrap(gtkTextViewPointer.reinterpret(), pixelsInsideWrap)

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
    public open fun setRightMargin(rightMargin: Int): Unit =
        gtk_text_view_set_right_margin(gtkTextViewPointer.reinterpret(), rightMargin)

    /**
     * Sets the default tab stops for paragraphs in @text_view.
     *
     * Tags in the buffer may override the default.
     *
     * @param tabs tabs as a `PangoTabArray`
     */
    public open fun setTabs(tabs: TabArray): Unit =
        gtk_text_view_set_tabs(gtkTextViewPointer.reinterpret(), tabs.pangoTabArrayPointer)

    /**
     * Sets the top margin for text in @text_view.
     *
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     *
     * @param topMargin top margin in pixels
     */
    public open fun setTopMargin(topMargin: Int): Unit =
        gtk_text_view_set_top_margin(gtkTextViewPointer.reinterpret(), topMargin)

    /**
     * Sets the line wrapping for the view.
     *
     * @param wrapMode a `GtkWrapMode`
     */
    public open fun setWrapMode(wrapMode: WrapMode): Unit =
        gtk_text_view_set_wrap_mode(gtkTextViewPointer.reinterpret(), wrapMode.nativeValue)

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
        gtk_text_view_starts_display_line(
            gtkTextViewPointer.reinterpret(),
            iter.gtkTextIterPointer
        ).asBoolean()

    /**
     * Gets emitted when the user asks for it.
     *
     * The ::backspace signal is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * <kbd>Backspace</kbd> and <kbd>Shift</kbd>-<kbd>Backspace</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectBackspace(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "backspace",
            connectBackspaceFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Gets emitted to copy the selection to the clipboard.
     *
     * The ::copy-clipboard signal is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>-<kbd>c</kbd> and
     * <kbd>Ctrl</kbd>-<kbd>Insert</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectCopyClipboard(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "copy-clipboard",
            connectCopyClipboardFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Gets emitted to cut the selection to the clipboard.
     *
     * The ::cut-clipboard signal is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>-<kbd>x</kbd> and
     * <kbd>Shift</kbd>-<kbd>Delete</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectCutClipboard(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "cut-clipboard",
            connectCutClipboardFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

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
     * deleting a character, <kbd>Ctrl</kbd>-<kbd>Delete</kbd> for
     * deleting a word and <kbd>Ctrl</kbd>-<kbd>Backspace</kbd> for
     * deleting a word backwards.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `type` the granularity of the deletion, as a
     * `GtkDeleteType`; `count` the number of @type units to delete
     */
    public fun connectDeleteFromCursor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (type: DeleteType, count: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "delete-from-cursor",
            connectDeleteFromCursorFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the selection needs to be extended at @location.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `granularity` the granularity type;
     * `location` the location where to extend the selection; `start` where the selection should start;
     * `end` where the selection should end. Returns %GDK_EVENT_STOP to stop other handlers from being
     * invoked for the
     *   event. %GDK_EVENT_PROPAGATE to propagate the event further.
     */
    public fun connectExtendSelection(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            granularity: TextExtendSelection,
            location: TextIter,
            start: TextIter,
            end: TextIter,
        ) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "extend-selection",
            connectExtendSelectionFunc.reinterpret(),
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
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `string` the string to insert
     */
    public fun connectInsertAtCursor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (string: String) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "insert-at-cursor",
            connectInsertAtCursorFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Gets emitted to present the Emoji chooser for the @text_view.
     *
     * The ::insert-emoji signal is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>-<kbd>.</kbd> and
     * <kbd>Ctrl</kbd>-<kbd>;</kbd>
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectInsertEmoji(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "insert-emoji",
            connectInsertEmojiFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

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
     * - <kbd>Ctrl</kbd>-<kbd>→</kbd>, etc. move by words/paragraphs
     * - <kbd>Home</kbd>, <kbd>End</kbd> move to the ends of the buffer
     * - <kbd>PgUp</kbd>, <kbd>PgDn</kbd> move vertically by pages
     * - <kbd>Ctrl</kbd>-<kbd>PgUp</kbd>, <kbd>Ctrl</kbd>-<kbd>PgDn</kbd>
     *   move horizontally by pages
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `step` the granularity of the move, as a
     * `GtkMovementStep`; `count` the number of @step units to move; `extendSelection` true if the move
     * should extend the selection
     */
    public fun connectMoveCursor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            step: MovementStep,
            count: Int,
            extendSelection: Boolean,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "move-cursor",
            connectMoveCursorFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

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
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `step` the granularity of the movement, as a
     * `GtkScrollStep`; `count` the number of @step units to move
     */
    public fun connectMoveViewport(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (step: ScrollStep, count: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "move-viewport",
            connectMoveViewportFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Gets emitted to paste the contents of the clipboard
     * into the text view.
     *
     * The ::paste-clipboard signal is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>-<kbd>v</kbd> and
     * <kbd>Shift</kbd>-<kbd>Insert</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectPasteClipboard(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "paste-clipboard",
            connectPasteClipboardFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

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
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `preedit` the current preedit string
     */
    public fun connectPreeditChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (preedit: String) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "preedit-changed",
            connectPreeditChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Gets emitted to select or unselect the complete contents of the text view.
     *
     * The ::select-all signal is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>-<kbd>a</kbd> and
     * <kbd>Ctrl</kbd>-<kbd>/</kbd> for selecting and
     * <kbd>Shift</kbd>-<kbd>Ctrl</kbd>-<kbd>a</kbd> and
     * <kbd>Ctrl</kbd>-<kbd>\</kbd> for unselecting.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `select` true to select, false to unselect
     */
    public fun connectSelectAll(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (select: Boolean) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "select-all",
            connectSelectAllFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

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
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectSetAnchor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "set-anchor",
            connectSetAnchorFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Gets emitted to toggle the `cursor-visible` property.
     *
     * The ::toggle-cursor-visible signal is a
     * [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is <kbd>F7</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectToggleCursorVisible(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "toggle-cursor-visible",
            connectToggleCursorVisibleFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Gets emitted to toggle the overwrite mode of the text view.
     *
     * The ::toggle-overwrite signal is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is <kbd>Insert</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectToggleOverwrite(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "toggle-overwrite",
            connectToggleOverwriteFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<TextView> {
        override val type: GeneratedClassKGType<TextView> =
            GeneratedClassKGType(gtk_text_view_get_type()) { TextView(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectBackspaceFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectCopyClipboardFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectCutClipboardFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectDeleteFromCursorFunc: CPointer<CFunction<(GtkDeleteType, Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            type: GtkDeleteType,
            count: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(type: DeleteType, count: Int) -> Unit>().get().invoke(
            type.run {
                DeleteType.fromNativeValue(this)
            },
            count
        )
    }
        .reinterpret()

private val connectExtendSelectionFunc: CPointer<
    CFunction<
        (
            GtkTextExtendSelection,
            CPointer<GtkTextIter>,
            CPointer<GtkTextIter>,
            CPointer<GtkTextIter>,
        ) -> Int
        >
    > =
    staticCFunction {
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
                TextIter(reinterpret())
            },
            start!!.run {
                TextIter(reinterpret())
            },
            end!!.run {
                TextIter(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectInsertAtCursorFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            string: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(string: String) -> Unit>().get().invoke(
            string?.toKString()
                ?: error("Expected not null string")
        )
    }
        .reinterpret()

private val connectInsertEmojiFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectMoveCursorFunc: CPointer<
    CFunction<
        (
            GtkMovementStep,
            Int,
            Int,
        ) -> Unit
        >
    > =
    staticCFunction {
            _: COpaquePointer,
            step: GtkMovementStep,
            count: Int,
            extendSelection: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                step: MovementStep,
                count: Int,
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

private val connectMoveViewportFunc: CPointer<CFunction<(GtkScrollStep, Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            step: GtkScrollStep,
            count: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(step: ScrollStep, count: Int) -> Unit>().get().invoke(
            step.run {
                ScrollStep.fromNativeValue(this)
            },
            count
        )
    }
        .reinterpret()

private val connectPasteClipboardFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectPreeditChangedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            preedit: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(preedit: String) -> Unit>().get().invoke(
            preedit?.toKString()
                ?: error("Expected not null string")
        )
    }
        .reinterpret()

private val connectSelectAllFunc: CPointer<CFunction<(Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            select: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(select: Boolean) -> Unit>().get().invoke(select.asBoolean())
    }
        .reinterpret()

private val connectSetAnchorFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectToggleCursorVisibleFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectToggleOverwriteFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
