// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.gtk_shortcut_manager_get_type

/**
 * The `GtkShortcutManager` interface is used to implement
 * shortcut scopes.
 *
 * This is important for [iface@Gtk.Native] widgets that have their
 * own surface, since the event controllers that are used to implement
 * managed and global scopes are limited to the same native.
 *
 * Examples for widgets implementing `GtkShortcutManager` are
 * [class@Gtk.Window] and [class@Gtk.Popover].
 *
 * Every widget that implements `GtkShortcutManager` will be used as a
 * %GTK_SHORTCUT_SCOPE_MANAGED.
 */
public interface ShortcutManager :
    Proxy,
    KGTyped {
    public val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>

    /**
     * The ShortcutManagerImpl type represents a native instance of the ShortcutManager interface.
     *
     * @constructor Creates a new instance of ShortcutManager for the provided [CPointer].
     */
    public data class ShortcutManagerImpl(override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>) :
        Object(gtkShortcutManagerPointer.reinterpret()),
        ShortcutManager

    public companion object : TypeCompanion<ShortcutManager> {
        override val type: GeneratedInterfaceKGType<ShortcutManager> =
            GeneratedInterfaceKGType(gtk_shortcut_manager_get_type()) { ShortcutManagerImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ShortcutManager
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_shortcut_manager_get_type()
    }
}
