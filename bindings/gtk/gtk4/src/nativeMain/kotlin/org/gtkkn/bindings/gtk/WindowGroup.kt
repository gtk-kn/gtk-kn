// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkWindowGroup
import org.gtkkn.native.gtk.gtk_window_group_add_window
import org.gtkkn.native.gtk.gtk_window_group_get_type
import org.gtkkn.native.gtk.gtk_window_group_list_windows
import org.gtkkn.native.gtk.gtk_window_group_new
import org.gtkkn.native.gtk.gtk_window_group_remove_window
import kotlin.Unit

/**
 * `GtkWindowGroup` makes group of windows behave like separate applications.
 *
 * It achieves this by limiting the effect of GTK grabs and modality
 * to windows in the same group.
 *
 * A window can be a member in at most one window group at a time.
 * Windows that have not been explicitly assigned to a group are
 * implicitly treated like windows of the default window group.
 *
 * `GtkWindowGroup` objects are referenced by each window in the group,
 * so once you have added all windows to a `GtkWindowGroup`, you can drop
 * the initial reference to the window group with g_object_unref(). If the
 * windows in the window group are subsequently destroyed, then they will
 * be removed from the window group and drop their references on the window
 * group; when all window have been removed, the window group will be
 * freed.
 */
public open class WindowGroup(
    pointer: CPointer<GtkWindowGroup>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gtkWindowGroupPointer: CPointer<GtkWindowGroup>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkWindowGroup` object.
     *
     * Modality of windows only affects windows
     * within the same `GtkWindowGroup`.
     *
     * @return a new `GtkWindowGroup`.
     */
    public constructor() : this(gtk_window_group_new()!!.reinterpret())

    /**
     * Adds a window to a `GtkWindowGroup`.
     *
     * @param window the `GtkWindow` to add
     */
    public open fun addWindow(window: Window): Unit =
        gtk_window_group_add_window(
            gtkWindowGroupPointer.reinterpret(),
            window.gtkWindowPointer.reinterpret()
        )

    /**
     * Returns a list of the `GtkWindows` that belong to @window_group.
     *
     * @return A
     *   newly-allocated list of windows inside the group.
     */
    public open fun listWindows(): List =
        gtk_window_group_list_windows(gtkWindowGroupPointer.reinterpret())!!.run {
            List(reinterpret())
        }

    /**
     * Removes a window from a `GtkWindowGroup`.
     *
     * @param window the `GtkWindow` to remove
     */
    public open fun removeWindow(window: Window): Unit =
        gtk_window_group_remove_window(
            gtkWindowGroupPointer.reinterpret(),
            window.gtkWindowPointer.reinterpret()
        )

    public companion object : TypeCompanion<WindowGroup> {
        override val type: GeneratedClassKGType<WindowGroup> =
            GeneratedClassKGType(gtk_window_group_get_type()) { WindowGroup(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
