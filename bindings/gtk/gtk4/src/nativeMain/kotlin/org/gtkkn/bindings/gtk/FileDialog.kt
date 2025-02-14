// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkFileDialog
import org.gtkkn.native.gtk.gtk_file_dialog_get_accept_label
import org.gtkkn.native.gtk.gtk_file_dialog_get_default_filter
import org.gtkkn.native.gtk.gtk_file_dialog_get_filters
import org.gtkkn.native.gtk.gtk_file_dialog_get_initial_file
import org.gtkkn.native.gtk.gtk_file_dialog_get_initial_folder
import org.gtkkn.native.gtk.gtk_file_dialog_get_initial_name
import org.gtkkn.native.gtk.gtk_file_dialog_get_modal
import org.gtkkn.native.gtk.gtk_file_dialog_get_title
import org.gtkkn.native.gtk.gtk_file_dialog_get_type
import org.gtkkn.native.gtk.gtk_file_dialog_new
import org.gtkkn.native.gtk.gtk_file_dialog_open
import org.gtkkn.native.gtk.gtk_file_dialog_open_finish
import org.gtkkn.native.gtk.gtk_file_dialog_open_multiple
import org.gtkkn.native.gtk.gtk_file_dialog_open_multiple_finish
import org.gtkkn.native.gtk.gtk_file_dialog_save
import org.gtkkn.native.gtk.gtk_file_dialog_save_finish
import org.gtkkn.native.gtk.gtk_file_dialog_select_folder
import org.gtkkn.native.gtk.gtk_file_dialog_select_folder_finish
import org.gtkkn.native.gtk.gtk_file_dialog_select_multiple_folders
import org.gtkkn.native.gtk.gtk_file_dialog_select_multiple_folders_finish
import org.gtkkn.native.gtk.gtk_file_dialog_set_accept_label
import org.gtkkn.native.gtk.gtk_file_dialog_set_default_filter
import org.gtkkn.native.gtk.gtk_file_dialog_set_filters
import org.gtkkn.native.gtk.gtk_file_dialog_set_initial_file
import org.gtkkn.native.gtk.gtk_file_dialog_set_initial_folder
import org.gtkkn.native.gtk.gtk_file_dialog_set_initial_name
import org.gtkkn.native.gtk.gtk_file_dialog_set_modal
import org.gtkkn.native.gtk.gtk_file_dialog_set_title
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * A `GtkFileDialog` object collects the arguments that
 * are needed to present a file chooser dialog to the
 * user, such as a title for the dialog and whether it
 * should be modal.
 *
 * The dialog is shown with [method@Gtk.FileDialog.open],
 * [method@Gtk.FileDialog.save], etc.
 * @since 4.10
 */
@GtkVersion4_10
public open class FileDialog(public val gtkFileDialogPointer: CPointer<GtkFileDialog>) :
    Object(gtkFileDialogPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Label for the file chooser's accept button.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var acceptLabel: String?
        /**
         * Retrieves the text used by the dialog on its accept button.
         *
         * @return the label shown on the file chooser's accept button.
         * @since 4.10
         */
        get() = gtk_file_dialog_get_accept_label(gtkFileDialogPointer)?.toKString()

        /**
         * Sets the label shown on the file chooser's accept button.
         *
         * Leaving the accept label unset or setting it as `NULL` will fall back to
         * a default label, depending on what API is used to launch the file dialog.
         *
         * @param acceptLabel the new accept label
         * @since 4.10
         */
        @GtkVersion4_10
        set(acceptLabel) = gtk_file_dialog_set_accept_label(gtkFileDialogPointer, acceptLabel)

    /**
     * The default filter, that is, the filter that is initially
     * active in the file chooser dialog.
     *
     * If the default filter is null, the first filter of [property@Gtk.FileDialog:filters]
     * is used as the default filter. If that property contains no filter, the dialog will
     * be unfiltered.
     *
     * If [property@Gtk.FileDialog:filters] is not null, the default filter should be part
     * of the list. If it is not, the dialog may choose to not make it available.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var defaultFilter: FileFilter?
        /**
         * Gets the filter that will be selected by default
         * in the file chooser dialog.
         *
         * @return the current filter
         * @since 4.10
         */
        get() = gtk_file_dialog_get_default_filter(gtkFileDialogPointer)?.run {
            InstanceCache.get(this, true) { FileFilter(reinterpret()) }!!
        }

        /**
         * Sets the filter that will be selected by default
         * in the file chooser dialog.
         *
         * If set to null, the first item in [property@Gtk.FileDialog:filters]
         * will be used as the default filter. If that list is empty, the dialog
         * will be unfiltered.
         *
         * @param filter a `GtkFileFilter`
         * @since 4.10
         */
        @GtkVersion4_10
        set(filter) = gtk_file_dialog_set_default_filter(gtkFileDialogPointer, filter?.gtkFileFilterPointer)

    /**
     * The list of filters.
     *
     * See [property@Gtk.FileDialog:default-filter] about how those two properties interact.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var filters: ListModel?
        /**
         * Gets the filters that will be offered to the user
         * in the file chooser dialog.
         *
         * @return the filters, as
         *   a `GListModel` of `GtkFileFilters`
         * @since 4.10
         */
        get() = gtk_file_dialog_get_filters(gtkFileDialogPointer)?.run {
            ListModel.ListModelImpl(reinterpret())
        }

        /**
         * Sets the filters that will be offered to the user
         * in the file chooser dialog.
         *
         * @param filters a `GListModel` of `GtkFileFilters`
         * @since 4.10
         */
        @GtkVersion4_10
        set(filters) = gtk_file_dialog_set_filters(gtkFileDialogPointer, filters?.gioListModelPointer)

    /**
     * The initial file, that is, the file that is initially selected
     * in the file chooser dialog
     *
     * This is a utility property that sets both [property@Gtk.FileDialog:initial-folder] and
     * [property@Gtk.FileDialog:initial-name].
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var initialFile: File?
        /**
         * Gets the file that will be initially selected in
         * the file chooser dialog.
         *
         * @return the file
         * @since 4.10
         */
        get() = gtk_file_dialog_get_initial_file(gtkFileDialogPointer)?.run {
            File.FileImpl(reinterpret())
        }

        /**
         * Sets the file that will be initially selected in
         * the file chooser dialog.
         *
         * This function is a shortcut for calling both
         * gtk_file_dialog_set_initial_folder() and
         * gtk_file_dialog_set_initial_name() with the directory and
         * name of @file respectively.
         *
         * @param file a `GFile`
         * @since 4.10
         */
        @GtkVersion4_10
        set(`file`) = gtk_file_dialog_set_initial_file(gtkFileDialogPointer, `file`?.gioFilePointer)

    /**
     * The initial folder, that is, the directory that is initially
     * opened in the file chooser dialog
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var initialFolder: File?
        /**
         * Gets the folder that will be set as the
         * initial folder in the file chooser dialog.
         *
         * @return the folder
         * @since 4.10
         */
        get() = gtk_file_dialog_get_initial_folder(gtkFileDialogPointer)?.run {
            File.FileImpl(reinterpret())
        }

        /**
         * Sets the folder that will be set as the
         * initial folder in the file chooser dialog.
         *
         * @param folder a `GFile`
         * @since 4.10
         */
        @GtkVersion4_10
        set(folder) = gtk_file_dialog_set_initial_folder(gtkFileDialogPointer, folder?.gioFilePointer)

    /**
     * The initial name, that is, the filename that is initially
     * selected in the file chooser dialog.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var initialName: String?
        /**
         * Gets the name for the file that should be initially set.
         *
         * @return the name
         * @since 4.10
         */
        get() = gtk_file_dialog_get_initial_name(gtkFileDialogPointer)?.toKString()

        /**
         * Sets the name for the file that should be initially set.
         * For saving dialogs, this will usually be pre-entered into the name field.
         *
         * If a file with this name already exists in the directory set via
         * [property@Gtk.FileDialog:initial-folder], the dialog should preselect it.
         *
         * @param name a UTF8 string
         * @since 4.10
         */
        @GtkVersion4_10
        set(name) = gtk_file_dialog_set_initial_name(gtkFileDialogPointer, name)

    /**
     * Whether the file chooser dialog is modal.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var modal: Boolean
        /**
         * Returns whether the file chooser dialog
         * blocks interaction with the parent window
         * while it is presented.
         *
         * @return `TRUE` if the file chooser dialog is modal
         * @since 4.10
         */
        get() = gtk_file_dialog_get_modal(gtkFileDialogPointer).asBoolean()

        /**
         * Sets whether the file chooser dialog
         * blocks interaction with the parent window
         * while it is presented.
         *
         * @param modal the new value
         * @since 4.10
         */
        @GtkVersion4_10
        set(modal) = gtk_file_dialog_set_modal(gtkFileDialogPointer, modal.asGBoolean())

    /**
     * A title that may be shown on the file chooser dialog.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var title: String
        /**
         * Returns the title that will be shown on the
         * file chooser dialog.
         *
         * @return the title
         * @since 4.10
         */
        get() = gtk_file_dialog_get_title(gtkFileDialogPointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets the title that will be shown on the
         * file chooser dialog.
         *
         * @param title the new title
         * @since 4.10
         */
        @GtkVersion4_10
        set(title) = gtk_file_dialog_set_title(gtkFileDialogPointer, title)

    /**
     * Creates a new `GtkFileDialog` object.
     *
     * @return the new `GtkFileDialog`
     * @since 4.10
     */
    public constructor() : this(gtk_file_dialog_new()!!) {
        InstanceCache.put(this)
    }

    /**
     * This function initiates a file selection operation by
     * presenting a file chooser dialog to the user.
     *
     * The @callback will be called when the dialog is dismissed.
     *
     * @param parent the parent `GtkWindow`
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the
     *   operation is complete
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun `open`(
        parent: Window? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_file_dialog_open(
        gtkFileDialogPointer,
        parent?.gtkWindowPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes the [method@Gtk.FileDialog.open] call and
     * returns the resulting file.
     *
     * @param result a `GAsyncResult`
     * @return the file that was selected.
     *   Otherwise, `NULL` is returned and @error is set
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun openFinish(result: AsyncResult): Result<File?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_file_dialog_open_finish(gtkFileDialogPointer, result.gioAsyncResultPointer, gError.ptr)?.run {
            File.FileImpl(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * This function initiates a multi-file selection operation by
     * presenting a file chooser dialog to the user.
     *
     * The file chooser will initially be opened in the directory
     * [property@Gtk.FileDialog:initial-folder].
     *
     * The @callback will be called when the dialog is dismissed.
     *
     * @param parent the parent `GtkWindow`
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the
     *   operation is complete
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun openMultiple(
        parent: Window? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_file_dialog_open_multiple(
        gtkFileDialogPointer,
        parent?.gtkWindowPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes the [method@Gtk.FileDialog.open] call and
     * returns the resulting files in a `GListModel`.
     *
     * @param result a `GAsyncResult`
     * @return the file that was selected,
     *   as a `GListModel` of `GFiles`. Otherwise, `NULL` is returned
     *   and @error is set
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun openMultipleFinish(result: AsyncResult): Result<ListModel?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_file_dialog_open_multiple_finish(
            gtkFileDialogPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            ListModel.ListModelImpl(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * This function initiates a file save operation by
     * presenting a file chooser dialog to the user.
     *
     * The @callback will be called when the dialog is dismissed.
     *
     * @param parent the parent `GtkWindow`
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the
     *   operation is complete
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun save(
        parent: Window? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_file_dialog_save(
        gtkFileDialogPointer,
        parent?.gtkWindowPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes the [method@Gtk.FileDialog.save] call and
     * returns the resulting file.
     *
     * @param result a `GAsyncResult`
     * @return the file that was selected.
     *   Otherwise, `NULL` is returned and @error is set
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun saveFinish(result: AsyncResult): Result<File?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_file_dialog_save_finish(gtkFileDialogPointer, result.gioAsyncResultPointer, gError.ptr)?.run {
            File.FileImpl(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * This function initiates a directory selection operation by
     * presenting a file chooser dialog to the user.
     *
     * If you pass @initial_folder, the file chooser will initially be
     * opened in the parent directory of that folder, otherwise, it
     * will be in the directory [property@Gtk.FileDialog:initial-folder].
     *
     * The @callback will be called when the dialog is dismissed.
     *
     * @param parent the parent `GtkWindow`
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the
     *   operation is complete
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun selectFolder(
        parent: Window? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_file_dialog_select_folder(
        gtkFileDialogPointer,
        parent?.gtkWindowPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes the [method@Gtk.FileDialog.select_folder] call and
     * returns the resulting file.
     *
     * @param result a `GAsyncResult`
     * @return the file that was selected.
     *   Otherwise, `NULL` is returned and @error is set
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun selectFolderFinish(result: AsyncResult): Result<File?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_file_dialog_select_folder_finish(
            gtkFileDialogPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            File.FileImpl(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * This function initiates a multi-directory selection operation by
     * presenting a file chooser dialog to the user.
     *
     * The file chooser will initially be opened in the directory
     * [property@Gtk.FileDialog:initial-folder].
     *
     * The @callback will be called when the dialog is dismissed.
     *
     * @param parent the parent `GtkWindow`
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the
     *   operation is complete
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun selectMultipleFolders(
        parent: Window? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_file_dialog_select_multiple_folders(
        gtkFileDialogPointer,
        parent?.gtkWindowPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes the [method@Gtk.FileDialog.select_multiple_folders]
     * call and returns the resulting files in a `GListModel`.
     *
     * @param result a `GAsyncResult`
     * @return the file that was selected,
     *   as a `GListModel` of `GFiles`. Otherwise, `NULL` is returned
     *   and @error is set
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun selectMultipleFoldersFinish(result: AsyncResult): Result<ListModel?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_file_dialog_select_multiple_folders_finish(
            gtkFileDialogPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            ListModel.ListModelImpl(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    public companion object : TypeCompanion<FileDialog> {
        override val type: GeneratedClassKGType<FileDialog> =
            GeneratedClassKGType(getTypeOrNull()!!) { FileDialog(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FileDialog
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_file_dialog_get_type()

        /**
         * Gets the GType of from the symbol `gtk_file_dialog_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_file_dialog_get_type")
    }
}
