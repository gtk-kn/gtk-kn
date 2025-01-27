// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkFileChooser
import org.gtkkn.native.gtk.GtkFileChooserNative
import org.gtkkn.native.gtk.gtk_file_chooser_native_get_accept_label
import org.gtkkn.native.gtk.gtk_file_chooser_native_get_cancel_label
import org.gtkkn.native.gtk.gtk_file_chooser_native_get_type
import org.gtkkn.native.gtk.gtk_file_chooser_native_new
import org.gtkkn.native.gtk.gtk_file_chooser_native_set_accept_label
import org.gtkkn.native.gtk.gtk_file_chooser_native_set_cancel_label
import kotlin.String

/**
 * `GtkFileChooserNative` is an abstraction of a dialog suitable
 * for use with “File Open” or “File Save as” commands.
 *
 * By default, this just uses a `GtkFileChooserDialog` to implement
 * the actual dialog. However, on some platforms, such as Windows and
 * macOS, the native platform file chooser is used instead. When the
 * application is running in a sandboxed environment without direct
 * filesystem access (such as Flatpak), `GtkFileChooserNative` may call
 * the proper APIs (portals) to let the user choose a file and make it
 * available to the application.
 *
 * While the API of `GtkFileChooserNative` closely mirrors `GtkFileChooserDialog`,
 * the main difference is that there is no access to any `GtkWindow` or `GtkWidget`
 * for the dialog. This is required, as there may not be one in the case of a
 * platform native dialog.
 *
 * Showing, hiding and running the dialog is handled by the
 * [class@Gtk.NativeDialog] functions.
 *
 * Note that unlike `GtkFileChooserDialog`, `GtkFileChooserNative` objects
 * are not toplevel widgets, and GTK does not keep them alive. It is your
 * responsibility to keep a reference until you are done with the
 * object.
 *
 * ## Typical usage
 *
 * In the simplest of cases, you can the following code to use
 * `GtkFileChooserNative` to select a file for opening:
 *
 * ```c
 * static void
 * on_response (GtkNativeDialog *native,
 *              int              response)
 * {
 *   if (response == GTK_RESPONSE_ACCEPT)
 *     {
 *       GtkFileChooser *chooser = GTK_FILE_CHOOSER (native);
 *       GFile *file = gtk_file_chooser_get_file (chooser);
 *
 *       open_file (file);
 *
 *       g_object_unref (file);
 *     }
 *
 *   g_object_unref (native);
 * }
 *
 *   // ...
 *   GtkFileChooserNative *native;
 *   GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_OPEN;
 *
 *   native = gtk_file_chooser_native_new ("Open File",
 *                                         parent_window,
 *                                         action,
 *                                         "_Open",
 *                                         "_Cancel");
 *
 *   g_signal_connect (native, "response", G_CALLBACK (on_response), NULL);
 *   gtk_native_dialog_show (GTK_NATIVE_DIALOG (native));
 * ```
 *
 * To use a `GtkFileChooserNative` for saving, you can use this:
 *
 * ```c
 * static void
 * on_response (GtkNativeDialog *native,
 *              int              response)
 * {
 *   if (response == GTK_RESPONSE_ACCEPT)
 *     {
 *       GtkFileChooser *chooser = GTK_FILE_CHOOSER (native);
 *       GFile *file = gtk_file_chooser_get_file (chooser);
 *
 *       save_to_file (file);
 *
 *       g_object_unref (file);
 *     }
 *
 *   g_object_unref (native);
 * }
 *
 *   // ...
 *   GtkFileChooserNative *native;
 *   GtkFileChooser *chooser;
 *   GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_SAVE;
 *
 *   native = gtk_file_chooser_native_new ("Save File",
 *                                         parent_window,
 *                                         action,
 *                                         "_Save",
 *                                         "_Cancel");
 *   chooser = GTK_FILE_CHOOSER (native);
 *
 *   if (user_edited_a_new_document)
 *     gtk_file_chooser_set_current_name (chooser, _("Untitled document"));
 *   else
 *     gtk_file_chooser_set_file (chooser, existing_file, NULL);
 *
 *   g_signal_connect (native, "response", G_CALLBACK (on_response), NULL);
 *   gtk_native_dialog_show (GTK_NATIVE_DIALOG (native));
 * ```
 *
 * For more information on how to best set up a file dialog,
 * see the [class@Gtk.FileChooserDialog] documentation.
 *
 * ## Response Codes
 *
 * `GtkFileChooserNative` inherits from [class@Gtk.NativeDialog],
 * which means it will return %GTK_RESPONSE_ACCEPT if the user accepted,
 * and %GTK_RESPONSE_CANCEL if he pressed cancel. It can also return
 * %GTK_RESPONSE_DELETE_EVENT if the window was unexpectedly closed.
 *
 * ## Differences from `GtkFileChooserDialog`
 *
 * There are a few things in the [iface@Gtk.FileChooser] interface that
 * are not possible to use with `GtkFileChooserNative`, as such use would
 * prohibit the use of a native dialog.
 *
 * No operations that change the dialog work while the dialog is visible.
 * Set all the properties that are required before showing the dialog.
 *
 * ## Win32 details
 *
 * On windows the `IFileDialog` implementation (added in Windows Vista) is
 * used. It supports many of the features that `GtkFileChooser` has, but
 * there are some things it does not handle:
 *
 * * Any [class@Gtk.FileFilter] added using a mimetype
 *
 * If any of these features are used the regular `GtkFileChooserDialog`
 * will be used in place of the native one.
 *
 * ## Portal details
 *
 * When the `org.freedesktop.portal.FileChooser` portal is available on
 * the session bus, it is used to bring up an out-of-process file chooser.
 * Depending on the kind of session the application is running in, this may
 * or may not be a GTK file chooser.
 *
 * ## macOS details
 *
 * On macOS the `NSSavePanel` and `NSOpenPanel` classes are used to provide
 * native file chooser dialogs. Some features provided by `GtkFileChooser`
 * are not supported:
 *
 * * Shortcut folders.
 */
public open class FileChooserNative(public val gtkFileChooserNativePointer: CPointer<GtkFileChooserNative>) :
    NativeDialog(gtkFileChooserNativePointer.reinterpret()),
    FileChooser,
    KGTyped {
    override val gtkFileChooserPointer: CPointer<GtkFileChooser>
        get() = handle.reinterpret()

    /**
     * The text used for the label on the accept button in the dialog, or
     * null to use the default text.
     */
    public open var acceptLabel: String?
        /**
         * Retrieves the custom label text for the accept button.
         *
         * @return The custom label
         */
        get() = gtk_file_chooser_native_get_accept_label(gtkFileChooserNativePointer)?.toKString()

        /**
         * Sets the custom label text for the accept button.
         *
         * If characters in @label are preceded by an underscore, they are
         * underlined. If you need a literal underscore character in a label,
         * use “__” (two underscores). The first underlined character represents
         * a keyboard accelerator called a mnemonic.
         *
         * Pressing Alt and that key should activate the button.
         *
         * @param acceptLabel custom label
         */
        set(acceptLabel) = gtk_file_chooser_native_set_accept_label(gtkFileChooserNativePointer, acceptLabel)

    /**
     * The text used for the label on the cancel button in the dialog, or
     * null to use the default text.
     */
    public open var cancelLabel: String?
        /**
         * Retrieves the custom label text for the cancel button.
         *
         * @return The custom label
         */
        get() = gtk_file_chooser_native_get_cancel_label(gtkFileChooserNativePointer)?.toKString()

        /**
         * Sets the custom label text for the cancel button.
         *
         * If characters in @label are preceded by an underscore, they are
         * underlined. If you need a literal underscore character in a label,
         * use “__” (two underscores). The first underlined character represents
         * a keyboard accelerator called a mnemonic.
         *
         * Pressing Alt and that key should activate the button.
         *
         * @param cancelLabel custom label
         */
        set(cancelLabel) = gtk_file_chooser_native_set_cancel_label(gtkFileChooserNativePointer, cancelLabel)

    /**
     * Creates a new `GtkFileChooserNative`.
     *
     * @param title Title of the native
     * @param parent Transient parent of the native
     * @param action Open or save mode for the dialog
     * @param acceptLabel text to go in the accept button, or null for the default
     * @param cancelLabel text to go in the cancel button, or null for the default
     * @return a new `GtkFileChooserNative`
     */
    public constructor(
        title: String? = null,
        parent: Window? = null,
        action: FileChooserAction,
        acceptLabel: String? = null,
        cancelLabel: String? = null,
    ) : this(
        gtk_file_chooser_native_new(
            title,
            parent?.gtkWindowPointer,
            action.nativeValue,
            acceptLabel,
            cancelLabel
        )!!.reinterpret()
    )

    public companion object : TypeCompanion<FileChooserNative> {
        override val type: GeneratedClassKGType<FileChooserNative> =
            GeneratedClassKGType(getTypeOrNull("gtk_file_chooser_native_get_type")!!) {
                FileChooserNative(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FileChooserNative
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_file_chooser_native_get_type()
    }
}
