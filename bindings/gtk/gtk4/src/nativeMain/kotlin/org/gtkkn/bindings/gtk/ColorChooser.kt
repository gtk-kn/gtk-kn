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
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkRGBA
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkColorChooser
import org.gtkkn.native.gtk.gtk_color_chooser_get_rgba
import org.gtkkn.native.gtk.gtk_color_chooser_get_type
import org.gtkkn.native.gtk.gtk_color_chooser_get_use_alpha
import org.gtkkn.native.gtk.gtk_color_chooser_set_rgba
import org.gtkkn.native.gtk.gtk_color_chooser_set_use_alpha
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * Use [class@Gtk.ColorDialog] and [class@Gtk.ColorDialogButton]
 *   instead of widgets implementing `GtkColorChooser`
 * ---
 *
 * `GtkColorChooser` is an interface that is implemented by widgets
 * for choosing colors.
 *
 * Depending on the situation, colors may be allowed to have alpha (translucency).
 *
 * In GTK, the main widgets that implement this interface are
 * [class@Gtk.ColorChooserWidget], [class@Gtk.ColorChooserDialog] and
 * [class@Gtk.ColorButton].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `colors`: Array parameter of type Gdk.RGBA is not supported
 * - method `rgba`: Property has no getter
 */
public interface ColorChooser :
    Proxy,
    KGTyped {
    public val gtkColorChooserPointer: CPointer<GtkColorChooser>

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.ColorDialog] and [class@Gtk.ColorDialogButton]
     *   instead of widgets implementing `GtkColorChooser`
     * ---
     *
     * Whether colors may have alpha (translucency).
     *
     * When ::use-alpha is false, the `GdkRGBA` struct obtained
     * via the [property@Gtk.ColorChooser:rgba] property will be
     * forced to have alpha == 1.
     *
     * Implementations are expected to show alpha by rendering the color
     * over a non-uniform background (like a checkerboard pattern).
     */
    public var useAlpha: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.ColorDialog] instead
         * ---
         *
         * Returns whether the color chooser shows the alpha channel.
         *
         * @return true if the color chooser uses the alpha channel,
         *   false if not
         */
        get() = gtk_color_chooser_get_use_alpha(gtkColorChooserPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.ColorDialog] instead
         * ---
         *
         * Sets whether or not the color chooser should use the alpha channel.
         *
         * @param useAlpha true if color chooser should use alpha channel, false if not
         */
        set(useAlpha) = gtk_color_chooser_set_use_alpha(gtkColorChooserPointer, useAlpha.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.ColorDialog] instead
     * ---
     *
     * Gets the currently-selected color.
     *
     * @param color a `GdkRGBA` to fill in with the current color
     */
    public fun getRgba(color: Rgba): Unit = gtk_color_chooser_get_rgba(gtkColorChooserPointer, color.gdkRgbaPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.ColorDialog] instead
     * ---
     *
     * Returns whether the color chooser shows the alpha channel.
     *
     * @return true if the color chooser uses the alpha channel,
     *   false if not
     */
    public fun getUseAlpha(): Boolean = gtk_color_chooser_get_use_alpha(gtkColorChooserPointer).asBoolean()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.ColorDialog] instead
     * ---
     *
     * Sets the color.
     *
     * @param color the new color
     */
    public fun setRgba(color: Rgba): Unit = gtk_color_chooser_set_rgba(gtkColorChooserPointer, color.gdkRgbaPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.ColorDialog] instead
     * ---
     *
     * Sets whether or not the color chooser should use the alpha channel.
     *
     * @param useAlpha true if color chooser should use alpha channel, false if not
     */
    public fun setUseAlpha(useAlpha: Boolean): Unit =
        gtk_color_chooser_set_use_alpha(gtkColorChooserPointer, useAlpha.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.ColorDialog] and [class@Gtk.ColorDialogButton]
     *   instead of widgets implementing `GtkColorChooser`
     * ---
     *
     * Emitted when a color is activated from the color chooser.
     *
     * This usually happens when the user clicks a color swatch,
     * or a color is selected and the user presses one of the keys
     * Space, Shift+Space, Return or Enter.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `color` the color
     */
    public fun onColorActivated(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (color: Rgba) -> Unit): ULong =
        g_signal_connect_data(
            gtkColorChooserPointer,
            "color-activated",
            onColorActivatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The ColorChooserImpl type represents a native instance of the ColorChooser interface.
     *
     * @constructor Creates a new instance of ColorChooser for the provided [CPointer].
     */
    public class ColorChooserImpl(gtkColorChooserPointer: CPointer<GtkColorChooser>) :
        Object(gtkColorChooserPointer.reinterpret()),
        ColorChooser {
        init {
            Gtk
        }

        override val gtkColorChooserPointer: CPointer<GtkColorChooser> = gtkColorChooserPointer
    }

    public companion object : TypeCompanion<ColorChooser> {
        override val type: GeneratedInterfaceKGType<ColorChooser> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { ColorChooserImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ColorChooser
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_color_chooser_get_type()

        /**
         * Gets the GType of from the symbol `gtk_color_chooser_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_color_chooser_get_type")
    }
}

private val onColorActivatedFunc: CPointer<CFunction<(CPointer<GdkRGBA>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            color: CPointer<GdkRGBA>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(color: Rgba) -> Unit>().get().invoke(
            color!!.run {
                Rgba(this)
            }
        )
    }
        .reinterpret()
