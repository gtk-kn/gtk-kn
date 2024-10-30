// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkColorChooser
import org.gtkkn.native.gtk.GtkColorChooserWidget
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_color_chooser_widget_get_type
import org.gtkkn.native.gtk.gtk_color_chooser_widget_new

/**
 * The `GtkColorChooserWidget` widget lets the user select a color.
 *
 * By default, the chooser presents a predefined palette of colors,
 * plus a small number of settable custom colors. It is also possible
 * to select a different color with the single-color editor.
 *
 * To enter the single-color editing mode, use the context menu of any
 * color of the palette, or use the '+' button to add a new custom color.
 *
 * The chooser automatically remembers the last selection, as well
 * as custom colors.
 *
 * To create a `GtkColorChooserWidget`, use [ctor@Gtk.ColorChooserWidget.new].
 *
 * To change the initially selected color, use
 * [method@Gtk.ColorChooser.set_rgba]. To get the selected color use
 * [method@Gtk.ColorChooser.get_rgba].
 *
 * The `GtkColorChooserWidget` is used in the [class@Gtk.ColorChooserDialog]
 * to provide a dialog for selecting colors.
 *
 * # CSS names
 *
 * `GtkColorChooserWidget` has a single CSS node with name colorchooser.
 *
 * ## Skipped during bindings generation
 *
 * - method `show-editor`: Property has no getter nor setter
 */
public open class ColorChooserWidget(
    pointer: CPointer<GtkColorChooserWidget>,
) : Widget(pointer.reinterpret()),
    ColorChooser,
    KGTyped {
    public val gtkColorChooserWidgetPointer: CPointer<GtkColorChooserWidget>
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
     * Creates a new `GtkColorChooserWidget`.
     *
     * @return a new `GtkColorChooserWidget`
     */
    public constructor() : this(gtk_color_chooser_widget_new()!!.reinterpret())

    public companion object : TypeCompanion<ColorChooserWidget> {
        override val type: GeneratedClassKGType<ColorChooserWidget> =
            GeneratedClassKGType(gtk_color_chooser_widget_get_type()) { ColorChooserWidget(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
