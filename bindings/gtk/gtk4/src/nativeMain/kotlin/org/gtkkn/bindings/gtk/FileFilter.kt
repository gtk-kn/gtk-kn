// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_4
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkFileFilter
import org.gtkkn.native.gtk.gtk_file_filter_add_mime_type
import org.gtkkn.native.gtk.gtk_file_filter_add_pattern
import org.gtkkn.native.gtk.gtk_file_filter_add_pixbuf_formats
import org.gtkkn.native.gtk.gtk_file_filter_add_suffix
import org.gtkkn.native.gtk.gtk_file_filter_get_attributes
import org.gtkkn.native.gtk.gtk_file_filter_get_name
import org.gtkkn.native.gtk.gtk_file_filter_get_type
import org.gtkkn.native.gtk.gtk_file_filter_new
import org.gtkkn.native.gtk.gtk_file_filter_new_from_gvariant
import org.gtkkn.native.gtk.gtk_file_filter_set_name
import org.gtkkn.native.gtk.gtk_file_filter_to_gvariant
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * `GtkFileFilter` filters files by name or mime type.
 *
 * `GtkFileFilter` can be used to restrict the files being shown in a
 * `GtkFileChooser`. Files can be filtered based on their name (with
 * [method@Gtk.FileFilter.add_pattern] or [method@Gtk.FileFilter.add_suffix])
 * or on their mime type (with [method@Gtk.FileFilter.add_mime_type]).
 *
 * Filtering by mime types handles aliasing and subclassing of mime
 * types; e.g. a filter for text/plain also matches a file with mime
 * type application/rtf, since application/rtf is a subclass of
 * text/plain. Note that `GtkFileFilter` allows wildcards for the
 * subtype of a mime type, so you can e.g. filter for image/\*.
 *
 * Normally, file filters are used by adding them to a `GtkFileChooser`
 * (see [method@Gtk.FileChooser.add_filter]), but it is also possible to
 * manually use a file filter on any [class@Gtk.FilterListModel] containing
 * `GFileInfo` objects.
 *
 * # GtkFileFilter as GtkBuildable
 *
 * The `GtkFileFilter` implementation of the `GtkBuildable` interface
 * supports adding rules using the `<mime-types>` and `<patterns>` and
 * `<suffixes>` elements and listing the rules within. Specifying a
 * `<mime-type>` or `<pattern>` or `<suffix>` has the same effect as
 * as calling
 * [method@Gtk.FileFilter.add_mime_type] or
 * [method@Gtk.FileFilter.add_pattern] or
 * [method@Gtk.FileFilter.add_suffix].
 *
 * An example of a UI definition fragment specifying `GtkFileFilter`
 * rules:
 * ```xml
 * <object class="GtkFileFilter">
 *   <property name="name" translatable="yes">Text and Images</property>
 *   <mime-types>
 *     <mime-type>text/plain</mime-type>
 *     <mime-type>image/ *</mime-type>
 *   </mime-types>
 *   <patterns>
 *     <pattern>*.txt</pattern>
 *   </patterns>
 *   <suffixes>
 *     <suffix>png</suffix>
 *   </suffixes>
 * </object>
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `mime-types`: Property has no getter nor setter
 * - method `patterns`: Property has no getter nor setter
 * - method `suffixes`: Property has no getter nor setter
 */
public open class FileFilter(pointer: CPointer<GtkFileFilter>) :
    Filter(pointer.reinterpret()),
    Buildable,
    KGTyped {
    public val gtkFileFilterPointer: CPointer<GtkFileFilter>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    /**
     * The human-readable name of the filter.
     *
     * This is the string that will be displayed in the file chooser
     * user interface if there is a selectable list of filters.
     */
    public open var name: String?
        /**
         * Gets the human-readable name for the filter.
         *
         * See [method@Gtk.FileFilter.set_name].
         *
         * @return The human-readable name of the filter
         */
        get() = gtk_file_filter_get_name(gtkFileFilterPointer.reinterpret())?.toKString()

        /**
         * Sets a human-readable name of the filter.
         *
         * This is the string that will be displayed in the file chooser
         * if there is a selectable list of filters.
         *
         * @param name the human-readable-name for the filter, or null
         *   to remove any existing name.
         */
        set(name) = gtk_file_filter_set_name(gtkFileFilterPointer.reinterpret(), name)

    /**
     * Creates a new `GtkFileFilter` with no rules added to it.
     *
     * Such a filter doesn’t accept any files, so is not
     * particularly useful until you add rules with
     * [method@Gtk.FileFilter.add_mime_type],
     * [method@Gtk.FileFilter.add_pattern],
     * [method@Gtk.FileFilter.add_suffix] or
     * [method@Gtk.FileFilter.add_pixbuf_formats].
     *
     * To create a filter that accepts any file, use:
     * ```c
     * GtkFileFilter *filter = gtk_file_filter_new ();
     * gtk_file_filter_add_pattern (filter, "*");
     * ```
     *
     * @return a new `GtkFileFilter`
     */
    public constructor() : this(gtk_file_filter_new()!!.reinterpret())

    /**
     * Deserialize a file filter from a `GVariant`.
     *
     * The variant must be in the format produced by
     * [method@Gtk.FileFilter.to_gvariant].
     *
     * @param variant an `a{sv}` `GVariant`
     * @return a new `GtkFileFilter` object
     */
    public constructor(
        variant: Variant,
    ) : this(gtk_file_filter_new_from_gvariant(variant.glibVariantPointer.reinterpret())!!.reinterpret())

    /**
     * Adds a rule allowing a given mime type to @filter.
     *
     * @param mimeType name of a MIME type
     */
    public open fun addMimeType(mimeType: String): Unit =
        gtk_file_filter_add_mime_type(gtkFileFilterPointer.reinterpret(), mimeType)

    /**
     * Adds a rule allowing a shell style glob to a filter.
     *
     * Note that it depends on the platform whether pattern
     * matching ignores case or not. On Windows, it does, on
     * other platforms, it doesn't.
     *
     * @param pattern a shell style glob
     */
    public open fun addPattern(pattern: String): Unit =
        gtk_file_filter_add_pattern(gtkFileFilterPointer.reinterpret(), pattern)

    /**
     * Adds a rule allowing image files in the formats supported
     * by GdkPixbuf.
     *
     * This is equivalent to calling [method@Gtk.FileFilter.add_mime_type]
     * for all the supported mime types.
     */
    public open fun addPixbufFormats(): Unit = gtk_file_filter_add_pixbuf_formats(gtkFileFilterPointer.reinterpret())

    /**
     * Adds a suffix match rule to a filter.
     *
     * This is similar to adding a match for the pattern
     * "*.@suffix".
     *
     * In contrast to pattern matches, suffix matches
     * are *always* case-insensitive.
     *
     * @param suffix filename suffix to match
     * @since 4.4
     */
    @GtkVersion4_4
    public open fun addSuffix(suffix: String): Unit =
        gtk_file_filter_add_suffix(gtkFileFilterPointer.reinterpret(), suffix)

    /**
     * Gets the attributes that need to be filled in for the `GFileInfo`
     * passed to this filter.
     *
     * This function will not typically be used by applications;
     * it is intended principally for use in the implementation
     * of `GtkFileChooser`.
     *
     * @return the attributes
     */
    public open fun getAttributes(): List<String> =
        gtk_file_filter_get_attributes(gtkFileFilterPointer.reinterpret())?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Serialize a file filter to an `a{sv}` variant.
     *
     * @return a new, floating, `GVariant`
     */
    public open fun toGvariant(): Variant = gtk_file_filter_to_gvariant(gtkFileFilterPointer.reinterpret())!!.run {
        Variant(reinterpret())
    }

    public companion object : TypeCompanion<FileFilter> {
        override val type: GeneratedClassKGType<FileFilter> =
            GeneratedClassKGType(gtk_file_filter_get_type()) { FileFilter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FileFilter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_file_filter_get_type()
    }
}
