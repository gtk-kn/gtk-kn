// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.File
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAppChooser
import org.gtkkn.native.gtk.GtkAppChooserDialog
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.gtk_app_chooser_dialog_get_heading
import org.gtkkn.native.gtk.gtk_app_chooser_dialog_get_type
import org.gtkkn.native.gtk.gtk_app_chooser_dialog_get_widget
import org.gtkkn.native.gtk.gtk_app_chooser_dialog_new
import org.gtkkn.native.gtk.gtk_app_chooser_dialog_new_for_content_type
import org.gtkkn.native.gtk.gtk_app_chooser_dialog_set_heading
import kotlin.String
import kotlin.Unit

/**
 * `GtkAppChooserDialog` shows a `GtkAppChooserWidget` inside a `GtkDialog`.
 *
 * ![An example GtkAppChooserDialog](appchooserdialog.png)
 *
 * Note that `GtkAppChooserDialog` does not have any interesting methods
 * of its own. Instead, you should get the embedded `GtkAppChooserWidget`
 * using [method@Gtk.AppChooserDialog.get_widget] and call its methods if
 * the generic [iface@Gtk.AppChooser] interface is not sufficient for
 * your needs.
 *
 * To set the heading that is shown above the `GtkAppChooserWidget`,
 * use [method@Gtk.AppChooserDialog.set_heading].
 *
 * ## Skipped during bindings generation
 *
 * - method `gfile`: Property has no getter nor setter
 * - method `heading`: Property TypeInfo of getter and setter do not match
 */
public open class AppChooserDialog(
    pointer: CPointer<GtkAppChooserDialog>,
) : Dialog(pointer.reinterpret()), AppChooser, KGTyped {
    public val gtkAppChooserDialogPointer: CPointer<GtkAppChooserDialog>
        get() = gPointer.reinterpret()

    override val gtkAppChooserPointer: CPointer<GtkAppChooser>
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
     * Creates a new `GtkAppChooserDialog` for the provided `GFile`.
     *
     * The dialog will show applications that can open the file.
     *
     * @param parent a `GtkWindow`
     * @param flags flags for this dialog
     * @param file a `GFile`
     * @return a newly created `GtkAppChooserDialog`
     */
    public constructor(
        parent: Window? = null,
        flags: DialogFlags,
        `file`: File,
    ) : this(
        gtk_app_chooser_dialog_new(
            parent?.gtkWindowPointer?.reinterpret(),
            flags.mask,
            `file`.gioFilePointer
        )!!.reinterpret()
    )

    /**
     * Creates a new `GtkAppChooserDialog` for the provided content type.
     *
     * The dialog will show applications that can open the content type.
     *
     * @param parent a `GtkWindow`
     * @param flags flags for this dialog
     * @param contentType a content type string
     * @return a newly created `GtkAppChooserDialog`
     */
    public constructor(
        parent: Window? = null,
        flags: DialogFlags,
        contentType: String,
    ) : this(
        gtk_app_chooser_dialog_new_for_content_type(
            parent?.gtkWindowPointer?.reinterpret(),
            flags.mask,
            contentType
        )!!.reinterpret()
    )

    /**
     * Returns the text to display at the top of the dialog.
     *
     * @return the text to display at the top of the dialog,
     *   or null, in which case a default text is displayed
     */
    public open fun getHeading(): String? =
        gtk_app_chooser_dialog_get_heading(gtkAppChooserDialogPointer.reinterpret())?.toKString()

    /**
     * Returns the `GtkAppChooserWidget` of this dialog.
     *
     * @return the `GtkAppChooserWidget` of @self
     */
    public open fun getWidget(): Widget =
        gtk_app_chooser_dialog_get_widget(gtkAppChooserDialogPointer.reinterpret())!!.run {
            Widget(reinterpret())
        }

    /**
     * Sets the text to display at the top of the dialog.
     *
     * If the heading is not set, the dialog displays a default text.
     *
     * @param heading a string containing Pango markup
     */
    public open fun setHeading(heading: String): Unit =
        gtk_app_chooser_dialog_set_heading(gtkAppChooserDialogPointer.reinterpret(), heading)

    public companion object : TypeCompanion<AppChooserDialog> {
        override val type: GeneratedClassKGType<AppChooserDialog> =
            GeneratedClassKGType(gtk_app_chooser_dialog_get_type()) {
                AppChooserDialog(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
