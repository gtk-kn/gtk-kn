// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkFontChooser
import org.gtkkn.native.gtk.GtkFontChooserWidget
import org.gtkkn.native.gtk.gtk_font_chooser_widget_get_type
import org.gtkkn.native.gtk.gtk_font_chooser_widget_new

/**
 * The `GtkFontChooserWidget` widget lets the user select a font.
 *
 * It is used in the `GtkFontChooserDialog` widget to provide a
 * dialog for selecting fonts.
 *
 * To set the font which is initially selected, use
 * [method@Gtk.FontChooser.set_font] or [method@Gtk.FontChooser.set_font_desc].
 *
 * To get the selected font use [method@Gtk.FontChooser.get_font] or
 * [method@Gtk.FontChooser.get_font_desc].
 *
 * To change the text which is shown in the preview area, use
 * [method@Gtk.FontChooser.set_preview_text].
 *
 * # CSS nodes
 *
 * `GtkFontChooserWidget` has a single CSS node with name fontchooser.
 *
 * ## Skipped during bindings generation
 *
 * - method `tweak-action`: Property has no getter nor setter
 */
public open class FontChooserWidget(public val gtkFontChooserWidgetPointer: CPointer<GtkFontChooserWidget>) :
    Widget(gtkFontChooserWidgetPointer.reinterpret()),
    FontChooser,
    KGTyped {
    override val gtkFontChooserPointer: CPointer<GtkFontChooser>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Creates a new `GtkFontChooserWidget`.
     *
     * @return a new `GtkFontChooserWidget`
     */
    public constructor() : this(gtk_font_chooser_widget_new()!!.reinterpret())

    public companion object : TypeCompanion<FontChooserWidget> {
        override val type: GeneratedClassKGType<FontChooserWidget> =
            GeneratedClassKGType(gtk_font_chooser_widget_get_type()) { FontChooserWidget(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FontChooserWidget
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_font_chooser_widget_get_type()
    }
}
