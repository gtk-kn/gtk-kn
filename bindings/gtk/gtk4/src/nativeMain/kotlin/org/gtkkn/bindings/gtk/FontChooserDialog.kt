// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkFontChooser
import org.gtkkn.native.gtk.GtkFontChooserDialog
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.gtk_font_chooser_dialog_get_type
import org.gtkkn.native.gtk.gtk_font_chooser_dialog_new
import kotlin.String

/**
 * The `GtkFontChooserDialog` widget is a dialog for selecting a font.
 *
 * ![An example GtkFontChooserDialog](fontchooser.png)
 *
 * `GtkFontChooserDialog` implements the [iface@Gtk.FontChooser] interface
 * and does not provide much API of its own.
 *
 * To create a `GtkFontChooserDialog`, use [ctor@Gtk.FontChooserDialog.new].
 *
 * # GtkFontChooserDialog as GtkBuildable
 *
 * The `GtkFontChooserDialog` implementation of the `GtkBuildable`
 * interface exposes the buttons with the names “select_button”
 * and “cancel_button”.
 *
 * ## CSS nodes
 *
 * `GtkFontChooserDialog` has a single CSS node with the name `window` and style
 * class `.fontchooser`.
 */
public open class FontChooserDialog(
    pointer: CPointer<GtkFontChooserDialog>,
) : Dialog(pointer.reinterpret()), FontChooser, KGTyped {
    public val gtkFontChooserDialogPointer: CPointer<GtkFontChooserDialog>
        get() = gPointer.reinterpret()

    override val gtkFontChooserPointer: CPointer<GtkFontChooser>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = gPointer.reinterpret()

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = gPointer.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkFontChooserDialog`.
     *
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     * @return a new `GtkFontChooserDialog`
     */
    public constructor(title: String? = null, parent: Window? = null) :
        this(
            gtk_font_chooser_dialog_new(
                title,
                parent?.gtkWindowPointer?.reinterpret()
            )!!.reinterpret()
        )

    public companion object : TypeCompanion<FontChooserDialog> {
        override val type: GeneratedClassKGType<FontChooserDialog> =
            GeneratedClassKGType(gtk_font_chooser_dialog_get_type()) {
                FontChooserDialog(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
