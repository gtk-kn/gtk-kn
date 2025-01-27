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
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_4
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
import org.gtkkn.native.gtk.GtkColorButton
import org.gtkkn.native.gtk.GtkColorChooser
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_color_button_get_modal
import org.gtkkn.native.gtk.gtk_color_button_get_title
import org.gtkkn.native.gtk.gtk_color_button_get_type
import org.gtkkn.native.gtk.gtk_color_button_new
import org.gtkkn.native.gtk.gtk_color_button_new_with_rgba
import org.gtkkn.native.gtk.gtk_color_button_set_modal
import org.gtkkn.native.gtk.gtk_color_button_set_title
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The `GtkColorButton` allows to open a color chooser dialog to change
 * the color.
 *
 * ![An example GtkColorButton](color-button.png)
 *
 * It is suitable widget for selecting a color in a preference dialog.
 *
 * # CSS nodes
 *
 * ```
 * colorbutton
 * ╰── button.color
 *     ╰── [content]
 * ```
 *
 * `GtkColorButton` has a single CSS node with name colorbutton which
 * contains a button node. To differentiate it from a plain `GtkButton`,
 * it gets the .color style class.
 *
 * ## Skipped during bindings generation
 *
 * - method `show-editor`: Property has no getter nor setter
 */
public open class ColorButton(public val gtkColorButtonPointer: CPointer<GtkColorButton>) :
    Widget(gtkColorButtonPointer.reinterpret()),
    ColorChooser,
    KGTyped {
    override val gtkColorChooserPointer: CPointer<GtkColorChooser>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether the color chooser dialog should be modal.
     */
    public open var modal: Boolean
        /**
         * Gets whether the dialog is modal.
         *
         * @return true if the dialog is modal
         */
        get() = gtk_color_button_get_modal(gtkColorButtonPointer).asBoolean()

        /**
         * Sets whether the dialog should be modal.
         *
         * @param modal true to make the dialog modal
         */
        set(modal) = gtk_color_button_set_modal(gtkColorButtonPointer, modal.asGBoolean())

    /**
     * The title of the color chooser dialog
     */
    public open var title: String
        /**
         * Gets the title of the color chooser dialog.
         *
         * @return An internal string, do not free the return value
         */
        get() = gtk_color_button_get_title(gtkColorButtonPointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets the title for the color chooser dialog.
         *
         * @param title String containing new window title
         */
        set(title) = gtk_color_button_set_title(gtkColorButtonPointer, title)

    /**
     * Creates a new color button.
     *
     * This returns a widget in the form of a small button containing
     * a swatch representing the current selected color. When the button
     * is clicked, a color chooser dialog will open, allowing the user
     * to select a color. The swatch will be updated to reflect the new
     * color when the user finishes.
     *
     * @return a new color button
     */
    public constructor() : this(gtk_color_button_new()!!.reinterpret())

    /**
     * Creates a new color button showing the given color.
     *
     * @param rgba A `GdkRGBA` to set the current color with
     * @return a new color button
     */
    public constructor(rgba: Rgba) : this(gtk_color_button_new_with_rgba(rgba.gdkRgbaPointer)!!.reinterpret())

    /**
     * Emitted to when the color button is activated.
     *
     * The `::activate` signal on `GtkMenuButton` is an action signal and
     * emitting it causes the button to pop up its dialog.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 4.4
     */
    @GtkVersion4_4
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkColorButtonPointer,
            "activate",
            onActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate" signal. See [onActivate].
     *
     * @since 4.4
     */
    @GtkVersion4_4
    public fun emitActivate() {
        g_signal_emit_by_name(gtkColorButtonPointer.reinterpret(), "activate")
    }

    /**
     * Emitted when the user selects a color.
     *
     * When handling this signal, use [method@Gtk.ColorChooser.get_rgba]
     * to find out which color was just selected.
     *
     * Note that this signal is only emitted when the user changes the color.
     * If you need to react to programmatic color changes as well, use
     * the notify::rgba signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onColorSet(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkColorButtonPointer,
            "color-set",
            onColorSetFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "color-set" signal. See [onColorSet].
     */
    public fun emitColorSet() {
        g_signal_emit_by_name(gtkColorButtonPointer.reinterpret(), "color-set")
    }

    public companion object : TypeCompanion<ColorButton> {
        override val type: GeneratedClassKGType<ColorButton> =
            GeneratedClassKGType(getTypeOrNull("gtk_color_button_get_type")!!) { ColorButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ColorButton
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_color_button_get_type()
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onColorSetFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
