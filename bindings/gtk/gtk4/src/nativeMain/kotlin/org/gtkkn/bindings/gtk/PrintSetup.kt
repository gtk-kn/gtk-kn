// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPrintSetup
import org.gtkkn.native.gtk.gtk_print_setup_get_page_setup
import org.gtkkn.native.gtk.gtk_print_setup_get_print_settings
import org.gtkkn.native.gtk.gtk_print_setup_get_type
import org.gtkkn.native.gtk.gtk_print_setup_ref
import org.gtkkn.native.gtk.gtk_print_setup_unref
import kotlin.Unit

/**
 * A `GtkPrintSetup` is an auxiliary object for printing that allows decoupling
 * the setup from the printing.
 *
 * A print setup is obtained by calling [method@Gtk.PrintDialog.setup],
 * and can later be passed to print functions such as [method@Gtk.PrintDialog.print].
 *
 * Print setups can be reused for multiple print calls.
 *
 * Applications may wish to store the page_setup and print_settings from the print setup
 * and copy them to the PrintDialog if they want to keep using them.
 * @since 4.14
 */
@GtkVersion4_14
public class PrintSetup(pointer: CPointer<GtkPrintSetup>) : ProxyInstance(pointer) {
    public val gtkPrintSetupPointer: CPointer<GtkPrintSetup> = pointer

    /**
     * Returns the page setup of @setup.
     *
     * It may be different from the `GtkPrintDialog`'s page setup
     * if the user changed it during the setup process.
     *
     * @return the page setup, or `NULL`
     * @since 4.14
     */
    @GtkVersion4_14
    public fun getPageSetup(): PageSetup? = gtk_print_setup_get_page_setup(gtkPrintSetupPointer.reinterpret())?.run {
        PageSetup(reinterpret())
    }

    /**
     * Returns the print settings of @setup.
     *
     * They may be different from the `GtkPrintDialog`'s settings
     * if the user changed them during the setup process.
     *
     * @return the print settings, or `NULL`
     * @since 4.14
     */
    @GtkVersion4_14
    public fun getPrintSettings(): PrintSettings? =
        gtk_print_setup_get_print_settings(gtkPrintSetupPointer.reinterpret())?.run {
            PrintSettings(reinterpret())
        }

    /**
     * Increase the reference count of @setup.
     *
     * @return the print setup
     * @since 4.14
     */
    @GtkVersion4_14
    public fun ref(): PrintSetup = gtk_print_setup_ref(gtkPrintSetupPointer.reinterpret())!!.run {
        PrintSetup(reinterpret())
    }

    /**
     * Decrease the reference count of @setup.
     *
     * If the reference count reaches zero,
     * the object is freed.
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public fun unref(): Unit = gtk_print_setup_unref(gtkPrintSetupPointer.reinterpret())

    public companion object {
        /**
         * Get the GType of PrintSetup
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_print_setup_get_type()
    }
}
