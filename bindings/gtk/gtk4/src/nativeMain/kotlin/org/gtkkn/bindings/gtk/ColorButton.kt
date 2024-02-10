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
import org.gtkkn.bindings.gdk.RGBA
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
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
public open class ColorButton(
    pointer: CPointer<GtkColorButton>,
) : Widget(pointer.reinterpret()), ColorChooser, KGTyped {
    public val gtkColorButtonPointer: CPointer<GtkColorButton>
        get() = gPointer.reinterpret()

    override val gtkColorChooserPointer: CPointer<GtkColorChooser>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Whether the color chooser dialog should be modal.
     */
    public open var modal: Boolean
        /**
         * Gets whether the dialog is modal.
         *
         * @return true if the dialog is modal
         */
        get() = gtk_color_button_get_modal(gtkColorButtonPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the dialog should be modal.
         *
         * @param modal true to make the dialog modal
         */
        set(modal) =
            gtk_color_button_set_modal(
                gtkColorButtonPointer.reinterpret(),
                modal.asGBoolean()
            )

    /**
     * The title of the color chooser dialog
     */
    public open var title: String
        /**
         * Gets the title of the color chooser dialog.
         *
         * @return An internal string, do not free the return value
         */
        get() =
            gtk_color_button_get_title(gtkColorButtonPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the title for the color chooser dialog.
         *
         * @param title String containing new window title
         */
        set(title) = gtk_color_button_set_title(gtkColorButtonPointer.reinterpret(), title)

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
    public constructor(rgba: RGBA) :
        this(gtk_color_button_new_with_rgba(rgba.gdkRGBAPointer)!!.reinterpret())

    /**
     * Gets whether the dialog is modal.
     *
     * @return true if the dialog is modal
     */
    public open fun getModal(): Boolean = gtk_color_button_get_modal(gtkColorButtonPointer.reinterpret()).asBoolean()

    /**
     * Gets the title of the color chooser dialog.
     *
     * @return An internal string, do not free the return value
     */
    public open fun getTitle(): String =
        gtk_color_button_get_title(gtkColorButtonPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Sets whether the dialog should be modal.
     *
     * @param modal true to make the dialog modal
     */
    public open fun setModal(modal: Boolean): Unit =
        gtk_color_button_set_modal(gtkColorButtonPointer.reinterpret(), modal.asGBoolean())

    /**
     * Sets the title for the color chooser dialog.
     *
     * @param title String containing new window title
     */
    public open fun setTitle(title: String): Unit =
        gtk_color_button_set_title(gtkColorButtonPointer.reinterpret(), title)

    /**
     * Emitted to when the color button is activated.
     *
     * The `::activate` signal on `GtkMenuButton` is an action signal and
     * emitting it causes the button to pop up its dialog.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 4.4
     */
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
     * Emitted when the user selects a color.
     *
     * When handling this signal, use [method@Gtk.ColorChooser.get_rgba]
     * to find out which color was just selected.
     *
     * Note that this signal is only emitted when the user changes the color.
     * If you need to react to programmatic color changes as well, use
     * the notify::rgba signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectColorSet(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "color-set",
            connectColorSetFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<ColorButton> {
        override val type: GeneratedClassKGType<ColorButton> =
            GeneratedClassKGType(gtk_color_button_get_type()) { ColorButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectActivateFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectColorSetFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
