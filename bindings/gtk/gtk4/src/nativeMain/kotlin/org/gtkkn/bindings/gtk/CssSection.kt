// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_16
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkCssSection
import org.gtkkn.native.gtk.gtk_css_section_get_bytes
import org.gtkkn.native.gtk.gtk_css_section_get_end_location
import org.gtkkn.native.gtk.gtk_css_section_get_file
import org.gtkkn.native.gtk.gtk_css_section_get_parent
import org.gtkkn.native.gtk.gtk_css_section_get_start_location
import org.gtkkn.native.gtk.gtk_css_section_get_type
import org.gtkkn.native.gtk.gtk_css_section_new
import org.gtkkn.native.gtk.gtk_css_section_new_with_bytes
import org.gtkkn.native.gtk.gtk_css_section_print
import org.gtkkn.native.gtk.gtk_css_section_ref
import org.gtkkn.native.gtk.gtk_css_section_to_string
import org.gtkkn.native.gtk.gtk_css_section_unref
import kotlin.Unit
import kotlin.String as KotlinString
import org.gtkkn.bindings.glib.String as GlibString

/**
 * Defines a part of a CSS document.
 *
 * Because sections are nested into one another, you can use
 * [method@CssSection.get_parent] to get the containing region.
 */
public class CssSection(public val gtkCssSectionPointer: CPointer<GtkCssSection>) :
    ProxyInstance(gtkCssSectionPointer) {
    /**
     * Creates a new `GtkCssSection` referring to the section
     * in the given `file` from the `start` location to the
     * `end` location.
     *
     * @param file The file this section refers to
     * @param start The start location
     * @param end The end location
     * @return a new `GtkCssSection`
     */
    public constructor(
        `file`: File? = null,
        start: CssLocation,
        end: CssLocation,
    ) : this(gtk_css_section_new(`file`?.gioFilePointer, start.gtkCssLocationPointer, end.gtkCssLocationPointer)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Creates a new `GtkCssSection` referring to the section
     * in the given `file` or the given `bytes` from the `start` location to the
     * `end` location.
     *
     * @param file The file this section refers to
     * @param bytes The bytes this sections refers to
     * @param start The start location
     * @param end The end location
     * @return a new `GtkCssSection`
     * @since 4.16
     */
    public constructor(
        `file`: File? = null,
        bytes: Bytes? = null,
        start: CssLocation,
        end: CssLocation,
    ) : this(
        gtk_css_section_new_with_bytes(
            `file`?.gioFilePointer,
            bytes?.glibBytesPointer,
            start.gtkCssLocationPointer,
            end.gtkCssLocationPointer
        )!!
    ) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Gets the bytes that @section was parsed from.
     *
     * @return the `GBytes` from which the `section`
     *   was parsed
     * @since 4.16
     */
    @GtkVersion4_16
    public fun getBytes(): Bytes? = gtk_css_section_get_bytes(gtkCssSectionPointer)?.run {
        Bytes(this)
    }

    /**
     * Returns the location in the CSS document where this section ends.
     *
     * @return The end location of
     *   this section
     */
    public fun getEndLocation(): CssLocation = gtk_css_section_get_end_location(gtkCssSectionPointer)!!.run {
        CssLocation(this)
    }

    /**
     * Gets the file that @section was parsed from.
     *
     * If no such file exists, for example because the CSS was loaded via
     * [method@Gtk.CssProvider.load_from_data], then `NULL` is returned.
     *
     * @return the `GFile` from which the `section`
     *   was parsed
     */
    public fun getFile(): File? = gtk_css_section_get_file(gtkCssSectionPointer)?.run {
        File.FileImpl(reinterpret())
    }

    /**
     * Gets the parent section for the given `section`.
     *
     * The parent section is the section that contains this `section`. A special
     * case are sections of  type `GTK_CSS_SECTION_DOCUMEN`T. Their parent will
     * either be `NULL` if they are the original CSS document that was loaded by
     * [method@Gtk.CssProvider.load_from_file] or a section of type
     * `GTK_CSS_SECTION_IMPORT` if it was loaded with an `@import` rule from
     * a different file.
     *
     * @return the parent section
     */
    public fun getParent(): CssSection? = gtk_css_section_get_parent(gtkCssSectionPointer)?.run {
        CssSection(this)
    }

    /**
     * Returns the location in the CSS document where this section starts.
     *
     * @return The start location of
     *   this section
     */
    public fun getStartLocation(): CssLocation = gtk_css_section_get_start_location(gtkCssSectionPointer)!!.run {
        CssLocation(this)
    }

    /**
     * Prints the `section` into `string` in a human-readable form.
     *
     * This is a form like `gtk.css:32:1-23` to denote line 32, characters
     * 1 to 23 in the file `gtk.css`.
     *
     * @param string a `GString` to print to
     */
    public fun print(string: GlibString): Unit = gtk_css_section_print(gtkCssSectionPointer, string.glibStringPointer)

    /**
     * Increments the reference count on `section`.
     *
     * @return the CSS section itself.
     */
    public fun ref(): CssSection = gtk_css_section_ref(gtkCssSectionPointer)!!.run {
        CssSection(this)
    }

    /**
     * Prints the section into a human-readable text form using
     * [method@Gtk.CssSection.print].
     *
     * @return A new string.
     */
    override fun toString(): KotlinString =
        gtk_css_section_to_string(gtkCssSectionPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Decrements the reference count on `section`, freeing the
     * structure if the reference count reaches 0.
     */
    public fun unref(): Unit = gtk_css_section_unref(gtkCssSectionPointer)

    public companion object {
        /**
         * Get the GType of CssSection
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_css_section_get_type()
    }
}
