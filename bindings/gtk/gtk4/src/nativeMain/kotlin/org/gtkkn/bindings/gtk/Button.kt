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
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkButton
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_button_get_can_shrink
import org.gtkkn.native.gtk.gtk_button_get_child
import org.gtkkn.native.gtk.gtk_button_get_has_frame
import org.gtkkn.native.gtk.gtk_button_get_icon_name
import org.gtkkn.native.gtk.gtk_button_get_label
import org.gtkkn.native.gtk.gtk_button_get_type
import org.gtkkn.native.gtk.gtk_button_get_use_underline
import org.gtkkn.native.gtk.gtk_button_new
import org.gtkkn.native.gtk.gtk_button_new_from_icon_name
import org.gtkkn.native.gtk.gtk_button_new_with_label
import org.gtkkn.native.gtk.gtk_button_new_with_mnemonic
import org.gtkkn.native.gtk.gtk_button_set_can_shrink
import org.gtkkn.native.gtk.gtk_button_set_child
import org.gtkkn.native.gtk.gtk_button_set_has_frame
import org.gtkkn.native.gtk.gtk_button_set_icon_name
import org.gtkkn.native.gtk.gtk_button_set_label
import org.gtkkn.native.gtk.gtk_button_set_use_underline
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The `GtkButton` widget is generally used to trigger a callback function that is
 * called when the button is pressed.
 *
 * ![An example GtkButton](button.png)
 *
 * The `GtkButton` widget can hold any valid child widget. That is, it can hold
 * almost any other standard `GtkWidget`. The most commonly used child is the
 * `GtkLabel`.
 *
 * # Shortcuts and Gestures
 *
 * The following signals have default keybindings:
 *
 * - [signal@Gtk.Button::activate]
 *
 * # CSS nodes
 *
 * `GtkButton` has a single CSS node with name button. The node will get the
 * style classes .image-button or .text-button, if the content is just an
 * image or label, respectively. It may also receive the .flat style class.
 * When activating a button via the keyboard, the button will temporarily
 * gain the .keyboard-activating style class.
 *
 * Other style classes that are commonly used with `GtkButton` include
 * .suggested-action and .destructive-action. In special cases, buttons
 * can be made round by adding the .circular style class.
 *
 * Button-like widgets like [class@Gtk.ToggleButton], [class@Gtk.MenuButton],
 * [class@Gtk.VolumeButton], [class@Gtk.LockButton], [class@Gtk.ColorButton]
 * or [class@Gtk.FontButton] use style classes such as .toggle, .popup, .scale,
 * .lock, .color on the button node to differentiate themselves from a plain
 * `GtkButton`.
 *
 * # Accessibility
 *
 * `GtkButton` uses the %GTK_ACCESSIBLE_ROLE_BUTTON role.
 *
 * ## Skipped during bindings generation
 *
 * - method `icon-name`: Property TypeInfo of getter and setter do not match
 * - method `label`: Property TypeInfo of getter and setter do not match
 */
public open class Button(public val gtkButtonPointer: CPointer<GtkButton>) :
    Widget(gtkButtonPointer.reinterpret()),
    Actionable,
    KGTyped {
    init {
        Gtk
    }

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether the size of the button can be made smaller than the natural
     * size of its contents.
     *
     * For text buttons, setting this property will allow ellipsizing the label.
     *
     * If the contents of a button are an icon or a custom widget, setting this
     * property has no effect.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var canShrink: Boolean
        /**
         * Retrieves whether the button can be smaller than the natural
         * size of its contents.
         *
         * @return true if the button can shrink, and false otherwise
         * @since 4.12
         */
        get() = gtk_button_get_can_shrink(gtkButtonPointer).asBoolean()

        /**
         * Sets whether the button size can be smaller than the natural size of
         * its contents.
         *
         * For text buttons, setting @can_shrink to true will ellipsize the label.
         *
         * For icons and custom children, this function has no effect.
         *
         * @param canShrink whether the button can shrink
         * @since 4.12
         */
        @GtkVersion4_12
        set(canShrink) = gtk_button_set_can_shrink(gtkButtonPointer, canShrink.asGBoolean())

    /**
     * The child widget.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @button.
         *
         * @return the child widget of @button
         */
        get() = gtk_button_get_child(gtkButtonPointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
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
         */
        set(child) = gtk_button_set_child(gtkButtonPointer, child?.gtkWidgetPointer)

    /**
     * Whether the button has a frame.
     */
    public open var hasFrame: Boolean
        /**
         * Returns whether the button has a frame.
         *
         * @return true if the button has a frame
         */
        get() = gtk_button_get_has_frame(gtkButtonPointer).asBoolean()

        /**
         * Sets the style of the button.
         *
         * Buttons can have a flat appearance or have a frame drawn around them.
         *
         * @param hasFrame whether the button should have a visible frame
         */
        set(hasFrame) = gtk_button_set_has_frame(gtkButtonPointer, hasFrame.asGBoolean())

    /**
     * If set, an underline in the text indicates that the following character is
     * to be used as mnemonic.
     */
    public open var useUnderline: Boolean
        /**
         * gets whether underlines are interpreted as mnemonics.
         *
         * See [method@Gtk.Button.set_use_underline].
         *
         * @return true if an embedded underline in the button label
         *   indicates the mnemonic accelerator keys.
         */
        get() = gtk_button_get_use_underline(gtkButtonPointer).asBoolean()

        /**
         * Sets whether to use underlines as mnemonics.
         *
         * If true, an underline in the text of the button label indicates
         * the next character should be used for the mnemonic accelerator key.
         *
         * @param useUnderline true if underlines in the text indicate mnemonics
         */
        set(useUnderline) = gtk_button_set_use_underline(gtkButtonPointer, useUnderline.asGBoolean())

    /**
     * Creates a new `GtkButton` widget.
     *
     * To add a child widget to the button, use [method@Gtk.Button.set_child].
     *
     * @return The newly created `GtkButton` widget.
     */
    public constructor() : this(gtk_button_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Creates a `GtkButton` widget with a `GtkLabel` child.
     *
     * @param label The text you want the `GtkLabel` to hold
     * @return The newly created `GtkButton` widget
     */
    public constructor(label: String) : this(gtk_button_new_with_label(label)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Returns the icon name of the button.
     *
     * If the icon name has not been set with [method@Gtk.Button.set_icon_name]
     * the return value will be null. This will be the case if you create
     * an empty button with [ctor@Gtk.Button.new] to use as a container.
     *
     * @return The icon name set via [method@Gtk.Button.set_icon_name]
     */
    public open fun getIconName(): String? = gtk_button_get_icon_name(gtkButtonPointer)?.toKString()

    /**
     * Fetches the text from the label of the button.
     *
     * If the label text has not been set with [method@Gtk.Button.set_label]
     * the return value will be null. This will be the case if you create
     * an empty button with [ctor@Gtk.Button.new] to use as a container.
     *
     * @return The text of the label widget. This string is owned
     * by the widget and must not be modified or freed.
     */
    public open fun getLabel(): String? = gtk_button_get_label(gtkButtonPointer)?.toKString()

    /**
     * Adds a `GtkImage` with the given icon name as a child.
     *
     * If @button already contains a child widget, that child widget will
     * be removed and replaced with the image.
     *
     * @param iconName An icon name
     */
    public open fun setIconName(iconName: String): Unit = gtk_button_set_icon_name(gtkButtonPointer, iconName)

    /**
     * Sets the text of the label of the button to @label.
     *
     * This will also clear any previously set labels.
     *
     * @param label a string
     */
    public open fun setLabel(label: String): Unit = gtk_button_set_label(gtkButtonPointer, label)

    /**
     * Emitted to animate press then release.
     *
     * This is an action signal. Applications should never connect
     * to this signal, but use the [signal@Gtk.Button::clicked] signal.
     *
     * The default bindings for this signal are all forms of the
     * <kbd>␣</kbd> and <kbd>Enter</kbd> keys.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkButtonPointer,
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
        g_signal_emit_by_name(gtkButtonPointer.reinterpret(), "activate")
    }

    /**
     * Emitted when the button has been activated (pressed and released).
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onClicked(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkButtonPointer,
            "clicked",
            onClickedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "clicked" signal. See [onClicked].
     */
    public fun emitClicked() {
        g_signal_emit_by_name(gtkButtonPointer.reinterpret(), "clicked")
    }

    public companion object : TypeCompanion<Button> {
        override val type: GeneratedClassKGType<Button> =
            GeneratedClassKGType(getTypeOrNull()!!) { Button(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Button
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_button_get_type()

        /**
         * Gets the GType of from the symbol `gtk_button_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_button_get_type")

        /**
         * Creates a new `GtkButton` containing a label.
         *
         * If characters in @label are preceded by an underscore, they are underlined.
         * If you need a literal underscore character in a label, use “__” (two
         * underscores). The first underlined character represents a keyboard
         * accelerator called a mnemonic. Pressing <kbd>Alt</kbd> and that key
         * activates the button.
         *
         * @param label The text of the button, with an underscore in front of the
         *   mnemonic character
         * @return a new `GtkButton`
         */
        public fun withMnemonic(label: String): Button =
            Button(gtk_button_new_with_mnemonic(label)!!.reinterpret()).apply {
                InstanceCache.put(this)
            }

        /**
         * Creates a new button containing an icon from the current icon theme.
         *
         * If the icon name isn’t known, a “broken image” icon will be
         * displayed instead. If the current icon theme is changed, the icon
         * will be updated appropriately.
         *
         * @param iconName an icon name
         * @return a new `GtkButton` displaying the themed icon
         */
        public fun fromIconName(iconName: String): Button =
            Button(gtk_button_new_from_icon_name(iconName)!!.reinterpret()).apply {
                InstanceCache.put(this)
            }
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onClickedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
