// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkCenterLayout
import org.gtkkn.native.gtk.gtk_center_layout_get_baseline_position
import org.gtkkn.native.gtk.gtk_center_layout_get_center_widget
import org.gtkkn.native.gtk.gtk_center_layout_get_end_widget
import org.gtkkn.native.gtk.gtk_center_layout_get_orientation
import org.gtkkn.native.gtk.gtk_center_layout_get_shrink_center_last
import org.gtkkn.native.gtk.gtk_center_layout_get_start_widget
import org.gtkkn.native.gtk.gtk_center_layout_get_type
import org.gtkkn.native.gtk.gtk_center_layout_new
import org.gtkkn.native.gtk.gtk_center_layout_set_baseline_position
import org.gtkkn.native.gtk.gtk_center_layout_set_center_widget
import org.gtkkn.native.gtk.gtk_center_layout_set_end_widget
import org.gtkkn.native.gtk.gtk_center_layout_set_orientation
import org.gtkkn.native.gtk.gtk_center_layout_set_shrink_center_last
import org.gtkkn.native.gtk.gtk_center_layout_set_start_widget
import kotlin.Boolean
import kotlin.Unit

/**
 * `GtkCenterLayout` is a layout manager that manages up to three children.
 *
 * The start widget is allocated at the start of the layout (left in
 * left-to-right locales and right in right-to-left ones), and the end
 * widget at the end.
 *
 * The center widget is centered regarding the full width of the layout's.
 */
public open class CenterLayout(
    pointer: CPointer<GtkCenterLayout>,
) : LayoutManager(pointer.reinterpret()),
    KGTyped {
    public val gtkCenterLayoutPointer: CPointer<GtkCenterLayout>
        get() = gPointer.reinterpret()

    /**
     * Whether to shrink the center widget after other children.
     *
     * By default, when there's no space to give all three children their
     * natural widths, the start and end widgets start shrinking and the
     * center child keeps natural width until they reach minimum width.
     *
     * If set to `FALSE`, start and end widgets keep natural width and the
     * center widget starts shrinking instead.
     *
     * @since 4.12
     */
    public open var shrinkCenterLast: Boolean
        /**
         * Gets whether @self shrinks the center widget after other children.
         *
         * @return whether to shrink the center widget after others
         * @since 4.12
         */
        get() = gtk_center_layout_get_shrink_center_last(gtkCenterLayoutPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to shrink the center widget after other children.
         *
         * By default, when there's no space to give all three children their
         * natural widths, the start and end widgets start shrinking and the
         * center child keeps natural width until they reach minimum width.
         *
         * If set to `FALSE`, start and end widgets keep natural width and the
         * center widget starts shrinking instead.
         *
         * @param shrinkCenterLast whether to shrink the center widget after others
         * @since 4.12
         */
        set(
            shrinkCenterLast
        ) =
            gtk_center_layout_set_shrink_center_last(
                gtkCenterLayoutPointer.reinterpret(),
                shrinkCenterLast.asGBoolean()
            )

    /**
     * Creates a new `GtkCenterLayout`.
     *
     * @return the newly created `GtkCenterLayout`
     */
    public constructor() : this(gtk_center_layout_new()!!.reinterpret())

    /**
     * Returns the baseline position of the layout.
     *
     * @return The current baseline position of @self.
     */
    public open fun getBaselinePosition(): BaselinePosition =
        gtk_center_layout_get_baseline_position(gtkCenterLayoutPointer.reinterpret()).run {
            BaselinePosition.fromNativeValue(this)
        }

    /**
     * Returns the center widget of the layout.
     *
     * @return the current center widget of @self
     */
    public open fun getCenterWidget(): Widget? =
        gtk_center_layout_get_center_widget(gtkCenterLayoutPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Returns the end widget of the layout.
     *
     * @return the current end widget of @self
     */
    public open fun getEndWidget(): Widget? =
        gtk_center_layout_get_end_widget(gtkCenterLayoutPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the current orienration of the layout manager.
     *
     * @return The current orientation of @self
     */
    public open fun getOrientation(): Orientation =
        gtk_center_layout_get_orientation(gtkCenterLayoutPointer.reinterpret()).run {
            Orientation.fromNativeValue(this)
        }

    /**
     * Gets whether @self shrinks the center widget after other children.
     *
     * @return whether to shrink the center widget after others
     * @since 4.12
     */
    public open fun getShrinkCenterLast(): Boolean =
        gtk_center_layout_get_shrink_center_last(gtkCenterLayoutPointer.reinterpret()).asBoolean()

    /**
     * Returns the start widget of the layout.
     *
     * @return The current start widget of @self
     */
    public open fun getStartWidget(): Widget? =
        gtk_center_layout_get_start_widget(gtkCenterLayoutPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Sets the new baseline position of @self
     *
     * @param baselinePosition the new baseline position
     */
    public open fun setBaselinePosition(baselinePosition: BaselinePosition): Unit =
        gtk_center_layout_set_baseline_position(gtkCenterLayoutPointer.reinterpret(), baselinePosition.nativeValue)

    /**
     * Sets the new center widget of @self.
     *
     * To remove the existing center widget, pass null.
     *
     * @param widget the new center widget
     */
    public open fun setCenterWidget(widget: Widget? = null): Unit =
        gtk_center_layout_set_center_widget(
            gtkCenterLayoutPointer.reinterpret(),
            widget?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets the new end widget of @self.
     *
     * To remove the existing center widget, pass null.
     *
     * @param widget the new end widget
     */
    public open fun setEndWidget(widget: Widget? = null): Unit =
        gtk_center_layout_set_end_widget(gtkCenterLayoutPointer.reinterpret(), widget?.gtkWidgetPointer?.reinterpret())

    /**
     * Sets the orientation of @self.
     *
     * @param orientation the new orientation
     */
    public open fun setOrientation(orientation: Orientation): Unit =
        gtk_center_layout_set_orientation(gtkCenterLayoutPointer.reinterpret(), orientation.nativeValue)

    /**
     * Sets whether to shrink the center widget after other children.
     *
     * By default, when there's no space to give all three children their
     * natural widths, the start and end widgets start shrinking and the
     * center child keeps natural width until they reach minimum width.
     *
     * If set to `FALSE`, start and end widgets keep natural width and the
     * center widget starts shrinking instead.
     *
     * @param shrinkCenterLast whether to shrink the center widget after others
     * @since 4.12
     */
    public open fun setShrinkCenterLast(shrinkCenterLast: Boolean): Unit =
        gtk_center_layout_set_shrink_center_last(gtkCenterLayoutPointer.reinterpret(), shrinkCenterLast.asGBoolean())

    /**
     * Sets the new start widget of @self.
     *
     * To remove the existing start widget, pass null.
     *
     * @param widget the new start widget
     */
    public open fun setStartWidget(widget: Widget? = null): Unit =
        gtk_center_layout_set_start_widget(
            gtkCenterLayoutPointer.reinterpret(),
            widget?.gtkWidgetPointer?.reinterpret()
        )

    public companion object : TypeCompanion<CenterLayout> {
        override val type: GeneratedClassKGType<CenterLayout> =
            GeneratedClassKGType(gtk_center_layout_get_type()) { CenterLayout(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
