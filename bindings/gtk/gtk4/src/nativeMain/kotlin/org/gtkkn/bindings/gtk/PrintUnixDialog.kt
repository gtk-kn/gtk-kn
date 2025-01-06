// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkPrintUnixDialog
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.gtk_print_unix_dialog_add_custom_tab
import org.gtkkn.native.gtk.gtk_print_unix_dialog_get_current_page
import org.gtkkn.native.gtk.gtk_print_unix_dialog_get_embed_page_setup
import org.gtkkn.native.gtk.gtk_print_unix_dialog_get_has_selection
import org.gtkkn.native.gtk.gtk_print_unix_dialog_get_manual_capabilities
import org.gtkkn.native.gtk.gtk_print_unix_dialog_get_page_setup
import org.gtkkn.native.gtk.gtk_print_unix_dialog_get_page_setup_set
import org.gtkkn.native.gtk.gtk_print_unix_dialog_get_selected_printer
import org.gtkkn.native.gtk.gtk_print_unix_dialog_get_settings
import org.gtkkn.native.gtk.gtk_print_unix_dialog_get_support_selection
import org.gtkkn.native.gtk.gtk_print_unix_dialog_get_type
import org.gtkkn.native.gtk.gtk_print_unix_dialog_new
import org.gtkkn.native.gtk.gtk_print_unix_dialog_set_current_page
import org.gtkkn.native.gtk.gtk_print_unix_dialog_set_embed_page_setup
import org.gtkkn.native.gtk.gtk_print_unix_dialog_set_has_selection
import org.gtkkn.native.gtk.gtk_print_unix_dialog_set_manual_capabilities
import org.gtkkn.native.gtk.gtk_print_unix_dialog_set_page_setup
import org.gtkkn.native.gtk.gtk_print_unix_dialog_set_settings
import org.gtkkn.native.gtk.gtk_print_unix_dialog_set_support_selection
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * `GtkPrintUnixDialog` implements a print dialog for platforms
 * which don’t provide a native print dialog, like Unix.
 *
 * ![An example GtkPrintUnixDialog](printdialog.png)
 *
 * It can be used very much like any other GTK dialog, at the cost of
 * the portability offered by the high-level printing API with
 * [class@Gtk.PrintOperation].
 *
 * In order to print something with `GtkPrintUnixDialog`, you need to
 * use [method@Gtk.PrintUnixDialog.get_selected_printer] to obtain a
 * [class@Gtk.Printer] object and use it to construct a [class@Gtk.PrintJob]
 * using [ctor@Gtk.PrintJob.new].
 *
 * `GtkPrintUnixDialog` uses the following response values:
 *
 * - %GTK_RESPONSE_OK: for the “Print” button
 * - %GTK_RESPONSE_APPLY: for the “Preview” button
 * - %GTK_RESPONSE_CANCEL: for the “Cancel” button
 *
 * # GtkPrintUnixDialog as GtkBuildable
 *
 * The `GtkPrintUnixDialog` implementation of the `GtkBuildable` interface
 * exposes its @notebook internal children with the name “notebook”.
 *
 * An example of a `GtkPrintUnixDialog` UI definition fragment:
 *
 * ```xml
 * <object class="GtkPrintUnixDialog" id="dialog1">
 *   <child internal-child="notebook">
 *     <object class="GtkNotebook" id="notebook">
 *       <child>
 *         <object type="GtkNotebookPage">
 *           <property name="tab_expand">False</property>
 *           <property name="tab_fill">False</property>
 *           <property name="tab">
 *             <object class="GtkLabel" id="tablabel">
 *               <property name="label">Tab label</property>
 *             </object>
 *           </property>
 *           <property name="child">
 *             <object class="GtkLabel" id="tabcontent">
 *               <property name="label">Content on notebook tab</property>
 *             </object>
 *           </property>
 *         </object>
 *       </child>
 *     </object>
 *   </child>
 * </object>
 * ```
 *
 * # CSS nodes
 *
 * `GtkPrintUnixDialog` has a single CSS node with name window. The style classes
 * dialog and print are added.
 *
 * ## Skipped during bindings generation
 *
 * - method `print-settings`: Property has no getter nor setter
 */
public open class PrintUnixDialog(pointer: CPointer<GtkPrintUnixDialog>) :
    Dialog(pointer.reinterpret()),
    KGTyped {
    public val gtkPrintUnixDialogPointer: CPointer<GtkPrintUnixDialog>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = gPointer.reinterpret()

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = gPointer.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = gPointer.reinterpret()

    /**
     * The current page in the document.
     */
    public open var currentPage: gint
        /**
         * Gets the current page of the `GtkPrintUnixDialog`.
         *
         * @return the current page of @dialog
         */
        get() = gtk_print_unix_dialog_get_current_page(gtkPrintUnixDialogPointer.reinterpret())

        /**
         * Sets the current page number.
         *
         * If @current_page is not -1, this enables the current page choice
         * for the range of pages to print.
         *
         * @param currentPage the current page number.
         */
        set(currentPage) = gtk_print_unix_dialog_set_current_page(gtkPrintUnixDialogPointer.reinterpret(), currentPage)

    /**
     * true if the page setup controls are embedded.
     */
    public open var embedPageSetup: Boolean
        /**
         * Gets whether to embed the page setup.
         *
         * @return whether to embed the page setup
         */
        get() = gtk_print_unix_dialog_get_embed_page_setup(gtkPrintUnixDialogPointer.reinterpret()).asBoolean()

        /**
         * Embed page size combo box and orientation combo box into page setup page.
         *
         * @param embed embed page setup selection
         */
        set(
            embed
        ) = gtk_print_unix_dialog_set_embed_page_setup(gtkPrintUnixDialogPointer.reinterpret(), embed.asGBoolean())

    /**
     * Whether the application has a selection.
     */
    public open var hasSelection: Boolean
        /**
         * Gets whether there is a selection.
         *
         * @return whether there is a selection
         */
        get() = gtk_print_unix_dialog_get_has_selection(gtkPrintUnixDialogPointer.reinterpret()).asBoolean()

        /**
         * Sets whether a selection exists.
         *
         * @param hasSelection true indicates that a selection exists
         */
        set(
            hasSelection
        ) = gtk_print_unix_dialog_set_has_selection(gtkPrintUnixDialogPointer.reinterpret(), hasSelection.asGBoolean())

    /**
     * Capabilities the application can handle.
     */
    public open var manualCapabilities: PrintCapabilities
        /**
         * Gets the capabilities that have been set on this `GtkPrintUnixDialog`.
         *
         * @return the printing capabilities
         */
        get() = gtk_print_unix_dialog_get_manual_capabilities(gtkPrintUnixDialogPointer.reinterpret()).run {
            PrintCapabilities(this)
        }

        /**
         * This lets you specify the printing capabilities your application
         * supports.
         *
         * For instance, if you can handle scaling the output then you pass
         * %GTK_PRINT_CAPABILITY_SCALE. If you don’t pass that, then the dialog
         * will only let you select the scale if the printing system automatically
         * handles scaling.
         *
         * @param capabilities the printing capabilities of your application
         */
        set(
            capabilities
        ) = gtk_print_unix_dialog_set_manual_capabilities(gtkPrintUnixDialogPointer.reinterpret(), capabilities.mask)

    /**
     * The `GtkPageSetup` object to use.
     */
    public open var pageSetup: PageSetup
        /**
         * Gets the page setup that is used by the `GtkPrintUnixDialog`.
         *
         * @return the page setup of @dialog.
         */
        get() = gtk_print_unix_dialog_get_page_setup(gtkPrintUnixDialogPointer.reinterpret())!!.run {
            PageSetup(reinterpret())
        }

        /**
         * Sets the page setup of the `GtkPrintUnixDialog`.
         *
         * @param pageSetup a `GtkPageSetup`
         */
        set(
            pageSetup
        ) = gtk_print_unix_dialog_set_page_setup(
            gtkPrintUnixDialogPointer.reinterpret(),
            pageSetup.gtkPageSetupPointer.reinterpret()
        )

    /**
     * The `GtkPrinter` which is selected.
     */
    public open val selectedPrinter: Printer?
        /**
         * Gets the currently selected printer.
         *
         * @return the currently selected printer
         */
        get() = gtk_print_unix_dialog_get_selected_printer(gtkPrintUnixDialogPointer.reinterpret())?.run {
            Printer(reinterpret())
        }

    /**
     * Whether the dialog supports selection.
     */
    public open var supportSelection: Boolean
        /**
         * Gets whether the print dialog allows user to print a selection.
         *
         * @return whether the application supports print of selection
         */
        get() = gtk_print_unix_dialog_get_support_selection(gtkPrintUnixDialogPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the print dialog allows user to print a selection.
         *
         * @param supportSelection true to allow print selection
         */
        set(
            supportSelection
        ) = gtk_print_unix_dialog_set_support_selection(
            gtkPrintUnixDialogPointer.reinterpret(),
            supportSelection.asGBoolean()
        )

    /**
     * Creates a new `GtkPrintUnixDialog`.
     *
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     * @return a new `GtkPrintUnixDialog`
     */
    public constructor(
        title: String? = null,
        parent: Window? = null,
    ) : this(gtk_print_unix_dialog_new(title, parent?.gtkWindowPointer?.reinterpret())!!.reinterpret())

    /**
     * Adds a custom tab to the print dialog.
     *
     * @param child the widget to put in the custom tab
     * @param tabLabel the widget to use as tab label
     */
    public open fun addCustomTab(child: Widget, tabLabel: Widget): Unit = gtk_print_unix_dialog_add_custom_tab(
        gtkPrintUnixDialogPointer.reinterpret(),
        child.gtkWidgetPointer.reinterpret(),
        tabLabel.gtkWidgetPointer.reinterpret()
    )

    /**
     * Gets whether a page setup was set by the user.
     *
     * @return whether a page setup was set by user.
     */
    public open fun getPageSetupSet(): Boolean =
        gtk_print_unix_dialog_get_page_setup_set(gtkPrintUnixDialogPointer.reinterpret()).asBoolean()

    /**
     * Gets a new `GtkPrintSettings` object that represents the
     * current values in the print dialog.
     *
     * Note that this creates a new object, and you need to unref
     * it if don’t want to keep it.
     *
     * @return a new `GtkPrintSettings` object with the values from @dialog
     */
    public open fun getPrintSettings(): PrintSettings =
        gtk_print_unix_dialog_get_settings(gtkPrintUnixDialogPointer.reinterpret())!!.run {
            PrintSettings(reinterpret())
        }

    /**
     * Sets the `GtkPrintSettings` for the `GtkPrintUnixDialog`.
     *
     * Typically, this is used to restore saved print settings
     * from a previous print operation before the print dialog
     * is shown.
     *
     * @param settings a `GtkPrintSettings`
     */
    public open fun setSettings(settings: PrintSettings? = null): Unit = gtk_print_unix_dialog_set_settings(
        gtkPrintUnixDialogPointer.reinterpret(),
        settings?.gtkPrintSettingsPointer?.reinterpret()
    )

    public companion object : TypeCompanion<PrintUnixDialog> {
        override val type: GeneratedClassKGType<PrintUnixDialog> =
            GeneratedClassKGType(gtk_print_unix_dialog_get_type()) { PrintUnixDialog(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of PrintUnixDialog
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_print_unix_dialog_get_type()
    }
}
