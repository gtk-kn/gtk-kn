// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
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
import org.gtkkn.native.gtk.GtkLevelBar
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.gtk_level_bar_add_offset_value
import org.gtkkn.native.gtk.gtk_level_bar_get_inverted
import org.gtkkn.native.gtk.gtk_level_bar_get_max_value
import org.gtkkn.native.gtk.gtk_level_bar_get_min_value
import org.gtkkn.native.gtk.gtk_level_bar_get_mode
import org.gtkkn.native.gtk.gtk_level_bar_get_type
import org.gtkkn.native.gtk.gtk_level_bar_get_value
import org.gtkkn.native.gtk.gtk_level_bar_new
import org.gtkkn.native.gtk.gtk_level_bar_new_for_interval
import org.gtkkn.native.gtk.gtk_level_bar_remove_offset_value
import org.gtkkn.native.gtk.gtk_level_bar_set_inverted
import org.gtkkn.native.gtk.gtk_level_bar_set_max_value
import org.gtkkn.native.gtk.gtk_level_bar_set_min_value
import org.gtkkn.native.gtk.gtk_level_bar_set_mode
import org.gtkkn.native.gtk.gtk_level_bar_set_value
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkLevelBar` is a widget that can be used as a level indicator.
 *
 * Typical use cases are displaying the strength of a password, or
 * showing the charge level of a battery.
 *
 * ![An example GtkLevelBar](levelbar.png)
 *
 * Use [method@Gtk.LevelBar.set_value] to set the current value, and
 * [method@Gtk.LevelBar.add_offset_value] to set the value offsets at which
 * the bar will be considered in a different state. GTK will add a few
 * offsets by default on the level bar: %GTK_LEVEL_BAR_OFFSET_LOW,
 * %GTK_LEVEL_BAR_OFFSET_HIGH and %GTK_LEVEL_BAR_OFFSET_FULL, with
 * values 0.25, 0.75 and 1.0 respectively.
 *
 * Note that it is your responsibility to update preexisting offsets
 * when changing the minimum or maximum value. GTK will simply clamp
 * them to the new range.
 *
 * ## Adding a custom offset on the bar
 *
 * ```c
 * static GtkWidget *
 * create_level_bar (void)
 * {
 *   GtkWidget *widget;
 *   GtkLevelBar *bar;
 *
 *   widget = gtk_level_bar_new ();
 *   bar = GTK_LEVEL_BAR (widget);
 *
 *   // This changes the value of the default low offset
 *
 *   gtk_level_bar_add_offset_value (bar,
 *                                   GTK_LEVEL_BAR_OFFSET_LOW,
 *                                   0.10);
 *
 *   // This adds a new offset to the bar; the application will
 *   // be able to change its color CSS like this:
 *   //
 *   // levelbar block.my-offset {
 *   //   background-color: magenta;
 *   //   border-style: solid;
 *   //   border-color: black;
 *   //   border-width: 1px;
 *   // }
 *
 *   gtk_level_bar_add_offset_value (bar, "my-offset", 0.60);
 *
 *   return widget;
 * }
 * ```
 *
 * The default interval of values is between zero and one, but it’s possible
 * to modify the interval using [method@Gtk.LevelBar.set_min_value] and
 * [method@Gtk.LevelBar.set_max_value]. The value will be always drawn in
 * proportion to the admissible interval, i.e. a value of 15 with a specified
 * interval between 10 and 20 is equivalent to a value of 0.5 with an interval
 * between 0 and 1. When %GTK_LEVEL_BAR_MODE_DISCRETE is used, the bar level
 * is rendered as a finite number of separated blocks instead of a single one.
 * The number of blocks that will be rendered is equal to the number of units
 * specified by the admissible interval.
 *
 * For instance, to build a bar rendered with five blocks, it’s sufficient to
 * set the minimum value to 0 and the maximum value to 5 after changing the
 * indicator mode to discrete.
 *
 * # GtkLevelBar as GtkBuildable
 *
 * The `GtkLevelBar` implementation of the `GtkBuildable` interface supports a
 * custom `<offsets>` element, which can contain any number of `<offset>` elements,
 * each of which must have "name" and "value" attributes.
 *
 * # CSS nodes
 *
 * ```
 * levelbar[.discrete]
 * ╰── trough
 *     ├── block.filled.level-name
 *     ┊
 *     ├── block.empty
 *     ┊
 * ```
 *
 * `GtkLevelBar` has a main CSS node with name levelbar and one of the style
 * classes .discrete or .continuous and a subnode with name trough. Below the
 * trough node are a number of nodes with name block and style class .filled
 * or .empty. In continuous mode, there is exactly one node of each, in discrete
 * mode, the number of filled and unfilled nodes corresponds to blocks that are
 * drawn. The block.filled nodes also get a style class .level-name corresponding
 * to the level for the current value.
 *
 * In horizontal orientation, the nodes are always arranged from left to right,
 * regardless of text direction.
 *
 * # Accessibility
 *
 * `GtkLevelBar` uses the %GTK_ACCESSIBLE_ROLE_METER role.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `value`: value: Out parameter is not supported
 */
public open class LevelBar(public val gtkLevelBarPointer: CPointer<GtkLevelBar>) :
    Widget(gtkLevelBarPointer.reinterpret()),
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
     * Whether the `GtkLeveBar` is inverted.
     *
     * Level bars normally grow from top to bottom or left to right.
     * Inverted level bars grow in the opposite direction.
     */
    public open var inverted: Boolean
        /**
         * Returns whether the levelbar is inverted.
         *
         * @return true if the level bar is inverted
         */
        get() = gtk_level_bar_get_inverted(gtkLevelBarPointer).asBoolean()

        /**
         * Sets whether the `GtkLevelBar` is inverted.
         *
         * @param inverted true to invert the level bar
         */
        set(inverted) = gtk_level_bar_set_inverted(gtkLevelBarPointer, inverted.asGBoolean())

    /**
     * Determines the maximum value of the interval that can be displayed by the bar.
     */
    public open var maxValue: gdouble
        /**
         * Returns the `max-value` of the `GtkLevelBar`.
         *
         * @return a positive value
         */
        get() = gtk_level_bar_get_max_value(gtkLevelBarPointer)

        /**
         * Sets the `max-value` of the `GtkLevelBar`.
         *
         * You probably want to update preexisting level offsets after calling
         * this function.
         *
         * @param value a positive value
         */
        set(`value`) = gtk_level_bar_set_max_value(gtkLevelBarPointer, `value`)

    /**
     * Determines the minimum value of the interval that can be displayed by the bar.
     */
    public open var minValue: gdouble
        /**
         * Returns the `min-value` of the `GtkLevelBar`.
         *
         * @return a positive value
         */
        get() = gtk_level_bar_get_min_value(gtkLevelBarPointer)

        /**
         * Sets the `min-value` of the `GtkLevelBar`.
         *
         * You probably want to update preexisting level offsets after calling
         * this function.
         *
         * @param value a positive value
         */
        set(`value`) = gtk_level_bar_set_min_value(gtkLevelBarPointer, `value`)

    /**
     * Determines the way `GtkLevelBar` interprets the value properties to draw the
     * level fill area.
     *
     * Specifically, when the value is %GTK_LEVEL_BAR_MODE_CONTINUOUS,
     * `GtkLevelBar` will draw a single block representing the current value in
     * that area; when the value is %GTK_LEVEL_BAR_MODE_DISCRETE,
     * the widget will draw a succession of separate blocks filling the
     * draw area, with the number of blocks being equal to the units separating
     * the integral roundings of [property@Gtk.LevelBar:min-value] and
     * [property@Gtk.LevelBar:max-value].
     */
    public open var mode: LevelBarMode
        /**
         * Returns the `mode` of the `GtkLevelBar`.
         *
         * @return a `GtkLevelBarMode`
         */
        get() = gtk_level_bar_get_mode(gtkLevelBarPointer).run {
            LevelBarMode.fromNativeValue(this)
        }

        /**
         * Sets the `mode` of the `GtkLevelBar`.
         *
         * @param mode a `GtkLevelBarMode`
         */
        set(mode) = gtk_level_bar_set_mode(gtkLevelBarPointer, mode.nativeValue)

    /**
     * Determines the currently filled value of the level bar.
     */
    public open var `value`: gdouble
        /**
         * Returns the `value` of the `GtkLevelBar`.
         *
         * @return a value in the interval between
         *   [property@Gtk.LevelBar:min-value] and [property@Gtk.LevelBar:max-value]
         */
        get() = gtk_level_bar_get_value(gtkLevelBarPointer)

        /**
         * Sets the value of the `GtkLevelBar`.
         *
         * @param value a value in the interval between
         *   [property@Gtk.LevelBar:min-value] and [property@Gtk.LevelBar:max-value]
         */
        set(`value`) = gtk_level_bar_set_value(gtkLevelBarPointer, `value`)

    /**
     * Creates a new `GtkLevelBar`.
     *
     * @return a `GtkLevelBar`.
     */
    public constructor() : this(gtk_level_bar_new()!!.reinterpret())

    /**
     * Creates a new `GtkLevelBar` for the specified interval.
     *
     * @param minValue a positive value
     * @param maxValue a positive value
     * @return a `GtkLevelBar`
     */
    public constructor(
        minValue: gdouble,
        maxValue: gdouble,
    ) : this(gtk_level_bar_new_for_interval(minValue, maxValue)!!.reinterpret())

    /**
     * Adds a new offset marker on @self at the position specified by @value.
     *
     * When the bar value is in the interval topped by @value (or between @value
     * and [property@Gtk.LevelBar:max-value] in case the offset is the last one
     * on the bar) a style class named `level-`@name will be applied
     * when rendering the level bar fill.
     *
     * If another offset marker named @name exists, its value will be
     * replaced by @value.
     *
     * @param name the name of the new offset
     * @param value the value for the new offset
     */
    public open fun addOffsetValue(name: String, `value`: gdouble): Unit =
        gtk_level_bar_add_offset_value(gtkLevelBarPointer, name, `value`)

    /**
     * Removes an offset marker from a `GtkLevelBar`.
     *
     * The marker must have been previously added with
     * [method@Gtk.LevelBar.add_offset_value].
     *
     * @param name the name of an offset in the bar
     */
    public open fun removeOffsetValue(name: String? = null): Unit =
        gtk_level_bar_remove_offset_value(gtkLevelBarPointer, name)

    /**
     * Emitted when an offset specified on the bar changes value.
     *
     * This typically is the result of a [method@Gtk.LevelBar.add_offset_value]
     * call.
     *
     * The signal supports detailed connections; you can connect to the
     * detailed signal "changed::x" in order to only receive callbacks when
     * the value of offset "x" changes.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param detail the signal detail
     * @param handler the Callback to connect. Params: `name` the name of the offset that changed value
     */
    public fun onOffsetChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        detail: String? = null,
        handler: (name: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkLevelBarPointer,
        "offset-changed" + (
            detail?.let {
                "::$it"
            } ?: ""
            ),
        onOffsetChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "offset-changed" signal. See [onOffsetChanged].
     *
     * @param detail the signal detail
     * @param name the name of the offset that changed value
     */
    public fun emitOffsetChanged(detail: String? = null, name: String) {
        g_signal_emit_by_name(
            gtkLevelBarPointer.reinterpret(),
            "offset-changed" + (
                detail?.let {
                    "::$it"
                } ?: ""
                ),
            name.cstr
        )
    }

    public companion object : TypeCompanion<LevelBar> {
        override val type: GeneratedClassKGType<LevelBar> =
            GeneratedClassKGType(gtk_level_bar_get_type()) { LevelBar(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of LevelBar
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_level_bar_get_type()
    }
}

private val onOffsetChangedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            name: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                name: String,
            ) -> Unit
            >().get().invoke(name?.toKString() ?: error("Expected not null string"))
    }
        .reinterpret()
