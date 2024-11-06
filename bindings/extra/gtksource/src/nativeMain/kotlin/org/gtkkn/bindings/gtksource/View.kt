// This is a generated file. Do not modify.
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
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkModifierType
import org.gtkkn.native.gobject.g_signal_connect_data
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
import kotlin.Int
import kotlin.String
import kotlin.UInt
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
 * - method `get_gutter`: C function gtk_source_view_get_gutter is ignored
 * - parameter `priority`: Unsupported pointer to primitive type
 * - signal `push-snippet`: Unsupported parameter `location` : location: InOut parameter is not supported
 */
public open class View(
    pointer: CPointer<GtkSourceView>,
) : TextView(pointer.reinterpret()),
    KGTyped {
    public val gtksourceViewPointer: CPointer<GtkSourceView>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = gPointer.reinterpret()

    public open var autoIndent: Boolean
        /**
         * Returns whether auto-indentation of text is enabled.
         *
         * @return true if auto indentation is enabled.
         */
        get() = gtk_source_view_get_auto_indent(gtksourceViewPointer.reinterpret()).asBoolean()

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
        set(enable) = gtk_source_view_set_auto_indent(gtksourceViewPointer.reinterpret(), enable.asGBoolean())

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
        get() =
            gtk_source_view_get_background_pattern(gtksourceViewPointer.reinterpret()).run {
                BackgroundPatternType.fromNativeValue(this)
            }

        /**
         * Set if and how the background pattern should be displayed.
         *
         * @param backgroundPattern the #GtkSourceBackgroundPatternType.
         */
        set(
            backgroundPattern
        ) = gtk_source_view_set_background_pattern(gtksourceViewPointer.reinterpret(), backgroundPattern.nativeValue)

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
        get() =
            gtk_source_view_get_completion(gtksourceViewPointer.reinterpret())!!.run {
                Completion(reinterpret())
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
        get() = gtk_source_view_get_enable_snippets(gtksourceViewPointer.reinterpret()).asBoolean()

        /**
         * Sets the [property@View:enable-snippets] property.
         *
         * If @enable_snippets is true, matching snippets found in the
         * [class@SnippetManager] may be expanded when the user presses
         * Tab after a word in the [class@View].
         *
         * @param enableSnippets if snippets should be enabled
         */
        set(
            enableSnippets
        ) = gtk_source_view_set_enable_snippets(gtksourceViewPointer.reinterpret(), enableSnippets.asGBoolean())

    public open var highlightCurrentLine: Boolean
        /**
         * Returns whether the current line is highlighted.
         *
         * @return true if the current line is highlighted.
         */
        get() = gtk_source_view_get_highlight_current_line(gtksourceViewPointer.reinterpret()).asBoolean()

        /**
         * If @highlight is true the current line will be highlighted.
         *
         * @param highlight whether to highlight the current line.
         */
        set(
            highlight
        ) = gtk_source_view_set_highlight_current_line(gtksourceViewPointer.reinterpret(), highlight.asGBoolean())

    public open var indentOnTab: Boolean
        /**
         * Returns whether when the tab key is pressed the current selection
         * should get indented instead of replaced with the `\t` character.
         *
         * @return true if the selection is indented when tab is pressed.
         */
        get() = gtk_source_view_get_indent_on_tab(gtksourceViewPointer.reinterpret()).asBoolean()

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
        set(enable) = gtk_source_view_set_indent_on_tab(gtksourceViewPointer.reinterpret(), enable.asGBoolean())

    /**
     * Width of an indentation step expressed in number of spaces.
     */
    public open var indentWidth: Int
        /**
         * Returns the number of spaces to use for each step of indent.
         *
         * See [method@View.set_indent_width] for details.
         *
         * @return indent width.
         */
        get() = gtk_source_view_get_indent_width(gtksourceViewPointer.reinterpret())

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
        set(width) = gtk_source_view_set_indent_width(gtksourceViewPointer.reinterpret(), width)

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
        get() =
            gtk_source_view_get_indenter(gtksourceViewPointer.reinterpret())?.run {
                Indenter.wrap(reinterpret())
            }

        /**
         * Sets the indenter for @view to @indenter.
         *
         * Note that the indenter will not be used unless #GtkSourceView:auto-indent
         * has been set to true.
         *
         * @param indenter a #GtkSourceIndenter or null
         */
        set(
            indenter
        ) = gtk_source_view_set_indenter(gtksourceViewPointer.reinterpret(), indenter?.gtksourceIndenterPointer)

    public open var insertSpacesInsteadOfTabs: Boolean
        /**
         * Returns whether when inserting a tabulator character it should
         * be replaced by a group of space characters.
         *
         * @return true if spaces are inserted instead of tabs.
         */
        get() = gtk_source_view_get_insert_spaces_instead_of_tabs(gtksourceViewPointer.reinterpret()).asBoolean()

        /**
         * If true a tab key pressed is replaced by a group of space characters.
         *
         * Of course it is still possible to insert a real `\t` programmatically with the
         * [class@Gtk.TextBuffer] API.
         *
         * @param enable whether to insert spaces instead of tabs.
         */
        set(
            enable
        ) = gtk_source_view_set_insert_spaces_instead_of_tabs(gtksourceViewPointer.reinterpret(), enable.asGBoolean())

    /**
     * Position of the right margin.
     */
    public open var rightMarginPosition: UInt
        /**
         * Gets the position of the right margin in the given @view.
         *
         * @return the position of the right margin.
         */
        get() = gtk_source_view_get_right_margin_position(gtksourceViewPointer.reinterpret())

        /**
         * Sets the position of the right margin in the given @view.
         *
         * @param pos the width in characters where to position the right margin.
         */
        set(pos) = gtk_source_view_set_right_margin_position(gtksourceViewPointer.reinterpret(), pos)

    /**
     * Whether to display line mark pixbufs
     */
    public open var showLineMarks: Boolean
        /**
         * Returns whether line marks are displayed beside the text.
         *
         * @return true if the line marks are displayed.
         */
        get() = gtk_source_view_get_show_line_marks(gtksourceViewPointer.reinterpret()).asBoolean()

        /**
         * If true line marks will be displayed beside the text.
         *
         * @param show whether line marks should be displayed.
         */
        set(show) = gtk_source_view_set_show_line_marks(gtksourceViewPointer.reinterpret(), show.asGBoolean())

    /**
     * Whether to display line numbers
     */
    public open var showLineNumbers: Boolean
        /**
         * Returns whether line numbers are displayed beside the text.
         *
         * @return true if the line numbers are displayed.
         */
        get() = gtk_source_view_get_show_line_numbers(gtksourceViewPointer.reinterpret()).asBoolean()

        /**
         * If true line numbers will be displayed beside the text.
         *
         * @param show whether line numbers should be displayed.
         */
        set(show) = gtk_source_view_set_show_line_numbers(gtksourceViewPointer.reinterpret(), show.asGBoolean())

    /**
     * Whether to display the right margin.
     */
    public open var showRightMargin: Boolean
        /**
         * Returns whether a right margin is displayed.
         *
         * @return true if the right margin is shown.
         */
        get() = gtk_source_view_get_show_right_margin(gtksourceViewPointer.reinterpret()).asBoolean()

        /**
         * If true a right margin is displayed.
         *
         * @param show whether to show a right margin.
         */
        set(show) = gtk_source_view_set_show_right_margin(gtksourceViewPointer.reinterpret(), show.asGBoolean())

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
        get() = gtk_source_view_get_smart_backspace(gtksourceViewPointer.reinterpret()).asBoolean()

        /**
         * When set to true, pressing the Backspace key will try to delete spaces
         * up to the previous tab stop.
         *
         * @param smartBackspace whether to enable smart Backspace handling.
         */
        set(
            smartBackspace
        ) = gtk_source_view_set_smart_backspace(gtksourceViewPointer.reinterpret(), smartBackspace.asGBoolean())

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
        get() =
            gtk_source_view_get_smart_home_end(gtksourceViewPointer.reinterpret()).run {
                SmartHomeEndType.fromNativeValue(this)
            }

        /**
         * Set the desired movement of the cursor when HOME and END keys
         * are pressed.
         *
         * @param smartHomeEnd the desired behavior among #GtkSourceSmartHomeEndType.
         */
        set(
            smartHomeEnd
        ) = gtk_source_view_set_smart_home_end(gtksourceViewPointer.reinterpret(), smartHomeEnd.nativeValue)

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
        get() =
            gtk_source_view_get_space_drawer(gtksourceViewPointer.reinterpret())!!.run {
                SpaceDrawer(reinterpret())
            }

    /**
     * Width of a tab character expressed in number of spaces.
     */
    public open var tabWidth: UInt
        /**
         * Returns the width of tabulation in characters.
         *
         * @return width of tab.
         */
        get() = gtk_source_view_get_tab_width(gtksourceViewPointer.reinterpret())

        /**
         * Sets the width of tabulation in characters.
         *
         * The #GtkTextBuffer still contains `\t` characters,
         * but they can take a different visual width in a [class@View] widget.
         *
         * @param width width of tab in characters.
         */
        set(width) = gtk_source_view_set_tab_width(gtksourceViewPointer.reinterpret(), width)

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
    public constructor() : this(gtk_source_view_new()!!.reinterpret())

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
    ) : this(gtk_source_view_new_with_buffer(buffer.gtksourceBufferPointer.reinterpret())!!.reinterpret())

    /**
     * Returns whether auto-indentation of text is enabled.
     *
     * @return true if auto indentation is enabled.
     */
    public open fun getAutoIndent(): Boolean =
        gtk_source_view_get_auto_indent(gtksourceViewPointer.reinterpret()).asBoolean()

    /**
     * Returns the #GtkSourceBackgroundPatternType specifying if and how
     * the background pattern should be displayed for this @view.
     *
     * @return the #GtkSourceBackgroundPatternType.
     */
    public open fun getBackgroundPattern(): BackgroundPatternType =
        gtk_source_view_get_background_pattern(gtksourceViewPointer.reinterpret()).run {
            BackgroundPatternType.fromNativeValue(this)
        }

    /**
     * Gets the [class@Completion] associated with @view.
     *
     * The returned object is guaranteed to be the same for the lifetime of @view.
     * Each `GtkSourceView` object has a different [class@Completion].
     *
     * @return the #GtkSourceCompletion associated with @view.
     */
    public open fun getCompletion(): Completion =
        gtk_source_view_get_completion(gtksourceViewPointer.reinterpret())!!.run {
            Completion(reinterpret())
        }

    /**
     * Gets the [property@View:enable-snippets] property.
     *
     * If true, matching snippets found in the [class@SnippetManager]
     * may be expanded when the user presses Tab after a word in the [class@View].
     *
     * @return true if enabled
     */
    public open fun getEnableSnippets(): Boolean =
        gtk_source_view_get_enable_snippets(gtksourceViewPointer.reinterpret()).asBoolean()

    /**
     * Returns whether the current line is highlighted.
     *
     * @return true if the current line is highlighted.
     */
    public open fun getHighlightCurrentLine(): Boolean =
        gtk_source_view_get_highlight_current_line(gtksourceViewPointer.reinterpret()).asBoolean()

    /**
     * Gets the [class@Hover] associated with @view.
     *
     * The returned object is guaranteed to be the same for the lifetime of @view.
     * Each [class@View] object has a different [class@Hover].
     *
     * @return a #GtkSourceHover associated with @view.
     */
    public open fun getHover(): Hover =
        gtk_source_view_get_hover(gtksourceViewPointer.reinterpret())!!.run {
            Hover(reinterpret())
        }

    /**
     * Returns whether when the tab key is pressed the current selection
     * should get indented instead of replaced with the `\t` character.
     *
     * @return true if the selection is indented when tab is pressed.
     */
    public open fun getIndentOnTab(): Boolean =
        gtk_source_view_get_indent_on_tab(gtksourceViewPointer.reinterpret()).asBoolean()

    /**
     * Returns the number of spaces to use for each step of indent.
     *
     * See [method@View.set_indent_width] for details.
     *
     * @return indent width.
     */
    public open fun getIndentWidth(): Int = gtk_source_view_get_indent_width(gtksourceViewPointer.reinterpret())

    /**
     * Gets the [property@View:indenter] property.
     *
     * @return a #GtkSourceIndenter or null
     */
    public open fun getIndenter(): Indenter? =
        gtk_source_view_get_indenter(gtksourceViewPointer.reinterpret())?.run {
            Indenter.wrap(reinterpret())
        }

    /**
     * Returns whether when inserting a tabulator character it should
     * be replaced by a group of space characters.
     *
     * @return true if spaces are inserted instead of tabs.
     */
    public open fun getInsertSpacesInsteadOfTabs(): Boolean =
        gtk_source_view_get_insert_spaces_instead_of_tabs(gtksourceViewPointer.reinterpret()).asBoolean()

    /**
     * Gets the position of the right margin in the given @view.
     *
     * @return the position of the right margin.
     */
    public open fun getRightMarginPosition(): UInt =
        gtk_source_view_get_right_margin_position(gtksourceViewPointer.reinterpret())

    /**
     * Returns whether line marks are displayed beside the text.
     *
     * @return true if the line marks are displayed.
     */
    public open fun getShowLineMarks(): Boolean =
        gtk_source_view_get_show_line_marks(gtksourceViewPointer.reinterpret()).asBoolean()

    /**
     * Returns whether line numbers are displayed beside the text.
     *
     * @return true if the line numbers are displayed.
     */
    public open fun getShowLineNumbers(): Boolean =
        gtk_source_view_get_show_line_numbers(gtksourceViewPointer.reinterpret()).asBoolean()

    /**
     * Returns whether a right margin is displayed.
     *
     * @return true if the right margin is shown.
     */
    public open fun getShowRightMargin(): Boolean =
        gtk_source_view_get_show_right_margin(gtksourceViewPointer.reinterpret()).asBoolean()

    /**
     * Returns true if pressing the Backspace key will try to delete spaces
     * up to the previous tab stop.
     *
     * @return true if smart Backspace handling is enabled.
     */
    public open fun getSmartBackspace(): Boolean =
        gtk_source_view_get_smart_backspace(gtksourceViewPointer.reinterpret()).asBoolean()

    /**
     * Returns a [enum@SmartHomeEndType] end value specifying
     * how the cursor will move when HOME and END keys are pressed.
     *
     * @return a #GtkSourceSmartHomeEndType value.
     */
    public open fun getSmartHomeEnd(): SmartHomeEndType =
        gtk_source_view_get_smart_home_end(gtksourceViewPointer.reinterpret()).run {
            SmartHomeEndType.fromNativeValue(this)
        }

    /**
     * Gets the [class@SpaceDrawer] associated with @view.
     *
     * The returned object is guaranteed to be the same for the lifetime of @view.
     * Each [class@View] object has a different [class@SpaceDrawer].
     *
     * @return the #GtkSourceSpaceDrawer associated with @view.
     */
    public open fun getSpaceDrawer(): SpaceDrawer =
        gtk_source_view_get_space_drawer(gtksourceViewPointer.reinterpret())!!.run {
            SpaceDrawer(reinterpret())
        }

    /**
     * Returns the width of tabulation in characters.
     *
     * @return width of tab.
     */
    public open fun getTabWidth(): UInt = gtk_source_view_get_tab_width(gtksourceViewPointer.reinterpret())

    /**
     * Determines the visual column at @iter taking into consideration the
     * [property@View:tab-width] of @view.
     *
     * @param iter a position in @view.
     * @return the visual column at @iter.
     */
    public open fun getVisualColumn(iter: TextIter): UInt =
        gtk_source_view_get_visual_column(gtksourceViewPointer.reinterpret(), iter.gtkTextIterPointer)

    /**
     * Inserts one indentation level at the beginning of the specified lines. The
     * empty lines are not indented.
     *
     * @param start #GtkTextIter of the first line to indent
     * @param end #GtkTextIter of the last line to indent
     */
    public open fun indentLines(
        start: TextIter,
        end: TextIter,
    ): Unit =
        gtk_source_view_indent_lines(
            gtksourceViewPointer.reinterpret(),
            start.gtkTextIterPointer,
            end.gtkTextIterPointer
        )

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
    public open fun pushSnippet(
        snippet: Snippet,
        location: TextIter? = null,
    ): Unit =
        gtk_source_view_push_snippet(
            gtksourceViewPointer.reinterpret(),
            snippet.gtksourceSnippetPointer.reinterpret(),
            location?.gtkTextIterPointer
        )

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
    public open fun setAutoIndent(enable: Boolean): Unit =
        gtk_source_view_set_auto_indent(gtksourceViewPointer.reinterpret(), enable.asGBoolean())

    /**
     * Set if and how the background pattern should be displayed.
     *
     * @param backgroundPattern the #GtkSourceBackgroundPatternType.
     */
    public open fun setBackgroundPattern(backgroundPattern: BackgroundPatternType): Unit =
        gtk_source_view_set_background_pattern(gtksourceViewPointer.reinterpret(), backgroundPattern.nativeValue)

    /**
     * Sets the [property@View:enable-snippets] property.
     *
     * If @enable_snippets is true, matching snippets found in the
     * [class@SnippetManager] may be expanded when the user presses
     * Tab after a word in the [class@View].
     *
     * @param enableSnippets if snippets should be enabled
     */
    public open fun setEnableSnippets(enableSnippets: Boolean): Unit =
        gtk_source_view_set_enable_snippets(gtksourceViewPointer.reinterpret(), enableSnippets.asGBoolean())

    /**
     * If @highlight is true the current line will be highlighted.
     *
     * @param highlight whether to highlight the current line.
     */
    public open fun setHighlightCurrentLine(highlight: Boolean): Unit =
        gtk_source_view_set_highlight_current_line(gtksourceViewPointer.reinterpret(), highlight.asGBoolean())

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
    public open fun setIndentOnTab(enable: Boolean): Unit =
        gtk_source_view_set_indent_on_tab(gtksourceViewPointer.reinterpret(), enable.asGBoolean())

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
    public open fun setIndentWidth(width: Int): Unit =
        gtk_source_view_set_indent_width(gtksourceViewPointer.reinterpret(), width)

    /**
     * Sets the indenter for @view to @indenter.
     *
     * Note that the indenter will not be used unless #GtkSourceView:auto-indent
     * has been set to true.
     *
     * @param indenter a #GtkSourceIndenter or null
     */
    public open fun setIndenter(indenter: Indenter? = null): Unit =
        gtk_source_view_set_indenter(gtksourceViewPointer.reinterpret(), indenter?.gtksourceIndenterPointer)

    /**
     * If true a tab key pressed is replaced by a group of space characters.
     *
     * Of course it is still possible to insert a real `\t` programmatically with the
     * [class@Gtk.TextBuffer] API.
     *
     * @param enable whether to insert spaces instead of tabs.
     */
    public open fun setInsertSpacesInsteadOfTabs(enable: Boolean): Unit =
        gtk_source_view_set_insert_spaces_instead_of_tabs(gtksourceViewPointer.reinterpret(), enable.asGBoolean())

    /**
     * Sets attributes and priority for the @category.
     *
     * @param category the category.
     * @param attributes mark attributes.
     * @param priority priority of the category.
     */
    public open fun setMarkAttributes(
        category: String,
        attributes: MarkAttributes,
        priority: Int,
    ): Unit =
        gtk_source_view_set_mark_attributes(
            gtksourceViewPointer.reinterpret(),
            category,
            attributes.gtksourceMarkAttributesPointer.reinterpret(),
            priority
        )

    /**
     * Sets the position of the right margin in the given @view.
     *
     * @param pos the width in characters where to position the right margin.
     */
    public open fun setRightMarginPosition(pos: UInt): Unit =
        gtk_source_view_set_right_margin_position(gtksourceViewPointer.reinterpret(), pos)

    /**
     * If true line marks will be displayed beside the text.
     *
     * @param show whether line marks should be displayed.
     */
    public open fun setShowLineMarks(show: Boolean): Unit =
        gtk_source_view_set_show_line_marks(gtksourceViewPointer.reinterpret(), show.asGBoolean())

    /**
     * If true line numbers will be displayed beside the text.
     *
     * @param show whether line numbers should be displayed.
     */
    public open fun setShowLineNumbers(show: Boolean): Unit =
        gtk_source_view_set_show_line_numbers(gtksourceViewPointer.reinterpret(), show.asGBoolean())

    /**
     * If true a right margin is displayed.
     *
     * @param show whether to show a right margin.
     */
    public open fun setShowRightMargin(show: Boolean): Unit =
        gtk_source_view_set_show_right_margin(gtksourceViewPointer.reinterpret(), show.asGBoolean())

    /**
     * When set to true, pressing the Backspace key will try to delete spaces
     * up to the previous tab stop.
     *
     * @param smartBackspace whether to enable smart Backspace handling.
     */
    public open fun setSmartBackspace(smartBackspace: Boolean): Unit =
        gtk_source_view_set_smart_backspace(gtksourceViewPointer.reinterpret(), smartBackspace.asGBoolean())

    /**
     * Set the desired movement of the cursor when HOME and END keys
     * are pressed.
     *
     * @param smartHomeEnd the desired behavior among #GtkSourceSmartHomeEndType.
     */
    public open fun setSmartHomeEnd(smartHomeEnd: SmartHomeEndType): Unit =
        gtk_source_view_set_smart_home_end(gtksourceViewPointer.reinterpret(), smartHomeEnd.nativeValue)

    /**
     * Sets the width of tabulation in characters.
     *
     * The #GtkTextBuffer still contains `\t` characters,
     * but they can take a different visual width in a [class@View] widget.
     *
     * @param width width of tab in characters.
     */
    public open fun setTabWidth(width: UInt): Unit =
        gtk_source_view_set_tab_width(gtksourceViewPointer.reinterpret(), width)

    /**
     * Removes one indentation level at the beginning of the
     * specified lines.
     *
     * @param start #GtkTextIter of the first line to indent
     * @param end #GtkTextIter of the last line to indent
     */
    public open fun unindentLines(
        start: TextIter,
        end: TextIter,
    ): Unit =
        gtk_source_view_unindent_lines(
            gtksourceViewPointer.reinterpret(),
            start.gtkTextIterPointer,
            end.gtkTextIterPointer
        )

    /**
     * Keybinding signal to change case of the text at the current cursor position.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `caseType` the case to use
     */
    public fun connectChangeCase(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (caseType: ChangeCaseType) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "change-case",
            connectChangeCaseFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Keybinding signal to edit a number at the current cursor position.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `count` the number to add to the number at the current position
     */
    public fun connectChangeNumber(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (count: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "change-number",
            connectChangeNumberFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Keybinding signal to join the lines currently selected.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectJoinLines(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "join-lines",
            connectJoinLinesFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a line mark has been activated (for instance when there
     * was a button press in the line marks gutter).
     *
     * You can use @iter to determine on which line the activation took place.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `iter` a #GtkTextIter; `button` the button that was pressed; `state` the modifier state, if any; `nPresses` the number of presses
     */
    public fun connectLineMarkActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            iter: TextIter,
            button: UInt,
            state: ModifierType,
            nPresses: Int,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "line-mark-activated",
            connectLineMarkActivatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The signal is a keybinding which gets emitted when the user initiates moving a line.
     *
     * The default binding key is Alt+Up/Down arrow. And moves the currently selected lines,
     * or the current line up or down by one line.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `down` true to move down, false to move up.
     */
    public fun connectMoveLines(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (down: Boolean) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "move-lines",
            connectMoveLinesFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Keybinding signal to move the cursor to the matching bracket.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `extendSelection` true if the move should extend the selection
     */
    public fun connectMoveToMatchingBracket(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (extendSelection: Boolean) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "move-to-matching-bracket",
            connectMoveToMatchingBracketFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The signal is a keybinding which gets emitted when the user initiates moving a word.
     *
     * The default binding key is Alt+Left/Right Arrow and moves the current selection, or the current
     * word by one word.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `count` the number of words to move over
     */
    public fun connectMoveWords(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (count: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "move-words",
            connectMoveWordsFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

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
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectShowCompletion(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "show-completion",
            connectShowCompletionFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a the cursor was moved according to the smart home end setting.
     *
     * The signal is emitted after the cursor is moved, but
     * during the [signal@Gtk.TextView::move-cursor] action. This can be used to find
     * out whether the cursor was moved by a normal home/end or by a smart
     * home/end.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `iter` a #GtkTextIter; `count` the count
     */
    public fun connectSmartHomeEnd(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (iter: TextIter, count: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "smart-home-end",
            connectSmartHomeEndFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<View> {
        override val type: GeneratedClassKGType<View> =
            GeneratedClassKGType(gtk_source_view_get_type()) { View(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }
    }
}

private val connectChangeCaseFunc: CPointer<CFunction<(GtkSourceChangeCaseType) -> Unit>> =
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
    }.reinterpret()

private val connectChangeNumberFunc: CPointer<CFunction<(Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            count: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(count: Int) -> Unit>().get().invoke(count)
    }.reinterpret()

private val connectJoinLinesFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectLineMarkActivatedFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTextIter>,
            UInt,
            GdkModifierType,
            Int,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            iter: CPointer<GtkTextIter>?,
            button: UInt,
            state: GdkModifierType,
            nPresses: Int,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    iter: TextIter,
                    button: UInt,
                    state: ModifierType,
                    nPresses: Int,
                ) -> Unit
            >()
            .get()
            .invoke(
                iter!!.run {
                    TextIter(reinterpret())
                },
                button,
                state.run {
                    ModifierType(this)
                },
                nPresses
            )
    }.reinterpret()

private val connectMoveLinesFunc: CPointer<CFunction<(Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            down: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(down: Boolean) -> Unit>().get().invoke(down.asBoolean())
    }.reinterpret()

private val connectMoveToMatchingBracketFunc: CPointer<CFunction<(Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            extendSelection: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(extendSelection: Boolean) -> Unit>().get().invoke(extendSelection.asBoolean())
    }.reinterpret()

private val connectMoveWordsFunc: CPointer<CFunction<(Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            count: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(count: Int) -> Unit>().get().invoke(count)
    }.reinterpret()

private val connectShowCompletionFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectSmartHomeEndFunc: CPointer<CFunction<(CPointer<GtkTextIter>, Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            iter: CPointer<GtkTextIter>?,
            count: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(iter: TextIter, count: Int) -> Unit>().get().invoke(
            iter!!.run {
                TextIter(reinterpret())
            },
            count
        )
    }.reinterpret()
