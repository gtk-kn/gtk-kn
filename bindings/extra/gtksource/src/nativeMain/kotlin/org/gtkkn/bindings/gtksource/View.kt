// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.ModifierType
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.TextIter
import org.gtkkn.bindings.gtk.TextView
import org.gtkkn.bindings.gtk.TextWindowType
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkModifierType
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkScrollable
import org.gtkkn.native.gtk.GtkTextIter
import org.gtkkn.native.gtksource.GtkSourceChangeCaseType
import org.gtkkn.native.gtksource.GtkSourceView
import org.gtkkn.native.gtksource.gtk_source_view_get_auto_indent
import org.gtkkn.native.gtksource.gtk_source_view_get_background_pattern
import org.gtkkn.native.gtksource.gtk_source_view_get_completion
import org.gtkkn.native.gtksource.gtk_source_view_get_enable_snippets
import org.gtkkn.native.gtksource.gtk_source_view_get_gutter
import org.gtkkn.native.gtksource.gtk_source_view_get_highlight_current_line
import org.gtkkn.native.gtksource.gtk_source_view_get_hover
import org.gtkkn.native.gtksource.gtk_source_view_get_indent_on_tab
import org.gtkkn.native.gtksource.gtk_source_view_get_indent_width
import org.gtkkn.native.gtksource.gtk_source_view_get_indenter
import org.gtkkn.native.gtksource.gtk_source_view_get_insert_spaces_instead_of_tabs
import org.gtkkn.native.gtksource.gtk_source_view_get_right_margin_position
import org.gtkkn.native.gtksource.gtk_source_view_get_show_line_marks
import org.gtkkn.native.gtksource.gtk_source_view_get_show_line_numbers
import org.gtkkn.native.gtksource.gtk_source_view_get_show_right_margin
import org.gtkkn.native.gtksource.gtk_source_view_get_smart_backspace
import org.gtkkn.native.gtksource.gtk_source_view_get_smart_home_end
import org.gtkkn.native.gtksource.gtk_source_view_get_space_drawer
import org.gtkkn.native.gtksource.gtk_source_view_get_tab_width
import org.gtkkn.native.gtksource.gtk_source_view_get_type
import org.gtkkn.native.gtksource.gtk_source_view_get_visual_column
import org.gtkkn.native.gtksource.gtk_source_view_indent_lines
import org.gtkkn.native.gtksource.gtk_source_view_new
import org.gtkkn.native.gtksource.gtk_source_view_new_with_buffer
import org.gtkkn.native.gtksource.gtk_source_view_push_snippet
import org.gtkkn.native.gtksource.gtk_source_view_set_auto_indent
import org.gtkkn.native.gtksource.gtk_source_view_set_background_pattern
import org.gtkkn.native.gtksource.gtk_source_view_set_enable_snippets
import org.gtkkn.native.gtksource.gtk_source_view_set_highlight_current_line
import org.gtkkn.native.gtksource.gtk_source_view_set_indent_on_tab
import org.gtkkn.native.gtksource.gtk_source_view_set_indent_width
import org.gtkkn.native.gtksource.gtk_source_view_set_indenter
import org.gtkkn.native.gtksource.gtk_source_view_set_insert_spaces_instead_of_tabs
import org.gtkkn.native.gtksource.gtk_source_view_set_mark_attributes
import org.gtkkn.native.gtksource.gtk_source_view_set_right_margin_position
import org.gtkkn.native.gtksource.gtk_source_view_set_show_line_marks
import org.gtkkn.native.gtksource.gtk_source_view_set_show_line_numbers
import org.gtkkn.native.gtksource.gtk_source_view_set_show_right_margin
import org.gtkkn.native.gtksource.gtk_source_view_set_smart_backspace
import org.gtkkn.native.gtksource.gtk_source_view_set_smart_home_end
import org.gtkkn.native.gtksource.gtk_source_view_set_tab_width
import org.gtkkn.native.gtksource.gtk_source_view_unindent_lines
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Subclass of [class@Gtk.TextView].
 *
 * `GtkSourceView` is the main class of the GtkSourceView library.
 * Use a [class@Buffer] to display text with a `GtkSourceView`.
 *
 * This class provides:
 *
 *  - Show the line numbers;
 *  - Show a right margin;
 *  - Highlight the current line;
 *  - Indentation settings;
 *  - Configuration for the Home and End keyboard keys;
 *  - Configure and show line marks;
 *  - And a few other things.
 *
 * An easy way to test all these features is to use the test-widget mini-program
 * provided in the GtkSourceView repository, in the tests/ directory.
 *
 * # GtkSourceView as GtkBuildable
 *
 * The GtkSourceView implementation of the [iface@Gtk.Buildable] interface exposes the
 * [property@View:completion] object with the internal-child "completion".
 *
 * An example of a UI definition fragment with GtkSourceView:
 * ```xml
 * <object class="GtkSourceView" id="source_view">
 *   <property name="tab-width">4</property>
 *   <property name="auto-indent">True</property>
 *   <child internal-child="completion">
 *     <object class="GtkSourceCompletion">
 *       <property name="select-on-show">False</property>
 *     </object>
 *   </child>
 * </object>
 * ```
 *
 * # Changing the Font
 *
 * Gtk CSS provides the best way to change the font for a `GtkSourceView` in a
 * manner that allows for components like [class@Map] to scale the desired
 * font.
 *
 * ```c
 * GtkCssProvider *provider = gtk_css_provider_new ();
 * gtk_css_provider_load_from_data (provider,
 *                                  "textview { font-family: Monospace; font-size: 8pt; }",
 *                                  -1,
 *                                  NULL);
 * gtk_style_context_add_provider (gtk_widget_get_style_context (view),
 *                                 GTK_STYLE_PROVIDER (provider),
 *                                 GTK_STYLE_PROVIDER_PRIORITY_APPLICATION);
 * g_object_unref (provider);
 * ```
 *
 * If you need to adjust the font or size of font within a portion of the
 * document only, you should use a [class@Gtk.TextTag] with the [property@Gtk.TextTag:family] or
 * [property@Gtk.TextTag:scale] set so that the font size may be scaled relative to
 * the default font set in CSS.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `priority`: Unsupported pointer to primitive type
 * - signal `push-snippet`: Unsupported parameter `location` : location: In/Out parameter is not supported
 */
public open class View(public val gtksourceViewPointer: CPointer<GtkSourceView>) :
    TextView(gtksourceViewPointer.reinterpret()),
    KGTyped {
    init {
        GtkSource
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = handle.reinterpret()

    public open var autoIndent: Boolean
        /**
         * Returns whether auto-indentation of text is enabled.
         *
         * @return true if auto indentation is enabled.
         */
        get() = gtk_source_view_get_auto_indent(gtksourceViewPointer).asBoolean()

        /**
         * If true auto-indentation of text is enabled.
         *
         * When Enter is pressed to create a new line, the auto-indentation inserts the
         * same indentation as the previous line. This is **not** a
         * "smart indentation" where an indentation level is added or removed depending
         * on the context.
         *
         * @param enable whether to enable auto indentation.
         */
        set(enable) = gtk_source_view_set_auto_indent(gtksourceViewPointer, enable.asGBoolean())

    /**
     * Draw a specific background pattern on the view.
     */
    public open var backgroundPattern: BackgroundPatternType
        /**
         * Returns the #GtkSourceBackgroundPatternType specifying if and how
         * the background pattern should be displayed for this @view.
         *
         * @return the #GtkSourceBackgroundPatternType.
         */
        get() = gtk_source_view_get_background_pattern(gtksourceViewPointer).run {
            BackgroundPatternType.fromNativeValue(this)
        }

        /**
         * Set if and how the background pattern should be displayed.
         *
         * @param backgroundPattern the #GtkSourceBackgroundPatternType.
         */
        set(
            backgroundPattern
        ) = gtk_source_view_set_background_pattern(gtksourceViewPointer, backgroundPattern.nativeValue)

    /**
     * The completion object associated with the view
     */
    public open val completion: Completion
        /**
         * Gets the [class@Completion] associated with @view.
         *
         * The returned object is guaranteed to be the same for the lifetime of @view.
         * Each `GtkSourceView` object has a different [class@Completion].
         *
         * @return the #GtkSourceCompletion associated with @view.
         */
        get() = gtk_source_view_get_completion(gtksourceViewPointer)!!.run {
            InstanceCache.get(this, true) { Completion(reinterpret()) }!!
        }

    /**
     * The property denotes if snippets should be
     * expanded when the user presses Tab after having typed a word
     * matching the snippets found in [class@SnippetManager].
     *
     * The user may tab through focus-positions of the snippet if any
     * are available by pressing Tab repeatedly until the desired focus
     * position is selected.
     */
    public open var enableSnippets: Boolean
        /**
         * Gets the [property@View:enable-snippets] property.
         *
         * If true, matching snippets found in the [class@SnippetManager]
         * may be expanded when the user presses Tab after a word in the [class@View].
         *
         * @return true if enabled
         */
        get() = gtk_source_view_get_enable_snippets(gtksourceViewPointer).asBoolean()

        /**
         * Sets the [property@View:enable-snippets] property.
         *
         * If @enable_snippets is true, matching snippets found in the
         * [class@SnippetManager] may be expanded when the user presses
         * Tab after a word in the [class@View].
         *
         * @param enableSnippets if snippets should be enabled
         */
        set(enableSnippets) = gtk_source_view_set_enable_snippets(gtksourceViewPointer, enableSnippets.asGBoolean())

    public open var highlightCurrentLine: Boolean
        /**
         * Returns whether the current line is highlighted.
         *
         * @return true if the current line is highlighted.
         */
        get() = gtk_source_view_get_highlight_current_line(gtksourceViewPointer).asBoolean()

        /**
         * If @highlight is true the current line will be highlighted.
         *
         * @param highlight whether to highlight the current line.
         */
        set(highlight) = gtk_source_view_set_highlight_current_line(gtksourceViewPointer, highlight.asGBoolean())

    public open var indentOnTab: Boolean
        /**
         * Returns whether when the tab key is pressed the current selection
         * should get indented instead of replaced with the `\t` character.
         *
         * @return true if the selection is indented when tab is pressed.
         */
        get() = gtk_source_view_get_indent_on_tab(gtksourceViewPointer).asBoolean()

        /**
         * If true, when the tab key is pressed when several lines are selected, the
         * selected lines are indented of one level instead of being replaced with a `\t`
         * character. Shift+Tab unindents the selection.
         *
         * If the first or last line is not selected completely, it is also indented or
         * unindented.
         *
         * When the selection doesn't span several lines, the tab key always replaces
         * the selection with a normal `\t` character.
         *
         * @param enable whether to indent a block when tab is pressed.
         */
        set(enable) = gtk_source_view_set_indent_on_tab(gtksourceViewPointer, enable.asGBoolean())

    /**
     * Width of an indentation step expressed in number of spaces.
     */
    public open var indentWidth: gint
        /**
         * Returns the number of spaces to use for each step of indent.
         *
         * See [method@View.set_indent_width] for details.
         *
         * @return indent width.
         */
        get() = gtk_source_view_get_indent_width(gtksourceViewPointer)

        /**
         * Sets the number of spaces to use for each step of indent when the tab key is
         * pressed.
         *
         * If @width is -1, the value of the [property@View:tab-width] property
         * will be used.
         *
         * The [property@View:indent-width] interacts with the
         * [property@View:insert-spaces-instead-of-tabs] property and
         * [property@View:tab-width]. An example will be clearer:
         *
         * If the [property@View:indent-width] is 4 and [property@View:tab-width] is 8 and
         * [property@View:insert-spaces-instead-of-tabs] is false, then pressing the tab
         * key at the beginning of a line will insert 4 spaces. So far so good. Pressing
         * the tab key a second time will remove the 4 spaces and insert a `\t` character
         * instead (since [property@View:tab-width] is 8). On the other hand, if
         * [property@View:insert-spaces-instead-of-tabs] is true, the second tab key
         * pressed will insert 4 more spaces for a total of 8 spaces in the
         * [class@Gtk.TextBuffer].
         *
         * The test-widget program (available in the GtkSourceView repository) may be
         * useful to better understand the indentation settings (enable the space
         * drawing!).
         *
         * @param width indent width in characters.
         */
        set(width) = gtk_source_view_set_indent_width(gtksourceViewPointer, width)

    /**
     * The property is a [iface@Indenter] to use to indent
     * as the user types into the [class@View].
     */
    public open var indenter: Indenter?
        /**
         * Gets the [property@View:indenter] property.
         *
         * @return a #GtkSourceIndenter or null
         */
        get() = gtk_source_view_get_indenter(gtksourceViewPointer)?.run {
            Indenter.IndenterImpl(reinterpret())
        }

        /**
         * Sets the indenter for @view to @indenter.
         *
         * Note that the indenter will not be used unless #GtkSourceView:auto-indent
         * has been set to true.
         *
         * @param indenter a #GtkSourceIndenter or null
         */
        set(indenter) = gtk_source_view_set_indenter(gtksourceViewPointer, indenter?.gtksourceIndenterPointer)

    public open var insertSpacesInsteadOfTabs: Boolean
        /**
         * Returns whether when inserting a tabulator character it should
         * be replaced by a group of space characters.
         *
         * @return true if spaces are inserted instead of tabs.
         */
        get() = gtk_source_view_get_insert_spaces_instead_of_tabs(gtksourceViewPointer).asBoolean()

        /**
         * If true a tab key pressed is replaced by a group of space characters.
         *
         * Of course it is still possible to insert a real `\t` programmatically with the
         * [class@Gtk.TextBuffer] API.
         *
         * @param enable whether to insert spaces instead of tabs.
         */
        set(enable) = gtk_source_view_set_insert_spaces_instead_of_tabs(gtksourceViewPointer, enable.asGBoolean())

    /**
     * Position of the right margin.
     */
    public open var rightMarginPosition: guint
        /**
         * Gets the position of the right margin in the given @view.
         *
         * @return the position of the right margin.
         */
        get() = gtk_source_view_get_right_margin_position(gtksourceViewPointer)

        /**
         * Sets the position of the right margin in the given @view.
         *
         * @param pos the width in characters where to position the right margin.
         */
        set(pos) = gtk_source_view_set_right_margin_position(gtksourceViewPointer, pos)

    /**
     * Whether to display line mark pixbufs
     */
    public open var showLineMarks: Boolean
        /**
         * Returns whether line marks are displayed beside the text.
         *
         * @return true if the line marks are displayed.
         */
        get() = gtk_source_view_get_show_line_marks(gtksourceViewPointer).asBoolean()

        /**
         * If true line marks will be displayed beside the text.
         *
         * @param show whether line marks should be displayed.
         */
        set(show) = gtk_source_view_set_show_line_marks(gtksourceViewPointer, show.asGBoolean())

    /**
     * Whether to display line numbers
     */
    public open var showLineNumbers: Boolean
        /**
         * Returns whether line numbers are displayed beside the text.
         *
         * @return true if the line numbers are displayed.
         */
        get() = gtk_source_view_get_show_line_numbers(gtksourceViewPointer).asBoolean()

        /**
         * If true line numbers will be displayed beside the text.
         *
         * @param show whether line numbers should be displayed.
         */
        set(show) = gtk_source_view_set_show_line_numbers(gtksourceViewPointer, show.asGBoolean())

    /**
     * Whether to display the right margin.
     */
    public open var showRightMargin: Boolean
        /**
         * Returns whether a right margin is displayed.
         *
         * @return true if the right margin is shown.
         */
        get() = gtk_source_view_get_show_right_margin(gtksourceViewPointer).asBoolean()

        /**
         * If true a right margin is displayed.
         *
         * @param show whether to show a right margin.
         */
        set(show) = gtk_source_view_set_show_right_margin(gtksourceViewPointer, show.asGBoolean())

    /**
     * Whether smart Backspace should be used.
     */
    public open var smartBackspace: Boolean
        /**
         * Returns true if pressing the Backspace key will try to delete spaces
         * up to the previous tab stop.
         *
         * @return true if smart Backspace handling is enabled.
         */
        get() = gtk_source_view_get_smart_backspace(gtksourceViewPointer).asBoolean()

        /**
         * When set to true, pressing the Backspace key will try to delete spaces
         * up to the previous tab stop.
         *
         * @param smartBackspace whether to enable smart Backspace handling.
         */
        set(smartBackspace) = gtk_source_view_set_smart_backspace(gtksourceViewPointer, smartBackspace.asGBoolean())

    /**
     * Set the behavior of the HOME and END keys.
     */
    public open var smartHomeEnd: SmartHomeEndType
        /**
         * Returns a [enum@SmartHomeEndType] end value specifying
         * how the cursor will move when HOME and END keys are pressed.
         *
         * @return a #GtkSourceSmartHomeEndType value.
         */
        get() = gtk_source_view_get_smart_home_end(gtksourceViewPointer).run {
            SmartHomeEndType.fromNativeValue(this)
        }

        /**
         * Set the desired movement of the cursor when HOME and END keys
         * are pressed.
         *
         * @param smartHomeEnd the desired behavior among #GtkSourceSmartHomeEndType.
         */
        set(smartHomeEnd) = gtk_source_view_set_smart_home_end(gtksourceViewPointer, smartHomeEnd.nativeValue)

    /**
     * The [class@SpaceDrawer] object associated with the view.4
     */
    public open val spaceDrawer: SpaceDrawer
        /**
         * Gets the [class@SpaceDrawer] associated with @view.
         *
         * The returned object is guaranteed to be the same for the lifetime of @view.
         * Each [class@View] object has a different [class@SpaceDrawer].
         *
         * @return the #GtkSourceSpaceDrawer associated with @view.
         */
        get() = gtk_source_view_get_space_drawer(gtksourceViewPointer)!!.run {
            InstanceCache.get(this, true) { SpaceDrawer(reinterpret()) }!!
        }

    /**
     * Width of a tab character expressed in number of spaces.
     */
    public open var tabWidth: guint
        /**
         * Returns the width of tabulation in characters.
         *
         * @return width of tab.
         */
        get() = gtk_source_view_get_tab_width(gtksourceViewPointer)

        /**
         * Sets the width of tabulation in characters.
         *
         * The #GtkTextBuffer still contains `\t` characters,
         * but they can take a different visual width in a [class@View] widget.
         *
         * @param width width of tab in characters.
         */
        set(width) = gtk_source_view_set_tab_width(gtksourceViewPointer, width)

    /**
     * Creates a new `GtkSourceView`.
     *
     * By default, an empty [class@Buffer] will be lazily created and can be
     * retrieved with [method@Gtk.TextView.get_buffer].
     *
     * If you want to specify your own buffer, either override the
     * [vfunc@Gtk.TextView.create_buffer] factory method, or use
     * [ctor@View.new_with_buffer].
     *
     * @return a new #GtkSourceView.
     */
    public constructor() : this(gtk_source_view_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Creates a new #GtkSourceView widget displaying the buffer @buffer.
     *
     * One buffer can be shared among many widgets.
     *
     * @param buffer a #GtkSourceBuffer.
     * @return a new #GtkSourceView.
     */
    public constructor(
        buffer: Buffer,
    ) : this(gtk_source_view_new_with_buffer(buffer.gtksourceBufferPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Returns the [class@Gutter] object associated with @window_type for @view.
     *
     * Only %GTK_TEXT_WINDOW_LEFT and %GTK_TEXT_WINDOW_RIGHT are supported,
     * respectively corresponding to the left and right gutter. The line numbers
     * and mark category icons are rendered in the left gutter.
     *
     * @param windowType the gutter window type.
     * @return the #GtkSourceGutter.
     */
    public open fun getGutterView(windowType: TextWindowType): Gutter =
        gtk_source_view_get_gutter(gtksourceViewPointer, windowType.nativeValue.value)!!.run {
            InstanceCache.get(this, true) { Gutter(reinterpret()) }!!
        }

    /**
     * Gets the [class@Hover] associated with @view.
     *
     * The returned object is guaranteed to be the same for the lifetime of @view.
     * Each [class@View] object has a different [class@Hover].
     *
     * @return a #GtkSourceHover associated with @view.
     */
    public open fun getHover(): Hover = gtk_source_view_get_hover(gtksourceViewPointer)!!.run {
        InstanceCache.get(this, true) { Hover(reinterpret()) }!!
    }

    /**
     * Determines the visual column at @iter taking into consideration the
     * [property@View:tab-width] of @view.
     *
     * @param iter a position in @view.
     * @return the visual column at @iter.
     */
    public open fun getVisualColumn(iter: TextIter): guint =
        gtk_source_view_get_visual_column(gtksourceViewPointer, iter.gtkTextIterPointer)

    /**
     * Inserts one indentation level at the beginning of the specified lines. The
     * empty lines are not indented.
     *
     * @param start #GtkTextIter of the first line to indent
     * @param end #GtkTextIter of the last line to indent
     */
    public open fun indentLines(start: TextIter, end: TextIter): Unit =
        gtk_source_view_indent_lines(gtksourceViewPointer, start.gtkTextIterPointer, end.gtkTextIterPointer)

    /**
     * Inserts a new snippet at @location
     *
     * If another snippet was already active, it will be paused and the new
     * snippet will become active. Once the focus positions of @snippet have
     * been exhausted, editing will return to the previous snippet.
     *
     * @param snippet a #GtkSourceSnippet
     * @param location a #GtkTextIter or null for the cursor position
     */
    public open fun pushSnippet(snippet: Snippet, location: TextIter? = null): Unit = gtk_source_view_push_snippet(
        gtksourceViewPointer,
        snippet.gtksourceSnippetPointer,
        location?.gtkTextIterPointer
    )

    /**
     * Sets attributes and priority for the @category.
     *
     * @param category the category.
     * @param attributes mark attributes.
     * @param priority priority of the category.
     */
    public open fun setMarkAttributes(category: String, attributes: MarkAttributes, priority: gint): Unit =
        gtk_source_view_set_mark_attributes(
            gtksourceViewPointer,
            category,
            attributes.gtksourceMarkAttributesPointer,
            priority
        )

    /**
     * Removes one indentation level at the beginning of the
     * specified lines.
     *
     * @param start #GtkTextIter of the first line to indent
     * @param end #GtkTextIter of the last line to indent
     */
    public open fun unindentLines(start: TextIter, end: TextIter): Unit =
        gtk_source_view_unindent_lines(gtksourceViewPointer, start.gtkTextIterPointer, end.gtkTextIterPointer)

    /**
     * Keybinding signal to change case of the text at the current cursor position.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `caseType` the case to use
     */
    public fun onChangeCase(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (caseType: ChangeCaseType) -> Unit,
    ): ULong = g_signal_connect_data(
        gtksourceViewPointer,
        "change-case",
        onChangeCaseFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "change-case" signal. See [onChangeCase].
     *
     * @param caseType the case to use
     */
    public fun emitChangeCase(caseType: ChangeCaseType) {
        g_signal_emit_by_name(gtksourceViewPointer.reinterpret(), "change-case", caseType.nativeValue)
    }

    /**
     * Keybinding signal to edit a number at the current cursor position.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `count` the number to add to the number at the current position
     */
    public fun onChangeNumber(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (count: gint) -> Unit): ULong =
        g_signal_connect_data(
            gtksourceViewPointer,
            "change-number",
            onChangeNumberFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "change-number" signal. See [onChangeNumber].
     *
     * @param count the number to add to the number at the current position
     */
    public fun emitChangeNumber(count: gint) {
        g_signal_emit_by_name(gtksourceViewPointer.reinterpret(), "change-number", count)
    }

    /**
     * Keybinding signal to join the lines currently selected.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onJoinLines(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtksourceViewPointer,
            "join-lines",
            onJoinLinesFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "join-lines" signal. See [onJoinLines].
     */
    public fun emitJoinLines() {
        g_signal_emit_by_name(gtksourceViewPointer.reinterpret(), "join-lines")
    }

    /**
     * Emitted when a line mark has been activated (for instance when there
     * was a button press in the line marks gutter).
     *
     * You can use @iter to determine on which line the activation took place.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `iter` a #GtkTextIter; `button` the button that was pressed; `state` the modifier state, if any; `nPresses` the number of presses
     */
    public fun onLineMarkActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            iter: TextIter,
            button: guint,
            state: ModifierType,
            nPresses: gint,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gtksourceViewPointer,
        "line-mark-activated",
        onLineMarkActivatedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "line-mark-activated" signal. See [onLineMarkActivated].
     *
     * @param iter a #GtkTextIter
     * @param button the button that was pressed
     * @param state the modifier state, if any
     * @param nPresses the number of presses
     */
    public fun emitLineMarkActivated(iter: TextIter, button: guint, state: ModifierType, nPresses: gint) {
        g_signal_emit_by_name(
            gtksourceViewPointer.reinterpret(),
            "line-mark-activated",
            iter.gtkTextIterPointer,
            button,
            state.mask,
            nPresses
        )
    }

    /**
     * The signal is a keybinding which gets emitted when the user initiates moving a line.
     *
     * The default binding key is Alt+Up/Down arrow. And moves the currently selected lines,
     * or the current line up or down by one line.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `down` true to move down, false to move up.
     */
    public fun onMoveLines(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (down: Boolean) -> Unit): ULong =
        g_signal_connect_data(
            gtksourceViewPointer,
            "move-lines",
            onMoveLinesFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "move-lines" signal. See [onMoveLines].
     *
     * @param down true to move down, false to move up.
     */
    public fun emitMoveLines(down: Boolean) {
        g_signal_emit_by_name(gtksourceViewPointer.reinterpret(), "move-lines", down.asGBoolean())
    }

    /**
     * Keybinding signal to move the cursor to the matching bracket.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `extendSelection` true if the move should extend the selection
     */
    public fun onMoveToMatchingBracket(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (extendSelection: Boolean) -> Unit,
    ): ULong = g_signal_connect_data(
        gtksourceViewPointer,
        "move-to-matching-bracket",
        onMoveToMatchingBracketFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "move-to-matching-bracket" signal. See [onMoveToMatchingBracket].
     *
     * @param extendSelection true if the move should extend the selection
     */
    public fun emitMoveToMatchingBracket(extendSelection: Boolean) {
        g_signal_emit_by_name(
            gtksourceViewPointer.reinterpret(),
            "move-to-matching-bracket",
            extendSelection.asGBoolean()
        )
    }

    /**
     * The signal is a keybinding which gets emitted when the user initiates moving a word.
     *
     * The default binding key is Alt+Left/Right Arrow and moves the current selection, or the current
     * word by one word.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `count` the number of words to move over
     */
    public fun onMoveWords(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (count: gint) -> Unit): ULong =
        g_signal_connect_data(
            gtksourceViewPointer,
            "move-words",
            onMoveWordsFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "move-words" signal. See [onMoveWords].
     *
     * @param count the number of words to move over
     */
    public fun emitMoveWords(count: gint) {
        g_signal_emit_by_name(gtksourceViewPointer.reinterpret(), "move-words", count)
    }

    /**
     * The signal is a key binding signal which gets
     * emitted when the user requests a completion, by pressing
     * <keycombo><keycap>Control</keycap><keycap>space</keycap></keycombo>.
     *
     * This will create a [class@CompletionContext] with the activation
     * type as %GTK_SOURCE_COMPLETION_ACTIVATION_USER_REQUESTED.
     *
     * Applications should not connect to it, but may emit it with
     * [func@GObject.signal_emit_by_name] if they need to activate the completion by
     * another means, for example with another key binding or a menu entry.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onShowCompletion(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtksourceViewPointer,
            "show-completion",
            onShowCompletionFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "show-completion" signal. See [onShowCompletion].
     */
    public fun emitShowCompletion() {
        g_signal_emit_by_name(gtksourceViewPointer.reinterpret(), "show-completion")
    }

    /**
     * Emitted when a the cursor was moved according to the smart home end setting.
     *
     * The signal is emitted after the cursor is moved, but
     * during the [signal@Gtk.TextView::move-cursor] action. This can be used to find
     * out whether the cursor was moved by a normal home/end or by a smart
     * home/end.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `iter` a #GtkTextIter; `count` the count
     */
    public fun onSmartHomeEnd(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (iter: TextIter, count: gint) -> Unit,
    ): ULong = g_signal_connect_data(
        gtksourceViewPointer,
        "smart-home-end",
        onSmartHomeEndFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "smart-home-end" signal. See [onSmartHomeEnd].
     *
     * @param iter a #GtkTextIter
     * @param count the count
     */
    public fun emitSmartHomeEnd(iter: TextIter, count: gint) {
        g_signal_emit_by_name(gtksourceViewPointer.reinterpret(), "smart-home-end", iter.gtkTextIterPointer, count)
    }

    public companion object : TypeCompanion<View> {
        override val type: GeneratedClassKGType<View> =
            GeneratedClassKGType(getTypeOrNull()!!) { View(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of View
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_view_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_view_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_view_get_type")
    }
}

private val onChangeCaseFunc: CPointer<CFunction<(GtkSourceChangeCaseType) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            caseType: GtkSourceChangeCaseType,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(caseType: ChangeCaseType) -> Unit>().get().invoke(
            caseType.run {
                ChangeCaseType.fromNativeValue(this)
            }
        )
    }
        .reinterpret()

private val onChangeNumberFunc: CPointer<CFunction<(gint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        count: gint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(count: gint) -> Unit>().get().invoke(count)
}
    .reinterpret()

private val onJoinLinesFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onLineMarkActivatedFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTextIter>,
            guint,
            GdkModifierType,
            gint,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        iter: CPointer<GtkTextIter>?,
        button: guint,
        state: GdkModifierType,
        nPresses: gint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            iter: TextIter,
            button: guint,
            state: ModifierType,
            nPresses: gint,
        ) -> Unit
        >().get().invoke(
        iter!!.run {
            TextIter(this)
        },
        button,
        state.run {
            ModifierType(this)
        },
        nPresses
    )
}
    .reinterpret()

private val onMoveLinesFunc: CPointer<CFunction<(gboolean) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        down: gboolean,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(down: Boolean) -> Unit>().get().invoke(down.asBoolean())
}
    .reinterpret()

private val onMoveToMatchingBracketFunc: CPointer<CFunction<(gboolean) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        extendSelection: gboolean,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(extendSelection: Boolean) -> Unit>().get().invoke(extendSelection.asBoolean())
}
    .reinterpret()

private val onMoveWordsFunc: CPointer<CFunction<(gint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        count: gint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(count: gint) -> Unit>().get().invoke(count)
}
    .reinterpret()

private val onShowCompletionFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onSmartHomeEndFunc: CPointer<CFunction<(CPointer<GtkTextIter>, gint) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            iter: CPointer<GtkTextIter>?,
            count: gint,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(iter: TextIter, count: gint) -> Unit>().get().invoke(
            iter!!.run {
                TextIter(this)
            },
            count
        )
    }
        .reinterpret()
