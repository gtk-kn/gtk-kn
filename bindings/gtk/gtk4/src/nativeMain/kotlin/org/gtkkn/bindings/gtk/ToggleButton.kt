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
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkToggleButton
import org.gtkkn.native.gtk.gtk_toggle_button_get_active
import org.gtkkn.native.gtk.gtk_toggle_button_get_type
import org.gtkkn.native.gtk.gtk_toggle_button_new
import org.gtkkn.native.gtk.gtk_toggle_button_new_with_label
import org.gtkkn.native.gtk.gtk_toggle_button_new_with_mnemonic
import org.gtkkn.native.gtk.gtk_toggle_button_set_active
import org.gtkkn.native.gtk.gtk_toggle_button_set_group
import org.gtkkn.native.gtk.gtk_toggle_button_toggled
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A `GtkToggleButton` is a button which remains “pressed-in” when
 * clicked.
 *
 * Clicking again will cause the toggle button to return to its normal state.
 *
 * A toggle button is created by calling either [ctor@Gtk.ToggleButton.new] or
 * [ctor@Gtk.ToggleButton.new_with_label]. If using the former, it is advisable
 * to pack a widget, (such as a `GtkLabel` and/or a `GtkImage`), into the toggle
 * button’s container. (See [class@Gtk.Button] for more information).
 *
 * The state of a `GtkToggleButton` can be set specifically using
 * [method@Gtk.ToggleButton.set_active], and retrieved using
 * [method@Gtk.ToggleButton.get_active].
 *
 * To simply switch the state of a toggle button, use
 * [method@Gtk.ToggleButton.toggled].
 *
 * ## Grouping
 *
 * Toggle buttons can be grouped together, to form mutually exclusive
 * groups - only one of the buttons can be toggled at a time, and toggling
 * another one will switch the currently toggled one off.
 *
 * To add a `GtkToggleButton` to a group, use [method@Gtk.ToggleButton.set_group].
 *
 * ## CSS nodes
 *
 * `GtkToggleButton` has a single CSS node with name button. To differentiate
 * it from a plain `GtkButton`, it gets the `.toggle` style class.
 *
 * ## Accessibility
 *
 * `GtkToggleButton` uses the %GTK_ACCESSIBLE_ROLE_TOGGLE_BUTTON role.
 *
 * ## Creating two `GtkToggleButton` widgets.
 *
 * ```c
 * static void
 * output_state (GtkToggleButton *source,
 *               gpointer         user_data)
 * {
 *   g_print ("Toggle button "%s" is active: %s",
 *            gtk_button_get_label (GTK_BUTTON (source)),
 *            gtk_toggle_button_get_active (source) ? "Yes" : "No");
 * }
 *
 * static void
 * make_toggles (void)
 * {
 *   GtkWidget *window, *toggle1, *toggle2;
 *   GtkWidget *box;
 *   const char *text;
 *
 *   window = gtk_window_new ();
 *   box = gtk_box_new (GTK_ORIENTATION_VERTICAL, 12);
 *
 *   text = "Hi, I’m toggle button one";
 *   toggle1 = gtk_toggle_button_new_with_label (text);
 *
 *   g_signal_connect (toggle1, "toggled",
 *                     G_CALLBACK (output_state),
 *                     NULL);
 *   gtk_box_append (GTK_BOX (box), toggle1);
 *
 *   text = "Hi, I’m toggle button two";
 *   toggle2 = gtk_toggle_button_new_with_label (text);
 *   g_signal_connect (toggle2, "toggled",
 *                     G_CALLBACK (output_state),
 *                     NULL);
 *   gtk_box_append (GTK_BOX (box), toggle2);
 *
 *   gtk_window_set_child (GTK_WINDOW (window), box);
 *   gtk_window_present (GTK_WINDOW (window));
 * }
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `group`: Property has no getter
 */
public open class ToggleButton(public val gtkToggleButtonPointer: CPointer<GtkToggleButton>) :
    Button(gtkToggleButtonPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * If the toggle button should be pressed in.
     */
    public open var active: Boolean
        /**
         * Queries a `GtkToggleButton` and returns its current state.
         *
         * Returns true if the toggle button is pressed in and false
         * if it is raised.
         *
         * @return whether the button is pressed
         */
        get() = gtk_toggle_button_get_active(gtkToggleButtonPointer).asBoolean()

        /**
         * Sets the status of the toggle button.
         *
         * Set to true if you want the `GtkToggleButton` to be “pressed in”,
         * and false to raise it.
         *
         * If the status of the button changes, this action causes the
         * [signal@Gtk.ToggleButton::toggled] signal to be emitted.
         *
         * @param isActive true or false.
         */
        set(isActive) = gtk_toggle_button_set_active(gtkToggleButtonPointer, isActive.asGBoolean())

    /**
     * Creates a new toggle button.
     *
     * A widget should be packed into the button, as in [ctor@Gtk.Button.new].
     *
     * @return a new toggle button.
     */
    public constructor() : this(gtk_toggle_button_new()!!.reinterpret())

    /**
     * Creates a new toggle button with a text label.
     *
     * @param label a string containing the message to be placed in the toggle button.
     * @return a new toggle button.
     */
    public constructor(label: String) : this(gtk_toggle_button_new_with_label(label)!!.reinterpret())

    /**
     * Adds @self to the group of @group.
     *
     * In a group of multiple toggle buttons, only one button can be active
     * at a time.
     *
     * Setting up groups in a cycle leads to undefined behavior.
     *
     * Note that the same effect can be achieved via the [iface@Gtk.Actionable]
     * API, by using the same action with parameter type and state type 's'
     * for all buttons in the group, and giving each button its own target
     * value.
     *
     * @param group another `GtkToggleButton` to
     *   form a group with
     */
    public open fun setGroup(group: ToggleButton? = null): Unit =
        gtk_toggle_button_set_group(gtkToggleButtonPointer, group?.gtkToggleButtonPointer)

    /**
     * Emits the ::toggled signal on the `GtkToggleButton`.
     */
    public open fun toggled(): Unit = gtk_toggle_button_toggled(gtkToggleButtonPointer)

    /**
     * Emitted whenever the `GtkToggleButton`'s state is changed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onToggled(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkToggleButtonPointer,
            "toggled",
            onToggledFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "toggled" signal. See [onToggled].
     */
    public fun emitToggled() {
        g_signal_emit_by_name(gtkToggleButtonPointer.reinterpret(), "toggled")
    }

    public companion object : TypeCompanion<ToggleButton> {
        override val type: GeneratedClassKGType<ToggleButton> =
            GeneratedClassKGType(getTypeOrNull("gtk_toggle_button_get_type")!!) { ToggleButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Creates a new toggle button with a text label.
         *
         * @param label a string containing the message to be placed in the toggle button.
         * @return a new toggle button.
         */
        public fun newWithLabel(label: String): ToggleButton =
            ToggleButton(gtk_toggle_button_new_with_label(label)!!.reinterpret())

        /**
         * Creates a new `GtkToggleButton` containing a label.
         *
         * The label will be created using [ctor@Gtk.Label.new_with_mnemonic],
         * so underscores in @label indicate the mnemonic for the button.
         *
         * @param label the text of the button, with an underscore in front of the
         *   mnemonic character
         * @return a new `GtkToggleButton`
         */
        public fun newWithMnemonic(label: String): ToggleButton =
            ToggleButton(gtk_toggle_button_new_with_mnemonic(label)!!.reinterpret())

        /**
         * Get the GType of ToggleButton
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_toggle_button_get_type()
    }
}

private val onToggledFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
