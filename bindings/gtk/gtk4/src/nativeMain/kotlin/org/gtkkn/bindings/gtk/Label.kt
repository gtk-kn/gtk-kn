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
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_6
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_8
import org.gtkkn.bindings.pango.AttrList
import org.gtkkn.bindings.pango.EllipsizeMode
import org.gtkkn.bindings.pango.Layout
import org.gtkkn.bindings.pango.TabArray
import org.gtkkn.bindings.pango.WrapMode
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAccessibleText
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkLabel
import org.gtkkn.native.gtk.GtkMovementStep
import org.gtkkn.native.gtk.gtk_label_get_attributes
import org.gtkkn.native.gtk.gtk_label_get_current_uri
import org.gtkkn.native.gtk.gtk_label_get_ellipsize
import org.gtkkn.native.gtk.gtk_label_get_extra_menu
import org.gtkkn.native.gtk.gtk_label_get_justify
import org.gtkkn.native.gtk.gtk_label_get_label
import org.gtkkn.native.gtk.gtk_label_get_layout
import org.gtkkn.native.gtk.gtk_label_get_lines
import org.gtkkn.native.gtk.gtk_label_get_max_width_chars
import org.gtkkn.native.gtk.gtk_label_get_mnemonic_keyval
import org.gtkkn.native.gtk.gtk_label_get_mnemonic_widget
import org.gtkkn.native.gtk.gtk_label_get_natural_wrap_mode
import org.gtkkn.native.gtk.gtk_label_get_selectable
import org.gtkkn.native.gtk.gtk_label_get_single_line_mode
import org.gtkkn.native.gtk.gtk_label_get_tabs
import org.gtkkn.native.gtk.gtk_label_get_text
import org.gtkkn.native.gtk.gtk_label_get_type
import org.gtkkn.native.gtk.gtk_label_get_use_markup
import org.gtkkn.native.gtk.gtk_label_get_use_underline
import org.gtkkn.native.gtk.gtk_label_get_width_chars
import org.gtkkn.native.gtk.gtk_label_get_wrap
import org.gtkkn.native.gtk.gtk_label_get_wrap_mode
import org.gtkkn.native.gtk.gtk_label_get_xalign
import org.gtkkn.native.gtk.gtk_label_get_yalign
import org.gtkkn.native.gtk.gtk_label_new
import org.gtkkn.native.gtk.gtk_label_new_with_mnemonic
import org.gtkkn.native.gtk.gtk_label_select_region
import org.gtkkn.native.gtk.gtk_label_set_attributes
import org.gtkkn.native.gtk.gtk_label_set_ellipsize
import org.gtkkn.native.gtk.gtk_label_set_extra_menu
import org.gtkkn.native.gtk.gtk_label_set_justify
import org.gtkkn.native.gtk.gtk_label_set_label
import org.gtkkn.native.gtk.gtk_label_set_lines
import org.gtkkn.native.gtk.gtk_label_set_markup
import org.gtkkn.native.gtk.gtk_label_set_markup_with_mnemonic
import org.gtkkn.native.gtk.gtk_label_set_max_width_chars
import org.gtkkn.native.gtk.gtk_label_set_mnemonic_widget
import org.gtkkn.native.gtk.gtk_label_set_natural_wrap_mode
import org.gtkkn.native.gtk.gtk_label_set_selectable
import org.gtkkn.native.gtk.gtk_label_set_single_line_mode
import org.gtkkn.native.gtk.gtk_label_set_tabs
import org.gtkkn.native.gtk.gtk_label_set_text
import org.gtkkn.native.gtk.gtk_label_set_text_with_mnemonic
import org.gtkkn.native.gtk.gtk_label_set_use_markup
import org.gtkkn.native.gtk.gtk_label_set_use_underline
import org.gtkkn.native.gtk.gtk_label_set_width_chars
import org.gtkkn.native.gtk.gtk_label_set_wrap
import org.gtkkn.native.gtk.gtk_label_set_wrap_mode
import org.gtkkn.native.gtk.gtk_label_set_xalign
import org.gtkkn.native.gtk.gtk_label_set_yalign
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The `GtkLabel` widget displays a small amount of text.
 *
 * As the name implies, most labels are used to label another widget
 * such as a [class@Button].
 *
 * ![An example GtkLabel](label.png)
 *
 * ## CSS nodes
 *
 * ```
 * label
 * ├── [selection]
 * ├── [link]
 * ┊
 * ╰── [link]
 * ```
 *
 * `GtkLabel` has a single CSS node with the name label. A wide variety
 * of style classes may be applied to labels, such as .title, .subtitle,
 * .dim-label, etc. In the `GtkShortcutsWindow`, labels are used with the
 * .keycap style class.
 *
 * If the label has a selection, it gets a subnode with name selection.
 *
 * If the label has links, there is one subnode per link. These subnodes
 * carry the link or visited state depending on whether they have been
 * visited. In this case, label node also gets a .link style class.
 *
 * ## GtkLabel as GtkBuildable
 *
 * The GtkLabel implementation of the GtkBuildable interface supports a
 * custom `<attributes>` element, which supports any number of `<attribute>`
 * elements. The `<attribute>` element has attributes named “name“, “value“,
 * “start“ and “end“ and allows you to specify [struct@Pango.Attribute]
 * values for this label.
 *
 * An example of a UI definition fragment specifying Pango attributes:
 *
 * ```xml
 * <object class="GtkLabel">
 *   <attributes>
 *     <attribute name="weight" value="PANGO_WEIGHT_BOLD"/>
 *     <attribute name="background" value="red" start="5" end="10"/>
 *   </attributes>
 * </object>
 * ```
 *
 * The start and end attributes specify the range of characters to which the
 * Pango attribute applies. If start and end are not specified, the attribute is
 * applied to the whole text. Note that specifying ranges does not make much
 * sense with translatable attributes. Use markup embedded in the translatable
 * content instead.
 *
 * ## Accessibility
 *
 * `GtkLabel` uses the %GTK_ACCESSIBLE_ROLE_LABEL role.
 *
 * ## Mnemonics
 *
 * Labels may contain “mnemonics”. Mnemonics are underlined characters in the
 * label, used for keyboard navigation. Mnemonics are created by providing a
 * string with an underscore before the mnemonic character, such as `"_File"`,
 * to the functions [ctor@Gtk.Label.new_with_mnemonic] or
 * [method@Gtk.Label.set_text_with_mnemonic].
 *
 * Mnemonics automatically activate any activatable widget the label is
 * inside, such as a [class@Gtk.Button]; if the label is not inside the
 * mnemonic’s target widget, you have to tell the label about the target
 * using [method@Gtk.Label.set_mnemonic_widget].
 *
 * Here’s a simple example where the label is inside a button:
 *
 * ```c
 * // Pressing Alt+H will activate this button
 * GtkWidget *button = gtk_button_new ();
 * GtkWidget *label = gtk_label_new_with_mnemonic ("_Hello");
 * gtk_button_set_child (GTK_BUTTON (button), label);
 * ```
 *
 * There’s a convenience function to create buttons with a mnemonic label
 * already inside:
 *
 * ```c
 * // Pressing Alt+H will activate this button
 * GtkWidget *button = gtk_button_new_with_mnemonic ("_Hello");
 * ```
 *
 * To create a mnemonic for a widget alongside the label, such as a
 * [class@Gtk.Entry], you have to point the label at the entry with
 * [method@Gtk.Label.set_mnemonic_widget]:
 *
 * ```c
 * // Pressing Alt+H will focus the entry
 * GtkWidget *entry = gtk_entry_new ();
 * GtkWidget *label = gtk_label_new_with_mnemonic ("_Hello");
 * gtk_label_set_mnemonic_widget (GTK_LABEL (label), entry);
 * ```
 *
 * ## Markup (styled text)
 *
 * To make it easy to format text in a label (changing colors,
 * fonts, etc.), label text can be provided in a simple
 * markup format:
 *
 * Here’s how to create a label with a small font:
 * ```c
 * GtkWidget *label = gtk_label_new (NULL);
 * gtk_label_set_markup (GTK_LABEL (label), "<small>Small text</small>");
 * ```
 *
 * (See the Pango manual for complete documentation] of available
 * tags, [func@Pango.parse_markup])
 *
 * The markup passed to [method@Gtk.Label.set_markup] must be valid; for example,
 * literal `<`, `>` and `&` characters must be escaped as ``&lt;``, ``&gt;``, and ``&amp;``.
 * If you pass text obtained from the user, file, or a network to
 * [method@Gtk.Label.set_markup], you’ll want to escape it with
 * [func@GLib.markup_escape_text] or [func@GLib.markup_printf_escaped].
 *
 * Markup strings are just a convenient way to set the [struct@Pango.AttrList]
 * on a label; [method@Gtk.Label.set_attributes] may be a simpler way to set
 * attributes in some cases. Be careful though; [struct@Pango.AttrList] tends
 * to cause internationalization problems, unless you’re applying attributes
 * to the entire string (i.e. unless you set the range of each attribute
 * to [0, %G_MAXINT)). The reason is that specifying the start_index and
 * end_index for a [struct@Pango.Attribute] requires knowledge of the exact
 * string being displayed, so translations will cause problems.
 *
 * ## Selectable labels
 *
 * Labels can be made selectable with [method@Gtk.Label.set_selectable].
 * Selectable labels allow the user to copy the label contents to
 * the clipboard. Only labels that contain useful-to-copy information—such
 * as error messages—should be made selectable.
 *
 * ## Text layout
 *
 * A label can contain any number of paragraphs, but will have
 * performance problems if it contains more than a small number.
 * Paragraphs are separated by newlines or other paragraph separators
 * understood by Pango.
 *
 * Labels can automatically wrap text if you call [method@Gtk.Label.set_wrap].
 *
 * [method@Gtk.Label.set_justify] sets how the lines in a label align
 * with one another. If you want to set how the label as a whole aligns
 * in its available space, see the [property@Gtk.Widget:halign] and
 * [property@Gtk.Widget:valign] properties.
 *
 * The [property@Gtk.Label:width-chars] and [property@Gtk.Label:max-width-chars]
 * properties can be used to control the size allocation of ellipsized or
 * wrapped labels. For ellipsizing labels, if either is specified (and less
 * than the actual text size), it is used as the minimum width, and the actual
 * text size is used as the natural width of the label. For wrapping labels,
 * width-chars is used as the minimum width, if specified, and max-width-chars
 * is used as the natural width. Even if max-width-chars specified, wrapping
 * labels will be rewrapped to use all of the available width.
 *
 * ## Links
 *
 * GTK supports markup for clickable hyperlinks in addition to regular Pango
 * markup. The markup for links is borrowed from HTML, using the `<a>` with
 * “href“, “title“ and “class“ attributes. GTK renders links similar to the
 * way they appear in web browsers, with colored, underlined text. The “title“
 * attribute is displayed as a tooltip on the link. The “class“ attribute is
 * used as style class on the CSS node for the link.
 *
 * An example of inline links looks like this:
 *
 * ```c
 * const char *text =
 * "Go to the "
 * "<a href=\"https://www.gtk.org\" title=\"`&lt;`i`&gt;`Our`&lt;`/i`&gt;` website\">"
 * "GTK website</a> for more...";
 * GtkWidget *label = gtk_label_new (NULL);
 * gtk_label_set_markup (GTK_LABEL (label), text);
 * ```
 *
 * It is possible to implement custom handling for links and their tooltips
 * with the [signal@Gtk.Label::activate-link] signal and the
 * [method@Gtk.Label.get_current_uri] function.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `x`: x: Out parameter is not supported
 * - parameter `start`: start: Out parameter is not supported
 */
public open class Label(public val gtkLabelPointer: CPointer<GtkLabel>) :
    Widget(gtkLabelPointer.reinterpret()),
    AccessibleText,
    KGTyped {
    override val gtkAccessibleTextPointer: CPointer<GtkAccessibleText>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * A list of style attributes to apply to the text of the label.
     */
    public open var attributes: AttrList?
        /**
         * Gets the label's attribute list.
         *
         * This is the [struct@Pango.AttrList] that was set on the label using
         * [method@Gtk.Label.set_attributes], if any. This function does not
         * reflect attributes that come from the label's markup (see
         * [method@Gtk.Label.set_markup]). If you want to get the effective
         * attributes for the label, use
         * `pango_layout_get_attributes (gtk_label_get_layout (self))`.
         *
         * @return the attribute list
         */
        get() = gtk_label_get_attributes(gtkLabelPointer)?.run {
            AttrList(this)
        }

        /**
         * Apply attributes to the label text.
         *
         * The attributes set with this function will be applied and merged with
         * any other attributes previously effected by way of the
         * [property@Gtk.Label:use-underline] or [property@Gtk.Label:use-markup]
         * properties. While it is not recommended to mix markup strings with
         * manually set attributes, if you must; know that the attributes will
         * be applied to the label after the markup string is parsed.
         *
         * @param attrs a [struct@Pango.AttrList]
         */
        set(attrs) = gtk_label_set_attributes(gtkLabelPointer, attrs?.pangoAttrListPointer)

    /**
     * The preferred place to ellipsize the string, if the label does
     * not have enough room to display the entire string.
     *
     * Note that setting this property to a value other than
     * %PANGO_ELLIPSIZE_NONE has the side-effect that the label requests
     * only enough space to display the ellipsis "...". In particular, this
     * means that ellipsizing labels do not work well in notebook tabs, unless
     * the [property@Gtk.NotebookPage:tab-expand] child property is set to true.
     * Other ways to set a label's width are [method@Gtk.Widget.set_size_request]
     * and [method@Gtk.Label.set_width_chars].
     */
    public open var ellipsize: EllipsizeMode
        /**
         * Returns the ellipsizing position of the label.
         *
         * See [method@Gtk.Label.set_ellipsize].
         *
         * @return `PangoEllipsizeMode`
         */
        get() = gtk_label_get_ellipsize(gtkLabelPointer).run {
            EllipsizeMode.fromNativeValue(this)
        }

        /**
         * Sets the mode used to ellipsize the text.
         *
         * The text will be ellipsized if there is not enough space
         * to render the entire string.
         *
         * @param mode a `PangoEllipsizeMode`
         */
        set(mode) = gtk_label_set_ellipsize(gtkLabelPointer, mode.nativeValue)

    /**
     * A menu model whose contents will be appended to the context menu.
     */
    public open var extraMenu: MenuModel?
        /**
         * Gets the extra menu model of @label.
         *
         * See [method@Gtk.Label.set_extra_menu].
         *
         * @return the menu model
         */
        get() = gtk_label_get_extra_menu(gtkLabelPointer)?.run {
            MenuModel.MenuModelImpl(this)
        }

        /**
         * Sets a menu model to add when constructing
         * the context menu for @label.
         *
         * @param model a `GMenuModel`
         */
        set(model) = gtk_label_set_extra_menu(gtkLabelPointer, model?.gioMenuModelPointer)

    /**
     * The alignment of the lines in the text of the label, relative to each other.
     *
     * This does *not* affect the alignment of the label within its allocation.
     * See [property@Gtk.Label:xalign] for that.
     */
    public open var justify: Justification
        /**
         * Returns the justification of the label.
         *
         * See [method@Gtk.Label.set_justify].
         *
         * @return `GtkJustification`
         */
        get() = gtk_label_get_justify(gtkLabelPointer).run {
            Justification.fromNativeValue(this)
        }

        /**
         * Sets the alignment of the lines in the text of the label relative to
         * each other.
         *
         * %GTK_JUSTIFY_LEFT is the default value when the widget is first created
         * with [ctor@Gtk.Label.new]. If you instead want to set the alignment of
         * the label as a whole, use [method@Gtk.Widget.set_halign] instead.
         * [method@Gtk.Label.set_justify] has no effect on labels containing
         * only a single line.
         *
         * @param jtype a `GtkJustification`
         */
        set(jtype) = gtk_label_set_justify(gtkLabelPointer, jtype.nativeValue)

    /**
     * The contents of the label.
     *
     * If the string contains Pango markup (see [func@Pango.parse_markup]),
     * you will have to set the [property@Gtk.Label:use-markup] property to
     * true in order for the label to display the markup attributes. See also
     * [method@Gtk.Label.set_markup] for a convenience function that sets both
     * this property and the [property@Gtk.Label:use-markup] property at the
     * same time.
     *
     * If the string contains underlines acting as mnemonics, you will have to
     * set the [property@Gtk.Label:use-underline] property to true in order
     * for the label to display them.
     */
    public open var label: String
        /**
         * Fetches the text from a label.
         *
         * The returned text includes any embedded underlines indicating
         * mnemonics and Pango markup. (See [method@Gtk.Label.get_text]).
         *
         * @return the text of the label widget. This string is
         *   owned by the widget and must not be modified or freed.
         */
        get() = gtk_label_get_label(gtkLabelPointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets the text of the label.
         *
         * The label is interpreted as including embedded underlines and/or Pango
         * markup depending on the values of the [property@Gtk.Label:use-underline]
         * and [property@Gtk.Label:use-markup] properties.
         *
         * @param str the new text to set for the label
         */
        set(str) = gtk_label_set_label(gtkLabelPointer, str)

    /**
     * The number of lines to which an ellipsized, wrapping label
     * should be limited.
     *
     * This property has no effect if the label is not wrapping or ellipsized.
     * Set this property to -1 if you don't want to limit the number of lines.
     */
    public open var lines: gint
        /**
         * Gets the number of lines to which an ellipsized, wrapping
         * label should be limited.
         *
         * See [method@Gtk.Label.set_lines].
         *
         * @return The number of lines
         */
        get() = gtk_label_get_lines(gtkLabelPointer)

        /**
         * Sets the number of lines to which an ellipsized, wrapping label
         * should be limited.
         *
         * This has no effect if the label is not wrapping or ellipsized.
         * Set this to -1 if you don’t want to limit the number of lines.
         *
         * @param lines the desired number of lines, or -1
         */
        set(lines) = gtk_label_set_lines(gtkLabelPointer, lines)

    /**
     * The desired maximum width of the label, in characters.
     *
     * If this property is set to -1, the width will be calculated automatically.
     *
     * See the section on [text layout](class.Label.html#text-layout) for details of how
     * [property@Gtk.Label:width-chars] and [property@Gtk.Label:max-width-chars]
     * determine the width of ellipsized and wrapped labels.
     */
    public open var maxWidthChars: gint
        /**
         * Retrieves the desired maximum width of @label, in characters.
         *
         * See [method@Gtk.Label.set_width_chars].
         *
         * @return the maximum width of the label in characters.
         */
        get() = gtk_label_get_max_width_chars(gtkLabelPointer)

        /**
         * Sets the desired maximum width in characters of @label to @n_chars.
         *
         * @param nChars the new desired maximum width, in characters.
         */
        set(nChars) = gtk_label_set_max_width_chars(gtkLabelPointer, nChars)

    /**
     * The mnemonic accelerator key for the label.
     */
    public open val mnemonicKeyval: guint
        /**
         * Return the mnemonic accelerator.
         *
         * If the label has been set so that it has a mnemonic key this function
         * returns the keyval used for the mnemonic accelerator. If there is no
         * mnemonic set up it returns `GDK_KEY_VoidSymbol`.
         *
         * @return GDK keyval usable for accelerators, or `GDK_KEY_VoidSymbol`
         */
        get() = gtk_label_get_mnemonic_keyval(gtkLabelPointer)

    /**
     * The widget to be activated when the labels mnemonic key is pressed.
     */
    public open var mnemonicWidget: Widget?
        /**
         * Retrieves the target of the mnemonic (keyboard shortcut) of this
         * label.
         *
         * See [method@Gtk.Label.set_mnemonic_widget].
         *
         * @return the target of the label’s mnemonic,
         *   or null if none has been set and the default algorithm will be used.
         */
        get() = gtk_label_get_mnemonic_widget(gtkLabelPointer)?.run {
            Widget.WidgetImpl(this)
        }

        /**
         * Associate the label with its mnemonic target.
         *
         * If the label has been set so that it has a mnemonic key (using
         * i.e. [method@Gtk.Label.set_markup_with_mnemonic],
         * [method@Gtk.Label.set_text_with_mnemonic],
         * [ctor@Gtk.Label.new_with_mnemonic]
         * or the [property@Gtk.Label:use_underline] property) the label can be
         * associated with a widget that is the target of the mnemonic. When the
         * label is inside a widget (like a [class@Gtk.Button] or a
         * [class@Gtk.Notebook] tab) it is automatically associated with the correct
         * widget, but sometimes (i.e. when the target is a [class@Gtk.Entry] next to
         * the label) you need to set it explicitly using this function.
         *
         * The target widget will be accelerated by emitting the
         * [signal@Gtk.Widget::mnemonic-activate] signal on it. The default handler for
         * this signal will activate the widget if there are no mnemonic collisions
         * and toggle focus between the colliding widgets otherwise.
         *
         * @param widget the target `GtkWidget`, or null to unset
         */
        set(widget) = gtk_label_set_mnemonic_widget(gtkLabelPointer, widget?.gtkWidgetPointer)

    /**
     * Select the line wrapping for the natural size request.
     *
     * This only affects the natural size requested. For the actual wrapping used,
     * see the [property@Gtk.Label:wrap-mode] property.
     *
     * The default is %GTK_NATURAL_WRAP_INHERIT, which inherits the behavior of the
     * [property@Gtk.Label:wrap-mode] property.
     *
     * @since 4.6
     */
    @GtkVersion4_6
    public open var naturalWrapMode: NaturalWrapMode
        /**
         * Returns line wrap mode used by the label.
         *
         * See [method@Gtk.Label.set_natural_wrap_mode].
         *
         * @return the natural line wrap mode
         * @since 4.6
         */
        get() = gtk_label_get_natural_wrap_mode(gtkLabelPointer).run {
            NaturalWrapMode.fromNativeValue(this)
        }

        /**
         * Select the line wrapping for the natural size request.
         *
         * This only affects the natural size requested, for the actual wrapping used,
         * see the [property@Gtk.Label:wrap-mode] property.
         *
         * @param wrapMode the line wrapping mode
         * @since 4.6
         */
        @GtkVersion4_6
        set(wrapMode) = gtk_label_set_natural_wrap_mode(gtkLabelPointer, wrapMode.nativeValue)

    /**
     * Whether the label text can be selected with the mouse.
     */
    public open var selectable: Boolean
        /**
         * Returns whether the label is selectable.
         *
         * @return true if the user can copy text from the label
         */
        get() = gtk_label_get_selectable(gtkLabelPointer).asBoolean()

        /**
         * Makes text in the label selectable.
         *
         * Selectable labels allow the user to select text from the label,
         * for copy-and-paste.
         *
         * @param setting true to allow selecting text in the label
         */
        set(setting) = gtk_label_set_selectable(gtkLabelPointer, setting.asGBoolean())

    /**
     * Whether the label is in single line mode.
     *
     * In single line mode, the height of the label does not depend on the
     * actual text, it is always set to ascent + descent of the font. This
     * can be an advantage in situations where resizing the label because
     * of text changes would be distracting, e.g. in a statusbar.
     */
    public open var singleLineMode: Boolean
        /**
         * Returns whether the label is in single line mode.
         *
         * @return true when the label is in single line mode.
         */
        get() = gtk_label_get_single_line_mode(gtkLabelPointer).asBoolean()

        /**
         * Sets whether the label is in single line mode.
         *
         * @param singleLineMode true if the label should be in single line mode
         */
        set(singleLineMode) = gtk_label_set_single_line_mode(gtkLabelPointer, singleLineMode.asGBoolean())

    /**
     * Custom tabs for this label.
     *
     * @since 4.8
     */
    @GtkVersion4_8
    public open var tabs: TabArray?
        /**
         * Gets the tabs for @self.
         *
         * The returned array will be null if “standard” (8-space) tabs are used.
         * Free the return value with [method@Pango.TabArray.free].
         *
         * @return copy of default tab array,
         *   or null if standard tabs are used; must be freed with
         *   [method@Pango.TabArray.free].
         * @since 4.8
         */
        get() = gtk_label_get_tabs(gtkLabelPointer)?.run {
            TabArray(this)
        }

        /**
         * Sets the default tab stops for paragraphs in @self.
         *
         * @param tabs tabs as a `PangoTabArray`
         * @since 4.8
         */
        @GtkVersion4_8
        set(tabs) = gtk_label_set_tabs(gtkLabelPointer, tabs?.pangoTabArrayPointer)

    /**
     * true if the text of the label includes Pango markup.
     *
     * See [func@Pango.parse_markup].
     */
    public open var useMarkup: Boolean
        /**
         * Returns whether the label’s text is interpreted as Pango markup.
         *
         * See [method@Gtk.Label.set_use_markup].
         *
         * @return true if the label’s text will be parsed for markup.
         */
        get() = gtk_label_get_use_markup(gtkLabelPointer).asBoolean()

        /**
         * Sets whether the text of the label contains markup.
         *
         * See [method@Gtk.Label.set_markup].
         *
         * @param setting true if the label’s text should be parsed for markup.
         */
        set(setting) = gtk_label_set_use_markup(gtkLabelPointer, setting.asGBoolean())

    /**
     * true if the text of the label indicates a mnemonic with an _
     * before the mnemonic character.
     */
    public open var useUnderline: Boolean
        /**
         * Returns whether an embedded underlines in the label indicate mnemonics.
         *
         * See [method@Gtk.Label.set_use_underline].
         *
         * @return true whether an embedded underline in the label indicates
         *   the mnemonic accelerator keys.
         */
        get() = gtk_label_get_use_underline(gtkLabelPointer).asBoolean()

        /**
         * Sets whether underlines in the text indicate mnemonics.
         *
         * @param setting true if underlines in the text indicate mnemonics
         */
        set(setting) = gtk_label_set_use_underline(gtkLabelPointer, setting.asGBoolean())

    /**
     * The desired width of the label, in characters.
     *
     * If this property is set to -1, the width will be calculated automatically.
     *
     * See the section on [text layout](class.Label.html#text-layout) for details of how
     * [property@Gtk.Label:width-chars] and [property@Gtk.Label:max-width-chars]
     * determine the width of ellipsized and wrapped labels.
     */
    public open var widthChars: gint
        /**
         * Retrieves the desired width of @label, in characters.
         *
         * See [method@Gtk.Label.set_width_chars].
         *
         * @return the width of the label in characters.
         */
        get() = gtk_label_get_width_chars(gtkLabelPointer)

        /**
         * Sets the desired width in characters of @label to @n_chars.
         *
         * @param nChars the new desired width, in characters.
         */
        set(nChars) = gtk_label_set_width_chars(gtkLabelPointer, nChars)

    /**
     * true if the label text will wrap if it gets too wide.
     */
    public open var wrap: Boolean
        /**
         * Returns whether lines in the label are automatically wrapped.
         *
         * See [method@Gtk.Label.set_wrap].
         *
         * @return true if the lines of the label are automatically wrapped.
         */
        get() = gtk_label_get_wrap(gtkLabelPointer).asBoolean()

        /**
         * Toggles line wrapping within the `GtkLabel` widget.
         *
         * true makes it break lines if text exceeds the widget’s size.
         * false lets the text get cut off by the edge of the widget if
         * it exceeds the widget size.
         *
         * Note that setting line wrapping to true does not make the label
         * wrap at its parent container’s width, because GTK widgets
         * conceptually can’t make their requisition depend on the parent
         * container’s size. For a label that wraps at a specific position,
         * set the label’s width using [method@Gtk.Widget.set_size_request].
         *
         * @param wrap the setting
         */
        set(wrap) = gtk_label_set_wrap(gtkLabelPointer, wrap.asGBoolean())

    /**
     * Controls how the line wrapping is done.
     *
     * This only affects the formatting if line wrapping is on (see the
     * [property@Gtk.Label:wrap] property). The default is %PANGO_WRAP_WORD,
     * which means wrap on word boundaries.
     *
     * For sizing behavior, also consider the [property@Gtk.Label:natural-wrap-mode]
     * property.
     */
    public open var wrapMode: WrapMode
        /**
         * Returns line wrap mode used by the label.
         *
         * See [method@Gtk.Label.set_wrap_mode].
         *
         * @return the line wrap mode
         */
        get() = gtk_label_get_wrap_mode(gtkLabelPointer).run {
            WrapMode.fromNativeValue(this)
        }

        /**
         * Controls how line wrapping is done.
         *
         * This only affects the label if line wrapping is on. (See
         * [method@Gtk.Label.set_wrap]) The default is %PANGO_WRAP_WORD
         * which means wrap on word boundaries.
         *
         * For sizing behavior, also consider the [property@Gtk.Label:natural-wrap-mode]
         * property.
         *
         * @param wrapMode the line wrapping mode
         */
        set(wrapMode) = gtk_label_set_wrap_mode(gtkLabelPointer, wrapMode.nativeValue)

    /**
     * The horizontal alignment of the label text inside its size allocation.
     *
     * Compare this to [property@Gtk.Widget:halign], which determines how the
     * labels size allocation is positioned in the space available for the label.
     */
    public open var xalign: gfloat
        /**
         * Gets the `xalign` of the label.
         *
         * See the [property@Gtk.Label:xalign] property.
         *
         * @return the xalign property
         */
        get() = gtk_label_get_xalign(gtkLabelPointer)

        /**
         * Sets the `xalign` of the label.
         *
         * See the [property@Gtk.Label:xalign] property.
         *
         * @param xalign the new xalign value, between 0 and 1
         */
        set(xalign) = gtk_label_set_xalign(gtkLabelPointer, xalign)

    /**
     * The vertical alignment of the label text inside its size allocation.
     *
     * Compare this to [property@Gtk.Widget:valign], which determines how the
     * labels size allocation is positioned in the space available for the label.
     */
    public open var yalign: gfloat
        /**
         * Gets the `yalign` of the label.
         *
         * See the [property@Gtk.Label:yalign] property.
         *
         * @return the yalign property
         */
        get() = gtk_label_get_yalign(gtkLabelPointer)

        /**
         * Sets the `yalign` of the label.
         *
         * See the [property@Gtk.Label:yalign] property.
         *
         * @param yalign the new yalign value, between 0 and 1
         */
        set(yalign) = gtk_label_set_yalign(gtkLabelPointer, yalign)

    /**
     * Creates a new label with the given text inside it.
     *
     * You can pass null to get an empty label widget.
     *
     * @param str The text of the label
     * @return the new `GtkLabel`
     */
    public constructor(str: String? = null) : this(gtk_label_new(str)!!.reinterpret())

    /**
     * Returns the URI for the currently active link in the label.
     *
     * The active link is the one under the mouse pointer or, in a
     * selectable label, the link in which the text cursor is currently
     * positioned.
     *
     * This function is intended for use in a [signal@Gtk.Label::activate-link]
     * handler or for use in a [signal@Gtk.Widget::query-tooltip] handler.
     *
     * @return the currently active URI
     */
    public open fun getCurrentUri(): String? = gtk_label_get_current_uri(gtkLabelPointer)?.toKString()

    /**
     * Gets the `PangoLayout` used to display the label.
     *
     * The layout is useful to e.g. convert text positions to pixel
     * positions, in combination with [method@Gtk.Label.get_layout_offsets].
     * The returned layout is owned by the @label so need not be
     * freed by the caller. The @label is free to recreate its layout
     * at any time, so it should be considered read-only.
     *
     * @return the [class@Pango.Layout] for this label
     */
    public open fun getLayout(): Layout = gtk_label_get_layout(gtkLabelPointer)!!.run {
        Layout(this)
    }

    /**
     * Fetches the text from a label.
     *
     * The returned text is as it appears on screen. This does not include
     * any embedded underlines indicating mnemonics or Pango markup. (See
     * [method@Gtk.Label.get_label])
     *
     * @return the text in the label widget. This is the internal
     *   string used by the label, and must not be modified.
     */
    public open fun getText(): String =
        gtk_label_get_text(gtkLabelPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Selects a range of characters in the label, if the label is selectable.
     *
     * See [method@Gtk.Label.set_selectable]. If the label is not selectable,
     * this function has no effect. If @start_offset or
     * @end_offset are -1, then the end of the label will be substituted.
     *
     * @param startOffset start offset (in characters not bytes)
     * @param endOffset end offset (in characters not bytes)
     */
    public open fun selectRegion(startOffset: gint, endOffset: gint): Unit =
        gtk_label_select_region(gtkLabelPointer, startOffset, endOffset)

    /**
     * Sets the labels text and attributes from markup.
     *
     * The string must be marked up with Pango markup
     * (see [func@Pango.parse_markup]).
     *
     * If the @str is external data, you may need to escape it
     * with g_markup_escape_text() or g_markup_printf_escaped():
     *
     * ```c
     * GtkWidget *self = gtk_label_new (NULL);
     * const char *str = "...";
     * const char *format = "<span style=\"italic\">\%s</span>";
     * char *markup;
     *
     * markup = g_markup_printf_escaped (format, str);
     * gtk_label_set_markup (GTK_LABEL (self), markup);
     * g_free (markup);
     * ```
     *
     * This function will set the [property@Gtk.Label:use-markup] property
     * to true as a side effect.
     *
     * If you set the label contents using the [property@Gtk.Label:label]
     * property you should also ensure that you set the
     * [property@Gtk.Label:use-markup] property accordingly.
     *
     * See also: [method@Gtk.Label.set_text]
     *
     * @param str a markup string
     */
    public open fun setMarkup(str: String): Unit = gtk_label_set_markup(gtkLabelPointer, str)

    /**
     * Sets the labels text, attributes and mnemonic from markup.
     *
     * Parses @str which is marked up with Pango markup (see [func@Pango.parse_markup]),
     * setting the label’s text and attribute list based on the parse results.
     * If characters in @str are preceded by an underscore, they are underlined
     * indicating that they represent a keyboard accelerator called a mnemonic.
     *
     * The mnemonic key can be used to activate another widget, chosen
     * automatically, or explicitly using [method@Gtk.Label.set_mnemonic_widget].
     *
     * @param str a markup string
     */
    public open fun setMarkupWithMnemonic(str: String): Unit = gtk_label_set_markup_with_mnemonic(gtkLabelPointer, str)

    /**
     * Sets the text within the `GtkLabel` widget.
     *
     * It overwrites any text that was there before.
     *
     * This function will clear any previously set mnemonic accelerators,
     * and set the [property@Gtk.Label:use-underline] property to false as
     * a side effect.
     *
     * This function will set the [property@Gtk.Label:use-markup] property
     * to false as a side effect.
     *
     * See also: [method@Gtk.Label.set_markup]
     *
     * @param str The text you want to set
     */
    public open fun setText(str: String): Unit = gtk_label_set_text(gtkLabelPointer, str)

    /**
     * Sets the label’s text from the string @str.
     *
     * If characters in @str are preceded by an underscore, they are underlined
     * indicating that they represent a keyboard accelerator called a mnemonic.
     * The mnemonic key can be used to activate another widget, chosen
     * automatically, or explicitly using [method@Gtk.Label.set_mnemonic_widget].
     *
     * @param str a string
     */
    public open fun setTextWithMnemonic(str: String): Unit = gtk_label_set_text_with_mnemonic(gtkLabelPointer, str)

    /**
     * Gets emitted when the user activates a link in the label.
     *
     * The ::activate-current-link is a [keybinding signal](class.SignalAction.html).
     *
     * Applications may also emit the signal with g_signal_emit_by_name()
     * if they need to control activation of URIs programmatically.
     *
     * The default bindings for this signal are all forms of the <kbd>Enter</kbd> key.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onActivateCurrentLink(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkLabelPointer,
            "activate-current-link",
            onActivateCurrentLinkFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate-current-link" signal. See [onActivateCurrentLink].
     */
    public fun emitActivateCurrentLink() {
        g_signal_emit_by_name(gtkLabelPointer.reinterpret(), "activate-current-link")
    }

    /**
     * Gets emitted to activate a URI.
     *
     * Applications may connect to it to override the default behaviour,
     * which is to call [method@Gtk.FileLauncher.launch].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `uri` the URI that is activated. Returns true if the link has been activated
     */
    public fun onActivateLink(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (uri: String) -> Boolean): ULong =
        g_signal_connect_data(
            gtkLabelPointer,
            "activate-link",
            onActivateLinkFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Gets emitted to copy the selection to the clipboard.
     *
     * The ::copy-clipboard signal is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is <kbd>Ctrl</kbd>+<kbd>c</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onCopyClipboard(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkLabelPointer,
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
        g_signal_emit_by_name(gtkLabelPointer.reinterpret(), "copy-clipboard")
    }

    /**
     * Gets emitted when the user initiates a cursor movement.
     *
     * The ::move-cursor signal is a [keybinding signal](class.SignalAction.html).
     * If the cursor is not visible in @entry, this signal causes the viewport to
     * be moved instead.
     *
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     *
     * The default bindings for this signal come in two variants,
     * the variant with the Shift modifier extends the selection,
     * the variant without the Shift modifier does not.
     * There are too many key combinations to list them all here.
     *
     * - <kbd>←</kbd>, <kbd>→</kbd>, <kbd>↑</kbd>, <kbd>↓</kbd>
     *   move by individual characters/lines
     * - <kbd>Ctrl</kbd>+<kbd>←</kbd>, etc. move by words/paragraphs
     * - <kbd>Home</kbd> and <kbd>End</kbd> move to the ends of the buffer
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
        gtkLabelPointer,
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
            gtkLabelPointer.reinterpret(),
            "move-cursor",
            step.nativeValue,
            count,
            extendSelection.asGBoolean()
        )
    }

    public companion object : TypeCompanion<Label> {
        override val type: GeneratedClassKGType<Label> =
            GeneratedClassKGType(gtk_label_get_type()) { Label(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Creates a new label with the given text inside it.
         *
         * You can pass null to get an empty label widget.
         *
         * @param str The text of the label
         * @return the new `GtkLabel`
         */
        public fun new(str: String? = null): Label = Label(gtk_label_new(str)!!.reinterpret())

        /**
         * Creates a new `GtkLabel`, containing the text in @str.
         *
         * If characters in @str are preceded by an underscore, they are
         * underlined. If you need a literal underscore character in a label, use
         * '__' (two underscores). The first underlined character represents a
         * keyboard accelerator called a mnemonic. The mnemonic key can be used
         * to activate another widget, chosen automatically, or explicitly using
         * [method@Gtk.Label.set_mnemonic_widget].
         *
         * If [method@Gtk.Label.set_mnemonic_widget] is not called, then the first
         * activatable ancestor of the `GtkLabel` will be chosen as the mnemonic
         * widget. For instance, if the label is inside a button or menu item,
         * the button or menu item will automatically become the mnemonic widget
         * and be activated by the mnemonic.
         *
         * @param str The text of the label, with an underscore in front of the
         *   mnemonic character
         * @return the new `GtkLabel`
         */
        public fun newWithMnemonic(str: String? = null): Label = Label(gtk_label_new_with_mnemonic(str)!!.reinterpret())

        /**
         * Get the GType of Label
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_label_get_type()
    }
}

private val onActivateCurrentLinkFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onActivateLinkFunc: CPointer<CFunction<(CPointer<ByteVar>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            uri: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                uri: String,
            ) -> Boolean
            >().get().invoke(uri?.toKString() ?: error("Expected not null string")).asGBoolean()
    }
        .reinterpret()

private val onCopyClipboardFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
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
