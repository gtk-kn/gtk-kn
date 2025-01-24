// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.gio.annotations.GioVersion2_36
import org.gtkkn.bindings.gio.annotations.GioVersion2_62
import org.gtkkn.bindings.gio.annotations.GioVersion2_70
import org.gtkkn.bindings.gio.annotations.GioVersion2_78
import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.bindings.glib.TimeVal
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GFileInfo
import org.gtkkn.native.gio.g_file_info_clear_status
import org.gtkkn.native.gio.g_file_info_copy_into
import org.gtkkn.native.gio.g_file_info_dup
import org.gtkkn.native.gio.g_file_info_get_access_date_time
import org.gtkkn.native.gio.g_file_info_get_attribute_as_string
import org.gtkkn.native.gio.g_file_info_get_attribute_boolean
import org.gtkkn.native.gio.g_file_info_get_attribute_byte_string
import org.gtkkn.native.gio.g_file_info_get_attribute_file_path
import org.gtkkn.native.gio.g_file_info_get_attribute_int32
import org.gtkkn.native.gio.g_file_info_get_attribute_int64
import org.gtkkn.native.gio.g_file_info_get_attribute_object
import org.gtkkn.native.gio.g_file_info_get_attribute_status
import org.gtkkn.native.gio.g_file_info_get_attribute_string
import org.gtkkn.native.gio.g_file_info_get_attribute_stringv
import org.gtkkn.native.gio.g_file_info_get_attribute_type
import org.gtkkn.native.gio.g_file_info_get_attribute_uint32
import org.gtkkn.native.gio.g_file_info_get_attribute_uint64
import org.gtkkn.native.gio.g_file_info_get_content_type
import org.gtkkn.native.gio.g_file_info_get_creation_date_time
import org.gtkkn.native.gio.g_file_info_get_deletion_date
import org.gtkkn.native.gio.g_file_info_get_display_name
import org.gtkkn.native.gio.g_file_info_get_edit_name
import org.gtkkn.native.gio.g_file_info_get_etag
import org.gtkkn.native.gio.g_file_info_get_file_type
import org.gtkkn.native.gio.g_file_info_get_icon
import org.gtkkn.native.gio.g_file_info_get_is_backup
import org.gtkkn.native.gio.g_file_info_get_is_hidden
import org.gtkkn.native.gio.g_file_info_get_is_symlink
import org.gtkkn.native.gio.g_file_info_get_modification_date_time
import org.gtkkn.native.gio.g_file_info_get_modification_time
import org.gtkkn.native.gio.g_file_info_get_name
import org.gtkkn.native.gio.g_file_info_get_size
import org.gtkkn.native.gio.g_file_info_get_sort_order
import org.gtkkn.native.gio.g_file_info_get_symbolic_icon
import org.gtkkn.native.gio.g_file_info_get_symlink_target
import org.gtkkn.native.gio.g_file_info_get_type
import org.gtkkn.native.gio.g_file_info_has_attribute
import org.gtkkn.native.gio.g_file_info_has_namespace
import org.gtkkn.native.gio.g_file_info_list_attributes
import org.gtkkn.native.gio.g_file_info_new
import org.gtkkn.native.gio.g_file_info_remove_attribute
import org.gtkkn.native.gio.g_file_info_set_access_date_time
import org.gtkkn.native.gio.g_file_info_set_attribute
import org.gtkkn.native.gio.g_file_info_set_attribute_boolean
import org.gtkkn.native.gio.g_file_info_set_attribute_byte_string
import org.gtkkn.native.gio.g_file_info_set_attribute_file_path
import org.gtkkn.native.gio.g_file_info_set_attribute_int32
import org.gtkkn.native.gio.g_file_info_set_attribute_int64
import org.gtkkn.native.gio.g_file_info_set_attribute_mask
import org.gtkkn.native.gio.g_file_info_set_attribute_object
import org.gtkkn.native.gio.g_file_info_set_attribute_status
import org.gtkkn.native.gio.g_file_info_set_attribute_string
import org.gtkkn.native.gio.g_file_info_set_attribute_stringv
import org.gtkkn.native.gio.g_file_info_set_attribute_uint32
import org.gtkkn.native.gio.g_file_info_set_attribute_uint64
import org.gtkkn.native.gio.g_file_info_set_content_type
import org.gtkkn.native.gio.g_file_info_set_creation_date_time
import org.gtkkn.native.gio.g_file_info_set_display_name
import org.gtkkn.native.gio.g_file_info_set_edit_name
import org.gtkkn.native.gio.g_file_info_set_file_type
import org.gtkkn.native.gio.g_file_info_set_icon
import org.gtkkn.native.gio.g_file_info_set_is_hidden
import org.gtkkn.native.gio.g_file_info_set_is_symlink
import org.gtkkn.native.gio.g_file_info_set_modification_date_time
import org.gtkkn.native.gio.g_file_info_set_modification_time
import org.gtkkn.native.gio.g_file_info_set_name
import org.gtkkn.native.gio.g_file_info_set_size
import org.gtkkn.native.gio.g_file_info_set_sort_order
import org.gtkkn.native.gio.g_file_info_set_symbolic_icon
import org.gtkkn.native.gio.g_file_info_set_symlink_target
import org.gtkkn.native.gio.g_file_info_unset_attribute_mask
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint64
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Stores information about a file system object referenced by a [iface@Gio.File].
 *
 * Functionality for manipulating basic metadata for files. `GFileInfo`
 * implements methods for getting information that all files should
 * contain, and allows for manipulation of extended attributes.
 *
 * See [file-attributes.html](file attributes) for more information on how GIO
 * handles file attributes.
 *
 * To obtain a `GFileInfo` for a [iface@Gio.File], use
 * [method@Gio.File.query_info] (or its async variant). To obtain a `GFileInfo`
 * for a file input or output stream, use [method@Gio.FileInputStream.query_info]
 * or [method@Gio.FileOutputStream.query_info] (or their async variants).
 *
 * To change the actual attributes of a file, you should then set the
 * attribute in the `GFileInfo` and call [method@Gio.File.set_attributes_from_info]
 * or [method@Gio.File.set_attributes_async] on a `GFile`.
 *
 * However, not all attributes can be changed in the file. For instance,
 * the actual size of a file cannot be changed via [method@Gio.FileInfo.set_size].
 * You may call [method@Gio.File.query_settable_attributes] and
 * [method@Gio.File.query_writable_namespaces] to discover the settable attributes
 * of a particular file at runtime.
 *
 * The direct accessors, such as [method@Gio.FileInfo.get_name], are slightly more
 * optimized than the generic attribute accessors, such as
 * [method@Gio.FileInfo.get_attribute_byte_string].This optimization will matter
 * only if calling the API in a tight loop.
 *
 * It is an error to call these accessors without specifying their required file
 * attributes when creating the `GFileInfo`. Use
 * [method@Gio.FileInfo.has_attribute] or [method@Gio.FileInfo.list_attributes]
 * to check what attributes are specified for a `GFileInfo`.
 *
 * [struct@Gio.FileAttributeMatcher] allows for searching through a `GFileInfo`
 * for attributes.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `type`: type: Out parameter is not supported
 */
public open class FileInfo(public val gioFileInfoPointer: CPointer<GFileInfo>) :
    Object(gioFileInfoPointer.reinterpret()),
    KGTyped {
    /**
     * Creates a new file info structure.
     *
     * @return a #GFileInfo.
     */
    public constructor() : this(g_file_info_new()!!.reinterpret())

    /**
     * Clears the status information from @info.
     */
    public open fun clearStatus(): Unit = g_file_info_clear_status(gioFileInfoPointer)

    /**
     * First clears all of the [GFileAttribute][gio-GFileAttribute] of @dest_info,
     * and then copies all of the file attributes from @src_info to @dest_info.
     *
     * @param destInfo destination to copy attributes to.
     */
    public open fun copyInto(destInfo: FileInfo): Unit =
        g_file_info_copy_into(gioFileInfoPointer, destInfo.gioFileInfoPointer)

    /**
     * Duplicates a file info structure.
     *
     * @return a duplicate #GFileInfo of @other.
     */
    public open fun dup(): FileInfo = g_file_info_dup(gioFileInfoPointer)!!.run {
        FileInfo(this)
    }

    /**
     * Gets the access time of the current @info and returns it as a
     * #GDateTime.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_TIME_ACCESS. If %G_FILE_ATTRIBUTE_TIME_ACCESS_USEC is
     * provided, the resulting #GDateTime will additionally have microsecond
     * precision.
     *
     * If nanosecond precision is needed, %G_FILE_ATTRIBUTE_TIME_ACCESS_NSEC must
     * be queried separately using g_file_info_get_attribute_uint32().
     *
     * @return access time, or null if unknown
     * @since 2.70
     */
    @GioVersion2_70
    public open fun getAccessDateTime(): DateTime? = g_file_info_get_access_date_time(gioFileInfoPointer)?.run {
        DateTime(this)
    }

    /**
     * Gets the value of an attribute, formatted as a string.
     * This escapes things as needed to make the string valid
     * UTF-8.
     *
     * @param attribute a file attribute key.
     * @return a UTF-8 string associated with the given @attribute, or
     *    null if the attribute wasn’t set.
     *    When you're done with the string it must be freed with g_free().
     */
    public open fun getAttributeAsString(attribute: String): String? =
        g_file_info_get_attribute_as_string(gioFileInfoPointer, attribute)?.toKString()

    /**
     * Gets the value of a boolean attribute. If the attribute does not
     * contain a boolean value, false will be returned.
     *
     * @param attribute a file attribute key.
     * @return the boolean value contained within the attribute.
     */
    public open fun getAttributeBoolean(attribute: String): Boolean =
        g_file_info_get_attribute_boolean(gioFileInfoPointer, attribute).asBoolean()

    /**
     * Gets the value of a byte string attribute. If the attribute does
     * not contain a byte string, null will be returned.
     *
     * @param attribute a file attribute key.
     * @return the contents of the @attribute value as a byte string, or
     * null otherwise.
     */
    public open fun getAttributeByteString(attribute: String): String? =
        g_file_info_get_attribute_byte_string(gioFileInfoPointer, attribute)?.toKString()

    /**
     * Gets the value of a byte string attribute as a file path.
     *
     * If the attribute does not contain a byte string, `NULL` will be returned.
     *
     * This function is meant to be used by language bindings that have specific
     * handling for Unix paths.
     *
     * @param attribute a file attribute key.
     * @return the contents of the @attribute value as
     * a file path, or null otherwise.
     * @since 2.78
     */
    @GioVersion2_78
    public open fun getAttributeFilePath(attribute: String): String? =
        g_file_info_get_attribute_file_path(gioFileInfoPointer, attribute)?.toKString()

    /**
     * Gets a signed 32-bit integer contained within the attribute. If the
     * attribute does not contain a signed 32-bit integer, or is invalid,
     * 0 will be returned.
     *
     * @param attribute a file attribute key.
     * @return a signed 32-bit integer from the attribute.
     */
    public open fun getAttributeInt32(attribute: String): gint =
        g_file_info_get_attribute_int32(gioFileInfoPointer, attribute)

    /**
     * Gets a signed 64-bit integer contained within the attribute. If the
     * attribute does not contain a signed 64-bit integer, or is invalid,
     * 0 will be returned.
     *
     * @param attribute a file attribute key.
     * @return a signed 64-bit integer from the attribute.
     */
    public open fun getAttributeInt64(attribute: String): gint64 =
        g_file_info_get_attribute_int64(gioFileInfoPointer, attribute)

    /**
     * Gets the value of a #GObject attribute. If the attribute does
     * not contain a #GObject, null will be returned.
     *
     * @param attribute a file attribute key.
     * @return a #GObject associated with the given @attribute,
     * or null otherwise.
     */
    public open fun getAttributeObject(attribute: String): Object? =
        g_file_info_get_attribute_object(gioFileInfoPointer, attribute)?.run {
            Object(this)
        }

    /**
     * Gets the attribute status for an attribute key.
     *
     * @param attribute a file attribute key
     * @return a #GFileAttributeStatus for the given @attribute, or
     *    %G_FILE_ATTRIBUTE_STATUS_UNSET if the key is invalid.
     */
    public open fun getAttributeStatus(attribute: String): FileAttributeStatus =
        g_file_info_get_attribute_status(gioFileInfoPointer, attribute).run {
            FileAttributeStatus.fromNativeValue(this)
        }

    /**
     * Gets the value of a string attribute. If the attribute does
     * not contain a string, null will be returned.
     *
     * @param attribute a file attribute key.
     * @return the contents of the @attribute value as a UTF-8 string,
     * or null otherwise.
     */
    public open fun getAttributeString(attribute: String): String? =
        g_file_info_get_attribute_string(gioFileInfoPointer, attribute)?.toKString()

    /**
     * Gets the value of a stringv attribute. If the attribute does
     * not contain a stringv, null will be returned.
     *
     * @param attribute a file attribute key.
     * @return the contents of the @attribute value as a stringv,
     * or null otherwise. Do not free. These returned strings are UTF-8.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun getAttributeStringv(attribute: String): List<String>? =
        g_file_info_get_attribute_stringv(gioFileInfoPointer, attribute)?.toKStringList()

    /**
     * Gets the attribute type for an attribute key.
     *
     * @param attribute a file attribute key.
     * @return a #GFileAttributeType for the given @attribute, or
     * %G_FILE_ATTRIBUTE_TYPE_INVALID if the key is not set.
     */
    public open fun getAttributeType(attribute: String): FileAttributeType =
        g_file_info_get_attribute_type(gioFileInfoPointer, attribute).run {
            FileAttributeType.fromNativeValue(this)
        }

    /**
     * Gets an unsigned 32-bit integer contained within the attribute. If the
     * attribute does not contain an unsigned 32-bit integer, or is invalid,
     * 0 will be returned.
     *
     * @param attribute a file attribute key.
     * @return an unsigned 32-bit integer from the attribute.
     */
    public open fun getAttributeUint32(attribute: String): guint =
        g_file_info_get_attribute_uint32(gioFileInfoPointer, attribute)

    /**
     * Gets a unsigned 64-bit integer contained within the attribute. If the
     * attribute does not contain an unsigned 64-bit integer, or is invalid,
     * 0 will be returned.
     *
     * @param attribute a file attribute key.
     * @return a unsigned 64-bit integer from the attribute.
     */
    public open fun getAttributeUint64(attribute: String): guint64 =
        g_file_info_get_attribute_uint64(gioFileInfoPointer, attribute)

    /**
     * Gets the file's content type.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE.
     *
     * @return a string containing the file's content type,
     * or null if unknown.
     */
    public open fun getContentType(): String? = g_file_info_get_content_type(gioFileInfoPointer)?.toKString()

    /**
     * Gets the creation time of the current @info and returns it as a
     * #GDateTime.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_TIME_CREATED. If %G_FILE_ATTRIBUTE_TIME_CREATED_USEC is
     * provided, the resulting #GDateTime will additionally have microsecond
     * precision.
     *
     * If nanosecond precision is needed, %G_FILE_ATTRIBUTE_TIME_CREATED_NSEC must
     * be queried separately using g_file_info_get_attribute_uint32().
     *
     * @return creation time, or null if unknown
     * @since 2.70
     */
    @GioVersion2_70
    public open fun getCreationDateTime(): DateTime? = g_file_info_get_creation_date_time(gioFileInfoPointer)?.run {
        DateTime(this)
    }

    /**
     * Returns the #GDateTime representing the deletion date of the file, as
     * available in %G_FILE_ATTRIBUTE_TRASH_DELETION_DATE. If the
     * %G_FILE_ATTRIBUTE_TRASH_DELETION_DATE attribute is unset, null is returned.
     *
     * @return a #GDateTime, or null.
     * @since 2.36
     */
    @GioVersion2_36
    public open fun getDeletionDate(): DateTime? = g_file_info_get_deletion_date(gioFileInfoPointer)?.run {
        DateTime(this)
    }

    /**
     * Gets a display name for a file. This is guaranteed to always be set.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME.
     *
     * @return a string containing the display name.
     */
    public open fun getDisplayName(): String =
        g_file_info_get_display_name(gioFileInfoPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the edit name for a file.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME.
     *
     * @return a string containing the edit name.
     */
    public open fun getEditName(): String =
        g_file_info_get_edit_name(gioFileInfoPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the [entity tag](iface.File.html#entity-tags) for a given
     * #GFileInfo. See %G_FILE_ATTRIBUTE_ETAG_VALUE.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_ETAG_VALUE.
     *
     * @return a string containing the value of the "etag:value" attribute.
     */
    public open fun getEtag(): String? = g_file_info_get_etag(gioFileInfoPointer)?.toKString()

    /**
     * Gets a file's type (whether it is a regular file, symlink, etc).
     * This is different from the file's content type, see g_file_info_get_content_type().
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_STANDARD_TYPE.
     *
     * @return a #GFileType for the given file.
     */
    public open fun getFileType(): FileType = g_file_info_get_file_type(gioFileInfoPointer).run {
        FileType.fromNativeValue(this)
    }

    /**
     * Gets the icon for a file.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_STANDARD_ICON.
     *
     * @return #GIcon for the given @info.
     */
    public open fun getIcon(): Icon? = g_file_info_get_icon(gioFileInfoPointer)?.run {
        Icon.IconImpl(reinterpret())
    }

    /**
     * Checks if a file is a backup file.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_STANDARD_IS_BACKUP.
     *
     * @return true if file is a backup file, false otherwise.
     */
    public open fun getIsBackup(): Boolean = g_file_info_get_is_backup(gioFileInfoPointer).asBoolean()

    /**
     * Checks if a file is hidden.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_STANDARD_IS_HIDDEN.
     *
     * @return true if the file is a hidden file, false otherwise.
     */
    public open fun getIsHidden(): Boolean = g_file_info_get_is_hidden(gioFileInfoPointer).asBoolean()

    /**
     * Checks if a file is a symlink.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK.
     *
     * @return true if the given @info is a symlink.
     */
    public open fun getIsSymlink(): Boolean = g_file_info_get_is_symlink(gioFileInfoPointer).asBoolean()

    /**
     * Gets the modification time of the current @info and returns it as a
     * #GDateTime.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_TIME_MODIFIED. If %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC is
     * provided, the resulting #GDateTime will additionally have microsecond
     * precision.
     *
     * If nanosecond precision is needed, %G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC must
     * be queried separately using g_file_info_get_attribute_uint32().
     *
     * @return modification time, or null if unknown
     * @since 2.62
     */
    @GioVersion2_62
    public open fun getModificationDateTime(): DateTime? =
        g_file_info_get_modification_date_time(gioFileInfoPointer)?.run {
            DateTime(this)
        }

    /**
     * Gets the modification time of the current @info and sets it
     * in @result.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_TIME_MODIFIED. If %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC is
     * provided it will be used too.
     *
     * @param result a #GTimeVal.
     */
    public open fun getModificationTime(result: TimeVal): Unit =
        g_file_info_get_modification_time(gioFileInfoPointer, result.glibTimeValPointer)

    /**
     * Gets the name for a file. This is guaranteed to always be set.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_STANDARD_NAME.
     *
     * @return a string containing the file name.
     */
    public open fun getName(): String =
        g_file_info_get_name(gioFileInfoPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the file's size (in bytes). The size is retrieved through the value of
     * the %G_FILE_ATTRIBUTE_STANDARD_SIZE attribute and is converted
     * from #guint64 to #goffset before returning the result.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_STANDARD_SIZE.
     *
     * @return a #goffset containing the file's size (in bytes).
     */
    public open fun getSize(): gint64 = g_file_info_get_size(gioFileInfoPointer)

    /**
     * Gets the value of the sort_order attribute from the #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
     *
     * @return a #gint32 containing the value of the "standard::sort_order" attribute.
     */
    public open fun getSortOrder(): gint = g_file_info_get_sort_order(gioFileInfoPointer)

    /**
     * Gets the symbolic icon for a file.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON.
     *
     * @return #GIcon for the given @info.
     * @since 2.34
     */
    @GioVersion2_34
    public open fun getSymbolicIcon(): Icon? = g_file_info_get_symbolic_icon(gioFileInfoPointer)?.run {
        Icon.IconImpl(reinterpret())
    }

    /**
     * Gets the symlink target for a given #GFileInfo.
     *
     * It is an error to call this if the #GFileInfo does not contain
     * %G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET.
     *
     * @return a string containing the symlink target.
     */
    public open fun getSymlinkTarget(): String? = g_file_info_get_symlink_target(gioFileInfoPointer)?.toKString()

    /**
     * Checks if a file info structure has an attribute named @attribute.
     *
     * @param attribute a file attribute key.
     * @return true if @info has an attribute named @attribute,
     *     false otherwise.
     */
    public open fun hasAttribute(attribute: String): Boolean =
        g_file_info_has_attribute(gioFileInfoPointer, attribute).asBoolean()

    /**
     * Checks if a file info structure has an attribute in the
     * specified @name_space.
     *
     * @param nameSpace a file attribute namespace.
     * @return true if @info has an attribute in @name_space,
     *     false otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun hasNamespace(nameSpace: String): Boolean =
        g_file_info_has_namespace(gioFileInfoPointer, nameSpace).asBoolean()

    /**
     * Lists the file info structure's attributes.
     *
     * @param nameSpace a file attribute key's namespace, or null to list
     *   all attributes.
     * @return a
     * null-terminated array of strings of all of the possible attribute
     * types for the given @name_space, or null on error.
     */
    public open fun listAttributes(nameSpace: String? = null): List<String>? =
        g_file_info_list_attributes(gioFileInfoPointer, nameSpace)?.toKStringList()

    /**
     * Removes all cases of @attribute from @info if it exists.
     *
     * @param attribute a file attribute key.
     */
    public open fun removeAttribute(attribute: String): Unit =
        g_file_info_remove_attribute(gioFileInfoPointer, attribute)

    /**
     * Sets the %G_FILE_ATTRIBUTE_TIME_ACCESS and
     * %G_FILE_ATTRIBUTE_TIME_ACCESS_USEC attributes in the file info to the
     * given date/time value.
     *
     * %G_FILE_ATTRIBUTE_TIME_ACCESS_NSEC will be cleared.
     *
     * @param atime a #GDateTime.
     * @since 2.70
     */
    @GioVersion2_70
    public open fun setAccessDateTime(atime: DateTime): Unit =
        g_file_info_set_access_date_time(gioFileInfoPointer, atime.glibDateTimePointer)

    /**
     * Sets the @attribute to contain the given value, if possible. To unset the
     * attribute, use %G_FILE_ATTRIBUTE_TYPE_INVALID for @type.
     *
     * @param attribute a file attribute key.
     * @param type a #GFileAttributeType
     * @param valueP pointer to the value
     */
    public open fun setAttribute(attribute: String, type: FileAttributeType, valueP: gpointer): Unit =
        g_file_info_set_attribute(gioFileInfoPointer, attribute, type.nativeValue, valueP)

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute a file attribute key.
     * @param attrValue a boolean value.
     */
    public open fun setAttributeBoolean(attribute: String, attrValue: Boolean): Unit =
        g_file_info_set_attribute_boolean(gioFileInfoPointer, attribute, attrValue.asGBoolean())

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute a file attribute key.
     * @param attrValue a byte string.
     */
    public open fun setAttributeByteString(attribute: String, attrValue: String): Unit =
        g_file_info_set_attribute_byte_string(gioFileInfoPointer, attribute, attrValue)

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * This function is meant to be used by language bindings that have specific
     * handling for Unix paths.
     *
     * @param attribute a file attribute key.
     * @param attrValue a file path.
     * @since 2.78
     */
    @GioVersion2_78
    public open fun setAttributeFilePath(attribute: String, attrValue: String): Unit =
        g_file_info_set_attribute_file_path(gioFileInfoPointer, attribute, attrValue)

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute a file attribute key.
     * @param attrValue a signed 32-bit integer
     */
    public open fun setAttributeInt32(attribute: String, attrValue: gint): Unit =
        g_file_info_set_attribute_int32(gioFileInfoPointer, attribute, attrValue)

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute attribute name to set.
     * @param attrValue int64 value to set attribute to.
     */
    public open fun setAttributeInt64(attribute: String, attrValue: gint64): Unit =
        g_file_info_set_attribute_int64(gioFileInfoPointer, attribute, attrValue)

    /**
     * Sets @mask on @info to match specific attribute types.
     *
     * @param mask a #GFileAttributeMatcher.
     */
    public open fun setAttributeMask(mask: FileAttributeMatcher): Unit =
        g_file_info_set_attribute_mask(gioFileInfoPointer, mask.gioFileAttributeMatcherPointer)

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute a file attribute key.
     * @param attrValue a #GObject.
     */
    public open fun setAttributeObject(attribute: String, attrValue: Object): Unit =
        g_file_info_set_attribute_object(gioFileInfoPointer, attribute, attrValue.gobjectObjectPointer)

    /**
     * Sets the attribute status for an attribute key. This is only
     * needed by external code that implement g_file_set_attributes_from_info()
     * or similar functions.
     *
     * The attribute must exist in @info for this to work. Otherwise false
     * is returned and @info is unchanged.
     *
     * @param attribute a file attribute key
     * @param status a #GFileAttributeStatus
     * @return true if the status was changed, false if the key was not set.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun setAttributeStatus(attribute: String, status: FileAttributeStatus): Boolean =
        g_file_info_set_attribute_status(gioFileInfoPointer, attribute, status.nativeValue).asBoolean()

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute a file attribute key.
     * @param attrValue a UTF-8 string.
     */
    public open fun setAttributeString(attribute: String, attrValue: String): Unit =
        g_file_info_set_attribute_string(gioFileInfoPointer, attribute, attrValue)

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * Sinze: 2.22
     *
     * @param attribute a file attribute key
     * @param attrValue a null
     *   terminated array of UTF-8 strings.
     */
    public open fun setAttributeStringv(attribute: String, attrValue: List<String>): Unit = memScoped {
        return g_file_info_set_attribute_stringv(gioFileInfoPointer, attribute, attrValue.toCStringList(this))
    }

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute a file attribute key.
     * @param attrValue an unsigned 32-bit integer.
     */
    public open fun setAttributeUint32(attribute: String, attrValue: guint): Unit =
        g_file_info_set_attribute_uint32(gioFileInfoPointer, attribute, attrValue)

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute a file attribute key.
     * @param attrValue an unsigned 64-bit integer.
     */
    public open fun setAttributeUint64(attribute: String, attrValue: guint64): Unit =
        g_file_info_set_attribute_uint64(gioFileInfoPointer, attribute, attrValue)

    /**
     * Sets the content type attribute for a given #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE.
     *
     * @param contentType a content type. See [GContentType][gio-GContentType]
     */
    public open fun setContentType(contentType: String): Unit =
        g_file_info_set_content_type(gioFileInfoPointer, contentType)

    /**
     * Sets the %G_FILE_ATTRIBUTE_TIME_CREATED and
     * %G_FILE_ATTRIBUTE_TIME_CREATED_USEC attributes in the file info to the
     * given date/time value.
     *
     * %G_FILE_ATTRIBUTE_TIME_CREATED_NSEC will be cleared.
     *
     * @param creationTime a #GDateTime.
     * @since 2.70
     */
    @GioVersion2_70
    public open fun setCreationDateTime(creationTime: DateTime): Unit =
        g_file_info_set_creation_date_time(gioFileInfoPointer, creationTime.glibDateTimePointer)

    /**
     * Sets the display name for the current #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME.
     *
     * @param displayName a string containing a display name.
     */
    public open fun setDisplayName(displayName: String): Unit =
        g_file_info_set_display_name(gioFileInfoPointer, displayName)

    /**
     * Sets the edit name for the current file.
     * See %G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME.
     *
     * @param editName a string containing an edit name.
     */
    public open fun setEditName(editName: String): Unit = g_file_info_set_edit_name(gioFileInfoPointer, editName)

    /**
     * Sets the file type in a #GFileInfo to @type.
     * See %G_FILE_ATTRIBUTE_STANDARD_TYPE.
     *
     * @param type a #GFileType.
     */
    public open fun setFileType(type: FileType): Unit = g_file_info_set_file_type(gioFileInfoPointer, type.nativeValue)

    /**
     * Sets the icon for a given #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_ICON.
     *
     * @param icon a #GIcon.
     */
    public open fun setIcon(icon: Icon): Unit = g_file_info_set_icon(gioFileInfoPointer, icon.gioIconPointer)

    /**
     * Sets the "is_hidden" attribute in a #GFileInfo according to @is_hidden.
     * See %G_FILE_ATTRIBUTE_STANDARD_IS_HIDDEN.
     *
     * @param isHidden a #gboolean.
     */
    public open fun setIsHidden(isHidden: Boolean): Unit =
        g_file_info_set_is_hidden(gioFileInfoPointer, isHidden.asGBoolean())

    /**
     * Sets the "is_symlink" attribute in a #GFileInfo according to @is_symlink.
     * See %G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK.
     *
     * @param isSymlink a #gboolean.
     */
    public open fun setIsSymlink(isSymlink: Boolean): Unit =
        g_file_info_set_is_symlink(gioFileInfoPointer, isSymlink.asGBoolean())

    /**
     * Sets the %G_FILE_ATTRIBUTE_TIME_MODIFIED and
     * %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC attributes in the file info to the
     * given date/time value.
     *
     * %G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC will be cleared.
     *
     * @param mtime a #GDateTime.
     * @since 2.62
     */
    @GioVersion2_62
    public open fun setModificationDateTime(mtime: DateTime): Unit =
        g_file_info_set_modification_date_time(gioFileInfoPointer, mtime.glibDateTimePointer)

    /**
     * Sets the %G_FILE_ATTRIBUTE_TIME_MODIFIED and
     * %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC attributes in the file info to the
     * given time value.
     *
     * %G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC will be cleared.
     *
     * @param mtime a #GTimeVal.
     */
    public open fun setModificationTime(mtime: TimeVal): Unit =
        g_file_info_set_modification_time(gioFileInfoPointer, mtime.glibTimeValPointer)

    /**
     * Sets the name attribute for the current #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_NAME.
     *
     * @param name a string containing a name.
     */
    public open fun setName(name: String): Unit = g_file_info_set_name(gioFileInfoPointer, name)

    /**
     * Sets the %G_FILE_ATTRIBUTE_STANDARD_SIZE attribute in the file info
     * to the given size.
     *
     * @param size a #goffset containing the file's size.
     */
    public open fun setSize(size: gint64): Unit = g_file_info_set_size(gioFileInfoPointer, size)

    /**
     * Sets the sort order attribute in the file info structure. See
     * %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
     *
     * @param sortOrder a sort order integer.
     */
    public open fun setSortOrder(sortOrder: gint): Unit = g_file_info_set_sort_order(gioFileInfoPointer, sortOrder)

    /**
     * Sets the symbolic icon for a given #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON.
     *
     * @param icon a #GIcon.
     * @since 2.34
     */
    @GioVersion2_34
    public open fun setSymbolicIcon(icon: Icon): Unit =
        g_file_info_set_symbolic_icon(gioFileInfoPointer, icon.gioIconPointer)

    /**
     * Sets the %G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET attribute in the file info
     * to the given symlink target.
     *
     * @param symlinkTarget a static string containing a path to a symlink target.
     */
    public open fun setSymlinkTarget(symlinkTarget: String): Unit =
        g_file_info_set_symlink_target(gioFileInfoPointer, symlinkTarget)

    /**
     * Unsets a mask set by g_file_info_set_attribute_mask(), if one
     * is set.
     */
    public open fun unsetAttributeMask(): Unit = g_file_info_unset_attribute_mask(gioFileInfoPointer)

    public companion object : TypeCompanion<FileInfo> {
        override val type: GeneratedClassKGType<FileInfo> =
            GeneratedClassKGType(g_file_info_get_type()) { FileInfo(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of FileInfo
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_info_get_type()
    }
}
