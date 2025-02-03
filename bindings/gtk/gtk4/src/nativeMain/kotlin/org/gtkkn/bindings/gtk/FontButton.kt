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
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_4
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
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkFontButton
import org.gtkkn.native.gtk.GtkFontChooser
import org.gtkkn.native.gtk.gtk_font_button_get_modal
import org.gtkkn.native.gtk.gtk_font_button_get_title
import org.gtkkn.native.gtk.gtk_font_button_get_type
import org.gtkkn.native.gtk.gtk_font_button_get_use_font
import org.gtkkn.native.gtk.gtk_font_button_get_use_size
import org.gtkkn.native.gtk.gtk_font_button_new
import org.gtkkn.native.gtk.gtk_font_button_new_with_font
import org.gtkkn.native.gtk.gtk_font_button_set_modal
import org.gtkkn.native.gtk.gtk_font_button_set_title
import org.gtkkn.native.gtk.gtk_font_button_set_use_font
import org.gtkkn.native.gtk.gtk_font_button_set_use_size
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * Use [class@Gtk.FontDialogButton] instead
 * ---
 *
 * The `GtkFontButton` allows to open a font chooser dialog to change
 * the font.
 *
 * ![An example GtkFontButton](font-button.png)
 *
 * It is suitable widget for selecting a font in a preference dialog.
 *
 * # CSS nodes
 *
 * ```
 * fontbutton
 * ╰── button.font
 *     ╰── [content]
 * ```
 *
 * `GtkFontButton` has a single CSS node with name fontbutton which
 * contains a button node with the .font style class.
 */
public open class FontButton(public val gtkFontButtonPointer: CPointer<GtkFontButton>) :
    Widget(gtkFontButtonPointer.reinterpret()),
    FontChooser,
    KGTyped {
    init {
        Gtk
    }

    override val gtkFontChooserPointer: CPointer<GtkFontChooser>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether the font chooser dialog should be modal.
     */
    public open var modal: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FontDialogButton] instead
         * ---
         *
         * Gets whether the dialog is modal.
         *
         * @return true if the dialog is modal
         */
        get() = gtk_font_button_get_modal(gtkFontButtonPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FontDialogButton] instead
         * ---
         *
         * Sets whether the dialog should be modal.
         *
         * @param modal true to make the dialog modal
         */
        set(modal) = gtk_font_button_set_modal(gtkFontButtonPointer, modal.asGBoolean())

    /**
     * The title of the font chooser dialog.
     */
    public open var title: String
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FontDialogButton] instead
         * ---
         *
         * Retrieves the title of the font chooser dialog.
         *
         * @return an internal copy of the title string
         *   which must not be freed.
         */
        get() = gtk_font_button_get_title(gtkFontButtonPointer)?.toKString() ?: error("Expected not null string")

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FontDialogButton] instead
         * ---
         *
         * Sets the title for the font chooser dialog.
         *
         * @param title a string containing the font chooser dialog title
         */
        set(title) = gtk_font_button_set_title(gtkFontButtonPointer, title)

    /**
     * Whether the buttons label will be drawn in the selected font.
     */
    public open var useFont: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FontDialogButton] instead
         * ---
         *
         * Returns whether the selected font is used in the label.
         *
         * @return whether the selected font is used in the label.
         */
        get() = gtk_font_button_get_use_font(gtkFontButtonPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FontDialogButton] instead
         * ---
         *
         * If @use_font is true, the font name will be written
         * using the selected font.
         *
         * @param useFont If true, font name will be written using font chosen.
         */
        set(useFont) = gtk_font_button_set_use_font(gtkFontButtonPointer, useFont.asGBoolean())

    /**
     * Whether the buttons label will use the selected font size.
     */
    public open var useSize: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FontDialogButton] instead
         * ---
         *
         * Returns whether the selected size is used in the label.
         *
         * @return whether the selected size is used in the label.
         */
        get() = gtk_font_button_get_use_size(gtkFontButtonPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FontDialogButton] instead
         * ---
         *
         * If @use_size is true, the font name will be written using
         * the selected size.
         *
         * @param useSize If true, font name will be written using the
         *   selected size.
         */
        set(useSize) = gtk_font_button_set_use_size(gtkFontButtonPointer, useSize.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FontDialogButton] instead
     * ---
     *
     * Creates a new font picker widget.
     *
     * @return a new font picker widget.
     */
    public constructor() : this(gtk_font_button_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FontDialogButton] instead
     * ---
     *
     * Creates a new font picker widget showing the given font.
     *
     * @param fontname Name of font to display in font chooser dialog
     * @return a new font picker widget.
     */
    public constructor(fontname: String) : this(gtk_font_button_new_with_font(fontname)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Emitted to when the font button is activated.
     *
     * The `::activate` signal on `GtkFontButton` is an action signal and
     * emitting it causes the button to present its dialog.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 4.4
     */
    @GtkVersion4_4
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFontButtonPointer,
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
        g_signal_emit_by_name(gtkFontButtonPointer.reinterpret(), "activate")
    }

    /**
     * Emitted when the user selects a font.
     *
     * When handling this signal, use [method@Gtk.FontChooser.get_font]
     * to find out which font was just selected.
     *
     * Note that this signal is only emitted when the user changes the font.
     * If you need to react to programmatic font changes as well, use
     * the notify::font signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onFontSet(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFontButtonPointer,
            "font-set",
            onFontSetFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "font-set" signal. See [onFontSet].
     */
    public fun emitFontSet() {
        g_signal_emit_by_name(gtkFontButtonPointer.reinterpret(), "font-set")
    }

    public companion object : TypeCompanion<FontButton> {
        override val type: GeneratedClassKGType<FontButton> =
            GeneratedClassKGType(getTypeOrNull()!!) { FontButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FontButton
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_font_button_get_type()

        /**
         * Gets the GType of from the symbol `gtk_font_button_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_font_button_get_type")
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onFontSetFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
