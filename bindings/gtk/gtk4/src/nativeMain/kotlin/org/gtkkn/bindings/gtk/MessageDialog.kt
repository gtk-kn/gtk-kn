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
import org.gtkkn.native.gtk.GtkMessageDialog
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.gtk_message_dialog_get_message_area
import org.gtkkn.native.gtk.gtk_message_dialog_get_type
import org.gtkkn.native.gtk.gtk_message_dialog_set_markup
import kotlin.String
import kotlin.Unit

/**
 * `GtkMessageDialog` presents a dialog with some message text.
 *
 * ![An example GtkMessageDialog](messagedialog.png)
 *
 * It’s simply a convenience widget; you could construct the equivalent of
 * `GtkMessageDialog` from `GtkDialog` without too much effort, but
 * `GtkMessageDialog` saves typing.
 *
 * The easiest way to do a modal message dialog is to use the %GTK_DIALOG_MODAL
 * flag, which will call [method@Gtk.Window.set_modal] internally. The dialog will
 * prevent interaction with the parent window until it's hidden or destroyed.
 * You can use the [signal@Gtk.Dialog::response] signal to know when the user
 * dismissed the dialog.
 *
 * An example for using a modal dialog:
 * ```c
 * GtkDialogFlags flags = GTK_DIALOG_DESTROY_WITH_PARENT | GTK_DIALOG_MODAL;
 * dialog = gtk_message_dialog_new (parent_window,
 *                                  flags,
 *                                  GTK_MESSAGE_ERROR,
 *                                  GTK_BUTTONS_CLOSE,
 *                                  "Error reading “%s”: %s",
 *                                  filename,
 *                                  g_strerror (errno));
 * // Destroy the dialog when the user responds to it
 * // (e.g. clicks a button)
 *
 * g_signal_connect (dialog, "response",
 *                   G_CALLBACK (gtk_window_destroy),
 *                   NULL);
 * ```
 *
 * You might do a non-modal `GtkMessageDialog` simply by omitting the
 * %GTK_DIALOG_MODAL flag:
 *
 * ```c
 * GtkDialogFlags flags = GTK_DIALOG_DESTROY_WITH_PARENT;
 * dialog = gtk_message_dialog_new (parent_window,
 *                                  flags,
 *                                  GTK_MESSAGE_ERROR,
 *                                  GTK_BUTTONS_CLOSE,
 *                                  "Error reading “%s”: %s",
 *                                  filename,
 *                                  g_strerror (errno));
 *
 * // Destroy the dialog when the user responds to it
 * // (e.g. clicks a button)
 * g_signal_connect (dialog, "response",
 *                   G_CALLBACK (gtk_window_destroy),
 *                   NULL);
 * ```
 *
 * # GtkMessageDialog as GtkBuildable
 *
 * The `GtkMessageDialog` implementation of the `GtkBuildable` interface exposes
 * the message area as an internal child with the name “message_area”.
 *
 * ## Skipped during bindings generation
 *
 * - method `buttons`: Property has no getter nor setter
 * - method `message-type`: Property has no getter nor setter
 * - method `secondary-text`: Property has no getter nor setter
 * - method `secondary-use-markup`: Property has no getter nor setter
 * - method `text`: Property has no getter nor setter
 * - method `use-markup`: Property has no getter nor setter
 */
public open class MessageDialog(
    pointer: CPointer<GtkMessageDialog>,
) : Dialog(pointer.reinterpret()),
    KGTyped {
    public val gtkMessageDialogPointer: CPointer<GtkMessageDialog>
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
     * The `GtkBox` that corresponds to the message area of this dialog.
     *
     * See [method@Gtk.MessageDialog.get_message_area] for a detailed
     * description of this area.
     */
    public open val messageArea: Widget
        /**
         * Returns the message area of the dialog.
         *
         * This is the box where the dialog’s primary and secondary labels
         * are packed. You can add your own extra content to that box and it
         * will appear below those labels. See [method@Gtk.Dialog.get_content_area]
         * for the corresponding function in the parent [class@Gtk.Dialog].
         *
         * @return A `GtkBox` corresponding to the
         *   “message area” in the @message_dialog
         */
        get() =
            gtk_message_dialog_get_message_area(gtkMessageDialogPointer.reinterpret())!!.run {
                Widget(reinterpret())
            }

    /**
     * Returns the message area of the dialog.
     *
     * This is the box where the dialog’s primary and secondary labels
     * are packed. You can add your own extra content to that box and it
     * will appear below those labels. See [method@Gtk.Dialog.get_content_area]
     * for the corresponding function in the parent [class@Gtk.Dialog].
     *
     * @return A `GtkBox` corresponding to the
     *   “message area” in the @message_dialog
     */
    public open fun getMessageArea(): Widget =
        gtk_message_dialog_get_message_area(gtkMessageDialogPointer.reinterpret())!!.run {
            Widget(reinterpret())
        }

    /**
     * Sets the text of the message dialog.
     *
     * @param str string with Pango markup
     */
    public open fun setMarkup(str: String): Unit =
        gtk_message_dialog_set_markup(gtkMessageDialogPointer.reinterpret(), str)

    public companion object : TypeCompanion<MessageDialog> {
        override val type: GeneratedClassKGType<MessageDialog> =
            GeneratedClassKGType(gtk_message_dialog_get_type()) { MessageDialog(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
