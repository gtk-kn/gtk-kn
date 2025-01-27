// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAccessibleRange
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkScaleButton
import org.gtkkn.native.gtk.gtk_scale_button_get_active
import org.gtkkn.native.gtk.gtk_scale_button_get_adjustment
import org.gtkkn.native.gtk.gtk_scale_button_get_has_frame
import org.gtkkn.native.gtk.gtk_scale_button_get_minus_button
import org.gtkkn.native.gtk.gtk_scale_button_get_plus_button
import org.gtkkn.native.gtk.gtk_scale_button_get_popup
import org.gtkkn.native.gtk.gtk_scale_button_get_type
import org.gtkkn.native.gtk.gtk_scale_button_get_value
import org.gtkkn.native.gtk.gtk_scale_button_new
import org.gtkkn.native.gtk.gtk_scale_button_set_adjustment
import org.gtkkn.native.gtk.gtk_scale_button_set_has_frame
import org.gtkkn.native.gtk.gtk_scale_button_set_icons
import org.gtkkn.native.gtk.gtk_scale_button_set_value
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * `GtkScaleButton` provides a button which pops up a scale widget.
 *
 * This kind of widget is commonly used for volume controls in multimedia
 * applications, and GTK provides a [class@Gtk.VolumeButton] subclass that
 * is tailored for this use case.
 *
 * # CSS nodes
 *
 * ```
 * scalebutton.scale
 * ╰── button.toggle
 *     ╰── <icon>
 * ```
 *
 * `GtkScaleButton` has a single CSS node with name scalebutton and `.scale`
 * style class, and contains a `button` node with a `.toggle` style class.
 *
 * ## Skipped during bindings generation
 *
 * - method `icons`: Property has no getter
 */
public open class ScaleButton(public val gtkScaleButtonPointer: CPointer<GtkScaleButton>) :
    Widget(gtkScaleButtonPointer.reinterpret()),
    AccessibleRange,
    Orientable,
    KGTyped {
    override val gtkAccessibleRangePointer: CPointer<GtkAccessibleRange>
        get() = handle.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * If the scale button should be pressed in.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open val active: Boolean
        /**
         * Queries a `GtkScaleButton` and returns its current state.
         *
         * Returns true if the scale button is pressed in and false
         * if it is raised.
         *
         * @return whether the button is pressed
         * @since 4.10
         */
        get() = gtk_scale_button_get_active(gtkScaleButtonPointer).asBoolean()

    /**
     * The `GtkAdjustment` that is used as the model.
     */
    public open var adjustment: Adjustment
        /**
         * Gets the `GtkAdjustment` associated with the `GtkScaleButton`’s scale.
         *
         * See [method@Gtk.Range.get_adjustment] for details.
         *
         * @return the adjustment associated with the scale
         */
        get() = gtk_scale_button_get_adjustment(gtkScaleButtonPointer)!!.run {
            Adjustment(this)
        }

        /**
         * Sets the `GtkAdjustment` to be used as a model
         * for the `GtkScaleButton`’s scale.
         *
         * See [method@Gtk.Range.set_adjustment] for details.
         *
         * @param adjustment a `GtkAdjustment`
         */
        set(adjustment) = gtk_scale_button_set_adjustment(gtkScaleButtonPointer, adjustment.gtkAdjustmentPointer)

    /**
     * If the scale button has a frame.
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public open var hasFrame: Boolean
        /**
         * Returns whether the button has a frame.
         *
         * @return true if the button has a frame
         * @since 4.14
         */
        get() = gtk_scale_button_get_has_frame(gtkScaleButtonPointer).asBoolean()

        /**
         * Sets the style of the button.
         *
         * @param hasFrame whether the button should have a visible frame
         * @since 4.14
         */
        @GtkVersion4_14
        set(hasFrame) = gtk_scale_button_set_has_frame(gtkScaleButtonPointer, hasFrame.asGBoolean())

    /**
     * The value of the scale.
     */
    public open var `value`: gdouble
        /**
         * Gets the current value of the scale button.
         *
         * @return current value of the scale button
         */
        get() = gtk_scale_button_get_value(gtkScaleButtonPointer)

        /**
         * Sets the current value of the scale.
         *
         * If the value is outside the minimum or maximum range values,
         * it will be clamped to fit inside them.
         *
         * The scale button emits the [signal@Gtk.ScaleButton::value-changed]
         * signal if the value changes.
         *
         * @param value new value of the scale button
         */
        set(`value`) = gtk_scale_button_set_value(gtkScaleButtonPointer, `value`)

    /**
     * Creates a `GtkScaleButton`.
     *
     * The new scale button has a range between @min and @max,
     * with a stepping of @step.
     *
     * @param min the minimum value of the scale (usually 0)
     * @param max the maximum value of the scale (usually 100)
     * @param step the stepping of value when a scroll-wheel event,
     *   or up/down arrow event occurs (usually 2)
     * @param icons a null-terminated
     *   array of icon names, or null if you want to set the list
     *   later with gtk_scale_button_set_icons()
     * @return a new `GtkScaleButton`
     */
    public constructor(
        min: gdouble,
        max: gdouble,
        step: gdouble,
        icons: List<String>? = null,
    ) : this(
        memScoped {
            gtk_scale_button_new(min, max, step, icons?.toCStringList(this))!!.reinterpret()
        }
    )

    /**
     * Retrieves the minus button of the `GtkScaleButton`.
     *
     * @return the minus button
     *   of the `GtkScaleButton`
     */
    public open fun getMinusButton(): Button = gtk_scale_button_get_minus_button(gtkScaleButtonPointer)!!.run {
        Button(reinterpret())
    }

    /**
     * Retrieves the plus button of the `GtkScaleButton.`
     *
     * @return the plus button
     *   of the `GtkScaleButton`
     */
    public open fun getPlusButton(): Button = gtk_scale_button_get_plus_button(gtkScaleButtonPointer)!!.run {
        Button(reinterpret())
    }

    /**
     * Retrieves the popup of the `GtkScaleButton`.
     *
     * @return the popup of the `GtkScaleButton`
     */
    public open fun getPopup(): Widget = gtk_scale_button_get_popup(gtkScaleButtonPointer)!!.run {
        Widget.WidgetImpl(this)
    }

    /**
     * Sets the icons to be used by the scale button.
     *
     * @param icons a null-terminated array of icon names
     */
    public open fun setIcons(icons: List<String>): Unit = memScoped {
        return gtk_scale_button_set_icons(gtkScaleButtonPointer, icons.toCStringList(this))
    }

    /**
     * Emitted to dismiss the popup.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is <kbd>Escape</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onPopdown(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkScaleButtonPointer,
            "popdown",
            onPopdownFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "popdown" signal. See [onPopdown].
     */
    public fun emitPopdown() {
        g_signal_emit_by_name(gtkScaleButtonPointer.reinterpret(), "popdown")
    }

    /**
     * Emitted to popup the scale widget.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are <kbd>Space</kbd>,
     * <kbd>Enter</kbd> and <kbd>Return</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onPopup(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkScaleButtonPointer,
            "popup",
            onPopupFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "popup" signal. See [onPopup].
     */
    public fun emitPopup() {
        g_signal_emit_by_name(gtkScaleButtonPointer.reinterpret(), "popup")
    }

    /**
     * Emitted when the value field has changed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `value` the new value
     */
    public fun onValueChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`value`: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkScaleButtonPointer,
        "value-changed",
        onValueChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "value-changed" signal. See [onValueChanged].
     *
     * @param value the new value
     */
    public fun emitValueChanged(`value`: gdouble) {
        g_signal_emit_by_name(gtkScaleButtonPointer.reinterpret(), "value-changed", `value`)
    }

    public companion object : TypeCompanion<ScaleButton> {
        override val type: GeneratedClassKGType<ScaleButton> =
            GeneratedClassKGType(getTypeOrNull("gtk_scale_button_get_type")!!) { ScaleButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ScaleButton
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_scale_button_get_type()
    }
}

private val onPopdownFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onPopupFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onValueChangedFunc: CPointer<CFunction<(gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        `value`: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`value`: gdouble) -> Unit>().get().invoke(`value`)
}
    .reinterpret()
