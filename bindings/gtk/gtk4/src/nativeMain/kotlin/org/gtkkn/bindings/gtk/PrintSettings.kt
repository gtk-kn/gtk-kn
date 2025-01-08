// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.KeyFile
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPrintSettings
import org.gtkkn.native.gtk.gtk_print_settings_copy
import org.gtkkn.native.gtk.gtk_print_settings_foreach
import org.gtkkn.native.gtk.gtk_print_settings_get
import org.gtkkn.native.gtk.gtk_print_settings_get_bool
import org.gtkkn.native.gtk.gtk_print_settings_get_collate
import org.gtkkn.native.gtk.gtk_print_settings_get_default_source
import org.gtkkn.native.gtk.gtk_print_settings_get_dither
import org.gtkkn.native.gtk.gtk_print_settings_get_double
import org.gtkkn.native.gtk.gtk_print_settings_get_double_with_default
import org.gtkkn.native.gtk.gtk_print_settings_get_duplex
import org.gtkkn.native.gtk.gtk_print_settings_get_finishings
import org.gtkkn.native.gtk.gtk_print_settings_get_int
import org.gtkkn.native.gtk.gtk_print_settings_get_int_with_default
import org.gtkkn.native.gtk.gtk_print_settings_get_length
import org.gtkkn.native.gtk.gtk_print_settings_get_media_type
import org.gtkkn.native.gtk.gtk_print_settings_get_n_copies
import org.gtkkn.native.gtk.gtk_print_settings_get_number_up
import org.gtkkn.native.gtk.gtk_print_settings_get_number_up_layout
import org.gtkkn.native.gtk.gtk_print_settings_get_orientation
import org.gtkkn.native.gtk.gtk_print_settings_get_output_bin
import org.gtkkn.native.gtk.gtk_print_settings_get_page_set
import org.gtkkn.native.gtk.gtk_print_settings_get_paper_height
import org.gtkkn.native.gtk.gtk_print_settings_get_paper_size
import org.gtkkn.native.gtk.gtk_print_settings_get_paper_width
import org.gtkkn.native.gtk.gtk_print_settings_get_print_pages
import org.gtkkn.native.gtk.gtk_print_settings_get_printer
import org.gtkkn.native.gtk.gtk_print_settings_get_printer_lpi
import org.gtkkn.native.gtk.gtk_print_settings_get_quality
import org.gtkkn.native.gtk.gtk_print_settings_get_resolution
import org.gtkkn.native.gtk.gtk_print_settings_get_resolution_x
import org.gtkkn.native.gtk.gtk_print_settings_get_resolution_y
import org.gtkkn.native.gtk.gtk_print_settings_get_reverse
import org.gtkkn.native.gtk.gtk_print_settings_get_scale
import org.gtkkn.native.gtk.gtk_print_settings_get_type
import org.gtkkn.native.gtk.gtk_print_settings_get_use_color
import org.gtkkn.native.gtk.gtk_print_settings_has_key
import org.gtkkn.native.gtk.gtk_print_settings_load_file
import org.gtkkn.native.gtk.gtk_print_settings_load_key_file
import org.gtkkn.native.gtk.gtk_print_settings_new
import org.gtkkn.native.gtk.gtk_print_settings_new_from_file
import org.gtkkn.native.gtk.gtk_print_settings_new_from_gvariant
import org.gtkkn.native.gtk.gtk_print_settings_new_from_key_file
import org.gtkkn.native.gtk.gtk_print_settings_set
import org.gtkkn.native.gtk.gtk_print_settings_set_bool
import org.gtkkn.native.gtk.gtk_print_settings_set_collate
import org.gtkkn.native.gtk.gtk_print_settings_set_default_source
import org.gtkkn.native.gtk.gtk_print_settings_set_dither
import org.gtkkn.native.gtk.gtk_print_settings_set_double
import org.gtkkn.native.gtk.gtk_print_settings_set_duplex
import org.gtkkn.native.gtk.gtk_print_settings_set_finishings
import org.gtkkn.native.gtk.gtk_print_settings_set_int
import org.gtkkn.native.gtk.gtk_print_settings_set_length
import org.gtkkn.native.gtk.gtk_print_settings_set_media_type
import org.gtkkn.native.gtk.gtk_print_settings_set_n_copies
import org.gtkkn.native.gtk.gtk_print_settings_set_number_up
import org.gtkkn.native.gtk.gtk_print_settings_set_number_up_layout
import org.gtkkn.native.gtk.gtk_print_settings_set_orientation
import org.gtkkn.native.gtk.gtk_print_settings_set_output_bin
import org.gtkkn.native.gtk.gtk_print_settings_set_page_set
import org.gtkkn.native.gtk.gtk_print_settings_set_paper_height
import org.gtkkn.native.gtk.gtk_print_settings_set_paper_size
import org.gtkkn.native.gtk.gtk_print_settings_set_paper_width
import org.gtkkn.native.gtk.gtk_print_settings_set_print_pages
import org.gtkkn.native.gtk.gtk_print_settings_set_printer
import org.gtkkn.native.gtk.gtk_print_settings_set_printer_lpi
import org.gtkkn.native.gtk.gtk_print_settings_set_quality
import org.gtkkn.native.gtk.gtk_print_settings_set_resolution
import org.gtkkn.native.gtk.gtk_print_settings_set_resolution_xy
import org.gtkkn.native.gtk.gtk_print_settings_set_reverse
import org.gtkkn.native.gtk.gtk_print_settings_set_scale
import org.gtkkn.native.gtk.gtk_print_settings_set_use_color
import org.gtkkn.native.gtk.gtk_print_settings_to_file
import org.gtkkn.native.gtk.gtk_print_settings_to_gvariant
import org.gtkkn.native.gtk.gtk_print_settings_to_key_file
import org.gtkkn.native.gtk.gtk_print_settings_unset
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Throws

/**
 * A `GtkPrintSettings` object represents the settings of a print dialog in
 * a system-independent way.
 *
 * The main use for this object is that once you’ve printed you can get a
 * settings object that represents the settings the user chose, and the next
 * time you print you can pass that object in so that the user doesn’t have
 * to re-set all his settings.
 *
 * Its also possible to enumerate the settings so that you can easily save
 * the settings for the next time your app runs, or even store them in a
 * document. The predefined keys try to use shared values as much as possible
 * so that moving such a document between systems still works.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `num_ranges`: num_ranges: Out parameter is not supported
 * - parameter `page_ranges`: Array parameter of type PageRange is not supported
 */
public open class PrintSettings(pointer: CPointer<GtkPrintSettings>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtkPrintSettingsPointer: CPointer<GtkPrintSettings>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkPrintSettings` object.
     *
     * @return a new `GtkPrintSettings` object
     */
    public constructor() : this(gtk_print_settings_new()!!.reinterpret())

    /**
     * Reads the print settings from @file_name.
     *
     * Returns a new `GtkPrintSettings` object with the restored settings,
     * or null if an error occurred. If the file could not be loaded then
     * error is set to either a `GFileError` or `GKeyFileError`.
     *
     * See [method@Gtk.PrintSettings.to_file].
     *
     * @param fileName the filename to read the settings from
     * @return the restored `GtkPrintSettings`
     */
    @Throws(GLibException::class)
    public constructor(fileName: String) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gtk_print_settings_new_from_file(fileName, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Deserialize print settings from an a{sv} variant.
     *
     * The variant must be in the format produced by
     * [method@Gtk.PrintSettings.to_gvariant].
     *
     * @param variant an a{sv} `GVariant`
     * @return a new `GtkPrintSettings` object
     */
    public constructor(variant: Variant) : this(gtk_print_settings_new_from_gvariant(variant.gPointer)!!.reinterpret())

    /**
     * Reads the print settings from the group @group_name in @key_file.
     *
     * Returns a new `GtkPrintSettings` object with the restored settings,
     * or null if an error occurred. If the file could not be loaded then
     * error is set to either `GFileError` or `GKeyFileError`.
     *
     * @param keyFile the `GKeyFile` to retrieve the settings from
     * @param groupName the name of the group to use, or null to use
     *   the default “Print Settings”
     * @return the restored `GtkPrintSettings`
     */
    @Throws(GLibException::class)
    public constructor(keyFile: KeyFile, groupName: String? = null) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gtk_print_settings_new_from_key_file(keyFile.gPointer, groupName, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Copies a `GtkPrintSettings` object.
     *
     * @return a newly allocated copy of @other
     */
    public open fun copy(): PrintSettings = gtk_print_settings_copy(gtkPrintSettingsPointer)!!.run {
        PrintSettings(this)
    }

    /**
     * Calls @func for each key-value pair of @settings.
     *
     * @param func the function to call
     */
    public open fun foreach(func: PrintSettingsFunc): kotlin.Unit = gtk_print_settings_foreach(
        gtkPrintSettingsPointer,
        PrintSettingsFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Looks up the string value associated with @key.
     *
     * @param key a key
     * @return the string value for @key
     */
    public open fun `get`(key: String): String? = gtk_print_settings_get(gtkPrintSettingsPointer, key)?.toKString()

    /**
     * Returns the boolean represented by the value
     * that is associated with @key.
     *
     * The string “true” represents true, any other
     * string false.
     *
     * @param key a key
     * @return true, if @key maps to a true value.
     */
    public open fun getBool(key: String): Boolean =
        gtk_print_settings_get_bool(gtkPrintSettingsPointer, key).asBoolean()

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_COLLATE.
     *
     * @return whether to collate the printed pages
     */
    public open fun getCollate(): Boolean = gtk_print_settings_get_collate(gtkPrintSettingsPointer).asBoolean()

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
     *
     * @return the default source
     */
    public open fun getDefaultSource(): String? =
        gtk_print_settings_get_default_source(gtkPrintSettingsPointer)?.toKString()

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_DITHER.
     *
     * @return the dithering that is used
     */
    public open fun getDither(): String? = gtk_print_settings_get_dither(gtkPrintSettingsPointer)?.toKString()

    /**
     * Returns the double value associated with @key, or 0.
     *
     * @param key a key
     * @return the double value of @key
     */
    public open fun getDouble(key: String): gdouble = gtk_print_settings_get_double(gtkPrintSettingsPointer, key)

    /**
     * Returns the floating point number represented by
     * the value that is associated with @key, or @default_val
     * if the value does not represent a floating point number.
     *
     * Floating point numbers are parsed with g_ascii_strtod().
     *
     * @param key a key
     * @param def the default value
     * @return the floating point number associated with @key
     */
    public open fun getDoubleWithDefault(key: String, def: gdouble): gdouble =
        gtk_print_settings_get_double_with_default(gtkPrintSettingsPointer, key, def)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_DUPLEX.
     *
     * @return whether to print the output in duplex.
     */
    public open fun getDuplex(): PrintDuplex = gtk_print_settings_get_duplex(gtkPrintSettingsPointer).run {
        PrintDuplex.fromNativeValue(this)
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
     *
     * @return the finishings
     */
    public open fun getFinishings(): String? = gtk_print_settings_get_finishings(gtkPrintSettingsPointer)?.toKString()

    /**
     * Returns the integer value of @key, or 0.
     *
     * @param key a key
     * @return the integer value of @key
     */
    public open fun getInt(key: String): gint = gtk_print_settings_get_int(gtkPrintSettingsPointer, key)

    /**
     * Returns the value of @key, interpreted as
     * an integer, or the default value.
     *
     * @param key a key
     * @param def the default value
     * @return the integer value of @key
     */
    public open fun getIntWithDefault(key: String, def: gint): gint =
        gtk_print_settings_get_int_with_default(gtkPrintSettingsPointer, key, def)

    /**
     * Returns the value associated with @key, interpreted
     * as a length.
     *
     * The returned value is converted to @units.
     *
     * @param key a key
     * @param unit the unit of the return value
     * @return the length value of @key, converted to @unit
     */
    public open fun getLength(key: String, unit: Unit): gdouble =
        gtk_print_settings_get_length(gtkPrintSettingsPointer, key, unit.nativeValue)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
     *
     * The set of media types is defined in PWG 5101.1-2002 PWG.
     *
     * @return the media type
     */
    public open fun getMediaType(): String? = gtk_print_settings_get_media_type(gtkPrintSettingsPointer)?.toKString()

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_N_COPIES.
     *
     * @return the number of copies to print
     */
    public open fun getNCopies(): gint = gtk_print_settings_get_n_copies(gtkPrintSettingsPointer)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_NUMBER_UP.
     *
     * @return the number of pages per sheet
     */
    public open fun getNumberUp(): gint = gtk_print_settings_get_number_up(gtkPrintSettingsPointer)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT.
     *
     * @return layout of page in number-up mode
     */
    public open fun getNumberUpLayout(): NumberUpLayout =
        gtk_print_settings_get_number_up_layout(gtkPrintSettingsPointer).run {
            NumberUpLayout.fromNativeValue(this)
        }

    /**
     * Get the value of %GTK_PRINT_SETTINGS_ORIENTATION,
     * converted to a `GtkPageOrientation`.
     *
     * @return the orientation
     */
    public open fun getOrientation(): PageOrientation =
        gtk_print_settings_get_orientation(gtkPrintSettingsPointer).run {
            PageOrientation.fromNativeValue(this)
        }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
     *
     * @return the output bin
     */
    public open fun getOutputBin(): String? = gtk_print_settings_get_output_bin(gtkPrintSettingsPointer)?.toKString()

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAGE_SET.
     *
     * @return the set of pages to print
     */
    public open fun getPageSet(): PageSet = gtk_print_settings_get_page_set(gtkPrintSettingsPointer).run {
        PageSet.fromNativeValue(this)
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAPER_HEIGHT,
     * converted to @unit.
     *
     * @param unit the unit for the return value
     * @return the paper height, in units of @unit
     */
    public open fun getPaperHeight(unit: Unit): gdouble =
        gtk_print_settings_get_paper_height(gtkPrintSettingsPointer, unit.nativeValue)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAPER_FORMAT,
     * converted to a `GtkPaperSize`.
     *
     * @return the paper size
     */
    public open fun getPaperSize(): PaperSize? = gtk_print_settings_get_paper_size(gtkPrintSettingsPointer)?.run {
        PaperSize(this)
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAPER_WIDTH,
     * converted to @unit.
     *
     * @param unit the unit for the return value
     * @return the paper width, in units of @unit
     */
    public open fun getPaperWidth(unit: Unit): gdouble =
        gtk_print_settings_get_paper_width(gtkPrintSettingsPointer, unit.nativeValue)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PRINT_PAGES.
     *
     * @return which pages to print
     */
    public open fun getPrintPages(): PrintPages = gtk_print_settings_get_print_pages(gtkPrintSettingsPointer).run {
        PrintPages.fromNativeValue(this)
    }

    /**
     * Convenience function to obtain the value of
     * %GTK_PRINT_SETTINGS_PRINTER.
     *
     * @return the printer name
     */
    public open fun getPrinter(): String? = gtk_print_settings_get_printer(gtkPrintSettingsPointer)?.toKString()

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PRINTER_LPI.
     *
     * @return the resolution in lpi (lines per inch)
     */
    public open fun getPrinterLpi(): gdouble = gtk_print_settings_get_printer_lpi(gtkPrintSettingsPointer)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_QUALITY.
     *
     * @return the print quality
     */
    public open fun getQuality(): PrintQuality = gtk_print_settings_get_quality(gtkPrintSettingsPointer).run {
        PrintQuality.fromNativeValue(this)
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION.
     *
     * @return the resolution in dpi
     */
    public open fun getResolution(): gint = gtk_print_settings_get_resolution(gtkPrintSettingsPointer)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION_X.
     *
     * @return the horizontal resolution in dpi
     */
    public open fun getResolutionX(): gint = gtk_print_settings_get_resolution_x(gtkPrintSettingsPointer)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION_Y.
     *
     * @return the vertical resolution in dpi
     */
    public open fun getResolutionY(): gint = gtk_print_settings_get_resolution_y(gtkPrintSettingsPointer)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_REVERSE.
     *
     * @return whether to reverse the order of the printed pages
     */
    public open fun getReverse(): Boolean = gtk_print_settings_get_reverse(gtkPrintSettingsPointer).asBoolean()

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_SCALE.
     *
     * @return the scale in percent
     */
    public open fun getScale(): gdouble = gtk_print_settings_get_scale(gtkPrintSettingsPointer)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_USE_COLOR.
     *
     * @return whether to use color
     */
    public open fun getUseColor(): Boolean = gtk_print_settings_get_use_color(gtkPrintSettingsPointer).asBoolean()

    /**
     * Returns true, if a value is associated with @key.
     *
     * @param key a key
     * @return true, if @key has a value
     */
    public open fun hasKey(key: String): Boolean = gtk_print_settings_has_key(gtkPrintSettingsPointer, key).asBoolean()

    /**
     * Reads the print settings from @file_name.
     *
     * If the file could not be loaded then error is set to either
     * a `GFileError` or `GKeyFileError`.
     *
     * See [method@Gtk.PrintSettings.to_file].
     *
     * @param fileName the filename to read the settings from
     * @return true on success
     */
    public open fun loadFile(fileName: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_print_settings_load_file(gtkPrintSettingsPointer, fileName, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Reads the print settings from the group @group_name in @key_file.
     *
     * If the file could not be loaded then error is set to either a
     * `GFileError` or `GKeyFileError`.
     *
     * @param keyFile the `GKeyFile` to retrieve the settings from
     * @param groupName the name of the group to use, or null
     *   to use the default “Print Settings”
     * @return true on success
     */
    public open fun loadKeyFile(keyFile: KeyFile, groupName: String? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_print_settings_load_key_file(
            gtkPrintSettingsPointer,
            keyFile.gPointer,
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
     * Associates @value with @key.
     *
     * @param key a key
     * @param value a string value
     */
    public open fun `set`(key: String, `value`: String? = null): kotlin.Unit =
        gtk_print_settings_set(gtkPrintSettingsPointer, key, `value`)

    /**
     * Sets @key to a boolean value.
     *
     * @param key a key
     * @param value a boolean
     */
    public open fun setBool(key: String, `value`: Boolean): kotlin.Unit =
        gtk_print_settings_set_bool(gtkPrintSettingsPointer, key, `value`.asGBoolean())

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_COLLATE.
     *
     * @param collate whether to collate the output
     */
    public open fun setCollate(collate: Boolean): kotlin.Unit =
        gtk_print_settings_set_collate(gtkPrintSettingsPointer, collate.asGBoolean())

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
     *
     * @param defaultSource the default source
     */
    public open fun setDefaultSource(defaultSource: String): kotlin.Unit =
        gtk_print_settings_set_default_source(gtkPrintSettingsPointer, defaultSource)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_DITHER.
     *
     * @param dither the dithering that is used
     */
    public open fun setDither(dither: String): kotlin.Unit =
        gtk_print_settings_set_dither(gtkPrintSettingsPointer, dither)

    /**
     * Sets @key to a double value.
     *
     * @param key a key
     * @param value a double value
     */
    public open fun setDouble(key: String, `value`: gdouble): kotlin.Unit =
        gtk_print_settings_set_double(gtkPrintSettingsPointer, key, `value`)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_DUPLEX.
     *
     * @param duplex a `GtkPrintDuplex` value
     */
    public open fun setDuplex(duplex: PrintDuplex): kotlin.Unit =
        gtk_print_settings_set_duplex(gtkPrintSettingsPointer, duplex.nativeValue)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
     *
     * @param finishings the finishings
     */
    public open fun setFinishings(finishings: String): kotlin.Unit =
        gtk_print_settings_set_finishings(gtkPrintSettingsPointer, finishings)

    /**
     * Sets @key to an integer value.
     *
     * @param key a key
     * @param value an integer
     */
    public open fun setInt(key: String, `value`: gint): kotlin.Unit =
        gtk_print_settings_set_int(gtkPrintSettingsPointer, key, `value`)

    /**
     * Associates a length in units of @unit with @key.
     *
     * @param key a key
     * @param value a length
     * @param unit the unit of @length
     */
    public open fun setLength(key: String, `value`: gdouble, unit: Unit): kotlin.Unit =
        gtk_print_settings_set_length(gtkPrintSettingsPointer, key, `value`, unit.nativeValue)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
     *
     * The set of media types is defined in PWG 5101.1-2002 PWG.
     *
     * @param mediaType the media type
     */
    public open fun setMediaType(mediaType: String): kotlin.Unit =
        gtk_print_settings_set_media_type(gtkPrintSettingsPointer, mediaType)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_N_COPIES.
     *
     * @param numCopies the number of copies
     */
    public open fun setNCopies(numCopies: gint): kotlin.Unit =
        gtk_print_settings_set_n_copies(gtkPrintSettingsPointer, numCopies)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_NUMBER_UP.
     *
     * @param numberUp the number of pages per sheet
     */
    public open fun setNumberUp(numberUp: gint): kotlin.Unit =
        gtk_print_settings_set_number_up(gtkPrintSettingsPointer, numberUp)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT.
     *
     * @param numberUpLayout a `GtkNumberUpLayout` value
     */
    public open fun setNumberUpLayout(numberUpLayout: NumberUpLayout): kotlin.Unit =
        gtk_print_settings_set_number_up_layout(gtkPrintSettingsPointer, numberUpLayout.nativeValue)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_ORIENTATION.
     *
     * @param orientation a page orientation
     */
    public open fun setOrientation(orientation: PageOrientation): kotlin.Unit =
        gtk_print_settings_set_orientation(gtkPrintSettingsPointer, orientation.nativeValue)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
     *
     * @param outputBin the output bin
     */
    public open fun setOutputBin(outputBin: String): kotlin.Unit =
        gtk_print_settings_set_output_bin(gtkPrintSettingsPointer, outputBin)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAGE_SET.
     *
     * @param pageSet a `GtkPageSet` value
     */
    public open fun setPageSet(pageSet: PageSet): kotlin.Unit =
        gtk_print_settings_set_page_set(gtkPrintSettingsPointer, pageSet.nativeValue)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAPER_HEIGHT.
     *
     * @param height the paper height
     * @param unit the units of @height
     */
    public open fun setPaperHeight(height: gdouble, unit: Unit): kotlin.Unit =
        gtk_print_settings_set_paper_height(gtkPrintSettingsPointer, height, unit.nativeValue)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAPER_FORMAT,
     * %GTK_PRINT_SETTINGS_PAPER_WIDTH and
     * %GTK_PRINT_SETTINGS_PAPER_HEIGHT.
     *
     * @param paperSize a paper size
     */
    public open fun setPaperSize(paperSize: PaperSize): kotlin.Unit =
        gtk_print_settings_set_paper_size(gtkPrintSettingsPointer, paperSize.gPointer)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAPER_WIDTH.
     *
     * @param width the paper width
     * @param unit the units of @width
     */
    public open fun setPaperWidth(width: gdouble, unit: Unit): kotlin.Unit =
        gtk_print_settings_set_paper_width(gtkPrintSettingsPointer, width, unit.nativeValue)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PRINT_PAGES.
     *
     * @param pages a `GtkPrintPages` value
     */
    public open fun setPrintPages(pages: PrintPages): kotlin.Unit =
        gtk_print_settings_set_print_pages(gtkPrintSettingsPointer, pages.nativeValue)

    /**
     * Convenience function to set %GTK_PRINT_SETTINGS_PRINTER
     * to @printer.
     *
     * @param printer the printer name
     */
    public open fun setPrinter(printer: String): kotlin.Unit =
        gtk_print_settings_set_printer(gtkPrintSettingsPointer, printer)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PRINTER_LPI.
     *
     * @param lpi the resolution in lpi (lines per inch)
     */
    public open fun setPrinterLpi(lpi: gdouble): kotlin.Unit =
        gtk_print_settings_set_printer_lpi(gtkPrintSettingsPointer, lpi)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_QUALITY.
     *
     * @param quality a `GtkPrintQuality` value
     */
    public open fun setQuality(quality: PrintQuality): kotlin.Unit =
        gtk_print_settings_set_quality(gtkPrintSettingsPointer, quality.nativeValue)

    /**
     * Sets the values of %GTK_PRINT_SETTINGS_RESOLUTION,
     * %GTK_PRINT_SETTINGS_RESOLUTION_X and
     * %GTK_PRINT_SETTINGS_RESOLUTION_Y.
     *
     * @param resolution the resolution in dpi
     */
    public open fun setResolution(resolution: gint): kotlin.Unit =
        gtk_print_settings_set_resolution(gtkPrintSettingsPointer, resolution)

    /**
     * Sets the values of %GTK_PRINT_SETTINGS_RESOLUTION,
     * %GTK_PRINT_SETTINGS_RESOLUTION_X and
     * %GTK_PRINT_SETTINGS_RESOLUTION_Y.
     *
     * @param resolutionX the horizontal resolution in dpi
     * @param resolutionY the vertical resolution in dpi
     */
    public open fun setResolutionXy(resolutionX: gint, resolutionY: gint): kotlin.Unit =
        gtk_print_settings_set_resolution_xy(gtkPrintSettingsPointer, resolutionX, resolutionY)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_REVERSE.
     *
     * @param reverse whether to reverse the output
     */
    public open fun setReverse(reverse: Boolean): kotlin.Unit =
        gtk_print_settings_set_reverse(gtkPrintSettingsPointer, reverse.asGBoolean())

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_SCALE.
     *
     * @param scale the scale in percent
     */
    public open fun setScale(scale: gdouble): kotlin.Unit = gtk_print_settings_set_scale(gtkPrintSettingsPointer, scale)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_USE_COLOR.
     *
     * @param useColor whether to use color
     */
    public open fun setUseColor(useColor: Boolean): kotlin.Unit =
        gtk_print_settings_set_use_color(gtkPrintSettingsPointer, useColor.asGBoolean())

    /**
     * This function saves the print settings from @settings to @file_name.
     *
     * If the file could not be written then error is set to either a
     * `GFileError` or `GKeyFileError`.
     *
     * @param fileName the file to save to
     * @return true on success
     */
    public open fun toFile(fileName: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_print_settings_to_file(gtkPrintSettingsPointer, fileName, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Serialize print settings to an a{sv} variant.
     *
     * @return a new, floating, `GVariant`
     */
    public open fun toGvariant(): Variant = gtk_print_settings_to_gvariant(gtkPrintSettingsPointer)!!.run {
        Variant(this)
    }

    /**
     * This function adds the print settings from @settings to @key_file.
     *
     * @param keyFile the `GKeyFile` to save the print settings to
     * @param groupName the group to add the settings to in @key_file, or
     *   null to use the default “Print Settings”
     */
    public open fun toKeyFile(keyFile: KeyFile, groupName: String? = null): kotlin.Unit =
        gtk_print_settings_to_key_file(gtkPrintSettingsPointer, keyFile.gPointer, groupName)

    /**
     * Removes any value associated with @key.
     *
     * This has the same effect as setting the value to null.
     *
     * @param key a key
     */
    public open fun unset(key: String): kotlin.Unit = gtk_print_settings_unset(gtkPrintSettingsPointer, key)

    public companion object : TypeCompanion<PrintSettings> {
        override val type: GeneratedClassKGType<PrintSettings> =
            GeneratedClassKGType(gtk_print_settings_get_type()) { PrintSettings(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of PrintSettings
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_print_settings_get_type()
    }
}
