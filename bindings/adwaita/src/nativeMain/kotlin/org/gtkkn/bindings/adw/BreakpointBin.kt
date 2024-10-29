// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwBreakpointBin
import org.gtkkn.native.adw.adw_breakpoint_bin_add_breakpoint
import org.gtkkn.native.adw.adw_breakpoint_bin_get_child
import org.gtkkn.native.adw.adw_breakpoint_bin_get_current_breakpoint
import org.gtkkn.native.adw.adw_breakpoint_bin_get_type
import org.gtkkn.native.adw.adw_breakpoint_bin_new
import org.gtkkn.native.adw.adw_breakpoint_bin_remove_breakpoint
import org.gtkkn.native.adw.adw_breakpoint_bin_set_child
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Unit

/**
 * A widget that changes layout based on available size.
 *
 * <picture>
 *   <source srcset="breakpoint-bin-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="breakpoint-bin.png" alt="breakpoint-bin">
 * </picture>
 *
 * `AdwBreakpointBin` provides a way to use breakpoints without [class@Window],
 * [class@ApplicationWindow] or [class@Dialog]. It can be useful for limiting
 * breakpoints to a single page and similar purposes. Most applications
 * shouldn't need it.
 *
 * `AdwBreakpointBin` is similar to [class@Bin]. It has one child, set via the
 * [property@BreakpointBin:child] property.
 *
 * When `AdwBreakpointBin` is resized, its child widget can rearrange its layout
 * at specific thresholds.
 *
 * The thresholds and layout changes are defined via [class@Breakpoint] objects.
 * They can be added using [method@BreakpointBin.add_breakpoint].
 *
 * Each breakpoint has a condition, specifying the bin's size and/or aspect
 * ratio, and setters that automatically set object properties when that
 * happens. The [signal@Breakpoint::apply] and [signal@Breakpoint::unapply] can
 * be used instead for more complex scenarios.
 *
 * Breakpoints are only allowed to modify widgets inside the `AdwBreakpointBin`,
 * but not on the `AdwBreakpointBin` itself or any other widgets.
 *
 * If multiple breakpoints can be used for the current size, the last one is
 * always picked. The current breakpoint can be tracked using the
 * [property@BreakpointBin:current-breakpoint] property.
 *
 * If none of the breakpoints can be used, that property will be set to `NULL`,
 * and the original property values will be used instead.
 *
 * ## Minimum Size
 *
 * Adding a breakpoint to `AdwBreakpointBin` will result in it having no minimum
 * size. The [property@Gtk.Widget:width-request] and
 * [property@Gtk.Widget:height-request] properties must always be set when using
 * breakpoints, indicating the smallest size you want to support.
 *
 * The minimum size and breakpoint conditions must be carefully selected so that
 * the child widget completely fits. If it doesn't, it will overflow and a
 * warning message will be printed.
 *
 * When choosing minimum size, consider translations and text scale factor
 * changes. Make sure to leave enough space for text labels, and enable
 * ellipsizing or wrapping if they might not fit.
 *
 * For [class@Gtk.Label] this can be done via [property@Gtk.Label:ellipsize], or
 * via [property@Gtk.Label:wrap] together with [property@Gtk.Label:wrap-mode].
 *
 * For buttons, use [property@Gtk.Button:can-shrink],
 * [property@Gtk.MenuButton:can-shrink], [property@Adw.SplitButton:can-shrink],
 * or [property@Adw.ButtonContent:can-shrink].
 *
 * ## Example
 *
 * ```c
 * GtkWidget *bin, *child;
 * AdwBreakpoint *breakpoint;
 *
 * bin = adw_breakpoint_bin_new ();
 * gtk_widget_set_size_request (bin, 150, 150);
 *
 * child = gtk_label_new ("Wide");
 * gtk_label_set_ellipsize (GTK_LABEL (label), PANGO_ELLIPSIZE_END);
 * gtk_widget_add_css_class (child, "title-1");
 * adw_breakpoint_bin_set_child (ADW_BREAKPOINT_BIN (bin), child);
 *
 * breakpoint = adw_breakpoint_new (adw_breakpoint_condition_parse ("max-width: 200px"));
 * adw_breakpoint_add_setters (breakpoint,
 *                             G_OBJECT (child), "label", "Narrow",
 *                             NULL);
 * adw_breakpoint_bin_add_breakpoint (ADW_BREAKPOINT_BIN (bin), breakpoint);
 * ```
 *
 * The bin has a single label inside it, displaying "Wide". When the bin's width
 * is smaller than or equal to 200px, it changes to "Narrow".
 *
 * ## `AdwBreakpointBin` as `GtkBuildable`
 *
 * `AdwBreakpointBin` allows adding `AdwBreakpoint` objects as children.
 *
 * Example of an `AdwBreakpointBin` UI definition:
 *
 * ```xml
 * <object class="AdwBreakpointBin">
 *   <property name="width-request">150</property>
 *   <property name="height-request">150</property>
 *   <property name="child">
 *     <object class="GtkLabel" id="child">
 *       <property name="label">Wide</property>
 *       <property name="ellipsize">end</property>
 *       <style>
 *         <class name="title-1"/>
 *       </style>
 *     </object>
 *   </property>
 *   <child>
 *     <object class="AdwBreakpoint">
 *       <condition>max-width: 200px</condition>
 *       <setter object="child" property="label">Narrow</setter>
 *     </object>
 *   </child>
 * </object>
 * ```
 *
 * See [class@Breakpoint] documentation for details.
 * @since 1.4
 */
public open class BreakpointBin(
    pointer: CPointer<AdwBreakpointBin>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val adwBreakpointBinPointer: CPointer<AdwBreakpointBin>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The child widget.
     *
     * @since 1.4
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         * @since 1.4
         */
        get() =
            adw_breakpoint_bin_get_child(adwBreakpointBinPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         * @since 1.4
         */
        set(child) =
            adw_breakpoint_bin_set_child(
                adwBreakpointBinPointer.reinterpret(),
                child?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * The current breakpoint.
     *
     * @since 1.4
     */
    public open val currentBreakpoint: Breakpoint?
        /**
         * Gets the current breakpoint.
         *
         * @return the current breakpoint
         * @since 1.4
         */
        get() =
            adw_breakpoint_bin_get_current_breakpoint(adwBreakpointBinPointer.reinterpret())?.run {
                Breakpoint(reinterpret())
            }

    /**
     * Creates a new `AdwBreakpointBin`.
     *
     * @return the newly created `AdwBreakpointBin`
     * @since 1.4
     */
    public constructor() : this(adw_breakpoint_bin_new()!!.reinterpret())

    /**
     * Adds @breakpoint to @self.
     *
     * @param breakpoint the breakpoint to add
     * @since 1.4
     */
    public open fun addBreakpoint(breakpoint: Breakpoint): Unit =
        adw_breakpoint_bin_add_breakpoint(
            adwBreakpointBinPointer.reinterpret(),
            breakpoint.adwBreakpointPointer.reinterpret()
        )

    /**
     * Gets the child widget of @self.
     *
     * @return the child widget of @self
     * @since 1.4
     */
    public open fun getChild(): Widget? =
        adw_breakpoint_bin_get_child(adwBreakpointBinPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the current breakpoint.
     *
     * @return the current breakpoint
     * @since 1.4
     */
    public open fun getCurrentBreakpoint(): Breakpoint? =
        adw_breakpoint_bin_get_current_breakpoint(adwBreakpointBinPointer.reinterpret())?.run {
            Breakpoint(reinterpret())
        }

    /**
     * Removes @breakpoint from @self.
     *
     * @param breakpoint a breakpoint to remove
     * @since 1.5
     */
    public open fun removeBreakpoint(breakpoint: Breakpoint): Unit =
        adw_breakpoint_bin_remove_breakpoint(
            adwBreakpointBinPointer.reinterpret(),
            breakpoint.adwBreakpointPointer.reinterpret()
        )

    /**
     * Sets the child widget of @self.
     *
     * @param child the child widget
     * @since 1.4
     */
    public open fun setChild(child: Widget? = null): Unit =
        adw_breakpoint_bin_set_child(
            adwBreakpointBinPointer.reinterpret(),
            child?.gtkWidgetPointer?.reinterpret()
        )

    public companion object : TypeCompanion<BreakpointBin> {
        override val type: GeneratedClassKGType<BreakpointBin> =
            GeneratedClassKGType(adw_breakpoint_bin_get_type()) {
                BreakpointBin(it.reinterpret())
            }

        init {
            AdwTypeProvider.register()
        }
    }
}
