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
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkPageSetupUnixDialog
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.gtk_page_setup_unix_dialog_get_page_setup
import org.gtkkn.native.gtk.gtk_page_setup_unix_dialog_get_print_settings
import org.gtkkn.native.gtk.gtk_page_setup_unix_dialog_get_type
import org.gtkkn.native.gtk.gtk_page_setup_unix_dialog_new
import org.gtkkn.native.gtk.gtk_page_setup_unix_dialog_set_page_setup
import org.gtkkn.native.gtk.gtk_page_setup_unix_dialog_set_print_settings
import kotlin.String
import kotlin.Unit

/**
 * `GtkPageSetupUnixDialog` implements a page setup dialog for platforms
 * which don’t provide a native page setup dialog, like Unix.
 *
 * ![An example GtkPageSetupUnixDialog](pagesetupdialog.png)
 *
 * It can be used very much like any other GTK dialog, at the
 * cost of the portability offered by the high-level printing
 * API in [class@Gtk.PrintOperation].
 *
 * ## CSS nodes
 *
 * `GtkPageSetupUnixDialog` has a single CSS node with the name `window` and
 * style class `.pagesetup`.
 */
public open class PageSetupUnixDialog(public val gtkPageSetupUnixDialogPointer: CPointer<GtkPageSetupUnixDialog>) :
    Dialog(gtkPageSetupUnixDialogPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

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
     * Creates a new page setup dialog.
     *
     * @param title the title of the dialog
     * @param parent transient parent of the dialog
     * @return the new `GtkPageSetupUnixDialog`
     */
    public constructor(
        title: String? = null,
        parent: Window? = null,
    ) : this(gtk_page_setup_unix_dialog_new(title, parent?.gtkWindowPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Gets the currently selected page setup from the dialog.
     *
     * @return the current page setup
     */
    public open fun getPageSetup(): PageSetup =
        gtk_page_setup_unix_dialog_get_page_setup(gtkPageSetupUnixDialogPointer)!!.run {
            InstanceCache.get(this, true) { PageSetup(reinterpret()) }!!
        }

    /**
     * Gets the current print settings from the dialog.
     *
     * @return the current print settings
     */
    public open fun getPrintSettings(): PrintSettings? =
        gtk_page_setup_unix_dialog_get_print_settings(gtkPageSetupUnixDialogPointer)?.run {
            InstanceCache.get(this, true) { PrintSettings(reinterpret()) }!!
        }

    /**
     * Sets the `GtkPageSetup` from which the page setup
     * dialog takes its values.
     *
     * @param pageSetup a `GtkPageSetup`
     */
    public open fun setPageSetup(pageSetup: PageSetup): Unit =
        gtk_page_setup_unix_dialog_set_page_setup(gtkPageSetupUnixDialogPointer, pageSetup.gtkPageSetupPointer)

    /**
     * Sets the `GtkPrintSettings` from which the page setup dialog
     * takes its values.
     *
     * @param printSettings a `GtkPrintSettings`
     */
    public open fun setPrintSettings(printSettings: PrintSettings? = null): Unit =
        gtk_page_setup_unix_dialog_set_print_settings(
            gtkPageSetupUnixDialogPointer,
            printSettings?.gtkPrintSettingsPointer
        )

    public companion object : TypeCompanion<PageSetupUnixDialog> {
        override val type: GeneratedClassKGType<PageSetupUnixDialog> =
            GeneratedClassKGType(getTypeOrNull()!!) { PageSetupUnixDialog(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of PageSetupUnixDialog
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_page_setup_unix_dialog_get_type()

        /**
         * Gets the GType of from the symbol `gtk_page_setup_unix_dialog_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_page_setup_unix_dialog_get_type")
    }
}
