// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.glib.String
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtk.GtkCssSection
import org.gtkkn.native.gtk.gtk_css_section_get_end_location
import org.gtkkn.native.gtk.gtk_css_section_get_file
import org.gtkkn.native.gtk.gtk_css_section_get_parent
import org.gtkkn.native.gtk.gtk_css_section_get_start_location
import org.gtkkn.native.gtk.gtk_css_section_new
import org.gtkkn.native.gtk.gtk_css_section_print
import org.gtkkn.native.gtk.gtk_css_section_ref
import org.gtkkn.native.gtk.gtk_css_section_unref
import kotlin.Unit

/**
 * Defines a part of a CSS document.
 *
 * Because sections are nested into one another, you can use
 * [method@CssSection.get_parent] to get the containing region.
 *
 * ## Skipped during bindings generation
 *
 * - method `to_string`: C function gtk_css_section_to_string is ignored
 */
public class CssSection(
    pointer: CPointer<GtkCssSection>,
) : Record {
    public val gtkCssSectionPointer: CPointer<GtkCssSection> = pointer

    /**
     * Returns the location in the CSS document where this section ends.
     *
     * @return The end location of
     *   this section
     */
    public fun getEndLocation(): CssLocation =
        gtk_css_section_get_end_location(gtkCssSectionPointer.reinterpret())!!.run {
            CssLocation(reinterpret())
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
    public fun getFile(): File? =
        gtk_css_section_get_file(gtkCssSectionPointer.reinterpret())?.run {
            File.wrap(reinterpret())
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
    public fun getParent(): CssSection? =
        gtk_css_section_get_parent(gtkCssSectionPointer.reinterpret())?.run {
            CssSection(reinterpret())
        }

    /**
     * Returns the location in the CSS document where this section starts.
     *
     * @return The start location of
     *   this section
     */
    public fun getStartLocation(): CssLocation =
        gtk_css_section_get_start_location(gtkCssSectionPointer.reinterpret())!!.run {
            CssLocation(reinterpret())
        }

    /**
     * Prints the `section` into `string` in a human-readable form.
     *
     * This is a form like `gtk.css:32:1-23` to denote line 32, characters
     * 1 to 23 in the file `gtk.css`.
     *
     * @param string a `GString` to print to
     */
    public fun print(string: String): Unit =
        gtk_css_section_print(gtkCssSectionPointer.reinterpret(), string.glibStringPointer)

    /**
     * Increments the reference count on `section`.
     *
     * @return the CSS section itself.
     */
    public fun ref(): CssSection =
        gtk_css_section_ref(gtkCssSectionPointer.reinterpret())!!.run {
            CssSection(reinterpret())
        }

    /**
     * Decrements the reference count on `section`, freeing the
     * structure if the reference count reaches 0.
     */
    public fun unref(): Unit = gtk_css_section_unref(gtkCssSectionPointer.reinterpret())

    public companion object : RecordCompanion<CssSection, GtkCssSection> {
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
        public fun new(
            `file`: File? = null,
            start: CssLocation,
            end: CssLocation,
        ): CssSection =
            CssSection(
                gtk_css_section_new(
                    `file`?.gioFilePointer,
                    start.gtkCssLocationPointer,
                    end.gtkCssLocationPointer
                )!!.reinterpret()
            )

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): CssSection = CssSection(pointer.reinterpret())
    }
}
