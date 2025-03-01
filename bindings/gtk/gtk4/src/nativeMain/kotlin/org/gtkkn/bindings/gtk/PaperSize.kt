// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import kotlinx.cinterop.`value`
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.KeyFile
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPaperSize
import org.gtkkn.native.gtk.gtk_paper_size_copy
import org.gtkkn.native.gtk.gtk_paper_size_free
import org.gtkkn.native.gtk.gtk_paper_size_get_default
import org.gtkkn.native.gtk.gtk_paper_size_get_default_bottom_margin
import org.gtkkn.native.gtk.gtk_paper_size_get_default_left_margin
import org.gtkkn.native.gtk.gtk_paper_size_get_default_right_margin
import org.gtkkn.native.gtk.gtk_paper_size_get_default_top_margin
import org.gtkkn.native.gtk.gtk_paper_size_get_display_name
import org.gtkkn.native.gtk.gtk_paper_size_get_height
import org.gtkkn.native.gtk.gtk_paper_size_get_name
import org.gtkkn.native.gtk.gtk_paper_size_get_paper_sizes
import org.gtkkn.native.gtk.gtk_paper_size_get_ppd_name
import org.gtkkn.native.gtk.gtk_paper_size_get_type
import org.gtkkn.native.gtk.gtk_paper_size_get_width
import org.gtkkn.native.gtk.gtk_paper_size_is_custom
import org.gtkkn.native.gtk.gtk_paper_size_is_equal
import org.gtkkn.native.gtk.gtk_paper_size_is_ipp
import org.gtkkn.native.gtk.gtk_paper_size_new
import org.gtkkn.native.gtk.gtk_paper_size_new_custom
import org.gtkkn.native.gtk.gtk_paper_size_new_from_gvariant
import org.gtkkn.native.gtk.gtk_paper_size_new_from_ipp
import org.gtkkn.native.gtk.gtk_paper_size_new_from_key_file
import org.gtkkn.native.gtk.gtk_paper_size_new_from_ppd
import org.gtkkn.native.gtk.gtk_paper_size_set_size
import org.gtkkn.native.gtk.gtk_paper_size_to_gvariant
import org.gtkkn.native.gtk.gtk_paper_size_to_key_file
import kotlin.Boolean
import kotlin.String
import kotlin.Throws

/**
 * `GtkPaperSize` handles paper sizes.
 *
 * It uses the standard called
 * [PWG 5101.1-2002 PWG: Standard for Media Standardized Names](http://www.pwg.org/standards.html)
 * to name the paper sizes (and to get the data for the page sizes).
 * In addition to standard paper sizes, `GtkPaperSize` allows to
 * construct custom paper sizes with arbitrary dimensions.
 *
 * The `GtkPaperSize` object stores not only the dimensions (width
 * and height) of a paper size and its name, it also provides
 * default print margins.
 */
public class PaperSize(public val gtkPaperSizePointer: CPointer<GtkPaperSize>) : ProxyInstance(gtkPaperSizePointer) {
    /**
     * Creates a new `GtkPaperSize` object by parsing a
     * [PWG 5101.1-2002](ftp://ftp.pwg.org/pub/pwg/candidates/cs-pwgmsn10-20020226-5101.1.pdf)
     * paper name.
     *
     * If @name is null, the default paper size is returned,
     * see [func@Gtk.PaperSize.get_default].
     *
     * @param name a paper size name
     * @return a new `GtkPaperSize`, use [method@Gtk.PaperSize.free]
     * to free it
     */
    public constructor(name: String? = null) : this(gtk_paper_size_new(name)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Creates a new `GtkPaperSize` object with the
     * given parameters.
     *
     * @param name the paper name
     * @param displayName the human-readable name
     * @param width the paper width, in units of @unit
     * @param height the paper height, in units of @unit
     * @param unit the unit for @width and @height. not %GTK_UNIT_NONE.
     * @return a new `GtkPaperSize` object, use [method@Gtk.PaperSize.free]
     * to free it
     */
    public constructor(
        name: String,
        displayName: String,
        width: gdouble,
        height: gdouble,
        unit: Unit,
    ) : this(gtk_paper_size_new_custom(name, displayName, width, height, unit.nativeValue)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Deserialize a paper size from a `GVariant`.
     *
     * The `GVariant must be in the format produced by
     * [method@Gtk.PaperSize.to_gvariant].
     *
     * @param variant an a{sv} `GVariant`
     * @return a new `GtkPaperSize` object
     */
    public constructor(variant: Variant) : this(gtk_paper_size_new_from_gvariant(variant.glibVariantPointer)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Creates a new `GtkPaperSize` object by using
     * IPP information.
     *
     * If @ipp_name is not a recognized paper name,
     * @width and @height are used to
     * construct a custom `GtkPaperSize` object.
     *
     * @param ippName an IPP paper name
     * @param width the paper width, in points
     * @param height the paper height in points
     * @return a new `GtkPaperSize`, use [method@Gtk.PaperSize.free]
     * to free it
     */
    public constructor(
        ippName: String,
        width: gdouble,
        height: gdouble,
    ) : this(gtk_paper_size_new_from_ipp(ippName, width, height)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Reads a paper size from the group @group_name in the key file
     * @key_file.
     *
     * @param keyFile the `GKeyFile` to retrieve the papersize from
     * @param groupName the name of the group in the key file to read,
     *   or null to read the first group
     * @return a new `GtkPaperSize` object with the restored paper size
     */
    @Throws(GLibException::class)
    public constructor(keyFile: KeyFile, groupName: String? = null) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult = gtk_paper_size_new_from_key_file(keyFile.glibKeyFilePointer, groupName, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!
        }
    ) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Creates a new `GtkPaperSize` object by using
     * PPD information.
     *
     * If @ppd_name is not a recognized PPD paper name,
     * @ppd_display_name, @width and @height are used to
     * construct a custom `GtkPaperSize` object.
     *
     * @param ppdName a PPD paper name
     * @param ppdDisplayName the corresponding human-readable name
     * @param width the paper width, in points
     * @param height the paper height in points
     * @return a new `GtkPaperSize`, use [method@Gtk.PaperSize.free]
     * to free it
     */
    public constructor(
        ppdName: String,
        ppdDisplayName: String,
        width: gdouble,
        height: gdouble,
    ) : this(gtk_paper_size_new_from_ppd(ppdName, ppdDisplayName, width, height)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Copies an existing `GtkPaperSize`.
     *
     * @return a copy of @other
     */
    public fun copy(): PaperSize = gtk_paper_size_copy(gtkPaperSizePointer)!!.run {
        PaperSize(this)
    }

    /**
     * Free the given `GtkPaperSize` object.
     */
    public fun free(): kotlin.Unit = gtk_paper_size_free(gtkPaperSizePointer)

    /**
     * Gets the default bottom margin for the `GtkPaperSize`.
     *
     * @param unit the unit for the return value, not %GTK_UNIT_NONE
     * @return the default bottom margin
     */
    public fun getDefaultBottomMargin(unit: Unit): gdouble =
        gtk_paper_size_get_default_bottom_margin(gtkPaperSizePointer, unit.nativeValue)

    /**
     * Gets the default left margin for the `GtkPaperSize`.
     *
     * @param unit the unit for the return value, not %GTK_UNIT_NONE
     * @return the default left margin
     */
    public fun getDefaultLeftMargin(unit: Unit): gdouble =
        gtk_paper_size_get_default_left_margin(gtkPaperSizePointer, unit.nativeValue)

    /**
     * Gets the default right margin for the `GtkPaperSize`.
     *
     * @param unit the unit for the return value, not %GTK_UNIT_NONE
     * @return the default right margin
     */
    public fun getDefaultRightMargin(unit: Unit): gdouble =
        gtk_paper_size_get_default_right_margin(gtkPaperSizePointer, unit.nativeValue)

    /**
     * Gets the default top margin for the `GtkPaperSize`.
     *
     * @param unit the unit for the return value, not %GTK_UNIT_NONE
     * @return the default top margin
     */
    public fun getDefaultTopMargin(unit: Unit): gdouble =
        gtk_paper_size_get_default_top_margin(gtkPaperSizePointer, unit.nativeValue)

    /**
     * Gets the human-readable name of the `GtkPaperSize`.
     *
     * @return the human-readable name of @size
     */
    public fun getDisplayName(): String =
        gtk_paper_size_get_display_name(gtkPaperSizePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the paper height of the `GtkPaperSize`, in
     * units of @unit.
     *
     * @param unit the unit for the return value, not %GTK_UNIT_NONE
     * @return the paper height
     */
    public fun getHeight(unit: Unit): gdouble = gtk_paper_size_get_height(gtkPaperSizePointer, unit.nativeValue)

    /**
     * Gets the name of the `GtkPaperSize`.
     *
     * @return the name of @size
     */
    public fun getName(): String =
        gtk_paper_size_get_name(gtkPaperSizePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the PPD name of the `GtkPaperSize`, which
     * may be null.
     *
     * @return the PPD name of @size
     */
    public fun getPpdName(): String =
        gtk_paper_size_get_ppd_name(gtkPaperSizePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the paper width of the `GtkPaperSize`, in
     * units of @unit.
     *
     * @param unit the unit for the return value, not %GTK_UNIT_NONE
     * @return the paper width
     */
    public fun getWidth(unit: Unit): gdouble = gtk_paper_size_get_width(gtkPaperSizePointer, unit.nativeValue)

    /**
     * Returns true if @size is not a standard paper size.
     *
     * @return whether @size is a custom paper size.
     */
    public fun isCustom(): Boolean = gtk_paper_size_is_custom(gtkPaperSizePointer).asBoolean()

    /**
     * Compares two `GtkPaperSize` objects.
     *
     * @param size2 another `GtkPaperSize` object
     * @return true, if @size1 and @size2
     * represent the same paper size
     */
    public fun isEqual(size2: PaperSize): Boolean =
        gtk_paper_size_is_equal(gtkPaperSizePointer, size2.gtkPaperSizePointer).asBoolean()

    /**
     * Returns true if @size is an IPP standard paper size.
     *
     * @return whether @size is not an IPP custom paper size.
     */
    public fun isIpp(): Boolean = gtk_paper_size_is_ipp(gtkPaperSizePointer).asBoolean()

    /**
     * Changes the dimensions of a @size to @width x @height.
     *
     * @param width the new width in units of @unit
     * @param height the new height in units of @unit
     * @param unit the unit for @width and @height
     */
    public fun setSize(width: gdouble, height: gdouble, unit: Unit): kotlin.Unit =
        gtk_paper_size_set_size(gtkPaperSizePointer, width, height, unit.nativeValue)

    /**
     * Serialize a paper size to an `a{sv}` variant.
     *
     * @return a new, floating, `GVariant`
     */
    public fun toGvariant(): Variant = gtk_paper_size_to_gvariant(gtkPaperSizePointer)!!.run {
        Variant(this)
    }

    /**
     * This function adds the paper size from @size to @key_file.
     *
     * @param keyFile the `GKeyFile` to save the paper size to
     * @param groupName the group to add the settings to in @key_file
     */
    public fun toKeyFile(keyFile: KeyFile, groupName: String): kotlin.Unit =
        gtk_paper_size_to_key_file(gtkPaperSizePointer, keyFile.glibKeyFilePointer, groupName)

    public companion object {
        /**
         * Returns the name of the default paper size, which
         * depends on the current locale.
         *
         * @return the name of the default paper size. The string
         * is owned by GTK and should not be modified.
         */
        public fun getDefault(): String = gtk_paper_size_get_default()?.toKString() ?: error("Expected not null string")

        /**
         * Creates a list of known paper sizes.
         *
         * @param includeCustom whether to include custom paper sizes
         *   as defined in the page setup dialog
         * @return a newly allocated list of newly
         *    allocated `GtkPaperSize` objects
         */
        public fun getPaperSizes(includeCustom: Boolean): List =
            gtk_paper_size_get_paper_sizes(includeCustom.asGBoolean())!!.run {
                List(this)
            }

        /**
         * Get the GType of PaperSize
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_paper_size_get_type()
    }
}
