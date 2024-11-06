// This is a generated file. Do not modify.
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
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_2
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_8
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkCheckButton
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_check_button_get_active
import org.gtkkn.native.gtk.gtk_check_button_get_child
import org.gtkkn.native.gtk.gtk_check_button_get_inconsistent
import org.gtkkn.native.gtk.gtk_check_button_get_label
import org.gtkkn.native.gtk.gtk_check_button_get_type
import org.gtkkn.native.gtk.gtk_check_button_get_use_underline
import org.gtkkn.native.gtk.gtk_check_button_new
import org.gtkkn.native.gtk.gtk_check_button_new_with_label
import org.gtkkn.native.gtk.gtk_check_button_new_with_mnemonic
import org.gtkkn.native.gtk.gtk_check_button_set_active
import org.gtkkn.native.gtk.gtk_check_button_set_child
import org.gtkkn.native.gtk.gtk_check_button_set_group
import org.gtkkn.native.gtk.gtk_check_button_set_inconsistent
import org.gtkkn.native.gtk.gtk_check_button_set_label
import org.gtkkn.native.gtk.gtk_check_button_set_use_underline
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A `GtkCheckButton` places a label next to an indicator.
 *
 * ![Example GtkCheckButtons](check-button.png)
 *
 * A `GtkCheckButton` is created by calling either [ctor@Gtk.CheckButton.new]
 * or [ctor@Gtk.CheckButton.new_with_label].
 *
 * The state of a `GtkCheckButton` can be set specifically using
 * [method@Gtk.CheckButton.set_active], and retrieved using
 * [method@Gtk.CheckButton.get_active].
 *
 * # Inconsistent state
 *
 * In addition to "on" and "off", check buttons can be an
 * "in between" state that is neither on nor off. This can be used
 * e.g. when the user has selected a range of elements (such as some
 * text or spreadsheet cells) that are affected by a check button,
 * and the current values in that range are inconsistent.
 *
 * To set a `GtkCheckButton` to inconsistent state, use
 * [method@Gtk.CheckButton.set_inconsistent].
 *
 * # Grouping
 *
 * Check buttons can be grouped together, to form mutually exclusive
 * groups - only one of the buttons can be toggled at a time, and toggling
 * another one will switch the currently toggled one off.
 *
 * Grouped check buttons use a different indicator, and are commonly referred
 * to as *radio buttons*.
 *
 * ![Example GtkCheckButtons](radio-button.png)
 *
 * To add a `GtkCheckButton` to a group, use [method@Gtk.CheckButton.set_group].
 *
 * When the code must keep track of the state of a group of radio buttons, it
 * is recommended to keep track of such state through a stateful
 * `GAction` with a target for each button. Using the `toggled` signals to keep
 * track of the group changes and state is discouraged.
 *
 * # CSS nodes
 *
 * ```
 * checkbutton[.text-button]
 * ├── check
 * ╰── [label]
 * ```
 *
 * A `GtkCheckButton` has a main node with name checkbutton. If the
 * [property@Gtk.CheckButton:label] or [property@Gtk.CheckButton:child]
 * properties are set, it contains a child widget. The indicator node
 * is named check when no group is set, and radio if the checkbutton
 * is grouped together with other checkbuttons.
 *
 * # Accessibility
 *
 * `GtkCheckButton` uses the %GTK_ACCESSIBLE_ROLE_CHECKBOX role.
 *
 * ## Skipped during bindings generation
 *
 * - method `group`: Property has no getter
 */
public open class CheckButton(
    pointer: CPointer<GtkCheckButton>,
) : Widget(pointer.reinterpret()),
    Actionable,
    KGTyped {
    public val gtkCheckButtonPointer: CPointer<GtkCheckButton>
        get() = gPointer.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * If the check button is active.
     *
     * Setting `active` to true will add the `:checked:` state to both
     * the check button and the indicator CSS node.
     */
    public open var active: Boolean
        /**
         * Returns whether the check button is active.
         *
         * @return whether the check button is active
         */
        get() = gtk_check_button_get_active(gtkCheckButtonPointer.reinterpret()).asBoolean()

        /**
         * Changes the check buttons active state.
         *
         * @param setting the new value to set
         */
        set(setting) = gtk_check_button_set_active(gtkCheckButtonPointer.reinterpret(), setting.asGBoolean())

    /**
     * The child widget.
     *
     * @since 4.8
     */
    @GtkVersion4_8
    public open var child: Widget?
        /**
         * Gets the child widget of @button or `NULL` if [property@CheckButton:label] is set.
         *
         * @return the child widget of @button
         * @since 4.8
         */
        get() =
            gtk_check_button_get_child(gtkCheckButtonPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child widget of @button.
         *
         * Note that by using this API, you take full responsibility for setting
         * up the proper accessibility label and description information for @button.
         * Most likely, you'll either set the accessibility label or description
         * for @button explicitly, or you'll set a labelled-by or described-by
         * relations from @child to @button.
         *
         * @param child the child widget
         * @since 4.8
         */
        @GtkVersion4_8
        set(
            child
        ) = gtk_check_button_set_child(gtkCheckButtonPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * If the check button is in an “in between” state.
     *
     * The inconsistent state only affects visual appearance,
     * not the semantics of the button.
     */
    public open var inconsistent: Boolean
        /**
         * Returns whether the check button is in an inconsistent state.
         *
         * @return true if @check_button is currently in an inconsistent state
         */
        get() = gtk_check_button_get_inconsistent(gtkCheckButtonPointer.reinterpret()).asBoolean()

        /**
         * Sets the `GtkCheckButton` to inconsistent state.
         *
         * You should turn off the inconsistent state again if the user checks
         * the check button. This has to be done manually.
         *
         * @param inconsistent true if state is inconsistent
         */
        set(
            inconsistent
        ) = gtk_check_button_set_inconsistent(gtkCheckButtonPointer.reinterpret(), inconsistent.asGBoolean())

    /**
     * Text of the label inside the check button, if it contains a label widget.
     */
    public open var label: String?
        /**
         * Returns the label of the check button or `NULL` if [property@CheckButton:child] is set.
         *
         * @return The label @self shows next
         *   to the indicator. If no label is shown, null will be returned.
         */
        get() = gtk_check_button_get_label(gtkCheckButtonPointer.reinterpret())?.toKString()

        /**
         * Sets the text of @self.
         *
         * If [property@Gtk.CheckButton:use-underline] is true, an underscore
         * in @label is interpreted as mnemonic indicator, see
         * [method@Gtk.CheckButton.set_use_underline] for details on this behavior.
         *
         * @param label The text shown next to the indicator, or null
         *   to show no text
         */
        set(label) = gtk_check_button_set_label(gtkCheckButtonPointer.reinterpret(), label)

    /**
     * If set, an underline in the text indicates that the following
     * character is to be used as mnemonic.
     */
    public open var useUnderline: Boolean
        /**
         * Returns whether underlines in the label indicate mnemonics.
         *
         * @return The value of the [property@Gtk.CheckButton:use-underline] property.
         *   See [method@Gtk.CheckButton.set_use_underline] for details on how to set
         *   a new value.
         */
        get() = gtk_check_button_get_use_underline(gtkCheckButtonPointer.reinterpret()).asBoolean()

        /**
         * Sets whether underlines in the label indicate mnemonics.
         *
         * If @setting is true, an underscore character in @self's label
         * indicates a mnemonic accelerator key. This behavior is similar
         * to [property@Gtk.Label:use-underline].
         *
         * @param setting the new value to set
         */
        set(setting) = gtk_check_button_set_use_underline(gtkCheckButtonPointer.reinterpret(), setting.asGBoolean())

    /**
     * Creates a new `GtkCheckButton`.
     *
     * @return a new `GtkCheckButton`
     */
    public constructor() : this(gtk_check_button_new()!!.reinterpret())

    /**
     * Creates a new `GtkCheckButton` with the given text.
     *
     * @param label the text for the check button.
     * @return a new `GtkCheckButton`
     */
    public constructor(label: String? = null) : this(gtk_check_button_new_with_label(label)!!.reinterpret())

    /**
     * Returns whether the check button is active.
     *
     * @return whether the check button is active
     */
    public open fun getActive(): Boolean = gtk_check_button_get_active(gtkCheckButtonPointer.reinterpret()).asBoolean()

    /**
     * Gets the child widget of @button or `NULL` if [property@CheckButton:label] is set.
     *
     * @return the child widget of @button
     * @since 4.8
     */
    @GtkVersion4_8
    public open fun getChild(): Widget? =
        gtk_check_button_get_child(gtkCheckButtonPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Returns whether the check button is in an inconsistent state.
     *
     * @return true if @check_button is currently in an inconsistent state
     */
    public open fun getInconsistent(): Boolean =
        gtk_check_button_get_inconsistent(gtkCheckButtonPointer.reinterpret()).asBoolean()

    /**
     * Returns the label of the check button or `NULL` if [property@CheckButton:child] is set.
     *
     * @return The label @self shows next
     *   to the indicator. If no label is shown, null will be returned.
     */
    public open fun getLabel(): String? = gtk_check_button_get_label(gtkCheckButtonPointer.reinterpret())?.toKString()

    /**
     * Returns whether underlines in the label indicate mnemonics.
     *
     * @return The value of the [property@Gtk.CheckButton:use-underline] property.
     *   See [method@Gtk.CheckButton.set_use_underline] for details on how to set
     *   a new value.
     */
    public open fun getUseUnderline(): Boolean =
        gtk_check_button_get_use_underline(gtkCheckButtonPointer.reinterpret()).asBoolean()

    /**
     * Changes the check buttons active state.
     *
     * @param setting the new value to set
     */
    public open fun setActive(setting: Boolean): Unit =
        gtk_check_button_set_active(gtkCheckButtonPointer.reinterpret(), setting.asGBoolean())

    /**
     * Sets the child widget of @button.
     *
     * Note that by using this API, you take full responsibility for setting
     * up the proper accessibility label and description information for @button.
     * Most likely, you'll either set the accessibility label or description
     * for @button explicitly, or you'll set a labelled-by or described-by
     * relations from @child to @button.
     *
     * @param child the child widget
     * @since 4.8
     */
    @GtkVersion4_8
    public open fun setChild(child: Widget? = null): Unit =
        gtk_check_button_set_child(gtkCheckButtonPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * Adds @self to the group of @group.
     *
     * In a group of multiple check buttons, only one button can be active
     * at a time. The behavior of a checkbutton in a group is also commonly
     * known as a *radio button*.
     *
     * Setting the group of a check button also changes the css name of the
     * indicator widget's CSS node to 'radio'.
     *
     * Setting up groups in a cycle leads to undefined behavior.
     *
     * Note that the same effect can be achieved via the [iface@Gtk.Actionable]
     * API, by using the same action with parameter type and state type 's'
     * for all buttons in the group, and giving each button its own target
     * value.
     *
     * @param group another `GtkCheckButton` to
     *   form a group with
     */
    public open fun setGroup(group: CheckButton? = null): Unit =
        gtk_check_button_set_group(gtkCheckButtonPointer.reinterpret(), group?.gtkCheckButtonPointer?.reinterpret())

    /**
     * Sets the `GtkCheckButton` to inconsistent state.
     *
     * You should turn off the inconsistent state again if the user checks
     * the check button. This has to be done manually.
     *
     * @param inconsistent true if state is inconsistent
     */
    public open fun setInconsistent(inconsistent: Boolean): Unit =
        gtk_check_button_set_inconsistent(gtkCheckButtonPointer.reinterpret(), inconsistent.asGBoolean())

    /**
     * Sets the text of @self.
     *
     * If [property@Gtk.CheckButton:use-underline] is true, an underscore
     * in @label is interpreted as mnemonic indicator, see
     * [method@Gtk.CheckButton.set_use_underline] for details on this behavior.
     *
     * @param label The text shown next to the indicator, or null
     *   to show no text
     */
    public open fun setLabel(label: String? = null): Unit =
        gtk_check_button_set_label(gtkCheckButtonPointer.reinterpret(), label)

    /**
     * Sets whether underlines in the label indicate mnemonics.
     *
     * If @setting is true, an underscore character in @self's label
     * indicates a mnemonic accelerator key. This behavior is similar
     * to [property@Gtk.Label:use-underline].
     *
     * @param setting the new value to set
     */
    public open fun setUseUnderline(setting: Boolean): Unit =
        gtk_check_button_set_use_underline(gtkCheckButtonPointer.reinterpret(), setting.asGBoolean())

    /**
     * Emitted to when the check button is activated.
     *
     * The `::activate` signal on `GtkCheckButton` is an action signal and
     * emitting it causes the button to animate press then release.
     *
     * Applications should never connect to this signal, but use the
     * [signal@Gtk.CheckButton::toggled] signal.
     *
     * The default bindings for this signal are all forms of the
     * <kbd>␣</kbd> and <kbd>Enter</kbd> keys.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 4.2
     */
    @GtkVersion4_2
    public fun connectActivate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate",
            connectActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the buttons's [property@Gtk.CheckButton:active]
     * property changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectToggled(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "toggled",
            connectToggledFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<CheckButton> {
        override val type: GeneratedClassKGType<CheckButton> =
            GeneratedClassKGType(gtk_check_button_get_type()) { CheckButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Creates a new `GtkCheckButton` with the given text.
         *
         * @param label the text for the check button.
         * @return a new `GtkCheckButton`
         */
        public fun newWithLabel(label: String? = null): CheckButton =
            CheckButton(gtk_check_button_new_with_label(label)!!.reinterpret())

        /**
         * Creates a new `GtkCheckButton` with the given text and a mnemonic.
         *
         * @param label The text of the button, with an underscore
         *   in front of the mnemonic character
         * @return a new `GtkCheckButton`
         */
        public fun newWithMnemonic(label: String? = null): CheckButton =
            CheckButton(gtk_check_button_new_with_mnemonic(label)!!.reinterpret())
    }
}

private val connectActivateFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectToggledFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
