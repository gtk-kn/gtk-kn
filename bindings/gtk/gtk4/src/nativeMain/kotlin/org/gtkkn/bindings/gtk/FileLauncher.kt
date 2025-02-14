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
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkFileLauncher
import org.gtkkn.native.gtk.gtk_file_launcher_get_always_ask
import org.gtkkn.native.gtk.gtk_file_launcher_get_file
import org.gtkkn.native.gtk.gtk_file_launcher_get_type
import org.gtkkn.native.gtk.gtk_file_launcher_get_writable
import org.gtkkn.native.gtk.gtk_file_launcher_launch
import org.gtkkn.native.gtk.gtk_file_launcher_launch_finish
import org.gtkkn.native.gtk.gtk_file_launcher_new
import org.gtkkn.native.gtk.gtk_file_launcher_open_containing_folder
import org.gtkkn.native.gtk.gtk_file_launcher_open_containing_folder_finish
import org.gtkkn.native.gtk.gtk_file_launcher_set_always_ask
import org.gtkkn.native.gtk.gtk_file_launcher_set_file
import org.gtkkn.native.gtk.gtk_file_launcher_set_writable
import kotlin.Boolean
import kotlin.Result
import kotlin.Unit

/**
 * A `GtkFileLauncher` object collects the arguments that are needed to open a
 * file with an application.
 *
 * Depending on system configuration, user preferences and available APIs, this
 * may or may not show an app chooser dialog or launch the default application
 * right away.
 *
 * The operation is started with the [method@Gtk.FileLauncher.launch] function.
 *
 * To launch uris that don't represent files, use [class@Gtk.UriLauncher].
 * @since 4.10
 */
@GtkVersion4_10
public open class FileLauncher(public val gtkFileLauncherPointer: CPointer<GtkFileLauncher>) :
    Object(gtkFileLauncherPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Whether to ask the user to choose an app for opening the file. If `FALSE`,
     * the file might be opened with a default app or the previous choice.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var alwaysAsk: Boolean
        /**
         * Returns whether to ask the user to choose an app for opening the file.
         *
         * @return `TRUE` if always asking for app
         * @since 4.12
         */
        get() = gtk_file_launcher_get_always_ask(gtkFileLauncherPointer).asBoolean()

        /**
         * Sets whether to awlays ask the user to choose an app for opening the file.
         * If `FALSE`, the file might be opened with a default app or the previous choice.
         *
         * @param alwaysAsk a `gboolean`
         * @since 4.12
         */
        @GtkVersion4_12
        set(alwaysAsk) = gtk_file_launcher_set_always_ask(gtkFileLauncherPointer, alwaysAsk.asGBoolean())

    /**
     * The file to launch.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var `file`: File?
        /**
         * Gets the file that will be opened.
         *
         * @return the file
         * @since 4.10
         */
        get() = gtk_file_launcher_get_file(gtkFileLauncherPointer)?.run {
            File.FileImpl(reinterpret())
        }

        /**
         * Sets the file that will be opened.
         *
         * @param file a `GFile`
         * @since 4.10
         */
        @GtkVersion4_10
        set(`file`) = gtk_file_launcher_set_file(gtkFileLauncherPointer, `file`?.gioFilePointer)

    /**
     * Whether to make the file writable for the handler.
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public open var writable: Boolean
        /**
         * Returns whether to make the file writable for the handler.
         *
         * @return `TRUE` if the file will be made writable
         * @since 4.14
         */
        get() = gtk_file_launcher_get_writable(gtkFileLauncherPointer).asBoolean()

        /**
         * Sets whether to make the file writable for the handler.
         *
         * @param writable a `gboolean`
         * @since 4.14
         */
        @GtkVersion4_14
        set(writable) = gtk_file_launcher_set_writable(gtkFileLauncherPointer, writable.asGBoolean())

    /**
     * Creates a new `GtkFileLauncher` object.
     *
     * @param file the file to open
     * @return the new `GtkFileLauncher`
     * @since 4.10
     */
    public constructor(`file`: File? = null) : this(gtk_file_launcher_new(`file`?.gioFilePointer)!!) {
        InstanceCache.put(this)
    }

    /**
     * Launch an application to open the file.
     *
     * This may present an app chooser dialog to the user.
     *
     * @param parent the parent `GtkWindow`
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the
     *   operation is complete
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun launch(
        parent: Window? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_file_launcher_launch(
        gtkFileLauncherPointer,
        parent?.gtkWindowPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes the [method@Gtk.FileLauncher.launch] call and
     * returns the result.
     *
     * @param result a `GAsyncResult`
     * @return `TRUE` if an application was launched,
     *     or `FALSE` and @error is set
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun launchFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_file_launcher_launch_finish(
            gtkFileLauncherPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Launch a file manager to show the file in its parent directory.
     *
     * This is only supported native files. It will fail if @file
     * is e.g. a http:// uri.
     *
     * @param parent the parent `GtkWindow`
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the
     *   operation is complete
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun openContainingFolder(
        parent: Window? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_file_launcher_open_containing_folder(
        gtkFileLauncherPointer,
        parent?.gtkWindowPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes the [method@Gtk.FileLauncher.open_containing_folder]
     * call and returns the result.
     *
     * @param result a `GAsyncResult`
     * @return `TRUE` if an application was launched,
     *     or `FALSE` and @error is set
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun openContainingFolderFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_file_launcher_open_containing_folder_finish(
            gtkFileLauncherPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    public companion object : TypeCompanion<FileLauncher> {
        override val type: GeneratedClassKGType<FileLauncher> =
            GeneratedClassKGType(getTypeOrNull()!!) { FileLauncher(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FileLauncher
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_file_launcher_get_type()

        /**
         * Gets the GType of from the symbol `gtk_file_launcher_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_file_launcher_get_type")
    }
}
