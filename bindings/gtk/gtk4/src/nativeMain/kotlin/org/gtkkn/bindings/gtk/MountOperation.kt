// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkMountOperation
import org.gtkkn.native.gtk.gtk_mount_operation_get_display
import org.gtkkn.native.gtk.gtk_mount_operation_get_parent
import org.gtkkn.native.gtk.gtk_mount_operation_get_type
import org.gtkkn.native.gtk.gtk_mount_operation_is_showing
import org.gtkkn.native.gtk.gtk_mount_operation_new
import org.gtkkn.native.gtk.gtk_mount_operation_set_display
import org.gtkkn.native.gtk.gtk_mount_operation_set_parent
import kotlin.Boolean

/**
 * `GtkMountOperation` is an implementation of `GMountOperation`.
 *
 * The functions and objects described here make working with GTK and
 * GIO more convenient.
 *
 * `GtkMountOperation` is needed when mounting volumes:
 * It is an implementation of `GMountOperation` that can be used with
 * GIO functions for mounting volumes such as
 * g_file_mount_enclosing_volume(), g_file_mount_mountable(),
 * g_volume_mount(), g_mount_unmount_with_operation() and others.
 *
 * When necessary, `GtkMountOperation` shows dialogs to let the user
 * enter passwords, ask questions or show processes blocking unmount.
 *
 * ## Skipped during bindings generation
 *
 * - method `is-showing`: Property has no getter nor setter
 */
public open class MountOperation(public val gtkMountOperationPointer: CPointer<GtkMountOperation>) :
    org.gtkkn.bindings.gio.MountOperation(gtkMountOperationPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * The display where dialogs will be shown.
     */
    public open var display: Display
        /**
         * Gets the display on which windows of the `GtkMountOperation`
         * will be shown.
         *
         * @return the display on which windows of @op are shown
         */
        get() = gtk_mount_operation_get_display(gtkMountOperationPointer)!!.run {
            InstanceCache.get(this, true) { Display(reinterpret()) }!!
        }

        /**
         * Sets the display to show windows of the `GtkMountOperation` on.
         *
         * @param display a `GdkDisplay`
         */
        set(display) = gtk_mount_operation_set_display(gtkMountOperationPointer, display.gdkDisplayPointer)

    /**
     * The parent window.
     */
    public open var parent: Window?
        /**
         * Gets the transient parent used by the `GtkMountOperation`.
         *
         * @return the transient parent for windows shown by @op
         */
        get() = gtk_mount_operation_get_parent(gtkMountOperationPointer)?.run {
            InstanceCache.get(this, true) { Window(reinterpret()) }!!
        }

        /**
         * Sets the transient parent for windows shown by the
         * `GtkMountOperation`.
         *
         * @param parent transient parent of the window
         */
        set(parent) = gtk_mount_operation_set_parent(gtkMountOperationPointer, parent?.gtkWindowPointer)

    /**
     * Creates a new `GtkMountOperation`.
     *
     * @param parent transient parent of the window
     * @return a new `GtkMountOperation`
     */
    public constructor(
        parent: Window? = null,
    ) : this(gtk_mount_operation_new(parent?.gtkWindowPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Returns whether the `GtkMountOperation` is currently displaying
     * a window.
     *
     * @return true if @op is currently displaying a window
     */
    public open fun isShowing(): Boolean = gtk_mount_operation_is_showing(gtkMountOperationPointer).asBoolean()

    public companion object : TypeCompanion<MountOperation> {
        override val type: GeneratedClassKGType<MountOperation> =
            GeneratedClassKGType(getTypeOrNull()!!) { MountOperation(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of MountOperation
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_mount_operation_get_type()

        /**
         * Gets the GType of from the symbol `gtk_mount_operation_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_mount_operation_get_type")
    }
}
