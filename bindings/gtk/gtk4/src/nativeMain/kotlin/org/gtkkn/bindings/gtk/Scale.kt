// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.pango.Layout
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAccessibleRange
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkScale
import org.gtkkn.native.gtk.gtk_scale_add_mark
import org.gtkkn.native.gtk.gtk_scale_clear_marks
import org.gtkkn.native.gtk.gtk_scale_get_digits
import org.gtkkn.native.gtk.gtk_scale_get_draw_value
import org.gtkkn.native.gtk.gtk_scale_get_has_origin
import org.gtkkn.native.gtk.gtk_scale_get_layout
import org.gtkkn.native.gtk.gtk_scale_get_type
import org.gtkkn.native.gtk.gtk_scale_get_value_pos
import org.gtkkn.native.gtk.gtk_scale_new
import org.gtkkn.native.gtk.gtk_scale_new_with_range
import org.gtkkn.native.gtk.gtk_scale_set_digits
import org.gtkkn.native.gtk.gtk_scale_set_draw_value
import org.gtkkn.native.gtk.gtk_scale_set_format_value_func
import org.gtkkn.native.gtk.gtk_scale_set_has_origin
import org.gtkkn.native.gtk.gtk_scale_set_value_pos
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A `GtkScale` is a slider control used to select a numeric value.
 *
 * ![An example GtkScale](scales.png)
 *
 * To use it, you’ll probably want to investigate the methods on its base
 * class, [class@Gtk.Range], in addition to the methods for `GtkScale` itself.
 * To set the value of a scale, you would normally use [method@Gtk.Range.set_value].
 * To detect changes to the value, you would normally use the
 * [signal@Gtk.Range::value-changed] signal.
 *
 * Note that using the same upper and lower bounds for the `GtkScale` (through
 * the `GtkRange` methods) will hide the slider itself. This is useful for
 * applications that want to show an undeterminate value on the scale, without
 * changing the layout of the application (such as movie or music players).
 *
 * # GtkScale as GtkBuildable
 *
 * `GtkScale` supports a custom `<marks>` element, which can contain multiple
 * `<mark\>` elements. The “value” and “position” attributes have the same
 * meaning as [method@Gtk.Scale.add_mark] parameters of the same name. If
 * the element is not empty, its content is taken as the markup to show at
 * the mark. It can be translated with the usual ”translatable” and
 * “context” attributes.
 *
 * # CSS nodes
 *
 * ```
 * scale[.fine-tune][.marks-before][.marks-after]
 * ├── [value][.top][.right][.bottom][.left]
 * ├── marks.top
 * │   ├── mark
 * │   ┊    ├── [label]
 * │   ┊    ╰── indicator
 * ┊   ┊
 * │   ╰── mark
 * ├── marks.bottom
 * │   ├── mark
 * │   ┊    ├── indicator
 * │   ┊    ╰── [label]
 * ┊   ┊
 * │   ╰── mark
 * ╰── trough
 *     ├── [fill]
 *     ├── [highlight]
 *     ╰── slider
 * ```
 *
 * `GtkScale` has a main CSS node with name scale and a subnode for its contents,
 * with subnodes named trough and slider.
 *
 * The main node gets the style class .fine-tune added when the scale is in
 * 'fine-tuning' mode.
 *
 * If the scale has an origin (see [method@Gtk.Scale.set_has_origin]), there is
 * a subnode with name highlight below the trough node that is used for rendering
 * the highlighted part of the trough.
 *
 * If the scale is showing a fill level (see [method@Gtk.Range.set_show_fill_level]),
 * there is a subnode with name fill below the trough node that is used for
 * rendering the filled in part of the trough.
 *
 * If marks are present, there is a marks subnode before or after the trough
 * node, below which each mark gets a node with name mark. The marks nodes get
 * either the .top or .bottom style class.
 *
 * The mark node has a subnode named indicator. If the mark has text, it also
 * has a subnode named label. When the mark is either above or left of the
 * scale, the label subnode is the first when present. Otherwise, the indicator
 * subnode is the first.
 *
 * The main CSS node gets the 'marks-before' and/or 'marks-after' style classes
 * added depending on what marks are present.
 *
 * If the scale is displaying the value (see [property@Gtk.Scale:draw-value]),
 * there is subnode with name value. This node will get the .top or .bottom style
 * classes similar to the marks node.
 *
 * # Accessibility
 *
 * `GtkScale` uses the %GTK_ACCESSIBLE_ROLE_SLIDER role.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `x`: x: Out parameter is not supported
 */
public open class Scale(pointer: CPointer<GtkScale>) :
    Range(pointer.reinterpret()),
    KGTyped {
    public val gtkScalePointer: CPointer<GtkScale>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkAccessibleRangePointer: CPointer<GtkAccessibleRange>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    /**
     * The number of decimal places that are displayed in the value.
     */
    public open var digits: gint
        /**
         * Gets the number of decimal places that are displayed in the value.
         *
         * @return the number of decimal places that are displayed
         */
        get() = gtk_scale_get_digits(gtkScalePointer.reinterpret())

        /**
         * Sets the number of decimal places that are displayed in the value.
         *
         * Also causes the value of the adjustment to be rounded to this number
         * of digits, so the retrieved value matches the displayed one, if
         * [property@Gtk.Scale:draw-value] is true when the value changes. If
         * you want to enforce rounding the value when [property@Gtk.Scale:draw-value]
         * is false, you can set [property@Gtk.Range:round-digits] instead.
         *
         * Note that rounding to a small number of digits can interfere with
         * the smooth autoscrolling that is built into `GtkScale`. As an alternative,
         * you can use [method@Gtk.Scale.set_format_value_func] to format the displayed
         * value yourself.
         *
         * @param digits the number of decimal places to display,
         *   e.g. use 1 to display 1.0, 2 to display 1.00, etc
         */
        set(digits) = gtk_scale_set_digits(gtkScalePointer.reinterpret(), digits)

    /**
     * Whether the current value is displayed as a string next to the slider.
     */
    public open var drawValue: Boolean
        /**
         * Returns whether the current value is displayed as a string
         * next to the slider.
         *
         * @return whether the current value is displayed as a string
         */
        get() = gtk_scale_get_draw_value(gtkScalePointer.reinterpret()).asBoolean()

        /**
         * Specifies whether the current value is displayed as a string next
         * to the slider.
         *
         * @param drawValue true to draw the value
         */
        set(drawValue) = gtk_scale_set_draw_value(gtkScalePointer.reinterpret(), drawValue.asGBoolean())

    /**
     * Whether the scale has an origin.
     */
    public open var hasOrigin: Boolean
        /**
         * Returns whether the scale has an origin.
         *
         * @return true if the scale has an origin.
         */
        get() = gtk_scale_get_has_origin(gtkScalePointer.reinterpret()).asBoolean()

        /**
         * Sets whether the scale has an origin.
         *
         * If [property@Gtk.Scale:has-origin] is set to true (the default),
         * the scale will highlight the part of the trough between the origin
         * (bottom or left side) and the current value.
         *
         * @param hasOrigin true if the scale has an origin
         */
        set(hasOrigin) = gtk_scale_set_has_origin(gtkScalePointer.reinterpret(), hasOrigin.asGBoolean())

    /**
     * The position in which the current value is displayed.
     */
    public open var valuePos: PositionType
        /**
         * Gets the position in which the current value is displayed.
         *
         * @return the position in which the current value is displayed
         */
        get() = gtk_scale_get_value_pos(gtkScalePointer.reinterpret()).run {
            PositionType.fromNativeValue(this)
        }

        /**
         * Sets the position in which the current value is displayed.
         *
         * @param pos the position in which the current value is displayed
         */
        set(pos) = gtk_scale_set_value_pos(gtkScalePointer.reinterpret(), pos.nativeValue)

    /**
     * Creates a new `GtkScale`.
     *
     * @param orientation the scale’s orientation.
     * @param adjustment the [class@Gtk.Adjustment] which sets
     *   the range of the scale, or null to create a new adjustment.
     * @return a new `GtkScale`
     */
    public constructor(
        orientation: Orientation,
        adjustment: Adjustment? = null,
    ) : this(gtk_scale_new(orientation.nativeValue, adjustment?.gtkAdjustmentPointer?.reinterpret())!!.reinterpret())

    /**
     * Creates a new scale widget with a range from @min to @max.
     *
     * The returns scale will have the given orientation and will let the
     * user input a number between @min and @max (including @min and @max)
     * with the increment @step. @step must be nonzero; it’s the distance
     * the slider moves when using the arrow keys to adjust the scale
     * value.
     *
     * Note that the way in which the precision is derived works best if
     * @step is a power of ten. If the resulting precision is not suitable
     * for your needs, use [method@Gtk.Scale.set_digits] to correct it.
     *
     * @param orientation the scale’s orientation.
     * @param min minimum value
     * @param max maximum value
     * @param step step increment (tick size) used with keyboard shortcuts
     * @return a new `GtkScale`
     */
    public constructor(
        orientation: Orientation,
        min: gdouble,
        max: gdouble,
        step: gdouble,
    ) : this(gtk_scale_new_with_range(orientation.nativeValue, min, max, step)!!.reinterpret())

    /**
     * Adds a mark at @value.
     *
     * A mark is indicated visually by drawing a tick mark next to the scale,
     * and GTK makes it easy for the user to position the scale exactly at the
     * marks value.
     *
     * If @markup is not null, text is shown next to the tick mark.
     *
     * To remove marks from a scale, use [method@Gtk.Scale.clear_marks].
     *
     * @param value the value at which the mark is placed, must be between
     *   the lower and upper limits of the scales’ adjustment
     * @param position where to draw the mark. For a horizontal scale, %GTK_POS_TOP
     *   and %GTK_POS_LEFT are drawn above the scale, anything else below.
     *   For a vertical scale, %GTK_POS_LEFT and %GTK_POS_TOP are drawn to
     *   the left of the scale, anything else to the right.
     * @param markup Text to be shown at the mark, using Pango markup
     */
    public open fun addMark(`value`: gdouble, position: PositionType, markup: String? = null): Unit =
        gtk_scale_add_mark(gtkScalePointer.reinterpret(), `value`, position.nativeValue, markup)

    /**
     * Removes any marks that have been added.
     */
    public open fun clearMarks(): Unit = gtk_scale_clear_marks(gtkScalePointer.reinterpret())

    /**
     * Gets the `PangoLayout` used to display the scale.
     *
     * The returned object is owned by the scale so does not need
     * to be freed by the caller.
     *
     * @return the [class@Pango.Layout]
     *   for this scale, or null if the [property@Gtk.Scale:draw-value]
     *   property is false.
     */
    public open fun getLayout(): Layout? = gtk_scale_get_layout(gtkScalePointer.reinterpret())?.run {
        Layout(reinterpret())
    }

    /**
     * @func allows you to change how the scale value is displayed.
     *
     * The given function will return an allocated string representing
     * @value. That string will then be used to display the scale's value.
     *
     * If #NULL is passed as @func, the value will be displayed on
     * its own, rounded according to the value of the
     * [property@Gtk.Scale:digits] property.
     *
     * @param func function that formats the value
     */
    public open fun setFormatValueFunc(func: ScaleFormatValueFunc?): Unit = gtk_scale_set_format_value_func(
        gtkScalePointer.reinterpret(),
        func?.let {
            ScaleFormatValueFuncFunc.reinterpret()
        },
        func?.let { StableRef.create(func).asCPointer() },
        func?.let { staticStableRefDestroy.reinterpret() }
    )

    public companion object : TypeCompanion<Scale> {
        override val type: GeneratedClassKGType<Scale> =
            GeneratedClassKGType(gtk_scale_get_type()) { Scale(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Scale
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_scale_get_type()
    }
}
