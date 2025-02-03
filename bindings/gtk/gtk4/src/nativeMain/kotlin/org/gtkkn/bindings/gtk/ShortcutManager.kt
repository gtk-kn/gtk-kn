// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
    public class ShortcutManagerImpl(gtkShortcutManagerPointer: CPointer<GtkShortcutManager>) :
        Object(gtkShortcutManagerPointer.reinterpret()),
        ShortcutManager {
        init {
            Gtk
        }

        override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager> =
            gtkShortcutManagerPointer
    }

    public companion object : TypeCompanion<ShortcutManager> {
        override val type: GeneratedInterfaceKGType<ShortcutManager> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { ShortcutManagerImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ShortcutManager
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_shortcut_manager_get_type()

        /**
         * Gets the GType of from the symbol `gtk_shortcut_manager_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_shortcut_manager_get_type")
    }
}
