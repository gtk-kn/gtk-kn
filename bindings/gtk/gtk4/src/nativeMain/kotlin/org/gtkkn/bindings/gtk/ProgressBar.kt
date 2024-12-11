// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.pango.EllipsizeMode
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gdouble
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAccessibleRange
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkProgressBar
import org.gtkkn.native.gtk.gtk_progress_bar_get_ellipsize
import org.gtkkn.native.gtk.gtk_progress_bar_get_fraction
import org.gtkkn.native.gtk.gtk_progress_bar_get_inverted
import org.gtkkn.native.gtk.gtk_progress_bar_get_pulse_step
import org.gtkkn.native.gtk.gtk_progress_bar_get_show_text
import org.gtkkn.native.gtk.gtk_progress_bar_get_text
import org.gtkkn.native.gtk.gtk_progress_bar_get_type
import org.gtkkn.native.gtk.gtk_progress_bar_new
import org.gtkkn.native.gtk.gtk_progress_bar_pulse
import org.gtkkn.native.gtk.gtk_progress_bar_set_ellipsize
import org.gtkkn.native.gtk.gtk_progress_bar_set_fraction
import org.gtkkn.native.gtk.gtk_progress_bar_set_inverted
import org.gtkkn.native.gtk.gtk_progress_bar_set_pulse_step
import org.gtkkn.native.gtk.gtk_progress_bar_set_show_text
import org.gtkkn.native.gtk.gtk_progress_bar_set_text
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * `GtkProgressBar` is typically used to display the progress of a long
 * running operation.
 *
 * It provides a visual clue that processing is underway. `GtkProgressBar`
 * can be used in two different modes: percentage mode and activity mode.
 *
 * ![An example GtkProgressBar](progressbar.png)
 *
 * When an application can determine how much work needs to take place
 * (e.g. read a fixed number of bytes from a file) and can monitor its
 * progress, it can use the `GtkProgressBar` in percentage mode and the
 * user sees a growing bar indicating the percentage of the work that
 * has been completed. In this mode, the application is required to call
 * [method@Gtk.ProgressBar.set_fraction] periodically to update the progress bar.
 *
 * When an application has no accurate way of knowing the amount of work
 * to do, it can use the `GtkProgressBar` in activity mode, which shows
 * activity by a block moving back and forth within the progress area. In
 * this mode, the application is required to call [method@Gtk.ProgressBar.pulse]
 * periodically to update the progress bar.
 *
 * There is quite a bit of flexibility provided to control the appearance
 * of the `GtkProgressBar`. Functions are provided to control the orientation
 * of the bar, optional text can be displayed along with the bar, and the
 * step size used in activity mode can be set.
 *
 * # CSS nodes
 *
 * ```
 * progressbar[.osd]
 * ├── [text]
 * ╰── trough[.empty][.full]
 *     ╰── progress[.pulse]
 * ```
 *
 * `GtkProgressBar` has a main CSS node with name progressbar and subnodes with
 * names text and trough, of which the latter has a subnode named progress. The
 * text subnode is only present if text is shown. The progress subnode has the
 * style class .pulse when in activity mode. It gets the style classes .left,
 * .right, .top or .bottom added when the progress 'touches' the corresponding
 * end of the GtkProgressBar. The .osd class on the progressbar node is for use
 * in overlays like the one Epiphany has for page loading progress.
 *
 * # Accessibility
 *
 * `GtkProgressBar` uses the %GTK_ACCESSIBLE_ROLE_PROGRESS_BAR role.
 */
public open class ProgressBar(pointer: CPointer<GtkProgressBar>) :
    Widget(pointer.reinterpret()),
    AccessibleRange,
    Orientable,
    KGTyped {
    public val gtkProgressBarPointer: CPointer<GtkProgressBar>
        get() = gPointer.reinterpret()

    override val gtkAccessibleRangePointer: CPointer<GtkAccessibleRange>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The preferred place to ellipsize the string.
     *
     * The text will be ellipsized if the progress bar does not have enough room
     * to display the entire string, specified as a `PangoEllipsizeMode`.
     *
     * Note that setting this property to a value other than
     * %PANGO_ELLIPSIZE_NONE has the side-effect that the progress bar requests
     * only enough space to display the ellipsis ("..."). Another means to set a
     * progress bar's width is [method@Gtk.Widget.set_size_request].
     */
    public open var ellipsize: EllipsizeMode
        /**
         * Returns the ellipsizing position of the progress bar.
         *
         * See [method@Gtk.ProgressBar.set_ellipsize].
         *
         * @return `PangoEllipsizeMode`
         */
        get() = gtk_progress_bar_get_ellipsize(gtkProgressBarPointer.reinterpret()).run {
            EllipsizeMode.fromNativeValue(this)
        }

        /**
         * Sets the mode used to ellipsize the text.
         *
         * The text is ellipsized if there is not enough space
         * to render the entire string.
         *
         * @param mode a `PangoEllipsizeMode`
         */
        set(mode) = gtk_progress_bar_set_ellipsize(gtkProgressBarPointer.reinterpret(), mode.nativeValue)

    /**
     * The fraction of total work that has been completed.
     */
    public open var fraction: gdouble
        /**
         * Returns the current fraction of the task that’s been completed.
         *
         * @return a fraction from 0.0 to 1.0
         */
        get() = gtk_progress_bar_get_fraction(gtkProgressBarPointer.reinterpret())

        /**
         * Causes the progress bar to “fill in” the given fraction
         * of the bar.
         *
         * The fraction should be between 0.0 and 1.0, inclusive.
         *
         * @param fraction fraction of the task that’s been completed
         */
        set(fraction) = gtk_progress_bar_set_fraction(gtkProgressBarPointer.reinterpret(), fraction)

    /**
     * Invert the direction in which the progress bar grows.
     */
    public open var inverted: Boolean
        /**
         * Returns whether the progress bar is inverted.
         *
         * @return true if the progress bar is inverted
         */
        get() = gtk_progress_bar_get_inverted(gtkProgressBarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the progress bar is inverted.
         *
         * Progress bars normally grow from top to bottom or left to right.
         * Inverted progress bars grow in the opposite direction.
         *
         * @param inverted true to invert the progress bar
         */
        set(inverted) = gtk_progress_bar_set_inverted(gtkProgressBarPointer.reinterpret(), inverted.asGBoolean())

    /**
     * The fraction of total progress to move the bounding block when pulsed.
     */
    public open var pulseStep: gdouble
        /**
         * Retrieves the pulse step.
         *
         * See [method@Gtk.ProgressBar.set_pulse_step].
         *
         * @return a fraction from 0.0 to 1.0
         */
        get() = gtk_progress_bar_get_pulse_step(gtkProgressBarPointer.reinterpret())

        /**
         * Sets the fraction of total progress bar length to move the
         * bouncing block.
         *
         * The bouncing block is moved when [method@Gtk.ProgressBar.pulse]
         * is called.
         *
         * @param fraction fraction between 0.0 and 1.0
         */
        set(fraction) = gtk_progress_bar_set_pulse_step(gtkProgressBarPointer.reinterpret(), fraction)

    /**
     * Sets whether the progress bar will show a text in addition
     * to the bar itself.
     *
     * The shown text is either the value of the [property@Gtk.ProgressBar:text]
     * property or, if that is null, the [property@Gtk.ProgressBar:fraction]
     * value, as a percentage.
     *
     * To make a progress bar that is styled and sized suitably for showing text
     * (even if the actual text is blank), set [property@Gtk.ProgressBar:show-text]
     * to true and [property@Gtk.ProgressBar:text] to the empty string (not null).
     */
    public open var showText: Boolean
        /**
         * Returns whether the `GtkProgressBar` shows text.
         *
         * See [method@Gtk.ProgressBar.set_show_text].
         *
         * @return true if text is shown in the progress bar
         */
        get() = gtk_progress_bar_get_show_text(gtkProgressBarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the progress bar will show text next to the bar.
         *
         * The shown text is either the value of the [property@Gtk.ProgressBar:text]
         * property or, if that is null, the [property@Gtk.ProgressBar:fraction] value,
         * as a percentage.
         *
         * To make a progress bar that is styled and sized suitably for containing
         * text (even if the actual text is blank), set [property@Gtk.ProgressBar:show-text]
         * to true and [property@Gtk.ProgressBar:text] to the empty string (not null).
         *
         * @param showText whether to show text
         */
        set(showText) = gtk_progress_bar_set_show_text(gtkProgressBarPointer.reinterpret(), showText.asGBoolean())

    /**
     * Text to be displayed in the progress bar.
     */
    public open var text: String?
        /**
         * Retrieves the text that is displayed with the progress bar.
         *
         * The return value is a reference to the text, not a copy of it,
         * so will become invalid if you change the text in the progress bar.
         *
         * @return the text
         */
        get() = gtk_progress_bar_get_text(gtkProgressBarPointer.reinterpret())?.toKString()

        /**
         * Causes the given @text to appear next to the progress bar.
         *
         * If @text is null and [property@Gtk.ProgressBar:show-text] is true,
         * the current value of [property@Gtk.ProgressBar:fraction] will be displayed
         * as a percentage.
         *
         * If @text is non-null and [property@Gtk.ProgressBar:show-text] is true,
         * the text will be displayed. In this case, it will not display the progress
         * percentage. If @text is the empty string, the progress bar will still
         * be styled and sized suitably for containing text, as long as
         * [property@Gtk.ProgressBar:show-text] is true.
         *
         * @param text a UTF-8 string
         */
        set(text) = gtk_progress_bar_set_text(gtkProgressBarPointer.reinterpret(), text)

    /**
     * Creates a new `GtkProgressBar`.
     *
     * @return a `GtkProgressBar`.
     */
    public constructor() : this(gtk_progress_bar_new()!!.reinterpret())

    /**
     * Indicates that some progress has been made, but you don’t know how much.
     *
     * Causes the progress bar to enter “activity mode,” where a block
     * bounces back and forth. Each call to [method@Gtk.ProgressBar.pulse]
     * causes the block to move by a little bit (the amount of movement
     * per pulse is determined by [method@Gtk.ProgressBar.set_pulse_step]).
     */
    public open fun pulse(): Unit = gtk_progress_bar_pulse(gtkProgressBarPointer.reinterpret())

    public companion object : TypeCompanion<ProgressBar> {
        override val type: GeneratedClassKGType<ProgressBar> =
            GeneratedClassKGType(gtk_progress_bar_get_type()) { ProgressBar(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ProgressBar
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_progress_bar_get_type()
    }
}
