// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.RGBA
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkColorDialogButton
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_color_dialog_button_get_dialog
import org.gtkkn.native.gtk.gtk_color_dialog_button_get_rgba
import org.gtkkn.native.gtk.gtk_color_dialog_button_get_type
import org.gtkkn.native.gtk.gtk_color_dialog_button_new
import org.gtkkn.native.gtk.gtk_color_dialog_button_set_dialog
import org.gtkkn.native.gtk.gtk_color_dialog_button_set_rgba
import kotlin.ULong
import kotlin.Unit

/**
 * The `GtkColorDialogButton` is a wrapped around a [class@Gtk.ColorDialog]
 * and allows to open a color chooser dialog to change the color.
 *
 * ![An example GtkColorDialogButton](color-button.png)
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
 * `GtkColorDialogButton` has a single CSS node with name colorbutton which
 * contains a button node. To differentiate it from a plain `GtkButton`,
 * it gets the .color style class.
 *
 * ## Skipped during bindings generation
 *
 * - method `dialog`: Property TypeInfo of getter and setter do not match
 *
 * @since 4.10
 */
public open class ColorDialogButton(
    pointer: CPointer<GtkColorDialogButton>,
) : Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkColorDialogButtonPointer: CPointer<GtkColorDialogButton>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The selected color.
     *
     * This property can be set to give the button its initial
     * color, and it will be updated to reflect the users choice
     * in the color chooser dialog.
     *
     * Listen to `notify::rgba` to get informed about changes
     * to the buttons color.
     *
     * @since 4.10
     */
    public open var rgba: RGBA
        /**
         * Returns the color of the button.
         *
         * This function is what should be used to obtain
         * the color that was chosen by the user. To get
         * informed about changes, listen to "notify::rgba".
         *
         * @return the color
         * @since 4.10
         */
        get() =
            gtk_color_dialog_button_get_rgba(gtkColorDialogButtonPointer.reinterpret())!!.run {
                RGBA(reinterpret())
            }

        /**
         * Sets the color of the button.
         *
         * @param color the new color
         * @since 4.10
         */
        set(color) = gtk_color_dialog_button_set_rgba(gtkColorDialogButtonPointer.reinterpret(), color.gdkRGBAPointer)

    /**
     * Creates a new `GtkColorDialogButton` with the
     * given `GtkColorDialog`.
     *
     * You can pass `NULL` to this function and set a `GtkColorDialog`
     * later. The button will be insensitive until that happens.
     *
     * @param dialog the `GtkColorDialog` to use
     * @return the new `GtkColorDialogButton`
     * @since 4.10
     */
    public constructor(
        dialog: ColorDialog? = null,
    ) : this(gtk_color_dialog_button_new(dialog?.gtkColorDialogPointer?.reinterpret())!!.reinterpret())

    /**
     * Returns the `GtkColorDialog` of @self.
     *
     * @return the `GtkColorDialog`
     * @since 4.10
     */
    public open fun getDialog(): ColorDialog? =
        gtk_color_dialog_button_get_dialog(gtkColorDialogButtonPointer.reinterpret())?.run {
            ColorDialog(reinterpret())
        }

    /**
     * Returns the color of the button.
     *
     * This function is what should be used to obtain
     * the color that was chosen by the user. To get
     * informed about changes, listen to "notify::rgba".
     *
     * @return the color
     * @since 4.10
     */
    public open fun getRgba(): RGBA =
        gtk_color_dialog_button_get_rgba(gtkColorDialogButtonPointer.reinterpret())!!.run {
            RGBA(reinterpret())
        }

    /**
     * Sets a `GtkColorDialog` object to use for
     * creating the color chooser dialog that is
     * presented when the user clicks the button.
     *
     * @param dialog the new `GtkColorDialog`
     * @since 4.10
     */
    public open fun setDialog(dialog: ColorDialog): Unit =
        gtk_color_dialog_button_set_dialog(
            gtkColorDialogButtonPointer.reinterpret(),
            dialog.gtkColorDialogPointer.reinterpret()
        )

    /**
     * Sets the color of the button.
     *
     * @param color the new color
     * @since 4.10
     */
    public open fun setRgba(color: RGBA): Unit =
        gtk_color_dialog_button_set_rgba(gtkColorDialogButtonPointer.reinterpret(), color.gdkRGBAPointer)

    /**
     * Emitted when the color dialog button is activated.
     *
     * The `::activate` signal on `GtkColorDialogButton` is an action signal
     * and emitting it causes the button to pop up its dialog.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 4.14
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

    public companion object : TypeCompanion<ColorDialogButton> {
        override val type: GeneratedClassKGType<ColorDialogButton> =
            GeneratedClassKGType(gtk_color_dialog_button_get_type()) { ColorDialogButton(it.reinterpret()) }

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
    }.reinterpret()