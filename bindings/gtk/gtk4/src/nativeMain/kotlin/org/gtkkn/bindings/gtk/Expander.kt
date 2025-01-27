// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkExpander
import org.gtkkn.native.gtk.gtk_expander_get_child
import org.gtkkn.native.gtk.gtk_expander_get_expanded
import org.gtkkn.native.gtk.gtk_expander_get_label
import org.gtkkn.native.gtk.gtk_expander_get_label_widget
import org.gtkkn.native.gtk.gtk_expander_get_resize_toplevel
import org.gtkkn.native.gtk.gtk_expander_get_type
import org.gtkkn.native.gtk.gtk_expander_get_use_markup
import org.gtkkn.native.gtk.gtk_expander_get_use_underline
import org.gtkkn.native.gtk.gtk_expander_new
import org.gtkkn.native.gtk.gtk_expander_new_with_mnemonic
import org.gtkkn.native.gtk.gtk_expander_set_child
import org.gtkkn.native.gtk.gtk_expander_set_expanded
import org.gtkkn.native.gtk.gtk_expander_set_label
import org.gtkkn.native.gtk.gtk_expander_set_label_widget
import org.gtkkn.native.gtk.gtk_expander_set_resize_toplevel
import org.gtkkn.native.gtk.gtk_expander_set_use_markup
import org.gtkkn.native.gtk.gtk_expander_set_use_underline
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkExpander` allows the user to reveal its child by clicking
 * on an expander triangle.
 *
 * ![An example GtkExpander](expander.png)
 *
 * This is similar to the triangles used in a `GtkTreeView`.
 *
 * Normally you use an expander as you would use a frame; you create
 * the child widget and use [method@Gtk.Expander.set_child] to add it
 * to the expander. When the expander is toggled, it will take care of
 * showing and hiding the child automatically.
 *
 * # Special Usage
 *
 * There are situations in which you may prefer to show and hide the
 * expanded widget yourself, such as when you want to actually create
 * the widget at expansion time. In this case, create a `GtkExpander`
 * but do not add a child to it. The expander widget has an
 * [property@Gtk.Expander:expanded] property which can be used to
 * monitor its expansion state. You should watch this property with
 * a signal connection as follows:
 *
 * ```c
 * static void
 * expander_callback (GObject    *object,
 *                    GParamSpec *param_spec,
 *                    gpointer    user_data)
 * {
 *   GtkExpander *expander;
 *
 *   expander = GTK_EXPANDER (object);
 *
 *   if (gtk_expander_get_expanded (expander))
 *     {
 *       // Show or create widgets
 *     }
 *   else
 *     {
 *       // Hide or destroy widgets
 *     }
 * }
 *
 * static void
 * create_expander (void)
 * {
 *   GtkWidget *expander = gtk_expander_new_with_mnemonic ("_More Options");
 *   g_signal_connect (expander, "notify::expanded",
 *                     G_CALLBACK (expander_callback), NULL);
 *
 *   // ...
 * }
 * ```
 *
 * # GtkExpander as GtkBuildable
 *
 * The `GtkExpander` implementation of the `GtkBuildable` interface supports
 * placing a child in the label position by specifying “label” as the
 * “type” attribute of a `<child>` element. A normal content child can be
 * specified without specifying a `<child>` type attribute.
 *
 * An example of a UI definition fragment with GtkExpander:
 *
 * ```xml
 * <object class="GtkExpander">
 *   <child type="label">
 *     <object class="GtkLabel" id="expander-label"/>
 *   </child>
 *   <child>
 *     <object class="GtkEntry" id="expander-content"/>
 *   </child>
 * </object>
 * ```
 *
 * # CSS nodes
 *
 * ```
 * expander-widget
 * ╰── box
 *     ├── title
 *     │   ├── expander
 *     │   ╰── <label widget>
 *     ╰── <child>
 * ```
 *
 * `GtkExpander` has a main node `expander-widget`, and subnode `box` containing
 * the title and child widget. The box subnode `title` contains node `expander`,
 * i.e. the expand/collapse arrow; then the label widget if any. The arrow of an
 * expander that is showing its child gets the `:checked` pseudoclass set on it.
 *
 * # Accessibility
 *
 * `GtkExpander` uses the %GTK_ACCESSIBLE_ROLE_BUTTON role.
 */
public open class Expander(public val gtkExpanderPointer: CPointer<GtkExpander>) :
    Widget(gtkExpanderPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The child widget.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @expander.
         *
         * @return the child widget of @expander
         */
        get() = gtk_expander_get_child(gtkExpanderPointer)?.run {
            Widget.WidgetImpl(this)
        }

        /**
         * Sets the child widget of @expander.
         *
         * @param child the child widget
         */
        set(child) = gtk_expander_set_child(gtkExpanderPointer, child?.gtkWidgetPointer)

    /**
     * Whether the expander has been opened to reveal the child.
     */
    public open var expanded: Boolean
        /**
         * Queries a `GtkExpander` and returns its current state.
         *
         * Returns true if the child widget is revealed.
         *
         * @return the current state of the expander
         */
        get() = gtk_expander_get_expanded(gtkExpanderPointer).asBoolean()

        /**
         * Sets the state of the expander.
         *
         * Set to true, if you want the child widget to be revealed,
         * and false if you want the child widget to be hidden.
         *
         * @param expanded whether the child widget is revealed
         */
        set(expanded) = gtk_expander_set_expanded(gtkExpanderPointer, expanded.asGBoolean())

    /**
     * The text of the expanders label.
     */
    public open var label: String?
        /**
         * Fetches the text from a label widget.
         *
         * This is including any embedded underlines indicating mnemonics and
         * Pango markup, as set by [method@Gtk.Expander.set_label]. If the label
         * text has not been set the return value will be null. This will be the
         * case if you create an empty button with gtk_button_new() to use as a
         * container.
         *
         * @return The text of the label widget. This string is owned
         *   by the widget and must not be modified or freed.
         */
        get() = gtk_expander_get_label(gtkExpanderPointer)?.toKString()

        /**
         * Sets the text of the label of the expander to @label.
         *
         * This will also clear any previously set labels.
         *
         * @param label a string
         */
        set(label) = gtk_expander_set_label(gtkExpanderPointer, label)

    /**
     * A widget to display instead of the usual expander label.
     */
    public open var labelWidget: Widget?
        /**
         * Retrieves the label widget for the frame.
         *
         * @return the label widget
         */
        get() = gtk_expander_get_label_widget(gtkExpanderPointer)?.run {
            Widget.WidgetImpl(this)
        }

        /**
         * Set the label widget for the expander.
         *
         * This is the widget that will appear embedded alongside
         * the expander arrow.
         *
         * @param labelWidget the new label widget
         */
        set(labelWidget) = gtk_expander_set_label_widget(gtkExpanderPointer, labelWidget?.gtkWidgetPointer)

    /**
     * When this property is true, the expander will resize the toplevel
     * widget containing the expander upon expanding and collapsing.
     */
    public open var resizeToplevel: Boolean
        /**
         * Returns whether the expander will resize the toplevel widget
         * containing the expander upon resizing and collapsing.
         *
         * @return the “resize toplevel” setting.
         */
        get() = gtk_expander_get_resize_toplevel(gtkExpanderPointer).asBoolean()

        /**
         * Sets whether the expander will resize the toplevel widget
         * containing the expander upon resizing and collapsing.
         *
         * @param resizeToplevel whether to resize the toplevel
         */
        set(resizeToplevel) = gtk_expander_set_resize_toplevel(gtkExpanderPointer, resizeToplevel.asGBoolean())

    /**
     * Whether the text in the label is Pango markup.
     */
    public open var useMarkup: Boolean
        /**
         * Returns whether the label’s text is interpreted as Pango markup.
         *
         * @return true if the label’s text will be parsed for markup
         */
        get() = gtk_expander_get_use_markup(gtkExpanderPointer).asBoolean()

        /**
         * Sets whether the text of the label contains Pango markup.
         *
         * @param useMarkup true if the label’s text should be parsed for markup
         */
        set(useMarkup) = gtk_expander_set_use_markup(gtkExpanderPointer, useMarkup.asGBoolean())

    /**
     * Whether an underline in the text indicates a mnemonic.
     */
    public open var useUnderline: Boolean
        /**
         * Returns whether an underline in the text indicates a mnemonic.
         *
         * @return true if an embedded underline in the expander
         *   label indicates the mnemonic accelerator keys
         */
        get() = gtk_expander_get_use_underline(gtkExpanderPointer).asBoolean()

        /**
         * If true, an underline in the text indicates a mnemonic.
         *
         * @param useUnderline true if underlines in the text indicate mnemonics
         */
        set(useUnderline) = gtk_expander_set_use_underline(gtkExpanderPointer, useUnderline.asGBoolean())

    /**
     * Creates a new expander using @label as the text of the label.
     *
     * @param label the text of the label
     * @return a new `GtkExpander` widget.
     */
    public constructor(label: String? = null) : this(gtk_expander_new(label)!!.reinterpret())

    /**
     * Activates the `GtkExpander`.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkExpanderPointer,
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
        g_signal_emit_by_name(gtkExpanderPointer.reinterpret(), "activate")
    }

    public companion object : TypeCompanion<Expander> {
        override val type: GeneratedClassKGType<Expander> =
            GeneratedClassKGType(getTypeOrNull("gtk_expander_get_type")!!) { Expander(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Creates a new expander using @label as the text of the label.
         *
         * @param label the text of the label
         * @return a new `GtkExpander` widget.
         */
        public fun new(label: String? = null): Expander = Expander(gtk_expander_new(label)!!.reinterpret())

        /**
         * Creates a new expander using @label as the text of the label.
         *
         * If characters in @label are preceded by an underscore, they are
         * underlined. If you need a literal underscore character in a label,
         * use “__” (two underscores). The first underlined character represents
         * a keyboard accelerator called a mnemonic.
         *
         * Pressing Alt and that key activates the button.
         *
         * @param label the text of the label with an underscore
         *   in front of the mnemonic character
         * @return a new `GtkExpander` widget.
         */
        public fun newWithMnemonic(label: String? = null): Expander =
            Expander(gtk_expander_new_with_mnemonic(label)!!.reinterpret())

        /**
         * Get the GType of Expander
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_expander_get_type()
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
