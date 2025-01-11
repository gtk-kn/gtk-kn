// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
            Display(this)
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
            Window(this)
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
    public constructor(parent: Window? = null) : this(gtk_mount_operation_new(parent?.gtkWindowPointer)!!.reinterpret())

    /**
     * Returns whether the `GtkMountOperation` is currently displaying
     * a window.
     *
     * @return true if @op is currently displaying a window
     */
    public open fun isShowing(): Boolean = gtk_mount_operation_is_showing(gtkMountOperationPointer).asBoolean()

    public companion object : TypeCompanion<MountOperation> {
        override val type: GeneratedClassKGType<MountOperation> =
            GeneratedClassKGType(gtk_mount_operation_get_type()) { MountOperation(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of MountOperation
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_mount_operation_get_type()
    }
}
