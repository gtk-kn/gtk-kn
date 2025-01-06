// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.GLib.resolveException
import org.gtkkn.bindings.glib.annotations.GLibVersion2_12
import org.gtkkn.bindings.glib.annotations.GLibVersion2_26
import org.gtkkn.bindings.glib.annotations.GLibVersion2_32
import org.gtkkn.bindings.glib.annotations.GLibVersion2_40
import org.gtkkn.bindings.glib.annotations.GLibVersion2_50
import org.gtkkn.bindings.glib.annotations.GLibVersion2_56
import org.gtkkn.bindings.glib.annotations.GLibVersion2_6
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GKeyFile
import org.gtkkn.native.glib.g_key_file_error_quark
import org.gtkkn.native.glib.g_key_file_free
import org.gtkkn.native.glib.g_key_file_get_boolean
import org.gtkkn.native.glib.g_key_file_get_comment
import org.gtkkn.native.glib.g_key_file_get_double
import org.gtkkn.native.glib.g_key_file_get_int64
import org.gtkkn.native.glib.g_key_file_get_integer
import org.gtkkn.native.glib.g_key_file_get_locale_for_key
import org.gtkkn.native.glib.g_key_file_get_locale_string
import org.gtkkn.native.glib.g_key_file_get_start_group
import org.gtkkn.native.glib.g_key_file_get_string
import org.gtkkn.native.glib.g_key_file_get_uint64
import org.gtkkn.native.glib.g_key_file_get_value
import org.gtkkn.native.glib.g_key_file_has_group
import org.gtkkn.native.glib.g_key_file_has_key
import org.gtkkn.native.glib.g_key_file_load_from_bytes
import org.gtkkn.native.glib.g_key_file_load_from_data
import org.gtkkn.native.glib.g_key_file_load_from_file
import org.gtkkn.native.glib.g_key_file_new
import org.gtkkn.native.glib.g_key_file_ref
import org.gtkkn.native.glib.g_key_file_remove_comment
import org.gtkkn.native.glib.g_key_file_remove_group
import org.gtkkn.native.glib.g_key_file_remove_key
import org.gtkkn.native.glib.g_key_file_save_to_file
import org.gtkkn.native.glib.g_key_file_set_boolean
import org.gtkkn.native.glib.g_key_file_set_comment
import org.gtkkn.native.glib.g_key_file_set_double
import org.gtkkn.native.glib.g_key_file_set_int64
import org.gtkkn.native.glib.g_key_file_set_integer
import org.gtkkn.native.glib.g_key_file_set_list_separator
import org.gtkkn.native.glib.g_key_file_set_locale_string
import org.gtkkn.native.glib.g_key_file_set_locale_string_list
import org.gtkkn.native.glib.g_key_file_set_string
import org.gtkkn.native.glib.g_key_file_set_string_list
import org.gtkkn.native.glib.g_key_file_set_uint64
import org.gtkkn.native.glib.g_key_file_set_value
import org.gtkkn.native.glib.g_key_file_unref
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.glib.guint64
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_key_file_get_type
import kotlin.Boolean
import kotlin.Char
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * `GKeyFile` parses .ini-like config files.
 *
 * `GKeyFile` lets you parse, edit or create files containing groups of
 * key-value pairs, which we call "key files" for lack of a better name.
 * Several freedesktop.org specifications use key files now, e.g the
 * [Desktop Entry Specification](http://freedesktop.org/Standards/desktop-entry-spec)
 * and the [Icon Theme Specification](http://freedesktop.org/Standards/icon-theme-spec).
 *
 * The syntax of key files is described in detail in the
 * [Desktop Entry Specification](http://freedesktop.org/Standards/desktop-entry-spec),
 * here is a quick summary: Key files consists of groups of key-value pairs, interspersed
 * with comments.
 *
 * ```txt
 * # this is just an example
 * # there can be comments before the first group
 *
 * [First Group]
 *
 * Name=Key File Example\tthis value shows\nescaping
 *
 * # localized strings are stored in multiple key-value pairs
 * Welcome=Hello
 * Welcome[de]=Hallo
 * Welcome[fr_FR]=Bonjour
 * Welcome[it]=Ciao
 *
 * [Another Group]
 *
 * Numbers=2;20;-200;0
 *
 * Booleans=true;false;true;true
 * ```
 *
 * Lines beginning with a '#' and blank lines are considered comments.
 *
 * Groups are started by a header line containing the group name enclosed
 * in '[' and ']', and ended implicitly by the start of the next group or
 * the end of the file. Each key-value pair must be contained in a group.
 *
 * Key-value pairs generally have the form `key=value`, with the exception
 * of localized strings, which have the form `key[locale]=value`, with a
 * locale identifier of the form `lang_COUNTRY@MODIFIER` where `COUNTRY`
 * and `MODIFIER` are optional. Space before and after the '=' character
 * are ignored. Newline, tab, carriage return and backslash characters in
 * value are escaped as `\n`, `\t`, `\r`, and `\\\\`, respectively. To preserve
 * leading spaces in values, these can also be escaped as `\s`.
 *
 * Key files can store strings (possibly with localized variants), integers,
 * booleans and lists of these. Lists are separated by a separator character,
 * typically ';' or ','. To use the list separator character in a value in
 * a list, it has to be escaped by prefixing it with a backslash.
 *
 * This syntax is obviously inspired by the .ini files commonly met
 * on Windows, but there are some important differences:
 *
 * - .ini files use the ';' character to begin comments,
 *   key files use the '#' character.
 *
 * - Key files do not allow for ungrouped keys meaning only
 *   comments can precede the first group.
 *
 * - Key files are always encoded in UTF-8.
 *
 * - Key and Group names are case-sensitive. For example, a group called
 *   [GROUP] is a different from [group].
 *
 * - .ini files don't have a strongly typed boolean entry type,
 *    they only have GetProfileInt(). In key files, only
 *    true and false (in lower case) are allowed.
 *
 * Note that in contrast to the
 * [Desktop Entry Specification](http://freedesktop.org/Standards/desktop-entry-spec),
 * groups in key files may contain the same key multiple times; the last entry wins.
 * Key files may also contain multiple groups with the same name; they are merged
 * together. Another difference is that keys and group names in key files are not
 * restricted to ASCII characters.
 *
 * Here is an example of loading a key file and reading a value:
 *
 * ```c
 * g_autoptr(GError) error = NULL;
 * g_autoptr(GKeyFile) key_file = g_key_file_new ();
 *
 * if (!g_key_file_load_from_file (key_file, "key-file.ini", flags, &error))
 *   {
 *     if (!g_error_matches (error, G_FILE_ERROR, G_FILE_ERROR_NOENT))
 *       g_warning ("Error loading key file: %s", error->message);
 *     return;
 *   }
 *
 * g_autofree gchar *val = g_key_file_get_string (key_file, "Group Name", "SomeKey", &error);
 * if (val == NULL &&
 *     !g_error_matches (error, G_KEY_FILE_ERROR, G_KEY_FILE_ERROR_KEY_NOT_FOUND))
 *   {
 *     g_warning ("Error finding key in key file: %s", error->message);
 *     return;
 *   }
 * else if (val == NULL)
 *   {
 *     // Fall back to a default value.
 *     val = g_strdup ("default-value");
 *   }
 * ```
 *
 * Here is an example of creating and saving a key file:
 *
 * ```c
 * g_autoptr(GKeyFile) key_file = g_key_file_new ();
 * const gchar *val = …;
 * g_autoptr(GError) error = NULL;
 *
 * g_key_file_set_string (key_file, "Group Name", "SomeKey", val);
 *
 * // Save as a file.
 * if (!g_key_file_save_to_file (key_file, "key-file.ini", &error))
 *   {
 *     g_warning ("Error saving key file: %s", error->message);
 *     return;
 *   }
 *
 * // Or store to a GBytes for use elsewhere.
 * gsize data_len;
 * g_autofree guint8 *data = (guint8 *) g_key_file_to_data (key_file, &data_len, &error);
 * if (data == NULL)
 *   {
 *     g_warning ("Error saving key file: %s", error->message);
 *     return;
 *   }
 * g_autoptr(GBytes) bytes = g_bytes_new_take (g_steal_pointer (&data), data_len);
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `full_path`: full_path: Out parameter is not supported
 * - parameter `full_path`: full_path: Out parameter is not supported
 * - parameter `list`: Array parameter of type gboolean is not supported
 * - parameter `list`: Array parameter of type gdouble is not supported
 * - parameter `list`: Array parameter of type gint is not supported
 * - parameter `length`: length: Out parameter is not supported
 */
public class KeyFile(pointer: CPointer<GKeyFile>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GKeyFile> = pointer

    /**
     * Clears all keys and groups from @key_file, and decreases the
     * reference count by 1. If the reference count reaches zero,
     * frees the key file and all its allocated memory.
     *
     * @since 2.6
     */
    @GLibVersion2_6
    public fun free(): Unit = g_key_file_free(gPointer.reinterpret())

    /**
     * Returns the value associated with @key under @group_name as a
     * boolean.
     *
     * If @key cannot be found then false is returned and @error is set
     * to %G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the value
     * associated with @key cannot be interpreted as a boolean then false
     * is returned and @error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     *
     * @param groupName a group name
     * @param key a key
     * @return the value associated with the key as a boolean,
     *    or false if the key was not found or could not be parsed.
     * @since 2.6
     */
    @GLibVersion2_6
    public fun getBoolean(groupName: String, key: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_get_boolean(gPointer.reinterpret(), groupName, key, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Retrieves a comment above @key from @group_name.
     * If @key is null then @comment will be read from above
     * @group_name. If both @key and @group_name are null, then
     * @comment will be read from above the first group in the file.
     *
     * Note that the returned string does not include the '#' comment markers,
     * but does include any whitespace after them (on each line). It includes
     * the line breaks between lines, but does not include the final line break.
     *
     * @param groupName a group name, or null
     * @param key a key
     * @return a comment that should be freed with g_free()
     * @since 2.6
     */
    @GLibVersion2_6
    public fun getComment(groupName: String? = null, key: String? = null): Result<String> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_get_comment(gPointer.reinterpret(), groupName, key, gError.ptr)?.toKString()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Returns the value associated with @key under @group_name as a
     * double. If @group_name is null, the start_group is used.
     *
     * If @key cannot be found then 0.0 is returned and @error is set to
     * %G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the value associated
     * with @key cannot be interpreted as a double then 0.0 is returned
     * and @error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     *
     * @param groupName a group name
     * @param key a key
     * @return the value associated with the key as a double, or
     *     0.0 if the key was not found or could not be parsed.
     * @since 2.12
     */
    @GLibVersion2_12
    public fun getDouble(groupName: String, key: String): Result<gdouble> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_get_double(gPointer.reinterpret(), groupName, key, gError.ptr)
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Returns the value associated with @key under @group_name as a signed
     * 64-bit integer. This is similar to g_key_file_get_integer() but can return
     * 64-bit results without truncation.
     *
     * @param groupName a non-null group name
     * @param key a non-null key
     * @return the value associated with the key as a signed 64-bit integer, or
     * 0 if the key was not found or could not be parsed.
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getInt64(groupName: String, key: String): Result<gint64> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_get_int64(gPointer.reinterpret(), groupName, key, gError.ptr)
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Returns the value associated with @key under @group_name as an
     * integer.
     *
     * If @key cannot be found then 0 is returned and @error is set to
     * %G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the value associated
     * with @key cannot be interpreted as an integer, or is out of range
     * for a #gint, then 0 is returned
     * and @error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     *
     * @param groupName a group name
     * @param key a key
     * @return the value associated with the key as an integer, or
     *     0 if the key was not found or could not be parsed.
     * @since 2.6
     */
    @GLibVersion2_6
    public fun getInteger(groupName: String, key: String): Result<gint> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_get_integer(gPointer.reinterpret(), groupName, key, gError.ptr)
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Returns the actual locale which the result of
     * g_key_file_get_locale_string() or g_key_file_get_locale_string_list()
     * came from.
     *
     * If calling g_key_file_get_locale_string() or
     * g_key_file_get_locale_string_list() with exactly the same @key_file,
     * @group_name, @key and @locale, the result of those functions will
     * have originally been tagged with the locale that is the result of
     * this function.
     *
     * @param groupName a group name
     * @param key a key
     * @param locale a locale identifier or null
     * @return the locale from the file, or null if the key was not
     *   found or the entry in the file was was untranslated
     * @since 2.56
     */
    @GLibVersion2_56
    public fun getLocaleForKey(groupName: String, key: String, locale: String? = null): String? =
        g_key_file_get_locale_for_key(gPointer.reinterpret(), groupName, key, locale)?.toKString()

    /**
     * Returns the value associated with @key under @group_name
     * translated in the given @locale if available.  If @locale is
     * null then the current locale is assumed.
     *
     * If @locale is to be non-null, or if the current locale will change over
     * the lifetime of the #GKeyFile, it must be loaded with
     * %G_KEY_FILE_KEEP_TRANSLATIONS in order to load strings for all locales.
     *
     * If @key cannot be found then null is returned and @error is set
     * to %G_KEY_FILE_ERROR_KEY_NOT_FOUND. If the value associated
     * with @key cannot be interpreted or no suitable translation can
     * be found then the untranslated value is returned.
     *
     * @param groupName a group name
     * @param key a key
     * @param locale a locale identifier or null
     * @return a newly allocated string or null if the specified
     *   key cannot be found.
     * @since 2.6
     */
    @GLibVersion2_6
    public fun getLocaleString(groupName: String, key: String, locale: String? = null): Result<String> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_get_locale_string(
            gPointer.reinterpret(),
            groupName,
            key,
            locale,
            gError.ptr
        )?.toKString()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Returns the name of the start group of the file.
     *
     * @return The start group of the key file.
     * @since 2.6
     */
    @GLibVersion2_6
    public fun getStartGroup(): String? = g_key_file_get_start_group(gPointer.reinterpret())?.toKString()

    /**
     * Returns the string value associated with @key under @group_name.
     * Unlike g_key_file_get_value(), this function handles escape sequences
     * like \s.
     *
     * In the event the key cannot be found, null is returned and
     * @error is set to %G_KEY_FILE_ERROR_KEY_NOT_FOUND.  In the
     * event that the @group_name cannot be found, null is returned
     * and @error is set to %G_KEY_FILE_ERROR_GROUP_NOT_FOUND.
     *
     * @param groupName a group name
     * @param key a key
     * @return a newly allocated string or null if the specified
     *   key cannot be found.
     * @since 2.6
     */
    @GLibVersion2_6
    public fun getString(groupName: String, key: String): Result<String> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_get_string(gPointer.reinterpret(), groupName, key, gError.ptr)?.toKString()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Returns the value associated with @key under @group_name as an unsigned
     * 64-bit integer. This is similar to g_key_file_get_integer() but can return
     * large positive results without truncation.
     *
     * @param groupName a non-null group name
     * @param key a non-null key
     * @return the value associated with the key as an unsigned 64-bit integer,
     * or 0 if the key was not found or could not be parsed.
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getUint64(groupName: String, key: String): Result<guint64> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_get_uint64(gPointer.reinterpret(), groupName, key, gError.ptr)
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Returns the raw value associated with @key under @group_name.
     * Use g_key_file_get_string() to retrieve an unescaped UTF-8 string.
     *
     * In the event the key cannot be found, null is returned and
     * @error is set to %G_KEY_FILE_ERROR_KEY_NOT_FOUND.  In the
     * event that the @group_name cannot be found, null is returned
     * and @error is set to %G_KEY_FILE_ERROR_GROUP_NOT_FOUND.
     *
     * @param groupName a group name
     * @param key a key
     * @return a newly allocated string or null if the specified
     *  key cannot be found.
     * @since 2.6
     */
    @GLibVersion2_6
    public fun getValue(groupName: String, key: String): Result<String> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_get_value(gPointer.reinterpret(), groupName, key, gError.ptr)?.toKString()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Looks whether the key file has the group @group_name.
     *
     * @param groupName a group name
     * @return true if @group_name is a part of @key_file, false
     * otherwise.
     * @since 2.6
     */
    @GLibVersion2_6
    public fun hasGroup(groupName: String): Boolean =
        g_key_file_has_group(gPointer.reinterpret(), groupName).asBoolean()

    /**
     * Looks whether the key file has the key @key in the group
     * @group_name.
     *
     * Note that this function does not follow the rules for #GError strictly;
     * the return value both carries meaning and signals an error.  To use
     * this function, you must pass a #GError pointer in @error, and check
     * whether it is not null to see if an error occurred.
     *
     * Language bindings should use g_key_file_get_value() to test whether
     * or not a key exists.
     *
     * @param groupName a group name
     * @param key a key name
     * @return true if @key is a part of @group_name, false otherwise
     * @since 2.6
     */
    @GLibVersion2_6
    public fun hasKey(groupName: String, key: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_has_key(gPointer.reinterpret(), groupName, key, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Loads a key file from the data in @bytes into an empty #GKeyFile structure.
     * If the object cannot be created then %error is set to a #GKeyFileError.
     *
     * @param bytes a #GBytes
     * @param flags flags from #GKeyFileFlags
     * @return true if a key file could be loaded, false otherwise
     * @since 2.50
     */
    @GLibVersion2_50
    public fun loadFromBytes(bytes: Bytes, flags: KeyFileFlags): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_load_from_bytes(
            gPointer.reinterpret(),
            bytes.gPointer.reinterpret(),
            flags.mask,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Loads a key file from memory into an empty #GKeyFile structure.
     * If the object cannot be created then %error is set to a #GKeyFileError.
     *
     * @param data key file loaded in memory
     * @param length the length of @data in bytes (or (gsize)-1 if data is nul-terminated)
     * @param flags flags from #GKeyFileFlags
     * @return true if a key file could be loaded, false otherwise
     * @since 2.6
     */
    @GLibVersion2_6
    public fun loadFromData(`data`: String, length: gsize, flags: KeyFileFlags): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_load_from_data(
            gPointer.reinterpret(),
            `data`,
            length,
            flags.mask,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Loads a key file into an empty #GKeyFile structure.
     *
     * If the OS returns an error when opening or reading the file, a
     * %G_FILE_ERROR is returned. If there is a problem parsing the file, a
     * %G_KEY_FILE_ERROR is returned.
     *
     * This function will never return a %G_KEY_FILE_ERROR_NOT_FOUND error. If the
     * @file is not found, %G_FILE_ERROR_NOENT is returned.
     *
     * @param file the path of a filename to load, in the GLib filename encoding
     * @param flags flags from #GKeyFileFlags
     * @return true if a key file could be loaded, false otherwise
     * @since 2.6
     */
    @GLibVersion2_6
    public fun loadFromFile(`file`: String, flags: KeyFileFlags): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_load_from_file(gPointer.reinterpret(), `file`, flags.mask, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Increases the reference count of @key_file.
     *
     * @return the same @key_file.
     * @since 2.32
     */
    @GLibVersion2_32
    public fun ref(): KeyFile = g_key_file_ref(gPointer.reinterpret())!!.run {
        KeyFile(reinterpret())
    }

    /**
     * Removes a comment above @key from @group_name.
     * If @key is null then @comment will be removed above @group_name.
     * If both @key and @group_name are null, then @comment will
     * be removed above the first group in the file.
     *
     * @param groupName a group name, or null
     * @param key a key
     * @return true if the comment was removed, false otherwise
     * @since 2.6
     */
    @GLibVersion2_6
    public fun removeComment(groupName: String? = null, key: String? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_remove_comment(gPointer.reinterpret(), groupName, key, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Removes the specified group, @group_name,
     * from the key file.
     *
     * @param groupName a group name
     * @return true if the group was removed, false otherwise
     * @since 2.6
     */
    @GLibVersion2_6
    public fun removeGroup(groupName: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_remove_group(gPointer.reinterpret(), groupName, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Removes @key in @group_name from the key file.
     *
     * @param groupName a group name
     * @param key a key name to remove
     * @return true if the key was removed, false otherwise
     * @since 2.6
     */
    @GLibVersion2_6
    public fun removeKey(groupName: String, key: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_remove_key(gPointer.reinterpret(), groupName, key, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Writes the contents of @key_file to @filename using
     * g_file_set_contents(). If you need stricter guarantees about durability of
     * the written file than are provided by g_file_set_contents(), use
     * g_file_set_contents_full() with the return value of g_key_file_to_data().
     *
     * This function can fail for any of the reasons that
     * g_file_set_contents() may fail.
     *
     * @param filename the name of the file to write to
     * @return true if successful, else false with @error set
     * @since 2.40
     */
    @GLibVersion2_40
    public fun saveToFile(filename: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_key_file_save_to_file(gPointer.reinterpret(), filename, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Associates a new boolean value with @key under @group_name.
     * If @key cannot be found then it is created.
     *
     * @param groupName a group name
     * @param key a key
     * @param value true or false
     * @since 2.6
     */
    @GLibVersion2_6
    public fun setBoolean(groupName: String, key: String, `value`: Boolean): Unit =
        g_key_file_set_boolean(gPointer.reinterpret(), groupName, key, `value`.asGBoolean())

    /**
     * Places a comment above @key from @group_name.
     *
     * If @key is null then @comment will be written above @group_name.
     * If both @key and @group_name  are null, then @comment will be
     * written above the first group in the file.
     *
     * Note that this function prepends a '#' comment marker to
     * each line of @comment.
     *
     * @param groupName a group name, or null
     * @param key a key
     * @param comment a comment
     * @return true if the comment was written, false otherwise
     * @since 2.6
     */
    @GLibVersion2_6
    public fun setComment(groupName: String? = null, key: String? = null, comment: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_key_file_set_comment(
                gPointer.reinterpret(),
                groupName,
                key,
                comment,
                gError.ptr
            ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Associates a new double value with @key under @group_name.
     * If @key cannot be found then it is created.
     *
     * @param groupName a group name
     * @param key a key
     * @param value a double value
     * @since 2.12
     */
    @GLibVersion2_12
    public fun setDouble(groupName: String, key: String, `value`: gdouble): Unit =
        g_key_file_set_double(gPointer.reinterpret(), groupName, key, `value`)

    /**
     * Associates a new integer value with @key under @group_name.
     * If @key cannot be found then it is created.
     *
     * @param groupName a group name
     * @param key a key
     * @param value an integer value
     * @since 2.26
     */
    @GLibVersion2_26
    public fun setInt64(groupName: String, key: String, `value`: gint64): Unit =
        g_key_file_set_int64(gPointer.reinterpret(), groupName, key, `value`)

    /**
     * Associates a new integer value with @key under @group_name.
     * If @key cannot be found then it is created.
     *
     * @param groupName a group name
     * @param key a key
     * @param value an integer value
     * @since 2.6
     */
    @GLibVersion2_6
    public fun setInteger(groupName: String, key: String, `value`: gint): Unit =
        g_key_file_set_integer(gPointer.reinterpret(), groupName, key, `value`)

    /**
     * Sets the character which is used to separate
     * values in lists. Typically ';' or ',' are used
     * as separators. The default list separator is ';'.
     *
     * @param separator the separator
     * @since 2.6
     */
    @GLibVersion2_6
    public fun setListSeparator(separator: Char): Unit =
        g_key_file_set_list_separator(gPointer.reinterpret(), separator.code.toByte())

    /**
     * Associates a string value for @key and @locale under @group_name.
     * If the translation for @key cannot be found then it is created.
     *
     * @param groupName a group name
     * @param key a key
     * @param locale a locale identifier
     * @param string a string
     * @since 2.6
     */
    @GLibVersion2_6
    public fun setLocaleString(groupName: String, key: String, locale: String, string: String): Unit =
        g_key_file_set_locale_string(gPointer.reinterpret(), groupName, key, locale, string)

    /**
     * Associates a list of string values for @key and @locale under
     * @group_name.  If the translation for @key cannot be found then
     * it is created.
     *
     * @param groupName a group name
     * @param key a key
     * @param locale a locale identifier
     * @param list a null-terminated array of locale string values
     * @param length the length of @list
     * @since 2.6
     */
    @GLibVersion2_6
    public fun setLocaleStringList(
        groupName: String,
        key: String,
        locale: String,
        list: List<String>,
        length: gsize,
    ): Unit = memScoped {
        return g_key_file_set_locale_string_list(
            gPointer.reinterpret(),
            groupName,
            key,
            locale,
            list.toCStringList(this),
            length
        )
    }

    /**
     * Associates a new string value with @key under @group_name.
     * If @key cannot be found then it is created.
     * If @group_name cannot be found then it is created.
     * Unlike g_key_file_set_value(), this function handles characters
     * that need escaping, such as newlines.
     *
     * @param groupName a group name
     * @param key a key
     * @param string a string
     * @since 2.6
     */
    @GLibVersion2_6
    public fun setString(groupName: String, key: String, string: String): Unit =
        g_key_file_set_string(gPointer.reinterpret(), groupName, key, string)

    /**
     * Associates a list of string values for @key under @group_name.
     * If @key cannot be found then it is created.
     * If @group_name cannot be found then it is created.
     *
     * @param groupName a group name
     * @param key a key
     * @param list an array of string values
     * @param length number of string values in @list
     * @since 2.6
     */
    @GLibVersion2_6
    public fun setStringList(groupName: String, key: String, list: List<String>, length: gsize): Unit = memScoped {
        return g_key_file_set_string_list(gPointer.reinterpret(), groupName, key, list.toCStringList(this), length)
    }

    /**
     * Associates a new integer value with @key under @group_name.
     * If @key cannot be found then it is created.
     *
     * @param groupName a group name
     * @param key a key
     * @param value an integer value
     * @since 2.26
     */
    @GLibVersion2_26
    public fun setUint64(groupName: String, key: String, `value`: guint64): Unit =
        g_key_file_set_uint64(gPointer.reinterpret(), groupName, key, `value`)

    /**
     * Associates a new value with @key under @group_name.
     *
     * If @key cannot be found then it is created. If @group_name cannot
     * be found then it is created. To set an UTF-8 string which may contain
     * characters that need escaping (such as newlines or spaces), use
     * g_key_file_set_string().
     *
     * @param groupName a group name
     * @param key a key
     * @param value a string
     * @since 2.6
     */
    @GLibVersion2_6
    public fun setValue(groupName: String, key: String, `value`: String): Unit =
        g_key_file_set_value(gPointer.reinterpret(), groupName, key, `value`)

    /**
     * Decreases the reference count of @key_file by 1. If the reference count
     * reaches zero, frees the key file and all its allocated memory.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun unref(): Unit = g_key_file_unref(gPointer.reinterpret())

    public companion object {
        /**
         * Creates a new empty #GKeyFile object. Use
         * g_key_file_load_from_file(), g_key_file_load_from_data(),
         * g_key_file_load_from_dirs() or g_key_file_load_from_data_dirs() to
         * read an existing key file.
         *
         * @return an empty #GKeyFile.
         * @since 2.6
         */
        public fun new(): KeyFile = KeyFile(g_key_file_new()!!.reinterpret())

        public fun errorQuark(): Quark = g_key_file_error_quark()

        /**
         * Get the GType of KeyFile
         *
         * @return the GType
         */
        public fun getType(): GType = g_key_file_get_type()
    }
}
