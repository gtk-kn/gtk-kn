// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkEditable
import org.gtkkn.native.gtk.GtkPasswordEntry
import org.gtkkn.native.gtk.gtk_password_entry_get_extra_menu
import org.gtkkn.native.gtk.gtk_password_entry_get_show_peek_icon
import org.gtkkn.native.gtk.gtk_password_entry_get_type
import org.gtkkn.native.gtk.gtk_password_entry_new
import org.gtkkn.native.gtk.gtk_password_entry_set_extra_menu
import org.gtkkn.native.gtk.gtk_password_entry_set_show_peek_icon
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkPasswordEntry` is an entry that has been tailored for entering secrets.
 *
 * ![An example GtkPasswordEntry](password-entry.png)
 *
 * It does not show its contents in clear text, does not allow to copy it
 * to the clipboard, and it shows a warning when Caps Lock is engaged. If
 * the underlying platform allows it, `GtkPasswordEntry` will also place
 * the text in a non-pageable memory area, to avoid it being written out
 * to disk by the operating system.
 *
 * Optionally, it can offer a way to reveal the contents in clear text.
 *
 * `GtkPasswordEntry` provides only minimal API and should be used with
 * the [iface@Gtk.Editable] API.
 *
 * # CSS Nodes
 *
 * ```
 * entry.password
 * ╰── text
 *     ├── image.caps-lock-indicator
 *     ┊
 * ```
 *
 * `GtkPasswordEntry` has a single CSS node with name entry that carries
 * a .passwordstyle class. The text Css node below it has a child with
 * name image and style class .caps-lock-indicator for the Caps Lock
 * icon, and possibly other children.
 *
 * # Accessibility
 *
 * `GtkPasswordEntry` uses the %GTK_ACCESSIBLE_ROLE_TEXT_BOX role.
 *
 * ## Skipped during bindings generation
 *
 * - method `activates-default`: Property has no getter nor setter
 * - method `placeholder-text`: Property has no getter nor setter
 */
public open class PasswordEntry(public val gtkPasswordEntryPointer: CPointer<GtkPasswordEntry>) :
    Widget(gtkPasswordEntryPointer.reinterpret()),
    Editable,
    KGTyped {
    init {
        Gtk
    }

    override val gtkEditablePointer: CPointer<GtkEditable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * A menu model whose contents will be appended to
     * the context menu.
     */
    public open var extraMenu: MenuModel?
        /**
         * Gets the menu model set with gtk_password_entry_set_extra_menu().
         *
         * @return the menu model
         */
        get() = gtk_password_entry_get_extra_menu(gtkPasswordEntryPointer)?.run {
            InstanceCache.get(this, true) { MenuModel.MenuModelImpl(reinterpret()) }!!
        }

        /**
         * Sets a menu model to add when constructing
         * the context menu for @entry.
         *
         * @param model a `GMenuModel`
         */
        set(model) = gtk_password_entry_set_extra_menu(gtkPasswordEntryPointer, model?.gioMenuModelPointer)

    /**
     * Whether to show an icon for revealing the content.
     */
    public open var showPeekIcon: Boolean
        /**
         * Returns whether the entry is showing an icon to
         * reveal the contents.
         *
         * @return true if an icon is shown
         */
        get() = gtk_password_entry_get_show_peek_icon(gtkPasswordEntryPointer).asBoolean()

        /**
         * Sets whether the entry should have a clickable icon
         * to reveal the contents.
         *
         * Setting this to false also hides the text again.
         *
         * @param showPeekIcon whether to show the peek icon
         */
        set(showPeekIcon) = gtk_password_entry_set_show_peek_icon(gtkPasswordEntryPointer, showPeekIcon.asGBoolean())

    /**
     * Creates a `GtkPasswordEntry`.
     *
     * @return a new `GtkPasswordEntry`
     */
    public constructor() : this(gtk_password_entry_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Emitted when the entry is activated.
     *
     * The keybindings for this signal are all forms of the Enter key.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkPasswordEntryPointer,
            "activate",
            onActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate" signal. See [onActivate].
     */
    public fun emitActivate() {
        g_signal_emit_by_name(gtkPasswordEntryPointer.reinterpret(), "activate")
    }

    public companion object : TypeCompanion<PasswordEntry> {
        override val type: GeneratedClassKGType<PasswordEntry> =
            GeneratedClassKGType(getTypeOrNull()!!) { PasswordEntry(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of PasswordEntry
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_password_entry_get_type()

        /**
         * Gets the GType of from the symbol `gtk_password_entry_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_password_entry_get_type")
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
