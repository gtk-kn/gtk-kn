// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.annotations.GLibVersion2_14
import org.gtkkn.bindings.glib.annotations.GLibVersion2_16
import org.gtkkn.bindings.glib.annotations.GLibVersion2_34
import org.gtkkn.bindings.glib.annotations.GLibVersion2_68
import org.gtkkn.bindings.glib.annotations.GLibVersion2_76
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.glib.GString
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.g_string_append
import org.gtkkn.native.glib.g_string_append_c
import org.gtkkn.native.glib.g_string_append_len
import org.gtkkn.native.glib.g_string_append_unichar
import org.gtkkn.native.glib.g_string_append_uri_escaped
import org.gtkkn.native.glib.g_string_ascii_down
import org.gtkkn.native.glib.g_string_ascii_up
import org.gtkkn.native.glib.g_string_assign
import org.gtkkn.native.glib.g_string_down
import org.gtkkn.native.glib.g_string_equal
import org.gtkkn.native.glib.g_string_erase
import org.gtkkn.native.glib.g_string_free
import org.gtkkn.native.glib.g_string_free_and_steal
import org.gtkkn.native.glib.g_string_free_to_bytes
import org.gtkkn.native.glib.g_string_hash
import org.gtkkn.native.glib.g_string_insert
import org.gtkkn.native.glib.g_string_insert_c
import org.gtkkn.native.glib.g_string_insert_len
import org.gtkkn.native.glib.g_string_insert_unichar
import org.gtkkn.native.glib.g_string_new
import org.gtkkn.native.glib.g_string_new_len
import org.gtkkn.native.glib.g_string_new_take
import org.gtkkn.native.glib.g_string_overwrite
import org.gtkkn.native.glib.g_string_overwrite_len
import org.gtkkn.native.glib.g_string_prepend
import org.gtkkn.native.glib.g_string_prepend_c
import org.gtkkn.native.glib.g_string_prepend_len
import org.gtkkn.native.glib.g_string_prepend_unichar
import org.gtkkn.native.glib.g_string_replace
import org.gtkkn.native.glib.g_string_set_size
import org.gtkkn.native.glib.g_string_sized_new
import org.gtkkn.native.glib.g_string_truncate
import org.gtkkn.native.glib.g_string_up
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.gunichar
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_gstring_get_type
import kotlin.Boolean
import kotlin.Char
import kotlin.Long

/**
 * A `GString` is an object that handles the memory management of a C string.
 *
 * The emphasis of `GString` is on text, typically UTF-8. Crucially, the "str" member
 * of a `GString` is guaranteed to have a trailing nul character, and it is therefore
 * always safe to call functions such as `strchr()` or `strdup()` on it.
 *
 * However, a `GString` can also hold arbitrary binary data, because it has a "len" member,
 * which includes any possible embedded nul characters in the data. Conceptually then,
 * `GString` is like a `GByteArray` with the addition of many convenience methods for
 * text, and a guaranteed nul terminator.
 *
 * ## Skipped during bindings generation
 *
 * - method `append_printf`: Varargs parameter is not supported
 * - parameter `args`: va_list type is not supported
 * - method `printf`: Varargs parameter is not supported
 * - parameter `args`: va_list type is not supported
 */
public class String(pointer: CPointer<GString>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GString> = pointer

    /**
     * points to the character data. It may move as text is added.
     *   The @str field is null-terminated and so
     *   can be used as an ordinary C string.
     */
    public var str: kotlin.String?
        get() = gPointer.pointed.str?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.str?.let { g_free(it) }
            gPointer.pointed.str = value?.let { g_strdup(it) }
        }

    /**
     * contains the length of the string, not including the
     *   terminating nul byte.
     */
    public var len: gsize
        get() = gPointer.pointed.len

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.len = value
        }

    /**
     * the number of bytes that can be stored in the
     *   string before it needs to be reallocated. May be larger than @len.
     */
    public var allocatedLen: gsize
        get() = gPointer.pointed.allocated_len

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.allocated_len = value
        }

    /**
     * Adds a string onto the end of a #GString, expanding
     * it if necessary.
     *
     * @param val the string to append onto the end of @string
     * @return @string
     */
    public fun append(`val`: kotlin.String): String = g_string_append(gPointer, `val`)!!.run {
        String(this)
    }

    /**
     * Adds a byte onto the end of a #GString, expanding
     * it if necessary.
     *
     * @param c the byte to append onto the end of @string
     * @return @string
     */
    public fun appendC(c: Char): String = g_string_append_c(gPointer, c.code.toByte())!!.run {
        String(this)
    }

    /**
     * Appends @len bytes of @val to @string.
     *
     * If @len is positive, @val may contain embedded nuls and need
     * not be nul-terminated. It is the caller's responsibility to
     * ensure that @val has at least @len addressable bytes.
     *
     * If @len is negative, @val must be nul-terminated and @len
     * is considered to request the entire string length. This
     * makes g_string_append_len() equivalent to g_string_append().
     *
     * @param val bytes to append
     * @param len number of bytes of @val to use, or -1 for all of @val
     * @return @string
     */
    public fun appendLen(`val`: kotlin.String, len: Long): String = g_string_append_len(gPointer, `val`, len)!!.run {
        String(this)
    }

    /**
     * Converts a Unicode character into UTF-8, and appends it
     * to the string.
     *
     * @param wc a Unicode character
     * @return @string
     */
    public fun appendUnichar(wc: gunichar): String = g_string_append_unichar(gPointer, wc)!!.run {
        String(this)
    }

    /**
     * Appends @unescaped to @string, escaping any characters that
     * are reserved in URIs using URI-style escape sequences.
     *
     * @param unescaped a string
     * @param reservedCharsAllowed a string of reserved characters allowed
     *     to be used, or null
     * @param allowUtf8 set true if the escaped string may include UTF8 characters
     * @return @string
     * @since 2.16
     */
    @GLibVersion2_16
    public fun appendUriEscaped(
        unescaped: kotlin.String,
        reservedCharsAllowed: kotlin.String,
        allowUtf8: Boolean,
    ): String = g_string_append_uri_escaped(gPointer, unescaped, reservedCharsAllowed, allowUtf8.asGBoolean())!!.run {
        String(this)
    }

    /**
     * Converts all uppercase ASCII letters to lowercase ASCII letters.
     *
     * @return passed-in @string pointer, with all the
     *     uppercase characters converted to lowercase in place,
     *     with semantics that exactly match g_ascii_tolower().
     */
    public fun asciiDown(): String = g_string_ascii_down(gPointer)!!.run {
        String(this)
    }

    /**
     * Converts all lowercase ASCII letters to uppercase ASCII letters.
     *
     * @return passed-in @string pointer, with all the
     *     lowercase characters converted to uppercase in place,
     *     with semantics that exactly match g_ascii_toupper().
     */
    public fun asciiUp(): String = g_string_ascii_up(gPointer)!!.run {
        String(this)
    }

    /**
     * Copies the bytes from a string into a #GString,
     * destroying any previous contents. It is rather like
     * the standard strcpy() function, except that you do not
     * have to worry about having enough space to copy the string.
     *
     * @param rval the string to copy into @string
     * @return @string
     */
    public fun assign(rval: kotlin.String): String = g_string_assign(gPointer, rval)!!.run {
        String(this)
    }

    /**
     * Converts a #GString to lowercase.
     *
     * @return the #GString
     */
    public fun down(): String = g_string_down(gPointer)!!.run {
        String(this)
    }

    /**
     * Compares two strings for equality, returning true if they are equal.
     * For use with #GHashTable.
     *
     * @param v2 another #GString
     * @return true if the strings are the same length and contain the
     *     same bytes
     */
    public fun equal(v2: String): Boolean = g_string_equal(gPointer, v2.gPointer).asBoolean()

    /**
     * Removes @len bytes from a #GString, starting at position @pos.
     * The rest of the #GString is shifted down to fill the gap.
     *
     * @param pos the position of the content to remove
     * @param len the number of bytes to remove, or -1 to remove all
     *       following bytes
     * @return @string
     */
    public fun erase(pos: Long, len: Long): String = g_string_erase(gPointer, pos, len)!!.run {
        String(this)
    }

    /**
     * Frees the memory allocated for the #GString.
     * If @free_segment is true it also frees the character data.  If
     * it's false, the caller gains ownership of the buffer and must
     * free it after use with g_free().
     *
     * Instead of passing false to this function, consider using
     * g_string_free_and_steal().
     *
     * @param freeSegment if true, the actual character data is freed as well
     * @return the character data of @string
     *          (i.e. null if @free_segment is true)
     */
    public fun free(freeSegment: Boolean): kotlin.String? =
        g_string_free(gPointer, freeSegment.asGBoolean())?.toKString()

    /**
     * Frees the memory allocated for the #GString.
     *
     * The caller gains ownership of the buffer and
     * must free it after use with g_free().
     *
     * @return the character data of @string
     * @since 2.76
     */
    @GLibVersion2_76
    public fun freeAndSteal(): kotlin.String =
        g_string_free_and_steal(gPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Transfers ownership of the contents of @string to a newly allocated
     * #GBytes.  The #GString structure itself is deallocated, and it is
     * therefore invalid to use @string after invoking this function.
     *
     * Note that while #GString ensures that its buffer always has a
     * trailing nul character (not reflected in its "len"), the returned
     * #GBytes does not include this extra nul; i.e. it has length exactly
     * equal to the "len" member.
     *
     * @return A newly allocated #GBytes containing contents of @string; @string itself is freed
     * @since 2.34
     */
    @GLibVersion2_34
    public fun freeToBytes(): Bytes = g_string_free_to_bytes(gPointer)!!.run {
        Bytes(this)
    }

    /**
     * Creates a hash code for @str; for use with #GHashTable.
     *
     * @return hash code for @str
     */
    public fun hash(): guint = g_string_hash(gPointer)

    /**
     * Inserts a copy of a string into a #GString,
     * expanding it if necessary.
     *
     * @param pos the position to insert the copy of the string
     * @param val the string to insert
     * @return @string
     */
    public fun insert(pos: Long, `val`: kotlin.String): String = g_string_insert(gPointer, pos, `val`)!!.run {
        String(this)
    }

    /**
     * Inserts a byte into a #GString, expanding it if necessary.
     *
     * @param pos the position to insert the byte
     * @param c the byte to insert
     * @return @string
     */
    public fun insertC(pos: Long, c: Char): String = g_string_insert_c(gPointer, pos, c.code.toByte())!!.run {
        String(this)
    }

    /**
     * Inserts @len bytes of @val into @string at @pos.
     *
     * If @len is positive, @val may contain embedded nuls and need
     * not be nul-terminated. It is the caller's responsibility to
     * ensure that @val has at least @len addressable bytes.
     *
     * If @len is negative, @val must be nul-terminated and @len
     * is considered to request the entire string length.
     *
     * If @pos is -1, bytes are inserted at the end of the string.
     *
     * @param pos position in @string where insertion should
     *       happen, or -1 for at the end
     * @param val bytes to insert
     * @param len number of bytes of @val to insert, or -1 for all of @val
     * @return @string
     */
    public fun insertLen(pos: Long, `val`: kotlin.String, len: Long): String =
        g_string_insert_len(gPointer, pos, `val`, len)!!.run {
            String(this)
        }

    /**
     * Converts a Unicode character into UTF-8, and insert it
     * into the string at the given position.
     *
     * @param pos the position at which to insert character, or -1
     *     to append at the end of the string
     * @param wc a Unicode character
     * @return @string
     */
    public fun insertUnichar(pos: Long, wc: gunichar): String = g_string_insert_unichar(gPointer, pos, wc)!!.run {
        String(this)
    }

    /**
     * Overwrites part of a string, lengthening it if necessary.
     *
     * @param pos the position at which to start overwriting
     * @param val the string that will overwrite the @string starting at @pos
     * @return @string
     * @since 2.14
     */
    @GLibVersion2_14
    public fun overwrite(pos: gsize, `val`: kotlin.String): String = g_string_overwrite(gPointer, pos, `val`)!!.run {
        String(this)
    }

    /**
     * Overwrites part of a string, lengthening it if necessary.
     * This function will work with embedded nuls.
     *
     * @param pos the position at which to start overwriting
     * @param val the string that will overwrite the @string starting at @pos
     * @param len the number of bytes to write from @val
     * @return @string
     * @since 2.14
     */
    @GLibVersion2_14
    public fun overwriteLen(pos: gsize, `val`: kotlin.String, len: Long): String =
        g_string_overwrite_len(gPointer, pos, `val`, len)!!.run {
            String(this)
        }

    /**
     * Adds a string on to the start of a #GString,
     * expanding it if necessary.
     *
     * @param val the string to prepend on the start of @string
     * @return @string
     */
    public fun prepend(`val`: kotlin.String): String = g_string_prepend(gPointer, `val`)!!.run {
        String(this)
    }

    /**
     * Adds a byte onto the start of a #GString,
     * expanding it if necessary.
     *
     * @param c the byte to prepend on the start of the #GString
     * @return @string
     */
    public fun prependC(c: Char): String = g_string_prepend_c(gPointer, c.code.toByte())!!.run {
        String(this)
    }

    /**
     * Prepends @len bytes of @val to @string.
     *
     * If @len is positive, @val may contain embedded nuls and need
     * not be nul-terminated. It is the caller's responsibility to
     * ensure that @val has at least @len addressable bytes.
     *
     * If @len is negative, @val must be nul-terminated and @len
     * is considered to request the entire string length. This
     * makes g_string_prepend_len() equivalent to g_string_prepend().
     *
     * @param val bytes to prepend
     * @param len number of bytes in @val to prepend, or -1 for all of @val
     * @return @string
     */
    public fun prependLen(`val`: kotlin.String, len: Long): String = g_string_prepend_len(gPointer, `val`, len)!!.run {
        String(this)
    }

    /**
     * Converts a Unicode character into UTF-8, and prepends it
     * to the string.
     *
     * @param wc a Unicode character
     * @return @string
     */
    public fun prependUnichar(wc: gunichar): String = g_string_prepend_unichar(gPointer, wc)!!.run {
        String(this)
    }

    /**
     * Replaces the string @find with the string @replace in a #GString up to
     * @limit times. If the number of instances of @find in the #GString is
     * less than @limit, all instances are replaced. If @limit is `0`,
     * all instances of @find are replaced.
     *
     * If @find is the empty string, since versions 2.69.1 and 2.68.4 the
     * replacement will be inserted no more than once per possible position
     * (beginning of string, end of string and between characters). This did
     * not work correctly in earlier versions.
     *
     * @param find the string to find in @string
     * @param replace the string to insert in place of @find
     * @param limit the maximum instances of @find to replace with @replace, or `0` for
     * no limit
     * @return the number of find and replace operations performed.
     * @since 2.68
     */
    @GLibVersion2_68
    public fun replace(find: kotlin.String, replace: kotlin.String, limit: guint): guint =
        g_string_replace(gPointer, find, replace, limit)

    /**
     * Sets the length of a #GString. If the length is less than
     * the current length, the string will be truncated. If the
     * length is greater than the current length, the contents
     * of the newly added area are undefined. (However, as
     * always, string->str[string->len] will be a nul byte.)
     *
     * @param len the new length
     * @return @string
     */
    public fun setSize(len: gsize): String = g_string_set_size(gPointer, len)!!.run {
        String(this)
    }

    /**
     * Cuts off the end of the GString, leaving the first @len bytes.
     *
     * @param len the new size of @string
     * @return @string
     */
    public fun truncate(len: gsize): String = g_string_truncate(gPointer, len)!!.run {
        String(this)
    }

    /**
     * Converts a #GString to uppercase.
     *
     * @return @string
     */
    public fun up(): String = g_string_up(gPointer)!!.run {
        String(this)
    }

    override fun toString(): kotlin.String = "String(str=$str, len=$len, allocatedLen=$allocatedLen)"

    public companion object {
        /**
         * Creates a new #GString, initialized with the given string.
         *
         * @param init the initial text to copy into the string, or null to
         *   start with an empty string
         * @return the new #GString
         */
        public fun new(`init`: kotlin.String? = null): String = String(g_string_new(`init`)!!.reinterpret())

        /**
         * Creates a new #GString with @len bytes of the @init buffer.
         * Because a length is provided, @init need not be nul-terminated,
         * and can contain embedded nul bytes.
         *
         * Since this function does not stop at nul bytes, it is the caller's
         * responsibility to ensure that @init has at least @len addressable
         * bytes.
         *
         * @param init initial contents of the string
         * @param len length of @init to use
         * @return a new #GString
         */
        public fun newLen(`init`: kotlin.String, len: Long): String =
            String(g_string_new_len(`init`, len)!!.reinterpret())

        /**
         * Creates a new #GString, initialized with the given string.
         *
         * After this call, @init belongs to the #GString and may no longer be
         * modified by the caller. The memory of @data has to be dynamically
         * allocated and will eventually be freed with g_free().
         *
         * @param init initial text used as the string.
         *     Ownership of the string is transferred to the #GString.
         *     Passing null creates an empty string.
         * @return the new #GString
         * @since 2.78
         */
        public fun newTake(`init`: kotlin.String? = null): String =
            String(g_string_new_take(`init`?.cstr)!!.reinterpret())

        /**
         * Creates a new #GString, with enough space for @dfl_size
         * bytes. This is useful if you are going to add a lot of
         * text to the string and don't want it to be reallocated
         * too often.
         *
         * @param dflSize the default size of the space allocated to hold the string
         * @return the new #GString
         */
        public fun sizedNew(dflSize: gsize): String = String(g_string_sized_new(dflSize)!!.reinterpret())

        /**
         * Get the GType of String
         *
         * @return the GType
         */
        public fun getType(): GType = g_gstring_get_type()
    }
}
