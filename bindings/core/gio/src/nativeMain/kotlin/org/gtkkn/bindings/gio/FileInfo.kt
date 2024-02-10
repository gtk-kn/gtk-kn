// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.bindings.glib.TimeVal
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.common.toKStringList
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
import org.gtkkn.native.gio.g_file_info_set_attribute_boolean
import org.gtkkn.native.gio.g_file_info_set_attribute_byte_string
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * Functionality for manipulating basic metadata for files. #GFileInfo
 * implements methods for getting information that all files should
 * contain, and allows for manipulation of extended attributes.
 *
 * See [GFileAttribute][gio-GFileAttribute] for more information on how
 * GIO handles file attributes.
 *
 * To obtain a #GFileInfo for a #GFile, use g_file_query_info() (or its
 * async variant). To obtain a #GFileInfo for a file input or output
 * stream, use g_file_input_stream_query_info() or
 * g_file_output_stream_query_info() (or their async variants).
 *
 * To change the actual attributes of a file, you should then set the
 * attribute in the #GFileInfo and call g_file_set_attributes_from_info()
 * or g_file_set_attributes_async() on a GFile.
 *
 * However, not all attributes can be changed in the file. For instance,
 * the actual size of a file cannot be changed via g_file_info_set_size().
 * You may call g_file_query_settable_attributes() and
 * g_file_query_writable_namespaces() to discover the settable attributes
 * of a particular file at runtime.
 *
 * The direct accessors, such as g_file_info_get_name(), are slightly more
 * optimized than the generic attribute accessors, such as
 * g_file_info_get_attribute_byte_string().This optimization will matter
 * only if calling the API in a tight loop.
 *
 * #GFileAttributeMatcher allows for searching through a #GFileInfo for
 * attributes.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `type`: type: Out parameter is not supported
 * - parameter `value_p`: gpointer
 */
public open class FileInfo(
    pointer: CPointer<GFileInfo>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gioFileInfoPointer: CPointer<GFileInfo>
        get() = gPointer.reinterpret()

    /**
     * Creates a new file info structure.
     *
     * @return a #GFileInfo.
     */
    public constructor() : this(g_file_info_new()!!.reinterpret())

    /**
     * Clears the status information from @info.
     */
    public open fun clearStatus(): Unit = g_file_info_clear_status(gioFileInfoPointer.reinterpret())

    /**
     * First clears all of the [GFileAttribute][gio-GFileAttribute] of @dest_info,
     * and then copies all of the file attributes from @src_info to @dest_info.
     *
     * @param destInfo destination to copy attributes to.
     */
    public open fun copyInto(destInfo: FileInfo): Unit =
        g_file_info_copy_into(
            gioFileInfoPointer.reinterpret(),
            destInfo.gioFileInfoPointer.reinterpret()
        )

    /**
     * Duplicates a file info structure.
     *
     * @return a duplicate #GFileInfo of @other.
     */
    public open fun dup(): FileInfo =
        g_file_info_dup(gioFileInfoPointer.reinterpret())!!.run {
            FileInfo(reinterpret())
        }

    /**
     * Gets the access time of the current @info and returns it as a
     * #GDateTime.
     *
     * This requires the %G_FILE_ATTRIBUTE_TIME_ACCESS attribute. If
     * %G_FILE_ATTRIBUTE_TIME_ACCESS_USEC is provided, the resulting #GDateTime
     * will have microsecond precision.
     *
     * @return access time, or null if unknown
     * @since 2.70
     */
    public open fun getAccessDateTime(): DateTime? =
        g_file_info_get_access_date_time(gioFileInfoPointer.reinterpret())?.run {
            DateTime(reinterpret())
        }

    /**
     * Gets the value of a attribute, formatted as a string.
     * This escapes things as needed to make the string valid
     * UTF-8.
     *
     * @param attribute a file attribute key.
     * @return a UTF-8 string associated with the given @attribute, or
     *    null if the attribute wasn’t set.
     *    When you're done with the string it must be freed with g_free().
     */
    public open fun getAttributeAsString(attribute: String): String? =
        g_file_info_get_attribute_as_string(
            gioFileInfoPointer.reinterpret(),
            attribute
        )?.toKString()

    /**
     * Gets the value of a boolean attribute. If the attribute does not
     * contain a boolean value, false will be returned.
     *
     * @param attribute a file attribute key.
     * @return the boolean value contained within the attribute.
     */
    public open fun getAttributeBoolean(attribute: String): Boolean =
        g_file_info_get_attribute_boolean(
            gioFileInfoPointer.reinterpret(),
            attribute
        ).asBoolean()

    /**
     * Gets the value of a byte string attribute. If the attribute does
     * not contain a byte string, null will be returned.
     *
     * @param attribute a file attribute key.
     * @return the contents of the @attribute value as a byte string, or
     * null otherwise.
     */
    public open fun getAttributeByteString(attribute: String): String? =
        g_file_info_get_attribute_byte_string(
            gioFileInfoPointer.reinterpret(),
            attribute
        )?.toKString()

    /**
     * Gets a signed 32-bit integer contained within the attribute. If the
     * attribute does not contain a signed 32-bit integer, or is invalid,
     * 0 will be returned.
     *
     * @param attribute a file attribute key.
     * @return a signed 32-bit integer from the attribute.
     */
    public open fun getAttributeInt32(attribute: String): Int =
        g_file_info_get_attribute_int32(gioFileInfoPointer.reinterpret(), attribute)

    /**
     * Gets a signed 64-bit integer contained within the attribute. If the
     * attribute does not contain a signed 64-bit integer, or is invalid,
     * 0 will be returned.
     *
     * @param attribute a file attribute key.
     * @return a signed 64-bit integer from the attribute.
     */
    public open fun getAttributeInt64(attribute: String): Long =
        g_file_info_get_attribute_int64(gioFileInfoPointer.reinterpret(), attribute)

    /**
     * Gets the value of a #GObject attribute. If the attribute does
     * not contain a #GObject, null will be returned.
     *
     * @param attribute a file attribute key.
     * @return a #GObject associated with the given @attribute,
     * or null otherwise.
     */
    public open fun getAttributeObject(attribute: String): Object? =
        g_file_info_get_attribute_object(gioFileInfoPointer.reinterpret(), attribute)?.run {
            Object(reinterpret())
        }

    /**
     * Gets the attribute status for an attribute key.
     *
     * @param attribute a file attribute key
     * @return a #GFileAttributeStatus for the given @attribute, or
     *    %G_FILE_ATTRIBUTE_STATUS_UNSET if the key is invalid.
     */
    public open fun getAttributeStatus(attribute: String): FileAttributeStatus =
        g_file_info_get_attribute_status(gioFileInfoPointer.reinterpret(), attribute).run {
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
        g_file_info_get_attribute_string(
            gioFileInfoPointer.reinterpret(),
            attribute
        )?.toKString()

    /**
     * Gets the value of a stringv attribute. If the attribute does
     * not contain a stringv, null will be returned.
     *
     * @param attribute a file attribute key.
     * @return the contents of the @attribute value as a stringv,
     * or null otherwise. Do not free. These returned strings are UTF-8.
     * @since 2.22
     */
    public open fun getAttributeStringv(attribute: String): List<String>? =
        g_file_info_get_attribute_stringv(
            gioFileInfoPointer.reinterpret(),
            attribute
        )?.toKStringList()

    /**
     * Gets the attribute type for an attribute key.
     *
     * @param attribute a file attribute key.
     * @return a #GFileAttributeType for the given @attribute, or
     * %G_FILE_ATTRIBUTE_TYPE_INVALID if the key is not set.
     */
    public open fun getAttributeType(attribute: String): FileAttributeType =
        g_file_info_get_attribute_type(gioFileInfoPointer.reinterpret(), attribute).run {
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
    public open fun getAttributeUint32(attribute: String): UInt =
        g_file_info_get_attribute_uint32(gioFileInfoPointer.reinterpret(), attribute)

    /**
     * Gets a unsigned 64-bit integer contained within the attribute. If the
     * attribute does not contain an unsigned 64-bit integer, or is invalid,
     * 0 will be returned.
     *
     * @param attribute a file attribute key.
     * @return a unsigned 64-bit integer from the attribute.
     */
    public open fun getAttributeUint64(attribute: String): ULong =
        g_file_info_get_attribute_uint64(gioFileInfoPointer.reinterpret(), attribute)

    /**
     * Gets the file's content type.
     *
     * @return a string containing the file's content type,
     * or null if unknown.
     */
    public open fun getContentType(): String? =
        g_file_info_get_content_type(gioFileInfoPointer.reinterpret())?.toKString()

    /**
     * Gets the creation time of the current @info and returns it as a
     * #GDateTime.
     *
     * This requires the %G_FILE_ATTRIBUTE_TIME_CREATED attribute. If
     * %G_FILE_ATTRIBUTE_TIME_CREATED_USEC is provided, the resulting #GDateTime
     * will have microsecond precision.
     *
     * @return creation time, or null if unknown
     * @since 2.70
     */
    public open fun getCreationDateTime(): DateTime? =
        g_file_info_get_creation_date_time(gioFileInfoPointer.reinterpret())?.run {
            DateTime(reinterpret())
        }

    /**
     * Returns the #GDateTime representing the deletion date of the file, as
     * available in G_FILE_ATTRIBUTE_TRASH_DELETION_DATE. If the
     * G_FILE_ATTRIBUTE_TRASH_DELETION_DATE attribute is unset, null is returned.
     *
     * @return a #GDateTime, or null.
     * @since 2.36
     */
    public open fun getDeletionDate(): DateTime? =
        g_file_info_get_deletion_date(gioFileInfoPointer.reinterpret())?.run {
            DateTime(reinterpret())
        }

    /**
     * Gets a display name for a file. This is guaranteed to always be set.
     *
     * @return a string containing the display name.
     */
    public open fun getDisplayName(): String =
        g_file_info_get_display_name(gioFileInfoPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the edit name for a file.
     *
     * @return a string containing the edit name.
     */
    public open fun getEditName(): String =
        g_file_info_get_edit_name(gioFileInfoPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the [entity tag][gfile-etag] for a given
     * #GFileInfo. See %G_FILE_ATTRIBUTE_ETAG_VALUE.
     *
     * @return a string containing the value of the "etag:value" attribute.
     */
    public open fun getEtag(): String? = g_file_info_get_etag(gioFileInfoPointer.reinterpret())?.toKString()

    /**
     * Gets a file's type (whether it is a regular file, symlink, etc).
     * This is different from the file's content type, see g_file_info_get_content_type().
     *
     * @return a #GFileType for the given file.
     */
    public open fun getFileType(): FileType =
        g_file_info_get_file_type(gioFileInfoPointer.reinterpret()).run {
            FileType.fromNativeValue(this)
        }

    /**
     * Gets the icon for a file.
     *
     * @return #GIcon for the given @info.
     */
    public open fun getIcon(): Icon? =
        g_file_info_get_icon(gioFileInfoPointer.reinterpret())?.run {
            Icon.wrap(reinterpret())
        }

    /**
     * Checks if a file is a backup file.
     *
     * @return true if file is a backup file, false otherwise.
     */
    public open fun getIsBackup(): Boolean = g_file_info_get_is_backup(gioFileInfoPointer.reinterpret()).asBoolean()

    /**
     * Checks if a file is hidden.
     *
     * @return true if the file is a hidden file, false otherwise.
     */
    public open fun getIsHidden(): Boolean = g_file_info_get_is_hidden(gioFileInfoPointer.reinterpret()).asBoolean()

    /**
     * Checks if a file is a symlink.
     *
     * @return true if the given @info is a symlink.
     */
    public open fun getIsSymlink(): Boolean = g_file_info_get_is_symlink(gioFileInfoPointer.reinterpret()).asBoolean()

    /**
     * Gets the modification time of the current @info and returns it as a
     * #GDateTime.
     *
     * This requires the %G_FILE_ATTRIBUTE_TIME_MODIFIED attribute. If
     * %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC is provided, the resulting #GDateTime
     * will have microsecond precision.
     *
     * @return modification time, or null if unknown
     * @since 2.62
     */
    public open fun getModificationDateTime(): DateTime? =
        g_file_info_get_modification_date_time(gioFileInfoPointer.reinterpret())?.run {
            DateTime(reinterpret())
        }

    /**
     * Gets the modification time of the current @info and sets it
     * in @result.
     *
     * @param result a #GTimeVal.
     */
    public open fun getModificationTime(result: TimeVal): Unit =
        g_file_info_get_modification_time(
            gioFileInfoPointer.reinterpret(),
            result.glibTimeValPointer
        )

    /**
     * Gets the name for a file. This is guaranteed to always be set.
     *
     * @return a string containing the file name.
     */
    public open fun getName(): String =
        g_file_info_get_name(gioFileInfoPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the file's size (in bytes). The size is retrieved through the value of
     * the %G_FILE_ATTRIBUTE_STANDARD_SIZE attribute and is converted
     * from #guint64 to #goffset before returning the result.
     *
     * @return a #goffset containing the file's size (in bytes).
     */
    public open fun getSize(): Long = g_file_info_get_size(gioFileInfoPointer.reinterpret())

    /**
     * Gets the value of the sort_order attribute from the #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
     *
     * @return a #gint32 containing the value of the "standard::sort_order" attribute.
     */
    public open fun getSortOrder(): Int = g_file_info_get_sort_order(gioFileInfoPointer.reinterpret())

    /**
     * Gets the symbolic icon for a file.
     *
     * @return #GIcon for the given @info.
     * @since 2.34
     */
    public open fun getSymbolicIcon(): Icon? =
        g_file_info_get_symbolic_icon(gioFileInfoPointer.reinterpret())?.run {
            Icon.wrap(reinterpret())
        }

    /**
     * Gets the symlink target for a given #GFileInfo.
     *
     * @return a string containing the symlink target.
     */
    public open fun getSymlinkTarget(): String? =
        g_file_info_get_symlink_target(gioFileInfoPointer.reinterpret())?.toKString()

    /**
     * Checks if a file info structure has an attribute named @attribute.
     *
     * @param attribute a file attribute key.
     * @return true if @info has an attribute named @attribute,
     *     false otherwise.
     */
    public open fun hasAttribute(attribute: String): Boolean =
        g_file_info_has_attribute(gioFileInfoPointer.reinterpret(), attribute).asBoolean()

    /**
     * Checks if a file info structure has an attribute in the
     * specified @name_space.
     *
     * @param nameSpace a file attribute namespace.
     * @return true if @info has an attribute in @name_space,
     *     false otherwise.
     * @since 2.22
     */
    public open fun hasNamespace(nameSpace: String): Boolean =
        g_file_info_has_namespace(gioFileInfoPointer.reinterpret(), nameSpace).asBoolean()

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
        g_file_info_list_attributes(
            gioFileInfoPointer.reinterpret(),
            nameSpace
        )?.toKStringList()

    /**
     * Removes all cases of @attribute from @info if it exists.
     *
     * @param attribute a file attribute key.
     */
    public open fun removeAttribute(attribute: String): Unit =
        g_file_info_remove_attribute(gioFileInfoPointer.reinterpret(), attribute)

    /**
     * Sets the %G_FILE_ATTRIBUTE_TIME_ACCESS and
     * %G_FILE_ATTRIBUTE_TIME_ACCESS_USEC attributes in the file info to the
     * given date/time value.
     *
     * @param atime a #GDateTime.
     * @since 2.70
     */
    public open fun setAccessDateTime(atime: DateTime): Unit =
        g_file_info_set_access_date_time(
            gioFileInfoPointer.reinterpret(),
            atime.glibDateTimePointer
        )

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute a file attribute key.
     * @param attrValue a boolean value.
     */
    public open fun setAttributeBoolean(
        attribute: String,
        attrValue: Boolean,
    ): Unit =
        g_file_info_set_attribute_boolean(
            gioFileInfoPointer.reinterpret(),
            attribute,
            attrValue.asGBoolean()
        )

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute a file attribute key.
     * @param attrValue a byte string.
     */
    public open fun setAttributeByteString(
        attribute: String,
        attrValue: String,
    ): Unit =
        g_file_info_set_attribute_byte_string(
            gioFileInfoPointer.reinterpret(),
            attribute,
            attrValue
        )

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute a file attribute key.
     * @param attrValue a signed 32-bit integer
     */
    public open fun setAttributeInt32(
        attribute: String,
        attrValue: Int,
    ): Unit = g_file_info_set_attribute_int32(gioFileInfoPointer.reinterpret(), attribute, attrValue)

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute attribute name to set.
     * @param attrValue int64 value to set attribute to.
     */
    public open fun setAttributeInt64(
        attribute: String,
        attrValue: Long,
    ): Unit = g_file_info_set_attribute_int64(gioFileInfoPointer.reinterpret(), attribute, attrValue)

    /**
     * Sets @mask on @info to match specific attribute types.
     *
     * @param mask a #GFileAttributeMatcher.
     */
    public open fun setAttributeMask(mask: FileAttributeMatcher): Unit =
        g_file_info_set_attribute_mask(
            gioFileInfoPointer.reinterpret(),
            mask.gioFileAttributeMatcherPointer
        )

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute a file attribute key.
     * @param attrValue a #GObject.
     */
    public open fun setAttributeObject(
        attribute: String,
        attrValue: Object,
    ): Unit =
        g_file_info_set_attribute_object(
            gioFileInfoPointer.reinterpret(),
            attribute,
            attrValue.gPointer.reinterpret()
        )

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
    public open fun setAttributeStatus(
        attribute: String,
        status: FileAttributeStatus,
    ): Boolean =
        g_file_info_set_attribute_status(
            gioFileInfoPointer.reinterpret(),
            attribute,
            status.nativeValue
        ).asBoolean()

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute a file attribute key.
     * @param attrValue a UTF-8 string.
     */
    public open fun setAttributeString(
        attribute: String,
        attrValue: String,
    ): Unit = g_file_info_set_attribute_string(gioFileInfoPointer.reinterpret(), attribute, attrValue)

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
    public open fun setAttributeStringv(
        attribute: String,
        attrValue: List<String>,
    ): Unit =
        memScoped {
            return g_file_info_set_attribute_stringv(
                gioFileInfoPointer.reinterpret(),
                attribute,
                attrValue.toCStringList(this)
            )
        }

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute a file attribute key.
     * @param attrValue an unsigned 32-bit integer.
     */
    public open fun setAttributeUint32(
        attribute: String,
        attrValue: UInt,
    ): Unit = g_file_info_set_attribute_uint32(gioFileInfoPointer.reinterpret(), attribute, attrValue)

    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     *
     * @param attribute a file attribute key.
     * @param attrValue an unsigned 64-bit integer.
     */
    public open fun setAttributeUint64(
        attribute: String,
        attrValue: ULong,
    ): Unit = g_file_info_set_attribute_uint64(gioFileInfoPointer.reinterpret(), attribute, attrValue)

    /**
     * Sets the content type attribute for a given #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE.
     *
     * @param contentType a content type. See [GContentType][gio-GContentType]
     */
    public open fun setContentType(contentType: String): Unit =
        g_file_info_set_content_type(gioFileInfoPointer.reinterpret(), contentType)

    /**
     * Sets the %G_FILE_ATTRIBUTE_TIME_CREATED and
     * %G_FILE_ATTRIBUTE_TIME_CREATED_USEC attributes in the file info to the
     * given date/time value.
     *
     * @param creationTime a #GDateTime.
     * @since 2.70
     */
    public open fun setCreationDateTime(creationTime: DateTime): Unit =
        g_file_info_set_creation_date_time(
            gioFileInfoPointer.reinterpret(),
            creationTime.glibDateTimePointer
        )

    /**
     * Sets the display name for the current #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME.
     *
     * @param displayName a string containing a display name.
     */
    public open fun setDisplayName(displayName: String): Unit =
        g_file_info_set_display_name(gioFileInfoPointer.reinterpret(), displayName)

    /**
     * Sets the edit name for the current file.
     * See %G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME.
     *
     * @param editName a string containing an edit name.
     */
    public open fun setEditName(editName: String): Unit =
        g_file_info_set_edit_name(gioFileInfoPointer.reinterpret(), editName)

    /**
     * Sets the file type in a #GFileInfo to @type.
     * See %G_FILE_ATTRIBUTE_STANDARD_TYPE.
     *
     * @param type a #GFileType.
     */
    public open fun setFileType(type: FileType): Unit =
        g_file_info_set_file_type(gioFileInfoPointer.reinterpret(), type.nativeValue)

    /**
     * Sets the icon for a given #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_ICON.
     *
     * @param icon a #GIcon.
     */
    public open fun setIcon(icon: Icon): Unit =
        g_file_info_set_icon(gioFileInfoPointer.reinterpret(), icon.gioIconPointer)

    /**
     * Sets the "is_hidden" attribute in a #GFileInfo according to @is_hidden.
     * See %G_FILE_ATTRIBUTE_STANDARD_IS_HIDDEN.
     *
     * @param isHidden a #gboolean.
     */
    public open fun setIsHidden(isHidden: Boolean): Unit =
        g_file_info_set_is_hidden(gioFileInfoPointer.reinterpret(), isHidden.asGBoolean())

    /**
     * Sets the "is_symlink" attribute in a #GFileInfo according to @is_symlink.
     * See %G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK.
     *
     * @param isSymlink a #gboolean.
     */
    public open fun setIsSymlink(isSymlink: Boolean): Unit =
        g_file_info_set_is_symlink(gioFileInfoPointer.reinterpret(), isSymlink.asGBoolean())

    /**
     * Sets the %G_FILE_ATTRIBUTE_TIME_MODIFIED and
     * %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC attributes in the file info to the
     * given date/time value.
     *
     * @param mtime a #GDateTime.
     * @since 2.62
     */
    public open fun setModificationDateTime(mtime: DateTime): Unit =
        g_file_info_set_modification_date_time(
            gioFileInfoPointer.reinterpret(),
            mtime.glibDateTimePointer
        )

    /**
     * Sets the %G_FILE_ATTRIBUTE_TIME_MODIFIED and
     * %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC attributes in the file info to the
     * given time value.
     *
     * @param mtime a #GTimeVal.
     */
    public open fun setModificationTime(mtime: TimeVal): Unit =
        g_file_info_set_modification_time(
            gioFileInfoPointer.reinterpret(),
            mtime.glibTimeValPointer
        )

    /**
     * Sets the name attribute for the current #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_NAME.
     *
     * @param name a string containing a name.
     */
    public open fun setName(name: String): Unit = g_file_info_set_name(gioFileInfoPointer.reinterpret(), name)

    /**
     * Sets the %G_FILE_ATTRIBUTE_STANDARD_SIZE attribute in the file info
     * to the given size.
     *
     * @param size a #goffset containing the file's size.
     */
    public open fun setSize(size: Long): Unit = g_file_info_set_size(gioFileInfoPointer.reinterpret(), size)

    /**
     * Sets the sort order attribute in the file info structure. See
     * %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
     *
     * @param sortOrder a sort order integer.
     */
    public open fun setSortOrder(sortOrder: Int): Unit =
        g_file_info_set_sort_order(gioFileInfoPointer.reinterpret(), sortOrder)

    /**
     * Sets the symbolic icon for a given #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON.
     *
     * @param icon a #GIcon.
     * @since 2.34
     */
    public open fun setSymbolicIcon(icon: Icon): Unit =
        g_file_info_set_symbolic_icon(gioFileInfoPointer.reinterpret(), icon.gioIconPointer)

    /**
     * Sets the %G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET attribute in the file info
     * to the given symlink target.
     *
     * @param symlinkTarget a static string containing a path to a symlink target.
     */
    public open fun setSymlinkTarget(symlinkTarget: String): Unit =
        g_file_info_set_symlink_target(gioFileInfoPointer.reinterpret(), symlinkTarget)

    /**
     * Unsets a mask set by g_file_info_set_attribute_mask(), if one
     * is set.
     */
    public open fun unsetAttributeMask(): Unit = g_file_info_unset_attribute_mask(gioFileInfoPointer.reinterpret())

    public companion object : TypeCompanion<FileInfo> {
        override val type: GeneratedClassKGType<FileInfo> =
            GeneratedClassKGType(g_file_info_get_type()) { FileInfo(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
