// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkFileChooser
import org.gtkkn.native.gtk.gtk_file_chooser_add_choice
import org.gtkkn.native.gtk.gtk_file_chooser_add_filter
import org.gtkkn.native.gtk.gtk_file_chooser_add_shortcut_folder
import org.gtkkn.native.gtk.gtk_file_chooser_get_action
import org.gtkkn.native.gtk.gtk_file_chooser_get_choice
import org.gtkkn.native.gtk.gtk_file_chooser_get_create_folders
import org.gtkkn.native.gtk.gtk_file_chooser_get_current_folder
import org.gtkkn.native.gtk.gtk_file_chooser_get_current_name
import org.gtkkn.native.gtk.gtk_file_chooser_get_file
import org.gtkkn.native.gtk.gtk_file_chooser_get_files
import org.gtkkn.native.gtk.gtk_file_chooser_get_filter
import org.gtkkn.native.gtk.gtk_file_chooser_get_filters
import org.gtkkn.native.gtk.gtk_file_chooser_get_select_multiple
import org.gtkkn.native.gtk.gtk_file_chooser_get_shortcut_folders
import org.gtkkn.native.gtk.gtk_file_chooser_get_type
import org.gtkkn.native.gtk.gtk_file_chooser_remove_choice
import org.gtkkn.native.gtk.gtk_file_chooser_remove_filter
import org.gtkkn.native.gtk.gtk_file_chooser_remove_shortcut_folder
import org.gtkkn.native.gtk.gtk_file_chooser_set_action
import org.gtkkn.native.gtk.gtk_file_chooser_set_choice
import org.gtkkn.native.gtk.gtk_file_chooser_set_create_folders
import org.gtkkn.native.gtk.gtk_file_chooser_set_current_folder
import org.gtkkn.native.gtk.gtk_file_chooser_set_current_name
import org.gtkkn.native.gtk.gtk_file_chooser_set_file
import org.gtkkn.native.gtk.gtk_file_chooser_set_filter
import org.gtkkn.native.gtk.gtk_file_chooser_set_select_multiple
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * Use [class@Gtk.FileDialog] instead
 * ---
 *
 * `GtkFileChooser` is an interface that can be implemented by file
 * selection widgets.
 *
 * In GTK, the main objects that implement this interface are
 * [class@Gtk.FileChooserWidget] and [class@Gtk.FileChooserDialog].
 *
 * You do not need to write an object that implements the `GtkFileChooser`
 * interface unless you are trying to adapt an existing file selector to
 * expose a standard programming interface.
 *
 * `GtkFileChooser` allows for shortcuts to various places in the filesystem.
 * In the default implementation these are displayed in the left pane. It
 * may be a bit confusing at first that these shortcuts come from various
 * sources and in various flavours, so lets explain the terminology here:
 *
 * - Bookmarks: are created by the user, by dragging folders from the
 *   right pane to the left pane, or by using the “Add”. Bookmarks
 *   can be renamed and deleted by the user.
 *
 * - Shortcuts: can be provided by the application. For example, a Paint
 *   program may want to add a shortcut for a Clipart folder. Shortcuts
 *   cannot be modified by the user.
 *
 * - Volumes: are provided by the underlying filesystem abstraction. They are
 *   the “roots” of the filesystem.
 *
 * # File Names and Encodings
 *
 * When the user is finished selecting files in a `GtkFileChooser`, your
 * program can get the selected filenames as `GFile`s.
 *
 * # Adding options
 *
 * You can add extra widgets to a file chooser to provide options
 * that are not present in the default design, by using
 * [method@Gtk.FileChooser.add_choice]. Each choice has an identifier and
 * a user visible label; additionally, each choice can have multiple
 * options. If a choice has no option, it will be rendered as a
 * check button with the given label; if a choice has options, it will
 * be rendered as a combo box.
 *
 * ## Skipped during bindings generation
 *
 * - method `filter`: Property TypeInfo of getter and setter do not match
 */
public interface FileChooser :
    Proxy,
    KGTyped {
    public val gtkFileChooserPointer: CPointer<GtkFileChooser>

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * The type of operation that the file chooser is performing.
     */
    public var action: FileChooserAction
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FileDialog] instead
         * ---
         *
         * Gets the type of operation that the file chooser is performing.
         *
         * @return the action that the file selector is performing
         */
        get() = gtk_file_chooser_get_action(gtkFileChooserPointer).run {
            FileChooserAction.fromNativeValue(this)
        }

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FileDialog] instead
         * ---
         *
         * Sets the type of operation that the chooser is performing.
         *
         * The user interface is adapted to suit the selected action.
         *
         * For example, an option to create a new folder might be shown
         * if the action is %GTK_FILE_CHOOSER_ACTION_SAVE but not if the
         * action is %GTK_FILE_CHOOSER_ACTION_OPEN.
         *
         * @param action the action that the file selector is performing
         */
        set(action) = gtk_file_chooser_set_action(gtkFileChooserPointer, action.nativeValue)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Whether a file chooser not in %GTK_FILE_CHOOSER_ACTION_OPEN mode
     * will offer the user to create new folders.
     */
    public var createFolders: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FileDialog] instead
         * ---
         *
         * Gets whether file chooser will offer to create new folders.
         *
         * @return true if the Create Folder button should be displayed.
         */
        get() = gtk_file_chooser_get_create_folders(gtkFileChooserPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FileDialog] instead
         * ---
         *
         * Sets whether file chooser will offer to create new folders.
         *
         * This is only relevant if the action is not set to be
         * %GTK_FILE_CHOOSER_ACTION_OPEN.
         *
         * @param createFolders true if the Create Folder button should be displayed
         */
        set(createFolders) = gtk_file_chooser_set_create_folders(gtkFileChooserPointer, createFolders.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * A `GListModel` containing the filters that have been
     * added with gtk_file_chooser_add_filter().
     *
     * The returned object should not be modified. It may
     * or may not be updated for later changes.
     */
    public val filters: ListModel
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FileDialog] instead
         * ---
         *
         * Gets the current set of user-selectable filters, as a list model.
         *
         * See [method@Gtk.FileChooser.add_filter] and
         * [method@Gtk.FileChooser.remove_filter] for changing individual filters.
         *
         * You should not modify the returned list model. Future changes to
         * @chooser may or may not affect the returned model.
         *
         * @return a `GListModel` containing the current set
         *   of user-selectable filters.
         */
        get() = gtk_file_chooser_get_filters(gtkFileChooserPointer)!!.run {
            ListModel.ListModelImpl(reinterpret())
        }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Whether to allow multiple files to be selected.
     */
    public var selectMultiple: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FileDialog] instead
         * ---
         *
         * Gets whether multiple files can be selected in the file
         * chooser.
         *
         * @return true if multiple files can be selected.
         */
        get() = gtk_file_chooser_get_select_multiple(gtkFileChooserPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FileDialog] instead
         * ---
         *
         * Sets whether multiple files can be selected in the file chooser.
         *
         * This is only relevant if the action is set to be
         * %GTK_FILE_CHOOSER_ACTION_OPEN or
         * %GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER.
         *
         * @param selectMultiple true if multiple files can be selected.
         */
        set(selectMultiple) = gtk_file_chooser_set_select_multiple(gtkFileChooserPointer, selectMultiple.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * A `GListModel` containing the shortcut folders that have been
     * added with gtk_file_chooser_add_shortcut_folder().
     *
     * The returned object should not be modified. It may
     * or may not be updated for later changes.
     */
    public val shortcutFolders: ListModel
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [class@Gtk.FileDialog] instead
         * ---
         *
         * Queries the list of shortcut folders in the file chooser.
         *
         * You should not modify the returned list model. Future changes to
         * @chooser may or may not affect the returned model.
         *
         * @return A list model of `GFile`s
         */
        get() = gtk_file_chooser_get_shortcut_folders(gtkFileChooserPointer)!!.run {
            ListModel.ListModelImpl(reinterpret())
        }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Adds a 'choice' to the file chooser.
     *
     * This is typically implemented as a combobox or, for boolean choices,
     * as a checkbutton. You can select a value using
     * [method@Gtk.FileChooser.set_choice] before the dialog is shown,
     * and you can obtain the user-selected value in the
     * [signal@Gtk.Dialog::response] signal handler using
     * [method@Gtk.FileChooser.get_choice].
     *
     * @param id id for the added choice
     * @param label user-visible label for the added choice
     * @param options ids for the options of the choice, or null for a boolean choice
     * @param optionLabels user-visible labels for the options, must be the same length as @options
     */
    public fun addChoice(
        id: String,
        label: String,
        options: List<String>? = null,
        optionLabels: List<String>? = null,
    ): Unit = memScoped {
        return gtk_file_chooser_add_choice(
            gtkFileChooserPointer,
            id,
            label,
            options?.toCStringList(this),
            optionLabels?.toCStringList(this)
        )
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Adds @filter to the list of filters that the user can select between.
     *
     * When a filter is selected, only files that are passed by that
     * filter are displayed.
     *
     * Note that the @chooser takes ownership of the filter if it is floating,
     * so you have to ref and sink it if you want to keep a reference.
     *
     * @param filter a `GtkFileFilter`
     */
    public fun addFilter(filter: FileFilter): Unit =
        gtk_file_chooser_add_filter(gtkFileChooserPointer, filter.gtkFileFilterPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Adds a folder to be displayed with the shortcut folders
     * in a file chooser.
     *
     * @param folder a `GFile` for the folder to add
     * @return true if the folder could be added successfully,
     *   false otherwise.
     */
    public fun addShortcutFolder(folder: File): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_file_chooser_add_shortcut_folder(
            gtkFileChooserPointer,
            folder.gioFilePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Gets the type of operation that the file chooser is performing.
     *
     * @return the action that the file selector is performing
     */
    public fun getAction(): FileChooserAction = gtk_file_chooser_get_action(gtkFileChooserPointer).run {
        FileChooserAction.fromNativeValue(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Gets the currently selected option in the 'choice' with the given ID.
     *
     * @param id the ID of the choice to get
     * @return the ID of the currently selected option
     */
    public fun getChoice(id: String): String? = gtk_file_chooser_get_choice(gtkFileChooserPointer, id)?.toKString()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Gets whether file chooser will offer to create new folders.
     *
     * @return true if the Create Folder button should be displayed.
     */
    public fun getCreateFolders(): Boolean = gtk_file_chooser_get_create_folders(gtkFileChooserPointer).asBoolean()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Gets the current folder of @chooser as `GFile`.
     *
     * @return the `GFile` for the current folder.
     */
    public fun getCurrentFolder(): File? = gtk_file_chooser_get_current_folder(gtkFileChooserPointer)?.run {
        File.FileImpl(reinterpret())
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Gets the current name in the file selector, as entered by the user.
     *
     * This is meant to be used in save dialogs, to get the currently typed
     * filename when the file itself does not exist yet.
     *
     * @return The raw text from the file chooser’s “Name” entry. Free with
     *   g_free(). Note that this string is not a full pathname or URI; it is
     *   whatever the contents of the entry are. Note also that this string is
     *   in UTF-8 encoding, which is not necessarily the system’s encoding for
     *   filenames.
     */
    public fun getCurrentName(): String? = gtk_file_chooser_get_current_name(gtkFileChooserPointer)?.toKString()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Gets the `GFile` for the currently selected file in
     * the file selector.
     *
     * If multiple files are selected, one of the files will be
     * returned at random.
     *
     * If the file chooser is in folder mode, this function returns
     * the selected folder.
     *
     * @return a selected `GFile`. You own the
     *   returned file; use g_object_unref() to release it.
     */
    public fun getFile(): File? = gtk_file_chooser_get_file(gtkFileChooserPointer)?.run {
        File.FileImpl(reinterpret())
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Lists all the selected files and subfolders in the current folder
     * of @chooser as `GFile`.
     *
     * @return a list model containing a `GFile` for each
     *   selected file and subfolder in the current folder. Free the returned
     *   list with g_object_unref().
     */
    public fun getFiles(): ListModel = gtk_file_chooser_get_files(gtkFileChooserPointer)!!.run {
        ListModel.ListModelImpl(reinterpret())
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Gets the current filter.
     *
     * @return the current filter
     */
    public fun getFilter(): FileFilter? = gtk_file_chooser_get_filter(gtkFileChooserPointer)?.run {
        InstanceCache.get(this, true) { FileFilter(reinterpret()) }!!
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Gets the current set of user-selectable filters, as a list model.
     *
     * See [method@Gtk.FileChooser.add_filter] and
     * [method@Gtk.FileChooser.remove_filter] for changing individual filters.
     *
     * You should not modify the returned list model. Future changes to
     * @chooser may or may not affect the returned model.
     *
     * @return a `GListModel` containing the current set
     *   of user-selectable filters.
     */
    public fun getFilters(): ListModel = gtk_file_chooser_get_filters(gtkFileChooserPointer)!!.run {
        ListModel.ListModelImpl(reinterpret())
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Gets whether multiple files can be selected in the file
     * chooser.
     *
     * @return true if multiple files can be selected.
     */
    public fun getSelectMultiple(): Boolean = gtk_file_chooser_get_select_multiple(gtkFileChooserPointer).asBoolean()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Queries the list of shortcut folders in the file chooser.
     *
     * You should not modify the returned list model. Future changes to
     * @chooser may or may not affect the returned model.
     *
     * @return A list model of `GFile`s
     */
    public fun getShortcutFolders(): ListModel = gtk_file_chooser_get_shortcut_folders(gtkFileChooserPointer)!!.run {
        ListModel.ListModelImpl(reinterpret())
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Removes a 'choice' that has been added with gtk_file_chooser_add_choice().
     *
     * @param id the ID of the choice to remove
     */
    public fun removeChoice(id: String): Unit = gtk_file_chooser_remove_choice(gtkFileChooserPointer, id)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Removes @filter from the list of filters that the user can select between.
     *
     * @param filter a `GtkFileFilter`
     */
    public fun removeFilter(filter: FileFilter): Unit =
        gtk_file_chooser_remove_filter(gtkFileChooserPointer, filter.gtkFileFilterPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Removes a folder from the shortcut folders in a file chooser.
     *
     * @param folder a `GFile` for the folder to remove
     * @return true if the folder could be removed successfully,
     *   false otherwise.
     */
    public fun removeShortcutFolder(folder: File): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_file_chooser_remove_shortcut_folder(
            gtkFileChooserPointer,
            folder.gioFilePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Sets the type of operation that the chooser is performing.
     *
     * The user interface is adapted to suit the selected action.
     *
     * For example, an option to create a new folder might be shown
     * if the action is %GTK_FILE_CHOOSER_ACTION_SAVE but not if the
     * action is %GTK_FILE_CHOOSER_ACTION_OPEN.
     *
     * @param action the action that the file selector is performing
     */
    public fun setAction(action: FileChooserAction): Unit =
        gtk_file_chooser_set_action(gtkFileChooserPointer, action.nativeValue)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Selects an option in a 'choice' that has been added with
     * gtk_file_chooser_add_choice().
     *
     * For a boolean choice, the possible options are "true" and "false".
     *
     * @param id the ID of the choice to set
     * @param option the ID of the option to select
     */
    public fun setChoice(id: String, option: String): Unit =
        gtk_file_chooser_set_choice(gtkFileChooserPointer, id, option)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Sets whether file chooser will offer to create new folders.
     *
     * This is only relevant if the action is not set to be
     * %GTK_FILE_CHOOSER_ACTION_OPEN.
     *
     * @param createFolders true if the Create Folder button should be displayed
     */
    public fun setCreateFolders(createFolders: Boolean): Unit =
        gtk_file_chooser_set_create_folders(gtkFileChooserPointer, createFolders.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Sets the current folder for @chooser from a `GFile`.
     *
     * @param file the `GFile` for the new folder
     * @return true if the folder could be changed successfully, false
     *   otherwise.
     */
    public fun setCurrentFolder(`file`: File? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_file_chooser_set_current_folder(
            gtkFileChooserPointer,
            `file`?.gioFilePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Sets the current name in the file selector, as if entered
     * by the user.
     *
     * Note that the name passed in here is a UTF-8 string rather
     * than a filename. This function is meant for such uses as a
     * suggested name in a “Save As...” dialog.  You can pass
     * “Untitled.doc” or a similarly suitable suggestion for the @name.
     *
     * If you want to preselect a particular existing file, you should
     * use [method@Gtk.FileChooser.set_file] instead.
     *
     * Please see the documentation for those functions for an example
     * of using [method@Gtk.FileChooser.set_current_name] as well.
     *
     * @param name the filename to use, as a UTF-8 string
     */
    public fun setCurrentName(name: String): Unit = gtk_file_chooser_set_current_name(gtkFileChooserPointer, name)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Sets @file as the current filename for the file chooser.
     *
     * This includes changing to the file’s parent folder and actually selecting
     * the file in list. If the @chooser is in %GTK_FILE_CHOOSER_ACTION_SAVE mode,
     * the file’s base name will also appear in the dialog’s file name entry.
     *
     * If the file name isn’t in the current folder of @chooser, then the current
     * folder of @chooser will be changed to the folder containing @file.
     *
     * Note that the file must exist, or nothing will be done except
     * for the directory change.
     *
     * If you are implementing a save dialog, you should use this function if
     * you already have a file name to which the user may save; for example,
     * when the user opens an existing file and then does “Save As…”. If you
     * don’t have a file name already — for example, if the user just created
     * a new file and is saving it for the first time, do not call this function.
     *
     * Instead, use something similar to this:
     *
     * ```c
     * static void
     * prepare_file_chooser (GtkFileChooser *chooser,
     *                       GFile          *existing_file)
     * {
     *   gboolean document_is_new = (existing_file == NULL);
     *
     *   if (document_is_new)
     *     {
     *       GFile *default_file_for_saving = g_file_new_for_path ("./out.txt");
     *       // the user just created a new document
     *       gtk_file_chooser_set_current_folder (chooser, default_file_for_saving, NULL);
     *       gtk_file_chooser_set_current_name (chooser, "Untitled document");
     *       g_object_unref (default_file_for_saving);
     *     }
     *   else
     *     {
     *       // the user edited an existing document
     *       gtk_file_chooser_set_file (chooser, existing_file, NULL);
     *     }
     * }
     * ```
     *
     * @param file the `GFile` to set as current
     * @return Not useful
     */
    public fun setFile(`file`: File): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_file_chooser_set_file(gtkFileChooserPointer, `file`.gioFilePointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Sets the current filter.
     *
     * Only the files that pass the filter will be displayed.
     * If the user-selectable list of filters is non-empty, then
     * the filter should be one of the filters in that list.
     *
     * Setting the current filter when the list of filters is
     * empty is useful if you want to restrict the displayed
     * set of files without letting the user change it.
     *
     * @param filter a `GtkFileFilter`
     */
    public fun setFilter(filter: FileFilter): Unit =
        gtk_file_chooser_set_filter(gtkFileChooserPointer, filter.gtkFileFilterPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FileDialog] instead
     * ---
     *
     * Sets whether multiple files can be selected in the file chooser.
     *
     * This is only relevant if the action is set to be
     * %GTK_FILE_CHOOSER_ACTION_OPEN or
     * %GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER.
     *
     * @param selectMultiple true if multiple files can be selected.
     */
    public fun setSelectMultiple(selectMultiple: Boolean): Unit =
        gtk_file_chooser_set_select_multiple(gtkFileChooserPointer, selectMultiple.asGBoolean())

    /**
     * The FileChooserImpl type represents a native instance of the FileChooser interface.
     *
     * @constructor Creates a new instance of FileChooser for the provided [CPointer].
     */
    public class FileChooserImpl(gtkFileChooserPointer: CPointer<GtkFileChooser>) :
        Object(gtkFileChooserPointer.reinterpret()),
        FileChooser {
        init {
            Gtk
        }

        override val gtkFileChooserPointer: CPointer<GtkFileChooser> = gtkFileChooserPointer
    }

    public companion object : TypeCompanion<FileChooser> {
        override val type: GeneratedInterfaceKGType<FileChooser> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { FileChooserImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FileChooser
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_file_chooser_get_type()

        /**
         * Gets the GType of from the symbol `gtk_file_chooser_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_file_chooser_get_type")
    }
}
