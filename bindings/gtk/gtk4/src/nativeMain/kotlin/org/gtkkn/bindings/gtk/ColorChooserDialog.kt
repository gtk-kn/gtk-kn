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
import org.gtkkn.native.gtk.GtkColorChooser
import org.gtkkn.native.gtk.GtkColorChooserDialog
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.gtk_color_chooser_dialog_get_type
import org.gtkkn.native.gtk.gtk_color_chooser_dialog_new
import kotlin.String

/**
 * A dialog for choosing a color.
 *
 * ![An example GtkColorChooserDialog](colorchooser.png)
 *
 * `GtkColorChooserDialog` implements the [iface@Gtk.ColorChooser] interface
 * and does not provide much API of its own.
 *
 * To create a `GtkColorChooserDialog`, use [ctor@Gtk.ColorChooserDialog.new].
 *
 * To change the initially selected color, use
 * [method@Gtk.ColorChooser.set_rgba]. To get the selected color use
 * [method@Gtk.ColorChooser.get_rgba].
 *
 * `GtkColorChooserDialog` has been deprecated in favor of [class@Gtk.ColorDialog].
 *
 * ## CSS nodes
 *
 * `GtkColorChooserDialog` has a single CSS node with the name `window` and style
 * class `.colorchooser`.
 *
 * ## Skipped during bindings generation
 *
 * - method `show-editor`: Property has no getter nor setter
 */
public open class ColorChooserDialog(public val gtkColorChooserDialogPointer: CPointer<GtkColorChooserDialog>) :
    Dialog(gtkColorChooserDialogPointer.reinterpret()),
    ColorChooser,
    KGTyped {
    override val gtkColorChooserPointer: CPointer<GtkColorChooser>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = handle.reinterpret()

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = handle.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = handle.reinterpret()

    /**
     * Creates a new `GtkColorChooserDialog`.
     *
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     * @return a new `GtkColorChooserDialog`
     */
    public constructor(
        title: String? = null,
        parent: Window? = null,
    ) : this(gtk_color_chooser_dialog_new(title, parent?.gtkWindowPointer)!!.reinterpret())

    public companion object : TypeCompanion<ColorChooserDialog> {
        override val type: GeneratedClassKGType<ColorChooserDialog> =
            GeneratedClassKGType(gtk_color_chooser_dialog_get_type()) { ColorChooserDialog(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ColorChooserDialog
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_color_chooser_dialog_get_type()
    }
}
