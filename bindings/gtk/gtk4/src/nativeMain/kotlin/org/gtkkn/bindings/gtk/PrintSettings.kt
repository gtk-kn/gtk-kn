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
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
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
import kotlin.Double
import kotlin.Int
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
 * - parameter `page_ranges`: PageRange
 */
public open class PrintSettings(
    pointer: CPointer<GtkPrintSettings>,
) : Object(pointer.reinterpret()),
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
    @Throws(GlibException::class)
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
    public constructor(
        variant: Variant,
    ) : this(gtk_print_settings_new_from_gvariant(variant.glibVariantPointer.reinterpret())!!.reinterpret())

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
    @Throws(GlibException::class)
    public constructor(keyFile: KeyFile, groupName: String? = null) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gtk_print_settings_new_from_key_file(keyFile.glibKeyFilePointer.reinterpret(), groupName, gError.ptr)
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
    public open fun copy(): PrintSettings =
        gtk_print_settings_copy(gtkPrintSettingsPointer.reinterpret())!!.run {
            PrintSettings(reinterpret())
        }

    /**
     * Calls @func for each key-value pair of @settings.
     *
     * @param func the function to call
     */
    public open fun foreach(func: PrintSettingsFunc): kotlin.Unit =
        gtk_print_settings_foreach(
            gtkPrintSettingsPointer.reinterpret(),
            PrintSettingsFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

    /**
     * Looks up the string value associated with @key.
     *
     * @param key a key
     * @return the string value for @key
     */
    public open fun `get`(key: String): String? =
        gtk_print_settings_get(gtkPrintSettingsPointer.reinterpret(), key)?.toKString()

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
        gtk_print_settings_get_bool(gtkPrintSettingsPointer.reinterpret(), key).asBoolean()

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_COLLATE.
     *
     * @return whether to collate the printed pages
     */
    public open fun getCollate(): Boolean =
        gtk_print_settings_get_collate(gtkPrintSettingsPointer.reinterpret()).asBoolean()

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
     *
     * @return the default source
     */
    public open fun getDefaultSource(): String? =
        gtk_print_settings_get_default_source(gtkPrintSettingsPointer.reinterpret())?.toKString()

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_DITHER.
     *
     * @return the dithering that is used
     */
    public open fun getDither(): String? =
        gtk_print_settings_get_dither(gtkPrintSettingsPointer.reinterpret())?.toKString()

    /**
     * Returns the double value associated with @key, or 0.
     *
     * @param key a key
     * @return the double value of @key
     */
    public open fun getDouble(key: String): Double =
        gtk_print_settings_get_double(gtkPrintSettingsPointer.reinterpret(), key)

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
    public open fun getDoubleWithDefault(
        key: String,
        def: Double,
    ): Double = gtk_print_settings_get_double_with_default(gtkPrintSettingsPointer.reinterpret(), key, def)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_DUPLEX.
     *
     * @return whether to print the output in duplex.
     */
    public open fun getDuplex(): PrintDuplex =
        gtk_print_settings_get_duplex(gtkPrintSettingsPointer.reinterpret()).run {
            PrintDuplex.fromNativeValue(this)
        }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
     *
     * @return the finishings
     */
    public open fun getFinishings(): String? =
        gtk_print_settings_get_finishings(gtkPrintSettingsPointer.reinterpret())?.toKString()

    /**
     * Returns the integer value of @key, or 0.
     *
     * @param key a key
     * @return the integer value of @key
     */
    public open fun getInt(key: String): Int = gtk_print_settings_get_int(gtkPrintSettingsPointer.reinterpret(), key)

    /**
     * Returns the value of @key, interpreted as
     * an integer, or the default value.
     *
     * @param key a key
     * @param def the default value
     * @return the integer value of @key
     */
    public open fun getIntWithDefault(
        key: String,
        def: Int,
    ): Int = gtk_print_settings_get_int_with_default(gtkPrintSettingsPointer.reinterpret(), key, def)

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
    public open fun getLength(
        key: String,
        unit: Unit,
    ): Double = gtk_print_settings_get_length(gtkPrintSettingsPointer.reinterpret(), key, unit.nativeValue)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
     *
     * The set of media types is defined in PWG 5101.1-2002 PWG.
     *
     * @return the media type
     */
    public open fun getMediaType(): String? =
        gtk_print_settings_get_media_type(gtkPrintSettingsPointer.reinterpret())?.toKString()

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_N_COPIES.
     *
     * @return the number of copies to print
     */
    public open fun getNCopies(): Int = gtk_print_settings_get_n_copies(gtkPrintSettingsPointer.reinterpret())

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_NUMBER_UP.
     *
     * @return the number of pages per sheet
     */
    public open fun getNumberUp(): Int = gtk_print_settings_get_number_up(gtkPrintSettingsPointer.reinterpret())

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT.
     *
     * @return layout of page in number-up mode
     */
    public open fun getNumberUpLayout(): NumberUpLayout =
        gtk_print_settings_get_number_up_layout(gtkPrintSettingsPointer.reinterpret()).run {
            NumberUpLayout.fromNativeValue(this)
        }

    /**
     * Get the value of %GTK_PRINT_SETTINGS_ORIENTATION,
     * converted to a `GtkPageOrientation`.
     *
     * @return the orientation
     */
    public open fun getOrientation(): PageOrientation =
        gtk_print_settings_get_orientation(gtkPrintSettingsPointer.reinterpret()).run {
            PageOrientation.fromNativeValue(this)
        }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
     *
     * @return the output bin
     */
    public open fun getOutputBin(): String? =
        gtk_print_settings_get_output_bin(gtkPrintSettingsPointer.reinterpret())?.toKString()

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAGE_SET.
     *
     * @return the set of pages to print
     */
    public open fun getPageSet(): PageSet =
        gtk_print_settings_get_page_set(gtkPrintSettingsPointer.reinterpret()).run {
            PageSet.fromNativeValue(this)
        }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAPER_HEIGHT,
     * converted to @unit.
     *
     * @param unit the unit for the return value
     * @return the paper height, in units of @unit
     */
    public open fun getPaperHeight(unit: Unit): Double =
        gtk_print_settings_get_paper_height(gtkPrintSettingsPointer.reinterpret(), unit.nativeValue)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAPER_FORMAT,
     * converted to a `GtkPaperSize`.
     *
     * @return the paper size
     */
    public open fun getPaperSize(): PaperSize? =
        gtk_print_settings_get_paper_size(gtkPrintSettingsPointer.reinterpret())?.run {
            PaperSize(reinterpret())
        }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAPER_WIDTH,
     * converted to @unit.
     *
     * @param unit the unit for the return value
     * @return the paper width, in units of @unit
     */
    public open fun getPaperWidth(unit: Unit): Double =
        gtk_print_settings_get_paper_width(gtkPrintSettingsPointer.reinterpret(), unit.nativeValue)

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PRINT_PAGES.
     *
     * @return which pages to print
     */
    public open fun getPrintPages(): PrintPages =
        gtk_print_settings_get_print_pages(gtkPrintSettingsPointer.reinterpret()).run {
            PrintPages.fromNativeValue(this)
        }

    /**
     * Convenience function to obtain the value of
     * %GTK_PRINT_SETTINGS_PRINTER.
     *
     * @return the printer name
     */
    public open fun getPrinter(): String? =
        gtk_print_settings_get_printer(gtkPrintSettingsPointer.reinterpret())?.toKString()

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PRINTER_LPI.
     *
     * @return the resolution in lpi (lines per inch)
     */
    public open fun getPrinterLpi(): Double = gtk_print_settings_get_printer_lpi(gtkPrintSettingsPointer.reinterpret())

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_QUALITY.
     *
     * @return the print quality
     */
    public open fun getQuality(): PrintQuality =
        gtk_print_settings_get_quality(gtkPrintSettingsPointer.reinterpret()).run {
            PrintQuality.fromNativeValue(this)
        }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION.
     *
     * @return the resolution in dpi
     */
    public open fun getResolution(): Int = gtk_print_settings_get_resolution(gtkPrintSettingsPointer.reinterpret())

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION_X.
     *
     * @return the horizontal resolution in dpi
     */
    public open fun getResolutionX(): Int = gtk_print_settings_get_resolution_x(gtkPrintSettingsPointer.reinterpret())

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION_Y.
     *
     * @return the vertical resolution in dpi
     */
    public open fun getResolutionY(): Int = gtk_print_settings_get_resolution_y(gtkPrintSettingsPointer.reinterpret())

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_REVERSE.
     *
     * @return whether to reverse the order of the printed pages
     */
    public open fun getReverse(): Boolean =
        gtk_print_settings_get_reverse(gtkPrintSettingsPointer.reinterpret()).asBoolean()

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_SCALE.
     *
     * @return the scale in percent
     */
    public open fun getScale(): Double = gtk_print_settings_get_scale(gtkPrintSettingsPointer.reinterpret())

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_USE_COLOR.
     *
     * @return whether to use color
     */
    public open fun getUseColor(): Boolean =
        gtk_print_settings_get_use_color(gtkPrintSettingsPointer.reinterpret()).asBoolean()

    /**
     * Returns true, if a value is associated with @key.
     *
     * @param key a key
     * @return true, if @key has a value
     */
    public open fun hasKey(key: String): Boolean =
        gtk_print_settings_has_key(gtkPrintSettingsPointer.reinterpret(), key).asBoolean()

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
    public open fun loadFile(fileName: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gtk_print_settings_load_file(
                    gtkPrintSettingsPointer.reinterpret(),
                    fileName,
                    gError.ptr
                ).asBoolean()
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
    public open fun loadKeyFile(
        keyFile: KeyFile,
        groupName: String? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gtk_print_settings_load_key_file(
                    gtkPrintSettingsPointer.reinterpret(),
                    keyFile.glibKeyFilePointer.reinterpret(),
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
    public open fun `set`(
        key: String,
        `value`: String? = null,
    ): kotlin.Unit = gtk_print_settings_set(gtkPrintSettingsPointer.reinterpret(), key, `value`)

    /**
     * Sets @key to a boolean value.
     *
     * @param key a key
     * @param value a boolean
     */
    public open fun setBool(
        key: String,
        `value`: Boolean,
    ): kotlin.Unit = gtk_print_settings_set_bool(gtkPrintSettingsPointer.reinterpret(), key, `value`.asGBoolean())

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_COLLATE.
     *
     * @param collate whether to collate the output
     */
    public open fun setCollate(collate: Boolean): kotlin.Unit =
        gtk_print_settings_set_collate(gtkPrintSettingsPointer.reinterpret(), collate.asGBoolean())

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
     *
     * @param defaultSource the default source
     */
    public open fun setDefaultSource(defaultSource: String): kotlin.Unit =
        gtk_print_settings_set_default_source(gtkPrintSettingsPointer.reinterpret(), defaultSource)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_DITHER.
     *
     * @param dither the dithering that is used
     */
    public open fun setDither(dither: String): kotlin.Unit =
        gtk_print_settings_set_dither(gtkPrintSettingsPointer.reinterpret(), dither)

    /**
     * Sets @key to a double value.
     *
     * @param key a key
     * @param value a double value
     */
    public open fun setDouble(
        key: String,
        `value`: Double,
    ): kotlin.Unit = gtk_print_settings_set_double(gtkPrintSettingsPointer.reinterpret(), key, `value`)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_DUPLEX.
     *
     * @param duplex a `GtkPrintDuplex` value
     */
    public open fun setDuplex(duplex: PrintDuplex): kotlin.Unit =
        gtk_print_settings_set_duplex(gtkPrintSettingsPointer.reinterpret(), duplex.nativeValue)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
     *
     * @param finishings the finishings
     */
    public open fun setFinishings(finishings: String): kotlin.Unit =
        gtk_print_settings_set_finishings(gtkPrintSettingsPointer.reinterpret(), finishings)

    /**
     * Sets @key to an integer value.
     *
     * @param key a key
     * @param value an integer
     */
    public open fun setInt(
        key: String,
        `value`: Int,
    ): kotlin.Unit = gtk_print_settings_set_int(gtkPrintSettingsPointer.reinterpret(), key, `value`)

    /**
     * Associates a length in units of @unit with @key.
     *
     * @param key a key
     * @param value a length
     * @param unit the unit of @length
     */
    public open fun setLength(
        key: String,
        `value`: Double,
        unit: Unit,
    ): kotlin.Unit =
        gtk_print_settings_set_length(gtkPrintSettingsPointer.reinterpret(), key, `value`, unit.nativeValue)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
     *
     * The set of media types is defined in PWG 5101.1-2002 PWG.
     *
     * @param mediaType the media type
     */
    public open fun setMediaType(mediaType: String): kotlin.Unit =
        gtk_print_settings_set_media_type(gtkPrintSettingsPointer.reinterpret(), mediaType)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_N_COPIES.
     *
     * @param numCopies the number of copies
     */
    public open fun setNCopies(numCopies: Int): kotlin.Unit =
        gtk_print_settings_set_n_copies(gtkPrintSettingsPointer.reinterpret(), numCopies)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_NUMBER_UP.
     *
     * @param numberUp the number of pages per sheet
     */
    public open fun setNumberUp(numberUp: Int): kotlin.Unit =
        gtk_print_settings_set_number_up(gtkPrintSettingsPointer.reinterpret(), numberUp)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT.
     *
     * @param numberUpLayout a `GtkNumberUpLayout` value
     */
    public open fun setNumberUpLayout(numberUpLayout: NumberUpLayout): kotlin.Unit =
        gtk_print_settings_set_number_up_layout(gtkPrintSettingsPointer.reinterpret(), numberUpLayout.nativeValue)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_ORIENTATION.
     *
     * @param orientation a page orientation
     */
    public open fun setOrientation(orientation: PageOrientation): kotlin.Unit =
        gtk_print_settings_set_orientation(gtkPrintSettingsPointer.reinterpret(), orientation.nativeValue)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
     *
     * @param outputBin the output bin
     */
    public open fun setOutputBin(outputBin: String): kotlin.Unit =
        gtk_print_settings_set_output_bin(gtkPrintSettingsPointer.reinterpret(), outputBin)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAGE_SET.
     *
     * @param pageSet a `GtkPageSet` value
     */
    public open fun setPageSet(pageSet: PageSet): kotlin.Unit =
        gtk_print_settings_set_page_set(gtkPrintSettingsPointer.reinterpret(), pageSet.nativeValue)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAPER_HEIGHT.
     *
     * @param height the paper height
     * @param unit the units of @height
     */
    public open fun setPaperHeight(
        height: Double,
        unit: Unit,
    ): kotlin.Unit =
        gtk_print_settings_set_paper_height(gtkPrintSettingsPointer.reinterpret(), height, unit.nativeValue)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAPER_FORMAT,
     * %GTK_PRINT_SETTINGS_PAPER_WIDTH and
     * %GTK_PRINT_SETTINGS_PAPER_HEIGHT.
     *
     * @param paperSize a paper size
     */
    public open fun setPaperSize(paperSize: PaperSize): kotlin.Unit =
        gtk_print_settings_set_paper_size(
            gtkPrintSettingsPointer.reinterpret(),
            paperSize.gtkPaperSizePointer.reinterpret()
        )

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAPER_WIDTH.
     *
     * @param width the paper width
     * @param unit the units of @width
     */
    public open fun setPaperWidth(
        width: Double,
        unit: Unit,
    ): kotlin.Unit = gtk_print_settings_set_paper_width(gtkPrintSettingsPointer.reinterpret(), width, unit.nativeValue)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PRINT_PAGES.
     *
     * @param pages a `GtkPrintPages` value
     */
    public open fun setPrintPages(pages: PrintPages): kotlin.Unit =
        gtk_print_settings_set_print_pages(gtkPrintSettingsPointer.reinterpret(), pages.nativeValue)

    /**
     * Convenience function to set %GTK_PRINT_SETTINGS_PRINTER
     * to @printer.
     *
     * @param printer the printer name
     */
    public open fun setPrinter(printer: String): kotlin.Unit =
        gtk_print_settings_set_printer(gtkPrintSettingsPointer.reinterpret(), printer)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PRINTER_LPI.
     *
     * @param lpi the resolution in lpi (lines per inch)
     */
    public open fun setPrinterLpi(lpi: Double): kotlin.Unit =
        gtk_print_settings_set_printer_lpi(gtkPrintSettingsPointer.reinterpret(), lpi)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_QUALITY.
     *
     * @param quality a `GtkPrintQuality` value
     */
    public open fun setQuality(quality: PrintQuality): kotlin.Unit =
        gtk_print_settings_set_quality(gtkPrintSettingsPointer.reinterpret(), quality.nativeValue)

    /**
     * Sets the values of %GTK_PRINT_SETTINGS_RESOLUTION,
     * %GTK_PRINT_SETTINGS_RESOLUTION_X and
     * %GTK_PRINT_SETTINGS_RESOLUTION_Y.
     *
     * @param resolution the resolution in dpi
     */
    public open fun setResolution(resolution: Int): kotlin.Unit =
        gtk_print_settings_set_resolution(gtkPrintSettingsPointer.reinterpret(), resolution)

    /**
     * Sets the values of %GTK_PRINT_SETTINGS_RESOLUTION,
     * %GTK_PRINT_SETTINGS_RESOLUTION_X and
     * %GTK_PRINT_SETTINGS_RESOLUTION_Y.
     *
     * @param resolutionX the horizontal resolution in dpi
     * @param resolutionY the vertical resolution in dpi
     */
    public open fun setResolutionXy(
        resolutionX: Int,
        resolutionY: Int,
    ): kotlin.Unit =
        gtk_print_settings_set_resolution_xy(gtkPrintSettingsPointer.reinterpret(), resolutionX, resolutionY)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_REVERSE.
     *
     * @param reverse whether to reverse the output
     */
    public open fun setReverse(reverse: Boolean): kotlin.Unit =
        gtk_print_settings_set_reverse(gtkPrintSettingsPointer.reinterpret(), reverse.asGBoolean())

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_SCALE.
     *
     * @param scale the scale in percent
     */
    public open fun setScale(scale: Double): kotlin.Unit =
        gtk_print_settings_set_scale(gtkPrintSettingsPointer.reinterpret(), scale)

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_USE_COLOR.
     *
     * @param useColor whether to use color
     */
    public open fun setUseColor(useColor: Boolean): kotlin.Unit =
        gtk_print_settings_set_use_color(gtkPrintSettingsPointer.reinterpret(), useColor.asGBoolean())

    /**
     * This function saves the print settings from @settings to @file_name.
     *
     * If the file could not be written then error is set to either a
     * `GFileError` or `GKeyFileError`.
     *
     * @param fileName the file to save to
     * @return true on success
     */
    public open fun toFile(fileName: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gtk_print_settings_to_file(
                    gtkPrintSettingsPointer.reinterpret(),
                    fileName,
                    gError.ptr
                ).asBoolean()
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
    public open fun toGvariant(): Variant =
        gtk_print_settings_to_gvariant(gtkPrintSettingsPointer.reinterpret())!!.run {
            Variant(reinterpret())
        }

    /**
     * This function adds the print settings from @settings to @key_file.
     *
     * @param keyFile the `GKeyFile` to save the print settings to
     * @param groupName the group to add the settings to in @key_file, or
     *   null to use the default “Print Settings”
     */
    public open fun toKeyFile(
        keyFile: KeyFile,
        groupName: String? = null,
    ): kotlin.Unit =
        gtk_print_settings_to_key_file(
            gtkPrintSettingsPointer.reinterpret(),
            keyFile.glibKeyFilePointer.reinterpret(),
            groupName
        )

    /**
     * Removes any value associated with @key.
     *
     * This has the same effect as setting the value to null.
     *
     * @param key a key
     */
    public open fun unset(key: String): kotlin.Unit =
        gtk_print_settings_unset(gtkPrintSettingsPointer.reinterpret(), key)

    public companion object : TypeCompanion<PrintSettings> {
        override val type: GeneratedClassKGType<PrintSettings> =
            GeneratedClassKGType(gtk_print_settings_get_type()) { PrintSettings(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
