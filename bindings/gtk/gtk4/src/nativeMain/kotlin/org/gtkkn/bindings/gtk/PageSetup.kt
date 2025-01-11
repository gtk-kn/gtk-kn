// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.KeyFile
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPageSetup
import org.gtkkn.native.gtk.gtk_page_setup_copy
import org.gtkkn.native.gtk.gtk_page_setup_get_bottom_margin
import org.gtkkn.native.gtk.gtk_page_setup_get_left_margin
import org.gtkkn.native.gtk.gtk_page_setup_get_orientation
import org.gtkkn.native.gtk.gtk_page_setup_get_page_height
import org.gtkkn.native.gtk.gtk_page_setup_get_page_width
import org.gtkkn.native.gtk.gtk_page_setup_get_paper_height
import org.gtkkn.native.gtk.gtk_page_setup_get_paper_size
import org.gtkkn.native.gtk.gtk_page_setup_get_paper_width
import org.gtkkn.native.gtk.gtk_page_setup_get_right_margin
import org.gtkkn.native.gtk.gtk_page_setup_get_top_margin
import org.gtkkn.native.gtk.gtk_page_setup_get_type
import org.gtkkn.native.gtk.gtk_page_setup_load_file
import org.gtkkn.native.gtk.gtk_page_setup_load_key_file
import org.gtkkn.native.gtk.gtk_page_setup_new
import org.gtkkn.native.gtk.gtk_page_setup_new_from_file
import org.gtkkn.native.gtk.gtk_page_setup_new_from_gvariant
import org.gtkkn.native.gtk.gtk_page_setup_new_from_key_file
import org.gtkkn.native.gtk.gtk_page_setup_set_bottom_margin
import org.gtkkn.native.gtk.gtk_page_setup_set_left_margin
import org.gtkkn.native.gtk.gtk_page_setup_set_orientation
import org.gtkkn.native.gtk.gtk_page_setup_set_paper_size
import org.gtkkn.native.gtk.gtk_page_setup_set_paper_size_and_default_margins
import org.gtkkn.native.gtk.gtk_page_setup_set_right_margin
import org.gtkkn.native.gtk.gtk_page_setup_set_top_margin
import org.gtkkn.native.gtk.gtk_page_setup_to_file
import org.gtkkn.native.gtk.gtk_page_setup_to_gvariant
import org.gtkkn.native.gtk.gtk_page_setup_to_key_file
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Throws

/**
 * A `GtkPageSetup` object stores the page size, orientation and margins.
 *
 * The idea is that you can get one of these from the page setup dialog
 * and then pass it to the `GtkPrintOperation` when printing.
 * The benefit of splitting this out of the `GtkPrintSettings` is that
 * these affect the actual layout of the page, and thus need to be set
 * long before user prints.
 *
 * ## Margins
 *
 * The margins specified in this object are the “print margins”, i.e. the
 * parts of the page that the printer cannot print on. These are different
 * from the layout margins that a word processor uses; they are typically
 * used to determine the minimal size for the layout margins.
 *
 * To obtain a `GtkPageSetup` use [ctor@Gtk.PageSetup.new] to get the defaults,
 * or use [func@Gtk.print_run_page_setup_dialog] to show the page setup dialog
 * and receive the resulting page setup.
 *
 * ## A page setup dialog
 *
 * ```c
 * static GtkPrintSettings *settings = NULL;
 * static GtkPageSetup *page_setup = NULL;
 *
 * static void
 * do_page_setup (void)
 * {
 *   GtkPageSetup *new_page_setup;
 *
 *   if (settings == NULL)
 *     settings = gtk_print_settings_new ();
 *
 *   new_page_setup = gtk_print_run_page_setup_dialog (GTK_WINDOW (main_window),
 *                                                     page_setup, settings);
 *
 *   if (page_setup)
 *     g_object_unref (page_setup);
 *
 *   page_setup = new_page_setup;
 * }
 * ```
 */
public open class PageSetup(public val gtkPageSetupPointer: CPointer<GtkPageSetup>) :
    Object(gtkPageSetupPointer.reinterpret()),
    KGTyped {
    /**
     * Creates a new `GtkPageSetup`.
     *
     * @return a new `GtkPageSetup`.
     */
    public constructor() : this(gtk_page_setup_new()!!.reinterpret())

    /**
     * Reads the page setup from the file @file_name.
     *
     * Returns a new `GtkPageSetup` object with the restored
     * page setup, or null if an error occurred.
     * See [method@Gtk.PageSetup.to_file].
     *
     * @param fileName the filename to read the page setup from
     * @return the restored `GtkPageSetup`
     */
    @Throws(GLibException::class)
    public constructor(fileName: String) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gtk_page_setup_new_from_file(fileName, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Desrialize a page setup from an a{sv} variant.
     *
     * The variant must be in the format produced by
     * [method@Gtk.PageSetup.to_gvariant].
     *
     * @param variant an a{sv} `GVariant`
     * @return a new `GtkPageSetup` object
     */
    public constructor(
        variant: Variant,
    ) : this(gtk_page_setup_new_from_gvariant(variant.glibVariantPointer)!!.reinterpret())

    /**
     * Reads the page setup from the group @group_name in the key file
     * @key_file.
     *
     * Returns a new `GtkPageSetup` object with the restored
     * page setup, or null if an error occurred.
     *
     * @param keyFile the `GKeyFile` to retrieve the page_setup from
     * @param groupName the name of the group in the key_file to read
     *    to use the default name “Page Setup”
     * @return the restored `GtkPageSetup`
     */
    @Throws(GLibException::class)
    public constructor(keyFile: KeyFile, groupName: String? = null) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gtk_page_setup_new_from_key_file(keyFile.glibKeyFilePointer, groupName, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Copies a `GtkPageSetup`.
     *
     * @return a copy of @other
     */
    public open fun copy(): PageSetup = gtk_page_setup_copy(gtkPageSetupPointer)!!.run {
        PageSetup(this)
    }

    /**
     * Gets the bottom margin in units of @unit.
     *
     * @param unit the unit for the return value
     * @return the bottom margin
     */
    public open fun getBottomMargin(unit: Unit): gdouble =
        gtk_page_setup_get_bottom_margin(gtkPageSetupPointer, unit.nativeValue)

    /**
     * Gets the left margin in units of @unit.
     *
     * @param unit the unit for the return value
     * @return the left margin
     */
    public open fun getLeftMargin(unit: Unit): gdouble =
        gtk_page_setup_get_left_margin(gtkPageSetupPointer, unit.nativeValue)

    /**
     * Gets the page orientation of the `GtkPageSetup`.
     *
     * @return the page orientation
     */
    public open fun getOrientation(): PageOrientation = gtk_page_setup_get_orientation(gtkPageSetupPointer).run {
        PageOrientation.fromNativeValue(this)
    }

    /**
     * Returns the page height in units of @unit.
     *
     * Note that this function takes orientation
     * and margins into consideration.
     * See [method@Gtk.PageSetup.get_paper_height].
     *
     * @param unit the unit for the return value
     * @return the page height.
     */
    public open fun getPageHeight(unit: Unit): gdouble =
        gtk_page_setup_get_page_height(gtkPageSetupPointer, unit.nativeValue)

    /**
     * Returns the page width in units of @unit.
     *
     * Note that this function takes orientation
     * and margins into consideration.
     * See [method@Gtk.PageSetup.get_paper_width].
     *
     * @param unit the unit for the return value
     * @return the page width.
     */
    public open fun getPageWidth(unit: Unit): gdouble =
        gtk_page_setup_get_page_width(gtkPageSetupPointer, unit.nativeValue)

    /**
     * Returns the paper height in units of @unit.
     *
     * Note that this function takes orientation,
     * but not margins into consideration.
     * See [method@Gtk.PageSetup.get_page_height].
     *
     * @param unit the unit for the return value
     * @return the paper height.
     */
    public open fun getPaperHeight(unit: Unit): gdouble =
        gtk_page_setup_get_paper_height(gtkPageSetupPointer, unit.nativeValue)

    /**
     * Gets the paper size of the `GtkPageSetup`.
     *
     * @return the paper size
     */
    public open fun getPaperSize(): PaperSize = gtk_page_setup_get_paper_size(gtkPageSetupPointer)!!.run {
        PaperSize(this)
    }

    /**
     * Returns the paper width in units of @unit.
     *
     * Note that this function takes orientation,
     * but not margins into consideration.
     * See [method@Gtk.PageSetup.get_page_width].
     *
     * @param unit the unit for the return value
     * @return the paper width.
     */
    public open fun getPaperWidth(unit: Unit): gdouble =
        gtk_page_setup_get_paper_width(gtkPageSetupPointer, unit.nativeValue)

    /**
     * Gets the right margin in units of @unit.
     *
     * @param unit the unit for the return value
     * @return the right margin
     */
    public open fun getRightMargin(unit: Unit): gdouble =
        gtk_page_setup_get_right_margin(gtkPageSetupPointer, unit.nativeValue)

    /**
     * Gets the top margin in units of @unit.
     *
     * @param unit the unit for the return value
     * @return the top margin
     */
    public open fun getTopMargin(unit: Unit): gdouble =
        gtk_page_setup_get_top_margin(gtkPageSetupPointer, unit.nativeValue)

    /**
     * Reads the page setup from the file @file_name.
     *
     * See [method@Gtk.PageSetup.to_file].
     *
     * @param fileName the filename to read the page setup from
     * @return true on success
     */
    public open fun loadFile(fileName: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_page_setup_load_file(gtkPageSetupPointer, fileName, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Reads the page setup from the group @group_name in the key file
     * @key_file.
     *
     * @param keyFile the `GKeyFile` to retrieve the page_setup from
     * @param groupName the name of the group in the key_file to read
     *   to use the default name “Page Setup”
     * @return true on success
     */
    public open fun loadKeyFile(keyFile: KeyFile, groupName: String? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_page_setup_load_key_file(
            gtkPageSetupPointer,
            keyFile.glibKeyFilePointer,
            groupName,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Sets the bottom margin of the `GtkPageSetup`.
     *
     * @param margin the new bottom margin in units of @unit
     * @param unit the units for @margin
     */
    public open fun setBottomMargin(margin: gdouble, unit: Unit): kotlin.Unit =
        gtk_page_setup_set_bottom_margin(gtkPageSetupPointer, margin, unit.nativeValue)

    /**
     * Sets the left margin of the `GtkPageSetup`.
     *
     * @param margin the new left margin in units of @unit
     * @param unit the units for @margin
     */
    public open fun setLeftMargin(margin: gdouble, unit: Unit): kotlin.Unit =
        gtk_page_setup_set_left_margin(gtkPageSetupPointer, margin, unit.nativeValue)

    /**
     * Sets the page orientation of the `GtkPageSetup`.
     *
     * @param orientation a `GtkPageOrientation` value
     */
    public open fun setOrientation(orientation: PageOrientation): kotlin.Unit =
        gtk_page_setup_set_orientation(gtkPageSetupPointer, orientation.nativeValue)

    /**
     * Sets the paper size of the `GtkPageSetup` without
     * changing the margins.
     *
     * See [method@Gtk.PageSetup.set_paper_size_and_default_margins].
     *
     * @param size a `GtkPaperSize`
     */
    public open fun setPaperSize(size: PaperSize): kotlin.Unit =
        gtk_page_setup_set_paper_size(gtkPageSetupPointer, size.gtkPaperSizePointer)

    /**
     * Sets the paper size of the `GtkPageSetup` and modifies
     * the margins according to the new paper size.
     *
     * @param size a `GtkPaperSize`
     */
    public open fun setPaperSizeAndDefaultMargins(size: PaperSize): kotlin.Unit =
        gtk_page_setup_set_paper_size_and_default_margins(gtkPageSetupPointer, size.gtkPaperSizePointer)

    /**
     * Sets the right margin of the `GtkPageSetup`.
     *
     * @param margin the new right margin in units of @unit
     * @param unit the units for @margin
     */
    public open fun setRightMargin(margin: gdouble, unit: Unit): kotlin.Unit =
        gtk_page_setup_set_right_margin(gtkPageSetupPointer, margin, unit.nativeValue)

    /**
     * Sets the top margin of the `GtkPageSetup`.
     *
     * @param margin the new top margin in units of @unit
     * @param unit the units for @margin
     */
    public open fun setTopMargin(margin: gdouble, unit: Unit): kotlin.Unit =
        gtk_page_setup_set_top_margin(gtkPageSetupPointer, margin, unit.nativeValue)

    /**
     * This function saves the information from @setup to @file_name.
     *
     * @param fileName the file to save to
     * @return true on success
     */
    public open fun toFile(fileName: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_page_setup_to_file(gtkPageSetupPointer, fileName, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Serialize page setup to an a{sv} variant.
     *
     * @return a new, floating, `GVariant`
     */
    public open fun toGvariant(): Variant = gtk_page_setup_to_gvariant(gtkPageSetupPointer)!!.run {
        Variant(this)
    }

    /**
     * This function adds the page setup from @setup to @key_file.
     *
     * @param keyFile the `GKeyFile` to save the page setup to
     * @param groupName the group to add the settings to in @key_file,
     *   or null to use the default name “Page Setup”
     */
    public open fun toKeyFile(keyFile: KeyFile, groupName: String? = null): kotlin.Unit =
        gtk_page_setup_to_key_file(gtkPageSetupPointer, keyFile.glibKeyFilePointer, groupName)

    public companion object : TypeCompanion<PageSetup> {
        override val type: GeneratedClassKGType<PageSetup> =
            GeneratedClassKGType(gtk_page_setup_get_type()) { PageSetup(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of PageSetup
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_page_setup_get_type()
    }
}
