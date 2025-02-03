// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkFontChooser
import org.gtkkn.native.gtk.GtkFontChooserDialog
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.gtk_font_chooser_dialog_get_type
import org.gtkkn.native.gtk.gtk_font_chooser_dialog_new
import kotlin.String

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * Use [class@Gtk.FontDialog] instead
 * ---
 *
 * The `GtkFontChooserDialog` widget is a dialog for selecting a font.
 *
 * ![An example GtkFontChooserDialog](fontchooser.png)
 *
 * `GtkFontChooserDialog` implements the [iface@Gtk.FontChooser] interface
 * and does not provide much API of its own.
 *
 * To create a `GtkFontChooserDialog`, use [ctor@Gtk.FontChooserDialog.new].
 *
 * # GtkFontChooserDialog as GtkBuildable
 *
 * The `GtkFontChooserDialog` implementation of the `GtkBuildable`
 * interface exposes the buttons with the names “select_button”
 * and “cancel_button”.
 *
 * ## CSS nodes
 *
 * `GtkFontChooserDialog` has a single CSS node with the name `window` and style
 * class `.fontchooser`.
 */
public open class FontChooserDialog(public val gtkFontChooserDialogPointer: CPointer<GtkFontChooserDialog>) :
    Dialog(gtkFontChooserDialogPointer.reinterpret()),
    FontChooser,
    KGTyped {
    init {
        Gtk
    }

    override val gtkFontChooserPointer: CPointer<GtkFontChooser>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = handle.reinterpret()

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = handle.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = handle.reinterpret()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [class@Gtk.FontDialog] instead
     * ---
     *
     * Creates a new `GtkFontChooserDialog`.
     *
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     * @return a new `GtkFontChooserDialog`
     */
    public constructor(
        title: String? = null,
        parent: Window? = null,
    ) : this(gtk_font_chooser_dialog_new(title, parent?.gtkWindowPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<FontChooserDialog> {
        override val type: GeneratedClassKGType<FontChooserDialog> =
            GeneratedClassKGType(getTypeOrNull()!!) { FontChooserDialog(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FontChooserDialog
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_font_chooser_dialog_get_type()

        /**
         * Gets the GType of from the symbol `gtk_font_chooser_dialog_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_font_chooser_dialog_get_type")
    }
}
